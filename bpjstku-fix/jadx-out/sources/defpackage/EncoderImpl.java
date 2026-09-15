package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BT\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u0015\u0010\u0016R;\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"LEncoderImpl;", ExifInterface.GPS_DIRECTION_TRUE, "LhasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk;", "Lkotlin/Function2;", "LonEncodePaused;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "p0", "Lkotlin/coroutines/CoroutineContext;", "p1", "", "p2", "Lkotlinx/coroutines/channels/BufferOverflow;", "p3", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LonEncodePaused;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEncoderImplExternalSyntheticLambda3;", "b", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)LEncoderImplExternalSyntheticLambda3;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EncoderImpl<T> extends hasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk<T> {
    private final Function2<onEncodePaused<? super T>, Continuation<? super Unit>, Object> TuitionPaymentFragmentbindingInflater1;

    public /* synthetic */ EncoderImpl(Function2 function2, EmptyCoroutineContext emptyCoroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : emptyCoroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EncoderImpl(Function2<? super onEncodePaused<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(function2, coroutineContext, i, bufferOverflow);
        this.TuitionPaymentFragmentbindingInflater1 = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // defpackage.hasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk, defpackage.EncoderImplExternalSyntheticLambda3
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(onEncodePaused<? super T> onencodepaused, Continuation<? super Unit> continuation) {
        CallbackFlowBuilder$collectTo$1 callbackFlowBuilder$collectTo$1;
        if (continuation instanceof CallbackFlowBuilder$collectTo$1) {
            callbackFlowBuilder$collectTo$1 = (CallbackFlowBuilder$collectTo$1) continuation;
            if ((callbackFlowBuilder$collectTo$1.label & Integer.MIN_VALUE) != 0) {
                callbackFlowBuilder$collectTo$1.label -= Integer.MIN_VALUE;
            } else {
                callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, continuation);
            }
        } else {
            callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, continuation);
        }
        Object obj = callbackFlowBuilder$collectTo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = callbackFlowBuilder$collectTo$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            callbackFlowBuilder$collectTo$1.L$0 = onencodepaused;
            callbackFlowBuilder$collectTo$1.label = 1;
            if (super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onencodepaused, callbackFlowBuilder$collectTo$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            onencodepaused = (onEncodePaused) callbackFlowBuilder$collectTo$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!onencodepaused.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.hasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk, defpackage.EncoderImplExternalSyntheticLambda3
    public final EncoderImplExternalSyntheticLambda3<T> b(CoroutineContext p0, int p1, BufferOverflow p2) {
        return new EncoderImpl(this.TuitionPaymentFragmentbindingInflater1, p0, p1, p2);
    }
}
