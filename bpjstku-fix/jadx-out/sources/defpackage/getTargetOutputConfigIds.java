package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes6.dex */
final class getTargetOutputConfigIds {
    private static final float[][] TuitionPaymentFragmentbindingInflater1 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, resolveQuirkNames.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length, 8);

    static {
        int i;
        for (int i2 = 0; i2 < resolveQuirkNames.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length; i2++) {
            int i3 = resolveQuirkNames.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i2];
            int i4 = i3 & 1;
            int i5 = 0;
            while (i5 < 8) {
                float f = 0.0f;
                while (true) {
                    i = i3 & 1;
                    if (i == i4) {
                        f += 1.0f;
                        i3 >>= 1;
                    }
                }
                TuitionPaymentFragmentbindingInflater1[i2][7 - i5] = f / 17.0f;
                i5++;
                i4 = i;
            }
        }
    }

    static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        float f = i;
        int[] iArr2 = new int[8];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < 17; i5++) {
            int i6 = iArr[i3] + i4;
            if (i6 <= (f / 34.0f) + ((i5 * f) / 17.0f)) {
                i3++;
                i4 = i6;
            }
            iArr2[i3] = iArr2[i3] + 1;
        }
        long j = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            for (int i8 = 0; i8 < iArr2[i7]; i8++) {
                j = (j << 1) | ((long) (i7 % 2 != 0 ? 0 : 1));
            }
        }
        int i9 = (int) j;
        int i10 = -1;
        if (resolveQuirkNames.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i9) == -1) {
            i9 = -1;
        }
        if (i9 != -1) {
            return i9;
        }
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float[] fArr = new float[8];
        for (int i13 = 0; i13 < 8; i13++) {
            fArr[i13] = iArr[i13] / i11;
        }
        float f2 = Float.MAX_VALUE;
        int i14 = 0;
        while (true) {
            float[][] fArr2 = TuitionPaymentFragmentbindingInflater1;
            if (i14 >= fArr2.length) {
                return i10;
            }
            float[] fArr3 = fArr2[i14];
            float f3 = 0.0f;
            for (int i15 = 0; i15 < 8; i15++) {
                float f4 = fArr3[i15] - fArr[i15];
                f3 += f4 * f4;
                if (f3 >= f2) {
                    break;
                }
            }
            if (f3 < f2) {
                i10 = resolveQuirkNames.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i14];
                f2 = f3;
            }
            i14++;
        }
    }
}
