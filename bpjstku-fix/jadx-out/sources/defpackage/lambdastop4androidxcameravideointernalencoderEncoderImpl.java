package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes5.dex */
public final class lambdastop4androidxcameravideointernalencoderEncoderImpl<T> implements lambdastop2androidxcameravideointernalencoderEncoderImpl<T>, EncoderFactory<T>, EncoderImplExternalSyntheticLambda9<T> {
    private final VideoMimeInfoBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
    private final /* synthetic */ lambdastop2androidxcameravideointernalencoderEncoderImpl<T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public lambdastop4androidxcameravideointernalencoderEncoderImpl(lambdastop2androidxcameravideointernalencoderEncoderImpl<? extends T> lambdastop2androidxcameravideointernalencoderencoderimpl) {
        this.b = lambdastop2androidxcameravideointernalencoderencoderimpl;
    }

    @Override // defpackage.EncoderImplExternalSyntheticLambda9
    public final clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentbindingInflater1(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, coroutineContext, i, bufferOverflow);
    }

    @Override // defpackage.lambdastop2androidxcameravideointernalencoderEncoderImpl, defpackage.clampVideoBitrateIfNotSupported
    public final Object collect(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<?> continuation) {
        return this.b.collect(addsignaleostimeoutifneeded, continuation);
    }
}
