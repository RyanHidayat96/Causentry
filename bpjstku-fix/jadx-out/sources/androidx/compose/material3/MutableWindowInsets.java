package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\bR+\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00018G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0004"}, d2 = {"Landroidx/compose/material3/MutableWindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "p0", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "Landroidx/compose/ui/unit/Density;", "", "getBottom", "(Landroidx/compose/ui/unit/Density;)I", "Landroidx/compose/ui/unit/LayoutDirection;", "p1", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getRight", "getTop", "insets$delegate", "Landroidx/compose/runtime/MutableState;", "getInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "setInsets", "insets"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableWindowInsets implements WindowInsets {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: insets$delegate, reason: from kotlin metadata */
    private final MutableState insets;

    public MutableWindowInsets(WindowInsets windowInsets) {
        this.insets = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, null, 2, null);
    }

    public /* synthetic */ MutableWindowInsets(WindowInsets windowInsets, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? WindowInsetsKt.WindowInsets(0, 0, 0, 0) : windowInsets);
    }

    public final WindowInsets getInsets() {
        return (WindowInsets) this.insets.getValue();
    }

    public final void setInsets(WindowInsets windowInsets) {
        this.insets.setValue(windowInsets);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density p0, LayoutDirection p1) {
        return getInsets().getLeft(p0, p1);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density p0) {
        return getInsets().getTop(p0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density p0, LayoutDirection p1) {
        return getInsets().getRight(p0, p1);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density p0) {
        return getInsets().getBottom(p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutableWindowInsets() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
