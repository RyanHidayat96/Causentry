package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class getBufferFormat implements Cloneable {
    public final int[] TuitionPaymentFragmentbindingInflater1;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final int b;

    public getBufferFormat(int i) {
        this(i, i);
    }

    public getBufferFormat(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        this.b = i2;
        int i3 = (i + 31) / 32;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        this.TuitionPaymentFragmentbindingInflater1 = new int[i3 * i2];
    }

    private getBufferFormat(int i, int i2, int i3, int[] iArr) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        this.b = i2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        this.TuitionPaymentFragmentbindingInflater1 = iArr;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) {
        return ((this.TuitionPaymentFragmentbindingInflater1[(i2 * this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.b || i5 > this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
                int i9 = (i8 / 32) + (i7 * i2);
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int[] iArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.TuitionPaymentFragmentbindingInflater1;
            if (i2 >= iArr.length || iArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == iArr.length) {
            return null;
        }
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i2 / i3;
        while ((iArr[i2] << (31 - i)) == 0) {
            i++;
        }
        return new int[]{((i2 % i3) << 5) + i, i4};
    }

    public final int[] TuitionPaymentFragmentbindingInflater1() {
        int length = this.TuitionPaymentFragmentbindingInflater1.length - 1;
        while (length >= 0 && this.TuitionPaymentFragmentbindingInflater1[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = length / i;
        int i3 = 31;
        while ((this.TuitionPaymentFragmentbindingInflater1[length] >>> i3) == 0) {
            i3--;
        }
        return new int[]{((length % i) << 5) + i3, i2};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getBufferFormat)) {
            return false;
        }
        getBufferFormat getbufferformat = (getBufferFormat) obj;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.b == getbufferformat.b && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Arrays.equals(this.TuitionPaymentFragmentbindingInflater1, getbufferformat.TuitionPaymentFragmentbindingInflater1);
    }

    public final int hashCode() {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return (((((((i * 31) + i) * 31) + this.b) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) * 31) + Arrays.hashCode(this.TuitionPaymentFragmentbindingInflater1);
    }

    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return new getBufferFormat(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (int[]) this.TuitionPaymentFragmentbindingInflater1.clone());
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new getBufferFormat(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (int[]) this.TuitionPaymentFragmentbindingInflater1.clone());
    }

    public final getFlashType b(int i, getFlashType getflashtype) {
        if (getflashtype == null || getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            getflashtype = new getFlashType(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            int length = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length;
            for (int i2 = 0; i2 < length; i2++) {
                getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i2] = 0;
            }
        }
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        for (int i4 = 0; i4 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault1; i4++) {
            getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[(i4 << 5) / 32] = this.TuitionPaymentFragmentbindingInflater1[(i * i3) + i4];
        }
        return getflashtype;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.b * (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1));
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3; i2++) {
                sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2, i) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
