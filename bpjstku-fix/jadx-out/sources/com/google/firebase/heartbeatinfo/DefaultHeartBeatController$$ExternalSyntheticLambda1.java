package com.google.firebase.heartbeatinfo;

import android.os.Process;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DefaultHeartBeatController$$ExternalSyntheticLambda1 implements Callable {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final /* synthetic */ DefaultHeartBeatController f$0;

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 6339422;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = elapsedCpuTime;
        return elapsedCpuTime;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f$0.m7957x341e14f2();
    }
}
