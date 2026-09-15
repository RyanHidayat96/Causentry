package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
final class zzbvu extends zzbvt {
    private final AtomicIntegerFieldUpdater zza;

    @Override // com.google.android.libraries.places.internal.zzbvt
    public final boolean zza(zzbvw zzbvwVar, int i, int i2) {
        return this.zza.compareAndSet(zzbvwVar, 0, -1);
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public final void zzb(zzbvw zzbvwVar, int i) {
        this.zza.set(zzbvwVar, 0);
    }

    /* synthetic */ zzbvu(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, byte[] bArr) {
        super(null);
        this.zza = atomicIntegerFieldUpdater;
    }
}
