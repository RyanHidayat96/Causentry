package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class KeysMap {
    private final Map<String, String> keys = new HashMap();
    private final int maxEntries;
    private final int maxEntryLength;

    public KeysMap(int i, int i2) {
        this.maxEntries = i;
        this.maxEntryLength = i2;
    }

    public Map<String, String> getKeys() {
        Map<String, String> mapUnmodifiableMap;
        synchronized (this) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(this.keys));
        }
        return mapUnmodifiableMap;
    }

    public boolean setKey(String str, String str2) {
        synchronized (this) {
            String strSanitizeKey = sanitizeKey(str);
            if (this.keys.size() >= this.maxEntries && !this.keys.containsKey(strSanitizeKey)) {
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder("Ignored entry \"");
                sb.append(str);
                sb.append("\" when adding custom keys. Maximum allowable: ");
                sb.append(this.maxEntries);
                logger.w(sb.toString());
                return false;
            }
            String strSanitizeString = sanitizeString(str2, this.maxEntryLength);
            if (CommonUtils.nullSafeEquals(this.keys.get(strSanitizeKey), strSanitizeString)) {
                return false;
            }
            Map<String, String> map = this.keys;
            if (str2 == null) {
                strSanitizeString = "";
            }
            map.put(strSanitizeKey, strSanitizeString);
            return true;
        }
    }

    public void setKeys(Map<String, String> map) {
        synchronized (this) {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String strSanitizeKey = sanitizeKey(entry.getKey());
                if (this.keys.size() < this.maxEntries || this.keys.containsKey(strSanitizeKey)) {
                    String value = entry.getValue();
                    this.keys.put(strSanitizeKey, value == null ? "" : sanitizeString(value, this.maxEntryLength));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder();
                sb.append("Ignored ");
                sb.append(i);
                sb.append(" entries when adding custom keys. Maximum allowable: ");
                sb.append(this.maxEntries);
                logger.w(sb.toString());
            }
        }
    }

    private String sanitizeKey(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        return sanitizeString(str, this.maxEntryLength);
    }

    public static String sanitizeString(String str, int i) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i ? strTrim.substring(0, i) : strTrim;
    }
}
