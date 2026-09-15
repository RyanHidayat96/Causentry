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

any_target_running() {
  for t in $(jlist targets); do
    if pidof "$t" >/dev/null 2>&1; then return 0; fi
  done
  return 1
}

activate() {
  [ "$(jbool autoDevOff)" = 1 ] || return 0
  if [ ! -f "$SAVED" ]; then
    {
      echo "global=$(settings get global development_settings_enabled)"
      echo "secure=$(settings get secure development_settings_enabled)"
      echo "mock=$(settings get secure mock_location)"
    } > "$SAVED"
    log "saved original flags ($(tr '\n' ' ' < "$SAVED"))"
  fi
  settings put global development_settings_enabled 0
  settings put secure development_settings_enabled 0
  [ "$(jbool hideMockLocation)" = 1 ] && settings put secure mock_location 0
  echo active > "$STATE"
  log "cloak ON (protected app running)"
}

deactivate() {
  if [ "$(jbool alwaysHidden)" = 1 ]; then return 0; fi
  if [ -f "$SAVED" ]; then
    g=$(sed -n 's/^global=//p' "$SAVED")
    s=$(sed -n 's/^secure=//p' "$SAVED")
    m=$(sed -n 's/^mock=//p' "$SAVED")
    [ -n "$g" ] && [ "$g" != "null" ] && settings put global development_settings_enabled "$g"
    [ -n "$s" ] && [ "$s" != "null" ] && settings put secure development_settings_enabled "$s"
    [ -n "$m" ] && [ "$m" != "null" ] && settings put secure mock_location "$m"
    rm -f "$SAVED"
    log "cloak OFF (flags restored)"
  fi
  echo idle > "$STATE"
}

echo "$$" > "$DIR/daemon.pid"
log "daemon start (pid $$)"

# initial sync with reality
if any_target_running; then activate; else deactivate; fi

# watchdog: keeps the state honest even if events were missed
(
  while true; do
    sleep 5
    st=$(cat "$STATE" 2>/dev/null)
    if any_target_running; then
      [ "$st" = "active" ] || activate
    else
      [ "$st" = "idle" ] || deactivate
    fi
  done
) &

# event driven (fast path)
logcat -b events -s am_proc_start -s am_proc_died 2>/dev/null | while read -r line; do
  case "$line" in
    *am_proc_start*)
      for t in $(jlist targets); do
        case "$line" in
          *",$t,"*|*",$t]"*)
            log "event: start $t"
            activate
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
            any_target_running || deactivate
            ;;
        esac
      done
      ;;
  esac
done

log "daemon exited"
