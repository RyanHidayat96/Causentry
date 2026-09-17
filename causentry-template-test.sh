#!/system/bin/sh
CAUSENTRY_DIR=/data/local/tmp/causentry-template-test
export CAUSENTRY_DIR
. /data/local/tmp/causentry-template-test/lib.sh
emit_hide_templates_json office com.new.app work
printf '\n'
emit_hide_templates_json "" "" work
