package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzbww implements Runnable {
    final /* synthetic */ zzbwx zzb;

    /* synthetic */ zzbww(zzbwx zzbwxVar, byte[] bArr) {
        Objects.requireNonNull(zzbwxVar);
        this.zzb = zzbwxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.zzb.zzi() == null) {
                throw new IOException("Unable to perform write due to unavailable sink.");
            }
            zza();
        } catch (Exception e2) {
            this.zzb.zzf().zzg(e2);
        }
    }

    public abstract void zza() throws IOException;
}
