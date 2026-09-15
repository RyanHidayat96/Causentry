package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.getContainerClass;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
final class zzef implements getContainerClass {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ ListenableFuture zzb;
    final /* synthetic */ CancellationTokenSource zzc;

    @Override // defpackage.getContainerClass
    public final void onFailure(Throwable th) {
        if (this.zzb.isCancelled()) {
            this.zzc.cancel();
        } else if (th instanceof Exception) {
            this.zza.setException((Exception) th);
        } else {
            this.zza.setException(new ExecutionException(th));
        }
    }

    @Override // defpackage.getContainerClass
    public final void onSuccess(Object obj) {
        this.zza.setResult(obj);
    }

    zzef(TaskCompletionSource taskCompletionSource, ListenableFuture listenableFuture, CancellationTokenSource cancellationTokenSource) {
        this.zza = taskCompletionSource;
        this.zzb = listenableFuture;
        this.zzc = cancellationTokenSource;
    }
}
