package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class lambdafetchData0androidxcameracoreimplLiveDataObservable implements canMatchBitDepth {
    private static final DeferrableSurfaces1[] TuitionPaymentFragmentbindingInflater1 = new DeferrableSurfaces1[0];
    private final lambdafetchData1androidxcameracoreimplLiveDataObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new lambdafetchData1androidxcameracoreimplLiveDataObservable();

    @Override // defpackage.canMatchBitDepth
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.canMatchBitDepth
    public final DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceListWithTimeout surfacelistwithtimeout) throws NotFoundException, ChecksumException, FormatException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfacelistwithtimeout, null);
    }

    @Override // defpackage.canMatchBitDepth
    public final DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceListWithTimeout surfacelistwithtimeout, Map<DecodeHintType, ?> map) throws Throwable {
        byte[] bArr;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        if (surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1 == null) {
            surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1 = surfacelistwithtimeout.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        }
        getBufferFormat getbufferformat = surfacelistwithtimeout.TuitionPaymentFragmentbindingInflater1;
        int i = getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = getbufferformat.b;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < getbufferformat.b; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (i6 < i7) {
                    int i8 = getbufferformat.TuitionPaymentFragmentbindingInflater1[(i7 * i5) + i6];
                    if (i8 != 0) {
                        if (i5 < i2) {
                            i2 = i5;
                        }
                        if (i5 > i4) {
                            i4 = i5;
                        }
                        int i9 = i6 << 5;
                        if (i9 < i) {
                            int i10 = 0;
                            while ((i8 << (31 - i10)) == 0) {
                                i10++;
                            }
                            int i11 = i10 + i9;
                            if (i11 < i) {
                                i = i11;
                            }
                        }
                        if (i9 + 31 > i3) {
                            int i12 = 31;
                            while ((i8 >>> i12) == 0) {
                                i12--;
                            }
                            int i13 = i9 + i12;
                            if (i13 > i3) {
                                i3 = i13;
                            }
                        }
                    }
                    i6++;
                }
            }
        }
        int[] iArr = (i3 < i || i4 < i2) ? null : new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
        if (iArr == null) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        int i14 = iArr[0];
        int i15 = iArr[1];
        int i16 = iArr[2];
        int i17 = iArr[3];
        int i18 = 30;
        getBufferFormat getbufferformat2 = new getBufferFormat(30, 33);
        int i19 = 0;
        while (i19 < 33) {
            int i20 = ((i19 * i17) + (i17 / 2)) / 33;
            int i21 = 0;
            while (i21 < i18) {
                if (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(((((i21 * i16) + (i16 / 2)) + (((i19 & 1) * i16) / 2)) / i18) + i14, i20 + i15)) {
                    int i22 = (getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i19) + (i21 / 32);
                    int[] iArr2 = getbufferformat2.TuitionPaymentFragmentbindingInflater1;
                    iArr2[i22] = (1 << (i21 & 31)) | iArr2[i22];
                }
                i21++;
                i18 = 30;
            }
            i19++;
            i18 = 30;
        }
        lambdafetchData1androidxcameracoreimplLiveDataObservable lambdafetchdata1androidxcameracoreimpllivedataobservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        postError posterror = new postError(getbufferformat2);
        byte[] bArr2 = new byte[144];
        int i23 = posterror.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
        int i24 = posterror.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        for (int i25 = 0; i25 < i23; i25++) {
            int[] iArr3 = postError.TuitionPaymentFragmentbindingInflater1[i25];
            for (int i26 = 0; i26 < i24; i26++) {
                int i27 = iArr3[i26];
                if (i27 >= 0 && posterror.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i26, i25)) {
                    int i28 = i27 / 6;
                    bArr2[i28] = (byte) (((byte) (1 << (5 - (i27 % 6)))) | bArr2[i28]);
                }
            }
        }
        lambdafetchdata1androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr2, 0, 10, 10, 0);
        int i29 = bArr2[0] & 15;
        if (i29 == 2 || i29 == 3 || i29 == 4) {
            lambdafetchdata1androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr2, 20, 84, 40, 1);
            lambdafetchdata1androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr2, 20, 84, 40, 2);
            bArr = new byte[94];
        } else if (i29 == 5) {
            lambdafetchdata1androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr2, 20, 68, 56, 1);
            lambdafetchdata1androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr2, 20, 68, 56, 2);
            bArr = new byte[78];
        } else {
            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        System.arraycopy(bArr2, 0, bArr, 0, 10);
        System.arraycopy(bArr2, 20, bArr, 10, bArr.length - 10);
        getCaptureBundle getcapturebundleTuitionPaymentFragmentbindingInflater1 = lambdaremoveObserver3androidxcameracoreimplLiveDataObservable.TuitionPaymentFragmentbindingInflater1(bArr, i29);
        DynamicRanges dynamicRanges = new DynamicRanges(getcapturebundleTuitionPaymentFragmentbindingInflater1.d, getcapturebundleTuitionPaymentFragmentbindingInflater1.b, TuitionPaymentFragmentbindingInflater1, BarcodeFormat.MAXICODE);
        String str = getcapturebundleTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str != null) {
            dynamicRanges.b(ResultMetadataType.ERROR_CORRECTION_LEVEL, str);
        }
        return dynamicRanges;
    }
}
