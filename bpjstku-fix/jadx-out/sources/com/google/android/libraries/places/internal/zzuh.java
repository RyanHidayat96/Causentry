package com.google.android.libraries.places.internal;

import com.google.common.collect.ImmutableSet;
import defpackage.isOpen;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzuh {
    public static final /* synthetic */ int zza = 0;
    private static final ImmutableSet zzb = ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2("http", "https", "mailto", "ftp");
    private static final ImmutableSet zzc = ImmutableSet.TuitionPaymentFragmentbindingInflater1("audio/3gpp2", "audio/3gpp", "audio/aac", "audio/midi", "audio/mp3", "audio/mp4", "audio/mpeg", "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "image/svg+xml", "image/tiff", "image/webp", "image/x-icon", "video/mpeg", "video/mp4", "video/ogg", "video/webm", "video/x-matroska", "font/ttf");
    private static final ImmutableSet zzd = ImmutableSet.g();

    public static zzug zza(String str, zzug zzugVar) {
        char cCharAt;
        int i;
        char cCharAt2;
        char cCharAt3;
        ImmutableSet immutableSet = zzd;
        String strB = isOpen.b(str);
        Iterator it = zzb.iterator();
        while (it.hasNext()) {
            if (strB.startsWith(String.valueOf((String) it.next()).concat(":"))) {
                return new zzug(str);
            }
        }
        if (!strB.startsWith("data:")) {
            Iterator<E> it2 = immutableSet.iterator();
            while (it2.hasNext()) {
                if (strB.startsWith(String.valueOf(isOpen.b(((zzuc) it2.next()).name()).replace('_', '-')).concat(":"))) {
                    return new zzug(str);
                }
            }
            for (int i2 = 0; i2 < str.length() && (cCharAt = str.charAt(i2)) != '#' && cCharAt != '/'; i2++) {
                if (cCharAt == ':') {
                    return zzugVar;
                }
                if (cCharAt == '?') {
                    break;
                }
            }
            return new zzug(str);
        }
        String strB2 = isOpen.b(str);
        if (strB2.startsWith("data:") && strB2.length() > 5) {
            int i3 = 5;
            while (i3 < strB2.length() && (cCharAt3 = strB2.charAt(i3)) != ';' && cCharAt3 != ',') {
                i3++;
            }
            if (zzc.contains(strB2.substring(5, i3)) && strB2.startsWith(";base64,", i3) && (i = i3 + 8) < strB2.length()) {
                while (i < strB2.length() && (cCharAt2 = strB2.charAt(i)) != '=') {
                    if ((cCharAt2 >= 'a' && cCharAt2 <= 'z') || ((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 == '+' || cCharAt2 == '/')) {
                        i++;
                    }
                }
                while (i < strB2.length()) {
                    if (strB2.charAt(i) == '=') {
                        i++;
                    }
                }
                return new zzug(str);
            }
        }
        return zzugVar;
    }
}
