package defpackage;

import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class getOutputFileOptions implements Function0<Object>, getRequestEdge {
    private final ToggleableState TuitionPaymentFragmentbindingInflater1;
    private final Function0<Object> b;

    public getOutputFileOptions(Function0<? extends Object> function0, ToggleableState toggleableState) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(toggleableState, "");
        this.b = function0;
        this.TuitionPaymentFragmentbindingInflater1 = toggleableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.b.invoke();
    }

    @Override // defpackage.getRequestEdge
    public final String TuitionPaymentFragmentbindingInflater1() {
        String name = this.b.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return name;
    }

    @Override // defpackage.getRequestEdge
    public final ToggleableState TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }
}
