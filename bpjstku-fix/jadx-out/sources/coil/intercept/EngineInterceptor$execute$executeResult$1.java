package coil.intercept;

import defpackage.MediaDescriptionCompatApi21Builder;
import defpackage.getFlags;
import defpackage.getMediaId;
import defpackage.getStarRating;
import defpackage.newInstance;
import defpackage.newUnratedRating;
import defpackage.setMediaUri;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
public final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super newInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault1>, Object> {
    final /* synthetic */ Ref.ObjectRef<getFlags> $components;
    final /* synthetic */ getMediaId $eventListener;
    final /* synthetic */ Ref.ObjectRef<setMediaUri> $fetchResult;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ Ref.ObjectRef<getStarRating> $options;
    final /* synthetic */ newUnratedRating $request;
    int label;
    final /* synthetic */ newInstance this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        this.label = 1;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault1((MediaDescriptionCompatApi21Builder) this.$fetchResult.element, this.$components.element, this.$request, this.$mappedData, this.$options.element, this.$eventListener, this);
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault1 == coroutine_suspended ? coroutine_suspended : objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$executeResult$1(newInstance newinstance, Ref.ObjectRef<setMediaUri> objectRef, Ref.ObjectRef<getFlags> objectRef2, newUnratedRating newunratedrating, Object obj, Ref.ObjectRef<getStarRating> objectRef3, getMediaId getmediaid, Continuation<? super EngineInterceptor$execute$executeResult$1> continuation) {
        super(2, continuation);
        this.this$0 = newinstance;
        this.$fetchResult = objectRef;
        this.$components = objectRef2;
        this.$request = newunratedrating;
        this.$mappedData = obj;
        this.$options = objectRef3;
        this.$eventListener = getmediaid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EngineInterceptor$execute$executeResult$1(this.this$0, this.$fetchResult, this.$components, this.$request, this.$mappedData, this.$options, this.$eventListener, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public Object invoke(CoroutineScope coroutineScope, Continuation<? super newInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault1> continuation) {
        return ((EngineInterceptor$execute$executeResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
