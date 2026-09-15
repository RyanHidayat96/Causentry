package androidx.compose.ui.input.indirect;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectTouchInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/indirect/IndirectTouchInputNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/indirect/IndirectTouchEvent;", "", "p0", "p1", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "create", "()Landroidx/compose/ui/input/indirect/IndirectTouchInputNode;", "", "update", "(Landroidx/compose/ui/input/indirect/IndirectTouchInputNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "onIndirectTouchEvent", "Lkotlin/jvm/functions/Function1;", "getOnIndirectTouchEvent", "()Lkotlin/jvm/functions/Function1;", "onPreIndirectTouchEvent", "getOnPreIndirectTouchEvent"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class IndirectTouchInputElement extends ModifierNodeElement<IndirectTouchInputNode> {
    private final Function1<IndirectTouchEvent, Boolean> onIndirectTouchEvent;
    private final Function1<IndirectTouchEvent, Boolean> onPreIndirectTouchEvent;

    public final Function1<IndirectTouchEvent, Boolean> getOnIndirectTouchEvent() {
        return this.onIndirectTouchEvent;
    }

    public final Function1<IndirectTouchEvent, Boolean> getOnPreIndirectTouchEvent() {
        return this.onPreIndirectTouchEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IndirectTouchInputElement(Function1<? super IndirectTouchEvent, Boolean> function1, Function1<? super IndirectTouchEvent, Boolean> function2) {
        this.onIndirectTouchEvent = function1;
        this.onPreIndirectTouchEvent = function2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final IndirectTouchInputNode create() {
        return new IndirectTouchInputNode(this.onIndirectTouchEvent, this.onPreIndirectTouchEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(IndirectTouchInputNode p0) {
        p0.setOnEvent(this.onIndirectTouchEvent);
        p0.setOnPreEvent(this.onPreIndirectTouchEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        Function1<IndirectTouchEvent, Boolean> function1 = this.onIndirectTouchEvent;
        if (function1 != null) {
            inspectorInfo.setName("onIndirectTouchEvent");
            inspectorInfo.getProperties().set("onIndirectTouchEvent", function1);
        }
        Function1<IndirectTouchEvent, Boolean> function2 = this.onPreIndirectTouchEvent;
        if (function2 != null) {
            inspectorInfo.setName("onPreIndirectTouchEvent");
            inspectorInfo.getProperties().set("onPreIndirectTouchEvent", function2);
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof IndirectTouchInputElement)) {
            return false;
        }
        IndirectTouchInputElement indirectTouchInputElement = (IndirectTouchInputElement) p0;
        return this.onIndirectTouchEvent == indirectTouchInputElement.onIndirectTouchEvent && this.onPreIndirectTouchEvent == indirectTouchInputElement.onPreIndirectTouchEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        Function1<IndirectTouchEvent, Boolean> function1 = this.onIndirectTouchEvent;
        int iHashCode = function1 != null ? function1.hashCode() : 0;
        Function1<IndirectTouchEvent, Boolean> function2 = this.onPreIndirectTouchEvent;
        return (iHashCode * 31) + (function2 != null ? function2.hashCode() : 0);
    }
}
