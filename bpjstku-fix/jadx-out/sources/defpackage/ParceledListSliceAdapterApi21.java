package defpackage;

import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleOwner;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ParceledListSliceAdapterApi21 implements getPercentRating {
    private final Lifecycle TuitionPaymentFragmentbindingInflater1;
    private final VideoMimeInfoBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ParceledListSliceAdapterApi21(Lifecycle lifecycle, VideoMimeInfoBuilder videoMimeInfoBuilder) {
        this.TuitionPaymentFragmentbindingInflater1 = lifecycle;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = videoMimeInfoBuilder;
    }

    @Override // defpackage.getPercentRating
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.TuitionPaymentFragmentbindingInflater1.addObserver(this);
    }

    @Override // defpackage.getPercentRating
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        this.TuitionPaymentFragmentbindingInflater1.removeObserver(this);
    }

    @Override // androidx.p002lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
    }
}
