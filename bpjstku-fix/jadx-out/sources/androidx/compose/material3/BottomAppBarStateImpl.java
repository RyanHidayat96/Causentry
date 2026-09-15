package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR+\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u0011R+\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u0011"}, d2 = {"Landroidx/compose/material3/BottomAppBarStateImpl;", "Landroidx/compose/material3/BottomAppBarState;", "", "p0", "p1", "p2", "<init>", "(FFF)V", "Landroidx/compose/runtime/MutableFloatState;", "_heightOffset", "Landroidx/compose/runtime/MutableFloatState;", "getCollapsedFraction", "()F", "collapsedFraction", "contentOffset$delegate", "getContentOffset", "setContentOffset", "(F)V", "contentOffset", "getHeightOffset", "setHeightOffset", "heightOffset", "heightOffsetLimit$delegate", "getHeightOffsetLimit", "setHeightOffsetLimit", "heightOffsetLimit"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class BottomAppBarStateImpl implements BottomAppBarState {
    private MutableFloatState _heightOffset;

    /* JADX INFO: renamed from: contentOffset$delegate, reason: from kotlin metadata */
    private final MutableFloatState contentOffset;

    /* JADX INFO: renamed from: heightOffsetLimit$delegate, reason: from kotlin metadata */
    private final MutableFloatState heightOffsetLimit;

    public BottomAppBarStateImpl(float f, float f2, float f3) {
        this.heightOffsetLimit = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.contentOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(f3);
        this._heightOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final float getHeightOffsetLimit() {
        return this.heightOffsetLimit.getFloatValue();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final void setHeightOffsetLimit(float f) {
        this.heightOffsetLimit.setFloatValue(f);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final float getHeightOffset() {
        return this._heightOffset.getFloatValue();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final void setHeightOffset(float f) {
        this._heightOffset.setFloatValue(RangesKt.coerceIn(f, getHeightOffsetLimit(), 0.0f));
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final float getContentOffset() {
        return this.contentOffset.getFloatValue();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final void setContentOffset(float f) {
        this.contentOffset.setFloatValue(f);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final float getCollapsedFraction() {
        if (getHeightOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return getHeightOffset() / getHeightOffsetLimit();
    }
}
