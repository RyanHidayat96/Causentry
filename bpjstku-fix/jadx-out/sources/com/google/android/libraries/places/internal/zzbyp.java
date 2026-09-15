package com.google.android.libraries.places.internal;

import defpackage.isOpen;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyp implements HostnameVerifier {
    public static final zzbyp zza = new zzbyp();
    private static final Pattern zzb = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private static List zza(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    private static final boolean zzb(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            String strB = isOpen.b(str2);
            if (!strB.contains("*")) {
                return str.equals(strB);
            }
            if (!strB.startsWith("*.") || strB.indexOf(42, 1) != -1 || str.length() < strB.length() || "*.".equals(strB)) {
                return false;
            }
            String strSubstring = strB.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        String strZza;
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 2048) {
                        i3 += (127 - cCharAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i) == cCharAt2) {
                                throw new IllegalArgumentException("Unpaired surrogate at index ".concat(String.valueOf(i)));
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
                break;
            }
            i2 += (127 - cCharAt) >>> 31;
            i++;
        }
        if (i2 < length) {
            StringBuilder sb = new StringBuilder("UTF-8 length does not fit in int: ");
            sb.append(((long) i2) + 4294967296L);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 == str.length()) {
            try {
                X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
                if (zzb.matcher(str).matches()) {
                    List listZza = zza(x509Certificate, 7);
                    int size = listZza.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        if (str.equalsIgnoreCase((String) listZza.get(i4))) {
                            return true;
                        }
                    }
                    return false;
                }
                String strB = isOpen.b(str);
                List listZza2 = zza(x509Certificate, 2);
                int size2 = listZza2.size();
                int i5 = 0;
                boolean z = false;
                while (i5 < size2) {
                    if (zzb(strB, (String) listZza2.get(i5))) {
                        return true;
                    }
                    i5++;
                    z = true;
                }
                if (!z && (strZza = new zzbym(x509Certificate.getSubjectX500Principal()).zza("cn")) != null) {
                    return zzb(strB, strZza);
                }
            } catch (SSLException unused) {
            }
        }
        return false;
    }

    private zzbyp() {
    }
}
