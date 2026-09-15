package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\f\u0010\nJ\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0014\u0010\u001a\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\n\u0088\u0001\u001a\u0092\u0001\u00020\u0007"}, d2 = {"Landroidx/collection/IntIntPair;", "", "", "p0", "p1", "constructor-impl", "(II)J", "", "(J)J", "component1-impl", "(J)I", "component1", "component2-impl", "component2", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "getFirst-impl", "first", "packedValue", "J", "getSecond-impl", "second"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class IntIntPair {
    public final long packedValue;

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m343component1impl(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m344component2impl(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m346constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m348equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getFirst-impl, reason: not valid java name */
    public static final int m349getFirstimpl(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: getSecond-impl, reason: not valid java name */
    public static final int m350getSecondimpl(long j) {
        return (int) (j & 4294967295L);
    }

    private /* synthetic */ IntIntPair(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m345constructorimpl(int i, int i2) {
        return m346constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m352toStringimpl(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append(m349getFirstimpl(j));
        sb.append(", ");
        sb.append(m350getSecondimpl(j));
        sb.append(')');
        return sb.toString();
    }

    public final String toString() {
        return m352toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m342boximpl(long j) {
        return new IntIntPair(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m347equalsimpl(long j, Object obj) {
        return (obj instanceof IntIntPair) && j == ((IntIntPair) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m351hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object obj) {
        return m347equalsimpl(this.packedValue, obj);
    }

    public final int hashCode() {
        return m351hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
