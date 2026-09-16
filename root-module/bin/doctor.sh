#!/system/bin/sh
DIR=/data/adb/causentry
. "$DIR/lib.sh"
# Causentry - dependency report: what is required, what merely upgrades a feature.
echo "Causentry doctor  ($(cat "$DIR/runtime.state" 2>/dev/null || echo unknown))"
echo "=========================================================="
echo "REQUIRED"
echo "  root (uid)      : uid=$(id -u 2>/dev/null)  $([ "$(id -u 2>/dev/null)" = 0 ] && echo OK || echo 'NOT ROOT (run via su/ksud)')"
echo "  android shell   : $([ -x /system/bin/sh ] && echo OK || echo MISSING)"
echo "  pm/am/settings  : $(has pm && has am && has settings && echo OK || echo MISSING)"
echo "  module payload  : $([ -f "$DIR/Causentry.apk" ] && echo present || echo 'absent (optional)')"
echo
echo "OPTIONAL (absence only disables that feature)"
bb=$(find_busybox 2>/dev/null); rp=$(find_resetprop 2>/dev/null); sf=$(find_susfs 2>/dev/null)
echo "  busybox         : ${bb:-absent}   -> control Web UI"
echo "  resetprop       : ${rp:-absent}   -> boot property spoofing"
echo "  ksu_susfs       : ${sf:-absent}   -> kernel-level path hiding  (variant: $(susfs_variant))"
echo "  zygisk loader   : $(zygisk_backend_status)   -> system_server loader"
echo "  cloak hook      : $(cloak_backend_ready && echo ready || echo inactive)   -> package cloak"
echo
echo "STATE"
echo "  config          : $([ -f "$DIR/config.json" ] && echo ok || echo MISSING)"
echo "  daemon pid      : $(cat "$DIR/daemon.pid" 2>/dev/null) $([ -d "/proc/$(cat "$DIR/daemon.pid" 2>/dev/null)" ] && echo alive || echo dead)"
echo "  ui token        : $([ -s "$DIR/ui.token" ] && echo present || echo missing)"
echo "  hidden packages : $(wc -l < "$DIR/hidden_packages" 2>/dev/null || echo 0)"
echo "  flags           : global=$(settings get global development_settings_enabled) secure=$(settings get secure development_settings_enabled) mock=$(settings get secure mock_location)"
