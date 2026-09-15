package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getTapToFocusState extends CameraControllerExternalSyntheticLambda7<float[]> {
    int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    float[] b;

    public getTapToFocusState(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        this.b = fArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = fArr.length;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final int b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        float[] fArr = this.b;
        if (fArr.length < i) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, RangesKt.coerceAtLeast(i, fArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "");
            this.b = fArrCopyOf;
        }
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final /* synthetic */ float[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        float[] fArrCopyOf = Arrays.copyOf(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "");
        return fArrCopyOf;
    }
}
