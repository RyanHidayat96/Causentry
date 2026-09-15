#!/system/bin/sh
DIR=/data/adb/causentry
# Causentry — enforce the denylist once (called by the daemon after config change)
. "$DIR/lib.sh"
MODE=$(hide_mode)
[ "$MODE" = "cloak" ] && MODE="cloak"
for pkg in $(jlist denylist); do
  if [ "$MODE" = "cloak" ]; then continue; fi
  if pm list packages --user 0 2>/dev/null | grep -q "^package:${pkg}$"; then
    if [ "$MODE" = "hide" ]; then
      pm hide --user 0 "$pkg" >/dev/null 2>&1 && echo "hidden: $pkg"
      continue
    fi
    pm uninstall --user 0 "$pkg" >/dev/null 2>&1 && {
      grep -qx "$pkg" "$DIR/hidden_packages" 2>/dev/null || echo "$pkg" >> "$DIR/hidden_packages"
      echo "hidden: $pkg"
    }
  fi
done
[ "$(jbool hideRootApps)" = 1 ] && [ -x "$DIR/root-apps.sh" ] && sh "$DIR/root-apps.sh" hide
echo "denylist enforced"
