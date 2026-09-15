package com.appsflyer.internal;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes6.dex */
public final class AFk1uSDK {
    private static byte[] component1 = new byte[256];
    static final byte[] getMonetizationNetwork = new byte[256];
    static final int[] getMediationNetwork = new int[256];
    static final int[] AFAdRevenueData = new int[256];
    static final int[] getCurrencyIso4217Code = new int[256];
    static final int[] getRevenue = new int[256];
    private static int[] areAllFieldsValid = new int[10];

    static {
        byte[] bArr;
        int i;
        byte b = 1;
        byte b2 = 1;
        do {
            b = (byte) ((b ^ (b << 1)) ^ ((b & ByteCompanionObject.MIN_VALUE) != 0 ? 27 : 0));
            byte b3 = (byte) (b2 ^ (b2 << 1));
            byte b4 = (byte) (b3 ^ (b3 << 2));
            byte b5 = (byte) (b4 ^ (b4 << 4));
            b2 = (byte) (b5 ^ ((b5 & ByteCompanionObject.MIN_VALUE) != 0 ? (byte) 9 : (byte) 0));
            bArr = component1;
            i = b & UByte.MAX_VALUE;
            int i2 = b2 & UByte.MAX_VALUE;
            bArr[i] = (byte) (((i2 << 4) | (i2 >> 4)) ^ ((((b2 ^ 99) ^ ((i2 << 1) | (i2 >> 7))) ^ ((i2 << 2) | (i2 >> 6))) ^ ((i2 << 3) | (i2 >> 5))));
        } while (i != 1);
        bArr[0] = 99;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = component1[i3] & UByte.MAX_VALUE;
            getMonetizationNetwork[i4] = (byte) i3;
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
            int i9 = (i5 ^ i8) | ((i6 ^ i8) << 8) | (((i7 ^ i6) ^ i5) << 24) | (i8 << 16);
            getMediationNetwork[i4] = i9;
            AFAdRevenueData[i4] = (i9 >>> 8) | (i9 << 24);
            getCurrencyIso4217Code[i4] = (i9 >>> 16) | (i9 << 16);
            getRevenue[i4] = (i9 >>> 24) | (i9 << 8);
        }
        areAllFieldsValid[0] = 16777216;
        int i10 = 1;
        for (int i11 = 1; i11 < 10; i11++) {
            i10 <<= 1;
            if (i10 >= 256) {
                i10 ^= 283;
            }
            areAllFieldsValid[i11] = i10 << 24;
        }
    }

    public static byte[][] getMediationNetwork(int i) {
        byte[][] bArr = new byte[4][];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 << 3);
            bArr[i2] = new byte[]{(byte) (i3 & 3), (byte) ((i3 >> 2) & 3), (byte) ((i3 >> 4) & 3), (byte) ((i3 >> 6) & 3)};
        }
        return bArr;
    }

    static int[] getCurrencyIso4217Code(byte[] bArr, int i) throws IllegalArgumentException {
        int i2;
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i3 = 4;
        int i4 = (i + 1) * 4;
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        while (i6 < 4) {
            iArr[i6] = (bArr[i5 + 3] & UByte.MAX_VALUE) | (bArr[i5] << 24) | ((bArr[i5 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i5 + 2] & UByte.MAX_VALUE) << 8);
            i6++;
            i5 += 4;
        }
        int i7 = 4;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i2 = 1;
            if (i7 >= i4) {
                break;
            }
            int i10 = iArr[i7 - 1];
            if (i8 == 0) {
                byte[] bArr2 = component1;
                i10 = areAllFieldsValid[i9] ^ ((bArr2[i10 >>> 24] & UByte.MAX_VALUE) | (((bArr2[(i10 >>> 16) & 255] << 24) | ((bArr2[(i10 >>> 8) & 255] & UByte.MAX_VALUE) << 16)) | ((bArr2[i10 & 255] & UByte.MAX_VALUE) << 8)));
                i9++;
                i8 = 4;
            }
            iArr[i7] = i10 ^ iArr[i7 - 4];
            i7++;
            i8--;
        }
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int[] iArr2 = new int[i4];
        int i11 = i * 4;
        iArr2[0] = iArr[i11];
        iArr2[1] = iArr[i11 + 1];
        iArr2[2] = iArr[i11 + 2];
        iArr2[3] = iArr[i11 + 3];
        int i12 = i11 - 4;
        while (i2 < i) {
            int i13 = iArr[i12];
            int[] iArr3 = getMediationNetwork;
            byte[] bArr3 = component1;
            int i14 = iArr3[bArr3[i13 >>> 24] & UByte.MAX_VALUE];
            int[] iArr4 = AFAdRevenueData;
            int i15 = iArr4[bArr3[(i13 >>> 16) & 255] & UByte.MAX_VALUE];
            int[] iArr5 = getCurrencyIso4217Code;
            int i16 = iArr5[bArr3[(i13 >>> 8) & 255] & UByte.MAX_VALUE];
            int[] iArr6 = getRevenue;
            iArr2[i3] = iArr6[bArr3[i13 & 255] & UByte.MAX_VALUE] ^ ((i14 ^ i15) ^ i16);
            int i17 = iArr[i12 + 1];
            iArr2[i3 + 1] = iArr6[bArr3[i17 & 255] & UByte.MAX_VALUE] ^ ((iArr3[bArr3[i17 >>> 24] & UByte.MAX_VALUE] ^ iArr4[bArr3[(i17 >>> 16) & 255] & UByte.MAX_VALUE]) ^ iArr5[bArr3[(i17 >>> 8) & 255] & UByte.MAX_VALUE]);
            int i18 = iArr[i12 + 2];
            iArr2[i3 + 2] = iArr6[bArr3[i18 & 255] & UByte.MAX_VALUE] ^ ((iArr3[bArr3[i18 >>> 24] & UByte.MAX_VALUE] ^ iArr4[bArr3[(i18 >>> 16) & 255] & UByte.MAX_VALUE]) ^ iArr5[bArr3[(i18 >>> 8) & 255] & UByte.MAX_VALUE]);
            int i19 = iArr[i12 + 3];
            iArr2[i3 + 3] = iArr6[bArr3[i19 & 255] & UByte.MAX_VALUE] ^ ((iArr3[bArr3[i19 >>> 24] & UByte.MAX_VALUE] ^ iArr4[bArr3[(i19 >>> 16) & 255] & UByte.MAX_VALUE]) ^ iArr5[bArr3[(i19 >>> 8) & 255] & UByte.MAX_VALUE]);
            i12 -= 4;
            i2++;
            i3 += 4;
        }
        iArr2[i3] = iArr[i12];
        iArr2[i3 + 1] = iArr[i12 + 1];
        iArr2[i3 + 2] = iArr[i12 + 2];
        iArr2[i3 + 3] = iArr[i12 + 3];
        return iArr2;
    }
}
