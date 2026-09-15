package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveDataObservable {
    private static boolean TuitionPaymentFragmentbindingInflater1(char c) {
        if (c == '\r' || c == '*' || c == '>' || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static boolean b(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        int i3;
        if (i >= charSequence.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i4 = 0;
        while (true) {
            int i5 = i + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(fArr, iArr, bArr);
                int i6 = 0;
                for (int i7 = 0; i7 < 6; i7++) {
                    i6 += bArr[i7];
                }
                if (iArr[0] == iTuitionPaymentFragmentbindingInflater1) {
                    return 0;
                }
                if (i6 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (i6 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (i6 != 1 || bArr[2] <= 0) {
                    return (i6 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char cCharAt = charSequence.charAt(i5);
            i4++;
            if (cCharAt >= '0' && cCharAt <= '9') {
                fArr[0] = fArr[0] + 0.5f;
            } else if (cCharAt >= 128 && cCharAt <= 255) {
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + 2.0f;
            } else {
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + 1.0f;
            }
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(cCharAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (cCharAt >= 128 && cCharAt <= 255) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (b(cCharAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (cCharAt >= 128 && cCharAt <= 255) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (TuitionPaymentFragmentbindingInflater1(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (cCharAt >= 128 && cCharAt <= 255) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (cCharAt < ' ' || cCharAt > '^') {
                i3 = 4;
                if (cCharAt >= 128 && cCharAt <= 255) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            } else {
                i3 = 4;
                fArr[4] = fArr[4] + 0.75f;
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i4 >= i3) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                TuitionPaymentFragmentbindingInflater1(fArr, iArr2, bArr2);
                int i8 = 0;
                for (int i9 = 0; i9 < 6; i9++) {
                    i8 += bArr2[i9];
                }
                int i10 = iArr2[0];
                int i11 = iArr2[5];
                if (i10 < i11 && i10 < iArr2[1] && i10 < iArr2[2] && i10 < iArr2[3] && i10 < iArr2[4]) {
                    return 0;
                }
                if (i11 >= i10) {
                    byte b = bArr2[1];
                    byte b2 = bArr2[2];
                    byte b3 = bArr2[3];
                    byte b4 = bArr2[4];
                    if (b + b2 + b3 + b4 != 0) {
                        if (i8 == 1 && b4 > 0) {
                            return 4;
                        }
                        if (i8 == 1 && b2 > 0) {
                            return 2;
                        }
                        if (i8 == 1 && b3 > 0) {
                            return 3;
                        }
                        int i12 = iArr2[1];
                        int i13 = i12 + 1;
                        if (i13 < i10 && i13 < i11 && i13 < iArr2[4] && i13 < iArr2[2]) {
                            int i14 = iArr2[3];
                            if (i12 < i14) {
                                return 1;
                            }
                            if (i12 == i14) {
                                for (int i15 = i + i4 + 1; i15 < charSequence.length(); i15++) {
                                    char cCharAt2 = charSequence.charAt(i15);
                                    if (cCharAt2 == '\r' || cCharAt2 == '*' || cCharAt2 == '>') {
                                        return 3;
                                    }
                                    if (!TuitionPaymentFragmentbindingInflater1(cCharAt2)) {
                                        break;
                                    }
                                }
                                return 1;
                            }
                        }
                    }
                }
                return 5;
            }
        }
    }

    private static int TuitionPaymentFragmentbindingInflater1(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < 6; i2++) {
            int iCeil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = iCeil;
            if (i > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i = iCeil;
            }
            if (i == iCeil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(char c) {
        String hexString = Integer.toHexString(c);
        StringBuilder sb = new StringBuilder();
        sb.append("0000".substring(0, 4 - hexString.length()));
        sb.append(hexString);
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("Illegal character: ");
        sb2.append(c);
        sb2.append(" (0x");
        sb2.append(string);
        sb2.append(')');
        throw new IllegalArgumentException(sb2.toString());
    }
}
