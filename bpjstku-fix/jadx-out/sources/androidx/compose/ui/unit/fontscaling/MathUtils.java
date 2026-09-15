package androidx.compose.ui.unit.fontscaling;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ5\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/MathUtils;", "", "<init>", "()V", "", "p0", "p1", "p2", "lerp", "(FFF)F", "lerpInv", "p3", "p4", "constrainedMap", "(FFFFF)F"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MathUtils {
    public static final int $stable = 0;
    public static final MathUtils INSTANCE = new MathUtils();

    public final float lerp(float p0, float p1, float p2) {
        return p0 + ((p1 - p0) * p2);
    }

    public final float lerpInv(float p0, float p1, float p2) {
        if (p0 == p1) {
            return 0.0f;
        }
        return (p2 - p0) / (p1 - p0);
    }

    private MathUtils() {
    }

    public final float constrainedMap(float p0, float p1, float p2, float p3, float p4) {
        return lerp(p0, p1, Math.max(0.0f, Math.min(1.0f, lerpInv(p2, p3, p4))));
    }
}
