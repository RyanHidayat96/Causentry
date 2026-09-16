#!/system/bin/sh
# Run apply.sh outside the UI RPC timeout. Repeated requests are coalesced so
# rapid Save taps do not start a stack of full apply passes.
DIR=${CAUSENTRY_DIR:-/data/adb/causentry}
LOG="$DIR/causentry.log"
MARK="$DIR/.uirpc.changed"
PENDING="$DIR/.apply.pending"
LOCK="$DIR/apply.lock"
MODE="${1:-app}"
TOKEN="${2:-}"
if [ "$TOKEN" = "--run" ]; then
  TOKEN="${3:-}"
fi

mark_pending() {
  date +%s > "$PENDING" 2>/dev/null
  [ -n "$TOKEN" ] && printf '%s' "$TOKEN" > "$DIR/.apply.pending.token" 2>/dev/null
}

mark_changed() {
  date +%s > "$MARK" 2>/dev/null
}

log_async() {
  echo "$(date '+%m-%d %H:%M:%S') [apply-async] $*" >> "$LOG" 2>/dev/null
}

start_detached() {
  mark_pending
  if command -v setsid >/dev/null 2>&1; then
    setsid /system/bin/sh "$0" "$MODE" --run "$TOKEN" >/dev/null 2>&1 < /dev/null &
  else
    /system/bin/sh "$0" "$MODE" --run "$TOKEN" >/dev/null 2>&1 < /dev/null &
  fi
}

acquire_lock() {
  if mkdir "$LOCK" 2>/dev/null; then
    echo "$$" > "$LOCK/pid" 2>/dev/null
    return 0
  fi
  old=$(cat "$LOCK/pid" 2>/dev/null)
  if [ -z "$old" ] || [ ! -d "/proc/$old" ]; then
    rm -rf "$LOCK" 2>/dev/null
    if mkdir "$LOCK" 2>/dev/null; then
      echo "$$" > "$LOCK/pid" 2>/dev/null
      return 0
    fi
  fi
  return 1
}

cleanup() {
  rm -rf "$LOCK" 2>/dev/null
  mark_changed
}

if [ "${2:-}" != "--run" ]; then
  start_detached
  exit 0
fi

if ! acquire_lock; then
  mark_pending
  mark_changed
  exit 0
fi

trap cleanup EXIT INT TERM

while true; do
  current_token=$(cat "$DIR/.apply.pending.token" 2>/dev/null)
  rm -f "$PENDING" 2>/dev/null
  rm -f "$DIR/.apply.pending.token" 2>/dev/null
  log_async "apply start mode=$MODE"
  sh "$DIR/apply.sh" "$MODE" >> "$LOG" 2>&1
  rc=$?
  date +%s > "$DIR/.apply.done" 2>/dev/null
  printf '%s' "$rc" > "$DIR/.apply.rc" 2>/dev/null
  [ -n "$current_token" ] && printf '%s' "$current_token" > "$DIR/.apply.done.token" 2>/dev/null
  log_async "apply finish mode=$MODE rc=$rc"
  mark_changed
  [ -f "$PENDING" ] || exit "$rc"
done
