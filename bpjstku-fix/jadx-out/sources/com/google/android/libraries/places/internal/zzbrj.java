package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbrj implements Runnable {
    final /* synthetic */ zzbrr zza;

    zzbrj(zzbrr zzbrrVar) {
        Objects.requireNonNull(zzbrrVar);
        this.zza = zzbrrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbrr zzbrrVar = this.zza;
        zzbrx zzbrxVar = zzbrrVar.zza;
        if (zzbrxVar.zzH() == null) {
            if (zzbrrVar.zzf().get() == zzbrx.zzs()) {
                zzbrrVar.zzf().set(null);
            }
            zzbrxVar.zzL().zza(zzbrx.zzc);
        }
    }
}
