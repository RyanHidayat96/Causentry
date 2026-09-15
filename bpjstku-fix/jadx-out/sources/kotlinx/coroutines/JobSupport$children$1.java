package kotlinx.coroutines;

import defpackage.AudioEncoderConfigBuilder;
import defpackage.VideoMimeInfoBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lkotlinx/coroutines/Job;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {1003, 1005}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
public final class JobSupport$children$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super VideoMimeInfoBuilder>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AudioEncoderConfigBuilder this$0;

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0070 -> B:27:0x0086). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:27:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r1 = r6.L$2
            lambdasendEncodedData3 r1 = (defpackage.lambdasendEncodedData3) r1
            java.lang.Object r3 = r6.L$1
            isEndOfStream r3 = (defpackage.isEndOfStream) r3
            java.lang.Object r4 = r6.L$0
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.throwOnFailure(r7)
            goto L86
        L1e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L26:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L8b
        L2a:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.L$0
            kotlin.sequences.SequenceScope r7 = (kotlin.sequences.SequenceScope) r7
            AudioEncoderConfigBuilder r1 = r6.this$0
            java.lang.Object r1 = r1.getInterfaceDescriptor()
            boolean r4 = r1 instanceof defpackage.isHuaweiMate20Pro
            if (r4 == 0) goto L4b
            isHuaweiMate20Pro r1 = (defpackage.isHuaweiMate20Pro) r1
            isHuaweiP40Lite r1 = r1.b
            r2 = r6
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r6.label = r3
            java.lang.Object r7 = r7.yield(r1, r2)
            if (r7 != r0) goto L8b
            goto L85
        L4b:
            boolean r3 = r1 instanceof defpackage.MimeInfoBuilder
            if (r3 == 0) goto L8b
            MimeInfoBuilder r1 = (defpackage.MimeInfoBuilder) r1
            AutoValue_AudioEncoderConfig r1 = r1.getTuitionPaymentFragmentbindingInflater1()
            if (r1 == 0) goto L8b
            isEndOfStream r1 = (defpackage.isEndOfStream) r1
            java.lang.Object r3 = r1.asBinder()
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            lambdasendEncodedData3 r3 = (defpackage.lambdasendEncodedData3) r3
            r4 = r7
            r5 = r3
            r3 = r1
            r1 = r5
        L68:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r7 != 0) goto L8b
            boolean r7 = r1 instanceof defpackage.isHuaweiMate20Pro
            if (r7 == 0) goto L86
            r7 = r1
            isHuaweiMate20Pro r7 = (defpackage.isHuaweiMate20Pro) r7
            isHuaweiP40Lite r7 = r7.b
            r6.L$0 = r4
            r6.L$1 = r3
            r6.L$2 = r1
            r6.label = r2
            java.lang.Object r7 = r4.yield(r7, r6)
            if (r7 != r0) goto L86
        L85:
            return r0
        L86:
            lambdasendEncodedData3 r1 = r1.d()
            goto L68
        L8b:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(SequenceScope<? super VideoMimeInfoBuilder> sequenceScope, Continuation<? super Unit> continuation) {
        return ((JobSupport$children$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(AudioEncoderConfigBuilder audioEncoderConfigBuilder, Continuation<? super JobSupport$children$1> continuation) {
        super(2, continuation);
        this.this$0 = audioEncoderConfigBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.this$0, continuation);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }
}
