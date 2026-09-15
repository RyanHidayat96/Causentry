package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class unbindImageAnalysisAndRecreate extends CameraControllerExternalSyntheticLambda7<boolean[]> {
    int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    boolean[] b;

    public unbindImageAnalysisAndRecreate(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "");
        this.b = zArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = zArr.length;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final int b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        boolean[] zArr = this.b;
        if (zArr.length < i) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, RangesKt.coerceAtLeast(i, zArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "");
            this.b = zArrCopyOf;
        }
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final /* synthetic */ boolean[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "");
        return zArrCopyOf;
    }
}
