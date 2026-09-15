package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0007H\u0080\b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "p0", "", "p1", "", "binarySearch", "([FF)I", "", "toRadians", "(D)D"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ArcSpline_jvmKt {
    public static final double toRadians(double d) {
        return Math.toRadians(d);
    }

    public static final int binarySearch(float[] fArr, float f) {
        return ArraysKt.binarySearch$default(fArr, f, 0, 0, 6, (Object) null);
    }
}
