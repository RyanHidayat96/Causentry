package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\"¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J/\u0010%\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010'J\u000f\u0010)\u001a\u00020(H\u0017¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b+\u0010\u001aJ+\u0010/\u001a\u00020\u001b*\u00020\u001b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030,H\u0082\bø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00000\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00101R\u001d\u00105\u001a\u00020\u00148\u0017X\u0097\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00101\u001a\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\bA\u0010?R\u001a\u0010B\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR\"\u0010E\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010C\u001a\u0004\bE\u0010D\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bH\u0010:\u001a\u0004\bI\u0010<R\u001a\u0010J\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\bJ\u00101\u001a\u0004\bK\u0010?R\u0016\u0010L\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u00101R\u0011\u0010N\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\bM\u0010?R\u001a\u0010O\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u00101\u001a\u0004\bP\u0010?R\u001a\u0010Q\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\bQ\u00101\u001a\u0004\bR\u0010?R\u0016\u0010S\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u00101R\u0016\u0010T\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u00101R\"\u0010U\u001a\u00020\n8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bU\u0010C\u001a\u0004\bV\u0010D\"\u0004\bW\u0010GR'\u0010X\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u001b8\u0017@RX\u0097\u000eø\u0001\u0001¢\u0006\f\n\u0004\bX\u00106\u001a\u0004\bY\u00108R\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010?R\u001d\u0010_\u001a\u00020^8\u0017X\u0097\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b_\u00106\u001a\u0004\b`\u00108R\u001a\u0010a\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\ba\u00101\u001a\u0004\bb\u0010?R\u0018\u0010e\u001a\u00020\u0003*\u00020\u001b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0019\u0010O\u001a\u00020\u0003*\u00020\b8Ã\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "p0", "", "p1", "", "Landroidx/compose/ui/layout/Placeable;", "p2", "", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "p10", "Landroidx/compose/ui/unit/Constraints;", "p11", "<init>", "(ILjava/lang/Object;Ljava/util/List;ZIIIIILjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "applyScrollDelta", "(I)V", "Landroidx/compose/ui/unit/IntOffset;", "getOffset-Bjo55l4", "(I)J", "getOffset", "getParentData", "(I)Ljava/lang/Object;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;)V", "position", "(III)V", "(IIII)V", "", "toString", "()Ljava/lang/String;", "updateMainAxisLayoutSize", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "copy", "afterContentPadding", "I", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "beforeContentPadding", "constraints", "J", "getConstraints-msEJaDk", "()J", "contentType", "Ljava/lang/Object;", "getContentType", "()Ljava/lang/Object;", "crossAxisSize", "getCrossAxisSize", "()I", FirebaseAnalytics.Param.INDEX, "getIndex", "isVertical", "Z", "()Z", "isVisible", "setVisible", "(Z)V", "key", "getKey", "lane", "getLane", "mainAxisLayoutSize", "getMainAxisOffset", "mainAxisOffset", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "maxMainAxisOffset", "minMainAxisOffset", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset-nOcc-ac", "placeables", "Ljava/util/List;", "getPlaceablesCount", "placeablesCount", "Landroidx/compose/ui/unit/IntSize;", "size", "getSize-YbymL2g", "span", "getSpan", "getMainAxis--gyyYBs", "(J)I", "mainAxis", "(Landroidx/compose/ui/layout/Placeable;)I"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible;
    private final Object key;
    private final int lane;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final List<Placeable> placeables;
    private final long size;
    private final int span;

    /* JADX WARN: Multi-variable type inference failed */
    private LazyStaggeredGridMeasuredItem(int i, Object obj, List<? extends Placeable> list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> lazyLayoutItemAnimator, long j) {
        Integer numValueOf;
        long jIntSize;
        this.index = i;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z;
        this.lane = i3;
        this.span = i4;
        this.beforeContentPadding = i5;
        this.afterContentPadding = i6;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j;
        int i7 = 1;
        this.isVisible = true;
        Integer num = null;
        if (!list.isEmpty()) {
            Placeable placeable = (Placeable) list.get(0);
            numValueOf = Integer.valueOf(getIsVertical() ? placeable.getHeight() : placeable.getWidth());
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i8 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) list.get(i8);
                    Integer numValueOf2 = Integer.valueOf(getIsVertical() ? placeable2.getHeight() : placeable2.getWidth());
                    numValueOf = numValueOf2.compareTo(numValueOf) > 0 ? numValueOf2 : numValueOf;
                    if (i8 == lastIndex) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
        } else {
            numValueOf = null;
        }
        Integer num2 = numValueOf;
        int iIntValue = num2 != null ? num2.intValue() : 0;
        this.mainAxisSize = iIntValue;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(iIntValue + i2, 0);
        List<Placeable> list2 = this.placeables;
        if (!list2.isEmpty()) {
            Placeable placeable3 = list2.get(0);
            Integer numValueOf3 = Integer.valueOf(getIsVertical() ? placeable3.getWidth() : placeable3.getHeight());
            int lastIndex2 = CollectionsKt.getLastIndex(list2);
            if (lastIndex2 > 0) {
                while (true) {
                    Placeable placeable4 = list2.get(i7);
                    Integer numValueOf4 = Integer.valueOf(getIsVertical() ? placeable4.getWidth() : placeable4.getHeight());
                    numValueOf3 = numValueOf4.compareTo(numValueOf3) > 0 ? numValueOf4 : numValueOf3;
                    if (i7 == lastIndex2) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            num = numValueOf3;
        }
        Integer num3 = num;
        int iIntValue2 = num3 != null ? num3.intValue() : 0;
        this.crossAxisSize = iIntValue2;
        this.mainAxisLayoutSize = -1;
        if (getIsVertical()) {
            jIntSize = IntSizeKt.IntSize(iIntValue2, this.mainAxisSize);
        } else {
            jIntSize = IntSizeKt.IntSize(this.mainAxisSize, iIntValue2);
        }
        this.size = jIntSize;
        this.offset = IntOffset.INSTANCE.m7074getZeronOccac();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public final Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object getParentData(int p0) {
        return this.placeables.get(p0).getParentData();
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void setNonScrollableItem(boolean z) {
        this.nonScrollableItem = z;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* JADX INFO: renamed from: getSize-YbymL2g, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getOffset-Bjo55l4 */
    public final long mo1114getOffsetBjo55l4(int p0) {
        return getOffset();
    }

    public final void position(int p0, int p1, int p2) {
        long jIntOffset;
        this.mainAxisLayoutSize = p2;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = p2 + this.afterContentPadding;
        if (getIsVertical()) {
            jIntOffset = IntOffsetKt.IntOffset(p1, p0);
        } else {
            jIntOffset = IntOffsetKt.IntOffset(p0, p1);
        }
        this.offset = jIntOffset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void position(int p0, int p1, int p2, int p3) {
        if (getIsVertical()) {
            p2 = p3;
        }
        position(p0, p1, p2);
    }

    public final int getMainAxisOffset() {
        return !getIsVertical() ? IntOffset.m7063getXimpl(getOffset()) : IntOffset.m7064getYimpl(getOffset());
    }

    public final void place(Placeable.PlacementScope p0, LazyStaggeredGridMeasureContext p1) {
        GraphicsLayer layer;
        int height;
        int iM7064getYimpl;
        if (this.mainAxisLayoutSize == -1) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable placeable = list.get(i);
            int height2 = this.minMainAxisOffset - (getIsVertical() ? placeable.getHeight() : placeable.getWidth());
            int i2 = this.maxMainAxisOffset;
            long offset = getOffset();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                long jM7067plusqkQi6aY = IntOffset.m7067plusqkQi6aY(offset, animation.m1161getPlacementDeltanOccac());
                if ((m1219getMainAxisgyyYBs(offset) <= height2 && m1219getMainAxisgyyYBs(jM7067plusqkQi6aY) <= height2) || (m1219getMainAxisgyyYBs(offset) >= i2 && m1219getMainAxisgyyYBs(jM7067plusqkQi6aY) >= i2)) {
                    animation.cancelPlacementAnimation();
                }
                layer = animation.getLayer();
                offset = jM7067plusqkQi6aY;
            } else {
                layer = null;
            }
            if (p1.getReverseLayout()) {
                if (getIsVertical()) {
                    height = IntOffset.m7063getXimpl(offset);
                } else {
                    int iM7063getXimpl = IntOffset.m7063getXimpl(offset);
                    height = (this.mainAxisLayoutSize - iM7063getXimpl) - (getIsVertical() ? placeable.getHeight() : placeable.getWidth());
                }
                if (!getIsVertical()) {
                    iM7064getYimpl = IntOffset.m7064getYimpl(offset);
                } else {
                    int iM7064getYimpl2 = IntOffset.m7064getYimpl(offset);
                    iM7064getYimpl = (this.mainAxisLayoutSize - iM7064getYimpl2) - (getIsVertical() ? placeable.getHeight() : placeable.getWidth());
                }
                offset = IntOffsetKt.IntOffset(height, iM7064getYimpl);
            }
            long jM7067plusqkQi6aY2 = IntOffset.m7067plusqkQi6aY(offset, p1.getContentOffset());
            if (animation != null) {
                animation.m1163setFinalOffsetgyyYBs(jM7067plusqkQi6aY2);
            }
            if (layer != null) {
                Placeable.PlacementScope.m5705placeRelativeWithLayeraW9wM$default(p0, placeable, jM7067plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.m5704placeRelativeWithLayeraW9wM$default(p0, placeable, jM7067plusqkQi6aY2, 0.0f, (Function1) null, 6, (Object) null);
            }
        }
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

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m1219getMainAxisgyyYBs(long j) {
        return getIsVertical() ? IntOffset.m7064getYimpl(j) : IntOffset.m7063getXimpl(j);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return getIsVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m1218copy4Tuh3kE(long j, Function1<? super Integer, Integer> function1) {
        int iM7063getXimpl = getIsVertical() ? IntOffset.m7063getXimpl(j) : function1.invoke(Integer.valueOf(IntOffset.m7063getXimpl(j))).intValue();
        boolean isVertical = getIsVertical();
        int iM7064getYimpl = IntOffset.m7064getYimpl(j);
        if (isVertical) {
            iM7064getYimpl = function1.invoke(Integer.valueOf(iM7064getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(iM7063getXimpl, iM7064getYimpl);
    }

    public final String toString() {
        return super.toString();
    }

    public /* synthetic */ LazyStaggeredGridMeasuredItem(int i, Object obj, List list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, list, z, i2, i3, i4, i5, i6, obj2, lazyLayoutItemAnimator, j);
    }
}
