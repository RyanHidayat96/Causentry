package defpackage;

import android.graphics.Bitmap;
import androidx.p002lifecycle.Lifecycle;
import coil.request.CachePolicy;
import coil.size.Precision;
import coil.size.Scale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b$\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001c\u0010)\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010-\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b%\u0010,R\u001c\u00101\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u001c\u00104\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00100R\u001c\u00105\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010/\u001a\u0004\b4\u00100R\u001c\u00102\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b*\u00100R\u001c\u0010!\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001c\u0010.\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b6\u0010<R\u001c\u00103\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010=\u001a\u0004\b1\u0010>R\u001c\u0010*\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010?\u001a\u0004\b-\u0010@R\u001c\u00106\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010?\u001a\u0004\b$\u0010@R\u001c\u0010:\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010A\u001a\u0004\b5\u0010BR\u001c\u0010'\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010A\u001a\u0004\b)\u0010BR\u001c\u0010%\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010A\u001a\u0004\b2\u0010B"}, d2 = {"LRatingCompat;", "", "Landroidx/lifecycle/Lifecycle;", "p0", "LonSessionReady;", "p1", "Lcoil/size/Scale;", "p2", "Lkotlinx/coroutines/CoroutineDispatcher;", "p3", "p4", "p5", "p6", "LadjustVolume$TuitionPaymentFragmentbindingInflater1;", "p7", "Lcoil/size/Precision;", "p8", "Landroid/graphics/Bitmap$Config;", "p9", "", "p10", "p11", "Lcoil/request/CachePolicy;", "p12", "p13", "p14", "<init>", "(Landroidx/lifecycle/Lifecycle;LonSessionReady;Lcoil/size/Scale;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;LadjustVolume$TuitionPaymentFragmentbindingInflater1;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/lifecycle/Lifecycle;", "()Landroidx/lifecycle/Lifecycle;", "b", "onTransact", "LonSessionReady;", "INotificationSideChannel", "()LonSessionReady;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "cancel", "Lcoil/size/Scale;", "()Lcoil/size/Scale;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "d", "Lkotlinx/coroutines/CoroutineDispatcher;", "()Lkotlinx/coroutines/CoroutineDispatcher;", "TuitionPaymentFragmentbindingInflater1", "asInterface", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asBinder", "cancelAll", "LadjustVolume$TuitionPaymentFragmentbindingInflater1;", "RemoteActionCompatParcelizer", "()LadjustVolume$TuitionPaymentFragmentbindingInflater1;", "notify", "Lcoil/size/Precision;", "()Lcoil/size/Precision;", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lcoil/request/CachePolicy;", "()Lcoil/request/CachePolicy;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RatingCompat {

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final CoroutineDispatcher asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Bitmap.Config g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Boolean cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Boolean cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final CachePolicy INotificationSideChannel;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lifecycle b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final CachePolicy onTransact;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final CoroutineDispatcher TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final CoroutineDispatcher asBinder;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Scale TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final adjustVolume.TuitionPaymentFragmentbindingInflater1 a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final CoroutineDispatcher TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final CachePolicy notify;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Precision d;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final onSessionReady TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public RatingCompat(Lifecycle lifecycle, onSessionReady onsessionready, Scale scale, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, adjustVolume.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, Precision precision, Bitmap.Config config, Boolean bool, Boolean bool2, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.b = lifecycle;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = onsessionready;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = scale;
        this.TuitionPaymentFragmentbindingInflater1 = coroutineDispatcher;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = coroutineDispatcher2;
        this.asBinder = coroutineDispatcher3;
        this.asInterface = coroutineDispatcher4;
        this.a = tuitionPaymentFragmentbindingInflater1;
        this.d = precision;
        this.g = config;
        this.cancel = bool;
        this.cancelAll = bool2;
        this.notify = cachePolicy;
        this.INotificationSideChannel = cachePolicy2;
        this.onTransact = cachePolicy3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Lifecycle getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from getter */
    public final onSessionReady getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX INFO: renamed from: onTransact, reason: from getter */
    public final Scale getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CoroutineDispatcher getTuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final CoroutineDispatcher getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final CoroutineDispatcher getAsBinder() {
        return this.asBinder;
    }

    /* JADX INFO: renamed from: cancel, reason: from getter */
    public final CoroutineDispatcher getAsInterface() {
        return this.asInterface;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final adjustVolume.TuitionPaymentFragmentbindingInflater1 getA() {
        return this.a;
    }

    /* JADX INFO: renamed from: cancelAll, reason: from getter */
    public final Precision getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
    public final Bitmap.Config getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from getter */
    public final Boolean getCancel() {
        return this.cancel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getCancelAll() {
        return this.cancelAll;
    }

    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final CachePolicy getNotify() {
        return this.notify;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from getter */
    public final CachePolicy getINotificationSideChannel() {
        return this.INotificationSideChannel;
    }

    /* JADX INFO: renamed from: asInterface, reason: from getter */
    public final CachePolicy getOnTransact() {
        return this.onTransact;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RatingCompat)) {
            return false;
        }
        RatingCompat ratingCompat = (RatingCompat) p0;
        return Intrinsics.areEqual(this.b, ratingCompat.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ratingCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == ratingCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, ratingCompat.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ratingCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.asBinder, ratingCompat.asBinder) && Intrinsics.areEqual(this.asInterface, ratingCompat.asInterface) && Intrinsics.areEqual(this.a, ratingCompat.a) && this.d == ratingCompat.d && this.g == ratingCompat.g && Intrinsics.areEqual(this.cancel, ratingCompat.cancel) && Intrinsics.areEqual(this.cancelAll, ratingCompat.cancelAll) && this.notify == ratingCompat.notify && this.INotificationSideChannel == ratingCompat.INotificationSideChannel && this.onTransact == ratingCompat.onTransact;
    }

    public final int hashCode() {
        Lifecycle lifecycle = this.b;
        int iHashCode = lifecycle != null ? lifecycle.hashCode() : 0;
        onSessionReady onsessionready = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode2 = onsessionready != null ? onsessionready.hashCode() : 0;
        Scale scale = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode3 = scale != null ? scale.hashCode() : 0;
        CoroutineDispatcher coroutineDispatcher = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode4 = coroutineDispatcher != null ? coroutineDispatcher.hashCode() : 0;
        CoroutineDispatcher coroutineDispatcher2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode5 = coroutineDispatcher2 != null ? coroutineDispatcher2.hashCode() : 0;
        CoroutineDispatcher coroutineDispatcher3 = this.asBinder;
        int iHashCode6 = coroutineDispatcher3 != null ? coroutineDispatcher3.hashCode() : 0;
        CoroutineDispatcher coroutineDispatcher4 = this.asInterface;
        int iHashCode7 = coroutineDispatcher4 != null ? coroutineDispatcher4.hashCode() : 0;
        adjustVolume.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.a;
        int iHashCode8 = tuitionPaymentFragmentbindingInflater1 != null ? tuitionPaymentFragmentbindingInflater1.hashCode() : 0;
        Precision precision = this.d;
        int iHashCode9 = precision != null ? precision.hashCode() : 0;
        Bitmap.Config config = this.g;
        int iHashCode10 = config != null ? config.hashCode() : 0;
        Boolean bool = this.cancel;
        int iHashCode11 = bool != null ? bool.hashCode() : 0;
        Boolean bool2 = this.cancelAll;
        int iHashCode12 = bool2 != null ? bool2.hashCode() : 0;
        CachePolicy cachePolicy = this.notify;
        int iHashCode13 = cachePolicy != null ? cachePolicy.hashCode() : 0;
        CachePolicy cachePolicy2 = this.INotificationSideChannel;
        int iHashCode14 = cachePolicy2 != null ? cachePolicy2.hashCode() : 0;
        CachePolicy cachePolicy3 = this.onTransact;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (cachePolicy3 != null ? cachePolicy3.hashCode() : 0);
    }
}
