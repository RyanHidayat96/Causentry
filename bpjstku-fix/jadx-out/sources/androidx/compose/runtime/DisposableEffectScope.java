package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00072\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/runtime/DisposableEffectScope;", "", "<init>", "()V", "Lkotlin/Function0;", "", "p0", "Landroidx/compose/runtime/DisposableEffectResult;", "onDispose", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/DisposableEffectResult;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DisposableEffectScope {
    public static final int $stable = 0;

    public final DisposableEffectResult onDispose(final Function0<Unit> p0) {
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.DisposableEffectScope.onDispose.1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                p0.invoke();
            }
        };
    }
}
