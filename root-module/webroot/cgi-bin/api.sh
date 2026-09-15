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
if [ -s "$TOKEN_FILE" ]; then
  if [ "$REQ_T" != "$(cat "$TOKEN_FILE")" ]; then
    printf 'Content-Type: application/json\r\n\r\n{"error":"forbidden"}'
    exit 0
  fi
fi

jstr() { printf '%s' "$1" | tr -d '"' | tr '\n' ' '; }

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
    rootlist=""
    [ -x "$DIR/root-apps.sh" ] && rootlist=$(sh "$DIR/root-apps.sh" scan 2>/dev/null | tr '\n' ',')
    printf 'Content-Type: application/json\r\n\r\n'
    printf '{"state":"%s","daemon":%s,"global":"%s","secure":"%s","mock":"%s","susfs":"%s","vector":%s,"targets":"%s","denylist":"%s","hidden":%s,"version":"1.1.0","alwaysHidden":%s,"autoDevOff":%s,"hooks":%s,"hideMockLocation":%s,"susfsOn":%s,"hideRootApps":%s,"rootApps":"%s"}' \
      "$(jstr "$state")" "$dalive" \
      "$(settings get global development_settings_enabled)" \
      "$(settings get secure development_settings_enabled)" \
      "$(settings get secure mock_location)" \
      "$(jstr "$susfs")" "$vector" \
      "$(jstr "$(jlist targets | tr '\n' ',')")" \
      "$(jstr "$(jlist denylist | tr '\n' ',')")" \
      "$(jlist denylist | wc -l)" \
      "$( [ "$(jbool alwaysHidden)" = 1 ] && echo true || echo false )" \
      "$( [ "$(jbool autoDevOff)" = 1 ] && echo true || echo false )" \
      "$( [ "$(jbool hooks)" = 1 ] && echo true || echo false )" \
      "$( [ "$(jbool hideMockLocation)" = 1 ] && echo true || echo false )" \
      "$( [ "$(jbool susfs)" = 1 ] && echo true || echo false )" \
      "$( [ "$(jbool hideRootApps)" = 1 ] && echo true || echo false )" \
      "$(jstr "$rootlist")"
    ;;
  rootsuggest)
    printf 'Content-Type: application/json\r\n\r\n{"apps":['
    first=1
    for pkg in $(sh "$DIR/root-apps.sh" suggest 2>/dev/null); do
      [ $first -eq 1 ] || printf ','
      first=0
      printf '"%s"' "$pkg"
    done
    printf ']}'
    ;;
  hideone)
    pkg="$(getp pkg)"
    printf 'Content-Type: application/json\r\n\r\n'
    if [ -n "$pkg" ]; then
      grep -qx "$pkg" "$DIR/root_extra.txt" 2>/dev/null || echo "$pkg" >> "$DIR/root_extra.txt"
      out=$(sh "$DIR/root-apps.sh" hide 2>&1)
      printf '{"ok":true,"out":"%s"}' "$(jstr "$out")"
    else
      printf '{"ok":false}'
    fi
    ;;
  rootscan)
    printf 'Content-Type: application/json\r\n\r\n{"apps":['
    first=1
    for pkg in $(sh "$DIR/root-apps.sh" scan 2>/dev/null); do
      [ $first -eq 1 ] || printf ','
      first=0
      printf '"%s"' "$pkg"
    done
    printf ']}'
    ;;
  roothide)
    printf 'Content-Type: application/json\r\n\r\n'
    out=$(sh "$DIR/root-apps.sh" hide 2>&1)
    printf '{"ok":true,"out":"%s"}' "$(jstr "$out")"
    ;;
  apps)
    printf 'Content-Type: application/json\r\n\r\n'
    printf '{"apps":['
    first=1
    for pkg in $(pm list packages -3 2>/dev/null | sed 's/package://' | sort); do
      prot=false; is_target "$pkg" && prot=true
      hard=false; is_hardened "$pkg" && hard=true
      [ $first -eq 1 ] || printf ','
      first=0
      printf '{"pkg":"%s","protected":%s,"hardened":%s}' "$pkg" "$prot" "$hard"
    done
    printf ']}'
    ;;
  inspect)
    pkg="$(getp pkg)"
    hard=false
    detect_hardened_pkg "$pkg" && hard=true
    printf 'Content-Type: application/json\r\n\r\n{"pkg":"%s","pairip":%s}' "$(jstr "$pkg")" "$hard"
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

    tojson_arr() {
      printf '['
      f=1
      for i in $(echo "$1" | tr ',' ' '); do
        [ -z "$i" ] && continue
        [ $f -eq 1 ] || printf ','
        f=0
        printf '"%s"' "$i"
      done
      printf ']'
    }
    booljson() { [ "$1" = 1 ] && printf 'true' || printf 'false'; }

    {
      printf '{"targets":';          tojson_arr "$targets"
      printf ',"denylist":';         tojson_arr "$denylist"
      printf ',"hardened":';         tojson_arr "$hardened"
      printf ',"autoDevOff":';       booljson "$autoDevOff"
      printf ',"hideMockLocation":'; booljson "$hideMockLocation"
      printf ',"alwaysHidden":';     booljson "$alwaysHidden"
      printf ',"susfs":';            booljson "$susfsF"
      printf ',"hooks":';            booljson "$hooks"
      printf ',"hideRootApps":';     booljson "$hideRootApps"
      printf '}'
    } > "$CONF"
    chmod 644 "$CONF"
    log "config saved from UI"
    sh "$DIR/apply.sh" ui >/dev/null 2>&1
    printf 'Content-Type: application/json\r\n\r\n{"ok":true}'
    ;;
  apply)
    printf 'Content-Type: application/json\r\n\r\n'
    out=$(sh "$DIR/apply.sh" ui 2>&1)
    printf '{"ok":true,"out":"%s"}' "$(jstr "$out")"
    ;;
  restore)
    printf 'Content-Type: application/json\r\n\r\n'
    sh "$DIR/restore.sh" >/dev/null 2>&1
    printf '{"ok":true}'
    ;;
  log)
    printf 'Content-Type: text/plain\r\n\r\n'
    tail -60 "$DIR/causentry.log" 2>/dev/null
    ;;
  testapp)
    pkg="$(getp pkg)"
    am force-stop "$pkg" >/dev/null 2>&1
    monkey -p "$pkg" -c android.intent.category.LAUNCHER 1 >/dev/null 2>&1
    printf 'Content-Type: application/json\r\n\r\n{"ok":true}'
    ;;
  *)
    printf 'Content-Type: application/json\r\n\r\n{"error":"unknown action"}'
    ;;
esac
