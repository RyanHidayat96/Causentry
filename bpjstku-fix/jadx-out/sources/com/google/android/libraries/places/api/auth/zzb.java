package com.google.android.libraries.places.api.auth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzb {
    public static final zzb zza;

    static {
        zzc zzcVar = new zzc();
        zzcVar.zza(false);
        zza = zzcVar.zzd();
    }

    public abstract boolean zza();

    public abstract String zzb();

    public abstract String zzc();

    public static zza zzd() {
        return new zzc();
    }
}
