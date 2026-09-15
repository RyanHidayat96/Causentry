package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdaonOutputBufferAvailable1androidxcameravideointernalencoderEncoderImplMediaCodecCallback extends CoroutineDispatcher implements selectSampleRateOrNearestSupported {
    private final CoroutineDispatcher TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final /* synthetic */ selectSampleRateOrNearestSupported TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX WARN: Multi-variable type inference failed */
    public lambdaonOutputBufferAvailable1androidxcameravideointernalencoderEncoderImplMediaCodecCallback(CoroutineDispatcher coroutineDispatcher, String str) {
        selectSampleRateOrNearestSupported selectsamplerateornearestsupported = coroutineDispatcher instanceof selectSampleRateOrNearestSupported ? (selectSampleRateOrNearestSupported) coroutineDispatcher : null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = selectsamplerateornearestsupported == null ? resolveAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault3() : selectsamplerateornearestsupported;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = coroutineDispatcher;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDispatchNeeded(coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispatch(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispatchYield(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.selectSampleRateOrNearestSupported
    public final setCompatibleAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(j, runnable, coroutineContext);
    }

    @Override // defpackage.selectSampleRateOrNearestSupported
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(j, mediaFormatMustNotUseFrameRateToFindEncoderQuirk);
    }
}
