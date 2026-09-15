package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes4.dex */
public final class EncoderImplExternalSyntheticLambda14 {
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("NONE");
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 TuitionPaymentFragmentbindingInflater1 = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("PENDING");

    public static final <T> lambdastop3androidxcameravideointernalencoderEncoderImpl<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t) {
        if (t == null) {
            t = (T) EncoderImpl1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        return new EncoderImplExternalSyntheticLambda1(t);
    }

    public static final <T> clampVideoBitrateIfNotSupported<T> b(stopMediaCodec<? extends T> stopmediacodec, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (((i >= 0 && i < 2) || i == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) {
            return stopmediacodec;
        }
        return setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(stopmediacodec, coroutineContext, i, bufferOverflow);
    }
}
