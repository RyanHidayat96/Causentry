package androidx.compose.ui.node;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0015\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/ui/node/LayerPositionalProperties;", "", "<init>", "()V", "p0", "", "copyFrom", "(Landroidx/compose/ui/node/LayerPositionalProperties;)V", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V", "", "hasSameValuesAs", "(Landroidx/compose/ui/node/LayerPositionalProperties;)Z", "", "scaleX", "F", "scaleY", "translationX", "translationY", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class LayerPositionalProperties {
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float translationX;
    private float translationY;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float cameraDistance = 8.0f;
    private long transformOrigin = TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ();

    public final void copyFrom(LayerPositionalProperties p0) {
        this.scaleX = p0.scaleX;
        this.scaleY = p0.scaleY;
        this.translationX = p0.translationX;
        this.translationY = p0.translationY;
        this.rotationX = p0.rotationX;
        this.rotationY = p0.rotationY;
        this.rotationZ = p0.rotationZ;
        this.cameraDistance = p0.cameraDistance;
        this.transformOrigin = p0.transformOrigin;
    }

    public final void copyFrom(GraphicsLayerScope p0) {
        this.scaleX = p0.getScaleX();
        this.scaleY = p0.getScaleY();
        this.translationX = p0.getTranslationX();
        this.translationY = p0.getTranslationY();
        this.rotationX = p0.getRotationX();
        this.rotationY = p0.getRotationY();
        this.rotationZ = p0.getRotationZ();
        this.cameraDistance = p0.getCameraDistance();
        this.transformOrigin = p0.mo4416getTransformOriginSzJe1aQ();
    }

    public final boolean hasSameValuesAs(LayerPositionalProperties p0) {
        return this.scaleX == p0.scaleX && this.scaleY == p0.scaleY && this.translationX == p0.translationX && this.translationY == p0.translationY && this.rotationX == p0.rotationX && this.rotationY == p0.rotationY && this.rotationZ == p0.rotationZ && this.cameraDistance == p0.cameraDistance && TransformOrigin.m4621equalsimpl0(this.transformOrigin, p0.transformOrigin);
    }
}
