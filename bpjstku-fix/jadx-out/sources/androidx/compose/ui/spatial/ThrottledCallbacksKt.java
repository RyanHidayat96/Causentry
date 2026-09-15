package androidx.compose.ui.spatial;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "p0", "", "p1", "p2", "Landroidx/compose/ui/unit/IntOffset;", "p3", "p4", "p5", "Landroidx/compose/ui/graphics/Matrix;", "p6", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "rectInfoFor-Dg36KO4", "(Landroidx/compose/ui/node/DelegatableNode;JJJJJ[F)Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "rectInfoFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ThrottledCallbacksKt {
    /* JADX INFO: renamed from: rectInfoFor-Dg36KO4, reason: not valid java name */
    public static final RelativeLayoutBounds m6186rectInfoForDg36KO4(DelegatableNode delegatableNode, long j, long j2, long j3, long j4, long j5, float[] fArr) {
        NodeCoordinator nodeCoordinatorM5782requireCoordinator64DMado = DelegatableNodeKt.m5782requireCoordinator64DMado(delegatableNode, NodeKind.m5928constructorimpl(2));
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        if (!layoutNodeRequireLayoutNode.isPlaced()) {
            return null;
        }
        if (layoutNodeRequireLayoutNode.getOuterCoordinator$ui_release() != nodeCoordinatorM5782requireCoordinator64DMado) {
            long jM7057constructorimpl = IntOffset.m7057constructorimpl(j);
            long jM3966constructorimpl = Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m7063getXimpl(jM7057constructorimpl))) << 32) | (((long) Float.floatToRawIntBits(IntOffset.m7064getYimpl(jM7057constructorimpl))) & 4294967295L));
            long jMo5645getSizeYbymL2g = nodeCoordinatorM5782requireCoordinator64DMado.getCoordinates().mo5645getSizeYbymL2g();
            long jM7080roundk4lQ0M = IntOffsetKt.m7080roundk4lQ0M(layoutNodeRequireLayoutNode.getOuterCoordinator$ui_release().getCoordinates().mo5646localPositionOfR5De75A(nodeCoordinatorM5782requireCoordinator64DMado, jM3966constructorimpl));
            return new RelativeLayoutBounds(jM7080roundk4lQ0M, IntOffset.m7057constructorimpl((((long) (IntOffset.m7063getXimpl(jM7080roundk4lQ0M) + ((int) (jMo5645getSizeYbymL2g >> 32)))) << 32) | (((long) (IntOffset.m7064getYimpl(jM7080roundk4lQ0M) + ((int) (jMo5645getSizeYbymL2g & 4294967295L)))) & 4294967295L)), j3, j4, j5, fArr, delegatableNode, null);
        }
        return new RelativeLayoutBounds(j, j2, j3, j4, j5, fArr, delegatableNode, null);
    }
}
