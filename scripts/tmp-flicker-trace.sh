#!/system/bin/sh
# Flicker tracer: records per-app config slices from status.json while a setapp command runs.
S=/data/data/com.causentry.app/files/status.json
CMD=/data/data/com.causentry.app/files/cmd
D=/data/adb/causentry
PKG=$1
FEATS=$2
OUT=/data/local/tmp/flicker-trace.txt
OP="t$(date +%s)$$"

slice() { grep -o "\"$PKG\":{[^}]*}" "$S" 2>/dev/null | head -1; }

: > "$OUT"
(
  i=0
  while [ $i -lt 170 ]; do
    ts=$(date +%s%3N 2>/dev/null)
    [ -z "$ts" ] && ts=$(date +%s)
    printf '%s|%s\n' "$ts" "$(slice)" >> "$OUT"
    i=$((i+1)); sleep 0.15
  done
) &
POLL=$!
sleep 1.2
printf '{"action":"setapp","pkg":"%s","features":"%s","op":"%s"}' "$PKG" "$FEATS" "$OP" > "$CMD/cmd-$OP.json"
echo "SENT|$(date +%s%3N)|$OP" >> "$OUT"
j=0
while [ $j -lt 200 ]; do
  tok=$(cat "$D/.apply.done.token" 2>/dev/null)
  if [ "$tok" = "$OP" ]; then
    echo "TOKEN|$(date +%s%3N)|$OP" >> "$OUT"
    break
  fi
  j=$((j+1)); sleep 0.1
done
wait $POLL
echo "OP|$OP" >> "$OUT"
