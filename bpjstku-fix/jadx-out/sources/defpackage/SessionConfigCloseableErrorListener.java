package defpackage;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.UByte;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionConfigCloseableErrorListener {
    private static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX WARN: Code duplicated, block: B:304:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00de A[LOOP:0: B:49:0x00b0->B:63:0x00de, LOOP_END] */
    public static setErrorListener TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) throws Throwable {
        String string;
        Mode mode;
        SessionConfigBuilder sessionConfigBuilderTuitionPaymentFragmentbindingInflater1;
        int length;
        SessionConfigBuilder sessionConfigBuilder;
        int i;
        char c;
        int i2;
        int i3;
        CharacterSetECI characterSetECITuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (map == null || !map.containsKey(EncodeHintType.CHARACTER_SET)) {
            string = "ISO-8859-1";
        } else {
            string = map.get(EncodeHintType.CHARACTER_SET).toString();
        }
        if ("Shift_JIS".equals(string) && TuitionPaymentFragmentbindingInflater1(str)) {
            mode = Mode.KANJI;
        } else {
            int i4 = 0;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (i4 >= str.length()) {
                    if (!z) {
                        if (z2) {
                            mode = Mode.NUMERIC;
                            break;
                        }
                        mode = Mode.BYTE;
                        break;
                    }
                    mode = Mode.ALPHANUMERIC;
                    break;
                }
                char cCharAt = str.charAt(i4);
                if (cCharAt < '0' || cCharAt > '9') {
                    int[] iArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (cCharAt >= iArr.length || iArr[cCharAt] == -1) {
                        mode = Mode.BYTE;
                        break;
                    }
                    z = true;
                } else {
                    z2 = true;
                }
                i4++;
            }
        }
        getFlashType getflashtype = new getFlashType();
        if (mode == Mode.BYTE && !"ISO-8859-1".equals(string) && (characterSetECITuitionPaymentFragmentspecialinlinedviewModeldefault1 = CharacterSetECI.TuitionPaymentFragmentspecialinlinedviewModeldefault1(string)) != null) {
            getflashtype.TuitionPaymentFragmentbindingInflater1(Mode.ECI.bits, 4);
            getflashtype.TuitionPaymentFragmentbindingInflater1(characterSetECITuitionPaymentFragmentspecialinlinedviewModeldefault1.values[0], 8);
        }
        getflashtype.TuitionPaymentFragmentbindingInflater1(mode.bits, 4);
        getFlashType getflashtype2 = new getFlashType();
        int i5 = AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault1[mode.ordinal()];
        if (i5 == 1) {
            int length2 = str.length();
            int i6 = 0;
            while (i6 < length2) {
                int iCharAt = str.charAt(i6) - '0';
                int i7 = i6 + 2;
                if (i7 < length2) {
                    getflashtype2.TuitionPaymentFragmentbindingInflater1((iCharAt * 100) + ((str.charAt(i6 + 1) - '0') * 10) + (str.charAt(i7) - '0'), 10);
                    i6 += 3;
                } else {
                    i6++;
                    if (i6 < length2) {
                        getflashtype2.TuitionPaymentFragmentbindingInflater1((iCharAt * 10) + (str.charAt(i6) - '0'), 7);
                        i6 = i7;
                    } else {
                        getflashtype2.TuitionPaymentFragmentbindingInflater1(iCharAt, 4);
                    }
                }
            }
        } else if (i5 == 2) {
            int length3 = str.length();
            int i8 = 0;
            while (i8 < length3) {
                char cCharAt2 = str.charAt(i8);
                int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i9 = cCharAt2 < iArr2.length ? iArr2[cCharAt2] : -1;
                if (i9 == -1) {
                    throw new WriterException();
                }
                int i10 = i8 + 1;
                if (i10 < length3) {
                    char cCharAt3 = str.charAt(i10);
                    int i11 = cCharAt3 < iArr2.length ? iArr2[cCharAt3] : -1;
                    if (i11 == -1) {
                        throw new WriterException();
                    }
                    getflashtype2.TuitionPaymentFragmentbindingInflater1((i9 * 45) + i11, 11);
                    i8 += 2;
                } else {
                    getflashtype2.TuitionPaymentFragmentbindingInflater1(i9, 6);
                    i8 = i10;
                }
            }
        } else if (i5 != 3) {
            if (i5 != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
            }
            try {
                byte[] bytes = str.getBytes("Shift_JIS");
                int length4 = bytes.length;
                for (int i12 = 0; i12 < length4; i12 += 2) {
                    int i13 = (bytes[i12 + 1] & UByte.MAX_VALUE) | ((bytes[i12] & UByte.MAX_VALUE) << 8);
                    if (i13 < 33088 || i13 > 40956) {
                        if (i13 < 57408 || i13 > 60351) {
                            i2 = -1;
                        } else {
                            i3 = 49472;
                        }
                        if (i2 != -1) {
                            throw new WriterException("Invalid byte sequence");
                        }
                        getflashtype2.TuitionPaymentFragmentbindingInflater1(((i2 >> 8) * DerHeader.TAG_CLASS_PRIVATE) + (i2 & 255), 13);
                    } else {
                        i3 = 33088;
                    }
                    i2 = i13 - i3;
                    if (i2 != -1) {
                        throw new WriterException("Invalid byte sequence");
                    }
                    getflashtype2.TuitionPaymentFragmentbindingInflater1(((i2 >> 8) * DerHeader.TAG_CLASS_PRIVATE) + (i2 & 255), 13);
                }
            } catch (UnsupportedEncodingException e2) {
                throw new WriterException(e2);
            }
        } else {
            try {
                for (byte b : str.getBytes(string)) {
                    getflashtype2.TuitionPaymentFragmentbindingInflater1(b, 8);
                }
            } catch (UnsupportedEncodingException e3) {
                throw new WriterException(e3);
            }
        }
        if (map != null && map.containsKey(EncodeHintType.QR_VERSION)) {
            sessionConfigBuilderTuitionPaymentFragmentbindingInflater1 = SessionConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.parseInt(map.get(EncodeHintType.QR_VERSION).toString()));
            if (!b(getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + mode.b(sessionConfigBuilderTuitionPaymentFragmentbindingInflater1) + getflashtype2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, sessionConfigBuilderTuitionPaymentFragmentbindingInflater1, errorCorrectionLevel)) {
                throw new WriterException("Data too big for requested version");
            }
        } else {
            sessionConfigBuilderTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + mode.b(TuitionPaymentFragmentbindingInflater1(getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + mode.b(SessionConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1)) + getflashtype2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, errorCorrectionLevel)) + getflashtype2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, errorCorrectionLevel);
        }
        getFlashType getflashtype3 = new getFlashType();
        getflashtype3.b(getflashtype);
        if (mode != Mode.BYTE) {
            length = str.length();
        } else {
            length = (getflashtype2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7) / 8;
        }
        int iB = mode.b(sessionConfigBuilderTuitionPaymentFragmentbindingInflater1);
        int i14 = 1 << iB;
        if (length >= i14) {
            StringBuilder sb = new StringBuilder();
            sb.append(length);
            sb.append(" is bigger than ");
            sb.append(i14 - 1);
            throw new WriterException(sb.toString());
        }
        getflashtype3.TuitionPaymentFragmentbindingInflater1(length, iB);
        getflashtype3.b(getflashtype2);
        SessionConfigBuilder.b bVar = sessionConfigBuilderTuitionPaymentFragmentbindingInflater1.b[errorCorrectionLevel.ordinal()];
        int iB2 = sessionConfigBuilderTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - (bVar.b * bVar.b());
        int i15 = iB2 << 3;
        if (getflashtype3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > i15) {
            StringBuilder sb2 = new StringBuilder("data bits cannot fit in the QR Code");
            sb2.append(getflashtype3.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb2.append(" > ");
            sb2.append(i15);
            throw new WriterException(sb2.toString());
        }
        for (int i16 = 0; i16 < 4 && getflashtype3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i15; i16++) {
            getflashtype3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
        }
        boolean z3 = false;
        int i17 = getflashtype3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 & 7;
        if (i17 > 0) {
            while (i17 < 8) {
                getflashtype3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(z3);
                i17++;
                z3 = false;
            }
        }
        int i18 = (getflashtype3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7) / 8;
        for (int i19 = 0; i19 < iB2 - i18; i19++) {
            getflashtype3.TuitionPaymentFragmentbindingInflater1((i19 & 1) == 0 ? 236 : 17, 8);
        }
        if (getflashtype3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != i15) {
            throw new WriterException("Bits size does not equal capacity");
        }
        int i20 = sessionConfigBuilderTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iB3 = bVar.b();
        if ((getflashtype3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7) / 8 != iB2) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(iB3);
        int iMax = 0;
        int i21 = 0;
        int i22 = 0;
        int iMax2 = 0;
        while (i21 < iB3) {
            int[] iArr3 = new int[1];
            int[] iArr4 = new int[1];
            if (i21 >= iB3) {
                throw new WriterException("Block ID too large");
            }
            int i23 = i20 % iB3;
            int i24 = iB3 - i23;
            int i25 = i20 / iB3;
            int i26 = iB2 / iB3;
            int i27 = i26 + 1;
            SessionConfigBuilder sessionConfigBuilder2 = sessionConfigBuilderTuitionPaymentFragmentbindingInflater1;
            int i28 = i25 - i26;
            int i29 = (i25 + 1) - i27;
            if (i28 != i29) {
                throw new WriterException("EC bytes mismatch");
            }
            Mode mode2 = mode;
            if (iB3 != i24 + i23) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i20 == ((i26 + i28) * i24) + ((i27 + i29) * i23)) {
                if (i21 < i24) {
                    c = 0;
                    iArr3[0] = i26;
                    iArr4[0] = i28;
                } else {
                    c = 0;
                    iArr3[0] = i27;
                    iArr4[0] = i29;
                }
                int i30 = iArr3[c];
                byte[] bArr = new byte[i30];
                int i31 = i22 << 3;
                int i32 = 0;
                while (i32 < i30) {
                    int i33 = iB3;
                    int i34 = i20;
                    int i35 = 0;
                    int i36 = 0;
                    while (i35 < 8) {
                        int i37 = iB2;
                        if ((getflashtype3.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i31 / 32] & (1 << (i31 & 31))) != 0) {
                            i36 |= 1 << (7 - i35);
                        }
                        i31++;
                        i35++;
                        iB2 = i37;
                    }
                    bArr[i32] = (byte) i36;
                    i32++;
                    iB3 = i33;
                    i20 = i34;
                }
                int i38 = iB3;
                int i39 = iB2;
                int i40 = i20;
                int i41 = iArr4[0];
                int[] iArr5 = new int[i30 + i41];
                for (int i42 = 0; i42 < i30; i42++) {
                    iArr5[i42] = bArr[i42] & UByte.MAX_VALUE;
                }
                new getCustomOrderedResolutions(ImageInputConfigBuilder.f156a).b(iArr5, i41);
                byte[] bArr2 = new byte[i41];
                for (int i43 = 0; i43 < i41; i43++) {
                    bArr2[i43] = (byte) iArr5[i30 + i43];
                }
                arrayList.add(new addDeviceStateCallback(bArr, bArr2));
                iMax2 = Math.max(iMax2, i30);
                iMax = Math.max(iMax, i41);
                i22 += iArr3[0];
                i21++;
                sessionConfigBuilderTuitionPaymentFragmentbindingInflater1 = sessionConfigBuilder2;
                iB3 = i38;
                i20 = i40;
                iB2 = i39;
                mode = mode2;
            } else {
                throw new WriterException("Total bytes mismatch");
            }
        }
        SessionConfigBuilder sessionConfigBuilder3 = sessionConfigBuilderTuitionPaymentFragmentbindingInflater1;
        int i44 = i20;
        Mode mode3 = mode;
        if (iB2 != i22) {
            throw new WriterException("Data bytes does not match offset");
        }
        getFlashType getflashtype4 = new getFlashType();
        for (int i45 = 0; i45 < iMax2; i45++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = ((addDeviceStateCallback) it.next()).b;
                if (i45 < bArr3.length) {
                    getflashtype4.TuitionPaymentFragmentbindingInflater1(bArr3[i45], 8);
                }
            }
        }
        for (int i46 = 0; i46 < iMax; i46++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr4 = ((addDeviceStateCallback) it2.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (i46 < bArr4.length) {
                    getflashtype4.TuitionPaymentFragmentbindingInflater1(bArr4[i46], 8);
                }
            }
        }
        if (i44 == (getflashtype4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7) / 8) {
            setErrorListener seterrorlistener = new setErrorListener();
            ErrorCorrectionLevel errorCorrectionLevel2 = errorCorrectionLevel;
            seterrorlistener.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = errorCorrectionLevel2;
            seterrorlistener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mode3;
            SessionConfigBuilder sessionConfigBuilder4 = sessionConfigBuilder3;
            seterrorlistener.b = sessionConfigBuilder4;
            int i47 = (sessionConfigBuilder4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * 4) + 17;
            addOutputConfig addoutputconfig = new addOutputConfig(i47, i47);
            int i48 = Integer.MAX_VALUE;
            int i49 = -1;
            int i50 = 0;
            for (int i51 = 8; i50 < i51; i51 = 8) {
                addSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype4, errorCorrectionLevel2, sessionConfigBuilder4, i50, addoutputconfig);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = SessionConfigErrorListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(addoutputconfig, true) + SessionConfigErrorListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(addoutputconfig, false);
                byte[][] bArr5 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i52 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i53 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i54 = 0;
                int i55 = 0;
                while (i54 < i53 - 1) {
                    int i56 = i53;
                    int i57 = 0;
                    while (i57 < i52 - 1) {
                        byte[] bArr6 = bArr5[i54];
                        byte b2 = bArr6[i57];
                        int i58 = i57 + 1;
                        if (b2 == bArr6[i58]) {
                            byte[] bArr7 = bArr5[i54 + 1];
                            if (b2 == bArr7[i57] && b2 == bArr7[i58]) {
                                i55++;
                            }
                        }
                        i57 = i58;
                    }
                    i54++;
                    i53 = i56;
                }
                int i59 = i55 * 3;
                byte[][] bArr8 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i60 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i61 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i62 = 0;
                int i63 = 0;
                while (i62 < i61) {
                    int i64 = i63;
                    int i65 = 0;
                    while (i65 < i60) {
                        getFlashType getflashtype5 = getflashtype4;
                        byte[] bArr9 = bArr8[i62];
                        int i66 = i65 + 6;
                        if (i66 < i60) {
                            i = i60;
                            sessionConfigBuilder = sessionConfigBuilder4;
                            if (bArr9[i65] == 1 && bArr9[i65 + 1] == 0 && bArr9[i65 + 2] == 1 && bArr9[i65 + 3] == 1 && bArr9[i65 + 4] == 1 && bArr9[i65 + 5] == 0 && bArr9[i66] == 1 && (SessionConfigErrorListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr9, i65 - 4, i65) || SessionConfigErrorListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr9, i65 + 7, i65 + 11))) {
                                i64++;
                            }
                        } else {
                            sessionConfigBuilder = sessionConfigBuilder4;
                            i = i60;
                        }
                        int i67 = i62 + 6;
                        if (i67 < i61 && bArr8[i62][i65] == 1 && bArr8[i62 + 1][i65] == 0 && bArr8[i62 + 2][i65] == 1 && bArr8[i62 + 3][i65] == 1 && bArr8[i62 + 4][i65] == 1 && bArr8[i62 + 5][i65] == 0 && bArr8[i67][i65] == 1 && (SessionConfigErrorListener.b(bArr8, i65, i62 - 4, i62) || SessionConfigErrorListener.b(bArr8, i65, i62 + 7, i62 + 11))) {
                            i64++;
                        }
                        i65++;
                        getflashtype4 = getflashtype5;
                        sessionConfigBuilder4 = sessionConfigBuilder;
                        i60 = i;
                    }
                    i62++;
                    i63 = i64;
                }
                getFlashType getflashtype6 = getflashtype4;
                SessionConfigBuilder sessionConfigBuilder5 = sessionConfigBuilder4;
                int i68 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 + i59 + (i63 * 40);
                byte[][] bArr10 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i69 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i70 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i71 = 0;
                for (int i72 = 0; i72 < i70; i72++) {
                    byte[] bArr11 = bArr10[i72];
                    for (int i73 = 0; i73 < i69; i73++) {
                        if (bArr11[i73] == 1) {
                            i71++;
                        }
                    }
                }
                int i74 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int iAbs = i68 + (((Math.abs((i71 << 1) - i74) * 10) / i74) * 10);
                if (iAbs < i48) {
                    i48 = iAbs;
                    i49 = i50;
                }
                i50++;
                getflashtype4 = getflashtype6;
                errorCorrectionLevel2 = errorCorrectionLevel;
                sessionConfigBuilder4 = sessionConfigBuilder5;
            }
            seterrorlistener.TuitionPaymentFragmentbindingInflater1 = i49;
            addSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype4, errorCorrectionLevel, sessionConfigBuilder4, i49, addoutputconfig);
            seterrorlistener.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = addoutputconfig;
            return seterrorlistener;
        }
        StringBuilder sb3 = new StringBuilder("Interleaving error: ");
        sb3.append(i44);
        sb3.append(" and ");
        sb3.append((getflashtype4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7) / 8);
        sb3.append(" differ.");
        throw new WriterException(sb3.toString());
    }

    private static boolean TuitionPaymentFragmentbindingInflater1(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & UByte.MAX_VALUE;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static SessionConfigBuilder TuitionPaymentFragmentbindingInflater1(int i, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            SessionConfigBuilder sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SessionConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2);
            if (b(i, sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2, errorCorrectionLevel)) {
                return sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX INFO: renamed from: SessionConfigCloseableErrorListener$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        static {
            int[] iArr = new int[Mode.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static boolean b(int i, SessionConfigBuilder sessionConfigBuilder, ErrorCorrectionLevel errorCorrectionLevel) {
        int i2 = sessionConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        SessionConfigBuilder.b bVar = sessionConfigBuilder.b[errorCorrectionLevel.ordinal()];
        return i2 - (bVar.b * bVar.b()) >= (i + 7) / 8;
    }
}
