package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class getSingleCameraCaptureCallbacks {
    final int TuitionPaymentFragmentbindingInflater1;
    final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final float asBinder;
    private final canMatchEncoding asInterface;
    final int b;
    final int d;
    final List<SessionConfigBaseBuilder> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f982a = new int[3];

    getSingleCameraCaptureCallbacks(getBufferFormat getbufferformat, int i, int i2, int i3, int i4, float f, canMatchEncoding canmatchencoding) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getbufferformat;
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.b = i2;
        this.d = i3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
        this.asBinder = f;
        this.asInterface = canmatchencoding;
    }

    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(int[] iArr) {
        float f = this.asBinder;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    final SessionConfigBaseBuilder b(int[] iArr, int i, int i2) {
        int i3;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        float f = (i2 - i6) - (i5 / 2.0f);
        int i7 = (int) f;
        int i8 = i5 * 2;
        int i9 = i4 + i5 + i6;
        getBufferFormat getbufferformat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i10 = getbufferformat.b;
        int[] iArr2 = this.f982a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i11 = i;
        while (i11 >= 0 && getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i7, i11)) {
            int i12 = iArr2[1];
            if (i12 > i8) {
                break;
            }
            iArr2[1] = i12 + 1;
            i11--;
        }
        float f2 = Float.NaN;
        if (i11 >= 0 && iArr2[1] <= i8) {
            while (i11 >= 0 && !getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i7, i11)) {
                int i13 = iArr2[0];
                if (i13 > i8) {
                    break;
                }
                iArr2[0] = i13 + 1;
                i11--;
            }
            if (iArr2[0] <= i8) {
                int i14 = i;
                while (true) {
                    i14++;
                    if (i14 >= i10 || !getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i7, i14) || (i3 = iArr2[1]) > i8) {
                        break;
                    }
                    iArr2[1] = i3 + 1;
                }
                if (i14 != i10 && iArr2[1] <= i8) {
                    while (i14 < i10 && !getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i7, i14)) {
                        int i15 = iArr2[2];
                        if (i15 > i8) {
                            break;
                        }
                        iArr2[2] = i15 + 1;
                        i14++;
                    }
                    int i16 = iArr2[2];
                    if (i16 <= i8 && Math.abs(((iArr2[0] + iArr2[1]) + i16) - i9) * 5 < i9 * 2 && TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArr2)) {
                        f2 = (i14 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (Float.isNaN(f2)) {
            return null;
        }
        float f3 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (SessionConfigBaseBuilder sessionConfigBaseBuilder : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            if (Math.abs(f2 - sessionConfigBaseBuilder.b) <= f3 && Math.abs(f - sessionConfigBaseBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2) <= f3) {
                float fAbs = Math.abs(f3 - sessionConfigBaseBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                if (fAbs <= 1.0f || fAbs <= sessionConfigBaseBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    return new SessionConfigBaseBuilder((sessionConfigBaseBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + f) / 2.0f, (sessionConfigBaseBuilder.b + f2) / 2.0f, (sessionConfigBaseBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + f3) / 2.0f);
                }
            }
        }
        SessionConfigBaseBuilder sessionConfigBaseBuilder2 = new SessionConfigBaseBuilder(f, f2, f3);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(sessionConfigBaseBuilder2);
        canMatchEncoding canmatchencoding = this.asInterface;
        if (canmatchencoding == null) {
            return null;
        }
        canmatchencoding.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sessionConfigBaseBuilder2);
        return null;
    }
}
