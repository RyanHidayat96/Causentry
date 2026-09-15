package defpackage;

import kotlin.UByte;

/* JADX INFO: loaded from: classes6.dex */
public final class getChildRotationDegrees {
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[64];

    static {
        char c = 'A';
        int i = 0;
        while (c <= 'Z') {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2[i] = c;
            c = (char) (c + 1);
            i++;
        }
        char c2 = 'a';
        while (c2 <= 'z') {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = '0';
        while (c3 <= '9') {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        cArr[i] = '+';
        cArr[i + 1] = '/';
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new byte[128];
        int i2 = 0;
        while (true) {
            byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1[TuitionPaymentFragmentspecialinlinedviewModeldefault2[i3]] = (byte) i3;
        }
    }

    public static String b(String str) {
        return new String(b(str.getBytes()));
    }

    private static char[] b(byte[] bArr) {
        int i;
        int i2;
        int length = bArr.length;
        int i3 = ((length * 4) + 2) / 3;
        char[] cArr = new char[((length + 2) / 3) * 4];
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = i4 + 1;
            byte b = bArr[i4];
            if (i6 < length) {
                int i7 = bArr[i6] & UByte.MAX_VALUE;
                i6 = i4 + 2;
                i = i7;
            } else {
                i = 0;
            }
            if (i6 < length) {
                i2 = bArr[i6] & UByte.MAX_VALUE;
                i6++;
            } else {
                i2 = 0;
            }
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            cArr[i5] = cArr2[(b & UByte.MAX_VALUE) >>> 2];
            int i8 = i5 + 2;
            cArr[i5 + 1] = cArr2[((b & 3) << 4) | (i >>> 4)];
            char c = '=';
            cArr[i8] = i8 < i3 ? cArr2[((i & 15) << 2) | (i2 >>> 6)] : '=';
            int i9 = i5 + 3;
            if (i9 < i3) {
                c = cArr2[i2 & 63];
            }
            cArr[i9] = c;
            i5 += 4;
            i4 = i6;
        }
        return cArr;
    }
}
