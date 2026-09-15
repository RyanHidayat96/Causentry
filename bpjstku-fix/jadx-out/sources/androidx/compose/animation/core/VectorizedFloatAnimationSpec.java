package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ'\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00028\u00008\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00028\u00008\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00028\u00008\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "p0", "<init>", "(Landroidx/compose/animation/core/FloatAnimationSpec;)V", "Landroidx/compose/animation/core/Animations;", "(Landroidx/compose/animation/core/Animations;)V", "p1", "p2", "", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getEndVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "p3", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "anims", "Landroidx/compose/animation/core/Animations;", "endVelocityVector", "Landroidx/compose/animation/core/AnimationVector;", "valueVector", "velocityVector"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final Animations anims;
    private V endVelocityVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatAnimationSpec(Animations animations) {
        this.anims = animations;
    }

    public VectorizedFloatAnimationSpec(final FloatAnimationSpec floatAnimationSpec) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            public final FloatAnimationSpec get(int p0) {
                return floatAnimationSpec;
            }
        });
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getValueFromNanos(long p0, V p1, V p2, V p3) {
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
            v2.set$animation_core_release(i, this.anims.get(i).getValueFromNanos(p0, p1.get$animation_core_release(i), p2.get$animation_core_release(i), p3.get$animation_core_release(i)));
        }
        V v3 = this.valueVector;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getVelocityFromNanos(long p0, V p1, V p2, V p3) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(p3);
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
            v2.set$animation_core_release(i, this.anims.get(i).getVelocityFromNanos(p0, p1.get$animation_core_release(i), p2.get$animation_core_release(i), p3.get$animation_core_release(i)));
        }
        V v3 = this.velocityVector;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getEndVelocity(V p0, V p1, V p2) {
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) AnimationVectorsKt.newInstance(p2);
        }
        V v = this.endVelocityVector;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            v = null;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            V v2 = this.endVelocityVector;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                v2 = null;
            }
            v2.set$animation_core_release(i, this.anims.get(i).getEndVelocity(p0.get$animation_core_release(i), p1.get$animation_core_release(i), p2.get$animation_core_release(i)));
        }
        V v3 = this.endVelocityVector;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long getDurationNanos(V p0, V p1, V p2) {
        Iterator<Integer> it = RangesKt.until(0, p0.getSize()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            jMax = Math.max(jMax, this.anims.get(iNextInt).getDurationNanos(p0.get$animation_core_release(iNextInt), p1.get$animation_core_release(iNextInt), p2.get$animation_core_release(iNextInt)));
        }
        return jMax;
    }
}
