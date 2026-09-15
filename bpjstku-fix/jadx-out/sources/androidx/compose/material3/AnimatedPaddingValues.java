package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u000b\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0013\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\nR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/material3/AnimatedPaddingValues;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/runtime/State;", "", "p0", "Landroidx/compose/ui/unit/Dp;", "p1", "<init>", "(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "calculateBottomPadding-D9Ej5fM", "()F", "calculateBottomPadding", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateLeftPadding", "calculateRightPadding-u2uoSUM", "calculateRightPadding", "calculateTopPadding-D9Ej5fM", "calculateTopPadding", "animationProgress", "Landroidx/compose/runtime/State;", "getAnimationProgress", "()Landroidx/compose/runtime/State;", "topPadding", "getTopPadding"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AnimatedPaddingValues implements PaddingValues {
    private final State<Float> animationProgress;
    private final State<Dp> topPadding;

    public AnimatedPaddingValues(State<Float> state, State<Dp> state2) {
        this.animationProgress = state;
        this.topPadding = state2;
    }

    public final State<Float> getAnimationProgress() {
        return this.animationProgress;
    }

    public final State<Dp> getTopPadding() {
        return this.topPadding;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
    public final float getTop() {
        return Dp.m6935constructorimpl(this.topPadding.getValue().m6949unboximpl() * this.animationProgress.getValue().floatValue());
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
    public final float getBottom() {
        return Dp.m6935constructorimpl(SearchBar_androidKt.getSearchBarVerticalPadding() * this.animationProgress.getValue().floatValue());
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
    public final float mo953calculateLeftPaddingu2uoSUM(LayoutDirection p0) {
        return Dp.m6935constructorimpl(0.0f);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
    public final float mo954calculateRightPaddingu2uoSUM(LayoutDirection p0) {
        return Dp.m6935constructorimpl(0.0f);
    }
}
