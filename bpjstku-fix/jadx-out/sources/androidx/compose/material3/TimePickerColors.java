package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b(\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0013H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u009e\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0013H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0015J\u001a\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0013H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0015J\u001a\u0010$\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0013H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0015J\u001a\u0010&\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0013H\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0015R\u001d\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u001d\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u001d\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u001d\u00101\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010*R\u001d\u00103\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*R\u001d\u00105\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*R\u001d\u00107\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u0010*R\u001d\u00109\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b9\u0010(\u001a\u0004\b:\u0010*R\u001d\u0010;\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b;\u0010(\u001a\u0004\b<\u0010*R\u001d\u0010=\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b=\u0010(\u001a\u0004\b>\u0010*R\u001d\u0010?\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b?\u0010(\u001a\u0004\b@\u0010*R\u001d\u0010A\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bA\u0010(\u001a\u0004\bB\u0010*R\u001d\u0010C\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bC\u0010(\u001a\u0004\bD\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/TimePickerColors;", "", "Landroidx/compose/ui/graphics/Color;", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "<init>", "(JJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "clockDialContentColor-vNxB06k$material3_release", "(Z)J", "clockDialContentColor", "copy-dVHXu7A", "(JJJJJJJJJJJJJJ)Landroidx/compose/material3/TimePickerColors;", "copy", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "periodSelectorContainerColor-vNxB06k$material3_release", "periodSelectorContainerColor", "periodSelectorContentColor-vNxB06k$material3_release", "periodSelectorContentColor", "timeSelectorContainerColor-vNxB06k$material3_release", "timeSelectorContainerColor", "timeSelectorContentColor-vNxB06k$material3_release", "timeSelectorContentColor", "clockDialColor", "J", "getClockDialColor-0d7_KjU", "()J", "clockDialSelectedContentColor", "getClockDialSelectedContentColor-0d7_KjU", "clockDialUnselectedContentColor", "getClockDialUnselectedContentColor-0d7_KjU", "containerColor", "getContainerColor-0d7_KjU", "periodSelectorBorderColor", "getPeriodSelectorBorderColor-0d7_KjU", "periodSelectorSelectedContainerColor", "getPeriodSelectorSelectedContainerColor-0d7_KjU", "periodSelectorSelectedContentColor", "getPeriodSelectorSelectedContentColor-0d7_KjU", "periodSelectorUnselectedContainerColor", "getPeriodSelectorUnselectedContainerColor-0d7_KjU", "periodSelectorUnselectedContentColor", "getPeriodSelectorUnselectedContentColor-0d7_KjU", "selectorColor", "getSelectorColor-0d7_KjU", "timeSelectorSelectedContainerColor", "getTimeSelectorSelectedContainerColor-0d7_KjU", "timeSelectorSelectedContentColor", "getTimeSelectorSelectedContentColor-0d7_KjU", "timeSelectorUnselectedContainerColor", "getTimeSelectorUnselectedContainerColor-0d7_KjU", "timeSelectorUnselectedContentColor", "getTimeSelectorUnselectedContentColor-0d7_KjU"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TimePickerColors {
    public static final int $stable = 0;
    private final long clockDialColor;
    private final long clockDialSelectedContentColor;
    private final long clockDialUnselectedContentColor;
    private final long containerColor;
    private final long periodSelectorBorderColor;
    private final long periodSelectorSelectedContainerColor;
    private final long periodSelectorSelectedContentColor;
    private final long periodSelectorUnselectedContainerColor;
    private final long periodSelectorUnselectedContentColor;
    private final long selectorColor;
    private final long timeSelectorSelectedContainerColor;
    private final long timeSelectorSelectedContentColor;
    private final long timeSelectorUnselectedContainerColor;
    private final long timeSelectorUnselectedContentColor;

    private TimePickerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.clockDialColor = j;
        this.selectorColor = j2;
        this.containerColor = j3;
        this.periodSelectorBorderColor = j4;
        this.clockDialSelectedContentColor = j5;
        this.clockDialUnselectedContentColor = j6;
        this.periodSelectorSelectedContainerColor = j7;
        this.periodSelectorUnselectedContainerColor = j8;
        this.periodSelectorSelectedContentColor = j9;
        this.periodSelectorUnselectedContentColor = j10;
        this.timeSelectorSelectedContainerColor = j11;
        this.timeSelectorUnselectedContainerColor = j12;
        this.timeSelectorSelectedContentColor = j13;
        this.timeSelectorUnselectedContentColor = j14;
    }

    /* JADX INFO: renamed from: getClockDialColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getClockDialColor() {
        return this.clockDialColor;
    }

    /* JADX INFO: renamed from: getSelectorColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectorColor() {
        return this.selectorColor;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getPeriodSelectorBorderColor() {
        return this.periodSelectorBorderColor;
    }

    /* JADX INFO: renamed from: getClockDialSelectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getClockDialSelectedContentColor() {
        return this.clockDialSelectedContentColor;
    }

    /* JADX INFO: renamed from: getClockDialUnselectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getClockDialUnselectedContentColor() {
        return this.clockDialUnselectedContentColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getPeriodSelectorSelectedContainerColor() {
        return this.periodSelectorSelectedContainerColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getPeriodSelectorUnselectedContainerColor() {
        return this.periodSelectorUnselectedContainerColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorSelectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getPeriodSelectorSelectedContentColor() {
        return this.periodSelectorSelectedContentColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getPeriodSelectorUnselectedContentColor() {
        return this.periodSelectorUnselectedContentColor;
    }

    /* JADX INFO: renamed from: getTimeSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTimeSelectorSelectedContainerColor() {
        return this.timeSelectorSelectedContainerColor;
    }

    /* JADX INFO: renamed from: getTimeSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTimeSelectorUnselectedContainerColor() {
        return this.timeSelectorUnselectedContainerColor;
    }

    /* JADX INFO: renamed from: getTimeSelectorSelectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTimeSelectorSelectedContentColor() {
        return this.timeSelectorSelectedContentColor;
    }

    /* JADX INFO: renamed from: getTimeSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTimeSelectorUnselectedContentColor() {
        return this.timeSelectorUnselectedContentColor;
    }

    /* JADX INFO: renamed from: periodSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2674periodSelectorContainerColorvNxB06k$material3_release(boolean p0) {
        if (p0) {
            return this.periodSelectorSelectedContainerColor;
        }
        return this.periodSelectorUnselectedContainerColor;
    }

    /* JADX INFO: renamed from: periodSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2675periodSelectorContentColorvNxB06k$material3_release(boolean p0) {
        if (p0) {
            return this.periodSelectorSelectedContentColor;
        }
        return this.periodSelectorUnselectedContentColor;
    }

    /* JADX INFO: renamed from: timeSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2676timeSelectorContainerColorvNxB06k$material3_release(boolean p0) {
        if (p0) {
            return this.timeSelectorSelectedContainerColor;
        }
        return this.timeSelectorUnselectedContainerColor;
    }

    /* JADX INFO: renamed from: timeSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2677timeSelectorContentColorvNxB06k$material3_release(boolean p0) {
        if (p0) {
            return this.timeSelectorSelectedContentColor;
        }
        return this.timeSelectorUnselectedContentColor;
    }

    /* JADX INFO: renamed from: clockDialContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2658clockDialContentColorvNxB06k$material3_release(boolean p0) {
        if (p0) {
            return this.clockDialSelectedContentColor;
        }
        return this.clockDialUnselectedContentColor;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass()) {
            return false;
        }
        TimePickerColors timePickerColors = (TimePickerColors) p0;
        return Color.m4219equalsimpl0(this.clockDialColor, timePickerColors.clockDialColor) && Color.m4219equalsimpl0(this.selectorColor, timePickerColors.selectorColor) && Color.m4219equalsimpl0(this.containerColor, timePickerColors.containerColor) && Color.m4219equalsimpl0(this.periodSelectorBorderColor, timePickerColors.periodSelectorBorderColor) && Color.m4219equalsimpl0(this.periodSelectorSelectedContainerColor, timePickerColors.periodSelectorSelectedContainerColor) && Color.m4219equalsimpl0(this.periodSelectorUnselectedContainerColor, timePickerColors.periodSelectorUnselectedContainerColor) && Color.m4219equalsimpl0(this.periodSelectorSelectedContentColor, timePickerColors.periodSelectorSelectedContentColor) && Color.m4219equalsimpl0(this.periodSelectorUnselectedContentColor, timePickerColors.periodSelectorUnselectedContentColor) && Color.m4219equalsimpl0(this.timeSelectorSelectedContainerColor, timePickerColors.timeSelectorSelectedContainerColor) && Color.m4219equalsimpl0(this.timeSelectorUnselectedContainerColor, timePickerColors.timeSelectorUnselectedContainerColor) && Color.m4219equalsimpl0(this.timeSelectorSelectedContentColor, timePickerColors.timeSelectorSelectedContentColor) && Color.m4219equalsimpl0(this.timeSelectorUnselectedContentColor, timePickerColors.timeSelectorUnselectedContentColor);
    }

    public final int hashCode() {
        int iM4225hashCodeimpl = Color.m4225hashCodeimpl(this.clockDialColor);
        int iM4225hashCodeimpl2 = Color.m4225hashCodeimpl(this.selectorColor);
        int iM4225hashCodeimpl3 = Color.m4225hashCodeimpl(this.containerColor);
        int iM4225hashCodeimpl4 = Color.m4225hashCodeimpl(this.periodSelectorBorderColor);
        int iM4225hashCodeimpl5 = Color.m4225hashCodeimpl(this.periodSelectorSelectedContainerColor);
        int iM4225hashCodeimpl6 = Color.m4225hashCodeimpl(this.periodSelectorUnselectedContainerColor);
        int iM4225hashCodeimpl7 = Color.m4225hashCodeimpl(this.periodSelectorSelectedContentColor);
        int iM4225hashCodeimpl8 = Color.m4225hashCodeimpl(this.periodSelectorUnselectedContentColor);
        int iM4225hashCodeimpl9 = Color.m4225hashCodeimpl(this.timeSelectorSelectedContainerColor);
        return (((((((((((((((((((((iM4225hashCodeimpl * 31) + iM4225hashCodeimpl2) * 31) + iM4225hashCodeimpl3) * 31) + iM4225hashCodeimpl4) * 31) + iM4225hashCodeimpl5) * 31) + iM4225hashCodeimpl6) * 31) + iM4225hashCodeimpl7) * 31) + iM4225hashCodeimpl8) * 31) + iM4225hashCodeimpl9) * 31) + Color.m4225hashCodeimpl(this.timeSelectorUnselectedContainerColor)) * 31) + Color.m4225hashCodeimpl(this.timeSelectorSelectedContentColor)) * 31) + Color.m4225hashCodeimpl(this.timeSelectorUnselectedContentColor);
    }

    /* JADX INFO: renamed from: copy-dVHXu7A, reason: not valid java name */
    public final TimePickerColors m2659copydVHXu7A(long p0, long p1, long p2, long p3, long p4, long p5, long p6, long p7, long p8, long p9, long p10, long p11, long p12, long p13) {
        return new TimePickerColors(p0 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.clockDialColor : p0, p1 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.selectorColor : p1, p2 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.containerColor : p2, p3 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.periodSelectorBorderColor : p3, p4 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.clockDialSelectedContentColor : p4, p5 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.clockDialUnselectedContentColor : p5, p6 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.periodSelectorSelectedContainerColor : p6, p7 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.periodSelectorUnselectedContainerColor : p7, p8 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.periodSelectorSelectedContentColor : p8, p9 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.periodSelectorUnselectedContentColor : p9, p10 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.timeSelectorSelectedContainerColor : p10, p11 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.timeSelectorUnselectedContainerColor : p11, p12 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.timeSelectorSelectedContentColor : p12, p13 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.timeSelectorUnselectedContentColor : p13, null);
    }

    public /* synthetic */ TimePickerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14);
    }
}
