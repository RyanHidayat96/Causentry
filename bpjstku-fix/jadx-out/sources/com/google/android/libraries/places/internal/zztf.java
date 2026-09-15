package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes6.dex */
final class zztf extends zztj {
    private static final zztf zza = new zztf(zztj.zze());
    private final AtomicReference zzb;

    zztf(zztj zztjVar) {
        this.zzb = new AtomicReference(zztjVar);
    }

    @Override // com.google.android.libraries.places.internal.zztj
    public final boolean zzb(String str, Level level, boolean z) {
        ((zztj) this.zzb.get()).zzb(str, level, z);
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zztj
    public final zztu zzc() {
        return ((zztj) this.zzb.get()).zzc();
    }

    @Override // com.google.android.libraries.places.internal.zztj
    public final zzsj zzd() {
        return ((zztj) this.zzb.get()).zzd();
    }

    public static final zztf zza() {
        return zza;
    }
}
