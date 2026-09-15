package defpackage;

import android.content.Context;
import com.bpjstku.presentation.treatment.TreatmentNotificationActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class registerAvailabilityCallback implements logToString {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public static int b;
    private /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

    public /* synthetic */ registerAvailabilityCallback(Function1 function1) {
        this.TuitionPaymentFragmentbindingInflater1 = function1;
    }

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 7149307;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        b = i3;
        return i3;
    }

    @Override // defpackage.logToString
    public final void accept(Object obj) {
        TreatmentNotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, obj);
    }
}
