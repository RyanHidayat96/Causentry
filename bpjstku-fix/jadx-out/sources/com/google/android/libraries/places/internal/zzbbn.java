package com.google.android.libraries.places.internal;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
final class zzbbn {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzbbl zzbblVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzc(zzbblVar, sb, 0);
        return sb.toString();
    }

    static void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzd(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzbci.zza(new zzayy(((String) obj).getBytes(zzbap.zza))));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof zzayz) {
            sb.append(": \"");
            sb.append(zzbci.zza((zzayz) obj));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof zzbae) {
            sb.append(" {");
            zzc((zzbae) obj, sb, i + 2);
            sb.append("\n");
            zzd(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i3, "key", entry.getKey());
        zzb(sb, i3, "value", entry.getValue());
        sb.append("\n");
        zzd(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0203  */
    private static void zzc(zzbbl zzbblVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzbblVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null || !method2.getReturnType().equals(List.class)) {
                if (!strSubstring.endsWith("Map") || strSubstring.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                    i3 = 3;
                    if (hashSet.contains("set".concat(String.valueOf(strSubstring))) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                        Method method4 = (Method) entry.getValue();
                        Method method5 = (Method) map.get("has".concat(String.valueOf(strSubstring)));
                        if (method4 != null) {
                            Object objZzbq = zzbae.zzbq(method4, zzbblVar, new Object[0]);
                            if (method5 == null) {
                                if (objZzbq instanceof Boolean) {
                                    if (((Boolean) objZzbq).booleanValue()) {
                                        zzb(sb, i, strSubstring, objZzbq);
                                    }
                                } else if (objZzbq instanceof Integer) {
                                    if (((Integer) objZzbq).intValue() != 0) {
                                        zzb(sb, i, strSubstring, objZzbq);
                                    }
                                } else if (objZzbq instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objZzbq).floatValue()) != 0) {
                                        zzb(sb, i, strSubstring, objZzbq);
                                    }
                                } else if (!(objZzbq instanceof Double)) {
                                    if (objZzbq instanceof String) {
                                        zEquals = objZzbq.equals("");
                                    } else if (objZzbq instanceof zzayz) {
                                        zEquals = objZzbq.equals(zzayz.zzb);
                                    } else if (!(objZzbq instanceof zzbbl) ? !(objZzbq instanceof Enum) || ((Enum) objZzbq).ordinal() != 0 : objZzbq != ((zzbbl) objZzbq).zzbB()) {
                                        zzb(sb, i, strSubstring, objZzbq);
                                    }
                                    if (!zEquals) {
                                        zzb(sb, i, strSubstring, objZzbq);
                                    }
                                } else if (Double.doubleToRawLongBits(((Double) objZzbq).doubleValue()) != 0) {
                                    zzb(sb, i, strSubstring, objZzbq);
                                }
                            } else if (((Boolean) zzbae.zzbq(method5, zzbblVar, new Object[0])).booleanValue()) {
                                zzb(sb, i, strSubstring, objZzbq);
                            }
                        }
                    }
                } else {
                    i3 = 3;
                    zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 3), zzbae.zzbq(method, zzbblVar, new Object[0]));
                }
                i2 = i3;
            } else {
                zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 4), zzbae.zzbq(method2, zzbblVar, new Object[0]));
                i2 = 3;
            }
        }
        if (zzbblVar instanceof zzbab) {
            Iterator itZze = ((zzbab) zzbblVar).zzb.zze();
            while (itZze.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itZze.next();
                zzb(sb, i, "[525004180]", entry2.getValue());
            }
        }
        zzbcn zzbcnVar = ((zzbae) zzbblVar).zzc;
        if (zzbcnVar != null) {
            zzbcnVar.zzj(sb, i);
        }
    }

    private static void zzd(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }
}
