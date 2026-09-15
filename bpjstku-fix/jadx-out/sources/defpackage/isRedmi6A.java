package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class isRedmi6A<T> {
    public int TuitionPaymentFragmentbindingInflater1;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public T[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private float b;

    public isRedmi6A() {
        this(16, (byte) 0);
    }

    public isRedmi6A(int i) {
        this(5, (byte) 0);
    }

    private isRedmi6A(int i, byte b) {
        this.b = 0.75f;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iNumberOfLeadingZeros - 1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (int) (iNumberOfLeadingZeros * 0.75f);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (T[]) new Object[iNumberOfLeadingZeros];
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(T t) {
        T t2;
        T[] tArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode = t.hashCode() * (-1640531527);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
        T t3 = tArr[i2];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                i2 = (i2 + 1) & i;
                t2 = tArr[i2];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[i2] = t;
        int i3 = this.TuitionPaymentFragmentbindingInflater1 + 1;
        this.TuitionPaymentFragmentbindingInflater1 = i3;
        if (i3 >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        return true;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.TuitionPaymentFragmentbindingInflater1--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int iHashCode = t.hashCode() * (-1640531527);
                int i5 = (iHashCode ^ (iHashCode >>> 16)) & i2;
                if (i > i3) {
                    if (i >= i5 && i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= i5 || i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        T t;
        T[] tArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        for (int i3 = this.TuitionPaymentFragmentbindingInflater1; i3 != 0; i3--) {
            do {
                length--;
                t = tArr[length];
            } while (t == null);
            int iHashCode = t.hashCode() * (-1640531527);
            int i4 = (iHashCode ^ (iHashCode >>> 16)) & i2;
            if (tArr2[i4] != null) {
                do {
                    i4 = (i4 + 1) & i2;
                } while (tArr2[i4] != null);
            }
            tArr2[i4] = tArr[length];
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (int) (i * this.b);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tArr2;
    }
}
