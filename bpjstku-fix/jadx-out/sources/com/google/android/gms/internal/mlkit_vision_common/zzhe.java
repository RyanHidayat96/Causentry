package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhe {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int b;

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = b;
        int i2 = i % 9034381;
        b = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        return i3;
    }
}
