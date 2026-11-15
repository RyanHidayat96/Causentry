#!/system/bin/sh
# Causentry - restore round-trip probe (root).
# Verifies that a restored config keeps protection state and that only the
# targets whose policies actually changed get restarted.
#
#   sh /data/local/tmp/cs-restore-test.sh
D=/data/adb/causentry
APP_DIR=/data/data/com.causentry.app/files
CMD=$APP_DIR/cmd
APPLY_TOKEN=$D/.apply.done.token
RC=$D/.command.rc

b64() { base64 -w0 "$1" 2>/dev/null || base64 "$1" | tr -d '\n'; }

send() { # send <op> <json-extra-body-without-op>  -- caller writes file itself
  :
}

wait_apply() { # wait_apply [timeout]
  t=${1:-60}
  i=0
  while [ $i -lt "$t" ]; do
    [ -f "$APPLY_TOKEN" ] && { sleep 2; return 0; }
    sleep 1
    i=$((i + 1))
  done
  return 1
}

echo "== 0. pre-state =="
cp -f "$D/config.json" /data/local/tmp/pre.json
cp -f /data/system/causentry/cloak.json /data/local/tmp/pre-cloak.json 2>/dev/null
echo "targets: $(grep -o '"targets":\[[^]]*\]' "$D/config.json" | head -1)"
echo "cloakPackages: $(grep -o '"cloakPackages":\[[^]]*\]' "$D/config.json" | head -1)"
echo "systemCloak: $(grep -o '"systemCloak":[a-z]*' "$D/config.json" | head -1)"

echo
echo "== 1. importcfg with the CURRENT config (no-op restore) =="
rm -f "$APPLY_TOKEN"
OP="rt-noop-$(date +%s)"
printf '{"action":"importcfg","op":"%s","configBase64":"%s"}' "$OP" "$(b64 /data/local/tmp/pre.json)" > "$CMD/cmd-$OP.json"
chown "$(stat -c %u "$APP_DIR"):$(stat -c %g "$APP_DIR")" "$CMD/cmd-$OP.json" 2>/dev/null
chmod 660 "$CMD/cmd-$OP.json" 2>/dev/null
wait_apply 60 && echo "apply finished, rc=$(cat "$RC" 2>/dev/null)" || echo "TIMEOUT waiting apply"
sleep 3
echo "-- log tail --"
tail -6 "$D/causentry.log"
echo "-- restart lines (expect none) --"
grep -c "restore: restarted target" "$D/causentry.log"

echo
echo "== 2. drop a feature on one target, then restore the old config =="
T=$(grep -o '"targets":\[[^]]*\]' "$D/config.json" | head -1 | sed 's/.*\[//;s/\]//;s/"//g' | tr ',' '\n' | head -1)
echo "target under test: $T"
if [ -n "$T" ]; then
  rm -f "$APPLY_TOKEN"
  OP="rt-edit-$(date +%s)"
  printf '{"action":"setapp","pkg":"%s","features":"devOff","op":"%s"}' "$T" "$OP" > "$CMD/cmd-$OP.json"
  chown "$(stat -c %u "$APP_DIR"):$(stat -c %g "$APP_DIR")" "$CMD/cmd-$OP.json" 2>/dev/null
  chmod 660 "$CMD/cmd-$OP.json" 2>/dev/null
  wait_apply 60 && echo "edit applied, rc=$(cat "$RC" 2>/dev/null)" || echo "TIMEOUT waiting edit"
  sleep 3
  echo "entry now: $(grep -o "\"$T\":{[^}]*}" "$D/config.json" | head -1)"

  echo
  echo "== 3. restore pre.json (should restart $T and revert its entry) =="
  rm -f "$APPLY_TOKEN"
  OP="rt-restore-$(date +%s)"
  printf '{"action":"importcfg","op":"%s","configBase64":"%s"}' "$OP" "$(b64 /data/local/tmp/pre.json)" > "$CMD/cmd-$OP.json"
  chown "$(stat -c %u "$APP_DIR"):$(stat -c %g "$APP_DIR")" "$CMD/cmd-$OP.json" 2>/dev/null
  chmod 660 "$CMD/cmd-$OP.json" 2>/dev/null
  wait_apply 60 && echo "restore applied, rc=$(cat "$RC" 2>/dev/null)" || echo "TIMEOUT waiting restore"
  sleep 3
  echo "entry after restore: $(grep -o "\"$T\":{[^}]*}" "$D/config.json" | head -1)"
  echo "-- log tail --"
  tail -8 "$D/causentry.log"
  echo "-- restart lines --"
  grep "restore: restarted target" "$D/causentry.log"
fi

echo
echo "== 4. cloak state after restore =="
echo "systemCloak: $(grep -o '"systemCloak":[a-z]*' "$D/config.json" | head -1)"
echo "hideMode: $(grep -o '"hideMode":"[^"]*"' "$D/config.json" | head -1)"
echo "cloakPackages: $(grep -o '"cloakPackages":\[[^]]*\]' "$D/config.json" | head -1)"
echo "cloak.json diff vs pre:"
diff /data/local/tmp/pre-cloak.json /data/system/causentry/cloak.json >/dev/null 2>&1 && echo "  identical" || echo "  CHANGED"
echo "== done =="
