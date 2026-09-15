package defpackage;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class lambdaonSurfaceRequested1androidxcameraviewPreviewView1 {
    int TuitionPaymentFragmentbindingInflater1;
    Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Object[8];
    int[] b;

    public lambdaonSurfaceRequested1androidxcameraviewPreviewView1() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.b = iArr;
        this.TuitionPaymentFragmentbindingInflater1 = -1;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LlambdaonSurfaceRequested1androidxcameraviewPreviewView1$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 INSTANCE = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.TuitionPaymentFragmentbindingInflater1;
        for (int i2 = 0; i2 < i + 1; i2++) {
            Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i2];
            if (obj instanceof createImageAnalysis) {
                createImageAnalysis createimageanalysis = (createImageAnalysis) obj;
                if (Intrinsics.areEqual(createimageanalysis.TuitionPaymentFragmentbindingInflater1(), isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE)) {
                    if (this.b[i2] != -1) {
                        sb.append("[");
                        sb.append(this.b[i2]);
                        sb.append("]");
                    }
                } else {
                    int i3 = this.b[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(createimageanalysis.TuitionPaymentFragmentbindingInflater1(i3));
                    }
                }
            } else if (obj != TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = this.TuitionPaymentFragmentbindingInflater1 * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.b, i);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
        this.b = iArrCopyOf;
    }

    public final String toString() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }
}
