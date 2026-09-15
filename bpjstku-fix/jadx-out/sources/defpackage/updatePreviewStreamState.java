package defpackage;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UShortArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068\u0011@RX\u0091\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000e"}, d2 = {"LupdatePreviewStreamState;", "LCameraControllerExternalSyntheticLambda7;", "Lkotlin/UShortArray;", "p0", "<init>", "([SLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(I)V", "b", "[S", "TuitionPaymentFragmentbindingInflater1", "I", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class updatePreviewStreamState extends CameraControllerExternalSyntheticLambda7<UShortArray> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    short[] TuitionPaymentFragmentbindingInflater1;

    private updatePreviewStreamState(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        this.TuitionPaymentFragmentbindingInflater1 = sArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = UShortArray.m8369getSizeimpl(sArr);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0) {
        if (UShortArray.m8369getSizeimpl(this.TuitionPaymentFragmentbindingInflater1) < p0) {
            short[] sArr = this.TuitionPaymentFragmentbindingInflater1;
            short[] sArrCopyOf = Arrays.copyOf(sArr, RangesKt.coerceAtLeast(p0, UShortArray.m8369getSizeimpl(sArr) * 2));
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "");
            this.TuitionPaymentFragmentbindingInflater1 = UShortArray.m8363constructorimpl(sArrCopyOf);
        }
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final /* synthetic */ UShortArray TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        short[] sArrCopyOf = Arrays.copyOf(this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "");
        return UShortArray.m8361boximpl(UShortArray.m8363constructorimpl(sArrCopyOf));
    }

    public /* synthetic */ updatePreviewStreamState(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }
}
