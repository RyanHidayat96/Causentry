package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
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
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b*\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0018\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ#\u0010\u001f\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ#\u0010 \u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010$\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b%\u0010#J\u0013\u0010)\u001a\u00020(*\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0013\u0010-\u001a\u00020\u0006*\u00020!H\u0002¢\u0006\u0004\b+\u0010,J\u0013\u0010/\u001a\u00020\u0006*\u00020!H\u0002¢\u0006\u0004\b.\u0010,J\u000f\u00101\u001a\u000200H\u0017¢\u0006\u0004\b1\u00102R\"\u00103\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010E\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010K\u001a\u00020\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010Q\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010<R\u0014\u0010Z\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010<"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/graphics/painter/Painter;", "p0", "", "p1", "Landroidx/compose/ui/Alignment;", "p2", "Landroidx/compose/ui/layout/ContentScale;", "p3", "", "p4", "Landroidx/compose/ui/graphics/ColorFilter;", "p5", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/geometry/Size;", "calculateScaledSize-E7KxVPU", "(J)J", "calculateScaledSize", "modifyConstraints-ZezNO4M", "modifyConstraints", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "hasSpecifiedAndFiniteWidth-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteHeight-uvyYCjk", "hasSpecifiedAndFiniteHeight", "", "toString", "()Ljava/lang/String;", PlaceTypes.PAINTER, "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "sizeToIntrinsics", "Z", "getSizeToIntrinsics", "()Z", "setSizeToIntrinsics", "(Z)V", "alignment", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "alpha", "F", "getAlpha", "()F", "setAlpha", "(F)V", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getUseIntrinsicSize", "useIntrinsicSize", "getShouldAutoInvalidate", "shouldAutoInvalidate"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    public final void setPainter(Painter painter) {
        this.painter = painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public final void setSizeToIntrinsics(boolean z) {
        this.sizeToIntrinsics = z;
    }

    public /* synthetic */ PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, z, (i & 4) != 0 ? Alignment.INSTANCE.getCenter() : alignment, (i & 8) != 0 ? ContentScale.INSTANCE.getInside() : contentScale, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? null : colorFilter);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final void setContentScale(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.getIntrinsicSize() != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo412measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(m3811modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measureScope, placeableMo5637measureBRTryo0.getWidth(), placeableMo5637measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
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
        if (getUseIntrinsicSize()) {
            long jM3811modifyConstraintsZezNO4M = m3811modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m6890getMinWidthimpl(jM3811modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i));
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long jM3811modifyConstraintsZezNO4M = m3811modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m6890getMinWidthimpl(jM3811modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i));
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long jM3811modifyConstraintsZezNO4M = m3811modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m6889getMinHeightimpl(jM3811modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i));
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long jM3811modifyConstraintsZezNO4M = m3811modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m6889getMinHeightimpl(jM3811modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i));
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    /* JADX INFO: renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m3808calculateScaledSizeE7KxVPU(long p0) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        if (!getUseIntrinsicSize()) {
            return p0;
        }
        if (!m3810hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.getIntrinsicSize())) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (p0 >> 32));
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (this.painter.getIntrinsicSize() >> 32));
        }
        if (!m3809hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.getIntrinsicSize())) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (p0 & 4294967295L));
        } else {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.painter.getIntrinsicSize() & 4294967295L));
        }
        long jM4034constructorimpl = Size.m4034constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
        if (Float.intBitsToFloat((int) (p0 >> 32)) != 0.0f && Float.intBitsToFloat((int) (p0 & 4294967295L)) != 0.0f) {
            return ScaleFactorKt.m5742timesUQTWf7w(jM4034constructorimpl, this.contentScale.mo5630computeScaleFactorH7hwNQA(jM4034constructorimpl, p0));
        }
        return Size.INSTANCE.m4052getZeroNHjbRc();
    }

    /* JADX INFO: renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m3811modifyConstraintsZezNO4M(long p0) {
        int iM6890getMinWidthimpl;
        int iM6889getMinHeightimpl;
        boolean z = false;
        boolean z2 = Constraints.m6884getHasBoundedWidthimpl(p0) && Constraints.m6883getHasBoundedHeightimpl(p0);
        if (Constraints.m6886getHasFixedWidthimpl(p0) && Constraints.m6885getHasFixedHeightimpl(p0)) {
            z = true;
        }
        if ((!getUseIntrinsicSize() && z2) || z) {
            return Constraints.m6878copyZbe2FdA$default(p0, Constraints.m6888getMaxWidthimpl(p0), 0, Constraints.m6887getMaxHeightimpl(p0), 0, 10, null);
        }
        long jMo0getIntrinsicSizeNHjbRc = this.painter.getIntrinsicSize();
        if (!m3810hasSpecifiedAndFiniteWidthuvyYCjk(jMo0getIntrinsicSizeNHjbRc)) {
            iM6890getMinWidthimpl = Constraints.m6890getMinWidthimpl(p0);
        } else {
            iM6890getMinWidthimpl = Math.round(Float.intBitsToFloat((int) (jMo0getIntrinsicSizeNHjbRc >> 32)));
        }
        if (!m3809hasSpecifiedAndFiniteHeightuvyYCjk(jMo0getIntrinsicSizeNHjbRc)) {
            iM6889getMinHeightimpl = Constraints.m6889getMinHeightimpl(p0);
        } else {
            iM6889getMinHeightimpl = Math.round(Float.intBitsToFloat((int) (jMo0getIntrinsicSizeNHjbRc & 4294967295L)));
        }
        long jM3808calculateScaledSizeE7KxVPU = m3808calculateScaledSizeE7KxVPU(Size.m4034constructorimpl((((long) Float.floatToRawIntBits(ConstraintsKt.m6905constrainWidthK40F9xA(p0, iM6890getMinWidthimpl))) << 32) | (((long) Float.floatToRawIntBits(ConstraintsKt.m6904constrainHeightK40F9xA(p0, iM6889getMinHeightimpl))) & 4294967295L)));
        return Constraints.m6878copyZbe2FdA$default(p0, ConstraintsKt.m6905constrainWidthK40F9xA(p0, Math.round(Float.intBitsToFloat((int) (jM3808calculateScaledSizeE7KxVPU >> 32)))), 0, ConstraintsKt.m6904constrainHeightK40F9xA(p0, Math.round(Float.intBitsToFloat((int) (jM3808calculateScaledSizeE7KxVPU & 4294967295L)))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long jM4052getZeroNHjbRc;
        long jMo0getIntrinsicSizeNHjbRc = this.painter.getIntrinsicSize();
        if (m3810hasSpecifiedAndFiniteWidthuvyYCjk(jMo0getIntrinsicSizeNHjbRc)) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (jMo0getIntrinsicSizeNHjbRc >> 32));
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo4798getSizeNHjbRc() >> 32));
        }
        if (m3809hasSpecifiedAndFiniteHeightuvyYCjk(jMo0getIntrinsicSizeNHjbRc)) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo0getIntrinsicSizeNHjbRc & 4294967295L));
        } else {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo4798getSizeNHjbRc() & 4294967295L));
        }
        long jM4034constructorimpl = Size.m4034constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        if (Float.intBitsToFloat((int) (contentDrawScope.mo4798getSizeNHjbRc() >> 32)) != 0.0f && Float.intBitsToFloat((int) (contentDrawScope.mo4798getSizeNHjbRc() & 4294967295L)) != 0.0f) {
            jM4052getZeroNHjbRc = ScaleFactorKt.m5742timesUQTWf7w(jM4034constructorimpl, this.contentScale.mo5630computeScaleFactorH7hwNQA(jM4034constructorimpl, contentDrawScope.mo4798getSizeNHjbRc()));
        } else {
            jM4052getZeroNHjbRc = Size.INSTANCE.m4052getZeroNHjbRc();
        }
        long j = jM4052getZeroNHjbRc;
        long jMo3697alignKFBX0sM = this.alignment.mo3697alignKFBX0sM(IntSize.m7101constructorimpl((((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (j >> 32)))) << 32)), IntSize.m7101constructorimpl((((long) Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo4798getSizeNHjbRc() & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo4798getSizeNHjbRc() >> 32)))) << 32)), contentDrawScope.getLayoutDirection());
        float fM7063getXimpl = IntOffset.m7063getXimpl(jMo3697alignKFBX0sM);
        float fM7064getYimpl = IntOffset.m7064getYimpl(jMo3697alignKFBX0sM);
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        contentDrawScope2.getDrawContext().getTransform().translate(fM7063getXimpl, fM7064getYimpl);
        try {
            this.painter.m4923drawx_KDEd0(contentDrawScope2, j, this.alpha, this.colorFilter);
            contentDrawScope2.getDrawContext().getTransform().translate(-fM7063getXimpl, -fM7064getYimpl);
            contentDrawScope.drawContent();
        } catch (Throwable th) {
            contentDrawScope2.getDrawContext().getTransform().translate(-fM7063getXimpl, -fM7064getYimpl);
            throw th;
        }
    }

    /* JADX INFO: renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m3810hasSpecifiedAndFiniteWidthuvyYCjk(long j) {
        return !Size.m4039equalsimpl0(j, Size.INSTANCE.m4051getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m3809hasSpecifiedAndFiniteHeightuvyYCjk(long j) {
        return !Size.m4039equalsimpl0(j, Size.INSTANCE.m4051getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PainterModifier(painter=");
        sb.append(this.painter);
        sb.append(", sizeToIntrinsics=");
        sb.append(this.sizeToIntrinsics);
        sb.append(", alignment=");
        sb.append(this.alignment);
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", colorFilter=");
        sb.append(this.colorFilter);
        sb.append(')');
        return sb.toString();
    }
}
