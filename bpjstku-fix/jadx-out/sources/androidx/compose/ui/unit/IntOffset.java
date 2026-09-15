package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087@\u0018\u0000 42\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\n\u0010\bJ!\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u0018\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0017H\u0087\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0017H\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010#\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010)\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00100\u001a\u00020\u00068GX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\bR\u001a\u00103\u001a\u00020\u00068GX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\b\u0088\u0001)\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "", "", "p0", "constructor-impl", "(J)J", "", "component1-impl", "(J)I", "component1", "component2-impl", "component2", "p1", "copy-iSbpLlY", "(JII)J", "copy", "minus-qkQi6aY", "(JJ)J", "minus", "plus-qkQi6aY", "plus", "unaryMinus-nOcc-ac", "unaryMinus", "", "times-Bjo55l4", "(JF)J", "times", "div-Bjo55l4", "div", "rem-Bjo55l4", "(JI)J", "rem", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "packedValue", "J", "getPackedValue", "()J", "getX-impl", "getX$annotations", "()V", "x", "getY-impl", "getY$annotations", "y", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class IntOffset {
    private final long packedValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m7057constructorimpl(0);
    private static final long Max = m7057constructorimpl(9223372034707292159L);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m7057constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7062equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getX$annotations() {
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final int m7063getXimpl(long j) {
        return (int) (j >> 32);
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final int m7064getYimpl(long j) {
        return (int) (j & 4294967295L);
    }

    private /* synthetic */ IntOffset(long j) {
        this.packedValue = j;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m7055component1impl(long j) {
        return m7063getXimpl(j);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m7056component2impl(long j) {
        return m7064getYimpl(j);
    }

    /* JADX INFO: renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m7059copyiSbpLlY$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (4294967295L & j);
        }
        return m7058copyiSbpLlY(j, i, i2);
    }

    /* JADX INFO: renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m7058copyiSbpLlY(long j, int i, int i2) {
        return m7057constructorimpl((((long) i) << 32) | (((long) i2) & 4294967295L));
    }

    /* JADX INFO: renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m7066minusqkQi6aY(long j, long j2) {
        return m7057constructorimpl((((long) (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32));
    }

    /* JADX INFO: renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m7067plusqkQi6aY(long j, long j2) {
        return m7057constructorimpl((((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L) | ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32));
    }

    /* JADX INFO: renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m7071unaryMinusnOccac(long j) {
        return m7057constructorimpl((((long) (-((int) (j & 4294967295L)))) & 4294967295L) | (((long) (-((int) (j >> 32)))) << 32));
    }

    /* JADX INFO: renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m7068remBjo55l4(long j, int i) {
        int i2 = (int) (j >> 32);
        return m7057constructorimpl((((long) (((int) (j & 4294967295L)) % i)) & 4294967295L) | (((long) (i2 % i)) << 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7070toStringimpl(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append(m7063getXimpl(j));
        sb.append(", ");
        sb.append(m7064getYimpl(j));
        sb.append(')');
        return sb.toString();
    }

    public final String toString() {
        return m7070toStringimpl(this.packedValue);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/ui/unit/IntOffset$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/IntOffset;", "Zero", "J", "getZero-nOcc-ac", "()J", "Max", "getMax-nOcc-ac"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m7074getZeronOccac() {
            return IntOffset.Zero;
        }

        /* JADX INFO: renamed from: getMax-nOcc-ac, reason: not valid java name */
        public final long m7073getMaxnOccac() {
            return IntOffset.Max;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m7069timesBjo55l4(long j, float f) {
        return m7057constructorimpl((((long) Math.round(((int) (j >> 32)) * f)) << 32) | (((long) Math.round(((int) (j & 4294967295L)) * f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m7060divBjo55l4(long j, float f) {
        return m7057constructorimpl((((long) Math.round(((int) (j >> 32)) / f)) << 32) | (((long) Math.round(((int) (j & 4294967295L)) / f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m7054boximpl(long j) {
        return new IntOffset(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7061equalsimpl(long j, Object obj) {
        return (obj instanceof IntOffset) && j == ((IntOffset) obj).m7072unboximpl();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7065hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return m7061equalsimpl(this.packedValue, p0);
    }

    public final int hashCode() {
        return m7065hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7072unboximpl() {
        return this.packedValue;
    }
}
