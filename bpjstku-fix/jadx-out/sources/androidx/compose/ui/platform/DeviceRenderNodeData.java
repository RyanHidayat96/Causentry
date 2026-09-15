package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000e\n\u0002\bW\b\u0081\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b,\u0010*J\u0010\u0010-\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b-\u0010*J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010*J\u0010\u0010/\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b/\u0010*J\u0010\u00100\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b2\u00101J\u0010\u00103\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b3\u00101J\u0010\u00104\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b4\u00101J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b5\u00101J\u0010\u00106\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b6\u0010*J\u0010\u00107\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u0010*J\u0010\u00108\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b8\u00101J\u0010\u00109\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b9\u00101J\u0010\u0010:\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b:\u00101J\u0010\u0010;\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b;\u00101J\u0010\u0010<\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b<\u00101J\u0010\u0010=\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b=\u00101J\u0010\u0010>\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b@\u0010?J\u0010\u0010A\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bA\u00101J\u0012\u0010B\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010E\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bD\u0010*J\u0012\u0010F\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010I\u001a\u00020#HÆ\u0003¢\u0006\u0004\bH\u0010*J¢\u0002\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010$\u001a\u00020#HÇ\u0001¢\u0006\u0004\bJ\u0010KJ\u001a\u0010M\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bO\u0010*J\u0010\u0010Q\u001a\u00020PH×\u0001¢\u0006\u0004\bQ\u0010RR\u0017\u0010S\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010(R\u001a\u0010V\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010*R\u001a\u0010Y\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010W\u001a\u0004\bZ\u0010*R\u001a\u0010[\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010W\u001a\u0004\b\\\u0010*R\u001a\u0010]\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010W\u001a\u0004\b^\u0010*R\u001a\u0010_\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010W\u001a\u0004\b`\u0010*R\u001a\u0010a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010W\u001a\u0004\bb\u0010*R\"\u0010c\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u00101\"\u0004\bf\u0010gR\"\u0010h\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010d\u001a\u0004\bi\u00101\"\u0004\bj\u0010gR\"\u0010k\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bk\u0010d\u001a\u0004\bl\u00101\"\u0004\bm\u0010gR\"\u0010n\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bn\u0010d\u001a\u0004\bo\u00101\"\u0004\bp\u0010gR\"\u0010q\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bq\u0010d\u001a\u0004\br\u00101\"\u0004\bs\u0010gR\"\u0010t\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bt\u0010W\u001a\u0004\bu\u0010*\"\u0004\bv\u0010wR\"\u0010x\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bx\u0010W\u001a\u0004\by\u0010*\"\u0004\bz\u0010wR\"\u0010{\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b{\u0010d\u001a\u0004\b|\u00101\"\u0004\b}\u0010gR#\u0010~\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0013\n\u0004\b~\u0010d\u001a\u0004\b\u007f\u00101\"\u0005\b\u0080\u0001\u0010gR&\u0010\u0081\u0001\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010d\u001a\u0005\b\u0082\u0001\u00101\"\u0005\b\u0083\u0001\u0010gR&\u0010\u0084\u0001\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010d\u001a\u0005\b\u0085\u0001\u00101\"\u0005\b\u0086\u0001\u0010gR&\u0010\u0087\u0001\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010d\u001a\u0005\b\u0088\u0001\u00101\"\u0005\b\u0089\u0001\u0010gR&\u0010\u008a\u0001\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010d\u001a\u0005\b\u008b\u0001\u00101\"\u0005\b\u008c\u0001\u0010gR(\u0010\u008d\u0001\u001a\u00020\u00198\u0007@\u0007X\u0087\u000e¢\u0006\u0017\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010?\"\u0006\b\u0090\u0001\u0010\u0091\u0001R(\u0010\u0092\u0001\u001a\u00020\u00198\u0007@\u0007X\u0087\u000e¢\u0006\u0017\n\u0006\b\u0092\u0001\u0010\u008e\u0001\u001a\u0005\b\u0093\u0001\u0010?\"\u0006\b\u0094\u0001\u0010\u0091\u0001R&\u0010\u0095\u0001\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010d\u001a\u0005\b\u0096\u0001\u00101\"\u0005\b\u0097\u0001\u0010gR*\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u001d8\u0007@\u0007X\u0087\u000e¢\u0006\u0017\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010C\"\u0006\b\u009b\u0001\u0010\u009c\u0001R&\u0010\u009d\u0001\u001a\u00020\u001f8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010W\u001a\u0005\b\u009e\u0001\u0010*\"\u0005\b\u009f\u0001\u0010wR*\u0010 \u0001\u001a\u0004\u0018\u00010!8\u0007@\u0007X\u0087\u000e¢\u0006\u0017\n\u0006\b \u0001\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010G\"\u0006\b£\u0001\u0010¤\u0001R&\u0010¥\u0001\u001a\u00020#8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b¥\u0001\u0010W\u001a\u0005\b¦\u0001\u0010*\"\u0005\b§\u0001\u0010w"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNodeData;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "", "p20", "p21", "p22", "Landroidx/compose/ui/graphics/RenderEffect;", "p23", "Landroidx/compose/ui/graphics/BlendMode;", "p24", "Landroidx/compose/ui/graphics/ColorFilter;", "p25", "Landroidx/compose/ui/graphics/CompositingStrategy;", "p26", "<init>", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;ILandroidx/compose/ui/graphics/ColorFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()J", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "()F", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "()Z", "component22", "component23", "component24", "()Landroidx/compose/ui/graphics/RenderEffect;", "component25-0nO6VwU", "component25", "component26", "()Landroidx/compose/ui/graphics/ColorFilter;", "component27--NrFUSI", "component27", "copy-qCc9W8c", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;ILandroidx/compose/ui/graphics/ColorFilter;I)Landroidx/compose/ui/platform/DeviceRenderNodeData;", "copy", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "uniqueId", "J", "getUniqueId", "left", "I", "getLeft", "top", "getTop", "right", "getRight", "bottom", "getBottom", "width", "getWidth", "height", "getHeight", "scaleX", "F", "getScaleX", "setScaleX", "(F)V", "scaleY", "getScaleY", "setScaleY", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "elevation", "getElevation", "setElevation", "ambientShadowColor", "getAmbientShadowColor", "setAmbientShadowColor", "(I)V", "spotShadowColor", "getSpotShadowColor", "setSpotShadowColor", "rotationZ", "getRotationZ", "setRotationZ", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "cameraDistance", "getCameraDistance", "setCameraDistance", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "clipToOutline", "Z", "getClipToOutline", "setClipToOutline", "(Z)V", "clipToBounds", "getClipToBounds", "setClipToBounds", "alpha", "getAlpha", "setAlpha", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "blendMode", "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "compositingStrategy", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceRenderNodeData {
    public static final int $stable = 8;
    private float alpha;
    private int ambientShadowColor;
    private int blendMode;
    private final int bottom;
    private float cameraDistance;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private float elevation;
    private final int height;
    private final int left;
    private float pivotX;
    private float pivotY;
    private RenderEffect renderEffect;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private int spotShadowColor;
    private final int top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    private DeviceRenderNodeData(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, RenderEffect renderEffect, int i9, ColorFilter colorFilter, int i10) {
        this.uniqueId = j;
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
        this.width = i5;
        this.height = i6;
        this.scaleX = f;
        this.scaleY = f2;
        this.translationX = f3;
        this.translationY = f4;
        this.elevation = f5;
        this.ambientShadowColor = i7;
        this.spotShadowColor = i8;
        this.rotationZ = f6;
        this.rotationX = f7;
        this.rotationY = f8;
        this.cameraDistance = f9;
        this.pivotX = f10;
        this.pivotY = f11;
        this.clipToOutline = z;
        this.clipToBounds = z2;
        this.alpha = f12;
        this.renderEffect = renderEffect;
        this.blendMode = i9;
        this.colorFilter = colorFilter;
        this.compositingStrategy = i10;
    }

    public final long getUniqueId() {
        return this.uniqueId;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final void setElevation(float f) {
        this.elevation = f;
    }

    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    public final void setAmbientShadowColor(int i) {
        this.ambientShadowColor = i;
    }

    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final void setSpotShadowColor(int i) {
        this.spotShadowColor = i;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final void setRotationZ(float f) {
        this.rotationZ = f;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final void setRotationX(float f) {
        this.rotationX = f;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final void setRotationY(float f) {
        this.rotationY = f;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final void setCameraDistance(float f) {
        this.cameraDistance = f;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
    }

    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    public final void setClipToOutline(boolean z) {
        this.clipToOutline = z;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final void setClipToBounds(boolean z) {
        this.clipToBounds = z;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m6071getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    /* JADX INFO: renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m6073setBlendModes9anfk8(int i) {
        this.blendMode = i;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m6072getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m6074setCompositingStrategyaDBOjCE(int i) {
        this.compositingStrategy = i;
    }

    public /* synthetic */ DeviceRenderNodeData(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, RenderEffect renderEffect, int i9, ColorFilter colorFilter, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, i3, i4, i5, i6, f, f2, f3, f4, f5, i7, i8, f6, f7, f8, f9, f10, f11, z, z2, f12, renderEffect, i9, colorFilter, i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUniqueId() {
        return this.uniqueId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final float getPivotX() {
        return this.pivotX;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final float getPivotY() {
        return this.pivotY;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    /* JADX INFO: renamed from: component25-0nO6VwU, reason: not valid java name and from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    /* JADX INFO: renamed from: component27--NrFUSI, reason: not valid java name and from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    /* JADX INFO: renamed from: copy-qCc9W8c, reason: not valid java name */
    public final DeviceRenderNodeData m6070copyqCc9W8c(long p0, int p1, int p2, int p3, int p4, int p5, int p6, float p7, float p8, float p9, float p10, float p11, int p12, int p13, float p14, float p15, float p16, float p17, float p18, float p19, boolean p20, boolean p21, float p22, RenderEffect p23, int p24, ColorFilter p25, int p26) {
        return new DeviceRenderNodeData(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) p0;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Float.compare(this.scaleX, deviceRenderNodeData.scaleX) == 0 && Float.compare(this.scaleY, deviceRenderNodeData.scaleY) == 0 && Float.compare(this.translationX, deviceRenderNodeData.translationX) == 0 && Float.compare(this.translationY, deviceRenderNodeData.translationY) == 0 && Float.compare(this.elevation, deviceRenderNodeData.elevation) == 0 && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && Float.compare(this.rotationZ, deviceRenderNodeData.rotationZ) == 0 && Float.compare(this.rotationX, deviceRenderNodeData.rotationX) == 0 && Float.compare(this.rotationY, deviceRenderNodeData.rotationY) == 0 && Float.compare(this.cameraDistance, deviceRenderNodeData.cameraDistance) == 0 && Float.compare(this.pivotX, deviceRenderNodeData.pivotX) == 0 && Float.compare(this.pivotY, deviceRenderNodeData.pivotY) == 0 && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Float.compare(this.alpha, deviceRenderNodeData.alpha) == 0 && Intrinsics.areEqual(this.renderEffect, deviceRenderNodeData.renderEffect) && BlendMode.m4128equalsimpl0(this.blendMode, deviceRenderNodeData.blendMode) && Intrinsics.areEqual(this.colorFilter, deviceRenderNodeData.colorFilter) && CompositingStrategy.m4305equalsimpl0(this.compositingStrategy, deviceRenderNodeData.compositingStrategy);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.uniqueId);
        int iHashCode2 = Integer.hashCode(this.left);
        int iHashCode3 = Integer.hashCode(this.top);
        int iHashCode4 = Integer.hashCode(this.right);
        int iHashCode5 = Integer.hashCode(this.bottom);
        int iHashCode6 = Integer.hashCode(this.width);
        int iHashCode7 = Integer.hashCode(this.height);
        int iHashCode8 = Float.hashCode(this.scaleX);
        int iHashCode9 = Float.hashCode(this.scaleY);
        int iHashCode10 = Float.hashCode(this.translationX);
        int iHashCode11 = Float.hashCode(this.translationY);
        int iHashCode12 = Float.hashCode(this.elevation);
        int iHashCode13 = Integer.hashCode(this.ambientShadowColor);
        int iHashCode14 = Integer.hashCode(this.spotShadowColor);
        int iHashCode15 = Float.hashCode(this.rotationZ);
        int iHashCode16 = Float.hashCode(this.rotationX);
        int iHashCode17 = Float.hashCode(this.rotationY);
        int iHashCode18 = Float.hashCode(this.cameraDistance);
        int iHashCode19 = Float.hashCode(this.pivotX);
        int iHashCode20 = Float.hashCode(this.pivotY);
        int iHashCode21 = Boolean.hashCode(this.clipToOutline);
        int iHashCode22 = Boolean.hashCode(this.clipToBounds);
        int iHashCode23 = Float.hashCode(this.alpha);
        RenderEffect renderEffect = this.renderEffect;
        int iHashCode24 = renderEffect == null ? 0 : renderEffect.hashCode();
        int iM4129hashCodeimpl = BlendMode.m4129hashCodeimpl(this.blendMode);
        ColorFilter colorFilter = this.colorFilter;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iM4129hashCodeimpl) * 31) + (colorFilter != null ? colorFilter.hashCode() : 0)) * 31) + CompositingStrategy.m4306hashCodeimpl(this.compositingStrategy);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceRenderNodeData(uniqueId=");
        sb.append(this.uniqueId);
        sb.append(", left=");
        sb.append(this.left);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", right=");
        sb.append(this.right);
        sb.append(", bottom=");
        sb.append(this.bottom);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", scaleX=");
        sb.append(this.scaleX);
        sb.append(", scaleY=");
        sb.append(this.scaleY);
        sb.append(", translationX=");
        sb.append(this.translationX);
        sb.append(", translationY=");
        sb.append(this.translationY);
        sb.append(", elevation=");
        sb.append(this.elevation);
        sb.append(", ambientShadowColor=");
        sb.append(this.ambientShadowColor);
        sb.append(", spotShadowColor=");
        sb.append(this.spotShadowColor);
        sb.append(", rotationZ=");
        sb.append(this.rotationZ);
        sb.append(", rotationX=");
        sb.append(this.rotationX);
        sb.append(", rotationY=");
        sb.append(this.rotationY);
        sb.append(", cameraDistance=");
        sb.append(this.cameraDistance);
        sb.append(", pivotX=");
        sb.append(this.pivotX);
        sb.append(", pivotY=");
        sb.append(this.pivotY);
        sb.append(", clipToOutline=");
        sb.append(this.clipToOutline);
        sb.append(", clipToBounds=");
        sb.append(this.clipToBounds);
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", renderEffect=");
        sb.append(this.renderEffect);
        sb.append(", blendMode=");
        sb.append((Object) BlendMode.m4130toStringimpl(this.blendMode));
        sb.append(", colorFilter=");
        sb.append(this.colorFilter);
        sb.append(", compositingStrategy=");
        sb.append((Object) CompositingStrategy.m4307toStringimpl(this.compositingStrategy));
        sb.append(')');
        return sb.toString();
    }
}
