package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "", "<init>", "()V", "", "resetCachedX", "", "cachedX", "F", "getCachedX", "()F", "setCachedX", "(F)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextFieldPreparedSelectionState {
    public static final int $stable = 8;
    private float cachedX = Float.NaN;

    public final float getCachedX() {
        return this.cachedX;
    }

    public final void setCachedX(float f) {
        this.cachedX = f;
    }

    public final void resetCachedX() {
        this.cachedX = Float.NaN;
    }
}
