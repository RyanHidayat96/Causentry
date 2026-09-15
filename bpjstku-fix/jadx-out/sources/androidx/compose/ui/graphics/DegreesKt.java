package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"", "p0", "degrees", "(F)F", "RadiansToDegrees", "F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DegreesKt {
    private static final float RadiansToDegrees = 57.29578f;

    public static final float degrees(float f) {
        return f * RadiansToDegrees;
    }
}
