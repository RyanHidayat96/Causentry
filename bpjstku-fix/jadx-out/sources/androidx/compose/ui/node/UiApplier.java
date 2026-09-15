package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0012"}, d2 = {"Landroidx/compose/ui/node/UiApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/node/LayoutNode;", "p0", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "p1", "", "insertTopDown", "(ILandroidx/compose/ui/node/LayoutNode;)V", "insertBottomUp", "remove", "(II)V", "p2", "move", "(III)V", "onClear", "()V", "onEndChanges", "reuse"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UiApplier extends AbstractApplier<LayoutNode> {
    public static final int $stable = AbstractApplier.$stable;

    @Override // androidx.compose.runtime.Applier
    public final void insertTopDown(int p0, LayoutNode p1) {
    }

    public UiApplier(LayoutNode layoutNode) {
        super(layoutNode);
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertBottomUp(int p0, LayoutNode p1) {
        getCurrent().insertAt$ui_release(p0, p1);
    }

    @Override // androidx.compose.runtime.Applier
    public final void remove(int p0, int p1) {
        getCurrent().removeAt$ui_release(p0, p1);
    }

    @Override // androidx.compose.runtime.Applier
    public final void move(int p0, int p1, int p2) {
        getCurrent().move$ui_release(p0, p1, p2);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final void onClear() {
        getRoot().removeAll$ui_release();
    }

    @Override // androidx.compose.runtime.Applier
    public final void onEndChanges() {
        super.onEndChanges();
        Owner owner = getRoot().getOwner();
        if (owner != null) {
            owner.onEndApplyChanges();
        }
    }

    @Override // androidx.compose.runtime.Applier
    public final void reuse() {
        getCurrent().onReuse();
    }
}
