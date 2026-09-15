package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/layout/ExcludeInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "p0", "p1", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/layout/WindowInsets;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/unit/Density;", "", "getBottom", "(Landroidx/compose/ui/unit/Density;)I", "Landroidx/compose/ui/unit/LayoutDirection;", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getRight", "getTop", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "excluded", "Landroidx/compose/foundation/layout/WindowInsets;", "included"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ExcludeInsets implements WindowInsets {
    private final WindowInsets excluded;
    private final WindowInsets included;

    public ExcludeInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.included = windowInsets;
        this.excluded = windowInsets2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density p0, LayoutDirection p1) {
        return RangesKt.coerceAtLeast(this.included.getLeft(p0, p1) - this.excluded.getLeft(p0, p1), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density p0) {
        return RangesKt.coerceAtLeast(this.included.getTop(p0) - this.excluded.getTop(p0), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density p0, LayoutDirection p1) {
        return RangesKt.coerceAtLeast(this.included.getRight(p0, p1) - this.excluded.getRight(p0, p1), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density p0) {
        return RangesKt.coerceAtLeast(this.included.getBottom(p0) - this.excluded.getBottom(p0), 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.included);
        sb.append(" - ");
        sb.append(this.excluded);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ExcludeInsets)) {
            return false;
        }
        ExcludeInsets excludeInsets = (ExcludeInsets) p0;
        return Intrinsics.areEqual(excludeInsets.included, this.included) && Intrinsics.areEqual(excludeInsets.excluded, this.excluded);
    }

    public final int hashCode() {
        return (this.included.hashCode() * 31) + this.excluded.hashCode();
    }
}
