package androidx.compose.ui.graphics;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b/\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B£\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0017¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020#*\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b,\u0010*J\u0010\u0010-\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b-\u0010*J\u0010\u0010.\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b.\u0010*J\u0010\u0010/\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b/\u0010*J\u0010\u00100\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b0\u0010*J\u0010\u00101\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b1\u0010*J\u0010\u00102\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b2\u0010*J\u0010\u00103\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b3\u0010*J\u0010\u00106\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u00020\u0010HÇ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010>\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b=\u00105J\u0010\u0010@\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b?\u00105J\u0010\u0010C\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010E\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bD\u0010BJ\u0012\u0010F\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bF\u0010GJÒ\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÇ\u0001¢\u0006\u0004\bH\u0010IJ\u001a\u0010L\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010KHÖ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010O\u001a\u00020NHÖ\u0001¢\u0006\u0004\bO\u0010BJ\u0010\u0010Q\u001a\u00020PH×\u0001¢\u0006\u0004\bQ\u0010RR\u0017\u0010S\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010*R\u001a\u0010V\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010T\u001a\u0004\bW\u0010*R\u001a\u0010X\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010T\u001a\u0004\bY\u0010*R\u001a\u0010Z\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010T\u001a\u0004\b[\u0010*R\u001a\u0010\\\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010T\u001a\u0004\b]\u0010*R\u001a\u0010^\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010T\u001a\u0004\b_\u0010*R\u001a\u0010`\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010T\u001a\u0004\ba\u0010*R\u001a\u0010b\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010T\u001a\u0004\bc\u0010*R\u001a\u0010d\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010T\u001a\u0004\be\u0010*R\u001a\u0010f\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010T\u001a\u0004\bg\u0010*R\u001a\u0010h\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u00105R\u001a\u0010k\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u00108R\u001a\u0010n\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010:R\u001c\u0010q\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010<R\u001a\u0010t\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\bt\u0010i\u001a\u0004\bu\u00105R\u001a\u0010v\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010i\u001a\u0004\bw\u00105R\u001a\u0010x\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010BR\u001a\u0010{\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010y\u001a\u0004\b|\u0010BR\u001c\u0010}\u001a\u0004\u0018\u00010\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b}\u0010~\u001a\u0004\b\u007f\u0010G"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "Landroidx/compose/ui/graphics/TransformOrigin;", "p10", "Landroidx/compose/ui/graphics/Shape;", "p11", "", "p12", "Landroidx/compose/ui/graphics/RenderEffect;", "p13", "Landroidx/compose/ui/graphics/Color;", "p14", "p15", "Landroidx/compose/ui/graphics/CompositingStrategy;", "p16", "Landroidx/compose/ui/graphics/BlendMode;", "p17", "Landroidx/compose/ui/graphics/ColorFilter;", "p18", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJIILandroidx/compose/ui/graphics/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "", "update", "(Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()F", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11-SzJe1aQ", "()J", "component11", "component12", "()Landroidx/compose/ui/graphics/Shape;", "component13", "()Z", "component14", "()Landroidx/compose/ui/graphics/RenderEffect;", "component15-0d7_KjU", "component15", "component16-0d7_KjU", "component16", "component17--NrFUSI", "()I", "component17", "component18-0nO6VwU", "component18", "component19", "()Landroidx/compose/ui/graphics/ColorFilter;", "copy-cp5nf6A", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJIILandroidx/compose/ui/graphics/ColorFilter;)Landroidx/compose/ui/graphics/GraphicsLayerElement;", "copy", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "", "toString", "()Ljava/lang/String;", "scaleX", "F", "getScaleX", "scaleY", "getScaleY", "alpha", "getAlpha", "translationX", "getTranslationX", "translationY", "getTranslationY", "shadowElevation", "getShadowElevation", "rotationX", "getRotationX", "rotationY", "getRotationY", "rotationZ", "getRotationZ", "cameraDistance", "getCameraDistance", "transformOrigin", "J", "getTransformOrigin-SzJe1aQ", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "clip", "Z", "getClip", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "compositingStrategy", "I", "getCompositingStrategy--NrFUSI", "blendMode", "getBlendMode-0nO6VwU", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class GraphicsLayerElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {
    private final float alpha;
    private final long ambientShadowColor;
    private final int blendMode;
    private final float cameraDistance;
    private final boolean clip;
    private final ColorFilter colorFilter;
    private final int compositingStrategy;
    private final RenderEffect renderEffect;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;
    private final Shape shape;
    private final long spotShadowColor;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* JADX INFO: renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m4379getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m4375getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m4378getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m4377getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m4376getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    private GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, int i2, ColorFilter colorFilter) {
        this.scaleX = f;
        this.scaleY = f2;
        this.alpha = f3;
        this.translationX = f4;
        this.translationY = f5;
        this.shadowElevation = f6;
        this.rotationX = f7;
        this.rotationY = f8;
        this.rotationZ = f9;
        this.cameraDistance = f10;
        this.transformOrigin = j;
        this.shape = shape;
        this.clip = z;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = j2;
        this.spotShadowColor = j3;
        this.compositingStrategy = i;
        this.blendMode = i2;
        this.colorFilter = colorFilter;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: create */
    public final SimpleGraphicsLayerModifier getNode() {
        return new SimpleGraphicsLayerModifier(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, this.renderEffect, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, this.blendMode, this.colorFilter, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(SimpleGraphicsLayerModifier p0) {
        p0.setScaleX(this.scaleX);
        p0.setScaleY(this.scaleY);
        p0.setAlpha(this.alpha);
        p0.setTranslationX(this.translationX);
        p0.setTranslationY(this.translationY);
        p0.setShadowElevation(this.shadowElevation);
        p0.setRotationX(this.rotationX);
        p0.setRotationY(this.rotationY);
        p0.setRotationZ(this.rotationZ);
        p0.setCameraDistance(this.cameraDistance);
        p0.m4570setTransformOrigin__ExYCQ(this.transformOrigin);
        p0.setShape(this.shape);
        p0.setClip(this.clip);
        p0.setRenderEffect(this.renderEffect);
        p0.m4566setAmbientShadowColor8_81llA(this.ambientShadowColor);
        p0.m4569setSpotShadowColor8_81llA(this.spotShadowColor);
        p0.m4568setCompositingStrategyaDBOjCE(this.compositingStrategy);
        p0.m4567setBlendModes9anfk8(this.blendMode);
        p0.setColorFilter(this.colorFilter);
        p0.invalidateLayerBlock();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.scaleX));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.scaleY));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.translationX));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.translationY));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.shadowElevation));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.rotationX));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.rotationY));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.rotationZ));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.cameraDistance));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m4614boximpl(this.transformOrigin));
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.clip));
        inspectorInfo.getProperties().set("renderEffect", this.renderEffect);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m4208boximpl(this.ambientShadowColor));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m4208boximpl(this.spotShadowColor));
        inspectorInfo.getProperties().set("compositingStrategy", CompositingStrategy.m4302boximpl(this.compositingStrategy));
        inspectorInfo.getProperties().set("blendMode", BlendMode.m4125boximpl(this.blendMode));
        inspectorInfo.getProperties().set("colorFilter", this.colorFilter);
    }

    public /* synthetic */ GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, int i2, ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, i, i2, colorFilter);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* JADX INFO: renamed from: component11-SzJe1aQ, reason: not valid java name and from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    /* JADX INFO: renamed from: component15-0d7_KjU, reason: not valid java name and from getter */
    public final long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* JADX INFO: renamed from: component16-0d7_KjU, reason: not valid java name and from getter */
    public final long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: component17--NrFUSI, reason: not valid java name and from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    /* JADX INFO: renamed from: component18-0nO6VwU, reason: not valid java name and from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    /* JADX INFO: renamed from: copy-cp5nf6A, reason: not valid java name */
    public final GraphicsLayerElement m4374copycp5nf6A(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, long p10, Shape p11, boolean p12, RenderEffect p13, long p14, long p15, int p16, int p17, ColorFilter p18) {
        return new GraphicsLayerElement(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) p0;
        return Float.compare(this.scaleX, graphicsLayerElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerElement.cameraDistance) == 0 && TransformOrigin.m4621equalsimpl0(this.transformOrigin, graphicsLayerElement.transformOrigin) && Intrinsics.areEqual(this.shape, graphicsLayerElement.shape) && this.clip == graphicsLayerElement.clip && Intrinsics.areEqual(this.renderEffect, graphicsLayerElement.renderEffect) && Color.m4219equalsimpl0(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) && Color.m4219equalsimpl0(this.spotShadowColor, graphicsLayerElement.spotShadowColor) && CompositingStrategy.m4305equalsimpl0(this.compositingStrategy, graphicsLayerElement.compositingStrategy) && BlendMode.m4128equalsimpl0(this.blendMode, graphicsLayerElement.blendMode) && Intrinsics.areEqual(this.colorFilter, graphicsLayerElement.colorFilter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = Float.hashCode(this.scaleX);
        int iHashCode2 = Float.hashCode(this.scaleY);
        int iHashCode3 = Float.hashCode(this.alpha);
        int iHashCode4 = Float.hashCode(this.translationX);
        int iHashCode5 = Float.hashCode(this.translationY);
        int iHashCode6 = Float.hashCode(this.shadowElevation);
        int iHashCode7 = Float.hashCode(this.rotationX);
        int iHashCode8 = Float.hashCode(this.rotationY);
        int iHashCode9 = Float.hashCode(this.rotationZ);
        int iHashCode10 = Float.hashCode(this.cameraDistance);
        int iM4624hashCodeimpl = TransformOrigin.m4624hashCodeimpl(this.transformOrigin);
        int iHashCode11 = this.shape.hashCode();
        int iHashCode12 = Boolean.hashCode(this.clip);
        RenderEffect renderEffect = this.renderEffect;
        int iHashCode13 = renderEffect == null ? 0 : renderEffect.hashCode();
        int iM4225hashCodeimpl = Color.m4225hashCodeimpl(this.ambientShadowColor);
        int iM4225hashCodeimpl2 = Color.m4225hashCodeimpl(this.spotShadowColor);
        int iM4306hashCodeimpl = CompositingStrategy.m4306hashCodeimpl(this.compositingStrategy);
        int iM4129hashCodeimpl = BlendMode.m4129hashCodeimpl(this.blendMode);
        ColorFilter colorFilter = this.colorFilter;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iM4624hashCodeimpl) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iM4225hashCodeimpl) * 31) + iM4225hashCodeimpl2) * 31) + iM4306hashCodeimpl) * 31) + iM4129hashCodeimpl) * 31) + (colorFilter != null ? colorFilter.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.scaleX);
        sb.append(", scaleY=");
        sb.append(this.scaleY);
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", translationX=");
        sb.append(this.translationX);
        sb.append(", translationY=");
        sb.append(this.translationY);
        sb.append(", shadowElevation=");
        sb.append(this.shadowElevation);
        sb.append(", rotationX=");
        sb.append(this.rotationX);
        sb.append(", rotationY=");
        sb.append(this.rotationY);
        sb.append(", rotationZ=");
        sb.append(this.rotationZ);
        sb.append(", cameraDistance=");
        sb.append(this.cameraDistance);
        sb.append(", transformOrigin=");
        sb.append((Object) TransformOrigin.m4625toStringimpl(this.transformOrigin));
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(", clip=");
        sb.append(this.clip);
        sb.append(", renderEffect=");
        sb.append(this.renderEffect);
        sb.append(", ambientShadowColor=");
        sb.append((Object) Color.m4226toStringimpl(this.ambientShadowColor));
        sb.append(", spotShadowColor=");
        sb.append((Object) Color.m4226toStringimpl(this.spotShadowColor));
        sb.append(", compositingStrategy=");
        sb.append((Object) CompositingStrategy.m4307toStringimpl(this.compositingStrategy));
        sb.append(", blendMode=");
        sb.append((Object) BlendMode.m4130toStringimpl(this.blendMode));
        sb.append(", colorFilter=");
        sb.append(this.colorFilter);
        sb.append(')');
        return sb.toString();
    }
}
