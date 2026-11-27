#!/system/bin/sh
# Causentry v1.0.0 - post-fs-data stage
# Prepares state directories and launches native causentryd BEFORE system_server specializes
# so Zygisk Companion can hand off live policy socket FDs on cold boot.

MODDIR=${0%/*}
DIR=/data/adb/causentry
SYS_DIR=/data/system/causentry

mkdir -p "$DIR" "$SYS_DIR" 2>/dev/null
chmod 700 "$DIR" "$SYS_DIR" 2>/dev/null
chown 1000:1000 "$SYS_DIR" 2>/dev/null
chcon u:object_r:system_data_file:s0 "$SYS_DIR" 2>/dev/null

# Pick matching ABI binary (arm64-v8a or armeabi-v7a)
ABI=$(getprop ro.product.cpu.abi 2>/dev/null)
case "$ABI" in
  arm64*) BIN_SRC="$MODDIR/bin/arm64-v8a/causentryd" ;;
  armeabi*) BIN_SRC="$MODDIR/bin/armeabi-v7a/causentryd" ;;
  *) BIN_SRC="$MODDIR/bin/arm64-v8a/causentryd" ;;
esac

if [ -f "$BIN_SRC" ]; then
  cp -f "$BIN_SRC" "$DIR/causentryd" 2>/dev/null
  chmod 755 "$DIR/causentryd" 2>/dev/null
fi

[ -f "$DIR/config.json" ] || cp -f "$MODDIR/config.default.json" "$DIR/config.json" 2>/dev/null
[ -f "$MODDIR/payload/Causentry.apk" ] && cp -f "$MODDIR/payload/Causentry.apk" "$DIR/Causentry.apk" 2>/dev/null

# Remove any legacy v1 shell scripts / webroot leftovers on upgrade
rm -rf "$DIR/webroot" "$DIR/ui.token" "$DIR/causentry-loop.sh" "$DIR/causentryd.sh" "$DIR/uirpc.sh" 2>/dev/null

# Start native causentryd before zygote specializes system_server
if [ -x "$DIR/causentryd" ]; then
  if command -v setsid >/dev/null 2>&1; then
    setsid "$DIR/causentryd" serve >/dev/null 2>&1 < /dev/null &
  else
    "$DIR/causentryd" serve >/dev/null 2>&1 < /dev/null &
  fi
fi
