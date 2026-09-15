package defpackage;

import android.content.Context;
import android.os.BatteryManager;

/* JADX INFO: loaded from: classes3.dex */
public final class getLayoutDirection {
    private final BatteryManager b;

    private getLayoutDirection(BatteryManager batteryManager) {
        this.b = batteryManager;
    }

    public static getLayoutDirection b(Context context) {
        try {
            BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
            if (batteryManager == null) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("unable to track the battery service");
                }
                return null;
            }
            return new getLayoutDirection(batteryManager);
        } catch (Exception unused) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentbindingInflater1("unable to track the battery service");
            }
            return null;
        }
    }

    public final int b() {
        try {
            int intProperty = this.b.getIntProperty(4);
            if (intProperty >= 0 && intProperty <= 100) {
                return intProperty;
            }
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                StringBuilder sb = new StringBuilder("invalid battery level '");
                sb.append(intProperty);
                sb.append("' detected");
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
            }
            return Integer.MIN_VALUE;
        } catch (Exception unused) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentbindingInflater1("unable to determine the battery level");
            }
            return Integer.MIN_VALUE;
        }
    }
}
