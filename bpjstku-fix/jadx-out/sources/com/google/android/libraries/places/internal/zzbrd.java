package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbrd implements Runnable {
    final /* synthetic */ zzbrx zza;

    /* synthetic */ zzbrd(zzbrx zzbrxVar, byte[] bArr) {
        Objects.requireNonNull(zzbrxVar);
        this.zza = zzbrxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbrx zzbrxVar = this.zza;
        if (zzbrxVar.zzE() == null) {
            return;
        }
        zzbrxVar.zzk();
    }
}
