package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class setImageAnalysisImageQueueDepth extends CameraControllerExternalSyntheticLambda7<long[]> {
    long[] TuitionPaymentFragmentbindingInflater1;
    int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public setImageAnalysisImageQueueDepth(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        this.TuitionPaymentFragmentbindingInflater1 = jArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = jArr.length;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final int b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        long[] jArr = this.TuitionPaymentFragmentbindingInflater1;
        if (jArr.length < i) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, RangesKt.coerceAtLeast(i, jArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
            this.TuitionPaymentFragmentbindingInflater1 = jArrCopyOf;
        }
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final /* synthetic */ long[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        long[] jArrCopyOf = Arrays.copyOf(this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
        return jArrCopyOf;
    }
}
