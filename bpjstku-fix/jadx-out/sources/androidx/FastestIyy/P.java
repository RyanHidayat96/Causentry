package androidx.FastestIyy;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.provider.Settings;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class P extends AbstractC0201w {
    public P(Context context) {
        super(context);
    }

    public final void a() {
        a0.a(17, new b0() { // from class: androidx.FastestIyy.P$$ExternalSyntheticLambda0
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.b(jSONArray);
            }
        });
        a0.a(18, new b0() { // from class: androidx.FastestIyy.P$$ExternalSyntheticLambda7
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.c(jSONArray);
            }
        });
        a0.a(73, new b0() { // from class: androidx.FastestIyy.P$$ExternalSyntheticLambda8
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.g(jSONArray);
            }
        });
        a0.a(97, new b0() { // from class: androidx.FastestIyy.P$$ExternalSyntheticLambda9
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.h(jSONArray);
            }
        });
        a0.a(42, new b0() { // from class: androidx.FastestIyy.P$$ExternalSyntheticLambda10
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.i(jSONArray);
            }
        });
        a0.a(125, new b0() { // from class: androidx.FastestIyy.P$$ExternalSyntheticLambda11
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.j(jSONArray);
            }
        });
        a0.a(215, new b0() { // from class: androidx.FastestIyy.P$$ExternalSyntheticLambda12
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.k(jSONArray);
            }
        });
        a0.a(224, new b0() { // from class: androidx.FastestIyy.P$$ExternalSyntheticLambda1
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.l(jSONArray);
            }
        });
        a0.a(246, new b0() { // from class: androidx.FastestIyy.P$$ExternalSyntheticLambda2
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.m(jSONArray);
            }
        });
        a0.a(254, new b0() { // from class: androidx.FastestIyy.P$$ExternalSyntheticLambda3
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.n(jSONArray);
            }
        });
        a0.a(260, new b0() { // from class: androidx.FastestIyy.P$$ExternalSyntheticLambda4
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.d(jSONArray);
            }
        });
        a0.a(263, new b0() { // from class: androidx.FastestIyy.P$$ExternalSyntheticLambda5
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.e(jSONArray);
            }
        });
        a0.a(346, new b0() { // from class: androidx.FastestIyy.P$$ExternalSyntheticLambda6
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.f(jSONArray);
            }
        });
    }

    public final /* synthetic */ Object b(JSONArray jSONArray) {
        return a(AbstractC0201w.a(jSONArray));
    }

    public final Object c(JSONArray jSONArray) {
        String string = Settings.Global.getString(this.f301a.getContentResolver(), AbstractC0201w.a(jSONArray));
        return string == null ? "" : string;
    }

    public final Object d(JSONArray jSONArray) throws JSONException {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) this.f301a.getSystemService("activity")).getMemoryInfo(memoryInfo);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("available", memoryInfo.availMem);
        jSONObject.put("total", memoryInfo.totalMem);
        jSONObject.put("threshold", memoryInfo.threshold);
        return jSONObject;
    }

    public final Object e(JSONArray jSONArray) {
        String language = Locale.getDefault().getLanguage();
        return (Locale.getDefault().toLanguageTag().contains("zh") && Locale.getDefault().toLanguageTag().contains("Hant")) ? "zh-rTW" : language;
    }

    public final Object f(JSONArray jSONArray) throws JSONException {
        int subscriptionId;
        int simState;
        SubscriptionManager subscriptionManager = (SubscriptionManager) this.f301a.getSystemService("telephony_subscription_service");
        TelephonyManager telephonyManager = (TelephonyManager) this.f301a.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        JSONArray jSONArray2 = new JSONArray();
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        while (i2 < 3) {
            if (i <= 28) {
                subscriptionId = subscriptionManager.getActiveSubscriptionInfoForSimSlotIndex(i2).getSubscriptionId();
            } else if (i < 29 || i > 33) {
                subscriptionId = SubscriptionManager.getSubscriptionId(i2);
            } else {
                int[] subscriptionIds = subscriptionManager.getSubscriptionIds(i2);
                subscriptionId = (subscriptionIds == null || subscriptionIds.length <= 0) ? -1 : subscriptionIds[0];
            }
            if (subscriptionId != -1) {
                if (i >= 26) {
                    simState = telephonyManager.getSimState(i2);
                } else {
                    simState = telephonyManager.getSimState();
                    i2 = 0;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("slot", i2);
                jSONObject.put("id", subscriptionId);
                jSONObject.put(RemoteConfigConstants.ResponseFieldKey.STATE, simState);
                jSONArray2.put(jSONObject);
            }
            i2++;
        }
        return jSONArray2;
    }

    public final Object g(JSONArray jSONArray) {
        KeyguardManager keyguardManager;
        return Boolean.valueOf((Build.VERSION.SDK_INT >= 27 ? this.f301a.getPackageManager().hasSystemFeature("android.hardware.type.pc") : this.f301a.getPackageManager().hasSystemFeature("org.chromium.arc.device_management")) || ((keyguardManager = (KeyguardManager) this.f301a.getSystemService("keyguard")) != null && (keyguardManager.isDeviceSecure() || keyguardManager.isKeyguardSecure())));
    }

    public final Object h(JSONArray jSONArray) {
        String string = Settings.Secure.getString(this.f301a.getContentResolver(), AbstractC0201w.a(jSONArray));
        return string == null ? "" : string;
    }

    public final Object i(JSONArray jSONArray) {
        Intent intentRegisterReceiver = this.f301a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return "UNPLUGGED";
        }
        int intExtra = intentRegisterReceiver.getIntExtra("plugged", -1);
        if (intExtra != 1) {
            return intExtra != 2 ? "UNPLUGGED" : "USB";
        }
        return "AC";
    }

    public final Object j(JSONArray jSONArray) {
        return Integer.valueOf(Runtime.getRuntime().availableProcessors());
    }

    public final Object k(JSONArray jSONArray) {
        return Boolean.valueOf(Build.VERSION.SDK_INT >= 27 ? this.f301a.getPackageManager().hasSystemFeature("android.hardware.type.pc") : this.f301a.getPackageManager().hasSystemFeature("org.chromium.arc.device_management"));
    }

    public final Object l(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("devicename", a("ro.product.name"));
        jSONObject.put("devicemodel", a("ro.product.model"));
        jSONObject.put("deviceversion", a("ro.build.version.release"));
        jSONObject.put("devicemanufacturer", a("ro.product.manufacturer"));
        jSONObject.put("devicebtname", a("net.bt.name"));
        jSONObject.put("deviceserial", a("ro.serialno"));
        jSONObject.put("devicepatch", a("ro.build.version.security_patch"));
        jSONObject.put("devicedisplay", a("ro.build.display.id"));
        jSONObject.put("kerneldate", a("ro.build.date"));
        jSONObject.put("fingerprint", a("ro.build.fingerprint"));
        jSONObject.put("networkoperator", ((TelephonyManager) this.f301a.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getNetworkOperator());
        return jSONObject;
    }

    public final /* synthetic */ Object m(JSONArray jSONArray) {
        return "none";
    }

    public final Object n(JSONArray jSONArray) {
        return ((ClassLoader) Objects.requireNonNull(P.class.getClassLoader())).toString();
    }

    public static String a(String str) {
        String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        return str2 == null ? "" : str2;
    }
}
