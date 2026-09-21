#!/usr/bin/env python3
"""Geometry audit of the Causentry native UI (phone must be connected).

Screenshots need vision to judge; layout does not. Dump every screen with uiautomator,
convert bounds to dp and flag what actually looks messy: inconsistent gutters, clipped text,
sub-48dp touch targets, tap-bleed to the screen edge.

    SERIAL=6a0706f0 python scripts/ui-geometry-audit.py
"""
import os
import re
import subprocess
import sys
import xml.etree.ElementTree as ET
from collections import Counter

S = os.environ.get("SERIAL", "6a0706f0")
PKG = "com.causentry.app"
ACT = "com.causentry.app/.UiActivity"
OUT = os.environ.get("AUDIT_OUT", "build/audit")


def sh(cmd, timeout=90):
    return subprocess.run(cmd, shell=True, capture_output=True, text=True, timeout=timeout).stdout


def dump(tag, expect=PKG, marker=None, tries=4):
    """uiautomator dump fails transiently after a window switch, and a failed dump leaves the
    previous XML behind - delete first, verify the package, retry."""
    os.makedirs(OUT, exist_ok=True)
    path = os.path.join(OUT, tag + ".xml")
    raw = ""
    for attempt in range(tries):
        sh('adb -s %s shell "rm -f /sdcard/%s.xml"' % (S, tag))
        sh('adb -s %s shell "uiautomator dump /sdcard/%s.xml >/dev/null 2>&1"' % (S, tag))
        raw = sh('adb -s %s shell "cat /sdcard/%s.xml"' % (S, tag))
        ok = raw.strip().startswith("<?xml") and (not expect or 'package="%s"' % expect in raw)
        # a marker text proves we captured the intended screen, not a flapping/stale window
        if ok and marker and marker not in raw:
            ok = False
        if ok:
            break
        print("  (retry dump %s: attempt %d)" % (tag, attempt + 1))
        sh("sleep 2")
    with open(path, "w") as fh:
        fh.write(raw)
    return path


def nodes(path):
    try:
        return list(ET.parse(path).getroot().iter("node"))
    except Exception as exc:  # noqa: BLE001
        print("parse failed", path, exc)
        return []


def bounds(n):
    return tuple(map(int, re.findall(r"-?\d+", n.get("bounds"))))


def open_screen(extra):
    sh('adb -s %s shell "am force-stop %s" >/dev/null 2>&1' % (S, PKG))
    sh("sleep 1")
    sh('adb -s %s shell "am start -n %s %s" >/dev/null 2>&1' % (S, ACT, extra))
    for _ in range(8):
        sh("sleep 2")
        fg = sh('adb -s %s shell "dumpsys activity activities | grep -m1 -i topResumedActivity"' % S)
        if PKG in fg:
            return True
    return False


def main():
    den = re.findall(r"(\d+)", sh('adb -s %s shell "wm density"' % S))
    density = int(den[-1]) / 160.0 if den else 3.25
    size = re.findall(r"(\d+)x(\d+)", sh('adb -s %s shell "wm size"' % S))
    sw, shh = map(int, size[0])
    print("screen %dx%dpx  density %.2f  = %.0fx%.0fdp\n" % (sw, shh, density, sw / density, shh / density))

    def dp(v):
        return round(v / density, 1)

    screens = {}
    for label, extra, marker in (("apps", "--ei tab 0 --ez top true", "All apps"),
                                 ("templates", "--ei tab 1 --ez top true", "CREATE TEMPLATE"),
                                 ("actions", "--ei tab 2 --ez top true", "Restore everything")):
        path = None
        for attempt in range(3):
            open_screen(extra)
            path = dump("scr_" + label, marker=marker)
            if marker in open(path).read():
                break
            print("!! %s: did not capture the %s screen - retrying" % (label, label))
        screens[label] = path

    first_pkg = None
    for n in nodes(screens["apps"]):
        t = n.get("text") or ""
        if re.fullmatch(r"[a-z0-9_]+(\.[a-z0-9_]+)+", t):
            first_pkg = t
            break
    if first_pkg:
        open_screen("--es app %s" % first_pkg)
        screens["detail"] = dump("scr_detail")

    gutters = Counter()
    problems = 0
    for label, path in screens.items():
        print("===== %s =====" % label)
        for n in nodes(path):
            text = n.get("text") or n.get("content-desc") or ""
            if not text:
                continue
            cls = n.get("class", "").split(".")[-1]
            x1, y1, x2, y2 = bounds(n)
            w, h = dp(x2 - x1), dp(y2 - y1)
            click = n.get("clickable") == "true"
            est = len(text) * 0.48 * 14
            flags = []
            if 0 < dp(x1) < 12 and cls in ("TextView", "EditText", "Button"):
                flags.append("gutter<12")
            if click and dp(x2) > sw / density - 10:
                flags.append("tap-bleed-right")
            if click and h < 44:
                flags.append("tap<44dp(%s)" % h)
            if w > 0 and h < 12 and cls in ("TextView", "EditText"):
                flags.append("clipped-height")
            if w < est * 0.55:
                flags.append("maybe-clipped(w=%s)" % w)
            if flags:
                problems += 1
            gutters[dp(x1)] += 1
            print("  %-11s [%6s,%6s -> %6s,%6s] w=%6s h=%5s %s %-24s %s"
                  % (cls, dp(x1), dp(y1), dp(x2), dp(y2), w, h, "TAP" if click else "   ",
                     " ".join(flags), text[:42]))

    print("\n===== gutter histogram (left edges) =====")
    for edge, cnt in sorted(gutters.items()):
        print("  left=%6sdp  x%d" % (edge, cnt))
    print("\nflagged rows: %d" % problems)
    return 0 if problems == 0 else 1


if __name__ == "__main__":
    sys.exit(main())
