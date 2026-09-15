package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DelayKt$awaitCancellation$1;

/* JADX INFO: loaded from: classes4.dex */
public final class AudioEncoderConfigAudioProfileResolver {
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Continuation<?> continuation) {
        DelayKt$awaitCancellation$1 delayKt$awaitCancellation$1;
        if (continuation instanceof DelayKt$awaitCancellation$1) {
            delayKt$awaitCancellation$1 = (DelayKt$awaitCancellation$1) continuation;
            if ((delayKt$awaitCancellation$1.label & Integer.MIN_VALUE) != 0) {
                delayKt$awaitCancellation$1.label -= Integer.MIN_VALUE;
            } else {
                delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(continuation);
            }
        } else {
            delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(continuation);
        }
        Object obj = delayKt$awaitCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = delayKt$awaitCancellation$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            delayKt$awaitCancellation$1.label = 1;
            DelayKt$awaitCancellation$1 delayKt$awaitCancellation$2 = delayKt$awaitCancellation$1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(delayKt$awaitCancellation$2), 1);
            cancellableContinuationImpl.initCancellability();
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(delayKt$awaitCancellation$2);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    public static final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, Continuation<? super Unit> continuation) {
        if (j <= 0) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        if (j < Long.MAX_VALUE) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(cancellableContinuationImpl2.getContext()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(j, cancellableContinuationImpl2);
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final selectSampleRateOrNearestSupported TuitionPaymentFragmentspecialinlinedviewModeldefault1(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.INSTANCE);
        selectSampleRateOrNearestSupported selectsamplerateornearestsupported = element instanceof selectSampleRateOrNearestSupported ? (selectSampleRateOrNearestSupported) element : null;
        return selectsamplerateornearestsupported == null ? resolveAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault3() : selectsamplerateornearestsupported;
    }
}
