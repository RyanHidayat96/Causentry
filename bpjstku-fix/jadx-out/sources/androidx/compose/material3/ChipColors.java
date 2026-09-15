package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\rH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJb\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\rH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\rH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000fJ\u001a\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\rH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u000fR\u001d\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001d\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001d\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u001d\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b*\u0010!R\u001d\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b+\u0010!R\u001d\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b,\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/ChipColors;", "", "Landroidx/compose/ui/graphics/Color;", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "<init>", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "containerColor-vNxB06k$material3_release", "(Z)J", "containerColor", "copy-FD3wquc", "(JJJJJJJJ)Landroidx/compose/material3/ChipColors;", "copy", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "labelColor-vNxB06k$material3_release", "labelColor", "leadingIconContentColor-vNxB06k$material3_release", "leadingIconContentColor", "trailingIconContentColor-vNxB06k$material3_release", "trailingIconContentColor", "J", "getContainerColor-0d7_KjU", "()J", "disabledContainerColor", "getDisabledContainerColor-0d7_KjU", "disabledLabelColor", "getDisabledLabelColor-0d7_KjU", "disabledLeadingIconContentColor", "getDisabledLeadingIconContentColor-0d7_KjU", "disabledTrailingIconContentColor", "getDisabledTrailingIconContentColor-0d7_KjU", "getLabelColor-0d7_KjU", "getLeadingIconContentColor-0d7_KjU", "getTrailingIconContentColor-0d7_KjU"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChipColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconContentColor;
    private final long disabledTrailingIconContentColor;
    private final long labelColor;
    private final long leadingIconContentColor;
    private final long trailingIconContentColor;

    private ChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.containerColor = j;
        this.labelColor = j2;
        this.leadingIconContentColor = j3;
        this.trailingIconContentColor = j4;
        this.disabledContainerColor = j5;
        this.disabledLabelColor = j6;
        this.disabledLeadingIconContentColor = j7;
        this.disabledTrailingIconContentColor = j8;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getLabelColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getLabelColor() {
        return this.labelColor;
    }

    /* JADX INFO: renamed from: getLeadingIconContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getLeadingIconContentColor() {
        return this.leadingIconContentColor;
    }

    /* JADX INFO: renamed from: getTrailingIconContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTrailingIconContentColor() {
        return this.trailingIconContentColor;
    }

    /* JADX INFO: renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledContainerColor() {
        return this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledLabelColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledLabelColor() {
        return this.disabledLabelColor;
    }

    /* JADX INFO: renamed from: getDisabledLeadingIconContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledLeadingIconContentColor() {
        return this.disabledLeadingIconContentColor;
    }

    /* JADX INFO: renamed from: getDisabledTrailingIconContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTrailingIconContentColor() {
        return this.disabledTrailingIconContentColor;
    }

    /* JADX INFO: renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1851containerColorvNxB06k$material3_release(boolean p0) {
        return p0 ? this.containerColor : this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: labelColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1861labelColorvNxB06k$material3_release(boolean p0) {
        return p0 ? this.labelColor : this.disabledLabelColor;
    }

    /* JADX INFO: renamed from: leadingIconContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1862leadingIconContentColorvNxB06k$material3_release(boolean p0) {
        return p0 ? this.leadingIconContentColor : this.disabledLeadingIconContentColor;
    }

    /* JADX INFO: renamed from: trailingIconContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1863trailingIconContentColorvNxB06k$material3_release(boolean p0) {
        return p0 ? this.trailingIconContentColor : this.disabledTrailingIconContentColor;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof ChipColors)) {
            return false;
        }
        ChipColors chipColors = (ChipColors) p0;
        return Color.m4219equalsimpl0(this.containerColor, chipColors.containerColor) && Color.m4219equalsimpl0(this.labelColor, chipColors.labelColor) && Color.m4219equalsimpl0(this.leadingIconContentColor, chipColors.leadingIconContentColor) && Color.m4219equalsimpl0(this.trailingIconContentColor, chipColors.trailingIconContentColor) && Color.m4219equalsimpl0(this.disabledContainerColor, chipColors.disabledContainerColor) && Color.m4219equalsimpl0(this.disabledLabelColor, chipColors.disabledLabelColor) && Color.m4219equalsimpl0(this.disabledLeadingIconContentColor, chipColors.disabledLeadingIconContentColor) && Color.m4219equalsimpl0(this.disabledTrailingIconContentColor, chipColors.disabledTrailingIconContentColor);
    }

    public final int hashCode() {
        int iM4225hashCodeimpl = Color.m4225hashCodeimpl(this.containerColor);
        int iM4225hashCodeimpl2 = Color.m4225hashCodeimpl(this.labelColor);
        int iM4225hashCodeimpl3 = Color.m4225hashCodeimpl(this.leadingIconContentColor);
        int iM4225hashCodeimpl4 = Color.m4225hashCodeimpl(this.trailingIconContentColor);
        int iM4225hashCodeimpl5 = Color.m4225hashCodeimpl(this.disabledContainerColor);
        return (((((((((((((iM4225hashCodeimpl * 31) + iM4225hashCodeimpl2) * 31) + iM4225hashCodeimpl3) * 31) + iM4225hashCodeimpl4) * 31) + iM4225hashCodeimpl5) * 31) + Color.m4225hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m4225hashCodeimpl(this.disabledLeadingIconContentColor)) * 31) + Color.m4225hashCodeimpl(this.disabledTrailingIconContentColor);
    }

    /* JADX INFO: renamed from: copy-FD3wquc, reason: not valid java name */
    public final ChipColors m1852copyFD3wquc(long p0, long p1, long p2, long p3, long p4, long p5, long p6, long p7) {
        return new ChipColors(p0 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.containerColor : p0, p1 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.labelColor : p1, p2 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.leadingIconContentColor : p2, p3 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.trailingIconContentColor : p3, p4 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledContainerColor : p4, p5 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledLabelColor : p5, p6 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledLeadingIconContentColor : p6, p7 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledTrailingIconContentColor : p7, null);
    }

    public /* synthetic */ ChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }
}
