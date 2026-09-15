package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbku {
    private static final Logger zza = Logger.getLogger(zzbku.class.getName());
    private final String zzb;
    private final AtomicLong zzc;

    public zzbku(String str, long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.zzc = atomicLong;
        this.zzb = "keepalive time nanos";
        atomicLong.set(Long.MAX_VALUE);
    }

    public final zzbkt zza() {
        return new zzbkt(this, this.zzc.get(), null);
    }

    final /* synthetic */ String zzc() {
        return this.zzb;
    }

    final /* synthetic */ AtomicLong zzd() {
        return this.zzc;
    }
}
