package androidx.compose.ui.layout;

import androidx.core.graphics.Insets;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a0\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0080\b¢\u0006\u0004\b\u0003\u0010\t\"\u001a\u0010\n\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u000e\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r"}, d2 = {"Landroidx/core/graphics/Insets;", "p0", "Landroidx/compose/ui/layout/ValueInsets;", "ValueInsets", "(Landroidx/core/graphics/Insets;)J", "", "p1", "p2", "p3", "(IIII)J", "ZeroValueInsets", "J", "getZeroValueInsets", "()J", "UnsetValueInsets", "getUnsetValueInsets"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ValueInsets_androidKt {
    private static final long ZeroValueInsets = ValueInsets.m5745constructorimpl(0);
    private static final long UnsetValueInsets = ValueInsets.m5745constructorimpl(-1);

    public static final long ValueInsets(Insets insets) {
        return ValueInsets.m5745constructorimpl((((long) insets.left) << 48) | (((long) insets.top) << 32) | (((long) insets.right) << 16) | ((long) insets.bottom));
    }

    public static final long ValueInsets(int i, int i2, int i3, int i4) {
        return ValueInsets.m5745constructorimpl((((long) i2) << 32) | (((long) i) << 48) | (((long) i3) << 16) | ((long) i4));
    }

    public static final long getZeroValueInsets() {
        return ZeroValueInsets;
    }

    public static final long getUnsetValueInsets() {
        return UnsetValueInsets;
    }
}
