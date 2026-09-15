package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes4.dex */
public interface EncoderImplExternalSyntheticLambda9<T> extends clampVideoBitrateIfNotSupported<T> {
    clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentbindingInflater1(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow);

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        public static /* synthetic */ clampVideoBitrateIfNotSupported TuitionPaymentFragmentspecialinlinedviewModeldefault1(EncoderImplExternalSyntheticLambda9 encoderImplExternalSyntheticLambda9, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2) {
            if ((i2 & 1) != 0) {
                coroutineContext = EmptyCoroutineContext.INSTANCE;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return encoderImplExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1(coroutineContext, i, bufferOverflow);
        }
    }
}
