package com.google.android.libraries.places.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmk implements zzbep {
    private final zzbes zza;

    @Override // com.google.android.libraries.places.internal.zzcbd
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeo((Context) this.zza.zzb(), zzei.zzc());
    }

    private zzmk(zzbes zzbesVar, zzbes zzbesVar2) {
        this.zza = zzbesVar;
    }

    public static zzmk zza(zzbes zzbesVar, zzbes zzbesVar2) {
        return new zzmk(zzbesVar, zzbesVar2);
    }
}
