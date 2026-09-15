package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzbbc implements zzbbj {
    private final zzbbj[] zza;

    @Override // com.google.android.libraries.places.internal.zzbbj
    public final boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbbj
    public final zzbbi zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzbbj zzbbjVar = this.zza[i];
            if (zzbbjVar.zzb(cls)) {
                return zzbbjVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    zzbbc(zzbbj... zzbbjVarArr) {
        this.zza = zzbbjVarArr;
    }
}
