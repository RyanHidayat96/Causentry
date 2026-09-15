package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class zzu {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    String zza;
    Object zzb;
    zzu zzc;

    private zzu() {
    }

    /* synthetic */ zzu(zzs zzsVar) {
    }

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 9029909;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        TuitionPaymentFragmentbindingInflater1 = i3;
        return i3;
    }
}
