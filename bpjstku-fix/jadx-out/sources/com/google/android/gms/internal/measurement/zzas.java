package com.google.android.gms.internal.measurement;

import androidx.collection.SieveCacheKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class zzas implements Iterable, zzao {
    private final String zza;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzar(this);
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x019c  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:115:0x0206  */
    /* JADX WARN: Code duplicated, block: B:117:0x021a  */
    /* JADX WARN: Code duplicated, block: B:119:0x022b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0245  */
    /* JADX WARN: Code duplicated, block: B:123:0x024f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0267  */
    /* JADX WARN: Code duplicated, block: B:127:0x0296  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:136:0x02de  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:140:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:142:0x0304  */
    /* JADX WARN: Code duplicated, block: B:148:0x032b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0332  */
    /* JADX WARN: Code duplicated, block: B:153:0x0336 A[LOOP:0: B:152:0x0334->B:153:0x0336, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x0349  */
    /* JADX WARN: Code duplicated, block: B:158:0x035b  */
    /* JADX WARN: Code duplicated, block: B:159:0x036f  */
    /* JADX WARN: Code duplicated, block: B:162:0x037b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0386  */
    /* JADX WARN: Code duplicated, block: B:166:0x0396  */
    /* JADX WARN: Code duplicated, block: B:167:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:170:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:171:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:174:0x03df  */
    /* JADX WARN: Code duplicated, block: B:176:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:179:0x0410  */
    /* JADX WARN: Code duplicated, block: B:181:0x041f  */
    /* JADX WARN: Code duplicated, block: B:183:0x042b  */
    /* JADX WARN: Code duplicated, block: B:185:0x043d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0453  */
    /* JADX WARN: Code duplicated, block: B:190:0x0467  */
    /* JADX WARN: Code duplicated, block: B:192:0x046b  */
    /* JADX WARN: Code duplicated, block: B:193:0x0491  */
    /* JADX WARN: Code duplicated, block: B:196:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:198:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:199:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:202:0x0507  */
    /* JADX WARN: Code duplicated, block: B:204:0x0520  */
    /* JADX WARN: Code duplicated, block: B:206:0x0523  */
    /* JADX WARN: Code duplicated, block: B:209:0x0536  */
    /* JADX WARN: Code duplicated, block: B:212:0x054d  */
    /* JADX WARN: Code duplicated, block: B:213:0x0550  */
    /* JADX WARN: Code duplicated, block: B:216:0x0569  */
    /* JADX WARN: Code duplicated, block: B:217:0x056c  */
    /* JADX WARN: Code duplicated, block: B:220:0x0580  */
    /* JADX WARN: Code duplicated, block: B:223:0x0595  */
    /* JADX WARN: Code duplicated, block: B:226:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:227:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:230:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:232:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:234:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:244:0x061a  */
    /* JADX WARN: Code duplicated, block: B:246:0x0626  */
    /* JADX WARN: Code duplicated, block: B:249:0x0634 A[LOOP:1: B:247:0x062e->B:249:0x0634, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:253:0x0653  */
    /* JADX WARN: Code duplicated, block: B:255:0x0663  */
    /* JADX WARN: Code duplicated, block: B:256:0x067c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:64:0x0104  */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0110  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x0118  */
    /* JADX WARN: Code duplicated, block: B:73:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0121  */
    /* JADX WARN: Code duplicated, block: B:76:0x0127  */
    /* JADX WARN: Code duplicated, block: B:77:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x012f  */
    /* JADX WARN: Code duplicated, block: B:81:0x013b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0141  */
    /* JADX WARN: Code duplicated, block: B:84:0x014b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0153  */
    /* JADX WARN: Code duplicated, block: B:87:0x015b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0163  */
    /* JADX WARN: Code duplicated, block: B:90:0x0168 A[PHI: r6
  0x0168: PHI (r6v9 java.lang.String) = (r6v7 java.lang.String), (r6v10 java.lang.String) binds: [B:88:0x0161, B:85:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x016b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0175  */
    /* JADX WARN: Code duplicated, block: B:96:0x017f  */
    /* JADX WARN: Code duplicated, block: B:98:0x018b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0191 A[PHI: r4 r6 r7
  0x0191: PHI (r4v63 java.lang.String) = (r4v2 java.lang.String), (r4v4 java.lang.String), (r4v64 java.lang.String) binds: [B:97:0x0189, B:95:0x017c, B:43:0x00c2] A[DONT_GENERATE, DONT_INLINE]
  0x0191: PHI (r6v46 java.lang.String) = (r6v4 java.lang.String), (r6v8 java.lang.String), (r6v47 java.lang.String) binds: [B:97:0x0189, B:95:0x017c, B:43:0x00c2] A[DONT_GENERATE, DONT_INLINE]
  0x0191: PHI (r7v17 java.lang.String) = (r7v1 java.lang.String), (r7v5 java.lang.String), (r7v18 java.lang.String) binds: [B:97:0x0189, B:95:0x017c, B:43:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcA(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        byte b;
        String strZzc;
        int iZzi;
        zzas zzasVar;
        StringBuilder sb;
        int i;
        String str7;
        zzao zzaoVarZza;
        int i2;
        double dDoubleValue;
        double dDoubleValue2;
        double dZzi;
        String strZzc2;
        zzao zzaoVarZza2;
        String str8;
        String str9;
        int iIndexOf;
        int i3;
        String str10;
        double dDoubleValue3;
        double dZzi2;
        double dMin;
        double length;
        double dZzi3;
        double dMin2;
        String str11;
        ArrayList arrayList;
        String strZzc3;
        long jZzh;
        String[] strArrSplit;
        int length2;
        int i4;
        int i5;
        boolean zIsEmpty;
        String str12;
        zzg zzgVar2;
        int iZzi2;
        int length3;
        boolean zEquals = "charAt".equals(str);
        String str13 = FirebaseAnalytics.Event.SEARCH;
        if (!zEquals && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !FirebaseAnalytics.Event.SEARCH.equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                str3 = "trim";
                if (!str3.equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
            }
            switch (str.hashCode()) {
                case -1789698943:
                    str4 = "charAt";
                    str5 = r6;
                    str6 = "toString";
                    if (str.equals(str5)) {
                        str13 = FirebaseAnalytics.Event.SEARCH;
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -1776922004:
                    str4 = "charAt";
                    str6 = "toString";
                    if (str.equals(str6)) {
                        b = 14;
                        str5 = r6;
                    }
                    str5 = r6;
                    b = -1;
                    break;
                case -1464939364:
                    str4 = "charAt";
                    if (str.equals("toLocaleLowerCase")) {
                        b = 12;
                        str6 = "toString";
                        str5 = r6;
                    }
                    str6 = "toString";
                    str5 = r6;
                    b = -1;
                    break;
                case -1361633751:
                    str4 = "charAt";
                    if (str.equals(str4)) {
                        str5 = r6;
                        str6 = "toString";
                        b = 0;
                    } else {
                        str6 = "toString";
                        str5 = r6;
                        b = -1;
                    }
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        str4 = "charAt";
                        str5 = r6;
                        str6 = "toString";
                        b = 1;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = "toString";
                        b = -1;
                    }
                    break;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        b = 13;
                        str4 = "charAt";
                        str5 = r6;
                        str6 = "toString";
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                    break;
                case -906336856:
                    if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                        b = 7;
                        str4 = "charAt";
                        str5 = r6;
                        str6 = "toString";
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                    break;
                case -726908483:
                    if (str.equals(str2)) {
                        b = 11;
                        str4 = "charAt";
                        str5 = r6;
                        str6 = "toString";
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        b = 4;
                        str4 = "charAt";
                        str5 = r6;
                        str6 = "toString";
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                    break;
                case -399551817:
                    if (str.equals("toUpperCase")) {
                        b = 15;
                        str4 = "charAt";
                        str5 = r6;
                        str6 = "toString";
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                    break;
                case 3568674:
                    if (str.equals(str3)) {
                        b = 16;
                        str4 = "charAt";
                        str5 = r6;
                        str6 = "toString";
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                    break;
                case 103668165:
                    if (str.equals("match")) {
                        b = 5;
                        str4 = "charAt";
                        str5 = r6;
                        str6 = "toString";
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        b = 8;
                        str4 = "charAt";
                        str5 = r6;
                        str6 = "toString";
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        b = 9;
                        str4 = "charAt";
                        str5 = r6;
                        str6 = "toString";
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                    break;
                case 530542161:
                    if (str.equals("substring")) {
                        b = 10;
                        str4 = "charAt";
                        str5 = r6;
                        str6 = "toString";
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        b = 6;
                        str4 = "charAt";
                        str5 = r6;
                        str6 = "toString";
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        b = 3;
                        str4 = "charAt";
                        str5 = r6;
                        str6 = "toString";
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                    break;
                default:
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                    break;
            }
            strZzc = "undefined";
            switch (b) {
                case 0:
                    zzh.zzc(str4, 1, list);
                    if (list.isEmpty()) {
                        iZzi = 0;
                    } else {
                        iZzi = (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
                    }
                    String str14 = this.zza;
                    return (iZzi >= 0 || iZzi >= str14.length()) ? zzao.zzm : new zzas(String.valueOf(str14.charAt(iZzi)));
                case 1:
                    zzasVar = this;
                    if (!list.isEmpty()) {
                        sb = new StringBuilder(zzasVar.zza);
                        for (i = 0; i < list.size(); i++) {
                            sb.append(zzgVar.zza((zzao) list.get(i)).zzc());
                        }
                        return new zzas(sb.toString());
                    }
                    return zzasVar;
                case 2:
                    zzh.zza(str5, 1, list);
                    str7 = this.zza;
                    zzaoVarZza = zzgVar.zza((zzao) list.get(0));
                    if ("length".equals(zzaoVarZza.zzc())) {
                        return zzaf.zzk;
                    }
                    double dDoubleValue4 = zzaoVarZza.zzd().doubleValue();
                    return (dDoubleValue4 == Math.floor(dDoubleValue4) || (i2 = (int) dDoubleValue4) < 0 || i2 >= str7.length()) ? zzaf.zzl : zzaf.zzk;
                case 3:
                    zzh.zzc("indexOf", 2, list);
                    String str15 = this.zza;
                    String strZzc4 = list.size() > 0 ? zzgVar.zza((zzao) list.get(0)).zzc() : "undefined";
                    if (list.size() < 2) {
                        dDoubleValue = 0.0d;
                    } else {
                        dDoubleValue = zzgVar.zza((zzao) list.get(1)).zzd().doubleValue();
                    }
                    return new zzah(Double.valueOf(str15.indexOf(strZzc4, (int) zzh.zzi(dDoubleValue))));
                case 4:
                    zzh.zzc("lastIndexOf", 2, list);
                    String str16 = this.zza;
                    String strZzc5 = list.size() > 0 ? zzgVar.zza((zzao) list.get(0)).zzc() : "undefined";
                    if (list.size() < 2) {
                        dDoubleValue2 = Double.NaN;
                    } else {
                        dDoubleValue2 = zzgVar.zza((zzao) list.get(1)).zzd().doubleValue();
                    }
                    if (Double.isNaN(dDoubleValue2)) {
                        dZzi = Double.POSITIVE_INFINITY;
                    } else {
                        dZzi = zzh.zzi(dDoubleValue2);
                    }
                    return new zzah(Double.valueOf(str16.lastIndexOf(strZzc5, (int) dZzi)));
                case 5:
                    zzh.zzc("match", 1, list);
                    String str17 = this.zza;
                    if (list.size() <= 0) {
                        strZzc2 = "";
                    } else {
                        strZzc2 = zzgVar.zza((zzao) list.get(0)).zzc();
                    }
                    Matcher matcher = Pattern.compile(strZzc2).matcher(str17);
                    return matcher.find() ? new zzae(Arrays.asList(new zzas(matcher.group()))) : zzao.zzg;
                case 6:
                    zzasVar = this;
                    zzh.zzc("replace", 2, list);
                    zzaoVarZza2 = zzao.zzf;
                    if (!list.isEmpty()) {
                        strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                        if (list.size() > 1) {
                            zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
                        }
                    }
                    str8 = strZzc;
                    str9 = zzasVar.zza;
                    iIndexOf = str9.indexOf(str8);
                    if (iIndexOf >= 0) {
                        if (zzaoVarZza2 instanceof zzai) {
                            i3 = 0;
                            zzaoVarZza2 = ((zzai) zzaoVarZza2).zza(zzgVar, Arrays.asList(new zzas(str8), new zzah(Double.valueOf(iIndexOf)), zzasVar));
                        } else {
                            i3 = 0;
                        }
                        String strSubstring = str9.substring(i3, iIndexOf);
                        String strZzc6 = zzaoVarZza2.zzc();
                        String strSubstring2 = str9.substring(iIndexOf + str8.length());
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strZzc6).length() + String.valueOf(strSubstring2).length());
                        sb2.append(strSubstring);
                        sb2.append(strZzc6);
                        sb2.append(strSubstring2);
                        return new zzas(sb2.toString());
                    }
                    return zzasVar;
                case 7:
                    zzh.zzc(str13, 1, list);
                    Matcher matcher2 = Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zza((zzao) list.get(0)).zzc()).matcher(this.zza);
                    return matcher2.find() ? new zzah(Double.valueOf(matcher2.start())) : new zzah(Double.valueOf(-1.0d));
                case 8:
                    zzh.zzc("slice", 2, list);
                    str10 = this.zza;
                    if (list.isEmpty()) {
                        dDoubleValue3 = 0.0d;
                    } else {
                        dDoubleValue3 = zzgVar.zza((zzao) list.get(0)).zzd().doubleValue();
                    }
                    dZzi2 = zzh.zzi(dDoubleValue3);
                    if (dZzi2 < 0.0d) {
                        dMin = Math.max(((double) str10.length()) + dZzi2, 0.0d);
                    } else {
                        dMin = Math.min(dZzi2, str10.length());
                    }
                    if (list.size() > 1) {
                        length = zzgVar.zza((zzao) list.get(1)).zzd().doubleValue();
                    } else {
                        length = str10.length();
                    }
                    dZzi3 = zzh.zzi(length);
                    if (dZzi3 < 0.0d) {
                        dMin2 = Math.max(((double) str10.length()) + dZzi3, 0.0d);
                    } else {
                        dMin2 = Math.min(dZzi3, str10.length());
                    }
                    int i6 = (int) dMin;
                    return new zzas(str10.substring(i6, Math.max(0, ((int) dMin2) - i6) + i6));
                case 9:
                    zzh.zzc("split", 2, list);
                    str11 = this.zza;
                    if (str11.length() == 0) {
                        return new zzae(Arrays.asList(this));
                    }
                    arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        strZzc3 = zzgVar.zza((zzao) list.get(0)).zzc();
                        if (list.size() > 1) {
                            jZzh = zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue());
                        } else {
                            jZzh = SieveCacheKt.NodeLinkMask;
                        }
                        if (jZzh == 0) {
                            return new zzae();
                        }
                        strArrSplit = str11.split(Pattern.quote(strZzc3), ((int) jZzh) + 1);
                        length2 = strArrSplit.length;
                        if (strZzc3.isEmpty() || length2 <= 0) {
                            i4 = length2;
                            i5 = 0;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i4 = length2 - 1;
                            if (!strArrSplit[i4].isEmpty()) {
                                i5 = zIsEmpty;
                                i4 = length2;
                                i5 = zIsEmpty;
                            }
                        }
                        i5 = zIsEmpty;
                        if (length2 > jZzh) {
                            i4--;
                        }
                        while (i5 < i4) {
                            arrayList.add(new zzas(strArrSplit[i5]));
                            i5++;
                        }
                    }
                    return new zzae(arrayList);
                case 10:
                    zzh.zzc("substring", 2, list);
                    str12 = this.zza;
                    if (list.isEmpty()) {
                        zzgVar2 = zzgVar;
                        iZzi2 = 0;
                    } else {
                        zzgVar2 = zzgVar;
                        iZzi2 = (int) zzh.zzi(zzgVar2.zza((zzao) list.get(0)).zzd().doubleValue());
                    }
                    if (list.size() > 1) {
                        length3 = (int) zzh.zzi(zzgVar2.zza((zzao) list.get(1)).zzd().doubleValue());
                    } else {
                        length3 = str12.length();
                    }
                    int iMin = Math.min(Math.max(iZzi2, 0), str12.length());
                    int iMin2 = Math.min(Math.max(length3, 0), str12.length());
                    return new zzas(str12.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                case 11:
                    zzh.zza(str2, 0, list);
                    return new zzas(this.zza.toUpperCase());
                case 12:
                    zzh.zza("toLocaleLowerCase", 0, list);
                    return new zzas(this.zza.toLowerCase());
                case 13:
                    zzh.zza("toLowerCase", 0, list);
                    return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
                case 14:
                    zzh.zza(str6, 0, list);
                    return this;
                case 15:
                    zzh.zza("toUpperCase", 0, list);
                    return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
                case 16:
                    zzh.zza("toUpperCase", 0, list);
                    return new zzas(this.zza.trim());
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        str2 = "toLocaleUpperCase";
        str3 = "trim";
        switch (str.hashCode()) {
            case -1789698943:
                str4 = "charAt";
                str5 = r6;
                str6 = "toString";
                if (str.equals(str5)) {
                    str13 = FirebaseAnalytics.Event.SEARCH;
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -1776922004:
                str4 = "charAt";
                str6 = "toString";
                if (str.equals(str6)) {
                    b = 14;
                    str5 = r6;
                }
                str5 = r6;
                b = -1;
                break;
            case -1464939364:
                str4 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b = 12;
                    str6 = "toString";
                    str5 = r6;
                }
                str6 = "toString";
                str5 = r6;
                b = -1;
                break;
            case -1361633751:
                str4 = "charAt";
                if (str.equals(str4)) {
                    str5 = r6;
                    str6 = "toString";
                    b = 0;
                } else {
                    str6 = "toString";
                    str5 = r6;
                    b = -1;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = "charAt";
                    str5 = r6;
                    str6 = "toString";
                    b = 1;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    b = -1;
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b = 13;
                    str4 = "charAt";
                    str5 = r6;
                    str6 = "toString";
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                b = -1;
                break;
            case -906336856:
                if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                    b = 7;
                    str4 = "charAt";
                    str5 = r6;
                    str6 = "toString";
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                b = -1;
                break;
            case -726908483:
                if (str.equals(str2)) {
                    b = 11;
                    str4 = "charAt";
                    str5 = r6;
                    str6 = "toString";
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                b = -1;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b = 4;
                    str4 = "charAt";
                    str5 = r6;
                    str6 = "toString";
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                b = -1;
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b = 15;
                    str4 = "charAt";
                    str5 = r6;
                    str6 = "toString";
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                b = -1;
                break;
            case 3568674:
                if (str.equals(str3)) {
                    b = 16;
                    str4 = "charAt";
                    str5 = r6;
                    str6 = "toString";
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                b = -1;
                break;
            case 103668165:
                if (str.equals("match")) {
                    b = 5;
                    str4 = "charAt";
                    str5 = r6;
                    str6 = "toString";
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                b = -1;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b = 8;
                    str4 = "charAt";
                    str5 = r6;
                    str6 = "toString";
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                b = -1;
                break;
            case 109648666:
                if (str.equals("split")) {
                    b = 9;
                    str4 = "charAt";
                    str5 = r6;
                    str6 = "toString";
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                b = -1;
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b = 10;
                    str4 = "charAt";
                    str5 = r6;
                    str6 = "toString";
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                b = -1;
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b = 6;
                    str4 = "charAt";
                    str5 = r6;
                    str6 = "toString";
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                b = -1;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b = 3;
                    str4 = "charAt";
                    str5 = r6;
                    str6 = "toString";
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                b = -1;
                break;
            default:
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                b = -1;
                break;
        }
        strZzc = "undefined";
        switch (b) {
            case 0:
                zzh.zzc(str4, 1, list);
                if (list.isEmpty()) {
                    iZzi = (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
                } else {
                    iZzi = 0;
                }
                String str18 = this.zza;
                if (iZzi >= 0) {
                }
                break;
            case 1:
                zzasVar = this;
                if (!list.isEmpty()) {
                    sb = new StringBuilder(zzasVar.zza);
                    while (i < list.size()) {
                        sb.append(zzgVar.zza((zzao) list.get(i)).zzc());
                    }
                    return new zzas(sb.toString());
                }
                return zzasVar;
            case 2:
                zzh.zza(str5, 1, list);
                str7 = this.zza;
                zzaoVarZza = zzgVar.zza((zzao) list.get(0));
                if ("length".equals(zzaoVarZza.zzc())) {
                    return zzaf.zzk;
                }
                double dDoubleValue5 = zzaoVarZza.zzd().doubleValue();
                if (dDoubleValue5 == Math.floor(dDoubleValue5)) {
                }
                break;
            case 3:
                zzh.zzc("indexOf", 2, list);
                String str19 = this.zza;
                String strZzc7 = list.size() > 0 ? zzgVar.zza((zzao) list.get(0)).zzc() : "undefined";
                if (list.size() < 2) {
                    dDoubleValue = 0.0d;
                } else {
                    dDoubleValue = zzgVar.zza((zzao) list.get(1)).zzd().doubleValue();
                }
                return new zzah(Double.valueOf(str19.indexOf(strZzc7, (int) zzh.zzi(dDoubleValue))));
            case 4:
                zzh.zzc("lastIndexOf", 2, list);
                String str110 = this.zza;
                String strZzc8 = list.size() > 0 ? zzgVar.zza((zzao) list.get(0)).zzc() : "undefined";
                if (list.size() < 2) {
                    dDoubleValue2 = Double.NaN;
                } else {
                    dDoubleValue2 = zzgVar.zza((zzao) list.get(1)).zzd().doubleValue();
                }
                if (Double.isNaN(dDoubleValue2)) {
                    dZzi = Double.POSITIVE_INFINITY;
                } else {
                    dZzi = zzh.zzi(dDoubleValue2);
                }
                return new zzah(Double.valueOf(str110.lastIndexOf(strZzc8, (int) dZzi)));
            case 5:
                zzh.zzc("match", 1, list);
                String str111 = this.zza;
                if (list.size() <= 0) {
                    strZzc2 = "";
                } else {
                    strZzc2 = zzgVar.zza((zzao) list.get(0)).zzc();
                }
                Matcher matcher3 = Pattern.compile(strZzc2).matcher(str111);
                if (matcher3.find()) {
                }
            case 6:
                zzasVar = this;
                zzh.zzc("replace", 2, list);
                zzaoVarZza2 = zzao.zzf;
                if (!list.isEmpty()) {
                    strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                    if (list.size() > 1) {
                        zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
                    }
                }
                str8 = strZzc;
                str9 = zzasVar.zza;
                iIndexOf = str9.indexOf(str8);
                if (iIndexOf >= 0) {
                    if (zzaoVarZza2 instanceof zzai) {
                        i3 = 0;
                        zzaoVarZza2 = ((zzai) zzaoVarZza2).zza(zzgVar, Arrays.asList(new zzas(str8), new zzah(Double.valueOf(iIndexOf)), zzasVar));
                    } else {
                        i3 = 0;
                    }
                    String strSubstring3 = str9.substring(i3, iIndexOf);
                    String strZzc9 = zzaoVarZza2.zzc();
                    String strSubstring4 = str9.substring(iIndexOf + str8.length());
                    StringBuilder sb3 = new StringBuilder(String.valueOf(strSubstring3).length() + String.valueOf(strZzc9).length() + String.valueOf(strSubstring4).length());
                    sb3.append(strSubstring3);
                    sb3.append(strZzc9);
                    sb3.append(strSubstring4);
                    return new zzas(sb3.toString());
                }
                return zzasVar;
            case 7:
                zzh.zzc(str13, 1, list);
                Matcher matcher4 = Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zza((zzao) list.get(0)).zzc()).matcher(this.zza);
                if (matcher4.find()) {
                }
            case 8:
                zzh.zzc("slice", 2, list);
                str10 = this.zza;
                if (list.isEmpty()) {
                    dDoubleValue3 = zzgVar.zza((zzao) list.get(0)).zzd().doubleValue();
                } else {
                    dDoubleValue3 = 0.0d;
                }
                dZzi2 = zzh.zzi(dDoubleValue3);
                if (dZzi2 < 0.0d) {
                    dMin = Math.max(((double) str10.length()) + dZzi2, 0.0d);
                } else {
                    dMin = Math.min(dZzi2, str10.length());
                }
                if (list.size() > 1) {
                    length = zzgVar.zza((zzao) list.get(1)).zzd().doubleValue();
                } else {
                    length = str10.length();
                }
                dZzi3 = zzh.zzi(length);
                if (dZzi3 < 0.0d) {
                    dMin2 = Math.max(((double) str10.length()) + dZzi3, 0.0d);
                } else {
                    dMin2 = Math.min(dZzi3, str10.length());
                }
                int i7 = (int) dMin;
                return new zzas(str10.substring(i7, Math.max(0, ((int) dMin2) - i7) + i7));
            case 9:
                zzh.zzc("split", 2, list);
                str11 = this.zza;
                if (str11.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    strZzc3 = zzgVar.zza((zzao) list.get(0)).zzc();
                    if (list.size() > 1) {
                        jZzh = zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue());
                    } else {
                        jZzh = SieveCacheKt.NodeLinkMask;
                    }
                    if (jZzh == 0) {
                        return new zzae();
                    }
                    strArrSplit = str11.split(Pattern.quote(strZzc3), ((int) jZzh) + 1);
                    length2 = strArrSplit.length;
                    if (strZzc3.isEmpty()) {
                        i4 = length2;
                        i5 = 0;
                    } else {
                        i4 = length2;
                        i5 = 0;
                    }
                    i5 = zIsEmpty;
                    if (length2 > jZzh) {
                        i4--;
                    }
                    while (i5 < i4) {
                        arrayList.add(new zzas(strArrSplit[i5]));
                        i5++;
                    }
                }
                return new zzae(arrayList);
            case 10:
                zzh.zzc("substring", 2, list);
                str12 = this.zza;
                if (list.isEmpty()) {
                    zzgVar2 = zzgVar;
                    iZzi2 = (int) zzh.zzi(zzgVar2.zza((zzao) list.get(0)).zzd().doubleValue());
                } else {
                    zzgVar2 = zzgVar;
                    iZzi2 = 0;
                }
                if (list.size() > 1) {
                    length3 = (int) zzh.zzi(zzgVar2.zza((zzao) list.get(1)).zzd().doubleValue());
                } else {
                    length3 = str12.length();
                }
                int iMin3 = Math.min(Math.max(iZzi2, 0), str12.length());
                int iMin4 = Math.min(Math.max(length3, 0), str12.length());
                return new zzas(str12.substring(Math.min(iMin3, iMin4), Math.max(iMin3, iMin4)));
            case 11:
                zzh.zza(str2, 0, list);
                return new zzas(this.zza.toUpperCase());
            case 12:
                zzh.zza("toLocaleLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase());
            case 13:
                zzh.zza("toLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
            case 14:
                zzh.zza(str6, 0, list);
                return this;
            case 15:
                zzh.zza("toUpperCase", 0, list);
                return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
            case 16:
                zzh.zza("toUpperCase", 0, list);
                return new zzas(this.zza.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        String str = this.zza;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzaq(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzas(this.zza);
    }

    final /* synthetic */ String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.zza;
    }
}
