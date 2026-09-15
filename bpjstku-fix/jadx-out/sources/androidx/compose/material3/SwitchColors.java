package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b*\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J²\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\"\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0017J\"\u0010$\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0017J\"\u0010&\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0017R\u001d\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u001d\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u001d\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u001d\u00101\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010*R\u001d\u00103\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*R\u001d\u00105\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*R\u001d\u00107\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u0010*R\u001d\u00109\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b9\u0010(\u001a\u0004\b:\u0010*R\u001d\u0010;\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b;\u0010(\u001a\u0004\b<\u0010*R\u001d\u0010=\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b=\u0010(\u001a\u0004\b>\u0010*R\u001d\u0010?\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b?\u0010(\u001a\u0004\b@\u0010*R\u001d\u0010A\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bA\u0010(\u001a\u0004\bB\u0010*R\u001d\u0010C\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bC\u0010(\u001a\u0004\bD\u0010*R\u001d\u0010E\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bE\u0010(\u001a\u0004\bF\u0010*R\u001d\u0010G\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010(\u001a\u0004\bH\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/SwitchColors;", "", "Landroidx/compose/ui/graphics/Color;", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "<init>", "(JJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "borderColor-WaAFU9c$material3_release", "(ZZ)J", "borderColor", "copy-Q_H9qLU", "(JJJJJJJJJJJJJJJJ)Landroidx/compose/material3/SwitchColors;", "copy", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "iconColor-WaAFU9c$material3_release", "iconColor", "thumbColor-WaAFU9c$material3_release", "thumbColor", "trackColor-WaAFU9c$material3_release", "trackColor", "checkedBorderColor", "J", "getCheckedBorderColor-0d7_KjU", "()J", "checkedIconColor", "getCheckedIconColor-0d7_KjU", "checkedThumbColor", "getCheckedThumbColor-0d7_KjU", "checkedTrackColor", "getCheckedTrackColor-0d7_KjU", "disabledCheckedBorderColor", "getDisabledCheckedBorderColor-0d7_KjU", "disabledCheckedIconColor", "getDisabledCheckedIconColor-0d7_KjU", "disabledCheckedThumbColor", "getDisabledCheckedThumbColor-0d7_KjU", "disabledCheckedTrackColor", "getDisabledCheckedTrackColor-0d7_KjU", "disabledUncheckedBorderColor", "getDisabledUncheckedBorderColor-0d7_KjU", "disabledUncheckedIconColor", "getDisabledUncheckedIconColor-0d7_KjU", "disabledUncheckedThumbColor", "getDisabledUncheckedThumbColor-0d7_KjU", "disabledUncheckedTrackColor", "getDisabledUncheckedTrackColor-0d7_KjU", "uncheckedBorderColor", "getUncheckedBorderColor-0d7_KjU", "uncheckedIconColor", "getUncheckedIconColor-0d7_KjU", "uncheckedThumbColor", "getUncheckedThumbColor-0d7_KjU", "uncheckedTrackColor", "getUncheckedTrackColor-0d7_KjU"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SwitchColors {
    public static final int $stable = 0;
    private final long checkedBorderColor;
    private final long checkedIconColor;
    private final long checkedThumbColor;
    private final long checkedTrackColor;
    private final long disabledCheckedBorderColor;
    private final long disabledCheckedIconColor;
    private final long disabledCheckedThumbColor;
    private final long disabledCheckedTrackColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedIconColor;
    private final long disabledUncheckedThumbColor;
    private final long disabledUncheckedTrackColor;
    private final long uncheckedBorderColor;
    private final long uncheckedIconColor;
    private final long uncheckedThumbColor;
    private final long uncheckedTrackColor;

    private SwitchColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.checkedThumbColor = j;
        this.checkedTrackColor = j2;
        this.checkedBorderColor = j3;
        this.checkedIconColor = j4;
        this.uncheckedThumbColor = j5;
        this.uncheckedTrackColor = j6;
        this.uncheckedBorderColor = j7;
        this.uncheckedIconColor = j8;
        this.disabledCheckedThumbColor = j9;
        this.disabledCheckedTrackColor = j10;
        this.disabledCheckedBorderColor = j11;
        this.disabledCheckedIconColor = j12;
        this.disabledUncheckedThumbColor = j13;
        this.disabledUncheckedTrackColor = j14;
        this.disabledUncheckedBorderColor = j15;
        this.disabledUncheckedIconColor = j16;
    }

    /* JADX INFO: renamed from: getCheckedThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedThumbColor() {
        return this.checkedThumbColor;
    }

    /* JADX INFO: renamed from: getCheckedTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedTrackColor() {
        return this.checkedTrackColor;
    }

    /* JADX INFO: renamed from: getCheckedBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedBorderColor() {
        return this.checkedBorderColor;
    }

    /* JADX INFO: renamed from: getCheckedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedIconColor() {
        return this.checkedIconColor;
    }

    /* JADX INFO: renamed from: getUncheckedThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedThumbColor() {
        return this.uncheckedThumbColor;
    }

    /* JADX INFO: renamed from: getUncheckedTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedTrackColor() {
        return this.uncheckedTrackColor;
    }

    /* JADX INFO: renamed from: getUncheckedBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedBorderColor() {
        return this.uncheckedBorderColor;
    }

    /* JADX INFO: renamed from: getUncheckedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedIconColor() {
        return this.uncheckedIconColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedThumbColor() {
        return this.disabledCheckedThumbColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedTrackColor() {
        return this.disabledCheckedTrackColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedBorderColor() {
        return this.disabledCheckedBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedIconColor() {
        return this.disabledCheckedIconColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedThumbColor() {
        return this.disabledUncheckedThumbColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedTrackColor() {
        return this.disabledUncheckedTrackColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedBorderColor() {
        return this.disabledUncheckedBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedIconColor() {
        return this.disabledUncheckedIconColor;
    }

    /* JADX INFO: renamed from: thumbColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2535thumbColorWaAFU9c$material3_release(boolean p0, boolean p1) {
        if (p0) {
            return p1 ? this.checkedThumbColor : this.uncheckedThumbColor;
        }
        return p1 ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor;
    }

    /* JADX INFO: renamed from: trackColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2536trackColorWaAFU9c$material3_release(boolean p0, boolean p1) {
        if (p0) {
            return p1 ? this.checkedTrackColor : this.uncheckedTrackColor;
        }
        return p1 ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor;
    }

    /* JADX INFO: renamed from: borderColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2516borderColorWaAFU9c$material3_release(boolean p0, boolean p1) {
        if (p0) {
            return p1 ? this.checkedBorderColor : this.uncheckedBorderColor;
        }
        return p1 ? this.disabledCheckedBorderColor : this.disabledUncheckedBorderColor;
    }

    /* JADX INFO: renamed from: iconColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2534iconColorWaAFU9c$material3_release(boolean p0, boolean p1) {
        if (p0) {
            return p1 ? this.checkedIconColor : this.uncheckedIconColor;
        }
        return p1 ? this.disabledCheckedIconColor : this.disabledUncheckedIconColor;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) p0;
        return Color.m4219equalsimpl0(this.checkedThumbColor, switchColors.checkedThumbColor) && Color.m4219equalsimpl0(this.checkedTrackColor, switchColors.checkedTrackColor) && Color.m4219equalsimpl0(this.checkedBorderColor, switchColors.checkedBorderColor) && Color.m4219equalsimpl0(this.checkedIconColor, switchColors.checkedIconColor) && Color.m4219equalsimpl0(this.uncheckedThumbColor, switchColors.uncheckedThumbColor) && Color.m4219equalsimpl0(this.uncheckedTrackColor, switchColors.uncheckedTrackColor) && Color.m4219equalsimpl0(this.uncheckedBorderColor, switchColors.uncheckedBorderColor) && Color.m4219equalsimpl0(this.uncheckedIconColor, switchColors.uncheckedIconColor) && Color.m4219equalsimpl0(this.disabledCheckedThumbColor, switchColors.disabledCheckedThumbColor) && Color.m4219equalsimpl0(this.disabledCheckedTrackColor, switchColors.disabledCheckedTrackColor) && Color.m4219equalsimpl0(this.disabledCheckedBorderColor, switchColors.disabledCheckedBorderColor) && Color.m4219equalsimpl0(this.disabledCheckedIconColor, switchColors.disabledCheckedIconColor) && Color.m4219equalsimpl0(this.disabledUncheckedThumbColor, switchColors.disabledUncheckedThumbColor) && Color.m4219equalsimpl0(this.disabledUncheckedTrackColor, switchColors.disabledUncheckedTrackColor) && Color.m4219equalsimpl0(this.disabledUncheckedBorderColor, switchColors.disabledUncheckedBorderColor) && Color.m4219equalsimpl0(this.disabledUncheckedIconColor, switchColors.disabledUncheckedIconColor);
    }

    public final int hashCode() {
        int iM4225hashCodeimpl = Color.m4225hashCodeimpl(this.checkedThumbColor);
        int iM4225hashCodeimpl2 = Color.m4225hashCodeimpl(this.checkedTrackColor);
        int iM4225hashCodeimpl3 = Color.m4225hashCodeimpl(this.checkedBorderColor);
        int iM4225hashCodeimpl4 = Color.m4225hashCodeimpl(this.checkedIconColor);
        int iM4225hashCodeimpl5 = Color.m4225hashCodeimpl(this.uncheckedThumbColor);
        int iM4225hashCodeimpl6 = Color.m4225hashCodeimpl(this.uncheckedTrackColor);
        int iM4225hashCodeimpl7 = Color.m4225hashCodeimpl(this.uncheckedBorderColor);
        int iM4225hashCodeimpl8 = Color.m4225hashCodeimpl(this.uncheckedIconColor);
        int iM4225hashCodeimpl9 = Color.m4225hashCodeimpl(this.disabledCheckedThumbColor);
        int iM4225hashCodeimpl10 = Color.m4225hashCodeimpl(this.disabledCheckedTrackColor);
        int iM4225hashCodeimpl11 = Color.m4225hashCodeimpl(this.disabledCheckedBorderColor);
        int iM4225hashCodeimpl12 = Color.m4225hashCodeimpl(this.disabledCheckedIconColor);
        int iM4225hashCodeimpl13 = Color.m4225hashCodeimpl(this.disabledUncheckedThumbColor);
        return (((((((((((((((((((((((((((((iM4225hashCodeimpl * 31) + iM4225hashCodeimpl2) * 31) + iM4225hashCodeimpl3) * 31) + iM4225hashCodeimpl4) * 31) + iM4225hashCodeimpl5) * 31) + iM4225hashCodeimpl6) * 31) + iM4225hashCodeimpl7) * 31) + iM4225hashCodeimpl8) * 31) + iM4225hashCodeimpl9) * 31) + iM4225hashCodeimpl10) * 31) + iM4225hashCodeimpl11) * 31) + iM4225hashCodeimpl12) * 31) + iM4225hashCodeimpl13) * 31) + Color.m4225hashCodeimpl(this.disabledUncheckedTrackColor)) * 31) + Color.m4225hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + Color.m4225hashCodeimpl(this.disabledUncheckedIconColor);
    }

    /* JADX INFO: renamed from: copy-Q_H9qLU, reason: not valid java name */
    public final SwitchColors m2517copyQ_H9qLU(long p0, long p1, long p2, long p3, long p4, long p5, long p6, long p7, long p8, long p9, long p10, long p11, long p12, long p13, long p14, long p15) {
        return new SwitchColors(p0 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.checkedThumbColor : p0, p1 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.checkedTrackColor : p1, p2 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.checkedBorderColor : p2, p3 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.checkedIconColor : p3, p4 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.uncheckedThumbColor : p4, p5 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.uncheckedTrackColor : p5, p6 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.uncheckedBorderColor : p6, p7 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.uncheckedIconColor : p7, p8 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledCheckedThumbColor : p8, p9 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledCheckedTrackColor : p9, p10 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledCheckedBorderColor : p10, p11 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledCheckedIconColor : p11, p12 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledUncheckedThumbColor : p12, p13 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledUncheckedTrackColor : p13, p14 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledUncheckedBorderColor : p14, p15 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledUncheckedIconColor : p15, null);
    }

    public /* synthetic */ SwitchColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16);
    }
}
