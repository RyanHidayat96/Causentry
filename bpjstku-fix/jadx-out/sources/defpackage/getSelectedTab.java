package defpackage;

import android.os.SystemClock;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getSelectedTab implements logToString {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public /* synthetic */ getSelectedTab(Function1 function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 6690340;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        TuitionPaymentFragmentbindingInflater1 = iElapsedRealtime;
        return iElapsedRealtime;
    }

    @Override // defpackage.logToString
    public final void accept(Object obj) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(obj);
    }
}
