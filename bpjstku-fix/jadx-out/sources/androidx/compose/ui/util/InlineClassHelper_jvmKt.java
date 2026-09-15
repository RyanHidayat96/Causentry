package androidx.compose.ui.util;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\b\u0005\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\u000b"}, d2 = {"", "p0", "", "floatFromBits", "(I)F", "", "", "doubleFromBits", "(J)D", "fastRoundToInt", "(F)I", "(D)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InlineClassHelper_jvmKt {
    public static final float floatFromBits(int i) {
        return Float.intBitsToFloat(i);
    }

    public static final double doubleFromBits(long j) {
        return Double.longBitsToDouble(j);
    }

    public static final int fastRoundToInt(float f) {
        return Math.round(f);
    }

    public static final int fastRoundToInt(double d) {
        return (int) Math.round(d);
    }
}
