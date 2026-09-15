package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes7.dex */
public final class lambdaonSurfaceRequested2androidxcameraviewPreviewView1 implements updateDisplayRotationIfNeeded {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getMeteringPointFactory.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    @Override // defpackage.updateDisplayRotationIfNeeded
    public final void b(long j) {
        b(String.valueOf(j));
    }

    @Override // defpackage.updateDisplayRotationIfNeeded
    public final void b(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        if (length == 0) {
            return;
        }
        TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, length);
        str.getChars(0, str.length(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 += length;
    }

    @Override // defpackage.updateDisplayRotationIfNeeded
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        byte b;
        int length;
        Intrinsics.checkNotNullParameter(str, "");
        TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, str.length() + 2);
        char[] cArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i + 1;
        cArr[i] = Typography.quote;
        int length2 = str.length();
        str.getChars(0, length2, cArr, i2);
        int i3 = length2 + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            if (c < getPreviewBitmap.b().length && getPreviewBitmap.b()[c] != 0) {
                int length3 = str.length();
                for (int i5 = i4 - i2; i5 < length3; i5++) {
                    int iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(i4, 2);
                    char cCharAt = str.charAt(i5);
                    if (cCharAt >= getPreviewBitmap.b().length || (b = getPreviewBitmap.b()[cCharAt]) == 0) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[iTuitionPaymentFragmentbindingInflater1] = cCharAt;
                        i4 = iTuitionPaymentFragmentbindingInflater1 + 1;
                    } else {
                        if (b == 1) {
                            String str2 = getPreviewBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3()[cCharAt];
                            Intrinsics.checkNotNull(str2);
                            int iTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentbindingInflater1, str2.length());
                            str2.getChars(0, str2.length(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentbindingInflater2);
                            length = iTuitionPaymentFragmentbindingInflater2 + str2.length();
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = length;
                        } else {
                            char[] cArr2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            cArr2[iTuitionPaymentFragmentbindingInflater1] = '\\';
                            cArr2[iTuitionPaymentFragmentbindingInflater1 + 1] = (char) b;
                            length = iTuitionPaymentFragmentbindingInflater1 + 2;
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = length;
                        }
                        i4 = length;
                    }
                }
                int iTuitionPaymentFragmentbindingInflater3 = TuitionPaymentFragmentbindingInflater1(i4, 1);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[iTuitionPaymentFragmentbindingInflater3] = Typography.quote;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iTuitionPaymentFragmentbindingInflater3 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = Typography.quote;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 + 1;
    }

    public final String toString() {
        return new String(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, 0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    private final int TuitionPaymentFragmentbindingInflater1(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (cArr.length <= i3) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i3, i * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cArrCopyOf;
        }
        return i;
    }

    @Override // defpackage.updateDisplayRotationIfNeeded
    public final void b(char c) {
        TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, 1);
        char[] cArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        cArr[i] = c;
    }
}
