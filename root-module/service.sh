#!/system/bin/sh
# Causentry - boot stage: harden, stage the runtime, start the daemon and the UI.
# No post-fs-data.sh on purpose: wait for Android services before touching settings.
MODDIR=${0%/*}
DIR=/data/adb/causentry
LOG="$DIR/causentry.log"
mkdir -p "$DIR" "$DIR/webroot/cgi-bin" 2>/dev/null
echo "$(date '+%m-%d %H:%M:%S') [service] starting" >> "$LOG"

# --- stage writable copies (the module dir itself is read-only) ---
for f in lib.sh apply.sh restore.sh causentryd.sh causentry-loop.sh root-apps.sh enforce-denylist.sh status.sh doctor.sh uirpc.sh appcfg.sh cloak.sh hidden.sh; do
  [ -f "$MODDIR/bin/$f" ] && cp -f "$MODDIR/bin/$f" "$DIR/$f" 2>/dev/null
done
[ -f "$MODDIR/payload/Causentry.apk" ] && cp -f "$MODDIR/payload/Causentry.apk" "$DIR/Causentry.apk" 2>/dev/null
cp -rf "$MODDIR/webroot/." "$DIR/webroot/" 2>/dev/null
chmod 700 "$DIR" 2>/dev/null
chmod 755 "$DIR"/*.sh "$DIR/webroot/cgi-bin/api.sh" 2>/dev/null
tr -d '\r' < "$DIR/causentryd.sh" > "$DIR/.causentryd.tmp" 2>/dev/null && mv -f "$DIR/.causentryd.tmp" "$DIR/causentryd.sh"

[ -f "$DIR/config.json" ] || cp -f "$MODDIR/config.default.json" "$DIR/config.json" 2>/dev/null

# optional-tool discovery (self-contained: no hard dependency on busybox)
[ -f "$DIR/lib.sh" ] && . "$DIR/lib.sh"
[ -s "$DIR/ui.token" ] || { head -c 16 /dev/urandom | od -An -tx1 | tr -d ' \n' > "$DIR/ui.token"; chmod 600 "$DIR/ui.token"; }

# --- protection layer (boot props + kernel hiding + denylist + root apps) ---
sh "$DIR/apply.sh" boot >> "$LOG" 2>&1

# --- watch daemon (supervised so a logcat hiccup cannot kill the bypass) ---
if ! pgrep -f causentry-loop.sh >/dev/null 2>&1; then
  setsid /system/bin/sh "$DIR/causentry-loop.sh" >/dev/null 2>&1 < /dev/null &
  echo "$(date '+%m-%d %H:%M:%S') [service] daemon supervisor started" >> "$LOG"
fi

# --- control UI: loopback only, token protected ---
if ensure_ui; then
  echo "$(date '+%m-%d %H:%M:%S') [service] ui ready" >> "$LOG"
else
  echo "$(date '+%m-%d %H:%M:%S') [service] no busybox: control UI skipped (CLI unaffected)" >> "$LOG"
fi
