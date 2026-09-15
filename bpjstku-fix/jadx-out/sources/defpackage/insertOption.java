package defpackage;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class insertOption implements canMatchBitDepth {
    @Override // defpackage.canMatchBitDepth
    public void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    public abstract DynamicRanges b(int i, getFlashType getflashtype, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    @Override // defpackage.canMatchBitDepth
    public DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceListWithTimeout surfacelistwithtimeout) throws NotFoundException, FormatException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfacelistwithtimeout, null);
    }

    @Override // defpackage.canMatchBitDepth
    public DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceListWithTimeout surfacelistwithtimeout, Map<DecodeHintType, ?> map) throws Throwable {
        try {
            return TuitionPaymentFragmentbindingInflater1(surfacelistwithtimeout, map);
        } catch (NotFoundException e2) {
            if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER) || !surfacelistwithtimeout.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                throw e2;
            }
            surfaceListWithTimeout surfacelistwithtimeout2 = new surfaceListWithTimeout(surfacelistwithtimeout.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(surfacelistwithtimeout.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b()));
            DynamicRanges dynamicRangesTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(surfacelistwithtimeout2, map);
            Map<ResultMetadataType, Object> map2 = dynamicRangesTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iIntValue = 270;
            if (map2 != null && map2.containsKey(ResultMetadataType.ORIENTATION)) {
                iIntValue = (((Integer) map2.get(ResultMetadataType.ORIENTATION)).intValue() + 270) % 360;
            }
            dynamicRangesTuitionPaymentFragmentbindingInflater1.b(ResultMetadataType.ORIENTATION, Integer.valueOf(iIntValue));
            DeferrableSurfaces1[] deferrableSurfaces1Arr = dynamicRangesTuitionPaymentFragmentbindingInflater1.b;
            if (deferrableSurfaces1Arr != null) {
                int i = surfacelistwithtimeout2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                for (int i2 = 0; i2 < deferrableSurfaces1Arr.length; i2++) {
                    deferrableSurfaces1Arr[i2] = new DeferrableSurfaces1((i - deferrableSurfaces1Arr[i2].b) - 1.0f, deferrableSurfaces1Arr[i2].TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }
            return dynamicRangesTuitionPaymentFragmentbindingInflater1;
        }
    }

    protected static void b(getFlashType getflashtype, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        Arrays.fill(iArr, 0, length, 0);
        int i2 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i >= i2) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        boolean z = !(((1 << (i & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i / 32]) != 0);
        int i3 = 0;
        while (i < i2) {
            if (!((((1 << (i & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i / 32]) != 0) ^ z)) {
                i3++;
                if (i3 == length) {
                    break;
                }
                iArr[i3] = 1;
                z = !z;
            } else {
                iArr[i3] = iArr[i3] + 1;
            }
            i++;
        }
        if (i3 != length) {
            if (i3 != length - 1 || i != i2) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
        }
    }

    protected static void TuitionPaymentFragmentbindingInflater1(getFlashType getflashtype, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean z = ((1 << (i & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i / 32]) != 0;
        while (i > 0 && length >= 0) {
            i--;
            if ((((1 << (i & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i / 32]) != 0) != z) {
                length--;
                z = !z;
            }
        }
        if (length >= 0) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        b(getflashtype, i + 1, iArr);
    }

    public static float TuitionPaymentFragmentspecialinlinedviewModeldefault2(int[] iArr, int[] iArr2, float f) {
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
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f5 = iArr2[i4] * f3;
            float f6 = i5;
            float f7 = f6 > f5 ? f6 - f5 : f5 - f6;
            if (f7 > f * f3) {
                return Float.POSITIVE_INFINITY;
            }
            f4 += f7;
        }
        return f4 / f2;
    }

    private DynamicRanges TuitionPaymentFragmentbindingInflater1(surfaceListWithTimeout surfacelistwithtimeout, Map<DecodeHintType, ?> map) throws Throwable {
        Map<DecodeHintType, ?> map2;
        int i;
        surfaceListWithTimeout surfacelistwithtimeout2 = surfacelistwithtimeout;
        Map<DecodeHintType, ?> map3 = map;
        int i2 = surfacelistwithtimeout2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
        int i3 = surfacelistwithtimeout2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        getFlashType getflashtype = new getFlashType(i2);
        int i4 = 1;
        boolean z = map3 != null && map3.containsKey(DecodeHintType.TRY_HARDER);
        int iMax = Math.max(1, i3 >> (z ? 8 : 5));
        int i5 = z ? i3 : 15;
        int i6 = 0;
        while (i6 < i5) {
            int i7 = i6 + 1;
            int i8 = i7 / 2;
            if ((i6 & 1) != 0) {
                i8 = -i8;
            }
            int i9 = (i8 * iMax) + (i3 >> 1);
            if (i9 < 0 || i9 >= i3) {
                break;
            }
            try {
                getflashtype = surfacelistwithtimeout2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(i9, getflashtype);
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == i4) {
                        getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        if (map3 != null && map3.containsKey(DecodeHintType.NEED_RESULT_POINT_CALLBACK)) {
                            EnumMap enumMap = new EnumMap(DecodeHintType.class);
                            enumMap.putAll(map3);
                            enumMap.remove(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
                            map3 = enumMap;
                        }
                    }
                    try {
                        DynamicRanges dynamicRangesB = b(i9, getflashtype, map3);
                        if (i10 == i4) {
                            dynamicRangesB.b(ResultMetadataType.ORIENTATION, 180);
                            DeferrableSurfaces1[] deferrableSurfaces1Arr = dynamicRangesB.b;
                            if (deferrableSurfaces1Arr != null) {
                                float f = i2;
                                try {
                                    map2 = map3;
                                    try {
                                        deferrableSurfaces1Arr[0] = new DeferrableSurfaces1((f - deferrableSurfaces1Arr[0].TuitionPaymentFragmentspecialinlinedviewModeldefault2) - 1.0f, deferrableSurfaces1Arr[0].b);
                                        i = 1;
                                        try {
                                            deferrableSurfaces1Arr[1] = new DeferrableSurfaces1((f - deferrableSurfaces1Arr[1].TuitionPaymentFragmentspecialinlinedviewModeldefault2) - 1.0f, deferrableSurfaces1Arr[1].b);
                                        } catch (ReaderException unused) {
                                            continue;
                                            i10++;
                                            map3 = map2;
                                            i4 = i;
                                        }
                                    } catch (ReaderException unused2) {
                                        i = 1;
                                        i10++;
                                        map3 = map2;
                                        i4 = i;
                                    }
                                } catch (ReaderException unused3) {
                                    map2 = map3;
                                }
                            }
                        }
                        return dynamicRangesB;
                    } catch (ReaderException unused4) {
                        map2 = map3;
                        i = i4;
                    }
                }
            } catch (NotFoundException unused5) {
            }
            surfacelistwithtimeout2 = surfacelistwithtimeout;
            i6 = i7;
            i4 = i4;
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }
}
