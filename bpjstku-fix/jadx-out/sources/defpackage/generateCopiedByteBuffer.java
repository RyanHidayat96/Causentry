package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class generateCopiedByteBuffer {
    public static final Object b(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        CoroutineContext coroutineContext = continuation.get$context();
        VideoMimeInfoBuilder videoMimeInfoBuilder = (VideoMimeInfoBuilder) coroutineContext.get(VideoMimeInfoBuilder.b);
        if (videoMimeInfoBuilder != null) {
            VideoMimeInfo.b(videoMimeInfoBuilder);
        }
        Continuation continuationIntercepted = IntrinsicsKt.intercepted(continuation);
        EncoderImplByteBufferInputExternalSyntheticLambda4 encoderImplByteBufferInputExternalSyntheticLambda4 = continuationIntercepted instanceof EncoderImplByteBufferInputExternalSyntheticLambda4 ? (EncoderImplByteBufferInputExternalSyntheticLambda4) continuationIntercepted : null;
        if (encoderImplByteBufferInputExternalSyntheticLambda4 == null) {
            coroutine_suspended = Unit.INSTANCE;
        } else {
            if (!encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDispatchNeeded(coroutineContext)) {
                BufferCopiedEncodedData bufferCopiedEncodedData = new BufferCopiedEncodedData();
                CoroutineContext coroutineContextPlus = coroutineContext.plus(bufferCopiedEncodedData);
                encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Unit.INSTANCE;
                encoderImplByteBufferInputExternalSyntheticLambda4.b = 1;
                encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispatchYield(coroutineContextPlus, encoderImplByteBufferInputExternalSyntheticLambda4);
                if (bufferCopiedEncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && !EncoderImplByteBufferInputExternalSyntheticLambda5.b(encoderImplByteBufferInputExternalSyntheticLambda4)) {
                    coroutine_suspended = Unit.INSTANCE;
                }
            } else {
                encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Unit.INSTANCE;
                encoderImplByteBufferInputExternalSyntheticLambda4.b = 1;
                encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispatchYield(coroutineContext, encoderImplByteBufferInputExternalSyntheticLambda4);
            }
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : Unit.INSTANCE;
    }
}
