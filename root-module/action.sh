#!/system/bin/sh
# Causentry — module "Action" button: re-apply protections and open the UI.
DIR=/data/adb/causentry
mkdir -p "$DIR/webroot/cgi-bin" 2>/dev/null
[ -f "$DIR/lib.sh" ] && . "$DIR/lib.sh"

echo "Causentry: re-applying protections..."
sh "$DIR/apply.sh" action 2>&1 | tail -20

if [ ! -s "$DIR/ui.token" ]; then
  head -c 16 /dev/urandom | od -An -tx1 | tr -d ' \n' > "$DIR/ui.token"
  chmod 600 "$DIR/ui.token"
fi
TOKEN=$(cat "$DIR/ui.token")

if ensure_ui; then
  echo "Opening Causentry UI..."
  am start -a android.intent.action.VIEW -d "http://127.0.0.1:8899/index.html?t=$TOKEN" >/dev/null 2>&1
else
  echo "No busybox on this device: use the CLI instead, e.g. sh $DIR/status.sh"
fi
echo ""
echo "Status:"
sh "$DIR/webroot/cgi-bin/api.sh" status "$TOKEN" 2>/dev/null | tail -1
