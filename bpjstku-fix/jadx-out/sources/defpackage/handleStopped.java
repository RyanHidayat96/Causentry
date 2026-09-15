package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class handleStopped {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"LlambdasetActive9$b;", "LclampVideoBitrateIfNotSupported;", "LaddSignalEosTimeoutIfNeeded;", "p0", "", "collect", "(LaddSignalEosTimeoutIfNeeded;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lambdasetActive9$b"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TuitionPaymentFragmentbindingInflater1<T> implements clampVideoBitrateIfNotSupported<T> {
        private /* synthetic */ clampVideoBitrateIfNotSupported TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ Function4 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentbindingInflater1(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported, Function4 function4) {
            this.TuitionPaymentFragmentbindingInflater1 = clampvideobitrateifnotsupported;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function4;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0072  */
        /* JADX WARN: Code duplicated, block: B:22:0x007b  */
        /* JADX WARN: Code duplicated, block: B:25:0x0092  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a3 A[PHI: r2 r5 r7 r11
  0x00a3: PHI (r2v5 addSignalEosTimeoutIfNeeded<? super T>) = (r2v1 addSignalEosTimeoutIfNeeded<? super T>), (r2v6 addSignalEosTimeoutIfNeeded<? super T>) binds: [B:21:0x0079, B:28:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x00a3: PHI (r5v3 long) = (r5v1 long), (r5v5 long) binds: [B:21:0x0079, B:28:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x00a3: PHI (r7v4 handleStopped$TuitionPaymentFragmentbindingInflater1<T>) = 
  (r7v0 handleStopped$TuitionPaymentFragmentbindingInflater1<T>)
  (r7v5 handleStopped$TuitionPaymentFragmentbindingInflater1<T>)
 binds: [B:21:0x0079, B:28:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x00a3: PHI (r11v7 int) = (r11v1 int), (r11v12 int) binds: [B:21:0x0079, B:28:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0079 -> B:30:0x00a3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0092 -> B:26:0x0095). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.clampVideoBitrateIfNotSupported
        public final java.lang.Object collect(defpackage.addSignalEosTimeoutIfNeeded<? super T> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1
                if (r0 == 0) goto L14
                r0 = r12
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r12 = r0.label
                int r12 = r12 + r2
                r0.label = r12
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1
                r0.<init>(r10, r12)
            L19:
                java.lang.Object r12 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L53
                if (r2 == r4) goto L43
                if (r2 != r3) goto L3b
                long r5 = r0.J$0
                java.lang.Object r11 = r0.L$2
                java.lang.Throwable r11 = (java.lang.Throwable) r11
                java.lang.Object r2 = r0.L$1
                addSignalEosTimeoutIfNeeded r2 = (defpackage.addSignalEosTimeoutIfNeeded) r2
                java.lang.Object r7 = r0.L$0
                handleStopped$TuitionPaymentFragmentbindingInflater1 r7 = (handleStopped.TuitionPaymentFragmentbindingInflater1) r7
                kotlin.ResultKt.throwOnFailure(r12)
                goto L95
            L3b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L43:
                int r11 = r0.I$0
                long r5 = r0.J$0
                java.lang.Object r2 = r0.L$1
                addSignalEosTimeoutIfNeeded r2 = (defpackage.addSignalEosTimeoutIfNeeded) r2
                java.lang.Object r7 = r0.L$0
                handleStopped$TuitionPaymentFragmentbindingInflater1 r7 = (handleStopped.TuitionPaymentFragmentbindingInflater1) r7
                kotlin.ResultKt.throwOnFailure(r12)
                goto L77
            L53:
                kotlin.ResultKt.throwOnFailure(r12)
                r12 = r0
                kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12
                r5 = 0
                r12 = r10
            L5c:
                clampVideoBitrateIfNotSupported r2 = r12.TuitionPaymentFragmentbindingInflater1
                r0.L$0 = r12
                r0.L$1 = r11
                r7 = 0
                r0.L$2 = r7
                r0.J$0 = r5
                r7 = 0
                r0.I$0 = r7
                r0.label = r4
                java.lang.Object r2 = defpackage.handleStopped.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r2, r11, r0)
                if (r2 == r1) goto Lab
                r9 = r2
                r2 = r11
                r11 = r7
                r7 = r12
                r12 = r9
            L77:
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                if (r12 == 0) goto La3
                kotlin.jvm.functions.Function4 r11 = r7.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
                r0.L$0 = r7
                r0.L$1 = r2
                r0.L$2 = r12
                r0.J$0 = r5
                r0.label = r3
                java.lang.Object r11 = r11.invoke(r2, r12, r8, r0)
                if (r11 != r1) goto L92
                goto Lab
            L92:
                r9 = r12
                r12 = r11
                r11 = r9
            L95:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto La2
                r11 = 1
                long r5 = r5 + r11
                r11 = r4
                goto La3
            La2:
                throw r11
            La3:
                r12 = r7
                if (r11 != 0) goto La9
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            La9:
                r11 = r2
                goto L5c
            Lab:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: handleStopped.TuitionPaymentFragmentbindingInflater1.collect(addSignalEosTimeoutIfNeeded, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"LlambdasetActive9$b;", "LclampVideoBitrateIfNotSupported;", "LaddSignalEosTimeoutIfNeeded;", "p0", "", "collect", "(LaddSignalEosTimeoutIfNeeded;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lambdasetActive9$b"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> implements clampVideoBitrateIfNotSupported<T> {
        private /* synthetic */ clampVideoBitrateIfNotSupported TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ Function3 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public b(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported, Function3 function3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = clampvideobitrateifnotsupported;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function3;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        
            if (r2.invoke(r6, r7, r0) == r1) goto L26;
         */
        @Override // defpackage.clampVideoBitrateIfNotSupported
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object collect(defpackage.addSignalEosTimeoutIfNeeded<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1
                if (r0 == 0) goto L14
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r7 = r0.label
                int r7 = r7 + r2
                r0.label = r7
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1
                r0.<init>(r5, r7)
            L19:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L41
                if (r2 == r4) goto L35
                if (r2 != r3) goto L2d
                kotlin.ResultKt.throwOnFailure(r7)
                goto L6a
            L2d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L35:
                java.lang.Object r6 = r0.L$1
                addSignalEosTimeoutIfNeeded r6 = (defpackage.addSignalEosTimeoutIfNeeded) r6
                java.lang.Object r2 = r0.L$0
                handleStopped$b r2 = (handleStopped.b) r2
                kotlin.ResultKt.throwOnFailure(r7)
                goto L56
            L41:
                kotlin.ResultKt.throwOnFailure(r7)
                r7 = r0
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                clampVideoBitrateIfNotSupported r7 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r4
                java.lang.Object r7 = defpackage.handleStopped.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r7, r6, r0)
                if (r7 == r1) goto L6d
                r2 = r5
            L56:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6a
                kotlin.jvm.functions.Function3 r2 = r2.TuitionPaymentFragmentspecialinlinedviewModeldefault2
                r4 = 0
                r0.L$0 = r4
                r0.L$1 = r4
                r0.label = r3
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                if (r6 != r1) goto L6a
                goto L6d
            L6a:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L6d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: handleStopped.b.collect(addSignalEosTimeoutIfNeeded, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(clampVideoBitrateIfNotSupported<? extends T> clampvideobitrateifnotsupported, addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Continuation<? super Throwable> continuation) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        Throwable th;
        Ref.ObjectRef objectRef;
        VideoMimeInfoBuilder videoMimeInfoBuilder;
        if (continuation instanceof FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1) continuation;
            if ((flowKt__ErrorsKt$catchImpl$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$1.label -= Integer.MIN_VALUE;
            } else {
                flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuation);
            }
        } else {
            flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuation);
        }
        Object obj = flowKt__ErrorsKt$catchImpl$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = flowKt__ErrorsKt$catchImpl$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                addSignalEosTimeoutIfNeeded<? super Object> tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3<>(addsignaleostimeoutifneeded, objectRef2);
                flowKt__ErrorsKt$catchImpl$1.L$0 = objectRef2;
                flowKt__ErrorsKt$catchImpl$1.label = 1;
                if (clampvideobitrateifnotsupported.collect(tuitionPaymentFragmentspecialinlinedviewModeldefault3, flowKt__ErrorsKt$catchImpl$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                objectRef = objectRef2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) flowKt__ErrorsKt$catchImpl$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        Throwable th4 = (Throwable) objectRef.element;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(th, th4) || ((videoMimeInfoBuilder = (VideoMimeInfoBuilder) flowKt__ErrorsKt$catchImpl$1.get$context().get(VideoMimeInfoBuilder.b)) != null && videoMimeInfoBuilder.d() && TuitionPaymentFragmentspecialinlinedviewModeldefault2(th, videoMimeInfoBuilder.s_()))) {
            throw th;
        }
        if (th4 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            ExceptionsKt.addSuppressed(th4, th);
            throw th4;
        }
        ExceptionsKt.addSuppressed(th, th4);
        throw th;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> implements addSignalEosTimeoutIfNeeded {
        private /* synthetic */ Ref.ObjectRef<Throwable> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ addSignalEosTimeoutIfNeeded<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Override // defpackage.addSignalEosTimeoutIfNeeded
        public final Object emit(T t, Continuation<? super Unit> continuation) throws Throwable {
            FlowKt__ErrorsKt$catchImpl$2$emit$1 flowKt__ErrorsKt$catchImpl$2$emit$1;
            Object obj;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (continuation instanceof FlowKt__ErrorsKt$catchImpl$2$emit$1) {
                flowKt__ErrorsKt$catchImpl$2$emit$1 = (FlowKt__ErrorsKt$catchImpl$2$emit$1) continuation;
                if ((flowKt__ErrorsKt$catchImpl$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                    flowKt__ErrorsKt$catchImpl$2$emit$1.label -= Integer.MIN_VALUE;
                } else {
                    flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, continuation);
                }
            } else {
                flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, continuation);
            }
            Object obj2 = flowKt__ErrorsKt$catchImpl$2$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) flowKt__ErrorsKt$catchImpl$2$emit$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj2);
                    return Unit.INSTANCE;
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    this = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
                    if (r0 == 0) goto L14
                    r0 = r6
                    kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L14
                    int r6 = r0.label
                    int r6 = r6 + r2
                    r0.label = r6
                    goto L19
                L14:
                    kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
                    r0.<init>(r4, r6)
                L19:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L38
                    if (r2 != r3) goto L30
                    java.lang.Object r5 = r0.L$0
                    handleStopped$TuitionPaymentFragmentspecialinlinedviewModeldefault3 r5 = (handleStopped.TuitionPaymentFragmentspecialinlinedviewModeldefault3) r5
                    kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2e
                    goto L48
                L2e:
                    r6 = move-exception
                    goto L4e
                L30:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L38:
                    kotlin.ResultKt.throwOnFailure(r6)
                    addSignalEosTimeoutIfNeeded<T> r6 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2     // Catch: java.lang.Throwable -> L4b
                    r0.L$0 = r4     // Catch: java.lang.Throwable -> L4b
                    r0.label = r3     // Catch: java.lang.Throwable -> L4b
                    java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4b
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                L4b:
                    r5 = move-exception
                    r6 = r5
                    r5 = r4
                L4e:
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r5 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                    r5.element = r6
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: handleStopped.TuitionPaymentFragmentspecialinlinedviewModeldefault3.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }

            /* JADX WARN: Multi-variable type inference failed */
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, Ref.ObjectRef<Throwable> objectRef) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = addsignaleostimeoutifneeded;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = objectRef;
            }
        }

        private static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th, Throwable th2) {
            if (th2 == null) {
                return false;
            }
            if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                th2 = reachEndData.b(th2);
            }
            if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                th = reachEndData.b(th);
            }
            return Intrinsics.areEqual(th2, th);
        }
    }
