package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getImageCaptureMode extends CameraControllerExternalSyntheticLambda7<double[]> {
    int TuitionPaymentFragmentbindingInflater1;
    double[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getImageCaptureMode(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = dArr;
        this.TuitionPaymentFragmentbindingInflater1 = dArr.length;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final int b() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        double[] dArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (dArr.length < i) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, RangesKt.coerceAtLeast(i, dArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = dArrCopyOf;
        }
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final /* synthetic */ double[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        double[] dArrCopyOf = Arrays.copyOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentbindingInflater1);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "");
        return dArrCopyOf;
    }
}
