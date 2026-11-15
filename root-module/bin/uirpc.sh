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
COMMAND_LOCK=$DIR/uirpc.command.lock
ROOT_REFRESH_PID=$DIR/.root-cache-refresh.pid

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
  out_tmp="$2.tmp.$$"
  cp -f "$1" "$out_tmp" 2>/dev/null || return 1
  chmod 600 "$out_tmp" 2>/dev/null
  [ -n "$uid" ] && chown "$uid:$uid" "$out_tmp" 2>/dev/null
  mv -f "$out_tmp" "$2" 2>/dev/null || {
    rm -f "$out_tmp" 2>/dev/null
    return 1
  }
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

acquire_command_lock() {
  if mkdir "$COMMAND_LOCK" 2>/dev/null; then
    echo "$$" > "$COMMAND_LOCK/pid" 2>/dev/null
    return 0
  fi
  owner=$(cat "$COMMAND_LOCK/pid" 2>/dev/null)
  if [ -z "$owner" ] || [ ! -d "/proc/$owner" ]; then
    rm -f "$COMMAND_LOCK/pid" 2>/dev/null
    rmdir "$COMMAND_LOCK" 2>/dev/null
    if mkdir "$COMMAND_LOCK" 2>/dev/null; then
      echo "$$" > "$COMMAND_LOCK/pid" 2>/dev/null
      return 0
    fi
  fi
  return 1
}

release_command_lock() {
  owner=$(cat "$COMMAND_LOCK/pid" 2>/dev/null)
  [ "$owner" = "$$" ] || return 0
  rm -f "$COMMAND_LOCK/pid" 2>/dev/null
  rmdir "$COMMAND_LOCK" 2>/dev/null
}

# status.json has many producers (watchdog serve/snapshot, apply-async publish,
# the app's own wake-up, uirpc-wake). Without mutual exclusion a snapshot that
# copied the config before a config write can publish after the write and revert
# the UI to the previous state. The lock serialises publication; the config
# stamp check below drops a snapshot whose config went stale while it was built.
SNAPSHOT_LOCK=$DIR/.snapshot.lock
SNAPSHOT_LOCK_TTL=60  # hard ceiling (s) for one snapshot; guards a killed holder

lock_owner_alive() {  # lock_owner_alive <pid>
  _o="$1"
  [ -n "$_o" ] && [ -d "/proc/$_o" ] || return 1
  # A recycled PID must not impersonate the holder: the owner has to be one of us.
  _c=$(tr '\0' ' ' < "/proc/$_o/cmdline" 2>/dev/null)
  case "$_c" in *uirpc*) return 0;; esac
  return 1
}

_snapshot_lock_take() {
  mkdir "$SNAPSHOT_LOCK" 2>/dev/null || return 1
  echo "$$" > "$SNAPSHOT_LOCK/pid" 2>/dev/null
  date +%s > "$SNAPSHOT_LOCK/ts" 2>/dev/null
  return 0
}

acquire_snapshot_lock() {
  _snapshot_lock_take && return 0
  owner=$(cat "$SNAPSHOT_LOCK/pid" 2>/dev/null)
  lts=$(cat "$SNAPSHOT_LOCK/ts" 2>/dev/null)
  now=$(date +%s 2>/dev/null)
  stale=0
  lock_owner_alive "$owner" || stale=1
  case "$lts" in
    ''|*[!0-9]*) ;;
    *) [ -n "$now" ] && [ $((now - lts)) -gt "$SNAPSHOT_LOCK_TTL" ] && stale=1 ;;
  esac
  [ "$stale" = 1 ] || return 1
  # Reap the dead/overrun holder, then race once for the lock.
  rm -rf "$SNAPSHOT_LOCK" 2>/dev/null
  _snapshot_lock_take
}

release_snapshot_lock() {
  owner=$(cat "$SNAPSHOT_LOCK/pid" 2>/dev/null)
  [ "$owner" = "$$" ] || return 0
  rm -f "$SNAPSHOT_LOCK/pid" 2>/dev/null
  rmdir "$SNAPSHOT_LOCK" 2>/dev/null
}

