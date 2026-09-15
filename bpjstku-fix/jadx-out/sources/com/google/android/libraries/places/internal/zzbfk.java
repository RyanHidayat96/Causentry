package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzbfk extends zzbfe {
    private final zzbfe zza;
    private final zzbfj zzb;

    /* synthetic */ zzbfk(zzbfe zzbfeVar, zzbfj zzbfjVar, byte[] bArr) {
        this.zza = zzbfeVar;
        if (zzbfjVar == null) {
            throw new NullPointerException("interceptor");
        }
        this.zzb = zzbfjVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbfe
    public final zzbfi zza(zzbiu zzbiuVar, zzbfd zzbfdVar) {
        return this.zzb.zza(zzbiuVar, zzbfdVar, this.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzbfe
    public final String zzb() {
        return this.zza.zzb();
    }
}
