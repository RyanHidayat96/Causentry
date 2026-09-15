package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class abortCapture {
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public int b;

    public static char[] b(long j, char[] cArr, int i) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 4;
        while (i2 < cArr.length) {
            if ((((j >>> i2) & 1) != i || i3 >= 4) && i4 < length) {
                cArr2[i4] = cArr[i2];
                i4++;
            } else {
                cArr2[i3] = cArr[i2];
                i3++;
            }
            i2++;
        }
        return cArr2;
    }
}
