package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzbbd implements zzbca {
    private static final zzbbj zzb = new zzbbb();
    private final zzbbj zza = new zzbbc(zzazx.zza(), zzb);

    @Override // com.google.android.libraries.places.internal.zzbca
    public final zzbbz zza(Class cls) {
        zzbbi zzbbiVarZzc = this.zza.zzc(cls);
        if (zzbbiVarZzc.zza()) {
            return zzbbp.zzj(zzbcb.zzA(), zzazs.zza(), zzbbiVarZzc.zzb());
        }
        return zzbbo.zzj(cls, zzbbiVarZzc, zzbbs.zza(), zzbaz.zza(), zzbcb.zzA(), zzbbiVarZzc.zzc() - 1 != 1 ? zzazs.zza() : null, zzbbh.zza());
    }
}
