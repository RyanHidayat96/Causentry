package defpackage;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.autofill.HintConstants;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.core.SdkUtil;
import com.midtrans.sdk.corekit.models.MerchantPreferences;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class getSessionToken implements DualSurfaceProcessorNodeExternalSyntheticLambda1 {
    private Activity TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getSessionToken.class.getName();

    public getSessionToken(Activity activity) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = activity;
    }

    private void b(chooseSurfaceAttrib choosesurfaceattrib) throws Throwable {
        String str;
        try {
            checkGlErrorOrThrow checkglerrororthrowB = choosesurfaceattrib.b();
            HashMap map = new HashMap();
            MerchantPreferences preference = MidtransSDK.getInstance().getMerchantData().getPreference();
            if (preference != null) {
                map.put("Merchant Name", preference.getDisplayName());
            }
            String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = subscribe.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            map.put("Host App Name", strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[0]);
            map.put("Host App Version", strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[1]);
            map.put("Device ID", SdkUtil.getDeviceId(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            map.put("Device Language", Locale.getDefault().getLanguage());
            map.put("Device Model", Build.MODEL);
            map.put("Device Type", Build.BRAND);
            map.put("Timestamp", String.valueOf(System.currentTimeMillis()));
            Activity activity = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) activity.getSystemService("connectivity")).getActiveNetworkInfo();
            TelephonyManager telephonyManager = (TelephonyManager) activity.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (activeNetworkInfo.getType() != 1) {
                switch (subscribe.TuitionPaymentFragmentbindingInflater1(telephonyManager)) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        str = "2G";
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        str = "3G";
                        break;
                    case 13:
                        str = "4G";
                        break;
                    default:
                        str = "UNKNOWN";
                        break;
                }
            } else {
                str = "WIFI";
            }
            map.put("Network", str);
            map.put("OS Version", String.valueOf(Build.VERSION.SDK_INT));
            map.put("Platform", "Android");
            Activity activity2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity2.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            float f = displayMetrics.xdpi;
            float f2 = i2 / displayMetrics.ydpi;
            StringBuilder sb = new StringBuilder();
            sb.append(i / f);
            sb.append(" x ");
            sb.append(f2);
            sb.append(" inches");
            map.put("Screen Size", sb.toString());
            map.put("SDK Version", "1.29.3");
            map.put("CPU Usage", subscribe.TuitionPaymentFragmentbindingInflater1());
            Runtime runtime = Runtime.getRuntime();
            long jFreeMemory = (runtime.totalMemory() - runtime.freeMemory()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jFreeMemory);
            sb2.append("MB");
            map.put("Memory Usage", sb2.toString());
            map.put("Environment", "production");
            checkglerrororthrowB.asBinder = map;
        } catch (Exception e2) {
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb3 = new StringBuilder("raygun:");
            sb3.append(e2.getMessage());
            Logger.d(str2, sb3.toString());
        }
    }

    @Override // defpackage.DualSurfaceProcessorNodeExternalSyntheticLambda1
    public final chooseSurfaceAttrib TuitionPaymentFragmentbindingInflater1(chooseSurfaceAttrib choosesurfaceattrib) throws Throwable {
        Logger.d(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "Error report is intercepted.");
        String str = choosesurfaceattrib.b().TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (str != null && str.contains("com.midtrans")) {
            b(choosesurfaceattrib);
            return choosesurfaceattrib;
        }
        checkInitializedOrThrow[] checkinitializedorthrowArr = choosesurfaceattrib.b().TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
        if (checkinitializedorthrowArr != null) {
            for (checkInitializedOrThrow checkinitializedorthrow : checkinitializedorthrowArr) {
                if (checkinitializedorthrow.b.contains("com.midtrans")) {
                    b(choosesurfaceattrib);
                    return choosesurfaceattrib;
                }
            }
        }
        try {
            if (choosesurfaceattrib.b().TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 == null) {
                return null;
            }
            for (checkInitializedOrThrow checkinitializedorthrow2 : checkinitializedorthrowArr) {
                if (checkinitializedorthrow2.b.contains("com.midtrans")) {
                    b(choosesurfaceattrib);
                    return choosesurfaceattrib;
                }
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
