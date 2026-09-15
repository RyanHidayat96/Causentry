package androidx.compose.animation.core;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0007\u001a'\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\n\u001a/\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\r\u001a\u001d\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000e*\u00028\u0000H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u000f*\u00020\u000e*\u00028\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000e*\u00028\u0000H\u0001¢\u0006\u0004\b\u0015\u0010\u0011"}, d2 = {"", "p0", "Landroidx/compose/animation/core/AnimationVector1D;", "AnimationVector", "(F)Landroidx/compose/animation/core/AnimationVector1D;", "p1", "Landroidx/compose/animation/core/AnimationVector2D;", "(FF)Landroidx/compose/animation/core/AnimationVector2D;", "p2", "Landroidx/compose/animation/core/AnimationVector3D;", "(FFF)Landroidx/compose/animation/core/AnimationVector3D;", "p3", "Landroidx/compose/animation/core/AnimationVector4D;", "(FFFF)Landroidx/compose/animation/core/AnimationVector4D;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_DIRECTION_TRUE, "copy", "(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "", "copyFrom", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "newInstance"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AnimationVectorsKt {
    public static final AnimationVector1D AnimationVector(float f) {
        return new AnimationVector1D(f);
    }

    public static final AnimationVector2D AnimationVector(float f, float f2) {
        return new AnimationVector2D(f, f2);
    }

    public static final AnimationVector3D AnimationVector(float f, float f2, float f3) {
        return new AnimationVector3D(f, f2, f3);
    }

    public static final AnimationVector4D AnimationVector(float f, float f2, float f3, float f4) {
        return new AnimationVector4D(f, f2, f3, f4);
    }

    public static final <T extends AnimationVector> T newInstance(T t) {
        T t2 = (T) t.newVector$animation_core_release();
        Intrinsics.checkNotNull(t2, "");
        return t2;
    }

    public static final <T extends AnimationVector> T copy(T t) {
        T t2 = (T) newInstance(t);
        int size = t2.getSize();
        for (int i = 0; i < size; i++) {
            t2.set$animation_core_release(i, t.get$animation_core_release(i));
        }
        return t2;
    }

    public static final <T extends AnimationVector> void copyFrom(T t, T t2) {
        int size = t.getSize();
        for (int i = 0; i < size; i++) {
            t.set$animation_core_release(i, t2.get$animation_core_release(i));
        }
    }
}
