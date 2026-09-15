package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0013\u0010\u0011J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0015H\u0087\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0019H\u0087\u0002¢\u0006\u0004\b\u0016\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0015H\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0019H\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010 \u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010)R\u001a\u0010,\u001a\u00020\u00068GX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0011R\u001a\u0010/\u001a\u00020\u00068GX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u0011\u0088\u0001&\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/unit/DpSize;", "", "", "p0", "constructor-impl", "(J)J", "Landroidx/compose/ui/unit/Dp;", "p1", "copy-DwJknco", "(JFF)J", "copy", "minus-e_xh8Ic", "(JJ)J", "minus", "plus-e_xh8Ic", "plus", "component1-D9Ej5fM", "(J)F", "component1", "component2-D9Ej5fM", "component2", "", "times-Gh9hcWk", "(JI)J", "times", "", "(JF)J", "div-Gh9hcWk", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "packedValue", "J", "getPackedValue$annotations", "()V", "getWidth-D9Ej5fM", "getWidth-D9Ej5fM$annotations", "width", "getHeight-D9Ej5fM", "getHeight-D9Ej5fM$annotations", "height", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class DpSize {
    private final long packedValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m7024constructorimpl(0);
    private static final long Unspecified = m7024constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m7024constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7030equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7032getHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7034getWidthD9Ej5fM$annotations() {
    }

    private /* synthetic */ DpSize(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m7026copyDwJknco$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m7033getWidthD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m7031getHeightD9Ej5fM(j);
        }
        return m7025copyDwJknco(j, f, f2);
    }

    /* JADX INFO: renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m7036minuse_xh8Ic(long j, long j2) {
        float fM6935constructorimpl = Dp.m6935constructorimpl(m7033getWidthD9Ej5fM(j) - m7033getWidthD9Ej5fM(j2));
        float fM6935constructorimpl2 = Dp.m6935constructorimpl(m7031getHeightD9Ej5fM(j) - m7031getHeightD9Ej5fM(j2));
        return m7024constructorimpl((((long) Float.floatToRawIntBits(fM6935constructorimpl)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM6935constructorimpl2))));
    }

    /* JADX INFO: renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m7037pluse_xh8Ic(long j, long j2) {
        float fM6935constructorimpl = Dp.m6935constructorimpl(m7033getWidthD9Ej5fM(j) + m7033getWidthD9Ej5fM(j2));
        float fM6935constructorimpl2 = Dp.m6935constructorimpl(m7031getHeightD9Ej5fM(j) + m7031getHeightD9Ej5fM(j2));
        return m7024constructorimpl((((long) Float.floatToRawIntBits(fM6935constructorimpl)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM6935constructorimpl2))));
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m7022component1D9Ej5fM(long j) {
        return m7033getWidthD9Ej5fM(j);
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m7023component2D9Ej5fM(long j) {
        return m7031getHeightD9Ej5fM(j);
    }

    /* JADX INFO: renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m7039timesGh9hcWk(long j, int i) {
        float f = i;
        return m7024constructorimpl((((long) Float.floatToRawIntBits(Dp.m6935constructorimpl(m7033getWidthD9Ej5fM(j) * f))) << 32) | (((long) Float.floatToRawIntBits(Dp.m6935constructorimpl(m7031getHeightD9Ej5fM(j) * f))) & 4294967295L));
    }

    /* JADX INFO: renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m7038timesGh9hcWk(long j, float f) {
        float fM6935constructorimpl = Dp.m6935constructorimpl(m7033getWidthD9Ej5fM(j) * f);
        float fM6935constructorimpl2 = Dp.m6935constructorimpl(m7031getHeightD9Ej5fM(j) * f);
        return m7024constructorimpl((((long) Float.floatToRawIntBits(fM6935constructorimpl)) << 32) | (((long) Float.floatToRawIntBits(fM6935constructorimpl2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m7028divGh9hcWk(long j, int i) {
        float f = i;
        return m7024constructorimpl((((long) Float.floatToRawIntBits(Dp.m6935constructorimpl(m7033getWidthD9Ej5fM(j) / f))) << 32) | (((long) Float.floatToRawIntBits(Dp.m6935constructorimpl(m7031getHeightD9Ej5fM(j) / f))) & 4294967295L));
    }

    /* JADX INFO: renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m7027divGh9hcWk(long j, float f) {
        float fM6935constructorimpl = Dp.m6935constructorimpl(m7033getWidthD9Ej5fM(j) / f);
        float fM6935constructorimpl2 = Dp.m6935constructorimpl(m7031getHeightD9Ej5fM(j) / f);
        return m7024constructorimpl((((long) Float.floatToRawIntBits(fM6935constructorimpl)) << 32) | (((long) Float.floatToRawIntBits(fM6935constructorimpl2)) & 4294967295L));
    }

    public final String toString() {
        return m7040toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7040toStringimpl(long j) {
        if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) Dp.m6946toStringimpl(m7033getWidthD9Ej5fM(j)));
            sb.append(" x ");
            sb.append((Object) Dp.m6946toStringimpl(m7031getHeightD9Ej5fM(j)));
            return sb.toString();
        }
        return "DpSize.Unspecified";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/ui/unit/DpSize$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/DpSize;", "Zero", "J", "getZero-MYxV2XQ", "()J", "Unspecified", "getUnspecified-MYxV2XQ"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m7043getZeroMYxV2XQ() {
            return DpSize.Zero;
        }

        /* JADX INFO: renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m7042getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m7033getWidthD9Ej5fM(long j) {
        return Dp.m6935constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m7031getHeightD9Ej5fM(long j) {
        return Dp.m6935constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m7025copyDwJknco(long j, float f, float f2) {
        return m7024constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m7021boximpl(long j) {
        return new DpSize(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7029equalsimpl(long j, Object obj) {
        return (obj instanceof DpSize) && j == ((DpSize) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7035hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return m7029equalsimpl(this.packedValue, p0);
    }

    public final int hashCode() {
        return m7035hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
