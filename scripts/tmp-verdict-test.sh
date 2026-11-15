#!/system/bin/sh
# Unit test for reset_app_verdict_cache(): run against a throwaway package dir.
D=/data/adb/causentry
. "$D/lib.sh"
DIR="$D"
PKG=com.causentry.verdicttest
rm -rf "/data/data/$PKG"
mkdir -p "/data/data/$PKG/shared_prefs" "/data/data/$PKG/files/datastore"

# 1) live credential store with a scary "security/key" name  -> MUST survive
printf '%s' '<map><string name="session_token">SECRET123</string></map>' \
  > "/data/data/$PKG/shared_prefs/com.bca.mybca.omni.android.devsecurity.keyhelper_preferences.xml"
# 2) Jetpack Security encrypted prefs                          -> MUST survive
printf '%s' '<map><string name="p">x</string></map>' \
  > "/data/data/$PKG/shared_prefs/__androidx_security_crypto_encrypted_file_pref__.xml"
# 3) real Talsec verdict cache (no secrets)                    -> should be cleared
printf '%s' '<map><boolean name="rootDetected" value="true"/></map>' \
  > "/data/data/$PKG/shared_prefs/freeRASP_talsec_verdict.xml"
# 4) RootBeer datastore verdict                                -> should be cleared
printf '%s' 'BINARYROOTBOOLEANS' \
  > "/data/data/$PKG/files/datastore/rootbeer_rootcheck.preferences_pb"

reset_app_verdict_cache "$PKG" 2>&1

echo "=== REMAIN ==="
ls -1 "/data/data/$PKG/shared_prefs/" 2>/dev/null
ls -1 "/data/data/$PKG/files/datastore/" 2>/dev/null
echo "=== BACKUPS ==="
ls -1 "$D/verdict_backups/$PKG/" 2>/dev/null
rm -rf "/data/data/$PKG"
