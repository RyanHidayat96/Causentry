package defpackage;

import java.util.Arrays;
import kotlin.UByte;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes5.dex */
final class MediaBrowserCompatMediaBrowserImplBase2 {
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    static byte[] b(CharSequence charSequence) {
        int i;
        char cCharAt;
        int length = charSequence.length();
        while (length > 0 && ((cCharAt = charSequence.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt2 = charSequence.charAt(i6);
            if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                i = cCharAt2 - 'A';
            } else if (cCharAt2 >= 'a' && cCharAt2 <= 'z') {
                i = cCharAt2 - 'G';
            } else if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else {
                if (cCharAt2 == '/' || cCharAt2 == '_') {
                    i = 63;
                } else if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    throw new IllegalArgumentException("invalid character to decode: ".concat(String.valueOf(cCharAt2)));
                }
            }
            i5 = (i5 << 6) | ((byte) i);
            i3++;
            if (i3 % 4 == 0) {
                bArr[i4] = (byte) (i5 >> 16);
                bArr[i4 + 1] = (byte) (i5 >> 8);
                bArr[i4 + 2] = (byte) i5;
                i4 += 3;
            }
        }
        int i7 = i3 % 4;
        if (i7 == 1) {
            return null;
        }
        if (i7 == 2) {
            bArr[i4] = (byte) ((i5 << 12) >> 16);
            i4++;
        } else if (i7 == 3) {
            int i8 = i5 << 6;
            bArr[i4] = (byte) (i8 >> 16);
            bArr[i4 + 1] = (byte) (i8 >> 8);
            i4 += 2;
        }
        return i4 == i2 ? bArr : Arrays.copyOfRange(bArr, 0, i4);
    }

    static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, boolean z, boolean z2) {
        int i;
        byte[] bArr2 = z ? TuitionPaymentFragmentspecialinlinedviewModeldefault1 : TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int length = bArr.length;
        int i2 = 0;
        if (z2) {
            i = ((length + 2) / 3) * 4;
        } else {
            int i3 = length % 3;
            i = ((length / 3) * 4) + (i3 == 0 ? 0 : i3 + 1);
        }
        byte[] bArr3 = new byte[i];
        int length2 = bArr.length - (bArr.length % 3);
        int i4 = 0;
        while (i2 < length2) {
            bArr3[i4] = bArr2[(bArr[i2] & UByte.MAX_VALUE) >> 2];
            int i5 = i2 + 1;
            bArr3[i4 + 1] = bArr2[((bArr[i2] & 3) << 4) | ((bArr[i5] & UByte.MAX_VALUE) >> 4)];
            byte b = bArr[i5];
            int i6 = i2 + 2;
            bArr3[i4 + 2] = bArr2[((b & 15) << 2) | ((bArr[i6] & UByte.MAX_VALUE) >> 6)];
            bArr3[i4 + 3] = bArr2[bArr[i6] & 63];
            i2 += 3;
            i4 += 4;
        }
        int length3 = bArr.length % 3;
        if (length3 == 1) {
            bArr3[i4] = bArr2[(bArr[length2] & UByte.MAX_VALUE) >> 2];
            bArr3[i4 + 1] = bArr2[(bArr[length2] & 3) << 4];
            if (z2) {
                bArr3[i4 + 2] = Base64.padSymbol;
                bArr3[i4 + 3] = Base64.padSymbol;
            }
        } else if (length3 == 2) {
            bArr3[i4] = bArr2[(bArr[length2] & UByte.MAX_VALUE) >> 2];
            byte b2 = bArr[length2];
            int i7 = length2 + 1;
            bArr3[i4 + 1] = bArr2[((b2 & 3) << 4) | ((bArr[i7] & UByte.MAX_VALUE) >> 4)];
            bArr3[i4 + 2] = bArr2[(bArr[i7] & 15) << 2];
            if (z2) {
                bArr3[i4 + 3] = Base64.padSymbol;
            }
        }
        return bArr3;
    }
}
