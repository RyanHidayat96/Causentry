package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbko implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbkp zzb;

    zzbko(zzbkp zzbkpVar, zzcaz zzcazVar, int i) {
        this.zza = i;
        Objects.requireNonNull(zzbkpVar);
        this.zzb = zzbkpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzx().zzc(this.zza);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                this.zzb.zzE(th2);
            }
        }
    }
}
