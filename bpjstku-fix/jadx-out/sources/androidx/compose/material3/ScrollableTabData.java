package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0011\u001a\u00020\t*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/material3/ScrollableTabData;", "", "Landroidx/compose/foundation/ScrollState;", "p0", "Lkotlinx/coroutines/CoroutineScope;", "p1", "<init>", "(Landroidx/compose/foundation/ScrollState;Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/ui/unit/Density;", "", "", "Landroidx/compose/material3/TabPosition;", "p2", "p3", "", "onLaidOut", "(Landroidx/compose/ui/unit/Density;ILjava/util/List;I)V", "calculateTabOffset", "(Landroidx/compose/material3/TabPosition;Landroidx/compose/ui/unit/Density;ILjava/util/List;)I", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "selectedTab", "Ljava/lang/Integer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ScrollableTabData {
    private final CoroutineScope coroutineScope;
    private final ScrollState scrollState;
    private Integer selectedTab;

    public ScrollableTabData(ScrollState scrollState, CoroutineScope coroutineScope) {
        this.scrollState = scrollState;
        this.coroutineScope = coroutineScope;
    }

    public final void onLaidOut(Density p0, int p1, List<TabPosition> p2, int p3) {
        int iCalculateTabOffset;
        Integer num = this.selectedTab;
        if (num == null || num.intValue() != p3) {
            this.selectedTab = Integer.valueOf(p3);
            TabPosition tabPosition = (TabPosition) CollectionsKt.getOrNull(p2, p3);
            if (tabPosition == null || this.scrollState.getValue() == (iCalculateTabOffset = calculateTabOffset(tabPosition, p0, p1, p2))) {
                return;
            }
            b.TuitionPaymentFragmentbindingInflater1(this.coroutineScope, null, null, new ScrollableTabData$onLaidOut$1$1(this, iCalculateTabOffset, null), 3, null);
        }
    }

    private final int calculateTabOffset(TabPosition tabPosition, Density density, int i, List<TabPosition> list) {
        int iMo688roundToPx0680j_4 = density.mo688roundToPx0680j_4(((TabPosition) CollectionsKt.last((List) list)).m2549getRightD9Ej5fM()) + i;
        int maxValue = iMo688roundToPx0680j_4 - this.scrollState.getMaxValue();
        return RangesKt.coerceIn(density.mo688roundToPx0680j_4(tabPosition.getLeft()) - ((maxValue / 2) - (density.mo688roundToPx0680j_4(tabPosition.getWidth()) / 2)), 0, RangesKt.coerceAtLeast(iMo688roundToPx0680j_4 - maxValue, 0));
    }
}
