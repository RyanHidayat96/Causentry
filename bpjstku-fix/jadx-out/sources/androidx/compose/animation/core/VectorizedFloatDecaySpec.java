package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\f\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00128\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00028\u00008\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00028\u00008\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001e\u001a\u00028\u00008\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatDecaySpec;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "p0", "<init>", "(Landroidx/compose/animation/core/FloatDecayAnimationSpec;)V", "p1", "", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getTargetValue", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "p2", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "", "absVelocityThreshold", "F", "getAbsVelocityThreshold", "()F", "floatDecaySpec", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "getFloatDecaySpec", "()Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "targetVector", "Landroidx/compose/animation/core/AnimationVector;", "valueVector", "velocityVector"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {
    private final float absVelocityThreshold;
    private final FloatDecayAnimationSpec floatDecaySpec;
    private V targetVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatDecaySpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.floatDecaySpec = floatDecayAnimationSpec;
        this.absVelocityThreshold = floatDecayAnimationSpec.getAbsVelocityThreshold();
    }

    public final FloatDecayAnimationSpec getFloatDecaySpec() {
        return this.floatDecaySpec;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final V getValueFromNanos(long p0, V p1, V p2) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(p1);
        }
        V v = this.valueVector;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            v = null;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            V v2 = this.valueVector;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                v2 = null;
            }
            v2.set$animation_core_release(i, this.floatDecaySpec.getValueFromNanos(p0, p1.get$animation_core_release(i), p2.get$animation_core_release(i)));
        }
        V v3 = this.valueVector;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final long getDurationNanos(V p0, V p1) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(p0);
        }
        V v = this.velocityVector;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            v = null;
        }
        int size = v.getSize();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, this.floatDecaySpec.getDurationNanos(p0.get$animation_core_release(i), p1.get$animation_core_release(i)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final V getVelocityFromNanos(long p0, V p1, V p2) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(p1);
        }
        V v = this.velocityVector;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            v = null;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            V v2 = this.velocityVector;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                v2 = null;
            }
            v2.set$animation_core_release(i, this.floatDecaySpec.getVelocityFromNanos(p0, p1.get$animation_core_release(i), p2.get$animation_core_release(i)));
        }
        V v3 = this.velocityVector;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final V getTargetValue(V p0, V p1) {
        if (this.targetVector == null) {
            this.targetVector = (V) AnimationVectorsKt.newInstance(p0);
        }
        V v = this.targetVector;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            v = null;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            V v2 = this.targetVector;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                v2 = null;
            }
            v2.set$animation_core_release(i, this.floatDecaySpec.getTargetValue(p0.get$animation_core_release(i), p1.get$animation_core_release(i)));
        }
        V v3 = this.targetVector;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }
}
