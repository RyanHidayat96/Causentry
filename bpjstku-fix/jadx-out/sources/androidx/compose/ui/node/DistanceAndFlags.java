package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b\u0088\u0001\u0012\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/node/DistanceAndFlags;", "", "", "p0", "constructor-impl", "(J)J", "", "compareTo-9YPOF3E", "(JJ)I", "compareTo", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "packedValue", "J", "getPackedValue", "()J", "", "getDistance-impl", "(J)F", "distance", "isInLayer-impl", "(J)Z", "isInLayer", "isInExpandedBounds-impl", "isInExpandedBounds"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class DistanceAndFlags {
    private final long packedValue;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m5799constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5801equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: isInExpandedBounds-impl, reason: not valid java name */
    public static final boolean m5804isInExpandedBoundsimpl(long j) {
        return (j & 2) != 0;
    }

    /* JADX INFO: renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m5805isInLayerimpl(long j) {
        return (j & 1) != 0;
    }

    private /* synthetic */ DistanceAndFlags(long j) {
        this.packedValue = j;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: compareTo-9YPOF3E, reason: not valid java name */
    public static final int m5798compareTo9YPOF3E(long j, long j2) {
        boolean zM5805isInLayerimpl = m5805isInLayerimpl(j);
        if (zM5805isInLayerimpl != m5805isInLayerimpl(j2)) {
            return zM5805isInLayerimpl ? -1 : 1;
        }
        int iSignum = (int) Math.signum(m5802getDistanceimpl(j) - m5802getDistanceimpl(j2));
        if (Math.min(m5802getDistanceimpl(j), m5802getDistanceimpl(j2)) < 0.0f || m5804isInExpandedBoundsimpl(j) == m5804isInExpandedBoundsimpl(j2)) {
            return iSignum;
        }
        return m5804isInExpandedBoundsimpl(j) ? -1 : 1;
    }

    /* JADX INFO: renamed from: getDistance-impl, reason: not valid java name */
    public static final float m5802getDistanceimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DistanceAndFlags m5797boximpl(long j) {
        return new DistanceAndFlags(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5800equalsimpl(long j, Object obj) {
        return (obj instanceof DistanceAndFlags) && j == ((DistanceAndFlags) obj).m5807unboximpl();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5803hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5806toStringimpl(long j) {
        StringBuilder sb = new StringBuilder("DistanceAndFlags(packedValue=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return m5800equalsimpl(this.packedValue, p0);
    }

    public final int hashCode() {
        return m5803hashCodeimpl(this.packedValue);
    }

    public final String toString() {
        return m5806toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5807unboximpl() {
        return this.packedValue;
    }
}
