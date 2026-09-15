package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00028\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u000f\u001a\u00020\u00028\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"LZoomGestureDetectorgestureDetector1;", "", "", "p0", "p1", "<init>", "(ZZ)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 3, 0})
public final /* data */ class ZoomGestureDetectorgestureDetector1 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public ZoomGestureDetectorgestureDetector1(boolean z, boolean z2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z2;
    }

    public /* synthetic */ ZoomGestureDetectorgestureDetector1(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ZoomGestureDetectorgestureDetector1() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ZoomGestureDetectorgestureDetector1)) {
            return false;
        }
        ZoomGestureDetectorgestureDetector1 zoomGestureDetectorgestureDetector1 = (ZoomGestureDetectorgestureDetector1) p0;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == zoomGestureDetectorgestureDetector1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == zoomGestureDetectorgestureDetector1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final int hashCode() {
        boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        boolean z2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return (r0 * 31) + (z2 ? 1 : z2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZoomGestureDetectorgestureDetector1(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(")");
        return sb.toString();
    }
}
