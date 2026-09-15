package androidx.compose.ui.node;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.Ruler;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.layout.VerticalRuler;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000 u2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002vuB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH ¢\u0006\u0004\b\u0010\u0010\u0005J\u0013\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u0006*\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0014H\u0000¢\u0006\u0004\b \u0010!Jg\u0010+\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\"2\u0019\u0010'\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b\u0018\u00010$¢\u0006\u0002\b&2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0$¢\u0006\u0002\b&H\u0017¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010*H\u0000¢\u0006\u0004\b-\u0010.J+\u00104\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020/2\b\b\u0002\u0010\u0016\u001a\u0002002\b\b\u0002\u0010#\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020/H\u0002¢\u0006\u0004\b5\u00106J#\u00109\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190807H\u0002¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b;\u0010<J\u001d\u0010=\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b=\u0010<R\u0014\u0010@\u001a\u0002008'X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010C\u001a\u0004\u0018\u00010\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0016\u0010E\u001a\u0004\u0018\u00010\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0014\u0010H\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020\u00198'X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8'X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001c\u0010Q\u001a\b\u0018\u00010PR\u00020\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR)\u0010S\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b\u0018\u00010$¢\u0006\u0002\b&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\"\u0010W\u001a\u00020\u00068\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bW\u0010G\"\u0004\bY\u0010\nR\u0018\u0010\\\u001a\u00060PR\u00020\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\"\u0010]\u001a\u00020\u00068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b]\u0010X\u001a\u0004\b^\u0010G\"\u0004\b_\u0010\nR\u0014\u0010b\u001a\u00020*8!X \u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8'X¦\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\"\u0010g\u001a\u00020\u00068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bg\u0010X\u001a\u0004\bh\u0010G\"\u0004\bi\u0010\nR\u001a\u0010j\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010GR\u0018\u0010p\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bp\u0010qR0\u0010s\u001a\u001c\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190807\u0018\u00010r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bs\u0010t"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/MeasureScopeWithLayoutNode;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "<init>", "()V", "", "p0", "", "updatePlacedUnderMotionFrameOfReference", "(Z)V", "Landroidx/compose/ui/layout/AlignmentLine;", "", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "calculateAlignmentLine", "replace$ui_release", "Landroidx/compose/ui/node/NodeCoordinator;", "invalidateAlignmentLinesFromPositionChange", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "Landroidx/compose/ui/layout/Ruler;", "", "p1", "findRulerValue", "(Landroidx/compose/ui/layout/Ruler;F)F", "Landroidx/compose/ui/node/LayoutNode;", "addRulerReader", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/Ruler;)V", "findAncestorRulerDefiner", "(Landroidx/compose/ui/layout/Ruler;)Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "isLayoutNodeAncestor", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)Z", "invalidateChildrenOfDefiningRuler$ui_release", "(Landroidx/compose/ui/layout/Ruler;)V", "", "p2", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "p3", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "p4", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "captureRulersIfNeeded$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "Landroidx/compose/ui/node/PlaceableResult;", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntSize;", "captureRulers-OSxE8f4", "(Landroidx/compose/ui/node/PlaceableResult;JJ)V", "captureRulers", "captureRulersIfNeeded", "(Landroidx/compose/ui/node/PlaceableResult;)V", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/ui/node/WeakReference;", "notifyRulerValueChange", "(Landroidx/collection/MutableScatterSet;)V", "provideRulerValue", "(Landroidx/compose/ui/layout/Ruler;F)V", "provideRelativeRulerValue", "getPosition-nOcc-ac", "()J", "position", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "getParent", "parent", "getHasMeasureResult", "()Z", "hasMeasureResult", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Landroidx/compose/ui/node/LookaheadCapablePlaceable$ResettableRulerScope;", "_rulerScope", "Landroidx/compose/ui/node/LookaheadCapablePlaceable$ResettableRulerScope;", "rulersLambda", "Lkotlin/jvm/functions/Function1;", "cachedRulerPlaceableResult", "Landroidx/compose/ui/node/PlaceableResult;", "isPlacedUnderMotionFrameOfReference", "Z", "setPlacedUnderMotionFrameOfReference", "getRulerScope", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable$ResettableRulerScope;", "rulerScope", "isShallowPlacing", "isShallowPlacing$ui_release", "setShallowPlacing$ui_release", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "isPlacingForAlignment", "isPlacingForAlignment$ui_release", "setPlacingForAlignment$ui_release", "placementScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "isLookingAhead", "Landroidx/compose/ui/node/RulerTrackingMap;", "rulerValues", "Landroidx/compose/ui/node/RulerTrackingMap;", "Landroidx/collection/MutableScatterMap;", "rulerReaders", "Landroidx/collection/MutableScatterMap;", "Companion", "ResettableRulerScope"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode, MotionReferencePlacementDelegate {
    public static final int $stable = 0;
    private static final Function1<PlaceableResult, Unit> onCommitAffectingRuler = new Function1<PlaceableResult, Unit>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(PlaceableResult placeableResult) {
            invoke2(placeableResult);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PlaceableResult placeableResult) {
            if (placeableResult.isValidOwnerScope()) {
                placeableResult.getPlaceable().captureRulersIfNeeded(placeableResult);
            }
        }
    };
    private ResettableRulerScope _rulerScope;
    private PlaceableResult cachedRulerPlaceableResult;
    private boolean isPlacedUnderMotionFrameOfReference;
    private boolean isPlacingForAlignment;
    private boolean isShallowPlacing;
    private final Placeable.PlacementScope placementScope = PlaceableKt.PlacementScope(this);
    private MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> rulerReaders;
    private RulerTrackingMap rulerValues;
    private Function1<? super RulerScope, Unit> rulersLambda;

    public abstract int calculateAlignmentLine(AlignmentLine p0);

    public abstract AlignmentLinesOwner getAlignmentLinesOwner();

    public abstract LookaheadCapablePlaceable getChild();

    public abstract LayoutCoordinates getCoordinates();

    public abstract boolean getHasMeasureResult();

    @Override // androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public abstract LayoutNode getLayoutNode();

    public abstract MeasureResult getMeasureResult$ui_release();

    public abstract LookaheadCapablePlaceable getParent();

    /* JADX INFO: renamed from: getPosition-nOcc-ac, reason: not valid java name */
    public abstract long getPosition();

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    public abstract void replace$ui_release();

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    /* JADX INFO: renamed from: isPlacedUnderMotionFrameOfReference, reason: from getter */
    public boolean getIsPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    public void setPlacedUnderMotionFrameOfReference(boolean z) {
        this.isPlacedUnderMotionFrameOfReference = z;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void updatePlacedUnderMotionFrameOfReference(boolean p0) {
        LookaheadCapablePlaceable parent = getParent();
        LayoutNode layoutNode = parent != null ? parent.getLayoutNode() : null;
        if (Intrinsics.areEqual(layoutNode, getLayoutNode())) {
            setPlacedUnderMotionFrameOfReference(p0);
            return;
        }
        if ((layoutNode != null ? layoutNode.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.LayingOut) {
            if ((layoutNode != null ? layoutNode.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.LookaheadLayingOut) {
                return;
            }
        }
        setPlacedUnderMotionFrameOfReference(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResettableRulerScope getRulerScope() {
        ResettableRulerScope resettableRulerScope = this._rulerScope;
        if (resettableRulerScope != null) {
            return resettableRulerScope;
        }
        ResettableRulerScope resettableRulerScope2 = new ResettableRulerScope();
        this._rulerScope = resettableRulerScope2;
        return resettableRulerScope2;
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int get(AlignmentLine p0) {
        int iCalculateAlignmentLine;
        int iM7064getYimpl;
        if (!getHasMeasureResult() || (iCalculateAlignmentLine = calculateAlignmentLine(p0)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (p0 instanceof VerticalAlignmentLine) {
            iM7064getYimpl = IntOffset.m7063getXimpl(getApparentToRealOffset());
        } else {
            iM7064getYimpl = IntOffset.m7064getYimpl(getApparentToRealOffset());
        }
        return iCalculateAlignmentLine + iM7064getYimpl;
    }

    /* JADX INFO: renamed from: isShallowPlacing$ui_release, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    public final void setShallowPlacing$ui_release(boolean z) {
        this.isShallowPlacing = z;
    }

    /* JADX INFO: renamed from: isPlacingForAlignment$ui_release, reason: from getter */
    public final boolean getIsPlacingForAlignment() {
        return this.isPlacingForAlignment;
    }

    public final void setPlacingForAlignment$ui_release(boolean z) {
        this.isPlacingForAlignment = z;
    }

    public final Placeable.PlacementScope getPlacementScope() {
        return this.placementScope;
    }

    protected final void invalidateAlignmentLinesFromPositionChange(NodeCoordinator nodeCoordinator) {
        AlignmentLines alignmentLines;
        NodeCoordinator wrapped = nodeCoordinator.getWrapped();
        if (!Intrinsics.areEqual(wrapped != null ? wrapped.getLayoutNode() : null, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            return;
        }
        AlignmentLinesOwner parentAlignmentLinesOwner = nodeCoordinator.getAlignmentLinesOwner().getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null || (alignmentLines = parentAlignmentLinesOwner.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.onAlignmentsChanged();
    }

    public final float findRulerValue(Ruler p0, float p1) {
        if (this.isPlacingForAlignment) {
            return p1;
        }
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            RulerTrackingMap rulerTrackingMap = lookaheadCapablePlaceable.rulerValues;
            float orDefault = rulerTrackingMap != null ? rulerTrackingMap.getOrDefault(p0, Float.NaN) : Float.NaN;
            if (!Float.isNaN(orDefault)) {
                lookaheadCapablePlaceable.addRulerReader(getLayoutNode(), p0);
                return p0.calculateCoordinate$ui_release(orDefault, lookaheadCapablePlaceable.getCoordinates(), getCoordinates());
            }
            LookaheadCapablePlaceable parent = lookaheadCapablePlaceable.getParent();
            if (parent == null) {
                lookaheadCapablePlaceable.addRulerReader(getLayoutNode(), p0);
                return p1;
            }
            lookaheadCapablePlaceable = parent;
        }
    }

    private final void addRulerReader(LayoutNode p0, Ruler p1) {
        int i;
        int i2;
        long[] jArr;
        int i3;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        Object[] objArr;
        long[] jArr3;
        Object[] objArr2;
        long[] jArr4;
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap = this.rulerReaders;
        long j = 255;
        char c = 7;
        long j2 = -9187201950435737472L;
        int i7 = 8;
        if (mutableScatterMap != null) {
            MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap2 = mutableScatterMap;
            Object[] objArr3 = mutableScatterMap2.values;
            long[] jArr5 = mutableScatterMap2.metadata;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i8 = 0;
                while (true) {
                    long j3 = jArr5[i8];
                    if ((((~j3) << c) & j3 & j2) != j2) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j3 & j) < 128) {
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) objArr3[(i8 << 3) + i10];
                                Object[] objArr4 = mutableScatterSet.elements;
                                long[] jArr6 = mutableScatterSet.metadata;
                                int length2 = jArr6.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr5;
                                    int i11 = 0;
                                    while (true) {
                                        long j4 = jArr6[i11];
                                        i4 = length;
                                        i5 = i8;
                                        if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j4 & 255) < 128) {
                                                    int i14 = (i11 << 3) + i13;
                                                    LayoutNode layoutNode = (LayoutNode) ((WeakReference) objArr4[i14]).get();
                                                    objArr2 = objArr4;
                                                    if (layoutNode != null) {
                                                        boolean zIsAttached = layoutNode.isAttached();
                                                        jArr4 = jArr6;
                                                        if (zIsAttached) {
                                                        }
                                                    } else {
                                                        jArr4 = jArr6;
                                                    }
                                                    mutableScatterSet.removeElementAt(i14);
                                                } else {
                                                    objArr2 = objArr4;
                                                    jArr4 = jArr6;
                                                }
                                                j4 >>= 8;
                                                i13++;
                                                jArr6 = jArr4;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            jArr3 = jArr6;
                                            if (i12 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                            jArr3 = jArr6;
                                        }
                                        if (i11 == length2) {
                                            break;
                                        }
                                        i11++;
                                        length = i4;
                                        i8 = i5;
                                        jArr6 = jArr3;
                                        objArr4 = objArr;
                                        c = 7;
                                    }
                                } else {
                                    jArr2 = jArr5;
                                    i4 = length;
                                    i5 = i8;
                                }
                                i6 = 8;
                            } else {
                                jArr2 = jArr5;
                                i4 = length;
                                i5 = i8;
                                i6 = i7;
                            }
                            j3 >>= i6;
                            i10++;
                            i7 = i6;
                            jArr5 = jArr2;
                            length = i4;
                            i8 = i5;
                            j = 255;
                            c = 7;
                        }
                        jArr = jArr5;
                        int i15 = length;
                        int i16 = i8;
                        if (i9 != i7) {
                            break;
                        }
                        length = i15;
                        i3 = i16;
                    } else {
                        jArr = jArr5;
                        i3 = i8;
                    }
                    if (i3 == length) {
                        break;
                    }
                    i8 = i3 + 1;
                    jArr5 = jArr;
                    j = 255;
                    c = 7;
                    j2 = -9187201950435737472L;
                    i7 = 8;
                }
            }
        }
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap3 = this.rulerReaders;
        if (mutableScatterMap3 != null) {
            long[] jArr7 = mutableScatterMap3.metadata;
            int length3 = jArr7.length - 2;
            if (length3 >= 0) {
                int i17 = 0;
                while (true) {
                    long j5 = jArr7[i17];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8 - ((~(i17 - length3)) >>> 31);
                        for (int i19 = 0; i19 < i18; i19++) {
                            if ((j5 & 255) < 128) {
                                int i20 = (i17 << 3) + i19;
                                if (((MutableScatterSet) mutableScatterMap3.values[i20]).isEmpty()) {
                                    mutableScatterMap3.removeValueAt(i20);
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i18 != 8) {
                            break;
                        }
                    }
                    if (i17 == length3) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap4 = this.rulerReaders;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (mutableScatterMap4 == null) {
            i = 0;
            i2 = 1;
            mutableScatterMap4 = new MutableScatterMap<>(i, i2, defaultConstructorMarker);
            this.rulerReaders = mutableScatterMap4;
        } else {
            i = 0;
            i2 = 1;
        }
        MutableScatterSet<WeakReference<LayoutNode>> mutableScatterSet2 = mutableScatterMap4.get(p1);
        if (mutableScatterSet2 == null) {
            mutableScatterSet2 = new MutableScatterSet<>(i, i2, defaultConstructorMarker);
            mutableScatterMap4.set(p1, mutableScatterSet2);
        }
        mutableScatterSet2.plusAssign(new WeakReference<>(p0));
    }

    private final LookaheadCapablePlaceable findAncestorRulerDefiner(Ruler p0) {
        LookaheadCapablePlaceable parent;
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            RulerTrackingMap rulerTrackingMap = lookaheadCapablePlaceable.rulerValues;
            if ((rulerTrackingMap != null && rulerTrackingMap.contains(p0)) || (parent = lookaheadCapablePlaceable.getParent()) == null) {
                return lookaheadCapablePlaceable;
            }
            lookaheadCapablePlaceable = parent;
        }
    }

    private final boolean isLayoutNodeAncestor(LayoutNode layoutNode, LayoutNode layoutNode2) {
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            if (layoutNode == null) {
                return false;
            }
        }
        return true;
    }

    public final void invalidateChildrenOfDefiningRuler$ui_release(Ruler p0) {
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap = findAncestorRulerDefiner(p0).rulerReaders;
        MutableScatterSet<WeakReference<LayoutNode>> mutableScatterSetRemove = mutableScatterMap != null ? mutableScatterMap.remove(p0) : null;
        if (mutableScatterSetRemove != null) {
            notifyRulerValueChange(mutableScatterSetRemove);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e A[LOOP:0: B:12:0x002d->B:22:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3 A[PHI: r2 r4
  0x00b3: PHI (r2v4 long) = (r2v2 long), (r2v6 long) binds: [B:32:0x0083, B:36:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r4v3 long) = (r4v1 long), (r4v4 long) binds: [B:32:0x0083, B:36:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0061 A[EDGE_INSN: B:72:0x0061->B:23:0x0061 BREAK  A[LOOP:0: B:12:0x002d->B:22:0x005e], SYNTHETIC] */
    public final void captureRulersIfNeeded$ui_release(MeasureResult p0) {
        boolean z;
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap = this.rulerReaders;
        long j = 255;
        if (p0 != null) {
            if (this.isPlacingForAlignment) {
                return;
            }
            Function1<RulerScope, Unit> rulers = p0.getRulers();
            if (rulers != null) {
                boolean z2 = this.rulersLambda != rulers;
                long jM7073getMaxnOccac = IntOffset.INSTANCE.m7073getMaxnOccac();
                long jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                if (z2) {
                    z = z2;
                } else if (getRulerScope().getCoordinatesAccessed()) {
                    LayoutCoordinates coordinates = getCoordinates();
                    jM7073getMaxnOccac = IntOffsetKt.m7080roundk4lQ0M(LayoutCoordinatesKt.positionOnScreen(coordinates));
                    jM7111getZeroYbymL2g = coordinates.mo5645getSizeYbymL2g();
                    if (IntOffset.m7062equalsimpl0(jM7073getMaxnOccac, getRulerScope().getPositionOnScreen()) && IntSize.m7104equalsimpl0(jM7111getZeroYbymL2g, getRulerScope().getSize())) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    PlaceableResult placeableResult = this.cachedRulerPlaceableResult;
                    if (placeableResult != null) {
                        placeableResult.setResult(p0);
                    } else {
                        placeableResult = new PlaceableResult(p0, this);
                        this.cachedRulerPlaceableResult = placeableResult;
                    }
                    m5855captureRulersOSxE8f4(placeableResult, jM7073getMaxnOccac, jM7111getZeroYbymL2g);
                    this.rulersLambda = p0.getRulers();
                    return;
                }
                return;
            }
            if (mutableScatterMap != null) {
                MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap2 = mutableScatterMap;
                Object[] objArr = mutableScatterMap2.values;
                long[] jArr = mutableScatterMap2.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j2 = jArr[i];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((j2 & 255) < 128) {
                                    notifyRulerValueChange((MutableScatterSet) objArr[(i << 3) + i3]);
                                }
                                j2 >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                mutableScatterMap.clear();
                return;
            }
            return;
        }
        if (mutableScatterMap != null) {
            MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap3 = mutableScatterMap;
            Object[] objArr2 = mutableScatterMap3.values;
            long[] jArr2 = mutableScatterMap3.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i4 = 0;
                while (true) {
                    long j3 = jArr2[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length2)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j3 & j) < 128) {
                                notifyRulerValueChange((MutableScatterSet) objArr2[(i4 << 3) + i6]);
                            }
                            j3 >>= 8;
                            i6++;
                            j = 255;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length2) {
                        break;
                    }
                    i4++;
                    j = 255;
                }
            }
        }
        if (mutableScatterMap != null) {
            mutableScatterMap.clear();
        }
        RulerTrackingMap rulerTrackingMap = this.rulerValues;
        if (rulerTrackingMap != null) {
            rulerTrackingMap.clear();
        }
    }

    /* JADX INFO: renamed from: captureRulers-OSxE8f4$default, reason: not valid java name */
    static /* synthetic */ void m5856captureRulersOSxE8f4$default(LookaheadCapablePlaceable lookaheadCapablePlaceable, PlaceableResult placeableResult, long j, long j2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: captureRulers-OSxE8f4");
        }
        if ((i & 2) != 0) {
            j = IntOffset.INSTANCE.m7073getMaxnOccac();
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = IntSize.INSTANCE.m7111getZeroYbymL2g();
        }
        lookaheadCapablePlaceable.m5855captureRulersOSxE8f4(placeableResult, j3, j2);
    }

    /* JADX INFO: renamed from: captureRulers-OSxE8f4, reason: not valid java name */
    private final void m5855captureRulersOSxE8f4(final PlaceableResult p0, final long p1, final long p2) {
        OwnerSnapshotObserver snapshotObserver;
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap = this.rulerReaders;
        RulerTrackingMap rulerTrackingMap = this.rulerValues;
        if (rulerTrackingMap == null) {
            rulerTrackingMap = new RulerTrackingMap();
            this.rulerValues = rulerTrackingMap;
        }
        RulerTrackingMap rulerTrackingMap2 = rulerTrackingMap;
        Owner owner = getLayoutNode().getOwner();
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.observeReads$ui_release(p0, onCommitAffectingRuler, new Function0<Unit>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$captureRulers$1
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.getRulerScope().setCoordinatesAccessed(false);
                    this.this$0.getRulerScope().m5860setPositionOnScreengyyYBs(p1);
                    this.this$0.getRulerScope().m5861setSizeozmzZPI(p2);
                    Function1<RulerScope, Unit> rulers = p0.getResult().getRulers();
                    if (rulers != null) {
                        rulers.invoke(this.this$0.getRulerScope());
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
        }
        rulerTrackingMap2.notifyChanged(isLookingAhead(), this, mutableScatterMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[LOOP:0: B:10:0x0020->B:20:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x005a A[EDGE_INSN: B:25:0x005a->B:21:0x005a BREAK  A[LOOP:0: B:10:0x0020->B:20:0x0057], SYNTHETIC] */
    public final void captureRulersIfNeeded(PlaceableResult p0) {
        if (this.isPlacingForAlignment) {
            return;
        }
        Function1<RulerScope, Unit> rulers = p0.getResult().getRulers();
        MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap = this.rulerReaders;
        if (rulers != null) {
            m5856captureRulersOSxE8f4$default(this, p0, 0L, 0L, 6, null);
            this.rulersLambda = rulers;
            return;
        }
        if (mutableScatterMap != null) {
            MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> mutableScatterMap2 = mutableScatterMap;
            Object[] objArr = mutableScatterMap2.values;
            long[] jArr = mutableScatterMap2.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                notifyRulerValueChange((MutableScatterSet) objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            mutableScatterMap.clear();
        }
    }

    private final void notifyRulerValueChange(MutableScatterSet<WeakReference<LayoutNode>> p0) {
        LayoutNode layoutNode;
        MutableScatterSet<WeakReference<LayoutNode>> mutableScatterSet = p0;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (layoutNode = (LayoutNode) ((WeakReference) objArr[(i << 3) + i3]).get()) != null) {
                        if (isLookingAhead()) {
                            layoutNode.requestLookaheadRelayout$ui_release(false);
                        } else {
                            layoutNode.requestRelayout$ui_release(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void provideRulerValue(Ruler p0, float p1) {
        RulerTrackingMap rulerTrackingMap = this.rulerValues;
        if (rulerTrackingMap == null) {
            rulerTrackingMap = new RulerTrackingMap();
            this.rulerValues = rulerTrackingMap;
        }
        rulerTrackingMap.set(p0, p1);
    }

    public final void provideRelativeRulerValue(Ruler p0, float p1) {
        RulerTrackingMap rulerTrackingMap = this.rulerValues;
        if (rulerTrackingMap == null) {
            rulerTrackingMap = new RulerTrackingMap();
            this.rulerValues = rulerTrackingMap;
        }
        if (getLayoutDirection() != LayoutDirection.Ltr) {
            p1 = getWidth() - p1;
        }
        rulerTrackingMap.set(p0, p1);
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0004¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0004¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u0014\u0010\"\u001a\u00020\u001f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable$ResettableRulerScope;", "Landroidx/compose/ui/layout/RulerScope;", "<init>", "(Landroidx/compose/ui/node/LookaheadCapablePlaceable;)V", "Landroidx/compose/ui/layout/Ruler;", "", "p0", "", "provides", "(Landroidx/compose/ui/layout/Ruler;F)V", "Landroidx/compose/ui/layout/VerticalRuler;", "providesRelative", "(Landroidx/compose/ui/layout/VerticalRuler;F)V", "", "coordinatesAccessed", "Z", "getCoordinatesAccessed", "()Z", "setCoordinatesAccessed", "(Z)V", "Landroidx/compose/ui/unit/IntOffset;", "positionOnScreen", "J", "getPositionOnScreen-nOcc-ac", "()J", "setPositionOnScreen--gyyYBs", "(J)V", "Landroidx/compose/ui/unit/IntSize;", "size", "getSize-YbymL2g", "setSize-ozmzZPI", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "getDensity", "()F", "density", "getFontScale", "fontScale"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class ResettableRulerScope implements RulerScope {
        private boolean coordinatesAccessed;
        private long positionOnScreen = IntOffset.INSTANCE.m7073getMaxnOccac();
        private long size = IntSize.INSTANCE.m7111getZeroYbymL2g();

        public ResettableRulerScope() {
        }

        public final boolean getCoordinatesAccessed() {
            return this.coordinatesAccessed;
        }

        public final void setCoordinatesAccessed(boolean z) {
            this.coordinatesAccessed = z;
        }

        /* JADX INFO: renamed from: getPositionOnScreen-nOcc-ac, reason: not valid java name and from getter */
        public final long getPositionOnScreen() {
            return this.positionOnScreen;
        }

        /* JADX INFO: renamed from: setPositionOnScreen--gyyYBs, reason: not valid java name */
        public final void m5860setPositionOnScreengyyYBs(long j) {
            this.positionOnScreen = j;
        }

        /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name and from getter */
        public final long getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: setSize-ozmzZPI, reason: not valid java name */
        public final void m5861setSizeozmzZPI(long j) {
            this.size = j;
        }

        @Override // androidx.compose.ui.layout.RulerScope
        public final LayoutCoordinates getCoordinates() {
            this.coordinatesAccessed = true;
            LayoutCoordinates coordinates = LookaheadCapablePlaceable.this.getCoordinates();
            if (IntOffset.m7062equalsimpl0(this.positionOnScreen, IntOffset.INSTANCE.m7073getMaxnOccac())) {
                this.positionOnScreen = IntOffsetKt.m7080roundk4lQ0M(LayoutCoordinatesKt.positionOnScreen(coordinates));
                this.size = coordinates.mo5645getSizeYbymL2g();
            }
            LookaheadCapablePlaceable.this.getLayoutNode().getLayoutDelegate().onCoordinatesUsed();
            return coordinates;
        }

        @Override // androidx.compose.ui.layout.RulerScope
        public final void provides(Ruler ruler, float f) {
            LookaheadCapablePlaceable.this.provideRulerValue(ruler, f);
        }

        @Override // androidx.compose.ui.layout.RulerScope
        public final void providesRelative(VerticalRuler verticalRuler, float f) {
            LookaheadCapablePlaceable.this.provideRelativeRulerValue(verticalRuler, f);
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getDensity() {
            return LookaheadCapablePlaceable.this.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public final float getFontScale() {
            return LookaheadCapablePlaceable.this.getFontScale();
        }
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(final int p0, final int p1, final Map<AlignmentLine, Integer> p2, final Function1<? super RulerScope, Unit> p3, final Function1<? super Placeable.PlacementScope, Unit> p4) {
        if ((p0 & ViewCompat.MEASURED_STATE_MASK) != 0 || ((-16777216) & p1) != 0) {
            StringBuilder sb = new StringBuilder("Size(");
            sb.append(p0);
            sb.append(" x ");
            sb.append(p1);
            sb.append(") is out of range. Each dimension must be between 0 and 16777215.");
            InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        return new MeasureResult() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable.layout.1
            @Override // androidx.compose.ui.layout.MeasureResult
            /* JADX INFO: renamed from: getWidth, reason: from getter */
            public final int get$w() {
                return p0;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* JADX INFO: renamed from: getHeight, reason: from getter */
            public final int get$h() {
                return p1;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final Map<AlignmentLine, Integer> getAlignmentLines() {
                return p2;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final Function1<RulerScope, Unit> getRulers() {
                return p3;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void placeChildren() {
                p4.invoke(this.getPlacementScope());
            }
        };
    }
}
