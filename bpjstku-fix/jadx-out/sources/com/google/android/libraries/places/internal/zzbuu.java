package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
final class zzbuu {
    private final AtomicLong zza = new AtomicLong();

    zzbuu() {
    }

    final long zza(long j) {
        return this.zza.addAndGet(j);
    }
}
