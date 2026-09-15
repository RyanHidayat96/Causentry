package defpackage;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class lambdahandleEncodeError10androidxcameravideointernalencoderEncoderImpl {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> implements clampVideoBitrateIfNotSupported<T> {
        private /* synthetic */ clampVideoBitrateIfNotSupported TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: lambdahandleEncodeError10androidxcameravideointernalencoderEncoderImpl$TuitionPaymentFragmentspecialinlinedviewModeldefault3$2, reason: invalid class name */
        /* JADX INFO: loaded from: classes7.dex */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class AnonymousClass2<T> implements addSignalEosTimeoutIfNeeded {
            private /* synthetic */ addSignalEosTimeoutIfNeeded b;

            /* JADX WARN: Code duplicated, block: B:7:0x0014  */
            @Override // defpackage.addSignalEosTimeoutIfNeeded
            public final Object emit(T t, Continuation<? super Unit> continuation) {
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1;
                if (continuation instanceof FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1) {
                    flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 = (FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1) continuation;
                    if ((flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.label & Integer.MIN_VALUE) != 0) {
                        flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.label -= Integer.MIN_VALUE;
                    } else {
                        flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1(this, continuation);
                    }
                } else {
                    flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1(this, continuation);
                }
                Object obj = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded = this.b;
                    if (t != null) {
                        flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.label = 1;
                        if (addsignaleostimeoutifneeded.emit(t, flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            public AnonymousClass2(addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded) {
                this.b = addsignaleostimeoutifneeded;
            }
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = clampvideobitrateifnotsupported;
        }

        @Override // defpackage.clampVideoBitrateIfNotSupported
        public final Object collect(addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded, Continuation continuation) {
            Object objCollect = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.collect(new AnonymousClass2(addsignaleostimeoutifneeded), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements clampVideoBitrateIfNotSupported<T> {
        private /* synthetic */ Function2 TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ clampVideoBitrateIfNotSupported b;

        /* JADX INFO: renamed from: lambdahandleEncodeError10androidxcameravideointernalencoderEncoderImpl$b$2, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class AnonymousClass2<T> implements addSignalEosTimeoutIfNeeded {
            private /* synthetic */ addSignalEosTimeoutIfNeeded TuitionPaymentFragmentbindingInflater1;
            private /* synthetic */ Function2 b;

            /* JADX WARN: Code duplicated, block: B:7:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
            
                if (r6.emit(r2, r0) == r1) goto L24;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.addSignalEosTimeoutIfNeeded
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                    if (r0 == 0) goto L14
                    r0 = r7
                    kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L14
                    int r7 = r0.label
                    int r7 = r7 + r2
                    r0.label = r7
                    goto L19
                L14:
                    kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                    r0.<init>(r5, r7)
                L19:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3f
                    if (r2 == r4) goto L35
                    if (r2 != r3) goto L2d
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L65
                L2d:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L35:
                    java.lang.Object r6 = r0.L$1
                    addSignalEosTimeoutIfNeeded r6 = (defpackage.addSignalEosTimeoutIfNeeded) r6
                    java.lang.Object r2 = r0.L$0
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L57
                L3f:
                    kotlin.ResultKt.throwOnFailure(r7)
                    addSignalEosTimeoutIfNeeded r7 = r5.TuitionPaymentFragmentbindingInflater1
                    r2 = r0
                    kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                    kotlin.jvm.functions.Function2 r2 = r5.b
                    r0.L$0 = r6
                    r0.L$1 = r7
                    r0.label = r4
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    if (r2 == r1) goto L68
                    r2 = r6
                    r6 = r7
                L57:
                    r7 = 0
                    r0.L$0 = r7
                    r0.L$1 = r7
                    r0.label = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L65
                    goto L68
                L65:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                L68:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: lambdahandleEncodeError10androidxcameravideointernalencoderEncoderImpl.b.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }

            public AnonymousClass2(addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded, Function2 function2) {
                this.TuitionPaymentFragmentbindingInflater1 = addsignaleostimeoutifneeded;
                this.b = function2;
            }
        }

        public b(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported, Function2 function2) {
            this.b = clampvideobitrateifnotsupported;
            this.TuitionPaymentFragmentbindingInflater1 = function2;
        }

        @Override // defpackage.clampVideoBitrateIfNotSupported
        public final Object collect(addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded, Continuation continuation) {
            Object objCollect = this.b.collect(new AnonymousClass2(addsignaleostimeoutifneeded, this.TuitionPaymentFragmentbindingInflater1), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }
}
