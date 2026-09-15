package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lambdanotifyError11 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1554498983;

    public static final <T> Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(addSignalEosTimeoutIfNeeded<? super T> addsignaleostimeoutifneeded, EncoderSurfaceInput<? extends T> encoderSurfaceInput, Continuation<? super Unit> continuation) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(addsignaleostimeoutifneeded, encoderSurfaceInput, true, continuation);
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentspecialinlinedviewModeldefault3 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #0 {all -> 0x009d, blocks: (B:13:0x0037, B:23:0x0062, B:26:0x0076, B:28:0x007e, B:18:0x0053, B:22:0x005e), top: B:44:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L35;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0090 -> B:14:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(defpackage.addSignalEosTimeoutIfNeeded<? super T> r6, defpackage.EncoderSurfaceInput<? extends T> r7, boolean r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 + r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$2
            getEncoderInfo r6 = (defpackage.getEncoderInfo) r6
            java.lang.Object r7 = r0.L$1
            EncoderSurfaceInput r7 = (defpackage.EncoderSurfaceInput) r7
            java.lang.Object r2 = r0.L$0
            addSignalEosTimeoutIfNeeded r2 = (defpackage.addSignalEosTimeoutIfNeeded) r2
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L9d
        L3a:
            r9 = r6
            r6 = r2
            goto L62
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L45:
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$2
            getEncoderInfo r6 = (defpackage.getEncoderInfo) r6
            java.lang.Object r7 = r0.L$1
            EncoderSurfaceInput r7 = (defpackage.EncoderSurfaceInput) r7
            java.lang.Object r2 = r0.L$0
            addSignalEosTimeoutIfNeeded r2 = (defpackage.addSignalEosTimeoutIfNeeded) r2
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L9d
            goto L76
        L57:
            kotlin.ResultKt.throwOnFailure(r9)
            boolean r9 = r6 instanceof defpackage.EncoderImplExternalSyntheticLambda11
            if (r9 != 0) goto La6
            getEncoderInfo r9 = r7.a()     // Catch: java.lang.Throwable -> L9d
        L62:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9d
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L9d
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L9d
            r0.Z$0 = r8     // Catch: java.lang.Throwable -> L9d
            r0.label = r4     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r2 = r9.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r0)     // Catch: java.lang.Throwable -> L9d
            if (r2 == r1) goto L9c
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L76:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L9d
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L9d
            if (r9 == 0) goto L93
            java.lang.Object r9 = r6.b()     // Catch: java.lang.Throwable -> L9d
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L9d
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L9d
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L9d
            r0.Z$0 = r8     // Catch: java.lang.Throwable -> L9d
            r0.label = r3     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L9d
            if (r9 != r1) goto L3a
            goto L9c
        L93:
            if (r8 == 0) goto L99
            r6 = 0
            defpackage.EncoderByteBufferInput.b(r7, r6)
        L99:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L9c:
            return r1
        L9d:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L9f
        L9f:
            r9 = move-exception
            if (r8 == 0) goto La5
            defpackage.EncoderByteBufferInput.b(r7, r6)
        La5:
            throw r9
        La6:
            EncoderImplExternalSyntheticLambda11 r6 = (defpackage.EncoderImplExternalSyntheticLambda11) r6
            java.lang.Throwable r6 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdanotifyError11.TuitionPaymentFragmentspecialinlinedviewModeldefault3(addSignalEosTimeoutIfNeeded, EncoderSurfaceInput, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(EncoderSurfaceInput<? extends T> encoderSurfaceInput) {
        return new EncoderConfig(encoderSurfaceInput, false, null, 0, null, 28, null);
    }

    public static final <T> clampVideoBitrateIfNotSupported<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(EncoderSurfaceInput<? extends T> encoderSurfaceInput) {
        return new EncoderConfig(encoderSurfaceInput, true, null, 0, null, 28, null);
    }
}
