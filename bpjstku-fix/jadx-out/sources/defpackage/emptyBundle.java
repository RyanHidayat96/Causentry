package defpackage;

/* JADX INFO: loaded from: classes6.dex */
final class emptyBundle {
    final OptionsBundleExternalSyntheticLambda0 TuitionPaymentFragmentbindingInflater1;
    final MutableTagBundle TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final MutableTagBundle TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final boolean b = true;

    emptyBundle(MutableTagBundle mutableTagBundle, MutableTagBundle mutableTagBundle2, OptionsBundleExternalSyntheticLambda0 optionsBundleExternalSyntheticLambda0) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableTagBundle;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableTagBundle2;
        this.TuitionPaymentFragmentbindingInflater1 = optionsBundleExternalSyntheticLambda0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(" , ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(" : ");
        OptionsBundleExternalSyntheticLambda0 optionsBundleExternalSyntheticLambda0 = this.TuitionPaymentFragmentbindingInflater1;
        sb.append(optionsBundleExternalSyntheticLambda0 == null ? "null" : Integer.valueOf(optionsBundleExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        sb.append(" ]");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof emptyBundle)) {
            return false;
        }
        emptyBundle emptybundle = (emptyBundle) obj;
        MutableTagBundle mutableTagBundle = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        MutableTagBundle mutableTagBundle2 = emptybundle.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (mutableTagBundle != null ? mutableTagBundle.equals(mutableTagBundle2) : mutableTagBundle2 == null) {
            MutableTagBundle mutableTagBundle3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            MutableTagBundle mutableTagBundle4 = emptybundle.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (mutableTagBundle3 != null ? mutableTagBundle3.equals(mutableTagBundle4) : mutableTagBundle4 == null) {
                OptionsBundleExternalSyntheticLambda0 optionsBundleExternalSyntheticLambda0 = this.TuitionPaymentFragmentbindingInflater1;
                OptionsBundleExternalSyntheticLambda0 optionsBundleExternalSyntheticLambda1 = emptybundle.TuitionPaymentFragmentbindingInflater1;
                if (optionsBundleExternalSyntheticLambda0 == null) {
                    if (optionsBundleExternalSyntheticLambda1 == null) {
                        return true;
                    }
                } else if (optionsBundleExternalSyntheticLambda0.equals(optionsBundleExternalSyntheticLambda1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        MutableTagBundle mutableTagBundle = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode = mutableTagBundle == null ? 0 : mutableTagBundle.hashCode();
        MutableTagBundle mutableTagBundle2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode2 = iHashCode ^ (mutableTagBundle2 == null ? 0 : mutableTagBundle2.hashCode());
        OptionsBundleExternalSyntheticLambda0 optionsBundleExternalSyntheticLambda0 = this.TuitionPaymentFragmentbindingInflater1;
        return iHashCode2 ^ (optionsBundleExternalSyntheticLambda0 != null ? optionsBundleExternalSyntheticLambda0.hashCode() : 0);
    }
}
