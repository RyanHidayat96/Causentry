package defpackage;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl {

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> implements addSignalEosTimeoutIfNeeded {
        private /* synthetic */ Ref.IntRef TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ addSignalEosTimeoutIfNeeded<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ int b;

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Override // defpackage.addSignalEosTimeoutIfNeeded
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            FlowKt__LimitKt$drop$2$1$emit$1 flowKt__LimitKt$drop$2$1$emit$1;
            if (continuation instanceof FlowKt__LimitKt$drop$2$1$emit$1) {
                flowKt__LimitKt$drop$2$1$emit$1 = (FlowKt__LimitKt$drop$2$1$emit$1) continuation;
                if ((flowKt__LimitKt$drop$2$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                    flowKt__LimitKt$drop$2$1$emit$1.label -= Integer.MIN_VALUE;
                } else {
                    flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, continuation);
                }
            } else {
                flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, continuation);
            }
            Object obj = flowKt__LimitKt$drop$2$1$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = flowKt__LimitKt$drop$2$1$emit$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.element < this.b) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.element++;
                    int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.element;
                    return Unit.INSTANCE;
                }
                addSignalEosTimeoutIfNeeded<T> addsignaleostimeoutifneeded = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                flowKt__LimitKt$drop$2$1$emit$1.label = 1;
                if (addsignaleostimeoutifneeded.emit(t, flowKt__LimitKt$drop$2$1$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
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
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Ref.IntRef intRef, int i, addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = intRef;
            this.b = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = addsignaleostimeoutifneeded;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class TuitionPaymentFragmentbindingInflater1<T> implements addSignalEosTimeoutIfNeeded {
        private /* synthetic */ addSignalEosTimeoutIfNeeded<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ Ref.BooleanRef b;

        /* JADX WARN: Code duplicated, block: B:29:0x0073  */
        /* JADX WARN: Code duplicated, block: B:34:0x008a  */
        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        
            if (r8.emit(r7, r0) != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L36;
         */
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
                if (r0 == 0) goto L14
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r8 = r0.label
                int r8 = r8 + r2
                r0.label = r8
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
                r0.<init>(r6, r8)
            L19:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L46
                if (r2 == r5) goto L42
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                kotlin.ResultKt.throwOnFailure(r8)
                goto L87
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L38:
                java.lang.Object r7 = r0.L$1
                java.lang.Object r2 = r0.L$0
                lambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl$TuitionPaymentFragmentbindingInflater1 r2 = (lambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentbindingInflater1) r2
                kotlin.ResultKt.throwOnFailure(r8)
                goto L6b
            L42:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L59
            L46:
                kotlin.ResultKt.throwOnFailure(r8)
                kotlin.jvm.internal.Ref$BooleanRef r8 = r6.b
                boolean r8 = r8.element
                if (r8 == 0) goto L5c
                addSignalEosTimeoutIfNeeded<T> r8 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                r0.label = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 == r1) goto L8d
            L59:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L5c:
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r8 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2
                r0.L$0 = r6
                r0.L$1 = r7
                r0.label = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 == r1) goto L8d
                r2 = r6
            L6b:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8a
                kotlin.jvm.internal.Ref$BooleanRef r8 = r2.b
                r8.element = r5
                addSignalEosTimeoutIfNeeded<T> r8 = r2.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                r2 = 0
                r0.L$0 = r2
                r0.L$1 = r2
                r0.label = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L87
                goto L8d
            L87:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L8a:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L8d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: lambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentbindingInflater1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        TuitionPaymentFragmentbindingInflater1(Ref.BooleanRef booleanRef, addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
            this.b = booleanRef;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = addsignaleostimeoutifneeded;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> implements clampVideoBitrateIfNotSupported<T> {
        private /* synthetic */ clampVideoBitrateIfNotSupported TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported, int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = clampvideobitrateifnotsupported;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        }

        @Override // defpackage.clampVideoBitrateIfNotSupported
        public final Object collect(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<? super Unit> continuation) {
            Object objCollect = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.collect(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Ref.IntRef(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, addsignaleostimeoutifneeded), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> implements clampVideoBitrateIfNotSupported<T> {
        private /* synthetic */ Function2 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ clampVideoBitrateIfNotSupported b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported, Function2 function2) {
            this.b = clampvideobitrateifnotsupported;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function2;
        }

        @Override // defpackage.clampVideoBitrateIfNotSupported
        public final Object collect(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<? super Unit> continuation) {
            Object objCollect = this.b.collect(new TuitionPaymentFragmentbindingInflater1(new Ref.BooleanRef(), addsignaleostimeoutifneeded, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"LlambdasetActive9$b;", "LclampVideoBitrateIfNotSupported;", "LaddSignalEosTimeoutIfNeeded;", "p0", "", "collect", "(LaddSignalEosTimeoutIfNeeded;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lambdasetActive9$b"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class asBinder<T> implements clampVideoBitrateIfNotSupported<T> {
        private /* synthetic */ Function2 TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ clampVideoBitrateIfNotSupported b;

        public asBinder(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported, Function2 function2) {
            this.b = clampvideobitrateifnotsupported;
            this.TuitionPaymentFragmentbindingInflater1 = function2;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x005f  */
        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Override // defpackage.clampVideoBitrateIfNotSupported
        public final Object collect(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<? super Unit> continuation) {
            FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1;
            AbortFlowException e2;
            asInterface asinterface;
            if (continuation instanceof FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1) {
                flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 = (FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1) continuation;
                if ((flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.label & Integer.MIN_VALUE) != 0) {
                    flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.label -= Integer.MIN_VALUE;
                } else {
                    flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1(this, continuation);
                }
            } else {
                flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1(this, continuation);
            }
            Object obj = flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported = this.b;
                asInterface asinterface2 = new asInterface(this.TuitionPaymentFragmentbindingInflater1, addsignaleostimeoutifneeded);
                try {
                    flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.L$0 = asinterface2;
                    flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.label = 1;
                    if (clampvideobitrateifnotsupported.collect(asinterface2, flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (AbortFlowException e3) {
                    e2 = e3;
                    asinterface = asinterface2;
                    if (e2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != asinterface) {
                        throw e2;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                asinterface = (asInterface) flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (AbortFlowException e4) {
                    e2 = e4;
                    if (e2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != asinterface) {
                        throw e2;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¸\u0006\u0006"}, d2 = {"LlambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl$b;", "LaddSignalEosTimeoutIfNeeded;", "p0", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl$b"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class asInterface<T> implements addSignalEosTimeoutIfNeeded<T> {
        private /* synthetic */ Function2 TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ addSignalEosTimeoutIfNeeded TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public asInterface(Function2 function2, addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded) {
            this.TuitionPaymentFragmentbindingInflater1 = function2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = addsignaleostimeoutifneeded;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0079  */
        /* JADX WARN: Code duplicated, block: B:28:0x007c  */
        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
        
            if (r2.emit(r9, r0) == r1) goto L30;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.addSignalEosTimeoutIfNeeded
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1
                if (r0 == 0) goto L14
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r9 = r0.label
                int r9 = r9 + r2
                r0.label = r9
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1
                r0.<init>(r7, r9)
            L19:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L47
                if (r2 == r4) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.L$0
                lambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl$asInterface r8 = (lambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl.asInterface) r8
                kotlin.ResultKt.throwOnFailure(r9)
                goto L77
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                java.lang.Object r8 = r0.L$1
                java.lang.Object r2 = r0.L$0
                lambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl$asInterface r2 = (lambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl.asInterface) r2
                kotlin.ResultKt.throwOnFailure(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L5e
            L47:
                kotlin.ResultKt.throwOnFailure(r9)
                r9 = r0
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                kotlin.jvm.functions.Function2 r9 = r7.TuitionPaymentFragmentbindingInflater1
                r0.L$0 = r7
                r0.L$1 = r8
                r0.label = r4
                java.lang.Object r9 = r9.invoke(r8, r0)
                if (r9 == r1) goto L82
                r2 = r9
                r9 = r8
                r8 = r7
            L5e:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L76
                addSignalEosTimeoutIfNeeded r2 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                r0.L$0 = r8
                r5 = 0
                r0.L$1 = r5
                r0.label = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L77
                goto L82
            L76:
                r4 = 0
            L77:
                if (r4 == 0) goto L7c
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L7c:
                kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r9.<init>(r8)
                throw r9
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: lambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl.asInterface.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LlambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl$b;", "LaddSignalEosTimeoutIfNeeded;", "p0", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 176)
    public static final class b<T> implements addSignalEosTimeoutIfNeeded<T> {
        private /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> b;

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Override // defpackage.addSignalEosTimeoutIfNeeded
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            FlowKt__LimitKt$collectWhile$collector$1$emit$1 flowKt__LimitKt$collectWhile$collector$1$emit$1;
            if (continuation instanceof FlowKt__LimitKt$collectWhile$collector$1$emit$1) {
                flowKt__LimitKt$collectWhile$collector$1$emit$1 = (FlowKt__LimitKt$collectWhile$collector$1$emit$1) continuation;
                if ((flowKt__LimitKt$collectWhile$collector$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                    flowKt__LimitKt$collectWhile$collector$1$emit$1.label -= Integer.MIN_VALUE;
                } else {
                    flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, continuation);
                }
            } else {
                flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, continuation);
            }
            Object obj = flowKt__LimitKt$collectWhile$collector$1$emit$1.result;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = flowKt__LimitKt$collectWhile$collector$1$emit$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowKt__LimitKt$collectWhile$collector$1$emit$1.L$0 = this;
                flowKt__LimitKt$collectWhile$collector$1$emit$1.label = 1;
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) flowKt__LimitKt$collectWhile$collector$1$emit$1.L$0;
            ResultKt.throwOnFailure(obj);
            if (!((Boolean) obj).booleanValue()) {
                throw new AbortFlowException(bVar);
            }
            return Unit.INSTANCE;
        }
    }
}
