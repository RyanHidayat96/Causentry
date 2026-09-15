package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutModifierNodeCoordinator;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJg\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000e2\u0019\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011¢\u0006\u0002\b\u00142\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJM\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000e2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001bJ\u0014\u0010\u001f\u001a\u00020\r*\u00020\u001cH\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020\r*\u00020 H\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u0014\u0010%\u001a\u00020\u001c*\u00020\rH\u0097\u0001¢\u0006\u0004\b#\u0010$J\u0014\u0010%\u001a\u00020\u001c*\u00020&H\u0097\u0001¢\u0006\u0004\b#\u0010'J\u0014\u0010%\u001a\u00020\u001c*\u00020 H\u0097\u0001¢\u0006\u0004\b(\u0010)J\u0014\u0010.\u001a\u00020+*\u00020*H\u0097\u0001¢\u0006\u0004\b,\u0010-J\u0014\u00100\u001a\u00020&*\u00020\u001cH\u0097\u0001¢\u0006\u0004\b/\u0010'J\u0014\u00100\u001a\u00020&*\u00020 H\u0097\u0001¢\u0006\u0004\b1\u0010)J\u0014\u00104\u001a\u000203*\u000202H\u0097\u0001¢\u0006\u0004\b4\u00105J\u0014\u00107\u001a\u00020**\u00020+H\u0097\u0001¢\u0006\u0004\b6\u0010-J\u0014\u0010:\u001a\u00020 *\u00020\rH\u0097\u0001¢\u0006\u0004\b8\u00109J\u0014\u0010:\u001a\u00020 *\u00020&H\u0097\u0001¢\u0006\u0004\b8\u0010;J\u0014\u0010:\u001a\u00020 *\u00020\u001cH\u0097\u0001¢\u0006\u0004\b<\u0010;R\u001a\u0010=\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\"\u0010A\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020K8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010IR\"\u0010O\u001a\u00020N8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0018\u0010W\u001a\u00020\n*\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020N8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010RR\u0014\u0010[\u001a\u00020&8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020&8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\\\u0010ZR\u0014\u0010a\u001a\u00020^8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b_\u0010`"}, d2 = {"Landroidx/compose/ui/layout/ApproachMeasureScopeImpl;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "p0", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "p1", "<init>", "(Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;Landroidx/compose/ui/layout/ApproachLayoutModifierNode;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "toLookaheadCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "", "", "Landroidx/compose/ui/layout/AlignmentLine;", "p2", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "p3", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "p4", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-u2uoSUM", "(I)F", "toDp", "", "(F)F", "toDp-GaN1DYA", "(J)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-kPz2Gy4", "(I)J", "toSp", "(F)J", "toSp-0xMU5do", "coordinator", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "approachNode", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "getApproachNode", "()Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "setApproachNode", "(Landroidx/compose/ui/layout/ApproachLayoutModifierNode;)V", "Landroidx/compose/ui/unit/Constraints;", "getLookaheadConstraints-msEJaDk", "()J", "lookaheadConstraints", "Landroidx/compose/ui/unit/IntSize;", "getLookaheadSize-YbymL2g", "lookaheadSize", "", "approachMeasureRequired", "Z", "getApproachMeasureRequired$ui_release", "()Z", "setApproachMeasureRequired$ui_release", "(Z)V", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadScopeCoordinates", "isLookingAhead", "getDensity", "()F", "density", "getFontScale", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApproachMeasureScopeImpl implements ApproachMeasureScope, MeasureScope, LookaheadScope {
    public static final int $stable = 0;
    private boolean approachMeasureRequired;
    private ApproachLayoutModifierNode approachNode;
    private final LayoutModifierNodeCoordinator coordinator;

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean isLookingAhead() {
        return false;
    }

    public ApproachMeasureScopeImpl(LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.coordinator = layoutModifierNodeCoordinator;
        this.approachNode = approachLayoutModifierNode;
    }

    public final LayoutModifierNodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    public final ApproachLayoutModifierNode getApproachNode() {
        return this.approachNode;
    }

    public final void setApproachNode(ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.approachNode = approachLayoutModifierNode;
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* JADX INFO: renamed from: getLookaheadConstraints-msEJaDk */
    public final long mo5614getLookaheadConstraintsmsEJaDk() {
        Constraints lookaheadConstraints = this.coordinator.getLookaheadConstraints();
        if (lookaheadConstraints == null) {
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Error: Lookahead constraints requested before lookahead measure.");
            throw new KotlinNothingValueException();
        }
        return lookaheadConstraints.getValue();
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* JADX INFO: renamed from: getLookaheadSize-YbymL2g */
    public final long mo5615getLookaheadSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        MeasureResult measureResult$ui_release = lookaheadDelegate.getMeasureResult$ui_release();
        return IntSize.m7101constructorimpl((((long) measureResult$ui_release.getWidth()) << 32) | (((long) measureResult$ui_release.getHeight()) & 4294967295L));
    }

    /* JADX INFO: renamed from: getApproachMeasureRequired$ui_release, reason: from getter */
    public final boolean getApproachMeasureRequired() {
        return this.approachMeasureRequired;
    }

    public final void setApproachMeasureRequired$ui_release(boolean z) {
        this.approachMeasureRequired = z;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public final LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        if (!(layoutCoordinates instanceof LookaheadLayoutCoordinates)) {
            if (layoutCoordinates instanceof NodeCoordinator) {
                LookaheadDelegate lookaheadDelegate = ((NodeCoordinator) layoutCoordinates).getLookaheadDelegate();
                if (lookaheadDelegate != null && (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) != null) {
                    return lookaheadLayoutCoordinates;
                }
            } else {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported LayoutCoordinates");
                throw new KotlinNothingValueException();
            }
        }
        return layoutCoordinates;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public final LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope) {
        NodeCoordinator outerCoordinator$ui_release;
        LayoutNode lookaheadRoot = this.coordinator.getLayoutNode().getLookaheadRoot();
        if (lookaheadRoot != null) {
            if (lookaheadRoot.getIsVirtualLookaheadRoot()) {
                LayoutNode parent$ui_release = lookaheadRoot.getParent$ui_release();
                if (parent$ui_release == null || (outerCoordinator$ui_release = parent$ui_release.getInnerCoordinator$ui_release()) == null) {
                    outerCoordinator$ui_release = lookaheadRoot.getChildren$ui_release().get(0).getOuterCoordinator$ui_release();
                }
                return outerCoordinator$ui_release;
            }
            return lookaheadRoot.getOuterCoordinator$ui_release();
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult layout(int p0, int p1, Map<AlignmentLine, Integer> p2, Function1<? super RulerScope, Unit> p3, Function1<? super Placeable.PlacementScope, Unit> p4) {
        if ((p0 & ViewCompat.MEASURED_STATE_MASK) != 0 || ((-16777216) & p1) != 0) {
            StringBuilder sb = new StringBuilder("Size(");
            sb.append(p0);
            sb.append(" x ");
            sb.append(p1);
            sb.append(") is out of range. Each dimension must be between 0 and 16777215.");
            InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        return new MeasureResult(p0, p1, p2, p3, p4, this) { // from class: androidx.compose.ui.layout.ApproachMeasureScopeImpl.layout.1
            final /* synthetic */ Function1<Placeable.PlacementScope, Unit> $placementBlock;
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final Function1<RulerScope, Unit> rulers;
            final /* synthetic */ ApproachMeasureScopeImpl this$0;
            private final int width;

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$placementBlock = p4;
                this.this$0 = this;
                this.width = p0;
                this.height = p1;
                this.alignmentLines = p2;
                this.rulers = p3;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final Function1<RulerScope, Unit> getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void placeChildren() {
                this.$placementBlock.invoke(this.this$0.getCoordinator().getPlacementScope());
            }
        };
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult layout(int p0, int p1, Map<AlignmentLine, Integer> p2, Function1<? super Placeable.PlacementScope, Unit> p3) {
        return this.coordinator.layout(p0, p1, p2, p3);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public final int mo687roundToPxR2X_6o(long j) {
        return this.coordinator.mo687roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public final int mo688roundToPx0680j_4(float f) {
        return this.coordinator.mo688roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public final float mo689toDpGaN1DYA(long j) {
        return this.coordinator.mo689toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo690toDpu2uoSUM(float f) {
        return this.coordinator.mo690toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo691toDpu2uoSUM(int i) {
        return this.coordinator.mo691toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public final long mo692toDpSizekrfVVM(long j) {
        return this.coordinator.mo692toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public final float mo693toPxR2X_6o(long j) {
        return this.coordinator.mo693toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public final float mo694toPx0680j_4(float f) {
        return this.coordinator.mo694toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public final Rect toRect(DpRect dpRect) {
        return this.coordinator.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public final long mo695toSizeXkaWNTQ(long j) {
        return this.coordinator.mo695toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public final long mo696toSp0xMU5do(float f) {
        return this.coordinator.mo696toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo697toSpkPz2Gy4(float f) {
        return this.coordinator.mo697toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo698toSpkPz2Gy4(int i) {
        return this.coordinator.mo698toSpkPz2Gy4(i);
    }
}
