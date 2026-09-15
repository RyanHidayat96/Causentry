package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class withInitialError extends insertOption {
    static final int[][] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    static final int[][] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    static final int[] asBinder = {1, 1, 1};
    static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {1, 1, 1, 1, 1};
    static final int[] TuitionPaymentFragmentbindingInflater1 = {1, 1, 1, 1, 1, 1};
    private final StringBuilder b = new StringBuilder(20);
    private final withInitialState asInterface = new withInitialState();
    private final fromValue g = new fromValue();

    abstract BarcodeFormat TuitionPaymentFragmentbindingInflater1();

    protected abstract int TuitionPaymentFragmentspecialinlinedviewModeldefault2(getFlashType getflashtype, int[] iArr, StringBuilder sb) throws NotFoundException;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr;
        int[][] iArr2 = new int[20][];
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3[i] = iArr4;
        }
    }

    protected withInitialError() {
    }

    static int[] TuitionPaymentFragmentbindingInflater1(getFlashType getflashtype) throws NotFoundException {
        int[] iArr = new int[asBinder.length];
        int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
        int i = 0;
        while (!zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int[] iArr2 = asBinder;
            Arrays.fill(iArr, 0, iArr2.length, 0);
            iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype, i, false, iArr2, iArr);
            int i2 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[0];
            int i3 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i4, i2);
            }
            i = i3;
        }
        return iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.insertOption
    public DynamicRanges b(int i, getFlashType getflashtype, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, getflashtype, TuitionPaymentFragmentbindingInflater1(getflashtype), map);
    }

    public DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, getFlashType getflashtype, int[] iArr, Map<DecodeHintType, ?> map) throws Throwable {
        int length;
        String strTuitionPaymentFragmentbindingInflater1;
        canMatchEncoding canmatchencoding = map == null ? null : (canMatchEncoding) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        int i2 = 0;
        if (canmatchencoding != null) {
            canmatchencoding.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new DeferrableSurfaces1((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb = this.b;
        sb.setLength(0);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(getflashtype, iArr, sb);
        if (canmatchencoding != null) {
            canmatchencoding.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new DeferrableSurfaces1(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, i));
        }
        int[] iArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(getflashtype, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        if (canmatchencoding != null) {
            canmatchencoding.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new DeferrableSurfaces1((iArrTuitionPaymentFragmentbindingInflater1[0] + iArrTuitionPaymentFragmentbindingInflater1[1]) / 2.0f, i));
        }
        int i3 = iArrTuitionPaymentFragmentbindingInflater1[1];
        int i4 = (i3 - iArrTuitionPaymentFragmentbindingInflater1[0]) + i3;
        if (i4 >= getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1 || !getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i3, i4)) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        String string = sb.toString();
        if (string.length() < 8) {
            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        if (!TuitionPaymentFragmentbindingInflater1(string)) {
            throw ChecksumException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
        float f = (iArr[1] + iArr[0]) / 2.0f;
        float f2 = (iArrTuitionPaymentFragmentbindingInflater1[1] + iArrTuitionPaymentFragmentbindingInflater1[0]) / 2.0f;
        BarcodeFormat barcodeFormatTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
        float f3 = i;
        DynamicRanges dynamicRanges = new DynamicRanges(string, null, new DeferrableSurfaces1[]{new DeferrableSurfaces1(f, f3), new DeferrableSurfaces1(f2, f3)}, barcodeFormatTuitionPaymentFragmentbindingInflater1);
        try {
            DynamicRanges dynamicRangesTuitionPaymentFragmentbindingInflater1 = this.asInterface.TuitionPaymentFragmentbindingInflater1(i, getflashtype, iArrTuitionPaymentFragmentbindingInflater1[1]);
            dynamicRanges.b(ResultMetadataType.UPC_EAN_EXTENSION, dynamicRangesTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
            Map<ResultMetadataType, Object> map2 = dynamicRangesTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (map2 != null) {
                Map<ResultMetadataType, Object> map3 = dynamicRanges.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (map3 == null) {
                    dynamicRanges.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = map2;
                } else {
                    map3.putAll(map2);
                }
            }
            DeferrableSurfaces1[] deferrableSurfaces1Arr = dynamicRangesTuitionPaymentFragmentbindingInflater1.b;
            DeferrableSurfaces1[] deferrableSurfaces1Arr2 = dynamicRanges.b;
            if (deferrableSurfaces1Arr2 == null) {
                dynamicRanges.b = deferrableSurfaces1Arr;
            } else if (deferrableSurfaces1Arr != null && deferrableSurfaces1Arr.length > 0) {
                DeferrableSurfaces1[] deferrableSurfaces1Arr3 = new DeferrableSurfaces1[deferrableSurfaces1Arr2.length + deferrableSurfaces1Arr.length];
                System.arraycopy(deferrableSurfaces1Arr2, 0, deferrableSurfaces1Arr3, 0, deferrableSurfaces1Arr2.length);
                System.arraycopy(deferrableSurfaces1Arr, 0, deferrableSurfaces1Arr3, deferrableSurfaces1Arr2.length, deferrableSurfaces1Arr.length);
                dynamicRanges.b = deferrableSurfaces1Arr3;
            }
            length = dynamicRangesTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.length();
        } catch (ReaderException unused) {
            length = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            int length2 = iArr2.length;
            while (true) {
                if (i2 >= length2) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                if (length == iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        if ((barcodeFormatTuitionPaymentFragmentbindingInflater1 == BarcodeFormat.EAN_13 || barcodeFormatTuitionPaymentFragmentbindingInflater1 == BarcodeFormat.UPC_A) && (strTuitionPaymentFragmentbindingInflater1 = this.g.TuitionPaymentFragmentbindingInflater1(string)) != null) {
            dynamicRanges.b(ResultMetadataType.POSSIBLE_COUNTRY, strTuitionPaymentFragmentbindingInflater1);
        }
        return dynamicRanges;
    }

    boolean TuitionPaymentFragmentbindingInflater1(String str) throws FormatException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
    }

    static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            int iCharAt = charSequence.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
            i += iCharAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            int iCharAt2 = charSequence.charAt(i4) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
            i3 += iCharAt2;
        }
        return i3 % 10 == 0;
    }

    int[] TuitionPaymentFragmentbindingInflater1(getFlashType getflashtype, int i) throws NotFoundException {
        int[] iArr = asBinder;
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype, i, false, iArr, new int[iArr.length]);
    }

    static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(getFlashType getflashtype, int i, boolean z, int[] iArr) throws NotFoundException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype, i, z, iArr, new int[iArr.length]);
    }

    static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(getFlashType getflashtype, int[] iArr, int i, int[][] iArr2) throws NotFoundException {
        b(getflashtype, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float fTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArr, iArr2[i3], 0.7f);
            if (fTuitionPaymentFragmentspecialinlinedviewModeldefault2 < f) {
                i2 = i3;
                f = fTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }

    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(getFlashType getflashtype, int i, boolean z, int[] iArr, int[] iArr2) throws NotFoundException {
        int i2 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = z ? getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i) : getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
        int length = iArr.length;
        boolean z2 = z;
        int i3 = 0;
        int i4 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        while (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            if ((((1 << (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[iTuitionPaymentFragmentspecialinlinedviewModeldefault3 / 32]) != 0) ^ z2) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                int i5 = length - 1;
                if (i3 != i5) {
                    i3++;
                } else {
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3};
                    }
                    i4 += iArr2[0] + iArr2[1];
                    int i6 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i6);
                    iArr2[i6] = 0;
                    iArr2[i5] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z2 = !z2;
            }
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3++;
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }
}
