#!/system/bin/sh
# Causentry — restore everything: re-enable hidden packages, give the original
# developer-options flags back, and drop the optional hook payload.
DIR=/data/adb/causentry
CONF=$DIR/config.json
. "$DIR/lib.sh"
log "restore requested"

# 1) bring back packages that were disabled for the user
if [ -f "$DIR/hidden_packages" ]; then
  while read -r pkg; do
    [ -n "$pkg" ] || continue
    pm install-existing --user 0 "$pkg" >/dev/null 2>&1 && log "restored package: $pkg"
  done < "$DIR/hidden_packages"
  rm -f "$DIR/hidden_packages"
fi

# 1b) un-hide anything that was hidden with pm hide
sh "$DIR/hidden.sh" unhide >/dev/null 2>&1

# 2) restore the real developer-options / mock-location values
if [ -f "$DIR/devsaved" ]; then
  g=$(sed -n 's/^global=//p' "$DIR/devsaved")
  s=$(sed -n 's/^secure=//p' "$DIR/devsaved")
  m=$(sed -n 's/^mock=//p' "$DIR/devsaved")
  [ -n "$g" ] && [ "$g" != "null" ] && settings put global development_settings_enabled "$g"
  [ -n "$s" ] && [ "$s" != "null" ] && settings put secure development_settings_enabled "$s"
  [ -n "$m" ] && [ "$m" != "null" ] && settings put secure mock_location "$m"
  rm -f "$DIR/devsaved"
  log "flags restored"
fi

# 3) remove hook scopes
VCLI=$(vector_cli)
if [ -n "$VCLI" ]; then
  for pkg in $(jlist targets); do
    "$VCLI" scope rm com.causentry.app "$pkg/0" >/dev/null 2>&1
  done
fi
rm -f /data/local/tmp/causentry/config.json 2>/dev/null

echo "Causentry: restore done (reboot recommended to clear kernel-side hiding)"
