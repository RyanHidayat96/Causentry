package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbqp implements Runnable {
    final /* synthetic */ zzbrx zza;

    zzbqp(zzbrx zzbrxVar) {
        Objects.requireNonNull(zzbrxVar);
        this.zza = zzbrxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzl(true);
    }
}
