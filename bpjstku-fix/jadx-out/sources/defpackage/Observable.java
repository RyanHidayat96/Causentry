package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public final class Observable extends withInitialError {
    private final int[] g = new int[4];
    static final int[] b = {56, 52, 50, 49, 44, 38, 35, 42, 41, 37};
    private static final int[] d = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[][] f188a = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

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
        for (int i6 = 0; i6 <= 1; i6++) {
            for (int i7 = 0; i7 < 10; i7++) {
                if (i3 == f188a[i6][i7]) {
                    sb.insert(0, (char) (i6 + 48));
                    sb.append((char) (i7 + 48));
                    return i2;
                }
            }
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.withInitialError
    protected final int[] TuitionPaymentFragmentbindingInflater1(getFlashType getflashtype, int i) throws NotFoundException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(getflashtype, i, true, d);
    }

    @Override // defpackage.withInitialError
    final BarcodeFormat TuitionPaymentFragmentbindingInflater1() {
        return BarcodeFormat.UPC_E;
    }

    @Override // defpackage.withInitialError
    protected final boolean TuitionPaymentFragmentbindingInflater1(String str) throws FormatException {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        sb.append(str.charAt(7));
        return super.TuitionPaymentFragmentbindingInflater1(sb.toString());
    }
}
