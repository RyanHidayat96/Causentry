package androidx.compose.ui.input.indirect;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bR0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectTouchInputNode;", "Landroidx/compose/ui/input/indirect/IndirectTouchInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/indirect/IndirectTouchEvent;", "", "p0", "p1", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onIndirectTouchEvent", "(Landroidx/compose/ui/input/indirect/IndirectTouchEvent;)Z", "onPreIndirectTouchEvent", "onEvent", "Lkotlin/jvm/functions/Function1;", "getOnEvent", "()Lkotlin/jvm/functions/Function1;", "setOnEvent", "(Lkotlin/jvm/functions/Function1;)V", "onPreEvent", "getOnPreEvent", "setOnPreEvent"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class IndirectTouchInputNode extends Modifier.Node implements IndirectTouchInputModifierNode {
    private Function1<? super IndirectTouchEvent, Boolean> onEvent;
    private Function1<? super IndirectTouchEvent, Boolean> onPreEvent;

    public final Function1<IndirectTouchEvent, Boolean> getOnEvent() {
        return this.onEvent;
    }

    public final void setOnEvent(Function1<? super IndirectTouchEvent, Boolean> function1) {
        this.onEvent = function1;
    }

    public final Function1<IndirectTouchEvent, Boolean> getOnPreEvent() {
        return this.onPreEvent;
    }

    public final void setOnPreEvent(Function1<? super IndirectTouchEvent, Boolean> function1) {
        this.onPreEvent = function1;
    }

    public IndirectTouchInputNode(Function1<? super IndirectTouchEvent, Boolean> function1, Function1<? super IndirectTouchEvent, Boolean> function2) {
        this.onEvent = function1;
        this.onPreEvent = function2;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectTouchInputModifierNode
    public final boolean onIndirectTouchEvent(IndirectTouchEvent p0) {
        Function1<? super IndirectTouchEvent, Boolean> function1 = this.onEvent;
        return function1 != null && function1.invoke(p0).booleanValue();
    }

    @Override // androidx.compose.ui.input.indirect.IndirectTouchInputModifierNode
    public final boolean onPreIndirectTouchEvent(IndirectTouchEvent p0) {
        Function1<? super IndirectTouchEvent, Boolean> function1 = this.onPreEvent;
        return function1 != null && function1.invoke(p0).booleanValue();
    }
}
