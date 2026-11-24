#!/system/bin/sh
# Causentry v3.1 - Module Action button
DIR=/data/adb/causentry
BIN="$DIR/causentryd"

echo "Causentry v3.1: syncing policies..."
if [ -x "$BIN" ]; then
  "$BIN" apply 2>&1
  echo ""
  "$BIN" status 2>&1
else
  echo "Warning: causentryd not staged yet. Reboot to initialize."
fi

if pm path com.causentry.app >/dev/null 2>&1; then
  echo ""
  echo "Opening Causentry Control UI..."
  am start -n com.causentry.app/.MainActivity >/dev/null 2>&1
else
  echo ""
  echo "Causentry Control UI APK is not installed."
fi
