package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbug implements zzbus {
    final /* synthetic */ zzbgg zza;

    zzbug(zzbvl zzbvlVar, zzbgg zzbggVar) {
        this.zza = zzbggVar;
        Objects.requireNonNull(zzbvlVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbus
    public final void zza(zzbvj zzbvjVar) {
        zzbvjVar.zza.zza(this.zza);
    }
}
