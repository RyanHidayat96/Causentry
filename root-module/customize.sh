#!/system/bin/sh
# Causentry - install-time hook (runs once, as root, inside the module install).
MODDIR=${MODPATH:-${0%/*}}

if ! command -v ui_print >/dev/null 2>&1; then
  ui_print() { echo "$*"; }
fi

ui_print "*******************************"
ui_print "  Causentry"
ui_print "  universal detection bypass"
ui_print "*******************************"

# spec section 18: the bundled payload must be present and readable
if [ -f "$MODDIR/payload/Causentry.apk" ]; then
  ui_print "- payload/Causentry.apk present"
else
  ui_print "! payload/Causentry.apk missing (optional in-process hooks stay off)"
fi

ui_print "- configuration lives in /data/adb/causentry/config.json"
ui_print "- control UI opens from the module Action button"
ui_print "- nothing runs inside protected apps: all bypassing is system/kernel side"
ui_print "- done"
