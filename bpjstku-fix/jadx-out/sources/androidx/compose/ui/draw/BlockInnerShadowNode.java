package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.shadow.InnerShadowPainter;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B(\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ.\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t¢\u0006\u0004\b\u0011\u0010\fJ\u0013\u0010\u0013\u001a\u00020\b*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,RA\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00078\u0002@CX\u0083\u000e¢\u0006\f\n\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00104\u001a\u0002018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u0002018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00103R*\u00107\u001a\u0002012\u0006\u0010\u0006\u001a\u0002018\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u00103\"\u0004\b:\u0010;R*\u0010<\u001a\u0002012\u0006\u0010\u0006\u001a\u0002018\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b<\u00108\u001a\u0004\b=\u00103\"\u0004\b>\u0010;R*\u0010@\u001a\u00020?2\u0006\u0010\u0006\u001a\u00020?8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER*\u0010G\u001a\u00020F2\u0006\u0010\u0006\u001a\u00020F8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bG\u0010A\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER.\u0010K\u001a\u0004\u0018\u00010J2\b\u0010\u0006\u001a\u0004\u0018\u00010J8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010Q\u001a\u0002012\u0006\u0010\u0006\u001a\u0002018\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bQ\u00108\u001a\u0004\bR\u00103\"\u0004\bS\u0010;R*\u0010U\u001a\u00020T2\u0006\u0010\u0006\u001a\u00020T8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010 \"\u0004\bX\u0010Y"}, d2 = {"Landroidx/compose/ui/draw/BlockInnerShadowNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/draw/InnerShadowScope;", "Landroidx/compose/ui/graphics/Shape;", "p0", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "p1", "<init>", "(Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function1;)V", "onAttach", "()V", "onDensityChange", "updateDensity", "update", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "obtainPainter", "()Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "onObservedReadsChanged", "invalidateShadow", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "shape", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/unit/Density;", "densityObject", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/shadow/Shadow;", "targetShadow", "Landroidx/compose/ui/graphics/shadow/Shadow;", "shadowPainter", "Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "blockRead", "Z", "block", "Lkotlin/jvm/functions/Function1;", "setBlock", "(Lkotlin/jvm/functions/Function1;)V", "", "getDensity", "()F", "density", "getFontScale", "fontScale", "radius", "F", "getRadius", "setRadius", "(F)V", "spread", "getSpread", "setSpread", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "J", "getOffset-F1C5BW0", "()J", "setOffset-k-4lQ0M", "(J)V", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "getColor-0d7_KjU", "setColor-8_81llA", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "alpha", "getAlpha", "setAlpha", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "I", "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BlockInnerShadowNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode, InnerShadowScope {
    public static final int $stable = 0;
    private Function1<? super InnerShadowScope, Unit> block;
    private boolean blockRead;
    private Brush brush;
    private Density densityObject;
    private float radius;
    private InnerShadowPainter shadowPainter;
    private Shape shape;
    private float spread;
    private Shadow targetShadow;
    private long offset = Offset.INSTANCE.m3990getZeroF1C5BW0();
    private long color = Color.INSTANCE.m4244getBlack0d7_KjU();
    private float alpha = 1.0f;
    private int blendMode = BlendMode.INSTANCE.m4159getSrcOver0nO6VwU();

    public BlockInnerShadowNode(Shape shape, Function1<? super InnerShadowScope, Unit> function1) {
        this.shape = shape;
        this.block = function1;
    }

    private final void setBlock(Function1<? super InnerShadowScope, Unit> function1) {
        if (this.block != function1) {
            this.block = function1;
            this.blockRead = false;
            DrawModifierNodeKt.invalidateDraw(this);
        }
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        Density density = this.densityObject;
        if (density != null) {
            return density.getDensity();
        }
        return 1.0f;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        Density density = this.densityObject;
        if (density != null) {
            return density.getFontScale();
        }
        return 1.0f;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public final float getRadius() {
        return this.radius;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public final void setRadius(float f) {
        if (this.radius == f) {
            return;
        }
        this.radius = f;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public final float getSpread() {
        return this.spread;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public final void setSpread(float f) {
        if (this.spread == f) {
            return;
        }
        this.spread = f;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* JADX INFO: renamed from: getOffset-F1C5BW0, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* JADX INFO: renamed from: setOffset-k-4lQ0M */
    public final void mo3742setOffsetk4lQ0M(long j) {
        if (Offset.m3971equalsimpl0(this.offset, j)) {
            return;
        }
        this.offset = j;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* JADX INFO: renamed from: setColor-8_81llA */
    public final void mo3741setColor8_81llA(long j) {
        if (j == 16) {
            j = Color.INSTANCE.m4244getBlack0d7_KjU();
        }
        if (Color.m4219equalsimpl0(this.color, j)) {
            return;
        }
        this.color = j;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public final Brush getBrush() {
        return this.brush;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public final void setBrush(Brush brush) {
        if (Intrinsics.areEqual(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public final float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public final void setAlpha(float f) {
        if (this.alpha == f) {
            return;
        }
        this.alpha = f;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    public final void mo3740setBlendModes9anfk8(int i) {
        if (BlendMode.m4128equalsimpl0(this.blendMode, i)) {
            return;
        }
        this.blendMode = i;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        updateDensity();
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public final void onDensityChange() {
        if (getIsAttached()) {
            updateDensity();
        }
    }

    private final void updateDensity() {
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        if (Intrinsics.areEqual(this.densityObject, densityRequireDensity)) {
            return;
        }
        this.densityObject = densityRequireDensity;
        this.block.invoke(this);
        invalidateShadow();
    }

    public final void update(Shape p0, Function1<? super InnerShadowScope, Unit> p1) {
        this.shape = p0;
        setBlock(p1);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope) {
        Painter.m4922drawx_KDEd0$default(obtainPainter(), contentDrawScope, contentDrawScope.mo4798getSizeNHjbRc(), 0.0f, null, 6, null);
        contentDrawScope.drawContent();
    }

    private final InnerShadowPainter obtainPainter() {
        Shadow shadow;
        if (!this.blockRead) {
            this.blockRead = true;
            ObserverModifierNodeKt.observeReads(this, new Function0<Unit>() { // from class: androidx.compose.ui.draw.BlockInnerShadowNode.obtainPainter.1
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    BlockInnerShadowNode.this.block.invoke(BlockInnerShadowNode.this);
                }

                {
                    super(0);
                }
            });
        }
        Shadow shadow2 = this.targetShadow;
        InnerShadowPainter innerShadowPainter = this.shadowPainter;
        Brush brush = getBrush();
        float f = mo690toDpu2uoSUM(getRadius());
        float f2 = mo690toDpu2uoSUM(getSpread());
        float f3 = mo690toDpu2uoSUM(Float.intBitsToFloat((int) (getOffset() >> 32)));
        long jM6991constructorimpl = DpOffset.m6991constructorimpl((((long) Float.floatToRawIntBits(mo690toDpu2uoSUM(Float.intBitsToFloat((int) (getOffset() & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32));
        if (innerShadowPainter != null && shadow2 != null && Dp.m6940equalsimpl0(shadow2.getRadius(), f) && Dp.m6940equalsimpl0(shadow2.getSpread(), f2) && Color.m4219equalsimpl0(shadow2.getColor(), getColor()) && Intrinsics.areEqual(shadow2.getBrush(), brush) && shadow2.getAlpha() == getAlpha() && BlendMode.m4128equalsimpl0(shadow2.getBlendMode(), getBlendMode()) && DpOffset.m6995equalsimpl0(shadow2.getOffset(), jM6991constructorimpl)) {
            return innerShadowPainter;
        }
        if (brush != null) {
            shadow = new Shadow(f, brush, f2, jM6991constructorimpl, getAlpha(), getBlendMode(), (DefaultConstructorMarker) null);
        } else {
            shadow = new Shadow(f, getColor(), f2, jM6991constructorimpl, getAlpha(), getBlendMode(), (DefaultConstructorMarker) null);
        }
        this.targetShadow = shadow;
        InnerShadowPainter innerShadowPainterCreateInnerShadowPainter = DelegatableNodeKt.requireGraphicsContext(this).getShadowContext().createInnerShadowPainter(this.shape, shadow);
        this.shadowPainter = innerShadowPainterCreateInnerShadowPainter;
        return innerShadowPainterCreateInnerShadowPainter;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        invalidateShadow();
        this.blockRead = false;
    }

    private final void invalidateShadow() {
        this.targetShadow = null;
        this.shadowPainter = null;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 != null && (p0 instanceof BlockInnerShadowNode)) {
            BlockInnerShadowNode blockInnerShadowNode = (BlockInnerShadowNode) p0;
            return getAlpha() == blockInnerShadowNode.getAlpha() && Intrinsics.areEqual(this.shape, blockInnerShadowNode.shape) && this.block == blockInnerShadowNode.block && getRadius() == blockInnerShadowNode.getRadius() && getSpread() == blockInnerShadowNode.getSpread() && Offset.m3971equalsimpl0(getOffset(), blockInnerShadowNode.getOffset()) && Color.m4219equalsimpl0(getColor(), blockInnerShadowNode.getColor()) && Intrinsics.areEqual(getBrush(), blockInnerShadowNode.getBrush()) && BlendMode.m4128equalsimpl0(getBlendMode(), blockInnerShadowNode.getBlendMode());
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(getAlpha());
        int iHashCode2 = this.shape.hashCode();
        int iHashCode3 = this.block.hashCode();
        int iHashCode4 = Float.hashCode(getRadius());
        int iHashCode5 = Float.hashCode(getSpread());
        int iM3976hashCodeimpl = Offset.m3976hashCodeimpl(getOffset());
        int iM4225hashCodeimpl = Color.m4225hashCodeimpl(getColor());
        Brush brush = getBrush();
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iM3976hashCodeimpl) * 31) + iM4225hashCodeimpl) * 31) + (brush != null ? brush.hashCode() : 0)) * 31) + BlendMode.m4129hashCodeimpl(getBlendMode());
    }
}
