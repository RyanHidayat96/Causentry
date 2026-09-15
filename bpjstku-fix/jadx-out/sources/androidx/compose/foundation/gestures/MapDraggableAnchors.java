package androidx.compose.foundation.gestures;

import androidx.collection.ObjectFloatMap;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0013\u001a\u00020\u00122\"\u0010\u0004\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0011\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0018"}, d2 = {"Landroidx/compose/foundation/gestures/MapDraggableAnchors;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/gestures/DraggableAnchors;", "Landroidx/collection/ObjectFloatMap;", "p0", "<init>", "(Landroidx/collection/ObjectFloatMap;)V", "", "closestAnchor", "(F)Ljava/lang/Object;", "", "p1", "(FZ)Ljava/lang/Object;", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "hasAnchorFor", "", "hashCode", "()I", "maxAnchor", "()F", "minAnchor", "positionOf", "(Ljava/lang/Object;)F", "", "toString", "()Ljava/lang/String;", "anchors", "Landroidx/collection/ObjectFloatMap;", "getSize", "size"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class MapDraggableAnchors<T> implements DraggableAnchors<T> {
    private final ObjectFloatMap<T> anchors;

    public MapDraggableAnchors(ObjectFloatMap<T> objectFloatMap) {
        this.anchors = objectFloatMap;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final float positionOf(T p0) {
        return this.anchors.getOrDefault(p0, Float.NaN);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final boolean hasAnchorFor(T p0) {
        return this.anchors.containsKey(p0);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final T closestAnchor(float p0) {
        ObjectFloatMap<T> objectFloatMap = this.anchors;
        Object[] objArr = objectFloatMap.keys;
        float[] fArr = objectFloatMap.values;
        long[] jArr = objectFloatMap.metadata;
        int length = jArr.length - 2;
        T t = null;
        if (length >= 0) {
            float f = Float.POSITIVE_INFINITY;
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            float fAbs = Math.abs(p0 - fArr[i4]);
                            if (fAbs <= f) {
                                f = fAbs;
                                t = (T) obj;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return t;
                    }
                }
                if (i != length) {
                    i++;
                }
            }
        }
        return t;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final T closestAnchor(float p0, boolean p1) {
        ObjectFloatMap<T> objectFloatMap = this.anchors;
        Object[] objArr = objectFloatMap.keys;
        float[] fArr = objectFloatMap.values;
        long[] jArr = objectFloatMap.metadata;
        int length = jArr.length - 2;
        T t = null;
        if (length >= 0) {
            int i = 0;
            float f = Float.POSITIVE_INFINITY;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            float f2 = fArr[i4];
                            float f3 = p1 ? f2 - p0 : p0 - f2;
                            if (f3 < 0.0f) {
                                f3 = Float.POSITIVE_INFINITY;
                            }
                            if (f3 <= f) {
                                f = f3;
                                t = (T) obj;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return t;
                    }
                }
                if (i != length) {
                    i++;
                }
            }
        }
        return t;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final float minAnchor() {
        return AnchoredDraggableKt.minValueOrNaN(this.anchors);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final float maxAnchor() {
        return AnchoredDraggableKt.maxValueOrNaN(this.anchors);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final int getSize() {
        return this.anchors.get_size();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 instanceof MapDraggableAnchors) {
            return Intrinsics.areEqual(this.anchors, ((MapDraggableAnchors) p0).anchors);
        }
        return false;
    }

    public final int hashCode() {
        return this.anchors.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapDraggableAnchors(");
        sb.append(this.anchors);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final void forEach(Function2<? super T, ? super Float, Unit> p0) {
        ObjectFloatMap<T> objectFloatMap = this.anchors;
        Object[] objArr = objectFloatMap.keys;
        float[] fArr = objectFloatMap.values;
        long[] jArr = objectFloatMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        p0.invoke(objArr[i4], Float.valueOf(fArr[i4]));
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
