#!/system/bin/sh
# Causentry — shared helpers (sourced by other scripts)
DIR=${CAUSENTRY_DIR:-/data/adb/causentry}
CONF=$DIR/config.json
LOG=$DIR/causentry.log

log() { echo "$(date '+%m-%d %H:%M:%S') $*" >> "$LOG"; }

valid_package_name() {
  case "$1" in ""|.*|*..*|*.) return 1;; esac
  case "$1" in *[!A-Za-z0-9._]*) return 1;; esac
  case "$1" in *.*) return 0;; esac
  return 1
}

valid_template_name() {
  case "$1" in "") return 1;; esac
  case "$1" in *[!A-Za-z0-9_.-]*) return 1;; esac
  return 0
}

package_manager_ready() {
  pm path android >/dev/null 2>&1 || cmd package path android >/dev/null 2>&1
}

package_installed() {
  valid_package_name "$1" || return 1
  pm path "$1" >/dev/null 2>&1 || cmd package path "$1" >/dev/null 2>&1
}

json_escape() {
  printf '%s' "$1" | tr '\r\n' '  ' | sed 's/\\/\\\\/g; s/"/\\"/g'
}

json_string() {
  printf '"%s"' "$(json_escape "$1")"
}

bool_json() {
  case "$1" in 1|true|TRUE|yes|on) printf true;; *) printf false;; esac
}

ere_escape() {
  printf '%s' "$1" | sed 's/[][\\.^$*+?{}()|]/\\&/g'
}

# list items of a JSON string array: jlist targets
jlist() {
  sed -nE "s/.*\"$1\"[[:space:]]*:[[:space:]]*\[([^]]*)\].*/\1/p" "$CONF" 2>/dev/null \
    | head -1 | tr ',' '\n' | sed 's/[", ]//g' | grep -v '^$'
}

csv_package_json_array() {
  printf '['
  f=1
  for i in $(printf '%s' "$1" | tr ',' ' '); do
    valid_package_name "$i" || continue
    [ $f -eq 1 ] || printf ','
    f=0
    json_string "$i"
  done
  printf ']'
}

list_package_json_array() {
  printf '['
  f=1
  for i in $1; do
    valid_package_name "$i" || continue
    [ $f -eq 1 ] || printf ','
    f=0
    json_string "$i"
  done
  printf ']'
}

hide_template_pairs() {
  sed -nE 's/.*"hideTemplates"[[:space:]]*:[[:space:]]*\{([^}]*)\}.*/\1/p' "$CONF" 2>/dev/null \
    | head -1 | grep -oE '"[A-Za-z0-9_.-]+"[[:space:]]*:[[:space:]]*\[[^]]*\]' 2>/dev/null
}

hide_template_list() {
  name="$1"
  valid_template_name "$name" || return 0
  esc=$(ere_escape "$name")
  out=$(sed -nE "s/.*\"hideTemplates\"[[:space:]]*:[[:space:]]*\{.*\"$esc\"[[:space:]]*:[[:space:]]*\[([^]]*)\].*/\1/p" "$CONF" 2>/dev/null \
    | head -1 | tr ',' '\n' | sed 's/[", ]//g' | grep -v '^$')
  if [ -n "$out" ]; then
    printf '%s\n' "$out"
  elif [ "$name" = "default" ]; then
    jlist denylist
  fi
}

emit_hide_templates_json() {  # emit_hide_templates_json [replace-name] [replace-csv]
  replace="$1"
  replace_csv="$2"
  valid_template_name "$replace" || replace=""
  tmp="$DIR/.hidetemplates.$$"
  hide_template_pairs > "$tmp" 2>/dev/null || : > "$tmp"
  printf '{'
  f=1
  if [ "$replace" = "default" ]; then
    json_string default; printf ':'; csv_package_json_array "$replace_csv"; f=0
  elif ! grep -q '^"default":' "$tmp" 2>/dev/null; then
    json_string default; printf ':'; list_package_json_array "$(jlist denylist | tr '\n' ' ')"; f=0
  fi
  while IFS= read -r pair; do
    [ -n "$pair" ] || continue
    name=$(printf '%s' "$pair" | sed -nE 's/^"([^"]+)":.*/\1/p')
    valid_template_name "$name" || continue
    [ -n "$replace" ] && [ "$name" = "$replace" ] && continue
    [ $f -eq 1 ] || printf ','
    f=0
    printf '%s' "$pair"
  done < "$tmp"
  if [ -n "$replace" ] && [ "$replace" != "default" ]; then
    [ $f -eq 1 ] || printf ','
    f=0
    json_string "$replace"; printf ':'; csv_package_json_array "$replace_csv"
  fi
  printf '}'
  rm -f "$tmp"
}

