package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class addQueueItemAt implements adjustVolume {
    private final addQueueItem TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final newStarRating b;

    public addQueueItemAt(addQueueItem addqueueitem, newStarRating newstarrating) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = addqueueitem;
        this.b = newstarrating;
    }

    @Override // defpackage.adjustVolume
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        newStarRating newstarrating = this.b;
        if (newstarrating instanceof isThumbUp) {
            addQueueItem addqueueitem = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            ((isThumbUp) newstarrating).getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
            addqueueitem.TuitionPaymentFragmentbindingInflater1();
        } else {
            if (!(newstarrating instanceof newPercentageRating)) {
                throw new NoWhenBranchMatchedException();
            }
            Drawable drawable = ((newPercentageRating) newstarrating).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements adjustVolume.TuitionPaymentFragmentbindingInflater1 {
        @Override // adjustVolume.TuitionPaymentFragmentbindingInflater1
        public final adjustVolume TuitionPaymentFragmentspecialinlinedviewModeldefault2(addQueueItem addqueueitem, newStarRating newstarrating) {
            return new addQueueItemAt(addqueueitem, newstarrating);
        }

        public final boolean equals(Object obj) {
            return obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return getClass().hashCode();
        }
    }
}
