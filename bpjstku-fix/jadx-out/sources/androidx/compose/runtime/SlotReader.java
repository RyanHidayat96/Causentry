package androidx.compose.runtime;

import androidx.compose.ui.spatial.RectListKt;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\bJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bJ\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0016¢\u0006\u0004\b\u0012\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u000bJ\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u000bJ\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\bJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u000eJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u000eJ\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001eJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020!¢\u0006\u0004\b$\u0010#J\r\u0010%\u001a\u00020!¢\u0006\u0004\b%\u0010#J\r\u0010&\u001a\u00020!¢\u0006\u0004\b&\u0010#J\r\u0010'\u001a\u00020!¢\u0006\u0004\b'\u0010#J\r\u0010(\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020!¢\u0006\u0004\b*\u0010#J\u0015\u0010+\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b-\u0010,J\r\u0010.\u001a\u00020!¢\u0006\u0004\b.\u0010#J\u0015\u00101\u001a\b\u0012\u0004\u0012\u0002000/H\u0007¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0017¢\u0006\u0004\b4\u00105J\u0019\u00106\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b6\u00107J\u001d\u0010\r\u001a\u0004\u0018\u00010\u0001*\u0002082\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u00109J\u001d\u0010:\u001a\u0004\u0018\u00010\u0001*\u0002082\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b:\u00109J\u001d\u0010;\u001a\u0004\u0018\u00010\u0001*\u0002082\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b;\u00109R\u001a\u0010<\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010@\u001a\u0002088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010D8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010CR6\u0010K\u001a\"\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020I\u0018\u00010Hj\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020I\u0018\u0001`J8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010LR$\u0010M\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\"\u0010Q\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010C\u001a\u0004\bR\u0010)\"\u0004\bS\u0010,R$\u0010T\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bT\u0010C\u001a\u0004\bU\u0010)R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bV\u0010)R\u0014\u0010X\u001a\u00020W8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u0010CR\u0016\u0010[\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010CR\u0016\u0010\\\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\\\u0010CR\u0011\u0010^\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b]\u0010)R\u0011\u0010`\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b_\u0010)R\u0011\u0010\n\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010PR\u0011\u0010\f\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\ba\u0010)R\u0011\u0010b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bb\u0010PR\u0011\u0010d\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bc\u0010PR\u0011\u0010\u000f\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\be\u0010)R\u0011\u0010\u0011\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bf\u0010)R\u0011\u0010\u0012\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bg\u0010)R\u0011\u0010i\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bh\u0010)R\u0011\u0010\u0013\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bj\u0010PR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00018G¢\u0006\u0006\u001a\u0004\bk\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00018G¢\u0006\u0006\u001a\u0004\bl\u0010 R\u0013\u0010n\u001a\u0004\u0018\u00010\u00018G¢\u0006\u0006\u001a\u0004\bm\u0010 R\u0011\u0010p\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bo\u0010)R\u0011\u0010r\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bq\u0010)R\u0011\u0010t\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bs\u0010)R$\u0010u\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bu\u0010N\u001a\u0004\bv\u0010P"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "Landroidx/compose/runtime/SlotTable;", "p0", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "", "parent", "(I)I", "", "isNode", "(I)Z", "nodeCount", "node", "(I)Ljava/lang/Object;", "groupSize", "slotSize", "groupEnd", "groupKey", "hasObjectKey", "groupObjectKey", "groupAux", "Landroidx/compose/runtime/Anchor;", "(Landroidx/compose/runtime/Anchor;)I", "hasMark", "containsMark", "parentOf", "get", "groupGet", "p1", "(II)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "", "beginEmpty", "()V", "endEmpty", "close", "startGroup", "startNode", "skipGroup", "()I", "skipToGroupEnd", "reposition", "(I)V", "restoreParent", "endGroup", "", "Landroidx/compose/runtime/KeyInfo;", "extractKeys", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "anchor", "(I)Landroidx/compose/runtime/Anchor;", "", "([II)Ljava/lang/Object;", "aux", "objectKey", "table", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "groups", "[I", "groupsSize", "I", "", "slots", "[Ljava/lang/Object;", "slotsSize", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/TuitionPaymentFragmentbindingInflater1;", "sourceInformationMap", "Ljava/util/HashMap;", "closed", "Z", "getClosed", "()Z", "currentGroup", "getCurrentGroup", "setCurrentGroup", "currentEnd", "getCurrentEnd", "getParent", "Landroidx/compose/runtime/IntStack;", "currentSlotStack", "Landroidx/compose/runtime/IntStack;", "emptyCount", "currentSlot", "currentSlotEnd", "getSize", "size", "getSlot", "slot", "getNodeCount", "isGroupEnd", "getInEmpty", "inEmpty", "getGroupSize", "getGroupEnd", "getGroupKey", "getGroupSlotIndex", "groupSlotIndex", "getHasObjectKey", "getGroupObjectKey", "getGroupAux", "getGroupNode", "groupNode", "getParentNodes", "parentNodes", "getRemainingSlots", "remainingSlots", "getGroupSlotCount", "groupSlotCount", "hadNext", "getHadNext"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SlotReader {
    public static final int $stable = 8;
    private boolean closed;
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;
    private final IntStack currentSlotStack;
    private int emptyCount;
    private final int[] groups;
    private final int groupsSize;
    private boolean hadNext;
    private int parent;
    private Object[] slots;
    private final int slotsSize;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private final SlotTable table;

    public SlotReader(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = slotTable.getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
        this.currentSlotStack = new IntStack();
    }

    /* JADX INFO: renamed from: getTable$runtime, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final void setCurrentGroup(int i) {
        this.currentGroup = i;
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getParent() {
        return this.parent;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final int parent(int p0) {
        return this.groups[(p0 * 5) + 2];
    }

    public final boolean isNode() {
        return (this.groups[(this.currentGroup * 5) + 1] & BasicMeasure.EXACTLY) != 0;
    }

    public final boolean isNode(int p0) {
        return (this.groups[(p0 * 5) + 1] & BasicMeasure.EXACTLY) != 0;
    }

    public final int getNodeCount() {
        return this.groups[(this.currentGroup * 5) + 1] & RectListKt.Lower26Bits;
    }

    public final int nodeCount(int p0) {
        return this.groups[(p0 * 5) + 1] & RectListKt.Lower26Bits;
    }

    public final Object node(int p0) {
        int[] iArr = this.groups;
        if ((iArr[(p0 * 5) + 1] & BasicMeasure.EXACTLY) != 0) {
            return node(iArr, p0);
        }
        return null;
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.currentGroup == this.currentEnd;
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getGroupSize() {
        return SlotTableKt.groupSize(this.groups, this.currentGroup);
    }

    public final int groupSize(int p0) {
        return SlotTableKt.groupSize(this.groups, p0);
    }

    public final int slotSize(int p0) {
        int i;
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, p0);
        int i2 = p0 + 1;
        if (i2 >= this.groupsSize) {
            i = this.slotsSize;
        } else {
            i = this.groups[(i2 * 5) + 4];
        }
        return i - iSlotAnchor;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int groupEnd(int p0) {
        return p0 + SlotTableKt.groupSize(this.groups, p0);
    }

    public final int getGroupKey() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return this.groups[i * 5];
        }
        return 0;
    }

    public final int groupKey(int p0) {
        return this.groups[p0 * 5];
    }

    public final int getGroupSlotIndex() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final boolean hasObjectKey(int p0) {
        return (this.groups[(p0 * 5) + 1] & 536870912) != 0;
    }

    public final boolean getHasObjectKey() {
        int i = this.currentGroup;
        return i < this.currentEnd && (this.groups[(i * 5) + 1] & 536870912) != 0;
    }

    public final Object getGroupObjectKey() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return objectKey(this.groups, i);
        }
        return null;
    }

    public final Object groupObjectKey(int p0) {
        return objectKey(this.groups, p0);
    }

    public final Object getGroupAux() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return aux(this.groups, i);
        }
        return 0;
    }

    public final Object groupAux(int p0) {
        return aux(this.groups, p0);
    }

    public final Object getGroupNode() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return node(this.groups, i);
        }
        return null;
    }

    public final int groupKey(Anchor p0) {
        if (p0.getValid()) {
            return this.groups[this.table.anchorIndex(p0) * 5];
        }
        return 0;
    }

    public final boolean hasMark(int p0) {
        return (this.groups[(p0 * 5) + 1] & 134217728) != 0;
    }

    public final boolean containsMark(int p0) {
        return (this.groups[(p0 * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0;
    }

    public final int getParentNodes() {
        int i = this.parent;
        if (i >= 0) {
            return this.groups[(i * 5) + 1] & RectListKt.Lower26Bits;
        }
        return 0;
    }

    public final int getRemainingSlots() {
        return this.currentSlotEnd - this.currentSlot;
    }

    public final int parentOf(int p0) {
        if (p0 < 0 || p0 >= this.groupsSize) {
            PreconditionsKt.throwIllegalArgumentException("Invalid group index ".concat(String.valueOf(p0)));
        }
        return this.groups[(p0 * 5) + 2];
    }

    public final int getGroupSlotCount() {
        int i;
        int i2 = this.currentGroup;
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i2);
        int i3 = i2 + 1;
        if (i3 >= this.groupsSize) {
            i = this.slotsSize;
        } else {
            i = this.groups[(i3 * 5) + 4];
        }
        return i - iSlotAnchor;
    }

    public final Object get(int p0) {
        int i = this.currentSlot + p0;
        return i < this.currentSlotEnd ? this.slots[i] : Composer.INSTANCE.getEmpty();
    }

    public final Object groupGet(int p0) {
        return groupGet(this.currentGroup, p0);
    }

    public final Object groupGet(int p0, int p1) {
        int i;
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, p0);
        int i2 = p0 + 1;
        if (i2 >= this.groupsSize) {
            i = this.slotsSize;
        } else {
            i = this.groups[(i2 * 5) + 4];
        }
        int i3 = iSlotAnchor + p1;
        return i3 < i ? this.slots[i3] : Composer.INSTANCE.getEmpty();
    }

    public final Object next() {
        int i;
        if (this.emptyCount > 0 || (i = this.currentSlot) >= this.currentSlotEnd) {
            this.hadNext = false;
            return Composer.INSTANCE.getEmpty();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.currentSlot = i + 1;
        return objArr[i];
    }

    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void endEmpty() {
        if (this.emptyCount <= 0) {
            PreconditionsKt.throwIllegalArgumentException("Unbalanced begin/end empty");
        }
        this.emptyCount--;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime(this, this.sourceInformationMap);
        this.slots = new Object[0];
    }

    public final void startGroup() {
        GroupSourceInformation groupSourceInformation;
        if (this.emptyCount <= 0) {
            int i = this.parent;
            int i2 = this.currentGroup;
            if (this.groups[(i2 * 5) + 2] != i) {
                PreconditionsKt.throwIllegalArgumentException("Invalid slot table detected");
            }
            HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
            if (map != null && (groupSourceInformation = map.get(anchor(i))) != null) {
                groupSourceInformation.reportGroup(this.table, i2);
            }
            IntStack intStack = this.currentSlotStack;
            int i3 = this.currentSlot;
            int i4 = this.currentSlotEnd;
            if (i3 == 0 && i4 == 0) {
                intStack.push(-1);
            } else {
                intStack.push(i3);
            }
            this.parent = i2;
            this.currentEnd = SlotTableKt.groupSize(this.groups, i2) + i2;
            int i5 = i2 + 1;
            this.currentGroup = i5;
            this.currentSlot = SlotTableKt.slotAnchor(this.groups, i2);
            this.currentSlotEnd = i2 >= this.groupsSize + (-1) ? this.slotsSize : this.groups[(i5 * 5) + 4];
        }
    }

    public final void startNode() {
        if (this.emptyCount <= 0) {
            if ((this.groups[(this.currentGroup * 5) + 1] & BasicMeasure.EXACTLY) == 0) {
                PreconditionsKt.throwIllegalArgumentException("Expected a node group");
            }
            startGroup();
        }
    }

    public final int skipGroup() {
        if (this.emptyCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip while in an empty region");
        }
        int[] iArr = this.groups;
        int i = this.currentGroup;
        int i2 = iArr[(i * 5) + 1];
        int i3 = (1073741824 & i2) == 0 ? 67108863 & i2 : 1;
        this.currentGroup = i + SlotTableKt.groupSize(iArr, i);
        return i3;
    }

    public final void skipToGroupEnd() {
        if (this.emptyCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip the enclosing group while in an empty region");
        }
        this.currentGroup = this.currentEnd;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void reposition(int p0) {
        if (this.emptyCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot reposition while in an empty region");
        }
        this.currentGroup = p0;
        int i = this.groupsSize;
        int i2 = p0 < i ? this.groups[(p0 * 5) + 2] : -1;
        if (i2 != this.parent) {
            this.parent = i2;
            if (i2 >= 0) {
                this.currentEnd = i2 + SlotTableKt.groupSize(this.groups, i2);
            } else {
                this.currentEnd = i;
            }
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
        }
    }

    public final void restoreParent(int p0) {
        int iGroupSize = SlotTableKt.groupSize(this.groups, p0) + p0;
        int i = this.currentGroup;
        if (i < p0 || i > iGroupSize) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(p0);
            sb.append(" is not a parent of ");
            sb.append(i);
            ComposerKt.composeImmediateRuntimeError(sb.toString());
        }
        this.parent = p0;
        this.currentEnd = iGroupSize;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void endGroup() {
        int iGroupSize;
        if (this.emptyCount == 0) {
            if (this.currentGroup != this.currentEnd) {
                ComposerKt.composeImmediateRuntimeError("endGroup() not called at the end of a group");
            }
            int[] iArr = this.groups;
            int i = iArr[(this.parent * 5) + 2];
            this.parent = i;
            if (i >= 0) {
                iGroupSize = SlotTableKt.groupSize(iArr, i) + i;
            } else {
                iGroupSize = this.groupsSize;
            }
            this.currentEnd = iGroupSize;
            int iPop = this.currentSlotStack.pop();
            if (iPop < 0) {
                this.currentSlot = 0;
                this.currentSlotEnd = 0;
            } else {
                this.currentSlot = iPop;
                this.currentSlotEnd = i >= this.groupsSize + (-1) ? this.slotsSize : this.groups[((i + 1) * 5) + 4];
            }
        }
    }

    public final List<KeyInfo> extractKeys() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount <= 0) {
            int iGroupSize = this.currentGroup;
            int i = 0;
            while (true) {
                int i2 = i;
                if (iGroupSize >= this.currentEnd) {
                    break;
                }
                int[] iArr = this.groups;
                int i3 = iGroupSize * 5;
                int i4 = iArr[i3];
                Object objObjectKey = objectKey(iArr, iGroupSize);
                int i5 = this.groups[i3 + 1];
                int i6 = (1073741824 & i5) == 0 ? i5 & RectListKt.Lower26Bits : 1;
                i = i2 + 1;
                arrayList.add(new KeyInfo(i4, objObjectKey, iGroupSize, i6, i2));
                iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
            }
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.currentGroup);
        sb.append(", key=");
        sb.append(getGroupKey());
        sb.append(", parent=");
        sb.append(this.parent);
        sb.append(", end=");
        sb.append(this.currentEnd);
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotReader.currentGroup;
        }
        return slotReader.anchor(i);
    }

    public final Anchor anchor(int p0) {
        ArrayList<Anchor> anchors$runtime = this.table.getAnchors$runtime();
        int iSearch = SlotTableKt.search(anchors$runtime, p0, this.groupsSize);
        if (iSearch < 0) {
            Anchor anchor = new Anchor(p0);
            anchors$runtime.add(-(iSearch + 1), anchor);
            return anchor;
        }
        return anchors$runtime.get(iSearch);
    }

    private final Object node(int[] iArr, int i) {
        int i2 = i * 5;
        if ((iArr[i2 + 1] & BasicMeasure.EXACTLY) == 0) {
            return Composer.INSTANCE.getEmpty();
        }
        return this.slots[iArr[i2 + 4]];
    }

    private final Object aux(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 268435456) != 0) {
            return this.slots[SlotTableKt.auxIndex(iArr, i)];
        }
        return Composer.INSTANCE.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 536870912) != 0) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, i)];
        }
        return null;
    }
}
