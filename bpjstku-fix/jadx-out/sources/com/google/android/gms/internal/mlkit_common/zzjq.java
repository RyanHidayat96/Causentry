package com.google.android.gms.internal.mlkit_common;

import android.os.Process;

/* JADX INFO: loaded from: classes6.dex */
public final class zzjq {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 8895658;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int iMyUid = Process.myUid();
        TuitionPaymentFragmentbindingInflater1 = iMyUid;
        return iMyUid;
    }
}
