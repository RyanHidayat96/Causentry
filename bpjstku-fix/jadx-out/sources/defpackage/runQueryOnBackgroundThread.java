package defpackage;

import android.content.Context;
import android.view.View;
import com.bpjstku.presentation.membership.registration.RegistrationStatusActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class runQueryOnBackgroundThread implements Function1 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ RegistrationStatusActivity b;

    public /* synthetic */ runQueryOnBackgroundThread(RegistrationStatusActivity registrationStatusActivity) {
        this.b = registrationStatusActivity;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 6653849;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        return i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return RegistrationStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (View) obj);
    }
}
