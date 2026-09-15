package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbhf {
    private static final AtomicLong zza = new AtomicLong();
    private final String zzb;
    private final String zzc;
    private final long zzd;

    zzbhf(String str, String str2, long j) {
        if (str == null) {
            throw new NullPointerException("typeName");
        }
        if (!(!str.isEmpty())) {
            throw new IllegalArgumentException("empty type");
        }
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j;
    }

    public static zzbhf zza(Class cls, String str) {
        if (cls == null) {
            throw new NullPointerException("type");
        }
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return zzb(simpleName, str);
    }

    public static zzbhf zzb(String str, String str2) {
        return new zzbhf(str, str2, zza.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.zzb;
        int length = String.valueOf(str).length();
        long j = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(j).length() + 1);
        sb2.append(str);
        sb2.append("<");
        sb2.append(j);
        sb2.append(">");
        sb.append(sb2.toString());
        String str2 = this.zzc;
        if (str2 != null) {
            sb.append(": (");
            sb.append(str2);
            sb.append(')');
        }
        return sb.toString();
    }

    public final long zzc() {
        return this.zzd;
    }
}
