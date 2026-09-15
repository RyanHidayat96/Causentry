package defpackage;

import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class getFlashType implements Cloneable {
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getFlashType() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new int[1];
    }

    public getFlashType(int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new int[(i + 31) / 32];
    }

    private getFlashType(int[] iArr, int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArr2;
        }
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (i3 == iArr.length) {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            i4 = iArr[i3];
        }
        int iNumberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return iNumberOfTrailingZeros > i5 ? i5 : iNumberOfTrailingZeros;
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & (~this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (i3 == iArr.length) {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            i4 = ~iArr[i3];
        }
        int iNumberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return iNumberOfTrailingZeros > i5 ? i5 : iNumberOfTrailingZeros;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) {
        if (i2 < i || i < 0 || i2 > this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            throw new IllegalArgumentException();
        }
        if (i2 == i) {
            return true;
        }
        int i3 = i2 - 1;
        int i4 = i / 32;
        int i5 = i3 / 32;
        int i6 = i4;
        while (i6 <= i5) {
            if ((((2 << (i6 >= i5 ? 31 & i3 : 31)) - (1 << (i6 > i4 ? 0 : i & 31))) & this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i6]) != 0) {
                return false;
            }
            i6++;
        }
        return true;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1);
        if (z) {
            int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
    }

    public final void TuitionPaymentFragmentbindingInflater1(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(z);
            i2--;
        }
    }

    public final void b(getFlashType getflashtype) {
        int i = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + i);
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = true;
            if (((1 << (i2 & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i2 / 32]) == 0) {
                z = false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(z);
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int[] iArr = new int[this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length];
        int i = (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3];
            long j2 = ((j >> 1) & 1431655765) | ((j & 1431655765) << 1);
            long j3 = ((j2 >> 2) & 858993459) | ((j2 & 858993459) << 2);
            long j4 = ((j3 >> 4) & 252645135) | ((j3 & 252645135) << 4);
            long j5 = ((j4 >> 8) & 16711935) | ((j4 & 16711935) << 8);
            iArr[i - i3] = (int) (((j5 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX) | ((j5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16));
        }
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i] = i7;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getFlashType)) {
            return false;
        }
        getFlashType getflashtype = (getFlashType) obj;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Arrays.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final int hashCode() {
        return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * 31) + Arrays.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        for (int i = 0; i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault1; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(((1 << (i & 31)) & this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i / 32]) != 0 ? 'X' : '.');
        }
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new getFlashType((int[]) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.clone(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }
}
