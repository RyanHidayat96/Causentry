package com.google.android.libraries.places.internal;

import defpackage.CameraStateRegistryCameraRegistration;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class zzbrb implements Executor {
    private final zzbsu zza;
    private Executor zzb;

    zzbrb(zzbsu zzbsuVar) {
        if (zzbsuVar == null) {
            throw new NullPointerException("executorPool");
        }
        this.zza = zzbsuVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zza().execute(runnable);
    }

    final Executor zza() {
        Executor executor;
        synchronized (this) {
            if (this.zzb == null) {
                Executor executor2 = (Executor) this.zza.zza();
                Executor executor3 = this.zzb;
                if (executor2 == null) {
                    throw new NullPointerException(CameraStateRegistryCameraRegistration.b("%s.getObject()", executor3));
                }
                this.zzb = executor2;
            }
            executor = this.zzb;
        }
        return executor;
    }

    final void zzb() {
        synchronized (this) {
            Executor executor = this.zzb;
            if (executor != null) {
                this.zza.zzb(executor);
                this.zzb = null;
            }
        }
    }
}
