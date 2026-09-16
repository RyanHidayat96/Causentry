#!/system/bin/sh
DIR=${CAUSENTRY_DIR:-/data/adb/causentry}
. "$DIR/lib.sh"
# Causentry - file based RPC for the control-UI app.
#
# The app is a plain Android app: it cannot read /data/adb and must not need root.
# So the root daemon keeps a small snapshot inside the app's private files dir and
# executes the commands the app drops there. No httpd, no su prompt.
#
#   app  -> files/cmd/*.json          (commands)
#   app  <- files/status.json         (state, targets, toggles, root apps, log tail)
#   app  <- files/apps.json           (installed apps, refreshed on demand/30s)

APP_PKG=com.causentry.app
APP_DIR=/data/data/$APP_PKG/files
CMD_DIR=$APP_DIR/cmd
NL='
'
CHANGE_MARK=$DIR/.uirpc.changed

app_uid() { stat -c %u "/data/data/$APP_PKG" 2>/dev/null; }

# the app must be able to write into files/cmd itself: keep it app-owned
ensure_app_dirs() {
  [ -d "/data/data/$APP_PKG" ] || return 0
  uid=$(app_uid)
  [ -n "$uid" ] || return 0
  for d in "$APP_DIR" "$CMD_DIR"; do
    [ -d "$d" ] || mkdir -p "$d" 2>/dev/null
    chown "$uid:$uid" "$d" 2>/dev/null
    chmod 771 "$d" 2>/dev/null
  done
}

put() {  # put <tmpfile> <dest>
  uid=$(app_uid)
  mkdir -p "$APP_DIR" 2>/dev/null
  cp -f "$1" "$2" 2>/dev/null || return 1
  chmod 600 "$2" 2>/dev/null
  [ -n "$uid" ] && chown "$uid:$uid" "$2" 2>/dev/null
  return 0
}

json_jlist() {
  key="$1"
  printf '['
  f=1
  for t in $(jlist "$key"); do
    valid_package_name "$t" || continue
    [ $f -eq 1 ] || printf ','
    f=0
    json_string "$t"
  done
  printf ']'
}

list_has_line() {
  case "$1" in
    *"$NL$2$NL"*) return 0 ;;
  esac
  return 1
}

mark_changed() { date +%s > "$CHANGE_MARK" 2>/dev/null; }

schedule_apply() {
  mode="${1:-app}"
  op="$2"
  case "$op" in *[!A-Za-z0-9_.:-]*|"") op="";; esac
  if [ -x "$DIR/apply-async.sh" ]; then
    sh "$DIR/apply-async.sh" "$mode" "$op" >/dev/null 2>&1
  else
    sh "$DIR/apply.sh" "$mode" >> "$LOG" 2>&1
    rc=$?
    date +%s > "$DIR/.apply.done" 2>/dev/null
    printf '%s' "$rc" > "$DIR/.apply.rc" 2>/dev/null
    [ -n "$op" ] && printf '%s' "$op" > "$DIR/.apply.done.token" 2>/dev/null
  fi
}

schedule_apps_snapshot() {
  pid=$(cat "$DIR/.apps-snapshot.pid" 2>/dev/null)
  if [ -n "$pid" ] && [ -d "/proc/$pid" ]; then
    return 0
  fi
  if command -v setsid >/dev/null 2>&1; then
    setsid /system/bin/sh "$DIR/uirpc.sh" apps >/dev/null 2>&1 < /dev/null &
  else
    /system/bin/sh "$DIR/uirpc.sh" apps >/dev/null 2>&1 < /dev/null &
  fi
  echo "$!" > "$DIR/.apps-snapshot.pid" 2>/dev/null
}

