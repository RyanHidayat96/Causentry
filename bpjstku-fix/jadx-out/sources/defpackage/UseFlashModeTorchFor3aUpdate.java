package defpackage;

import android.view.View;
import com.bpjstku.util.custom.SingleClick$onClick$1$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
public final class UseFlashModeTorchFor3aUpdate implements View.OnClickListener {
    private final Function1<View, Unit> b;

    /* JADX WARN: Multi-variable type inference failed */
    public UseFlashModeTorchFor3aUpdate(Function1<? super View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.b = function1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        if (view != null) {
            try {
                this.b.invoke(view);
                Intrinsics.checkNotNullParameter(view, "");
                view.setEnabled(false);
                b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new SingleClick$onClick$1$1(view, null), 3, null);
            } finally {
                ViewPortBuilder.b();
            }
        }
    }
}
