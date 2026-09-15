package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes3.dex */
final class zzs implements OnTokenCanceledListener {
    final /* synthetic */ TaskCompletionSource zza;

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        this.zza.zza.zzc();
    }

    zzs(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }
}
