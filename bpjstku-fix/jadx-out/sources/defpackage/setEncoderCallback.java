package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt$awaitClose$1;

/* JADX INFO: loaded from: classes4.dex */
public final class setEncoderCallback {
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(onEncodePaused<?> onencodepaused, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1;
        if (continuation instanceof ProduceKt$awaitClose$1) {
            produceKt$awaitClose$1 = (ProduceKt$awaitClose$1) continuation;
            if ((produceKt$awaitClose$1.label & Integer.MIN_VALUE) != 0) {
                produceKt$awaitClose$1.label -= Integer.MIN_VALUE;
            } else {
                produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuation);
            }
        } else {
            produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuation);
        }
        Object obj = produceKt$awaitClose$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = produceKt$awaitClose$1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (produceKt$awaitClose$1.get$context().get(VideoMimeInfoBuilder.b) != onencodepaused) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
                }
                produceKt$awaitClose$1.L$0 = onencodepaused;
                produceKt$awaitClose$1.L$1 = function0;
                produceKt$awaitClose$1.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(produceKt$awaitClose$1), 1);
                cancellableContinuationImpl.initCancellability();
                onencodepaused.b(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(cancellableContinuationImpl));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(produceKt$awaitClose$1);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) produceKt$awaitClose$1.L$1;
                ResultKt.throwOnFailure(obj);
            }
            function0.invoke();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Function1<Throwable, Unit> {
        private /* synthetic */ MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> TuitionPaymentFragmentbindingInflater1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = this.TuitionPaymentFragmentbindingInflater1;
            Result.Companion companion = Result.INSTANCE;
            mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
            this.TuitionPaymentFragmentbindingInflater1 = mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
        }
    }

    public static final <E> EncoderSurfaceInput<E> TuitionPaymentFragmentspecialinlinedviewModeldefault1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, Function1<? super Throwable, Unit> function1, Function2<? super onEncodePaused<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        EncoderCallback encoderCallback = new EncoderCallback(VideoEncoderCrashQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(coroutineScope, coroutineContext), getInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, bufferOverflow, 4));
        encoderCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineStart, encoderCallback, function2);
        return encoderCallback;
    }
}
