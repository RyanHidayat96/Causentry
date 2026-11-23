#!/system/bin/sh
# Causentry v2.0 - install-time hook (KernelSU / Magisk / APatch)
MODDIR=${MODPATH:-${0%/*}}
DIR=/data/adb/causentry

if ! command -v ui_print >/dev/null 2>&1; then
  ui_print() { echo "$*"; }
fi
if ! command -v abort >/dev/null 2>&1; then
  abort() { echo "ERROR: $*" >&2; exit 1; }
fi

ui_print "*******************************"
ui_print "  Causentry v3.0"
ui_print "  Full Native Rust Engine"
ui_print "*******************************"

ABI=$(getprop ro.product.cpu.abi 2>/dev/null)
case "$ABI" in
  arm64*)
    TARGET_ABI="arm64-v8a"
    ;;
  armeabi*)
    TARGET_ABI="armeabi-v7a"
    ;;
  *)
    abort "Unsupported ABI '$ABI'. Causentry supports arm64-v8a and armeabi-v7a only."
    ;;
esac

ui_print "- Detected ABI: $TARGET_ABI"

if [ ! -f "$MODDIR/bin/$TARGET_ABI/causentryd" ]; then
  abort "Missing native daemon binary: bin/$TARGET_ABI/causentryd"
fi
chmod 755 "$MODDIR/bin/$TARGET_ABI/causentryd" 2>/dev/null
chmod 755 "$MODDIR/post-fs-data.sh" "$MODDIR/service.sh" "$MODDIR/action.sh" "$MODDIR/uninstall.sh" 2>/dev/null

mkdir -p "$DIR" 2>/dev/null
chmod 700 "$DIR" 2>/dev/null

# Clean up legacy v1 shell daemon & webroot leftovers
rm -rf "$DIR/webroot" "$DIR/ui.token" "$DIR/causentry-loop.sh" "$DIR/causentryd.sh" "$DIR/uirpc.sh" "$DIR/uirpc-wake.sh" \
  "$DIR/lib.sh" "$DIR/apply.sh" "$DIR/apply-async.sh" "$DIR/cloak.sh" "$DIR/appcfg.sh" "$DIR/restore.sh" \
  "$DIR/root-apps.sh" "$DIR/status.sh" "$DIR/hidden.sh" "$DIR/enforce-denylist.sh" "$DIR/doctor.sh" 2>/dev/null

[ -f "$DIR/config.json" ] || cp -f "$MODDIR/config.default.json" "$DIR/config.json" 2>/dev/null

# Stage & install bundled Control UI APK
if [ -f "$MODDIR/payload/Causentry.apk" ]; then
  cp -f "$MODDIR/payload/Causentry.apk" "$DIR/Causentry.apk" 2>/dev/null
  chmod 644 "$DIR/Causentry.apk" 2>/dev/null
  ui_print "- Staged Causentry Control UI APK"

  if pm path android >/dev/null 2>&1 || cmd package path android >/dev/null 2>&1; then
    TMP_APK="/data/local/tmp/causentry-ui.apk"
    if cp -f "$DIR/Causentry.apk" "$TMP_APK" 2>/dev/null; then
      chmod 644 "$TMP_APK" 2>/dev/null
      chcon u:object_r:shell_data_file:s0 "$TMP_APK" 2>/dev/null
      if cmd package install -r "$TMP_APK" >/dev/null 2>&1 || pm install -r "$TMP_APK" >/dev/null 2>&1; then
        sha256sum "$DIR/Causentry.apk" 2>/dev/null | cut -d' ' -f1 > "$DIR/.uiapk.fingerprint" 2>/dev/null
        pm grant com.causentry.app android.permission.READ_LOGS >/dev/null 2>&1
        ui_print "- Control UI APK installed/updated"
      else
        ui_print "- Control UI APK will be installed automatically on next boot"
      fi
      rm -f "$TMP_APK" 2>/dev/null
    fi
  else
    ui_print "- Package manager offline; Control UI APK will install on next boot"
  fi
else
  ui_print "! Warning: payload/Causentry.apk missing"
fi

ui_print "- Configuration: /data/adb/causentry/config.json"
ui_print "- Reboot to activate Causentry v3.0 native Rust daemon & Zygisk engine"
