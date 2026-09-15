package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0003\u001a\u0013\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\b\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Offset;", "positionInRoot", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInWindow", "positionOnScreen", "Landroidx/compose/ui/geometry/Rect;", "boundsInRoot", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "boundsInWindow", "positionInParent", "boundsInParent", "findRootCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LayoutCoordinatesKt {
    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5648localToRootMKHz9U(Offset.INSTANCE.m3990getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5650localToWindowMKHz9U(Offset.INSTANCE.m3990getZeroF1C5BW0());
    }

    public static final long positionOnScreen(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5649localToScreenMKHz9U(Offset.INSTANCE.m3990getZeroF1C5BW0());
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = findRootCoordinates(layoutCoordinates);
        float fMo5645getSizeYbymL2g = (int) (layoutCoordinatesFindRootCoordinates.mo5645getSizeYbymL2g() >> 32);
        float fMo5645getSizeYbymL2g2 = (int) (layoutCoordinatesFindRootCoordinates.mo5645getSizeYbymL2g() & 4294967295L);
        Rect rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinatesFindRootCoordinates, layoutCoordinates, false, 2, null);
        float left = rectLocalBoundingBoxOf$default.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > fMo5645getSizeYbymL2g) {
            left = fMo5645getSizeYbymL2g;
        }
        float top = rectLocalBoundingBoxOf$default.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > fMo5645getSizeYbymL2g2) {
            top = fMo5645getSizeYbymL2g2;
        }
        float right = rectLocalBoundingBoxOf$default.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= fMo5645getSizeYbymL2g) {
            fMo5645getSizeYbymL2g = right;
        }
        float bottom = rectLocalBoundingBoxOf$default.getBottom();
        float f = bottom >= 0.0f ? bottom : 0.0f;
        if (f <= fMo5645getSizeYbymL2g2) {
            fMo5645getSizeYbymL2g2 = f;
        }
        if (left == fMo5645getSizeYbymL2g || top == fMo5645getSizeYbymL2g2) {
            return Rect.INSTANCE.getZero();
        }
        long jMo5650localToWindowMKHz9U = layoutCoordinatesFindRootCoordinates.mo5650localToWindowMKHz9U(Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L)));
        long jMo5650localToWindowMKHz9U2 = layoutCoordinatesFindRootCoordinates.mo5650localToWindowMKHz9U(Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(top)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMo5645getSizeYbymL2g)) << 32)));
        long jMo5650localToWindowMKHz9U3 = layoutCoordinatesFindRootCoordinates.mo5650localToWindowMKHz9U(Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(fMo5645getSizeYbymL2g)) << 32) | (((long) Float.floatToRawIntBits(fMo5645getSizeYbymL2g2)) & 4294967295L)));
        long jMo5650localToWindowMKHz9U4 = layoutCoordinatesFindRootCoordinates.mo5650localToWindowMKHz9U(Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(fMo5645getSizeYbymL2g2)) & 4294967295L) | (((long) Float.floatToRawIntBits(left)) << 32)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo5650localToWindowMKHz9U >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo5650localToWindowMKHz9U2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo5650localToWindowMKHz9U4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo5650localToWindowMKHz9U3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo5650localToWindowMKHz9U & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo5650localToWindowMKHz9U2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo5650localToWindowMKHz9U4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo5650localToWindowMKHz9U3 & 4294967295L));
        return new Rect(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo5646localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m3990getZeroF1C5BW0()) : Offset.INSTANCE.m3990getZeroF1C5BW0();
    }

    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect rectLocalBoundingBoxOf$default;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, (int) (layoutCoordinates.mo5645getSizeYbymL2g() >> 32), (int) (layoutCoordinates.mo5645getSizeYbymL2g() & 4294967295L)) : rectLocalBoundingBoxOf$default;
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (parentLayoutCoordinates != null) {
            LayoutCoordinates layoutCoordinates2 = parentLayoutCoordinates;
            parentLayoutCoordinates = parentLayoutCoordinates.getParentLayoutCoordinates();
            layoutCoordinates = layoutCoordinates2;
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates;
        }
        for (NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy(); wrappedBy != null; wrappedBy = wrappedBy.getWrappedBy()) {
            nodeCoordinator = wrappedBy;
        }
        return nodeCoordinator;
    }
}
