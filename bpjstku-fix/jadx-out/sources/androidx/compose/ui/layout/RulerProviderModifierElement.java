package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/layout/RulerProviderModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/RulerProviderModifierNode;", "Landroidx/compose/ui/layout/InsetsListener;", "p0", "<init>", "(Landroidx/compose/ui/layout/InsetsListener;)V", "create", "()Landroidx/compose/ui/layout/RulerProviderModifierNode;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "", "update", "(Landroidx/compose/ui/layout/RulerProviderModifierNode;)V", "insetsListener", "Landroidx/compose/ui/layout/InsetsListener;", "getInsetsListener", "()Landroidx/compose/ui/layout/InsetsListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class RulerProviderModifierElement extends ModifierNodeElement<RulerProviderModifierNode> {
    private final InsetsListener insetsListener;

    public final InsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public RulerProviderModifierElement(InsetsListener insetsListener) {
        this.insetsListener = insetsListener;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: create */
    public final RulerProviderModifierNode getNode() {
        return new RulerProviderModifierNode(this.insetsListener);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.insetsListener.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object p0) {
        if (p0 == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = p0 instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) p0 : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.insetsListener : null) == this.insetsListener;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(RulerProviderModifierNode p0) {
        p0.setInsetsListener(this.insetsListener);
    }
}
