package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lambdaaddSignalEosTimeoutIfNeeded9 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, CoroutineContext coroutineContext) {
        TuitionPaymentFragmentbindingInflater1(coroutineContext);
        if (Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE)) {
            return clampvideobitrateifnotsupported;
        }
        return clampvideobitrateifnotsupported instanceof EncoderImplExternalSyntheticLambda9 ? EncoderImplExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1((EncoderImplExternalSyntheticLambda9) clampvideobitrateifnotsupported, coroutineContext, 0, null, 6) : new EncoderImplExternalSyntheticLambda5(clampvideobitrateifnotsupported, coroutineContext, 0, null, 12, null);
    }

    private static final void TuitionPaymentFragmentbindingInflater1(CoroutineContext coroutineContext) {
        if (coroutineContext.get(VideoMimeInfoBuilder.b) != null) {
            throw new IllegalArgumentException("Flow context cannot contain job in it. Had ".concat(String.valueOf(coroutineContext)).toString());
        }
    }
}
