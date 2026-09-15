package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzbkb implements Runnable {
    final Runnable zza;
    boolean zzb;
    boolean zzc;

    zzbkb(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zzc = true;
        this.zza.run();
    }
}
