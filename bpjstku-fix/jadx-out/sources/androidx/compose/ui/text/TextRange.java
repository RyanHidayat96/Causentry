package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087@\u0018\u0000 )2\u00020\u0001:\u0001)B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010!\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b \u0010\u001aR\u0011\u0010$\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0011\u0010(\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b'\u0010\u001a\u0088\u0001\u0017\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/TextRange;", "", "", "p0", "constructor-impl", "(J)J", "", "intersects-5zc-tL8", "(JJ)Z", "intersects", "contains-5zc-tL8", "contains", "", "contains-impl", "(JI)Z", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "packedValue", "J", "getStart-impl", "(J)I", "start", "getEnd-impl", "end", "getMin-impl", "min", "getMax-impl", "max", "getCollapsed-impl", "(J)Z", "collapsed", "getReversed-impl", "reversed", "getLength-impl", "length", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class TextRange {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m6386constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6390equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getEnd-impl, reason: not valid java name */
    public static final int m6392getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: getStart-impl, reason: not valid java name */
    public static final int m6397getStartimpl(long j) {
        return (int) (j >> 32);
    }

    private /* synthetic */ TextRange(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: getMin-impl, reason: not valid java name */
    public static final int m6395getMinimpl(long j) {
        return Math.min(m6397getStartimpl(j), m6392getEndimpl(j));
    }

    /* JADX INFO: renamed from: getMax-impl, reason: not valid java name */
    public static final int m6394getMaximpl(long j) {
        return Math.max(m6397getStartimpl(j), m6392getEndimpl(j));
    }

    /* JADX INFO: renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m6391getCollapsedimpl(long j) {
        return m6397getStartimpl(j) == m6392getEndimpl(j);
    }

    /* JADX INFO: renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m6396getReversedimpl(long j) {
        return m6397getStartimpl(j) > m6392getEndimpl(j);
    }

    /* JADX INFO: renamed from: getLength-impl, reason: not valid java name */
    public static final int m6393getLengthimpl(long j) {
        return m6394getMaximpl(j) - m6395getMinimpl(j);
    }

    /* JADX INFO: renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m6399intersects5zctL8(long j, long j2) {
        return (m6395getMinimpl(j) < m6394getMaximpl(j2)) & (m6395getMinimpl(j2) < m6394getMaximpl(j));
    }

    /* JADX INFO: renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m6387contains5zctL8(long j, long j2) {
        return (m6395getMinimpl(j) <= m6395getMinimpl(j2)) & (m6394getMaximpl(j2) <= m6394getMaximpl(j));
    }

    /* JADX INFO: renamed from: contains-impl, reason: not valid java name */
    public static final boolean m6388containsimpl(long j, int i) {
        return i < m6394getMaximpl(j) && m6395getMinimpl(j) <= i;
    }

    public final String toString() {
        return m6400toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6400toStringimpl(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append(m6397getStartimpl(j));
        sb.append(", ");
        sb.append(m6392getEndimpl(j));
        sb.append(')');
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/TextRange$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/TextRange;", "Zero", "J", "getZero-d9O1mEE", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m6402getZerod9O1mEE() {
            return TextRange.Zero;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m6385boximpl(long j) {
        return new TextRange(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6389equalsimpl(long j, Object obj) {
        return (obj instanceof TextRange) && j == ((TextRange) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6398hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return m6389equalsimpl(this.packedValue, p0);
    }

    public final int hashCode() {
        return m6398hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
