package com.google.android.gms.internal.mlkit_common;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class zzin {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 9805611;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int iNextInt = new Random().nextInt();
        TuitionPaymentFragmentbindingInflater1 = iNextInt;
        return iNextInt;
    }
}
