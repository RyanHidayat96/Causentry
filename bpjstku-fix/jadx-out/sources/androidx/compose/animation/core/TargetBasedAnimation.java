package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BG\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\rBG\b\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\u000fJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00028\u00018CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010(\u001a\u00028\u00008G¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010)\u001a\u00028\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001bR\u0014\u0010*\u001a\u00028\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001bR\u0014\u0010,\u001a\u00020+8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R*\u0010.\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00008\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u0010'\"\u0004\b1\u00102R*\u00103\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00008\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\b3\u0010/\u001a\u0004\b4\u0010'\"\u0004\b5\u00102R\u0014\u00107\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010'R\u0016\u00108\u001a\u00028\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u0010\u001bR&\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<"}, d2 = {"Landroidx/compose/animation/core/TargetBasedAnimation;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/Animation;", "Landroidx/compose/animation/core/AnimationSpec;", "p0", "Landroidx/compose/animation/core/TwoWayConverter;", "p1", "p2", "p3", "p4", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "", "getValueFromNanos", "(J)Ljava/lang/Object;", "getVelocityVectorFromNanos", "(J)Landroidx/compose/animation/core/AnimationVector;", "", "toString", "()Ljava/lang/String;", "_durationNanos", "J", "_endVelocity", "Landroidx/compose/animation/core/AnimationVector;", "animationSpec", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "getAnimationSpec$animation_core_release", "()Landroidx/compose/animation/core/VectorizedAnimationSpec;", "getDurationNanos", "()J", "durationNanos", "getEndVelocity", "()Landroidx/compose/animation/core/AnimationVector;", "endVelocity", "getInitialValue", "()Ljava/lang/Object;", "initialValue", "initialValueVector", "initialVelocityVector", "", "isInfinite", "()Z", "mutableInitialValue", "Ljava/lang/Object;", "getMutableInitialValue$animation_core_release", "setMutableInitialValue$animation_core_release", "(Ljava/lang/Object;)V", "mutableTargetValue", "getMutableTargetValue$animation_core_release", "setMutableTargetValue$animation_core_release", "getTargetValue", "targetValue", "targetValueVector", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 8;
    private long _durationNanos;
    private V _endVelocity;
    private final VectorizedAnimationSpec<V> animationSpec;
    private V initialValueVector;
    private final V initialVelocityVector;
    private T mutableInitialValue;
    private T mutableTargetValue;
    private V targetValueVector;
    private final TwoWayConverter<T, V> typeConverter;

    public TargetBasedAnimation(VectorizedAnimationSpec<V> vectorizedAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t, T t2, V v) {
        V v2;
        this.animationSpec = vectorizedAnimationSpec;
        this.typeConverter = twoWayConverter;
        this.mutableTargetValue = t2;
        this.mutableInitialValue = t;
        this.initialValueVector = getTypeConverter().getConvertToVector().invoke(t);
        this.targetValueVector = getTypeConverter().getConvertToVector().invoke(t2);
        this.initialVelocityVector = (v == null || (v2 = (V) AnimationVectorsKt.copy(v)) == null) ? (V) AnimationVectorsKt.newInstance(getTypeConverter().getConvertToVector().invoke(t)) : v2;
        this._durationNanos = -1L;
    }

    public /* synthetic */ TargetBasedAnimation(VectorizedAnimationSpec vectorizedAnimationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((VectorizedAnimationSpec<AnimationVector>) vectorizedAnimationSpec, (TwoWayConverter<Object, AnimationVector>) twoWayConverter, obj, obj2, (i & 16) != 0 ? null : animationVector);
    }

    public final VectorizedAnimationSpec<V> getAnimationSpec$animation_core_release() {
        return this.animationSpec;
    }

    @Override // androidx.compose.animation.core.Animation
    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getMutableTargetValue$animation_core_release() {
        return this.mutableTargetValue;
    }

    public final void setMutableTargetValue$animation_core_release(T t) {
        if (Intrinsics.areEqual(this.mutableTargetValue, t)) {
            return;
        }
        this.mutableTargetValue = t;
        this.targetValueVector = getTypeConverter().getConvertToVector().invoke(t);
        this._endVelocity = null;
        this._durationNanos = -1L;
    }

    public final T getMutableInitialValue$animation_core_release() {
        return this.mutableInitialValue;
    }

    public final void setMutableInitialValue$animation_core_release(T t) {
        if (Intrinsics.areEqual(t, this.mutableInitialValue)) {
            return;
        }
        this.mutableInitialValue = t;
        this.initialValueVector = getTypeConverter().getConvertToVector().invoke(t);
        this._endVelocity = null;
        this._durationNanos = -1L;
    }

    public final T getInitialValue() {
        return this.mutableInitialValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public final T getTargetValue() {
        return this.mutableTargetValue;
    }

    public /* synthetic */ TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((AnimationSpec<Object>) animationSpec, (TwoWayConverter<Object, AnimationVector>) twoWayConverter, obj, obj2, (i & 16) != 0 ? null : animationVector);
    }

    public TargetBasedAnimation(AnimationSpec<T> animationSpec, TwoWayConverter<T, V> twoWayConverter, T t, T t2, V v) {
        this(animationSpec.vectorize(twoWayConverter), twoWayConverter, t, t2, v);
    }

    @Override // androidx.compose.animation.core.Animation
    /* JADX INFO: renamed from: isInfinite */
    public final boolean getIsInfinite() {
        return this.animationSpec.isInfinite();
    }

    @Override // androidx.compose.animation.core.Animation
    public final T getValueFromNanos(long p0) {
        if (!isFinishedFromNanos(p0)) {
            AnimationVector valueFromNanos = this.animationSpec.getValueFromNanos(p0, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
            int size = valueFromNanos.getSize();
            for (int i = 0; i < size; i++) {
                if (Float.isNaN(valueFromNanos.get$animation_core_release(i))) {
                    StringBuilder sb = new StringBuilder("AnimationVector cannot contain a NaN. ");
                    sb.append(valueFromNanos);
                    sb.append(". Animation: ");
                    sb.append(this);
                    sb.append(", playTimeNanos: ");
                    sb.append(p0);
                    PreconditionsKt.throwIllegalStateException(sb.toString());
                }
            }
            return (T) getTypeConverter().getConvertFromVector().invoke(valueFromNanos);
        }
        return getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    public final long getDurationNanos() {
        if (this._durationNanos < 0) {
            this._durationNanos = this.animationSpec.getDurationNanos(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        }
        return this._durationNanos;
    }

    private final V getEndVelocity() {
        V v = this._endVelocity;
        if (v != null) {
            return v;
        }
        V v2 = (V) this.animationSpec.getEndVelocity(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        this._endVelocity = v2;
        return v2;
    }

    @Override // androidx.compose.animation.core.Animation
    public final V getVelocityVectorFromNanos(long p0) {
        if (!isFinishedFromNanos(p0)) {
            return (V) this.animationSpec.getVelocityFromNanos(p0, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        }
        return (V) getEndVelocity();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TargetBasedAnimation: ");
        sb.append(getInitialValue());
        sb.append(" -> ");
        sb.append(getTargetValue());
        sb.append(",initial velocity: ");
        sb.append(this.initialVelocityVector);
        sb.append(", duration: ");
        sb.append(AnimationKt.getDurationMillis(this));
        sb.append(" ms,animationSpec: ");
        sb.append(this.animationSpec);
        return sb.toString();
    }
}
