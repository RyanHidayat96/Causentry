package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbuz implements zzbus {
    final /* synthetic */ zzbvl zza;

    zzbuz(zzbvl zzbvlVar) {
        Objects.requireNonNull(zzbvlVar);
        this.zza = zzbvlVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbus
    public final void zza(zzbvj zzbvjVar) {
        zzbvjVar.zza.zzf(new zzbvi(this.zza, zzbvjVar));
    }
}
