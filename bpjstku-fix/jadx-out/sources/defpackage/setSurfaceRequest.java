package defpackage;

import kotlin.jvm.internal.Intrinsics;
import okio.SegmentedByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class setSurfaceRequest {
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(SegmentedByteString segmentedByteString, int i) {
        Intrinsics.checkNotNullParameter(segmentedByteString, "");
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(segmentedByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3, i + 1, 0, segmentedByteString.TuitionPaymentFragmentbindingInflater1.length);
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault1 >= 0 ? iTuitionPaymentFragmentspecialinlinedviewModeldefault1 : ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
