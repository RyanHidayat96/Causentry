package androidx.FastestIyy;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f288a;

    public static void a(Context context) {
        f288a = context;
        ((i0) i0.a()).a("com.zimperium.device.carrier_info", new B() { // from class: androidx.FastestIyy.k0$$ExternalSyntheticLambda0
            @Override // androidx.FastestIyy.B
            public final void a(String str, String str2, j0 j0Var) {
                k0.a(str, str2, j0Var);
            }
        });
    }

    public static void a(String str, String str2, j0 j0Var) {
        String networkSpecifier;
        TelephonyManager telephonyManager = (TelephonyManager) f288a.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        String simOperatorName = telephonyManager.getSimOperatorName();
        String upperCase = telephonyManager.getSimCountryIso().toUpperCase();
        String upperCase2 = telephonyManager.getNetworkCountryIso().toUpperCase();
        String upperCase3 = telephonyManager.getSimCountryIso().toUpperCase();
        if (Build.VERSION.SDK_INT < 26) {
            networkSpecifier = "";
        } else {
            networkSpecifier = telephonyManager.getNetworkSpecifier();
        }
        j0Var.a(new J().a("carrierName", simOperatorName).a("carrierCountry", upperCase).a("carrierMobileCountryCode", upperCase2).a("carrierISOCountryCode", upperCase3).a("carrierMobileNetworkCode", networkSpecifier).f263a.toString());
    }
}
