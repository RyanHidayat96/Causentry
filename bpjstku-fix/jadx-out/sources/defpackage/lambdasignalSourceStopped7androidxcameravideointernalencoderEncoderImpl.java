package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl<T> implements stopMediaCodec<T>, EncoderFactory<T>, EncoderImplExternalSyntheticLambda9<T> {
    private final VideoMimeInfoBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final /* synthetic */ stopMediaCodec<T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl(stopMediaCodec<? extends T> stopmediacodec, VideoMimeInfoBuilder videoMimeInfoBuilder) {
        this.b = stopmediacodec;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = videoMimeInfoBuilder;
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda9
    public final clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentbindingInflater1(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return EncoderImplExternalSyntheticLambda14.b(this, coroutineContext, i, bufferOverflow);
    }

    @Override // defpackage.lambdastop2androidxcameravideointernalencoderEncoderImpl, defpackage.clampVideoBitrateIfNotSupported
    public final Object collect(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<?> continuation) {
        return this.b.collect(addsignaleostimeoutifneeded, continuation);
    }

    @Override // defpackage.stopMediaCodec
    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }
}
