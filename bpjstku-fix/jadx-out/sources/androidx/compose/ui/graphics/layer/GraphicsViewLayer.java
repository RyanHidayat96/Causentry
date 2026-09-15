package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 ¦\u00012\u00020\u0001:\u0002¦\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0005\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010!J@\u0010)\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020%2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\r0&¢\u0006\u0002\b(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\rH\u0002¢\u0006\u0004\b+\u0010\u0012J\u0017\u0010-\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0017¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\rH\u0002¢\u0006\u0004\b2\u0010\u0012J\u000f\u00103\u001a\u00020\rH\u0016¢\u0006\u0004\b3\u0010\u0012R\u0014\u00104\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0006*\u00020A0A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u0004\u0018\u00010I8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bN\u0010;R\u0016\u0010O\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR\u0016\u0010R\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u00107R\u0016\u0010S\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\"\u0010U\u001a\u00020\u00168\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bU\u0010T\u001a\u0004\bU\u0010\u0018\"\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bX\u0010TR\u0016\u0010Y\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bY\u0010TR\u001a\u0010Z\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\bZ\u00107\u001a\u0004\b[\u00109R*\u0010]\u001a\u00020\\2\u0006\u0010\u0003\u001a\u00020\\8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b]\u0010P\u001a\u0004\b^\u0010_\"\u0004\b`\u0010\u000fR.\u0010b\u001a\u0004\u0018\u00010a2\b\u0010\u0003\u001a\u0004\u0018\u00010a8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR*\u0010h\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bh\u0010P\u001a\u0004\bi\u0010_\"\u0004\bj\u0010\u000fR*\u0010l\u001a\u00020k2\u0006\u0010\u0003\u001a\u00020k8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0016\u0010r\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\br\u0010TR*\u0010t\u001a\u00020s2\u0006\u0010\u0003\u001a\u00020s8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bt\u00107\u001a\u0004\bu\u00109\"\u0004\bv\u0010wR*\u0010x\u001a\u00020k2\u0006\u0010\u0003\u001a\u00020k8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bx\u0010m\u001a\u0004\by\u0010o\"\u0004\bz\u0010qR*\u0010{\u001a\u00020k2\u0006\u0010\u0003\u001a\u00020k8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b{\u0010m\u001a\u0004\b|\u0010o\"\u0004\b}\u0010qR+\u0010~\u001a\u00020k2\u0006\u0010\u0003\u001a\u00020k8\u0017@WX\u0097\u000e¢\u0006\u0013\n\u0004\b~\u0010m\u001a\u0004\b\u007f\u0010o\"\u0005\b\u0080\u0001\u0010qR.\u0010\u0081\u0001\u001a\u00020k2\u0006\u0010\u0003\u001a\u00020k8\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010m\u001a\u0005\b\u0082\u0001\u0010o\"\u0005\b\u0083\u0001\u0010qR.\u0010\u0084\u0001\u001a\u00020k2\u0006\u0010\u0003\u001a\u00020k8\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010m\u001a\u0005\b\u0085\u0001\u0010o\"\u0005\b\u0086\u0001\u0010qR0\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0003\u001a\u00030\u0087\u00018\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u00107\u001a\u0005\b\u0089\u0001\u00109\"\u0005\b\u008a\u0001\u0010wR0\u0010\u008b\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0003\u001a\u00030\u0087\u00018\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u00107\u001a\u0005\b\u008c\u0001\u00109\"\u0005\b\u008d\u0001\u0010wR.\u0010\u008e\u0001\u001a\u00020k2\u0006\u0010\u0003\u001a\u00020k8\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010m\u001a\u0005\b\u008f\u0001\u0010o\"\u0005\b\u0090\u0001\u0010qR.\u0010\u0091\u0001\u001a\u00020k2\u0006\u0010\u0003\u001a\u00020k8\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010m\u001a\u0005\b\u0092\u0001\u0010o\"\u0005\b\u0093\u0001\u0010qR.\u0010\u0094\u0001\u001a\u00020k2\u0006\u0010\u0003\u001a\u00020k8\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010m\u001a\u0005\b\u0095\u0001\u0010o\"\u0005\b\u0096\u0001\u0010qR'\u0010\u0099\u0001\u001a\u00020k2\u0006\u0010\u0003\u001a\u00020k8W@WX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0097\u0001\u0010o\"\u0005\b\u0098\u0001\u0010qR'\u0010\u009c\u0001\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00168W@WX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u009a\u0001\u0010\u0018\"\u0005\b\u009b\u0001\u0010WR7\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u00012\t\u0010\u0003\u001a\u0005\u0018\u00010\u009d\u00018\u0017@WX\u0097\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R\u001d\u0010¤\u0001\u001a\u00020\u00168\u0017X\u0097\u0004¢\u0006\u000e\n\u0005\b¤\u0001\u0010T\u001a\u0005\b¥\u0001\u0010\u0018"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsViewLayer;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "p0", "", "p1", "Landroidx/compose/ui/graphics/CanvasHolder;", "p2", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "p3", "<init>", "(Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "", "applyCompositingLayer-Wpw9cng", "(I)V", "applyCompositingLayer", "updateLayerProperties", "()V", "Landroid/graphics/Paint;", "obtainLayerPaint", "()Landroid/graphics/Paint;", "", "requiresCompositingLayer", "()Z", "requiresLayerPaint", "", "Landroidx/compose/ui/unit/IntSize;", "setPosition-H0pRuoY", "(IIJ)V", "setPosition", "Landroid/graphics/Outline;", "setOutline-O0kMr_c", "(Landroid/graphics/Outline;J)V", "setOutline", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "record", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "recordDrawingOperations", "Landroidx/compose/ui/graphics/Canvas;", "draw", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroid/graphics/Matrix;", "calculateMatrix", "()Landroid/graphics/Matrix;", "updateClipBounds", "discardDisplayList", "layerContainer", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "ownerId", "J", "getOwnerId", "()J", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "getCanvasHolder", "()Landroidx/compose/ui/graphics/CanvasHolder;", "Landroidx/compose/ui/graphics/layer/ViewLayer;", "viewLayer", "Landroidx/compose/ui/graphics/layer/ViewLayer;", "Landroid/content/res/Resources;", "resources", "Landroid/content/res/Resources;", "Landroid/graphics/Rect;", "clipRect", "Landroid/graphics/Rect;", "layerPaint", "Landroid/graphics/Paint;", "Landroid/graphics/Picture;", "picture", "Landroid/graphics/Picture;", "pictureDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "pictureCanvasHolder", "x", "I", "y", "size", "clipBoundsInvalidated", "Z", "isInvalidated", "setInvalidated", "(Z)V", "outlineIsProvided", "clipToBounds", "layerId", "getLayerId", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "compositingStrategy", "getCompositingStrategy-ke2Ky5w", "setCompositingStrategy-Wpw9cng", "", "alpha", "F", "getAlpha", "()F", "setAlpha", "(F)V", "shouldManuallySetCenterPivot", "Landroidx/compose/ui/geometry/Offset;", "pivotOffset", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "(J)V", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "shadowElevation", "getShadowElevation", "setShadowElevation", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "setAmbientShadowColor-8_81llA", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "getCameraDistance", "setCameraDistance", "cameraDistance", "getClip", "setClip", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "supportsSoftwareRendering", "getSupportsSoftwareRendering", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GraphicsViewLayer implements GraphicsLayerImpl {
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private final CanvasHolder canvasHolder;
    private boolean clipBoundsInvalidated;
    private final Rect clipRect;
    private boolean clipToBounds;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private boolean isInvalidated;
    private final DrawChildContainer layerContainer;
    private final long layerId;
    private Paint layerPaint;
    private boolean outlineIsProvided;
    private final long ownerId;
    private final Picture picture;
    private final CanvasHolder pictureCanvasHolder;
    private final CanvasDrawScope pictureDrawScope;
    private long pivotOffset;
    private RenderEffect renderEffect;
    private final Resources resources;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private boolean shouldManuallySetCenterPivot;
    private long size;
    private long spotShadowColor;
    private final boolean supportsSoftwareRendering;
    private float translationX;
    private float translationY;
    private final ViewLayer viewLayer;
    private int x;
    private int y;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean mayRenderInSoftware = !SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable();
    private static final Canvas PlaceholderCanvas = new Canvas() { // from class: androidx.compose.ui.graphics.layer.GraphicsViewLayer$Companion$PlaceholderCanvas$1
        @Override // android.graphics.Canvas
        public final boolean isHardwareAccelerated() {
            return true;
        }
    };

    public GraphicsViewLayer(DrawChildContainer drawChildContainer, long j, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.layerContainer = drawChildContainer;
        this.ownerId = j;
        this.canvasHolder = canvasHolder;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, canvasHolder, canvasDrawScope);
        this.viewLayer = viewLayer;
        this.resources = drawChildContainer.getResources();
        this.clipRect = new Rect();
        boolean z = mayRenderInSoftware;
        this.picture = z ? new Picture() : null;
        this.pictureDrawScope = z ? new CanvasDrawScope() : null;
        this.pictureCanvasHolder = z ? new CanvasHolder() : null;
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.size = IntSize.INSTANCE.m7111getZeroYbymL2g();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = BlendMode.INSTANCE.m4159getSrcOver0nO6VwU();
        this.compositingStrategy = CompositingStrategy.INSTANCE.m4878getAutoke2Ky5w();
        this.alpha = 1.0f;
        this.pivotOffset = Offset.INSTANCE.m3990getZeroF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.ambientShadowColor = Color.INSTANCE.m4244getBlack0d7_KjU();
        this.spotShadowColor = Color.INSTANCE.m4244getBlack0d7_KjU();
        this.supportsSoftwareRendering = z;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long getOwnerId() {
        return this.ownerId;
    }

    public /* synthetic */ GraphicsViewLayer(DrawChildContainer drawChildContainer, long j, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawChildContainer, j, (i & 4) != 0 ? new CanvasHolder() : canvasHolder, (i & 8) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }

    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: isInvalidated, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setInvalidated(boolean z) {
        this.isInvalidated = z;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long getLayerId() {
        return this.layerId;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    public final void mo4907setBlendModes9anfk8(int i) {
        this.blendMode = i;
        obtainLayerPaint().setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m4067toPorterDuffModes9anfk8(i)));
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        obtainLayerPaint().setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getCompositingStrategy-ke2Ky5w, reason: from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setCompositingStrategy-Wpw9cng */
    public final void mo4908setCompositingStrategyWpw9cng(int i) {
        this.compositingStrategy = i;
        updateLayerProperties();
    }

    /* JADX INFO: renamed from: applyCompositingLayer-Wpw9cng, reason: not valid java name */
    private final void m4915applyCompositingLayerWpw9cng(int p0) {
        boolean z;
        ViewLayer viewLayer = this.viewLayer;
        if (CompositingStrategy.m4874equalsimpl0(p0, CompositingStrategy.INSTANCE.m4880getOffscreenke2Ky5w())) {
            this.viewLayer.setLayerType(2, this.layerPaint);
        } else {
            z = false;
            if (CompositingStrategy.m4874equalsimpl0(p0, CompositingStrategy.INSTANCE.m4879getModulateAlphake2Ky5w())) {
                this.viewLayer.setLayerType(0, this.layerPaint);
            } else {
                this.viewLayer.setLayerType(0, this.layerPaint);
            }
            viewLayer.setCanUseCompositingLayer$ui_graphics_release(z);
        }
        z = true;
        viewLayer.setCanUseCompositingLayer$ui_graphics_release(z);
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m4915applyCompositingLayerWpw9cng(CompositingStrategy.INSTANCE.m4880getOffscreenke2Ky5w());
        } else {
            m4915applyCompositingLayerWpw9cng(getCompositingStrategy());
        }
    }

    private final Paint obtainLayerPaint() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.layerPaint = paint2;
        return paint2;
    }

    private final boolean requiresCompositingLayer() {
        return CompositingStrategy.m4874equalsimpl0(getCompositingStrategy(), CompositingStrategy.INSTANCE.m4880getOffscreenke2Ky5w()) || requiresLayerPaint();
    }

    private final boolean requiresLayerPaint() {
        return (BlendMode.m4128equalsimpl0(getBlendMode(), BlendMode.INSTANCE.m4159getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setAlpha(float f) {
        this.alpha = f;
        this.viewLayer.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getPivotOffset-F1C5BW0, reason: from getter */
    public final long getPivotOffset() {
        return this.pivotOffset;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setPivotOffset-k-4lQ0M */
    public final void mo4910setPivotOffsetk4lQ0M(long j) {
        this.pivotOffset = j;
        if ((9223372034707292159L & j) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            if (Build.VERSION.SDK_INT >= 28) {
                ViewLayerVerificationHelper28.INSTANCE.resetPivot(this.viewLayer);
                return;
            }
            this.shouldManuallySetCenterPivot = true;
            this.viewLayer.setPivotX(((int) (this.size >> 32)) / 2.0f);
            this.viewLayer.setPivotY(((int) (4294967295L & this.size)) / 2.0f);
            return;
        }
        this.shouldManuallySetCenterPivot = false;
        this.viewLayer.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
        this.viewLayer.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setScaleX(float f) {
        this.scaleX = f;
        this.viewLayer.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setScaleY(float f) {
        this.scaleY = f;
        this.viewLayer.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setTranslationX(float f) {
        this.translationX = f;
        this.viewLayer.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setTranslationY(float f) {
        this.translationY = f;
        this.viewLayer.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setShadowElevation(float f) {
        this.shadowElevation = f;
        this.viewLayer.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: from getter */
    public final long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA */
    public final void mo4906setAmbientShadowColor8_81llA(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j;
            ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this.viewLayer, ColorKt.m4272toArgb8_81llA(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: from getter */
    public final long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA */
    public final void mo4912setSpotShadowColor8_81llA(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j;
            ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this.viewLayer, ColorKt.m4272toArgb8_81llA(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setRotationX(float f) {
        this.rotationX = f;
        this.viewLayer.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setRotationY(float f) {
        this.rotationY = f;
        this.viewLayer.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setRotationZ(float f) {
        this.rotationZ = f;
        this.viewLayer.setRotation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float getCameraDistance() {
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setCameraDistance(float f) {
        this.viewLayer.setCameraDistance(f * this.resources.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean getClip() {
        return this.clipToBounds || this.viewLayer.getClipToOutline();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setClip(boolean z) {
        this.clipToBounds = z && !this.outlineIsProvided;
        this.clipBoundsInvalidated = true;
        this.viewLayer.setClipToOutline(z && this.outlineIsProvided);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this.viewLayer, renderEffect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setPosition-H0pRuoY */
    public final void mo4911setPositionH0pRuoY(int p0, int p1, long p2) {
        if (!IntSize.m7104equalsimpl0(this.size, p2)) {
            if (getClip()) {
                this.clipBoundsInvalidated = true;
            }
            int i = (int) (p2 >> 32);
            int i2 = (int) (4294967295L & p2);
            this.viewLayer.layout(p0, p1, p0 + i, p1 + i2);
            this.size = p2;
            if (this.shouldManuallySetCenterPivot) {
                this.viewLayer.setPivotX(i / 2.0f);
                this.viewLayer.setPivotY(i2 / 2.0f);
            }
        } else {
            int i3 = this.x;
            if (i3 != p0) {
                this.viewLayer.offsetLeftAndRight(p0 - i3);
            }
            int i4 = this.y;
            if (i4 != p1) {
                this.viewLayer.offsetTopAndBottom(p1 - i4);
            }
        }
        this.x = p0;
        this.y = p1;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setOutline-O0kMr_c */
    public final void mo4909setOutlineO0kMr_c(Outline p0, long p1) {
        boolean layerOutline = this.viewLayer.setLayerOutline(p0);
        if (getClip() && p0 != null) {
            this.viewLayer.setClipToOutline(true);
            if (this.clipToBounds) {
                this.clipToBounds = false;
                this.clipBoundsInvalidated = true;
            }
        }
        this.outlineIsProvided = p0 != null;
        if (layerOutline) {
            return;
        }
        this.viewLayer.invalidate();
        recordDrawingOperations();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void record(Density p0, LayoutDirection p1, GraphicsLayer p2, Function1<? super DrawScope, Unit> p3) {
        if (this.viewLayer.getParent() == null) {
            this.layerContainer.addView(this.viewLayer);
        }
        this.viewLayer.setDrawParams(p0, p1, p2, p3);
        if (this.viewLayer.isAttachedToWindow()) {
            this.viewLayer.setVisibility(4);
            this.viewLayer.setVisibility(0);
            recordDrawingOperations();
            Picture picture = this.picture;
            if (picture != null) {
                long j = this.size;
                Canvas canvasBeginRecording = picture.beginRecording((int) (j >> 32), (int) (j & 4294967295L));
                try {
                    CanvasHolder canvasHolder = this.pictureCanvasHolder;
                    if (canvasHolder != null) {
                        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
                        canvasHolder.getAndroidCanvas().setInternalCanvas(canvasBeginRecording);
                        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
                        CanvasDrawScope canvasDrawScope = this.pictureDrawScope;
                        if (canvasDrawScope != null) {
                            CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
                            long jM7118toSizeozmzZPI = IntSizeKt.m7118toSizeozmzZPI(this.size);
                            Density density = canvasDrawScope2.getDrawContext().getDensity();
                            LayoutDirection layoutDirection = canvasDrawScope2.getDrawContext().getLayoutDirection();
                            androidx.compose.ui.graphics.Canvas canvas = canvasDrawScope2.getDrawContext().getCanvas();
                            long jMo4719getSizeNHjbRc = canvasDrawScope2.getDrawContext().mo4719getSizeNHjbRc();
                            GraphicsLayer graphicsLayer = canvasDrawScope2.getDrawContext().getGraphicsLayer();
                            DrawContext drawContext = canvasDrawScope2.getDrawContext();
                            drawContext.setDensity(p0);
                            drawContext.setLayoutDirection(p1);
                            drawContext.setCanvas(androidCanvas);
                            drawContext.mo4720setSizeuvyYCjk(jM7118toSizeozmzZPI);
                            drawContext.setGraphicsLayer(p2);
                            androidCanvas.save();
                            try {
                                p3.invoke(canvasDrawScope2);
                                androidCanvas.restore();
                                DrawContext drawContext2 = canvasDrawScope2.getDrawContext();
                                drawContext2.setDensity(density);
                                drawContext2.setLayoutDirection(layoutDirection);
                                drawContext2.setCanvas(canvas);
                                drawContext2.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
                                drawContext2.setGraphicsLayer(graphicsLayer);
                            } catch (Throwable th) {
                                androidCanvas.restore();
                                DrawContext drawContext3 = canvasDrawScope2.getDrawContext();
                                drawContext3.setDensity(density);
                                drawContext3.setLayoutDirection(layoutDirection);
                                drawContext3.setCanvas(canvas);
                                drawContext3.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
                                drawContext3.setGraphicsLayer(graphicsLayer);
                                throw th;
                            }
                        }
                        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
                        Unit unit = Unit.INSTANCE;
                    }
                    picture.endRecording();
                } catch (Throwable th2) {
                    picture.endRecording();
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean getSupportsSoftwareRendering() {
        return this.supportsSoftwareRendering;
    }

    private final void recordDrawingOperations() {
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            Canvas canvas = PlaceholderCanvas;
            Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.drawChild$ui_graphics_release(androidCanvas, viewLayer, viewLayer.getDrawingTime());
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        } catch (ClassCastException unused) {
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void draw(androidx.compose.ui.graphics.Canvas p0) {
        updateClipBounds();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(p0);
        if (nativeCanvas.isHardwareAccelerated()) {
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.drawChild$ui_graphics_release(p0, viewLayer, viewLayer.getDrawingTime());
        } else {
            Picture picture = this.picture;
            if (picture != null) {
                nativeCanvas.drawPicture(picture);
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final Matrix calculateMatrix() {
        return this.viewLayer.getMatrix();
    }

    private final void updateClipBounds() {
        Rect rect;
        if (this.clipBoundsInvalidated) {
            ViewLayer viewLayer = this.viewLayer;
            if (!getClip() || this.outlineIsProvided) {
                rect = null;
            } else {
                rect = this.clipRect;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.viewLayer.getWidth();
                rect.bottom = this.viewLayer.getHeight();
            }
            viewLayer.setClipBounds(rect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void discardDisplayList() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsViewLayer$Companion;", "", "<init>", "()V", "", "mayRenderInSoftware", "Z", "getMayRenderInSoftware", "()Z", "Landroid/graphics/Canvas;", "PlaceholderCanvas", "Landroid/graphics/Canvas;", "getPlaceholderCanvas", "()Landroid/graphics/Canvas;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean getMayRenderInSoftware() {
            return GraphicsViewLayer.mayRenderInSoftware;
        }

        public final Canvas getPlaceholderCanvas() {
            return GraphicsViewLayer.PlaceholderCanvas;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
