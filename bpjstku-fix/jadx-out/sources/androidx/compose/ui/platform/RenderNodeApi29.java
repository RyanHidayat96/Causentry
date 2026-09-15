package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0016\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\"\u0010!J5\u0010'\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020#2\b\u0010\u001b\u001a\u0004\u0018\u00010$2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\n0%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010.\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0017¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u0010\fR\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020C8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0014\u0010M\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010HR\u0014\u0010O\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010HR\u0014\u0010Q\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010HR\u0014\u0010S\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010HR$\u0010Y\u001a\u00020T2\u0006\u0010\u0003\u001a\u00020T8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\\\u001a\u00020T2\u0006\u0010\u0003\u001a\u00020T8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bZ\u0010V\"\u0004\b[\u0010XR$\u0010_\u001a\u00020T2\u0006\u0010\u0003\u001a\u00020T8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010V\"\u0004\b^\u0010XR$\u0010b\u001a\u00020T2\u0006\u0010\u0003\u001a\u00020T8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b`\u0010V\"\u0004\ba\u0010XR$\u0010e\u001a\u00020T2\u0006\u0010\u0003\u001a\u00020T8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bc\u0010V\"\u0004\bd\u0010XR$\u0010h\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001a8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bf\u0010H\"\u0004\bg\u0010!R$\u0010k\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001a8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010H\"\u0004\bj\u0010!R$\u0010n\u001a\u00020T2\u0006\u0010\u0003\u001a\u00020T8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bl\u0010V\"\u0004\bm\u0010XR$\u0010q\u001a\u00020T2\u0006\u0010\u0003\u001a\u00020T8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bo\u0010V\"\u0004\bp\u0010XR$\u0010t\u001a\u00020T2\u0006\u0010\u0003\u001a\u00020T8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\br\u0010V\"\u0004\bs\u0010XR$\u0010w\u001a\u00020T2\u0006\u0010\u0003\u001a\u00020T8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bu\u0010V\"\u0004\bv\u0010XR$\u0010z\u001a\u00020T2\u0006\u0010\u0003\u001a\u00020T8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bx\u0010V\"\u0004\by\u0010XR$\u0010}\u001a\u00020T2\u0006\u0010\u0003\u001a\u00020T8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b{\u0010V\"\u0004\b|\u0010XR&\u0010\u0081\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068W@WX\u0096\u000e¢\u0006\r\u001a\u0004\b~\u0010\b\"\u0005\b\u007f\u0010\u0080\u0001R(\u0010\u0084\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068W@WX\u0096\u000e¢\u0006\u000f\u001a\u0005\b\u0082\u0001\u0010\b\"\u0006\b\u0083\u0001\u0010\u0080\u0001R'\u0010\u0087\u0001\u001a\u00020T2\u0006\u0010\u0003\u001a\u00020T8W@WX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0085\u0001\u0010V\"\u0005\b\u0086\u0001\u0010XR0\u0010\u0089\u0001\u001a\u00030\u0088\u00012\u0007\u0010\u0003\u001a\u00030\u0088\u00018\u0017@WX\u0097\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010@\u001a\u0005\b\u008a\u0001\u0010H\"\u0005\b\u008b\u0001\u0010!R7\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00012\t\u0010\u0003\u001a\u0005\u0018\u00010\u008c\u00018\u0017@WX\u0097\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R-\u0010\u0097\u0001\u001a\u0004\u0018\u00010<2\b\u0010\u0003\u001a\u0004\u0018\u00010<8W@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R'\u0010\u009a\u0001\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138W@WX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0098\u0001\u0010H\"\u0005\b\u0099\u0001\u0010!R\u0016\u0010\u009c\u0001\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010\b"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi29;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Landroidx/compose/ui/platform/AndroidComposeView;", "p0", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "isUsingCompositingLayer$ui_release", "()Z", "hasOverlappingRendering$ui_release", "", "updateLayerProperties", "()V", "requiresCompositingLayer", "requiresLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "obtainLayerPaint", "()Landroidx/compose/ui/graphics/Paint;", "Landroid/graphics/RenderNode;", "Landroidx/compose/ui/graphics/CompositingStrategy;", "applyCompositingStrategy-Qu9p0E8", "(Landroid/graphics/RenderNode;I)V", "applyCompositingStrategy", "Landroid/graphics/Outline;", "setOutline", "(Landroid/graphics/Outline;)V", "", "p1", "p2", "p3", "setPosition", "(IIII)Z", "offsetLeftAndRight", "(I)V", "offsetTopAndBottom", "Landroidx/compose/ui/graphics/CanvasHolder;", "Landroidx/compose/ui/graphics/Path;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "record", "(Landroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/Path;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Matrix;", "getMatrix", "(Landroid/graphics/Matrix;)V", "getInverseMatrix", "Landroid/graphics/Canvas;", "drawInto", "(Landroid/graphics/Canvas;)V", "setHasOverlappingRendering", "(Z)Z", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "dumpRenderNodeData", "()Landroidx/compose/ui/platform/DeviceRenderNodeData;", "discardDisplayList", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "renderNode", "Landroid/graphics/RenderNode;", "Landroidx/compose/ui/graphics/RenderEffect;", "internalRenderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "internalCompositingStrategy", "I", "layerPaint", "Landroidx/compose/ui/graphics/Paint;", "", "getUniqueId", "()J", "uniqueId", "getLeft", "()I", "left", "getTop", "top", "getRight", "right", "getBottom", "bottom", "getWidth", "width", "getHeight", "height", "", "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getElevation", "setElevation", "elevation", "getAmbientShadowColor", "setAmbientShadowColor", "ambientShadowColor", "getSpotShadowColor", "setSpotShadowColor", "spotShadowColor", "getRotationZ", "setRotationZ", "rotationZ", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getCameraDistance", "setCameraDistance", "cameraDistance", "getPivotX", "setPivotX", "pivotX", "getPivotY", "setPivotY", "pivotY", "getClipToOutline", "setClipToOutline", "(Z)V", "clipToOutline", "getClipToBounds", "setClipToBounds", "clipToBounds", "getAlpha", "setAlpha", "alpha", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "compositingStrategy", "getHasDisplayList", "hasDisplayList"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RenderNodeApi29 implements DeviceRenderNode {
    public static final int $stable = 8;
    private ColorFilter colorFilter;
    private RenderEffect internalRenderEffect;
    private Paint layerPaint;
    private final AndroidComposeView ownerView;
    private final RenderNode renderNode = new RenderNode("Compose");
    private int internalCompositingStrategy = CompositingStrategy.INSTANCE.m4309getAutoNrFUSI();
    private int blendMode = BlendMode.INSTANCE.m4159getSrcOver0nO6VwU();

    public RenderNodeApi29(AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public final boolean isUsingCompositingLayer$ui_release() {
        return this.renderNode.getUseCompositingLayer();
    }

    public final boolean hasOverlappingRendering$ui_release() {
        return this.renderNode.hasOverlappingRendering();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final long getUniqueId() {
        return this.renderNode.getUniqueId();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getLeft() {
        return this.renderNode.getLeft();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getTop() {
        return this.renderNode.getTop();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getRight() {
        return this.renderNode.getRight();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getBottom() {
        return this.renderNode.getBottom();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getWidth() {
        return this.renderNode.getWidth();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getHeight() {
        return this.renderNode.getHeight();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getScaleX() {
        return this.renderNode.getScaleX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setScaleX(float f) {
        this.renderNode.setScaleX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getScaleY() {
        return this.renderNode.getScaleY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setScaleY(float f) {
        this.renderNode.setScaleY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getTranslationX() {
        return this.renderNode.getTranslationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setTranslationX(float f) {
        this.renderNode.setTranslationX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getTranslationY() {
        return this.renderNode.getTranslationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setTranslationY(float f) {
        this.renderNode.setTranslationY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getElevation() {
        return this.renderNode.getElevation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setElevation(float f) {
        this.renderNode.setElevation(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getAmbientShadowColor() {
        return this.renderNode.getAmbientShadowColor();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setAmbientShadowColor(int i) {
        this.renderNode.setAmbientShadowColor(i);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getSpotShadowColor() {
        return this.renderNode.getSpotShadowColor();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setSpotShadowColor(int i) {
        this.renderNode.setSpotShadowColor(i);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getRotationZ() {
        return this.renderNode.getRotationZ();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setRotationZ(float f) {
        this.renderNode.setRotationZ(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getRotationX() {
        return this.renderNode.getRotationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setRotationX(float f) {
        this.renderNode.setRotationX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getRotationY() {
        return this.renderNode.getRotationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setRotationY(float f) {
        this.renderNode.setRotationY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getCameraDistance() {
        return this.renderNode.getCameraDistance();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setCameraDistance(float f) {
        this.renderNode.setCameraDistance(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getPivotX() {
        return this.renderNode.getPivotX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setPivotX(float f) {
        this.renderNode.setPivotX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getPivotY() {
        return this.renderNode.getPivotY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setPivotY(float f) {
        this.renderNode.setPivotY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean getClipToOutline() {
        return this.renderNode.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setClipToOutline(boolean z) {
        this.renderNode.setClipToOutline(z);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean getClipToBounds() {
        return this.renderNode.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setClipToBounds(boolean z) {
        this.renderNode.setClipToBounds(z);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float getAlpha() {
        return this.renderNode.getAlpha();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setAlpha(float f) {
        this.renderNode.setAlpha(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    public final void mo6065setBlendModes9anfk8(int i) {
        this.blendMode = i;
        obtainLayerPaint().mo4094setBlendModes9anfk8(i);
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        obtainLayerPaint().setColorFilter(colorFilter);
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: getRenderEffect, reason: from getter */
    public final RenderEffect getInternalRenderEffect() {
        return this.internalRenderEffect;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setRenderEffect(RenderEffect renderEffect) {
        this.internalRenderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeApi29VerificationHelper.INSTANCE.setRenderEffect(this.renderNode, renderEffect);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: from getter */
    public final int getInternalCompositingStrategy() {
        return this.internalCompositingStrategy;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE */
    public final void mo6066setCompositingStrategyaDBOjCE(int i) {
        this.internalCompositingStrategy = i;
        updateLayerProperties();
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m6118applyCompositingStrategyQu9p0E8(this.renderNode, CompositingStrategy.INSTANCE.m4311getOffscreenNrFUSI());
        } else {
            m6118applyCompositingStrategyQu9p0E8(this.renderNode, this.internalCompositingStrategy);
        }
    }

    private final boolean requiresCompositingLayer() {
        return CompositingStrategy.m4305equalsimpl0(getInternalCompositingStrategy(), CompositingStrategy.INSTANCE.m4311getOffscreenNrFUSI()) || requiresLayerPaint();
    }

    private final boolean requiresLayerPaint() {
        return (BlendMode.m4128equalsimpl0(getBlendMode(), BlendMode.INSTANCE.m4159getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final Paint obtainLayerPaint() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        this.layerPaint = Paint;
        return Paint;
    }

    /* JADX INFO: renamed from: applyCompositingStrategy-Qu9p0E8, reason: not valid java name */
    private final void m6118applyCompositingStrategyQu9p0E8(RenderNode renderNode, int i) {
        if (CompositingStrategy.m4305equalsimpl0(i, CompositingStrategy.INSTANCE.m4311getOffscreenNrFUSI())) {
            Paint paint = this.layerPaint;
            renderNode.setUseCompositingLayer(true, paint != null ? paint.getInternalPaint() : null);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m4305equalsimpl0(i, CompositingStrategy.INSTANCE.m4310getModulateAlphaNrFUSI())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean getHasDisplayList() {
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void setOutline(Outline p0) {
        this.renderNode.setOutline(p0);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean setPosition(int p0, int p1, int p2, int p3) {
        return this.renderNode.setPosition(p0, p1, p2, p3);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void offsetLeftAndRight(int p0) {
        this.renderNode.offsetLeftAndRight(p0);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void offsetTopAndBottom(int p0) {
        this.renderNode.offsetTopAndBottom(p0);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void record(CanvasHolder p0, Path p1, Function1<? super Canvas, Unit> p2) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        android.graphics.Canvas internalCanvas = p0.getAndroidCanvas().getInternalCanvas();
        p0.getAndroidCanvas().setInternalCanvas(recordingCanvasBeginRecording);
        AndroidCanvas androidCanvas = p0.getAndroidCanvas();
        if (p1 != null) {
            androidCanvas.save();
            Canvas.m4189clipPathmtrdDE$default(androidCanvas, p1, 0, 2, null);
        }
        p2.invoke(androidCanvas);
        if (p1 != null) {
            androidCanvas.restore();
        }
        p0.getAndroidCanvas().setInternalCanvas(internalCanvas);
        this.renderNode.endRecording();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void getMatrix(Matrix p0) {
        this.renderNode.getMatrix(p0);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void getInverseMatrix(Matrix p0) {
        this.renderNode.getInverseMatrix(p0);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void drawInto(android.graphics.Canvas p0) {
        p0.drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean setHasOverlappingRendering(boolean p0) {
        return this.renderNode.setHasOverlappingRendering(p0);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final DeviceRenderNodeData dumpRenderNodeData() {
        return new DeviceRenderNodeData(this.renderNode.getUniqueId(), this.renderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getRight(), this.renderNode.getBottom(), this.renderNode.getWidth(), this.renderNode.getHeight(), this.renderNode.getScaleX(), this.renderNode.getScaleY(), this.renderNode.getTranslationX(), this.renderNode.getTranslationY(), this.renderNode.getElevation(), this.renderNode.getAmbientShadowColor(), this.renderNode.getSpotShadowColor(), this.renderNode.getRotationZ(), this.renderNode.getRotationX(), this.renderNode.getRotationY(), this.renderNode.getCameraDistance(), this.renderNode.getPivotX(), this.renderNode.getPivotY(), this.renderNode.getClipToOutline(), this.renderNode.getClipToBounds(), this.renderNode.getAlpha(), this.internalRenderEffect, getBlendMode(), getColorFilter(), this.internalCompositingStrategy, null);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void discardDisplayList() {
        this.renderNode.discardDisplayList();
    }
}
