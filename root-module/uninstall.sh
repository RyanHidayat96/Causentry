#!/system/bin/sh
# Causentry - uninstall hook
DIR=/data/adb/causentry
BIN="$DIR/causentryd"

[ -x "$BIN" ] && "$BIN" restore >/dev/null 2>&1
pkill -x causentryd 2>/dev/null
pkill -f causentryd.sh 2>/dev/null
pkill -f causentry-loop.sh 2>/dev/null
pkill -f "httpd -p 127.0.0.1:8899" 2>/dev/null

rm -rf "$DIR" /data/system/causentry /data/local/tmp/causentry /data/media/0/Android/media/com.causentry.app 2>/dev/null
rm -f /data/local/tmp/causentry-ui.apk 2>/dev/null