snapshot() {
  [ -d "/data/data/$APP_PKG" ] || return 0
  ensure_app_dirs
  T=$(mktemp 2>/dev/null || echo "$DIR/.status.tmp")
  state=$(cat "$DIR/runtime.state" 2>/dev/null); [ -z "$state" ] && state=unknown
  dpid=$(cat "$DIR/daemon.pid" 2>/dev/null); dalive=false
  [ -n "$dpid" ] && [ -d "/proc/$dpid" ] && dalive=true
  # heartbeat age: the watchdog stamps it every 5s, so a stale stamp means the
  # bypass is not running even if a pid file still exists
  hb=$(cat "$DIR/heartbeat" 2>/dev/null); [ -n "$hb" ] || hb=0
  dage=$(( $(date +%s) - hb ))
  [ "$dage" -ge 0 ] 2>/dev/null || dage=999999
  if [ "$dage" -gt 20 ]; then dalive=false; fi
  apply_busy=false
  if [ -d "$DIR/apply.lock" ] || [ -f "$DIR/.apply.pending" ]; then apply_busy=true; fi
  apply_done=$(cat "$DIR/.apply.done" 2>/dev/null); case "$apply_done" in ""|*[!0-9]*) apply_done=0;; esac
  apply_rc=$(cat "$DIR/.apply.rc" 2>/dev/null); case "$apply_rc" in ""|*[!0-9]*) apply_rc=0;; esac
  apply_token=$(cat "$DIR/.apply.done.token" 2>/dev/null)
  rootapps=$(root_apps_cached | tr '\n' ',')
  suggests=$(root_suggest_cached | tr '\n' ',')
  {
    printf '{"state":'; json_string "$state"
    printf ',"daemon":%s,"ts":%s,"age":%s' "$dalive" "$(date +%s)" "$dage"
    printf ',"global":'; json_string "$(settings get global development_settings_enabled 2>/dev/null)"
    printf ',"secure":'; json_string "$(settings get secure development_settings_enabled 2>/dev/null)"
    printf ',"mock":'; json_string "$(settings get secure mock_location 2>/dev/null)"
    printf ',"susfs":'; json_string "$(susfs_variant)"
    printf ',"zygisk":'; json_string "$(zygisk_backend_status)"
    printf ',"cloakReady":'; bool_json "$(cloak_backend_ready && echo 1 || echo 0)"; printf ','
    printf '"targets":'; json_jlist targets; printf ','
    printf '"hardened":'; json_jlist hardened; printf ','
    printf '"denylist":'; json_jlist denylist; printf ','
    printf '"autoDevOff":%s,"hideMockLocation":%s,"alwaysHidden":%s,"susfsOn":%s,"hideRootApps":%s,"uiApk":%s,' \
      "$( [ "$(jbool autoDevOff)" = 1 ] && echo true || echo false )" \
      "$( [ "$(jbool hideMockLocation)" = 1 ] && echo true || echo false )" \
      "$( [ "$(jbool alwaysHidden)" = 1 ] && echo true || echo false )" \
      "$( [ "$(jbool susfs)" = 1 ] && echo true || echo false )" \
      "$( [ "$(jbool hideRootApps)" = 1 ] && echo true || echo false )" \
      "$( [ "$(jbool uiApk)" = 1 ] && echo true || echo false )"
    printf '"rootApps":'; json_string "$rootapps"; printf ',"rootSuggest":'; json_string "$suggests"; printf ','
    printf '"applyBusy":%s,"applyDone":%s,"applyRc":%s,"applyToken":' "$apply_busy" "$apply_done" "$apply_rc"; json_string "$apply_token"; printf ','
    printf '"config":%s,' "$(tr -d '\n' < "$CONF" 2>/dev/null || echo '{}')"
    printf '"log":'; json_string "$(tail -25 "$DIR/causentry.log" 2>/dev/null)"; printf '}'
  } > "$T"
  put "$T" "$APP_DIR/status.json"
  [ "$T" = "$DIR/.status.tmp" ] && mv -f "$T" "$DIR/status.json.tmp" 2>/dev/null || rm -f "$T" 2>/dev/null
  return 0
}

apps_snapshot() {
  [ -d "/data/data/$APP_PKG" ] || return 0
  ensure_app_dirs
  T=$(mktemp 2>/dev/null || echo "$DIR/.apps.tmp")
  targets_cache="${NL}$(jlist targets)${NL}"
  hardened_cache="${NL}$(jlist hardened)${NL}"
  hidden_cache="${NL}$(jlist denylist)${NL}"
  {
    printf '{"apps":['
    f=1
    for pkg in $(pm list packages -3 2>/dev/null | sed 's/package://' | sort); do
      valid_package_name "$pkg" || continue
      prot=false; list_has_line "$targets_cache" "$pkg" && prot=true
      hard=false; list_has_line "$hardened_cache" "$pkg" && hard=true
      hidden=false; list_has_line "$hidden_cache" "$pkg" && hidden=true
      [ $f -eq 1 ] || printf ','
      f=0
      printf '{"pkg":'; json_string "$pkg"; printf ',"protected":%s,"hardened":%s,"hidden":%s}' "$prot" "$hard" "$hidden"
    done
    printf ']}'
  } > "$T"
  put "$T" "$APP_DIR/apps.json"
  [ "$T" = "$DIR/.apps.tmp" ] && mv -f "$T" "$DIR/apps.json.tmp" 2>/dev/null || rm -f "$T" 2>/dev/null
  return 0
}

