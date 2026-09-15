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

# boolean field: jbool autoDevOff -> 1/0
jbool() {
  v=$(sed -nE "s/.*\"$1\"[[:space:]]*:[[:space:]]*(true|false).*/\1/p" "$CONF" 2>/dev/null | head -1)
  [ "$v" = "true" ] && echo 1 || echo 0
}

# string field: jstr hideMode -> hide
jstr() {
  sed -nE "s/.*\"$1\"[[:space:]]*:[[:space:]]*\"([^\"]*)\".*/\1/p" "$CONF" 2>/dev/null | head -1
}

# how to deal with detection packages: hide (default) | cloak | uninstall
hide_mode() {
  m=$(jstr hideMode)
  case "$m" in cloak|hide|uninstall) echo "$m";; *) echo hide;; esac
}

# "cloak" needs an installed system_server hook backend. The native Zygisk backend
# in this repo is still experimental, so production builds must fall back to pm hide
# unless a maintainer explicitly enables a verified backend in config.json.
cloak_backend_ready() { [ "$(jbool systemCloak)" = 1 ]; }

effective_hide_mode() {
  m=$(hide_mode)
  if [ "$m" = "cloak" ] && ! cloak_backend_ready; then
    echo hide
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
