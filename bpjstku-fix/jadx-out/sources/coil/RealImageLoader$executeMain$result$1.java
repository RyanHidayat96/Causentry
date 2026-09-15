package coil;

import android.graphics.Bitmap;
import defpackage.MediaBrowserCompatSearchCallback;
import defpackage.MediaDescriptionCompatApi21;
import defpackage.getMediaId;
import defpackage.newStarRating;
import defpackage.newUnratedRating;
import defpackage.onQueueTitleChanged;
import java.util.List;
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
@DebugMetadata(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
public final class RealImageLoader$executeMain$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super newStarRating>, Object> {
    final /* synthetic */ getMediaId $eventListener;
    final /* synthetic */ Bitmap $placeholderBitmap;
    final /* synthetic */ newUnratedRating $request;
    final /* synthetic */ onQueueTitleChanged $size;
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
        newUnratedRating newunratedrating = this.$request;
        List list = this.this$0.INotificationSideChannel;
        newUnratedRating newunratedrating2 = this.$request;
        onQueueTitleChanged onqueuetitlechanged = this.$size;
        getMediaId getmediaid = this.$eventListener;
        boolean z = this.$placeholderBitmap != null;
        this.label = 1;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = new MediaDescriptionCompatApi21(newunratedrating, list, 0, newunratedrating2, onqueuetitlechanged, getmediaid, z).TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.$request, this);
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault1 == coroutine_suspended ? coroutine_suspended : objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$executeMain$result$1(newUnratedRating newunratedrating, MediaBrowserCompatSearchCallback mediaBrowserCompatSearchCallback, onQueueTitleChanged onqueuetitlechanged, getMediaId getmediaid, Bitmap bitmap, Continuation<? super RealImageLoader$executeMain$result$1> continuation) {
        super(2, continuation);
        this.$request = newunratedrating;
        this.this$0 = mediaBrowserCompatSearchCallback;
        this.$size = onqueuetitlechanged;
        this.$eventListener = getmediaid;
        this.$placeholderBitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RealImageLoader$executeMain$result$1(this.$request, this.this$0, this.$size, this.$eventListener, this.$placeholderBitmap, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object invoke(CoroutineScope coroutineScope, Continuation<? super newStarRating> continuation) {
        return ((RealImageLoader$executeMain$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
