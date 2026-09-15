package com.google.android.libraries.places.internal;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbha {
    private final zzbjv zza;
    private final Object zzb;

    /* synthetic */ zzbha(zzbjv zzbjvVar, Object obj, zzbfj zzbfjVar, byte[] bArr) {
        if (zzbjvVar == null) {
            throw new NullPointerException(NotificationCompat.CATEGORY_STATUS);
        }
        this.zza = zzbjvVar;
        this.zzb = obj;
    }

    public static zzbgz zzc() {
        return new zzbgz(null);
    }

    public final zzbjv zza() {
        return this.zza;
    }

    public final Object zzb() {
        return this.zzb;
    }
}
