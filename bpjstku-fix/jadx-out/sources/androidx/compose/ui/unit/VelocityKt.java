package androidx.compose.ui.unit;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "p0", "p1", "Landroidx/compose/ui/unit/Velocity;", "Velocity", "(FF)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class VelocityKt {
    public static final long Velocity(float f, float f2) {
        return Velocity.m7167constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }
}
