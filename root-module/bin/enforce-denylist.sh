#!/system/bin/sh
DIR=/data/adb/causentry
# Causentry — enforce the denylist once (called by the daemon after config change)
. "$DIR/lib.sh"
echo "hidden-app list is target-scoped; physical package hiding skipped"
[ -x "$DIR/cloak.sh" ] && sh "$DIR/cloak.sh"
echo "denylist enforced"
