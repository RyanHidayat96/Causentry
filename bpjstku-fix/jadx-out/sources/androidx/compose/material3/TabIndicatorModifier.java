package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÇ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0013\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u0010\u0010\u001c\u001a\u00020\u001bH×\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020\u001e*\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010'\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0010R&\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u000e"}, d2 = {"Landroidx/compose/material3/TabIndicatorModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/TabIndicatorOffsetNode;", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/material3/TabPosition;", "p0", "", "p1", "", "p2", "<init>", "(Landroidx/compose/runtime/State;IZ)V", "component1", "()Landroidx/compose/runtime/State;", "component2", "()I", "component3", "()Z", "copy", "(Landroidx/compose/runtime/State;IZ)Landroidx/compose/material3/TabIndicatorModifier;", "create", "()Landroidx/compose/material3/TabIndicatorOffsetNode;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "", "update", "(Landroidx/compose/material3/TabIndicatorOffsetNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "followContentSize", "Z", "getFollowContentSize", "selectedTabIndex", "I", "getSelectedTabIndex", "tabPositionsState", "Landroidx/compose/runtime/State;", "getTabPositionsState"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TabIndicatorModifier extends ModifierNodeElement<TabIndicatorOffsetNode> {
    public static final int $stable = 0;
    private final boolean followContentSize;
    private final int selectedTabIndex;
    private final State<List<TabPosition>> tabPositionsState;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public final State<List<TabPosition>> getTabPositionsState() {
        return this.tabPositionsState;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabIndicatorModifier(State<? extends List<TabPosition>> state, int i, boolean z) {
        this.tabPositionsState = state;
        this.selectedTabIndex = i;
        this.followContentSize = z;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: create */
    public final TabIndicatorOffsetNode getNode() {
        return new TabIndicatorOffsetNode(this.tabPositionsState, this.selectedTabIndex, this.followContentSize);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(TabIndicatorOffsetNode p0) {
        p0.setTabPositionsState(this.tabPositionsState);
        p0.setSelectedTabIndex(this.selectedTabIndex);
        p0.setFollowContentSize(this.followContentSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabIndicatorModifier copy$default(TabIndicatorModifier tabIndicatorModifier, State state, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            state = tabIndicatorModifier.tabPositionsState;
        }
        if ((i2 & 2) != 0) {
            i = tabIndicatorModifier.selectedTabIndex;
        }
        if ((i2 & 4) != 0) {
            z = tabIndicatorModifier.followContentSize;
        }
        return tabIndicatorModifier.copy(state, i, z);
    }

    public final State<List<TabPosition>> component1() {
        return this.tabPositionsState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    public final TabIndicatorModifier copy(State<? extends List<TabPosition>> p0, int p1, boolean p2) {
        return new TabIndicatorModifier(p0, p1, p2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TabIndicatorModifier)) {
            return false;
        }
        TabIndicatorModifier tabIndicatorModifier = (TabIndicatorModifier) p0;
        return Intrinsics.areEqual(this.tabPositionsState, tabIndicatorModifier.tabPositionsState) && this.selectedTabIndex == tabIndicatorModifier.selectedTabIndex && this.followContentSize == tabIndicatorModifier.followContentSize;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((this.tabPositionsState.hashCode() * 31) + Integer.hashCode(this.selectedTabIndex)) * 31) + Boolean.hashCode(this.followContentSize);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabIndicatorModifier(tabPositionsState=");
        sb.append(this.tabPositionsState);
        sb.append(", selectedTabIndex=");
        sb.append(this.selectedTabIndex);
        sb.append(", followContentSize=");
        sb.append(this.followContentSize);
        sb.append(')');
        return sb.toString();
    }
}
