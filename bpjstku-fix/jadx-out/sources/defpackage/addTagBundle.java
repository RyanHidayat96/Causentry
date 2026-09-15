package defpackage;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class addTagBundle extends insertOption {
    private final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new int[4];
    private final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new int[8];
    private final float[] asBinder = new float[4];
    private final float[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new float[4];
    private final int[] b = new int[4];
    private final int[] TuitionPaymentFragmentbindingInflater1 = new int[4];

    protected final int[] TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    protected final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    protected final float[] asInterface() {
        return this.asBinder;
    }

    protected final float[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    protected final int[] d() {
        return this.b;
    }

    protected final int[] b() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    protected static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i = 0; i < iArr2.length; i++) {
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }

    protected static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 > f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    protected static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 < f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    protected static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = i / ((iArr[2] + i) + iArr[3]);
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }
}
