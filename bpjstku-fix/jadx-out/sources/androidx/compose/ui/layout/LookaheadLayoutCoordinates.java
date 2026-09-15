package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010#J\u0018\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020%H\u0096\u0002¢\u0006\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0011\u00100\u001a\u00020-8G¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020%058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u0010;\u001a\u0004\u0018\u00010\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010=\u001a\u0004\u0018\u00010\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010>\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010?R\u0014\u0010C\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u00103"}, d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/LookaheadDelegate;", "p0", "<init>", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "Landroidx/compose/ui/geometry/Offset;", "screenToLocal-MK-Hz9U", "(J)J", "screenToLocal", "localToScreen-MK-Hz9U", "localToScreen", "windowToLocal-MK-Hz9U", "windowToLocal", "localToWindow-MK-Hz9U", "localToWindow", "localToRoot-MK-Hz9U", "localToRoot", "p1", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "", "p2", "localPositionOf-S_NoaFU", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "Landroidx/compose/ui/geometry/Rect;", "localBoundingBoxOf", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/Matrix;", "", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "transformToScreen-58bKbWc", "([F)V", "transformToScreen", "Landroidx/compose/ui/layout/AlignmentLine;", "", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "lookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "isAttached", "()Z", "getIntroducesMotionFrameOfReference", "introducesMotionFrameOfReference", "getLookaheadOffset-F1C5BW0", "lookaheadOffset"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    public static final int $stable = 0;
    private final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinates(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public final long mo5645getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return IntSize.m7101constructorimpl((((long) lookaheadDelegate.getWidth()) << 32) | (((long) lookaheadDelegate.getHeight()) & 4294967295L));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates);
        }
        NodeCoordinator wrappedBy = getCoordinator().getLayoutNode().getOuterCoordinator$ui_release().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates);
        }
        NodeCoordinator wrappedBy = getCoordinator().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final boolean isAttached() {
        return getCoordinator().isAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final boolean getIntroducesMotionFrameOfReference() {
        return this.lookaheadDelegate.getIsPlacedUnderMotionFrameOfReference();
    }

    /* JADX INFO: renamed from: getLookaheadOffset-F1C5BW0, reason: not valid java name */
    private final long m5665getLookaheadOffsetF1C5BW0() {
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        return Offset.m3978minusMKHz9U(mo5646localPositionOfR5De75A(rootLookaheadDelegate.getCoordinates(), Offset.INSTANCE.m3990getZeroF1C5BW0()), getCoordinator().mo5646localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), Offset.INSTANCE.m3990getZeroF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public final long mo5651screenToLocalMKHz9U(long p0) {
        return Offset.m3979plusMKHz9U(getCoordinator().mo5651screenToLocalMKHz9U(p0), m5665getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    public final long mo5649localToScreenMKHz9U(long p0) {
        return getCoordinator().mo5649localToScreenMKHz9U(Offset.m3979plusMKHz9U(p0, m5665getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public final long mo5654windowToLocalMKHz9U(long p0) {
        return Offset.m3979plusMKHz9U(getCoordinator().mo5654windowToLocalMKHz9U(p0), m5665getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public final long mo5650localToWindowMKHz9U(long p0) {
        return getCoordinator().mo5650localToWindowMKHz9U(Offset.m3979plusMKHz9U(p0, m5665getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public final long mo5648localToRootMKHz9U(long p0) {
        return getCoordinator().mo5648localToRootMKHz9U(Offset.m3979plusMKHz9U(p0, m5665getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public final long mo5646localPositionOfR5De75A(LayoutCoordinates p0, long p1) {
        return mo5647localPositionOfS_NoaFU(p0, p1, true);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-S_NoaFU */
    public final long mo5647localPositionOfS_NoaFU(LayoutCoordinates p0, long p1, boolean p2) {
        if (p0 instanceof LookaheadLayoutCoordinates) {
            LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinates) p0).lookaheadDelegate;
            lookaheadDelegate.getCoordinator().onCoordinatesUsed$ui_release();
            LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                boolean z = !p2;
                long jM7066minusqkQi6aY = IntOffset.m7066minusqkQi6aY(IntOffset.m7067plusqkQi6aY(lookaheadDelegate.m5868positionIniSbpLlY$ui_release(lookaheadDelegate2, z), IntOffsetKt.m7080roundk4lQ0M(p1)), this.lookaheadDelegate.m5868positionIniSbpLlY$ui_release(lookaheadDelegate2, z));
                return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m7063getXimpl(jM7066minusqkQi6aY))) << 32) | (((long) Float.floatToRawIntBits(IntOffset.m7064getYimpl(jM7066minusqkQi6aY))) & 4294967295L));
            }
            LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
            boolean z2 = !p2;
            long jM7067plusqkQi6aY = IntOffset.m7067plusqkQi6aY(IntOffset.m7067plusqkQi6aY(lookaheadDelegate.m5868positionIniSbpLlY$ui_release(rootLookaheadDelegate, z2), rootLookaheadDelegate.getPosition()), IntOffsetKt.m7080roundk4lQ0M(p1));
            LookaheadDelegate rootLookaheadDelegate2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
            long jM7066minusqkQi6aY2 = IntOffset.m7066minusqkQi6aY(jM7067plusqkQi6aY, IntOffset.m7067plusqkQi6aY(this.lookaheadDelegate.m5868positionIniSbpLlY$ui_release(rootLookaheadDelegate2, z2), rootLookaheadDelegate2.getPosition()));
            long jM3966constructorimpl = Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m7064getYimpl(jM7066minusqkQi6aY2))) & 4294967295L) | (((long) Float.floatToRawIntBits(IntOffset.m7063getXimpl(jM7066minusqkQi6aY2))) << 32));
            NodeCoordinator wrappedBy = rootLookaheadDelegate2.getCoordinator().getWrappedBy();
            Intrinsics.checkNotNull(wrappedBy);
            NodeCoordinator wrappedBy2 = rootLookaheadDelegate.getCoordinator().getWrappedBy();
            Intrinsics.checkNotNull(wrappedBy2);
            return wrappedBy.mo5647localPositionOfS_NoaFU(wrappedBy2, jM3966constructorimpl, p2);
        }
        LookaheadDelegate rootLookaheadDelegate3 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        long jMo5647localPositionOfS_NoaFU = mo5647localPositionOfS_NoaFU(rootLookaheadDelegate3.getLookaheadLayoutCoordinates(), p1, p2);
        long position = rootLookaheadDelegate3.getPosition();
        long jM3978minusMKHz9U = Offset.m3978minusMKHz9U(jMo5647localPositionOfS_NoaFU, Offset.m3966constructorimpl((4294967295L & ((long) Float.floatToRawIntBits(IntOffset.m7064getYimpl(position)))) | (((long) Float.floatToRawIntBits(IntOffset.m7063getXimpl(position))) << 32)));
        LayoutCoordinates parentCoordinates = rootLookaheadDelegate3.getCoordinator().getParentCoordinates();
        if (parentCoordinates == null) {
            parentCoordinates = rootLookaheadDelegate3.getCoordinator().getCoordinates();
        }
        return Offset.m3979plusMKHz9U(jM3978minusMKHz9U, parentCoordinates.mo5647localPositionOfS_NoaFU(p0, Offset.INSTANCE.m3990getZeroF1C5BW0(), p2));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final Rect localBoundingBoxOf(LayoutCoordinates p0, boolean p1) {
        return getCoordinator().localBoundingBoxOf(p0, p1);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    public final void mo5652transformFromEL8BTi8(LayoutCoordinates p0, float[] p1) {
        getCoordinator().mo5652transformFromEL8BTi8(p0, p1);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformToScreen-58bKbWc */
    public final void mo5653transformToScreen58bKbWc(float[] p0) {
        getCoordinator().mo5653transformToScreen58bKbWc(p0);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final int get(AlignmentLine p0) {
        return this.lookaheadDelegate.get(p0);
    }
}
