package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0000H\u0011¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\f8\u0011X\u0091D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R*\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010$\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R*\u0010'\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#"}, d2 = {"Landroidx/compose/animation/core/AnimationVector3D;", "Landroidx/compose/animation/core/AnimationVector;", "", "p0", "p1", "p2", "<init>", "(FFF)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "get$animation_core_release", "(I)F", "hashCode", "()I", "newVector$animation_core_release", "()Landroidx/compose/animation/core/AnimationVector3D;", "", "reset$animation_core_release", "()V", "set$animation_core_release", "(IF)V", "", "toString", "()Ljava/lang/String;", "size", "I", "getSize$animation_core_release", "v1", "F", "getV1", "()F", "setV1$animation_core_release", "(F)V", "v2", "getV2", "setV2$animation_core_release", "v3", "getV3", "setV3$animation_core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AnimationVector3D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;
    private float v1;
    private float v2;
    private float v3;

    public AnimationVector3D(float f, float f2, float f3) {
        super(null);
        this.v1 = f;
        this.v2 = f2;
        this.v3 = f3;
        this.size = 3;
    }

    public final float getV1() {
        return this.v1;
    }

    public final void setV1$animation_core_release(float f) {
        this.v1 = f;
    }

    public final float getV2() {
        return this.v2;
    }

    public final void setV2$animation_core_release(float f) {
        this.v2 = f;
    }

    public final float getV3() {
        return this.v3;
    }

    public final void setV3$animation_core_release(float f) {
        this.v3 = f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void reset$animation_core_release() {
        this.v1 = 0.0f;
        this.v2 = 0.0f;
        this.v3 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final AnimationVector3D newVector$animation_core_release() {
        return new AnimationVector3D(0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final float get$animation_core_release(int p0) {
        if (p0 == 0) {
            return this.v1;
        }
        if (p0 == 1) {
            return this.v2;
        }
        if (p0 != 2) {
            return 0.0f;
        }
        return this.v3;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void set$animation_core_release(int p0, float p1) {
        if (p0 == 0) {
            this.v1 = p1;
        } else if (p0 == 1) {
            this.v2 = p1;
        } else {
            if (p0 != 2) {
                return;
            }
            this.v3 = p1;
        }
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: getSize$animation_core_release, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationVector3D: v1 = ");
        sb.append(this.v1);
        sb.append(", v2 = ");
        sb.append(this.v2);
        sb.append(", v3 = ");
        sb.append(this.v3);
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof AnimationVector3D)) {
            return false;
        }
        AnimationVector3D animationVector3D = (AnimationVector3D) p0;
        return animationVector3D.v1 == this.v1 && animationVector3D.v2 == this.v2 && animationVector3D.v3 == this.v3;
    }

    public final int hashCode() {
        return (((Float.hashCode(this.v1) * 31) + Float.hashCode(this.v2)) * 31) + Float.hashCode(this.v3);
    }
}
