package defpackage;

import android.content.Context;
import com.bpjstku.presentation.membership.payment.OneTimePaymentActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class layoutHorizontal implements Function0 {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ OneTimePaymentActivity TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public /* synthetic */ layoutHorizontal(OneTimePaymentActivity oneTimePaymentActivity) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = oneTimePaymentActivity;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 5458028;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        return i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return OneTimePaymentActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }
}
