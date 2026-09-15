package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087@\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u001f\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\"\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b \u0010!\u0088\u0001\u0015\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/node/TouchBoundsExpansion;", "", "", "p0", "constructor-impl", "(J)J", "Landroidx/compose/ui/unit/LayoutDirection;", "", "computeLeft-impl$ui_release", "(JLandroidx/compose/ui/unit/LayoutDirection;)I", "computeLeft", "computeRight-impl$ui_release", "computeRight", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "packedValue", "J", "getStart-impl", "(J)I", "start", "getTop-impl", "top", "getEnd-impl", "end", "getBottom-impl", "bottom", "isLayoutDirectionAware-impl", "(J)Z", "isLayoutDirectionAware", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class TouchBoundsExpansion {
    private static final long IS_LAYOUT_DIRECTION_AWARE = Long.MIN_VALUE;
    private static final int MASK = 32767;
    public static final int MAX_VALUE = 32767;
    private static final int SHIFT = 15;
    private final long packedValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long None = TouchBoundsExpansionKt.TouchBoundsExpansion$default(0, 0, 0, 0, 14, null);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m6012constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6014equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: isLayoutDirectionAware-impl, reason: not valid java name */
    public static final boolean m6020isLayoutDirectionAwareimpl(long j) {
        return (j & Long.MIN_VALUE) != 0;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000f8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017"}, d2 = {"Landroidx/compose/ui/node/TouchBoundsExpansion$Companion;", "", "<init>", "()V", "", "p0", "p1", "p2", "p3", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "Absolute-vsh68fg", "(IIII)J", "Absolute", "", "p4", "", "pack$ui_release", "(IIIIZ)J", "unpack", "(JI)I", "trimAndShift", "(II)J", "None", "J", "getNone-RZrCHBk", "()J", "MASK", "I", "SHIFT", "MAX_VALUE", "IS_LAYOUT_DIRECTION_AWARE"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private final long trimAndShift(int p0, int p1) {
            return ((long) (p0 & 32767)) << (p1 * 15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int unpack(long p0, int p1) {
            return ((int) (p0 >> (p1 * 15))) & 32767;
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: Absolute-vsh68fg$default, reason: not valid java name */
        public static /* synthetic */ long m6023Absolutevsh68fg$default(Companion companion, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = 0;
            }
            if ((i5 & 2) != 0) {
                i2 = 0;
            }
            if ((i5 & 4) != 0) {
                i3 = 0;
            }
            if ((i5 & 8) != 0) {
                i4 = 0;
            }
            return companion.m6024Absolutevsh68fg(i, i2, i3, i4);
        }

        /* JADX INFO: renamed from: getNone-RZrCHBk, reason: not valid java name */
        public final long m6025getNoneRZrCHBk() {
            return TouchBoundsExpansion.None;
        }

        public final long pack$ui_release(int p0, int p1, int p2, int p3, boolean p4) {
            long jTrimAndShift = trimAndShift(p0, 0);
            long jTrimAndShift2 = trimAndShift(p1, 1);
            long jTrimAndShift3 = trimAndShift(p2, 2);
            return jTrimAndShift2 | jTrimAndShift | jTrimAndShift3 | trimAndShift(p3, 3) | (p4 ? Long.MIN_VALUE : 0L);
        }

        /* JADX INFO: renamed from: Absolute-vsh68fg, reason: not valid java name */
        public final long m6024Absolutevsh68fg(int p0, int p1, int p2, int p3) {
            if (p0 < 0 || p0 >= 32768) {
                InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
            }
            if (p1 < 0 || p1 >= 32768) {
                InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
            }
            if (p2 < 0 || p2 >= 32768) {
                InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
            }
            if (p3 < 0 || p3 >= 32768) {
                InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
            }
            return TouchBoundsExpansion.m6012constructorimpl(pack$ui_release(p0, p1, p2, p3, false));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ TouchBoundsExpansion(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: getStart-impl, reason: not valid java name */
    public static final int m6017getStartimpl(long j) {
        return INSTANCE.unpack(j, 0);
    }

    /* JADX INFO: renamed from: getTop-impl, reason: not valid java name */
    public static final int m6018getTopimpl(long j) {
        return INSTANCE.unpack(j, 1);
    }

    /* JADX INFO: renamed from: getEnd-impl, reason: not valid java name */
    public static final int m6016getEndimpl(long j) {
        return INSTANCE.unpack(j, 2);
    }

    /* JADX INFO: renamed from: getBottom-impl, reason: not valid java name */
    public static final int m6015getBottomimpl(long j) {
        return INSTANCE.unpack(j, 3);
    }

    /* JADX INFO: renamed from: computeLeft-impl$ui_release, reason: not valid java name */
    public static final int m6010computeLeftimpl$ui_release(long j, LayoutDirection layoutDirection) {
        if (!m6020isLayoutDirectionAwareimpl(j) || layoutDirection == LayoutDirection.Ltr) {
            return m6017getStartimpl(j);
        }
        return m6016getEndimpl(j);
    }

    /* JADX INFO: renamed from: computeRight-impl$ui_release, reason: not valid java name */
    public static final int m6011computeRightimpl$ui_release(long j, LayoutDirection layoutDirection) {
        if (!m6020isLayoutDirectionAwareimpl(j) || layoutDirection == LayoutDirection.Ltr) {
            return m6016getEndimpl(j);
        }
        return m6017getStartimpl(j);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TouchBoundsExpansion m6009boximpl(long j) {
        return new TouchBoundsExpansion(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6013equalsimpl(long j, Object obj) {
        return (obj instanceof TouchBoundsExpansion) && j == ((TouchBoundsExpansion) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6019hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6021toStringimpl(long j) {
        StringBuilder sb = new StringBuilder("TouchBoundsExpansion(packedValue=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return m6013equalsimpl(this.packedValue, p0);
    }

    public final int hashCode() {
        return m6019hashCodeimpl(this.packedValue);
    }

    public final String toString() {
        return m6021toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
