package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u000e\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/layout/PaddingValues;", "p0", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "p1", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "getPaddingValues", "()Landroidx/compose/foundation/layout/PaddingValues;", "setPaddingValues"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {
    private PaddingValues paddingValues;

    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    public final void setPaddingValues(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    public PaddingValuesModifier(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo412measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j) {
        if (Dp.m6934compareTo0680j_4(this.paddingValues.mo953calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection()), Dp.m6935constructorimpl(0.0f)) < 0 || Dp.m6934compareTo0680j_4(this.paddingValues.getTop(), Dp.m6935constructorimpl(0.0f)) < 0 || Dp.m6934compareTo0680j_4(this.paddingValues.mo954calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()), Dp.m6935constructorimpl(0.0f)) < 0 || Dp.m6934compareTo0680j_4(this.paddingValues.getBottom(), Dp.m6935constructorimpl(0.0f)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
        int i = measureScope.mo688roundToPx0680j_4(this.paddingValues.mo953calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope.mo688roundToPx0680j_4(this.paddingValues.mo954calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()));
        int i2 = measureScope.mo688roundToPx0680j_4(this.paddingValues.getTop()) + measureScope.mo688roundToPx0680j_4(this.paddingValues.getBottom());
        final Placeable placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(ConstraintsKt.m6907offsetNN6EwU(j, -i, -i2));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m6905constrainWidthK40F9xA(j, placeableMo5637measureBRTryo0.getWidth() + i), ConstraintsKt.m6904constrainHeightK40F9xA(j, placeableMo5637measureBRTryo0.getHeight() + i2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo5637measureBRTryo0, measureScope.mo688roundToPx0680j_4(this.getPaddingValues().mo953calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())), measureScope.mo688roundToPx0680j_4(this.getPaddingValues().getTop()), 0.0f, 4, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null);
    }
}
