package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u009f\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00050)8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010(R\u0011\u00102\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b0\u00101R\"\u00103\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00101\"\u0004\b6\u00107R\u001d\u00108\u001a\u00020\u00128\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010<\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010J\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\"\u0010N\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010&\u001a\u0004\bO\u0010(\"\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u00058\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010(R\u001a\u0010T\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bT\u0010&\u001a\u0004\bU\u0010(R\u001a\u0010V\u001a\u00020\u001a8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010Z\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u00104\u001a\u0004\b[\u00101R\u001a\u0010\\\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\\\u00104\u001a\u0004\b]\u00101R'\u0010c\u001a\u0015\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020 \u0018\u00010^¢\u0006\u0002\b`8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\ba\u0010bR\u001a\u0010d\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010=\u001a\u0004\be\u0010?R\u001a\u0010f\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bf\u0010&\u001a\u0004\bg\u0010(R\u001a\u0010h\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bh\u0010&\u001a\u0004\bi\u0010(R\u0017\u0010l\u001a\u00020j8WX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bk\u0010;R\u001a\u0010m\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bm\u0010&\u001a\u0004\bn\u0010(R \u0010o\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020\u00058\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bs\u0010(\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "p0", "", "p1", "", "p2", "", "p3", "p4", "p5", "p6", "Lkotlinx/coroutines/CoroutineScope;", "p7", "Landroidx/compose/ui/unit/Density;", "p8", "Landroidx/compose/ui/unit/Constraints;", "p9", "", "p10", "p11", "p12", "p13", "p14", "Landroidx/compose/foundation/gestures/Orientation;", "p15", "p16", "p17", "<init>", "(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;FZLkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/unit/Density;JLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "placeChildren", "()V", "tryToApplyScrollWithoutRemeasure", "(IZ)Z", "afterContentPadding", "I", "getAfterContentPadding", "()I", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getBeforeContentPadding", "beforeContentPadding", "getCanScrollBackward", "()Z", "canScrollBackward", "canScrollForward", "Z", "getCanScrollForward", "setCanScrollForward", "(Z)V", "childConstraints", "J", "getChildConstraints-msEJaDk", "()J", "consumedScroll", "F", "getConsumedScroll", "()F", "setConsumedScroll", "(F)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "firstVisibleItem", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "getFirstVisibleItem", "()Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "firstVisibleItemScrollOffset", "getFirstVisibleItemScrollOffset", "setFirstVisibleItemScrollOffset", "(I)V", "getHeight", "height", "mainAxisItemSpacing", "getMainAxisItemSpacing", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "remeasureNeeded", "getRemeasureNeeded", "reverseLayout", "getReverseLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "getRulers", "()Lkotlin/jvm/functions/Function1;", "rulers", "scrollBackAmount", "getScrollBackAmount", "totalItemsCount", "getTotalItemsCount", "viewportEndOffset", "getViewportEndOffset", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "viewportSize", "viewportStartOffset", "getViewportStartOffset", "visibleItemsInfo", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "getWidth", "width"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyListMeasureResult implements LazyListLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final /* synthetic */ MeasureResult $$delegate_0;
    private final int afterContentPadding;
    private boolean canScrollForward;
    private final long childConstraints;
    private float consumedScroll;
    private final CoroutineScope coroutineScope;
    private final Density density;
    private final LazyListMeasuredItem firstVisibleItem;
    private int firstVisibleItemScrollOffset;
    private final int mainAxisItemSpacing;
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final float scrollBackAmount;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<LazyListMeasuredItem> visibleItemsInfo;

    private LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i, boolean z, float f, MeasureResult measureResult, float f2, boolean z2, CoroutineScope coroutineScope, Density density, long j, List<LazyListMeasuredItem> list, int i2, int i3, int i4, boolean z3, Orientation orientation, int i5, int i6) {
        this.firstVisibleItem = lazyListMeasuredItem;
        this.firstVisibleItemScrollOffset = i;
        this.canScrollForward = z;
        this.consumedScroll = f;
        this.scrollBackAmount = f2;
        this.remeasureNeeded = z2;
        this.coroutineScope = coroutineScope;
        this.density = density;
        this.childConstraints = j;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i2;
        this.viewportEndOffset = i3;
        this.totalItemsCount = i4;
        this.reverseLayout = z3;
        this.orientation = orientation;
        this.afterContentPadding = i5;
        this.mainAxisItemSpacing = i6;
        this.$$delegate_0 = measureResult;
    }

    public final LazyListMeasuredItem getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    public final void setFirstVisibleItemScrollOffset(int i) {
        this.firstVisibleItemScrollOffset = i;
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

    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
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

    /* JADX INFO: renamed from: getChildConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final List<LazyListMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    public final boolean getCanScrollBackward() {
        LazyListMeasuredItem lazyListMeasuredItem = this.firstVisibleItem;
        return ((lazyListMeasuredItem == null || lazyListMeasuredItem.getIndex() == 0) && this.firstVisibleItemScrollOffset == 0) ? false : true;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    public final long mo1107getViewportSizeYbymL2g() {
        return IntSizeKt.IntSize(get$width(), get$height());
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (java.lang.Math.min((r0.getOffset() + r0.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (r2.getOffset() + r2.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-r8)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (java.lang.Math.min(getViewportStartOffset() - r0.getOffset(), getViewportEndOffset() - r2.getOffset()) > r8) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        r7.firstVisibleItemScrollOffset -= r8;
        r0 = getVisibleItemsInfo();
        r2 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        if (r1 >= r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        r0.get(r1).applyScrollDelta(r8, r9);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        r7.consumedScroll = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        if (r7.canScrollForward != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        if (r8 <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        r7.canScrollForward = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean tryToApplyScrollWithoutRemeasure(int r8, boolean r9) {
        /*
            r7 = this;
            boolean r0 = r7.remeasureNeeded
            r1 = 0
            if (r0 != 0) goto La4
            java.util.List r0 = r7.getVisibleItemsInfo()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La4
            androidx.compose.foundation.lazy.LazyListMeasuredItem r0 = r7.firstVisibleItem
            if (r0 == 0) goto La4
            int r0 = r0.getMainAxisSizeWithSpacings()
            int r2 = r7.firstVisibleItemScrollOffset
            int r2 = r2 - r8
            if (r2 < 0) goto La4
            if (r2 >= r0) goto La4
            java.util.List r0 = r7.getVisibleItemsInfo()
            java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r0)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r0 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r0
            java.util.List r2 = r7.getVisibleItemsInfo()
            java.lang.Object r2 = kotlin.collections.CollectionsKt.last(r2)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r2 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r2
            boolean r3 = r0.getNonScrollableItem()
            if (r3 != 0) goto La4
            boolean r3 = r2.getNonScrollableItem()
            if (r3 != 0) goto La4
            if (r8 >= 0) goto L64
            int r3 = r0.getOffset()
            int r0 = r0.getMainAxisSizeWithSpacings()
            int r4 = r7.getViewportStartOffset()
            int r5 = r2.getOffset()
            int r2 = r2.getMainAxisSizeWithSpacings()
            int r6 = r7.getViewportEndOffset()
            int r3 = r3 + r0
            int r3 = r3 - r4
            int r5 = r5 + r2
            int r5 = r5 - r6
            int r0 = java.lang.Math.min(r3, r5)
            int r2 = -r8
            if (r0 <= r2) goto La4
            goto L7c
        L64:
            int r3 = r7.getViewportStartOffset()
            int r0 = r0.getOffset()
            int r4 = r7.getViewportEndOffset()
            int r2 = r2.getOffset()
            int r3 = r3 - r0
            int r4 = r4 - r2
            int r0 = java.lang.Math.min(r3, r4)
            if (r0 <= r8) goto La4
        L7c:
            int r0 = r7.firstVisibleItemScrollOffset
            int r0 = r0 - r8
            r7.firstVisibleItemScrollOffset = r0
            java.util.List r0 = r7.getVisibleItemsInfo()
            int r2 = r0.size()
        L89:
            if (r1 >= r2) goto L97
            java.lang.Object r3 = r0.get(r1)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r3 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r3
            r3.applyScrollDelta(r8, r9)
            int r1 = r1 + 1
            goto L89
        L97:
            float r9 = (float) r8
            r7.consumedScroll = r9
            boolean r9 = r7.canScrollForward
            r0 = 1
            if (r9 != 0) goto La3
            if (r8 <= 0) goto La3
            r7.canScrollForward = r0
        La3:
            return r0
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureResult.tryToApplyScrollWithoutRemeasure(int, boolean):boolean");
    }

    public /* synthetic */ LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i, boolean z, float f, MeasureResult measureResult, float f2, boolean z2, CoroutineScope coroutineScope, Density density, long j, List list, int i2, int i3, int i4, boolean z3, Orientation orientation, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyListMeasuredItem, i, z, f, measureResult, f2, z2, coroutineScope, density, j, list, i2, i3, i4, z3, orientation, i5, i6);
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.$$delegate_0.getAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* JADX INFO: renamed from: getHeight */
    public final int get$height() {
        return this.$$delegate_0.get$height();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final Function1<RulerScope, Unit> getRulers() {
        return this.$$delegate_0.getRulers();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* JADX INFO: renamed from: getWidth */
    public final int get$width() {
        return this.$$delegate_0.get$width();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void placeChildren() {
        this.$$delegate_0.placeChildren();
    }
}
