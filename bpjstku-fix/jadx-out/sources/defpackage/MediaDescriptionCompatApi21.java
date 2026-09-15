package defpackage;

import coil.intercept.RealInterceptorChain$proceed$1;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010 \u001a\u00020!2\u0006\u0010\t\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\"J\u0018\u0010#\u001a\u00020$2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0006H\u0002J&\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001d¨\u0006'"}, d2 = {"Lcoil/intercept/RealInterceptorChain;", "Lcoil/intercept/Interceptor$Chain;", "initialRequest", "Lcoil/request/ImageRequest;", "interceptors", "", "Lcoil/intercept/Interceptor;", FirebaseAnalytics.Param.INDEX, "", "request", "size", "Lcoil/size/Size;", "eventListener", "Lcoil/EventListener;", "isPlaceholderCached", "", "<init>", "(Lcoil/request/ImageRequest;Ljava/util/List;ILcoil/request/ImageRequest;Lcoil/size/Size;Lcoil/EventListener;Z)V", "getInitialRequest", "()Lcoil/request/ImageRequest;", "getInterceptors", "()Ljava/util/List;", "getIndex", "()I", "getRequest", "getSize", "()Lcoil/size/Size;", "getEventListener", "()Lcoil/EventListener;", "()Z", "withRequest", "withSize", "proceed", "Lcoil/request/ImageResult;", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkRequest", "", "interceptor", "copy", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaDescriptionCompatApi21 implements fromParcel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
    private final boolean TuitionPaymentFragmentbindingInflater1;
    private final newUnratedRating TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final getMediaId TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final List<fromParcel> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final newUnratedRating f178a;
    private final onQueueTitleChanged asBinder;
    private final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaDescriptionCompatApi21(newUnratedRating newunratedrating, List<? extends fromParcel> list, int i, newUnratedRating newunratedrating2, onQueueTitleChanged onqueuetitlechanged, getMediaId getmediaid, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = newunratedrating;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
        this.b = i;
        this.f178a = newunratedrating2;
        this.asBinder = onqueuetitlechanged;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getmediaid;
        this.TuitionPaymentFragmentbindingInflater1 = z;
    }

    @Override // fromParcel.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final newUnratedRating getF178a() {
        return this.f178a;
    }

    @Override // fromParcel.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final onQueueTitleChanged getAsBinder() {
        return this.asBinder;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from getter */
    public final getMediaId getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from getter */
    public final boolean getTuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(newUnratedRating newunratedrating, Continuation<? super newStarRating> continuation) {
        RealInterceptorChain$proceed$1 realInterceptorChain$proceed$1;
        MediaDescriptionCompatApi21 mediaDescriptionCompatApi21;
        fromParcel fromparcel;
        if (continuation instanceof RealInterceptorChain$proceed$1) {
            realInterceptorChain$proceed$1 = (RealInterceptorChain$proceed$1) continuation;
            if ((realInterceptorChain$proceed$1.label & Integer.MIN_VALUE) != 0) {
                realInterceptorChain$proceed$1.label -= Integer.MIN_VALUE;
            } else {
                realInterceptorChain$proceed$1 = new RealInterceptorChain$proceed$1(this, continuation);
            }
        } else {
            realInterceptorChain$proceed$1 = new RealInterceptorChain$proceed$1(this, continuation);
        }
        Object obj = realInterceptorChain$proceed$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = realInterceptorChain$proceed$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = this.b;
            if (i2 > 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(newunratedrating, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i2 - 1));
            }
            fromParcel fromparcel2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(this.b);
            MediaDescriptionCompatApi21 mediaDescriptionCompatApi21B = b(this, this.b + 1, newunratedrating);
            realInterceptorChain$proceed$1.L$0 = this;
            realInterceptorChain$proceed$1.L$1 = fromparcel2;
            realInterceptorChain$proceed$1.label = 1;
            Object objTuitionPaymentFragmentbindingInflater1 = fromparcel2.TuitionPaymentFragmentbindingInflater1(mediaDescriptionCompatApi21B, realInterceptorChain$proceed$1);
            if (objTuitionPaymentFragmentbindingInflater1 == coroutine_suspended) {
                return coroutine_suspended;
            }
            mediaDescriptionCompatApi21 = this;
            obj = objTuitionPaymentFragmentbindingInflater1;
            fromparcel = fromparcel2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fromparcel = (fromParcel) realInterceptorChain$proceed$1.L$1;
            mediaDescriptionCompatApi21 = (MediaDescriptionCompatApi21) realInterceptorChain$proceed$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        newStarRating newstarrating = (newStarRating) obj;
        mediaDescriptionCompatApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault3(newstarrating.getB(), fromparcel);
        return newstarrating;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(newUnratedRating newunratedrating, fromParcel fromparcel) {
        if (newunratedrating.getINotificationSideChannel() != this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getINotificationSideChannel()) {
            StringBuilder sb = new StringBuilder("Interceptor '");
            sb.append(fromparcel);
            sb.append("' cannot modify the request's context.");
            throw new IllegalStateException(sb.toString().toString());
        }
        if (newunratedrating.getOnTransact() == hasHeart.INSTANCE) {
            StringBuilder sb2 = new StringBuilder("Interceptor '");
            sb2.append(fromparcel);
            sb2.append("' cannot set the request's data to null.");
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (newunratedrating.getSubscribe() != this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getSubscribe()) {
            StringBuilder sb3 = new StringBuilder("Interceptor '");
            sb3.append(fromparcel);
            sb3.append("' cannot modify the request's target.");
            throw new IllegalStateException(sb3.toString().toString());
        }
        if (newunratedrating.getWrite() != this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getWrite()) {
            StringBuilder sb4 = new StringBuilder("Interceptor '");
            sb4.append(fromparcel);
            sb4.append("' cannot modify the request's lifecycle.");
            throw new IllegalStateException(sb4.toString().toString());
        }
        if (newunratedrating.getIsConnected() == this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getIsConnected()) {
            return;
        }
        StringBuilder sb5 = new StringBuilder("Interceptor '");
        sb5.append(fromparcel);
        sb5.append("' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
        throw new IllegalStateException(sb5.toString().toString());
    }

    private static /* synthetic */ MediaDescriptionCompatApi21 b(MediaDescriptionCompatApi21 mediaDescriptionCompatApi21, int i, newUnratedRating newunratedrating) {
        return mediaDescriptionCompatApi21.b(i, newunratedrating, mediaDescriptionCompatApi21.getAsBinder());
    }

    private final MediaDescriptionCompatApi21 b(int i, newUnratedRating newunratedrating, onQueueTitleChanged onqueuetitlechanged) {
        return new MediaDescriptionCompatApi21(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, i, newunratedrating, onqueuetitlechanged, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1);
    }
}
