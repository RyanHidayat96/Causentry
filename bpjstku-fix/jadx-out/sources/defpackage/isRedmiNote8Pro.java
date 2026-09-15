package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.AwaitKt$joinAll$3;

/* JADX INFO: loaded from: classes4.dex */
public final class isRedmiNote8Pro {
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object TuitionPaymentFragmentbindingInflater1(Collection<? extends VideoMimeInfoBuilder> collection, Continuation<? super Unit> continuation) {
        AwaitKt$joinAll$3 awaitKt$joinAll$3;
        Iterator it;
        if (continuation instanceof AwaitKt$joinAll$3) {
            awaitKt$joinAll$3 = (AwaitKt$joinAll$3) continuation;
            if ((awaitKt$joinAll$3.label & Integer.MIN_VALUE) != 0) {
                awaitKt$joinAll$3.label -= Integer.MIN_VALUE;
            } else {
                awaitKt$joinAll$3 = new AwaitKt$joinAll$3(continuation);
            }
        } else {
            awaitKt$joinAll$3 = new AwaitKt$joinAll$3(continuation);
        }
        Object obj = awaitKt$joinAll$3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = awaitKt$joinAll$3.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            it = collection.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) awaitKt$joinAll$3.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            VideoMimeInfoBuilder videoMimeInfoBuilder = (VideoMimeInfoBuilder) it.next();
            awaitKt$joinAll$3.L$0 = it;
            awaitKt$joinAll$3.label = 1;
            if (videoMimeInfoBuilder.a_(awaitKt$joinAll$3) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
