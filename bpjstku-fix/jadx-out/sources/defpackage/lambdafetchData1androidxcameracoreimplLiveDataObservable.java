package defpackage;

import com.google.zxing.ChecksumException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import kotlin.UByte;

/* JADX INFO: loaded from: classes6.dex */
public final class lambdafetchData1androidxcameracoreimplLiveDataObservable {
    private final getDefaultResolution b = new getDefaultResolution(ImageInputConfigBuilder.d);

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, int i, int i2, int i3, int i4) throws ChecksumException {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[i5 / i6];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & UByte.MAX_VALUE;
            }
        }
        try {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }
}
