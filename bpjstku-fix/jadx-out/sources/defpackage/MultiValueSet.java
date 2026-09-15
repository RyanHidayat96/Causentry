package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class MultiValueSet extends insertOption {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1;
    private static final int[] TuitionPaymentFragmentbindingInflater1 = {6, 8, 10, 12, 14};
    private static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {1, 1, 1, 1};
    private static final int[] b = {1, 1, 3};
    static final int[][] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    private void TuitionPaymentFragmentbindingInflater1(getFlashType getflashtype, int i) throws NotFoundException {
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * 10;
        if (i2 >= i) {
            i2 = i;
        }
        while (true) {
            i--;
            if (i2 <= 0 || i < 0 || ((1 << (i & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i / 32]) != 0) {
                break;
            } else {
                i2--;
            }
        }
        if (i2 != 0) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
    }

    private int[] TuitionPaymentFragmentbindingInflater1(getFlashType getflashtype) throws NotFoundException {
        getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        try {
            int i = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1(0);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != i) {
                int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, b);
                TuitionPaymentFragmentbindingInflater1(getflashtype, iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[0]);
                int i2 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[0];
                iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[0] = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[1];
                iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[1] = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - i2;
                getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        } catch (Throwable th) {
            getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            throw th;
        }
    }

    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(getFlashType getflashtype, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i2 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i;
        boolean z = false;
        int i4 = 0;
        while (i < i2) {
            if ((((1 << (i & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i / 32]) != 0) ^ z) {
                iArr2[i4] = iArr2[i4] + 1;
            } else {
                int i5 = length - 1;
                if (i4 != i5) {
                    i4++;
                } else {
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArr2, iArr, 0.78f) < 0.38f) {
                        return new int[]{i3, i};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i6 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i6);
                    iArr2[i6] = 0;
                    iArr2[i5] = 0;
                    i4--;
                }
                iArr2[i4] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int[] iArr) throws NotFoundException {
        int length = TuitionPaymentFragmentspecialinlinedviewModeldefault3.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float fTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArr, TuitionPaymentFragmentspecialinlinedviewModeldefault3[i2], 0.78f);
            if (fTuitionPaymentFragmentspecialinlinedviewModeldefault2 < f) {
                i = i2;
                f = fTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
        }
        if (i >= 0) {
            return i;
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.insertOption
    public final DynamicRanges b(int i, getFlashType getflashtype, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        boolean z;
        int i2 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1(0);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != i2) {
            int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            int i3 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[1];
            int i4 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[0];
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (i3 - i4) / 4;
            TuitionPaymentFragmentbindingInflater1(getflashtype, i4);
            int[] iArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(getflashtype);
            StringBuilder sb = new StringBuilder(20);
            int i5 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[1];
            int i6 = iArrTuitionPaymentFragmentbindingInflater1[0];
            int[] iArr = new int[10];
            int[] iArr2 = new int[5];
            int[] iArr3 = new int[5];
            while (i5 < i6) {
                b(getflashtype, i5, iArr);
                for (int i7 = 0; i7 < 5; i7++) {
                    int i8 = i7 * 2;
                    iArr2[i7] = iArr[i8];
                    iArr3[i7] = iArr[i8 + 1];
                }
                sb.append((char) (TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr2) + 48));
                sb.append((char) (TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr3) + 48));
                for (int i9 = 0; i9 < 10; i9++) {
                    i5 += iArr[i9];
                }
            }
            String string = sb.toString();
            int[] iArr4 = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS) : null;
            if (iArr4 == null) {
                iArr4 = TuitionPaymentFragmentbindingInflater1;
            }
            int length = string.length();
            int length2 = iArr4.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= length2) {
                    z = false;
                    break;
                }
                int i12 = iArr4[i10];
                if (length == i12) {
                    z = true;
                    break;
                }
                if (i12 > i11) {
                    i11 = i12;
                }
                i10++;
            }
            if ((z || length <= i11) && !z) {
                throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
            float f = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[1];
            float f2 = i;
            return new DynamicRanges(string, null, new DeferrableSurfaces1[]{new DeferrableSurfaces1(f, f2), new DeferrableSurfaces1(iArrTuitionPaymentFragmentbindingInflater1[0], f2)}, BarcodeFormat.ITF);
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }
}
