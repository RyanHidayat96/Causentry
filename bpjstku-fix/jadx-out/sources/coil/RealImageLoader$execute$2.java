package coil;

import defpackage.MediaBrowserCompatSearchCallback;
import defpackage.getRatingType;
import defpackage.newStarRating;
import defpackage.newUnratedRating;
import defpackage.onShuffleModeChanged;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
public final class RealImageLoader$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super newStarRating>, Object> {
    final /* synthetic */ newUnratedRating $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MediaBrowserCompatSearchCallback this$0;

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
        Deferred<? extends newStarRating> deferredAsync$default = b.async$default((CoroutineScope) this.L$0, Dispatchers.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(), null, new RealImageLoader$execute$2$job$1(this.this$0, this.$request, null), 2, null);
        getRatingType.b(((onShuffleModeChanged) this.$request.getSubscribe()).TuitionPaymentFragmentspecialinlinedviewModeldefault2()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(deferredAsync$default);
        this.label = 1;
        Object objAwait = deferredAsync$default.await(this);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super newStarRating> continuation) {
        return ((RealImageLoader$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2(newUnratedRating newunratedrating, MediaBrowserCompatSearchCallback mediaBrowserCompatSearchCallback, Continuation<? super RealImageLoader$execute$2> continuation) {
        super(2, continuation);
        this.$request = newunratedrating;
        this.this$0 = mediaBrowserCompatSearchCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(this.$request, this.this$0, continuation);
        realImageLoader$execute$2.L$0 = obj;
        return realImageLoader$execute$2;
    }
}
