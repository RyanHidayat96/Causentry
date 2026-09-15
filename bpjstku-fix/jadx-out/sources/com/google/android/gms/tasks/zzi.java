package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class zzi implements Runnable {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 610955532;
    final /* synthetic */ Task zza;
    final /* synthetic */ zzj zzb;

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zzb) {
            zzj zzjVar = this.zzb;
            if (zzjVar.zzc != null) {
                zzjVar.zzc.onComplete(this.zza);
            }
        }
    }

    zzi(zzj zzjVar, Task task) {
        this.zzb = zzjVar;
        this.zza = task;
    }
}
