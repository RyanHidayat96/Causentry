package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes4.dex */
public final class setMediaCodecPaused {
    public static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("NO_VALUE");

    public static /* synthetic */ lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, BufferOverflow bufferOverflow, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i2, bufferOverflow);
    }

    public static final <T> lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, BufferOverflow bufferOverflow) {
        if (i < 0) {
            throw new IllegalArgumentException("replay cannot be negative, but was ".concat(String.valueOf(i)).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("extraBufferCapacity cannot be negative, but was ".concat(String.valueOf(i2)).toString());
        }
        if (i <= 0 && i2 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(String.valueOf(bufferOverflow)).toString());
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl(i, i3, bufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final <T> clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdastop2androidxcameravideointernalencoderEncoderImpl<? extends T> lambdastop2androidxcameravideointernalencoderencoderimpl, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        if ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND) {
            return lambdastop2androidxcameravideointernalencoderencoderimpl;
        }
        return new EncoderImplExternalSyntheticLambda5(lambdastop2androidxcameravideointernalencoderencoderimpl, coroutineContext, i, bufferOverflow);
    }
}
