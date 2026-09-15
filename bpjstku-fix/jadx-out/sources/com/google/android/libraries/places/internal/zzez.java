package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzez {
    private final String zza;

    public static zzez zza(String str) {
        return new zzez(str);
    }

    public static zzez zzb(zzez zzezVar, zzez zzezVar2) {
        return new zzez(String.valueOf(zzezVar.zza).concat(String.valueOf(zzezVar2.zza)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzez) {
            return this.zza.equals(((zzez) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    private zzez(String str) {
        this.zza = str;
    }

    public final String toString() {
        return this.zza;
    }
}
