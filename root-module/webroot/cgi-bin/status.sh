#!/system/bin/sh
DIR=/data/adb/causentry
# one-shot status line (useful from a terminal / Tasker)
sh "$DIR/webroot/cgi-bin/api.sh" status "$(cat "$DIR/ui.token" 2>/dev/null)" | tail -1
