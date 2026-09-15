package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbni implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbnz zzb;

    zzbni(zzbnz zzbnzVar, int i) {
        this.zza = i;
        Objects.requireNonNull(zzbnzVar);
        this.zzb = zzbnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zzs(this.zza);
    }
}
