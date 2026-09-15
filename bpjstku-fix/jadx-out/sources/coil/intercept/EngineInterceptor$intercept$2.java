package coil.intercept;

import coil.memory.MemoryCache;
import defpackage.fromParcel;
import defpackage.getMediaId;
import defpackage.getRatingType;
import defpackage.getStarRating;
import defpackage.isThumbUp;
import defpackage.newInstance;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil/request/SuccessResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
public final class EngineInterceptor$intercept$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super isThumbUp>, Object> {
    final /* synthetic */ MemoryCache.Key $cacheKey;
    final /* synthetic */ fromParcel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 $chain;
    final /* synthetic */ getMediaId $eventListener;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ getStarRating $options;
    final /* synthetic */ newUnratedRating $request;
    int label;
    final /* synthetic */ newInstance this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.$request, this.$mappedData, this.$options, this.$eventListener, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        newInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (newInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault1) obj;
        this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return new isThumbUp(tuitionPaymentFragmentspecialinlinedviewModeldefault1.getTuitionPaymentFragmentspecialinlinedviewModeldefault1(), this.$request, tuitionPaymentFragmentspecialinlinedviewModeldefault1.getB(), !this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.$cacheKey, this.$request, tuitionPaymentFragmentspecialinlinedviewModeldefault1) ? null : this.$cacheKey, tuitionPaymentFragmentspecialinlinedviewModeldefault1.getTuitionPaymentFragmentbindingInflater1(), tuitionPaymentFragmentspecialinlinedviewModeldefault1.getTuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.$chain));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super isThumbUp> continuation) {
        return ((EngineInterceptor$intercept$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(newInstance newinstance, newUnratedRating newunratedrating, Object obj, getStarRating getstarrating, getMediaId getmediaid, MemoryCache.Key key, fromParcel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, Continuation<? super EngineInterceptor$intercept$2> continuation) {
        super(2, continuation);
        this.this$0 = newinstance;
        this.$request = newunratedrating;
        this.$mappedData = obj;
        this.$options = getstarrating;
        this.$eventListener = getmediaid;
        this.$cacheKey = key;
        this.$chain = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EngineInterceptor$intercept$2(this.this$0, this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, continuation);
    }
}
