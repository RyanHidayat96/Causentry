package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaoy {
    private final zzbip zza;
    private final zzbfd zzb;
    private final String zzc;

    public static zzaoy zza(zzbiu zzbiuVar, zzbfd zzbfdVar, zzbip zzbipVar, String str) {
        return new zzaoy(2, zzbiuVar, null, zzbfdVar, zzbipVar, str);
    }

    private zzaoy(int i, zzbiu zzbiuVar, String str, zzbfd zzbfdVar, zzbip zzbipVar, String str2) {
        this.zzb = zzbfdVar;
        this.zza = zzbipVar;
        this.zzc = str2;
    }

    public final zzbip zzb() {
        return this.zza;
    }

    public final zzbfd zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }
}
