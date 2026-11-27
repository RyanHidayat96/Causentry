package com.causentry.app.core.forensic;

/**
 * Pure Java forensic log parser and crash classifier fallback (no Android framework dependencies).
 */
public final class ForensicCore {
    private ForensicCore() {}

    private static String jsonEscape(String s) {
        StringBuilder sb = new StringBuilder(s.length() + 8);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '\\': sb.append("\\\\"); break;
                case '"': sb.append("\\\""); break;
                case '\b': sb.append("\\b"); break;
                case '\f': sb.append("\\f"); break;
                case '\n': sb.append("\\n"); break;
                case '\r': sb.append("\\r"); break;
                case '\t': sb.append("\\t"); break;
                default:
                    if (ch < 0x20) {
                        String hex = Integer.toHexString(ch);
                        sb.append("\\u");
                        for (int p = hex.length(); p < 4; p++) sb.append('0');
                        sb.append(hex);
                    } else {
                        sb.append(ch);
                    }
            }
        }
        return sb.toString();
    }

    private static boolean isAsciiDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    private static boolean isTimestampPrefix(String raw) {
        if (raw.length() < 18) return false;
        return isAsciiDigit(raw.charAt(0)) && isAsciiDigit(raw.charAt(1))
            && raw.charAt(2) == '-'
            && isAsciiDigit(raw.charAt(3)) && isAsciiDigit(raw.charAt(4))
            && raw.charAt(5) == ' '
            && isAsciiDigit(raw.charAt(6)) && isAsciiDigit(raw.charAt(7))
            && raw.charAt(8) == ':'
            && isAsciiDigit(raw.charAt(9)) && isAsciiDigit(raw.charAt(10))
            && raw.charAt(11) == ':'
            && isAsciiDigit(raw.charAt(12)) && isAsciiDigit(raw.charAt(13))
            && raw.charAt(14) == '.'
            && isAsciiDigit(raw.charAt(15)) && isAsciiDigit(raw.charAt(16)) && isAsciiDigit(raw.charAt(17));
    }

    private static int skipSpaces(String s, int start) {
        int i = start;
        while (i < s.length() && (s.charAt(i) == ' ' || s.charAt(i) == '\t')) i++;
        return i;
    }

    private static long parsePositiveIntToken(String s, int start) {
        int i = start;
        if (i >= s.length() || !isAsciiDigit(s.charAt(i))) return -1L;
        long value = 0L;
        while (i < s.length() && isAsciiDigit(s.charAt(i))) {
            value = value * 10L + (s.charAt(i) - '0');
            if (value > Integer.MAX_VALUE) value = Integer.MAX_VALUE;
            i++;
        }
        // Pack (value in high 32 bits, nextIndex in low 32 bits)
        return (value << 32) | (i & 0xFFFFFFFFL);
    }

    private static int parseIntOrZero(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static String parseLogcatLine(String raw) {
        if (raw == null || !isTimestampPrefix(raw)) return "";
        String ts = raw.substring(0, 18);

        int pos = skipSpaces(raw, 18);
        if (pos == 18) return "";

        long pidPacked = parsePositiveIntToken(raw, pos);
        if (pidPacked < 0L) return "";
        int pid = (int) (pidPacked >>> 32);
        pos = (int) pidPacked;

        int tidStart = skipSpaces(raw, pos);
        if (tidStart == pos) return "";
        long tidPacked = parsePositiveIntToken(raw, tidStart);
        if (tidPacked < 0L) return "";
        int tid = (int) (tidPacked >>> 32);
        pos = (int) tidPacked;

        int lvlStart = skipSpaces(raw, pos);
        if (lvlStart == pos || lvlStart >= raw.length()) return "";
        char lvlChar = raw.charAt(lvlStart);
        if (lvlChar != 'V' && lvlChar != 'D' && lvlChar != 'I'
            && lvlChar != 'W' && lvlChar != 'E' && lvlChar != 'F') {
            return "";
        }
        pos = lvlStart + 1;

        int tagStart = skipSpaces(raw, pos);
        if (tagStart == pos || tagStart >= raw.length()) return "";

        int colonIdx = raw.indexOf(": ", tagStart);
        if (colonIdx < 0) return "";
        String tag = raw.substring(tagStart, colonIdx).trim();
        String msg = raw.substring(colonIdx + 2);

        int hintPid = 0;
        String hintPkg = "";
        if ("ActivityManager".equals(tag) && msg.contains("Start proc") && msg.contains(":")) {
            int idx = msg.indexOf("Start proc ");
            if (idx >= 0) {
                String rest = msg.substring(idx + 11);
                int colon = rest.indexOf(':');
                if (colon > 0) {
                    int p = parseIntOrZero(rest.substring(0, colon).trim());
                    if (p > 0) {
                        String after = rest.substring(colon + 1);
                        int endColon = after.indexOf(':');
                        String seg = endColon >= 0 ? after.substring(0, endColon) : after;
                        int slash = seg.indexOf('/');
                        String pkg = (slash >= 0 ? seg.substring(0, slash) : seg).trim();
                        if (!pkg.isEmpty()) {
                            hintPid = p;
                            hintPkg = pkg;
                        }
                    }
                }
            }
        } else if ("AndroidRuntime".equals(tag) && msg.contains("Process: ") && msg.contains("PID: ")) {
            int pIdx = msg.indexOf("Process: ");
            int pidIdx = msg.indexOf("PID: ");
            if (pIdx >= 0 && pidIdx > pIdx) {
                String pkgPart = msg.substring(pIdx + 9, pidIdx).replace(",", "").trim();
                int pidStart = skipSpaces(msg, pidIdx + 5);
                long packed = parsePositiveIntToken(msg, pidStart);
                if (packed >= 0L) {
                    int p = (int) (packed >>> 32);
                    int colon = pkgPart.indexOf(':');
                    String pkg = colon >= 0 ? pkgPart.substring(0, colon) : pkgPart;
                    if (!pkg.isEmpty()) {
                        hintPid = p;
                        hintPkg = pkg;
                    }
                }
            }
        }

        return "{\"ts\":\"" + jsonEscape(ts) + "\",\"pid\":" + pid + ",\"tid\":" + tid
            + ",\"lvl\":\"" + lvlChar + "\",\"tag\":\"" + jsonEscape(tag)
            + "\",\"msg\":\"" + jsonEscape(msg) + "\",\"hintPid\":" + hintPid
            + ",\"hintPkg\":\"" + jsonEscape(hintPkg) + "\"}";
    }

    public static String classifyCrashTrace(String trace, String pkg, String crashType) {
        String t = trace == null ? "" : trace;
        String p = pkg == null ? "" : pkg;
        String ct = crashType == null ? "" : crashType;

        String title = "App Crash (FATAL EXCEPTION)";
        String diagnosis = "";
        String fix = "";

        if (t.contains("ArrayIndexOutOfBoundsException: length=") && t.contains("index=-1")) {
            title = "PairIP Anti-Tamper Trap";
            diagnosis = "Target detected root or uncloaked indicator and triggered a deliberate bounds trap.";
            fix = "Enable Hide Developer Options + Hide Template for " + p + ".";
        } else if (t.contains("OutOfMemoryError: Failed to allocate") && t.contains("allocation with")) {
            title = "RASP Intentional OOM Trap";
            diagnosis = "Target intentionally triggered an impossible allocation to self-terminate.";
            fix = "Verify Hide Template and App-Zygote settings for " + p + ".";
        } else if (t.contains("libzimperium") || t.contains("libpairipcore")
            || t.contains("libsecneo") || t.contains("libdexguard")) {
            title = "RASP Native Self-Defense";
            diagnosis = "Native security library detected an environment anomaly.";
            fix = "Ensure target is protected with system_server package cloak and SUSFS.";
        } else if ("NATIVE_CRASH".equals(ct)) {
            title = "Native Signal Crash (SIGSEGV/SIGABRT)";
            diagnosis = "Process terminated with a native signal.";
            fix = "Inspect fault address and library offset in stack trace.";
        }

        return "{\"title\":\"" + jsonEscape(title) + "\",\"diagnosis\":\"" + jsonEscape(diagnosis)
            + "\",\"fix\":\"" + jsonEscape(fix) + "\"}";
    }

    public static String formatUptimeSeconds(long seconds) {
        if (seconds <= 0L) return "0s";
        long h = seconds / 3600L;
        long m = (seconds % 3600L) / 60L;
        long s = seconds % 60L;
        if (h > 0L) return h + "h " + m + "m";
        if (m > 0L) return m + "m " + s + "s";
        return s + "s";
    }
}