process_cmds() {
  [ -d "$CMD_DIR" ] || return 0
  for f in "$CMD_DIR"/*.json; do
    [ -f "$f" ] || continue
    line=$(cat "$f" 2>/dev/null | tr -d '\n')
    rm -f "$f"
    act=$(printf '%s' "$line" | sed -nE 's/.*"action"[[:space:]]*:[[:space:]]*"([a-z]+)".*/\1/p')
    getf() {
      v=$(printf '%s' "$line" | sed -nE "s/.*\"$1\"[[:space:]]*:[[:space:]]*\"([^\"]*)\".*/\1/p" | head -1)
      if [ -z "$v" ]; then
        v=$(printf '%s' "$line" | sed -nE "s/.*\"$1\"[[:space:]]*:[[:space:]]*([^,}]*).*/\1/p" | head -1 | tr -d ' ')
      fi
      printf '%s' "$v"
    }
    case "$act" in
      save)
        targets=$(getf targets); denylist=$(getf denylist); hardened=$(getf hardened)
        templateName=$(getf templateName); templatePackages=$(getf templatePackages)
        op=$(getf op)
        ad=$(getf autoDevOff); hm=$(getf hideMockLocation); ah=$(getf alwaysHidden)
        sf=$(getf susfs); hr=0; ui=$(getf uiApk)
        tojson_arr() { printf '['; fl=1; for i in $(echo "$1" | tr ',' ' '); do valid_package_name "$i" || continue; [ $fl -eq 1 ] || printf ','; fl=0; json_string "$i"; done; printf ']'; }
        bj() { bool_json "$1"; }
        APPS_T="$DIR/.uirpc-appentries"
        extract_app_entries "$DIR/config.json" > "$APPS_T" || : > "$APPS_T"
        emit_saved_entries() {
          f=1
          while IFS= read -r e; do
            [ -n "$e" ] || continue
            [ $f -eq 1 ] || printf ','
            f=0
            printf '%s' "$e"
          done < "$APPS_T"
        }
        {
          printf '{"targets":'; tojson_arr "$targets"
          printf ',"denylist":'; tojson_arr "$denylist"
          printf ',"hideTemplates":'; emit_hide_templates_json "$templateName" "$templatePackages"
          printf ',"hardened":'; tojson_arr "$hardened"
          printf ',"apps":{'; emit_saved_entries; printf '}'
          printf ',"autoDevOff":'; bj "$ad"; printf ',"hideMockLocation":'; bj "$hm"
          printf ',"alwaysHidden":'; bj "$ah"; printf ',"susfs":'; bj "$sf"
          printf ',"hideRootApps":'; bj "$hr"
          printf ',"uiApk":'; bj "$ui"
          printf ',"systemCloak":'; bj "$(jbool systemCloak)"
          printf ',"hideMode":'; json_string "$(hide_mode)"
          printf ',"cloakPackages":'; tojson_arr "$(jlist cloakPackages | tr '\n' ',')"
          printf '}'
        } > "$DIR/config.json"
        rm -f "$APPS_T"
        chmod 644 "$DIR/config.json"
        log "config saved (control-UI app)"
        schedule_apply app "$op"
        mark_changed
        ;;
      apply)   op=$(getf op); schedule_apply app "$op"; mark_changed ;;
      restore) sh "$DIR/restore.sh" >> "$LOG" 2>&1; root_cache_invalidate; mark_changed ;;
      roothide) log "ignored deprecated roothide command; use hidden-app list"; mark_changed ;;
      hideone)
        pkg=$(getf pkg)
        if valid_package_name "$pkg"; then
          log "ignored deprecated hideone command for $pkg; use hidden-app list"
          mark_changed
        fi
        ;;
      refresh) schedule_apps_snapshot ;;
      savecfg)
        # Deprecated: complete config replacement is too broad for a bridge command.
        rm -f "$CMD_DIR/config.json"
        log "ignored deprecated savecfg command" ;;
      setapp)
        # {"action":"setapp","pkg":"x","features":"devOff,mock"} -> enable + set features
        pkg=$(getf pkg); feats=$(getf features); template=$(getf template)
        if valid_package_name "$pkg"; then
          APP_PKG_NEW="$pkg" APP_FEATS_NEW="$feats" APP_HIDE_TEMPLATE_NEW="$template" sh "$DIR/appcfg.sh" set >> "$LOG" 2>&1
          per_app_refresh "$pkg" app >> "$LOG" 2>&1
          mark_changed
        fi
        ;;
      delapp)
        pkg=$(getf pkg)
        if valid_package_name "$pkg"; then
          APP_PKG_NEW="$pkg" sh "$DIR/appcfg.sh" del >> "$LOG" 2>&1
          per_app_refresh "$pkg" app >> "$LOG" 2>&1
          mark_changed
        fi
        ;;
    esac
    snapshot
  done
}

case "${1:-serve}" in
  snapshot) snapshot ;;
  apps)     apps_snapshot ;;
  cmds)     process_cmds ;;
  serve)    process_cmds; snapshot ;;
esac
