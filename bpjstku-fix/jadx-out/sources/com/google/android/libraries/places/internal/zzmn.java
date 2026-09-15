package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzmn {
    abstract zzmn zzb(int i);

    public abstract zzmn zzc(zzmo zzmoVar);

    abstract zzmp zzd();

    public final zzmp zze() {
        zzmp zzmpVarZzd = zzd();
        if (!zzmpVarZzd.zza().isEmpty()) {
            return zzmpVarZzd;
        }
        throw new IllegalArgumentException("Package name must not be empty.");
    }
}
