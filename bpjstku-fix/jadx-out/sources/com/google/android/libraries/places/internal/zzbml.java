package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbml extends zzbmj {
    final /* synthetic */ zzbna zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbml(zzbna zzbnaVar, zzbgd zzbgdVar) {
        super(zzbgdVar);
        Objects.requireNonNull(zzbnaVar);
        this.zza = zzbnaVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbmj
    public final void zza() {
        this.zza.zzi();
    }
}
