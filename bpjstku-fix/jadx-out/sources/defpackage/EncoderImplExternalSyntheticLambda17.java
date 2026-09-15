package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class EncoderImplExternalSyntheticLambda17 {
    public static final <T, V> Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(CoroutineContext coroutineContext, V v, Object obj, Function2<? super V, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        Object objTuitionPaymentFragmentbindingInflater1 = EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1(coroutineContext, obj);
        try {
            lambdaacquireBuffer5androidxcameravideointernalencoderEncoderImplByteBufferInput lambdaacquirebuffer5androidxcameravideointernalencoderencoderimplbytebufferinput = new lambdaacquireBuffer5androidxcameravideointernalencoderEncoderImplByteBufferInput(continuation, coroutineContext);
            Object objWrapWithContinuationImpl = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, v, lambdaacquirebuffer5androidxcameravideointernalencoderencoderimplbytebufferinput) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(v, lambdaacquirebuffer5androidxcameravideointernalencoderencoderimplbytebufferinput);
            EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, objTuitionPaymentFragmentbindingInflater1);
            if (objWrapWithContinuationImpl == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objWrapWithContinuationImpl;
        } catch (Throwable th) {
            EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, objTuitionPaymentFragmentbindingInflater1);
            throw th;
        }
    }
}
