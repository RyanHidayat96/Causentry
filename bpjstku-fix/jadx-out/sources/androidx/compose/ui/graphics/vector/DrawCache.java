package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00142\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/"}, d2 = {"Landroidx/compose/ui/graphics/vector/DrawCache;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "p0", "Landroidx/compose/ui/unit/IntSize;", "p1", "Landroidx/compose/ui/unit/Density;", "p2", "Landroidx/compose/ui/unit/LayoutDirection;", "p3", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "p4", "drawCachedImage-FqjB98A", "(IJLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Lkotlin/jvm/functions/Function1;)V", "drawCachedImage", "", "Landroidx/compose/ui/graphics/ColorFilter;", "drawInto", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FLandroidx/compose/ui/graphics/ColorFilter;)V", "clear", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "mCachedImage", "Landroidx/compose/ui/graphics/ImageBitmap;", "getMCachedImage", "()Landroidx/compose/ui/graphics/ImageBitmap;", "setMCachedImage", "(Landroidx/compose/ui/graphics/ImageBitmap;)V", "getMCachedImage$annotations", "Landroidx/compose/ui/graphics/Canvas;", "cachedCanvas", "Landroidx/compose/ui/graphics/Canvas;", "scopeDensity", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "size", "J", "config", "I", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "cacheScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DrawCache {
    public static final int $stable = 8;
    private Canvas cachedCanvas;
    private ImageBitmap mCachedImage;
    private Density scopeDensity;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private long size = IntSize.INSTANCE.m7111getZeroYbymL2g();
    private int config = ImageBitmapConfig.INSTANCE.m4451getArgb8888_sVssgQ();
    private final CanvasDrawScope cacheScope = new CanvasDrawScope();

    public static /* synthetic */ void getMCachedImage$annotations() {
    }

    public final ImageBitmap getMCachedImage() {
        return this.mCachedImage;
    }

    public final void setMCachedImage(ImageBitmap imageBitmap) {
        this.mCachedImage = imageBitmap;
    }

    /* JADX INFO: renamed from: drawCachedImage-FqjB98A, reason: not valid java name */
    public final void m4947drawCachedImageFqjB98A(int p0, long p1, Density p2, LayoutDirection p3, Function1<? super DrawScope, Unit> p4) {
        this.scopeDensity = p2;
        this.layoutDirection = p3;
        ImageBitmap imageBitmapM4456ImageBitmapx__hDU$default = this.mCachedImage;
        Canvas Canvas = this.cachedCanvas;
        if (imageBitmapM4456ImageBitmapx__hDU$default == null || Canvas == null || ((int) (p1 >> 32)) > imageBitmapM4456ImageBitmapx__hDU$default.getWidth() || ((int) (p1 & 4294967295L)) > imageBitmapM4456ImageBitmapx__hDU$default.getHeight() || !ImageBitmapConfig.m4446equalsimpl0(this.config, p0)) {
            imageBitmapM4456ImageBitmapx__hDU$default = ImageBitmapKt.m4456ImageBitmapx__hDU$default((int) (p1 >> 32), (int) (p1 & 4294967295L), p0, false, null, 24, null);
            Canvas = CanvasKt.Canvas(imageBitmapM4456ImageBitmapx__hDU$default);
            this.mCachedImage = imageBitmapM4456ImageBitmapx__hDU$default;
            this.cachedCanvas = Canvas;
            this.config = p0;
        }
        this.size = p1;
        CanvasDrawScope canvasDrawScope = this.cacheScope;
        long jM7118toSizeozmzZPI = IntSizeKt.m7118toSizeozmzZPI(p1);
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection = drawParams.getLayoutDirection();
        Canvas canvas = drawParams.getCanvas();
        long size = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(p2);
        drawParams2.setLayoutDirection(p3);
        drawParams2.setCanvas(Canvas);
        drawParams2.m4718setSizeuvyYCjk(jM7118toSizeozmzZPI);
        Canvas.save();
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        clear(canvasDrawScope2);
        p4.invoke(canvasDrawScope2);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection);
        drawParams3.setCanvas(canvas);
        drawParams3.m4718setSizeuvyYCjk(size);
        imageBitmapM4456ImageBitmapx__hDU$default.prepareToDraw();
    }

    public static /* synthetic */ void drawInto$default(DrawCache drawCache, DrawScope drawScope, float f, ColorFilter colorFilter, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        if ((i & 4) != 0) {
            colorFilter = null;
        }
        drawCache.drawInto(drawScope, f, colorFilter);
    }

    public final void drawInto(DrawScope p0, float p1, ColorFilter p2) {
        ImageBitmap imageBitmap = this.mCachedImage;
        if (imageBitmap == null) {
            InlineClassHelperKt.throwIllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        DrawScope.m4781drawImageAZ2fEMs$default(p0, imageBitmap, 0L, this.size, 0L, 0L, p1, null, p2, 0, 0, 858, null);
    }

    private final void clear(DrawScope drawScope) {
        DrawScope.m4792drawRectnJ9OG0$default(drawScope, Color.INSTANCE.m4244getBlack0d7_KjU(), 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m4132getClear0nO6VwU(), 62, null);
    }
}
