package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
final class zzbkv implements zzbqm {
    private final AtomicLong zza = new AtomicLong();

    zzbkv() {
    }

    @Override // com.google.android.libraries.places.internal.zzbqm
    public final void zza(long j) {
        this.zza.getAndAdd(1L);
    }
}
