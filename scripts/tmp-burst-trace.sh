#!/system/bin/sh
# Burst contention test: sends N setapp commands back-to-back while polling status.json.
S=/data/data/com.causentry.app/files/status.json
CMD=/data/data/com.causentry.app/files/cmd
D=/data/adb/causentry
PKG=$1
OUT=/data/local/tmp/burst-trace.txt
OPB="b$(date +%s)$$"

slice() { grep -o "\"$PKG\":{[^}]*}" "$S" 2>/dev/null | head -1; }

: > "$OUT"
(
  i=0
  while [ $i -lt 240 ]; do
    ts=$(date +%s%3N 2>/dev/null)
    [ -z "$ts" ] && ts=$(date +%s)
    printf '%s|%s\n' "$ts" "$(slice)" >> "$OUT"
    i=$((i+1)); sleep 0.1
  done
) &
POLL=$!
sleep 1.0

send() {
  op="$OPB-$1"
  printf '{"action":"setapp","pkg":"%s","features":"%s","op":"%s"}' "$PKG" "$2" "$op" > "$CMD/cmd-$op.json"
  echo "SENT|$(date +%s%3N)|$1|$2" >> "$OUT"
}

send c1 "devOff,mock,isolate,accOff"
sleep 0.3
send c2 "devOff,mock,isolate"
sleep 0.3
send c3 "devOff,mock,isolate,accOff"
sleep 0.3
send c4 "devOff,mock,isolate"

j=0
while [ $j -lt 200 ]; do
  tok=$(cat "$D/.apply.done.token" 2>/dev/null)
  case "$tok" in "$OPB"-c4) echo "TOKEN4|$(date +%s%3N)" >> "$OUT"; break;; esac
  j=$((j+1)); sleep 0.1
done
wait $POLL
echo "OP|$OPB" >> "$OUT"
