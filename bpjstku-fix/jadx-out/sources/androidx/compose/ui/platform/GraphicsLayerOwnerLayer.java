package androidx.compose.ui.platform;

import android.os.Build;
import androidx.compose.ui.FrameRateCategory;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012$\u0010\r\u001a \u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010\u001fJ!\u0010$\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010\u0016J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010\u0016J\u000f\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b(\u0010\u0016J\u001f\u0010+\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0019H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020,2\u0006\u0010\u0006\u001a\u00020\u0019H\u0016¢\u0006\u0004\b-\u0010.JC\u0010/\u001a\u00020\f2$\u0010\u0004\u001a \u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00104\u001a\u00020\f2\u0006\u0010\u0004\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\f2\u0006\u0010\u0004\u001a\u000201H\u0016¢\u0006\u0004\b5\u00103J\u000f\u00109\u001a\u000201H\u0002¢\u0006\u0004\b7\u00108J\u0011\u0010;\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b:\u00108J\u000f\u0010<\u001a\u00020\fH\u0002¢\u0006\u0004\b<\u0010\u0016R\u0016\u0010=\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010BR6\u0010C\u001a\"\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u0002018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010LR$\u0010N\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00198\u0002@CX\u0083\u000e¢\u0006\f\n\u0004\bN\u0010J\"\u0004\bO\u0010PR\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010^\u001a\u00020]8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010HR\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bb\u0010JR\u0016\u0010c\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010JR\u0016\u0010d\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bd\u0010JR\"\u0010f\u001a\u00020e8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010l\u001a\u00020\u00198\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bl\u0010J\u001a\u0004\bl\u0010m\"\u0004\bn\u0010PR\u0016\u0010o\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bo\u0010JR%\u0010s\u001a\u0013\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\f0p¢\u0006\u0002\br8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010x\u001a\u00020u8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0014\u0010z\u001a\u00020u8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010wR\u0014\u0010|\u001a\u0002018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u00108"}, d2 = {"Landroidx/compose/ui/platform/GraphicsLayerOwnerLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "p0", "Landroidx/compose/ui/graphics/GraphicsContext;", "p1", "Landroidx/compose/ui/platform/AndroidComposeView;", "p2", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", "", "p3", "Lkotlin/Function0;", "p4", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "updateLayerProperties", "(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;)V", "triggerRepaint", "()V", "updateOutline", "Landroidx/compose/ui/geometry/Offset;", "", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "move", "Landroidx/compose/ui/unit/IntSize;", "resize-ozmzZPI", "resize", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "updateDisplayList", "invalidate", "destroy", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "mapBounds", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "reuseLayer", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "getMatrix-sQKQjiQ", "()[F", "getMatrix", "getInverseMatrix-3i98HWw", "getInverseMatrix", "updateMatrix", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "context", "Landroidx/compose/ui/graphics/GraphicsContext;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "drawBlock", "Lkotlin/jvm/functions/Function2;", "invalidateParentLayer", "Lkotlin/jvm/functions/Function0;", "size", "J", "isDestroyed", "Z", "matrixCache", "[F", "inverseMatrixCache", "isDirty", "setDirty", "(Z)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "scope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "", "mutatedFields", "I", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Outline;", "isMatrixDirty", "isInverseMatrixDirty", "isIdentity", "", "frameRate", "F", "getFrameRate", "()F", "setFrameRate", "(F)V", "isFrameRateFromParent", "()Z", "setFrameRateFromParent", "drawnWithEnabledZ", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "recordLambda", "Lkotlin/jvm/functions/Function1;", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "getUnderlyingMatrix-sQKQjiQ", "underlyingMatrix"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GraphicsLayerOwnerLayer implements OwnedLayer, GraphicLayerInfo {
    public static final int $stable = 8;
    private final GraphicsContext context;
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock;
    private boolean drawnWithEnabledZ;
    private float frameRate;
    private GraphicsLayer graphicsLayer;
    private Function0<Unit> invalidateParentLayer;
    private float[] inverseMatrixCache;
    private boolean isDestroyed;
    private boolean isDirty;
    private boolean isFrameRateFromParent;
    private boolean isInverseMatrixDirty;
    private boolean isMatrixDirty;
    private int mutatedFields;
    private Outline outline;
    private final AndroidComposeView ownerView;
    private long size = IntSize.m7101constructorimpl(9223372034707292159L);
    private final float[] matrixCache = Matrix.m4461constructorimpl$default(null, 1, null);
    private Density density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final CanvasDrawScope scope = new CanvasDrawScope();
    private long transformOrigin = TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ();
    private boolean isIdentity = true;
    private final Function1<DrawScope, Unit> recordLambda = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.this$0;
            Canvas canvas = drawScope.getDrawContext().getCanvas();
            Function2 function2 = graphicsLayerOwnerLayer.drawBlock;
            if (function2 != null) {
                function2.invoke(canvas, drawScope.getDrawContext().getGraphicsLayer());
            }
        }

        {
            super(1);
        }
    };

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, GraphicsContext graphicsContext, AndroidComposeView androidComposeView, Function2<? super Canvas, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0) {
        this.graphicsLayer = graphicsLayer;
        this.context = graphicsContext;
        this.ownerView = androidComposeView;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
    }

    private final void setDirty(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final float getFrameRate() {
        return this.frameRate;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void setFrameRate(float f) {
        this.frameRate = f;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: isFrameRateFromParent, reason: from getter */
    public final boolean getIsFrameRateFromParent() {
        return this.isFrameRateFromParent;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void setFrameRateFromParent(boolean z) {
        this.isFrameRateFromParent = z;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void updateLayerProperties(ReusableGraphicsLayerScope p0) {
        int iM4879getModulateAlphake2Ky5w;
        Function0<Unit> function0;
        int mutatedFields = p0.getMutatedFields() | this.mutatedFields;
        this.layoutDirection = p0.getLayoutDirection();
        this.density = p0.getGraphicsDensity();
        int i = mutatedFields & 4096;
        if (i != 0) {
            this.transformOrigin = p0.getTransformOrigin();
        }
        if ((mutatedFields & 1) != 0) {
            this.graphicsLayer.setScaleX(p0.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.graphicsLayer.setScaleY(p0.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.graphicsLayer.setAlpha(p0.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.graphicsLayer.setTranslationX(p0.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.graphicsLayer.setTranslationY(p0.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.graphicsLayer.setShadowElevation(p0.getShadowElevation());
            if (p0.getShadowElevation() > 0.0f && !this.drawnWithEnabledZ && (function0 = this.invalidateParentLayer) != null) {
                function0.invoke();
            }
        }
        if ((mutatedFields & 64) != 0) {
            this.graphicsLayer.m4893setAmbientShadowColor8_81llA(p0.getAmbientShadowColor());
        }
        if ((mutatedFields & 128) != 0) {
            this.graphicsLayer.m4899setSpotShadowColor8_81llA(p0.getSpotShadowColor());
        }
        if ((mutatedFields & 1024) != 0) {
            this.graphicsLayer.setRotationZ(p0.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.graphicsLayer.setRotationX(p0.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.graphicsLayer.setRotationY(p0.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.graphicsLayer.setCameraDistance(p0.getCameraDistance());
        }
        if (i != 0) {
            if (TransformOrigin.m4621equalsimpl0(this.transformOrigin, TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ())) {
                this.graphicsLayer.m4896setPivotOffsetk4lQ0M(Offset.INSTANCE.m3989getUnspecifiedF1C5BW0());
            } else {
                this.graphicsLayer.m4896setPivotOffsetk4lQ0M(Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(TransformOrigin.m4622getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32)))) << 32) | (((long) Float.floatToRawIntBits(TransformOrigin.m4623getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & 4294967295L)))) & 4294967295L)));
            }
        }
        if ((mutatedFields & 16384) != 0) {
            this.graphicsLayer.setClip(p0.getClip());
        }
        if ((131072 & mutatedFields) != 0) {
            this.graphicsLayer.setRenderEffect(p0.getRenderEffect());
        }
        if ((262144 & mutatedFields) != 0) {
            this.graphicsLayer.setColorFilter(p0.getColorFilter());
        }
        if ((524288 & mutatedFields) != 0) {
            this.graphicsLayer.m4894setBlendModes9anfk8(p0.getBlendMode());
        }
        if ((32768 & mutatedFields) != 0) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            int compositingStrategy = p0.getCompositingStrategy();
            if (CompositingStrategy.m4305equalsimpl0(compositingStrategy, CompositingStrategy.INSTANCE.m4309getAutoNrFUSI())) {
                iM4879getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m4878getAutoke2Ky5w();
            } else if (CompositingStrategy.m4305equalsimpl0(compositingStrategy, CompositingStrategy.INSTANCE.m4311getOffscreenNrFUSI())) {
                iM4879getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m4880getOffscreenke2Ky5w();
            } else {
                if (!CompositingStrategy.m4305equalsimpl0(compositingStrategy, CompositingStrategy.INSTANCE.m4310getModulateAlphaNrFUSI())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iM4879getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m4879getModulateAlphake2Ky5w();
            }
            graphicsLayer.m4895setCompositingStrategyWpw9cng(iM4879getModulateAlphake2Ky5w);
        }
        boolean z = true;
        if ((mutatedFields & Fields.MatrixAffectingFields) != 0) {
            this.isMatrixDirty = true;
            this.isInverseMatrixDirty = true;
        }
        if (Intrinsics.areEqual(this.outline, p0.getOutline())) {
            z = false;
        } else {
            this.outline = p0.getOutline();
            updateOutline();
        }
        this.mutatedFields = p0.getMutatedFields();
        if (mutatedFields != 0 || z) {
            triggerRepaint();
            if (this.ownerView.getIsArrEnabled()) {
                this.ownerView.voteFrameRate(getFrameRate());
            }
        }
    }

    private final void triggerRepaint() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    private final void updateOutline() {
        Function0<Unit> function0;
        Outline outline = this.outline;
        if (outline != null) {
            GraphicsLayerKt.setOutline(this.graphicsLayer, outline);
            if (!(outline instanceof Outline.Generic) || Build.VERSION.SDK_INT >= 33 || (function0 = this.invalidateParentLayer) == null) {
                return;
            }
            function0.invoke();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: move--gyyYBs */
    public final void mo5985movegyyYBs(long p0) {
        if (this.ownerView.getIsArrEnabled()) {
            this.ownerView.voteFrameRate(FrameRateCategory.INSTANCE.m3706getHighNSsRyOo());
        }
        this.graphicsLayer.m4900setTopLeftgyyYBs(p0);
        triggerRepaint();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public final void mo5986resizeozmzZPI(long p0) {
        if (IntSize.m7104equalsimpl0(p0, this.size)) {
            return;
        }
        if (this.ownerView.getIsArrEnabled()) {
            this.ownerView.voteFrameRate(FrameRateCategory.INSTANCE.m3706getHighNSsRyOo());
        }
        this.size = p0;
        invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void drawLayer(Canvas p0, GraphicsLayer p1) {
        updateDisplayList();
        this.drawnWithEnabledZ = this.graphicsLayer.getShadowElevation() > 0.0f;
        DrawContext drawContext = this.scope.getDrawContext();
        drawContext.setCanvas(p0);
        drawContext.setGraphicsLayer(p1);
        GraphicsLayerKt.drawLayer(this.scope, this.graphicsLayer);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void updateDisplayList() {
        if (this.ownerView.getIsArrEnabled() && getFrameRate() != 0.0f) {
            this.ownerView.voteFrameRate(getFrameRate());
        }
        if (this.isDirty) {
            if (!TransformOrigin.m4621equalsimpl0(this.transformOrigin, TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ()) && !IntSize.m7104equalsimpl0(this.graphicsLayer.getSize(), this.size)) {
                this.graphicsLayer.m4896setPivotOffsetk4lQ0M(Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(TransformOrigin.m4622getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32)))) << 32) | (((long) Float.floatToRawIntBits(TransformOrigin.m4623getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & 4294967295L)))) & 4294967295L)));
            }
            this.graphicsLayer.m4892recordmLhObY(this.density, this.layoutDirection, this.size, this.recordLambda);
            setDirty(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void destroy() {
        setFrameRate(0.0f);
        setFrameRateFromParent(false);
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext != null) {
            graphicsContext.releaseGraphicsLayer(this.graphicsLayer);
            this.ownerView.recycle$ui_release(this);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public final long mo5984mapOffset8S9VItk(long p0, boolean p1) {
        float[] fArrM6083getMatrixsQKQjiQ;
        if (p1) {
            fArrM6083getMatrixsQKQjiQ = m6082getInverseMatrix3i98HWw();
            if (fArrM6083getMatrixsQKQjiQ == null) {
                return Offset.INSTANCE.m3988getInfiniteF1C5BW0();
            }
        } else {
            fArrM6083getMatrixsQKQjiQ = m6083getMatrixsQKQjiQ();
        }
        return this.isIdentity ? p0 : Matrix.m4467mapMKHz9U(fArrM6083getMatrixsQKQjiQ, p0);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void mapBounds(MutableRect p0, boolean p1) {
        float[] fArrM6082getInverseMatrix3i98HWw = p1 ? m6082getInverseMatrix3i98HWw() : m6083getMatrixsQKQjiQ();
        if (this.isIdentity) {
            return;
        }
        if (fArrM6082getInverseMatrix3i98HWw == null) {
            p0.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            Matrix.m4469mapimpl(fArrM6082getInverseMatrix3i98HWw, p0);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void reuseLayer(Function2<? super Canvas, ? super GraphicsLayer, Unit> p0, Function0<Unit> p1) {
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext != null) {
            if (!this.graphicsLayer.getIsReleased()) {
                InlineClassHelperKt.throwIllegalArgumentException("layer should have been released before reuse");
            }
            this.graphicsLayer = graphicsContext.createGraphicsLayer();
            this.isDestroyed = false;
            this.drawBlock = p0;
            this.invalidateParentLayer = p1;
            this.isMatrixDirty = false;
            this.isInverseMatrixDirty = false;
            this.isIdentity = true;
            Matrix.m4470resetimpl(this.matrixCache);
            float[] fArr = this.inverseMatrixCache;
            if (fArr != null) {
                Matrix.m4470resetimpl(fArr);
            }
            this.transformOrigin = TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ();
            this.drawnWithEnabledZ = false;
            this.size = IntSize.m7101constructorimpl(9223372034707292159L);
            this.outline = null;
            this.mutatedFields = 0;
            return;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("currently reuse is only supported when we manage the layer lifecycle");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: transform-58bKbWc */
    public final void mo5987transform58bKbWc(float[] p0) {
        Matrix.m4480timesAssign58bKbWc(p0, m6083getMatrixsQKQjiQ());
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    public final void mo5982inverseTransform58bKbWc(float[] p0) {
        float[] fArrM6082getInverseMatrix3i98HWw = m6082getInverseMatrix3i98HWw();
        if (fArrM6082getInverseMatrix3i98HWw != null) {
            Matrix.m4480timesAssign58bKbWc(p0, fArrM6082getInverseMatrix3i98HWw);
        }
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public final long getLayerId() {
        return this.graphicsLayer.getLayerId();
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public final long getOwnerViewId() {
        return this.graphicsLayer.getOwnerViewId();
    }

    /* JADX INFO: renamed from: getMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m6083getMatrixsQKQjiQ() {
        updateMatrix();
        return this.matrixCache;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo5981getUnderlyingMatrixsQKQjiQ() {
        return m6083getMatrixsQKQjiQ();
    }

    /* JADX INFO: renamed from: getInverseMatrix-3i98HWw, reason: not valid java name */
    private final float[] m6082getInverseMatrix3i98HWw() {
        float[] fArrM4461constructorimpl$default = this.inverseMatrixCache;
        if (fArrM4461constructorimpl$default == null) {
            fArrM4461constructorimpl$default = Matrix.m4461constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArrM4461constructorimpl$default;
        }
        if (!this.isInverseMatrixDirty) {
            if (Float.isNaN(fArrM4461constructorimpl$default[0])) {
                return null;
            }
        } else {
            this.isInverseMatrixDirty = false;
            float[] fArrM6083getMatrixsQKQjiQ = m6083getMatrixsQKQjiQ();
            if (this.isIdentity) {
                return fArrM6083getMatrixsQKQjiQ;
            }
            if (!InvertMatrixKt.m6084invertToJiSxe2E(fArrM6083getMatrixsQKQjiQ, fArrM4461constructorimpl$default)) {
                fArrM4461constructorimpl$default[0] = Float.NaN;
                return null;
            }
        }
        return fArrM4461constructorimpl$default;
    }

    private final void updateMatrix() {
        long pivotOffset;
        if (this.isMatrixDirty) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            if ((graphicsLayer.getPivotOffset() & 9223372034707292159L) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                pivotOffset = SizeKt.m4053getCenteruvyYCjk(IntSizeKt.m7118toSizeozmzZPI(this.size));
            } else {
                pivotOffset = graphicsLayer.getPivotOffset();
            }
            Matrix.m4471resetToPivotedTransformimpl(this.matrixCache, Float.intBitsToFloat((int) (pivotOffset >> 32)), Float.intBitsToFloat((int) (pivotOffset & 4294967295L)), graphicsLayer.getTranslationX(), graphicsLayer.getTranslationY(), 1.0f, graphicsLayer.getRotationX(), graphicsLayer.getRotationY(), graphicsLayer.getRotationZ(), graphicsLayer.getScaleX(), graphicsLayer.getScaleY(), 1.0f);
            this.isMatrixDirty = false;
            this.isIdentity = MatrixKt.m4486isIdentity58bKbWc(this.matrixCache);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public final boolean mo5983isInLayerk4lQ0M(long p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (p0 & 4294967295L));
        if (this.graphicsLayer.getClip()) {
            return ShapeContainingUtilKt.isInOutline$default(this.graphicsLayer.getOutline(), fIntBitsToFloat, fIntBitsToFloat2, null, null, 24, null);
        }
        return true;
    }
}
