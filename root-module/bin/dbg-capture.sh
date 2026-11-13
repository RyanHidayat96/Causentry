#!/system/bin/sh
# Start a root-side logcat capture that keeps running while the module has the ADB
# transport switched off (a protected target in the foreground drops our adb link, so
# the capture must not depend on adbd).
#
#   sh dbg-capture.sh start   -> capture to /data/adb/causentry/dbg.log for 20 minutes
#   sh dbg-capture.sh stop
#   sh dbg-capture.sh mark TAG -> drop a timestamp marker into the capture
DIR=/data/adb/causentry
OUT=$DIR/dbg.log
PID=$DIR/dbg.pid

case "$1" in
  start)
    sh "$0" stop >/dev/null 2>&1
    : > "$OUT"
    echo "[capture $(date '+%F %T')] start" >> "$OUT"
    setsid /system/bin/sh -c "logcat -b main -b system -b crash -b events -f $OUT -r 8192 -n 2 & echo \$! > $PID; wait \$!" >/dev/null 2>&1 </dev/null &
    sleep 1
    echo "capture started (pid $(cat $PID 2>/dev/null)) -> $OUT"
    ;;
  stop)
    p=$(cat "$PID" 2>/dev/null)
    [ -n "$p" ] && kill "$p" 2>/dev/null
    pkill -f "logcat -b main -b system -b crash -b events -f $OUT" 2>/dev/null
    rm -f "$PID"
    echo "capture stopped"
    ;;
  mark)
    echo "[mark $(date '+%F %T')] $2" >> "$OUT"
    echo "marked: $2"
    ;;
  size)
    ls -l "$OUT" 2>/dev/null
    ;;
esac
