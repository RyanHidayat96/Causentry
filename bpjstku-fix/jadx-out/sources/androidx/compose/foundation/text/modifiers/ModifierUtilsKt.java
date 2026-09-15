package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a&\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "p0", "Landroidx/compose/ui/text/style/TextOverflow;", "p1", "", "maxWidthForTextLayout-R2G3SPE", "(JZI)I", "maxWidthForTextLayout"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ModifierUtilsKt {
    /* JADX INFO: renamed from: maxWidthForTextLayout-R2G3SPE, reason: not valid java name */
    public static final int m1624maxWidthForTextLayoutR2G3SPE(long j, boolean z, int i) {
        if ((z || TextOverflow.m6861equalsimpl0(i, TextOverflow.INSTANCE.m6871getEllipsisgIe3tQ8())) && Constraints.m6884getHasBoundedWidthimpl(j)) {
            return Constraints.m6888getMaxWidthimpl(j);
        }
        return Integer.MAX_VALUE;
    }
}
