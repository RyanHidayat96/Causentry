package defpackage;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final class unregisterCallbackMessenger extends Modifier.Node implements DrawModifierNode, LayoutModifierNode {
    private float TuitionPaymentFragmentbindingInflater1;
    private ContentScale TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Alignment TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Painter TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private ColorFilter b;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Painter painter) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = painter;
    }

    public final Painter TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final void TuitionPaymentFragmentbindingInflater1(Alignment alignment) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = alignment;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ContentScale contentScale) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = contentScale;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(float f) {
        this.TuitionPaymentFragmentbindingInflater1 = f;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ColorFilter colorFilter) {
        this.b = colorFilter;
    }

    public unregisterCallbackMessenger(Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = painter;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = alignment;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = contentScale;
        this.TuitionPaymentFragmentbindingInflater1 = f;
        this.b = colorFilter;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo412measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(b(j));
        return MeasureScope.layout$default(measureScope, placeableMo5637measureBRTryo0.getWidth(), placeableMo5637measureBRTryo0.getHeight(), null, new Function1() { // from class: removeSubscription
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return unregisterCallbackMessenger.b(placeableMo5637measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getIntrinsicSize() != Size.INSTANCE.m4051getUnspecifiedNHjbRc()) {
            int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(Constraints.m6887getMaxHeightimpl(b(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))));
            return Math.max(MathKt.roundToInt(Size.m4043getWidthimpl(TuitionPaymentFragmentspecialinlinedviewModeldefault3(SizeKt.Size(iMinIntrinsicWidth, i)))), iMinIntrinsicWidth);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getIntrinsicSize() != Size.INSTANCE.m4051getUnspecifiedNHjbRc()) {
            int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(Constraints.m6887getMaxHeightimpl(b(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))));
            return Math.max(MathKt.roundToInt(Size.m4043getWidthimpl(TuitionPaymentFragmentspecialinlinedviewModeldefault3(SizeKt.Size(iMaxIntrinsicWidth, i)))), iMaxIntrinsicWidth);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getIntrinsicSize() != Size.INSTANCE.m4051getUnspecifiedNHjbRc()) {
            int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(Constraints.m6888getMaxWidthimpl(b(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))));
            return Math.max(MathKt.roundToInt(Size.m4040getHeightimpl(TuitionPaymentFragmentspecialinlinedviewModeldefault3(SizeKt.Size(i, iMinIntrinsicHeight)))), iMinIntrinsicHeight);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getIntrinsicSize() != Size.INSTANCE.m4051getUnspecifiedNHjbRc()) {
            int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(Constraints.m6888getMaxWidthimpl(b(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))));
            return Math.max(MathKt.roundToInt(Size.m4040getHeightimpl(TuitionPaymentFragmentspecialinlinedviewModeldefault3(SizeKt.Size(i, iMaxIntrinsicHeight)))), iMaxIntrinsicHeight);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
        if (Size.m4045isEmptyimpl(j)) {
            return Size.INSTANCE.m4052getZeroNHjbRc();
        }
        long intrinsicSize = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getIntrinsicSize();
        if (intrinsicSize == Size.INSTANCE.m4051getUnspecifiedNHjbRc()) {
            return j;
        }
        float fM4043getWidthimpl = Size.m4043getWidthimpl(intrinsicSize);
        if (Float.isInfinite(fM4043getWidthimpl) || Float.isNaN(fM4043getWidthimpl)) {
            fM4043getWidthimpl = Size.m4043getWidthimpl(j);
        }
        float fM4040getHeightimpl = Size.m4040getHeightimpl(intrinsicSize);
        if (Float.isInfinite(fM4040getHeightimpl) || Float.isNaN(fM4040getHeightimpl)) {
            fM4040getHeightimpl = Size.m4040getHeightimpl(j);
        }
        long jSize = SizeKt.Size(fM4043getWidthimpl, fM4040getHeightimpl);
        long jMo5630computeScaleFactorH7hwNQA = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.mo5630computeScaleFactorH7hwNQA(jSize, j);
        float fM5727getScaleXimpl = ScaleFactor.m5727getScaleXimpl(jMo5630computeScaleFactorH7hwNQA);
        if (Float.isInfinite(fM5727getScaleXimpl) || Float.isNaN(fM5727getScaleXimpl)) {
            return j;
        }
        float fM5728getScaleYimpl = ScaleFactor.m5728getScaleYimpl(jMo5630computeScaleFactorH7hwNQA);
        return (Float.isInfinite(fM5728getScaleYimpl) || Float.isNaN(fM5728getScaleYimpl)) ? j : ScaleFactorKt.m5743timesmw2e94(jMo5630computeScaleFactorH7hwNQA, jSize);
    }

    private final long b(long j) {
        float fM6890getMinWidthimpl;
        int iM6889getMinHeightimpl;
        float fTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        boolean zM6886getHasFixedWidthimpl = Constraints.m6886getHasFixedWidthimpl(j);
        boolean zM6885getHasFixedHeightimpl = Constraints.m6885getHasFixedHeightimpl(j);
        if (!zM6886getHasFixedWidthimpl || !zM6885getHasFixedHeightimpl) {
            boolean z = Constraints.m6884getHasBoundedWidthimpl(j) && Constraints.m6883getHasBoundedHeightimpl(j);
            long intrinsicSize = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getIntrinsicSize();
            if (intrinsicSize != Size.INSTANCE.m4051getUnspecifiedNHjbRc()) {
                if (z && (zM6886getHasFixedWidthimpl || zM6885getHasFixedHeightimpl)) {
                    fM6890getMinWidthimpl = Constraints.m6888getMaxWidthimpl(j);
                    iM6889getMinHeightimpl = Constraints.m6887getMaxHeightimpl(j);
                } else {
                    float fM4043getWidthimpl = Size.m4043getWidthimpl(intrinsicSize);
                    float fM4040getHeightimpl = Size.m4040getHeightimpl(intrinsicSize);
                    fM6890getMinWidthimpl = (Float.isInfinite(fM4043getWidthimpl) || Float.isNaN(fM4043getWidthimpl)) ? Constraints.m6890getMinWidthimpl(j) : setSubscription.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j, fM4043getWidthimpl);
                    if (Float.isInfinite(fM4040getHeightimpl) || Float.isNaN(fM4040getHeightimpl)) {
                        iM6889getMinHeightimpl = Constraints.m6889getMinHeightimpl(j);
                    } else {
                        fTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setSubscription.TuitionPaymentFragmentspecialinlinedviewModeldefault2(j, fM4040getHeightimpl);
                    }
                    long jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(SizeKt.Size(fM6890getMinWidthimpl, fTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    return Constraints.m6878copyZbe2FdA$default(j, ConstraintsKt.m6905constrainWidthK40F9xA(j, MathKt.roundToInt(Size.m4043getWidthimpl(jTuitionPaymentFragmentspecialinlinedviewModeldefault3))), 0, ConstraintsKt.m6904constrainHeightK40F9xA(j, MathKt.roundToInt(Size.m4040getHeightimpl(jTuitionPaymentFragmentspecialinlinedviewModeldefault3))), 0, 10, null);
                }
                fTuitionPaymentFragmentspecialinlinedviewModeldefault2 = iM6889getMinHeightimpl;
                long jTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(SizeKt.Size(fM6890getMinWidthimpl, fTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                return Constraints.m6878copyZbe2FdA$default(j, ConstraintsKt.m6905constrainWidthK40F9xA(j, MathKt.roundToInt(Size.m4043getWidthimpl(jTuitionPaymentFragmentspecialinlinedviewModeldefault4))), 0, ConstraintsKt.m6904constrainHeightK40F9xA(j, MathKt.roundToInt(Size.m4040getHeightimpl(jTuitionPaymentFragmentspecialinlinedviewModeldefault4))), 0, 10, null);
            }
            if (z) {
                return Constraints.m6878copyZbe2FdA$default(j, Constraints.m6888getMaxWidthimpl(j), 0, Constraints.m6887getMaxHeightimpl(j), 0, 10, null);
            }
        }
        return j;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope) {
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(contentDrawScope.mo4798getSizeNHjbRc());
        long jMo3697alignKFBX0sM = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.mo3697alignKFBX0sM(setSubscription.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jTuitionPaymentFragmentspecialinlinedviewModeldefault3), setSubscription.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contentDrawScope.mo4798getSizeNHjbRc()), contentDrawScope.getLayoutDirection());
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        float fM7055component1impl = IntOffset.m7055component1impl(jMo3697alignKFBX0sM);
        float fM7056component2impl = IntOffset.m7056component2impl(jMo3697alignKFBX0sM);
        contentDrawScope2.getDrawContext().getTransform().translate(fM7055component1impl, fM7056component2impl);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.m4923drawx_KDEd0(contentDrawScope2, jTuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentbindingInflater1, this.b);
        contentDrawScope2.getDrawContext().getTransform().translate(-fM7055component1impl, -fM7056component2impl);
        contentDrawScope.drawContent();
    }
}
