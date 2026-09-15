package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Process;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zznv implements Callable {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static int b;
    public final /* synthetic */ zzoc zza;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.zza.zzb();
    }

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 8800044;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        b = startUptimeMillis;
        return startUptimeMillis;
    }
}
