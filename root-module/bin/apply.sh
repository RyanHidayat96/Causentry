#!/system/bin/sh
# Causentry — apply protections (idempotent). Run at boot, from the UI, or from the
# module Action button. Never touches the protected app's APK: hardened apps
# (PairIP / RASP) are handled purely system/kernel side so they never crash.
DIR=/data/adb/causentry
CONF=$DIR/config.json
. "$DIR/lib.sh"
mode="${1:-manual}"
log "apply: mode=$mode"

wait_package_manager() {
  i=0
  max="${1:-30}"
  while [ "$i" -lt "$max" ]; do
    package_manager_ready && return 0
    sleep 1
    i=$((i+1))
  done
  return 1
}

install_control_apk() {
  src="$1"
  wait_package_manager 30 || return 1
  tmp=/data/local/tmp/causentry/Causentry.apk
  mkdir -p /data/local/tmp/causentry 2>/dev/null
  cp -f "$src" "$tmp" 2>/dev/null || return 1
  chmod 644 "$tmp" 2>/dev/null
  chcon u:object_r:shell_data_file:s0 "$tmp" 2>/dev/null
  pm install -r "$tmp"
}

# 0) boot properties that root/RASP checks read (safe subset)
RESETPROP=$(find_resetprop)
if [ -n "$RESETPROP" ]; then
  "$RESETPROP" ro.debuggable 0
  "$RESETPROP" ro.secure 1
  "$RESETPROP" ro.boot.verifiedbootstate green
  "$RESETPROP" ro.boot.flash.locked 1
  "$RESETPROP" ro.boot.veritymode enforcing
  "$RESETPROP" ro.boot.vbmeta.device_state locked
  "$RESETPROP" sys.oem_unlock_allowed 0
  log "boot props applied"
fi

# 1) hidden-app list. Causentry keeps this target-scoped: packages stay installed
#    and visible to the user, while the system-side cloak config filters what
#    protected target apps can see.
RAW_MODE=$(hide_mode)
MODE=$(effective_hide_mode)
if [ "$RAW_MODE" != "$MODE" ]; then
  log "hideMode=$RAW_MODE requested but no verified system cloak backend is enabled; using $MODE fallback"
fi
if [ "$MODE" = "cloak" ]; then
  log "hideMode=cloak: detection packages stay installed (filtered in system_server)"
else
  log "hidden-app list is target-scoped; physical package hiding skipped"
fi

# 1b) root tools are no longer a separate physical-hide path. Add Magisk,
#     KernelSU, fake-GPS tools, etc. to the same hidden-app list when a target
#     should not be able to enumerate them.
log "root app physical hiding deprecated; use hidden-app list"

# 2) mock location is handled by the foreground state machine in causentryd.sh.
#    apply.sh may run at boot or from the UI, so changing it here would make a
#    device-wide setting drift without a guaranteed per-app restore point.
log "mock-location flag left to daemon state machine"

# 3) SUSFS path hiding (kernel level) — reapplied here so the UI can toggle it
SUSFS=$(find_susfs)
if [ "$(jbool susfs)" = 1 ] && [ -n "$SUSFS" ] && "$SUSFS" support >/dev/null 2>&1; then
  "$SUSFS" hide_sus_mnts_for_non_su_procs 1 2>/dev/null
  for p in /data/adb /data/adb/modules /data/adb/ksu /data/magisk /sbin/.magisk /debug_ramdisk; do
    [ -e "$p" ] && "$SUSFS" add_sus_path "$p" >/dev/null 2>&1
  done
  log "susfs hiding refreshed"
fi

# 3b) control-UI app: payload/Causentry.apk doubles as a launcher (WebView over the
#     loopback UI). Installed only when uiApk is enabled and not already present.
if [ "$(jbool uiApk)" = 1 ] && [ -f "$DIR/Causentry.apk" ]; then
  if wait_package_manager 30 && ! package_installed com.causentry.app; then
    if install_control_apk "$DIR/Causentry.apk" >> "$LOG" 2>&1; then
      log "control-UI app installed (com.causentry.app)"
    else
      log "control-UI app install failed"
    fi
  elif ! wait_package_manager 1; then
    log "control-UI app install skipped: package manager not ready"
  fi
  # hand the UI token to the app privately (no root prompt needed inside the app)
  if [ -s "$DIR/ui.token" ] && [ -d /data/data/com.causentry.app ]; then
    app_uid=$(stat -c %u /data/data/com.causentry.app 2>/dev/null)
    mkdir -p /data/data/com.causentry.app/files 2>/dev/null
    cp -f "$DIR/ui.token" /data/data/com.causentry.app/files/ui.token 2>/dev/null \
      && chmod 600 /data/data/com.causentry.app/files/ui.token 2>/dev/null \
      && [ -n "$app_uid" ] && chown "$app_uid:$app_uid" /data/data/com.causentry.app/files/ui.token 2>/dev/null
    log "ui token handed to control-UI app (uid ${app_uid:-?})"
  fi
fi

# 4) optional in-process hook payload (Vector/LSPosed) — only for apps that are NOT
#    hardened. Injecting into a PairIP app is exactly what makes it crash, so those
#    are skipped on purpose and served by the system-side cloaks instead.
if [ "$(jbool hooks)" = 1 ]; then
  VCLI=$(vector_cli)
  APK="$DIR/Causentry.apk"
  if [ -x "$VCLI" ] && [ -f "$APK" ]; then
    if ! package_installed com.causentry.app; then
      install_control_apk "$APK" >/dev/null 2>&1 && log "Causentry.apk installed"
    fi
    "$VCLI" modules enable com.causentry.app >/dev/null 2>&1
    # runtime config for the hook engine (readable by app processes)
    cp -f "$CONF" /data/local/tmp/causentry/config.json 2>/dev/null
    chmod 644 /data/local/tmp/causentry/config.json 2>/dev/null
    chcon u:object_r:system_file:s0 /data/local/tmp/causentry/config.json 2>/dev/null
    for pkg in $(jlist targets); do
      if is_hardened "$pkg"; then
        "$VCLI" scope rm com.causentry.app "$pkg/0" >/dev/null 2>&1
        log "hooks skipped (hardened): $pkg"
      else
        "$VCLI" scope add com.causentry.app "$pkg/0" >/dev/null 2>&1
        log "hooks enabled: $pkg"
      fi
    done
  else
    log "hooks requested but Vector framework not found — using system-side mode only"
  fi
fi

echo "Causentry: apply($mode) done"

# 5) system_server package cloaking config (non-destructive hiding)
[ -x "$DIR/cloak.sh" ] && sh "$DIR/cloak.sh" >> "$LOG" 2>&1
