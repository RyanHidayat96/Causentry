package defpackage;

import android.os.Process;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setButtonPanelLayoutHint implements Function1 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public static int b;
    private /* synthetic */ select TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 7262088;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int iMyTid = Process.myTid();
        b = iMyTid;
        return iMyTid;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return select.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
    }
}
