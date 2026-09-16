#!/system/bin/sh
# Causentry — human readable state dump (used by the UI "Status" panel and by hand)
DIR=/data/adb/causentry
. "$DIR/lib.sh"
echo "Causentry v1.1.0"
echo "--------------"
echo "state        : $(cat "$DIR/runtime.state" 2>/dev/null)"
echo "daemon       : $(cat "$DIR/daemon.pid" 2>/dev/null)"
echo "targets      : $(jlist targets | tr '\n' ' ')"
echo "denylist     : $(jlist denylist | wc -l) packages"
echo "hardened     : $(jlist hardened | tr '\n' ' ')"
echo "autoDevOff   : $(jbool autoDevOff)   hideMockLocation: $(jbool hideMockLocation)"
echo "alwaysHidden : $(jbool alwaysHidden) susfs: $(jbool susfs)"
echo "flags        : global=$(settings get global development_settings_enabled) secure=$(settings get secure development_settings_enabled) mock=$(settings get secure mock_location)"
echo "saved        : $([ -f "$DIR/devsaved" ] && tr '\n' ' ' < "$DIR/devsaved")"
echo "hidden pkgs  : $([ -f "$DIR/hidden_packages" ] && tr '\n' ' ' < "$DIR/hidden_packages")"
echo "susfs        : $(susfs_variant)"
echo "zygisk       : $(zygisk_backend_status)"
echo "cloak hook   : $(cloak_backend_ready && echo ready || echo inactive)"
