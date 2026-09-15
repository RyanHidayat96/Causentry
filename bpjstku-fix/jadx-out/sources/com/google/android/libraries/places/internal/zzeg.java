package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.getCloseFuture;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeg {
    public static Task zza(ListenableFuture listenableFuture) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        getCloseFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(listenableFuture, new zzef(taskCompletionSource, listenableFuture, cancellationTokenSource), DirectExecutor.INSTANCE);
        return taskCompletionSource.getTask();
    }
}
