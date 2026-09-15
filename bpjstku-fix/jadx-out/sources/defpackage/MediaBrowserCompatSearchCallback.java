package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import coil.RealImageLoader$enqueue$job$1;
import coil.RealImageLoader$execute$2;
import coil.RealImageLoader$execute$3;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;
import okhttp3.Call;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0019\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001cJ \u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u001dH\u0083@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0019\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u0019\u0010!J)\u0010\u001e\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\"2\b\u0010\u0005\u001a\u0004\u0018\u00010#2\u0006\u0010\b\u001a\u00020$H\u0002¢\u0006\u0004\b\u001e\u0010%J)\u0010'\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020&2\b\u0010\u0005\u001a\u0004\u0018\u00010#2\u0006\u0010\b\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020$H\u0002¢\u0006\u0004\b)\u0010*R\u001a\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b\u0019\u0010,R\u001a\u0010)\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u001e\u00100R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u00102R\u0014\u0010.\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00103\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u00106R\u001a\u00104\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010=\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\b-\u0010<R\u0014\u00109\u001a\u00020>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010?\u001a\u00020A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0017\u00101\u001a\u0004\u0018\u00010\u00078WX\u0096\u0084\u0002¢\u0006\u0006\u001a\u0004\b'\u0010GR\u001a\u0010I\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u00106\u001a\u0004\b)\u0010HR\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020K0J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010LR\u0014\u0010O\u001a\u00020M8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010N"}, d2 = {"LMediaBrowserCompatSearchCallback;", "LwriteToParcel;", "Landroid/content/Context;", "p0", "LMediaMetadataCompatApi21Builder;", "p1", "Lkotlin/Lazy;", "Lcoil/memory/MemoryCache;", "p2", "LfromMediaDescription;", "p3", "Lokhttp3/Call$Factory;", "p4", "LgetMediaId$b;", "p5", "LgetFlags;", "p6", "LisShuffleModeEnabledRemoved;", "p7", "LgetVolumeAttributes;", "p8", "<init>", "(Landroid/content/Context;LMediaMetadataCompatApi21Builder;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;LgetMediaId$b;LgetFlags;LisShuffleModeEnabledRemoved;LgetVolumeAttributes;)V", "LnewUnratedRating;", "LnewHeartRating;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LnewUnratedRating;)LnewHeartRating;", "LnewStarRating;", "(LnewUnratedRating;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LnewUnratedRating;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(I)V", "LisThumbUp;", "LonShuffleModeChangedRemoved;", "LgetMediaId;", "(LisThumbUp;LonShuffleModeChangedRemoved;)V", "LnewPercentageRating;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LnewPercentageRating;LonShuffleModeChangedRemoved;)V", "TuitionPaymentFragmentbindingInflater1", "(LnewUnratedRating;)V", "Landroid/content/Context;", "()Landroid/content/Context;", "b", "g", "LMediaMetadataCompatApi21Builder;", "()LMediaMetadataCompatApi21Builder;", "cancelAll", "Lkotlin/Lazy;", "a", "asBinder", "LgetMediaId$b;", "LgetFlags;", "INotificationSideChannel", "LisShuffleModeEnabledRemoved;", "asInterface", "()LisShuffleModeEnabledRemoved;", "LgetVolumeAttributes;", "()LgetVolumeAttributes;", "d", "Lkotlinx/coroutines/CoroutineScope;", "notify", "Lkotlinx/coroutines/CoroutineScope;", "Lpause;", "RemoteActionCompatParcelizer", "Lpause;", "LRatingCompatStarStyle;", "onTransact", "LRatingCompatStarStyle;", "()Lcoil/memory/MemoryCache;", "()LgetFlags;", "cancel", "", "LfromParcel;", "Ljava/util/List;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "INotificationSideChannelStubProxy"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaBrowserCompatSearchCallback implements writeToParcel {

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final isShuffleModeEnabledRemoved asBinder;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final pause notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final getFlags a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Context b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final getFlags cancel;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy<fromMediaDescription> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final getMediaId.b g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy<Call.Factory> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final AtomicBoolean INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy<MemoryCache> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<fromParcel> INotificationSideChannel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final MediaMetadataCompatApi21Builder TuitionPaymentFragmentbindingInflater1;
    private final RatingCompatStarStyle onTransact;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final getVolumeAttributes d = null;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final CoroutineScope asInterface = CoroutineScopeKt.CoroutineScope(new getDataSpace(null).plus(Dispatchers.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2()).plus(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(CoroutineExceptionHandler.INSTANCE, this)));

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private /* synthetic */ MediaBrowserCompatSearchCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(CoroutineExceptionHandler.Companion companion, MediaBrowserCompatSearchCallback mediaBrowserCompatSearchCallback) {
            super(companion);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mediaBrowserCompatSearchCallback;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getD();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaBrowserCompatSearchCallback(Context context, MediaMetadataCompatApi21Builder mediaMetadataCompatApi21Builder, Lazy<? extends MemoryCache> lazy, Lazy<? extends fromMediaDescription> lazy2, Lazy<? extends Call.Factory> lazy3, getMediaId.b bVar, getFlags getflags, isShuffleModeEnabledRemoved isshufflemodeenabledremoved, getVolumeAttributes getvolumeattributes) {
        this.b = context;
        this.TuitionPaymentFragmentbindingInflater1 = mediaMetadataCompatApi21Builder;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lazy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lazy2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lazy3;
        this.g = bVar;
        this.a = getflags;
        this.asBinder = isshufflemodeenabledremoved;
        pause pauseVar = new pause(this);
        this.notify = pauseVar;
        MediaBrowserCompatSearchCallback mediaBrowserCompatSearchCallback = this;
        RatingCompatStarStyle ratingCompatStarStyle = new RatingCompatStarStyle(mediaBrowserCompatSearchCallback, pauseVar, null);
        this.onTransact = ratingCompatStarStyle;
        this.cancel = getflags.d().TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getRating(), HttpUrl.class).TuitionPaymentFragmentspecialinlinedviewModeldefault2(new C0818size(), String.class).TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getMediaMetadata(), Uri.class).TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getBundle(), Uri.class).TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getLong(), Integer.class).TuitionPaymentFragmentspecialinlinedviewModeldefault2(new MediaDescriptionCompatApi23Builder(), byte[].class).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new MediaMetadataCompat(), Uri.class).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new getBitmap(isshufflemodeenabledremoved.getTuitionPaymentFragmentspecialinlinedviewModeldefault1()), File.class).b(new setIconUri.b(lazy3, lazy2, isshufflemodeenabledremoved.getB()), Uri.class).b(new setSubtitle.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), File.class).b(new getTitle.TuitionPaymentFragmentbindingInflater1(), Uri.class).b(new setIconBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), Uri.class).b(new MediaDescriptionCompatApi23.b(), Uri.class).b(new setExtras.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), Drawable.class).b(new MediaDescriptionCompatBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), Bitmap.class).b(new setDescription.TuitionPaymentFragmentbindingInflater1(), ByteBuffer.class).TuitionPaymentFragmentbindingInflater1(new MediaBrowserCompatApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isshufflemodeenabledremoved.getTuitionPaymentFragmentspecialinlinedviewModeldefault2(), isshufflemodeenabledremoved.getTuitionPaymentFragmentbindingInflater1())).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        this.INotificationSideChannel = CollectionsKt.plus((Collection<? extends newInstance>) getCancel().b(), new newInstance(mediaBrowserCompatSearchCallback, pauseVar, ratingCompatStarStyle, null));
        this.INotificationSideChannelStubProxy = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final Context getB() {
        return this.b;
    }

    @Override // defpackage.writeToParcel
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from getter */
    public final MediaMetadataCompatApi21Builder getTuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    /* JADX INFO: renamed from: asInterface, reason: from getter */
    public final isShuffleModeEnabledRemoved getAsBinder() {
        return this.asBinder;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final getVolumeAttributes getD() {
        return this.d;
    }

    @Override // defpackage.writeToParcel
    public final MemoryCache TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
    }

    @Override // defpackage.writeToParcel
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
    public final getFlags getCancel() {
        return this.cancel;
    }

    @Override // defpackage.writeToParcel
    public final newHeartRating TuitionPaymentFragmentspecialinlinedviewModeldefault2(newUnratedRating p0) {
        Deferred<? extends newStarRating> deferredAsync$default = b.async$default(this.asInterface, null, null, new RealImageLoader$enqueue$job$1(this, p0, null), 3, null);
        if (p0.getSubscribe() instanceof onShuffleModeChanged) {
            return getRatingType.b(((onShuffleModeChanged) p0.getSubscribe()).TuitionPaymentFragmentspecialinlinedviewModeldefault2()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(deferredAsync$default);
        }
        return new isRated(deferredAsync$default);
    }

    @Override // defpackage.writeToParcel
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(newUnratedRating newunratedrating, Continuation<? super newStarRating> continuation) {
        if (newunratedrating.getSubscribe() instanceof onShuffleModeChanged) {
            return CoroutineScopeKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new RealImageLoader$execute$2(newunratedrating, this, null), continuation);
        }
        return BuildersKt.TuitionPaymentFragmentbindingInflater1(Dispatchers.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new RealImageLoader$execute$3(this, newunratedrating, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x00db A[Catch: all -> 0x006d, TryCatch #4 {all -> 0x006d, blocks: (B:21:0x0065, B:26:0x0080, B:36:0x00d5, B:38:0x00db, B:40:0x00e1, B:43:0x00e9, B:46:0x00f1, B:48:0x0105, B:50:0x010b, B:51:0x010e, B:47:0x0101), top: B:99:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1 A[Catch: all -> 0x006d, TryCatch #4 {all -> 0x006d, blocks: (B:21:0x0065, B:26:0x0080, B:36:0x00d5, B:38:0x00db, B:40:0x00e1, B:43:0x00e9, B:46:0x00f1, B:48:0x0105, B:50:0x010b, B:51:0x010e, B:47:0x0101), top: B:99:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9 A[Catch: all -> 0x006d, TryCatch #4 {all -> 0x006d, blocks: (B:21:0x0065, B:26:0x0080, B:36:0x00d5, B:38:0x00db, B:40:0x00e1, B:43:0x00e9, B:46:0x00f1, B:48:0x0105, B:50:0x010b, B:51:0x010e, B:47:0x0101), top: B:99:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f1 A[Catch: all -> 0x006d, TryCatch #4 {all -> 0x006d, blocks: (B:21:0x0065, B:26:0x0080, B:36:0x00d5, B:38:0x00db, B:40:0x00e1, B:43:0x00e9, B:46:0x00f1, B:48:0x0105, B:50:0x010b, B:51:0x010e, B:47:0x0101), top: B:99:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0101 A[Catch: all -> 0x006d, TryCatch #4 {all -> 0x006d, blocks: (B:21:0x0065, B:26:0x0080, B:36:0x00d5, B:38:0x00db, B:40:0x00e1, B:43:0x00e9, B:46:0x00f1, B:48:0x0105, B:50:0x010b, B:51:0x010e, B:47:0x0101), top: B:99:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x010b A[Catch: all -> 0x006d, TryCatch #4 {all -> 0x006d, blocks: (B:21:0x0065, B:26:0x0080, B:36:0x00d5, B:38:0x00db, B:40:0x00e1, B:43:0x00e9, B:46:0x00f1, B:48:0x0105, B:50:0x010b, B:51:0x010e, B:47:0x0101), top: B:99:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x015f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0167 A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0041, B:60:0x0161, B:63:0x0167, B:67:0x0176, B:70:0x0184, B:71:0x0189), top: B:94:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0172  */
    /* JADX WARN: Code duplicated, block: B:67:0x0176 A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0041, B:60:0x0161, B:63:0x0167, B:67:0x0176, B:70:0x0184, B:71:0x0189), top: B:94:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0184 A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0041, B:60:0x0161, B:63:0x0167, B:67:0x0176, B:70:0x0184, B:71:0x0189), top: B:94:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a3 A[Catch: all -> 0x01b8, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01b8, blocks: (B:86:0x01a3, B:89:0x01b4, B:90:0x01b7), top: B:95:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01b4 A[Catch: all -> 0x01b8, TRY_ENTER, TryCatch #1 {all -> 0x01b8, blocks: (B:86:0x01a3, B:89:0x01b4, B:90:0x01b7), top: B:95:0x01a1 }] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d0, code lost:
    
        if (defpackage.getQueue.TuitionPaymentFragmentbindingInflater1(r10, r2) != r3) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [MediaBrowserCompatSearchCallback] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [newUnratedRating] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [newUnratedRating] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [newUnratedRating] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, newUnratedRating] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(defpackage.newUnratedRating r20, int r21, kotlin.coroutines.Continuation<? super defpackage.newStarRating> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaBrowserCompatSearchCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(newUnratedRating, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int p0) {
        MemoryCache value;
        Lazy<MemoryCache> lazy = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (lazy == null || (value = lazy.getValue()) == null) {
            return;
        }
        value.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(isThumbUp isthumbup, onShuffleModeChangedRemoved onshufflemodechangedremoved) {
        newUnratedRating b = isthumbup.getB();
        DataSource tuitionPaymentFragmentbindingInflater1 = isthumbup.getTuitionPaymentFragmentbindingInflater1();
        getVolumeAttributes getvolumeattributes = this.d;
        if (getvolumeattributes != null && getvolumeattributes.TuitionPaymentFragmentbindingInflater1() <= 4) {
            getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1);
            tuitionPaymentFragmentbindingInflater1.name();
            Objects.toString(b.getOnTransact());
        }
        if (onshufflemodechangedremoved instanceof addQueueItem) {
            isThumbUp isthumbup2 = isthumbup;
            adjustVolume adjustvolumeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isthumbup2.getB().getMediaBrowserCompatCallbackHandler().TuitionPaymentFragmentspecialinlinedviewModeldefault2((addQueueItem) onshufflemodechangedremoved, isthumbup2);
            if (adjustvolumeTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof addQueueItemAt) {
                isthumbup.getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
                onshufflemodechangedremoved.TuitionPaymentFragmentbindingInflater1();
            } else {
                isthumbup2.getB();
                adjustvolumeTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                isthumbup2.getB();
            }
        } else if (onshufflemodechangedremoved != null) {
            isthumbup.getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
            onshufflemodechangedremoved.TuitionPaymentFragmentbindingInflater1();
        }
        b.getConnect();
    }

    private final void TuitionPaymentFragmentbindingInflater1(newUnratedRating newunratedrating) {
        getVolumeAttributes getvolumeattributes = this.d;
        if (getvolumeattributes != null && getvolumeattributes.TuitionPaymentFragmentbindingInflater1() <= 4) {
            Objects.toString(newunratedrating.getOnTransact());
        }
        newunratedrating.getConnect();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(newPercentageRating newpercentagerating, onShuffleModeChangedRemoved onshufflemodechangedremoved) {
        newUnratedRating newunratedrating = newpercentagerating.TuitionPaymentFragmentbindingInflater1;
        getVolumeAttributes getvolumeattributes = this.d;
        if (getvolumeattributes != null && getvolumeattributes.TuitionPaymentFragmentbindingInflater1() <= 4) {
            Objects.toString(newunratedrating.getOnTransact());
            Objects.toString(newpercentagerating.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        if (onshufflemodechangedremoved instanceof addQueueItem) {
            newPercentageRating newpercentagerating2 = newpercentagerating;
            adjustVolume adjustvolumeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = newpercentagerating2.getB().getMediaBrowserCompatCallbackHandler().TuitionPaymentFragmentspecialinlinedviewModeldefault2((addQueueItem) onshufflemodechangedremoved, newpercentagerating2);
            if (!(adjustvolumeTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof addQueueItemAt)) {
                newpercentagerating2.getB();
                adjustvolumeTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                newpercentagerating2.getB();
            } else {
                Drawable drawable = newpercentagerating.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
        } else if (onshufflemodechangedremoved != null) {
            Drawable drawable2 = newpercentagerating.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        newunratedrating.getConnect();
    }
}
