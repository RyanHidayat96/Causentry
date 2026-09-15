package com.google.android.libraries.places.internal;

import androidx.core.app.NotificationManagerCompat;
import defpackage.tryOpenCamera;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
final class zzbvk {
    final int zza;
    final int zzb;
    final int zzc;
    final AtomicInteger zzd;

    zzbvk(float f, float f2) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.zzd = atomicInteger;
        this.zzc = (int) (f2 * 1000.0f);
        int i = (int) (f * 1000.0f);
        this.zza = i;
        this.zzb = i / 2;
        atomicInteger.set(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbvk)) {
            return false;
        }
        zzbvk zzbvkVar = (zzbvk) obj;
        return this.zza == zzbvkVar.zza && this.zzc == zzbvkVar.zzc;
    }

    public final int hashCode() {
        return tryOpenCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Integer.valueOf(this.zza), Integer.valueOf(this.zzc));
    }

    final boolean zza() {
        return this.zzd.get() > this.zzb;
    }

    final boolean zzb() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.zzd;
            i = atomicInteger.get();
            if (i == 0) {
                return false;
            }
            i2 = i + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        } while (!atomicInteger.compareAndSet(i, Math.max(i2, 0)));
        return i2 > this.zzb;
    }
}