# boolean field: jbool autoDevOff -> 1/0
jbool() {
  v=$(sed -nE "s/.*\"$1\"[[:space:]]*:[[:space:]]*(true|false).*/\1/p" "$CONF" 2>/dev/null | head -1)
  [ "$v" = "true" ] && echo 1 || echo 0
}

# string field: jstr hideMode -> hide
jstr() {
  sed -nE "s/.*\"$1\"[[:space:]]*:[[:space:]]*\"([^\"]*)\".*/\1/p" "$CONF" 2>/dev/null | head -1
}

# how to deal with detection packages: none (default) | hide | cloak | uninstall
hide_mode() {
  m=$(jstr hideMode)
  case "$m" in none|cloak|hide|uninstall) echo "$m";; *) echo none;; esac
}

# "cloak" needs an installed system_server hook backend. The native Zygisk backend
# in this repo is still experimental, so production builds must not fall back to
# destructive pm hide unless a maintainer explicitly enables a verified backend.
cloak_backend_ready() { [ "$(jbool systemCloak)" = 1 ]; }

effective_hide_mode() {
  m=$(hide_mode)
  if [ "$m" = "cloak" ] && ! cloak_backend_ready; then
    echo none
  else
    echo "$m"
  fi
}

is_target() {
  for t in $(jlist targets); do [ "$t" = "$1" ] && return 0; done
  return 1
}

is_hardened() {
  for t in $(jlist hardened); do [ "$t" = "$1" ] && return 0; done
  return 1
}

# detect PairIP / anti-injection protection inside an app's APK
detect_hardened_pkg() {
  pkg="$1"
  path=$(pm path "$pkg" 2>/dev/null | head -1 | sed 's/package://')
  [ -n "$path" ] || return 1
  # base.apk is world readable; look for the PairIP wrapper / native lib
  if unzip -l "$path" 2>/dev/null | grep -qE 'libpairipcore|pairip'; then
    return 0
  fi
  if grep -qa 'com\.pairip\.application' "$path" 2>/dev/null; then
    return 0
  fi
  return 1
}

# ---------------------------------------------------------------------------
# Optional tool discovery. Causentry is self-contained: every tool below only
# *upgrades* one feature, and its absence degrades gracefully.
#   busybox    -> control web UI (httpd)          : CLI + daemon keep working
#   resetprop  -> boot property spoofing          : other cloaks keep working
#   ksu_susfs  -> kernel-level path hiding        : userspace cloaks keep working
#   vector cli -> optional in-process hooks       : off by default anyway
# ---------------------------------------------------------------------------
find_busybox() {
  for p in /data/adb/ksu/bin/busybox /data/adb/magisk/busybox /data/adb/ap/bin/busybox \
           /system/xbin/busybox /system/bin/busybox \
           /data/data/com.termux/files/usr/bin/busybox; do
    [ -x "$p" ] && { echo "$p"; return 0; }
  done
  command -v busybox 2>/dev/null && return 0
  return 1
}

ensure_ui() {
  [ -d "$DIR/webroot" ] || return 1
  BUSYBOX=$(find_busybox 2>/dev/null) || return 1
  if pgrep -f "httpd -p 127.0.0.1:8899" >/dev/null 2>&1; then
    return 0
  fi
  setsid "$BUSYBOX" httpd -p 127.0.0.1:8899 -h "$DIR/webroot" >/dev/null 2>&1 < /dev/null &
  return 0
}

find_resetprop() {
  for p in /data/adb/ksu/bin/resetprop /data/adb/magisk/resetprop /data/adb/ap/bin/resetprop; do
    [ -x "$p" ] && { echo "$p"; return 0; }
  done
  command -v resetprop 2>/dev/null && return 0
  return 1
}

