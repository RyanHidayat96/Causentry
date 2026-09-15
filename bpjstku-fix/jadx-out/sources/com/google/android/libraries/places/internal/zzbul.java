package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbul implements zzbus {
    final /* synthetic */ int zza;

    zzbul(zzbvl zzbvlVar, int i) {
        this.zza = i;
        Objects.requireNonNull(zzbvlVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbus
    public final void zza(zzbvj zzbvjVar) {
        zzbvjVar.zza.zzb(this.zza);
    }
}
