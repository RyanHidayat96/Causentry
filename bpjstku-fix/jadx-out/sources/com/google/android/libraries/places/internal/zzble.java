package com.google.android.libraries.places.internal;

import androidx.core.app.NotificationCompat;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
final class zzble extends zzbot {
    private final zzbmg zza;
    private final AtomicInteger zzb;
    private volatile zzbjv zzc;
    private zzbjv zzd;

    zzble(zzblf zzblfVar, zzbmg zzbmgVar, String str) {
        Objects.requireNonNull(zzblfVar);
        this.zzb = new AtomicInteger(-2147483647);
        if (zzbmgVar == null) {
            throw new NullPointerException("delegate");
        }
        this.zza = zzbmgVar;
        if (str == null) {
            throw new NullPointerException("authority");
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbot, com.google.android.libraries.places.internal.zzblu
    public final zzblr zzb(zzbiu zzbiuVar, zzbip zzbipVar, zzbfd zzbfdVar, zzbfp[] zzbfpVarArr) {
        return this.zzb.get() >= 0 ? new zzboo(this.zzc, zzbls.PROCESSED, zzbfpVarArr) : this.zza.zzb(zzbiuVar, zzbipVar, zzbfdVar, zzbfpVarArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbot, com.google.android.libraries.places.internal.zzbsj
    public final void zzd(zzbjv zzbjvVar) {
        if (zzbjvVar == null) {
            throw new NullPointerException(NotificationCompat.CATEGORY_STATUS);
        }
        synchronized (this) {
            AtomicInteger atomicInteger = this.zzb;
            if (atomicInteger.get() < 0) {
                this.zzc = zzbjvVar;
                atomicInteger.addAndGet(Integer.MAX_VALUE);
                if (atomicInteger.get() != 0) {
                    return;
                }
                super.zzd(zzbjvVar);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbot, com.google.android.libraries.places.internal.zzbsj
    public final void zze(zzbjv zzbjvVar) {
        if (zzbjvVar == null) {
            throw new NullPointerException(NotificationCompat.CATEGORY_STATUS);
        }
        synchronized (this) {
            AtomicInteger atomicInteger = this.zzb;
            if (atomicInteger.get() < 0) {
                this.zzc = zzbjvVar;
                atomicInteger.addAndGet(Integer.MAX_VALUE);
            } else if (this.zzd != null) {
                return;
            }
            if (atomicInteger.get() != 0) {
                this.zzd = zzbjvVar;
            } else {
                super.zze(zzbjvVar);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbot
    protected final zzbmg zza() {
        return this.zza;
    }
}
