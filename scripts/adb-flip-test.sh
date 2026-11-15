#!/system/bin/sh
# Device-side ADB flip probe.
#
# Runs entirely on the phone so a host-side timeout (adb wait-for-device, ssh
# drop, Killed terminal) can never leave USB debugging disabled: the restore
# runs from a trap on EXIT/INT/TERM and, as a last resort, from the watchdog
# subshell that re-enables adb_enabled after the deadline no matter what.
#
# usage: sh /data/local/tmp/adb_flip_test.sh [package] [activity] [seconds]

PKG="${1:-com.bibit.bibitid}"
ACT="${2:-com.bibit.bibitid/.ui.BibitActivity}"
HOLD="${3:-12}"
SHOT="/sdcard/Download/adb_flip_disabled.png"
LOG="/data/local/tmp/adb_flip_test.log"

restore() {
    settings put global adb_enabled 1 >/dev/null 2>&1
    settings put global development_settings_enabled 1 >/dev/null 2>&1
    echo "$(date +%H:%M:%S) restored adb_enabled=$(settings get global adb_enabled)" >> "$LOG"
}

trap restore EXIT INT TERM

# Watchdog: restore even if this shell is killed with SIGKILL.
( sleep $((HOLD + 25)); restore; ) &

echo "$(date +%H:%M:%S) start pkg=$PKG hold=${HOLD}s" > "$LOG"

settings put global adb_enabled 0
settings put global adb_wifi_enabled 0
echo "$(date +%H:%M:%S) adb_enabled=$(settings get global adb_enabled)" >> "$LOG"

am force-stop "$PKG"
am start -n "$ACT" >> "$LOG" 2>&1
sleep "$HOLD"
screencap -p "$SHOT"
echo "$(date +%H:%M:%S) screenshot=$SHOT" >> "$LOG"

settings put global adb_enabled 1
settings put global adb_wifi_enabled 0
echo "$(date +%H:%M:%S) flipped back adb_enabled=$(settings get global adb_enabled)" >> "$LOG"
