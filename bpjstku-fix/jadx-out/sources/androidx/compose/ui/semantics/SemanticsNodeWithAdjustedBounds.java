package androidx.compose.ui.semantics;

import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNodeWithAdjustedBounds;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "p0", "Landroidx/compose/ui/unit/IntRect;", "p1", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/unit/IntRect;)V", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "getSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "adjustedBounds", "Landroidx/compose/ui/unit/IntRect;", "getAdjustedBounds", "()Landroidx/compose/ui/unit/IntRect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SemanticsNodeWithAdjustedBounds {
    public static final int $stable = 8;
    private final IntRect adjustedBounds;
    private final SemanticsNode semanticsNode;

    public SemanticsNodeWithAdjustedBounds(SemanticsNode semanticsNode, IntRect intRect) {
        this.semanticsNode = semanticsNode;
        this.adjustedBounds = intRect;
    }

    public final SemanticsNode getSemanticsNode() {
        return this.semanticsNode;
    }

    public final IntRect getAdjustedBounds() {
        return this.adjustedBounds;
    }
}
