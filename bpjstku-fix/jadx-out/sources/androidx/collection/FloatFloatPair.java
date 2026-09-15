package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\f\u0010\nJ\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0012\u0010\u001b\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001f\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\n\u0088\u0001\u001c\u0092\u0001\u00020\u0007"}, d2 = {"Landroidx/collection/FloatFloatPair;", "", "", "p0", "p1", "constructor-impl", "(FF)J", "", "(J)J", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(J)I", "hashCode", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "getFirst-impl", "first", "packedValue", "J", "getSecond-impl", "second"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class FloatFloatPair {
    public final long packedValue;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m334constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m336equalsimpl0(long j, long j2) {
        return j == j2;
    }

    private /* synthetic */ FloatFloatPair(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m340toStringimpl(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append(Float.intBitsToFloat((int) (j >> 32)));
        sb.append(", ");
        sb.append(Float.intBitsToFloat((int) (j & 4294967295L)));
        sb.append(')');
        return sb.toString();
    }

    public final String toString() {
        return m340toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m333constructorimpl(float f, float f2) {
        return m334constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    /* JADX INFO: renamed from: getFirst-impl, reason: not valid java name */
    public static final float m337getFirstimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: getSecond-impl, reason: not valid java name */
    public static final float m338getSecondimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m331component1impl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m332component2impl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m330boximpl(long j) {
        return new FloatFloatPair(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m335equalsimpl(long j, Object obj) {
        return (obj instanceof FloatFloatPair) && j == ((FloatFloatPair) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m339hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object obj) {
        return m335equalsimpl(this.packedValue, obj);
    }

    public final int hashCode() {
        return m339hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
