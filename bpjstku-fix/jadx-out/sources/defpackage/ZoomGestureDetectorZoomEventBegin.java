package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"LZoomGestureDetectorZoomEventBegin;", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 3, 0})
public final /* data */ class ZoomGestureDetectorZoomEventBegin {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Map<String, Object> TuitionPaymentFragmentbindingInflater1;

    private ZoomGestureDetectorZoomEventBegin(Map<String, Object> map) {
        this.TuitionPaymentFragmentbindingInflater1 = map;
    }

    public /* synthetic */ ZoomGestureDetectorZoomEventBegin(ConcurrentHashMap concurrentHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConcurrentHashMap() : concurrentHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ZoomGestureDetectorZoomEventBegin() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this != p0) {
            return (p0 instanceof ZoomGestureDetectorZoomEventBegin) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, ((ZoomGestureDetectorZoomEventBegin) p0).TuitionPaymentFragmentbindingInflater1);
        }
        return true;
    }

    public final int hashCode() {
        Map<String, Object> map = this.TuitionPaymentFragmentbindingInflater1;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZoomGestureDetectorZoomEventBegin(TuitionPaymentFragmentbindingInflater1=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(")");
        return sb.toString();
    }
}
