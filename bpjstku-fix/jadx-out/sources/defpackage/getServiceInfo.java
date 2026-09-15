package defpackage;

import android.os.Process;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getServiceInfo implements View.OnClickListener {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ onBind b;

    public /* synthetic */ getServiceInfo(onBind onbind) {
        this.b = onbind;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 7719619;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = startUptimeMillis;
        return startUptimeMillis;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        onBind.b(this.b, view);
    }
}
