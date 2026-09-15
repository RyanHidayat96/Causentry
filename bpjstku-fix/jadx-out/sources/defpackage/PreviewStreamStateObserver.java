package defpackage;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ULongArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\nR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068\u0011@RX\u0091\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"LPreviewStreamStateObserver;", "LCameraControllerExternalSyntheticLambda7;", "Lkotlin/ULongArray;", "p0", "<init>", "([JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(I)V", "[J", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I", "b", "()I", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewStreamStateObserver extends CameraControllerExternalSyntheticLambda7<ULongArray> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    int TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    long[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    private PreviewStreamStateObserver(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = jArr;
        this.TuitionPaymentFragmentbindingInflater1 = ULongArray.m8264getSizeimpl(jArr);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0) {
        if (ULongArray.m8264getSizeimpl(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) < p0) {
            long[] jArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            long[] jArrCopyOf = Arrays.copyOf(jArr, RangesKt.coerceAtLeast(p0, ULongArray.m8264getSizeimpl(jArr) * 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ULongArray.m8258constructorimpl(jArrCopyOf);
        }
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final /* synthetic */ ULongArray TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        long[] jArrCopyOf = Arrays.copyOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
        return ULongArray.m8256boximpl(ULongArray.m8258constructorimpl(jArrCopyOf));
    }

    public /* synthetic */ PreviewStreamStateObserver(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }
}
