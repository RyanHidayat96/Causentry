package androidx.compose.ui.input.indirect;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/indirect/IndirectTouchEvent;", "", "p0", "onIndirectTouchEvent", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "onPreIndirectTouchEvent"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IndirectTouchInputModifierKt {
    public static final Modifier onIndirectTouchEvent(Modifier modifier, Function1<? super IndirectTouchEvent, Boolean> function1) {
        return modifier.then(new IndirectTouchInputElement(function1, null));
    }

    public static final Modifier onPreIndirectTouchEvent(Modifier modifier, Function1<? super IndirectTouchEvent, Boolean> function1) {
        return modifier.then(new IndirectTouchInputElement(null, function1));
    }
}
