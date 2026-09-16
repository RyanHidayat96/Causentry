#!/system/bin/sh
# Causentry - install-time hook (runs once, as root, inside the module install).
MODDIR=${MODPATH:-${0%/*}}
DIR=/data/adb/causentry
LOG="$DIR/causentry.log"

if ! command -v ui_print >/dev/null 2>&1; then
  ui_print() { echo "$*"; }
fi

log_install() {
  mkdir -p "$DIR" 2>/dev/null
  echo "$(date '+%m-%d %H:%M:%S') [customize] $*" >> "$LOG" 2>/dev/null
}

ui_apk_enabled() {
  conf="$DIR/config.json"
  [ -f "$conf" ] || conf="$MODDIR/config.default.json"
  v=$(sed -nE 's/.*"uiApk"[[:space:]]*:[[:space:]]*(true|false).*/\1/p' "$conf" 2>/dev/null | head -1)
  [ "$v" != "false" ]
}

control_apk_installed() {
  pm path com.causentry.app >/dev/null 2>&1 || cmd package path com.causentry.app >/dev/null 2>&1
}

wait_package_manager() {
  i=0
  max="${1:-8}"
  while [ "$i" -lt "$max" ]; do
    pm path android >/dev/null 2>&1 || cmd package path android >/dev/null 2>&1
    [ "$?" -eq 0 ] && return 0
    sleep 1
    i=$((i+1))
  done
  return 1
}

install_control_apk() {
  src="$1"
  wait_package_manager 8 || return 1
  tmp=/data/local/tmp/causentry/Causentry.apk
  mkdir -p /data/local/tmp/causentry 2>/dev/null
  cp -f "$src" "$tmp" 2>/dev/null || return 1
  chmod 644 "$tmp" 2>/dev/null
  chcon u:object_r:shell_data_file:s0 "$tmp" 2>/dev/null
  pm install -r "$tmp"
}

ui_print "*******************************"
ui_print "  Causentry"
ui_print "  universal detection bypass"
ui_print "*******************************"

# spec section 18: the bundled payload must be present and readable.
# Also install it now when Android's package manager is available; service.sh
# retries at boot, so recovery/offline installs still work.
if [ -f "$MODDIR/payload/Causentry.apk" ]; then
  ui_print "- payload/Causentry.apk present"
  mkdir -p "$DIR" 2>/dev/null
  if cp -f "$MODDIR/payload/Causentry.apk" "$DIR/Causentry.apk" 2>/dev/null; then
    chmod 644 "$DIR/Causentry.apk" 2>/dev/null
    ui_print "- payload staged to $DIR/Causentry.apk"
    log_install "payload staged"
    if ui_apk_enabled; then
      if control_apk_installed; then
        ui_print "- control UI APK already installed"
        log_install "control UI APK already installed"
      elif command -v pm >/dev/null 2>&1; then
        if install_control_apk "$DIR/Causentry.apk" >> "$LOG" 2>&1; then
          ui_print "- control UI APK installed"
          log_install "control UI APK installed"
        else
          ui_print "! control UI APK install failed now; boot service will retry"
          log_install "control UI APK install failed during customize"
        fi
      else
        ui_print "- package manager not ready; boot service will install the APK"
        log_install "pm unavailable during customize; boot service will retry"
      fi
    else
      ui_print "- uiApk=false; control UI APK install skipped"
      log_install "uiApk=false; APK install skipped"
    fi
  else
    ui_print "! failed to stage payload; boot service will retry"
    log_install "payload staging failed"
  fi
else
  ui_print "! payload/Causentry.apk missing (optional in-process hooks stay off)"
  log_install "payload missing"
fi

ui_print "- configuration lives in /data/adb/causentry/config.json"
ui_print "- control UI opens from the module Action button"
ui_print "- nothing runs inside protected apps: all bypassing is system/kernel side"
ui_print "- done"
