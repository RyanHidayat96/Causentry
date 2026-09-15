package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class clearImageAnalysisAnalyzer extends CameraControllerExternalSyntheticLambda7<char[]> {
    int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public clearImageAnalysisAnalyzer(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr.length;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final int b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        char[] cArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (cArr.length < i) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i, cArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cArrCopyOf;
        }
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final /* synthetic */ char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        char[] cArrCopyOf = Arrays.copyOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "");
        return cArrCopyOf;
    }
}
