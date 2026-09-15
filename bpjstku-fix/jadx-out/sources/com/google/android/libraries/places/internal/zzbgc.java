package com.google.android.libraries.places.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbgc {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static int b;

    public abstract zzbgd zza(zzbgd zzbgdVar);

    public abstract void zzb(zzbgd zzbgdVar, zzbgd zzbgdVar2);

    public abstract zzbgd zzc();

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 5141234;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        b = i3;
        return i3;
    }
}
