package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbvo implements Runnable {
    final /* synthetic */ zzbvq zza;

    zzbvo(zzbvq zzbvqVar) {
        Objects.requireNonNull(zzbvqVar);
        this.zza = zzbvqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
    }
}
