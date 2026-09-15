package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B;\b\u0016\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fBE\b\u0000\u0012\u0006\u0010\b\u001a\u00020\r\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u000b\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001e\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010 \u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0000H\u0017¢\u0006\u0004\b \u0010\u001fJ'\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010/\u001a\u00020\u00128\u0002X\u0083\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b/\u0010*R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00028\u00008\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00028\u00008\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b4\u00103R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b;\u0010:R\u0016\u0010<\u001a\u0002088\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b<\u0010:R\u0014\u0010=\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00028\u00008\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b?\u00103R\u0016\u0010@\u001a\u00028\u00008\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b@\u00103\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "", "", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "p0", "p1", "p2", "<init>", "(Ljava/util/Map;II)V", "Landroidx/collection/IntList;", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "p3", "p4", "Landroidx/compose/animation/core/ArcMode;", "p5", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "findEntryForTimeMillis", "(I)I", "", "getEasedTime", "(I)F", "", "getEasedTimeFromIndex", "(IIZ)F", "", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "", "init", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/ArcSpline;", "arcSpline", "Landroidx/compose/animation/core/ArcSpline;", "defaultEasing", "Landroidx/compose/animation/core/Easing;", "delayMillis", "I", "getDelayMillis", "()I", "durationMillis", "getDurationMillis", "initialArcMode", "keyframes", "Landroidx/collection/IntObjectMap;", "lastInitialValue", "Landroidx/compose/animation/core/AnimationVector;", "lastTargetValue", "", "modes", "[I", "", "posArray", "[F", "slopeArray", "times", "timestamps", "Landroidx/collection/IntList;", "valueVector", "velocityVector"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private ArcSpline arcSpline;
    private final Easing defaultEasing;
    private final int delayMillis;
    private final int durationMillis;
    private final int initialArcMode;
    private final IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private int[] modes;
    private float[] posArray;
    private float[] slopeArray;
    private float[] times;
    private final IntList timestamps;
    private V valueVector;
    private V velocityVector;

    private VectorizedKeyframesSpec(IntList intList, IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> intObjectMap, int i, int i2, Easing easing, int i3) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i;
        this.delayMillis = i2;
        this.defaultEasing = easing;
        this.initialArcMode = i3;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public /* synthetic */ VectorizedKeyframesSpec(Map map, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, i, (i3 & 4) != 0 ? 0 : i2);
    }

    public VectorizedKeyframesSpec(Map<Integer, ? extends Pair<? extends V, ? extends Easing>> map, int i, int i2) {
        MutableIntList mutableIntList = new MutableIntList(map.size() + 2);
        Iterator<Map.Entry<Integer, ? extends Pair<? extends V, ? extends Easing>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            mutableIntList.add(it.next().getKey().intValue());
        }
        if (!map.containsKey(0)) {
            mutableIntList.add(0, 0);
        }
        if (!map.containsKey(Integer.valueOf(i))) {
            mutableIntList.add(i);
        }
        mutableIntList.sort();
        MutableIntList mutableIntList2 = mutableIntList;
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        for (Map.Entry<Integer, ? extends Pair<? extends V, ? extends Easing>> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Pair<? extends V, ? extends Easing> value = entry.getValue();
            mutableIntObjectMap.set(iIntValue, new VectorizedKeyframeSpecElementInfo(value.getFirst(), value.getSecond(), ArcMode.INSTANCE.m473getArcLinear9TMq4(), null));
        }
        this(mutableIntList2, mutableIntObjectMap, i, i2, EasingKt.getLinearEasing(), ArcMode.INSTANCE.m473getArcLinear9TMq4(), null);
    }

    private final void init(V p0, V p1, V p2) {
        float[] fArr;
        float[] fArr2;
        boolean z = this.arcSpline != null;
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(p0);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(p2);
            int size = this.timestamps.getSize();
            float[] fArr3 = new float[size];
            for (int i = 0; i < size; i++) {
                fArr3[i] = this.timestamps.get(i) / 1000.0f;
            }
            this.times = fArr3;
            int size2 = this.timestamps.getSize();
            int[] iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(this.timestamps.get(i2));
                int iM527getArcMode9TMq4 = vectorizedKeyframeSpecElementInfo != null ? vectorizedKeyframeSpecElementInfo.m527getArcMode9TMq4() : this.initialArcMode;
                if (!ArcMode.m467equalsimpl0(iM527getArcMode9TMq4, ArcMode.INSTANCE.m473getArcLinear9TMq4())) {
                    z = true;
                }
                iArr[i2] = iM527getArcMode9TMq4;
            }
            this.modes = iArr;
        }
        if (z) {
            float[] fArr4 = null;
            if (this.arcSpline != null) {
                V v = this.lastInitialValue;
                if (v == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    v = null;
                }
                if (Intrinsics.areEqual(v, p0)) {
                    V v2 = this.lastTargetValue;
                    if (v2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        v2 = null;
                    }
                    if (Intrinsics.areEqual(v2, p1)) {
                        return;
                    }
                }
            }
            this.lastInitialValue = p0;
            this.lastTargetValue = p1;
            int size3 = (p0.getSize() % 2) + p0.getSize();
            this.posArray = new float[size3];
            this.slopeArray = new float[size3];
            int size4 = this.timestamps.getSize();
            float[][] fArr5 = new float[size4][];
            for (int i3 = 0; i3 < size4; i3++) {
                int i4 = this.timestamps.get(i3);
                if (i4 == 0) {
                    if (!this.keyframes.contains(i4)) {
                        fArr2 = new float[size3];
                        for (int i5 = 0; i5 < size3; i5++) {
                            fArr2[i5] = p0.get$animation_core_release(i5);
                        }
                    } else {
                        fArr = new float[size3];
                        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo2 = this.keyframes.get(i4);
                        Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo2);
                        AnimationVector vectorValue = vectorizedKeyframeSpecElementInfo2.getVectorValue();
                        for (int i6 = 0; i6 < size3; i6++) {
                            fArr[i6] = vectorValue.get$animation_core_release(i6);
                        }
                        fArr2 = fArr;
                    }
                } else {
                    if (i4 == getDurationMillis()) {
                        if (!this.keyframes.contains(i4)) {
                            fArr2 = new float[size3];
                            for (int i7 = 0; i7 < size3; i7++) {
                                fArr2[i7] = p1.get$animation_core_release(i7);
                            }
                        } else {
                            fArr = new float[size3];
                            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo3 = this.keyframes.get(i4);
                            Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo3);
                            AnimationVector vectorValue2 = vectorizedKeyframeSpecElementInfo3.getVectorValue();
                            for (int i8 = 0; i8 < size3; i8++) {
                                fArr[i8] = vectorValue2.get$animation_core_release(i8);
                            }
                        }
                    } else {
                        fArr = new float[size3];
                        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo4 = this.keyframes.get(i4);
                        Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo4);
                        AnimationVector vectorValue3 = vectorizedKeyframeSpecElementInfo4.getVectorValue();
                        for (int i9 = 0; i9 < size3; i9++) {
                            fArr[i9] = vectorValue3.get$animation_core_release(i9);
                        }
                    }
                    fArr2 = fArr;
                }
                fArr5[i3] = fArr2;
            }
            int[] iArr2 = this.modes;
            if (iArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                iArr2 = null;
            }
            float[] fArr6 = this.times;
            if (fArr6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fArr4 = fArr6;
            }
            this.arcSpline = new ArcSpline(iArr2, fArr4, fArr5);
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getValueFromNanos(long p0, V p1, V p2, V p3) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, p0 / AnimationKt.MillisToNanos);
        if (this.keyframes.contains(iClampPlayTime)) {
            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(iClampPlayTime);
            Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo);
            return (V) vectorizedKeyframeSpecElementInfo.getVectorValue();
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return p2;
        }
        if (iClampPlayTime <= 0) {
            return p1;
        }
        init(p1, p2, p3);
        int i = 0;
        if (this.arcSpline != null) {
            float easedTime = getEasedTime(iClampPlayTime);
            ArcSpline arcSpline = this.arcSpline;
            if (arcSpline == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                arcSpline = null;
            }
            float[] fArr = this.posArray;
            if (fArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fArr = null;
            }
            arcSpline.getPos(easedTime, fArr);
            float[] fArr2 = this.posArray;
            if (fArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fArr2 = null;
            }
            int length = fArr2.length;
            while (i < length) {
                V v = this.valueVector;
                if (v == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    v = null;
                }
                float[] fArr3 = this.posArray;
                if (fArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fArr3 = null;
                }
                v.set$animation_core_release(i, fArr3[i]);
                i++;
            }
            V v2 = this.valueVector;
            if (v2 != null) {
                return v2;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        float easedTimeFromIndex = getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime, true);
        int i2 = this.timestamps.get(iFindEntryForTimeMillis);
        if (this.keyframes.contains(i2)) {
            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo2 = this.keyframes.get(i2);
            Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo2);
            p1 = (V) vectorizedKeyframeSpecElementInfo2.getVectorValue();
        }
        int i3 = this.timestamps.get(iFindEntryForTimeMillis + 1);
        if (this.keyframes.contains(i3)) {
            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo3 = this.keyframes.get(i3);
            Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo3);
            p2 = (V) vectorizedKeyframeSpecElementInfo3.getVectorValue();
        }
        V v3 = this.valueVector;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            v3 = null;
        }
        int size = v3.getSize();
        while (i < size) {
            V v4 = this.valueVector;
            if (v4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                v4 = null;
            }
            v4.set$animation_core_release(i, VectorConvertersKt.lerp(p1.get$animation_core_release(i), p2.get$animation_core_release(i), easedTimeFromIndex));
            i++;
        }
        V v5 = this.valueVector;
        if (v5 != null) {
            return v5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getVelocityFromNanos(long p0, V p1, V p2, V p3) {
        long jClampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, p0 / AnimationKt.MillisToNanos);
        if (jClampPlayTime < 0) {
            return p3;
        }
        init(p1, p2, p3);
        int i = 0;
        if (this.arcSpline != null) {
            float easedTime = getEasedTime((int) jClampPlayTime);
            ArcSpline arcSpline = this.arcSpline;
            if (arcSpline == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                arcSpline = null;
            }
            float[] fArr = this.slopeArray;
            if (fArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fArr = null;
            }
            arcSpline.getSlope(easedTime, fArr);
            float[] fArr2 = this.slopeArray;
            if (fArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fArr2 = null;
            }
            int length = fArr2.length;
            while (i < length) {
                V v = this.velocityVector;
                if (v == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    v = null;
                }
                float[] fArr3 = this.slopeArray;
                if (fArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fArr3 = null;
                }
                v.set$animation_core_release(i, fArr3[i]);
                i++;
            }
            V v2 = this.velocityVector;
            if (v2 != null) {
                return v2;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        VectorizedKeyframesSpec<V> vectorizedKeyframesSpec = this;
        AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(vectorizedKeyframesSpec, jClampPlayTime - 1, p1, p2, p3);
        AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(vectorizedKeyframesSpec, jClampPlayTime, p1, p2, p3);
        int size = valueFromMillis.getSize();
        while (i < size) {
            V v3 = this.velocityVector;
            if (v3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                v3 = null;
            }
            v3.set$animation_core_release(i, (valueFromMillis.get$animation_core_release(i) - valueFromMillis2.get$animation_core_release(i)) * 1000.0f);
            i++;
        }
        V v4 = this.velocityVector;
        if (v4 != null) {
            return v4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    private final float getEasedTime(int p0) {
        return getEasedTimeFromIndex(findEntryForTimeMillis(p0), p0, false);
    }

    private final float getEasedTimeFromIndex(int p0, int p1, boolean p2) {
        Easing easing;
        float f;
        if (p0 >= this.timestamps._size - 1) {
            f = p1;
        } else {
            int i = this.timestamps.get(p0);
            int i2 = this.timestamps.get(p0 + 1);
            if (p1 == i) {
                f = i;
            } else {
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(i);
                if (vectorizedKeyframeSpecElementInfo == null || (easing = vectorizedKeyframeSpecElementInfo.getEasing()) == null) {
                    easing = this.defaultEasing;
                }
                float f2 = i2 - i;
                float fTransform = easing.transform((p1 - i) / f2);
                if (p2) {
                    return fTransform;
                }
                f = (f2 * fTransform) + i;
            }
        }
        return f / 1000.0f;
    }

    private final int findEntryForTimeMillis(int p0) {
        int iBinarySearch$default = IntListExtensionKt.binarySearch$default(this.timestamps, p0, 0, 0, 6, null);
        return iBinarySearch$default < -1 ? -(iBinarySearch$default + 2) : iBinarySearch$default;
    }

    public /* synthetic */ VectorizedKeyframesSpec(IntList intList, IntObjectMap intObjectMap, int i, int i2, Easing easing, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(intList, intObjectMap, i, i2, easing, i3);
    }
}
