package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BÂ\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012)\u0010\u0017\u001a%\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0013\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00150\u00140\u0012\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u00101\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00050-8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010,R\u0011\u00106\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b4\u00105R\"\u00107\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u00105\"\u0004\b:\u0010;R\"\u0010<\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010J\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\"\u0010N\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010*\u001a\u0004\bO\u0010,\"\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u00058\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010,R\u001a\u0010T\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bT\u0010*\u001a\u0004\bU\u0010,R\u001a\u0010V\u001a\u00020\u001e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR=\u0010Z\u001a%\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0013\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00150\u00140\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010^\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b^\u00108\u001a\u0004\b_\u00105R\u001a\u0010`\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b`\u00108\u001a\u0004\ba\u00105R'\u0010e\u001a\u0015\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020$\u0018\u00010\u0012¢\u0006\u0002\bc8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bd\u0010]R\u001a\u0010f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010*\u001a\u0004\bg\u0010,R\u001a\u0010h\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bh\u0010*\u001a\u0004\bi\u0010,R\u001a\u0010j\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bj\u0010*\u001a\u0004\bk\u0010,R\u0017\u0010o\u001a\u00020l8WX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bm\u0010nR\u001a\u0010p\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bp\u0010*\u001a\u0004\bq\u0010,R \u0010r\u001a\b\u0012\u0004\u0012\u00020\u00180\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020\u00058\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bv\u0010,\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "p0", "", "p1", "", "p2", "", "p3", "p4", "p5", "Lkotlinx/coroutines/CoroutineScope;", "p6", "Landroidx/compose/ui/unit/Density;", "p7", "p8", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/Constraints;", "p9", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "p10", "p11", "p12", "p13", "p14", "Landroidx/compose/foundation/gestures/Orientation;", "p15", "p16", "p17", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;IZFLandroidx/compose/ui/layout/MeasureResult;ZLkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function1;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V", "", "placeChildren", "()V", "tryToApplyScrollWithoutRemeasure", "(I)Z", "afterContentPadding", "I", "getAfterContentPadding", "()I", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getBeforeContentPadding", "beforeContentPadding", "getCanScrollBackward", "()Z", "canScrollBackward", "canScrollForward", "Z", "getCanScrollForward", "setCanScrollForward", "(Z)V", "consumedScroll", "F", "getConsumedScroll", "()F", "setConsumedScroll", "(F)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "firstVisibleLine", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "getFirstVisibleLine", "()Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "firstVisibleLineScrollOffset", "getFirstVisibleLineScrollOffset", "setFirstVisibleLineScrollOffset", "(I)V", "getHeight", "height", "mainAxisItemSpacing", "getMainAxisItemSpacing", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "prefetchInfoRetriever", "Lkotlin/jvm/functions/Function1;", "getPrefetchInfoRetriever", "()Lkotlin/jvm/functions/Function1;", "remeasureNeeded", "getRemeasureNeeded", "reverseLayout", "getReverseLayout", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "getRulers", "rulers", "slotsPerLine", "getSlotsPerLine", "totalItemsCount", "getTotalItemsCount", "viewportEndOffset", "getViewportEndOffset", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "viewportStartOffset", "getViewportStartOffset", "visibleItemsInfo", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "getWidth", "width"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyGridMeasureResult implements LazyGridLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final /* synthetic */ MeasureResult $$delegate_0;
    private final int afterContentPadding;
    private boolean canScrollForward;
    private float consumedScroll;
    private final CoroutineScope coroutineScope;
    private final Density density;
    private final LazyGridMeasuredLine firstVisibleLine;
    private int firstVisibleLineScrollOffset;
    private final int mainAxisItemSpacing;
    private final Orientation orientation;
    private final Function1<Integer, List<Pair<Integer, Constraints>>> prefetchInfoRetriever;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final int slotsPerLine;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<LazyGridMeasuredItem> visibleItemsInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridMeasureResult(LazyGridMeasuredLine lazyGridMeasuredLine, int i, boolean z, float f, MeasureResult measureResult, boolean z2, CoroutineScope coroutineScope, Density density, int i2, Function1<? super Integer, ? extends List<Pair<Integer, Constraints>>> function1, List<LazyGridMeasuredItem> list, int i3, int i4, int i5, boolean z3, Orientation orientation, int i6, int i7) {
        this.firstVisibleLine = lazyGridMeasuredLine;
        this.firstVisibleLineScrollOffset = i;
        this.canScrollForward = z;
        this.consumedScroll = f;
        this.remeasureNeeded = z2;
        this.coroutineScope = coroutineScope;
        this.density = density;
        this.slotsPerLine = i2;
        this.prefetchInfoRetriever = function1;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i3;
        this.viewportEndOffset = i4;
        this.totalItemsCount = i5;
        this.reverseLayout = z3;
        this.orientation = orientation;
        this.afterContentPadding = i6;
        this.mainAxisItemSpacing = i7;
        this.$$delegate_0 = measureResult;
    }

    public final LazyGridMeasuredLine getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    public final void setFirstVisibleLineScrollOffset(int i) {
        this.firstVisibleLineScrollOffset = i;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final void setCanScrollForward(boolean z) {
        this.canScrollForward = z;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    public final void setConsumedScroll(float f) {
        this.consumedScroll = f;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final Function1<Integer, List<Pair<Integer, Constraints>>> getPrefetchInfoRetriever() {
        return this.prefetchInfoRetriever;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final List<LazyGridMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    public final boolean getCanScrollBackward() {
        LazyGridMeasuredLine lazyGridMeasuredLine = this.firstVisibleLine;
        return ((lazyGridMeasuredLine == null || lazyGridMeasuredLine.getIndex() == 0) && this.firstVisibleLineScrollOffset == 0) ? false : true;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    public final long mo1142getViewportSizeYbymL2g() {
        return IntSizeKt.IntSize(get$w(), get$h());
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0098  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a7 A[LOOP:0: B:23:0x00a5->B:24:0x00a7, LOOP_END] */
    public final boolean tryToApplyScrollWithoutRemeasure(int p0) {
        LazyGridMeasuredLine lazyGridMeasuredLine;
        List<LazyGridMeasuredItem> visibleItemsInfo;
        int size;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (!this.remeasureNeeded && !getVisibleItemsInfo().isEmpty() && (lazyGridMeasuredLine = this.firstVisibleLine) != null) {
            int mainAxisSizeWithSpacings = lazyGridMeasuredLine.getMainAxisSizeWithSpacings();
            int i = this.firstVisibleLineScrollOffset - p0;
            if (i >= 0 && i < mainAxisSizeWithSpacings) {
                LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) CollectionsKt.first((List) getVisibleItemsInfo());
                LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) CollectionsKt.last((List) getVisibleItemsInfo());
                if (!lazyGridMeasuredItem.getNonScrollableItem() && !lazyGridMeasuredItem2.getNonScrollableItem()) {
                    if (p0 < 0) {
                        if (Math.min((LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem, getOrientation()) + lazyGridMeasuredItem.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem2, getOrientation()) + lazyGridMeasuredItem2.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-p0)) {
                            this.firstVisibleLineScrollOffset -= p0;
                            visibleItemsInfo = getVisibleItemsInfo();
                            size = visibleItemsInfo.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                visibleItemsInfo.get(i2).applyScrollDelta(p0);
                            }
                            this.consumedScroll = p0;
                            z = true;
                            z = true;
                            z = true;
                            if (!this.canScrollForward && p0 > 0) {
                                this.canScrollForward = true;
                            }
                        }
                    } else if (Math.min(getViewportStartOffset() - LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem, getOrientation()), getViewportEndOffset() - LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem2, getOrientation())) > p0) {
                        this.firstVisibleLineScrollOffset -= p0;
                        visibleItemsInfo = getVisibleItemsInfo();
                        size = visibleItemsInfo.size();
                        while (i2 < size) {
                            visibleItemsInfo.get(i2).applyScrollDelta(p0);
                        }
                        this.consumedScroll = p0;
                        z = true;
                        z = true;
                        z = true;
                        if (!this.canScrollForward) {
                            this.canScrollForward = true;
                        }
                    }
                }
            }
        }
        return z;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.$$delegate_0.getAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* JADX INFO: renamed from: getHeight */
    public final int get$h() {
        return this.$$delegate_0.get$h();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final Function1<RulerScope, Unit> getRulers() {
        return this.$$delegate_0.getRulers();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* JADX INFO: renamed from: getWidth */
    public final int get$w() {
        return this.$$delegate_0.get$w();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void placeChildren() {
        this.$$delegate_0.placeChildren();
    }
}
