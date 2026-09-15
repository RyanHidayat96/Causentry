package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public class shouldCropImage implements Comparable<shouldCropImage> {
    public final int TuitionPaymentFragmentbindingInflater1;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(shouldCropImage shouldcropimage) {
        shouldCropImage shouldcropimage2 = shouldcropimage;
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * this.TuitionPaymentFragmentbindingInflater1;
        int i2 = shouldcropimage2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * shouldcropimage2.TuitionPaymentFragmentbindingInflater1;
        if (i2 < i) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    public shouldCropImage(int i, int i2) {
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2;
    }

    public final shouldCropImage TuitionPaymentFragmentspecialinlinedviewModeldefault3(shouldCropImage shouldcropimage) {
        int i = this.TuitionPaymentFragmentbindingInflater1;
        int i2 = shouldcropimage.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = shouldcropimage.TuitionPaymentFragmentbindingInflater1;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i5 = i * i2;
        int i6 = i3 * i4;
        if (i5 >= i6) {
            return new shouldCropImage(i3, i6 / i);
        }
        return new shouldCropImage(i5 / i4, i2);
    }

    public final shouldCropImage TuitionPaymentFragmentbindingInflater1(shouldCropImage shouldcropimage) {
        int i = this.TuitionPaymentFragmentbindingInflater1;
        int i2 = shouldcropimage.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = shouldcropimage.TuitionPaymentFragmentbindingInflater1;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i5 = i * i2;
        int i6 = i3 * i4;
        if (i5 <= i6) {
            return new shouldCropImage(i3, i6 / i);
        }
        return new shouldCropImage(i5 / i4, i2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append("x");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        shouldCropImage shouldcropimage = (shouldCropImage) obj;
        return this.TuitionPaymentFragmentbindingInflater1 == shouldcropimage.TuitionPaymentFragmentbindingInflater1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == shouldcropimage.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public int hashCode() {
        return (this.TuitionPaymentFragmentbindingInflater1 * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
