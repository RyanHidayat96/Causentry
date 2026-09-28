#!/system/bin/sh
# inotifyd callback: process only fully published JSON command files.
DIR=${CAUSENTRY_DIR:-/data/adb/causentry}
CMD_DIR=/data/data/com.causentry.app/files/cmd

for command in "$CMD_DIR"/*.json; do
  [ -f "$command" ] || exit 0
  exec timeout 8 /system/bin/sh "$DIR/uirpc.sh" serve >/dev/null 2>&1
done

exit 0
