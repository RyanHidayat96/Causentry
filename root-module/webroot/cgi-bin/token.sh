#!/system/bin/sh
DIR=/data/adb/causentry
if [ ! -f "$DIR/ui.token" ]; then
  head -c 16 /dev/urandom | od -An -tx1 | tr -d ' \n' > "$DIR/ui.token"
  chmod 600 "$DIR/ui.token"
fi
echo "Content-Type: text/plain"
echo ""
echo "Causentry UI token: $(cat "$DIR/ui.token")"
echo "Open on the phone:  http://127.0.0.1:8899/index.html?t=$(cat "$DIR/ui.token")"