conf_stamp() {
  stat -c '%y/%s' "$1" 2>/dev/null || echo ""
}

schedule_root_cache_refresh() {
  root_cache_valid && return 0
  pid=$(cat "$ROOT_REFRESH_PID" 2>/dev/null)
  [ -n "$pid" ] && [ -d "/proc/$pid" ] && return 0
  (
    root_cache_refresh
    mark_changed
  ) >/dev/null 2>&1 &
  echo "$!" > "$ROOT_REFRESH_PID" 2>/dev/null
}

complete_command() {
  token="$1"
  rc="$2"
  case "$token" in *[!A-Za-z0-9_.:-]*|"") return 0;; esac
  case "$rc" in ''|*[!0-9]*) rc=1;; esac
  printf '%s' "$rc" > "$DIR/.command.rc" 2>/dev/null
  printf '%s' "$token" > "$DIR/.command.done.token" 2>/dev/null
}

mark_apply_done() {
  # Publish the apply-completion markers consumers match against their op token.
  # Paths that reconcile policies in-process (setapp/delapp/template save) must
  # report here too, otherwise every waiter spins until its timeout, reverts its
  # optimistic UI, and the real value lands later as a visible flicker.
  rc="${1:-0}"
  op="${2:-}"
  case "$rc" in ''|*[!0-9]*) rc=1;; esac
  date +%s > "$DIR/.apply.done" 2>/dev/null
  printf '%s' "$rc" > "$DIR/.apply.rc" 2>/dev/null
  [ -n "$op" ] && printf '%s' "$op" > "$DIR/.apply.done.token" 2>/dev/null
}

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
  # Serialise with every other producer of status.json. Wait briefly instead of
  # skipping so a click right after a watchdog snapshot still publishes.
  _snap_wait=0
  while ! acquire_snapshot_lock; do
    _snap_wait=$((_snap_wait+1))
    [ "$_snap_wait" -gt 50 ] && return 1
    sleep 0.1 2>/dev/null || sleep 1
  done
  trap 'release_snapshot_lock' EXIT
  trap 'exit 124' HUP INT TERM
  T=$(mktemp 2>/dev/null || echo "$DIR/.status.$$.tmp")
  SNAP_CONF=$(mktemp 2>/dev/null || echo "$DIR/.status-config.$$.tmp")
  cp -f "$CONF" "$SNAP_CONF" 2>/dev/null || printf '{}' > "$SNAP_CONF"
  CONF_LIVE=$CONF
  # Stamp of the live config this snapshot is built from. If it moves before we
  # publish, the result is already obsolete and must not overwrite newer state.
  CONF_STAMP=$(conf_stamp "$CONF_LIVE")
  CONF=$SNAP_CONF
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
  # Queued commands still waiting to be drained count as busy too: the UI holds
  # its optimistic state while this is true, so a backlog of taps cannot expire
  # the overlay and flash the previous state back.
  if [ "$apply_busy" = false ]; then
    queue_depth=$(ls "$CMD_DIR" 2>/dev/null | grep -c '^cmd-')
    case "$queue_depth" in ''|*[!0-9]*) queue_depth=0;; esac
    [ "$queue_depth" -gt 0 ] && apply_busy=true
  fi
  apply_done=$(cat "$DIR/.apply.done" 2>/dev/null); case "$apply_done" in ""|*[!0-9]*) apply_done=0;; esac
  apply_rc=$(cat "$DIR/.apply.rc" 2>/dev/null); case "$apply_rc" in ""|*[!0-9]*) apply_rc=0;; esac
  apply_token=$(cat "$DIR/.apply.done.token" 2>/dev/null)
  command_rc=$(cat "$DIR/.command.rc" 2>/dev/null); case "$command_rc" in ""|*[!0-9]*) command_rc=0;; esac
  command_token=$(cat "$DIR/.command.done.token" 2>/dev/null)
  # Root-app discovery calls PackageManager. Never put it on the command/status
  # hot path; publish cached data and refresh it in the background instead.
  schedule_root_cache_refresh
  rootapps=$(cat "$DIR/.rootapps.cache" 2>/dev/null | tr '\n' ',')
  suggests=$(cat "$DIR/.rootsuggest.cache" 2>/dev/null | tr '\n' ',')
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
    printf '"commandRc":%s,"commandToken":' "$command_rc"; json_string "$command_token"; printf ','
    fuse_info='{"active":false,"covered":false}'
    if [ -f /data/media/0/Android/media/com.causentry.app/fuse_status.json ]; then
      fuse_info=$(tr -d '\r\n' < /data/media/0/Android/media/com.causentry.app/fuse_status.json 2>/dev/null)
      [ -n "$fuse_info" ] || fuse_info='{"active":false,"covered":false}'
    fi
    printf '"fuse":%s,' "$fuse_info"
    printf '"config":%s,' "$(tr -d '\n' < "$CONF" 2>/dev/null || echo '{}')"
    printf '"log":'; json_log_string; printf '}'
  } > "$T"
  # Drop the publish when the config moved while this snapshot was being built:
  # the newer config already has (or will get) its own snapshot, and writing this
  # one would revert the UI to the state the user just changed.
  if [ -n "$CONF_STAMP" ] && [ "$(conf_stamp "$CONF_LIVE")" != "$CONF_STAMP" ]; then
    CONF=$CONF_LIVE
    rm -f "$SNAP_CONF" "$T" 2>/dev/null
    return 0
  fi
  put "$T" "$APP_DIR/status.json"
  rc=$?
  CONF=$CONF_LIVE
  rm -f "$SNAP_CONF" 2>/dev/null
  rm -f "$T" 2>/dev/null
  return "$rc"
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
  acquire_command_lock || return 0
  # A pending command for the same package that is *newer* than the one being
  # executed supersedes it: per-app protection state is absolute, not a delta, so
  # running the older command only burns serve cycles and drags the UI through an
  # intermediate state. The queue drains at roughly one command per serve cycle
  # (~4-6s), so a four-tap burst took 20s+ -- longer than the optimistic UI
  # window, which is exactly what produced the "applied -> reverted -> applied"
  # flicker. mtime ties (writes inside the same second) break by filename: ops are
  # 'set-<epochMillis>' / 'del-<epochMillis>', so lexical order == chronological.
  cmd_superseded() {  # cmd_superseded <pkg> <file> <mtime>
    for c in "$CMD_DIR"/*.json; do
      [ -f "$c" ] || continue
      [ "$c" = "$2" ] && continue
      l=$(cat "$c" 2>/dev/null | tr -d '\n')
      a=$(printf '%s' "$l" | sed -nE 's/.*"action"[[:space:]]*:[[:space:]]*"([a-z]+)".*/\1/p')
      case "$a" in setapp|delapp) ;; *) continue ;; esac
      p=$(printf '%s' "$l" | sed -nE 's/.*"pkg"[[:space:]]*:[[:space:]]*"([^"]*)".*/\1/p' | head -1)
      [ "$p" = "$1" ] || continue
      m=$(stat -c %Y "$c" 2>/dev/null); case "$m" in ''|*[!0-9]*) m=0 ;; esac
      if [ "$m" -gt "$3" ]; then return 0; fi
      if [ "$m" -eq "$3" ] && [ "$c" \> "$2" ]; then return 0; fi
    done
    return 1
  }

  for f in "$CMD_DIR"/*.json; do
    [ -f "$f" ] || continue
    f_mtime=$(stat -c %Y "$f" 2>/dev/null); case "$f_mtime" in ''|*[!0-9]*) f_mtime=0 ;; esac
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
        templateName=$(getf templateName); templatePackages=$(getf templatePackages)
        templateDelete=$(getf templateDelete)
        op=$(getf op); scope=$(getf scope)
        if [ "$scope" = template ]; then
          # This command represents one template mutation, not a stale full-config
          # replacement from the UI. Read every unrelated value at execution time.
          targets=$(jlist targets | tr '\n' ',')
          denylist=$(jlist denylist | tr '\n' ',')
          hardened=$(jlist hardened | tr '\n' ',')
          ad=$(jbool autoDevOff); hm=$(jbool hideMockLocation); ah=$(jbool alwaysHidden)
          sf=$(jbool susfs); ui=$(jbool uiApk)
        else
          targets=$(getf targets); denylist=$(getf denylist); hardened=$(getf hardened)
          printf '%s' "$line" | grep -q '"denylist"' || denylist=$(jlist denylist | tr '\n' ',')
          ad=$(getf autoDevOff); hm=$(getf hideMockLocation); ah=$(getf alwaysHidden)
          sf=$(getf susfs); ui=$(getf uiApk)
        fi
        hr=0
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
        CONF_NEW="$CONF.new"
        {
          printf '{"targets":'; tojson_arr "$targets"
          printf ',"denylist":'; tojson_arr "$denylist"
          printf ',"hideTemplates":'; emit_hide_templates_json "$templateName" "$templatePackages" "$templateDelete"
          printf ',"hardened":'; tojson_arr "$hardened"
          printf ',"apps":{'; emit_saved_entries; printf '}'
          printf ',"autoDevOff":'; bj "$ad"; printf ',"hideMockLocation":'; bj "$hm"
          printf ',"alwaysHidden":'; bj "$ah"; printf ',"susfs":'; bj "$sf"
          printf ',"hideRootApps":'; bj "$hr"
          printf ',"uiApk":'; bj "$ui"
          printf ',"systemCloak":'; bj "$(jbool systemCloak)"
          printf ',"hideMode":'; json_string "$(hide_mode)"
          printf ',"cloakPackages":'; tojson_arr "$(jlist cloakPackages | tr '\n' ',')"
          printf ',"root_packages":'; tojson_arr "$(jlist root_packages | tr '\n' ',')"
          sr=$(tr -d '\r\n' < "$CONF" 2>/dev/null | sed -nE 's/.*"storageRules"[[:space:]]*:[[:space:]]*(\{[^}]*\}).*/\1/p')
          if [ -n "$sr" ]; then
            printf ',"storageRules":%s' "$sr"
          fi
          printf '}'
        } > "$CONF_NEW"
        rm -f "$APPS_T"
        if mv -f "$CONF_NEW" "$CONF" 2>/dev/null; then
          chmod 644 "$CONF"
          log "config saved (control-UI app)"
          if [ "$scope" = template ]; then
            refresh_cloak_policy >> "$LOG" 2>&1
            # A template-scope save must still report completion (see mark_apply_done).
            complete_command "$op" 0
            if [ -x "$DIR/apply-async.sh" ] || [ -x "$DIR/apply.sh" ]; then
              schedule_apply app "$op"
            else
              mark_apply_done 0 "$op"
            fi
          else
            schedule_apply app "$op"
          fi
          mark_changed
        else
          rm -f "$CONF_NEW"
          log "config save failed (control-UI app)"
          mark_apply_done 1 "$op"
          complete_command "$op" 1
        fi
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
      savecfg|importcfg)
        b64=$(getf configBase64); op=$(getf op); rc=1
        if [ -n "$b64" ]; then
          T="$CONF.new"
          if printf '%s' "$b64" | base64 -d 2>/dev/null | tr -d '\r\n\xef\xbb\xbf' > "$T"; then
            if [ -s "$T" ]; then
              PREV="$DIR/.config.prev"
              cp -f "$CONF" "$PREV" 2>/dev/null
              OLD_TARGETS=$(jlist targets)
              mv -f "$T" "$CONF"
              chmod 644 "$CONF"
              sh "$DIR/cloak.sh" >> "$LOG" 2>&1
              sh "$DIR/apply.sh" app >> "$LOG" 2>&1
              # A restore changes policies for apps that may already be running.
              # Restart only the targets whose state actually changed, exactly like a
              # per-app toggle does; otherwise they keep their pre-restore process.
              NEW_TARGETS=$(jlist targets)
              CHANGED="$DIR/.restore-restart"
              : > "$CHANGED"
              # union of old+new targets: added, changed, and dropped apps all need a
              # fresh process, otherwise a dropped app keeps running with root hidden.
              for p in $NEW_TARGETS $OLD_TARGETS; do
                [ -n "$p" ] || continue
                case " $(echo $NEW_TARGETS) " in
                  *" $p "*)
                    case " $(echo $OLD_TARGETS) " in
                      *" $p "*) new_e=$(apps_entry "$CONF" "$p"); old_e=$(apps_entry "$PREV" "$p")
                              [ "$new_e" = "$old_e" ] && continue ;;
                    esac ;;
                esac
                grep -qxF "$p" "$CHANGED" 2>/dev/null || printf '%s\n' "$p" >> "$CHANGED"
              done
              if [ -s "$CHANGED" ]; then
                while IFS= read -r p; do
                  [ -n "$p" ] || continue
                  # never force-stop ourselves: killing the UI mid-restore drops the
                  # adb/uirpc session that is running this very command.
                  [ "$p" = "$APP_PKG" ] && { reset_app_verdict_cache "$p"; continue; }
                  am force-stop "$p" >/dev/null 2>&1 && log "restore: restarted target $p"
                  reset_app_verdict_cache "$p"
                done < "$CHANGED"
              fi
              rm -f "$CHANGED" "$PREV"
              mark_changed
              schedule_apps_snapshot
              rc=0
              log "config restored from backup"
            else
              rm -f "$T"
            fi
          fi
        fi
        mark_apply_done "$rc" "$op"
        complete_command "$op" "$rc"
        ;;
      setapp)
        # {"action":"setapp","pkg":"x","features":"devOff,mock"} -> enable + set features
        pkg=$(getf pkg); feats=$(getf features); template=$(getf template); op=$(getf op); rc=1
        if valid_package_name "$pkg" && cmd_superseded "$pkg" "$f" "$f_mtime"; then
          log "setapp superseded by a newer command for $pkg (op=$op)"
          continue
        fi
        if valid_package_name "$pkg"; then
          APP_PKG_NEW="$pkg" APP_FEATS_NEW="$feats" APP_HIDE_TEMPLATE_NEW="$template" sh "$DIR/appcfg.sh" set >> "$LOG" 2>&1
          config_rc=$?
          if [ "$config_rc" -eq 0 ]; then
            per_app_refresh "$pkg" app >> "$LOG" 2>&1
            policy_rc=$?
            reconcile_runtime_after_config_change >> "$LOG" 2>&1
            runtime_rc=$?
            mark_changed
            # Keep apps.json current for legacy readers too. Native UI derives its
            # badges from status.json immediately, so this scan never blocks Save.
            schedule_apps_snapshot
            [ "$policy_rc" -eq 0 ] && [ "$runtime_rc" -eq 0 ] && rc=0
          else
            rc=$config_rc
          fi
        fi
        mark_apply_done "$rc" "$op"
        complete_command "$op" "$rc"
        ;;
      delapp)
        pkg=$(getf pkg); op=$(getf op); rc=1
        if valid_package_name "$pkg" && cmd_superseded "$pkg" "$f" "$f_mtime"; then
          log "delapp superseded by a newer command for $pkg (op=$op)"
          continue
        fi
        if valid_package_name "$pkg"; then
          APP_PKG_NEW="$pkg" sh "$DIR/appcfg.sh" del >> "$LOG" 2>&1
          config_rc=$?
          if [ "$config_rc" -eq 0 ]; then
            per_app_refresh "$pkg" app >> "$LOG" 2>&1
            policy_rc=$?
            reconcile_runtime_after_config_change >> "$LOG" 2>&1
            runtime_rc=$?
            mark_changed
            # See setapp: refresh inventory asynchronously after a state mutation.
            schedule_apps_snapshot
            [ "$policy_rc" -eq 0 ] && [ "$runtime_rc" -eq 0 ] && rc=0
          else
            rc=$config_rc
          fi
        fi
        mark_apply_done "$rc" "$op"
        complete_command "$op" "$rc"
        ;;
    esac
  done
  release_command_lock
}

case "${1:-serve}" in
  snapshot) snapshot ;;
  apps)     apps_snapshot ;;
  cmds)     process_cmds; snapshot ;;
  serve)    process_cmds; snapshot ;;
esac
