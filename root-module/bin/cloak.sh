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
  if [ -f /data/system/packages.list ]; then
    u=$(grep -m1 "^$1 " /data/system/packages.list 2>/dev/null | cut -d' ' -f2)
    [ -n "$u" ] && { echo "$u"; return 0; }
  fi
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

template_json_array() {
  tpl="$1"
  cache_file="$DIR/.cloak-tpl.$$.$(echo "$tpl" | tr -c 'A-Za-z0-9_.-' '_')"
  if [ ! -f "$cache_file" ]; then
    pfirst=1
    printf '[' > "$cache_file"
    for p in $(target_hidden_list "$tpl" 2>/dev/null | sort -u); do
      valid_package_name "$p" || continue
      [ $pfirst -eq 1 ] || printf ',' >> "$cache_file"
      pfirst=0
      json_package "$p" >> "$cache_file"
    done
    printf ']' >> "$cache_file"
  fi
  cat "$cache_file" 2>/dev/null
}

# Directory ownership/context are established once at boot. Re-running four
# privileged metadata commands for every toggle costs noticeable time on MIUI.
[ -d "$OUT_DIR" ] || prepare_cloak_state_dir || exit 1

T="$(mktemp 2>/dev/null || echo "$DIR/.cloak.tmp")"
TARGET_FILE="$DIR/.cloak-targets.$$"
trap 'rm -f "$T" "$OUT_DIR/.cloak.$$" "$TARGET_FILE" "$DIR"/.cloak-template."$$".* "$DIR"/.cloak-tpl."$$".*' EXIT
[ -f /data/system/packages.list ] || PKG_UIDS=$(cmd package list packages -U --user 0 2>/dev/null)
TARGETS=$(jlist targets)
DENYLIST=$(jlist denylist)
CLOAK_PACKAGES=$(jlist cloakPackages)

