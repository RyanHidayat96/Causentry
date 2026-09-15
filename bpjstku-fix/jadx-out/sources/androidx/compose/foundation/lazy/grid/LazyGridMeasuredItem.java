package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020&¢\u0006\u0004\b'\u0010(J/\u0010)\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*J=\u0010)\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b)\u0010+J\u0015\u0010,\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b,\u0010 J+\u00100\u001a\u00020\u0013*\u00020\u00132\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030-H\u0082\bø\u0001\u0000¢\u0006\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00102R$\u00106\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00108R\u001d\u00109\u001a\u00020\u00188\u0017X\u0097\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010=\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u00102\u001a\u0004\bB\u00108R\u001a\u0010C\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\bC\u00102\u001a\u0004\bD\u00108R\u001a\u0010E\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bE\u0010GR\u001a\u0010H\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bH\u0010>\u001a\u0004\bI\u0010@R\u001a\u0010J\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\bJ\u00102\u001a\u0004\bK\u00108R\u0014\u0010L\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u00102R\u001a\u0010O\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u00102\u001a\u0004\bP\u00108R\u001a\u0010Q\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\bQ\u00102\u001a\u0004\bR\u00108R\u0016\u0010S\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u00102R\u0016\u0010T\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u00102R\"\u0010U\u001a\u00020\u00078\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bU\u0010F\u001a\u0004\bV\u0010G\"\u0004\bW\u0010XR'\u0010Y\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00138\u0017@RX\u0097\u000eø\u0001\u0001¢\u0006\f\n\u0004\bY\u0010:\u001a\u0004\bZ\u0010<R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u00108R\u0014\u0010_\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b_\u0010FR$\u0010`\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b`\u00102\u001a\u0004\ba\u00108R\u001d\u0010c\u001a\u00020b8\u0017X\u0097\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bc\u0010:\u001a\u0004\bd\u0010<R\u001a\u0010e\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\be\u00102\u001a\u0004\bf\u00108R\u0017\u0010g\u001a\u00020\u00138\u0002X\u0083\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bg\u0010:R\u0018\u0010j\u001a\u00020\u0003*\u00020\u00138CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0018\u0010O\u001a\u00020\u0003*\u00020\u00118CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010k\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "p0", "", "p1", "", "p2", "p3", "p4", "p5", "Landroidx/compose/ui/unit/LayoutDirection;", "p6", "p7", "p8", "", "Landroidx/compose/ui/layout/Placeable;", "p9", "Landroidx/compose/ui/unit/IntOffset;", "p10", "p11", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "p12", "Landroidx/compose/ui/unit/Constraints;", "p13", "p14", "p15", "<init>", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "applyScrollDelta", "(I)V", "getOffset-Bjo55l4", "(I)J", "getOffset", "getParentData", "(I)Ljava/lang/Object;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "position", "(IIII)V", "(IIIIII)V", "updateMainAxisLayoutSize", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "copy", "afterContentPadding", "I", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "beforeContentPadding", "column", "getColumn", "()I", "constraints", "J", "getConstraints-msEJaDk", "()J", "contentType", "Ljava/lang/Object;", "getContentType", "()Ljava/lang/Object;", "crossAxisSize", "getCrossAxisSize", FirebaseAnalytics.Param.INDEX, "getIndex", "isVertical", "Z", "()Z", "key", "getKey", "lane", "getLane", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "mainAxisLayoutSize", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "maxMainAxisOffset", "minMainAxisOffset", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "(Z)V", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset-nOcc-ac", "placeables", "Ljava/util/List;", "getPlaceablesCount", "placeablesCount", "reverseLayout", "row", "getRow", "Landroidx/compose/ui/unit/IntSize;", "size", "getSize-YbymL2g", "span", "getSpan", "visualOffset", "getMainAxis--gyyYBs", "(J)I", "mainAxis", "(Landroidx/compose/ui/layout/Placeable;)I"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyGridMeasuredItem implements LazyGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private int column;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private int row;
    private final long size;
    private final int span;
    private final long visualOffset;

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List<? extends Placeable> list, long j, Object obj2, LazyLayoutItemAnimator<LazyGridMeasuredItem> lazyLayoutItemAnimator, long j2, int i6, int i7) {
        long jIntSize;
        this.index = i;
        this.key = obj;
        this.isVertical = z;
        this.crossAxisSize = i2;
        this.reverseLayout = z2;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i4;
        this.afterContentPadding = i5;
        this.placeables = list;
        this.visualOffset = j;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j2;
        this.lane = i6;
        this.span = i7;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Placeable placeable = (Placeable) list.get(i8);
            iMax = Math.max(iMax, getIsVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(i3 + iMax, 0);
        if (getIsVertical()) {
            jIntSize = IntSizeKt.IntSize(this.crossAxisSize, iMax);
        } else {
            jIntSize = IntSizeKt.IntSize(iMax, this.crossAxisSize);
        }
        this.size = jIntSize;
        this.offset = IntOffset.INSTANCE.m7074getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public final Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getSpan() {
        return this.span;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object getParentData(int p0) {
        return this.placeables.get(p0).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: getSize-YbymL2g, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public final int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public final int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getOffset-Bjo55l4 */
    public final long mo1114getOffsetBjo55l4(int p0) {
        return getOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void setNonScrollableItem(boolean z) {
        this.nonScrollableItem = z;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void position(int p0, int p1, int p2, int p3) {
        position(p0, p1, p2, p3, -1, -1);
    }

    public final void position(int p0, int p1, int p2, int p3, int p4, int p5) {
        long jIntOffset;
        this.mainAxisLayoutSize = getIsVertical() ? p3 : p2;
        if (!getIsVertical()) {
            p2 = p3;
        }
        if (getIsVertical() && this.layoutDirection == LayoutDirection.Rtl) {
            p1 = (p2 - p1) - this.crossAxisSize;
        }
        if (getIsVertical()) {
            jIntOffset = IntOffsetKt.IntOffset(p1, p0);
        } else {
            jIntOffset = IntOffsetKt.IntOffset(p0, p1);
        }
        this.offset = jIntOffset;
        this.row = p4;
        this.column = p5;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void updateMainAxisLayoutSize(int p0) {
        this.mainAxisLayoutSize = p0;
        this.maxMainAxisOffset = p0 + this.afterContentPadding;
    }

    public final void applyScrollDelta(int p0) {
        if (getNonScrollableItem()) {
            return;
        }
        long offset = getOffset();
        int iM7063getXimpl = getIsVertical() ? IntOffset.m7063getXimpl(offset) : IntOffset.m7063getXimpl(offset) + p0;
        boolean isVertical = getIsVertical();
        int iM7064getYimpl = IntOffset.m7064getYimpl(offset);
        if (isVertical) {
            iM7064getYimpl += p0;
        }
        this.offset = IntOffsetKt.IntOffset(iM7063getXimpl, iM7064getYimpl);
        int placeablesCount = getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                long rawOffset = animation.getRawOffset();
                int iM7063getXimpl2 = getIsVertical() ? IntOffset.m7063getXimpl(rawOffset) : Integer.valueOf(IntOffset.m7063getXimpl(rawOffset) + p0).intValue();
                boolean isVertical2 = getIsVertical();
                int iM7064getYimpl2 = IntOffset.m7064getYimpl(rawOffset);
                if (isVertical2) {
                    iM7064getYimpl2 += p0;
                }
                animation.m1165setRawOffsetgyyYBs(IntOffsetKt.IntOffset(iM7063getXimpl2, iM7064getYimpl2));
            }
        }
    }

    public final void place(Placeable.PlacementScope p0) {
        GraphicsLayer layer;
        int iM7064getYimpl;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        int placeablesCount = getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            Placeable placeable = this.placeables.get(i);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i2 = this.maxMainAxisOffset;
            long offset = getOffset();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                long jM7067plusqkQi6aY = IntOffset.m7067plusqkQi6aY(offset, animation.m1161getPlacementDeltanOccac());
                if ((m1145getMainAxisgyyYBs(offset) <= mainAxisSize && m1145getMainAxisgyyYBs(jM7067plusqkQi6aY) <= mainAxisSize) || (m1145getMainAxisgyyYBs(offset) >= i2 && m1145getMainAxisgyyYBs(jM7067plusqkQi6aY) >= i2)) {
                    animation.cancelPlacementAnimation();
                }
                layer = animation.getLayer();
                offset = jM7067plusqkQi6aY;
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                int iM7063getXimpl = getIsVertical() ? IntOffset.m7063getXimpl(offset) : (this.mainAxisLayoutSize - IntOffset.m7063getXimpl(offset)) - getMainAxisSize(placeable);
                if (getIsVertical()) {
                    iM7064getYimpl = (this.mainAxisLayoutSize - IntOffset.m7064getYimpl(offset)) - getMainAxisSize(placeable);
                } else {
                    iM7064getYimpl = IntOffset.m7064getYimpl(offset);
                }
                offset = IntOffsetKt.IntOffset(iM7063getXimpl, iM7064getYimpl);
            }
            long jM7067plusqkQi6aY2 = IntOffset.m7067plusqkQi6aY(offset, this.visualOffset);
            if (animation != null) {
                animation.m1163setFinalOffsetgyyYBs(jM7067plusqkQi6aY2);
            }
            if (getIsVertical()) {
                if (layer != null) {
                    Placeable.PlacementScope.m5707placeWithLayeraW9wM$default(p0, placeable, jM7067plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
                } else {
                    Placeable.PlacementScope.m5706placeWithLayeraW9wM$default(p0, placeable, jM7067plusqkQi6aY2, 0.0f, (Function1) null, 6, (Object) null);
                }
            } else if (layer != null) {
                Placeable.PlacementScope.m5705placeRelativeWithLayeraW9wM$default(p0, placeable, jM7067plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.m5704placeRelativeWithLayeraW9wM$default(p0, placeable, jM7067plusqkQi6aY2, 0.0f, (Function1) null, 6, (Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m1145getMainAxisgyyYBs(long j) {
        return getIsVertical() ? IntOffset.m7064getYimpl(j) : IntOffset.m7063getXimpl(j);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return getIsVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m1144copy4Tuh3kE(long j, Function1<? super Integer, Integer> function1) {
        int iM7063getXimpl = getIsVertical() ? IntOffset.m7063getXimpl(j) : function1.invoke(Integer.valueOf(IntOffset.m7063getXimpl(j))).intValue();
        boolean isVertical = getIsVertical();
        int iM7064getYimpl = IntOffset.m7064getYimpl(j);
        if (isVertical) {
            iM7064getYimpl = function1.invoke(Integer.valueOf(iM7064getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(iM7063getXimpl, iM7064getYimpl);
    }

    public /* synthetic */ LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List list, long j, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, z, i2, i3, z2, layoutDirection, i4, i5, list, j, obj2, lazyLayoutItemAnimator, j2, i6, i7);
    }
}
