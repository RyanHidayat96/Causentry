#!/system/bin/sh
# Causentry - supervisor for the watch daemon.
#
# The daemon tails the activity event stream and runs the bypass state machine; if the
# stream ends, or the daemon hangs inside an evaluate() pass, the bypass silently stops
# and the UI keeps showing a stale snapshot (the user sees "Apply" doing nothing).
#
# Liveness is therefore judged by the daemon's heartbeat file, not by a process match:
# stale heartbeat -> kill whatever is left and start a fresh daemon.
DIR=/data/adb/causentry
LOCK=$DIR/loop.lock
MAX_AGE=60

if [ -f "$LOCK" ]; then
  old=$(cat "$LOCK" 2>/dev/null)
  if [ -n "$old" ] && tr '\0' ' ' < "/proc/$old/cmdline" 2>/dev/null | grep -q "causentry-loop.sh"; then
    exit 0                      # already supervised
  fi
fi
echo "$$" > "$LOCK"

while true; do
  hb=$(cat "$DIR/heartbeat" 2>/dev/null || echo 0)
  now=$(date +%s)
  age=$(( now - hb ))
  if [ "$age" -gt "$MAX_AGE" ]; then
    pkill -f causentryd.sh 2>/dev/null
    rm -f "$DIR/daemon.pid"
    date +%s > "$DIR/heartbeat" 2>/dev/null
    echo "$(date '+%m-%d %H:%M:%S') [supervisor] daemon stale (${age}s) - restarting" >> "$DIR/causentry.log"
    setsid /system/bin/sh "$DIR/causentryd.sh" >/dev/null 2>&1 < /dev/null &
  fi
  sleep 10
done
