package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public class zzsd {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    protected zzsd(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }

    public static zzsd zza(String str, Class cls) {
        return new zzsd(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        String name2 = cls.getName();
        int length = String.valueOf(name).length();
        int length2 = String.valueOf(name2).length();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(length + 1 + str.length() + 1 + length2 + 1);
        sb.append(name);
        sb.append("/");
        sb.append(str);
        sb.append("[");
        sb.append(name2);
        sb.append("]");
        return sb.toString();
    }

    private zzsd(String str, Class cls, boolean z, boolean z2) {
        zztw.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z;
    }

    public final boolean zzb() {
        return this.zzc;
    }
}
