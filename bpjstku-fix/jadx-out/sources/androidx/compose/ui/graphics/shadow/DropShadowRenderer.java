package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
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
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u0010\u001a\u00020\r*\u00020\b2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JQ\u0010\u001e\u001a\u00020\r*\u00020\b2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010!\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010!\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/"}, d2 = {"Landroidx/compose/ui/graphics/shadow/DropShadowRenderer;", "Landroidx/compose/ui/graphics/shadow/ShadowRenderer;", "Landroidx/compose/ui/graphics/shadow/Shadow;", "p0", "Landroidx/compose/ui/graphics/Outline;", "p1", "<init>", "(Landroidx/compose/ui/graphics/shadow/Shadow;Landroidx/compose/ui/graphics/Outline;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/geometry/CornerRadius;", "Landroidx/compose/ui/graphics/Path;", "p2", "", "buildShadow-_SMYjrA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJLandroidx/compose/ui/graphics/Path;)V", "buildShadow", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroidx/compose/ui/graphics/Brush;", "obtainCompositeBrush", "(Landroidx/compose/ui/graphics/ImageBitmap;Landroidx/compose/ui/graphics/Brush;)Landroidx/compose/ui/graphics/Brush;", "", "p3", "Landroidx/compose/ui/graphics/ColorFilter;", "p4", "p5", "Landroidx/compose/ui/graphics/BlendMode;", "p6", "onDrawShadow-MLmccfk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJLandroidx/compose/ui/graphics/Path;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/graphics/Brush;I)V", "onDrawShadow", "createOuterShadowBitmap-Cqks5Fs", "(JLandroidx/compose/ui/graphics/Path;FF)Landroidx/compose/ui/graphics/ImageBitmap;", "createOuterShadowBitmap", "createOuterShadowBitmap-D_oqF2M", "(JFFJ)Landroidx/compose/ui/graphics/ImageBitmap;", "shadow", "Landroidx/compose/ui/graphics/shadow/Shadow;", "getShadow", "()Landroidx/compose/ui/graphics/shadow/Shadow;", "Landroidx/compose/ui/graphics/Paint;", "paint", "Landroidx/compose/ui/graphics/Paint;", "shadowBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroidx/compose/ui/graphics/CompositeShaderBrush;", "compositeShader", "Landroidx/compose/ui/graphics/CompositeShaderBrush;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DropShadowRenderer extends ShadowRenderer {
    private CompositeShaderBrush compositeShader;
    private final Paint paint;
    private final Shadow shadow;
    private ImageBitmap shadowBitmap;

    public DropShadowRenderer(Shadow shadow, Outline outline) {
        super(outline);
        this.shadow = shadow;
        this.paint = AndroidPaint_androidKt.Paint();
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowRenderer
    /* JADX INFO: renamed from: buildShadow-_SMYjrA, reason: not valid java name */
    protected final void mo4935buildShadow_SMYjrA(DrawScope drawScope, long j, long j2, Path path) {
        ImageBitmap imageBitmapM4934createOuterShadowBitmapD_oqF2M;
        float f = drawScope.mo694toPx0680j_4(this.shadow.getRadius());
        float f2 = drawScope.mo694toPx0680j_4(this.shadow.getSpread());
        if (path != null) {
            imageBitmapM4934createOuterShadowBitmapD_oqF2M = m4933createOuterShadowBitmapCqks5Fs(j, path, f, f2);
        } else {
            imageBitmapM4934createOuterShadowBitmapD_oqF2M = m4934createOuterShadowBitmapD_oqF2M(j, f, f2, j2);
        }
        this.shadowBitmap = imageBitmapM4934createOuterShadowBitmapD_oqF2M;
    }

    private final Brush obtainCompositeBrush(ImageBitmap p0, Brush p1) {
        CompositeShaderBrush compositeShaderBrush = this.compositeShader;
        if (compositeShaderBrush == null || !Intrinsics.areEqual(compositeShaderBrush.getSrcBrush(), p1)) {
            Brush.Companion companion = Brush.INSTANCE;
            ShaderBrush ShaderBrush = BrushKt.ShaderBrush(ShaderKt.m4548ImageShaderF49vj9s$default(p0, 0, 0, 6, null));
            if (p1 instanceof ShaderBrush) {
                p1 = BrushKt.ShaderBrush(((ShaderBrush) p1).mo4187createShaderuvyYCjk(Size.m4034constructorimpl((((long) Float.floatToRawIntBits(p0.getWidth())) << 32) | (((long) Float.floatToRawIntBits(p0.getHeight())) & 4294967295L))));
            }
            Brush brushM4176composite7EN7VTw = companion.m4176composite7EN7VTw(ShaderBrush, p1, BlendMode.INSTANCE.m4157getSrcIn0nO6VwU());
            Intrinsics.checkNotNull(brushM4176composite7EN7VTw, "");
            compositeShaderBrush = (CompositeShaderBrush) brushM4176composite7EN7VTw;
            this.compositeShader = compositeShaderBrush;
        }
        return compositeShaderBrush;
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowRenderer
    /* JADX INFO: renamed from: onDrawShadow-MLmccfk, reason: not valid java name */
    protected final void mo4936onDrawShadowMLmccfk(DrawScope drawScope, long j, long j2, Path path, float f, ColorFilter colorFilter, Brush brush, int i) {
        ImageBitmap imageBitmap = this.shadowBitmap;
        if (imageBitmap != null) {
            float f2 = -(drawScope.mo694toPx0680j_4(this.shadow.getRadius()) + drawScope.mo694toPx0680j_4(this.shadow.getSpread()));
            if (brush != null && colorFilter == null) {
                Brush brushObtainCompositeBrush = obtainCompositeBrush(imageBitmap, brush);
                drawScope.getDrawContext().getTransform().translate(f2, f2);
                try {
                    DrawScope.m4791drawRectAsUm42w$default(drawScope, brushObtainCompositeBrush, 0L, Size.m4034constructorimpl((((long) Float.floatToRawIntBits(imageBitmap.getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(imageBitmap.getWidth())) << 32)), f, null, null, i, 50, null);
                    return;
                } finally {
                    float f3 = -f2;
                    drawScope.getDrawContext().getTransform().translate(f3, f3);
                }
            }
            DrawScope.m4782drawImagegbVJVH8$default(drawScope, imageBitmap, Offset.m3966constructorimpl((4294967295L & ((long) Float.floatToRawIntBits(f2))) | (((long) Float.floatToRawIntBits(f2)) << 32)), f, null, colorFilter, i, 8, null);
        }
    }

    /* JADX INFO: renamed from: createOuterShadowBitmap-Cqks5Fs, reason: not valid java name */
    private final ImageBitmap m4933createOuterShadowBitmapCqks5Fs(long p0, Path p1, float p2, float p3) {
        float f = 2.0f * p3;
        float f2 = (p2 * 2.0f) + f;
        ImageBitmap imageBitmapM4456ImageBitmapx__hDU$default = ImageBitmapKt.m4456ImageBitmapx__hDU$default((int) Math.ceil(Float.intBitsToFloat((int) (p0 >> 32)) + f2), (int) Math.ceil(Float.intBitsToFloat((int) (p0 & 4294967295L)) + f2), ImageBitmapConfig.INSTANCE.m4450getAlpha8_sVssgQ(), false, null, 24, null);
        Canvas Canvas = CanvasKt.Canvas(imageBitmapM4456ImageBitmapx__hDU$default);
        if (p3 > 0.0f) {
            float f3 = p2 + p3;
            Canvas.translate(f3, f3);
            Canvas.drawPath(p1, this.paint);
            Paint paintM4932configureShadowFoewPVk$default = BlurKt.m4932configureShadowFoewPVk$default(this.paint, 0L, 0, p2 > 0.0f ? Blur_androidKt.BlurFilter(p2) : null, PaintingStyle.INSTANCE.m4499getStrokeTiuSbCo(), 3, null);
            paintM4932configureShadowFoewPVk$default.setStrokeWidth(f);
            Unit unit = Unit.INSTANCE;
            Canvas.drawPath(p1, paintM4932configureShadowFoewPVk$default);
            return imageBitmapM4456ImageBitmapx__hDU$default;
        }
        BlurKt.m4932configureShadowFoewPVk$default(this.paint, 0L, 0, p2 > 0.0f ? Blur_androidKt.BlurFilter(p2) : null, 0, 11, null);
        Canvas.translate(p2, p2);
        Canvas.drawPath(p1, this.paint);
        return imageBitmapM4456ImageBitmapx__hDU$default;
    }

    /* JADX INFO: renamed from: createOuterShadowBitmap-D_oqF2M, reason: not valid java name */
    private final ImageBitmap m4934createOuterShadowBitmapD_oqF2M(long p0, float p1, float p2, long p3) {
        float f = (p1 * 2.0f) + (2.0f * p2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0 >> 32)) + f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (p0 & 4294967295L)) + f;
        ImageBitmap imageBitmapM4456ImageBitmapx__hDU$default = ImageBitmapKt.m4456ImageBitmapx__hDU$default((int) Math.ceil(fIntBitsToFloat), (int) Math.ceil(fIntBitsToFloat2), ImageBitmapConfig.INSTANCE.m4450getAlpha8_sVssgQ(), false, null, 24, null);
        CanvasKt.Canvas(imageBitmapM4456ImageBitmapx__hDU$default).drawRoundRect(p1, p1, fIntBitsToFloat - p1, fIntBitsToFloat2 - p1, Float.intBitsToFloat((int) (p3 >> 32)), Float.intBitsToFloat((int) (p3 & 4294967295L)), BlurKt.m4932configureShadowFoewPVk$default(this.paint, 0L, 0, p1 > 0.0f ? Blur_androidKt.BlurFilter(p1) : null, 0, 11, null));
        return imageBitmapM4456ImageBitmapx__hDU$default;
    }
}
