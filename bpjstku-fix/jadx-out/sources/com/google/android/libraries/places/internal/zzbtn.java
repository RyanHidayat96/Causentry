package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
final class zzbtn extends zzbhy {
    final /* synthetic */ zzbto zza;
    private final zzbhx zzb;
    private final AtomicBoolean zzc;

    zzbtn(zzbto zzbtoVar, zzbhx zzbhxVar) {
        Objects.requireNonNull(zzbtoVar);
        this.zza = zzbtoVar;
        this.zzc = new AtomicBoolean(false);
        if (zzbhxVar == null) {
            throw new NullPointerException("subchannel");
        }
        this.zzb = zzbhxVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbhy
    public final zzbht zza(zzbhu zzbhuVar) {
        if (this.zzc.compareAndSet(false, true)) {
            zzbkd zzbkdVarZzd = this.zza.zzf().zzd();
            zzbkdVarZzd.zzb(new zzbtm(this));
            zzbkdVarZzd.zza();
        }
        return zzbht.zzd();
    }

    final /* synthetic */ zzbhx zzb() {
        return this.zzb;
    }
}
