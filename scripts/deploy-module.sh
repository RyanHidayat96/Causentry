#!/usr/bin/env bash
# Causentry - push the built module zip to the device and (optionally) refresh the
# live runtime in /data/adb/causentry without waiting for a reboot.
#
#   ./scripts/deploy-module.sh                 push zip to /sdcard/Download
#   ./scripts/deploy-module.sh --live          also restage + restart daemon/UI now
#   SERIAL=xxxx ./scripts/deploy-module.sh     pick a device explicitly
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
MOD="$ROOT/root-module"
D=/data/adb/causentry
SERIAL="${SERIAL:-}"
ADB=(adb); [ -n "$SERIAL" ] && ADB=(adb -s "$SERIAL")

# native tools (adb) need native paths, not MSYS /c/...
winpath() { printf '%s' "$1" | sed -E 's|^/([a-zA-Z])/|\1:/|'; }

ver=$(sed -n 's/^version=v\{0,1\}//p' "$MOD/module.prop" | head -1)
ZIP="$ROOT/release/Causentry-KSUN-v$ver.zip"
[ -f "$ZIP" ] || { echo "no zip at $ZIP - run scripts/package-universal-module.sh first"; exit 1; }

echo "== pushing $ZIP =="
"${ADB[@]}" push "$(winpath "$ZIP")" "/sdcard/Download/$(basename "$ZIP")"
echo "   install: KernelSU manager -> Modules -> Install from storage -> Download/$(basename "$ZIP")"

if [ "${1:-}" != "--live" ]; then
  echo "(use --live to restage the running system without rebooting)"
  exit 0
fi

echo "== staging live runtime =="
"${ADB[@]}" shell rm -rf /sdcard/causentry-stage
"${ADB[@]}" shell mkdir -p /sdcard/causentry-stage/bin /sdcard/causentry-stage/webroot/cgi-bin
"${ADB[@]}" push "$(winpath "$MOD/bin/.")" /sdcard/causentry-stage/bin/ >/dev/null
"${ADB[@]}" push "$(winpath "$MOD/webroot/.")" /sdcard/causentry-stage/webroot/ >/dev/null
"${ADB[@]}" push "$(winpath "$MOD/config.default.json")" /sdcard/causentry-stage/config.default.json >/dev/null
"${ADB[@]}" push "$(winpath "$MOD/payload/Causentry.apk")" /sdcard/causentry-stage/Causentry.apk >/dev/null

"${ADB[@]}" shell "su -c '
  mkdir -p $D/webroot/cgi-bin
  cp -f /sdcard/causentry-stage/bin/*.sh $D/
  cp -f /sdcard/causentry-stage/webroot/index.html $D/webroot/
  cp -f /sdcard/causentry-stage/webroot/cgi-bin/*.sh $D/webroot/cgi-bin/
  cp -f /sdcard/causentry-stage/Causentry.apk $D/Causentry.apk 2>/dev/null
  cd $D
  for f in *.sh webroot/cgi-bin/*.sh; do tr -d \"\r\" < \$f > \$f.tmp && mv \$f.tmp \$f; done
  chmod 700 $D; chmod 755 $D/*.sh $D/webroot/cgi-bin/*.sh
  sh $D/apply.sh deploy >/dev/null 2>&1
  kill \$(cat $D/daemon.pid 2>/dev/null) 2>/dev/null
  pkill -f \"httpd -p 127.0.0.1:8899\" 2>/dev/null
  sleep 1
  setsid /system/bin/sh $D/causentryd.sh >/dev/null 2>&1 < /dev/null &
  setsid /data/adb/ksu/bin/busybox httpd -p 127.0.0.1:8899 -h $D/webroot >/dev/null 2>&1 < /dev/null &
  sleep 2
  echo daemon=\$(cat $D/daemon.pid)
'"

TOKEN=$("${ADB[@]}" shell "su -c 'cat $D/ui.token'" | tr -d '\r\n')
echo "== api check =="
"${ADB[@]}" shell "su -c '/data/adb/ksu/bin/busybox wget -qO- \"http://127.0.0.1:8899/cgi-bin/api.sh?t=$TOKEN&action=status\"'" | head -c 400
echo
echo "UI: http://127.0.0.1:8899/index.html?t=$TOKEN"
