#!/system/bin/sh
# Causentry — watch daemon.
#
# Watches ActivityManager events: as soon as a protected app's process starts, the
# developer-options / mock-location flags are reported as disabled (the app's splash
# check reads them within the first second), and they are restored when the app dies.
# This is what makes hardened apps (PairIP/RASP) work without injecting anything into
# their process, which is exactly what would crash them.
DIR=/data/adb/causentry
CONF=$DIR/config.json
. "$DIR/lib.sh"

STATE=$DIR/runtime.state
SAVED=$DIR/devsaved
ACTIVE=$DIR/runtime.active
EVAL_LOCK=$DIR/evaluate.lock
WATCHDOG_PID=

touch_heartbeat() { date +%s > "$DIR/heartbeat" 2>/dev/null; }

cleanup() {
  [ -n "$WATCHDOG_PID" ] && kill "$WATCHDOG_PID" 2>/dev/null
}
trap cleanup INT TERM EXIT

any_target_running() {
  # kept for reference; the live gate is target_in_foreground (see lib.sh)
  for t in $(jlist targets); do
    if pidof "$t" >/dev/null 2>&1; then return 0; fi
  done
  return 1
}

evaluate() {
  fg=$(foreground_pkg)
  if [ -n "$fg" ] && is_target "$fg"; then
    want_dev=$(app_feat_or "$fg" devOff autoDevOff)
    want_mock=$(app_feat_or "$fg" mock hideMockLocation)
    if [ "$want_dev" != 1 ] && [ "$want_mock" != 1 ]; then
      [ "$(cat "$STATE" 2>/dev/null)" = "active" ] && deactivate
      return 0
    fi
    desired="$fg:$want_dev:$want_mock"
    current=$(cat "$ACTIVE" 2>/dev/null)
    if [ "$(cat "$STATE" 2>/dev/null)" != "active" ] || [ "$current" != "$desired" ]; then
      [ "$(cat "$STATE" 2>/dev/null)" = "active" ] && deactivate
      activate "$fg" "$want_dev" "$want_mock"
    fi
  else
    [ "$(cat "$STATE" 2>/dev/null)" = "idle" ] || deactivate
  fi
}

locked_evaluate() {
  i=0
  while ! mkdir "$EVAL_LOCK" 2>/dev/null; do
    i=$((i+1))
    [ "$i" -ge 30 ] && { log "evaluate skipped: lock busy"; return 0; }
    sleep 0.1
  done
  evaluate
  rc=$?
  rmdir "$EVAL_LOCK" 2>/dev/null
  return "$rc"
}

activate() {
  fg="${1:-$(foreground_pkg)}"
  [ -n "$fg" ] || return 0
  want_dev="${2:-$(app_feat_or "$fg" devOff autoDevOff)}"
  want_mock="${3:-$(app_feat_or "$fg" mock hideMockLocation)}"
  [ "$want_dev" = 1 ] || [ "$want_mock" = 1 ] || return 0
  if [ ! -f "$SAVED" ]; then
    wait_settings 15 || { log "cloak skipped: settings service not ready (flags not readable)"; return 0; }
    if ! save_dev_flags "$SAVED"; then
      log "cloak skipped: could not read the current dev flags safely"
      return 0
    fi
    log "saved original flags ($(tr '\n' ' ' < "$SAVED"))"
  fi
  if [ "$want_dev" = 1 ]; then
    settings put global development_settings_enabled 0
    settings put secure development_settings_enabled 0
  fi
  [ "$want_mock" = 1 ] && settings put secure mock_location 0
  echo "$fg:$want_dev:$want_mock" > "$ACTIVE"
  echo active > "$STATE"
  log "cloak ON ($fg devOff=$want_dev mock=$want_mock)"
}

deactivate() {
  rm -f "$ACTIVE"
  [ "$(jbool alwaysHidden)" = 1 ] && { echo idle > "$STATE"; return 0; }
  if [ -f "$SAVED" ]; then
    restore_dev_flags "$SAVED" && log "cloak OFF (flags restored)"
    rm -f "$SAVED"
  elif [ -f "$DIR/devsaved.last" ]; then
    # state lost (e.g. an unclean shutdown) - put the last known good values back
    restore_dev_flags "$DIR/devsaved.last" && log "cloak OFF (restored from last known good flags)"
  fi
  echo idle > "$STATE"
}

echo "$$" > "$DIR/daemon.pid"
log "daemon start (pid $$)"

# initial sync with reality (foreground only)
locked_evaluate
ensure_ui
touch_heartbeat

# watchdog: keeps the state honest even if events were missed
(
  n=0
  apps_pid=
  refresh_apps_snapshot() {
    [ -f "$DIR/uirpc.sh" ] || return 0
    if [ -n "$apps_pid" ] && [ -d "/proc/$apps_pid" ]; then
      return 0
    fi
    (
      timeout 12 sh "$DIR/uirpc.sh" apps >/dev/null 2>&1
      rc=$?
      [ "$rc" -ne 0 ] && echo "$(date '+%m-%d %H:%M:%S') uirpc apps rc=$rc" >> "$DIR/.watchdog.log"
    ) &
    apps_pid=$!
  }
  while true; do
    sleep 1
    n=$((n+1))
    touch_heartbeat
    [ $((n % 30)) -eq 0 ] && ensure_ui
    # control-UI app: run its pending commands + refresh the state snapshot
    if [ -f "$DIR/uirpc.sh" ]; then
      timeout 8 sh "$DIR/uirpc.sh" serve >/dev/null 2>&1
      rc=$?
      [ "$rc" -ne 0 ] && echo "$(date '+%m-%d %H:%M:%S') uirpc serve rc=$rc" >> "$DIR/.watchdog.log"
      [ $((n % 30)) -eq 0 ] && refresh_apps_snapshot
    fi
    locked_evaluate
    if [ -f "$DIR/.uirpc.changed" ]; then
      rm -f "$DIR/.uirpc.changed"
      timeout 8 sh "$DIR/uirpc.sh" snapshot >/dev/null 2>&1
      refresh_apps_snapshot
    fi
    touch_heartbeat
  done
) &
WATCHDOG_PID=$!

# event driven (fast path). logcat can end on its own (buffer clear, restart) - the
# stream is re-opened forever, otherwise a single hiccup used to end the daemon.
while true; do
EV="am_proc""_start"
logcat -b events -s "$EV" -s am_proc_died 2>/dev/null | while read -r line; do
  case "$line" in
    *am_proc_start*)
      for t in $(jlist targets); do
        case "$line" in
          *",$t,"*|*",$t]"*)
            log "event: start $t"
            # the app checks its environment within the first second: poll briefly
            i=0
            while [ "$i" -lt 10 ]; do
              target_in_foreground && break
              sleep 0.3; i=$((i+1))
            done
            locked_evaluate
            ;;
        esac
      done
      ;;
    *am_proc_died*)
      for t in $(jlist targets); do
        case "$line" in
          *",$t,"*|*",$t]"*)
            log "event: died $t"
            sleep 1
            locked_evaluate
            ;;
        esac
      done
      ;;
  esac
done
sleep 2
done

log "daemon exited"