find_susfs() {
  for p in /data/adb/ksu/bin/ksu_susfs /data/adb/ksu/bin/susfs /data/adb/magisk/ksu_susfs; do
    [ -x "$p" ] && { echo "$p"; return 0; }
  done
  command -v ksu_susfs 2>/dev/null && return 0
  return 1
}

susfs_variant() {
  p=$(find_susfs) || { echo unsupported; return 0; }
  v=$("$p" show variant 2>/dev/null)
  [ -n "$v" ] && echo "$v" || echo unsupported
}

vector_cli() {
  for p in /data/adb/modules/zygisk_vector/cli /data/adb/modules/zygisk-vector/cli \
           /data/adb/modules/lsposed/cli; do
    [ -x "$p" ] && { echo "$p"; return 0; }
  done
  return 1
}

has() { command -v "$1" >/dev/null 2>&1; }

# Root-app discovery is useful UI context, but it is relatively expensive and must
# not sit on the hot status/apply path. Keep a short cache; explicit root actions
# invalidate it below.
root_cache_valid() {
  now=$(date +%s)
  ts=$(cat "$DIR/.rootapps.cache.ts" 2>/dev/null)
  case "$ts" in ""|*[!0-9]*) ts=0;; esac
  age=$((now - ts))
  [ "$age" -ge 0 ] 2>/dev/null || return 1
  [ "$age" -lt "${CAUSENTRY_ROOT_CACHE_TTL:-120}" ] \
    && [ -f "$DIR/.rootapps.cache" ] \
    && [ -f "$DIR/.rootsuggest.cache" ]
}

root_cache_refresh() {
  root_cache_valid && return 0
  [ -x "$DIR/root-apps.sh" ] || {
    : > "$DIR/.rootapps.cache"
    : > "$DIR/.rootsuggest.cache"
    date +%s > "$DIR/.rootapps.cache.ts"
    return 0
  }
  sh "$DIR/root-apps.sh" scan > "$DIR/.rootapps.cache.new" 2>/dev/null || : > "$DIR/.rootapps.cache.new"
  sh "$DIR/root-apps.sh" suggest > "$DIR/.rootsuggest.cache.new" 2>/dev/null || : > "$DIR/.rootsuggest.cache.new"
  mv -f "$DIR/.rootapps.cache.new" "$DIR/.rootapps.cache" 2>/dev/null
  mv -f "$DIR/.rootsuggest.cache.new" "$DIR/.rootsuggest.cache" 2>/dev/null
  date +%s > "$DIR/.rootapps.cache.ts"
}

root_apps_cached() {
  root_cache_refresh
  cat "$DIR/.rootapps.cache" 2>/dev/null
}

root_suggest_cached() {
  root_cache_refresh
  cat "$DIR/.rootsuggest.cache" 2>/dev/null
}

root_cache_invalidate() {
  rm -f "$DIR/.rootapps.cache" "$DIR/.rootsuggest.cache" "$DIR/.rootapps.cache.ts"
}

# A per-app toggle only changes config targets/features. Re-running the full apply
# path here makes the UI feel stuck because it also re-hides every detection
# package and reapplies boot/global settings. Keep this hot path narrow, but still
# refresh cloak metadata and restart the target process so the next launch observes
# the new policy from its first checks.
per_app_refresh() {
  pkg="$1"
  mode="${2:-app}"
  log "per-app refresh: mode=$mode pkg=${pkg:-?}"
  if [ "$(jbool hooks)" = 1 ]; then
    sh "$DIR/apply.sh" "$mode"
  elif cloak_backend_ready; then
    [ -x "$DIR/cloak.sh" ] && sh "$DIR/cloak.sh"
  else
    log "per-app refresh: cloak metadata skipped (backend disabled)"
  fi
  if valid_package_name "$pkg"; then
    am force-stop "$pkg" >/dev/null 2>&1 && log "force-stopped target after config change: $pkg"
  fi
}

# the settings service is not up yet at the very first boot stage
settings_ready() { [ -n "$(settings get global development_settings_enabled 2>/dev/null)" ]; }
wait_settings() {
  i=0
  while [ "$i" -lt "${1:-20}" ]; do
    settings_ready && return 0
    sleep 1; i=$((i+1))
  done
  return 1
}

