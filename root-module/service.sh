#!/system/bin/sh
# Causentry v2.0 - late_start service stage
# Ensures causentryd is alive, installs/updates Causentry.apk if needed, applies policy,
# and grants READ_LOGS for lazy on-demand Forensics. Zero httpd, zero polling loops.

MODDIR=${0%/*}
DIR=/data/adb/causentry
BIN="$DIR/causentryd"

# Ensure native daemon is running (in case post-fs-data didn't start or was restarted)
if [ -x "$BIN" ] && ! pidof causentryd >/dev/null 2>&1; then
  if command -v setsid >/dev/null 2>&1; then
    setsid "$BIN" serve >/dev/null 2>&1 < /dev/null &
  else
    "$BIN" serve >/dev/null 2>&1 < /dev/null &
  fi
fi

# Wait for boot completion so package manager is ready
i=0
while [ "$(getprop sys.boot_completed 2>/dev/null)" != "1" ] && [ "$i" -lt 60 ]; do
  sleep 1
  i=$((i + 1))
done

# Install or update bundled Control UI APK if fingerprint changed
APK="$DIR/Causentry.apk"
if [ -f "$APK" ]; then
  WANT=$(sha256sum "$APK" 2>/dev/null | cut -d' ' -f1)
  HAVE=$(cat "$DIR/.uiapk.fingerprint" 2>/dev/null)
  INSTALLED=0
  pm path com.causentry.app >/dev/null 2>&1 && INSTALLED=1

  if [ "$INSTALLED" -eq 0 ] || { [ -n "$WANT" ] && [ "$WANT" != "$HAVE" ]; }; then
    TMP_APK="/data/local/tmp/causentry-ui.apk"
    if cp -f "$APK" "$TMP_APK" 2>/dev/null; then
      chmod 644 "$TMP_APK" 2>/dev/null
      chcon u:object_r:shell_data_file:s0 "$TMP_APK" 2>/dev/null
      if cmd package install -r "$TMP_APK" >/dev/null 2>&1 || pm install -r "$TMP_APK" >/dev/null 2>&1; then
        [ -n "$WANT" ] && printf '%s\n' "$WANT" > "$DIR/.uiapk.fingerprint" 2>/dev/null
      fi
      rm -f "$TMP_APK" 2>/dev/null
    fi
  fi
fi

# Grant READ_LOGS so Forensics works lazily without su
pm grant com.causentry.app android.permission.READ_LOGS >/dev/null 2>&1

# Trigger initial policy sync (re-syncs UID socket permissions & pushes snapshot to Zygisk)
[ -x "$BIN" ] && "$BIN" apply >/dev/null 2>&1
