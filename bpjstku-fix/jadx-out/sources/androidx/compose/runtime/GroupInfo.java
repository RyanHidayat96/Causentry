package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0011\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r"}, d2 = {"Landroidx/compose/runtime/GroupInfo;", "", "", "p0", "p1", "p2", "<init>", "(III)V", "slotIndex", "I", "getSlotIndex", "()I", "setSlotIndex", "(I)V", "nodeIndex", "getNodeIndex", "setNodeIndex", "nodeCount", "getNodeCount", "setNodeCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class GroupInfo {
    private int nodeCount;
    private int nodeIndex;
    private int slotIndex;

    public GroupInfo(int i, int i2, int i3) {
        this.slotIndex = i;
        this.nodeIndex = i2;
        this.nodeCount = i3;
    }

    public final int getSlotIndex() {
        return this.slotIndex;
    }

    public final void setSlotIndex(int i) {
        this.slotIndex = i;
    }

    public final int getNodeIndex() {
        return this.nodeIndex;
    }

    public final void setNodeIndex(int i) {
        this.nodeIndex = i;
    }

    public final int getNodeCount() {
        return this.nodeCount;
    }

    public final void setNodeCount(int i) {
        this.nodeCount = i;
    }
}
