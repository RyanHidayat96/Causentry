package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes3.dex */
public final class zzee {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int b;

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 7360592;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        b = iMaxMemory;
        return iMaxMemory;
    }
}
