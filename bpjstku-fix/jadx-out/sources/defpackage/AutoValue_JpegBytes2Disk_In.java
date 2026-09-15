package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class AutoValue_JpegBytes2Disk_In {
    public final Orientation TuitionPaymentFragmentbindingInflater1;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final int b;

    public AutoValue_JpegBytes2Disk_In(int i, int i2, Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        this.b = i2;
        this.TuitionPaymentFragmentbindingInflater1 = orientation;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagerInfo{currentPage=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", previousPage=");
        sb.append(this.b);
        sb.append(", orientation=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append('}');
        return sb.toString();
    }
}
