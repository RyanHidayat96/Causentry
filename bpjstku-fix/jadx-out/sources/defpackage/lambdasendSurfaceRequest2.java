package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdasendSurfaceRequest2 {
    final onAppEdgeInvalidated TuitionPaymentFragmentbindingInflater1;
    final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final boolean b;

    public lambdasendSurfaceRequest2(onAppEdgeInvalidated onappedgeinvalidated, Map<String, ? extends Object> map, boolean z) {
        Intrinsics.checkNotNullParameter(onappedgeinvalidated, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.TuitionPaymentFragmentbindingInflater1 = onappedgeinvalidated;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = map;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambdasendSurfaceRequest2)) {
            return false;
        }
        lambdasendSurfaceRequest2 lambdasendsurfacerequest2 = (lambdasendSurfaceRequest2) obj;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, lambdasendsurfacerequest2.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, lambdasendsurfacerequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.b == lambdasendsurfacerequest2.b;
    }

    public final int hashCode() {
        return (((this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + Boolean.hashCode(this.b);
    }

    public final String toString() {
        onAppEdgeInvalidated onappedgeinvalidated = this.TuitionPaymentFragmentbindingInflater1;
        Map<String, Object> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder("RumViewInfo(key=");
        sb.append(onappedgeinvalidated);
        sb.append(", attributes=");
        sb.append(map);
        sb.append(", isActive=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
