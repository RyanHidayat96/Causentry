package defpackage;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lambdapause5androidxcameravideointernalencoderEncoderImpl {
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> Object TuitionPaymentFragmentbindingInflater1(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, Continuation<? super T> continuation) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e2;
        addSignalEosTimeoutIfNeeded<? super Object> addsignaleostimeoutifneeded;
        if (continuation instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) continuation;
            if ((flowKt__ReduceKt$first$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.label -= Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuation);
            }
        } else {
            flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuation);
        }
        Object obj = flowKt__ReduceKt$first$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = flowKt__ReduceKt$first$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) EncoderImpl1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            addSignalEosTimeoutIfNeeded<? super Object> bVar = new b<>(objectRef2);
            try {
                flowKt__ReduceKt$first$1.L$0 = objectRef2;
                flowKt__ReduceKt$first$1.L$1 = bVar;
                flowKt__ReduceKt$first$1.label = 1;
                if (clampvideobitrateifnotsupported.collect(bVar, flowKt__ReduceKt$first$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e3) {
                objectRef = objectRef2;
                e2 = e3;
                addsignaleostimeoutifneeded = bVar;
                if (e2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != addsignaleostimeoutifneeded) {
                    throw e2;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            addsignaleostimeoutifneeded = (b) flowKt__ReduceKt$first$1.L$1;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$first$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                if (e2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != addsignaleostimeoutifneeded) {
                    throw e2;
                }
            }
        }
        if (objectRef.element == EncoderImpl1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            throw new NoSuchElementException("Expected at least one element");
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super T> continuation) {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        Ref.ObjectRef objectRef;
        AbortFlowException abortFlowException;
        addSignalEosTimeoutIfNeeded<? super Object> addsignaleostimeoutifneeded;
        Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function3;
        Ref.ObjectRef objectRef2;
        if (continuation instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) continuation;
            if ((flowKt__ReduceKt$first$3.label & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.label -= Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuation);
            }
        } else {
            flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuation);
        }
        Object obj = flowKt__ReduceKt$first$3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = flowKt__ReduceKt$first$3.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            addsignaleostimeoutifneeded = (TuitionPaymentFragmentspecialinlinedviewModeldefault1) flowKt__ReduceKt$first$3.L$2;
            objectRef2 = (Ref.ObjectRef) flowKt__ReduceKt$first$3.L$1;
            function3 = (Function2) flowKt__ReduceKt$first$3.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e2) {
                objectRef = objectRef2;
                function2 = function3;
                abortFlowException = e2;
                if (abortFlowException.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != addsignaleostimeoutifneeded) {
                    throw abortFlowException;
                }
                function3 = function2;
                objectRef2 = objectRef;
            }
            if (objectRef2.element == EncoderImpl1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                throw new NoSuchElementException("Expected at least one element matching the predicate ".concat(String.valueOf(function3)));
            }
            return objectRef2.element;
        }
        ResultKt.throwOnFailure(obj);
        objectRef = new Ref.ObjectRef();
        objectRef.element = (T) EncoderImpl1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        addSignalEosTimeoutIfNeeded<? super Object> tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1<>(function2, objectRef);
        try {
            flowKt__ReduceKt$first$3.L$0 = function2;
            flowKt__ReduceKt$first$3.L$1 = objectRef;
            flowKt__ReduceKt$first$3.L$2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            flowKt__ReduceKt$first$3.label = 1;
            if (clampvideobitrateifnotsupported.collect(tuitionPaymentFragmentspecialinlinedviewModeldefault1, flowKt__ReduceKt$first$3) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } catch (AbortFlowException e3) {
            abortFlowException = e3;
            addsignaleostimeoutifneeded = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (abortFlowException.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != addsignaleostimeoutifneeded) {
                throw abortFlowException;
            }
        }
        function3 = function2;
        objectRef2 = objectRef;
        if (objectRef2.element == EncoderImpl1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            throw new NoSuchElementException("Expected at least one element matching the predicate ".concat(String.valueOf(function3)));
        }
        return objectRef2.element;
        if (abortFlowException.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != addsignaleostimeoutifneeded) {
            throw abortFlowException;
        }
        function3 = function2;
        objectRef2 = objectRef;
        if (objectRef2.element == EncoderImpl1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            throw new NoSuchElementException("Expected at least one element matching the predicate ".concat(String.valueOf(function3)));
        }
        return objectRef2.element;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> Object b(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, Continuation<? super T> continuation) {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e2;
        addSignalEosTimeoutIfNeeded<? super Object> addsignaleostimeoutifneeded;
        if (continuation instanceof FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1) continuation;
            if ((flowKt__ReduceKt$firstOrNull$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$1.label -= Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(continuation);
            }
        } else {
            flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(continuation);
        }
        Object obj = flowKt__ReduceKt$firstOrNull$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = flowKt__ReduceKt$firstOrNull$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            addSignalEosTimeoutIfNeeded<? super Object> tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1<>(objectRef2);
            try {
                flowKt__ReduceKt$firstOrNull$1.L$0 = objectRef2;
                flowKt__ReduceKt$firstOrNull$1.L$1 = tuitionPaymentFragmentbindingInflater1;
                flowKt__ReduceKt$firstOrNull$1.label = 1;
                if (clampvideobitrateifnotsupported.collect(tuitionPaymentFragmentbindingInflater1, flowKt__ReduceKt$firstOrNull$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e3) {
                objectRef = objectRef2;
                e2 = e3;
                addsignaleostimeoutifneeded = tuitionPaymentFragmentbindingInflater1;
                if (e2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != addsignaleostimeoutifneeded) {
                    throw e2;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            addsignaleostimeoutifneeded = (TuitionPaymentFragmentbindingInflater1) flowKt__ReduceKt$firstOrNull$1.L$1;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$firstOrNull$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e4) {
                e2 = e4;
                if (e2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != addsignaleostimeoutifneeded) {
                    throw e2;
                }
            }
        }
        return objectRef.element;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class TuitionPaymentFragmentbindingInflater1<T> implements addSignalEosTimeoutIfNeeded<T> {
        private /* synthetic */ Ref.ObjectRef TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentbindingInflater1(Ref.ObjectRef objectRef) {
            this.TuitionPaymentFragmentbindingInflater1 = objectRef;
        }

        @Override // defpackage.addSignalEosTimeoutIfNeeded
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            this.TuitionPaymentFragmentbindingInflater1.element = t;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¸\u0006\u0006"}, d2 = {"LlambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl$b;", "LaddSignalEosTimeoutIfNeeded;", "p0", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl$b"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> implements addSignalEosTimeoutIfNeeded<T> {
        private /* synthetic */ Ref.ObjectRef TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ Function2 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function2 function2, Ref.ObjectRef objectRef) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function2;
            this.TuitionPaymentFragmentbindingInflater1 = objectRef;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Override // defpackage.addSignalEosTimeoutIfNeeded
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 flowKt__ReduceKt$first$$inlined$collectWhile$2$1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (continuation instanceof FlowKt__ReduceKt$first$$inlined$collectWhile$2$1) {
                flowKt__ReduceKt$first$$inlined$collectWhile$2$1 = (FlowKt__ReduceKt$first$$inlined$collectWhile$2$1) continuation;
                if ((flowKt__ReduceKt$first$$inlined$collectWhile$2$1.label & Integer.MIN_VALUE) != 0) {
                    flowKt__ReduceKt$first$$inlined$collectWhile$2$1.label -= Integer.MIN_VALUE;
                } else {
                    flowKt__ReduceKt$first$$inlined$collectWhile$2$1 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2$1(this, continuation);
                }
            } else {
                flowKt__ReduceKt$first$$inlined$collectWhile$2$1 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2$1(this, continuation);
            }
            Object objInvoke = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(objInvoke);
                Function2 function2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                flowKt__ReduceKt$first$$inlined$collectWhile$2$1.L$0 = this;
                flowKt__ReduceKt$first$$inlined$collectWhile$2$1.L$1 = t;
                flowKt__ReduceKt$first$$inlined$collectWhile$2$1.label = 1;
                objInvoke = function2.invoke(t, flowKt__ReduceKt$first$$inlined$collectWhile$2$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t = (T) flowKt__ReduceKt$first$$inlined$collectWhile$2$1.L$1;
                tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TuitionPaymentFragmentspecialinlinedviewModeldefault1) flowKt__ReduceKt$first$$inlined$collectWhile$2$1.L$0;
                ResultKt.throwOnFailure(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.INSTANCE;
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.element = t;
            throw new AbortFlowException(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements addSignalEosTimeoutIfNeeded<T> {
        private /* synthetic */ Ref.ObjectRef TuitionPaymentFragmentbindingInflater1;

        public b(Ref.ObjectRef objectRef) {
            this.TuitionPaymentFragmentbindingInflater1 = objectRef;
        }

        @Override // defpackage.addSignalEosTimeoutIfNeeded
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            this.TuitionPaymentFragmentbindingInflater1.element = t;
            throw new AbortFlowException(this);
        }
    }
}
