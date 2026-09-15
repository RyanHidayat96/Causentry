package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getSupportedHeights {
    public static final long TuitionPaymentFragmentbindingInflater1;
    public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public static final int b;
    public static InvalidConfigException g;

    public static final getSupportedHeightsFor TuitionPaymentFragmentbindingInflater1(Runnable runnable, long j, boolean z) {
        return new getWidthAlignment(runnable, j, z);
    }

    static {
        String strTuitionPaymentFragmentbindingInflater1 = EncoderImplMediaCodecCallbackExternalSyntheticLambda10.TuitionPaymentFragmentbindingInflater1("kotlinx.coroutines.scheduler.default.name");
        if (strTuitionPaymentFragmentbindingInflater1 == null) {
            strTuitionPaymentFragmentbindingInflater1 = "DefaultDispatcher";
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = strTuitionPaymentFragmentbindingInflater1;
        TuitionPaymentFragmentbindingInflater1 = EncoderImplMediaCodecCallbackExternalSyntheticLambda10.b("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = EncoderImplMediaCodecCallbackExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1("kotlinx.coroutines.scheduler.core.pool.size", RangesKt.coerceAtLeast(EncoderImplMediaCodecCallbackExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 2), 1, 0, 8);
        b = EncoderImplMediaCodecCallbackExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TimeUnit.SECONDS.toNanos(EncoderImplMediaCodecCallbackExternalSyntheticLambda10.b("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        g = canSwapWidthHeight.INSTANCE;
    }

    public static final /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) {
        return z ? "Blocking" : "Non-blocking";
    }
}
