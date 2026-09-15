package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÇ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010JD\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH×\u0001¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020\"*\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0012R\u001a\u0010+\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010\u0010R\u001a\u0010-\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b-\u0010\u0010R\u001a\u0010.\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u0010R\u001a\u00100\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u000e"}, d2 = {"Landroidx/compose/foundation/ScrollSemanticsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/ScrollSemanticsModifierNode;", "Landroidx/compose/foundation/ScrollState;", "p0", "", "p1", "Landroidx/compose/foundation/gestures/FlingBehavior;", "p2", "p3", "p4", "<init>", "(Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZZ)V", "component1", "()Landroidx/compose/foundation/ScrollState;", "component2", "()Z", "component3", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "component4", "component5", "copy", "(Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZZ)Landroidx/compose/foundation/ScrollSemanticsElement;", "create", "()Landroidx/compose/foundation/ScrollSemanticsModifierNode;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "update", "(Landroidx/compose/foundation/ScrollSemanticsModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "getFlingBehavior", "isScrollable", "Z", "isVertical", "reverseScrolling", "getReverseScrolling", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/foundation/ScrollState;", "getState"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class ScrollSemanticsElement extends ModifierNodeElement<ScrollSemanticsModifierNode> {
    private final FlingBehavior flingBehavior;
    private final boolean isScrollable;
    private final boolean isVertical;
    private final boolean reverseScrolling;
    private final ScrollState state;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public final ScrollState getState() {
        return this.state;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    public final boolean isScrollable() {
        return this.isScrollable;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public ScrollSemanticsElement(ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2, boolean z3) {
        this.state = scrollState;
        this.reverseScrolling = z;
        this.flingBehavior = flingBehavior;
        this.isScrollable = z2;
        this.isVertical = z3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: create */
    public final ScrollSemanticsModifierNode getNode() {
        return new ScrollSemanticsModifierNode(this.state, this.reverseScrolling, this.flingBehavior, this.isScrollable, this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(ScrollSemanticsModifierNode p0) {
        p0.setState(this.state);
        p0.setReverseScrolling(this.reverseScrolling);
        p0.setFlingBehavior(this.flingBehavior);
        p0.setScrollable(this.isScrollable);
        p0.setVertical(this.isVertical);
    }

    public static /* synthetic */ ScrollSemanticsElement copy$default(ScrollSemanticsElement scrollSemanticsElement, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            scrollState = scrollSemanticsElement.state;
        }
        if ((i & 2) != 0) {
            z = scrollSemanticsElement.reverseScrolling;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            flingBehavior = scrollSemanticsElement.flingBehavior;
        }
        FlingBehavior flingBehavior2 = flingBehavior;
        if ((i & 8) != 0) {
            z2 = scrollSemanticsElement.isScrollable;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = scrollSemanticsElement.isVertical;
        }
        return scrollSemanticsElement.copy(scrollState, z4, flingBehavior2, z5, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScrollState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsScrollable() {
        return this.isScrollable;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final ScrollSemanticsElement copy(ScrollState p0, boolean p1, FlingBehavior p2, boolean p3, boolean p4) {
        return new ScrollSemanticsElement(p0, p1, p2, p3, p4);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScrollSemanticsElement)) {
            return false;
        }
        ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) p0;
        return Intrinsics.areEqual(this.state, scrollSemanticsElement.state) && this.reverseScrolling == scrollSemanticsElement.reverseScrolling && Intrinsics.areEqual(this.flingBehavior, scrollSemanticsElement.flingBehavior) && this.isScrollable == scrollSemanticsElement.isScrollable && this.isVertical == scrollSemanticsElement.isVertical;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.state.hashCode();
        int iHashCode2 = Boolean.hashCode(this.reverseScrolling);
        FlingBehavior flingBehavior = this.flingBehavior;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (flingBehavior == null ? 0 : flingBehavior.hashCode())) * 31) + Boolean.hashCode(this.isScrollable)) * 31) + Boolean.hashCode(this.isVertical);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollSemanticsElement(state=");
        sb.append(this.state);
        sb.append(", reverseScrolling=");
        sb.append(this.reverseScrolling);
        sb.append(", flingBehavior=");
        sb.append(this.flingBehavior);
        sb.append(", isScrollable=");
        sb.append(this.isScrollable);
        sb.append(", isVertical=");
        sb.append(this.isVertical);
        sb.append(')');
        return sb.toString();
    }
}
