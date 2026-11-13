#!/usr/bin/env bash
# Pull the root-side capture and summarise what happened during the JMO login attempt.
set -u
SERIAL="${SERIAL:-6a0706f0}"
OUT="bpjstku-fix/diag"
mkdir -p "$OUT"

adb -s "$SERIAL" get-state >/dev/null 2>&1 || { echo "device $SERIAL not connected"; exit 1; }

adb -s "$SERIAL" shell "su -c 'cat /data/adb/causentry/dbg.log'" > "$OUT/capture.log" 2>/dev/null
adb -s "$SERIAL" shell "su -c 'tail -60 /data/adb/causentry/causentry.log'" > "$OUT/daemon.log" 2>/dev/null

echo "capture: $(wc -c < "$OUT/capture.log") bytes   daemon log: $(wc -c < "$OUT/daemon.log") bytes"
echo

echo "== 1. cloak on/off timeline (daemon) =="
grep -E "cloak ON|cloak OFF|event: start|event: died|saved original" "$OUT/daemon.log" | tail -14

echo
echo "== 2. JMO process lifecycle in capture =="
grep -E "bpjstku" "$OUT/capture.log" | grep -iE "start proc|ActivityManager: Start|Displayed|died|crash|ANR|Force" | tail -12

echo
echo "== 3. JMO crashes / exceptions =="
grep -iE "bpjstku" "$OUT/capture.log" | grep -iE "AndroidRuntime|FATAL|Exception|SIGSEGV|abort" | tail -20

echo
echo "== 4. security / tamper flavoured lines in the window =="
grep -iE "pairip|tamper|integrity|zimperium|zips|rootbeer|SafetyNet|play integrity|attest|emulator|debugger|hooking" "$OUT/capture.log" | grep -viE "auditd|avc:" | tail -15

echo
echo "== 5. our backend's own lines =="
grep -E "CausentryZygote|ZygoteLoader" "$OUT/capture.log" | tail -12

echo
echo "== 6. SELinux denials where JMO is the subject =="
grep -E "app=com.bpjstku|scontext=u:r:untrusted_app.*bpjstku" "$OUT/capture.log" | tail -8
