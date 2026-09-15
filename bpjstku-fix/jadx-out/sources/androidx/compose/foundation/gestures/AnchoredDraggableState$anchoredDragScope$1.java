package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\"\u0010\f\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00018\u00008\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDragScope$1;", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "", "p0", "p1", "", "dragTo", "(FF)V", "", "updateBounds", "(Z)V", "updateIfNeeded", "distance", "F", "getDistance", "()F", "setDistance", "(F)V", "leftBound", "Ljava/lang/Object;", "getLeftBound", "()Ljava/lang/Object;", "setLeftBound", "(Ljava/lang/Object;)V", "rightBound", "getRightBound", "setRightBound"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AnchoredDraggableState$anchoredDragScope$1 implements AnchoredDragScope {
    private float distance = Float.NaN;
    private T leftBound;
    private T rightBound;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    AnchoredDraggableState$anchoredDragScope$1(AnchoredDraggableState<T> anchoredDraggableState) {
        this.this$0 = anchoredDraggableState;
    }

    public final T getLeftBound() {
        return this.leftBound;
    }

    public final void setLeftBound(T t) {
        this.leftBound = t;
    }

    public final T getRightBound() {
        return this.rightBound;
    }

    public final void setRightBound(T t) {
        this.rightBound = t;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final void setDistance(float f) {
        this.distance = f;
    }

    @Override // androidx.compose.foundation.gestures.AnchoredDragScope
    public final void dragTo(float p0, float p1) {
        float offset = this.this$0.getOffset();
        this.this$0.setOffset(p0);
        this.this$0.setLastVelocity(p1);
        if (Float.isNaN(offset)) {
            return;
        }
        updateIfNeeded(p0 >= offset);
    }

    public final void updateIfNeeded(boolean p0) {
        updateBounds(p0);
        if (Math.abs(this.this$0.getOffset() - this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue())) >= this.distance / 2.0f) {
            Object currentValue = p0 ? this.rightBound : this.leftBound;
            if (currentValue == null) {
                currentValue = this.this$0.getCurrentValue();
            }
            if (((Boolean) this.this$0.getConfirmValueChange$foundation_release().invoke(currentValue)).booleanValue()) {
                this.this$0.setCurrentValue(currentValue);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [T, java.lang.Object] */
    public final void updateBounds(boolean p0) {
        T currentValue;
        Object currentValue2;
        if (this.this$0.getOffset() == this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue())) {
            Object objClosestAnchor = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset() + (p0 ? 1.0f : -1.0f), p0);
            T t = objClosestAnchor;
            if (objClosestAnchor == null) {
                currentValue2 = this.this$0.getCurrentValue();
            }
            if (p0) {
                t = currentValue2;
                this.leftBound = this.this$0.getCurrentValue();
                this.rightBound = t;
            } else {
                t = currentValue2;
                this.leftBound = t;
                this.rightBound = this.this$0.getCurrentValue();
            }
        } else {
            Object objClosestAnchor2 = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset(), false);
            if (objClosestAnchor2 == null) {
                currentValue = objClosestAnchor2;
                currentValue = this.this$0.getCurrentValue();
            }
            currentValue = objClosestAnchor2;
            Object objClosestAnchor3 = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset(), true);
            T currentValue3 = objClosestAnchor3;
            if (objClosestAnchor3 == null) {
                currentValue3 = this.this$0.getCurrentValue();
            }
            this.leftBound = currentValue;
            this.rightBound = currentValue3;
        }
        DraggableAnchors anchors = this.this$0.getAnchors();
        Object obj = this.leftBound;
        Intrinsics.checkNotNull(obj);
        float fPositionOf = anchors.positionOf(obj);
        DraggableAnchors anchors2 = this.this$0.getAnchors();
        Object obj2 = this.rightBound;
        Intrinsics.checkNotNull(obj2);
        this.distance = Math.abs(fPositionOf - anchors2.positionOf(obj2));
    }
}
