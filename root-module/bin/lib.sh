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
  case "$1" in ""|[dD][eE][fF][aA][uU][lL][tT]) return 1;; esac
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

json_log_string() {
  printf '"'
  first=1
  tail -25 "$LOG" 2>/dev/null | while IFS= read -r line || [ -n "$line" ]; do
    [ "$first" = 1 ] || printf '\\n'
    first=0
    json_escape "$line"
  done
  printf '"'
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

extract_app_entries() {   # extract_app_entries [config-file]
  src="${1:-$CONF}"
  grep -oE '"[A-Za-z0-9_]+(\.[A-Za-z0-9_]+)+"[[:space:]]*:[[:space:]]*\{[^{}]*"devOff"[^{}]*\}' "$src" 2>/dev/null
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
  fi
}

emit_hide_templates_json() {  # emit_hide_templates_json [replace-name] [replace-csv] [remove-name]
  replace="$1"
  replace_csv="$2"
  remove="$3"
  valid_template_name "$replace" || replace=""
  valid_template_name "$remove" || remove=""
  tmp="$DIR/.hidetemplates.$$"
  hide_template_pairs > "$tmp" 2>/dev/null || : > "$tmp"
  printf '{'
  f=1
  while IFS= read -r pair; do
    [ -n "$pair" ] || continue
    name=$(printf '%s' "$pair" | sed -nE 's/^"([^"]+)":.*/\1/p')
    valid_template_name "$name" || continue
    [ -n "$remove" ] && [ "$name" = "$remove" ] && continue
    [ -n "$replace" ] && [ "$name" = "$replace" ] && continue
    [ $f -eq 1 ] || printf ','
    f=0
    printf '%s' "$pair"
  done < "$tmp"
  if [ -n "$replace" ]; then
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

prepare_cloak_state_dir() {
  local state_dir="${1:-/data/system/causentry}"
  mkdir -p "$state_dir" || return 1
  chown 1000:1000 "$state_dir" || return 1
  chmod 755 "$state_dir" || return 1
  chcon u:object_r:system_data_file:s0 "$state_dir"
}

zygisk_backend_installed() {
  for p in /data/adb/modules/causentry/zygisk/arm64-v8a.so \
           /data/adb/modules/causentry/zygisk/armeabi-v7a.so \
           /data/adb/modules_update/causentry/zygisk/arm64-v8a.so \
           /data/adb/modules_update/causentry/zygisk/armeabi-v7a.so; do
    [ -f "$p" ] && return 0
  done
  return 1
}

zygisk_pid_marker_alive() {
  zygisk_pid_marker_alive_for "$1" system_server
}

zygisk_pid_marker_alive_for() {
  f="$1"
  expected_process="$2"
  [ -s "$f" ] || return 1
  # The ready marker includes the hook count after the PID.
  read -r pid marker_details < "$f"
  case "$pid" in ""|*[!0-9]*) return 1;; esac
  [ -d "/proc/$pid" ] || return 1
  tr '\0' ' ' < "/proc/$pid/cmdline" 2>/dev/null | grep -Fq "$expected_process"
}

zygisk_backend_loaded() {
  zygisk_pid_marker_alive /data/system/causentry/zygisk.loaded
}

zygisk_loader_active() {
  grep -q '^causentry ' /data/adb/zygisksu/modules_info 2>/dev/null \
    || grep -q '^causentry ' /data/adb/ksu/log/modules_info 2>/dev/null
}

zygisk_cloak_ready() {
  zygisk_pid_marker_alive /data/system/causentry/zygisk.cloak.ready
}

zygisk_settings_provider_ready() {
  zygisk_pid_marker_alive_for /data/system/causentry/zygisk.settings.ready \
    com.android.providers.settings
}

zygisk_backend_status() {
  if zygisk_backend_loaded; then
    echo system-server-active
  elif zygisk_loader_active; then
    echo zygisk-loader-active
  elif zygisk_backend_installed; then
    echo installed-reboot-needed
  else
    echo absent
  fi
}

  # "cloak" needs a live system_server hook backend. Stage-1 Zygisk only proves
  # loading; the ART hook layer must write zygisk.cloak.ready before cloak is usable.
cloak_backend_ready() {
  zygisk_cloak_ready
}

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
#   zygisk     -> system_server cloak backend     : Zygisk-only, no Vector/LSPosed
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

# Rebuild only target-scoped package policy. Configuring an app or changing one
# template must not re-run boot props, SUSFS, or control-APK installation.
refresh_cloak_policy() {
  policy_rc=0
  if [ -x "$DIR/cloak.sh" ]; then
    sh "$DIR/cloak.sh" || policy_rc=1
  fi
  if cloak_backend_ready; then
    log "cloak policy refreshed (backend ready)"
  else
    log "cloak policy refreshed; hook inactive"
  fi
  return "$policy_rc"
}

# A per-app toggle also restarts only that target, so its first process observes
# the new policy. Template edits deliberately use refresh_cloak_policy() alone.
per_app_refresh() {
  pkg="$1"
  mode="${2:-app}"
  log "per-app refresh: mode=$mode pkg=${pkg:-?}"
  refresh_cloak_policy
  policy_rc=$?
  if valid_package_name "$pkg"; then
    am force-stop "$pkg" >/dev/null 2>&1 && log "force-stopped target after config change: $pkg"
  fi
  return "$policy_rc"
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
  valid_template_name "$v" && printf '%s\n' "$v"
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
valid_saved_flag() { [ -n "$1" ]; }

read_dev_flags() {   # emits values only when every settings query completed
  g=$(settings get global development_settings_enabled 2>/dev/null)
  s=$(settings get secure development_settings_enabled 2>/dev/null)
  m=$(settings get secure mock_location 2>/dev/null)
  ag=$(settings get global adb_enabled 2>/dev/null)
  as=$(settings get secure adb_enabled 2>/dev/null)
  aw=$(settings get global adb_wifi_enabled 2>/dev/null)
  valid_flag "$g" || return 1
  valid_flag "$s" || return 1
  valid_saved_flag "$m" || return 1
  valid_saved_flag "$ag" || return 1
  valid_saved_flag "$as" || return 1
  valid_saved_flag "$aw" || return 1
  printf 'global=%s\nsecure=%s\nmock=%s\nadb_global=%s\nadb_secure=%s\nadb_wifi=%s\n' \
    "$g" "$s" "$m" "$ag" "$as" "$aw"
}

save_dev_flags() {   # save_dev_flags <file> [restore-dev=1] -> 0/1
  out=$(read_dev_flags) || return 1
  printf '%s\nrestore_dev=%s\n' "$out" "${2:-1}" > "$1"
  cp -f "$1" "$DIR/devsaved.last" 2>/dev/null    # survives state cleanups
  return 0
}

restore_nullable_setting() {   # namespace key value; null means the key was absent
  [ "$3" = null ] && { settings delete "$1" "$2"; return $?; }
  settings put "$1" "$2" "$3"
}

restore_dev_flags() {   # restore_dev_flags <file> -> 0/1
  [ -f "$1" ] || return 1
  g=$(sed -n 's/^global=//p' "$1"); s=$(sed -n 's/^secure=//p' "$1"); m=$(sed -n 's/^mock=//p' "$1")
  valid_flag "$g" || return 1
  valid_flag "$s" || return 1
  restore_dev=$(sed -n 's/^restore_dev=//p' "$1" | head -1)
  # Older state files predate provider-side cloaking and must still restore dev mode.
  [ "$restore_dev" = 0 ] || {
    settings put global development_settings_enabled "$g"
    settings put secure development_settings_enabled "$s"
  }
  valid_saved_flag "$m" && restore_nullable_setting secure mock_location "$m"
  ag=$(sed -n 's/^adb_global=//p' "$1" | head -1)
  as=$(sed -n 's/^adb_secure=//p' "$1" | head -1)
  aw=$(sed -n 's/^adb_wifi=//p' "$1" | head -1)
  # Older state files do not have ADB values. Restore it last: putting the
  # original global flag back may reconnect the USB transport immediately.
  valid_saved_flag "$aw" && restore_nullable_setting global adb_wifi_enabled "$aw"
  valid_saved_flag "$as" && restore_nullable_setting secure adb_enabled "$as"
  valid_saved_flag "$ag" && restore_nullable_setting global adb_enabled "$ag"
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

# A per-app save happens while the control UI is foreground. Do not leave the
# previous target's global flags cloaked until the five-second watchdog wakes.
deactivate_runtime() {
  active="$DIR/runtime.active"
  saved="$DIR/devsaved"
  state="$DIR/runtime.state"
  rm -f "$active"
  [ "$(jbool alwaysHidden)" = 1 ] && { echo idle > "$state"; return 0; }
  if [ -f "$saved" ]; then
    if restore_dev_flags "$saved"; then
      log "cloak OFF (flags restored)"
      rm -f "$saved"
    else
      log "cloak OFF failed: saved flags retained for retry"
      return 1
    fi
  elif [ -f "$DIR/devsaved.last" ]; then
    if restore_dev_flags "$DIR/devsaved.last"; then
      log "cloak OFF (restored from last known good flags)"
    else
      log "cloak OFF failed: could not restore last known good flags"
      return 1
    fi
  fi
  echo idle > "$state"
  return 0
}

reconcile_runtime_after_config_change() {
  [ "$(cat "$DIR/runtime.state" 2>/dev/null)" = active ] || return 0
  lock="$DIR/evaluate.lock"
  i=0
  while ! mkdir "$lock" 2>/dev/null; do
    i=$((i + 1))
    [ "$i" -lt 30 ] || { log "runtime reconcile deferred: evaluation busy"; return 1; }
    sleep 0.1
  done
  fg=$(foreground_pkg)
  if [ -n "$fg" ] && is_target "$fg"; then
    rc=0
  else
    deactivate_runtime
    rc=$?
  fi
  rmdir "$lock" 2>/dev/null
  return "$rc"
}
