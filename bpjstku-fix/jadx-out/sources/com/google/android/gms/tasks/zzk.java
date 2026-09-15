package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class zzk implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzl zzb;

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zzb) {
            zzl zzlVar = this.zzb;
            if (zzlVar.zzc != null) {
                zzlVar.zzc.onFailure((Exception) Preconditions.checkNotNull(this.zza.getException()));
            }
        }
    }

    zzk(zzl zzlVar, Task task) {
        this.zzb = zzlVar;
        this.zza = task;
    }
}
