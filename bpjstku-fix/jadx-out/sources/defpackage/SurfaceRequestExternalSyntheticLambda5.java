package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class SurfaceRequestExternalSyntheticLambda5 {
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static final SurfaceRequestExternalSyntheticLambda5 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static long b;
    private final long TuitionPaymentFragmentbindingInflater1;
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        b = jCurrentTimeMillis - jElapsedRealtime;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TimeUnit.MILLISECONDS.toNanos(jCurrentTimeMillis) - jElapsedRealtimeNanos;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new SurfaceRequestExternalSyntheticLambda5();
    }

    public SurfaceRequestExternalSyntheticLambda5() {
        this(b, TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    private SurfaceRequestExternalSyntheticLambda5(long j, long j2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        this.TuitionPaymentFragmentbindingInflater1 = j2;
    }

    public static long TuitionPaymentFragmentbindingInflater1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime();
    }

    public static long TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 + SystemClock.elapsedRealtimeNanos();
    }
}
