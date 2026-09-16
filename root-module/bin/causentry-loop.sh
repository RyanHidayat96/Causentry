#!/system/bin/sh
# Causentry - supervisor for the watch daemon.
#
# The daemon tails the activity event stream and runs the bypass state machine. If
# the stream ends, or the daemon hangs inside an evaluate() pass, the bypass stalls
# and the UI keeps showing a stale snapshot. Liveness is judged by the daemon's
# heartbeat, but restarting must be race-safe: a stale file must never let two
# supervisors, or two daemons, run at the same time.
DIR=/data/adb/causentry
LOCK=$DIR/loop.lock
MAX_AGE=60

# ---------------------------------------------------------------------------
# Single-instance guard. mkdir is atomic on the POSIX toybox/Android shell: two
# supervisors that start at the same instant cannot both win it. The owner records
# its pid inside; a stale lock (dead owner) is reclaimed after a short wait.
# ---------------------------------------------------------------------------
canonical_name="causentry-loop.sh"
is_our_loop() {
  pid="$1"
  [ -n "$pid" ] || return 1
  [ -d "/proc/$pid" ] || return 1
  tr '\0' ' ' < "/proc/$pid/cmdline" 2>/dev/null | grep -q "$canonical_name"
}
# migrate a legacy file-based lock (old builds stored a bare pid) to a directory
if [ -f "$LOCK" ]; then
  rm -f "$LOCK" 2>/dev/null
fi
if mkdir "$LOCK" 2>/dev/null; then
  echo "$$" > "$LOCK/pid" 2>/dev/null
else
  owner=$(cat "$LOCK/pid" 2>/dev/null)
  if is_our_loop "$owner"; then
    exit 0                      # already supervised by a live process
  fi
  # stale lock (dead owner) - reclaim it
  rm -f "$LOCK/pid" 2>/dev/null
  rmdir "$LOCK" 2>/dev/null
  if ! mkdir "$LOCK" 2>/dev/null; then
    exit 0                      # lost the race, someone else is supervising
  fi
  echo "$$" > "$LOCK/pid" 2>/dev/null
fi
trap 'rm -f "$LOCK/pid" 2>/dev/null; rmdir "$LOCK" 2>/dev/null' EXIT INT TERM

daemon_alive() {
  dpid=$(cat "$DIR/daemon.pid" 2>/dev/null)
  [ -n "$dpid" ] || return 1
  [ -d "/proc/$dpid" ] || return 1
  tr '\0' ' ' < "/proc/$dpid/cmdline" 2>/dev/null | grep -q "causentryd.sh"
}

kill_daemons() {
  for proc in /proc/[0-9]*; do
    [ -d "$proc" ] || continue
    p=${proc##*/}
    cmd=$(tr '\0' ' ' < "$proc/cmdline" 2>/dev/null)
    case "$cmd" in
      *"$DIR/causentryd.sh"*) kill -9 "$p" 2>/dev/null;;
    esac
  done
}

while true; do
  # liveness by heartbeat, but only restart when the daemon is genuinely gone.
  # A live daemon writes heartbeat every watchdog tick, so this never fires spuriously.
  if ! daemon_alive; then
    dpid=$(cat "$DIR/daemon.pid" 2>/dev/null)
    hb=$(cat "$DIR/heartbeat" 2>/dev/null || echo 0)
    case "$hb" in ""|*[!0-9]*) hb=0;; esac
    now=$(date +%s)
    age=$(( now - hb ))
    [ "$age" -lt 0 ] 2>/dev/null && age=0
    if [ -z "$dpid" ] || [ "$age" -gt "$MAX_AGE" ]; then
      # kill the old daemon by its recorded pid, then clean any orphaned logcat
      # child, so restarting never stacks copies.
      kill_daemons
      rm -f "$DIR/daemon.pid" "$DIR/runtime.active" 2>/dev/null
      date +%s > "$DIR/heartbeat" 2>/dev/null
      if [ -z "$dpid" ]; then
        echo "$(date '+%m-%d %H:%M:%S') [supervisor] daemon missing - starting" >> "$DIR/causentry.log"
      else
        echo "$(date '+%m-%d %H:%M:%S') [supervisor] daemon stale (${age}s) - restarting" >> "$DIR/causentry.log"
      fi
      setsid /system/bin/sh "$DIR/causentryd.sh" >/dev/null 2>&1 < /dev/null &
    fi
  fi
  sleep 10
done
