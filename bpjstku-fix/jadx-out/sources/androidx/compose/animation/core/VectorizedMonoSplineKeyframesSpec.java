package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u001a\u0010\u0019J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R&\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00028\u00008\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b3\u0010'R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020.048\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00028\u00008\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b7\u0010'"}, d2 = {"Landroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "Landroidx/collection/IntList;", "p0", "Landroidx/collection/IntObjectMap;", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "p1", "", "p2", "p3", "", "p4", "<init>", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IIF)V", "findEntryForTimeMillis", "(I)I", "getEasedTimeFromIndex", "(II)F", "getEasing", "(I)Landroidx/compose/animation/core/Easing;", "", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "", "init", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "delayMillis", "I", "getDelayMillis", "()I", "durationMillis", "getDurationMillis", "keyframes", "Landroidx/collection/IntObjectMap;", "lastInitialValue", "Landroidx/compose/animation/core/AnimationVector;", "lastTargetValue", "Landroidx/compose/animation/core/MonoSpline;", "monoSpline", "Landroidx/compose/animation/core/MonoSpline;", "periodicBias", "F", "", "times", "[F", "timestamps", "Landroidx/collection/IntList;", "valueVector", "", "values", "[[F", "velocityVector"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VectorizedMonoSplineKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;
    private final IntObjectMap<Pair<V, Easing>> keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private MonoSpline monoSpline;
    private final float periodicBias;
    private float[] times;
    private final IntList timestamps;
    private V valueVector;
    private float[][] values;
    private V velocityVector;

    public VectorizedMonoSplineKeyframesSpec(IntList intList, IntObjectMap<Pair<V, Easing>> intObjectMap, int i, int i2, float f) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i;
        this.delayMillis = i2;
        this.periodicBias = f;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public final int getDelayMillis() {
        return this.delayMillis;
    }

    private final void init(V p0, V p1, V p2) {
        float[] fArr;
        float[] fArr2;
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(p0);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(p2);
            int size = this.timestamps.getSize();
            float[] fArr3 = new float[size];
            for (int i = 0; i < size; i++) {
                fArr3[i] = this.timestamps.get(i) / 1000.0f;
            }
            this.times = fArr3;
        }
        if (this.monoSpline != null && Intrinsics.areEqual(this.lastInitialValue, p0) && Intrinsics.areEqual(this.lastTargetValue, p1)) {
            return;
        }
        boolean zAreEqual = Intrinsics.areEqual(this.lastInitialValue, p0);
        boolean zAreEqual2 = Intrinsics.areEqual(this.lastTargetValue, p1);
        this.lastInitialValue = p0;
        this.lastTargetValue = p1;
        int size2 = p0.getSize();
        float[][] fArr4 = null;
        if (this.values == null) {
            int size3 = this.timestamps.getSize();
            float[][] fArr5 = new float[size3][];
            for (int i2 = 0; i2 < size3; i2++) {
                int i3 = this.timestamps.get(i2);
                if (i3 == 0) {
                    if (!this.keyframes.contains(i3)) {
                        fArr2 = new float[size2];
                        for (int i4 = 0; i4 < size2; i4++) {
                            fArr2[i4] = p0.get$animation_core_release(i4);
                        }
                    } else {
                        fArr = new float[size2];
                        Pair<V, Easing> pair = this.keyframes.get(i3);
                        Intrinsics.checkNotNull(pair);
                        V first = pair.getFirst();
                        for (int i5 = 0; i5 < size2; i5++) {
                            fArr[i5] = first.get$animation_core_release(i5);
                        }
                        fArr2 = fArr;
                    }
                } else {
                    if (i3 == getDurationMillis()) {
                        if (!this.keyframes.contains(i3)) {
                            fArr2 = new float[size2];
                            for (int i6 = 0; i6 < size2; i6++) {
                                fArr2[i6] = p1.get$animation_core_release(i6);
                            }
                        } else {
                            fArr = new float[size2];
                            Pair<V, Easing> pair2 = this.keyframes.get(i3);
                            Intrinsics.checkNotNull(pair2);
                            V first2 = pair2.getFirst();
                            for (int i7 = 0; i7 < size2; i7++) {
                                fArr[i7] = first2.get$animation_core_release(i7);
                            }
                        }
                    } else {
                        fArr = new float[size2];
                        Pair<V, Easing> pair3 = this.keyframes.get(i3);
                        Intrinsics.checkNotNull(pair3);
                        V first3 = pair3.getFirst();
                        for (int i8 = 0; i8 < size2; i8++) {
                            fArr[i8] = first3.get$animation_core_release(i8);
                        }
                    }
                    fArr2 = fArr;
                }
                fArr5[i2] = fArr2;
            }
            this.values = fArr5;
        } else {
            if (!zAreEqual && !this.keyframes.contains(0)) {
                float[][] fArr6 = this.values;
                if (fArr6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fArr6 = null;
                }
                int iBinarySearch$default = IntListExtensionKt.binarySearch$default(this.timestamps, 0, 0, 0, 6, null);
                float[] fArr7 = new float[size2];
                for (int i9 = 0; i9 < size2; i9++) {
                    fArr7[i9] = p0.get$animation_core_release(i9);
                }
                fArr6[iBinarySearch$default] = fArr7;
            }
            if (!zAreEqual2 && !this.keyframes.contains(getDurationMillis())) {
                float[][] fArr8 = this.values;
                if (fArr8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fArr8 = null;
                }
                int iBinarySearch$default2 = IntListExtensionKt.binarySearch$default(this.timestamps, getDurationMillis(), 0, 0, 6, null);
                float[] fArr9 = new float[size2];
                for (int i10 = 0; i10 < size2; i10++) {
                    fArr9[i10] = p1.get$animation_core_release(i10);
                }
                fArr8[iBinarySearch$default2] = fArr9;
            }
        }
        float[] fArr10 = this.times;
        if (fArr10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fArr10 = null;
        }
        float[][] fArr11 = this.values;
        if (fArr11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fArr4 = fArr11;
        }
        this.monoSpline = new MonoSpline(fArr10, fArr4, this.periodicBias);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getValueFromNanos(long p0, V p1, V p2, V p3) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, p0 / AnimationKt.MillisToNanos);
        if (this.keyframes.containsKey(iClampPlayTime)) {
            Pair<V, Easing> pair = this.keyframes.get(iClampPlayTime);
            Intrinsics.checkNotNull(pair);
            return pair.getFirst();
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return p2;
        }
        if (iClampPlayTime <= 0) {
            return p1;
        }
        init(p1, p2, p3);
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        MonoSpline monoSpline = this.monoSpline;
        if (monoSpline == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            monoSpline = null;
        }
        float easedTimeFromIndex = getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime);
        V v = this.valueVector;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            v = null;
        }
        monoSpline.getPos(easedTimeFromIndex, v, iFindEntryForTimeMillis);
        V v2 = this.valueVector;
        if (v2 != null) {
            return v2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getVelocityFromNanos(long p0, V p1, V p2, V p3) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, p0 / AnimationKt.MillisToNanos);
        if (iClampPlayTime < 0) {
            return p3;
        }
        init(p1, p2, p3);
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        MonoSpline monoSpline = this.monoSpline;
        if (monoSpline == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            monoSpline = null;
        }
        float easedTimeFromIndex = getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime);
        V v = this.velocityVector;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            v = null;
        }
        monoSpline.getSlope(easedTimeFromIndex, v, iFindEntryForTimeMillis);
        V v2 = this.velocityVector;
        if (v2 != null) {
            return v2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    private final Easing getEasing(int p0) {
        Easing second;
        Pair<V, Easing> pair = this.keyframes.get(this.timestamps.get(p0));
        return (pair == null || (second = pair.getSecond()) == null) ? EasingKt.getLinearEasing() : second;
    }

    private final float getEasedTimeFromIndex(int p0, int p1) {
        float f;
        if (p0 >= this.timestamps._size - 1) {
            f = p1;
        } else {
            int i = this.timestamps.get(p0);
            int i2 = this.timestamps.get(p0 + 1);
            if (p1 != i) {
                float f2 = i2 - i;
                return ((f2 * getEasing(p0).transform((p1 - i) / f2)) + i) / 1000.0f;
            }
            f = i;
        }
        return f / 1000.0f;
    }

    private final int findEntryForTimeMillis(int p0) {
        int iBinarySearch$default = IntListExtensionKt.binarySearch$default(this.timestamps, p0, 0, 0, 6, null);
        return iBinarySearch$default < -1 ? -(iBinarySearch$default + 2) : iBinarySearch$default;
    }
}
