package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ExperimentalPreviewViewScreenFlash extends CameraControllerExternalSyntheticLambda7<short[]> {
    int TuitionPaymentFragmentbindingInflater1;
    short[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public ExperimentalPreviewViewScreenFlash(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sArr;
        this.TuitionPaymentFragmentbindingInflater1 = sArr.length;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final int b() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        short[] sArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (sArr.length < i) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, RangesKt.coerceAtLeast(i, sArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sArrCopyOf;
        }
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final /* synthetic */ short[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        short[] sArrCopyOf = Arrays.copyOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "");
        return sArrCopyOf;
    }
}
