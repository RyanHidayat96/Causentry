package androidx.compose.ui.semantics;

import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001aO\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001ag\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00000\tj\b\u0012\u0004\u0012\u00020\u0000`\n2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00050\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001aS\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00052\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00050\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aS\u0010\u0016\u001a\u00020\u00022:\u0010\u0003\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00150\u00130\tj\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00150\u0013`\n2\u0006\u0010\u0004\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"*\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00000\u0019j\b\u0012\u0004\u0012\u00020\u0000`\u001a0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"&\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Function1;", "", "p0", "p1", "", "p2", "subtreeSortedByGeometryGrouping", "(Landroidx/compose/ui/semantics/SemanticsNode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ljava/util/List;", "Ljava/util/ArrayList;", "Lkotlin/collections/b;", "Landroidx/collection/MutableIntObjectMap;", "p3", "", "geometryDepthFirstSearch", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/collection/MutableIntObjectMap;)V", "Landroidx/collection/IntObjectMap;", "sortByGeometryGroupings", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/collection/IntObjectMap;)Ljava/util/List;", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Rect;", "", "placedEntryRowOverlaps", "(Ljava/util/ArrayList;Landroidx/compose/ui/semantics/SemanticsNode;)Z", "", "Ljava/util/Comparator;", "Lkotlin/cancelAll;", "semanticComparators", "[Ljava/util/Comparator;", "Lkotlin/Function2;", "", "UnmergedConfigComparator", "Lkotlin/jvm/functions/Function2;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SemanticsSortKt {
    private static final Function2<SemanticsNode, SemanticsNode, Integer> UnmergedConfigComparator;
    private static final Comparator<SemanticsNode>[] semanticComparators;

    public static final List<SemanticsNode> subtreeSortedByGeometryGrouping(SemanticsNode semanticsNode, Function1<? super SemanticsNode, Boolean> function1, Function1<? super SemanticsNode, Boolean> function2, List<SemanticsNode> list) {
        MutableIntObjectMap mutableIntObjectMapMutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            geometryDepthFirstSearch(list.get(i), arrayList, function1, function2, mutableIntObjectMapMutableIntObjectMapOf);
        }
        return sortByGeometryGroupings(semanticsNode, arrayList, function2, mutableIntObjectMapMutableIntObjectMapOf);
    }

    private static final void geometryDepthFirstSearch(SemanticsNode semanticsNode, ArrayList<SemanticsNode> arrayList, Function1<? super SemanticsNode, Boolean> function1, Function1<? super SemanticsNode, Boolean> function2, MutableIntObjectMap<List<SemanticsNode>> mutableIntObjectMap) {
        boolean zBooleanValue = ((Boolean) semanticsNode.getUnmergedConfig().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), new Function0<Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue();
        if ((zBooleanValue || function2.invoke(semanticsNode).booleanValue()) && function1.invoke(semanticsNode).booleanValue()) {
            arrayList.add(semanticsNode);
        }
        if (zBooleanValue) {
            mutableIntObjectMap.set(semanticsNode.getId(), subtreeSortedByGeometryGrouping(semanticsNode, function1, function2, semanticsNode.getChildren()));
            return;
        }
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            geometryDepthFirstSearch(children.get(i), arrayList, function1, function2, mutableIntObjectMap);
        }
    }

    public static /* synthetic */ List sortByGeometryGroupings$default(SemanticsNode semanticsNode, List list, Function1 function1, IntObjectMap intObjectMap, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<SemanticsNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsSortKt.sortByGeometryGroupings.1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(SemanticsNode semanticsNode2) {
                    return Boolean.FALSE;
                }
            };
        }
        if ((i & 4) != 0) {
            intObjectMap = IntObjectMapKt.intObjectMapOf();
        }
        return sortByGeometryGroupings(semanticsNode, list, function1, intObjectMap);
    }

    public static final List<SemanticsNode> sortByGeometryGroupings(SemanticsNode semanticsNode, List<SemanticsNode> list, Function1<? super SemanticsNode, Boolean> function1, IntObjectMap<List<SemanticsNode>> intObjectMap) {
        int size = 0;
        char c = semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl ? (char) 1 : (char) 0;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        int lastIndex = CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                SemanticsNode semanticsNode2 = list.get(i);
                if (i == 0 || !placedEntryRowOverlaps(arrayList, semanticsNode2)) {
                    arrayList.add(new Pair(semanticsNode2.getBoundsInWindow(), CollectionsKt.mutableListOf(semanticsNode2)));
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        ArrayList arrayList2 = arrayList;
        CollectionsKt.sortWith(arrayList2, TopBottomBoundsComparator.INSTANCE);
        ArrayList arrayList3 = new ArrayList();
        Comparator<SemanticsNode> comparator = semanticComparators[c ^ 1];
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Pair pair = (Pair) arrayList2.get(i2);
            CollectionsKt.sortWith((List) pair.getSecond(), comparator);
            arrayList3.addAll((Collection) pair.getSecond());
        }
        ArrayList arrayList4 = arrayList3;
        final Function2<SemanticsNode, SemanticsNode, Integer> function2 = UnmergedConfigComparator;
        CollectionsKt.sortWith(arrayList4, new Comparator() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SemanticsSortKt.sortByGeometryGroupings$lambda$3(function2, obj, obj2);
            }
        });
        while (size <= CollectionsKt.getLastIndex(arrayList4)) {
            List<SemanticsNode> list2 = intObjectMap.get(((SemanticsNode) arrayList3.get(size)).getId());
            if (list2 != null) {
                if (function1.invoke(arrayList3.get(size)).booleanValue()) {
                    size++;
                } else {
                    arrayList3.remove(size);
                }
                arrayList3.addAll(size, list2);
                size += list2.size();
            } else {
                size++;
            }
        }
        return arrayList4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByGeometryGroupings$lambda$3(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    private static final boolean placedEntryRowOverlaps(ArrayList<Pair<Rect, List<SemanticsNode>>> arrayList, SemanticsNode semanticsNode) {
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        boolean z = top >= bottom;
        int lastIndex = CollectionsKt.getLastIndex(arrayList);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                Rect first = arrayList.get(i).getFirst();
                boolean z2 = first.getTop() >= first.getBottom();
                if (!z && !z2 && Math.max(top, first.getTop()) < Math.min(bottom, first.getBottom())) {
                    arrayList.set(i, new Pair<>(first.intersect(0.0f, top, Float.POSITIVE_INFINITY, bottom), arrayList.get(i).getSecond()));
                    arrayList.get(i).getSecond().add(semanticsNode);
                    return true;
                }
                if (i != lastIndex) {
                    i++;
                }
            }
        }
        return false;
    }

    static {
        Comparator comparator;
        Comparator<SemanticsNode>[] comparatorArr = new Comparator[2];
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                comparator = RtlBoundsComparator.INSTANCE;
            } else {
                comparator = LtrBoundsComparator.INSTANCE;
            }
            final Comparator comparator2 = comparator;
            final Comparator<LayoutNode> zComparator$ui_release = LayoutNode.INSTANCE.getZComparator$ui_release();
            final Comparator comparator3 = new Comparator() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int iCompare = comparator2.compare(t, t2);
                    return iCompare != 0 ? iCompare : zComparator$ui_release.compare(((SemanticsNode) t).getLayoutNode(), ((SemanticsNode) t2).getLayoutNode());
                }
            };
            comparatorArr[i] = new Comparator() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int iCompare = comparator3.compare(t, t2);
                    return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(Integer.valueOf(((SemanticsNode) t).getId()), Integer.valueOf(((SemanticsNode) t2).getId()));
                }
            };
        }
        semanticComparators = comparatorArr;
        UnmergedConfigComparator = new Function2<SemanticsNode, SemanticsNode, Integer>() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
                return Integer.valueOf(Float.compare(((Number) semanticsNode.getUnmergedConfig().getOrElse(SemanticsProperties.INSTANCE.getTraversalIndex(), new Function0<Float>() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue(), ((Number) semanticsNode2.getUnmergedConfig().getOrElse(SemanticsProperties.INSTANCE.getTraversalIndex(), new Function0<Float>() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue()));
            }
        };
    }
}
