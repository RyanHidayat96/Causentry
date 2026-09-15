package defpackage;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class signalEndOfInputStream {
    public static final <T> clampVideoBitrateIfNotSupported<T> b(Function2<? super addSignalEosTimeoutIfNeeded<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new lambdastart1androidxcameravideointernalencoderEncoderImpl(function2);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"LlambdasetActive9$b;", "LclampVideoBitrateIfNotSupported;", "LaddSignalEosTimeoutIfNeeded;", "p0", "", "collect", "(LaddSignalEosTimeoutIfNeeded;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lambdasetActive9$b"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TuitionPaymentFragmentbindingInflater1<T> implements clampVideoBitrateIfNotSupported<T> {
        private /* synthetic */ Iterable TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentbindingInflater1(Iterable iterable) {
            this.TuitionPaymentFragmentbindingInflater1 = iterable;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Override // defpackage.clampVideoBitrateIfNotSupported
        public final Object collect(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<? super Unit> continuation) {
            FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;
            addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded2;
            Iterator<T> it;
            if (continuation instanceof FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1) {
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 = (FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1) continuation;
                if ((flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label & Integer.MIN_VALUE) != 0) {
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label -= Integer.MIN_VALUE;
                } else {
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 = new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1(this, continuation);
                }
            } else {
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 = new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1(this, continuation);
            }
            Object obj = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                addsignaleostimeoutifneeded2 = addsignaleostimeoutifneeded;
                it = this.TuitionPaymentFragmentbindingInflater1.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$1;
                addsignaleostimeoutifneeded2 = (addSignalEosTimeoutIfNeeded) flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                T next = it.next();
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$0 = addsignaleostimeoutifneeded2;
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$1 = it;
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label = 1;
                if (addsignaleostimeoutifneeded2.emit(next, flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> implements clampVideoBitrateIfNotSupported<T> {
        private /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = obj;
        }

        @Override // defpackage.clampVideoBitrateIfNotSupported
        public final Object collect(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<? super Unit> continuation) {
            Object objEmit = addsignaleostimeoutifneeded.emit((Object) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
        }
    }
}
