package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzsc {
    public static final zzsc zza = new zzsb();

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogSite{ class=");
        sb.append(zza());
        sb.append(", method=");
        sb.append(zzb());
        sb.append(", line=0 }");
        return sb.toString();
    }

    public abstract String zza();

    public abstract String zzb();
}
