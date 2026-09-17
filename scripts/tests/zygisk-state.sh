#!/system/bin/sh
# Run as root on Android: sh zygisk-state.sh /path/to/lib.sh
set -eu
. "${1:?path to lib.sh required}"

test_dir=$(mktemp -d /data/local/tmp/causentry-state-test.XXXXXX)
trap 'rm -rf "$test_dir"' EXIT

mkdir "$test_dir/state"
chown 0:0 "$test_dir/state"
prepare_cloak_state_dir "$test_dir/state"
[ "$(stat -c %u:%g:%a "$test_dir/state")" = 1000:1000:755 ]
prepare_cloak_state_dir "$test_dir/state"
[ "$(stat -c %u:%g:%a "$test_dir/state")" = 1000:1000:755 ]
echo 'PASS: legacy root-owned state repaired, preparation idempotent'

server_pid=$(pidof system_server)
[ -n "$server_pid" ]
printf '%s\n' "$server_pid" > "$test_dir/marker"
zygisk_pid_marker_alive "$test_dir/marker"
printf '%s 5\n' "$server_pid" > "$test_dir/marker"
zygisk_pid_marker_alive "$test_dir/marker"
printf 'invalid%s 5\n' "$server_pid" > "$test_dir/marker"
if zygisk_pid_marker_alive "$test_dir/marker"; then exit 1; fi
printf '%s 5\n' "$$" > "$test_dir/marker"
if zygisk_pid_marker_alive "$test_dir/marker"; then exit 1; fi
if zygisk_pid_marker_alive "$test_dir/missing"; then exit 1; fi
echo 'PASS: live PID and ready marker accepted; invalid, non-server, missing rejected'
