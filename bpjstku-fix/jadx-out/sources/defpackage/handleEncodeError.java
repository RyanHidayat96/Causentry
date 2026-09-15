package defpackage;

import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class handleEncodeError {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"LlambdasetActive9$b;", "LclampVideoBitrateIfNotSupported;", "LaddSignalEosTimeoutIfNeeded;", "p0", "", "collect", "(LaddSignalEosTimeoutIfNeeded;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lambdasetActive9$b"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TuitionPaymentFragmentbindingInflater1<T> implements clampVideoBitrateIfNotSupported<T> {
        private /* synthetic */ clampVideoBitrateIfNotSupported TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ Function3 b;

        public TuitionPaymentFragmentbindingInflater1(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported, Function3 function3) {
            this.TuitionPaymentFragmentbindingInflater1 = clampvideobitrateifnotsupported;
            this.b = function3;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0081  */
        /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Override // defpackage.clampVideoBitrateIfNotSupported
        public final Object collect(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<? super Unit> continuation) throws Throwable {
            FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1;
            TuitionPaymentFragmentbindingInflater1<T> tuitionPaymentFragmentbindingInflater1;
            EncoderImplExternalSyntheticLambda11 encoderImplExternalSyntheticLambda11;
            Function3 function3;
            SafeCollector safeCollector;
            Throwable th;
            SafeCollector safeCollector2;
            Function3 function4;
            if (continuation instanceof FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) {
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) continuation;
                if ((flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label & Integer.MIN_VALUE) != 0) {
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label -= Integer.MIN_VALUE;
                } else {
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1(this, continuation);
                }
            } else {
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1(this, continuation);
            }
            Object obj = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported = this.TuitionPaymentFragmentbindingInflater1;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$0 = this;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$1 = addsignaleostimeoutifneeded;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label = 1;
                    if (clampvideobitrateifnotsupported.collect(addsignaleostimeoutifneeded, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) != coroutine_suspended) {
                        tuitionPaymentFragmentbindingInflater1 = this;
                        safeCollector = new SafeCollector(addsignaleostimeoutifneeded, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.get$context());
                        function4 = tuitionPaymentFragmentbindingInflater1.b;
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$0 = safeCollector;
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$1 = null;
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label = 3;
                        if (function4.invoke(safeCollector, null, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) != coroutine_suspended) {
                            safeCollector2 = safeCollector;
                            safeCollector2.releaseIntercepted();
                            return Unit.INSTANCE;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    tuitionPaymentFragmentbindingInflater1 = this;
                    encoderImplExternalSyntheticLambda11 = new EncoderImplExternalSyntheticLambda11(th);
                    function3 = tuitionPaymentFragmentbindingInflater1.b;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$0 = th;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$1 = null;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label = 2;
                    if (handleEncodeError.TuitionPaymentFragmentspecialinlinedviewModeldefault1(encoderImplExternalSyntheticLambda11, function3, th, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) == coroutine_suspended) {
                        throw th;
                    }
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    Throwable th3 = (Throwable) flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    throw th3;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                safeCollector2 = (SafeCollector) flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    safeCollector2.releaseIntercepted();
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    th = th4;
                    safeCollector2.releaseIntercepted();
                    throw th;
                }
            }
            addsignaleostimeoutifneeded = (addSignalEosTimeoutIfNeeded) flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$1;
            tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                safeCollector = new SafeCollector(addsignaleostimeoutifneeded, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.get$context());
                try {
                    function4 = tuitionPaymentFragmentbindingInflater1.b;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$0 = safeCollector;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$1 = null;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label = 3;
                    if (function4.invoke(safeCollector, null, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) != coroutine_suspended) {
                        safeCollector2 = safeCollector;
                        safeCollector2.releaseIntercepted();
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th5) {
                    th = th5;
                    safeCollector2 = safeCollector;
                    safeCollector2.releaseIntercepted();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                encoderImplExternalSyntheticLambda11 = new EncoderImplExternalSyntheticLambda11(th);
                function3 = tuitionPaymentFragmentbindingInflater1.b;
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$0 = th;
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.L$1 = null;
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1.label = 2;
                if (handleEncodeError.TuitionPaymentFragmentspecialinlinedviewModeldefault1(encoderImplExternalSyntheticLambda11, function3, th, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1) == coroutine_suspended) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"LlambdasetActive9$b;", "LclampVideoBitrateIfNotSupported;", "LaddSignalEosTimeoutIfNeeded;", "p0", "", "collect", "(LaddSignalEosTimeoutIfNeeded;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lambdasetActive9$b"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> implements clampVideoBitrateIfNotSupported<T> {
        private /* synthetic */ Function2 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ clampVideoBitrateIfNotSupported TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public b(Function2 function2, clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = clampvideobitrateifnotsupported;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        
            if (r7.collect(r2, r0) == r1) goto L29;
         */
        @Override // defpackage.clampVideoBitrateIfNotSupported
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object collect(defpackage.addSignalEosTimeoutIfNeeded<? super T> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1
                if (r0 == 0) goto L14
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r8 = r0.label
                int r8 = r8 + r2
                r0.label = r8
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1
                r0.<init>(r6, r8)
            L19:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L47
                if (r2 == r4) goto L35
                if (r2 != r3) goto L2d
                kotlin.ResultKt.throwOnFailure(r8)
                goto L7f
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                java.lang.Object r7 = r0.L$2
                kotlinx.coroutines.flow.internal.SafeCollector r7 = (kotlinx.coroutines.flow.internal.SafeCollector) r7
                java.lang.Object r2 = r0.L$1
                addSignalEosTimeoutIfNeeded r2 = (defpackage.addSignalEosTimeoutIfNeeded) r2
                java.lang.Object r4 = r0.L$0
                handleEncodeError$b r4 = (handleEncodeError.b) r4
                kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L45
                goto L6a
            L45:
                r8 = move-exception
                goto L86
            L47:
                kotlin.ResultKt.throwOnFailure(r8)
                r8 = r0
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                kotlin.coroutines.CoroutineContext r8 = r0.get$context()
                kotlinx.coroutines.flow.internal.SafeCollector r2 = new kotlinx.coroutines.flow.internal.SafeCollector
                r2.<init>(r7, r8)
                kotlin.jvm.functions.Function2 r8 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault1     // Catch: java.lang.Throwable -> L83
                r0.L$0 = r6     // Catch: java.lang.Throwable -> L83
                r0.L$1 = r7     // Catch: java.lang.Throwable -> L83
                r0.L$2 = r2     // Catch: java.lang.Throwable -> L83
                r0.label = r4     // Catch: java.lang.Throwable -> L83
                java.lang.Object r8 = r8.invoke(r2, r0)     // Catch: java.lang.Throwable -> L83
                if (r8 == r1) goto L82
                r4 = r6
                r5 = r2
                r2 = r7
                r7 = r5
            L6a:
                r7.releaseIntercepted()
                clampVideoBitrateIfNotSupported r7 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2
                r8 = 0
                r0.L$0 = r8
                r0.L$1 = r8
                r0.L$2 = r8
                r0.label = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L7f
                goto L82
            L7f:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L82:
                return r1
            L83:
                r7 = move-exception
                r8 = r7
                r7 = r2
            L86:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: handleEncodeError.b.collect(addSignalEosTimeoutIfNeeded, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Function3<? super addSignalEosTimeoutIfNeeded<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3, Throwable th, Continuation<? super Unit> continuation) {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        if (continuation instanceof FlowKt__EmittersKt$invokeSafely$1) {
            flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) continuation;
            if ((flowKt__EmittersKt$invokeSafely$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$invokeSafely$1.label -= Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuation);
            }
        } else {
            flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuation);
        }
        Object obj = flowKt__EmittersKt$invokeSafely$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = flowKt__EmittersKt$invokeSafely$1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowKt__EmittersKt$invokeSafely$1.L$0 = th;
                flowKt__EmittersKt$invokeSafely$1.label = 1;
                if (function3.invoke(addsignaleostimeoutifneeded, th, flowKt__EmittersKt$invokeSafely$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) flowKt__EmittersKt$invokeSafely$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                ExceptionsKt.addSuppressed(th2, th);
            }
            throw th2;
        }
    }
}
