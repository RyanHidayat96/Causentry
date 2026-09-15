package androidx.compose.runtime.internal;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0005H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\u0002*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\u0007\u001a\u00020\u0002*\u00020\u00058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t"}, d2 = {"", "p0", "", "equalsWithNanFix", "(FF)Z", "", "(DD)Z", "isNan", "(F)Z", "(D)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FloatingPointEquality_androidKt {
    public static final boolean equalsWithNanFix(double d, double d2) {
        return d == d2;
    }

    public static final boolean equalsWithNanFix(float f, float f2) {
        return f == f2;
    }

    public static final boolean isNan(float f) {
        return (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) > 2139095040;
    }

    public static final boolean isNan(double d) {
        return (Double.doubleToRawLongBits(d) & Long.MAX_VALUE) > 9218868437227405312L;
    }
}
