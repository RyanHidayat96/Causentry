package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes4.dex */
public final class hasEndOfStreamFlag {
    public static final <T> clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function2<? super addSignalEosTimeoutIfNeeded<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return signalEndOfInputStream.b(function2);
    }

    public static final <T> Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super T> continuation) {
        return lambdapause5androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(clampvideobitrateifnotsupported, function2, continuation);
    }

    public static final <T> clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, int i, BufferOverflow bufferOverflow) {
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ".concat(String.valueOf(i)).toString());
        }
        if (i == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i == -1) {
            bufferOverflow = BufferOverflow.DROP_OLDEST;
            i = 0;
        }
        int i2 = i;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        return clampvideobitrateifnotsupported instanceof EncoderImplExternalSyntheticLambda9 ? EncoderImplExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1((EncoderImplExternalSyntheticLambda9) clampvideobitrateifnotsupported, null, i2, bufferOverflow2, 1) : new EncoderImplExternalSyntheticLambda5(clampvideobitrateifnotsupported, null, i2, bufferOverflow2, 2, null);
    }
}
