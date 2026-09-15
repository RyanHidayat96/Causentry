package androidx.content.core;

import defpackage.onEncodePaused;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", i = {0, 0}, l = {84, 85}, m = "invokeSuspend", n = {"$this$channelFlow", "disposeListener"}, s = {"L$0", "L$1"})
final class MulticastFileObserver$Companion$observe$1 extends SuspendLambda implements Function2<onEncodePaused<? super Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (defpackage.setEncoderCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r3, new androidx.content.core.MulticastFileObserver$Companion$observe$1.AnonymousClass1(), r6) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r7)
            goto L6f
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.L$1
            setCompatibleAudioProfile r1 = (defpackage.setCompatibleAudioProfile) r1
            java.lang.Object r3 = r6.L$0
            onEncodePaused r3 = (defpackage.onEncodePaused) r3
            kotlin.ResultKt.throwOnFailure(r7)
            goto L57
        L26:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.L$0
            onEncodePaused r7 = (defpackage.onEncodePaused) r7
            androidx.datastore.core.MulticastFileObserver$Companion$observe$1$flowObserver$1 r1 = new androidx.datastore.core.MulticastFileObserver$Companion$observe$1$flowObserver$1
            java.io.File r4 = r6.$file
            r1.<init>()
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            androidx.datastore.core.MulticastFileObserver$Companion r4 = androidx.content.core.MulticastFileObserver.INSTANCE
            java.io.File r5 = r6.$file
            java.io.File r5 = r5.getParentFile()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            setCompatibleAudioProfile r1 = androidx.content.core.MulticastFileObserver.Companion.access$observe(r4, r5, r1)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            r5 = r6
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r6.L$0 = r7
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r3 = r7.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r4, r5)
            if (r3 == r0) goto L72
            r3 = r7
        L57:
            androidx.datastore.core.MulticastFileObserver$Companion$observe$1$1 r7 = new androidx.datastore.core.MulticastFileObserver$Companion$observe$1$1
            r7.<init>()
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r1 = r6
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r4 = 0
            r6.L$0 = r4
            r6.L$1 = r4
            r6.label = r2
            java.lang.Object r7 = defpackage.setEncoderCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r3, r7, r1)
            if (r7 != r0) goto L6f
            goto L72
        L6f:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.MulticastFileObserver$Companion$observe$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MulticastFileObserver$Companion$observe$1(File file, Continuation<? super MulticastFileObserver$Companion$observe$1> continuation) {
        super(2, continuation);
        this.$file = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.$file, continuation);
        multicastFileObserver$Companion$observe$1.L$0 = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(onEncodePaused<? super Unit> onencodepaused, Continuation<? super Unit> continuation) {
        return ((MulticastFileObserver$Companion$observe$1) create(onencodepaused, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
