package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzju implements zzbep {
    private final zzbes zza;
    private final zzbes zzb;

    @Override // com.google.android.libraries.places.internal.zzcbd
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbes zzbesVar = this.zzb;
        return new zzjt((zzhf) this.zza.zzb(), (zzjo) zzbesVar.zzb());
    }

    private zzju(zzbes zzbesVar, zzbes zzbesVar2) {
        this.zza = zzbesVar;
        this.zzb = zzbesVar2;
    }

    public static zzju zza(zzbes zzbesVar, zzbes zzbesVar2) {
        return new zzju(zzbesVar, zzbesVar2);
    }
}
