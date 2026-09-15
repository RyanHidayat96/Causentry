package androidx.compose.ui.node;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u000eJ!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\bH&¢\u0006\u0004\b \u0010!JC\u0010%\u001a\u00020\u00042$\u0010\u0003\u001a \u0012\t\u0012\u00070\u0013¢\u0006\u0002\b#\u0012\u000b\u0012\t\u0018\u00010\u0014¢\u0006\u0002\b#\u0012\u0004\u0012\u00020\u00040\"2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040$H&¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020'H&¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020'H&¢\u0006\u0004\b+\u0010)R\u0014\u0010/\u001a\u00020'8'X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001c\u00105\u001a\u0002008'@'X¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00106\u001a\u00020\b8'@'X¦\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/OwnedLayer;", "", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "p0", "", "updateLayerProperties", "(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;)V", "Landroidx/compose/ui/geometry/Offset;", "", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "move", "Landroidx/compose/ui/unit/IntSize;", "resize-ozmzZPI", "resize", "Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "p1", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "updateDisplayList", "()V", "invalidate", "destroy", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "mapBounds", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Lkotlin/Function0;", "reuseLayer", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "", "getFrameRate", "()F", "setFrameRate", "(F)V", "frameRate", "isFrameRateFromParent", "()Z", "setFrameRateFromParent", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OwnedLayer {
    void destroy();

    void drawLayer(Canvas p0, GraphicsLayer p1);

    float getFrameRate();

    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    float[] mo5981getUnderlyingMatrixsQKQjiQ();

    void invalidate();

    /* JADX INFO: renamed from: inverseTransform-58bKbWc, reason: not valid java name */
    void mo5982inverseTransform58bKbWc(float[] p0);

    /* JADX INFO: renamed from: isFrameRateFromParent */
    boolean getIsFrameRateFromParent();

    /* JADX INFO: renamed from: isInLayer-k-4lQ0M, reason: not valid java name */
    boolean mo5983isInLayerk4lQ0M(long p0);

    void mapBounds(MutableRect p0, boolean p1);

    /* JADX INFO: renamed from: mapOffset-8S9VItk, reason: not valid java name */
    long mo5984mapOffset8S9VItk(long p0, boolean p1);

    /* JADX INFO: renamed from: move--gyyYBs, reason: not valid java name */
    void mo5985movegyyYBs(long p0);

    /* JADX INFO: renamed from: resize-ozmzZPI, reason: not valid java name */
    void mo5986resizeozmzZPI(long p0);

    void reuseLayer(Function2<? super Canvas, ? super GraphicsLayer, Unit> p0, Function0<Unit> p1);

    void setFrameRate(float f);

    void setFrameRateFromParent(boolean z);

    /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
    void mo5987transform58bKbWc(float[] p0);

    void updateDisplayList();

    void updateLayerProperties(ReusableGraphicsLayerScope p0);
}
