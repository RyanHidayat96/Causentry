package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class getMaxResolution implements EncoderProfilesProvider {
    @Override // defpackage.EncoderProfilesProvider
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        lambdasurfaceListWithTimeout1 lambdasurfacelistwithtimeout1;
        int i3;
        int i4;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Requested dimensions are too small: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        lambdasurfaceListWithTimeout1 lambdasurfacelistwithtimeout2 = null;
        if (map != null) {
            SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
            if (symbolShapeHint2 != null) {
                symbolShapeHint = symbolShapeHint2;
            }
            lambdasurfaceListWithTimeout1 lambdasurfacelistwithtimeout3 = (lambdasurfaceListWithTimeout1) map.get(EncodeHintType.MIN_SIZE);
            if (lambdasurfacelistwithtimeout3 == null) {
                lambdasurfacelistwithtimeout3 = null;
            }
            lambdasurfaceListWithTimeout1 lambdasurfacelistwithtimeout4 = (lambdasurfaceListWithTimeout1) map.get(EncodeHintType.MAX_SIZE);
            lambdasurfacelistwithtimeout1 = lambdasurfacelistwithtimeout4 != null ? lambdasurfacelistwithtimeout4 : null;
            lambdasurfacelistwithtimeout2 = lambdasurfacelistwithtimeout3;
        } else {
            lambdasurfacelistwithtimeout1 = null;
        }
        ImageOutputConfigRotationValue[] imageOutputConfigRotationValueArr = {new ImageOutputConfigBuilder(), new ImageProxyBundle(), new getLiveData(), new postValue(), new getCaptureIds(), new hasTargetAspectRatio()};
        lambdaaddObserver2androidxcameracoreimplLiveDataObservable lambdaaddobserver2androidxcameracoreimpllivedataobservable = new lambdaaddObserver2androidxcameracoreimplLiveDataObservable(str);
        lambdaaddobserver2androidxcameracoreimpllivedataobservable.f1247a = symbolShapeHint;
        lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdasurfacelistwithtimeout2;
        lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentbindingInflater1 = lambdasurfacelistwithtimeout1;
        if (!str.startsWith("[)>\u001e05\u001d") || !str.endsWith("\u001e\u0004")) {
            if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) 237);
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.g = 2;
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.d += 7;
            }
        } else {
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) 236);
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.g = 2;
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.d += 7;
        }
        int i5 = 0;
        while (lambdaaddobserver2androidxcameracoreimpllivedataobservable.d < lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.length() - lambdaaddobserver2androidxcameracoreimpllivedataobservable.g) {
            imageOutputConfigRotationValueArr[i5].TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaaddobserver2androidxcameracoreimpllivedataobservable);
            if (lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= 0) {
                i5 = lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1;
            }
        }
        int length = lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length();
        lambdaaddobserver2androidxcameracoreimpllivedataobservable.b(lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length());
        int i6 = lambdaaddobserver2androidxcameracoreimpllivedataobservable.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (length < i6 && i5 != 0 && i5 != 5) {
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) 254);
        }
        StringBuilder sb2 = lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (sb2.length() < i6) {
            sb2.append((char) 129);
        }
        while (sb2.length() < i6) {
            int length2 = ((sb2.length() + 1) * 149) % 253;
            int i7 = length2 + 130;
            if (i7 > 254) {
                i7 = length2 - 124;
            }
            sb2.append((char) i7);
        }
        String string = lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.toString();
        LensFacingCameraFilter lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LensFacingCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(string.length(), symbolShapeHint, lambdasurfacelistwithtimeout2, lambdasurfacelistwithtimeout1);
        ImageReaderProxyOnImageAvailableListener imageReaderProxyOnImageAvailableListener = new ImageReaderProxyOnImageAvailableListener(ImmediateSurface.TuitionPaymentFragmentbindingInflater1(string, lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3), lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3() * lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1() * lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i8 = 0;
        int i9 = 0;
        int i10 = 4;
        while (true) {
            if (i10 == imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && i9 == 0) {
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1, 0, i8, 1);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1, 1, i8, 2);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1, 2, i8, 3);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 2, i8, 4);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 1, i8, 5);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 1, i8, 6);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 1, i8, 7);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(3, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 1, i8, 8);
                i8++;
            }
            if (i10 == imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 2 && i9 == 0 && imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 % 4 != 0) {
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 3, 0, i8, 1);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 2, 0, i8, 2);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1, 0, i8, 3);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 4, i8, 4);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 3, i8, 5);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 2, i8, 6);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 1, i8, 7);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 1, i8, 8);
                i8++;
            }
            if (i10 == imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 2 && i9 == 0 && imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 % 8 == 4) {
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 3, 0, i8, 1);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 2, 0, i8, 2);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1, 0, i8, 3);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 2, i8, 4);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 1, i8, 5);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 1, i8, 6);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 1, i8, 7);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(3, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 1, i8, 8);
                i8++;
            }
            if (i10 == imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 4 && i9 == 2 && imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 % 8 == 0) {
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1, 0, i8, 1);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 1, i8, 2);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 3, i8, 3);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 2, i8, 4);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 1, i8, 5);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 3, i8, 6);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 2, i8, 7);
                imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 1, i8, 8);
                i8++;
            }
            while (true) {
                if (i10 < imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && i9 >= 0 && imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3[(imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 * i10) + i9] < 0) {
                    imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i10, i9, i8);
                    i8++;
                }
                int i11 = i10 - 2;
                int i12 = i9 + 2;
                if (i11 < 0 || i12 >= imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1) {
                    break;
                }
                i10 = i11;
                i9 = i12;
            }
            int i13 = i10 - 1;
            int i14 = i9 + 5;
            while (true) {
                if (i13 >= 0 && i14 < imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 && imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3[(imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 * i13) + i14] < 0) {
                    imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i13, i14, i8);
                    i8++;
                }
                int i15 = i13 + 2;
                int i16 = i14 - 2;
                i3 = imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (i15 >= i3 || i16 < 0) {
                    break;
                }
                i13 = i15;
                i14 = i16;
            }
            i10 = i13 + 5;
            i9 = i14 - 1;
            if (i10 >= i3 && i9 >= (i4 = imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1)) {
                break;
            }
        }
        if (imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3[((i3 - 1) * imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1) + (i4 - 1)] < 0) {
            imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3[((imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1) * imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1) + (imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 1)] = 1;
            imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3[((imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 2) * imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1) + (imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 - 2)] = 1;
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3() * lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iTuitionPaymentFragmentbindingInflater1 = lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1() * lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        addOutputConfig addoutputconfig = new addOutputConfig((lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3() * lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + (lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3() << 1), (lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1() * lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1() << 1));
        int i17 = 0;
        for (int i18 = 0; i18 < iTuitionPaymentFragmentbindingInflater1; i18++) {
            if (i18 % lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                int i19 = 0;
                for (int i20 = 0; i20 < (lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3() * lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + (lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3() << 1); i20++) {
                    addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i17][i19] = (byte) (i20 % 2 == 0 ? 1 : 0);
                    i19++;
                }
                i17++;
            }
            int i21 = 0;
            for (int i22 = 0; i22 < iTuitionPaymentFragmentspecialinlinedviewModeldefault3; i22++) {
                if (i22 % lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
                    addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i17][i21] = 1;
                    i21++;
                }
                addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i17][i21] = (byte) (imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3[(imageReaderProxyOnImageAvailableListener.TuitionPaymentFragmentbindingInflater1 * i18) + i22] == 1 ? 1 : 0);
                int i23 = i21 + 1;
                if (i22 % lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 1) {
                    addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i17][i23] = (byte) (i18 % 2 == 0 ? 1 : 0);
                    i21 += 2;
                } else {
                    i21 = i23;
                }
            }
            int i24 = i17 + 1;
            if (i18 % lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1) {
                int i25 = 0;
                for (int i26 = 0; i26 < (lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3() * lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + (lensFacingCameraFilterTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3() << 1); i26++) {
                    addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i24][i25] = 1;
                    i25++;
                }
                i17 += 2;
            } else {
                i17 = i24;
            }
        }
        int i27 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i28 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        getBufferFormat getbufferformat = new getBufferFormat(i27, i28);
        int length3 = getbufferformat.TuitionPaymentFragmentbindingInflater1.length;
        for (int i29 = 0; i29 < length3; i29++) {
            getbufferformat.TuitionPaymentFragmentbindingInflater1[i29] = 0;
        }
        for (int i30 = 0; i30 < i27; i30++) {
            for (int i31 = 0; i31 < i28; i31++) {
                if (addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i31][i30] == 1) {
                    int i32 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i31) + (i30 / 32);
                    int[] iArr = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    iArr[i32] = (1 << (i30 & 31)) | iArr[i32];
                }
            }
        }
        return getbufferformat;
    }
}
