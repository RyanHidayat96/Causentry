package coil;

import defpackage.MediaBrowserCompatSearchCallback;
import defpackage.newStarRating;
import defpackage.newUnratedRating;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
final class RealImageLoader$execute$2$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super newStarRating>, Object> {
    final /* synthetic */ newUnratedRating $request;
    int label;
    final /* synthetic */ MediaBrowserCompatSearchCallback this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.$request, 1, this);
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == coroutine_suspended ? coroutine_suspended : objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super newStarRating> continuation) {
        return ((RealImageLoader$execute$2$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealImageLoader$execute$2$job$1(MediaBrowserCompatSearchCallback mediaBrowserCompatSearchCallback, newUnratedRating newunratedrating, Continuation<? super RealImageLoader$execute$2$job$1> continuation) {
        super(2, continuation);
        this.this$0 = mediaBrowserCompatSearchCallback;
        this.$request = newunratedrating;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RealImageLoader$execute$2$job$1(this.this$0, this.$request, continuation);
    }
}
