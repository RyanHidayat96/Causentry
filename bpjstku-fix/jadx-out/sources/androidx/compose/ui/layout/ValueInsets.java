package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0017\u001a\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0012\u0010\u0019\u001a\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0012\u0010\u001b\u001a\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u0012\u0010\u001d\u001a\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010\u0088\u0001\u0012\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/layout/ValueInsets;", "", "", "p0", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(J)I", "hashCode", "packedValue", "J", "getPackedValue", "()J", "getLeft-impl", "left", "getTop-impl", "top", "getRight-impl", "right", "getBottom-impl", "bottom"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class ValueInsets {
    private final long packedValue;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m5745constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5747equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getBottom-impl, reason: not valid java name */
    public static final int m5748getBottomimpl(long j) {
        return (int) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    /* JADX INFO: renamed from: getLeft-impl, reason: not valid java name */
    public static final int m5749getLeftimpl(long j) {
        return (int) ((j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    /* JADX INFO: renamed from: getRight-impl, reason: not valid java name */
    public static final int m5750getRightimpl(long j) {
        return (int) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    /* JADX INFO: renamed from: getTop-impl, reason: not valid java name */
    public static final int m5751getTopimpl(long j) {
        return (int) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    private /* synthetic */ ValueInsets(long j) {
        this.packedValue = j;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public final String toString() {
        return m5753toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5753toStringimpl(long j) {
        StringBuilder sb = new StringBuilder("ValueInsets(");
        sb.append((int) ((j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        sb.append(", ");
        sb.append((int) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        sb.append(", ");
        sb.append((int) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        sb.append(", ");
        sb.append((int) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ValueInsets m5744boximpl(long j) {
        return new ValueInsets(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5746equalsimpl(long j, Object obj) {
        return (obj instanceof ValueInsets) && j == ((ValueInsets) obj).m5754unboximpl();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5752hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object obj) {
        return m5746equalsimpl(this.packedValue, obj);
    }

    public final int hashCode() {
        return m5752hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5754unboximpl() {
        return this.packedValue;
    }
}
