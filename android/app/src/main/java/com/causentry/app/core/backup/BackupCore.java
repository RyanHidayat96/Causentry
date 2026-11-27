package com.causentry.app.core.backup;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/**
 * Pure Java JSON backup inspection and config merge fallback (no Android framework dependencies).
 */
public final class BackupCore {
    private BackupCore() {}

    private static final class JNull {}
    private static final JNull J_NULL = new JNull();

    private static final class JNum {
        final String raw;
        final Long asLong;
        JNum(String raw, Long asLong) {
            this.raw = raw;
            this.asLong = asLong;
        }
    }

    private static final class JsonParser {
        private final String s;
        private int i;

        JsonParser(String s) {
            this.s = s;
        }

        Object parseRoot() {
            skipWs();
            Object v = parseValue();
            if (v == null) return null;
            skipWs();
            return i == s.length() ? v : null;
        }

        private void skipWs() {
            while (i < s.length()) {
                char c = s.charAt(i);
                if (c == ' ' || c == '\t' || c == '\r' || c == '\n') i++; else break;
            }
        }

        private Object parseValue() {
            skipWs();
            if (i >= s.length()) return null;
            char c = s.charAt(i);
            if (c == '{') return parseObj();
            if (c == '[') return parseArr();
            if (c == '"') return parseStr();
            if (c == 't' && s.startsWith("true", i)) { i += 4; return Boolean.TRUE; }
            if (c == 'f' && s.startsWith("false", i)) { i += 5; return Boolean.FALSE; }
            if (c == 'n' && s.startsWith("null", i)) { i += 4; return J_NULL; }
            return parseNum();
        }

        private LinkedHashMap<String, Object> parseObj() {
            if (i >= s.length() || s.charAt(i) != '{') return null;
            i++;
            LinkedHashMap<String, Object> map = new LinkedHashMap<>();
            skipWs();
            if (i < s.length() && s.charAt(i) == '}') { i++; return map; }
            while (true) {
                skipWs();
                String key = parseStr();
                if (key == null) return null;
                skipWs();
                if (i >= s.length() || s.charAt(i) != ':') return null;
                i++;
                Object v = parseValue();
                if (v == null) return null;
                map.put(key, v);
                skipWs();
                if (i >= s.length()) return null;
                char sep = s.charAt(i);
                if (sep == ',') { i++; }
                else if (sep == '}') { i++; return map; }
                else return null;
            }
        }

        private ArrayList<Object> parseArr() {
            if (i >= s.length() || s.charAt(i) != '[') return null;
            i++;
            ArrayList<Object> list = new ArrayList<>();
            skipWs();
            if (i < s.length() && s.charAt(i) == ']') { i++; return list; }
            while (true) {
                Object v = parseValue();
                if (v == null) return null;
                list.add(v);
                skipWs();
                if (i >= s.length()) return null;
                char sep = s.charAt(i);
                if (sep == ',') { i++; }
                else if (sep == ']') { i++; return list; }
                else return null;
            }
        }

        private String parseStr() {
            if (i >= s.length() || s.charAt(i) != '"') return null;
            i++;
            StringBuilder sb = new StringBuilder();
            while (i < s.length()) {
                char c = s.charAt(i++);
                if (c == '"') return sb.toString();
                if (c < 0x20) return null;
                if (c == '\\') {
                    if (i >= s.length()) return null;
                    char esc = s.charAt(i++);
                    switch (esc) {
                        case '"': sb.append('"'); break;
                        case '\\': sb.append('\\'); break;
                        case '/': sb.append('/'); break;
                        case 'b': sb.append('\b'); break;
                        case 'f': sb.append('\f'); break;
                        case 'n': sb.append('\n'); break;
                        case 'r': sb.append('\r'); break;
                        case 't': sb.append('\t'); break;
                        case 'u':
                            if (i + 4 > s.length()) return null;
                            try {
                                int cp = Integer.parseInt(s.substring(i, i + 4), 16);
                                sb.append((char) cp);
                                i += 4;
                            } catch (NumberFormatException e) {
                                return null;
                            }
                            break;
                        default: return null;
                    }
                } else {
                    sb.append(c);
                }
            }
            return null;
        }

        private JNum parseNum() {
            int start = i;
            if (i < s.length() && s.charAt(i) == '-') i++;
            if (i >= s.length() || s.charAt(i) < '0' || s.charAt(i) > '9') return null;
            if (s.charAt(i) == '0') {
                i++;
            } else {
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') i++;
            }
            boolean isInt = true;
            if (i < s.length() && s.charAt(i) == '.') {
                isInt = false;
                i++;
                if (i >= s.length() || s.charAt(i) < '0' || s.charAt(i) > '9') return null;
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') i++;
            }
            if (i < s.length() && (s.charAt(i) == 'e' || s.charAt(i) == 'E')) {
                isInt = false;
                i++;
                if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
                if (i >= s.length() || s.charAt(i) < '0' || s.charAt(i) > '9') return null;
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') i++;
            }
            String raw = s.substring(start, i);
            Long l = null;
            if (isInt) {
                try { l = Long.parseLong(raw); } catch (NumberFormatException ignored) {}
            }
            return new JNum(raw, l);
        }
    }

