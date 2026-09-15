package androidx.compose.ui.node;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"$\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/cancelAll;", "DepthComparator", "Ljava/util/Comparator;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DepthSortedSetKt {
    private static final Comparator<LayoutNode> DepthComparator = new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSetKt$DepthComparator$1
        @Override // java.util.Comparator
        public final int compare(LayoutNode p0, LayoutNode p1) {
            int iCompare = Intrinsics.compare(p0.getDepth(), p1.getDepth());
            return iCompare != 0 ? iCompare : Intrinsics.compare(p0.hashCode(), p1.hashCode());
        }
    };
}
