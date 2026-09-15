package androidx.FastestIyy;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.function.Consumer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: androidx.FastestIyy.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0189t {
    public static final C0187q C = new C0187q();
    public Object A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HandlerC0178h f298a;
    public HandlerThread b;
    public ConnectivityManager s;
    public C0173c t;
    public TelephonyManager u;
    public SubscriptionManager v;
    public C0177g w;
    public String c = "";
    public boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f299e = null;
    public String f = "";
    public boolean g = false;
    public boolean h = false;
    public final C0179i i = new C0179i(this);
    public final C0180j j = new C0180j();
    public final C0181k k = new C0181k();
    public final C0182l l = new C0182l();
    public final C0183m m = new C0183m();
    public final C0184n n = new C0184n();
    public final C0185o o = new C0185o(this);
    public final C0186p p = new C0186p(this);
    public final C0171a q = new C0171a(this);
    public final C0172b r = new C0172b(this);
    public final C0174d x = new C0174d(this);
    public final C0175e y = new C0175e();
    public final AccessibilityManagerAccessibilityStateChangeListenerC0176f z = new AccessibilityManagerAccessibilityStateChangeListenerC0176f();
    public final Consumer B = new Consumer() { // from class: androidx.FastestIyy.t$$ExternalSyntheticLambda0
        @Override // java.util.function.Consumer
        public final void accept(Object obj) {
            C0189t.a((Integer) obj);
        }
    };

    public final void a(String str, String str2, j0 j0Var) {
        if (this.d) {
            C cA = i0.a();
            Object obj = this.f299e;
            JSONObject jSONObject = new JSONObject();
            try {
                if (obj == null) {
                    jSONObject.put("ssid", JSONObject.NULL);
                } else {
                    jSONObject.put("ssid", obj);
                }
            } catch (JSONException unused) {
            }
            String str3 = this.f;
            try {
                if (str3 == null) {
                    jSONObject.put("bssid", JSONObject.NULL);
                } else {
                    jSONObject.put("bssid", str3);
                }
            } catch (JSONException unused2) {
            }
            ((i0) cA).b("com.zimperium.wifi.connected", jSONObject.toString());
        }
    }

    public final void b() {
        if (this.b == null) {
            HandlerThread handlerThread = new HandlerThread("AndroidEvents:HandlerThread");
            this.b = handlerThread;
            handlerThread.start();
        }
        if (this.f298a == null) {
            this.f298a = new HandlerC0178h(this, this.b.getLooper());
            ((i0) i0.a()).a("com.zimperium.loggedin", new B() { // from class: androidx.FastestIyy.t$$ExternalSyntheticLambda3
                @Override // androidx.FastestIyy.B
                public final void a(String str, String str2, j0 j0Var) {
                    this.f$0.a(str, str2, j0Var);
                }
            });
            ((i0) i0.a()).a("com.zimperium.zdetection.app_moved_to_foreground", new B() { // from class: androidx.FastestIyy.t$$ExternalSyntheticLambda4
                @Override // androidx.FastestIyy.B
                public final void a(String str, String str2, j0 j0Var) {
                    C0189t.b(str, str2, j0Var);
                }
            });
            ((i0) i0.a()).a("com.zimperium.updateBetaDebugBuildStatus", new B() { // from class: androidx.FastestIyy.t$$ExternalSyntheticLambda5
                @Override // androidx.FastestIyy.B
                public final void a(String str, String str2, j0 j0Var) {
                    ((i0) i0.a()).a("com.zimperium.advanced_troubleshoot.advanced_details", "{}", new j0() { // from class: androidx.FastestIyy.t$$ExternalSyntheticLambda1
                        @Override // androidx.FastestIyy.j0
                        public final void a(String str3) {
                            C0189t.a(str3);
                        }
                    });
                }
            });
            ((i0) i0.a()).a("com.zimperium.permission.granted", new B() { // from class: androidx.FastestIyy.t$$ExternalSyntheticLambda6
                @Override // androidx.FastestIyy.B
                public final void a(String str, String str2, j0 j0Var) {
                    this.f$0.d(str, str2, j0Var);
                }
            });
        }
    }

    public final void d(String str, String str2, j0 j0Var) {
        if (((String) J.a(J.a(str2).f263a, "permission_type", "")).equals("LOCATION_PERMISSION_REQUIRED_ANDROID") && this.d) {
            C cA = i0.a();
            Object obj = this.f299e;
            JSONObject jSONObject = new JSONObject();
            try {
                if (obj == null) {
                    jSONObject.put("ssid", JSONObject.NULL);
                } else {
                    jSONObject.put("ssid", obj);
                }
            } catch (JSONException unused) {
            }
            String str3 = this.f;
            try {
                if (str3 == null) {
                    jSONObject.put("bssid", JSONObject.NULL);
                } else {
                    jSONObject.put("bssid", str3);
                }
            } catch (JSONException unused2) {
            }
            ((i0) cA).b("com.zimperium.wifi.connected", jSONObject.toString());
        }
    }

    public final void e(Context context) {
        try {
            if (this.w == null) {
                this.w = new C0177g(this);
            }
            this.v = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
            this.u = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            this.v.addOnSubscriptionsChangedListener(this.w);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.telephony.action.CARRIER_CONFIG_CHANGED");
            context.registerReceiver(this.x, intentFilter);
        } catch (Exception unused) {
        }
    }

    public final void c() {
        String string = new JSONObject().toString();
        try {
            string = new JSONObject().put("isNetworkEnabled", this.h || this.g).toString();
        } catch (JSONException unused) {
        }
        ((i0) i0.a()).b("com.zimperium.wifi.changed", string);
    }

    public static void c(Context context) {
        Application application;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        } else {
            application = null;
            try {
                application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
            } catch (Exception unused) {
            }
        }
        if (application != null) {
            application.registerActivityLifecycleCallbacks(C);
            return;
        }
        throw new RuntimeException("Cannot get Application instance");
    }

    public static void a(String str) {
        boolean zEquals = false;
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("key");
                if (string.equals("Bundle ID")) {
                    zEquals = jSONObject.getString("val").equals("com.zimperium.zips.qa");
                } else if (string.equals("Release Version")) {
                    zEquals = !jSONObject.getBoolean("val");
                }
                if (zEquals) {
                    C cA = i0.a();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(NotificationCompat.CATEGORY_STATUS, zEquals);
                    } catch (JSONException unused) {
                    }
                    ((i0) cA).b("com.zimperium.updateBetaDebugBuild.status", jSONObject2.toString());
                    return;
                }
            }
        } catch (JSONException unused2) {
            D.a(Boolean.valueOf(zEquals));
        }
    }

    public final void d(Context context) {
        try {
            this.t = new C0173c(new Handler(Looper.getMainLooper()));
            context.getContentResolver().registerContentObserver(Settings.Global.getUriFor("package_verifier_user_consent"), false, this.t);
            context.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("always_on_vpn_app"), false, this.t);
            context.getContentResolver().registerContentObserver(Settings.Global.getUriFor("development_settings_enabled"), false, this.t);
            context.getContentResolver().registerContentObserver(Settings.Global.getUriFor("adb_enabled"), false, this.t);
            context.getContentResolver().registerContentObserver(Settings.Global.getUriFor("adb_wifi_enabled"), false, this.t);
            context.getContentResolver().registerContentObserver(Settings.Global.getUriFor("package_verifier_include_adb"), false, this.t);
            context.getContentResolver().registerContentObserver(Settings.Global.getUriFor("verifier_verify_adb_installs"), false, this.t);
            context.getContentResolver().registerContentObserver(Settings.Global.getUriFor("ota_disable_automatic_update"), false, this.t);
        } catch (Exception unused) {
        }
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                this.s.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), this.o);
            } catch (Exception unused) {
            }
            try {
                this.s.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), this.q);
            } catch (Exception unused2) {
            }
            try {
                this.s.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(4).removeCapability(15).build(), this.r);
            } catch (Exception unused3) {
            }
            try {
                this.s.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(0).build(), this.p);
            } catch (Exception unused4) {
            }
            try {
                ConnectivityManager connectivityManager = this.s;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                this.h = networkCapabilities.hasTransport(1);
                this.g = networkCapabilities.hasTransport(0);
                c();
            } catch (Exception unused5) {
            }
        }
    }

    public final void a(int i) {
        int subscriptionId;
        int simState;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28) {
            subscriptionId = this.v.getActiveSubscriptionInfoForSimSlotIndex(i).getSubscriptionId();
        } else if (i2 >= 29 && i2 <= 33) {
            int[] subscriptionIds = this.v.getSubscriptionIds(i);
            subscriptionId = (subscriptionIds == null || subscriptionIds.length <= 0) ? -1 : subscriptionIds[0];
        } else {
            subscriptionId = SubscriptionManager.getSubscriptionId(i);
        }
        if (subscriptionId != -1) {
            if (i2 >= 26) {
                simState = this.u.getSimState(i);
            } else {
                simState = this.u.getSimState();
                i = 0;
            }
            C cA = i0.a();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(RemoteConfigConstants.ResponseFieldKey.STATE, simState);
            } catch (JSONException unused) {
            }
            try {
                jSONObject.put("id", subscriptionId);
            } catch (JSONException unused2) {
            }
            try {
                jSONObject.put("slot", i);
            } catch (JSONException unused3) {
            }
            ((i0) cA).b("com.zimperium.zdetection.sim.event", jSONObject.toString());
        }
    }

    public static void a(AccessibilityManager accessibilityManager) {
        C cA = i0.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", NotificationCompat.CATEGORY_SERVICE);
        } catch (JSONException unused) {
        }
        ((i0) cA).b("com.zimperium.accessibility.changed", jSONObject.toString());
    }

    public static void a(Integer num) {
        D.a("com.zimperium.state.screen.recording", num);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "recording");
        } catch (JSONException unused) {
        }
        try {
            if (num == null) {
                jSONObject.put(RemoteConfigConstants.ResponseFieldKey.STATE, JSONObject.NULL);
            } else {
                jSONObject.put(RemoteConfigConstants.ResponseFieldKey.STATE, num);
            }
        } catch (JSONException unused2) {
        }
        ((i0) i0.a()).b("com.zimperium.screen.recording", jSONObject.toString());
    }

    public static void b(String str, String str2, j0 j0Var) {
        C cA = i0.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("feature_usage_key", "general_app_foreground_usage_count");
        } catch (JSONException unused) {
        }
        ((i0) cA).b("com.zimperium.feature.usage.analytics.increment", jSONObject.toString());
    }

    public final void b(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        accessibilityManager.addAccessibilityStateChangeListener(this.z);
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.A == null) {
                this.A = new AccessibilityManager.AccessibilityServicesStateChangeListener() { // from class: androidx.FastestIyy.t$$ExternalSyntheticLambda2
                    @Override // android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener
                    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager2) {
                        C0189t.a(accessibilityManager2);
                    }
                };
            }
            accessibilityManager.addAccessibilityServicesStateChangeListener((AccessibilityManager.AccessibilityServicesStateChangeListener) this.A);
        }
    }

    public final void a(Context context) {
        try {
            this.s = (ConnectivityManager) context.getSystemService("connectivity");
            context = context.getApplicationContext();
            b();
        } catch (Exception unused) {
        }
        try {
            if (Build.VERSION.SDK_INT < 26) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                context.registerReceiver(this.i, intentFilter);
            }
        } catch (Exception unused2) {
        }
        try {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter2.addAction("android.intent.action.PACKAGE_CHANGED");
            intentFilter2.addDataScheme("package");
            context.registerReceiver(this.j, intentFilter2);
        } catch (Exception unused3) {
        }
        try {
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("android.intent.action.BATTERY_CHANGED");
            context.registerReceiver(this.k, intentFilter3);
        } catch (Exception unused4) {
        }
        try {
            IntentFilter intentFilter4 = new IntentFilter();
            intentFilter4.addAction("android.intent.action.PROXY_CHANGE");
            context.registerReceiver(this.l, intentFilter4);
        } catch (Exception unused5) {
        }
        try {
            IntentFilter intentFilter5 = new IntentFilter();
            intentFilter5.addAction("android.intent.action.LOCALE_CHANGED");
            context.registerReceiver(this.m, intentFilter5);
        } catch (Exception unused6) {
        }
        try {
            IntentFilter intentFilter6 = new IntentFilter();
            intentFilter6.addAction("android.intent.action.USER_PRESENT");
            context.registerReceiver(this.n, intentFilter6);
        } catch (Exception unused7) {
        }
        try {
            a();
        } catch (Exception unused8) {
        }
        try {
            d(context);
        } catch (Exception unused9) {
        }
        try {
            e(context);
        } catch (Exception unused10) {
        }
        try {
            b(context);
        } catch (Exception unused11) {
        }
        try {
            if (Build.VERSION.SDK_INT >= 35 && context.checkCallingOrSelfPermission("android.permission.DETECT_SCREEN_RECORDING") == 0) {
                this.B.accept(Integer.valueOf(((WindowManager) context.getSystemService("window")).addScreenRecordingCallback(context.getMainExecutor(), this.B)));
            }
        } catch (Exception unused12) {
        }
        try {
            c(context);
        } catch (Exception unused13) {
        }
        try {
            ((DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)).registerDisplayListener(this.y, null);
        } catch (Exception unused14) {
        }
    }
}
