package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\rH&¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\bR\u0014\u0010#\u001a\u00020 8EX\u0084\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/foundation/RectListNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "p1", "Landroid/graphics/Rect;", "calcBounds", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Rect;", "Landroidx/compose/runtime/collection/MutableVector;", "currentRects", "()Landroidx/compose/runtime/collection/MutableVector;", "", "onDetach", "()V", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "replaceRect", "(Landroid/graphics/Rect;)V", "updateRects", "(Landroidx/compose/runtime/collection/MutableVector;)V", "androidRect", "Landroid/graphics/Rect;", "rect", "Lkotlin/jvm/functions/Function1;", "getRect", "()Lkotlin/jvm/functions/Function1;", "setRect", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    public static final int $stable = 8;
    private Rect androidRect;
    private Function1<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> rect;

    public abstract MutableVector<Rect> currentRects();

    public abstract void updateRects(MutableVector<Rect> p0);

    public Function1<LayoutCoordinates, androidx.compose.ui.geometry.Rect> getRect() {
        return this.rect;
    }

    public void setRect(Function1<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> function1) {
        this.rect = function1;
    }

    public RectListNode(Function1<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> function1) {
        this.rect = function1;
    }

    protected final View getView() {
        return DelegatableNode_androidKt.requireView(this);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates p0) {
        Rect rectCalcBounds;
        if (getRect() == null) {
            androidx.compose.ui.geometry.Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(p0);
            rectCalcBounds = new Rect(MathKt.roundToInt(rectBoundsInRoot.getLeft()), MathKt.roundToInt(rectBoundsInRoot.getTop()), MathKt.roundToInt(rectBoundsInRoot.getRight()), MathKt.roundToInt(rectBoundsInRoot.getBottom()));
        } else {
            Function1<LayoutCoordinates, androidx.compose.ui.geometry.Rect> rect = getRect();
            Intrinsics.checkNotNull(rect);
            rectCalcBounds = calcBounds(p0, rect.invoke(p0));
        }
        replaceRect(rectCalcBounds);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        replaceRect(null);
    }

    private final void replaceRect(Rect p0) {
        MutableVector<Rect> mutableVectorCurrentRects = currentRects();
        Rect rect = this.androidRect;
        if (rect != null) {
            mutableVectorCurrentRects.remove(rect);
        }
        if (p0 != null && !p0.isEmpty()) {
            mutableVectorCurrentRects.add(p0);
        }
        updateRects(mutableVectorCurrentRects);
        this.androidRect = p0;
    }

    private final Rect calcBounds(LayoutCoordinates p0, androidx.compose.ui.geometry.Rect p1) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(p0);
        long jMo5646localPositionOfR5De75A = layoutCoordinatesFindRootCoordinates.mo5646localPositionOfR5De75A(p0, p1.m4009getTopLeftF1C5BW0());
        long jMo5646localPositionOfR5De75A2 = layoutCoordinatesFindRootCoordinates.mo5646localPositionOfR5De75A(p0, p1.m4010getTopRightF1C5BW0());
        long jMo5646localPositionOfR5De75A3 = layoutCoordinatesFindRootCoordinates.mo5646localPositionOfR5De75A(p0, p1.m4002getBottomLeftF1C5BW0());
        long jMo5646localPositionOfR5De75A4 = layoutCoordinatesFindRootCoordinates.mo5646localPositionOfR5De75A(p0, p1.m4003getBottomRightF1C5BW0());
        return new Rect(MathKt.roundToInt(ComparisonsKt.minOf(Offset.m3974getXimpl(jMo5646localPositionOfR5De75A), Offset.m3974getXimpl(jMo5646localPositionOfR5De75A2), Offset.m3974getXimpl(jMo5646localPositionOfR5De75A3), Offset.m3974getXimpl(jMo5646localPositionOfR5De75A4))), MathKt.roundToInt(ComparisonsKt.minOf(Offset.m3975getYimpl(jMo5646localPositionOfR5De75A), Offset.m3975getYimpl(jMo5646localPositionOfR5De75A2), Offset.m3975getYimpl(jMo5646localPositionOfR5De75A3), Offset.m3975getYimpl(jMo5646localPositionOfR5De75A4))), MathKt.roundToInt(ComparisonsKt.maxOf(Offset.m3974getXimpl(jMo5646localPositionOfR5De75A), Offset.m3974getXimpl(jMo5646localPositionOfR5De75A2), Offset.m3974getXimpl(jMo5646localPositionOfR5De75A3), Offset.m3974getXimpl(jMo5646localPositionOfR5De75A4))), MathKt.roundToInt(ComparisonsKt.maxOf(Offset.m3975getYimpl(jMo5646localPositionOfR5De75A), Offset.m3975getYimpl(jMo5646localPositionOfR5De75A2), Offset.m3975getYimpl(jMo5646localPositionOfR5De75A3), Offset.m3975getYimpl(jMo5646localPositionOfR5De75A4))));
    }
}
