package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JF\u0010\u0019\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R*\u0010&\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R-\u0010,\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@GX\u0087\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/unit/Dp;", "p0", "Landroidx/compose/ui/graphics/Brush;", "p1", "Landroidx/compose/ui/graphics/Shape;", "p2", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/graphics/Outline$Generic;", "", "", "p3", "Landroidx/compose/ui/draw/DrawResult;", "drawGenericBorder", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Generic;ZF)Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Size;", "p4", "p5", "drawRoundRectBorder-JqoCqck", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "drawRoundRectBorder", "Landroidx/compose/foundation/BorderCache;", "borderCache", "Landroidx/compose/foundation/BorderCache;", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "drawWithCacheModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "width", "F", "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BorderModifierNode extends DelegatingNode {
    public static final int $stable = 8;
    private BorderCache borderCache;
    private Brush brush;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private Shape shape;
    private float width;

    private BorderModifierNode(float f, Brush brush, Shape shape) {
        this.width = f;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            @Override // kotlin.jvm.functions.Function1
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                if (cacheDrawScope.mo694toPx0680j_4(this.this$0.getWidth()) < 0.0f || Size.m4042getMinDimensionimpl(cacheDrawScope.m3758getSizeNHjbRc()) <= 0.0f) {
                    return BorderKt.drawContentWithoutBorder(cacheDrawScope);
                }
                float fMin = Math.min(Dp.m6940equalsimpl0(this.this$0.getWidth(), Dp.INSTANCE.m6953getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo694toPx0680j_4(this.this$0.getWidth())), (float) Math.ceil(Size.m4042getMinDimensionimpl(cacheDrawScope.m3758getSizeNHjbRc()) / 2.0f));
                float f2 = fMin / 2.0f;
                long jOffset = OffsetKt.Offset(f2, f2);
                long jSize = SizeKt.Size(Size.m4043getWidthimpl(cacheDrawScope.m3758getSizeNHjbRc()) - fMin, Size.m4040getHeightimpl(cacheDrawScope.m3758getSizeNHjbRc()) - fMin);
                boolean z = 2.0f * fMin > Size.m4042getMinDimensionimpl(cacheDrawScope.m3758getSizeNHjbRc());
                Outline outlineMo605createOutlinePq9zytI = this.this$0.getShape().mo605createOutlinePq9zytI(cacheDrawScope.m3758getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                if (outlineMo605createOutlinePq9zytI instanceof Outline.Generic) {
                    BorderModifierNode borderModifierNode = this.this$0;
                    return borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.getBrush(), (Outline.Generic) outlineMo605createOutlinePq9zytI, z, fMin);
                }
                if (outlineMo605createOutlinePq9zytI instanceof Outline.Rounded) {
                    BorderModifierNode borderModifierNode2 = this.this$0;
                    return borderModifierNode2.m574drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode2.getBrush(), (Outline.Rounded) outlineMo605createOutlinePq9zytI, jOffset, jSize, z, fMin);
                }
                if (outlineMo605createOutlinePq9zytI instanceof Outline.Rectangle) {
                    return BorderKt.m571drawRectBorderNsqcLGU(cacheDrawScope, this.this$0.getBrush(), jOffset, jSize, z, fMin);
                }
                throw new NoWhenBranchMatchedException();
            }

            {
                super(1);
            }
        }));
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m576setWidth0680j_4(float f) {
        if (Dp.m6940equalsimpl0(this.width, f)) {
            return;
        }
        this.width = f;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final void setBrush(Brush brush) {
        if (Intrinsics.areEqual(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final void setShape(Shape shape) {
        if (Intrinsics.areEqual(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00dc  */
    /* JADX WARN: Type inference failed for: r12v3, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    public final DrawResult drawGenericBorder(CacheDrawScope cacheDrawScope, final Brush brush, final Outline.Generic generic, boolean z, float f) throws Throwable {
        int iM4451getArgb8888_sVssgQ;
        ColorFilter colorFilterM4259tintxETnrds$default;
        boolean z2;
        float f2;
        long j;
        DrawContext drawContext;
        if (z) {
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode.drawGenericBorder.1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope contentDrawScope) {
                    contentDrawScope.drawContent();
                    DrawScope.m4787drawPathGBMwjPU$default(contentDrawScope, generic.getPath(), brush, 0.0f, null, null, 0, 60, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
        if (brush instanceof SolidColor) {
            iM4451getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m4450getAlpha8_sVssgQ();
            colorFilterM4259tintxETnrds$default = ColorFilter.Companion.m4259tintxETnrds$default(ColorFilter.INSTANCE, ((SolidColor) brush).getValue(), 0, 2, null);
        } else {
            iM4451getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m4451getArgb8888_sVssgQ();
            colorFilterM4259tintxETnrds$default = null;
        }
        final Rect bounds = generic.getPath().getBounds();
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        Path pathObtainPath = borderCache.obtainPath();
        pathObtainPath.reset();
        Path.addRect$default(pathObtainPath, bounds, null, 2, null);
        pathObtainPath.mo4108opN5in7k0(pathObtainPath, generic.getPath(), PathOperation.INSTANCE.m4523getDifferenceb3I0S0c());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final long jIntSize = IntSizeKt.IntSize((int) Math.ceil(bounds.getWidth()), (int) Math.ceil(bounds.getHeight()));
        BorderCache borderCache2 = this.borderCache;
        Intrinsics.checkNotNull(borderCache2);
        ImageBitmap imageBitmapM4456ImageBitmapx__hDU$default = borderCache2.imageBitmap;
        Canvas Canvas = borderCache2.canvas;
        ImageBitmapConfig imageBitmapConfigM4443boximpl = imageBitmapM4456ImageBitmapx__hDU$default != null ? ImageBitmapConfig.m4443boximpl(imageBitmapM4456ImageBitmapx__hDU$default.mo4083getConfig_sVssgQ()) : null;
        int iM4451getArgb8888_sVssgQ2 = ImageBitmapConfig.INSTANCE.m4451getArgb8888_sVssgQ();
        if (imageBitmapConfigM4443boximpl != null && ImageBitmapConfig.m4446equalsimpl0(imageBitmapConfigM4443boximpl.m4449unboximpl(), iM4451getArgb8888_sVssgQ2)) {
            z2 = true;
        } else {
            if (ImageBitmapConfig.m4445equalsimpl(iM4451getArgb8888_sVssgQ, imageBitmapM4456ImageBitmapx__hDU$default != null ? ImageBitmapConfig.m4443boximpl(imageBitmapM4456ImageBitmapx__hDU$default.mo4083getConfig_sVssgQ()) : null)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (imageBitmapM4456ImageBitmapx__hDU$default == null || Canvas == null || Size.m4043getWidthimpl(cacheDrawScope.m3758getSizeNHjbRc()) > imageBitmapM4456ImageBitmapx__hDU$default.getWidth() || Size.m4040getHeightimpl(cacheDrawScope.m3758getSizeNHjbRc()) > imageBitmapM4456ImageBitmapx__hDU$default.getHeight() || !z2) {
            imageBitmapM4456ImageBitmapx__hDU$default = ImageBitmapKt.m4456ImageBitmapx__hDU$default(IntSize.m7106getWidthimpl(jIntSize), IntSize.m7105getHeightimpl(jIntSize), iM4451getArgb8888_sVssgQ, false, null, 24, null);
            borderCache2.imageBitmap = imageBitmapM4456ImageBitmapx__hDU$default;
            Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmapM4456ImageBitmapx__hDU$default);
            borderCache2.canvas = Canvas;
        }
        ?? r12 = imageBitmapM4456ImageBitmapx__hDU$default;
        Canvas canvas = Canvas;
        CanvasDrawScope canvasDrawScope = borderCache2.canvasDrawScope;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            borderCache2.canvasDrawScope = canvasDrawScope;
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        long jM7118toSizeozmzZPI = IntSizeKt.m7118toSizeozmzZPI(jIntSize);
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas2 = drawParams.getCanvas();
        long size = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m4718setSizeuvyYCjk(jM7118toSizeozmzZPI);
        canvas.save();
        CanvasDrawScope canvasDrawScope3 = canvasDrawScope2;
        DrawScope.m4792drawRectnJ9OG0$default(canvasDrawScope3, Color.INSTANCE.m4244getBlack0d7_KjU(), 0L, jM7118toSizeozmzZPI, 0.0f, null, null, BlendMode.INSTANCE.m4132getClear0nO6VwU(), 58, null);
        float f3 = -bounds.getLeft();
        float f4 = -bounds.getTop();
        canvasDrawScope3.getDrawContext().getTransform().translate(f3, f4);
        try {
            f4 = f4;
            f2 = f3;
            try {
                DrawScope.m4787drawPathGBMwjPU$default(canvasDrawScope3, generic.getPath(), brush, 0.0f, new Stroke(f * 2.0f, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                float fM4043getWidthimpl = (Size.m4043getWidthimpl(canvasDrawScope3.mo4798getSizeNHjbRc()) + 1.0f) / Size.m4043getWidthimpl(canvasDrawScope3.mo4798getSizeNHjbRc());
                float fM4040getHeightimpl = (Size.m4040getHeightimpl(canvasDrawScope3.mo4798getSizeNHjbRc()) + 1.0f) / Size.m4040getHeightimpl(canvasDrawScope3.mo4798getSizeNHjbRc());
                long jMo4797getCenterF1C5BW0 = canvasDrawScope3.mo4797getCenterF1C5BW0();
                DrawContext drawContext2 = canvasDrawScope3.getDrawContext();
                long jMo4719getSizeNHjbRc = drawContext2.mo4719getSizeNHjbRc();
                drawContext2.getCanvas().save();
                try {
                    drawContext2.getTransform().mo4726scale0AR0LA0(fM4043getWidthimpl, fM4040getHeightimpl, jMo4797getCenterF1C5BW0);
                    drawContext = drawContext2;
                    try {
                        DrawScope.m4787drawPathGBMwjPU$default(canvasDrawScope3, pathObtainPath, brush, 0.0f, null, null, BlendMode.INSTANCE.m4132getClear0nO6VwU(), 28, null);
                        drawContext.getCanvas().restore();
                        drawContext.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
                        canvasDrawScope3.getDrawContext().getTransform().translate(-f2, -f4);
                        canvas.restore();
                        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
                        drawParams3.setDensity(density);
                        drawParams3.setLayoutDirection(layoutDirection2);
                        drawParams3.setCanvas(canvas2);
                        drawParams3.m4718setSizeuvyYCjk(size);
                        r12.prepareToDraw();
                        objectRef.element = r12;
                        final ColorFilter colorFilter = colorFilterM4259tintxETnrds$default;
                        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode.drawGenericBorder.3
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) throws Throwable {
                                invoke2(contentDrawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ContentDrawScope contentDrawScope) throws Throwable {
                                float f5;
                                float f6;
                                contentDrawScope.drawContent();
                                ContentDrawScope contentDrawScope2 = contentDrawScope;
                                float left = bounds.getLeft();
                                float top = bounds.getTop();
                                Ref.ObjectRef<ImageBitmap> objectRef2 = objectRef;
                                long j2 = jIntSize;
                                ColorFilter colorFilter2 = colorFilter;
                                contentDrawScope2.getDrawContext().getTransform().translate(left, top);
                                try {
                                    f6 = left;
                                    try {
                                        DrawScope.m4781drawImageAZ2fEMs$default(contentDrawScope2, objectRef2.element, 0L, j2, 0L, 0L, 0.0f, null, colorFilter2, 0, 0, 890, null);
                                        contentDrawScope2.getDrawContext().getTransform().translate(-f6, -top);
                                    } catch (Throwable th) {
                                        th = th;
                                        f5 = top;
                                        contentDrawScope2.getDrawContext().getTransform().translate(-f6, -f5);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    f5 = top;
                                    f6 = left;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        });
                    } catch (Throwable th) {
                        th = th;
                        j = jMo4719getSizeNHjbRc;
                        try {
                            drawContext.getCanvas().restore();
                            drawContext.mo4720setSizeuvyYCjk(j);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            canvasDrawScope3.getDrawContext().getTransform().translate(-f2, -f4);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j = jMo4719getSizeNHjbRc;
                    drawContext = drawContext2;
                }
            } catch (Throwable th4) {
                th = th4;
                f4 = f4;
                f2 = f2;
            }
        } catch (Throwable th5) {
            th = th5;
            f2 = f3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public final DrawResult m574drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j, final long j2, final boolean z, final float f) {
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long jM4024getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m4024getTopLeftCornerRadiuskKHJgLs();
            final float f2 = f / 2.0f;
            final Stroke stroke = new Stroke(f, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) throws Throwable {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope contentDrawScope) throws Throwable {
                    long j3;
                    DrawContext drawContext;
                    contentDrawScope.drawContent();
                    if (z) {
                        DrawScope.m4793drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, jM4024getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                        return;
                    }
                    float fM3934getXimpl = CornerRadius.m3934getXimpl(jM4024getTopLeftCornerRadiuskKHJgLs);
                    float f3 = f2;
                    if (fM3934getXimpl < f3) {
                        ContentDrawScope contentDrawScope2 = contentDrawScope;
                        float f4 = f;
                        float fM4043getWidthimpl = Size.m4043getWidthimpl(contentDrawScope.mo4798getSizeNHjbRc());
                        float f5 = f;
                        float fM4040getHeightimpl = Size.m4040getHeightimpl(contentDrawScope.mo4798getSizeNHjbRc());
                        float f6 = f;
                        int iM4206getDifferencertfAjoo = ClipOp.INSTANCE.m4206getDifferencertfAjoo();
                        Brush brush2 = brush;
                        long j4 = jM4024getTopLeftCornerRadiuskKHJgLs;
                        DrawContext drawContext2 = contentDrawScope2.getDrawContext();
                        long jMo4719getSizeNHjbRc = drawContext2.mo4719getSizeNHjbRc();
                        drawContext2.getCanvas().save();
                        try {
                            drawContext2.getTransform().mo4722clipRectN_I0leg(f4, f4, fM4043getWidthimpl - f5, fM4040getHeightimpl - f6, iM4206getDifferencertfAjoo);
                            drawContext = drawContext2;
                            try {
                                DrawScope.m4793drawRoundRectZuiqVtQ$default(contentDrawScope2, brush2, 0L, 0L, j4, 0.0f, null, null, 0, 246, null);
                                drawContext.getCanvas().restore();
                                drawContext.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
                            } catch (Throwable th) {
                                th = th;
                                j3 = jMo4719getSizeNHjbRc;
                                drawContext.getCanvas().restore();
                                drawContext.mo4720setSizeuvyYCjk(j3);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j3 = jMo4719getSizeNHjbRc;
                            drawContext = drawContext2;
                        }
                    } else {
                        DrawScope.m4793drawRoundRectZuiqVtQ$default(contentDrawScope, brush, j, j2, BorderKt.m572shrinkKibmq7A(jM4024getTopLeftCornerRadiuskKHJgLs, f3), 0.0f, stroke, null, 0, 208, null);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        final Path pathCreateRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f, z);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m4787drawPathGBMwjPU$default(contentDrawScope, pathCreateRoundRectPath, brush, 0.0f, null, null, 0, 60, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    public /* synthetic */ BorderModifierNode(float f, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, shape);
    }
}
