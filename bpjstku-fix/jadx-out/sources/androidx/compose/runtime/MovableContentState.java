package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.ExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00000\n2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/runtime/MovableContentState;", "", "Landroidx/compose/runtime/SlotTable;", "p0", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/Applier;", "Landroidx/collection/ObjectList;", "Landroidx/compose/runtime/MovableContentStateReference;", "p1", "Landroidx/collection/ScatterMap;", "extractNestedStates$runtime", "(Landroidx/compose/runtime/Applier;Landroidx/collection/ObjectList;)Landroidx/collection/ScatterMap;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime", "()Landroidx/compose/runtime/SlotTable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MovableContentState {
    public static final int $stable = 8;
    private final SlotTable slotTable;

    public MovableContentState(SlotTable slotTable) {
        this.slotTable = slotTable;
    }

    /* JADX INFO: renamed from: getSlotTable$runtime, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer extractNestedStates$lambda$1(MovableContentState movableContentState, MovableContentStateReference movableContentStateReference) {
        return Integer.valueOf(movableContentState.slotTable.anchorIndex(movableContentStateReference.getAnchor()));
    }

    private static final void extractNestedStates$lambda$4$closeToGroupContaining(SlotWriter slotWriter, int i) {
        while (slotWriter.getParent() >= 0 && slotWriter.getCurrentGroupEnd() <= i) {
            slotWriter.skipToGroupEnd();
            slotWriter.endGroup();
        }
    }

    private static final void extractNestedStates$lambda$4$openParent(SlotWriter slotWriter, int i) {
        extractNestedStates$lambda$4$closeToGroupContaining(slotWriter, i);
        while (slotWriter.getCurrentGroup() != i && !slotWriter.isGroupEnd()) {
            if (i < ComposerKt.getNextGroup(slotWriter)) {
                slotWriter.startGroup();
            } else {
                slotWriter.skipGroup();
            }
        }
        if (slotWriter.getCurrentGroup() != i) {
            ComposerKt.composeImmediateRuntimeError("Unexpected slot table structure");
        }
        slotWriter.startGroup();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ScatterMap<MovableContentStateReference, MovableContentState> extractNestedStates$runtime(Applier<?> p0, ObjectList<MovableContentStateReference> p1) {
        boolean z;
        Object[] objArr = p1.content;
        int i = p1._size;
        Object[] objArr2 = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (true) {
            z = true;
            char c = 1;
            if (i4 >= i) {
                break;
            }
            if (!this.slotTable.ownsAnchor(((MovableContentStateReference) objArr[i4]).getAnchor())) {
                MutableObjectList mutableObjectList = new MutableObjectList(objArr2 == true ? 1 : 0, c == true ? 1 : 0, null);
                Object[] objArr3 = p1.content;
                int i5 = p1._size;
                for (int i6 = i2; i6 < i5; i6++) {
                    Object obj = objArr3[i6];
                    if (this.slotTable.ownsAnchor(((MovableContentStateReference) obj).getAnchor())) {
                        mutableObjectList.add(obj);
                    }
                }
                p1 = mutableObjectList;
                break;
            }
            i4++;
        }
        ObjectList objectListSortedBy = ExtensionsKt.sortedBy(p1, new Function1() { // from class: androidx.compose.runtime.MovableContentState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return MovableContentState.extractNestedStates$lambda$1(this.f$0, (MovableContentStateReference) obj2);
            }
        });
        if (objectListSortedBy.isEmpty()) {
            return ScatterMapKt.emptyScatterMap();
        }
        MutableScatterMap mutableScatterMapMutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
        SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
        try {
            Object[] objArr4 = objectListSortedBy.content;
            int i7 = objectListSortedBy._size;
            for (int i8 = i3; i8 < i7; i8++) {
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr4[i8];
                int iAnchorIndex = slotWriterOpenWriter.anchorIndex(movableContentStateReference.getAnchor());
                int iParent = slotWriterOpenWriter.parent(iAnchorIndex);
                extractNestedStates$lambda$4$closeToGroupContaining(slotWriterOpenWriter, iParent);
                extractNestedStates$lambda$4$openParent(slotWriterOpenWriter, iParent);
                slotWriterOpenWriter.advanceBy(iAnchorIndex - slotWriterOpenWriter.getCurrentGroup());
                mutableScatterMapMutableScatterMapOf.set(movableContentStateReference, ComposerKt.extractMovableContentAtCurrent(movableContentStateReference.getComposition(), movableContentStateReference, slotWriterOpenWriter, p0));
            }
            extractNestedStates$lambda$4$closeToGroupContaining(slotWriterOpenWriter, Integer.MAX_VALUE);
            Unit unit = Unit.INSTANCE;
            return mutableScatterMapMutableScatterMapOf;
        } finally {
            slotWriterOpenWriter.close(z2);
        }
    }
}
