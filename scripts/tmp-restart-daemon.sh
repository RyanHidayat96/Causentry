#!/system/bin/sh
# Idempotent, race-free restart of the Causentry daemon tree.
# Kills every causentryd/causentry-loop/uirpc process (except this script's own
# shell and its children), waits for them to die, then starts exactly one loop
# which owns exactly one daemon.
D=/data/adb/causentry
SELF=$$
MYPID=$PPID

kill_match() {
  # $1 = substring of cmdline to match
  for p in /proc/[0-9]*; do
    pid=${p#/proc/}
    [ "$pid" = "$SELF" ] && continue
    [ "$pid" = "$MYPID" ] && continue
    cmd=$(tr '\0' ' ' < "$p/cmdline" 2>/dev/null)
    case "$cmd" in
      *"$1"*) echo "kill $pid $cmd"; kill -9 "$pid" 2>/dev/null ;;
    esac
  done
}

kill_match 'causentry-loop.sh'
kill_match 'causentryd.sh'
kill_match 'apply-async.sh'

sleep 1
rm -rf "$D/loop.lock" "$D/evaluate.lock" "$D/daemon.pid"
/system/bin/setsid /system/bin/sh "$D/causentry-loop.sh" >/dev/null 2>&1 < /dev/null &
sleep 6

echo "=== AUDIT ==="
echo -n "loops: "
for p in /proc/[0-9]*; do c=$(tr '\0' ' ' < "$p/cmdline" 2>/dev/null); case "$c" in *causentry-loop.sh*) echo -n "${p#/proc/} ";; esac; done
echo
echo -n "daemons: "
for p in /proc/[0-9]*; do c=$(tr '\0' ' ' < "$p/cmdline" 2>/dev/null); case "$c" in *causentryd.sh*) echo -n "${p#/proc/} ";; esac; done
echo
echo "pidfile: $(cat "$D/daemon.pid" 2>/dev/null)"
echo "hb_age: $(( $(date +%s) - $(cat "$D/heartbeat" 2>/dev/null || echo 0) ))s"
echo "lib_mtime: $(date -r "$D/lib.sh" +%H:%M:%S 2>/dev/null)"
