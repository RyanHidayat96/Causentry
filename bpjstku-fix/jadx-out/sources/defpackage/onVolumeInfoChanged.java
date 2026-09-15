package defpackage;

import android.graphics.drawable.Drawable;
import coil.size.Scale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016"}, d2 = {"LonVolumeInfoChanged;", "LadjustVolume;", "LaddQueueItem;", "p0", "LnewStarRating;", "p1", "", "p2", "", "p3", "<init>", "(LaddQueueItem;LnewStarRating;IZ)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "b", "LaddQueueItem;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LnewStarRating;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onVolumeInfoChanged implements adjustVolume {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final newStarRating TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final int b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final addQueueItem TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    private onVolumeInfoChanged(addQueueItem addqueueitem, newStarRating newstarrating, int i, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = addqueueitem;
        this.TuitionPaymentFragmentbindingInflater1 = newstarrating;
        this.b = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    public /* synthetic */ onVolumeInfoChanged(addQueueItem addqueueitem, newStarRating newstarrating, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(addqueueitem, newstarrating, (i2 & 4) != 0 ? 100 : i, (i2 & 8) != 0 ? false : z);
    }

    @Override // defpackage.adjustVolume
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Drawable tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1.getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
        Scale search = this.TuitionPaymentFragmentbindingInflater1.getB().getSearch();
        int i = this.b;
        newStarRating newstarrating = this.TuitionPaymentFragmentbindingInflater1;
        new MediaDescriptionCompat1(null, tuitionPaymentFragmentspecialinlinedviewModeldefault2, search, i, ((newstarrating instanceof isThumbUp) && ((isThumbUp) newstarrating).getA()) ? false : true, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        newStarRating newstarrating2 = this.TuitionPaymentFragmentbindingInflater1;
        if (newstarrating2 instanceof isThumbUp) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
        } else if (!(newstarrating2 instanceof newPercentageRating)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
