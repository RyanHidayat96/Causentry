package defpackage;

/* JADX INFO: loaded from: classes5.dex */
final class SessionConfigErrorListener {
    static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, bArr.length);
        for (int iMax = Math.max(i, 0); iMax < iMin; iMax++) {
            if (bArr[iMax] == 1) {
                return false;
            }
        }
        return true;
    }

    static boolean b(byte[][] bArr, int i, int i2, int i3) {
        int iMin = Math.min(i3, bArr.length);
        for (int iMax = Math.max(i2, 0); iMax < iMin; iMax++) {
            if (bArr[iMax][i] == 1) {
                return false;
            }
        }
        return true;
    }

    static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(addOutputConfig addoutputconfig, boolean z) {
        int i;
        int i2;
        if (z) {
            i = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        } else {
            i = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        if (z) {
            i2 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            i2 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        byte[][] bArr = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                byte b2 = z ? bArr[i4][i6] : bArr[i6][i4];
                if (b2 == b) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += i5 - 2;
                    }
                    i5 = 1;
                    b = b2;
                }
            }
            if (i5 >= 5) {
                i3 += i5 - 2;
            }
        }
        return i3;
    }
}
