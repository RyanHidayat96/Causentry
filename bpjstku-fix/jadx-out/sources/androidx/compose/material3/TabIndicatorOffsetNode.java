package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0013\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000fH\u0017ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR$\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R.\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/TabIndicatorOffsetNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/material3/TabPosition;", "p0", "", "p1", "", "p2", "<init>", "(Landroidx/compose/runtime/State;IZ)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "followContentSize", "Z", "getFollowContentSize", "()Z", "setFollowContentSize", "(Z)V", "Landroidx/compose/ui/unit/Dp;", "initialOffset", "Landroidx/compose/ui/unit/Dp;", "initialWidth", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "offsetAnimatable", "Landroidx/compose/animation/core/Animatable;", "selectedTabIndex", "I", "getSelectedTabIndex", "()I", "setSelectedTabIndex", "(I)V", "tabPositionsState", "Landroidx/compose/runtime/State;", "getTabPositionsState", "()Landroidx/compose/runtime/State;", "setTabPositionsState", "(Landroidx/compose/runtime/State;)V", "widthAnimatable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabIndicatorOffsetNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private boolean followContentSize;
    private Dp initialOffset;
    private Dp initialWidth;
    private Animatable<Dp, AnimationVector1D> offsetAnimatable;
    private int selectedTabIndex;
    private State<? extends List<TabPosition>> tabPositionsState;
    private Animatable<Dp, AnimationVector1D> widthAnimatable;

    public final State<List<TabPosition>> getTabPositionsState() {
        return this.tabPositionsState;
    }

    public final void setTabPositionsState(State<? extends List<TabPosition>> state) {
        this.tabPositionsState = state;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final void setSelectedTabIndex(int i) {
        this.selectedTabIndex = i;
    }

    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    public final void setFollowContentSize(boolean z) {
        this.followContentSize = z;
    }

    public TabIndicatorOffsetNode(State<? extends List<TabPosition>> state, int i, boolean z) {
        this.tabPositionsState = state;
        this.selectedTabIndex = i;
        this.followContentSize = z;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo412measure3p2s80s(final MeasureScope measureScope, Measurable measurable, final long j) {
        long jM6878copyZbe2FdA$default;
        if (this.tabPositionsState.getValue().isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$measure$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        float contentWidth = this.tabPositionsState.getValue().get(this.selectedTabIndex).getContentWidth();
        if (this.followContentSize) {
            Dp dp = this.initialWidth;
            if (dp != null) {
                Animatable<Dp, AnimationVector1D> animatable = this.widthAnimatable;
                if (animatable == null) {
                    Intrinsics.checkNotNull(dp);
                    animatable = new Animatable<>(dp, VectorConvertersKt.getVectorConverter(Dp.INSTANCE), null, null, 12, null);
                    this.widthAnimatable = animatable;
                }
                if (!Dp.m6940equalsimpl0(contentWidth, animatable.getTargetValue().m6949unboximpl())) {
                    b.TuitionPaymentFragmentbindingInflater1(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$2(animatable, contentWidth, null), 3, null);
                }
            } else {
                this.initialWidth = Dp.m6933boximpl(contentWidth);
            }
        }
        float left = this.tabPositionsState.getValue().get(this.selectedTabIndex).getLeft();
        Dp dp2 = this.initialOffset;
        if (dp2 != null) {
            Animatable<Dp, AnimationVector1D> animatable2 = this.offsetAnimatable;
            if (animatable2 == null) {
                Intrinsics.checkNotNull(dp2);
                animatable2 = new Animatable<>(dp2, VectorConvertersKt.getVectorConverter(Dp.INSTANCE), null, null, 12, null);
                this.offsetAnimatable = animatable2;
            }
            if (!Dp.m6940equalsimpl0(left, animatable2.getTargetValue().m6949unboximpl())) {
                b.TuitionPaymentFragmentbindingInflater1(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$3(animatable2, left, null), 3, null);
            }
        } else {
            this.initialOffset = Dp.m6933boximpl(left);
        }
        Animatable<Dp, AnimationVector1D> animatable3 = this.offsetAnimatable;
        if (animatable3 != null) {
            left = animatable3.getValue().m6949unboximpl();
        }
        final float f = left;
        if (this.followContentSize) {
            Animatable<Dp, AnimationVector1D> animatable4 = this.widthAnimatable;
            if (animatable4 != null) {
                contentWidth = animatable4.getValue().m6949unboximpl();
            }
            jM6878copyZbe2FdA$default = Constraints.m6878copyZbe2FdA$default(j, measureScope.mo688roundToPx0680j_4(contentWidth), measureScope.mo688roundToPx0680j_4(contentWidth), 0, 0, 12, null);
        } else {
            jM6878copyZbe2FdA$default = j;
        }
        final Placeable placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(jM6878copyZbe2FdA$default);
        return MeasureScope.layout$default(measureScope, placeableMo5637measureBRTryo0.getWidth(), Constraints.m6887getMaxHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$measure$4
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo5637measureBRTryo0, measureScope.mo688roundToPx0680j_4(f), Constraints.m6887getMaxHeightimpl(j) - placeableMo5637measureBRTryo0.getHeight(), 0.0f, 4, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null);
    }
}
