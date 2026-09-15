package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbwf implements zzbsu {
    private final zzbwd zza;

    @Override // com.google.android.libraries.places.internal.zzbsu
    public final Object zza() {
        return zzbwe.zza(this.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzbsu
    public final Object zzb(Object obj) {
        zzbwe.zzb(this.zza, obj);
        return null;
    }

    private zzbwf(zzbwd zzbwdVar) {
        this.zza = zzbwdVar;
    }

    public static zzbwf zzc(zzbwd zzbwdVar) {
        return new zzbwf(zzbwdVar);
    }
}
