package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class MutableTagBundle {
    public final int TuitionPaymentFragmentbindingInflater1;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public MutableTagBundle(int i, int i2) {
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append("(");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MutableTagBundle)) {
            return false;
        }
        MutableTagBundle mutableTagBundle = (MutableTagBundle) obj;
        return this.TuitionPaymentFragmentbindingInflater1 == mutableTagBundle.TuitionPaymentFragmentbindingInflater1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == mutableTagBundle.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentbindingInflater1 ^ this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
