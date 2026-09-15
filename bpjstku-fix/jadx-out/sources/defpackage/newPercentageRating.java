package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class newPercentageRating extends newStarRating {
    public final newUnratedRating TuitionPaymentFragmentbindingInflater1;
    public final Drawable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.newStarRating
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3 */
    public final Drawable getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.newStarRating
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final newUnratedRating getB() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    public newPercentageRating(Drawable drawable, newUnratedRating newunratedrating, Throwable th) {
        super(null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = drawable;
        this.TuitionPaymentFragmentbindingInflater1 = newunratedrating;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof newPercentageRating)) {
            return false;
        }
        newPercentageRating newpercentagerating = (newPercentageRating) obj;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, newpercentagerating.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, newpercentagerating.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, newpercentagerating.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final int hashCode() {
        Drawable drawable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return ((((drawable != null ? drawable.hashCode() : 0) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }
}
