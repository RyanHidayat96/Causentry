package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.datamatrix.detector.Detector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class getTargetAspectRatio implements canMatchBitDepth {
    private static final DeferrableSurfaces1[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new DeferrableSurfaces1[0];
    private final ImageOutputConfigRotationDegreesValue TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ImageOutputConfigRotationDegreesValue();

    @Override // defpackage.canMatchBitDepth
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.canMatchBitDepth
    public final DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceListWithTimeout surfacelistwithtimeout) throws NotFoundException, ChecksumException, FormatException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfacelistwithtimeout, null);
    }

    @Override // defpackage.canMatchBitDepth
    public final DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceListWithTimeout surfacelistwithtimeout, Map<DecodeHintType, ?> map) throws Throwable {
        getBufferFormat getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        getCaptureBundle getcapturebundleTuitionPaymentFragmentbindingInflater1;
        DeferrableSurfaces1[] deferrableSurfaces1Arr;
        if (map != null && map.containsKey(DecodeHintType.PURE_BARCODE)) {
            if (surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1 == null) {
                surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1 = surfacelistwithtimeout.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
            }
            getBufferFormat getbufferformat = surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1;
            int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int[] iArrTuitionPaymentFragmentbindingInflater1 = getbufferformat.TuitionPaymentFragmentbindingInflater1();
            if (iArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null || iArrTuitionPaymentFragmentbindingInflater1 == null) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            int i = getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i2 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[0];
            int i3 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[1];
            while (i2 < i && getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2, i3)) {
                i2++;
            }
            if (i2 == i) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            int i4 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[0];
            int i5 = i2 - i4;
            if (i5 != 0) {
                int i6 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[1];
                int i7 = iArrTuitionPaymentFragmentbindingInflater1[1];
                int i8 = ((iArrTuitionPaymentFragmentbindingInflater1[0] - i4) + 1) / i5;
                int i9 = ((i7 - i6) + 1) / i5;
                if (i8 <= 0 || i9 <= 0) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                int i10 = i5 / 2;
                getBufferFormat getbufferformat2 = new getBufferFormat(i8, i9);
                for (int i11 = 0; i11 < i9; i11++) {
                    for (int i12 = 0; i12 < i8; i12++) {
                        if (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1((i12 * i5) + i4 + i10, (i11 * i5) + i6 + i10)) {
                            int i13 = (getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i11) + (i12 / 32);
                            int[] iArr = getbufferformat2.TuitionPaymentFragmentbindingInflater1;
                            iArr[i13] = (1 << (i12 & 31)) | iArr[i13];
                        }
                    }
                }
                getcapturebundleTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(getbufferformat2);
                deferrableSurfaces1Arr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
        } else {
            if (surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1 == null) {
                surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1 = surfacelistwithtimeout.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
            }
            Detector detector = new Detector(surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1);
            DeferrableSurfaces1[] deferrableSurfaces1ArrTuitionPaymentFragmentbindingInflater1 = detector.b.TuitionPaymentFragmentbindingInflater1();
            DeferrableSurfaces1 deferrableSurfaces1 = deferrableSurfaces1ArrTuitionPaymentFragmentbindingInflater1[0];
            DeferrableSurfaces1 deferrableSurfaces2 = deferrableSurfaces1ArrTuitionPaymentFragmentbindingInflater1[1];
            DeferrableSurfaces1 deferrableSurfaces3 = deferrableSurfaces1ArrTuitionPaymentFragmentbindingInflater1[2];
            DeferrableSurfaces1 deferrableSurfaces4 = deferrableSurfaces1ArrTuitionPaymentFragmentbindingInflater1[3];
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces1, deferrableSurfaces2));
            arrayList.add(detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces1, deferrableSurfaces3));
            arrayList.add(detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces2, deferrableSurfaces4));
            arrayList.add(detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces3, deferrableSurfaces4));
            Collections.sort(arrayList, new Detector.ResultPointsAndTransitionsComparator((byte) 0));
            Detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (Detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1) arrayList.get(0);
            Detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (Detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1) arrayList.get(1);
            HashMap map2 = new HashMap();
            Detector.TuitionPaymentFragmentspecialinlinedviewModeldefault3(map2, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Detector.TuitionPaymentFragmentspecialinlinedviewModeldefault3(map2, tuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
            Detector.TuitionPaymentFragmentspecialinlinedviewModeldefault3(map2, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Detector.TuitionPaymentFragmentspecialinlinedviewModeldefault3(map2, tuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
            DeferrableSurfaces1 deferrableSurfaces5 = null;
            DeferrableSurfaces1 deferrableSurfaces6 = null;
            DeferrableSurfaces1 deferrableSurfaces7 = null;
            for (Map.Entry entry : map2.entrySet()) {
                DeferrableSurfaces1 deferrableSurfaces8 = (DeferrableSurfaces1) entry.getKey();
                if (((Integer) entry.getValue()).intValue() == 2) {
                    deferrableSurfaces6 = deferrableSurfaces8;
                } else if (deferrableSurfaces5 == null) {
                    deferrableSurfaces5 = deferrableSurfaces8;
                } else {
                    deferrableSurfaces7 = deferrableSurfaces8;
                }
            }
            if (deferrableSurfaces5 == null || deferrableSurfaces6 == null || deferrableSurfaces7 == null) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            DeferrableSurfaces1[] deferrableSurfaces1Arr2 = {deferrableSurfaces5, deferrableSurfaces6, deferrableSurfaces7};
            DeferrableSurfaces1.TuitionPaymentFragmentbindingInflater1(deferrableSurfaces1Arr2);
            DeferrableSurfaces1 deferrableSurfaces9 = deferrableSurfaces1Arr2[0];
            DeferrableSurfaces1 deferrableSurfaces10 = deferrableSurfaces1Arr2[1];
            DeferrableSurfaces1 deferrableSurfaces11 = deferrableSurfaces1Arr2[2];
            if (map2.containsKey(deferrableSurfaces1)) {
                if (map2.containsKey(deferrableSurfaces2)) {
                    deferrableSurfaces1 = !map2.containsKey(deferrableSurfaces3) ? deferrableSurfaces3 : deferrableSurfaces4;
                } else {
                    deferrableSurfaces1 = deferrableSurfaces2;
                }
            }
            int i14 = detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces11, deferrableSurfaces1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i15 = detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces9, deferrableSurfaces1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if ((i14 & 1) == 1) {
                i14++;
            }
            int i16 = i14 + 2;
            if ((i15 & 1) == 1) {
                i15++;
            }
            int i17 = i15 + 2;
            if (i16 * 4 < i17 * 7 && i17 * 4 < i16 * 7) {
                int iMin = Math.min(i17, i16);
                float fTuitionPaymentFragmentbindingInflater1 = DeferrableSurfaces1.TuitionPaymentFragmentbindingInflater1(deferrableSurfaces10, deferrableSurfaces9);
                float f = iMin;
                float f2 = ((int) (fTuitionPaymentFragmentbindingInflater1 + (fTuitionPaymentFragmentbindingInflater1 < 0.0f ? -0.5f : 0.5f))) / f;
                float fTuitionPaymentFragmentbindingInflater2 = DeferrableSurfaces1.TuitionPaymentFragmentbindingInflater1(deferrableSurfaces11, deferrableSurfaces1);
                float f3 = (int) (fTuitionPaymentFragmentbindingInflater2 + (fTuitionPaymentFragmentbindingInflater2 < 0.0f ? -0.5f : 0.5f));
                DeferrableSurfaces1 deferrableSurfaces12 = new DeferrableSurfaces1(deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - deferrableSurfaces11.TuitionPaymentFragmentspecialinlinedviewModeldefault2) / f3) * f2), deferrableSurfaces1.b + (f2 * ((deferrableSurfaces1.b - deferrableSurfaces11.b) / f3)));
                float fTuitionPaymentFragmentbindingInflater3 = DeferrableSurfaces1.TuitionPaymentFragmentbindingInflater1(deferrableSurfaces10, deferrableSurfaces11);
                float f4 = ((int) (fTuitionPaymentFragmentbindingInflater3 + (fTuitionPaymentFragmentbindingInflater3 < 0.0f ? -0.5f : 0.5f))) / f;
                float fTuitionPaymentFragmentbindingInflater4 = DeferrableSurfaces1.TuitionPaymentFragmentbindingInflater1(deferrableSurfaces9, deferrableSurfaces1);
                float f5 = (int) (fTuitionPaymentFragmentbindingInflater4 + (fTuitionPaymentFragmentbindingInflater4 < 0.0f ? -0.5f : 0.5f));
                DeferrableSurfaces1 deferrableSurfaces13 = new DeferrableSurfaces1(deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - deferrableSurfaces9.TuitionPaymentFragmentspecialinlinedviewModeldefault2) / f5) * f4), deferrableSurfaces1.b + (f4 * ((deferrableSurfaces1.b - deferrableSurfaces9.b) / f5)));
                if (!detector.TuitionPaymentFragmentspecialinlinedviewModeldefault2(deferrableSurfaces12)) {
                    if (!detector.TuitionPaymentFragmentspecialinlinedviewModeldefault2(deferrableSurfaces13)) {
                        deferrableSurfaces13 = null;
                    }
                } else if (!detector.TuitionPaymentFragmentspecialinlinedviewModeldefault2(deferrableSurfaces13) || Math.abs(detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces11, deferrableSurfaces12).TuitionPaymentFragmentspecialinlinedviewModeldefault2 - detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces9, deferrableSurfaces12).TuitionPaymentFragmentspecialinlinedviewModeldefault2) <= Math.abs(detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces11, deferrableSurfaces13).TuitionPaymentFragmentspecialinlinedviewModeldefault2 - detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces9, deferrableSurfaces13).TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                    deferrableSurfaces13 = deferrableSurfaces12;
                }
                if (deferrableSurfaces13 != null) {
                    deferrableSurfaces1 = deferrableSurfaces13;
                }
                int iMax = Math.max(detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces11, deferrableSurfaces1).TuitionPaymentFragmentspecialinlinedviewModeldefault2, detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces9, deferrableSurfaces1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                int i18 = iMax + 1;
                int i19 = (i18 & 1) == 1 ? iMax + 2 : i18;
                getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Detector.TuitionPaymentFragmentspecialinlinedviewModeldefault2(detector.TuitionPaymentFragmentspecialinlinedviewModeldefault2, deferrableSurfaces11, deferrableSurfaces10, deferrableSurfaces9, deferrableSurfaces1, i19, i19);
            } else {
                float fTuitionPaymentFragmentbindingInflater5 = DeferrableSurfaces1.TuitionPaymentFragmentbindingInflater1(deferrableSurfaces10, deferrableSurfaces9);
                float f6 = ((int) (fTuitionPaymentFragmentbindingInflater5 + (fTuitionPaymentFragmentbindingInflater5 < 0.0f ? -0.5f : 0.5f))) / i16;
                float fTuitionPaymentFragmentbindingInflater6 = DeferrableSurfaces1.TuitionPaymentFragmentbindingInflater1(deferrableSurfaces11, deferrableSurfaces1);
                float f7 = (int) (fTuitionPaymentFragmentbindingInflater6 + (fTuitionPaymentFragmentbindingInflater6 < 0.0f ? -0.5f : 0.5f));
                DeferrableSurfaces1 deferrableSurfaces14 = new DeferrableSurfaces1(deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - deferrableSurfaces11.TuitionPaymentFragmentspecialinlinedviewModeldefault2) / f7) * f6), deferrableSurfaces1.b + (f6 * ((deferrableSurfaces1.b - deferrableSurfaces11.b) / f7)));
                float fTuitionPaymentFragmentbindingInflater7 = DeferrableSurfaces1.TuitionPaymentFragmentbindingInflater1(deferrableSurfaces10, deferrableSurfaces11);
                float f8 = ((int) (fTuitionPaymentFragmentbindingInflater7 + (fTuitionPaymentFragmentbindingInflater7 < 0.0f ? -0.5f : 0.5f))) / i17;
                float fTuitionPaymentFragmentbindingInflater8 = DeferrableSurfaces1.TuitionPaymentFragmentbindingInflater1(deferrableSurfaces9, deferrableSurfaces1);
                float f9 = (int) (fTuitionPaymentFragmentbindingInflater8 + (fTuitionPaymentFragmentbindingInflater8 < 0.0f ? -0.5f : 0.5f));
                DeferrableSurfaces1 deferrableSurfaces15 = new DeferrableSurfaces1(deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - deferrableSurfaces9.TuitionPaymentFragmentspecialinlinedviewModeldefault2) / f9) * f8), deferrableSurfaces1.b + (f8 * ((deferrableSurfaces1.b - deferrableSurfaces9.b) / f9)));
                if (!detector.TuitionPaymentFragmentspecialinlinedviewModeldefault2(deferrableSurfaces14)) {
                    if (!detector.TuitionPaymentFragmentspecialinlinedviewModeldefault2(deferrableSurfaces15)) {
                        deferrableSurfaces15 = null;
                    }
                } else if (!detector.TuitionPaymentFragmentspecialinlinedviewModeldefault2(deferrableSurfaces15) || Math.abs(i16 - detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces11, deferrableSurfaces14).TuitionPaymentFragmentspecialinlinedviewModeldefault2) + Math.abs(i17 - detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces9, deferrableSurfaces14).TuitionPaymentFragmentspecialinlinedviewModeldefault2) <= Math.abs(i16 - detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces11, deferrableSurfaces15).TuitionPaymentFragmentspecialinlinedviewModeldefault2) + Math.abs(i17 - detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces9, deferrableSurfaces15).TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                    deferrableSurfaces15 = deferrableSurfaces14;
                }
                if (deferrableSurfaces15 != null) {
                    deferrableSurfaces1 = deferrableSurfaces15;
                }
                int i20 = detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces11, deferrableSurfaces1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i21 = detector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces9, deferrableSurfaces1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if ((i20 & 1) == 1) {
                    i20++;
                }
                int i22 = i20;
                if ((i21 & 1) == 1) {
                    i21++;
                }
                getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Detector.TuitionPaymentFragmentspecialinlinedviewModeldefault2(detector.TuitionPaymentFragmentspecialinlinedviewModeldefault2, deferrableSurfaces11, deferrableSurfaces10, deferrableSurfaces9, deferrableSurfaces1, i22, i21);
            }
            getMaxCaptureStages getmaxcapturestages = new getMaxCaptureStages(getbufferformatTuitionPaymentFragmentspecialinlinedviewModeldefault2, new DeferrableSurfaces1[]{deferrableSurfaces11, deferrableSurfaces10, deferrableSurfaces9, deferrableSurfaces1});
            getcapturebundleTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(getmaxcapturestages.b);
            deferrableSurfaces1Arr = getmaxcapturestages.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        DynamicRanges dynamicRanges = new DynamicRanges(getcapturebundleTuitionPaymentFragmentbindingInflater1.d, getcapturebundleTuitionPaymentFragmentbindingInflater1.b, deferrableSurfaces1Arr, BarcodeFormat.DATA_MATRIX);
        List<byte[]> list = getcapturebundleTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (list != null) {
            dynamicRanges.b(ResultMetadataType.BYTE_SEGMENTS, list);
        }
        String str = getcapturebundleTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str != null) {
            dynamicRanges.b(ResultMetadataType.ERROR_CORRECTION_LEVEL, str);
        }
        return dynamicRanges;
    }
}
