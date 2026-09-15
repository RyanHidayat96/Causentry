package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/Modifier$Node;", "nextDrawNode", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LayoutNodeDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node nextDrawNode(DelegatableNode delegatableNode) {
        int iM5928constructorimpl = NodeKind.m5928constructorimpl(4);
        int iM5928constructorimpl2 = NodeKind.m5928constructorimpl(2);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & iM5928constructorimpl) == 0) {
            return null;
        }
        while (child != null && (child.getKindSet() & iM5928constructorimpl2) == 0) {
            if ((child.getKindSet() & iM5928constructorimpl) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
