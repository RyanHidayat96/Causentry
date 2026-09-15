package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Landroidx/compose/foundation/text/KeyboardActions;", "KeyboardActions", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/KeyboardActions;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class KeyboardActionsKt {
    public static final KeyboardActions KeyboardActions(Function1<? super KeyboardActionScope, Unit> function1) {
        return new KeyboardActions(function1, function1, function1, function1, function1, function1);
    }
}
