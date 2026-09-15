package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u001b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b \u0010!Ji\u0010+\u001a\u00020*2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\"2\u0006\u0010\u0006\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010$2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000fH\u0017¢\u0006\u0004\b+\u0010,J/\u0010.\u001a\u00020-2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020#H\u0016¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200H×\u0001¢\u0006\u0004\b1\u00102J\u0013\u00103\u001a\u00020\u000f*\u00020\u001bH\u0016¢\u0006\u0004\b3\u00104J\u0013\u00105\u001a\u00020\u000f*\u00020\u001bH\u0016¢\u0006\u0004\b5\u00104J)\u00109\u001a\u00020\u000f*\u0002062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u000208072\u0006\u0010\u0006\u001a\u00020\u000fH\u0016¢\u0006\u0004\b9\u0010:J)\u0010;\u001a\u00020\u000f*\u0002062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u000208072\u0006\u0010\u0006\u001a\u00020\u000fH\u0016¢\u0006\u0004\b;\u0010:J,\u0010?\u001a\u00020**\u00020#2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020<072\u0006\u0010\u0006\u001a\u00020\u0014H\u0017ø\u0001\u0000¢\u0006\u0004\b=\u0010>J)\u0010@\u001a\u00020\u000f*\u0002062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u000208072\u0006\u0010\u0006\u001a\u00020\u000fH\u0016¢\u0006\u0004\b@\u0010:J)\u0010A\u001a\u00020\u000f*\u0002062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u000208072\u0006\u0010\u0006\u001a\u00020\u000fH\u0016¢\u0006\u0004\bA\u0010:R\u0014\u0010B\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010E\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/layout/ColumnMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "p0", "Landroidx/compose/ui/Alignment$Horizontal;", "p1", "<init>", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;)V", "component1", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "component2", "()Landroidx/compose/ui/Alignment$Horizontal;", "copy", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/ColumnMeasurePolicy;", "", "p2", "p3", "", "p4", "Landroidx/compose/ui/unit/Constraints;", "createConstraints-xF2OJ5Q", "(IIIIZ)J", "createConstraints", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/foundation/layout/RowColumnParentData;", "Landroidx/compose/ui/unit/LayoutDirection;", "getCrossAxisPosition", "(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/layout/RowColumnParentData;IILandroidx/compose/ui/unit/LayoutDirection;)I", "hashCode", "()I", "", "Landroidx/compose/ui/layout/MeasureScope;", "", "p5", "p6", "p7", "p8", "p9", "Landroidx/compose/ui/layout/MeasureResult;", "placeHelper", "([Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;I[III[IIII)Landroidx/compose/ui/layout/MeasureResult;", "", "populateMainAxisPositions", "(I[I[ILandroidx/compose/ui/layout/MeasureScope;)V", "", "toString", "()Ljava/lang/String;", "crossAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "mainAxisSize", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "maxIntrinsicHeight", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "maxIntrinsicWidth", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "minIntrinsicHeight", "minIntrinsicWidth", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ColumnMeasurePolicy implements MeasurePolicy, RowColumnMeasurePolicy {
    public static final int $stable = 0;
    private final Alignment.Horizontal horizontalAlignment;
    private final Arrangement.Vertical verticalArrangement;

    public ColumnMeasurePolicy(Arrangement.Vertical vertical, Alignment.Horizontal horizontal) {
        this.verticalArrangement = vertical;
        this.horizontalAlignment = horizontal;
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final int mainAxisSize(Placeable placeable) {
        return placeable.getHeight();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final int crossAxisSize(Placeable placeable) {
        return placeable.getWidth();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final void populateMainAxisPositions(int p0, int[] p1, int[] p2, MeasureScope p3) {
        this.verticalArrangement.arrange(p3, p0, p1, p2);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final MeasureResult placeHelper(final Placeable[] p0, final MeasureScope p1, final int p2, final int[] p3, int p4, final int p5, int[] p6, int p7, int p8, int p9) {
        return MeasureScope.layout$default(p1, p5, p4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.ColumnMeasurePolicy$placeHelper$1$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable[] placeableArr = p0;
                ColumnMeasurePolicy columnMeasurePolicy = this;
                int i = p5;
                int i2 = p2;
                MeasureScope measureScope = p1;
                int[] iArr = p3;
                int length = placeableArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    Placeable placeable = placeableArr[i3];
                    Intrinsics.checkNotNull(placeable);
                    Placeable.PlacementScope.place$default(placementScope, placeable, columnMeasurePolicy.getCrossAxisPosition(placeable, RowColumnImplKt.getRowColumnParentData(placeable), i, i2, measureScope.getLayoutDirection()), iArr[i4], 0.0f, 4, null);
                    i3++;
                    i4++;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCrossAxisPosition(Placeable p0, RowColumnParentData p1, int p2, int p3, LayoutDirection p4) {
        CrossAxisAlignment crossAxisAlignment = p1 != null ? p1.getCrossAxisAlignment() : null;
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.align$foundation_layout_release(p2 - p0.getWidth(), p4, p0, p3);
        }
        return this.horizontalAlignment.align(0, p2 - p0.getWidth(), p4);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* JADX INFO: renamed from: createConstraints-xF2OJ5Q, reason: not valid java name */
    public final long mo917createConstraintsxF2OJ5Q(int p0, int p1, int p2, int p3, boolean p4) {
        return ColumnKt.createColumnConstraints(p4, p0, p1, p2, p3);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo359measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        return RowColumnMeasurePolicyKt.measure(this, Constraints.m6889getMinHeightimpl(j), Constraints.m6890getMinWidthimpl(j), Constraints.m6887getMaxHeightimpl(j), Constraints.m6888getMaxWidthimpl(j), measureScope.mo688roundToPx0680j_4(this.verticalArrangement.getSpacing()), measureScope, list, new Placeable[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMinWidth(list, i, intrinsicMeasureScope.mo688roundToPx0680j_4(this.verticalArrangement.getSpacing()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMinHeight(list, i, intrinsicMeasureScope.mo688roundToPx0680j_4(this.verticalArrangement.getSpacing()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMaxWidth(list, i, intrinsicMeasureScope.mo688roundToPx0680j_4(this.verticalArrangement.getSpacing()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMaxHeight(list, i, intrinsicMeasureScope.mo688roundToPx0680j_4(this.verticalArrangement.getSpacing()));
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final Alignment.Horizontal getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public static /* synthetic */ ColumnMeasurePolicy copy$default(ColumnMeasurePolicy columnMeasurePolicy, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i, Object obj) {
        if ((i & 1) != 0) {
            vertical = columnMeasurePolicy.verticalArrangement;
        }
        if ((i & 2) != 0) {
            horizontal = columnMeasurePolicy.horizontalAlignment;
        }
        return columnMeasurePolicy.copy(vertical, horizontal);
    }

    public final ColumnMeasurePolicy copy(Arrangement.Vertical p0, Alignment.Horizontal p1) {
        return new ColumnMeasurePolicy(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ColumnMeasurePolicy)) {
            return false;
        }
        ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) p0;
        return Intrinsics.areEqual(this.verticalArrangement, columnMeasurePolicy.verticalArrangement) && Intrinsics.areEqual(this.horizontalAlignment, columnMeasurePolicy.horizontalAlignment);
    }

    public final int hashCode() {
        return (this.verticalArrangement.hashCode() * 31) + this.horizontalAlignment.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColumnMeasurePolicy(verticalArrangement=");
        sb.append(this.verticalArrangement);
        sb.append(", horizontalAlignment=");
        sb.append(this.horizontalAlignment);
        sb.append(')');
        return sb.toString();
    }
}
