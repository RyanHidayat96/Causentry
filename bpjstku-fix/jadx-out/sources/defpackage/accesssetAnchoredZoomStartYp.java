package defpackage;

import android.content.Context;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.anko.AsyncKt$crashLogger$1;

/* JADX INFO: loaded from: classes4.dex */
public final class accesssetAnchoredZoomStartYp {
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final Context context, final Function1<? super Context, Unit> function1) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            function1.invoke(context);
        } else {
            inAnchoredZoomMode inanchoredzoommode = inAnchoredZoomMode.INSTANCE;
            inAnchoredZoomMode.b().post(new Runnable() { // from class: accesssetAnchoredZoomStartYp.1
                @Override // java.lang.Runnable
                public final void run() {
                    function1.invoke(context);
                }
            });
        }
    }

    static {
        AsyncKt$crashLogger$1 asyncKt$crashLogger$1 = new Function1<Throwable, Unit>() { // from class: org.jetbrains.anko.AsyncKt$crashLogger$1
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
                th.printStackTrace();
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(Throwable th) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                return Unit.INSTANCE;
            }
        };
    }
}
