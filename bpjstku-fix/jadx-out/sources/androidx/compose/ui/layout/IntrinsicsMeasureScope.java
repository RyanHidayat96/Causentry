package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Jg\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\t2\u0019\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0002\b\u000f2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0019\u001a\u00020\b*\u00020\u0016H\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\b*\u00020\u001aH\u0097\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u001f\u001a\u00020\u0016*\u00020\bH\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020\u0016*\u00020 H\u0097\u0001¢\u0006\u0004\b\u001d\u0010!J\u0014\u0010\u001f\u001a\u00020\u0016*\u00020\u001aH\u0097\u0001¢\u0006\u0004\b\"\u0010#J\u0014\u0010(\u001a\u00020%*\u00020$H\u0097\u0001¢\u0006\u0004\b&\u0010'J\u0014\u0010*\u001a\u00020 *\u00020\u0016H\u0097\u0001¢\u0006\u0004\b)\u0010!J\u0014\u0010*\u001a\u00020 *\u00020\u001aH\u0097\u0001¢\u0006\u0004\b+\u0010#J\u0014\u0010.\u001a\u00020-*\u00020,H\u0097\u0001¢\u0006\u0004\b.\u0010/J\u0014\u00101\u001a\u00020$*\u00020%H\u0097\u0001¢\u0006\u0004\b0\u0010'J\u0014\u00104\u001a\u00020\u001a*\u00020\bH\u0097\u0001¢\u0006\u0004\b2\u00103J\u0014\u00104\u001a\u00020\u001a*\u00020 H\u0097\u0001¢\u0006\u0004\b2\u00105J\u0014\u00104\u001a\u00020\u001a*\u00020\u0016H\u0097\u0001¢\u0006\u0004\b6\u00105R\u001a\u00107\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020 8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020 8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0014\u0010A\u001a\u00020@8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010B"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicsMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "p0", "Landroidx/compose/ui/unit/LayoutDirection;", "p1", "<init>", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V", "", "", "Landroidx/compose/ui/layout/AlignmentLine;", "p2", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "p3", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "p4", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-u2uoSUM", "(I)F", "toDp", "", "(F)F", "toDp-GaN1DYA", "(J)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-kPz2Gy4", "(I)J", "toSp", "(F)J", "toSp-0xMU5do", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getDensity", "()F", "density", "getFontScale", "fontScale", "", "isLookingAhead", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntrinsicsMeasureScope implements MeasureScope, IntrinsicMeasureScope {
    public static final int $stable = 0;
    private final /* synthetic */ IntrinsicMeasureScope $$delegate_0;
    private final LayoutDirection layoutDirection;

    public IntrinsicsMeasureScope(IntrinsicMeasureScope intrinsicMeasureScope, LayoutDirection layoutDirection) {
        this.$$delegate_0 = intrinsicMeasureScope;
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult layout(final int p0, final int p1, final Map<AlignmentLine, Integer> p2, final Function1<? super RulerScope, Unit> p3, Function1<? super Placeable.PlacementScope, Unit> p4) {
        if (p0 < 0) {
            p0 = 0;
        }
        if (p1 < 0) {
            p1 = 0;
        }
        if ((p0 & ViewCompat.MEASURED_STATE_MASK) != 0 || ((-16777216) & p1) != 0) {
            StringBuilder sb = new StringBuilder("Size(");
            sb.append(p0);
            sb.append(" x ");
            sb.append(p1);
            sb.append(") is out of range. Each dimension must be between 0 and 16777215.");
            InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        return new MeasureResult() { // from class: androidx.compose.ui.layout.IntrinsicsMeasureScope.layout.1
            @Override // androidx.compose.ui.layout.MeasureResult
            public final void placeChildren() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* JADX INFO: renamed from: getWidth, reason: from getter */
            public final int get$w() {
                return p0;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* JADX INFO: renamed from: getHeight, reason: from getter */
            public final int get$h() {
                return p1;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final Map<AlignmentLine, Integer> getAlignmentLines() {
                return p2;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final Function1<RulerScope, Unit> getRulers() {
                return p3;
            }
        };
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean isLookingAhead() {
        return this.$$delegate_0.isLookingAhead();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public final int mo687roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo687roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public final int mo688roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo688roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public final float mo689toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo689toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo690toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo690toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo691toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo691toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public final long mo692toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo692toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public final float mo693toPxR2X_6o(long j) {
        return this.$$delegate_0.mo693toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public final float mo694toPx0680j_4(float f) {
        return this.$$delegate_0.mo694toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public final Rect toRect(DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public final long mo695toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo695toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public final long mo696toSp0xMU5do(float f) {
        return this.$$delegate_0.mo696toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo697toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo697toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo698toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo698toSpkPz2Gy4(i);
    }
}
