package androidx.compose.ui.input.indirect;

import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectTouchInputModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/input/indirect/IndirectTouchEvent;", "p0", "", "onIndirectTouchEvent", "(Landroidx/compose/ui/input/indirect/IndirectTouchEvent;)Z", "onPreIndirectTouchEvent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IndirectTouchInputModifierNode extends DelegatableNode {
    boolean onIndirectTouchEvent(IndirectTouchEvent p0);

    boolean onPreIndirectTouchEvent(IndirectTouchEvent p0);
}
