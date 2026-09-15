package androidx.compose.ui.semantics;

import android.graphics.Region;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/semantics/SemanticRegionImpl;", "Landroidx/compose/ui/semantics/SemanticsRegion;", "<init>", "()V", "Landroidx/compose/ui/unit/IntRect;", "p0", "", "set", "(Landroidx/compose/ui/unit/IntRect;)V", "", "intersect", "(Landroidx/compose/ui/semantics/SemanticsRegion;)Z", "difference", "(Landroidx/compose/ui/unit/IntRect;)Z", "Landroid/graphics/Region;", "region", "Landroid/graphics/Region;", "getRegion", "()Landroid/graphics/Region;", "getBounds", "()Landroidx/compose/ui/unit/IntRect;", "bounds", "isEmpty", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SemanticRegionImpl implements SemanticsRegion {
    private final Region region = new Region();

    public final Region getRegion() {
        return this.region;
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public final void set(IntRect p0) {
        this.region.set(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom());
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public final IntRect getBounds() {
        return RectHelper_androidKt.toComposeIntRect(this.region.getBounds());
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public final boolean isEmpty() {
        return this.region.isEmpty();
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public final boolean intersect(SemanticsRegion p0) {
        Region region = this.region;
        Intrinsics.checkNotNull(p0, "");
        return region.op(((SemanticRegionImpl) p0).region, Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public final boolean difference(IntRect p0) {
        return this.region.op(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom(), Region.Op.DIFFERENCE);
    }
}
