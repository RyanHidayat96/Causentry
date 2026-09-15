package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u0003\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0013\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u0010*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\u001a*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00020\u001a*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u001aH&¢\u0006\u0004\b\u001d\u0010\u001cJ#\u0010\u001e\u001a\u00020\u001a*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u001aH&¢\u0006\u0004\b\u001e\u0010\u001cJ#\u0010\u001f\u001a\u00020\u001a*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u001aH&¢\u0006\u0004\b\u001f\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/unit/IntSize;", "p0", "", "isMeasurementApproachInProgress-ozmzZPI", "(J)Z", "isMeasurementApproachInProgress", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "isPlacementApproachInProgress", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/LayoutCoordinates;)Z", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "p1", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "approachMeasure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "approachMeasure", "Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "minApproachIntrinsicWidth", "(Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "minApproachIntrinsicHeight", "maxApproachIntrinsicWidth", "maxApproachIntrinsicHeight"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ApproachLayoutModifierNode extends LayoutModifierNode {
    /* JADX INFO: renamed from: approachMeasure-3p2s80s */
    MeasureResult mo424approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j);

    /* JADX INFO: renamed from: isMeasurementApproachInProgress-ozmzZPI */
    boolean mo425isMeasurementApproachInProgressozmzZPI(long p0);

    default boolean isPlacementApproachInProgress(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    default MeasureResult mo412measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, placeableMo5637measureBRTryo0.getWidth(), placeableMo5637measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$measure$1$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo5637measureBRTryo0, 0, 0, 0.0f, 4, null);
            }

            {
                super(1);
            }
        }, 4, null);
    }

    default int minApproachIntrinsicWidth(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        if (lookaheadDelegate.getHasMeasureResult()) {
            return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.minApproachIntrinsicWidth.1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo5616measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
                    return ApproachLayoutModifierNode.this.mo424approachMeasure3p2s80s(approachMeasureScope, measurable, j);
                }
            }, approachIntrinsicMeasureScope, intrinsicMeasurable, i);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    default int minApproachIntrinsicHeight(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        if (lookaheadDelegate.getHasMeasureResult()) {
            return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.minApproachIntrinsicHeight.1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo5616measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
                    return ApproachLayoutModifierNode.this.mo424approachMeasure3p2s80s(approachMeasureScope, measurable, j);
                }
            }, approachIntrinsicMeasureScope, intrinsicMeasurable, i);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    default int maxApproachIntrinsicWidth(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        if (lookaheadDelegate.getHasMeasureResult()) {
            return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.maxApproachIntrinsicWidth.1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo5616measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
                    return ApproachLayoutModifierNode.this.mo424approachMeasure3p2s80s(approachMeasureScope, measurable, j);
                }
            }, approachIntrinsicMeasureScope, intrinsicMeasurable, i);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    default int maxApproachIntrinsicHeight(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        LookaheadDelegate lookaheadDelegate = coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        if (lookaheadDelegate.getHasMeasureResult()) {
            return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.maxApproachIntrinsicHeight.1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
                /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
                public final MeasureResult mo5616measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
                    return ApproachLayoutModifierNode.this.mo424approachMeasure3p2s80s(approachMeasureScope, measurable, j);
                }
            }, approachIntrinsicMeasureScope, intrinsicMeasurable, i);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }
}
