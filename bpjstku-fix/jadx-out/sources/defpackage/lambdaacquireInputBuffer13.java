package defpackage;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public final class lambdaacquireInputBuffer13<T> implements clampVideoBitrateIfNotSupported<T> {
    public final Function1<T, Object> TuitionPaymentFragmentbindingInflater1;
    private final clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final Function2<Object, Object, Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX WARN: Multi-variable type inference failed */
    public lambdaacquireInputBuffer13(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = clampvideobitrateifnotsupported;
        this.TuitionPaymentFragmentbindingInflater1 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function2;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> implements addSignalEosTimeoutIfNeeded {
        private /* synthetic */ Ref.ObjectRef<Object> TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ addSignalEosTimeoutIfNeeded<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ lambdaacquireInputBuffer13<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.addSignalEosTimeoutIfNeeded
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
            if (continuation instanceof DistinctFlowImpl$collect$2$emit$1) {
                distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) continuation;
                if ((distinctFlowImpl$collect$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                    distinctFlowImpl$collect$2$emit$1.label -= Integer.MIN_VALUE;
                } else {
                    distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, continuation);
                }
            } else {
                distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, continuation);
            }
            Object obj = distinctFlowImpl$collect$2$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = distinctFlowImpl$collect$2$emit$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                T t2 = (T) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.invoke(t);
                if (this.TuitionPaymentFragmentbindingInflater1.element == EncoderImpl1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 || !this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(this.TuitionPaymentFragmentbindingInflater1.element, t2).booleanValue()) {
                    this.TuitionPaymentFragmentbindingInflater1.element = t2;
                    addSignalEosTimeoutIfNeeded<T> addsignaleostimeoutifneeded = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    distinctFlowImpl$collect$2$emit$1.label = 1;
                    if (addsignaleostimeoutifneeded.emit(t, distinctFlowImpl$collect$2$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(lambdaacquireInputBuffer13<T> lambdaacquireinputbuffer13, Ref.ObjectRef<Object> objectRef, addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdaacquireinputbuffer13;
            this.TuitionPaymentFragmentbindingInflater1 = objectRef;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = addsignaleostimeoutifneeded;
        }
    }

    @Override // defpackage.clampVideoBitrateIfNotSupported
    public final Object collect(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<? super Unit> continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) EncoderImpl1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Object objCollect = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.collect(new b(this, objectRef, addsignaleostimeoutifneeded), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
