package androidx.compose.animation;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\b\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"", "p0", "p1", "computeDeceleration", "(FF)F", "DecelerationRate", "F", "GravityEarth", "InchesPerMeter"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FlingCalculatorKt {
    private static final float DecelerationRate = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final float GravityEarth = 9.80665f;
    private static final float InchesPerMeter = 39.37f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float computeDeceleration(float f, float f2) {
        return f2 * 386.0878f * 160.0f * f;
    }
}
