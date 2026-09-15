package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class clearEffects extends CameraControllerExternalSyntheticLambda7<byte[]> {
    int TuitionPaymentFragmentbindingInflater1;
    byte[] b;

    public clearEffects(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.b = bArr;
        this.TuitionPaymentFragmentbindingInflater1 = bArr.length;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final int b() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        byte[] bArr = this.b;
        if (bArr.length < i) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, RangesKt.coerceAtLeast(i, bArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
            this.b = bArrCopyOf;
        }
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final /* synthetic */ byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        byte[] bArrCopyOf = Arrays.copyOf(this.b, this.TuitionPaymentFragmentbindingInflater1);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        return bArrCopyOf;
    }
}
