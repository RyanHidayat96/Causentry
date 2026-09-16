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
  for p in $(jlist denylist) $(jlist cloakPackages); do
    valid_package_name "$p" && echo "$p"
  done
}

target_hidden_list() {
  t="$1"
  tpl=$(app_hide_template "$t")
  for p in $(hide_template_list "$tpl") $(jlist cloakPackages); do
    valid_package_name "$p" && echo "$p"
  done
}

uid_of() {
  valid_package_name "$1" || return 1
  printf '%s\n' "$PKG_UIDS" | while IFS= read -r line; do
    case "$line" in
      "package:$1 uid:"*) echo "${line##* uid:}"; break;;
    esac
  done | head -1
}

mkdir -p "$OUT_DIR" 2>/dev/null
chmod 755 "$OUT_DIR" 2>/dev/null

T="$(mktemp 2>/dev/null || echo "$DIR/.cloak.tmp")"
PKG_UIDS=$(cmd package list packages -U --user 0 2>/dev/null)
printf '{"targetUids":[' > "$T"
first=1
for t in $(jlist targets); do
  valid_package_name "$t" || continue
  u=$(uid_of "$t")
  [ -n "$u" ] || continue
  [ $first -eq 1 ] || printf ',' >> "$T"
  first=0
  printf '%s' "$u" >> "$T"
done
printf '],"targets":[' >> "$T"
first=1
for t in $(jlist targets); do
  valid_package_name "$t" || continue
  [ $first -eq 1 ] || printf ',' >> "$T"
  first=0
  json_string "$t" >> "$T"
done
printf '],"hidden":[' >> "$T"
first=1
for p in $(hidden_list | sort -u); do
  valid_package_name "$p" || continue
  [ $first -eq 1 ] || printf ',' >> "$T"
  first=0
  json_string "$p" >> "$T"
done
printf '],"hiddenByTarget":{' >> "$T"
first=1
for t in $(jlist targets); do
  valid_package_name "$t" || continue
  [ $first -eq 1 ] || printf ',' >> "$T"
  first=0
  json_string "$t" >> "$T"
  printf ':[' >> "$T"
  inner=1
  for p in $(target_hidden_list "$t" | sort -u); do
    valid_package_name "$p" || continue
    [ $inner -eq 1 ] || printf ',' >> "$T"
    inner=0
    json_string "$p" >> "$T"
  done
printf ']' >> "$T"
done
printf '}' >> "$T"
printf ',"appZygote":[' >> "$T"
first=1
for t in $(jlist targets); do
  valid_package_name "$t" || continue
  iso=$(app_feat "$t" isolate)
  [ "$iso" = 0 ] && continue
  [ $first -eq 1 ] || printf ',' >> "$T"
  first=0
  json_string "$t" >> "$T"
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
