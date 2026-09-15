package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u001a2\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a2\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "p0", "", "p1", "Landroidx/compose/ui/text/style/TextOverflow;", "p2", "", "p3", "finalConstraints-tfFHcEY", "(JZIF)J", "finalConstraints", "", "finalMaxLines-xdlQI24", "(ZII)I", "finalMaxLines", "finalMaxWidth-tfFHcEY", "(JZIF)I", "finalMaxWidth"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LayoutUtilsKt {
    /* JADX INFO: renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m1620finalConstraintstfFHcEY(long j, boolean z, int i, float f) {
        return Constraints.INSTANCE.m6897fitPrioritizingWidthZbe2FdA(0, m1622finalMaxWidthtfFHcEY(j, z, i, f), 0, Constraints.m6887getMaxHeightimpl(j));
    }

    /* JADX INFO: renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m1622finalMaxWidthtfFHcEY(long j, boolean z, int i, float f) {
        int iM6888getMaxWidthimpl = ((z || TextOverflow.m6861equalsimpl0(i, TextOverflow.INSTANCE.m6871getEllipsisgIe3tQ8())) && Constraints.m6884getHasBoundedWidthimpl(j)) ? Constraints.m6888getMaxWidthimpl(j) : Integer.MAX_VALUE;
        return Constraints.m6890getMinWidthimpl(j) == iM6888getMaxWidthimpl ? iM6888getMaxWidthimpl : RangesKt.coerceIn(TextDelegateKt.ceilToIntPx(f), Constraints.m6890getMinWidthimpl(j), iM6888getMaxWidthimpl);
    }

    /* JADX INFO: renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m1621finalMaxLinesxdlQI24(boolean z, int i, int i2) {
        if (z || !TextOverflow.m6861equalsimpl0(i, TextOverflow.INSTANCE.m6871getEllipsisgIe3tQ8())) {
            return RangesKt.coerceAtLeast(i2, 1);
        }
        return 1;
    }
}
