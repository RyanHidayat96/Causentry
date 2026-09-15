package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzbmj implements Runnable {
    private final zzbgd zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbgd zzbgdVarZzb = this.zza.zzb();
        try {
            zza();
        } finally {
            this.zza.zzc(zzbgdVarZzb);
        }
    }

    public abstract void zza();

    protected zzbmj(zzbgd zzbgdVar) {
        this.zza = zzbgdVar;
    }
}
