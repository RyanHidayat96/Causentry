package defpackage;

import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleObserver;
import androidx.p002lifecycle.LifecycleOwner;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompatStyle implements getPercentRating {
    private final onShuffleModeChanged<?> TuitionPaymentFragmentbindingInflater1;
    private final writeToParcel TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final VideoMimeInfoBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final newUnratedRating TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Lifecycle b;

    public RatingCompatStyle(writeToParcel writetoparcel, newUnratedRating newunratedrating, onShuffleModeChanged<?> onshufflemodechanged, Lifecycle lifecycle, VideoMimeInfoBuilder videoMimeInfoBuilder) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = writetoparcel;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = newunratedrating;
        this.TuitionPaymentFragmentbindingInflater1 = onshufflemodechanged;
        this.b = lifecycle;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = videoMimeInfoBuilder;
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.getPercentRating
    public final void b() {
        if (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2().isAttachedToWindow()) {
            return;
        }
        getRatingType.b(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // defpackage.getPercentRating
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.b.addObserver(this);
        onShuffleModeChanged<?> onshufflemodechanged = this.TuitionPaymentFragmentbindingInflater1;
        if (onshufflemodechanged instanceof LifecycleObserver) {
            getQueue.b(this.b, (LifecycleObserver) onshufflemodechanged);
        }
        getRatingType.b(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
        onShuffleModeChanged<?> onshufflemodechanged = this.TuitionPaymentFragmentbindingInflater1;
        if (onshufflemodechanged instanceof LifecycleObserver) {
            this.b.removeObserver((LifecycleObserver) onshufflemodechanged);
        }
        this.b.removeObserver(this);
    }

    @Override // androidx.p002lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        getRatingType.b(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()).b();
    }
}
