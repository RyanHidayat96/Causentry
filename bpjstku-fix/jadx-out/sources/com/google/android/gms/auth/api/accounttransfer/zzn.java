package com.google.android.gms.auth.api.accounttransfer;

import android.os.SystemClock;
import com.google.android.gms.internal.auth.zzas;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzn extends zzl {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final zzas zzc;

    zzn(int i) {
        super(i, null);
        this.zzc = new zzm(this);
    }

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 6343656;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        TuitionPaymentFragmentbindingInflater1 = iElapsedRealtime;
        return iElapsedRealtime;
    }
}
