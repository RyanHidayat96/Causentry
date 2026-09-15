package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbeu {
    private final List zza = zzben.zza(1);
    private final List zzb = zzben.zza(0);

    /* synthetic */ zzbeu(int i, int i2, zzbet zzbetVar) {
    }

    public final zzbeu zza(zzbes zzbesVar) {
        this.zza.add(zzbesVar);
        return this;
    }

    public final zzbev zzb() {
        return new zzbev(this.zza, this.zzb, null);
    }
}
