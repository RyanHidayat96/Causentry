package com.google.android.gms.internal.mlkit_vision_common;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class zzir {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 8540210;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        TuitionPaymentFragmentbindingInflater1 = startElapsedRealtime;
        return startElapsedRealtime;
    }
}
