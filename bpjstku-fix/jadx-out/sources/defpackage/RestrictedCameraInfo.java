package defpackage;

import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class RestrictedCameraInfo {
    private static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {0, 4, 1, 5};
    private static final int[] b = {6, 2, 7, 3};
    private static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {8, 1, 1, 1, 1, 1, 1, 3};
    private static final int[] TuitionPaymentFragmentbindingInflater1 = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private static List<DeferrableSurfaces1[]> TuitionPaymentFragmentbindingInflater1(boolean z, getBufferFormat getbufferformat) {
        int i;
        float f;
        ArrayList<DeferrableSurfaces1[]> arrayList = new ArrayList();
        int iMax = 0;
        loop0: while (true) {
            int i2 = 0;
            boolean z2 = false;
            while (iMax < getbufferformat.b) {
                DeferrableSurfaces1[] deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(getbufferformat, iMax, i2);
                if (deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[0] == null && deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[3] == null) {
                    if (!z2) {
                        break;
                    }
                    for (DeferrableSurfaces1[] deferrableSurfaces1Arr : arrayList) {
                        DeferrableSurfaces1 deferrableSurfaces1 = deferrableSurfaces1Arr[1];
                        if (deferrableSurfaces1 != null) {
                            iMax = (int) Math.max(iMax, deferrableSurfaces1.b);
                        }
                        DeferrableSurfaces1 deferrableSurfaces2 = deferrableSurfaces1Arr[3];
                        if (deferrableSurfaces2 != null) {
                            iMax = Math.max(iMax, (int) deferrableSurfaces2.b);
                        }
                    }
                    iMax += 5;
                } else {
                    arrayList.add(deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    if (!z) {
                        break loop0;
                    }
                    DeferrableSurfaces1 deferrableSurfaces3 = deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[2];
                    if (deferrableSurfaces3 != null) {
                        i = (int) deferrableSurfaces3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        f = deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[2].b;
                    } else {
                        i = (int) deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[4].TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        f = deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[4].b;
                    }
                    i2 = i;
                    iMax = (int) f;
                    z2 = true;
                }
            }
            break loop0;
        }
        return arrayList;
    }

    private static DeferrableSurfaces1[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(getBufferFormat getbufferformat, int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        boolean z;
        int i6;
        int i7;
        DeferrableSurfaces1[] deferrableSurfaces1Arr = new DeferrableSurfaces1[4];
        int[] iArr2 = new int[iArr.length];
        int i8 = i3;
        while (true) {
            if (i8 >= i) {
                z = false;
                break;
            }
            int[] iArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(getbufferformat, i4, i8, i2, false, iArr, iArr2);
            if (iArrTuitionPaymentFragmentbindingInflater1 != null) {
                int i9 = i8;
                int[] iArr3 = iArrTuitionPaymentFragmentbindingInflater1;
                while (i9 > 0) {
                    int i10 = i9 - 1;
                    int[] iArrTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1(getbufferformat, i4, i10, i2, false, iArr, iArr2);
                    if (iArrTuitionPaymentFragmentbindingInflater2 == null) {
                        break;
                    }
                    iArr3 = iArrTuitionPaymentFragmentbindingInflater2;
                    i9 = i10;
                }
                float f = i9;
                deferrableSurfaces1Arr[0] = new DeferrableSurfaces1(iArr3[0], f);
                deferrableSurfaces1Arr[1] = new DeferrableSurfaces1(iArr3[1], f);
                z = true;
                i8 = i9;
                break;
            }
            i8 += 5;
        }
        int i11 = i8 + 1;
        if (z) {
            int[] iArr4 = {(int) deferrableSurfaces1Arr[0].TuitionPaymentFragmentspecialinlinedviewModeldefault2, (int) deferrableSurfaces1Arr[1].TuitionPaymentFragmentspecialinlinedviewModeldefault2};
            int i12 = i11;
            int i13 = 0;
            while (true) {
                if (i12 >= i) {
                    i6 = i13;
                    i7 = i12;
                    break;
                }
                i6 = i13;
                i7 = i12;
                int[] iArrTuitionPaymentFragmentbindingInflater3 = TuitionPaymentFragmentbindingInflater1(getbufferformat, iArr4[0], i12, i2, false, iArr, iArr2);
                if (iArrTuitionPaymentFragmentbindingInflater3 != null && Math.abs(iArr4[0] - iArrTuitionPaymentFragmentbindingInflater3[0]) < 5 && Math.abs(iArr4[1] - iArrTuitionPaymentFragmentbindingInflater3[1]) < 5) {
                    iArr4 = iArrTuitionPaymentFragmentbindingInflater3;
                    i13 = 0;
                } else {
                    if (i6 > 25) {
                        break;
                    }
                    i13 = i6 + 1;
                }
                i12 = i7 + 1;
            }
            i11 = i7 - (i6 + 1);
            float f2 = i11;
            deferrableSurfaces1Arr[2] = new DeferrableSurfaces1(iArr4[0], f2);
            deferrableSurfaces1Arr[3] = new DeferrableSurfaces1(iArr4[1], f2);
        }
        if (i11 - i8 < 10) {
            for (i5 = 0; i5 < 4; i5++) {
                deferrableSurfaces1Arr[i5] = null;
            }
        }
        return deferrableSurfaces1Arr;
    }

    private static int[] TuitionPaymentFragmentbindingInflater1(getBufferFormat getbufferformat, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        for (int i4 = 0; getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, i2) && i > 0 && i4 < 3; i4++) {
            i--;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i5 = 0;
        int i6 = i;
        while (i < i3) {
            if (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, i2) ^ z2) {
                iArr2[i5] = iArr2[i5] + 1;
            } else {
                int i7 = length - 1;
                if (i5 != i7) {
                    i5++;
                } else {
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr2, iArr) < 0.42f) {
                        return new int[]{i6, i};
                    }
                    i6 += iArr2[0] + iArr2[1];
                    int i8 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i7] = 0;
                    i5--;
                }
                iArr2[i5] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i5 != length - 1 || TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i6, i - 1};
    }

    private static float TuitionPaymentFragmentspecialinlinedviewModeldefault1(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f = i;
        float f2 = f / i2;
        float f3 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f4 = iArr2[i4] * f2;
            float f5 = i5;
            float f6 = f5 > f4 ? f5 - f4 : f4 - f5;
            if (f6 > 0.8f * f2) {
                return Float.POSITIVE_INFINITY;
            }
            f3 += f6;
        }
        return f3 / f;
    }

    public static RestrictedCameraInfoCameraOperation TuitionPaymentFragmentbindingInflater1(surfaceListWithTimeout surfacelistwithtimeout, boolean z) throws NotFoundException {
        if (surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1 == null) {
            surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1 = surfacelistwithtimeout.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        }
        getBufferFormat getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1;
        List<DeferrableSurfaces1[]> listTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(false, getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        if (listTuitionPaymentFragmentbindingInflater1.isEmpty()) {
            getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i = getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i2 = getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
            getFlashType getflashtype = new getFlashType(i);
            getFlashType getflashtype2 = new getFlashType(i);
            for (int i3 = 0; i3 < (i2 + 1) / 2; i3++) {
                getflashtype = getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(i3, getflashtype);
                int i4 = (i2 - 1) - i3;
                getflashtype2 = getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(i4, getflashtype2);
                getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                getflashtype2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int[] iArr = getflashtype2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int[] iArr2 = getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                int i5 = getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                System.arraycopy(iArr, 0, iArr2, i3 * i5, i5);
                int[] iArr3 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int[] iArr4 = getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                int i6 = getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                System.arraycopy(iArr3, 0, iArr4, i4 * i6, i6);
            }
            listTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(false, getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return new RestrictedCameraInfoCameraOperation(getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault3, listTuitionPaymentFragmentbindingInflater1);
    }

    private static DeferrableSurfaces1[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(getBufferFormat getbufferformat, int i, int i2) {
        int i3 = getbufferformat.b;
        int i4 = getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        DeferrableSurfaces1[] deferrableSurfaces1Arr = new DeferrableSurfaces1[8];
        DeferrableSurfaces1[] deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(getbufferformat, i3, i4, i, i2, TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int[] iArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            deferrableSurfaces1Arr[iArr[i5]] = deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[i5];
        }
        DeferrableSurfaces1 deferrableSurfaces1 = deferrableSurfaces1Arr[4];
        if (deferrableSurfaces1 != null) {
            i2 = (int) deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            i = (int) deferrableSurfaces1Arr[4].b;
        }
        DeferrableSurfaces1[] deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(getbufferformat, i3, i4, i, i2, TuitionPaymentFragmentbindingInflater1);
        int[] iArr2 = b;
        for (int i6 = 0; i6 < iArr2.length; i6++) {
            deferrableSurfaces1Arr[iArr2[i6]] = deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[i6];
        }
        return deferrableSurfaces1Arr;
    }
}
