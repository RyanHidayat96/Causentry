package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class FcmLifecycleCallbacks$$ExternalSyntheticLambda0 implements Runnable {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int b;
    public final /* synthetic */ FcmLifecycleCallbacks f$0;
    public final /* synthetic */ Intent f$1;

    public /* synthetic */ FcmLifecycleCallbacks$$ExternalSyntheticLambda0(FcmLifecycleCallbacks fcmLifecycleCallbacks, Intent intent) {
        this.f$0 = fcmLifecycleCallbacks;
        this.f$1 = intent;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = b;
        int i2 = i % 9110330;
        b = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
        TuitionPaymentFragmentbindingInflater1 = i3;
        return i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.m7967xd8132052(this.f$1);
    }
}
