package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes3.dex */
public class zzah {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static int b;
    String zza;
    Object zzb;
    zzah zzc;

    private zzah() {
    }

    /* synthetic */ zzah(zzag zzagVar) {
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 7987749;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        b = iMaxMemory;
        return iMaxMemory;
    }
}
