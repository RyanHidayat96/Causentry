package com.google.firebase.messaging;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class WithinAppServiceConnection$BindRequest$$ExternalSyntheticLambda0 implements Runnable {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final /* synthetic */ WithinAppServiceConnection.BindRequest f$0;

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 5674855;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        TuitionPaymentFragmentbindingInflater1 = i3;
        return i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.m7983x9cf97a38();
    }
}
