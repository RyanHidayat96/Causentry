package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbkt {
    final /* synthetic */ zzbku zza;
    private final long zzb;

    /* synthetic */ zzbkt(zzbku zzbkuVar, long j, byte[] bArr) {
        Objects.requireNonNull(zzbkuVar);
        this.zza = zzbkuVar;
        this.zzb = j;
    }

    public final void zza() {
        zzbku zzbkuVar = this.zza;
        AtomicLong atomicLongZzd = zzbkuVar.zzd();
        long j = this.zzb;
        long jMax = Math.max(j + j, j);
        if (atomicLongZzd.compareAndSet(j, jMax)) {
            String strZzc = zzbkuVar.zzc();
            zzbku.zza.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{strZzc, Long.valueOf(jMax)});
        }
    }
}
