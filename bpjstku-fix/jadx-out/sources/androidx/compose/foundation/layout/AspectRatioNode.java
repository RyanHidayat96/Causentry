package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\r\u001a\u00020\n*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J&\u0010\u0019\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0012J#\u0010\u001b\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u0012J \u0010\u001e\u001a\u00020\n*\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\u00020\n*\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ \u0010\"\u001a\u00020\n*\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001dJ \u0010$\u001a\u00020\n*\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001dR\"\u0010%\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "", "p0", "", "p1", "<init>", "(FZ)V", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/IntSize;", "findSize-ToXhtMw", "(J)J", "findSize", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "maxIntrinsicHeight", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxHeight", "tryMaxWidth-JN-0ABg", "tryMaxWidth", "tryMinHeight-JN-0ABg", "tryMinHeight", "tryMinWidth-JN-0ABg", "tryMinWidth", "aspectRatio", "F", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "matchHeightConstraintsFirst", "Z", "getMatchHeightConstraintsFirst", "()Z", "setMatchHeightConstraintsFirst", "(Z)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public final void setMatchHeightConstraintsFirst(boolean z) {
        this.matchHeightConstraintsFirst = z;
    }

    public AspectRatioNode(float f, boolean z) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo412measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long jM899findSizeToXhtMw = m899findSizeToXhtMw(j);
        if (!IntSize.m7104equalsimpl0(jM899findSizeToXhtMw, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
            j = Constraints.INSTANCE.m6898fixedJhjzzOo(IntSize.m7106getWidthimpl(jM899findSizeToXhtMw), IntSize.m7105getHeightimpl(jM899findSizeToXhtMw));
        }
        final Placeable placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, placeableMo5637measureBRTryo0.getWidth(), placeableMo5637measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5637measureBRTryo0, 0, 0, 0.0f, 4, null);
            }

            {
                super(1);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i == Integer.MAX_VALUE) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        return Math.round(i * this.aspectRatio);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i == Integer.MAX_VALUE) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }
        return Math.round(i * this.aspectRatio);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i == Integer.MAX_VALUE) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        return Math.round(i / this.aspectRatio);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i == Integer.MAX_VALUE) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        return Math.round(i / this.aspectRatio);
    }

    /* JADX INFO: renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m899findSizeToXhtMw(long j) {
        if (!this.matchHeightConstraintsFirst) {
            long jM903tryMaxWidthJN0ABg$default = m903tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m7104equalsimpl0(jM903tryMaxWidthJN0ABg$default, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                return jM903tryMaxWidthJN0ABg$default;
            }
            long jM901tryMaxHeightJN0ABg$default = m901tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m7104equalsimpl0(jM901tryMaxHeightJN0ABg$default, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                return jM901tryMaxHeightJN0ABg$default;
            }
            long jM907tryMinWidthJN0ABg$default = m907tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m7104equalsimpl0(jM907tryMinWidthJN0ABg$default, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                return jM907tryMinWidthJN0ABg$default;
            }
            long jM905tryMinHeightJN0ABg$default = m905tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m7104equalsimpl0(jM905tryMinHeightJN0ABg$default, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                return jM905tryMinHeightJN0ABg$default;
            }
            long jM902tryMaxWidthJN0ABg = m902tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m7104equalsimpl0(jM902tryMaxWidthJN0ABg, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                return jM902tryMaxWidthJN0ABg;
            }
            long jM900tryMaxHeightJN0ABg = m900tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m7104equalsimpl0(jM900tryMaxHeightJN0ABg, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                return jM900tryMaxHeightJN0ABg;
            }
            long jM906tryMinWidthJN0ABg = m906tryMinWidthJN0ABg(j, false);
            if (!IntSize.m7104equalsimpl0(jM906tryMinWidthJN0ABg, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                return jM906tryMinWidthJN0ABg;
            }
            long jM904tryMinHeightJN0ABg = m904tryMinHeightJN0ABg(j, false);
            if (!IntSize.m7104equalsimpl0(jM904tryMinHeightJN0ABg, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                return jM904tryMinHeightJN0ABg;
            }
        } else {
            long jM901tryMaxHeightJN0ABg$default2 = m901tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m7104equalsimpl0(jM901tryMaxHeightJN0ABg$default2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                return jM901tryMaxHeightJN0ABg$default2;
            }
            long jM903tryMaxWidthJN0ABg$default2 = m903tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m7104equalsimpl0(jM903tryMaxWidthJN0ABg$default2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                return jM903tryMaxWidthJN0ABg$default2;
            }
            long jM905tryMinHeightJN0ABg$default2 = m905tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m7104equalsimpl0(jM905tryMinHeightJN0ABg$default2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                return jM905tryMinHeightJN0ABg$default2;
            }
            long jM907tryMinWidthJN0ABg$default2 = m907tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m7104equalsimpl0(jM907tryMinWidthJN0ABg$default2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                return jM907tryMinWidthJN0ABg$default2;
            }
            long jM900tryMaxHeightJN0ABg2 = m900tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m7104equalsimpl0(jM900tryMaxHeightJN0ABg2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                return jM900tryMaxHeightJN0ABg2;
            }
            long jM902tryMaxWidthJN0ABg2 = m902tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m7104equalsimpl0(jM902tryMaxWidthJN0ABg2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                return jM902tryMaxWidthJN0ABg2;
            }
            long jM904tryMinHeightJN0ABg2 = m904tryMinHeightJN0ABg(j, false);
            if (!IntSize.m7104equalsimpl0(jM904tryMinHeightJN0ABg2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                return jM904tryMinHeightJN0ABg2;
            }
            long jM906tryMinWidthJN0ABg2 = m906tryMinWidthJN0ABg(j, false);
            if (!IntSize.m7104equalsimpl0(jM906tryMinWidthJN0ABg2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                return jM906tryMinWidthJN0ABg2;
            }
        }
        return IntSize.INSTANCE.m7111getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m903tryMaxWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m902tryMaxWidthJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m902tryMaxWidthJN0ABg(long j, boolean z) {
        int iRound;
        int iM6888getMaxWidthimpl = Constraints.m6888getMaxWidthimpl(j);
        if (iM6888getMaxWidthimpl != Integer.MAX_VALUE && (iRound = Math.round(iM6888getMaxWidthimpl / this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iM6888getMaxWidthimpl, iRound);
            if (!z || ConstraintsKt.m6906isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m7111getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m901tryMaxHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m900tryMaxHeightJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m900tryMaxHeightJN0ABg(long j, boolean z) {
        int iRound;
        int iM6887getMaxHeightimpl = Constraints.m6887getMaxHeightimpl(j);
        if (iM6887getMaxHeightimpl != Integer.MAX_VALUE && (iRound = Math.round(iM6887getMaxHeightimpl * this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iRound, iM6887getMaxHeightimpl);
            if (!z || ConstraintsKt.m6906isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m7111getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m907tryMinWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m906tryMinWidthJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m906tryMinWidthJN0ABg(long j, boolean z) {
        int iM6890getMinWidthimpl = Constraints.m6890getMinWidthimpl(j);
        int iRound = Math.round(iM6890getMinWidthimpl / this.aspectRatio);
        if (iRound > 0) {
            long jIntSize = IntSizeKt.IntSize(iM6890getMinWidthimpl, iRound);
            if (!z || ConstraintsKt.m6906isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m7111getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m905tryMinHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m904tryMinHeightJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m904tryMinHeightJN0ABg(long j, boolean z) {
        int iM6889getMinHeightimpl = Constraints.m6889getMinHeightimpl(j);
        int iRound = Math.round(iM6889getMinHeightimpl * this.aspectRatio);
        if (iRound > 0) {
            long jIntSize = IntSizeKt.IntSize(iRound, iM6889getMinHeightimpl);
            if (!z || ConstraintsKt.m6906isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m7111getZeroYbymL2g();
    }
}
