#!/system/bin/sh
DIR=${CAUSENTRY_DIR:-/data/adb/causentry}
. "$DIR/lib.sh"
# Causentry - per-app configuration writer.
#
#   APP_PKG_NEW=com.x APP_FEATS_NEW=devOff,mock  appcfg.sh set
#   APP_PKG_NEW=com.x                            appcfg.sh del
#   appcfg.sh show com.x
#
# The whole config is rebuilt from its parts, which keeps the nested "apps"
# object valid without fragile in-place edits.

APP_ENTRIES_FILE=$DIR/.appentries
all_app_entries() {   # one `"pkg":{"devOff":..,"mock":..}` entry per line
  grep -oE '"[^"]+":\{"devOff":[^}]*\}' "$CONF" 2>/dev/null > "$APP_ENTRIES_FILE" || : > "$APP_ENTRIES_FILE"
  cat "$APP_ENTRIES_FILE"
}

# mksh performs brace expansion on expansion results, so never iterate such a
# string with `for x in $var` - always read it line by line.
emit_entries() {   # emit_entries <file-with-entries>
  f=1
  while IFS= read -r e; do
    [ -n "$e" ] || continue
    [ $f -eq 1 ] || printf ','
    f=0
    printf '%s' "$e"
  done < "$1"
}

uniq_list() {   # uniq_list <newline list> -> space separated, unique
  out=""
  for i in $*; do
    case " $out " in *" $i "*) continue;; esac
    out="$out $i"
  done
  printf '%s' "$out"
}

emit() {   # emit <targets> <denylist> <hardened> <appentries>
  printf '{"targets":'
  printf '['
  f=1; for i in $1; do [ $f -eq 1 ] || printf ','; f=0; printf '"%s"' "$i"; done
  printf ']'
  printf ',"denylist":'
  printf '['
  f=1; for i in $2; do [ $f -eq 1 ] || printf ','; f=0; printf '"%s"' "$i"; done
  printf ']'
  printf ',"hardened":'
  printf '['
  f=1; for i in $3; do [ $f -eq 1 ] || printf ','; f=0; printf '"%s"' "$i"; done
  printf ']'
  printf ',"apps":{'
  emit_entries "$4"
  printf '}'
  printf ',"autoDevOff":%s' "$( [ "$(jbool autoDevOff)" = 1 ] && echo true || echo false )"
  printf ',"hideMockLocation":%s' "$( [ "$(jbool hideMockLocation)" = 1 ] && echo true || echo false )"
  printf ',"alwaysHidden":%s' "$( [ "$(jbool alwaysHidden)" = 1 ] && echo true || echo false )"
  printf ',"susfs":%s' "$( [ "$(jbool susfs)" = 1 ] && echo true || echo false )"
  printf ',"hooks":%s' "$( [ "$(jbool hooks)" = 1 ] && echo true || echo false )"
  printf ',"hideRootApps":%s' "$( [ "$(jbool hideRootApps)" = 1 ] && echo true || echo false )"
  printf ',"uiApk":%s' "$( [ "$(jbool uiApk)" = 1 ] && echo true || echo false )"
  # keys this script does not edit must survive a rewrite
  M=$(jstr hideMode); [ -n "$M" ] || M=cloak
  printf ',"hideMode":"%s"' "$M"
  printf ',"cloakPackages":['
  f=1; for p in $(jlist cloakPackages); do [ $f -eq 1 ] || printf ','; f=0; printf '"%s"' "$p"; done
  printf ']'
  printf '}'
}

case "${1:-show}" in
  set)
    pkg="$APP_PKG_NEW"; feats="${APP_FEATS_NEW:-devOff,mock}"
    [ -n "$pkg" ] || { echo "no package"; exit 1; }
    d=false; m=false; i=true
    case ",$feats," in *",devOff,"*) d=true;; esac
    case ",$feats," in *",mock,"*)   m=true;; esac
    case ",$feats," in *",isolate,"*) i=true;; *) i=false;; esac
    blk="\"$pkg\":{\"devOff\":$d,\"mock\":$m,\"isolate\":$i}"
    T=$(uniq_list "$(jlist targets | tr '\n' ' ')")
    H=$(uniq_list "$(jlist hardened | tr '\n' ' ')")
    case " $T " in *" $pkg "*) ;; *) T="$T $pkg";; esac
    if [ "$d" = true ] && detect_hardened_pkg "$pkg"; then
      case " $H " in *" $pkg "*) ;; *) H="$H $pkg";; esac
    fi
    T=$(uniq_list "$T")
    all_app_entries > /dev/null
    : > "$DIR/.appentries.new"
    while IFS= read -r e; do
      [ -n "$e" ] || continue
      case "$e" in "\"$pkg\""*) continue;; esac
      printf '%s\n' "$e" >> "$DIR/.appentries.new"
    done < "$APP_ENTRIES_FILE"
    printf '%s\n' "$blk" >> "$DIR/.appentries.new"
    emit "$T" "$(jlist denylist)" "$H" "$DIR/.appentries.new" > "$CONF.new"
    mv -f "$CONF.new" "$CONF"; chmod 644 "$CONF"
    log "app config set: $pkg ($feats)"
    echo "configured $pkg: $feats"
    ;;
  del)
    pkg="$APP_PKG_NEW"
    T=""
    for t in $(jlist targets | tr '\n' ' '); do [ "$t" = "$pkg" ] && continue; T="$T $t"; done
    T=$(uniq_list "$T")
    H=""
    for h in $(jlist hardened | tr '\n' ' '); do [ "$h" = "$pkg" ] && continue; H="$H $h"; done
    H=$(uniq_list "$H")
    all_app_entries > /dev/null
    : > "$DIR/.appentries.new"
    while IFS= read -r e; do
      [ -n "$e" ] || continue
      case "$e" in "\"$pkg\""*) continue;; esac
      printf '%s\n' "$e" >> "$DIR/.appentries.new"
    done < "$APP_ENTRIES_FILE"
    emit "$T" "$(jlist denylist)" "$H" "$DIR/.appentries.new" > "$CONF.new"
    mv -f "$CONF.new" "$CONF"; chmod 644 "$CONF"
    log "app config removed: $pkg"
    echo "removed $pkg"
    ;;
  clean)
    emit "$(jlist targets)" "$(jlist denylist)" "$(jlist hardened)" /dev/null > "$CONF.new"
    mv -f "$CONF.new" "$CONF"; chmod 644 "$CONF"
    log "apps block cleared"
    echo "apps block cleared"
    ;;
  show)
    pkg="$2"
    echo "targets : $(jlist targets | tr '\n' ' ')"
    echo "apps    : $(all_app_entries)"
    [ -n "$pkg" ] && echo "app '$pkg' -> $(app_block "$pkg")"
    ;;
esac
