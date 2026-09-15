package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0015\n\u0002\b\u0015\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0093\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b*\u0010+J/\u0010*\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010,J\u0015\u0010-\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b-\u0010.J+\u00102\u001a\u00020\u0014*\u00020\u00142\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030/H\u0082\bø\u0001\u0000¢\u0006\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00000\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00104R\u001d\u00108\u001a\u00020\u001b8\u0017X\u0097\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u00010\u00168\u0017X\u0097\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\bA\u0010BR\u0016\u0010C\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\bF\u0010BR\u001a\u0010G\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bG\u0010IR\u001a\u0010J\u001a\u00020\u00168\u0017X\u0097\u0004¢\u0006\f\n\u0004\bJ\u0010=\u001a\u0004\bK\u0010?R\u001a\u0010L\u001a\u00020\u00038\u0017X\u0097D¢\u0006\f\n\u0004\bL\u00104\u001a\u0004\bM\u0010BR\u0014\u0010N\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u00104R\u001a\u0010Q\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\bQ\u00104\u001a\u0004\bR\u0010BR\u0016\u0010S\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u00104R\u0016\u0010T\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u00104R\"\u0010U\u001a\u00020\b8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bU\u0010H\u001a\u0004\bV\u0010I\"\u0004\bW\u0010XR$\u0010Y\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\bY\u00104\u001a\u0004\b$\u0010BR\u0014\u0010[\u001a\u00020Z8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010BR\u0014\u0010a\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\ba\u0010HR\u001a\u0010b\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\bb\u00104\u001a\u0004\bc\u0010BR\u0014\u0010d\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bd\u00104R\u001a\u0010e\u001a\u00020\u00038\u0017X\u0097D¢\u0006\f\n\u0004\be\u00104\u001a\u0004\bf\u0010BR\u0016\u0010g\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0017\u0010i\u001a\u00020\u00148\u0002X\u0083\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bi\u00109R\u0018\u0010l\u001a\u00020\u0003*\u00020\u00148CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0018\u0010o\u001a\u00020\u0003*\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "p0", "", "Landroidx/compose/ui/layout/Placeable;", "p1", "", "p2", "Landroidx/compose/ui/Alignment$Horizontal;", "p3", "Landroidx/compose/ui/Alignment$Vertical;", "p4", "Landroidx/compose/ui/unit/LayoutDirection;", "p5", "p6", "p7", "p8", "p9", "Landroidx/compose/ui/unit/IntOffset;", "p10", "", "p11", "p12", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "p13", "Landroidx/compose/ui/unit/Constraints;", "p14", "<init>", "(ILjava/util/List;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "applyScrollDelta", "(IZ)V", "getOffset-Bjo55l4", "(I)J", "getOffset", "getParentData", "(I)Ljava/lang/Object;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Z)V", "position", "(III)V", "(IIII)V", "updateMainAxisLayoutSize", "(I)V", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "copy", "afterContentPadding", "I", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "beforeContentPadding", "constraints", "J", "getConstraints-msEJaDk", "()J", "contentType", "Ljava/lang/Object;", "getContentType", "()Ljava/lang/Object;", "crossAxisSize", "getCrossAxisSize", "()I", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", FirebaseAnalytics.Param.INDEX, "getIndex", "isVertical", "Z", "()Z", "key", "getKey", "lane", "getLane", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "mainAxisLayoutSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "maxMainAxisOffset", "minMainAxisOffset", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "(Z)V", TypedValues.CycleType.S_WAVE_OFFSET, "", "placeableOffsets", "[I", "placeables", "Ljava/util/List;", "getPlaceablesCount", "placeablesCount", "reverseLayout", "size", "getSize", "spacing", "span", "getSpan", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "visualOffset", "getMainAxis--gyyYBs", "(J)I", "mainAxis", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "mainAxisSize"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyListMeasuredItem implements LazyListItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyListMeasuredItem> animator;
    private final int beforeContentPadding;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private int offset;
    private final int[] placeableOffsets;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final int spacing;
    private final int span;
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    /* JADX WARN: Multi-variable type inference failed */
    private LazyListMeasuredItem(int i, List<? extends Placeable> list, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyLayoutItemAnimator<LazyListMeasuredItem> lazyLayoutItemAnimator, long j2) {
        this.index = i;
        this.placeables = list;
        this.isVertical = z;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z2;
        this.beforeContentPadding = i2;
        this.afterContentPadding = i3;
        this.spacing = i4;
        this.visualOffset = j;
        this.key = obj;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j2;
        this.span = 1;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int height = 0;
        int iMax = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = (Placeable) list.get(i5);
            height += getIsVertical() ? placeable.getHeight() : placeable.getWidth();
            iMax = Math.max(iMax, !getIsVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = height;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(getSize() + this.spacing, 0);
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public final Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public final int getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public final int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getSpan() {
        return this.span;
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

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object getParentData(int p0) {
        return this.placeables.get(p0).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void position(int p0, int p1, int p2, int p3) {
        position(p0, p2, p3);
    }

    public final void position(int p0, int p1, int p2) {
        int width;
        this.offset = p0;
        this.mainAxisLayoutSize = getIsVertical() ? p2 : p1;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable placeable = list.get(i);
            int i2 = i * 2;
            if (getIsVertical()) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true".toString());
                }
                iArr[i2] = horizontal.align(placeable.getWidth(), p1, this.layoutDirection);
                this.placeableOffsets[i2 + 1] = p0;
                width = placeable.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i2] = p0;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false".toString());
                }
                iArr2[i2 + 1] = vertical.align(placeable.getHeight(), p2);
                width = placeable.getWidth();
            }
            p0 += width;
        }
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void updateMainAxisLayoutSize(int p0) {
        this.mainAxisLayoutSize = p0;
        this.maxMainAxisOffset = p0 + this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getOffset-Bjo55l4, reason: not valid java name */
    public final long mo1114getOffsetBjo55l4(int p0) {
        int[] iArr = this.placeableOffsets;
        int i = p0 * 2;
        return IntOffsetKt.IntOffset(iArr[i], iArr[i + 1]);
    }

    public final void applyScrollDelta(int p0, boolean p1) {
        if (getNonScrollableItem()) {
            return;
        }
        this.offset = getOffset() + p0;
        int length = this.placeableOffsets.length;
        for (int i = 0; i < length; i++) {
            if ((getIsVertical() && i % 2 == 1) || (!getIsVertical() && i % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i] = iArr[i] + p0;
            }
        }
        if (p1) {
            int placeablesCount = getPlaceablesCount();
            for (int i2 = 0; i2 < placeablesCount; i2++) {
                LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i2);
                if (animation != null) {
                    long rawOffset = animation.getRawOffset();
                    int iM7063getXimpl = getIsVertical() ? IntOffset.m7063getXimpl(rawOffset) : Integer.valueOf(IntOffset.m7063getXimpl(rawOffset) + p0).intValue();
                    boolean isVertical = getIsVertical();
                    int iM7064getYimpl = IntOffset.m7064getYimpl(rawOffset);
                    if (isVertical) {
                        iM7064getYimpl += p0;
                    }
                    animation.m1165setRawOffsetgyyYBs(IntOffsetKt.IntOffset(iM7063getXimpl, iM7064getYimpl));
                }
            }
        }
    }

    public final void place(Placeable.PlacementScope p0, boolean p1) {
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
            long jMo1114getOffsetBjo55l4 = mo1114getOffsetBjo55l4(i);
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                if (p1) {
                    animation.m1164setLookaheadOffsetgyyYBs(jMo1114getOffsetBjo55l4);
                } else {
                    if (!IntOffset.m7062equalsimpl0(animation.getLookaheadOffset(), LazyLayoutItemAnimation.INSTANCE.m1166getNotInitializednOccac())) {
                        jMo1114getOffsetBjo55l4 = animation.getLookaheadOffset();
                    }
                    long jM7067plusqkQi6aY = IntOffset.m7067plusqkQi6aY(jMo1114getOffsetBjo55l4, animation.m1161getPlacementDeltanOccac());
                    if ((m1112getMainAxisgyyYBs(jMo1114getOffsetBjo55l4) <= mainAxisSize && m1112getMainAxisgyyYBs(jM7067plusqkQi6aY) <= mainAxisSize) || (m1112getMainAxisgyyYBs(jMo1114getOffsetBjo55l4) >= i2 && m1112getMainAxisgyyYBs(jM7067plusqkQi6aY) >= i2)) {
                        animation.cancelPlacementAnimation();
                    }
                    jMo1114getOffsetBjo55l4 = jM7067plusqkQi6aY;
                }
                layer = animation.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                int iM7063getXimpl = getIsVertical() ? IntOffset.m7063getXimpl(jMo1114getOffsetBjo55l4) : (this.mainAxisLayoutSize - IntOffset.m7063getXimpl(jMo1114getOffsetBjo55l4)) - getMainAxisSize(placeable);
                if (getIsVertical()) {
                    iM7064getYimpl = (this.mainAxisLayoutSize - IntOffset.m7064getYimpl(jMo1114getOffsetBjo55l4)) - getMainAxisSize(placeable);
                } else {
                    iM7064getYimpl = IntOffset.m7064getYimpl(jMo1114getOffsetBjo55l4);
                }
                jMo1114getOffsetBjo55l4 = IntOffsetKt.IntOffset(iM7063getXimpl, iM7064getYimpl);
            }
            long jM7067plusqkQi6aY2 = IntOffset.m7067plusqkQi6aY(jMo1114getOffsetBjo55l4, this.visualOffset);
            if (!p1 && animation != null) {
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
    private final int m1112getMainAxisgyyYBs(long j) {
        return getIsVertical() ? IntOffset.m7064getYimpl(j) : IntOffset.m7063getXimpl(j);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return getIsVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m1111copy4Tuh3kE(long j, Function1<? super Integer, Integer> function1) {
        int iM7063getXimpl = getIsVertical() ? IntOffset.m7063getXimpl(j) : function1.invoke(Integer.valueOf(IntOffset.m7063getXimpl(j))).intValue();
        boolean isVertical = getIsVertical();
        int iM7064getYimpl = IntOffset.m7064getYimpl(j);
        if (isVertical) {
            iM7064getYimpl = function1.invoke(Integer.valueOf(iM7064getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(iM7063getXimpl, iM7064getYimpl);
    }

    public /* synthetic */ LazyListMeasuredItem(int i, List list, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, z, horizontal, vertical, layoutDirection, z2, i2, i3, i4, j, obj, obj2, lazyLayoutItemAnimator, j2);
    }
}
