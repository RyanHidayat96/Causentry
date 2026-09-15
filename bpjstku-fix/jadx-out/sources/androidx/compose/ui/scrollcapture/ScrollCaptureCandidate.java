package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/ui/scrollcapture/ScrollCaptureCandidate;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "p0", "", "p1", "Landroidx/compose/ui/unit/IntRect;", "p2", "Landroidx/compose/ui/layout/LayoutCoordinates;", "p3", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;ILandroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/layout/LayoutCoordinates;)V", "", "toString", "()Ljava/lang/String;", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "getNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "depth", "I", "getDepth", "()I", "viewportBoundsInWindow", "Landroidx/compose/ui/unit/IntRect;", "getViewportBoundsInWindow", "()Landroidx/compose/ui/unit/IntRect;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ScrollCaptureCandidate {
    private final LayoutCoordinates coordinates;
    private final int depth;
    private final SemanticsNode node;
    private final IntRect viewportBoundsInWindow;

    public ScrollCaptureCandidate(SemanticsNode semanticsNode, int i, IntRect intRect, LayoutCoordinates layoutCoordinates) {
        this.node = semanticsNode;
        this.depth = i;
        this.viewportBoundsInWindow = intRect;
        this.coordinates = layoutCoordinates;
    }

    public final SemanticsNode getNode() {
        return this.node;
    }

    public final int getDepth() {
        return this.depth;
    }

    public final IntRect getViewportBoundsInWindow() {
        return this.viewportBoundsInWindow;
    }

    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollCaptureCandidate(node=");
        sb.append(this.node);
        sb.append(", depth=");
        sb.append(this.depth);
        sb.append(", viewportBoundsInWindow=");
        sb.append(this.viewportBoundsInWindow);
        sb.append(", coordinates=");
        sb.append(this.coordinates);
        sb.append(')');
        return sb.toString();
    }
}
