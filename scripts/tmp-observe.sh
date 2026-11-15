#!/system/bin/sh
# Single-command observation: dumps status.json ts + bibit slice every second.
S=/data/data/com.causentry.app/files/status.json
CMD=/data/data/com.causentry.app/files/cmd
PKG=com.bibit.bibitid
OP="s$(date +%s)$$"

show() {
  ts=$(grep -o '"ts":[0-9]*' "$S" 2>/dev/null | head -1 | cut -d: -f2)
  sl=$(grep -o "\"$PKG\":{[^}]*}" "$S" 2>/dev/null | head -1)
  echo "$1 ts=$ts $sl"
}

i=0
while [ $i -lt 4 ]; do
  show "pre "
  i=$((i+1)); sleep 1
done

printf '{"action":"setapp","pkg":"%s","features":"devOff,mock,isolate","op":"%s"}' "$PKG" "$OP" > "$CMD/cmd-$OP.json"
echo "sent op=$OP at $(date +%s)"

i=0
while [ $i -lt 18 ]; do
  show "post"
  i=$((i+1)); sleep 1
done
echo "final op=$OP"
