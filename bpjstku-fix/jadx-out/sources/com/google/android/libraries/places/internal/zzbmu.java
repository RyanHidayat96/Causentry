package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbmu extends zzbmj {
    final zzbfh zza;
    final zzbjv zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbmu(zzbna zzbnaVar, zzbfh zzbfhVar, zzbjv zzbjvVar) {
        super(zzbnaVar.zzj());
        Objects.requireNonNull(zzbnaVar);
        this.zza = zzbfhVar;
        this.zzb = zzbjvVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbmj
    public final void zza() {
        this.zza.zzc(this.zzb, new zzbip());
    }
}
