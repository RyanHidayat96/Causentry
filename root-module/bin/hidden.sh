#!/system/bin/sh
DIR=${CAUSENTRY_DIR:-/data/adb/causentry}
. "$DIR/lib.sh"
# Causentry - undo "pm hide" for everything Causentry may have hidden.
case "${1:-unhide}" in
  unhide)
    n=0
    for p in $(jlist denylist) $(jlist cloakPackages) $(sh "$DIR/root-apps.sh" list 2>/dev/null); do
      valid_package_name "$p" || continue
      pm unhide --user 0 "$p" >/dev/null 2>&1 && n=$((n+1))
    done
    echo "unhidden packages: $n"
    ;;
  *) echo "usage: hidden.sh unhide" ;;
esac
