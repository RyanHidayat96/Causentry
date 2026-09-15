package defpackage;

import android.os.Process;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AppCompatDelegateImplApi26Impl implements Function1 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ setDefaultLocales TuitionPaymentFragmentbindingInflater1;

    public /* synthetic */ AppCompatDelegateImplApi26Impl(setDefaultLocales setdefaultlocales) {
        this.TuitionPaymentFragmentbindingInflater1 = setdefaultlocales;
    }

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 6610308;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = startUptimeMillis;
        return startUptimeMillis;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return setDefaultLocales.b(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
    }
}
