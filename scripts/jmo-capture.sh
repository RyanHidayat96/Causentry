#!/usr/bin/env bash
# Pull the root-side captures and dig out the JMO login window, surviving the ADB
# drops the module intentionally causes while a protected target is foreground.
#
#   bash scripts/jmo-capture.sh [minutes-to-wait]
set -u

SERIAL="${SERIAL:-6a0706f0}"
DIAG="bpjstku-fix/diag"
mkdir -p "$DIAG"
DEADLINE=$(( $(date +%s) + ${1:-120} ))

wait_dev() {
  while [ "$(date +%s)" -lt "$DEADLINE" ]; do
    if adb -s "$SERIAL" get-state >/dev/null 2>&1; then return 0; fi
    adb kill-server >/dev/null 2>&1
    adb start-server >/dev/null 2>&1
    sleep 3
  done
  return 1
}

pull_root() {   # pull_root <device path> <local path>
  wait_dev || return 1
  local tmp="/data/local/tmp/$(basename "$2")"
  adb -s "$SERIAL" shell "su -c 'cp -f \"$1\" $tmp; chmod 666 $tmp'" >/dev/null 2>&1
  wait_dev || return 1
  adb -s "$SERIAL" pull "$tmp" "$2" >/dev/null 2>&1 && adb -s "$SERIAL" shell "rm -f $tmp" >/dev/null 2>&1
}

echo "== pulling captures =="
pull_root /data/adb/causentry/dbg.log     "$DIAG/now.log"   && echo "  now.log   $(wc -l < "$DIAG/now.log" 2>/dev/null) lines"
pull_root /data/adb/causentry/dbg.log.1   "$DIAG/prev1.log" && echo "  prev1.log $(wc -l < "$DIAG/prev1.log" 2>/dev/null) lines"
pull_root /data/adb/causentry/dbg.log.2   "$DIAG/prev2.log" && echo "  prev2.log $(wc -l < "$DIAG/prev2.log" 2>/dev/null) lines"
pull_root /data/adb/causentry/causentry.log "$DIAG/daemon.log"
pull_root /data/system/causentry/cloak.json "$DIAG/cloak_live.json"

cat "$DIAG"/now.log "$DIAG"/prev1.log "$DIAG"/prev2.log 2>/dev/null | sort -s -k2 > "$DIAG/all.log" 2>/dev/null
echo "  all.log   $(wc -l < "$DIAG/all.log" 2>/dev/null) lines"

echo
echo "== JMO lifecycle (daemon log) =="
grep -E "event: (start|died) com.bpjstku|cloak (ON|OFF)" "$DIAG/daemon.log" 2>/dev/null | tail -12

echo
echo "== last JMO window in the capture =="
grep -E "bpjstku" "$DIAG/all.log" 2>/dev/null | grep -iE "wm_on_create_called|wm_on_destroy_called|Displayed|Start proc|died|Killing" | tail -16 | cut -c1-150

echo
echo "== licence / license service activity for that window =="
grep -iE "LicenseClient|pairip|vending|finsky" "$DIAG/all.log" 2>/dev/null | grep -viE "auditd|Rescheduling" | tail -14 | cut -c1-150

echo
echo "== who started an activity right before the switch to another app =="
grep -E "START u0|startActivityAsUser|moveTaskToFront" "$DIAG/all.log" 2>/dev/null | grep -viE "com.miui.home|launcher" | tail -12 | cut -c1-170
