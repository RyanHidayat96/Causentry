#!/system/bin/sh
# Lost-command test: 3 rounds of 4 rapid setapp commands; last command must win.
D=/data/adb/causentry
CMD=/data/data/com.causentry.app/files/cmd
PKG=com.bibit.bibitid
LOG=$D/causentry.log

send() {
  printf '{"action":"setapp","pkg":"%s","features":"%s","op":"%s"}' "$PKG" "$2" "$BASE-$1" > "$CMD/cmd-$BASE-$1.json"
  echo "  sent $1 -> $2"
}

round=1
while [ $round -le 3 ]; do
  BASE="r$round$(date +%s)"
  echo "=== ROUND $round base=$BASE ==="
  mark=$(wc -l < "$LOG")
  send a "devOff,mock,isolate,accOff"
  sleep 0.2
  send b "devOff,mock,isolate"
  sleep 0.2
  send c "devOff,mock,isolate,accOff"
  sleep 0.2
  send d "devOff,mock,isolate"
  sleep 14
  echo "  processed:"
  tail -n +$((mark + 1)) "$LOG" | grep "app config set" | sed 's/^/    /'
  n=$(tail -n +$((mark + 1)) "$LOG" | grep -c "app config set")
  echo "  count=$n (expected 4)"
  echo "  final accOff=$(grep -o '"accOff":[a-z]*' "$D/config.json" | tail -1)  (expected false)"
  echo "  leftover_cmd_files=$(ls "$CMD" 2>/dev/null | wc -l)"
  round=$((round + 1))
  sleep 2
done
