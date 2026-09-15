package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\"\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013J\u008a\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001d\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u001d\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u001d\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R\u001d\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$R\u001d\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010$R\u001d\u00101\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$R\u001d\u00103\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b4\u0010$R\u001d\u00105\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010\"\u001a\u0004\b6\u0010$R\u001d\u00107\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b7\u0010\"\u001a\u0004\b8\u0010$R\u001d\u00109\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b9\u0010\"\u001a\u0004\b:\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/SegmentedButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "borderColor-WaAFU9c$material3_release", "(ZZ)J", "borderColor", "containerColor-WaAFU9c$material3_release", "containerColor", "contentColor-WaAFU9c$material3_release", "contentColor", "copy-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material3/SegmentedButtonColors;", "copy", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "activeBorderColor", "J", "getActiveBorderColor-0d7_KjU", "()J", "activeContainerColor", "getActiveContainerColor-0d7_KjU", "activeContentColor", "getActiveContentColor-0d7_KjU", "disabledActiveBorderColor", "getDisabledActiveBorderColor-0d7_KjU", "disabledActiveContainerColor", "getDisabledActiveContainerColor-0d7_KjU", "disabledActiveContentColor", "getDisabledActiveContentColor-0d7_KjU", "disabledInactiveBorderColor", "getDisabledInactiveBorderColor-0d7_KjU", "disabledInactiveContainerColor", "getDisabledInactiveContainerColor-0d7_KjU", "disabledInactiveContentColor", "getDisabledInactiveContentColor-0d7_KjU", "inactiveBorderColor", "getInactiveBorderColor-0d7_KjU", "inactiveContainerColor", "getInactiveContainerColor-0d7_KjU", "inactiveContentColor", "getInactiveContentColor-0d7_KjU"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SegmentedButtonColors {
    public static final int $stable = 0;
    private final long activeBorderColor;
    private final long activeContainerColor;
    private final long activeContentColor;
    private final long disabledActiveBorderColor;
    private final long disabledActiveContainerColor;
    private final long disabledActiveContentColor;
    private final long disabledInactiveBorderColor;
    private final long disabledInactiveContainerColor;
    private final long disabledInactiveContentColor;
    private final long inactiveBorderColor;
    private final long inactiveContainerColor;
    private final long inactiveContentColor;

    private SegmentedButtonColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.activeContainerColor = j;
        this.activeContentColor = j2;
        this.activeBorderColor = j3;
        this.inactiveContainerColor = j4;
        this.inactiveContentColor = j5;
        this.inactiveBorderColor = j6;
        this.disabledActiveContainerColor = j7;
        this.disabledActiveContentColor = j8;
        this.disabledActiveBorderColor = j9;
        this.disabledInactiveContainerColor = j10;
        this.disabledInactiveContentColor = j11;
        this.disabledInactiveBorderColor = j12;
    }

    /* JADX INFO: renamed from: getActiveContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveContainerColor() {
        return this.activeContainerColor;
    }

    /* JADX INFO: renamed from: getActiveContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveContentColor() {
        return this.activeContentColor;
    }

    /* JADX INFO: renamed from: getActiveBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveBorderColor() {
        return this.activeBorderColor;
    }

    /* JADX INFO: renamed from: getInactiveContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getInactiveContainerColor() {
        return this.inactiveContainerColor;
    }

    /* JADX INFO: renamed from: getInactiveContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getInactiveContentColor() {
        return this.inactiveContentColor;
    }

    /* JADX INFO: renamed from: getInactiveBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getInactiveBorderColor() {
        return this.inactiveBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledActiveContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledActiveContainerColor() {
        return this.disabledActiveContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledActiveContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledActiveContentColor() {
        return this.disabledActiveContentColor;
    }

    /* JADX INFO: renamed from: getDisabledActiveBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledActiveBorderColor() {
        return this.disabledActiveBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledInactiveContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledInactiveContainerColor() {
        return this.disabledInactiveContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledInactiveContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledInactiveContentColor() {
        return this.disabledInactiveContentColor;
    }

    /* JADX INFO: renamed from: getDisabledInactiveBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledInactiveBorderColor() {
        return this.disabledInactiveBorderColor;
    }

    /* JADX INFO: renamed from: borderColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2333borderColorWaAFU9c$material3_release(boolean p0, boolean p1) {
        if (p0 && p1) {
            return this.activeBorderColor;
        }
        if (p0 && !p1) {
            return this.inactiveBorderColor;
        }
        if (!p0 && p1) {
            return this.disabledActiveBorderColor;
        }
        return this.disabledInactiveBorderColor;
    }

    /* JADX INFO: renamed from: contentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2335contentColorWaAFU9c$material3_release(boolean p0, boolean p1) {
        if (p0 && p1) {
            return this.activeContentColor;
        }
        if (p0 && !p1) {
            return this.inactiveContentColor;
        }
        if (!p0 && p1) {
            return this.disabledActiveContentColor;
        }
        return this.disabledInactiveContentColor;
    }

    /* JADX INFO: renamed from: containerColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2334containerColorWaAFU9c$material3_release(boolean p0, boolean p1) {
        if (p0 && p1) {
            return this.activeContainerColor;
        }
        if (p0 && !p1) {
            return this.inactiveContainerColor;
        }
        if (!p0 && p1) {
            return this.disabledActiveContainerColor;
        }
        return this.disabledInactiveContainerColor;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass()) {
            return false;
        }
        SegmentedButtonColors segmentedButtonColors = (SegmentedButtonColors) p0;
        return Color.m4219equalsimpl0(this.activeBorderColor, segmentedButtonColors.activeBorderColor) && Color.m4219equalsimpl0(this.activeContentColor, segmentedButtonColors.activeContentColor) && Color.m4219equalsimpl0(this.activeContainerColor, segmentedButtonColors.activeContainerColor) && Color.m4219equalsimpl0(this.inactiveBorderColor, segmentedButtonColors.inactiveBorderColor) && Color.m4219equalsimpl0(this.inactiveContentColor, segmentedButtonColors.inactiveContentColor) && Color.m4219equalsimpl0(this.inactiveContainerColor, segmentedButtonColors.inactiveContainerColor) && Color.m4219equalsimpl0(this.disabledActiveBorderColor, segmentedButtonColors.disabledActiveBorderColor) && Color.m4219equalsimpl0(this.disabledActiveContentColor, segmentedButtonColors.disabledActiveContentColor) && Color.m4219equalsimpl0(this.disabledActiveContainerColor, segmentedButtonColors.disabledActiveContainerColor) && Color.m4219equalsimpl0(this.disabledInactiveBorderColor, segmentedButtonColors.disabledInactiveBorderColor) && Color.m4219equalsimpl0(this.disabledInactiveContentColor, segmentedButtonColors.disabledInactiveContentColor) && Color.m4219equalsimpl0(this.disabledInactiveContainerColor, segmentedButtonColors.disabledInactiveContainerColor);
    }

    public final int hashCode() {
        int iM4225hashCodeimpl = Color.m4225hashCodeimpl(this.activeBorderColor);
        int iM4225hashCodeimpl2 = Color.m4225hashCodeimpl(this.activeContentColor);
        int iM4225hashCodeimpl3 = Color.m4225hashCodeimpl(this.activeContainerColor);
        int iM4225hashCodeimpl4 = Color.m4225hashCodeimpl(this.inactiveBorderColor);
        int iM4225hashCodeimpl5 = Color.m4225hashCodeimpl(this.inactiveContentColor);
        int iM4225hashCodeimpl6 = Color.m4225hashCodeimpl(this.inactiveContainerColor);
        int iM4225hashCodeimpl7 = Color.m4225hashCodeimpl(this.disabledActiveBorderColor);
        int iM4225hashCodeimpl8 = Color.m4225hashCodeimpl(this.disabledActiveContentColor);
        int iM4225hashCodeimpl9 = Color.m4225hashCodeimpl(this.disabledActiveContainerColor);
        return (((((((((((((((((((((iM4225hashCodeimpl * 31) + iM4225hashCodeimpl2) * 31) + iM4225hashCodeimpl3) * 31) + iM4225hashCodeimpl4) * 31) + iM4225hashCodeimpl5) * 31) + iM4225hashCodeimpl6) * 31) + iM4225hashCodeimpl7) * 31) + iM4225hashCodeimpl8) * 31) + iM4225hashCodeimpl9) * 31) + Color.m4225hashCodeimpl(this.disabledInactiveBorderColor)) * 31) + Color.m4225hashCodeimpl(this.disabledInactiveContentColor)) * 31) + Color.m4225hashCodeimpl(this.disabledInactiveContainerColor);
    }

    /* JADX INFO: renamed from: copy-2qZNXz8, reason: not valid java name */
    public final SegmentedButtonColors m2336copy2qZNXz8(long p0, long p1, long p2, long p3, long p4, long p5, long p6, long p7, long p8, long p9, long p10, long p11) {
        return new SegmentedButtonColors(p0 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.activeContainerColor : p0, p1 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.activeContentColor : p1, p2 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.activeBorderColor : p2, p3 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.inactiveContainerColor : p3, p4 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.inactiveContentColor : p4, p5 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.inactiveBorderColor : p5, p6 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledActiveContainerColor : p6, p7 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledActiveContentColor : p7, p8 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledActiveBorderColor : p8, p9 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledInactiveContainerColor : p9, p10 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledInactiveContentColor : p10, p11 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledInactiveBorderColor : p11, null);
    }

    public /* synthetic */ SegmentedButtonColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12);
    }
}
