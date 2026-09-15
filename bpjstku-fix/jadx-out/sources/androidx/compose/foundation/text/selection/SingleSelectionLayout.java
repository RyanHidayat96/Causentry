package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0002\u0018\u0000 92\u00020\u0001:\u00019B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0003\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u001a\u0010\"\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u0014\u0010(\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0014\u0010.\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001eR\u001c\u0010/\u001a\u0004\u0018\u00010\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010%R\u0014\u00106\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001eR\u001a\u00107\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b7\u0010#\u001a\u0004\b8\u0010%"}, d2 = {"Landroidx/compose/foundation/text/selection/SingleSelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "", "p0", "", "p1", "p2", "Landroidx/compose/foundation/text/selection/Selection;", "p3", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "p4", "<init>", "(ZIILandroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/SelectableInfo;)V", "Landroidx/collection/LongObjectMap;", "createSubSelections", "(Landroidx/compose/foundation/text/selection/Selection;)Landroidx/collection/LongObjectMap;", "Lkotlin/Function1;", "", "forEachMiddleInfo", "(Lkotlin/jvm/functions/Function1;)V", "shouldRecomputeSelection", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)Z", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/text/selection/CrossStatus;", "getCrossStatus", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "crossStatus", "getCurrentInfo", "()Landroidx/compose/foundation/text/selection/SelectableInfo;", "currentInfo", "getEndInfo", "endInfo", "endSlot", "I", "getEndSlot", "()I", "getFirstInfo", "firstInfo", "info", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "isStartHandle", "Z", "()Z", "getLastInfo", "lastInfo", "previousSelection", "Landroidx/compose/foundation/text/selection/Selection;", "getPreviousSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "getSize", "size", "getStartInfo", "startInfo", "startSlot", "getStartSlot", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SingleSelectionLayout implements SelectionLayout {
    public static final long DEFAULT_SELECTABLE_ID = 1;
    public static final int DEFAULT_SLOT = 1;
    private final int endSlot;
    private final SelectableInfo info;
    private final boolean isStartHandle;
    private final Selection previousSelection;
    private final int startSlot;

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final void forEachMiddleInfo(Function1<? super SelectableInfo, Unit> p0) {
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final int getSize() {
        return 1;
    }

    public SingleSelectionLayout(boolean z, int i, int i2, Selection selection, SelectableInfo selectableInfo) {
        this.isStartHandle = z;
        this.startSlot = i;
        this.endSlot = i2;
        this.previousSelection = selection;
        this.info = selectableInfo;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: isStartHandle, reason: from getter */
    public final boolean getIsStartHandle() {
        return this.isStartHandle;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final int getStartSlot() {
        return this.startSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final int getEndSlot() {
        return this.endSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final CrossStatus getCrossStatus() {
        if (getStartSlot() < getEndSlot()) {
            return CrossStatus.NOT_CROSSED;
        }
        return getStartSlot() > getEndSlot() ? CrossStatus.CROSSED : this.info.getRawCrossStatus();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getStartInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getEndInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: getCurrentInfo, reason: from getter */
    public final SelectableInfo getInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getFirstInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getLastInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final boolean shouldRecomputeSelection(SelectionLayout p0) {
        if (getPreviousSelection() == null || p0 == null || !(p0 instanceof SingleSelectionLayout)) {
            return true;
        }
        SingleSelectionLayout singleSelectionLayout = (SingleSelectionLayout) p0;
        return (getStartSlot() == singleSelectionLayout.getStartSlot() && getEndSlot() == singleSelectionLayout.getEndSlot() && getIsStartHandle() == singleSelectionLayout.getIsStartHandle() && !this.info.shouldRecomputeSelection(singleSelectionLayout.info)) ? false : true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final LongObjectMap<Selection> createSubSelections(Selection p0) {
        if ((!p0.getHandlesCrossed() && p0.getStart().getOffset() > p0.getEnd().getOffset()) || (p0.getHandlesCrossed() && p0.getStart().getOffset() <= p0.getEnd().getOffset())) {
            p0 = Selection.copy$default(p0, null, null, !p0.getHandlesCrossed(), 3, null);
        }
        return LongObjectMapKt.longObjectMapOf(this.info.getSelectableId(), p0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleSelectionLayout(isStartHandle=");
        sb.append(getIsStartHandle());
        sb.append(", crossed=");
        sb.append(getCrossStatus());
        sb.append(", info=\n\t");
        sb.append(this.info);
        sb.append(')');
        return sb.toString();
    }
}
