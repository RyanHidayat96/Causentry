package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J:\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011Ji\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00122\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H'¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0013H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0002*\u00020\rH&¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u0002*\u00020\rH&¢\u0006\u0004\b\"\u0010!R\u0014\u0010&\u001a\u00020#8'X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8'X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "", "p0", "p1", "p2", "p3", "", "p4", "Landroidx/compose/ui/unit/Constraints;", "createConstraints-xF2OJ5Q", "(IIIIZ)J", "createConstraints", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/foundation/layout/RowColumnParentData;", "Landroidx/compose/ui/unit/LayoutDirection;", "getCrossAxisPosition", "(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/layout/RowColumnParentData;ILandroidx/compose/ui/unit/LayoutDirection;I)I", "", "Landroidx/compose/ui/layout/MeasureScope;", "", "p5", "p6", "p7", "p8", "p9", "Landroidx/compose/ui/layout/MeasureResult;", "placeHelper", "([Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;I[III[IIII)Landroidx/compose/ui/layout/MeasureResult;", "", "populateMainAxisPositions", "(I[I[ILandroidx/compose/ui/layout/MeasureScope;)V", "crossAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "mainAxisSize", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "isHorizontal", "()Z", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface FlowLineMeasurePolicy extends RowColumnMeasurePolicy {
    CrossAxisAlignment getCrossAxisAlignment();

    Arrangement.Horizontal getHorizontalArrangement();

    Arrangement.Vertical getVerticalArrangement();

    boolean isHorizontal();

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int mainAxisSize(Placeable placeable) {
        return isHorizontal() ? placeable.getMeasuredWidth() : placeable.getMeasuredHeight();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int crossAxisSize(Placeable placeable) {
        return isHorizontal() ? placeable.getMeasuredHeight() : placeable.getMeasuredWidth();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* JADX INFO: renamed from: createConstraints-xF2OJ5Q */
    default long mo917createConstraintsxF2OJ5Q(int p0, int p1, int p2, int p3, boolean p4) {
        if (isHorizontal()) {
            return RowKt.createRowConstraints(p4, p0, p1, p2, p3);
        }
        return ColumnKt.createColumnConstraints(p4, p0, p1, p2, p3);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default MeasureResult placeHelper(final Placeable[] p0, final MeasureScope p1, final int p2, final int[] p3, int p4, final int p5, final int[] p6, final int p7, final int p8, final int p9) {
        int i;
        int i2;
        if (isHorizontal()) {
            i2 = p4;
            i = p5;
        } else {
            i = p4;
            i2 = p5;
        }
        return MeasureScope.layout$default(p1, i2, i, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowLineMeasurePolicy$placeHelper$1$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                int[] iArr = p6;
                int i3 = iArr != null ? iArr[p7] : 0;
                for (int i4 = p8; i4 < p9; i4++) {
                    Placeable placeable = p0[i4];
                    Intrinsics.checkNotNull(placeable);
                    int crossAxisPosition = this.getCrossAxisPosition(placeable, RowColumnImplKt.getRowColumnParentData(placeable), p5, p1.getLayoutDirection(), p2) + i3;
                    if (this.isHorizontal()) {
                        Placeable.PlacementScope.place$default(placementScope, placeable, p3[i4 - p8], crossAxisPosition, 0.0f, 4, null);
                    } else {
                        Placeable.PlacementScope.place$default(placementScope, placeable, crossAxisPosition, p3[i4 - p8], 0.0f, 4, null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null);
    }

    default int getCrossAxisPosition(Placeable p0, RowColumnParentData p1, int p2, LayoutDirection p3, int p4) {
        CrossAxisAlignment crossAxisAlignment;
        if (p1 == null || (crossAxisAlignment = p1.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = getCrossAxisAlignment();
        }
        int iCrossAxisSize = crossAxisSize(p0);
        if (isHorizontal()) {
            p3 = LayoutDirection.Ltr;
        }
        return crossAxisAlignment.align$foundation_layout_release(p2 - iCrossAxisSize, p3, p0, p4);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default void populateMainAxisPositions(int p0, int[] p1, int[] p2, MeasureScope p3) {
        if (isHorizontal()) {
            getHorizontalArrangement().arrange(p3, p0, p1, p3.getLayoutDirection(), p2);
        } else {
            getVerticalArrangement().arrange(p3, p0, p1, p2);
        }
    }
}
