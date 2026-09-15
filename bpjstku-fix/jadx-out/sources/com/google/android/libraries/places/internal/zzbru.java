package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbru implements Runnable {
    final /* synthetic */ zzbrv zza;

    zzbru(zzbrv zzbrvVar) {
        Objects.requireNonNull(zzbrvVar);
        this.zza = zzbrvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzf.zzd(zzbrx.zzd);
    }
}
