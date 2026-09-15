package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final class zzc extends ResultReceiver {
    private /* synthetic */ TaskCompletionSource TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.trySetResult(null);
    }
}
