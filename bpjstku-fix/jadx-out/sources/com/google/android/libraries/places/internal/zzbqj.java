package com.google.android.libraries.places.internal;

import defpackage.ConfigProvider;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqj {
    private static final long zza = TimeUnit.SECONDS.toNanos(1);

    public static List zza(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List zzb(Map map, String str) {
        List listZza = zza(map, str);
        if (listZza == null) {
            return null;
        }
        zzj(listZza);
        return listZza;
    }

    public static List zzc(Map map, String str) {
        List listZza = zza(map, str);
        if (listZza == null) {
            return null;
        }
        for (int i = 0; i < listZza.size(); i++) {
            if (!(listZza.get(i) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listZza.get(i), Integer.valueOf(i), listZza));
            }
        }
        return listZza;
    }

    public static Map zzd(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static Double zze(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Integer zzf(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d = (Double) obj;
        int iIntValue = d.intValue();
        if (iIntValue == d.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        new StringBuilder(String.valueOf(d).length() + 31);
        Objects.toString(d);
        throw new ClassCastException("Number expected to be integer: ".concat(String.valueOf(d)));
    }

    public static String zzg(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long zzh(Map map, String str) {
        boolean z;
        String strSubstring;
        int iCharAt;
        String strZzg = zzg(map, str);
        if (strZzg == null) {
            return null;
        }
        try {
            if (strZzg.isEmpty() || strZzg.charAt(strZzg.length() - 1) != 's') {
                throw new ParseException("Invalid duration string: ".concat(strZzg), 0);
            }
            if (strZzg.charAt(0) == '-') {
                strZzg = strZzg.substring(1);
                z = true;
            } else {
                z = false;
            }
            String strSubstring2 = strZzg.substring(0, strZzg.length() - 1);
            int iIndexOf = strSubstring2.indexOf(46);
            if (iIndexOf != -1) {
                strSubstring = strSubstring2.substring(iIndexOf + 1);
                strSubstring2 = strSubstring2.substring(0, iIndexOf);
            } else {
                strSubstring = "";
            }
            long jB = Long.parseLong(strSubstring2);
            if (strSubstring.isEmpty()) {
                iCharAt = 0;
            } else {
                iCharAt = 0;
                for (int i = 0; i < 9; i++) {
                    iCharAt *= 10;
                    if (i < strSubstring.length()) {
                        if (strSubstring.charAt(i) < '0' || strSubstring.charAt(i) > '9') {
                            throw new ParseException("Invalid nanoseconds.", 0);
                        }
                        iCharAt += strSubstring.charAt(i) - '0';
                    }
                }
            }
            if (jB < 0) {
                throw new ParseException("Invalid duration string: ".concat(String.valueOf(strZzg)), 0);
            }
            if (z) {
                jB = -jB;
                iCharAt = -iCharAt;
            }
            long j = iCharAt;
            try {
                long j2 = zza;
                if (j <= (-j2) || j >= j2) {
                    jB = ConfigProvider.b(jB, j / j2);
                    iCharAt = (int) (j % j2);
                }
                if (jB > 0 && iCharAt < 0) {
                    jB--;
                    iCharAt = (int) (((long) iCharAt) + j2);
                }
                if (jB < 0 && iCharAt > 0) {
                    jB++;
                    iCharAt = (int) (((long) iCharAt) - j2);
                }
                if (jB >= -315576000000L && jB <= 315576000000L) {
                    long j3 = iCharAt;
                    if (j3 >= -999999999 && j3 < j2 && ((jB >= 0 && iCharAt >= 0) || (jB <= 0 && iCharAt <= 0))) {
                        long nanos = TimeUnit.SECONDS.toNanos(jB);
                        long j4 = nanos + j3;
                        if (!(((nanos ^ j4) >= 0) | ((nanos ^ j3) < 0))) {
                            j4 = ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
                        }
                        return Long.valueOf(j4);
                    }
                }
                throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(jB), Integer.valueOf(iCharAt)));
            } catch (IllegalArgumentException unused) {
                throw new ParseException("Duration value is out of range.", 0);
            }
        } catch (ParseException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Boolean zzi(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List zzj(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
        return list;
    }
}
