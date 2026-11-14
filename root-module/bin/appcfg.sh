#!/system/bin/sh
DIR=${CAUSENTRY_DIR:-/data/adb/causentry}
. "$DIR/lib.sh"
# Causentry - per-app configuration writer.
#
#   APP_PKG_NEW=com.x APP_FEATS_NEW=devOff,mock APP_HIDE_TEMPLATE_NEW=work appcfg.sh set
#   APP_PKG_NEW=com.x                            appcfg.sh del
#   appcfg.sh show com.x
#
# The whole config is rebuilt from its parts, which keeps the nested "apps"
# object valid without fragile in-place edits.

APP_ENTRIES_FILE=$DIR/.appentries
all_app_entries() {   # one `"pkg":{...}` entry per line
  extract_app_entries "$CONF" > "$APP_ENTRIES_FILE" || : > "$APP_ENTRIES_FILE"
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
  eval "$(tr -d '\r\n' < "$CONF" 2>/dev/null | sed -nE 's/.*"autoDevOff"[[:space:]]*:[[:space:]]*(true|false).*/B_dev=\1/p; s/.*"hideMockLocation"[[:space:]]*:[[:space:]]*(true|false).*/B_mock=\1/p; s/.*"alwaysHidden"[[:space:]]*:[[:space:]]*(true|false).*/B_always=\1/p; s/.*"susfs"[[:space:]]*:[[:space:]]*(true|false).*/B_susfs=\1/p; s/.*"hideRootApps"[[:space:]]*:[[:space:]]*(true|false).*/B_root=\1/p; s/.*"uiApk"[[:space:]]*:[[:space:]]*(true|false).*/B_ui=\1/p; s/.*"systemCloak"[[:space:]]*:[[:space:]]*(true|false).*/B_sys=\1/p')"
  printf '{"targets":['
  f=1; for i in $1; do valid_package_name "$i" || continue; [ $f -eq 1 ] || printf ','; f=0; printf '"%s"' "$i"; done
  printf '],"denylist":['
  f=1; for i in $2; do valid_package_name "$i" || continue; [ $f -eq 1 ] || printf ','; f=0; printf '"%s"' "$i"; done
  printf '],"hideTemplates":'
  emit_hide_templates_json
  printf ',"hardened":['
  f=1; for i in $3; do valid_package_name "$i" || continue; [ $f -eq 1 ] || printf ','; f=0; printf '"%s"' "$i"; done
  printf '],"apps":{'
  emit_entries "$4"
  printf '}'
  printf ',"autoDevOff":%s' "${B_dev:-false}"
  printf ',"hideMockLocation":%s' "${B_mock:-false}"
  printf ',"alwaysHidden":%s' "${B_always:-false}"
  printf ',"susfs":%s' "${B_susfs:-false}"
  printf ',"hideRootApps":%s' "${B_root:-false}"
  printf ',"uiApk":%s' "${B_ui:-false}"
  printf ',"systemCloak":%s' "${B_sys:-false}"
  # keys this script does not edit must survive a rewrite
  M=$(jstr hideMode); [ -n "$M" ] || M=none
  printf ',"hideMode":"%s"' "$M"
  printf ',"cloakPackages":['
  f=1; for p in $(jlist cloakPackages); do valid_package_name "$p" || continue; [ $f -eq 1 ] || printf ','; f=0; printf '"%s"' "$p"; done
  printf ']'
  sr=$(tr -d '\r\n' < "$CONF" 2>/dev/null | sed -nE 's/.*"storageRules"[[:space:]]*:[[:space:]]*(\{[^}]*\}).*/\1/p')
  if [ -n "$sr" ]; then
    printf ',"storageRules":%s' "$sr"
  fi
  printf '}'
}

case "${1:-show}" in
  set)
    pkg="$APP_PKG_NEW"; feats="${APP_FEATS_NEW-devOff,mock}"; tpl="${APP_HIDE_TEMPLATE_NEW-}"
    valid_package_name "$pkg" || { echo "invalid package"; exit 1; }
    valid_template_name "$tpl" || tpl=""
    d=false; m=false; i=true; a=true
    case ",$feats," in *",devOff,"*) d=true;; esac
    case ",$feats," in *",mock,"*)   m=true;; esac
    case ",$feats," in *",isolate,"*) i=true;; *) i=false;; esac
    case ",$feats," in *",accOff,"*) a=true;; *) a=false;; esac
    blk="$(json_string "$pkg"):{\"devOff\":$d,\"mock\":$m,\"isolate\":$i,\"accOff\":$a,\"hideTemplate\":$(json_string "$tpl")}"
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
    log "app config set: $pkg ($feats, hideTemplate=$tpl)"
    echo "configured $pkg: $feats hideTemplate=$tpl"
    ;;
  del)
    pkg="$APP_PKG_NEW"
    valid_package_name "$pkg" || { echo "invalid package"; exit 1; }
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
