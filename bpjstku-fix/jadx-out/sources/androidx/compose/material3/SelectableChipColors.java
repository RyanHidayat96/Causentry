package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0094\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010 \u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ\"\u0010$\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001fR\u0017\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010&R\u0017\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010&R\u0017\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010&R\u0017\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b)\u0010&R\u0017\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010&R\u0017\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u0010&R\u0017\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010&R\u0017\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010&R\u0017\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u0010&R\u0017\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b.\u0010&R\u0017\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b/\u0010&R\u0017\u00100\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b0\u0010&R\u0017\u00101\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/SelectableChipColors;", "", "Landroidx/compose/ui/graphics/Color;", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "<init>", "(JJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Landroidx/compose/runtime/State;", "containerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "copy-daRQuJA", "(JJJJJJJJJJJJJ)Landroidx/compose/material3/SelectableChipColors;", "copy", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "labelColor-WaAFU9c$material3_release", "(ZZ)J", "labelColor", "leadingIconContentColor-WaAFU9c$material3_release", "leadingIconContentColor", "trailingIconContentColor-WaAFU9c$material3_release", "trailingIconContentColor", "containerColor", "J", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledSelectedContainerColor", "disabledTrailingIconColor", "leadingIconColor", "selectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "trailingIconColor"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SelectableChipColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledSelectedContainerColor;
    private final long disabledTrailingIconColor;
    private final long labelColor;
    private final long leadingIconColor;
    private final long selectedContainerColor;
    private final long selectedLabelColor;
    private final long selectedLeadingIconColor;
    private final long selectedTrailingIconColor;
    private final long trailingIconColor;

    private SelectableChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.containerColor = j;
        this.labelColor = j2;
        this.leadingIconColor = j3;
        this.trailingIconColor = j4;
        this.disabledContainerColor = j5;
        this.disabledLabelColor = j6;
        this.disabledLeadingIconColor = j7;
        this.disabledTrailingIconColor = j8;
        this.selectedContainerColor = j9;
        this.disabledSelectedContainerColor = j10;
        this.selectedLabelColor = j11;
        this.selectedLeadingIconColor = j12;
        this.selectedTrailingIconColor = j13;
    }

    public final State<Color> containerColor$material3_release(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-2126903408);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2126903408, i, -1, "androidx.compose.material3.SelectableChipColors.containerColor (Chip.kt:2564)");
        }
        if (!z) {
            j = z2 ? this.disabledSelectedContainerColor : this.disabledContainerColor;
        } else if (!z2) {
            j = this.containerColor;
        } else {
            j = this.selectedContainerColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4208boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    /* JADX INFO: renamed from: labelColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2359labelColorWaAFU9c$material3_release(boolean p0, boolean p1) {
        if (!p0) {
            return this.disabledLabelColor;
        }
        if (!p1) {
            return this.labelColor;
        }
        return this.selectedLabelColor;
    }

    /* JADX INFO: renamed from: leadingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2360leadingIconContentColorWaAFU9c$material3_release(boolean p0, boolean p1) {
        if (!p0) {
            return this.disabledLeadingIconColor;
        }
        if (!p1) {
            return this.leadingIconColor;
        }
        return this.selectedLeadingIconColor;
    }

    /* JADX INFO: renamed from: trailingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2361trailingIconContentColorWaAFU9c$material3_release(boolean p0, boolean p1) {
        if (!p0) {
            return this.disabledTrailingIconColor;
        }
        if (!p1) {
            return this.trailingIconColor;
        }
        return this.selectedTrailingIconColor;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof SelectableChipColors)) {
            return false;
        }
        SelectableChipColors selectableChipColors = (SelectableChipColors) p0;
        return Color.m4219equalsimpl0(this.containerColor, selectableChipColors.containerColor) && Color.m4219equalsimpl0(this.labelColor, selectableChipColors.labelColor) && Color.m4219equalsimpl0(this.leadingIconColor, selectableChipColors.leadingIconColor) && Color.m4219equalsimpl0(this.trailingIconColor, selectableChipColors.trailingIconColor) && Color.m4219equalsimpl0(this.disabledContainerColor, selectableChipColors.disabledContainerColor) && Color.m4219equalsimpl0(this.disabledLabelColor, selectableChipColors.disabledLabelColor) && Color.m4219equalsimpl0(this.disabledLeadingIconColor, selectableChipColors.disabledLeadingIconColor) && Color.m4219equalsimpl0(this.disabledTrailingIconColor, selectableChipColors.disabledTrailingIconColor) && Color.m4219equalsimpl0(this.selectedContainerColor, selectableChipColors.selectedContainerColor) && Color.m4219equalsimpl0(this.disabledSelectedContainerColor, selectableChipColors.disabledSelectedContainerColor) && Color.m4219equalsimpl0(this.selectedLabelColor, selectableChipColors.selectedLabelColor) && Color.m4219equalsimpl0(this.selectedLeadingIconColor, selectableChipColors.selectedLeadingIconColor) && Color.m4219equalsimpl0(this.selectedTrailingIconColor, selectableChipColors.selectedTrailingIconColor);
    }

    public final int hashCode() {
        int iM4225hashCodeimpl = Color.m4225hashCodeimpl(this.containerColor);
        int iM4225hashCodeimpl2 = Color.m4225hashCodeimpl(this.labelColor);
        int iM4225hashCodeimpl3 = Color.m4225hashCodeimpl(this.leadingIconColor);
        int iM4225hashCodeimpl4 = Color.m4225hashCodeimpl(this.trailingIconColor);
        int iM4225hashCodeimpl5 = Color.m4225hashCodeimpl(this.disabledContainerColor);
        int iM4225hashCodeimpl6 = Color.m4225hashCodeimpl(this.disabledLabelColor);
        int iM4225hashCodeimpl7 = Color.m4225hashCodeimpl(this.disabledLeadingIconColor);
        int iM4225hashCodeimpl8 = Color.m4225hashCodeimpl(this.disabledTrailingIconColor);
        int iM4225hashCodeimpl9 = Color.m4225hashCodeimpl(this.selectedContainerColor);
        int iM4225hashCodeimpl10 = Color.m4225hashCodeimpl(this.disabledSelectedContainerColor);
        return (((((((((((((((((((((((iM4225hashCodeimpl * 31) + iM4225hashCodeimpl2) * 31) + iM4225hashCodeimpl3) * 31) + iM4225hashCodeimpl4) * 31) + iM4225hashCodeimpl5) * 31) + iM4225hashCodeimpl6) * 31) + iM4225hashCodeimpl7) * 31) + iM4225hashCodeimpl8) * 31) + iM4225hashCodeimpl9) * 31) + iM4225hashCodeimpl10) * 31) + Color.m4225hashCodeimpl(this.selectedLabelColor)) * 31) + Color.m4225hashCodeimpl(this.selectedLeadingIconColor)) * 31) + Color.m4225hashCodeimpl(this.selectedTrailingIconColor);
    }

    /* JADX INFO: renamed from: copy-daRQuJA, reason: not valid java name */
    public final SelectableChipColors m2358copydaRQuJA(long p0, long p1, long p2, long p3, long p4, long p5, long p6, long p7, long p8, long p9, long p10, long p11, long p12) {
        return new SelectableChipColors(p0 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.containerColor : p0, p1 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.labelColor : p1, p2 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.leadingIconColor : p2, p3 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.trailingIconColor : p3, p4 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledContainerColor : p4, p5 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledLabelColor : p5, p6 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledLeadingIconColor : p6, p7 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledTrailingIconColor : p7, p8 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.selectedContainerColor : p8, p9 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledSelectedContainerColor : p9, p10 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.selectedLabelColor : p10, p11 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.selectedLeadingIconColor : p11, p12 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.selectedTrailingIconColor : p12, null);
    }

    public /* synthetic */ SelectableChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13);
    }
}
