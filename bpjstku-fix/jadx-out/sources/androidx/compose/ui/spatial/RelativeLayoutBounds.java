package androidx.compose.ui.spatial;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010'\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010$R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0011\u0010/\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00101\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0011\u00103\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b2\u0010.R\u0011\u00105\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b4\u0010\"R\u0011\u00107\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b6\u0010\"R\u0011\u0010:\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010<\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b;\u00109R\u0011\u0010>\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b=\u00109"}, d2 = {"Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "", "p0", "p1", "Landroidx/compose/ui/unit/IntOffset;", "p2", "p3", "p4", "Landroidx/compose/ui/graphics/Matrix;", "p5", "Landroidx/compose/ui/node/DelegatableNode;", "p6", "<init>", "(JJJJJ[FLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Landroidx/compose/ui/unit/IntRect;", "calculateOcclusions", "()Ljava/util/List;", "", "fractionVisibleIn", "(Landroidx/compose/ui/spatial/RelativeLayoutBounds;)F", "", "fractionVisibleInRect", "(IIII)F", "fractionVisibleInWindow", "()F", "fractionVisibleInWindowWithInsets-E1MhUcY", "(JJ)F", "fractionVisibleInWindowWithInsets", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "topLeft", "J", "bottomRight", "windowOffset", "screenOffset", "windowSize", "viewToWindowMatrix", "[F", "node", "Landroidx/compose/ui/node/DelegatableNode;", "getPositionInRoot-nOcc-ac", "()J", "positionInRoot", "getPositionInWindow-nOcc-ac", "positionInWindow", "getPositionInScreen-nOcc-ac", "positionInScreen", "getWidth", "width", "getHeight", "height", "getBoundsInRoot", "()Landroidx/compose/ui/unit/IntRect;", "boundsInRoot", "getBoundsInWindow", "boundsInWindow", "getBoundsInScreen", "boundsInScreen"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RelativeLayoutBounds {
    public static final int $stable = 8;
    private final long bottomRight;
    private final DelegatableNode node;
    private final long screenOffset;
    private final long topLeft;
    private final float[] viewToWindowMatrix;
    private final long windowOffset;
    private final long windowSize;

    private RelativeLayoutBounds(long j, long j2, long j3, long j4, long j5, float[] fArr, DelegatableNode delegatableNode) {
        this.topLeft = j;
        this.bottomRight = j2;
        this.windowOffset = j3;
        this.screenOffset = j4;
        this.windowSize = j5;
        this.viewToWindowMatrix = fArr;
        this.node = delegatableNode;
    }

    /* JADX INFO: renamed from: getPositionInRoot-nOcc-ac, reason: not valid java name */
    public final long m6173getPositionInRootnOccac() {
        return IntOffset.m7057constructorimpl(this.topLeft);
    }

    /* JADX INFO: renamed from: getPositionInWindow-nOcc-ac, reason: not valid java name */
    public final long m6175getPositionInWindownOccac() {
        int iM7063getXimpl = IntOffset.m7063getXimpl(this.screenOffset);
        int iM7063getXimpl2 = IntOffset.m7063getXimpl(this.windowOffset);
        int iM7064getYimpl = IntOffset.m7064getYimpl(this.screenOffset);
        int iM7064getYimpl2 = IntOffset.m7064getYimpl(this.windowOffset);
        long j = this.topLeft;
        return IntOffset.m7057constructorimpl((((long) (((int) (j >> 32)) + (iM7063getXimpl - iM7063getXimpl2))) << 32) | (((long) (((int) j) + (iM7064getYimpl - iM7064getYimpl2))) & 4294967295L));
    }

    /* JADX INFO: renamed from: getPositionInScreen-nOcc-ac, reason: not valid java name */
    public final long m6174getPositionInScreennOccac() {
        int iM7063getXimpl = IntOffset.m7063getXimpl(this.screenOffset);
        int iM7064getYimpl = IntOffset.m7064getYimpl(this.screenOffset);
        long j = this.topLeft;
        return IntOffset.m7057constructorimpl((((long) (((int) j) + iM7064getYimpl)) & 4294967295L) | ((((int) (j >> 32)) + iM7063getXimpl) << 32));
    }

    public final int getWidth() {
        return ((int) (this.bottomRight >> 32)) - ((int) (this.topLeft >> 32));
    }

    public final int getHeight() {
        return ((int) this.bottomRight) - ((int) this.topLeft);
    }

    public final IntRect getBoundsInRoot() {
        long j = this.topLeft;
        long j2 = this.bottomRight;
        return new IntRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
    }

    public final IntRect getBoundsInWindow() {
        long j = this.topLeft;
        int i = (int) (j >> 32);
        int i2 = (int) j;
        long j2 = this.bottomRight;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) j2;
        float[] fArr = this.viewToWindowMatrix;
        if (fArr != null) {
            return IntRectKt.roundToIntRect(Matrix.m4468mapimpl(fArr, new Rect(i, i2, i3, i4)));
        }
        int iM7063getXimpl = IntOffset.m7063getXimpl(this.screenOffset) - IntOffset.m7063getXimpl(this.windowOffset);
        int iM7064getYimpl = IntOffset.m7064getYimpl(this.screenOffset) - IntOffset.m7064getYimpl(this.windowOffset);
        return new IntRect(i + iM7063getXimpl, i2 + iM7064getYimpl, i3 + iM7063getXimpl, i4 + iM7064getYimpl);
    }

    public final IntRect getBoundsInScreen() {
        if (this.viewToWindowMatrix != null) {
            IntRect boundsInWindow = getBoundsInWindow();
            long j = this.windowOffset;
            return new IntRect(boundsInWindow.getLeft() + IntOffset.m7063getXimpl(j), boundsInWindow.getTop() + IntOffset.m7064getYimpl(j), boundsInWindow.getRight() + IntOffset.m7063getXimpl(j), boundsInWindow.getBottom() + IntOffset.m7064getYimpl(j));
        }
        long j2 = this.topLeft;
        int i = (int) (j2 >> 32);
        long j3 = this.bottomRight;
        int i2 = (int) (j3 >> 32);
        int i3 = (int) j3;
        int iM7063getXimpl = IntOffset.m7063getXimpl(this.screenOffset);
        int iM7064getYimpl = IntOffset.m7064getYimpl(this.screenOffset);
        return new IntRect(i + iM7063getXimpl, ((int) j2) + iM7064getYimpl, i2 + iM7063getXimpl, i3 + iM7064getYimpl);
    }

    public final List<IntRect> calculateOcclusions() {
        int i;
        int i2;
        RectManager rectManager = DelegatableNodeKt.requireOwner(this.node).getRectManager();
        int semanticsId = DelegatableNodeKt.requireLayoutNode(this.node).getSemanticsId();
        RectList rects = rectManager.getRects();
        int iIndexOf = rects.indexOf(semanticsId);
        if (iIndexOf < 0) {
            return CollectionsKt.emptyList();
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        long[] jArr = rects.items;
        int i3 = rects.itemsSize;
        long j = jArr[iIndexOf];
        long j2 = jArr[iIndexOf + 1];
        int i4 = 0;
        while (i4 < jArr.length - 2 && i4 < i3) {
            if (i4 == iIndexOf) {
                i4 += 3;
            } else {
                long j3 = jArr[i4];
                long j4 = jArr[i4 + 1];
                if (((((j2 - j3) - InlineClassHelperKt.Uint64Low32) | ((j4 - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    i = i3;
                    i2 = iIndexOf;
                    int i5 = (int) (j3 >> 32);
                    int i6 = (int) j3;
                    int i7 = (int) (j4 >> 32);
                    int i8 = (int) j4;
                    if (rectManager.isTargetDrawnFirst$ui_release(semanticsId, ((int) jArr[i4 + 2]) & RectListKt.Lower26Bits)) {
                        listCreateListBuilder.add(new IntRect(i5, i6, i7, i8));
                    }
                } else {
                    i = i3;
                    i2 = iIndexOf;
                }
                i4 += 3;
                iIndexOf = i2;
                i3 = i;
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public final float fractionVisibleIn(RelativeLayoutBounds p0) {
        long j = p0.topLeft;
        long j2 = p0.bottomRight;
        return fractionVisibleInRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
    }

    public final float fractionVisibleInRect(int p0, int p1, int p2, int p3) {
        int i = (int) (this.topLeft >> 32);
        int iMin = Math.min(Math.max(i, p0), p2);
        int i2 = (int) this.topLeft;
        int iMin2 = Math.min(Math.max(i2, p1), p3);
        int i3 = (int) (this.bottomRight >> 32);
        int iMax = Math.max(Math.min(i3, p2), p0);
        int i4 = (int) this.bottomRight;
        return Math.max((iMax - iMin) * (Math.max(Math.min(i4, p3), p1) - iMin2), 0) / Math.min((p2 - p0) * (p3 - p1), (i3 - i) * (i4 - i2));
    }

    public final float fractionVisibleInWindow() {
        long j = this.windowSize;
        return fractionVisibleInRect(0, 0, (int) (j >> 32), (int) j);
    }

    /* JADX INFO: renamed from: fractionVisibleInWindowWithInsets-E1MhUcY, reason: not valid java name */
    public final float m6172fractionVisibleInWindowWithInsetsE1MhUcY(long p0, long p1) {
        long j = this.windowSize;
        int iM7063getXimpl = IntOffset.m7063getXimpl(this.windowOffset);
        int iM7064getYimpl = IntOffset.m7064getYimpl(this.windowOffset);
        int i = (int) (j >> 32);
        return fractionVisibleInRect(IntOffset.m7063getXimpl(p0) + iM7063getXimpl, IntOffset.m7064getYimpl(p0) + iM7064getYimpl, (iM7063getXimpl + i) - IntOffset.m7063getXimpl(p1), (iM7064getYimpl + ((int) j)) - IntOffset.m7064getYimpl(p1));
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass()) {
            return false;
        }
        RelativeLayoutBounds relativeLayoutBounds = (RelativeLayoutBounds) p0;
        if (this.topLeft != relativeLayoutBounds.topLeft || this.bottomRight != relativeLayoutBounds.bottomRight || this.windowSize != relativeLayoutBounds.windowSize || !IntOffset.m7062equalsimpl0(this.windowOffset, relativeLayoutBounds.windowOffset) || !IntOffset.m7062equalsimpl0(this.screenOffset, relativeLayoutBounds.screenOffset)) {
            return false;
        }
        float[] fArr = this.viewToWindowMatrix;
        float[] fArr2 = relativeLayoutBounds.viewToWindowMatrix;
        if (fArr != null ? fArr2 != null && Matrix.m4463equalsimpl0(fArr, fArr2) : fArr2 == null) {
            return Intrinsics.areEqual(this.node, relativeLayoutBounds.node);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.topLeft);
        int iHashCode2 = Long.hashCode(this.bottomRight);
        int iHashCode3 = Long.hashCode(this.windowSize);
        int iM7065hashCodeimpl = IntOffset.m7065hashCodeimpl(this.windowOffset);
        int iM7065hashCodeimpl2 = IntOffset.m7065hashCodeimpl(this.screenOffset);
        float[] fArr = this.viewToWindowMatrix;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iM7065hashCodeimpl) * 31) + iM7065hashCodeimpl2) * 31) + (fArr != null ? Matrix.m4465hashCodeimpl(fArr) : 0)) * 31) + this.node.hashCode();
    }

    public /* synthetic */ RelativeLayoutBounds(long j, long j2, long j3, long j4, long j5, float[] fArr, DelegatableNode delegatableNode, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, fArr, delegatableNode);
    }
}
