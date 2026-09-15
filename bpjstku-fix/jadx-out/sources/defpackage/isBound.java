package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class isBound implements View.OnClickListener {
    private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public isBound(Function1 function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
    }

    @Override // android.view.View.OnClickListener
    public final /* synthetic */ void onClick(View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Intrinsics.checkExpressionValueIsNotNull(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(view), "");
        } finally {
            ViewPortBuilder.b();
        }
    }
}