# Keep package and UID in one record. The old two independent loops wrote an
# invalid policy when a configured target was not installed: the UID list became
# shorter than targets, so another app could receive its rules.
: > "$TARGET_FILE"
if [ -f /data/system/packages.list ] && command -v awk >/dev/null 2>&1; then
  awk '
  BEGIN {
    while ((getline line < "/data/system/packages.list") > 0) {
      split(line, f, " ");
      uids[f[1]] = f[2];
    }
  }
  { buf = buf $0 }
  END {
    s = buf;
    idx = index(s, "\"apps\"");
    if (idx == 0) exit;
    s = substr(s, idx);
    idx = index(s, "{");
    if (idx == 0) exit;
    s = substr(s, idx + 1);
    while (match(s, /"[a-zA-Z0-9_.]+"[[:space:]]*:[[:space:]]*\{/)) {
      pr = substr(s, RSTART, RLENGTH);
      sub(/^"/, "", pr); sub(/".*/, "", pr);
      pkg = pr;
      s = substr(s, RSTART + RLENGTH);
      brace = index(s, "}");
      if (brace == 0) break;
      body = substr(s, 1, brace - 1);
      s = substr(s, brace + 1);
      if (!(pkg in uids)) continue;
      dev = (body ~ /"devOff"[[:space:]]*:[[:space:]]*true/) ? 1 : 0;
      iso = (body ~ /"isolate"[[:space:]]*:[[:space:]]*true/) ? 1 : 0;
      acc = (body ~ /"accOff"[[:space:]]*:[[:space:]]*true/) ? 1 : dev;
      tpl = "@";
      if (match(body, /"hideTemplate"[[:space:]]*:[[:space:]]*"[^"]+"/)) {
        ts = substr(body, RSTART, RLENGTH);
        sub(/.*"hideTemplate"[[:space:]]*:[[:space:]]*"/, "", ts);
        sub(/".*/, "", ts);
        if (ts != "" && ts != "none") tpl = ts;
      }
      print pkg, uids[pkg], tpl, iso, dev, acc;
    }
  }
  ' "$CONF" > "$TARGET_FILE" 2>/dev/null
fi

if [ ! -s "$TARGET_FILE" ]; then
  for t in $TARGETS; do
    valid_package_name "$t" || continue
    u=$(uid_of "$t")
    [ -n "$u" ] || continue
    tpl=$(app_hide_template "$t")
    iso=$(app_feat "$t" isolate)
    dev=$(app_feat_or "$t" devOff autoDevOff)
    acc=$(app_feat "$t" accOff)
    [ -n "$tpl" ] || tpl=@
    [ -n "$iso" ] || iso=@
    [ -n "$acc" ] || acc="$dev"
    printf '%s %s %s %s %s %s\n' "$t" "$u" "$tpl" "$iso" "$dev" "$acc" >> "$TARGET_FILE"
  done
fi

# Pre-render standard template JSON arrays once
STEALTH_JSON="["
pfirst=1
for p in $(target_hidden_list stealth 2>/dev/null | sort -u); do
  valid_package_name "$p" || continue
  [ $pfirst -eq 1 ] || STEALTH_JSON="$STEALTH_JSON,"
  pfirst=0
  STEALTH_JSON="$STEALTH_JSON\"$p\""
done
STEALTH_JSON="$STEALTH_JSON]"

ALL_HIDDEN_JSON="["
pfirst=1
for p in $(hidden_list 2>/dev/null | sort -u); do
  valid_package_name "$p" || continue
  [ $pfirst -eq 1 ] || ALL_HIDDEN_JSON="$ALL_HIDDEN_JSON,"
  pfirst=0
  ALL_HIDDEN_JSON="$ALL_HIDDEN_JSON\"$p\""
done
ALL_HIDDEN_JSON="$ALL_HIDDEN_JSON]"

awk -v stealth_json="$STEALTH_JSON" -v all_hidden_json="$ALL_HIDDEN_JSON" '
BEGIN {
  targetUids = ""; targets = ""; appZygote = ""; devUids = ""; accUids = ""; hiddenByTarget = "";
  n = 0; n_iso = 0; n_dev = 0; n_acc = 0;
}
{
  pkg = $1; uid = $2; tpl = $3; iso = $4; dev = $5; acc = $6;
  if (n > 0) {
    targetUids = targetUids ",";
    targets = targets ",";
    hiddenByTarget = hiddenByTarget ",";
  }
  targetUids = targetUids uid;
  targets = targets "\"" pkg "\"";
  if (tpl == "stealth") {
    hiddenByTarget = hiddenByTarget "\"" pkg "\":" stealth_json;
  } else {
    hiddenByTarget = hiddenByTarget "\"" pkg "\":[]";
  }

  if (iso == 1) {
    if (n_iso > 0) appZygote = appZygote ",";
    appZygote = appZygote "\"" pkg "\"";
    n_iso++;
  }
  if (dev == 1) {
    if (n_dev > 0) devUids = devUids ",";
    devUids = devUids uid;
    n_dev++;
  }
  if (acc == 1) {
    if (n_acc > 0) accUids = accUids ",";
    accUids = accUids uid;
    n_acc++;
  }
  n++;
}
END {
  printf "{\"targetUids\":[%s],\"targets\":[%s],\"hidden\":%s,\"hiddenByTarget\":{%s},\"appZygote\":[%s],\"developerOptionsUids\":[%s],\"accessibilityUids\":[%s],\"storageRules\":{\"hiddenRootEntryNames\":[\"MT2\",\"TWRP\",\"twrp\",\"Fox\",\"OrangeFox\",\"su\",\"daemonsu\",\"Magisk\",\"magisk\",\".magisk\",\"SuperSU\",\"KernelSU\",\"APatch\",\"busybox\",\"TitaniumBackup\",\"SwiftBackup\",\"xinhao\"],\"hiddenRelativePaths\":[\"Download/KernelSU\",\"Download/KernelSU.apk\",\"Download/kernelsu.apk\",\"Download/Magisk\",\"Download/Magisk.apk\",\"Download/magisk.apk\",\"Download/Magisk.zip\",\"Download/APatch\",\"Download/APatch.apk\",\"TWRP/TWRP.app\"]}}\n",
    targetUids, targets, all_hidden_json, hiddenByTarget, appZygote, devUids, accUids;
}
' "$TARGET_FILE" > "$T"

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
am broadcast -a com.causentry.action.RELOAD_STORAGE_CLOAK >/dev/null 2>&1 || :
