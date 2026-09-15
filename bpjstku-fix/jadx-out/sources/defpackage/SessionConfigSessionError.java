package defpackage;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes6.dex */
public final class SessionConfigSessionError {
    private static byte[] d = new byte[256];
    static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new byte[256];
    static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new int[256];
    static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new int[256];
    static final int[] TuitionPaymentFragmentbindingInflater1 = new int[256];
    static final int[] b = new int[256];
    private static int[] asBinder = new int[10];

    static {
        byte[] bArr;
        int i;
        byte b2 = 1;
        byte b3 = 1;
        do {
            b2 = (byte) (((b2 & ByteCompanionObject.MIN_VALUE) != 0 ? 27 : 0) ^ ((b2 << 1) ^ b2));
            byte b4 = (byte) (b3 ^ (b3 << 1));
            byte b5 = (byte) (b4 ^ (b4 << 2));
            byte b6 = (byte) (b5 ^ (b5 << 4));
            b3 = (byte) (b6 ^ ((b6 & ByteCompanionObject.MIN_VALUE) != 0 ? (byte) 9 : (byte) 0));
            bArr = d;
            i = b2 & UByte.MAX_VALUE;
            int i2 = b3 & UByte.MAX_VALUE;
            bArr[i] = (byte) (((((b3 ^ 99) ^ ((i2 << 1) | (i2 >> 7))) ^ ((i2 << 2) | (i2 >> 6))) ^ ((i2 << 3) | (i2 >> 5))) ^ ((i2 >> 4) | (i2 << 4)));
        } while (i != 1);
        bArr[0] = 99;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = d[i3] & UByte.MAX_VALUE;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3[i4] = (byte) i3;
            int i5 = i3 << 1;
            if (i5 >= 256) {
                i5 ^= 283;
            }
            int i6 = i5 << 1;
            if (i6 >= 256) {
                i6 ^= 283;
            }
            int i7 = i6 << 1;
            if (i7 >= 256) {
                i7 ^= 283;
            }
            int i8 = i7 ^ i3;
            int i9 = ((i5 ^ (i6 ^ i7)) << 24) | (i8 << 16) | ((i8 ^ i6) << 8) | (i8 ^ i5);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2[i4] = i9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1[i4] = (i9 >>> 8) | (i9 << 24);
            TuitionPaymentFragmentbindingInflater1[i4] = (i9 >>> 16) | (i9 << 16);
            b[i4] = (i9 << 8) | (i9 >>> 24);
        }
        asBinder[0] = 16777216;
        int i10 = 1;
        for (int i11 = 1; i11 < 10; i11++) {
            i10 <<= 1;
            if (i10 >= 256) {
                i10 ^= 283;
            }
            asBinder[i11] = i10 << 24;
        }
    }

    public static byte[][] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        byte[][] bArr = new byte[4][];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 * 8);
            bArr[i2] = new byte[]{(byte) (i3 & 3), (byte) ((i3 >> 2) & 3), (byte) ((i3 >> 4) & 3), (byte) ((i3 >> 6) & 3)};
        }
        return bArr;
    }

    static int[] b(byte[] bArr, int i) throws IllegalArgumentException {
        int i2 = i;
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i3 = 4;
        int i4 = (i2 + 1) * 4;
        int[] iArr = new int[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            int i7 = i5 + 3;
            int i8 = ((bArr[i5 + 1] & UByte.MAX_VALUE) << 16) | (bArr[i5] << 24) | ((bArr[i5 + 2] & UByte.MAX_VALUE) << 8);
            i5 += 4;
            iArr[i6] = i8 | (bArr[i7] & UByte.MAX_VALUE);
        }
        int i9 = 4;
        int i10 = 0;
        int i11 = 0;
        while (i9 < i4) {
            int i12 = iArr[i9 - 1];
            if (i10 == 0) {
                byte[] bArr2 = d;
                i12 = ((bArr2[i12 >>> 24] & UByte.MAX_VALUE) | (((bArr2[(i12 >>> 16) & 255] << 24) | ((bArr2[(i12 >>> 8) & 255] & UByte.MAX_VALUE) << 16)) | ((bArr2[i12 & 255] & UByte.MAX_VALUE) << 8))) ^ asBinder[i11];
                i10 = 4;
                i11++;
            }
            iArr[i9] = i12 ^ iArr[i9 - 4];
            i9++;
            i10--;
        }
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int[] iArr2 = new int[i4];
        int i13 = i2 * 4;
        iArr2[0] = iArr[i13];
        int i14 = 1;
        iArr2[1] = iArr[i13 + 1];
        iArr2[2] = iArr[i13 + 2];
        iArr2[3] = iArr[i13 + 3];
        int i15 = i13 - 4;
        while (i14 < i2) {
            int i16 = iArr[i15];
            int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            byte[] bArr3 = d;
            int i17 = iArr3[bArr3[i16 >>> 24] & UByte.MAX_VALUE];
            int[] iArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i18 = i17 ^ iArr4[bArr3[(i16 >>> 16) & 255] & UByte.MAX_VALUE];
            int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
            int i19 = i18 ^ iArr5[bArr3[(i16 >>> 8) & 255] & UByte.MAX_VALUE];
            int[] iArr6 = b;
            iArr2[i3] = iArr6[bArr3[i16 & 255] & UByte.MAX_VALUE] ^ i19;
            int i20 = iArr[i15 + 1];
            iArr2[i3 + 1] = ((iArr4[bArr3[(i20 >>> 16) & 255] & UByte.MAX_VALUE] ^ iArr3[bArr3[i20 >>> 24] & UByte.MAX_VALUE]) ^ iArr5[bArr3[(i20 >>> 8) & 255] & UByte.MAX_VALUE]) ^ iArr6[bArr3[i20 & 255] & UByte.MAX_VALUE];
            int i21 = iArr[i15 + 2];
            int i22 = i3 + 3;
            iArr2[i3 + 2] = iArr6[bArr3[i21 & 255] & UByte.MAX_VALUE] ^ ((iArr3[bArr3[i21 >>> 24] & UByte.MAX_VALUE] ^ iArr4[bArr3[(i21 >>> 16) & 255] & UByte.MAX_VALUE]) ^ iArr5[bArr3[(i21 >>> 8) & 255] & UByte.MAX_VALUE]);
            int i23 = iArr[i15 + 3];
            i3 += 4;
            iArr2[i22] = iArr6[bArr3[i23 & 255] & UByte.MAX_VALUE] ^ ((iArr3[bArr3[i23 >>> 24] & UByte.MAX_VALUE] ^ iArr4[bArr3[(i23 >>> 16) & 255] & UByte.MAX_VALUE]) ^ iArr5[bArr3[(i23 >>> 8) & 255] & UByte.MAX_VALUE]);
            i15 -= 4;
            i14++;
            i2 = i;
        }
        iArr2[i3] = iArr[i15];
        iArr2[i3 + 1] = iArr[i15 + 1];
        iArr2[i3 + 2] = iArr[i15 + 2];
        iArr2[i3 + 3] = iArr[i15 + 3];
        return iArr2;
    }
}
