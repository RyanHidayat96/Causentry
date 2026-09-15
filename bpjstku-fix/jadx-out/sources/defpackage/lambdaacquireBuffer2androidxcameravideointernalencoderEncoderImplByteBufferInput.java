package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput {
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("CLOSED");

    public static final <S extends EncoderImplMediaCodecCallbackExternalSyntheticLambda1<S>> Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(S s, long j, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s.f136a >= j) {
                if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(s) == s.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                    Object objTuitionPaymentFragmentbindingInflater1 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(s);
                    if ((objTuitionPaymentFragmentbindingInflater1 == TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater1) == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
            Object objTuitionPaymentFragmentbindingInflater2 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(s);
            EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (objTuitionPaymentFragmentbindingInflater2 == encoderImplMediaCodecCallbackExternalSyntheticLambda0) {
                return onOutputFormatChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault1(encoderImplMediaCodecCallbackExternalSyntheticLambda0);
            }
            S sInvoke = (S) ((lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater2);
            if (sInvoke == null) {
                sInvoke = function2.invoke(Long.valueOf(s.f136a + 1), s);
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1, s, null, sInvoke)) {
                    if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(s) == s.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                        Object objTuitionPaymentFragmentbindingInflater3 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(s);
                        if ((objTuitionPaymentFragmentbindingInflater3 != encoderImplMediaCodecCallbackExternalSyntheticLambda0 ? (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater3 : null) != null) {
                            s.asInterface();
                        }
                    }
                }
            }
            s = (Object) sInvoke;
        }
        return onOutputFormatChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault1(s);
    }

    public static final <N extends lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput<N>> N TuitionPaymentFragmentspecialinlinedviewModeldefault2(N n) {
        while (true) {
            Object objTuitionPaymentFragmentbindingInflater1 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(n);
            EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (objTuitionPaymentFragmentbindingInflater1 == encoderImplMediaCodecCallbackExternalSyntheticLambda0) {
                return n;
            }
            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput = (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater1;
            if (lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput != null) {
                n = (N) lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput;
            } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1, n, null, encoderImplMediaCodecCallbackExternalSyntheticLambda0)) {
                return n;
            }
        }
    }
}
