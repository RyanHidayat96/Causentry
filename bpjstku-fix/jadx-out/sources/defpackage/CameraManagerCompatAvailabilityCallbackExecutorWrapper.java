package defpackage;

import android.content.Context;
import com.bpjstku.presentation.treatment.TreatmentNotificationActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CameraManagerCompatAvailabilityCallbackExecutorWrapper implements Function0 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int b;
    private /* synthetic */ TreatmentNotificationActivity TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public /* synthetic */ CameraManagerCompatAvailabilityCallbackExecutorWrapper(TreatmentNotificationActivity treatmentNotificationActivity) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = treatmentNotificationActivity;
    }

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 6410986;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        b = i3;
        return i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2};
        return (String) TreatmentNotificationActivity.b(setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1597410899, objArr, -1597410899, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }
}
