package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class SessionConfigOutputConfig {
    public static void TuitionPaymentFragmentbindingInflater1(int i, int i2, boolean z, int i3, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z) {
            b(iArr);
        }
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i ^ iArr[i4];
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 ^ TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5, iArr2);
            i4++;
            i2 = i5;
            i = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int i6 = i ^ iArr[iArr.length - 2];
        int i7 = i2 ^ iArr[iArr.length - 1];
        if (!z) {
            b(iArr);
        }
        iArr3[0] = i7;
        iArr3[1] = i6;
    }

    private static void b(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int[][] iArr) {
        return ((iArr[0][(i >>> 24) & 255] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }
}
