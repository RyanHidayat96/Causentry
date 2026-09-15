package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class LifecycleCameraRepositoryKey implements View.OnClickListener {
    private final /* synthetic */ Function1 b;

    public LifecycleCameraRepositoryKey(Function1 function1) {
        this.b = function1;
    }

    @Override // android.view.View.OnClickListener
    public final /* synthetic */ void onClick(View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Intrinsics.checkExpressionValueIsNotNull(this.b.invoke(view), "");
        } finally {
            ViewPortBuilder.b();
        }
    }
}
