package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJv\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0012H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0012H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0012H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cR\u001d\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001d\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u001d\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u001d\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010#R\u001d\u00100\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\u001d\u00102\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010!\u001a\u0004\b3\u0010#R\u001d\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b4\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/SliderColors;", "", "Landroidx/compose/ui/graphics/Color;", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "<init>", "(JJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy--K518z4", "(JJJJJJJJJJ)Landroidx/compose/material3/SliderColors;", "copy", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "thumbColor-vNxB06k$material3_release", "(Z)J", "thumbColor", "tickColor-WaAFU9c$material3_release", "(ZZ)J", "tickColor", "trackColor-WaAFU9c$material3_release", "trackColor", "activeTickColor", "J", "getActiveTickColor-0d7_KjU", "()J", "activeTrackColor", "getActiveTrackColor-0d7_KjU", "disabledActiveTickColor", "getDisabledActiveTickColor-0d7_KjU", "disabledActiveTrackColor", "getDisabledActiveTrackColor-0d7_KjU", "disabledInactiveTickColor", "getDisabledInactiveTickColor-0d7_KjU", "disabledInactiveTrackColor", "getDisabledInactiveTrackColor-0d7_KjU", "disabledThumbColor", "getDisabledThumbColor-0d7_KjU", "inactiveTickColor", "getInactiveTickColor-0d7_KjU", "inactiveTrackColor", "getInactiveTrackColor-0d7_KjU", "getThumbColor-0d7_KjU"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SliderColors {
    public static final int $stable = 0;
    private final long activeTickColor;
    private final long activeTrackColor;
    private final long disabledActiveTickColor;
    private final long disabledActiveTrackColor;
    private final long disabledInactiveTickColor;
    private final long disabledInactiveTrackColor;
    private final long disabledThumbColor;
    private final long inactiveTickColor;
    private final long inactiveTrackColor;
    private final long thumbColor;

    private SliderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.thumbColor = j;
        this.activeTrackColor = j2;
        this.activeTickColor = j3;
        this.inactiveTrackColor = j4;
        this.inactiveTickColor = j5;
        this.disabledThumbColor = j6;
        this.disabledActiveTrackColor = j7;
        this.disabledActiveTickColor = j8;
        this.disabledInactiveTrackColor = j9;
        this.disabledInactiveTickColor = j10;
    }

    /* JADX INFO: renamed from: getThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getThumbColor() {
        return this.thumbColor;
    }

    /* JADX INFO: renamed from: getActiveTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveTrackColor() {
        return this.activeTrackColor;
    }

    /* JADX INFO: renamed from: getActiveTickColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveTickColor() {
        return this.activeTickColor;
    }

    /* JADX INFO: renamed from: getInactiveTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getInactiveTrackColor() {
        return this.inactiveTrackColor;
    }

    /* JADX INFO: renamed from: getInactiveTickColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getInactiveTickColor() {
        return this.inactiveTickColor;
    }

    /* JADX INFO: renamed from: getDisabledThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledThumbColor() {
        return this.disabledThumbColor;
    }

    /* JADX INFO: renamed from: getDisabledActiveTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledActiveTrackColor() {
        return this.disabledActiveTrackColor;
    }

    /* JADX INFO: renamed from: getDisabledActiveTickColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledActiveTickColor() {
        return this.disabledActiveTickColor;
    }

    /* JADX INFO: renamed from: getDisabledInactiveTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledInactiveTrackColor() {
        return this.disabledInactiveTrackColor;
    }

    /* JADX INFO: renamed from: getDisabledInactiveTickColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledInactiveTickColor() {
        return this.disabledInactiveTickColor;
    }

    /* JADX INFO: renamed from: thumbColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2392thumbColorvNxB06k$material3_release(boolean p0) {
        return p0 ? this.thumbColor : this.disabledThumbColor;
    }

    /* JADX INFO: renamed from: trackColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2394trackColorWaAFU9c$material3_release(boolean p0, boolean p1) {
        if (p0) {
            return p1 ? this.activeTrackColor : this.inactiveTrackColor;
        }
        return p1 ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor;
    }

    /* JADX INFO: renamed from: tickColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2393tickColorWaAFU9c$material3_release(boolean p0, boolean p1) {
        if (p0) {
            return p1 ? this.activeTickColor : this.inactiveTickColor;
        }
        return p1 ? this.disabledActiveTickColor : this.disabledInactiveTickColor;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof SliderColors)) {
            return false;
        }
        SliderColors sliderColors = (SliderColors) p0;
        return Color.m4219equalsimpl0(this.thumbColor, sliderColors.thumbColor) && Color.m4219equalsimpl0(this.activeTrackColor, sliderColors.activeTrackColor) && Color.m4219equalsimpl0(this.activeTickColor, sliderColors.activeTickColor) && Color.m4219equalsimpl0(this.inactiveTrackColor, sliderColors.inactiveTrackColor) && Color.m4219equalsimpl0(this.inactiveTickColor, sliderColors.inactiveTickColor) && Color.m4219equalsimpl0(this.disabledThumbColor, sliderColors.disabledThumbColor) && Color.m4219equalsimpl0(this.disabledActiveTrackColor, sliderColors.disabledActiveTrackColor) && Color.m4219equalsimpl0(this.disabledActiveTickColor, sliderColors.disabledActiveTickColor) && Color.m4219equalsimpl0(this.disabledInactiveTrackColor, sliderColors.disabledInactiveTrackColor) && Color.m4219equalsimpl0(this.disabledInactiveTickColor, sliderColors.disabledInactiveTickColor);
    }

    public final int hashCode() {
        int iM4225hashCodeimpl = Color.m4225hashCodeimpl(this.thumbColor);
        int iM4225hashCodeimpl2 = Color.m4225hashCodeimpl(this.activeTrackColor);
        int iM4225hashCodeimpl3 = Color.m4225hashCodeimpl(this.activeTickColor);
        int iM4225hashCodeimpl4 = Color.m4225hashCodeimpl(this.inactiveTrackColor);
        int iM4225hashCodeimpl5 = Color.m4225hashCodeimpl(this.inactiveTickColor);
        int iM4225hashCodeimpl6 = Color.m4225hashCodeimpl(this.disabledThumbColor);
        int iM4225hashCodeimpl7 = Color.m4225hashCodeimpl(this.disabledActiveTrackColor);
        return (((((((((((((((((iM4225hashCodeimpl * 31) + iM4225hashCodeimpl2) * 31) + iM4225hashCodeimpl3) * 31) + iM4225hashCodeimpl4) * 31) + iM4225hashCodeimpl5) * 31) + iM4225hashCodeimpl6) * 31) + iM4225hashCodeimpl7) * 31) + Color.m4225hashCodeimpl(this.disabledActiveTickColor)) * 31) + Color.m4225hashCodeimpl(this.disabledInactiveTrackColor)) * 31) + Color.m4225hashCodeimpl(this.disabledInactiveTickColor);
    }

    /* JADX INFO: renamed from: copy--K518z4, reason: not valid java name */
    public final SliderColors m2381copyK518z4(long p0, long p1, long p2, long p3, long p4, long p5, long p6, long p7, long p8, long p9) {
        return new SliderColors(p0 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.thumbColor : p0, p1 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.activeTrackColor : p1, p2 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.activeTickColor : p2, p3 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.inactiveTrackColor : p3, p4 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.inactiveTickColor : p4, p5 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledThumbColor : p5, p6 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledActiveTrackColor : p6, p7 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledActiveTickColor : p7, p8 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledInactiveTrackColor : p8, p9 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledInactiveTickColor : p9, null);
    }

    public /* synthetic */ SliderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10);
    }
}
