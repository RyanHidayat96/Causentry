package coil.intercept;

import defpackage.IMediaControllerCallbackStub;
import defpackage.getMediaId;
import defpackage.getStarRating;
import defpackage.newInstance;
import defpackage.newUnratedRating;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", i = {0, 0, 0}, l = {246}, m = "invokeSuspend", n = {"$this$withContext", "$this$foldIndices$iv", "i$iv"}, s = {"L$0", "L$1", "I$0"})
public final class EngineInterceptor$transform$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super newInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault1>, Object> {
    final /* synthetic */ getMediaId $eventListener;
    final /* synthetic */ getStarRating $options;
    final /* synthetic */ newUnratedRating $request;
    final /* synthetic */ newInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault1 $result;
    final /* synthetic */ List<IMediaControllerCallbackStub> $transformations;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ newInstance this$0;

    /* JADX WARN: Code duplicated, block: B:10:0x0052  */
    /* JADX WARN: Code duplicated, block: B:12:0x006d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x006b -> B:13:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L27
            if (r1 != r2) goto L1f
            int r1 = r8.I$1
            int r3 = r8.I$0
            java.lang.Object r4 = r8.L$2
            getStarRating r4 = (defpackage.getStarRating) r4
            java.lang.Object r5 = r8.L$1
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r8.L$0
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            kotlin.ResultKt.throwOnFailure(r9)
            goto L6e
        L1f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L27:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            newInstance r1 = r8.this$0
            newInstance$TuitionPaymentFragmentspecialinlinedviewModeldefault1 r3 = r8.$result
            android.graphics.drawable.Drawable r3 = r3.getTuitionPaymentFragmentspecialinlinedviewModeldefault1()
            getStarRating r4 = r8.$options
            java.util.List<IMediaControllerCallbackStub> r5 = r8.$transformations
            android.graphics.Bitmap r1 = defpackage.newInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r1, r3, r4, r5)
            java.util.List<IMediaControllerCallbackStub> r3 = r8.$transformations
            getStarRating r4 = r8.$options
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r6 = 0
            r7 = r6
            r6 = r9
            r9 = r1
            r1 = r5
            r5 = r3
            r3 = r7
        L50:
            if (r3 >= r1) goto L75
            java.lang.Object r9 = r5.get(r3)
            IMediaControllerCallbackStub r9 = (defpackage.IMediaControllerCallbackStub) r9
            r4.cancel()
            r8.L$0 = r6
            r8.L$1 = r5
            r8.L$2 = r4
            r8.I$0 = r3
            r8.I$1 = r1
            r8.label = r2
            java.lang.Object r9 = r9.TuitionPaymentFragmentspecialinlinedviewModeldefault2()
            if (r9 != r0) goto L6e
            return r0
        L6e:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            kotlinx.coroutines.CoroutineScopeKt.b(r6)
            int r3 = r3 + r2
            goto L50
        L75:
            newUnratedRating r0 = r8.$request
            newInstance$TuitionPaymentFragmentspecialinlinedviewModeldefault1 r1 = r8.$result
            android.content.Context r0 = r0.getINotificationSideChannel()
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r0, r9)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            newInstance$TuitionPaymentFragmentspecialinlinedviewModeldefault1 r9 = newInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor$transform$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super newInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault1> continuation) {
        return ((EngineInterceptor$transform$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EngineInterceptor$transform$3(newInstance newinstance, newInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, getStarRating getstarrating, List<? extends IMediaControllerCallbackStub> list, getMediaId getmediaid, newUnratedRating newunratedrating, Continuation<? super EngineInterceptor$transform$3> continuation) {
        super(2, continuation);
        this.this$0 = newinstance;
        this.$result = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.$options = getstarrating;
        this.$transformations = list;
        this.$eventListener = getmediaid;
        this.$request = newunratedrating;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EngineInterceptor$transform$3 engineInterceptor$transform$3 = new EngineInterceptor$transform$3(this.this$0, this.$result, this.$options, this.$transformations, this.$eventListener, this.$request, continuation);
        engineInterceptor$transform$3.L$0 = obj;
        return engineInterceptor$transform$3;
    }
}
