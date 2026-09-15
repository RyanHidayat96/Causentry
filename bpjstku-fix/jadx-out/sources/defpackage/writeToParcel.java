package defpackage;

import android.content.Context;
import coil.memory.MemoryCache;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\bR\u0014\u0010\n\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"LwriteToParcel;", "", "LnewUnratedRating;", "p0", "LnewHeartRating;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LnewUnratedRating;)LnewHeartRating;", "LnewStarRating;", "(LnewUnratedRating;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LMediaMetadataCompatApi21Builder;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LMediaMetadataCompatApi21Builder;", "LgetFlags;", "TuitionPaymentFragmentbindingInflater1", "()LgetFlags;", "Lcoil/memory/MemoryCache;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Lcoil/memory/MemoryCache;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface writeToParcel {
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1 */
    getFlags getCancel();

    MemoryCache TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(newUnratedRating newunratedrating, Continuation<? super newStarRating> continuation);

    newHeartRating TuitionPaymentFragmentspecialinlinedviewModeldefault2(newUnratedRating p0);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3 */
    MediaMetadataCompatApi21Builder getTuitionPaymentFragmentbindingInflater1();

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        final Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private MediaMetadataCompatApi21Builder TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getQueueTitle.TuitionPaymentFragmentbindingInflater1();
        private Lazy<? extends MemoryCache> d = null;
        private Lazy<? extends fromMediaDescription> b = null;
        private Lazy<? extends Call.Factory> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        private getMediaId.b asBinder = null;
        private getFlags TuitionPaymentFragmentbindingInflater1 = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private isShuffleModeEnabledRemoved f1428a = new isShuffleModeEnabledRemoved(false, false, false, 0, null, 31, null);
        private getVolumeAttributes g = null;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = context.getApplicationContext();
        }

        public final writeToParcel TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return new MediaBrowserCompatSearchCallback(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, LazyKt.lazy(new Function0() { // from class: MediaBrowserCompatMediaItem1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new MemoryCache.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
            }), LazyKt.lazy(new Function0() { // from class: isBrowsable
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return playFromSearch.INSTANCE.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            }), LazyKt.lazy(new Function0() { // from class: isPlayable
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new OkHttpClient();
                }
            }), getMediaId.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2, new getFlags(), this.f1428a, null);
        }
    }
}
