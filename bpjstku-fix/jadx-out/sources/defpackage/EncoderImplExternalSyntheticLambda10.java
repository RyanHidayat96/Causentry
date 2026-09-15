package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BD\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\r\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0000H\u0096AR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R7\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/SubscribedFlowCollector;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "action", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "onSubscription", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emit", "value", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EncoderImplExternalSyntheticLambda10<T> implements addSignalEosTimeoutIfNeeded<T> {
    private final Function2<addSignalEosTimeoutIfNeeded<? super T>, Continuation<? super Unit>, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final addSignalEosTimeoutIfNeeded<T> b;

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    public final Object b(Continuation<? super Unit> continuation) {
        SubscribedFlowCollector$onSubscription$1 subscribedFlowCollector$onSubscription$1;
        if (continuation instanceof SubscribedFlowCollector$onSubscription$1) {
            subscribedFlowCollector$onSubscription$1 = (SubscribedFlowCollector$onSubscription$1) continuation;
            if ((subscribedFlowCollector$onSubscription$1.label & Integer.MIN_VALUE) != 0) {
                subscribedFlowCollector$onSubscription$1.label -= Integer.MIN_VALUE;
            } else {
                subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, continuation);
            }
        } else {
            subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, continuation);
        }
        Object obj = subscribedFlowCollector$onSubscription$1.result;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = subscribedFlowCollector$onSubscription$1.label;
        try {
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                SafeCollector safeCollector = new SafeCollector(null, subscribedFlowCollector$onSubscription$1.getContext());
                subscribedFlowCollector$onSubscription$1.L$0 = this;
                subscribedFlowCollector$onSubscription$1.L$1 = safeCollector;
                subscribedFlowCollector$onSubscription$1.label = 1;
                throw new NullPointerException();
            }
            if (r1 != 1) {
                if (r1 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            SafeCollector safeCollector2 = (SafeCollector) subscribedFlowCollector$onSubscription$1.L$1;
            EncoderImplExternalSyntheticLambda10 encoderImplExternalSyntheticLambda10 = (EncoderImplExternalSyntheticLambda10) subscribedFlowCollector$onSubscription$1.L$0;
            ResultKt.throwOnFailure(obj);
            safeCollector2.releaseIntercepted();
            addSignalEosTimeoutIfNeeded<T> addsignaleostimeoutifneeded = encoderImplExternalSyntheticLambda10.b;
            return Unit.INSTANCE;
        } catch (Throwable th) {
            r1.releaseIntercepted();
            throw th;
        }
    }

    @Override // defpackage.addSignalEosTimeoutIfNeeded
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        throw null;
    }
}
