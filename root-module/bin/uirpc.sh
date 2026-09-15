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

jstr() { printf '%s' "$1" | tr -d '"' | tr '\n' ' '; }

snapshot() {
  [ -d "/data/data/$APP_PKG" ] || return 0
  ensure_app_dirs
  T=$(mktemp 2>/dev/null || echo "$DIR/.status.tmp")
  state=$(cat "$DIR/runtime.state" 2>/dev/null); [ -z "$state" ] && state=unknown
  dpid=$(cat "$DIR/daemon.pid" 2>/dev/null); dalive=false
  [ -n "$dpid" ] && [ -d "/proc/$dpid" ] && dalive=true
  rootapps=$(sh "$DIR/root-apps.sh" scan 2>/dev/null | tr '\n' ',')
  suggests=$(sh "$DIR/root-apps.sh" suggest 2>/dev/null | tr '\n' ',')
  {
    printf '{"state":"%s","daemon":%s,"global":"%s","secure":"%s","mock":"%s",' \
      "$(jstr "$state")" "$dalive" \
      "$(settings get global development_settings_enabled 2>/dev/null)" \
      "$(settings get secure development_settings_enabled 2>/dev/null)" \
      "$(settings get secure mock_location 2>/dev/null)"
    printf '"susfs":"%s","vector":%s,' "$(susfs_variant)" "$(vector_cli >/dev/null 2>&1 && echo true || echo false)"
    printf '"targets":['; f=1; for t in $(jlist targets); do [ $f -eq 1 ] || printf ','; f=0; printf '"%s"' "$t"; done; printf '],'
    printf '"hardened":['; f=1; for t in $(jlist hardened); do [ $f -eq 1 ] || printf ','; f=0; printf '"%s"' "$t"; done; printf '],'
    printf '"denylist":['; f=1; for t in $(jlist denylist); do [ $f -eq 1 ] || printf ','; f=0; printf '"%s"' "$t"; done; printf '],'
    printf '"autoDevOff":%s,"hideMockLocation":%s,"alwaysHidden":%s,"susfsOn":%s,"hooks":%s,"hideRootApps":%s,"uiApk":%s,' \
      "$( [ "$(jbool autoDevOff)" = 1 ] && echo true || echo false )" \
      "$( [ "$(jbool hideMockLocation)" = 1 ] && echo true || echo false )" \
      "$( [ "$(jbool alwaysHidden)" = 1 ] && echo true || echo false )" \
      "$( [ "$(jbool susfs)" = 1 ] && echo true || echo false )" \
      "$( [ "$(jbool hooks)" = 1 ] && echo true || echo false )" \
      "$( [ "$(jbool hideRootApps)" = 1 ] && echo true || echo false )" \
      "$( [ "$(jbool uiApk)" = 1 ] && echo true || echo false )"
    printf '"rootApps":"%s","rootSuggest":"%s",' "$(jstr "$rootapps")" "$(jstr "$suggests")"
    printf '"config":%s,' "$(tr -d '\n' < "$CONF" 2>/dev/null || echo '{}')"
    printf '"log":"%s"}' "$(jstr "$(tail -25 "$DIR/causentry.log" 2>/dev/null)")"
  } > "$T"
  put "$T" "$APP_DIR/status.json"
  [ "$T" = "$DIR/.status.tmp" ] && mv -f "$T" "$DIR/status.json.tmp" 2>/dev/null || rm -f "$T" 2>/dev/null
  return 0
}

apps_snapshot() {
  [ -d "/data/data/$APP_PKG" ] || return 0
  ensure_app_dirs
  T=$(mktemp 2>/dev/null || echo "$DIR/.apps.tmp")
  {
    printf '{"apps":['
    f=1
    for pkg in $(pm list packages -3 2>/dev/null | sed 's/package://' | sort); do
      prot=false; is_target "$pkg" && prot=true
      hard=false; is_hardened "$pkg" && hard=true
      [ $f -eq 1 ] || printf ','
      f=0
      printf '{"pkg":"%s","protected":%s,"hardened":%s}' "$pkg" "$prot" "$hard"
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
    getf() { printf '%s' "$line" | sed -nE "s/.*\"$1\"[[:space:]]*:[[:space:]]*\"([^\"]*)\".*/\1/p"; }
    case "$act" in
      save)
        targets=$(getf targets); denylist=$(getf denylist); hardened=$(getf hardened)
        ad=$(getf autoDevOff); hm=$(getf hideMockLocation); ah=$(getf alwaysHidden)
        sf=$(getf susfs); hk=$(getf hooks); hr=$(getf hideRootApps); ui=$(getf uiApk)
        tojson_arr() { printf '['; fl=1; for i in $(echo "$1" | tr ',' ' '); do [ -z "$i" ] && continue; [ $fl -eq 1 ] || printf ','; fl=0; printf '"%s"' "$i"; done; printf ']'; }
        bj() { [ "$1" = 1 ] && printf true || printf false; }
        {
          printf '{"targets":'; tojson_arr "$targets"
          printf ',"denylist":'; tojson_arr "$denylist"
          printf ',"hardened":'; tojson_arr "$hardened"
          printf ',"autoDevOff":'; bj "$ad"; printf ',"hideMockLocation":'; bj "$hm"
          printf ',"alwaysHidden":'; bj "$ah"; printf ',"susfs":'; bj "$sf"
          printf ',"hooks":'; bj "$hk"; printf ',"hideRootApps":'; bj "$hr"
          printf ',"uiApk":'; bj "$ui"; printf '}'
        } > "$DIR/config.json"
        chmod 644 "$DIR/config.json"
        log "config saved (control-UI app)"
        sh "$DIR/apply.sh" app >> "$LOG" 2>&1
        ;;
      apply)   sh "$DIR/apply.sh" app >> "$LOG" 2>&1 ;;
      restore) sh "$DIR/restore.sh" >> "$LOG" 2>&1 ;;
      roothide) sh "$DIR/root-apps.sh" hide >> "$LOG" 2>&1 ;;
      hideone)
        pkg=$(getf pkg)
        if [ -n "$pkg" ]; then
          grep -qx "$pkg" "$DIR/root_extra.txt" 2>/dev/null || echo "$pkg" >> "$DIR/root_extra.txt"
          sh "$DIR/root-apps.sh" hide >> "$LOG" 2>&1
        fi
        ;;
      refresh) apps_snapshot ;;
      savecfg)
        # the app writes the complete config it wants; validate, install, apply
        cfg="$CMD_DIR/config.json"
        if [ -f "$cfg" ] && grep -q '"targets"' "$cfg"; then
          tr -d '\n' < "$cfg" > "$DIR/config.json"
          chmod 644 "$DIR/config.json"
          log "config saved (control-UI app, full)"
          sh "$DIR/apply.sh" app >> "$LOG" 2>&1
        fi
        rm -f "$cfg" ;;
      setapp)
        # {"action":"setapp","pkg":"x","features":"devOff,mock"} -> enable + set features
        pkg=$(getf pkg); feats=$(getf features)
        if [ -n "$pkg" ]; then
          APP_PKG_NEW="$pkg" APP_FEATS_NEW="$feats" sh "$DIR/appcfg.sh" set >> "$LOG" 2>&1
          sh "$DIR/apply.sh" app >> "$LOG" 2>&1
        fi
        ;;
      delapp)
        pkg=$(getf pkg)
        [ -n "$pkg" ] && APP_PKG_NEW="$pkg" sh "$DIR/appcfg.sh" del >> "$LOG" 2>&1
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
