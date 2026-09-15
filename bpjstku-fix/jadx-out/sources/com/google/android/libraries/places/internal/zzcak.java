package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzcak extends zzbgn {
    final /* synthetic */ zzcal zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcak(zzcal zzcalVar, zzbfi zzbfiVar) {
        super(zzbfiVar);
        Objects.requireNonNull(zzcalVar);
        this.zza = zzcalVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbgo, com.google.android.libraries.places.internal.zzbfi
    public final void zza(zzbfh zzbfhVar, zzbip zzbipVar) {
        zzbipVar.zzf(this.zza.zzb());
        zzf().zza(zzbfhVar, zzbipVar);
    }
}
