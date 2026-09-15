#!/system/bin/sh
DIR=${CAUSENTRY_DIR:-/data/adb/causentry}
. "$DIR/lib.sh"
# Causentry - write the system_server hook config (package cloaking).
#
# /data/system is readable by system_server; /data/adb is not (and SUSFS hides it).
# The hook then answers protected apps as if the listed packages were absent,
# without uninstalling or disabling anything.

OUT_DIR=/data/system/causentry
OUT=$OUT_DIR/cloak.json

hidden_list() {
  for p in $(jlist denylist) $(jlist cloakPackages); do echo "$p"; done
  sh "$DIR/root-apps.sh" list 2>/dev/null
}

uid_of() {
  cmd package list packages -U --user 0 2>/dev/null \
    | sed -nE "s/^package:$1 uid:([0-9]+)$/\1/p" | head -1
}

mkdir -p "$OUT_DIR" 2>/dev/null
chmod 755 "$OUT_DIR" 2>/dev/null

T="$(mktemp 2>/dev/null || echo "$DIR/.cloak.tmp")"
printf '{"targetUids":[' > "$T"
first=1
for t in $(jlist targets); do
  u=$(uid_of "$t")
  [ -n "$u" ] || continue
  [ $first -eq 1 ] || printf ',' >> "$T"
  first=0
  printf '%s' "$u" >> "$T"
done
printf '],"targets":[' >> "$T"
first=1
for t in $(jlist targets); do
  [ $first -eq 1 ] || printf ',' >> "$T"
  first=0
  printf '"%s"' "$t" >> "$T"
done
printf '],"hidden":[' >> "$T"
first=1
for p in $(hidden_list | sort -u); do
  [ -n "$p" ] || continue
  [ $first -eq 1 ] || printf ',' >> "$T"
  first=0
  printf '"%s"' "$p" >> "$T"
done
printf '],"appZygote":[' >> "$T"
first=1
for t in $(jlist targets); do
  # per-app entry looks like  "com.x":{"devOff":true,"mock":true,"isolate":false}
  ent=$(grep -oE "\"$t\":\{[^}]*\}" "$CONF" 2>/dev/null | head -1)
  case "$ent" in *'"isolate":false'*) continue;; esac
  [ $first -eq 1 ] || printf ',' >> "$T"
  first=0
  printf '"%s"' "$t" >> "$T"
done
printf ']}' >> "$T"

cp -f "$T" "$OUT" 2>/dev/null && chmod 644 "$OUT" 2>/dev/null

# same file for the processes that cannot read /data/system:
#   SettingsProvider (system_app) -> /data/local/tmp + the sdcard media dir
for d in /data/local/tmp/causentry /sdcard/Android/media/com.causentry.app /data/media/0/Android/media/com.causentry.app; do
  mkdir -p "$d" 2>/dev/null
  cp -f "$T" "$d/cloak.json" 2>/dev/null && chmod 644 "$d/cloak.json" 2>/dev/null
done
[ "$T" = "$DIR/.cloak.tmp" ] && mv -f "$T" "$DIR/cloak.json.tmp" 2>/dev/null
echo "cloak.json: $(wc -c < "$OUT" 2>/dev/null) bytes -> $OUT (+3 mirrors)"
