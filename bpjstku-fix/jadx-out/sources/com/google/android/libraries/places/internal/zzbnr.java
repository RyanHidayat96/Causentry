package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbnr implements Runnable {
    final /* synthetic */ zzbnz zza;

    zzbnr(zzbnz zzbnzVar) {
        Objects.requireNonNull(zzbnzVar);
        this.zza = zzbnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzq().zzu();
    }
}
