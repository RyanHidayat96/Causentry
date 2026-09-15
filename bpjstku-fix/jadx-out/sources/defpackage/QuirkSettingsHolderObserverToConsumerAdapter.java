package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.encoder.Compaction;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class QuirkSettingsHolderObserverToConsumerAdapter implements EncoderProfilesProvider {
    @Override // defpackage.EncoderProfilesProvider
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
        }
        SessionConfig sessionConfig = new SessionConfig();
        int i7 = 2;
        if (map != null) {
            if (map.containsKey(EncodeHintType.PDF417_COMPACT)) {
                sessionConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Boolean.valueOf(map.get(EncodeHintType.PDF417_COMPACT).toString()).booleanValue();
            }
            if (map.containsKey(EncodeHintType.PDF417_COMPACTION)) {
                sessionConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Compaction.valueOf(map.get(EncodeHintType.PDF417_COMPACTION).toString());
            }
            if (map.containsKey(EncodeHintType.PDF417_DIMENSIONS)) {
                getHigherPriorityTemplateType gethigherprioritytemplatetype = (getHigherPriorityTemplateType) map.get(EncodeHintType.PDF417_DIMENSIONS);
                int i8 = gethigherprioritytemplatetype.TuitionPaymentFragmentbindingInflater1;
                int i9 = gethigherprioritytemplatetype.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i10 = gethigherprioritytemplatetype.b;
                int i11 = gethigherprioritytemplatetype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                sessionConfig.d = 0;
                sessionConfig.asBinder = 0;
                sessionConfig.g = 0;
                sessionConfig.f210a = 0;
            }
            i3 = map.containsKey(EncodeHintType.MARGIN) ? Integer.parseInt(map.get(EncodeHintType.MARGIN).toString()) : 30;
            i7 = map.containsKey(EncodeHintType.ERROR_CORRECTION) ? Integer.parseInt(map.get(EncodeHintType.ERROR_CORRECTION).toString()) : 2;
            if (map.containsKey(EncodeHintType.CHARACTER_SET)) {
                sessionConfig.b = Charset.forName(map.get(EncodeHintType.CHARACTER_SET).toString());
            }
        } else {
            i3 = 30;
        }
        int iB = defaultEmptySessionConfig.b(i7);
        String strB = getDeviceStateCallbacks.b(str, sessionConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2, sessionConfig.b);
        int length = strB.length();
        float f = 0.0f;
        int[] iArr = null;
        for (int i12 = sessionConfig.asBinder; i12 <= sessionConfig.d && (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SessionConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(length, iB, i12)) >= sessionConfig.f210a; i12++) {
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 <= sessionConfig.g) {
                float f2 = (((i12 * 17) + 69) * 0.357f) / (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 * 2.0f);
                if (iArr == null || Math.abs(f2 - 3.0f) <= Math.abs(f - 3.0f)) {
                    iArr = new int[]{i12, iTuitionPaymentFragmentspecialinlinedviewModeldefault2};
                    f = f2;
                }
            }
        }
        if (iArr == null) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = SessionConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(length, iB, sessionConfig.asBinder);
            int i13 = sessionConfig.f210a;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 < i13) {
                iArr = new int[]{sessionConfig.asBinder, i13};
            }
        }
        if (iArr != null) {
            int i14 = iArr[0];
            int i15 = 1;
            int i16 = iArr[1];
            int iTuitionPaymentFragmentbindingInflater1 = SessionConfig.TuitionPaymentFragmentbindingInflater1(length, iB, i14, i16);
            if (iB + length + 1 > 929) {
                StringBuilder sb = new StringBuilder("Encoded message contains too many code words, message too big (");
                sb.append(str.length());
                sb.append(" bytes)");
                throw new WriterException(sb.toString());
            }
            int i17 = length + iTuitionPaymentFragmentbindingInflater1 + 1;
            StringBuilder sb2 = new StringBuilder(i17);
            sb2.append((char) i17);
            sb2.append(strB);
            for (int i18 = 0; i18 < iTuitionPaymentFragmentbindingInflater1; i18++) {
                sb2.append((char) 900);
            }
            String string = sb2.toString();
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = defaultEmptySessionConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3(string, i7);
            sessionConfig.TuitionPaymentFragmentbindingInflater1 = new RestrictedCameraInfo1(i16, i14);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            String string2 = sb3.toString();
            RestrictedCameraInfo1 restrictedCameraInfo1 = sessionConfig.TuitionPaymentFragmentbindingInflater1;
            int i19 = 0;
            int i20 = 0;
            while (i19 < i16) {
                int i21 = i19 % 3;
                restrictedCameraInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 += i15;
                SessionConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(130728, 17, restrictedCameraInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[restrictedCameraInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault2]);
                if (i21 == 0) {
                    i5 = (i19 / 3) * 30;
                    i4 = ((i16 - 1) / 3) + i5;
                    i6 = i14 - 1;
                } else if (i21 == i15) {
                    i5 = (i19 / 3) * 30;
                    int i22 = i16 - 1;
                    i4 = (i7 * 3) + i5 + (i22 % 3);
                    i6 = i22 / 3;
                } else {
                    int i23 = (i19 / 3) * 30;
                    i4 = (i14 - 1) + i23;
                    i5 = i23 + (i7 * 3);
                    i6 = (i16 - 1) % 3;
                }
                int i24 = SessionConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i21][i4];
                int i25 = i7;
                SessionConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i24, 17, restrictedCameraInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[restrictedCameraInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault2]);
                int i26 = 0;
                while (i26 < i14) {
                    SessionConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SessionConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i21][string2.charAt(i20)], 17, restrictedCameraInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[restrictedCameraInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault2]);
                    i20++;
                    i26++;
                    string2 = string2;
                }
                String str2 = string2;
                if (sessionConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    SessionConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(260649, 1, restrictedCameraInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[restrictedCameraInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault2]);
                } else {
                    SessionConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SessionConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i21][i5 + i6], 17, restrictedCameraInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[restrictedCameraInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault2]);
                    SessionConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(260649, 18, restrictedCameraInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[restrictedCameraInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault2]);
                }
                i19++;
                string2 = str2;
                i7 = i25;
                i15 = 1;
            }
            byte[][] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = sessionConfig.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(1, 4);
            if ((bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[0].length < bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1.length) ^ (i2 > i)) {
                bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                z = true;
            } else {
                z = false;
            }
            int length2 = i / bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[0].length;
            int length3 = i2 / bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1.length;
            if (length2 >= length3) {
                length2 = length3;
            }
            if (length2 > 1) {
                byte[][] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfig.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(length2, length2 << 2);
                if (z) {
                    bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
                return TuitionPaymentFragmentbindingInflater1(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, i3);
            }
            return TuitionPaymentFragmentbindingInflater1(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, i3);
        }
        throw new WriterException("Unable to fit message in columns");
    }

    private static getBufferFormat TuitionPaymentFragmentbindingInflater1(byte[][] bArr, int i) {
        int i2 = i * 2;
        getBufferFormat getbufferformat = new getBufferFormat(bArr[0].length + i2, bArr.length + i2);
        int length = getbufferformat.TuitionPaymentFragmentbindingInflater1.length;
        for (int i3 = 0; i3 < length; i3++) {
            getbufferformat.TuitionPaymentFragmentbindingInflater1[i3] = 0;
        }
        int i4 = (getbufferformat.b - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr[i5][i6] == 1) {
                    int i7 = i6 + i;
                    int i8 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i4) + (i7 / 32);
                    int[] iArr = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    iArr[i8] = (1 << (i7 & 31)) | iArr[i8];
                }
            }
            i5++;
            i4--;
        }
        return getbufferformat;
    }

    private static byte[][] TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = bArr.length;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][(length - i) - 1] = bArr[i][i2];
            }
        }
        return bArr2;
    }
}
