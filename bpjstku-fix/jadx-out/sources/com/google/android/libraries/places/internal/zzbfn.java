package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfn {
    private zzbfd zza = zzbfd.zza;
    private int zzb;
    private boolean zzc;

    zzbfn() {
    }

    public final zzbfn zza(zzbfd zzbfdVar) {
        if (zzbfdVar == null) {
            throw new NullPointerException("callOptions cannot be null");
        }
        this.zza = zzbfdVar;
        return this;
    }

    public final zzbfo zzd() {
        return new zzbfo(this.zza, this.zzb, this.zzc);
    }

    public final zzbfn zzb(int i) {
        this.zzb = i;
        return this;
    }

    public final zzbfn zzc(boolean z) {
        this.zzc = z;
        return this;
    }
}
