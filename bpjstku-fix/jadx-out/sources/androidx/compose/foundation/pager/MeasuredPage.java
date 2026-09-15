package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Alignment;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0015\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J+\u0010&\u001a\u00020\b*\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020#H\u0082\bø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u0014\u0010/\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00101\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u0010(R$\u00108\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b\u001d\u0010*R\u0014\u0010:\u001a\u0002098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u00100R\u001a\u0010?\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010(\u001a\u0004\b@\u0010*R\u0016\u0010A\u001a\u0004\u0018\u00010\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0017\u0010C\u001a\u00020\b8\u0002X\u0083\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010G\u001a\u00020\u0002*\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/pager/MeasuredPage;", "Landroidx/compose/foundation/pager/PageInfo;", "", "p0", "p1", "", "Landroidx/compose/ui/layout/Placeable;", "p2", "Landroidx/compose/ui/unit/IntOffset;", "p3", "", "p4", "Landroidx/compose/foundation/gestures/Orientation;", "p5", "Landroidx/compose/ui/Alignment$Horizontal;", "p6", "Landroidx/compose/ui/Alignment$Vertical;", "p7", "Landroidx/compose/ui/unit/LayoutDirection;", "p8", "", "p9", "<init>", "(IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "applyScrollDelta", "(I)V", "getOffset-Bjo55l4", "(I)J", "getOffset", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "position", "(III)V", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "copy", "crossAxisSize", "I", "getCrossAxisSize", "()I", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", FirebaseAnalytics.Param.INDEX, "getIndex", "isVertical", "Z", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "mainAxisLayoutSize", TypedValues.CycleType.S_WAVE_OFFSET, "", "placeableOffsets", "[I", "placeables", "Ljava/util/List;", "reverseLayout", "size", "getSize", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "visualOffset", "J", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "mainAxisSize"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MeasuredPage implements PageInfo {
    public static final int $stable = 8;
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private int offset;
    private final int[] placeableOffsets;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    /* JADX WARN: Multi-variable type inference failed */
    private MeasuredPage(int i, int i2, List<? extends Placeable> list, long j, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z) {
        this.index = i;
        this.size = i2;
        this.placeables = list;
        this.visualOffset = j;
        this.key = obj;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z;
        this.isVertical = orientation == Orientation.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Placeable placeable = (Placeable) list.get(i3);
            iMax = Math.max(iMax, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public final int getIndex() {
        return this.index;
    }

    public final int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public final Object getKey() {
        return this.key;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public final int getOffset() {
        return this.offset;
    }

    public final void position(int p0, int p1, int p2) {
        int width;
        this.offset = p0;
        this.mainAxisLayoutSize = this.isVertical ? p2 : p1;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable placeable = list.get(i);
            int i2 = i * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    throw new IllegalArgumentException("null horizontalAlignment".toString());
                }
                iArr[i2] = horizontal.align(placeable.getWidth(), p1, this.layoutDirection);
                this.placeableOffsets[i2 + 1] = p0;
                width = placeable.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i2] = p0;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalAlignment".toString());
                }
                iArr2[i2 + 1] = vertical.align(placeable.getHeight(), p2);
                width = placeable.getWidth();
            }
            p0 += width;
        }
    }

    public final void place(Placeable.PlacementScope p0) {
        int iM7064getYimpl;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        int size = this.placeables.size();
        for (int i = 0; i < size; i++) {
            Placeable placeable = this.placeables.get(i);
            long jM1237getOffsetBjo55l4 = m1237getOffsetBjo55l4(i);
            if (this.reverseLayout) {
                int iM7063getXimpl = this.isVertical ? IntOffset.m7063getXimpl(jM1237getOffsetBjo55l4) : (this.mainAxisLayoutSize - IntOffset.m7063getXimpl(jM1237getOffsetBjo55l4)) - getMainAxisSize(placeable);
                if (this.isVertical) {
                    iM7064getYimpl = (this.mainAxisLayoutSize - IntOffset.m7064getYimpl(jM1237getOffsetBjo55l4)) - getMainAxisSize(placeable);
                } else {
                    iM7064getYimpl = IntOffset.m7064getYimpl(jM1237getOffsetBjo55l4);
                }
                jM1237getOffsetBjo55l4 = IntOffsetKt.IntOffset(iM7063getXimpl, iM7064getYimpl);
            }
            long jM7067plusqkQi6aY = IntOffset.m7067plusqkQi6aY(jM1237getOffsetBjo55l4, this.visualOffset);
            if (this.isVertical) {
                Placeable.PlacementScope.m5706placeWithLayeraW9wM$default(p0, placeable, jM7067plusqkQi6aY, 0.0f, (Function1) null, 6, (Object) null);
            } else {
                Placeable.PlacementScope.m5704placeRelativeWithLayeraW9wM$default(p0, placeable, jM7067plusqkQi6aY, 0.0f, (Function1) null, 6, (Object) null);
            }
        }
    }

    public final void applyScrollDelta(int p0) {
        this.offset = getOffset() + p0;
        int length = this.placeableOffsets.length;
        for (int i = 0; i < length; i++) {
            boolean z = this.isVertical;
            if ((z && i % 2 == 1) || (!z && i % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i] = iArr[i] + p0;
            }
        }
    }

    /* JADX INFO: renamed from: getOffset-Bjo55l4, reason: not valid java name */
    private final long m1237getOffsetBjo55l4(int p0) {
        int[] iArr = this.placeableOffsets;
        int i = p0 * 2;
        return IntOffsetKt.IntOffset(iArr[i], iArr[i + 1]);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m1236copy4Tuh3kE(long j, Function1<? super Integer, Integer> function1) {
        int iM7063getXimpl = this.isVertical ? IntOffset.m7063getXimpl(j) : function1.invoke(Integer.valueOf(IntOffset.m7063getXimpl(j))).intValue();
        boolean z = this.isVertical;
        int iM7064getYimpl = IntOffset.m7064getYimpl(j);
        if (z) {
            iM7064getYimpl = function1.invoke(Integer.valueOf(iM7064getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(iM7063getXimpl, iM7064getYimpl);
    }

    public /* synthetic */ MeasuredPage(int i, int i2, List list, long j, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, list, j, obj, orientation, horizontal, vertical, layoutDirection, z);
    }
}
