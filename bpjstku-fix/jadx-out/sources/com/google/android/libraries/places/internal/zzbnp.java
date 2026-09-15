package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbnp implements Runnable {
    final /* synthetic */ zzbnz zza;

    zzbnp(zzbnz zzbnzVar) {
        Objects.requireNonNull(zzbnzVar);
        this.zza = zzbnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzp();
    }
}
