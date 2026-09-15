package androidx.compose.runtime;

import androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.runtime.tooling.CompositionInstance;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u0017*\u00020\u00038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010'R\u001a\u0010+\u001a\u0004\u0018\u00010(*\u00020\u00038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010#\u001a\u0004\u0018\u00010\u0003*\u00020\u00038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010,"}, d2 = {"Landroidx/compose/runtime/CompositionDataImpl;", "Landroidx/compose/runtime/tooling/CompositionData;", "Landroidx/compose/runtime/tooling/CompositionInstance;", "Landroidx/compose/runtime/Composition;", "p0", "<init>", "(Landroidx/compose/runtime/Composition;)V", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "find", "(Ljava/lang/Object;)Landroidx/compose/runtime/tooling/CompositionGroup;", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "findContextGroup", "()Landroidx/compose/runtime/tooling/CompositionGroup;", "composition", "Landroidx/compose/runtime/Composition;", "getComposition", "()Landroidx/compose/runtime/Composition;", "Landroidx/compose/runtime/SlotTable;", "getSlotTable", "()Landroidx/compose/runtime/SlotTable;", "slotTable", "", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "isEmpty", "()Z", "getParent", "()Landroidx/compose/runtime/tooling/CompositionInstance;", "parent", "getData", "()Landroidx/compose/runtime/tooling/CompositionData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Landroidx/compose/runtime/Composition;)Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/CompositionContext;", "getContext", "(Landroidx/compose/runtime/Composition;)Landroidx/compose/runtime/CompositionContext;", "context", "(Landroidx/compose/runtime/Composition;)Landroidx/compose/runtime/Composition;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompositionDataImpl implements CompositionData, CompositionInstance {
    public static final int $stable = 8;
    private final Composition composition;

    public CompositionDataImpl(Composition composition) {
        this.composition = composition;
    }

    public final Composition getComposition() {
        return this.composition;
    }

    private final SlotTable getSlotTable() {
        Composition composition = this.composition;
        Intrinsics.checkNotNull(composition, "");
        return ((CompositionImpl) composition).getSlotTable();
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final Iterable<CompositionGroup> getCompositionGroups() {
        return getSlotTable().getCompositionGroups();
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final boolean isEmpty() {
        return getSlotTable().isEmpty();
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final CompositionGroup find(Object p0) {
        return getSlotTable().find(p0);
    }

    public final int hashCode() {
        return this.composition.hashCode() * 31;
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof CompositionDataImpl) && Intrinsics.areEqual(this.composition, ((CompositionDataImpl) p0).composition);
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public final CompositionInstance getParent() {
        Composition parent = getParent(this.composition);
        return parent != null ? new CompositionDataImpl(parent) : null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public final CompositionData getData() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public final CompositionGroup findContextGroup() {
        SlotTable slotTable;
        CompositionContext context;
        Integer numFindSubcompositionContextGroup;
        Composition parent = getParent(this.composition);
        if (parent == null || (slotTable = getSlotTable(parent)) == null || (context = getContext(this.composition)) == null || (numFindSubcompositionContextGroup = ComposeStackTraceBuilderKt.findSubcompositionContextGroup(slotTable, context)) == null) {
            return null;
        }
        return SlotTableKt.compositionGroupOf(slotTable, numFindSubcompositionContextGroup.intValue());
    }

    private final SlotTable getSlotTable(Composition composition) {
        CompositionImpl compositionImpl = composition instanceof CompositionImpl ? (CompositionImpl) composition : null;
        if (compositionImpl != null) {
            return compositionImpl.getSlotTable();
        }
        return null;
    }

    private final CompositionContext getContext(Composition composition) {
        CompositionImpl compositionImpl = composition instanceof CompositionImpl ? (CompositionImpl) composition : null;
        if (compositionImpl != null) {
            return compositionImpl.getParent();
        }
        return null;
    }

    private final Composition getParent(Composition composition) {
        CompositionContext context = getContext(composition);
        if (context != null) {
            return context.getComposition$runtime();
        }
        return null;
    }
}
