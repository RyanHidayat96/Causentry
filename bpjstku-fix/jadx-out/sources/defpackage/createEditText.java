package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class createEditText implements Function1 {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private /* synthetic */ createViewFromTag b;

    public /* synthetic */ createEditText(createViewFromTag createviewfromtag) {
        this.b = createviewfromtag;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 9759753;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        TuitionPaymentFragmentbindingInflater1 = i3;
        return i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return createViewFromTag.TuitionPaymentFragmentbindingInflater1(this.b, (View) obj);
    }
}
