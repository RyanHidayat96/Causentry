#!/system/bin/sh
# Causentry — shared helpers (sourced by other scripts)
DIR=/data/adb/causentry
CONF=$DIR/config.json
LOG=$DIR/causentry.log

log() { echo "$(date '+%m-%d %H:%M:%S') $*" >> "$LOG"; }

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
