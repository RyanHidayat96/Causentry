package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMap;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\b\u0003\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010\"\u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J9\u0010%\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\f0$2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u001a\u00100\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00105\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010,R \u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<R\u0014\u0010>\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010,R\u001c\u0010?\u001a\u0004\u0018\u00010\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u00103R\u0014\u0010J\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010,R\u001a\u0010K\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\bK\u00101\u001a\u0004\bL\u00103"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiSelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "Landroidx/collection/LongIntMap;", "p0", "", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "p1", "", "p2", "p3", "", "p4", "Landroidx/compose/foundation/text/selection/Selection;", "p5", "<init>", "(Landroidx/collection/LongIntMap;Ljava/util/List;IIZLandroidx/compose/foundation/text/selection/Selection;)V", "Landroidx/collection/LongObjectMap;", "createSubSelections", "(Landroidx/compose/foundation/text/selection/Selection;)Landroidx/collection/LongObjectMap;", "Lkotlin/Function1;", "", "forEachMiddleInfo", "(Lkotlin/jvm/functions/Function1;)V", "", "getInfoListIndexBySelectableId", "(J)I", "shouldAnyInfoRecomputeSelection", "(Landroidx/compose/foundation/text/selection/MultiSelectionLayout;)Z", "shouldRecomputeSelection", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)Z", "slotToIndex", "(IZ)I", "startOrEndSlotToIndex", "", "toString", "()Ljava/lang/String;", "Landroidx/collection/MutableLongObjectMap;", "createAndPutSubSelection", "(Landroidx/collection/MutableLongObjectMap;Landroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/SelectableInfo;II)V", "Landroidx/compose/foundation/text/selection/CrossStatus;", "getCrossStatus", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "crossStatus", "getCurrentInfo", "()Landroidx/compose/foundation/text/selection/SelectableInfo;", "currentInfo", "getEndInfo", "endInfo", "endSlot", "I", "getEndSlot", "()I", "getFirstInfo", "firstInfo", "infoList", "Ljava/util/List;", "getInfoList", "()Ljava/util/List;", "isStartHandle", "Z", "()Z", "getLastInfo", "lastInfo", "previousSelection", "Landroidx/compose/foundation/text/selection/Selection;", "getPreviousSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "selectableIdToInfoListIndex", "Landroidx/collection/LongIntMap;", "getSelectableIdToInfoListIndex", "()Landroidx/collection/LongIntMap;", "getSize", "size", "getStartInfo", "startInfo", "startSlot", "getStartSlot"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class MultiSelectionLayout implements SelectionLayout {
    private final int endSlot;
    private final List<SelectableInfo> infoList;
    private final boolean isStartHandle;
    private final Selection previousSelection;
    private final LongIntMap selectableIdToInfoListIndex;
    private final int startSlot;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CrossStatus.values().length];
            try {
                iArr[CrossStatus.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CrossStatus.NOT_CROSSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CrossStatus.CROSSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MultiSelectionLayout(LongIntMap longIntMap, List<SelectableInfo> list, int i, int i2, boolean z, Selection selection) {
        this.selectableIdToInfoListIndex = longIntMap;
        this.infoList = list;
        this.startSlot = i;
        this.endSlot = i2;
        this.isStartHandle = z;
        this.previousSelection = selection;
        if (list.size() > 1) {
            return;
        }
        StringBuilder sb = new StringBuilder("MultiSelectionLayout requires an infoList size greater than 1, was ");
        sb.append(list.size());
        sb.append('.');
        throw new IllegalStateException(sb.toString().toString());
    }

    public final LongIntMap getSelectableIdToInfoListIndex() {
        return this.selectableIdToInfoListIndex;
    }

    public final List<SelectableInfo> getInfoList() {
        return this.infoList;
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
    /* JADX INFO: renamed from: isStartHandle, reason: from getter */
    public final boolean getIsStartHandle() {
        return this.isStartHandle;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final int getSize() {
        return this.infoList.size();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final CrossStatus getCrossStatus() {
        if (getStartSlot() < getEndSlot()) {
            return CrossStatus.NOT_CROSSED;
        }
        return getStartSlot() > getEndSlot() ? CrossStatus.CROSSED : this.infoList.get(getStartSlot() / 2).getRawCrossStatus();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getStartInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getStartSlot(), true));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getEndInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getEndSlot(), false));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: getCurrentInfo */
    public final SelectableInfo getInfo() {
        return getIsStartHandle() ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getFirstInfo() {
        return getCrossStatus() == CrossStatus.CROSSED ? getEndInfo() : getStartInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getLastInfo() {
        return getCrossStatus() == CrossStatus.CROSSED ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final void forEachMiddleInfo(Function1<? super SelectableInfo, Unit> p0) {
        int infoListIndexBySelectableId = getInfoListIndexBySelectableId(getFirstInfo().getSelectableId());
        int infoListIndexBySelectableId2 = getInfoListIndexBySelectableId(getLastInfo().getSelectableId());
        int i = infoListIndexBySelectableId + 1;
        if (i < infoListIndexBySelectableId2) {
            while (i < infoListIndexBySelectableId2) {
                p0.invoke(this.infoList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final boolean shouldRecomputeSelection(SelectionLayout p0) {
        if (getPreviousSelection() == null || p0 == null || !(p0 instanceof MultiSelectionLayout)) {
            return true;
        }
        MultiSelectionLayout multiSelectionLayout = (MultiSelectionLayout) p0;
        return (getIsStartHandle() == multiSelectionLayout.getIsStartHandle() && getStartSlot() == multiSelectionLayout.getStartSlot() && getEndSlot() == multiSelectionLayout.getEndSlot() && !shouldAnyInfoRecomputeSelection(multiSelectionLayout)) ? false : true;
    }

    private final boolean shouldAnyInfoRecomputeSelection(MultiSelectionLayout p0) {
        if (getSize() != p0.getSize()) {
            return true;
        }
        int size = this.infoList.size();
        for (int i = 0; i < size; i++) {
            if (this.infoList.get(i).shouldRecomputeSelection(p0.infoList.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final LongObjectMap<Selection> createSubSelections(final Selection p0) {
        if (p0.getStart().getSelectableId() == p0.getEnd().getSelectableId()) {
            if ((!p0.getHandlesCrossed() || p0.getStart().getOffset() < p0.getEnd().getOffset()) && (p0.getHandlesCrossed() || p0.getStart().getOffset() > p0.getEnd().getOffset())) {
                throw new IllegalStateException("unexpectedly miss-crossed selection: ".concat(String.valueOf(p0)).toString());
            }
            return LongObjectMapKt.longObjectMapOf(p0.getStart().getSelectableId(), p0);
        }
        final MutableLongObjectMap<Selection> mutableLongObjectMapMutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
        createAndPutSubSelection(mutableLongObjectMapMutableLongObjectMapOf, p0, getFirstInfo(), (p0.getHandlesCrossed() ? p0.getEnd() : p0.getStart()).getOffset(), getFirstInfo().getTextLength());
        forEachMiddleInfo(new Function1<SelectableInfo, Unit>() { // from class: androidx.compose.foundation.text.selection.MultiSelectionLayout$createSubSelections$2$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(SelectableInfo selectableInfo) {
                invoke2(selectableInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SelectableInfo selectableInfo) {
                this.this$0.createAndPutSubSelection(mutableLongObjectMapMutableLongObjectMapOf, p0, selectableInfo, 0, selectableInfo.getTextLength());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        createAndPutSubSelection(mutableLongObjectMapMutableLongObjectMapOf, p0, getLastInfo(), 0, (p0.getHandlesCrossed() ? p0.getStart() : p0.getEnd()).getOffset());
        return mutableLongObjectMapMutableLongObjectMapOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createAndPutSubSelection(MutableLongObjectMap<Selection> mutableLongObjectMap, Selection selection, SelectableInfo selectableInfo, int i, int i2) {
        Selection selectionMakeSingleLayoutSelection;
        if (selection.getHandlesCrossed()) {
            selectionMakeSingleLayoutSelection = selectableInfo.makeSingleLayoutSelection(i2, i);
        } else {
            selectionMakeSingleLayoutSelection = selectableInfo.makeSingleLayoutSelection(i, i2);
        }
        if (i > i2) {
            throw new IllegalStateException("minOffset should be less than or equal to maxOffset: ".concat(String.valueOf(selectionMakeSingleLayoutSelection)).toString());
        }
        mutableLongObjectMap.put(selectableInfo.getSelectableId(), selectionMakeSingleLayoutSelection);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(getIsStartHandle());
        sb.append(", startPosition=");
        boolean z = true;
        sb.append((getStartSlot() + 1) / 2.0f);
        sb.append(", endPosition=");
        sb.append((getEndSlot() + 1) / 2.0f);
        sb.append(", crossed=");
        sb.append(getCrossStatus());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List<SelectableInfo> list = this.infoList;
        int size = list.size();
        int i = 0;
        while (i < size) {
            SelectableInfo selectableInfo = list.get(i);
            if (z) {
                z = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(selectableInfo);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        sb.append(string);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    private final int startOrEndSlotToIndex(int p0, boolean p1) {
        int i = WhenMappings.$EnumSwitchMapping$0[getCrossStatus().ordinal()];
        if (i == 1) {
            p1 = true;
        } else if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (p1) {
                p1 = false;
            } else {
                p1 = true;
            }
        }
        return slotToIndex(p0, p1);
    }

    private final int slotToIndex(int p0, boolean p1) {
        return (p0 - (!p1 ? 1 : 0)) / 2;
    }

    private final int getInfoListIndexBySelectableId(long p0) {
        try {
            return this.selectableIdToInfoListIndex.get(p0);
        } catch (NoSuchElementException e2) {
            throw new IllegalStateException("Invalid selectableId: ".concat(String.valueOf(p0)), e2);
        }
    }
}
