#!/system/bin/sh
# Causentry — control API (busybox httpd CGI, runs as root). Token protected.
DIR=/data/adb/causentry
CONF=$DIR/config.json
. "$DIR/lib.sh"

TOKEN_FILE=$DIR/ui.token
QS="${QUERY_STRING:-}"
ARG1="$1"

getp() {
  echo "$QS" | tr '&' '\n' | sed -nE "s/^$1=//p" | head -1 | sed 's/%2C/,/g; s/%20/_/g'
}

REQ_T="$(getp t)"
[ -z "$REQ_T" ] && REQ_T="$ARG1"
if [ ! -s "$TOKEN_FILE" ] || [ "$REQ_T" != "$(cat "$TOKEN_FILE")" ]; then
  printf 'Content-Type: application/json\r\n\r\n{"error":"forbidden"}'
  exit 0
fi

json_jlist() {
  key="$1"
  printf '['
  first=1
  for p in $(jlist "$key"); do
    valid_package_name "$p" || continue
    [ $first -eq 1 ] || printf ','
    first=0
    json_string "$p"
  done
  printf ']'
}

action="$(getp action)"
[ -z "$action" ] && action=status

case "$action" in
  status)
    state=$(cat "$DIR/runtime.state" 2>/dev/null)
    [ -z "$state" ] && state=unknown
    dpid=$(cat "$DIR/daemon.pid" 2>/dev/null)
    dalive=false
    [ -n "$dpid" ] && [ -d "/proc/$dpid" ] && dalive=true
    susfs="unsupported"
    susfs=$(susfs_variant)
    vector=false
    vector_cli >/dev/null 2>&1 && vector=true
    uiapk=false
    pm list packages 2>/dev/null | grep -q "^package:com.causentry.app$" && uiapk=true
    rootlist=$(root_apps_cached | tr '\n' ',')
    rootsuggest=$(root_suggest_cached | tr '\n' ',')
    hb=$(cat "$DIR/heartbeat" 2>/dev/null); [ -n "$hb" ] || hb=0
    age=$(( $(date +%s) - hb ))
    [ "$age" -ge 0 ] 2>/dev/null || age=999999
    [ "$age" -le 20 ] || dalive=false
    printf 'Content-Type: application/json\r\n\r\n'
    printf '{"state":'; json_string "$state"
    printf ',"daemon":%s,"ts":%s,"age":%s' "$dalive" "$(date +%s)" "$age"
    printf ',"global":'; json_string "$(settings get global development_settings_enabled 2>/dev/null)"
    printf ',"secure":'; json_string "$(settings get secure development_settings_enabled 2>/dev/null)"
    printf ',"mock":'; json_string "$(settings get secure mock_location 2>/dev/null)"
    printf ',"susfs":'; json_string "$susfs"
    printf ',"vector":%s' "$vector"
    printf ',"targets":'; json_jlist targets
    printf ',"hardened":'; json_jlist hardened
    printf ',"denylist":'; json_jlist denylist
    printf ',"hidden":%s,"version":"1.1.0"' "$(jlist denylist | wc -l)"
    printf ',"alwaysHidden":'; bool_json "$(jbool alwaysHidden)"
    printf ',"autoDevOff":'; bool_json "$(jbool autoDevOff)"
    printf ',"hooks":'; bool_json "$(jbool hooks)"
    printf ',"hideMockLocation":'; bool_json "$(jbool hideMockLocation)"
    printf ',"susfsOn":'; bool_json "$(jbool susfs)"
    printf ',"hideRootApps":'; bool_json "$(jbool hideRootApps)"
    printf ',"rootApps":'; json_string "$rootlist"
    printf ',"rootSuggest":'; json_string "$rootsuggest"
    printf ',"uiApk":%s,"uiAppInstalled":%s' "$uiapk" "$uiapk"
    printf ',"config":%s' "$(tr -d '\n' < "$CONF" 2>/dev/null || echo '{}')"
    printf ',"log":'; json_string "$(tail -25 "$DIR/causentry.log" 2>/dev/null)"
    printf '}'
    ;;
  rootsuggest)
    printf 'Content-Type: application/json\r\n\r\n{"apps":['
    first=1
    for pkg in $(sh "$DIR/root-apps.sh" suggest 2>/dev/null); do
      valid_package_name "$pkg" || continue
      [ $first -eq 1 ] || printf ','
      first=0
      json_string "$pkg"
    done
    printf ']}'
    ;;
  hideone)
    pkg="$(getp pkg)"
    printf 'Content-Type: application/json\r\n\r\n'
    if valid_package_name "$pkg"; then
      grep -qx "$pkg" "$DIR/root_extra.txt" 2>/dev/null || echo "$pkg" >> "$DIR/root_extra.txt"
      out=$(sh "$DIR/root-apps.sh" hide 2>&1)
      root_cache_invalidate
      printf '{"ok":true,"out":'; json_string "$out"; printf '}'
    else
      printf '{"ok":false}'
    fi
    ;;
  setapp)
    pkg="$(getp pkg)"; feats="$(getp features)"
    printf 'Content-Type: application/json\r\n\r\n'
    if valid_package_name "$pkg"; then
      APP_PKG_NEW="$pkg" APP_FEATS_NEW="$feats" sh "$DIR/appcfg.sh" set >/dev/null 2>&1
      sh "$DIR/apply.sh" ui >/dev/null 2>&1
      date +%s > "$DIR/.uirpc.changed" 2>/dev/null
      printf '{"ok":true}'
    else
      printf '{"ok":false}'
    fi
    ;;
  delapp)
    pkg="$(getp pkg)"
    printf 'Content-Type: application/json\r\n\r\n'
    if valid_package_name "$pkg"; then
      APP_PKG_NEW="$pkg" sh "$DIR/appcfg.sh" del >/dev/null 2>&1
      sh "$DIR/apply.sh" ui >/dev/null 2>&1
      date +%s > "$DIR/.uirpc.changed" 2>/dev/null
      printf '{"ok":true}'
    else
      printf '{"ok":false}'
    fi
    ;;
  labels)
    printf 'Content-Type: application/json\r\n\r\n'
    f=/data/data/com.causentry.app/files/labels.json
    if [ -s "$f" ]; then cat "$f"; else printf '{}'; fi
    ;;
  rootscan)
    printf 'Content-Type: application/json\r\n\r\n{"apps":['
    first=1
    for pkg in $(sh "$DIR/root-apps.sh" scan 2>/dev/null); do
      valid_package_name "$pkg" || continue
      [ $first -eq 1 ] || printf ','
      first=0
      json_string "$pkg"
    done
    printf ']}'
    ;;
  roothide)
    printf 'Content-Type: application/json\r\n\r\n'
    out=$(sh "$DIR/root-apps.sh" hide 2>&1)
    root_cache_invalidate
    date +%s > "$DIR/.uirpc.changed" 2>/dev/null
    printf '{"ok":true,"out":'; json_string "$out"; printf '}'
    ;;
  apps)
    printf 'Content-Type: application/json\r\n\r\n'
    printf '{"apps":['
    first=1
    for pkg in $(pm list packages -3 2>/dev/null | sed 's/package://' | sort); do
      valid_package_name "$pkg" || continue
      prot=false; is_target "$pkg" && prot=true
      hard=false; is_hardened "$pkg" && hard=true
      [ $first -eq 1 ] || printf ','
      first=0
      printf '{"pkg":'; json_string "$pkg"; printf ',"protected":%s,"hardened":%s}' "$prot" "$hard"
    done
    printf ']}'
    ;;
  inspect)
    pkg="$(getp pkg)"
    hard=false
    valid_package_name "$pkg" && detect_hardened_pkg "$pkg" && hard=true
    printf 'Content-Type: application/json\r\n\r\n{"pkg":'; json_string "$pkg"; printf ',"pairip":%s}' "$hard"
    ;;
  save)
    targets="$(getp targets)"
    denylist="$(getp denylist)"
    hardened="$(getp hardened)"
    autoDevOff="$(getp autoDevOff)"; [ "$autoDevOff" = 1 ] || autoDevOff=0
    hideMockLocation="$(getp hideMockLocation)"; [ "$hideMockLocation" = 1 ] || hideMockLocation=0
    alwaysHidden="$(getp alwaysHidden)"; [ "$alwaysHidden" = 1 ] || alwaysHidden=0
    susfsF="$(getp susfs)"; [ "$susfsF" = 1 ] || susfsF=0
    hooks="$(getp hooks)"; [ "$hooks" = 1 ] || hooks=0
    hideRootApps="$(getp hideRootApps)"; [ "$hideRootApps" = 1 ] || hideRootApps=0
    uiApk="$(getp uiApk)"; [ "$uiApk" = 1 ] || uiApk=0

    tojson_arr() {
      printf '['
      f=1
      for i in $(echo "$1" | tr ',' ' '); do
        valid_package_name "$i" || continue
        [ $f -eq 1 ] || printf ','
        f=0
        json_string "$i"
      done
      printf ']'
    }
    emit_app_entries() {
      f=1
      while IFS= read -r e; do
        [ -n "$e" ] || continue
        [ $f -eq 1 ] || printf ','
        f=0
        printf '%s' "$e"
      done < "$1"
    }
    APPS_T="$DIR/.api-appentries"
    grep -oE '"[^"]+":\{"devOff":[^}]*\}' "$CONF" 2>/dev/null > "$APPS_T" || : > "$APPS_T"

    {
      printf '{"targets":';          tojson_arr "$targets"
      printf ',"denylist":';         tojson_arr "$denylist"
      printf ',"hardened":';         tojson_arr "$hardened"
      printf ',"apps":{';            emit_app_entries "$APPS_T"; printf '}'
      printf ',"autoDevOff":';       bool_json "$autoDevOff"
      printf ',"hideMockLocation":'; bool_json "$hideMockLocation"
      printf ',"alwaysHidden":';     bool_json "$alwaysHidden"
      printf ',"susfs":';            bool_json "$susfsF"
      printf ',"hooks":';            bool_json "$hooks"
      printf ',"hideRootApps":';     bool_json "$hideRootApps"
      printf ',"uiApk":';            bool_json "$uiApk"
      printf ',"systemCloak":';      bool_json "$(jbool systemCloak)"
      printf ',"hideMode":';         json_string "$(hide_mode)"
      printf ',"cloakPackages":';    tojson_arr "$(jlist cloakPackages | tr '\n' ',')"
      printf '}'
    } > "$CONF"
    rm -f "$APPS_T"
    chmod 644 "$CONF"
    log "config saved from UI"
    sh "$DIR/apply.sh" ui >/dev/null 2>&1
    date +%s > "$DIR/.uirpc.changed" 2>/dev/null
    printf 'Content-Type: application/json\r\n\r\n{"ok":true}'
    ;;
  apply)
    printf 'Content-Type: application/json\r\n\r\n'
    out=$(sh "$DIR/apply.sh" ui 2>&1)
    date +%s > "$DIR/.uirpc.changed" 2>/dev/null
    printf '{"ok":true,"out":'; json_string "$out"; printf '}'
    ;;
  restore)
    printf 'Content-Type: application/json\r\n\r\n'
    sh "$DIR/restore.sh" >/dev/null 2>&1
    root_cache_invalidate
    date +%s > "$DIR/.uirpc.changed" 2>/dev/null
    printf '{"ok":true}'
    ;;
  log)
    printf 'Content-Type: text/plain\r\n\r\n'
    tail -60 "$DIR/causentry.log" 2>/dev/null
    ;;
  testapp)
    pkg="$(getp pkg)"
    printf 'Content-Type: application/json\r\n\r\n'
    if valid_package_name "$pkg"; then
      am force-stop "$pkg" >/dev/null 2>&1
      monkey -p "$pkg" -c android.intent.category.LAUNCHER 1 >/dev/null 2>&1
      printf '{"ok":true}'
    else
      printf '{"ok":false}'
    fi
    ;;
  *)
    printf 'Content-Type: application/json\r\n\r\n{"error":"unknown action"}'
    ;;
esac
