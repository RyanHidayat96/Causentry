package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzcal implements zzbfj {
    private final zzbip zza;

    zzcal(zzbip zzbipVar) {
        if (zzbipVar == null) {
            throw new NullPointerException("extraHeaders");
        }
        this.zza = zzbipVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbfj
    public final zzbfi zza(zzbiu zzbiuVar, zzbfd zzbfdVar, zzbfe zzbfeVar) {
        return new zzcak(this, zzbfeVar.zza(zzbiuVar, zzbfdVar));
    }

    final /* synthetic */ zzbip zzb() {
        return this.zza;
    }
}
