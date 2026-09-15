package com.google.android.gms.internal.mlkit_common;

import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class zzlr {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 7293982;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int iNextInt = new Random().nextInt(140576935);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iNextInt;
        return iNextInt;
    }
}
