package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public final class fromError extends withInitialError {
    static final int[] b = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    private final int[] g = new int[4];

    @Override // defpackage.withInitialError
    protected final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(getFlashType getflashtype, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.g;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 6 && i2 < i; i4++) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype, iArr2, i2, TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb.append((char) ((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 % 10) + 48));
            for (int i5 : iArr2) {
                i2 += i5;
            }
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 >= 10) {
                i3 |= 1 << (5 - i4);
            }
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (i3 == b[i6]) {
                sb.insert(0, (char) (i6 + 48));
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(getflashtype, i2, true, TuitionPaymentFragmentspecialinlinedviewModeldefault1)[1];
                for (int i8 = 0; i8 < 6 && i7 < i; i8++) {
                    sb.append((char) (TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype, iArr2, i7, TuitionPaymentFragmentspecialinlinedviewModeldefault2) + 48));
                    for (int i9 : iArr2) {
                        i7 += i9;
                    }
                }
                return i7;
            }
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.withInitialError
    final BarcodeFormat TuitionPaymentFragmentbindingInflater1() {
        return BarcodeFormat.EAN_13;
    }
}
