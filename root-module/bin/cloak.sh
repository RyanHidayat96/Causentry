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

# All values emitted below are validated package or template names. They cannot
# contain JSON metacharacters, so avoid json_string() here: it forks tr + sed
# for every package and made a medium template unnecessarily slow to apply.
json_package() { printf '"%s"' "$1"; }

hidden_list() {
  for p in $DENYLIST $CLOAK_PACKAGES; do
    valid_package_name "$p" && echo "$p"
  done
}

target_hidden_list() {
  tpl="$1"
  valid_template_name "$tpl" && hide_template_list "$tpl"
  for p in $CLOAK_PACKAGES; do
    valid_package_name "$p" && echo "$p"
  done
}

uid_of() {
  valid_package_name "$1" || return 1
  needle="package:$1 uid:"
  old_ifs=$IFS
  IFS='
'
  for line in $PKG_UIDS; do
    case "$line" in
      "$needle"*)
        IFS=$old_ifs
        printf '%s\n' "${line##* uid:}"
        return 0
        ;;
    esac
  done
  IFS=$old_ifs
  return 1
}

# Directory ownership/context are established once at boot. Re-running four
# privileged metadata commands for every toggle costs noticeable time on MIUI.
[ -d "$OUT_DIR" ] || prepare_cloak_state_dir || exit 1

T="$(mktemp 2>/dev/null || echo "$DIR/.cloak.tmp")"
TARGET_FILE="$DIR/.cloak-targets.$$"
trap 'rm -f "$T" "$OUT_DIR/.cloak.$$" "$TARGET_FILE" "$DIR"/.cloak-template."$$".*' EXIT
PKG_UIDS=$(cmd package list packages -U --user 0 2>/dev/null)
TARGETS=$(jlist targets)
DENYLIST=$(jlist denylist)
CLOAK_PACKAGES=$(jlist cloakPackages)

# Keep package and UID in one record. The old two independent loops wrote an
# invalid policy when a configured target was not installed: the UID list became
# shorter than targets, so another app could receive its rules.
: > "$TARGET_FILE"
for t in $TARGETS; do
  valid_package_name "$t" || continue
  u=$(uid_of "$t")
  [ -n "$u" ] || continue
  tpl=$(app_hide_template "$t")
  iso=$(app_feat "$t" isolate)
  dev=$(app_feat_or "$t" devOff autoDevOff)
  [ -n "$tpl" ] || tpl=@
  [ -n "$iso" ] || iso=@
  printf '%s %s %s %s %s\n' "$t" "$u" "$tpl" "$iso" "$dev" >> "$TARGET_FILE"
done

printf '{"targetUids":[' > "$T"
first=1
while read -r t u tpl iso dev; do
  [ $first -eq 1 ] || printf ',' >> "$T"
  first=0
  printf '%s' "$u" >> "$T"
done < "$TARGET_FILE"
printf '],"targets":[' >> "$T"
first=1
while read -r t u tpl iso dev; do
  [ $first -eq 1 ] || printf ',' >> "$T"
  first=0
  json_package "$t" >> "$T"
done < "$TARGET_FILE"
printf '],"hidden":[' >> "$T"
first=1
for p in $(hidden_list | sort -u); do
  valid_package_name "$p" || continue
  [ $first -eq 1 ] || printf ',' >> "$T"
  first=0
  json_package "$p" >> "$T"
done
printf '],"hiddenByTarget":{' >> "$T"
first=1
while read -r t u tpl iso dev; do
  [ $first -eq 1 ] || printf ',' >> "$T"
  first=0
  json_package "$t" >> "$T"
  printf ':[' >> "$T"
  inner=1
  for p in $(target_hidden_list "$tpl" | sort -u); do
    valid_package_name "$p" || continue
    [ $inner -eq 1 ] || printf ',' >> "$T"
    inner=0
    json_package "$p" >> "$T"
  done
  printf ']' >> "$T"
done < "$TARGET_FILE"
printf '}' >> "$T"
printf ',"appZygote":[' >> "$T"
first=1
while read -r t u tpl iso dev; do
  [ "$iso" = 0 ] && continue
  [ $first -eq 1 ] || printf ',' >> "$T"
  first=0
  json_package "$t" >> "$T"
done < "$TARGET_FILE"
printf '],"developerOptionsUids":[' >> "$T"
first=1
while read -r t u tpl iso dev; do
  [ "$dev" = 1 ] || continue
  [ $first -eq 1 ] || printf ',' >> "$T"
  first=0
  printf '%s' "$u" >> "$T"
done < "$TARGET_FILE"
printf ']}' >> "$T"

# Publish a complete policy so concurrent PackageManager calls never read half a save.
cp -f "$T" "$OUT_DIR/.cloak.$$" \
  && chmod 644 "$OUT_DIR/.cloak.$$" \
  && chcon u:object_r:system_data_file:s0 "$OUT_DIR/.cloak.$$" \
  && mv -f "$OUT_DIR/.cloak.$$" "$OUT" || exit 1

# Same file for processes that cannot read /data/system. /sdcard and
# /data/media/0 address the same primary-user storage, so copy once to the
# canonical path. Publish both independent mirrors concurrently and atomically.
publish_mirror() {
  d="$1"
  tmp="$d/.cloak.$$.tmp"
  mkdir -p "$d" 2>/dev/null || return 1
  cp -f "$T" "$tmp" 2>/dev/null \
    && chmod 644 "$tmp" 2>/dev/null \
    && mv -f "$tmp" "$d/cloak.json" 2>/dev/null || rm -f "$tmp" 2>/dev/null
}

publish_mirror /data/local/tmp/causentry &
mirror_local=$!
publish_mirror /data/media/0/Android/media/com.causentry.app &
mirror_media=$!
wait "$mirror_local" 2>/dev/null || :
wait "$mirror_media" 2>/dev/null || :
[ "$T" = "$DIR/.cloak.tmp" ] && mv -f "$T" "$DIR/cloak.json.tmp" 2>/dev/null
echo "cloak.json: $(wc -c < "$OUT" 2>/dev/null) bytes -> $OUT (+2 mirrors)"
