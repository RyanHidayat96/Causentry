package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class RetryPolicyInternal implements canMatchBitDepth {
    private static final DeferrableSurfaces1[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new DeferrableSurfaces1[0];
    private final getRepeatingCaptureConfig TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new getRepeatingCaptureConfig();

    @Override // defpackage.canMatchBitDepth
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.canMatchBitDepth
    public final DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceListWithTimeout surfacelistwithtimeout) throws NotFoundException, ChecksumException, FormatException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfacelistwithtimeout, null);
    }

    @Override // defpackage.canMatchBitDepth
    public final DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceListWithTimeout surfacelistwithtimeout, Map<DecodeHintType, ?> map) throws Throwable {
        int i;
        DeferrableSurfaces1[] deferrableSurfaces1Arr;
        getCaptureBundle getcapturebundleTuitionPaymentFragmentbindingInflater1;
        int i2;
        int iAbs;
        char c = 3;
        int i3 = 0;
        int i4 = 1;
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
            int i5 = getbufferformat.b;
            int i6 = getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i7 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[0];
            int i8 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[1];
            int i9 = 0;
            boolean z = true;
            while (i7 < i6 && i8 < i5) {
                if (z != getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i7, i8)) {
                    i9++;
                    if (i9 == 5) {
                        break;
                    }
                    z = !z;
                }
                i7++;
                i8++;
            }
            if (i7 == i6 || i8 == i5) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            int i10 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[0];
            float f = (i7 - i10) / 7.0f;
            int i11 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[1];
            int i12 = iArrTuitionPaymentFragmentbindingInflater1[1];
            int i13 = iArrTuitionPaymentFragmentbindingInflater1[0];
            if (i10 >= i13 || i11 >= i12) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            int i14 = i12 - i11;
            if (i14 != i13 - i10 && (i13 = i10 + i14) >= getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            int iRound = Math.round(((i13 - i10) + 1) / f);
            int iRound2 = Math.round((i14 + 1) / f);
            if (iRound <= 0 || iRound2 <= 0) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            if (iRound2 != iRound) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            int i15 = (int) (f / 2.0f);
            int i16 = i11 + i15;
            int i17 = i10 + i15;
            int i18 = (((int) ((iRound - 1) * f)) + i17) - i13;
            if (i18 > 0) {
                if (i18 > i15) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                i17 -= i18;
            }
            int i19 = (((int) ((iRound2 - 1) * f)) + i16) - i12;
            if (i19 > 0) {
                if (i19 > i15) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                i16 -= i19;
            }
            getBufferFormat getbufferformat2 = new getBufferFormat(iRound, iRound2);
            int i20 = 0;
            while (i20 < iRound2) {
                int i21 = (int) (i20 * f);
                for (int i22 = i3; i22 < iRound; i22++) {
                    if (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(((int) (i22 * f)) + i17, i21 + i16)) {
                        int i23 = (getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i20) + (i22 / 32);
                        int[] iArr = getbufferformat2.TuitionPaymentFragmentbindingInflater1;
                        iArr[i23] = (1 << (i22 & 31)) | iArr[i23];
                    }
                }
                i20++;
                i3 = 0;
            }
            getcapturebundleTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(getbufferformat2, map);
            deferrableSurfaces1Arr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        } else {
            if (surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1 == null) {
                surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1 = surfacelistwithtimeout.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
            }
            addAllSessionStateCallbacks addallsessionstatecallbacks = new addAllSessionStateCallbacks(surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1);
            addallsessionstatecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = map == null ? null : (canMatchEncoding) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            FinderPatternFinder finderPatternFinder = new FinderPatternFinder(addallsessionstatecallbacks.TuitionPaymentFragmentbindingInflater1, addallsessionstatecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            boolean z2 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
            boolean z3 = map != null && map.containsKey(DecodeHintType.PURE_BARCODE);
            int i24 = finderPatternFinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
            int i25 = finderPatternFinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i26 = (i24 * 3) / 228;
            if (i26 < 3 || z2) {
                i26 = 3;
            }
            int[] iArr2 = new int[5];
            int i27 = i26 - 1;
            boolean zTuitionPaymentFragmentbindingInflater1 = false;
            while (i27 < i24 && !zTuitionPaymentFragmentbindingInflater1) {
                iArr2[0] = 0;
                iArr2[i4] = 0;
                iArr2[2] = 0;
                iArr2[c] = 0;
                int i28 = 4;
                iArr2[4] = 0;
                int i29 = 0;
                int i30 = 0;
                while (i30 < i25) {
                    if (finderPatternFinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i30, i27)) {
                        if ((i29 & 1) == i4) {
                            i29++;
                        }
                        iArr2[i29] = iArr2[i29] + i4;
                        i4 = i4;
                        i28 = i28;
                    } else {
                        if ((i29 & 1) == 0) {
                            if (i29 == i28) {
                                if (FinderPatternFinder.b(iArr2)) {
                                    if (finderPatternFinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArr2, i27, i30, z3)) {
                                        if (finderPatternFinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                            zTuitionPaymentFragmentbindingInflater1 = finderPatternFinder.TuitionPaymentFragmentbindingInflater1();
                                            i2 = 2;
                                        } else {
                                            if (finderPatternFinder.TuitionPaymentFragmentbindingInflater1.size() <= i4) {
                                                i2 = 2;
                                                iAbs = 0;
                                                break;
                                            }
                                            Iterator<addNonRepeatingSurface> it = finderPatternFinder.TuitionPaymentFragmentbindingInflater1.iterator();
                                            addNonRepeatingSurface addnonrepeatingsurface = null;
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    i2 = 2;
                                                    iAbs = 0;
                                                    break;
                                                }
                                                addNonRepeatingSurface next = it.next();
                                                if (next.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= 2) {
                                                    if (addnonrepeatingsurface != null) {
                                                        finderPatternFinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                                                        i2 = 2;
                                                        iAbs = ((int) (Math.abs(addnonrepeatingsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - next.TuitionPaymentFragmentspecialinlinedviewModeldefault2) - Math.abs(addnonrepeatingsurface.b - next.b))) / 2;
                                                        break;
                                                    }
                                                    addnonrepeatingsurface = next;
                                                }
                                            }
                                            int i31 = iArr2[i2];
                                            if (iAbs > i31) {
                                                i27 += (iAbs - i31) - 2;
                                                i30 = i25 - 1;
                                            }
                                        }
                                        iArr2[0] = 0;
                                        i4 = 1;
                                        iArr2[1] = 0;
                                        iArr2[i2] = 0;
                                        iArr2[3] = 0;
                                        i28 = 4;
                                        iArr2[4] = 0;
                                        i26 = i2;
                                        i29 = 0;
                                    } else {
                                        i4 = i4;
                                        i28 = i28;
                                        iArr2[0] = iArr2[2];
                                        iArr2[i4] = iArr2[3];
                                        iArr2[2] = iArr2[i28];
                                        iArr2[3] = i4;
                                        iArr2[i28] = 0;
                                    }
                                } else {
                                    i4 = i4;
                                    i28 = i28;
                                    iArr2[0] = iArr2[2];
                                    iArr2[i4] = iArr2[3];
                                    iArr2[2] = iArr2[i28];
                                    iArr2[3] = i4;
                                    iArr2[i28] = 0;
                                }
                                i29 = 3;
                            } else {
                                i29++;
                            }
                        }
                        iArr2[i29] = iArr2[i29] + i4;
                    }
                    i30 += i4;
                    i28 = i28;
                    i4 = i4;
                }
                if (FinderPatternFinder.b(iArr2) && finderPatternFinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArr2, i27, i25, z3)) {
                    int i32 = iArr2[0];
                    if (finderPatternFinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        zTuitionPaymentFragmentbindingInflater1 = finderPatternFinder.TuitionPaymentFragmentbindingInflater1();
                    }
                    i26 = i32;
                }
                i27 += i26;
                c = 3;
                i4 = 1;
            }
            int size = finderPatternFinder.TuitionPaymentFragmentbindingInflater1.size();
            if (size < 3) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            float f2 = 0.0f;
            if (size > 3) {
                Iterator<addNonRepeatingSurface> it2 = finderPatternFinder.TuitionPaymentFragmentbindingInflater1.iterator();
                float f3 = 0.0f;
                float f4 = 0.0f;
                while (it2.hasNext()) {
                    float f5 = it2.next().TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    f3 += f5;
                    f4 += f5 * f5;
                }
                float f6 = size;
                float f7 = f3 / f6;
                float fSqrt = (float) Math.sqrt((f4 / f6) - (f7 * f7));
                Collections.sort(finderPatternFinder.TuitionPaymentFragmentbindingInflater1, new FinderPatternFinder.FurthestFromAverageComparator(f7, (byte) 0));
                float fMax = Math.max(0.2f * f7, fSqrt);
                int i33 = 0;
                while (i33 < finderPatternFinder.TuitionPaymentFragmentbindingInflater1.size() && finderPatternFinder.TuitionPaymentFragmentbindingInflater1.size() > 3) {
                    if (Math.abs(finderPatternFinder.TuitionPaymentFragmentbindingInflater1.get(i33).TuitionPaymentFragmentspecialinlinedviewModeldefault1 - f7) > fMax) {
                        finderPatternFinder.TuitionPaymentFragmentbindingInflater1.remove(i33);
                        i33--;
                    }
                    i33++;
                }
            }
            if (finderPatternFinder.TuitionPaymentFragmentbindingInflater1.size() > 3) {
                Iterator<addNonRepeatingSurface> it3 = finderPatternFinder.TuitionPaymentFragmentbindingInflater1.iterator();
                while (it3.hasNext()) {
                    f2 += it3.next().TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                }
                i = 0;
                Collections.sort(finderPatternFinder.TuitionPaymentFragmentbindingInflater1, new FinderPatternFinder.CenterComparator(f2 / finderPatternFinder.TuitionPaymentFragmentbindingInflater1.size(), (byte) 0));
                List<addNonRepeatingSurface> list = finderPatternFinder.TuitionPaymentFragmentbindingInflater1;
                list.subList(3, list.size()).clear();
            } else {
                i = 0;
            }
            addNonRepeatingSurface addnonrepeatingsurface2 = finderPatternFinder.TuitionPaymentFragmentbindingInflater1.get(i);
            addNonRepeatingSurface addnonrepeatingsurface3 = finderPatternFinder.TuitionPaymentFragmentbindingInflater1.get(1);
            addNonRepeatingSurface addnonrepeatingsurface4 = finderPatternFinder.TuitionPaymentFragmentbindingInflater1.get(2);
            addNonRepeatingSurface[] addnonrepeatingsurfaceArr = new addNonRepeatingSurface[3];
            addnonrepeatingsurfaceArr[i] = addnonrepeatingsurface2;
            addnonrepeatingsurfaceArr[1] = addnonrepeatingsurface3;
            addnonrepeatingsurfaceArr[2] = addnonrepeatingsurface4;
            DeferrableSurfaces1.TuitionPaymentFragmentbindingInflater1(addnonrepeatingsurfaceArr);
            getMaxCaptureStages getmaxcapturestagesTuitionPaymentFragmentbindingInflater1 = addallsessionstatecallbacks.TuitionPaymentFragmentbindingInflater1(new addRepeatingCameraCaptureCallback(addnonrepeatingsurfaceArr));
            getCaptureBundle getcapturebundleTuitionPaymentFragmentbindingInflater2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(getmaxcapturestagesTuitionPaymentFragmentbindingInflater1.b, map);
            deferrableSurfaces1Arr = getmaxcapturestagesTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getcapturebundleTuitionPaymentFragmentbindingInflater1 = getcapturebundleTuitionPaymentFragmentbindingInflater2;
        }
        if ((getcapturebundleTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 instanceof addAllRepeatingCameraCaptureCallbacks) && ((addAllRepeatingCameraCaptureCallbacks) getcapturebundleTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentspecialinlinedviewModeldefault2 && deferrableSurfaces1Arr != null && deferrableSurfaces1Arr.length >= 3) {
            DeferrableSurfaces1 deferrableSurfaces1 = deferrableSurfaces1Arr[0];
            deferrableSurfaces1Arr[0] = deferrableSurfaces1Arr[2];
            deferrableSurfaces1Arr[2] = deferrableSurfaces1;
        }
        DynamicRanges dynamicRanges = new DynamicRanges(getcapturebundleTuitionPaymentFragmentbindingInflater1.d, getcapturebundleTuitionPaymentFragmentbindingInflater1.b, deferrableSurfaces1Arr, BarcodeFormat.QR_CODE);
        List<byte[]> list2 = getcapturebundleTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (list2 != null) {
            dynamicRanges.b(ResultMetadataType.BYTE_SEGMENTS, list2);
        }
        String str = getcapturebundleTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str != null) {
            dynamicRanges.b(ResultMetadataType.ERROR_CORRECTION_LEVEL, str);
        }
        if (getcapturebundleTuitionPaymentFragmentbindingInflater1.asInterface >= 0 && getcapturebundleTuitionPaymentFragmentbindingInflater1.asBinder >= 0) {
            dynamicRanges.b(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(getcapturebundleTuitionPaymentFragmentbindingInflater1.asBinder));
            dynamicRanges.b(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(getcapturebundleTuitionPaymentFragmentbindingInflater1.asInterface));
        }
        return dynamicRanges;
    }
}
