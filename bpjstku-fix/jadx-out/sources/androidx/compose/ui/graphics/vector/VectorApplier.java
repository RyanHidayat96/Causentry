package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/graphics/vector/VNode;", "p0", "<init>", "(Landroidx/compose/ui/graphics/vector/VNode;)V", "", "p1", "", "insertTopDown", "(ILandroidx/compose/ui/graphics/vector/VNode;)V", "insertBottomUp", "remove", "(II)V", "onClear", "()V", "p2", "move", "(III)V", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "asGroup", "(Landroidx/compose/ui/graphics/vector/VNode;)Landroidx/compose/ui/graphics/vector/GroupComponent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VectorApplier extends AbstractApplier<VNode> {
    public static final int $stable = AbstractApplier.$stable;

    @Override // androidx.compose.runtime.Applier
    public final void insertTopDown(int p0, VNode p1) {
    }

    public VectorApplier(VNode vNode) {
        super(vNode);
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertBottomUp(int p0, VNode p1) {
        asGroup(getCurrent()).insertAt(p0, p1);
    }

    @Override // androidx.compose.runtime.Applier
    public final void remove(int p0, int p1) {
        asGroup(getCurrent()).remove(p0, p1);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final void onClear() {
        GroupComponent groupComponentAsGroup = asGroup(getRoot());
        groupComponentAsGroup.remove(0, groupComponentAsGroup.getNumChildren());
    }

    @Override // androidx.compose.runtime.Applier
    public final void move(int p0, int p1, int p2) {
        asGroup(getCurrent()).move(p0, p1, p2);
    }

    private final GroupComponent asGroup(VNode vNode) {
        if (vNode instanceof GroupComponent) {
            return (GroupComponent) vNode;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }
}
