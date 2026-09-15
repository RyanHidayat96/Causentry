package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbqr implements Runnable {
    final /* synthetic */ zzbrx zza;

    zzbqr(zzbrx zzbrxVar) {
        Objects.requireNonNull(zzbrxVar);
        this.zza = zzbrxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbrx zzbrxVar = this.zza;
        zzbrxVar.zzV().zza(2, "Entering SHUTDOWN state");
        zzbrxVar.zzA().zza(zzbfy.SHUTDOWN);
    }
}
