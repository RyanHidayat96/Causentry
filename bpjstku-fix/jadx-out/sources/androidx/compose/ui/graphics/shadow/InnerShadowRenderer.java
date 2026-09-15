package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.CompositeShaderBrush;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.DpOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0014\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JQ\u0010#\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00162\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J?\u0010&\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b$\u0010%J?\u0010)\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104"}, d2 = {"Landroidx/compose/ui/graphics/shadow/InnerShadowRenderer;", "Landroidx/compose/ui/graphics/shadow/ShadowRenderer;", "Landroidx/compose/ui/graphics/shadow/Shadow;", "p0", "Landroidx/compose/ui/graphics/Outline;", "p1", "<init>", "(Landroidx/compose/ui/graphics/shadow/Shadow;Landroidx/compose/ui/graphics/Outline;)V", "Landroidx/compose/ui/graphics/Matrix;", "obtainMatrix-sQKQjiQ", "()[F", "obtainMatrix", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/geometry/CornerRadius;", "Landroidx/compose/ui/graphics/Path;", "p2", "", "buildShadow-_SMYjrA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJLandroidx/compose/ui/graphics/Path;)V", "buildShadow", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/graphics/CompositeShaderBrush;", "obtainCompositeBrush", "(Landroidx/compose/ui/graphics/ShaderBrush;Landroidx/compose/ui/graphics/Brush;)Landroidx/compose/ui/graphics/CompositeShaderBrush;", "", "p3", "Landroidx/compose/ui/graphics/ColorFilter;", "p4", "p5", "Landroidx/compose/ui/graphics/BlendMode;", "p6", "onDrawShadow-MLmccfk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJLandroidx/compose/ui/graphics/Path;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/graphics/Brush;I)V", "onDrawShadow", "createInnerPathShadowBrush-LjSzlW0", "(JLandroidx/compose/ui/graphics/Path;FFFF)Landroidx/compose/ui/graphics/ShaderBrush;", "createInnerPathShadowBrush", "createInnerShadowBrush-u1Psq-8", "(JFFFFJ)Landroidx/compose/ui/graphics/ShaderBrush;", "createInnerShadowBrush", "shadow", "Landroidx/compose/ui/graphics/shadow/Shadow;", "Landroidx/compose/ui/graphics/Paint;", "paint", "Landroidx/compose/ui/graphics/Paint;", "shadowMask", "Landroidx/compose/ui/graphics/ShaderBrush;", "compositeShader", "Landroidx/compose/ui/graphics/CompositeShaderBrush;", "matrix", "[F"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InnerShadowRenderer extends ShadowRenderer {
    private CompositeShaderBrush compositeShader;
    private float[] matrix;
    private final Paint paint;
    private final Shadow shadow;
    private ShaderBrush shadowMask;

    public InnerShadowRenderer(Shadow shadow, Outline outline) {
        super(outline);
        this.shadow = shadow;
        this.paint = AndroidPaint_androidKt.Paint();
    }

    /* JADX INFO: renamed from: obtainMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m4939obtainMatrixsQKQjiQ() {
        float[] fArr = this.matrix;
        if (fArr != null) {
            return fArr;
        }
        float[] fArrM4461constructorimpl$default = Matrix.m4461constructorimpl$default(null, 1, null);
        this.matrix = fArrM4461constructorimpl$default;
        return fArrM4461constructorimpl$default;
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowRenderer
    /* JADX INFO: renamed from: buildShadow-_SMYjrA */
    protected final void mo4935buildShadow_SMYjrA(DrawScope drawScope, long j, long j2, Path path) {
        ShaderBrush shaderBrushM4938createInnerShadowBrushu1Psq8;
        float f = drawScope.mo694toPx0680j_4(this.shadow.getRadius());
        float f2 = drawScope.mo694toPx0680j_4(this.shadow.getSpread());
        float f3 = drawScope.mo694toPx0680j_4(DpOffset.m6996getXD9Ej5fM(this.shadow.getOffset()));
        float f4 = drawScope.mo694toPx0680j_4(DpOffset.m6998getYD9Ej5fM(this.shadow.getOffset()));
        if (path != null) {
            shaderBrushM4938createInnerShadowBrushu1Psq8 = m4937createInnerPathShadowBrushLjSzlW0(j, path, f, f2, f3, f4);
        } else {
            shaderBrushM4938createInnerShadowBrushu1Psq8 = m4938createInnerShadowBrushu1Psq8(j, f, f2, f3, f4, j2);
        }
        this.shadowMask = shaderBrushM4938createInnerShadowBrushu1Psq8;
    }

    private final CompositeShaderBrush obtainCompositeBrush(ShaderBrush p0, Brush p1) {
        CompositeShaderBrush compositeShaderBrush = this.compositeShader;
        if (compositeShaderBrush != null && Intrinsics.areEqual(compositeShaderBrush.getSrcBrush(), p1)) {
            return compositeShaderBrush;
        }
        CompositeShaderBrush compositeShaderBrush2 = new CompositeShaderBrush(BrushKt.toShaderBrush(p0), BrushKt.toShaderBrush(p1), BlendMode.INSTANCE.m4157getSrcIn0nO6VwU(), null);
        this.compositeShader = compositeShaderBrush2;
        return compositeShaderBrush2;
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowRenderer
    /* JADX INFO: renamed from: onDrawShadow-MLmccfk */
    protected final void mo4936onDrawShadowMLmccfk(DrawScope drawScope, long j, long j2, Path path, float f, ColorFilter colorFilter, Brush brush, int i) {
        CompositeShaderBrush compositeShaderBrushObtainCompositeBrush = this.shadowMask;
        if (compositeShaderBrushObtainCompositeBrush != null) {
            if (this.shadow.getBrush() instanceof ShaderBrush) {
                compositeShaderBrushObtainCompositeBrush = obtainCompositeBrush(compositeShaderBrushObtainCompositeBrush, this.shadow.getBrush());
            }
            if (path != null) {
                DrawScope.m4787drawPathGBMwjPU$default(drawScope, path, compositeShaderBrushObtainCompositeBrush, f, null, colorFilter, i, 8, null);
            } else if (CornerRadius.m3933equalsimpl0(j2, CornerRadius.INSTANCE.m3946getZerokKHJgLs())) {
                DrawScope.m4791drawRectAsUm42w$default(drawScope, compositeShaderBrushObtainCompositeBrush, 0L, 0L, f, null, colorFilter, i, 22, null);
            } else {
                DrawScope.m4793drawRoundRectZuiqVtQ$default(drawScope, compositeShaderBrushObtainCompositeBrush, 0L, 0L, j2, f, null, colorFilter, this.shadow.getBlendMode(), 38, null);
            }
        }
    }

    /* JADX INFO: renamed from: createInnerPathShadowBrush-LjSzlW0, reason: not valid java name */
    private final ShaderBrush m4937createInnerPathShadowBrushLjSzlW0(long p0, Path p1, float p2, float p3, float p4, float p5) {
        ImageBitmap imageBitmapM4456ImageBitmapx__hDU$default;
        int iCeil = (int) Math.ceil(Float.intBitsToFloat((int) (p0 >> 32)));
        int iCeil2 = (int) Math.ceil(Float.intBitsToFloat((int) (p0 & 4294967295L)));
        if (p3 > 0.0f) {
            Rect bounds = p1.getBounds();
            float right = bounds.getRight() - bounds.getLeft();
            float bottom = bounds.getBottom() - bounds.getTop();
            imageBitmapM4456ImageBitmapx__hDU$default = ImageBitmapKt.m4456ImageBitmapx__hDU$default((int) Math.ceil(right), (int) Math.ceil(bottom), ImageBitmapConfig.INSTANCE.m4450getAlpha8_sVssgQ(), false, null, 24, null);
            Canvas Canvas = CanvasKt.Canvas(imageBitmapM4456ImageBitmapx__hDU$default);
            Canvas.drawPath(p1, this.paint);
            Canvas.m4190clipRectN_I0leg$default(Canvas, 0.0f, 0.0f, right, bottom, 0, 16, null);
            Paint paintM4932configureShadowFoewPVk$default = BlurKt.m4932configureShadowFoewPVk$default(this.paint, 0L, BlendMode.INSTANCE.m4132getClear0nO6VwU(), null, PaintingStyle.INSTANCE.m4499getStrokeTiuSbCo(), 5, null);
            paintM4932configureShadowFoewPVk$default.setStrokeWidth(2.0f * p3);
            Unit unit = Unit.INSTANCE;
            Canvas.drawPath(p1, paintM4932configureShadowFoewPVk$default);
        } else {
            imageBitmapM4456ImageBitmapx__hDU$default = null;
        }
        int iCeil3 = ((int) Math.ceil(p2)) * 2;
        ImageBitmap imageBitmapM4456ImageBitmapx__hDU$default2 = ImageBitmapKt.m4456ImageBitmapx__hDU$default(iCeil + iCeil3, iCeil2 + iCeil3, ImageBitmapConfig.INSTANCE.m4450getAlpha8_sVssgQ(), false, null, 24, null);
        Canvas Canvas2 = CanvasKt.Canvas(imageBitmapM4456ImageBitmapx__hDU$default2);
        if (imageBitmapM4456ImageBitmapx__hDU$default != null) {
            Canvas2.drawRect(0.0f, 0.0f, imageBitmapM4456ImageBitmapx__hDU$default2.getWidth(), imageBitmapM4456ImageBitmapx__hDU$default2.getHeight(), BlurKt.m4932configureShadowFoewPVk$default(this.paint, 0L, 0, null, 0, 15, null));
            Canvas2.mo4072drawImaged4ec7I(imageBitmapM4456ImageBitmapx__hDU$default, Offset.m3966constructorimpl((4294967295L & ((long) Float.floatToRawIntBits(p5))) | (((long) Float.floatToRawIntBits(p4)) << 32)), BlurKt.m4932configureShadowFoewPVk$default(this.paint, 0L, BlendMode.INSTANCE.m4160getXor0nO6VwU(), p2 > 0.0f ? Blur_androidKt.BlurFilter(p2) : null, 0, 9, null));
            return BrushKt.ShaderBrush(ShaderKt.m4548ImageShaderF49vj9s$default(imageBitmapM4456ImageBitmapx__hDU$default2, 0, 0, 6, null));
        }
        Canvas2.save();
        Canvas2.translate(p4, p5);
        Canvas2.drawPath(p1, BlurKt.m4932configureShadowFoewPVk$default(this.paint, 0L, 0, p2 > 0.0f ? Blur_androidKt.BlurFilter(p2) : null, 0, 11, null));
        Canvas2.restore();
        Canvas2.drawRect(0.0f, 0.0f, imageBitmapM4456ImageBitmapx__hDU$default2.getWidth(), imageBitmapM4456ImageBitmapx__hDU$default2.getHeight(), BlurKt.m4932configureShadowFoewPVk$default(this.paint, 0L, BlendMode.INSTANCE.m4160getXor0nO6VwU(), null, 0, 13, null));
        return BrushKt.ShaderBrush(ShaderKt.m4548ImageShaderF49vj9s$default(imageBitmapM4456ImageBitmapx__hDU$default2, 0, 0, 6, null));
    }

    /* JADX INFO: renamed from: createInnerShadowBrush-u1Psq-8, reason: not valid java name */
    private final ShaderBrush m4938createInnerShadowBrushu1Psq8(long p0, float p1, float p2, float p3, float p4, long p5) {
        int i = (int) (p0 >> 32);
        int i2 = (int) (p0 & 4294967295L);
        ImageBitmap imageBitmapM4456ImageBitmapx__hDU$default = ImageBitmapKt.m4456ImageBitmapx__hDU$default((int) Math.ceil(Float.intBitsToFloat(i)), (int) Math.ceil(Float.intBitsToFloat(i2)), ImageBitmapConfig.INSTANCE.m4450getAlpha8_sVssgQ(), false, null, 24, null);
        Canvas Canvas = CanvasKt.Canvas(imageBitmapM4456ImageBitmapx__hDU$default);
        float f = p3 + p2;
        float f2 = p4 + p2;
        Canvas.drawRoundRect(f, f2, Math.max(f, (p3 + Float.intBitsToFloat(i)) - p2), Math.max(f2, (p4 + Float.intBitsToFloat(i2)) - p2), Float.intBitsToFloat((int) (p5 >> 32)), Float.intBitsToFloat((int) (p5 & 4294967295L)), BlurKt.m4932configureShadowFoewPVk$default(this.paint, 0L, 0, p1 > 0.0f ? Blur_androidKt.BlurFilter(p1) : null, 0, 11, null));
        Canvas.drawRect(0.0f, 0.0f, imageBitmapM4456ImageBitmapx__hDU$default.getWidth(), imageBitmapM4456ImageBitmapx__hDU$default.getHeight(), BlurKt.m4932configureShadowFoewPVk$default(this.paint, 0L, BlendMode.INSTANCE.m4160getXor0nO6VwU(), null, 0, 13, null));
        return BrushKt.ShaderBrush(ShaderKt.m4548ImageShaderF49vj9s$default(imageBitmapM4456ImageBitmapx__hDU$default, 0, 0, 6, null));
    }
}
