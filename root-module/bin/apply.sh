#!/system/bin/sh
# Causentry — apply protections (idempotent). Run at boot, from the UI, or from the
# module Action button. Never touches the protected app's APK: hardened apps
# (PairIP / RASP) are handled purely system/kernel side so they never crash.
DIR=/data/adb/causentry
CONF=$DIR/config.json
. "$DIR/lib.sh"
mode="${1:-manual}"
log "apply: mode=$mode"

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

# 1) denylisted packages are disabled for the user (reversible, data preserved)
for pkg in $(jlist denylist); do
  if pm list packages --user 0 2>/dev/null | grep -q "^package:${pkg}$"; then
    if pm uninstall --user 0 "$pkg" >/dev/null 2>&1; then
      grep -qx "$pkg" "$DIR/hidden_packages" 2>/dev/null || echo "$pkg" >> "$DIR/hidden_packages"
      log "hidden package: $pkg"
    fi
  fi
done

# 1b) root-indicator apps (Magisk manager, root tooling ...) are hidden for the user.
#     Measured cause of force-close on Zimperium/PairIP apps: a visible root tool.
if [ "$(jbool hideRootApps)" = 1 ] && [ -x "$DIR/root-apps.sh" ]; then
  sh "$DIR/root-apps.sh" hide >> "$LOG" 2>&1
  log "root apps scan+hide done"
fi

# 2) mock location never enabled while a protected app runs
[ "$(jbool hideMockLocation)" = 1 ] && settings put secure mock_location 0

# 3) SUSFS path hiding (kernel level) — reapplied here so the UI can toggle it
SUSFS=$(find_susfs)
if [ "$(jbool susfs)" = 1 ] && [ -n "$SUSFS" ] && "$SUSFS" support >/dev/null 2>&1; then
  "$SUSFS" hide_sus_mnts_for_non_su_procs 1 2>/dev/null
  for p in /data/adb /data/adb/modules /data/adb/ksu /data/magisk /sbin/.magisk /debug_ramdisk; do
    [ -e "$p" ] && "$SUSFS" add_sus_path "$p" >/dev/null 2>&1
  done
  log "susfs hiding refreshed"
fi

# 4) optional in-process hook payload (Vector/LSPosed) — only for apps that are NOT
#    hardened. Injecting into a PairIP app is exactly what makes it crash, so those
#    are skipped on purpose and served by the system-side cloaks instead.
if [ "$(jbool hooks)" = 1 ]; then
  VCLI=$(vector_cli)
  APK="$DIR/Causentry.apk"
  if [ -x "$VCLI" ] && [ -f "$APK" ]; then
    if ! pm list packages 2>/dev/null | grep -q "^package:com.causentry.app$"; then
      pm install -r "$APK" >/dev/null 2>&1 && log "Causentry.apk installed"
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
