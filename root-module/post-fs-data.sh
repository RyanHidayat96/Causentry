#!/system/bin/sh
# Prepare the backend's writable state before system_server specializes.
MODDIR=${0%/*}
. "$MODDIR/bin/lib.sh"
prepare_cloak_state_dir