    private static String escapeJsonStr(String s) {
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

    @SuppressWarnings("unchecked")
    private static void emitJson(Object v, StringBuilder sb) {
        if (v == null || v == J_NULL) {
            sb.append("null");
        } else if (v instanceof Boolean) {
            sb.append(((Boolean) v) ? "true" : "false");
        } else if (v instanceof JNum) {
            sb.append(((JNum) v).raw);
        } else if (v instanceof String) {
            sb.append('"').append(escapeJsonStr((String) v)).append('"');
        } else if (v instanceof List) {
            List<Object> list = (List<Object>) v;
            sb.append('[');
            for (int idx = 0; idx < list.size(); idx++) {
                if (idx > 0) sb.append(',');
                emitJson(list.get(idx), sb);
            }
            sb.append(']');
        } else if (v instanceof Map) {
            Map<String, Object> map = (Map<String, Object>) v;
            sb.append('{');
            boolean first = true;
            for (Map.Entry<String, Object> e : map.entrySet()) {
                if (!first) sb.append(',');
                first = false;
                sb.append('"').append(escapeJsonStr(e.getKey())).append("\":");
                emitJson(e.getValue(), sb);
            }
            sb.append('}');
        }
    }

    private static String optString(Map<String, Object> obj, String key, String def) {
        Object v = obj.get(key);
        return v instanceof String ? (String) v : def;
    }

    private static boolean optBool(Map<String, Object> obj, String key, boolean def) {
        Object v = obj.get(key);
        return v instanceof Boolean ? (Boolean) v : def;
    }

    private static int optInt(Map<String, Object> obj, String key, int def) {
        Object v = obj.get(key);
        if (v instanceof JNum && ((JNum) v).asLong != null) {
            return ((JNum) v).asLong.intValue();
        }
        return def;
    }

    @SuppressWarnings("unchecked")
    private static LinkedHashMap<String, Object> optObj(Map<String, Object> obj, String key) {
        Object v = obj.get(key);
        return v instanceof LinkedHashMap ? (LinkedHashMap<String, Object>) v : null;
    }

    @SuppressWarnings("unchecked")
    private static List<String> optStringList(Map<String, Object> obj, String key) {
        Object v = obj.get(key);
        List<String> out = new ArrayList<>();
        if (v instanceof List) {
            for (Object item : (List<Object>) v) {
                if (item instanceof String && !((String) item).isEmpty()) {
                    out.add((String) item);
                }
            }
        }
        return out;
    }

    private static List<Object> toJsonList(List<String> values) {
        return new ArrayList<>(values);
    }

    private static String makeError(String msg) {
        return "{\"ok\":false,\"error\":\"" + escapeJsonStr(msg) + "\"}";
    }

    @SuppressWarnings("unchecked")
    public static String inspectBackupJson(String rawJson) {
        if (rawJson == null) return makeError("Invalid JSON object");
        String clean = rawJson.replace("\uFEFF", "").trim();
        Object parsed = new JsonParser(clean).parseRoot();
        if (!(parsed instanceof LinkedHashMap)) {
            return makeError("Invalid JSON object");
        }
        LinkedHashMap<String, Object> root = (LinkedHashMap<String, Object>) parsed;
        LinkedHashMap<String, Object> out = new LinkedHashMap<>();

        if ("causentry_backup".equals(optString(root, "format", ""))) {
            LinkedHashMap<String, Object> cfg = optObj(root, "config");
            if (cfg == null) cfg = new LinkedHashMap<>();
            int ver = optInt(root, "version", 1);
            List<String> targets = optStringList(cfg, "targets");
            LinkedHashMap<String, Object> tpls = optObj(cfg, "hideTemplates");
            List<String> tplNames = tpls != null ? new ArrayList<>(tpls.keySet()) : new ArrayList<>();
            LinkedHashMap<String, Object> appsObj = optObj(cfg, "apps");
            LinkedHashMap<String, Object> storageObj = optObj(cfg, "storageRules");
            int storageCount = storageObj == null ? 0
                : optStringList(storageObj, "hiddenRootEntryNames").size()
                    + optStringList(storageObj, "hiddenRelativePaths").size();
            int hardenedCount = optStringList(cfg, "hardened").size();
            int appPolicyCount = appsObj == null ? 0 : appsObj.size();

            out.put("ok", Boolean.TRUE);
            out.put("format", "Causentry v" + ver);
            out.put("sourceVersion", new JNum(Integer.toString(ver), (long) ver));
            out.put("targetCount", new JNum(Integer.toString(targets.size()), (long) targets.size()));
            out.put("templateCount", new JNum(Integer.toString(tplNames.size()), (long) tplNames.size()));
            out.put("hardenedCount", new JNum(Integer.toString(hardenedCount), (long) hardenedCount));
            out.put("appPolicyCount", new JNum(Integer.toString(appPolicyCount), (long) appPolicyCount));
            out.put("storageRuleCount", new JNum(Integer.toString(storageCount), (long) storageCount));
            out.put("systemCloak", optBool(cfg, "systemCloak", false));
            out.put("hideMode", optString(cfg, "hideMode", "none"));
            out.put("targetNames", toJsonList(targets));
            out.put("templateNames", toJsonList(tplNames));
            out.put("config", cfg);

            StringBuilder sb = new StringBuilder();
            emitJson(out, sb);
            return sb.toString();
        }

        if (root.containsKey("hideTemplates") || root.containsKey("apps") || root.containsKey("templates")) {
            List<String> targets = optStringList(root, "targets");
            LinkedHashMap<String, Object> tpls = optObj(root, "hideTemplates");
            if (tpls == null) tpls = optObj(root, "templates");
            List<String> tplNames = tpls != null ? new ArrayList<>(tpls.keySet()) : new ArrayList<>();

            LinkedHashMap<String, Object> cfgMap = new LinkedHashMap<>(root);
            if (!cfgMap.containsKey("hideTemplates") && cfgMap.containsKey("templates")) {
                cfgMap.put("hideTemplates", cfgMap.get("templates"));
            }

            LinkedHashMap<String, Object> appsObj = optObj(root, "apps");
            int appPolicyCount = appsObj == null ? 0 : appsObj.size();

            out.put("ok", Boolean.TRUE);
            out.put("format", root.containsKey("templates") ? "HMA-OSS" : "Direct Config");
            out.put("sourceVersion", new JNum("1", 1L));
            out.put("targetCount", new JNum(Integer.toString(targets.size()), (long) targets.size()));
            out.put("templateCount", new JNum(Integer.toString(tplNames.size()), (long) tplNames.size()));
            out.put("hardenedCount", new JNum("0", 0L));
            out.put("appPolicyCount", new JNum(Integer.toString(appPolicyCount), (long) appPolicyCount));
            out.put("storageRuleCount", new JNum("0", 0L));
            out.put("systemCloak", Boolean.FALSE);
            out.put("hideMode", "none");
            out.put("targetNames", toJsonList(targets));
            out.put("templateNames", toJsonList(tplNames));
            out.put("config", cfgMap);

            StringBuilder sb = new StringBuilder();
            emitJson(out, sb);
            return sb.toString();
        }

        return makeError("Unrecognized backup format. File must be a Causentry or HMA-OSS JSON backup.");
    }

    private static List<Object> mergeStringList(
        List<String> currentValues,
        Map<String, Object> imported,
        String key,
        boolean replaceAll
    ) {
        if (!imported.containsKey(key)) return toJsonList(currentValues);
        List<String> imp = optStringList(imported, key);
        if (replaceAll) return toJsonList(imp);
        LinkedHashSet<String> merged = new LinkedHashSet<>(currentValues);
        merged.addAll(imp);
        return toJsonList(new ArrayList<>(merged));
    }

    private static LinkedHashMap<String, Object> mergeAppEntry(
        Map<String, Object> raw,
        Map<String, Object> prev
    ) {
        boolean devOff = optBool(raw, "devOff", prev != null && optBool(prev, "devOff", false));
        boolean mock = optBool(raw, "mock", prev != null && optBool(prev, "mock", false));
        boolean isolate = optBool(raw, "isolate", prev != null && optBool(prev, "isolate", false));
        boolean accOff = optBool(raw, "accOff", prev != null && optBool(prev, "accOff", false));
        String tmpl = optString(raw, "hideTemplate", "");
        if (tmpl.isEmpty() && prev != null) {
            tmpl = optString(prev, "hideTemplate", "");
        }
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("devOff", devOff);
        map.put("mock", mock);
        map.put("isolate", isolate);
        map.put("accOff", accOff);
        if (!tmpl.isEmpty()) map.put("hideTemplate", tmpl);
        return map;
    }

    @SuppressWarnings("unchecked")
    public static String mergeBackupConfigJson(String currentJson, String importedJson, boolean replaceAll) {
        if (currentJson == null || importedJson == null) return "";
        Object curParsed = new JsonParser(currentJson.trim()).parseRoot();
        Object impParsed = new JsonParser(importedJson.trim()).parseRoot();
        if (!(curParsed instanceof LinkedHashMap) || !(impParsed instanceof LinkedHashMap)) return "";

        LinkedHashMap<String, Object> current = (LinkedHashMap<String, Object>) curParsed;
        LinkedHashMap<String, Object> imported = (LinkedHashMap<String, Object>) impParsed;
        LinkedHashMap<String, Object> out = new LinkedHashMap<>();

        LinkedHashSet<String> mergedTargets = replaceAll
            ? new LinkedHashSet<>()
            : new LinkedHashSet<>(optStringList(current, "targets"));
        mergedTargets.addAll(optStringList(imported, "targets"));
        out.put("targets", toJsonList(new ArrayList<>(mergedTargets)));

        LinkedHashMap<String, Object> curApps = optObj(current, "apps");
        if (curApps == null) curApps = new LinkedHashMap<>();
        LinkedHashMap<String, Object> appsMap = new LinkedHashMap<>();
        if (!replaceAll) {
            for (Map.Entry<String, Object> e : curApps.entrySet()) {
                if (e.getValue() instanceof LinkedHashMap) appsMap.put(e.getKey(), e.getValue());
            }
        }
        LinkedHashMap<String, Object> impApps = optObj(imported, "apps");
        if (impApps != null) {
            for (Map.Entry<String, Object> e : impApps.entrySet()) {
                if (e.getValue() instanceof LinkedHashMap) {
                    LinkedHashMap<String, Object> prev = optObj(curApps, e.getKey());
                    appsMap.put(e.getKey(), mergeAppEntry((LinkedHashMap<String, Object>) e.getValue(), prev));
                }
            }
        }
        out.put("apps", appsMap);

        LinkedHashMap<String, Object> curTpls = optObj(current, "hideTemplates");
        if (curTpls == null) curTpls = new LinkedHashMap<>();
        LinkedHashMap<String, Object> tplsMap = new LinkedHashMap<>();
        if (!replaceAll) {
            for (Map.Entry<String, Object> e : curTpls.entrySet()) {
                if (e.getValue() instanceof List) tplsMap.put(e.getKey(), e.getValue());
            }
        }
        LinkedHashMap<String, Object> impTpls = optObj(imported, "hideTemplates");
        if (impTpls == null) impTpls = optObj(imported, "templates");
        if (impTpls != null) {
            for (Map.Entry<String, Object> e : impTpls.entrySet()) {
                tplsMap.put(e.getKey(), e.getValue() instanceof List ? e.getValue() : new ArrayList<>());
            }
        }
        out.put("hideTemplates", tplsMap);

        out.put("hardened", mergeStringList(optStringList(current, "hardened"), imported, "hardened", replaceAll));
        out.put("denylist", mergeStringList(optStringList(current, "denylist"), imported, "denylist", replaceAll));

        boolean curSysCloak = optBool(current, "systemCloak", true);
        out.put("systemCloak", imported.containsKey("systemCloak")
            ? optBool(imported, "systemCloak", curSysCloak) : curSysCloak);

        String curHideMode = optString(current, "hideMode", "cloak");
        String impHideMode = optString(imported, "hideMode", curHideMode);
        if (impHideMode.isEmpty()) impHideMode = curHideMode;
        out.put("hideMode", imported.containsKey("hideMode") ? impHideMode : curHideMode);

        out.put("cloakPackages", imported.containsKey("cloakPackages")
            ? toJsonList(optStringList(imported, "cloakPackages"))
            : toJsonList(optStringList(current, "cloakPackages")));

        LinkedHashMap<String, Object> storageVal = optObj(imported, "storageRules");
        if (storageVal == null) storageVal = optObj(current, "storageRules");
        if (storageVal == null) {
            storageVal = new LinkedHashMap<>();
            storageVal.put("hiddenRootEntryNames", new ArrayList<>());
            storageVal.put("hiddenRelativePaths", new ArrayList<>());
        }
        out.put("storageRules", storageVal);

        out.put("autoDevOff", optBool(imported, "autoDevOff", optBool(current, "autoDevOff", true)));
        out.put("hideMockLocation", optBool(imported, "hideMockLocation", optBool(current, "hideMockLocation", true)));
        out.put("alwaysHidden", optBool(imported, "alwaysHidden", optBool(current, "alwaysHidden", false)));
        out.put("susfs", optBool(imported, "susfs", optBool(current, "susfs", true)));
        out.put("hideRootApps", optBool(imported, "hideRootApps", optBool(current, "hideRootApps", false)));
        out.put("uiApk", optBool(imported, "uiApk", optBool(current, "uiApk", true)));

        StringBuilder sb = new StringBuilder();
        emitJson(out, sb);
        return sb.toString();
    }
}
