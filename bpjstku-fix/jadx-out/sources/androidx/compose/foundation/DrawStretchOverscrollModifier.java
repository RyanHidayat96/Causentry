package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000e2\n\u0010\u0006\u001a\u00060\u000fj\u0002`\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000e2\n\u0010\u0006\u001a\u00060\u000fj\u0002`\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J#\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000e2\n\u0010\u0006\u001a\u00060\u000fj\u0002`\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J#\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000e2\n\u0010\u0006\u001a\u00060\u000fj\u0002`\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J+\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u000e2\n\u0010\u000b\u001a\u00060\u000fj\u0002`\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0013\u0010\u001e\u001a\u00020\t*\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020 8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010("}, d2 = {"Landroidx/compose/foundation/DrawStretchOverscrollModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "p0", "Landroidx/compose/foundation/EdgeEffectWrapper;", "p1", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "p2", "<init>", "(Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;Landroidx/compose/foundation/EdgeEffectWrapper;Lkotlin/jvm/functions/Function1;)V", "Landroid/widget/EdgeEffect;", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "drawBottomStretch", "(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "drawLeftStretch", "drawRightStretch", "drawTopStretch", "", "drawWithRotation", "(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "shouldDrawHorizontalStretch", "()Z", "shouldDrawVerticalStretch", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroid/graphics/RenderNode;", "_renderNode", "Landroid/graphics/RenderNode;", "edgeEffectWrapper", "Landroidx/compose/foundation/EdgeEffectWrapper;", "overscrollEffect", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "getRenderNode", "()Landroid/graphics/RenderNode;", "renderNode"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DrawStretchOverscrollModifier extends InspectorValueInfo implements DrawModifier {
    private RenderNode _renderNode;
    private final EdgeEffectWrapper edgeEffectWrapper;
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    public DrawStretchOverscrollModifier(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper, Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.edgeEffectWrapper = edgeEffectWrapper;
    }

    private final RenderNode getRenderNode() {
        RenderNode renderNode = this._renderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this._renderNode = renderNode2;
        return renderNode2;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public final void draw(ContentDrawScope contentDrawScope) {
        boolean zDrawLeftStretch;
        this.overscrollEffect.m541updateSizeuvyYCjk$foundation_release(contentDrawScope.mo4798getSizeNHjbRc());
        if (Size.m4045isEmptyimpl(contentDrawScope.mo4798getSizeNHjbRc())) {
            contentDrawScope.drawContent();
            return;
        }
        this.overscrollEffect.getRedrawSignal$foundation_release().getValue();
        float f = contentDrawScope.mo694toPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        boolean zShouldDrawVerticalStretch = shouldDrawVerticalStretch();
        boolean zShouldDrawHorizontalStretch = shouldDrawHorizontalStretch();
        if (zShouldDrawVerticalStretch && zShouldDrawHorizontalStretch) {
            getRenderNode().setPosition(0, 0, nativeCanvas.getWidth(), nativeCanvas.getHeight());
        } else if (zShouldDrawVerticalStretch) {
            getRenderNode().setPosition(0, 0, nativeCanvas.getWidth() + (MathKt.roundToInt(f) * 2), nativeCanvas.getHeight());
        } else if (zShouldDrawHorizontalStretch) {
            getRenderNode().setPosition(0, 0, nativeCanvas.getWidth(), nativeCanvas.getHeight() + (MathKt.roundToInt(f) * 2));
        } else {
            contentDrawScope.drawContent();
            return;
        }
        RecordingCanvas recordingCanvasBeginRecording = getRenderNode().beginRecording();
        if (edgeEffectWrapper.isLeftNegationStretched()) {
            EdgeEffect orCreateLeftEffectNegation = edgeEffectWrapper.getOrCreateLeftEffectNegation();
            drawRightStretch(orCreateLeftEffectNegation, recordingCanvasBeginRecording);
            orCreateLeftEffectNegation.finish();
        }
        if (edgeEffectWrapper.isLeftAnimating()) {
            EdgeEffect orCreateLeftEffect = edgeEffectWrapper.getOrCreateLeftEffect();
            zDrawLeftStretch = drawLeftStretch(orCreateLeftEffect, recordingCanvasBeginRecording);
            if (edgeEffectWrapper.isLeftStretched()) {
                EdgeEffectCompat.INSTANCE.onPullDistanceCompat(edgeEffectWrapper.getOrCreateLeftEffectNegation(), EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateLeftEffect), 1.0f - Offset.m3975getYimpl(this.overscrollEffect.m540displacementF1C5BW0$foundation_release()));
            }
        } else {
            zDrawLeftStretch = false;
        }
        if (edgeEffectWrapper.isTopNegationStretched()) {
            EdgeEffect orCreateTopEffectNegation = edgeEffectWrapper.getOrCreateTopEffectNegation();
            drawBottomStretch(orCreateTopEffectNegation, recordingCanvasBeginRecording);
            orCreateTopEffectNegation.finish();
        }
        if (edgeEffectWrapper.isTopAnimating()) {
            EdgeEffect orCreateTopEffect = edgeEffectWrapper.getOrCreateTopEffect();
            zDrawLeftStretch = drawTopStretch(orCreateTopEffect, recordingCanvasBeginRecording) || zDrawLeftStretch;
            if (edgeEffectWrapper.isTopStretched()) {
                EdgeEffectCompat.INSTANCE.onPullDistanceCompat(edgeEffectWrapper.getOrCreateTopEffectNegation(), EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateTopEffect), Offset.m3974getXimpl(this.overscrollEffect.m540displacementF1C5BW0$foundation_release()));
            }
        }
        if (edgeEffectWrapper.isRightNegationStretched()) {
            EdgeEffect orCreateRightEffectNegation = edgeEffectWrapper.getOrCreateRightEffectNegation();
            drawLeftStretch(orCreateRightEffectNegation, recordingCanvasBeginRecording);
            orCreateRightEffectNegation.finish();
        }
        if (edgeEffectWrapper.isRightAnimating()) {
            EdgeEffect orCreateRightEffect = edgeEffectWrapper.getOrCreateRightEffect();
            zDrawLeftStretch = drawRightStretch(orCreateRightEffect, recordingCanvasBeginRecording) || zDrawLeftStretch;
            if (edgeEffectWrapper.isRightStretched()) {
                EdgeEffectCompat.INSTANCE.onPullDistanceCompat(edgeEffectWrapper.getOrCreateRightEffectNegation(), EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateRightEffect), Offset.m3975getYimpl(this.overscrollEffect.m540displacementF1C5BW0$foundation_release()));
            }
        }
        if (edgeEffectWrapper.isBottomNegationStretched()) {
            EdgeEffect orCreateBottomEffectNegation = edgeEffectWrapper.getOrCreateBottomEffectNegation();
            drawTopStretch(orCreateBottomEffectNegation, recordingCanvasBeginRecording);
            orCreateBottomEffectNegation.finish();
        }
        if (edgeEffectWrapper.isBottomAnimating()) {
            EdgeEffect orCreateBottomEffect = edgeEffectWrapper.getOrCreateBottomEffect();
            boolean z = drawBottomStretch(orCreateBottomEffect, recordingCanvasBeginRecording) || zDrawLeftStretch;
            if (edgeEffectWrapper.isBottomStretched()) {
                EdgeEffectCompat.INSTANCE.onPullDistanceCompat(edgeEffectWrapper.getOrCreateBottomEffectNegation(), EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateBottomEffect), 1.0f - Offset.m3974getXimpl(this.overscrollEffect.m540displacementF1C5BW0$foundation_release()));
            }
            zDrawLeftStretch = z;
        }
        if (zDrawLeftStretch) {
            this.overscrollEffect.invalidateOverscroll$foundation_release();
        }
        float f2 = zShouldDrawHorizontalStretch ? 0.0f : f;
        if (zShouldDrawVerticalStretch) {
            f = 0.0f;
        }
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas Canvas = AndroidCanvas_androidKt.Canvas(recordingCanvasBeginRecording);
        long j = contentDrawScope.mo4798getSizeNHjbRc();
        Density density = contentDrawScope2.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = contentDrawScope2.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas = contentDrawScope2.getDrawContext().getCanvas();
        long jMo4719getSizeNHjbRc = contentDrawScope2.getDrawContext().mo4719getSizeNHjbRc();
        GraphicsLayer graphicsLayer = contentDrawScope2.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = contentDrawScope2.getDrawContext();
        drawContext.setDensity(contentDrawScope);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(Canvas);
        drawContext.mo4720setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(null);
        Canvas.save();
        try {
            contentDrawScope2.getDrawContext().getTransform().translate(f2, f);
            try {
                contentDrawScope.drawContent();
                float f3 = -f2;
                float f4 = -f;
                contentDrawScope2.getDrawContext().getTransform().translate(f3, f4);
                Canvas.restore();
                DrawContext drawContext2 = contentDrawScope2.getDrawContext();
                drawContext2.setDensity(density);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas);
                drawContext2.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer);
                getRenderNode().endRecording();
                int iSave = nativeCanvas.save();
                nativeCanvas.translate(f3, f4);
                nativeCanvas.drawRenderNode(getRenderNode());
                nativeCanvas.restoreToCount(iSave);
            } catch (Throwable th) {
                contentDrawScope2.getDrawContext().getTransform().translate(-f2, -f);
                throw th;
            }
        } catch (Throwable th2) {
            Canvas.restore();
            DrawContext drawContext3 = contentDrawScope2.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas);
            drawContext3.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer);
            throw th2;
        }
    }

    private final boolean shouldDrawVerticalStretch() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        return edgeEffectWrapper.isTopAnimating() || edgeEffectWrapper.isTopNegationStretched() || edgeEffectWrapper.isBottomAnimating() || edgeEffectWrapper.isBottomNegationStretched();
    }

    private final boolean shouldDrawHorizontalStretch() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        return edgeEffectWrapper.isLeftAnimating() || edgeEffectWrapper.isLeftNegationStretched() || edgeEffectWrapper.isRightAnimating() || edgeEffectWrapper.isRightNegationStretched();
    }

    private final boolean drawLeftStretch(EdgeEffect p0, Canvas p1) {
        return drawWithRotation(270.0f, p0, p1);
    }

    private final boolean drawTopStretch(EdgeEffect p0, Canvas p1) {
        return drawWithRotation(0.0f, p0, p1);
    }

    private final boolean drawRightStretch(EdgeEffect p0, Canvas p1) {
        return drawWithRotation(90.0f, p0, p1);
    }

    private final boolean drawBottomStretch(EdgeEffect p0, Canvas p1) {
        return drawWithRotation(180.0f, p0, p1);
    }

    private final boolean drawWithRotation(float p0, EdgeEffect p1, Canvas p2) {
        if (p0 == 0.0f) {
            return p1.draw(p2);
        }
        int iSave = p2.save();
        p2.rotate(p0);
        boolean zDraw = p1.draw(p2);
        p2.restoreToCount(iSave);
        return zDraw;
    }
}
