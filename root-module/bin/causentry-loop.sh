#!/system/bin/sh
# Causentry - supervisor for the watch daemon.
#
# The daemon tails the activity event stream; if that stream ends (buffer cleared,
# logcat restarted) or the process is killed, the bypass silently stops working and
# the UI keeps showing a stale snapshot. This loop restarts it within ~10s and is
# what boot (service.sh) and deploy-module.sh start.
DIR=/data/adb/causentry
LOCK=$DIR/loop.lock

if [ -f "$LOCK" ]; then
  old=$(cat "$LOCK" 2>/dev/null)
  if [ -n "$old" ] && kill -0 "$old" 2>/dev/null; then
    exit 0                      # already supervised
  fi
fi
echo "$$" > "$LOCK"

while true; do
  if ! pgrep -f 'causentryd.sh' >/dev/null 2>&1; then
    setsid /system/bin/sh "$DIR/causentryd.sh" >/dev/null 2>&1 < /dev/null &
  fi
  sleep 10
done
