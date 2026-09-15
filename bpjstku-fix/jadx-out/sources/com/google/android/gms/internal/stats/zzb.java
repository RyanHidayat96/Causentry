package com.google.android.gms.internal.stats;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzb implements Closeable {
    private static final zzb zza = new zzb(false, null);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    private zzb(boolean z, zzd zzdVar) {
    }

    public static zzb zza(boolean z, zzc zzcVar) {
        return zza;
    }
}
