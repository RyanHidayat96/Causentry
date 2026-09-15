package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087@\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\u00068GX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020\u00068GX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001f\u0088\u0001\u001a\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "", "p0", "constructor-impl", "(J)J", "Landroidx/compose/ui/unit/Dp;", "p1", "copy-tPigGR8", "(JFF)J", "copy", "minus-CB-Mgk4", "(JJ)J", "minus", "plus-CB-Mgk4", "plus", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "packedValue", "J", "getPackedValue", "()J", "getX-D9Ej5fM", "(J)F", "getX-D9Ej5fM$annotations", "()V", "x", "getY-D9Ej5fM", "getY-D9Ej5fM$annotations", "y", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class DpOffset {
    private final long packedValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m6991constructorimpl(0);
    private static final long Unspecified = m6991constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m6991constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6995equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m6997getXD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m6999getYD9Ej5fM$annotations() {
    }

    private /* synthetic */ DpOffset(long j) {
        this.packedValue = j;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m6993copytPigGR8$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m6996getXD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m6998getYD9Ej5fM(j);
        }
        return m6992copytPigGR8(j, f, f2);
    }

    /* JADX INFO: renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m7001minusCBMgk4(long j, long j2) {
        float fM6935constructorimpl = Dp.m6935constructorimpl(m6996getXD9Ej5fM(j) - m6996getXD9Ej5fM(j2));
        float fM6935constructorimpl2 = Dp.m6935constructorimpl(m6998getYD9Ej5fM(j) - m6998getYD9Ej5fM(j2));
        return m6991constructorimpl((((long) Float.floatToRawIntBits(fM6935constructorimpl)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM6935constructorimpl2))));
    }

    /* JADX INFO: renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m7002plusCBMgk4(long j, long j2) {
        float fM6935constructorimpl = Dp.m6935constructorimpl(m6996getXD9Ej5fM(j) + m6996getXD9Ej5fM(j2));
        float fM6935constructorimpl2 = Dp.m6935constructorimpl(m6998getYD9Ej5fM(j) + m6998getYD9Ej5fM(j2));
        return m6991constructorimpl((((long) Float.floatToRawIntBits(fM6935constructorimpl)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM6935constructorimpl2))));
    }

    public final String toString() {
        return m7003toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7003toStringimpl(long j) {
        if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            StringBuilder sb = new StringBuilder("(");
            sb.append((Object) Dp.m6946toStringimpl(m6996getXD9Ej5fM(j)));
            sb.append(", ");
            sb.append((Object) Dp.m6946toStringimpl(m6998getYD9Ej5fM(j)));
            sb.append(')');
            return sb.toString();
        }
        return "DpOffset.Unspecified";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/DpOffset;", "Zero", "J", "getZero-RKDOV3M", "()J", "Unspecified", "getUnspecified-RKDOV3M"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m7006getZeroRKDOV3M() {
            return DpOffset.Zero;
        }

        /* JADX INFO: renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m7005getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m6996getXD9Ej5fM(long j) {
        return Dp.m6935constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
    }

    /* JADX INFO: renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m6998getYD9Ej5fM(long j) {
        return Dp.m6935constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m6992copytPigGR8(long j, float f, float f2) {
        return m6991constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m6990boximpl(long j) {
        return new DpOffset(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6994equalsimpl(long j, Object obj) {
        return (obj instanceof DpOffset) && j == ((DpOffset) obj).m7004unboximpl();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7000hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return m6994equalsimpl(this.packedValue, p0);
    }

    public final int hashCode() {
        return m7000hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7004unboximpl() {
        return this.packedValue;
    }
}
