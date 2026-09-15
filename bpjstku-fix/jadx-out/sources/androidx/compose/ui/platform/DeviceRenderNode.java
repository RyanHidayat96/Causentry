package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u000fJ5\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00122\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H'¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H&¢\u0006\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8'X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010/\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u00101\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010*R\u0014\u00103\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010*R\u0014\u00105\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010*R\u001c\u0010;\u001a\u0002068'@'X¦\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010>\u001a\u0002068'@'X¦\u000e¢\u0006\f\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\u001c\u0010A\u001a\u0002068'@'X¦\u000e¢\u0006\f\u001a\u0004\b?\u00108\"\u0004\b@\u0010:R\u001c\u0010D\u001a\u0002068'@'X¦\u000e¢\u0006\f\u001a\u0004\bB\u00108\"\u0004\bC\u0010:R\u001c\u0010G\u001a\u0002068'@'X¦\u000e¢\u0006\f\u001a\u0004\bE\u00108\"\u0004\bF\u0010:R\u001c\u0010J\u001a\u00020\u00078'@'X¦\u000e¢\u0006\f\u001a\u0004\bH\u0010*\"\u0004\bI\u0010\u000fR\u001c\u0010M\u001a\u00020\u00078'@'X¦\u000e¢\u0006\f\u001a\u0004\bK\u0010*\"\u0004\bL\u0010\u000fR\u001c\u0010P\u001a\u0002068'@'X¦\u000e¢\u0006\f\u001a\u0004\bN\u00108\"\u0004\bO\u0010:R\u001c\u0010S\u001a\u0002068'@'X¦\u000e¢\u0006\f\u001a\u0004\bQ\u00108\"\u0004\bR\u0010:R\u001c\u0010V\u001a\u0002068'@'X¦\u000e¢\u0006\f\u001a\u0004\bT\u00108\"\u0004\bU\u0010:R\u001c\u0010Y\u001a\u0002068'@'X¦\u000e¢\u0006\f\u001a\u0004\bW\u00108\"\u0004\bX\u0010:R\u001c\u0010\\\u001a\u0002068'@'X¦\u000e¢\u0006\f\u001a\u0004\bZ\u00108\"\u0004\b[\u0010:R\u001c\u0010_\u001a\u0002068'@'X¦\u000e¢\u0006\f\u001a\u0004\b]\u00108\"\u0004\b^\u0010:R\u001c\u0010d\u001a\u00020\u000b8'@'X¦\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001c\u0010g\u001a\u00020\u000b8'@'X¦\u000e¢\u0006\f\u001a\u0004\be\u0010a\"\u0004\bf\u0010cR\u001c\u0010j\u001a\u0002068'@'X¦\u000e¢\u0006\f\u001a\u0004\bh\u00108\"\u0004\bi\u0010:R\u001e\u0010p\u001a\u0004\u0018\u00010k8'@'X¦\u000e¢\u0006\f\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u001c\u0010t\u001a\u00020q8'@'X¦\u000e¢\u0006\f\u001a\u0004\br\u0010*\"\u0004\bs\u0010\u000fR\u001e\u0010z\u001a\u0004\u0018\u00010u8'@'X¦\u000e¢\u0006\f\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0014\u0010|\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b{\u0010aR\u001d\u0010\u0080\u0001\u001a\u00020}8'@'X¦\u000e¢\u0006\f\u001a\u0004\b~\u0010*\"\u0004\b\u007f\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNode;", "", "Landroid/graphics/Outline;", "p0", "", "setOutline", "(Landroid/graphics/Outline;)V", "", "p1", "p2", "p3", "", "setPosition", "(IIII)Z", "offsetLeftAndRight", "(I)V", "offsetTopAndBottom", "Landroidx/compose/ui/graphics/CanvasHolder;", "Landroidx/compose/ui/graphics/Path;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "record", "(Landroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/Path;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Matrix;", "getMatrix", "(Landroid/graphics/Matrix;)V", "getInverseMatrix", "Landroid/graphics/Canvas;", "drawInto", "(Landroid/graphics/Canvas;)V", "setHasOverlappingRendering", "(Z)Z", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "dumpRenderNodeData", "()Landroidx/compose/ui/platform/DeviceRenderNodeData;", "discardDisplayList", "()V", "", "getUniqueId", "()J", "uniqueId", "getLeft", "()I", "left", "getTop", "top", "getRight", "right", "getBottom", "bottom", "getWidth", "width", "getHeight", "height", "", "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getElevation", "setElevation", "elevation", "getAmbientShadowColor", "setAmbientShadowColor", "ambientShadowColor", "getSpotShadowColor", "setSpotShadowColor", "spotShadowColor", "getRotationZ", "setRotationZ", "rotationZ", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getCameraDistance", "setCameraDistance", "cameraDistance", "getPivotX", "setPivotX", "pivotX", "getPivotY", "setPivotY", "pivotY", "getClipToOutline", "()Z", "setClipToOutline", "(Z)V", "clipToOutline", "getClipToBounds", "setClipToBounds", "clipToBounds", "getAlpha", "setAlpha", "alpha", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "Landroidx/compose/ui/graphics/BlendMode;", "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "getHasDisplayList", "hasDisplayList", "Landroidx/compose/ui/graphics/CompositingStrategy;", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "compositingStrategy"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceRenderNode {
    void discardDisplayList();

    void drawInto(Canvas p0);

    DeviceRenderNodeData dumpRenderNodeData();

    float getAlpha();

    int getAmbientShadowColor();

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    int mo6063getBlendMode0nO6VwU();

    int getBottom();

    float getCameraDistance();

    boolean getClipToBounds();

    boolean getClipToOutline();

    ColorFilter getColorFilter();

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    int mo6064getCompositingStrategyNrFUSI();

    float getElevation();

    boolean getHasDisplayList();

    int getHeight();

    void getInverseMatrix(Matrix p0);

    int getLeft();

    void getMatrix(Matrix p0);

    float getPivotX();

    float getPivotY();

    RenderEffect getRenderEffect();

    int getRight();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    int getSpotShadowColor();

    int getTop();

    float getTranslationX();

    float getTranslationY();

    long getUniqueId();

    int getWidth();

    void offsetLeftAndRight(int p0);

    void offsetTopAndBottom(int p0);

    void record(CanvasHolder p0, Path p1, Function1<? super androidx.compose.ui.graphics.Canvas, Unit> p2);

    void setAlpha(float f);

    void setAmbientShadowColor(int i);

    /* JADX INFO: renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    void mo6065setBlendModes9anfk8(int i);

    void setCameraDistance(float f);

    void setClipToBounds(boolean z);

    void setClipToOutline(boolean z);

    void setColorFilter(ColorFilter colorFilter);

    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    void mo6066setCompositingStrategyaDBOjCE(int i);

    void setElevation(float f);

    boolean setHasOverlappingRendering(boolean p0);

    void setOutline(Outline p0);

    void setPivotX(float f);

    void setPivotY(float f);

    boolean setPosition(int p0, int p1, int p2, int p3);

    void setRenderEffect(RenderEffect renderEffect);

    void setRotationX(float f);

    void setRotationY(float f);

    void setRotationZ(float f);

    void setScaleX(float f);

    void setScaleY(float f);

    void setSpotShadowColor(int i);

    void setTranslationX(float f);

    void setTranslationY(float f);
}
