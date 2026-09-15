package defpackage;

import android.view.View;
import coil.request.ViewTargetRequestManager$dispose$1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0005J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001b"}, d2 = {"LonPlaybackStateChanged;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "p0", "<init>", "(Landroid/view/View;)V", "Lkotlinx/coroutines/Deferred;", "LnewStarRating;", "LRatingCompat1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lkotlinx/coroutines/Deferred;)LRatingCompat1;", "", "b", "()V", "LRatingCompatStyle;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LRatingCompatStyle;)V", "onViewAttachedToWindow", "onViewDetachedFromWindow", "TuitionPaymentFragmentbindingInflater1", "Landroid/view/View;", "LRatingCompat1;", "LVideoMimeInfoBuilder;", "LVideoMimeInfoBuilder;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LRatingCompatStyle;", "", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onPlaybackStateChanged implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final View TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private RatingCompat1 TuitionPaymentFragmentbindingInflater1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private RatingCompatStyle TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private VideoMimeInfoBuilder b;

    public onPlaybackStateChanged(View view) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = view;
    }

    public final RatingCompat1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Deferred<? extends newStarRating> p0) {
        synchronized (this) {
            RatingCompat1 ratingCompat1 = this.TuitionPaymentFragmentbindingInflater1;
            if (ratingCompat1 != null && getRatingType.b() && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
                ratingCompat1.b(p0);
                return ratingCompat1;
            }
            VideoMimeInfoBuilder videoMimeInfoBuilder = this.b;
            if (videoMimeInfoBuilder != null) {
                videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
            }
            this.b = null;
            RatingCompat1 ratingCompat2 = new RatingCompat1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, p0);
            this.TuitionPaymentFragmentbindingInflater1 = ratingCompat2;
            return ratingCompat2;
        }
    }

    public final void b() {
        synchronized (this) {
            VideoMimeInfoBuilder videoMimeInfoBuilder = this.b;
            if (videoMimeInfoBuilder != null) {
                videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
            }
            this.b = b.TuitionPaymentFragmentbindingInflater1(VideoConfigUtil.INSTANCE, Dispatchers.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(), null, new ViewTargetRequestManager$dispose$1(this, null), 2, null);
            this.TuitionPaymentFragmentbindingInflater1 = null;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RatingCompatStyle p0) {
        RatingCompatStyle ratingCompatStyle = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (ratingCompatStyle != null) {
            ratingCompatStyle.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = p0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View p0) {
        RatingCompatStyle ratingCompatStyle = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (ratingCompatStyle == null) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        ratingCompatStyle.TuitionPaymentFragmentbindingInflater1();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View p0) {
        RatingCompatStyle ratingCompatStyle = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (ratingCompatStyle != null) {
            ratingCompatStyle.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }
}
