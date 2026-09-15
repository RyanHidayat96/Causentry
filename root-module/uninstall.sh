#!/system/bin/sh
# Causentry — uninstall hook: put the device back the way it was.
DIR=/data/adb/causentry
[ -f "$DIR/restore.sh" ] && sh "$DIR/restore.sh" >/dev/null 2>&1
pkill -f causentryd.sh 2>/dev/null
pkill -f "httpd -p 127.0.0.1:8899" 2>/dev/null
rm -rf "$DIR" 2>/dev/null
rm -f /data/local/tmp/causentry/config.json 2>/dev/null
