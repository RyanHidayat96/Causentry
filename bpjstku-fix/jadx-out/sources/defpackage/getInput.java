package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes4.dex */
public final class getInput {
    public static /* synthetic */ Encoder TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, BufferOverflow bufferOverflow, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return TuitionPaymentFragmentbindingInflater1(i, bufferOverflow, null);
    }

    private static <E> Encoder<E> TuitionPaymentFragmentbindingInflater1(int i, BufferOverflow bufferOverflow, Function1<? super E, Unit> function1) {
        EncoderEncoderInput encoderEncoderInput;
        EncoderEncoderInput encoderEncoderInput2;
        if (i == -2) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                Encoder.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = Encoder.INSTANCE;
                encoderEncoderInput = new EncodeExceptionErrorType<>(Encoder.Companion.TuitionPaymentFragmentbindingInflater1(), null);
            } else {
                encoderEncoderInput = new EncoderEncoderInput(1, bufferOverflow, null);
            }
            return encoderEncoderInput;
        }
        if (i == -1) {
            if (bufferOverflow != BufferOverflow.SUSPEND) {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            return new EncoderEncoderInput(1, BufferOverflow.DROP_OLDEST, null);
        }
        if (i != 0) {
            if (i == Integer.MAX_VALUE) {
                return new EncodeExceptionErrorType(Integer.MAX_VALUE, null);
            }
            return bufferOverflow == BufferOverflow.SUSPEND ? new EncodeExceptionErrorType<>(i, null) : new EncoderEncoderInput(i, bufferOverflow, null);
        }
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            encoderEncoderInput2 = new EncodeExceptionErrorType<>(0, null);
        } else {
            encoderEncoderInput2 = new EncoderEncoderInput(1, bufferOverflow, null);
        }
        return encoderEncoderInput2;
    }
}
