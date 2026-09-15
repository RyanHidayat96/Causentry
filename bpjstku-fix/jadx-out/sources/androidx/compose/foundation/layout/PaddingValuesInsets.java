package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/foundation/layout/PaddingValues;", "p0", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/unit/Density;", "", "getBottom", "(Landroidx/compose/ui/unit/Density;)I", "Landroidx/compose/ui/unit/LayoutDirection;", "p1", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getRight", "getTop", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PaddingValuesInsets implements WindowInsets {
    private final PaddingValues paddingValues;

    public PaddingValuesInsets(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density p0, LayoutDirection p1) {
        return p0.mo688roundToPx0680j_4(this.paddingValues.mo953calculateLeftPaddingu2uoSUM(p1));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density p0) {
        return p0.mo688roundToPx0680j_4(this.paddingValues.getTop());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density p0, LayoutDirection p1) {
        return p0.mo688roundToPx0680j_4(this.paddingValues.mo954calculateRightPaddingu2uoSUM(p1));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density p0) {
        return p0.mo688roundToPx0680j_4(this.paddingValues.getBottom());
    }

    public final String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        float fMo953calculateLeftPaddingu2uoSUM = this.paddingValues.mo953calculateLeftPaddingu2uoSUM(layoutDirection);
        float top = this.paddingValues.getTop();
        float fMo954calculateRightPaddingu2uoSUM = this.paddingValues.mo954calculateRightPaddingu2uoSUM(layoutDirection);
        float bottom = this.paddingValues.getBottom();
        StringBuilder sb = new StringBuilder("PaddingValues(");
        sb.append((Object) Dp.m6946toStringimpl(fMo953calculateLeftPaddingu2uoSUM));
        sb.append(", ");
        sb.append((Object) Dp.m6946toStringimpl(top));
        sb.append(", ");
        sb.append((Object) Dp.m6946toStringimpl(fMo954calculateRightPaddingu2uoSUM));
        sb.append(", ");
        sb.append((Object) Dp.m6946toStringimpl(bottom));
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 instanceof PaddingValuesInsets) {
            return Intrinsics.areEqual(((PaddingValuesInsets) p0).paddingValues, this.paddingValues);
        }
        return false;
    }

    public final int hashCode() {
        return this.paddingValues.hashCode();
    }
}
