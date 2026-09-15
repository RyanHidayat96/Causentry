package com.google.android.libraries.places.internal;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
final class zzbuv {
    final Object zza;
    Future zzb;
    boolean zzc;

    final void zza(Future future) {
        boolean z;
        synchronized (this.zza) {
            z = this.zzc;
            if (!z) {
                this.zzb = future;
            }
        }
        if (z) {
            future.cancel(false);
        }
    }

    zzbuv(Object obj) {
        this.zza = obj;
    }

    final Future zzb() {
        this.zzc = true;
        return this.zzb;
    }
}
