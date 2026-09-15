package defpackage;

import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/* JADX INFO: loaded from: classes5.dex */
final class addSessionStateCallback {
    private static final int[][] TuitionPaymentFragmentbindingInflater1 = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    private static void b(int i, int i2, addOutputConfig addoutputconfig) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i2 + i3][i + i4] = (byte) TuitionPaymentFragmentbindingInflater1[i3][i4];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0283  */
    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getFlashType getflashtype, ErrorCorrectionLevel errorCorrectionLevel, SessionConfigBuilder sessionConfigBuilder, int i, addOutputConfig addoutputconfig) throws WriterException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8 = 0;
        for (int i9 = 0; i9 < addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2; i9++) {
            for (int i10 = 0; i10 < addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1; i10++) {
                addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i9][i10] = -1;
            }
        }
        int length = TuitionPaymentFragmentbindingInflater1[0].length;
        b(0, 0, addoutputconfig);
        b(addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - length, 0, addoutputconfig);
        b(0, addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - length, addoutputconfig);
        TuitionPaymentFragmentbindingInflater1(0, 7, addoutputconfig);
        TuitionPaymentFragmentbindingInflater1(addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 8, 7, addoutputconfig);
        TuitionPaymentFragmentbindingInflater1(0, addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 8, addoutputconfig);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(7, 0, addoutputconfig);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 8, 0, addoutputconfig);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(7, addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 7, addoutputconfig);
        if (addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 8][8] == 0) {
            throw new WriterException();
        }
        addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 8][8] = 1;
        if (sessionConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1() >= 2) {
            int[] iArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2[sessionConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1() - 1];
            int length2 = iArr.length;
            int i11 = 0;
            while (i11 < length2) {
                int i12 = i8;
                while (i12 < length2) {
                    int i13 = iArr[i11];
                    int i14 = iArr[i12];
                    if (i14 != -1 && i13 != -1 && addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i13][i14] == -1) {
                        int i15 = i14 - 2;
                        int i16 = i13 - 2;
                        int i17 = i8;
                        while (i17 < 5) {
                            for (int i18 = i8; i18 < 5; i18++) {
                                addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i16 + i17][i15 + i18] = (byte) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i17][i18];
                            }
                            i17++;
                            i8 = 0;
                        }
                    }
                    i12++;
                    i8 = 0;
                }
                i11++;
                i8 = 0;
            }
        }
        int i19 = 8;
        while (i19 < addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 8) {
            int i20 = i19 + 1;
            int i21 = i20 % 2;
            if (addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[6][i19] == -1) {
                addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[6][i19] = (byte) i21;
            }
            if (addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i19][6] == -1) {
                addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i19][6] = (byte) i21;
            }
            i19 = i20;
        }
        getFlashType getflashtype2 = new getFlashType();
        if (i < 0 || i >= 8) {
            throw new WriterException("Invalid mask pattern");
        }
        int i22 = (errorCorrectionLevel.bits << 3) | i;
        getflashtype2.TuitionPaymentFragmentbindingInflater1(i22, 5);
        getflashtype2.TuitionPaymentFragmentbindingInflater1(b(i22, 1335), 10);
        getFlashType getflashtype3 = new getFlashType();
        getflashtype3.TuitionPaymentFragmentbindingInflater1(21522, 15);
        if (getflashtype2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != getflashtype3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i23 = 0;
        while (true) {
            int[] iArr2 = getflashtype2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (i23 >= iArr2.length) {
                break;
            }
            iArr2[i23] = iArr2[i23] ^ getflashtype3.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i23];
            i23++;
        }
        if (getflashtype2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != 15) {
            StringBuilder sb = new StringBuilder("should not happen but we got: ");
            sb.append(getflashtype2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            throw new WriterException(sb.toString());
        }
        for (int i24 = 0; i24 < getflashtype2.TuitionPaymentFragmentspecialinlinedviewModeldefault1; i24++) {
            int i25 = (getflashtype2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1) - i24;
            int i26 = (getflashtype2.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i25 / 32] & (1 << (i25 & 31))) != 0 ? 1 : 0;
            int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1[i24];
            byte b = (byte) i26;
            addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[iArr3[1]][iArr3[0]] = b;
            if (i24 < 8) {
                addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[8][(addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - i24) - 1] = b;
            } else {
                addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[(addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 7) + (i24 - 8)][8] = b;
            }
        }
        if (sessionConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1() >= 7) {
            getFlashType getflashtype4 = new getFlashType();
            getflashtype4.TuitionPaymentFragmentbindingInflater1(sessionConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 6);
            getflashtype4.TuitionPaymentFragmentbindingInflater1(b(sessionConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 7973), 12);
            if (getflashtype4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != 18) {
                StringBuilder sb2 = new StringBuilder("should not happen but we got: ");
                sb2.append(getflashtype4.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                throw new WriterException(sb2.toString());
            }
            int i27 = 17;
            for (int i28 = 0; i28 < 6; i28++) {
                for (int i29 = 0; i29 < 3; i29++) {
                    int i30 = ((1 << (i27 & 31)) & getflashtype4.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i27 / 32]) != 0 ? 1 : 0;
                    i27--;
                    byte b2 = (byte) i30;
                    addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[(addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 11) + i29][i28] = b2;
                    addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i28][(addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 11) + i29] = b2;
                }
            }
        }
        int i31 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1;
        int i32 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 1;
        int i33 = -1;
        int i34 = 0;
        while (i31 > 0) {
            if (i31 == 6) {
                i31--;
            }
            while (i32 >= 0 && i32 < addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                for (int i35 = 0; i35 < 2; i35++) {
                    int i36 = i31 - i35;
                    if (addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i32][i36] == -1) {
                        if (i34 < getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            i2 = ((1 << (i34 & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i34 / 32]) != 0 ? 1 : 0;
                            i34++;
                        } else {
                            i2 = 0;
                        }
                        if (i != -1) {
                            switch (i) {
                                case 0:
                                    i3 = i32;
                                    i4 = i36;
                                    i5 = i3 + i4;
                                    i6 = i5 & 1;
                                    if (i6 == 0) {
                                        i2 ^= 1;
                                    }
                                    break;
                                case 1:
                                    i5 = i32;
                                    i6 = i5 & 1;
                                    if (i6 == 0) {
                                        i2 ^= 1;
                                    }
                                    break;
                                case 2:
                                    i6 = i36 % 3;
                                    if (i6 == 0) {
                                        i2 ^= 1;
                                    }
                                    break;
                                case 3:
                                    i6 = (i32 + i36) % 3;
                                    if (i6 == 0) {
                                        i2 ^= 1;
                                    }
                                    break;
                                case 4:
                                    i3 = i32 / 2;
                                    i4 = i36 / 3;
                                    i5 = i3 + i4;
                                    i6 = i5 & 1;
                                    if (i6 == 0) {
                                        i2 ^= 1;
                                    }
                                    break;
                                case 5:
                                    int i37 = i32 * i36;
                                    i6 = (i37 & 1) + (i37 % 3);
                                    if (i6 == 0) {
                                        i2 ^= 1;
                                    }
                                    break;
                                case 6:
                                    z = true;
                                    int i38 = i32 * i36;
                                    i7 = (i38 & 1) + (i38 % 3);
                                    i6 = i7 & 1;
                                    if (i6 == 0) {
                                        i2 ^= 1;
                                    }
                                    break;
                                case 7:
                                    z = true;
                                    i7 = ((i32 * i36) % 3) + ((i32 + i36) & 1);
                                    i6 = i7 & 1;
                                    if (i6 == 0) {
                                        i2 ^= 1;
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i)));
                            }
                        }
                        addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i32][i36] = (byte) i2;
                    }
                }
                i32 += i33;
            }
            i33 = -i33;
            i32 += i33;
            i31 -= 2;
        }
        if (i34 == getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("Not all bits consumed: ");
        sb3.append(i34);
        sb3.append('/');
        sb3.append(getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        throw new WriterException(sb3.toString());
    }

    private static void TuitionPaymentFragmentbindingInflater1(int i, int i2, addOutputConfig addoutputconfig) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i2][i4] != -1) {
                throw new WriterException();
            }
            addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i2][i4] = 0;
        }
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, addOutputConfig addoutputconfig) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i4][i] != -1) {
                throw new WriterException();
            }
            addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i4][i] = 0;
        }
    }

    private static int b(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
        int i3 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i3) {
            iNumberOfLeadingZeros2 ^= i2 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i3);
        }
        return iNumberOfLeadingZeros2;
    }
}