# ---------------------------------------------------------------------------
# Per-app feature sets: config "apps": {"com.x":{"devOff":true,"mock":true}}
# Falls back to the global toggles when an app has no explicit entry.
# ---------------------------------------------------------------------------
app_block() {   # raw {...} block for a package, empty when absent
  key=$(ere_escape "$1")
  sed -nE "s/.*\"$key\"[[:space:]]*:[[:space:]]*\{([^}]*)\}.*/\1/p" "$CONF" 2>/dev/null | head -1
}

app_feat() {    # app_feat <pkg> <key> -> 1/0/'' ('' = not configured per app)
  blk=$(app_block "$1")
  [ -n "$blk" ] || { echo ""; return 0; }
  case "$blk" in
    *"\"$2\":true"*)  echo 1 ;;
    *"\"$2\":false"*) echo 0 ;;
    *) echo "" ;;
  esac
}

app_str() {     # app_str <pkg> <key> -> raw string value or ''
  blk=$(app_block "$1")
  [ -n "$blk" ] || { echo ""; return 0; }
  printf '%s' "$blk" | sed -nE "s/.*\"$2\"[[:space:]]*:[[:space:]]*\"([^\"]*)\".*/\1/p" | head -1
}

app_hide_template() {
  v=$(app_str "$1" hideTemplate)
  valid_template_name "$v" && { echo "$v"; return 0; }
  echo default
}

app_feat_or() { # app_feat_or <pkg> <key> <global-key>
  v=$(app_feat "$1" "$2")
  [ -n "$v" ] && { echo "$v"; return 0; }
  jbool "$3"
}

# does any running protected app want this feature?
feat_running() {  # feat_running <per-app key> <global key>
  for t in $(jlist targets); do
    pidof "$t" >/dev/null 2>&1 || continue
    [ "$(app_feat_or "$t" "$1" "$2")" = 1 ] && return 0
  done
  return 1
}

# ---- developer-option flags: read, validate, remember the last good values ----
# A cloak must never be turned on with unreadable flags: that leaves the device
# with dev-options hidden forever (nothing to restore at the end).
valid_flag() { [ -n "$1" ] && [ "$1" != "null" ]; }

read_dev_flags() {   # emits global=/secure=/mock= only when every read worked
  g=$(settings get global development_settings_enabled 2>/dev/null)
  s=$(settings get secure development_settings_enabled 2>/dev/null)
  m=$(settings get secure mock_location 2>/dev/null)
  valid_flag "$g" || return 1
  valid_flag "$s" || return 1
  printf 'global=%s\nsecure=%s\nmock=%s\n' "$g" "$s" "${m:-0}"
}

save_dev_flags() {   # save_dev_flags <file> -> 0/1
  out=$(read_dev_flags) || return 1
  printf '%s' "$out" > "$1"
  cp -f "$1" "$DIR/devsaved.last" 2>/dev/null    # survives state cleanups
  return 0
}

restore_dev_flags() {   # restore_dev_flags <file> -> 0/1
  [ -f "$1" ] || return 1
  g=$(sed -n 's/^global=//p' "$1"); s=$(sed -n 's/^secure=//p' "$1"); m=$(sed -n 's/^mock=//p' "$1")
  valid_flag "$g" || return 1
  valid_flag "$s" || return 1
  settings put global development_settings_enabled "$g"
  settings put secure development_settings_enabled "$s"
  valid_flag "$m" && settings put secure mock_location "$m"
  return 0
}

# ---- foreground app detection -------------------------------------------------
# The cloak must follow the app the user is actually looking at: a protected app
# that keeps a background process alive must not keep dev-options hidden forever.
foreground_pkg() {
  dumpsys activity activities 2>/dev/null \
    | sed -nE 's/.*(ResumedActivity|topResumedActivity).*u[0-9]+ ([a-zA-Z0-9._]+)\/.*/\2/p' \
    | head -1
}
target_in_foreground() {
  fg=$(foreground_pkg)
  [ -n "$fg" ] || return 1
  for t in $(jlist targets); do
    [ "$t" = "$fg" ] && return 0
  done
  return 1
}
