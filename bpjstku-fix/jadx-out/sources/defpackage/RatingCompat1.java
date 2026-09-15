package defpackage;

import android.view.View;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat1 implements newHeartRating {
    private final View TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private volatile Deferred<? extends newStarRating> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public RatingCompat1(View view, Deferred<? extends newStarRating> deferred) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = view;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = deferred;
    }

    public final void b(Deferred<? extends newStarRating> deferred) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = deferred;
    }
}
