package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0083\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u001dH×\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ@\u0010)\u001a\u00020\u0002*\u00020 2\u0006\u0010\u0003\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\"2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#¢\u0006\u0002\b&H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/BorderCache;", "", "Landroidx/compose/ui/graphics/ImageBitmap;", "p0", "Landroidx/compose/ui/graphics/Canvas;", "p1", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "p2", "Landroidx/compose/ui/graphics/Path;", "p3", "<init>", "(Landroidx/compose/ui/graphics/ImageBitmap;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;Landroidx/compose/ui/graphics/Path;)V", "component1", "()Landroidx/compose/ui/graphics/ImageBitmap;", "component2", "()Landroidx/compose/ui/graphics/Canvas;", "component3", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "component4", "()Landroidx/compose/ui/graphics/Path;", "copy", "(Landroidx/compose/ui/graphics/ImageBitmap;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/foundation/BorderCache;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "obtainPath", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawBorderCache-EMwLDEs", "(Landroidx/compose/ui/draw/CacheDrawScope;JILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/ImageBitmap;", "drawBorderCache", "borderPath", "Landroidx/compose/ui/graphics/Path;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "imageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class BorderCache {
    private Path borderPath;
    private Canvas canvas;
    private CanvasDrawScope canvasDrawScope;
    private ImageBitmap imageBitmap;

    public BorderCache(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path) {
        this.imageBitmap = imageBitmap;
        this.canvas = canvas;
        this.canvasDrawScope = canvasDrawScope;
        this.borderPath = path;
    }

    public /* synthetic */ BorderCache(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : imageBitmap, (i & 2) != 0 ? null : canvas, (i & 4) != 0 ? null : canvasDrawScope, (i & 8) != 0 ? null : path);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX INFO: renamed from: drawBorderCache-EMwLDEs, reason: not valid java name */
    public final ImageBitmap m565drawBorderCacheEMwLDEs(CacheDrawScope cacheDrawScope, long j, int i, Function1<? super DrawScope, Unit> function1) {
        boolean z;
        CanvasDrawScope canvasDrawScope;
        ImageBitmap imageBitmapM4456ImageBitmapx__hDU$default = this.imageBitmap;
        Canvas Canvas = this.canvas;
        ImageBitmapConfig imageBitmapConfigM4443boximpl = imageBitmapM4456ImageBitmapx__hDU$default != null ? ImageBitmapConfig.m4443boximpl(imageBitmapM4456ImageBitmapx__hDU$default.mo4083getConfig_sVssgQ()) : null;
        int iM4451getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m4451getArgb8888_sVssgQ();
        if (imageBitmapConfigM4443boximpl == null || !ImageBitmapConfig.m4446equalsimpl0(imageBitmapConfigM4443boximpl.m4449unboximpl(), iM4451getArgb8888_sVssgQ)) {
            if (!ImageBitmapConfig.m4445equalsimpl(i, imageBitmapM4456ImageBitmapx__hDU$default != null ? ImageBitmapConfig.m4443boximpl(imageBitmapM4456ImageBitmapx__hDU$default.mo4083getConfig_sVssgQ()) : null)) {
                z = false;
            }
            if (imageBitmapM4456ImageBitmapx__hDU$default != null || Canvas == null || Size.m4043getWidthimpl(cacheDrawScope.m3758getSizeNHjbRc()) > imageBitmapM4456ImageBitmapx__hDU$default.getWidth() || Size.m4040getHeightimpl(cacheDrawScope.m3758getSizeNHjbRc()) > imageBitmapM4456ImageBitmapx__hDU$default.getHeight() || !z) {
                imageBitmapM4456ImageBitmapx__hDU$default = ImageBitmapKt.m4456ImageBitmapx__hDU$default(IntSize.m7106getWidthimpl(j), IntSize.m7105getHeightimpl(j), i, false, null, 24, null);
                this.imageBitmap = imageBitmapM4456ImageBitmapx__hDU$default;
                Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmapM4456ImageBitmapx__hDU$default);
                this.canvas = Canvas;
            }
            canvasDrawScope = this.canvasDrawScope;
            if (canvasDrawScope == null) {
                canvasDrawScope = new CanvasDrawScope();
                this.canvasDrawScope = canvasDrawScope;
            }
            long jM7118toSizeozmzZPI = IntSizeKt.m7118toSizeozmzZPI(j);
            LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
            CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
            Density density = drawParams.getDensity();
            LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
            Canvas canvas = drawParams.getCanvas();
            long size = drawParams.getSize();
            CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
            drawParams2.setDensity(cacheDrawScope);
            drawParams2.setLayoutDirection(layoutDirection);
            drawParams2.setCanvas(Canvas);
            drawParams2.m4718setSizeuvyYCjk(jM7118toSizeozmzZPI);
            Canvas.save();
            CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
            DrawScope.m4792drawRectnJ9OG0$default(canvasDrawScope2, Color.INSTANCE.m4244getBlack0d7_KjU(), 0L, jM7118toSizeozmzZPI, 0.0f, null, null, BlendMode.INSTANCE.m4132getClear0nO6VwU(), 58, null);
            function1.invoke(canvasDrawScope2);
            Canvas.restore();
            CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
            drawParams3.setDensity(density);
            drawParams3.setLayoutDirection(layoutDirection2);
            drawParams3.setCanvas(canvas);
            drawParams3.m4718setSizeuvyYCjk(size);
            imageBitmapM4456ImageBitmapx__hDU$default.prepareToDraw();
            return imageBitmapM4456ImageBitmapx__hDU$default;
        }
        z = true;
        if (imageBitmapM4456ImageBitmapx__hDU$default != null) {
            imageBitmapM4456ImageBitmapx__hDU$default = ImageBitmapKt.m4456ImageBitmapx__hDU$default(IntSize.m7106getWidthimpl(j), IntSize.m7105getHeightimpl(j), i, false, null, 24, null);
            this.imageBitmap = imageBitmapM4456ImageBitmapx__hDU$default;
            Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmapM4456ImageBitmapx__hDU$default);
            this.canvas = Canvas;
        } else {
            imageBitmapM4456ImageBitmapx__hDU$default = ImageBitmapKt.m4456ImageBitmapx__hDU$default(IntSize.m7106getWidthimpl(j), IntSize.m7105getHeightimpl(j), i, false, null, 24, null);
            this.imageBitmap = imageBitmapM4456ImageBitmapx__hDU$default;
            Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmapM4456ImageBitmapx__hDU$default);
            this.canvas = Canvas;
        }
        canvasDrawScope = this.canvasDrawScope;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            this.canvasDrawScope = canvasDrawScope;
        }
        long jM7118toSizeozmzZPI2 = IntSizeKt.m7118toSizeozmzZPI(j);
        LayoutDirection layoutDirection3 = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams4 = canvasDrawScope.getDrawParams();
        Density density2 = drawParams4.getDensity();
        LayoutDirection layoutDirection4 = drawParams4.getLayoutDirection();
        Canvas canvas2 = drawParams4.getCanvas();
        long size2 = drawParams4.getSize();
        CanvasDrawScope.DrawParams drawParams5 = canvasDrawScope.getDrawParams();
        drawParams5.setDensity(cacheDrawScope);
        drawParams5.setLayoutDirection(layoutDirection3);
        drawParams5.setCanvas(Canvas);
        drawParams5.m4718setSizeuvyYCjk(jM7118toSizeozmzZPI2);
        Canvas.save();
        CanvasDrawScope canvasDrawScope3 = canvasDrawScope;
        DrawScope.m4792drawRectnJ9OG0$default(canvasDrawScope3, Color.INSTANCE.m4244getBlack0d7_KjU(), 0L, jM7118toSizeozmzZPI2, 0.0f, null, null, BlendMode.INSTANCE.m4132getClear0nO6VwU(), 58, null);
        function1.invoke(canvasDrawScope3);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams6 = canvasDrawScope.getDrawParams();
        drawParams6.setDensity(density2);
        drawParams6.setLayoutDirection(layoutDirection4);
        drawParams6.setCanvas(canvas2);
        drawParams6.m4718setSizeuvyYCjk(size2);
        imageBitmapM4456ImageBitmapx__hDU$default.prepareToDraw();
        return imageBitmapM4456ImageBitmapx__hDU$default;
    }

    public final Path obtainPath() {
        Path path = this.borderPath;
        if (path != null) {
            return path;
        }
        Path Path = AndroidPath_androidKt.Path();
        this.borderPath = Path;
        return Path;
    }

    public BorderCache() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final ImageBitmap getImageBitmap() {
        return this.imageBitmap;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final Canvas getCanvas() {
        return this.canvas;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final CanvasDrawScope getCanvasDrawScope() {
        return this.canvasDrawScope;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final Path getBorderPath() {
        return this.borderPath;
    }

    public static /* synthetic */ BorderCache copy$default(BorderCache borderCache, ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            imageBitmap = borderCache.imageBitmap;
        }
        if ((i & 2) != 0) {
            canvas = borderCache.canvas;
        }
        if ((i & 4) != 0) {
            canvasDrawScope = borderCache.canvasDrawScope;
        }
        if ((i & 8) != 0) {
            path = borderCache.borderPath;
        }
        return borderCache.copy(imageBitmap, canvas, canvasDrawScope, path);
    }

    public final BorderCache copy(ImageBitmap p0, Canvas p1, CanvasDrawScope p2, Path p3) {
        return new BorderCache(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BorderCache)) {
            return false;
        }
        BorderCache borderCache = (BorderCache) p0;
        return Intrinsics.areEqual(this.imageBitmap, borderCache.imageBitmap) && Intrinsics.areEqual(this.canvas, borderCache.canvas) && Intrinsics.areEqual(this.canvasDrawScope, borderCache.canvasDrawScope) && Intrinsics.areEqual(this.borderPath, borderCache.borderPath);
    }

    public final int hashCode() {
        ImageBitmap imageBitmap = this.imageBitmap;
        int iHashCode = imageBitmap == null ? 0 : imageBitmap.hashCode();
        Canvas canvas = this.canvas;
        int iHashCode2 = canvas == null ? 0 : canvas.hashCode();
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        int iHashCode3 = canvasDrawScope == null ? 0 : canvasDrawScope.hashCode();
        Path path = this.borderPath;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (path != null ? path.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderCache(imageBitmap=");
        sb.append(this.imageBitmap);
        sb.append(", canvas=");
        sb.append(this.canvas);
        sb.append(", canvasDrawScope=");
        sb.append(this.canvasDrawScope);
        sb.append(", borderPath=");
        sb.append(this.borderPath);
        sb.append(')');
        return sb.toString();
    }
}
