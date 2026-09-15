package defpackage;

import kotlin.UByte;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdaonInputSurface0androidxcameracoreprocessingSurfaceProcessorWithExecutor {
    public static int b(byte[] bArr, int i, int i2) {
        int i3;
        int iB;
        if (bArr == null) {
            return 0;
        }
        int i4 = i2 + i;
        while (true) {
            if (i + 3 < i4) {
                int i5 = i + 1;
                if ((bArr[i] & UByte.MAX_VALUE) == 255) {
                    int i6 = bArr[i5] & UByte.MAX_VALUE;
                    if (i6 != 255) {
                        i5 = i + 2;
                        if (i6 != 216 && i6 != 1) {
                            if (i6 != 217 && i6 != 218) {
                                int iB2 = b(bArr, i5, 2, false);
                                if (iB2 < 2 || (i5 = i5 + iB2) > i4) {
                                    return 0;
                                }
                                if (i6 == 225 && iB2 >= 8 && b(bArr, i + 4, 4, false) == 1165519206 && b(bArr, i + 8, 2, false) == 0) {
                                    i += 10;
                                    i3 = iB2 - 8;
                                }
                            }
                            if (i3 > 8 || !((iB = b(bArr, i, 4, false)) == 1229531648 || iB == 1296891946)) {
                                return 0;
                            }
                            boolean z = iB == 1229531648;
                            int iB3 = b(bArr, i + 4, 4, z) + 2;
                            if (iB3 >= 10 && iB3 <= i3) {
                                int i7 = i + iB3;
                                int i8 = i3 - iB3;
                                for (int iB4 = b(bArr, i7 - 2, 2, z); iB4 > 0 && i8 >= 12; iB4--) {
                                    if (b(bArr, i7, 2, z) == 274) {
                                        int iB5 = b(bArr, i7 + 8, 2, z);
                                        if (iB5 == 1) {
                                            return 0;
                                        }
                                        if (iB5 == 3) {
                                            return 180;
                                        }
                                        if (iB5 != 6) {
                                            return iB5 != 8 ? 0 : 270;
                                        }
                                        return 90;
                                    }
                                    i7 += 12;
                                    i8 -= 12;
                                }
                            }
                            return 0;
                        }
                    }
                    i = i5;
                }
                i = i5;
            }
            i3 = 0;
            if (i3 > 8) {
                return 0;
            }
            return 0;
        }
    }

    private static int b(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i4 = 0;
        while (i2 > 0) {
            i4 = (i4 << 8) | (bArr[i] & UByte.MAX_VALUE);
            i += i3;
            i2--;
        }
        return i4;
    }
}
