package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class setTargetResolution {
    private static final double TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1.0d / Math.pow(10.0d, 6.0d);

    public static long TuitionPaymentFragmentbindingInflater1() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public static double TuitionPaymentFragmentbindingInflater1(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
