package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import defpackage.StreamSharingConfig;
import defpackage.VirtualCamera;
import defpackage.calculateOutConfig;
import defpackage.forceSetProvider;
import defpackage.getChildFormat;
import defpackage.getChildTargetType;
import defpackage.getHighestSurfacePriority;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.onScroll;
import defpackage.setMediaTypeactivity;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MixpanelAPI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Future<SharedPreferences> f858a;
    private static final Map<String, Map<Context, MixpanelAPI>> asBinder = new HashMap();
    private static final getChildTargetType asInterface = new getChildTargetType();
    private final getHighestSurfacePriority INotificationSideChannel;
    final getChildFormat TuitionPaymentFragmentbindingInflater1;
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final calculateOutConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final Boolean b;
    private VirtualCamera cancel;
    private final Map<String, Long> cancelAll;
    private final Context d;
    private final Map<String, String> g;
    private final Map<String, Object> notify;
    private final forceSetProvider onTransact;

    public interface TuitionPaymentFragmentbindingInflater1 {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault2(MixpanelAPI mixpanelAPI);
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, double d);

        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3();

        void b();
    }

    private MixpanelAPI(Context context, Future<SharedPreferences> future, String str, boolean z, JSONObject jSONObject, String str2, boolean z2) {
        this(context, future, str, calculateOutConfig.b(context), false, null, null, z2);
    }

    private MixpanelAPI(Context context, Future<SharedPreferences> future, String str, calculateOutConfig calculateoutconfig, boolean z, JSONObject jSONObject, String str2, boolean z2) {
        String str3;
        byte b = 0;
        int length = str != null ? str.length() : 0;
        if (setMediaTypeactivity.b(new ArrayList()) != 0) {
            throw new RuntimeException(String.valueOf(length));
        }
        this.d = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, b);
        this.notify = new HashMap();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = calculateoutconfig;
        this.b = Boolean.valueOf(z2);
        HashMap map = new HashMap();
        map.put("$android_lib_version", "7.3.1");
        map.put("$android_os", "Android");
        map.put("$android_os_version", Build.VERSION.RELEASE == null ? "UNKNOWN" : Build.VERSION.RELEASE);
        map.put("$android_manufacturer", Build.MANUFACTURER == null ? "UNKNOWN" : Build.MANUFACTURER);
        map.put("$android_brand", Build.BRAND == null ? "UNKNOWN" : Build.BRAND);
        map.put("$android_model", Build.MODEL != null ? Build.MODEL : "UNKNOWN");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            map.put("$android_app_version", packageInfo.versionName);
            map.put("$android_app_version_code", Integer.toString(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        this.g = Collections.unmodifiableMap(map);
        this.INotificationSideChannel = new getHighestSurfacePriority();
        this.onTransact = forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.d);
        getChildTargetType.b bVar = new getChildTargetType.b() { // from class: com.mixpanel.android.mpmetrics.MixpanelAPI.4
            @Override // getChildTargetType.b
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SharedPreferences sharedPreferences) {
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getChildFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sharedPreferences);
                if (strTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    MixpanelAPI.TuitionPaymentFragmentspecialinlinedviewModeldefault2(MixpanelAPI.this, strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }
        };
        str2 = str2 == null ? str : str2;
        String strConcat = "com.mixpanel.android.mpmetrics.MixpanelAPI_".concat(String.valueOf(str2));
        getChildTargetType getchildtargettype = asInterface;
        FutureTask futureTask = new FutureTask(new getChildTargetType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, strConcat, bVar));
        getchildtargettype.b.execute(futureTask);
        String str4 = null;
        FutureTask futureTask2 = new FutureTask(new getChildTargetType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, "com.mixpanel.android.mpmetrics.MixpanelAPI.TimeEvents_".concat(String.valueOf(str2)), null));
        getchildtargettype.b.execute(futureTask2);
        FutureTask futureTask3 = new FutureTask(new getChildTargetType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, "com.mixpanel.android.mpmetrics.Mixpanel", null));
        getchildtargettype.b.execute(futureTask3);
        getChildFormat getchildformat = new getChildFormat(future, futureTask, futureTask2, futureTask3);
        this.TuitionPaymentFragmentbindingInflater1 = getchildformat;
        Map<String, Long> mapOnTransact = getchildformat.onTransact();
        this.cancelAll = mapOnTransact;
        if (z && (getchildformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) || !getchildformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str))) {
            forceSetProvider forcesetproviderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.d);
            forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            Message messageObtain = Message.obtain();
            messageObtain.what = 6;
            messageObtain.obj = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            forcesetproviderTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(messageObtain);
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
            }
            getchildformat.asBinder();
            synchronized (mapOnTransact) {
                mapOnTransact.clear();
                try {
                    try {
                        SharedPreferences.Editor editorEdit = getchildformat.notify.get().edit();
                        editorEdit.clear();
                        editorEdit.apply();
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                } catch (ExecutionException e3) {
                    e3.printStackTrace();
                }
            }
            getChildFormat getchildformat2 = this.TuitionPaymentFragmentbindingInflater1;
            synchronized (getChildFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                try {
                    SharedPreferences.Editor editorEdit2 = getchildformat2.asInterface.get().edit();
                    editorEdit2.clear();
                    editorEdit2.apply();
                } catch (InterruptedException unused2) {
                } catch (ExecutionException e4) {
                    e4.getCause();
                }
            }
            getChildFormat getchildformat3 = this.TuitionPaymentFragmentbindingInflater1;
            String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            synchronized (getchildformat3) {
                getchildformat3.f921a = Boolean.TRUE;
                try {
                    SharedPreferences.Editor editorEdit3 = getchildformat3.g.get().edit();
                    StringBuilder sb = new StringBuilder("opt_out_");
                    sb.append(str5);
                    editorEdit3.putBoolean(sb.toString(), getchildformat3.f921a.booleanValue());
                    editorEdit3.apply();
                } catch (InterruptedException unused3) {
                } catch (ExecutionException e5) {
                    e5.getCause();
                }
            }
        }
        if (jSONObject != null && !this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            getChildFormat getchildformat4 = this.TuitionPaymentFragmentbindingInflater1;
            synchronized (getchildformat4.asBinder) {
                JSONObject jSONObjectB = getchildformat4.b();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObjectB.put(next, jSONObject.get(next));
                    } catch (JSONException unused4) {
                    }
                }
                getchildformat4.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }
        boolean zExists = MPDbAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.d).TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.exists();
        if (this.d.getApplicationContext() instanceof Application) {
            Application application = (Application) this.d.getApplicationContext();
            VirtualCamera virtualCamera = new VirtualCamera(this, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            this.cancel = virtualCamera;
            application.registerActivityLifecycleCallbacks(virtualCamera);
        }
        if (getchildformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zExists, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.b.booleanValue()) {
            TuitionPaymentFragmentbindingInflater1("$ae_first_open", null, true);
            getchildformat.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        if ((!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && this.b.booleanValue()) {
            track("$app_open", null);
        }
        if (!getchildformat.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                this.TuitionPaymentFragmentbindingInflater1.b(jSONObject2);
                try {
                    String str6 = (String) jSONObject2.get("mp_lib");
                    try {
                        str3 = (String) jSONObject2.get("$lib_version");
                    } catch (JSONException unused5) {
                        str3 = null;
                    }
                    str4 = str6;
                } catch (JSONException unused6) {
                    str3 = null;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("mp_lib", str4 == null ? "Android" : str4);
                jSONObject3.put("distinct_id", str);
                jSONObject3.put("$lib_version", str3 == null ? "7.3.1" : str3);
                jSONObject3.put("Project Token", str);
                this.onTransact.b(new forceSetProvider.b("Integration", jSONObject3, "85053bf24bba75239b16a601d9387e17"));
                this.onTransact.TuitionPaymentFragmentbindingInflater1(new forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3("85053bf24bba75239b16a601d9387e17"));
                getchildformat.d(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            } catch (JSONException unused7) {
            }
        }
        if (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1((String) map.get("$android_app_version_code")) && this.b.booleanValue()) {
            try {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("$ae_updated_version", map.get("$android_app_version"));
                TuitionPaymentFragmentbindingInflater1("$ae_updated", jSONObject4, true);
            } catch (JSONException unused8) {
            }
        }
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b) {
            StreamSharingConfig.b();
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify) {
            forceSetProvider forcesetprovider = this.onTransact;
            File file = new File(this.d.getApplicationInfo().dataDir);
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 9;
            messageObtain2.obj = file;
            forcesetprovider.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(messageObtain2);
        }
    }

    public static MixpanelAPI getInstance(Context context, String str, boolean z) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, str, z);
    }

    private static MixpanelAPI TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, String str, boolean z) {
        MixpanelAPI mixpanelAPI;
        MixpanelAPI mixpanelAPI2;
        if (str == null || context == null) {
            return null;
        }
        Map<String, Map<Context, MixpanelAPI>> map = asBinder;
        synchronized (map) {
            Context applicationContext = context.getApplicationContext();
            if (f858a == null) {
                getChildTargetType getchildtargettype = asInterface;
                FutureTask futureTask = new FutureTask(new getChildTargetType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, "com.mixpanel.android.mpmetrics.ReferralInfo", null));
                getchildtargettype.b.execute(futureTask);
                f858a = futureTask;
            }
            Map<Context, MixpanelAPI> map2 = map.get(str);
            if (map2 == null) {
                map2 = new HashMap<>();
                map.put(str, map2);
            }
            Map<Context, MixpanelAPI> map3 = map2;
            mixpanelAPI = map3.get(applicationContext);
            if (mixpanelAPI == null) {
                PackageManager packageManager = applicationContext.getPackageManager();
                String packageName = applicationContext.getPackageName();
                if (packageManager != null && packageName != null && packageManager.checkPermission("android.permission.INTERNET", packageName) == 0) {
                    MixpanelAPI mixpanelAPI3 = new MixpanelAPI(applicationContext, f858a, str, false, null, null, z);
                    try {
                        Class<?> cls = Class.forName("androidx.localbroadcastmanager.content.LocalBroadcastManager");
                        mixpanelAPI2 = mixpanelAPI3;
                        try {
                            cls.getMethod("registerReceiver", BroadcastReceiver.class, IntentFilter.class).invoke(cls.getMethod("getInstance", Context.class).invoke(null, context), new BroadcastReceiver() { // from class: com.mixpanel.android.mpmetrics.MixpanelAPI.5
                                private static final byte[] $$c = {112, 19, -59, 97};
                                private static final int $$f = 48;
                                private static int $10 = 0;
                                private static int $11 = 1;
                                private static final byte[] $$d = {36, -74, -79, -21, -14, 0, Base64.padSymbol, -53, -17, -2, -5, 11, -8, -15, 18, -15, 66, -61, -7, -8, 13, -15, 2, 11, -13, 60, -21, -7, -35, 52, -72, 34, 13, -9, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, 16, -9, -7, 8, -7, -7, 5, 28, -39, 6, -8, 9, -21, 13, -15, 63, 12, -17, 35, -40, -1, 2, -7, -1, 44, -43, -5, 3, 10, -21, 78, -50, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, 16, -9, -7, 8, -7, -7, 5, 28, -39, 6, -8, 9, -21, 13, -15, 63, -14, 0, Base64.padSymbol, -56, 1, -21, 17, -5, -13, 6, 55, -53, -15, 8, -16, 1, 4, 3, 52, -70, -5, 6, Base64.padSymbol, -65, -4, 9, -3, -9, 60, -32, -37, -1, 5, 17, -15, -20, 6, 36, -51, 15, -11, -8, 78, -77, -1, 24, -32, 15, -15, -7, 16, -4, -19, 78, -64, 12, -17, 34, -36, 11, -19, 11, 2, -20, 35, -21, -16, 2, 1, -11, -1, 9, -8, -1, 25, -20, -9, 5, 0, -19, 3, -5, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 65, -17, 11, 2, -21, 13, 26, -38, 10, -8, 0, 13, -21, 2, -20, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 64, 9, -14, 9, -4, 1, -20, -8, 9, 9, 15, -21, -14, -6, 14, -16, -3, 13, -1, 33, -47, 8, 15, -35, 3, -5, 11, -1, 22, -37, 10, 0, -13, 5, -16, 64, -36, -19, 9, -8, -1, 42, -33, -19, 33, -41, 15, -15, 4, 9, -26, 43, -23, -26, 8, -8, -1, 36, -35, 26, -40, 4, -3, 13, -10, 22, -22, 27, -23, -26, 8, -8, -1, 44, -40, 9, -8, 15, -21, 2, -20};
                                private static final int $$e = 159;
                                private static final byte[] $$a = {56, 94, 119, -19, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
                                private static final int $$b = 221;
                                private static int b = 0;
                                private static int TuitionPaymentFragmentbindingInflater1 = 1;
                                private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {45558, 35549, 51114, 157, 23858, 38480, 54077, 11282, 26875, 42386, 65167, 15237, 29807, 45384, 35385, 50961, 45557, 35544, 51129, 146, 23912, 38485, 54056, 11269, 26836, 42461, 65199, 15252, 29791, 45395, 35384, 50969, 45565, 35538, 51128, 142, 23923, 38485, 54072, 11346, 26867, 42447, 65266, 15279, 29797, 45391, 35368, 50969, 1009, 23807, 39344, 53907, 12159, 26711, 45561, 35536, 51133, 140, 23919, 38489, 54072, 11310, 26873, 42461, 65200, 15240, 29813, 45393, 35385, 45486, 35545, 51130, 157, 23933, 38494, 54074, 11338, 26789, 42458, 65210, 15305, 29817, 45401, 35389, 51017, 939, 23693, 39402, 53913, 12073, 26635, 42347, 65054, 15097, 30603, 45246, 36301, 50735, 856, 23656, 39237, 54693, 11997, 27630, 42181, 57645, 14861, 30564, 45085, 36090, 51593, 744, 24516, 39034, 54617, 11887, 27465, 43005, 57484, 15844, 30365, 45864, 35844, 51566, 542, 24229, 39812, 54504, 4510, 27262, 42842, 57454, 15646, 33154, 47776, 63429, 12471, 27985, 42612, 58179, 7222, 22660, 38311, 52881, 3043, 17412, 33139, 47687, 63285, 13267, 27890, 43415, 58034, 8020, 22646, 38215, 52791, 2691, 18421, 32963, 48568, 63058, 13176, 27672, 43321, 58840, 7843, 23444, 38064, 53589, 2596, 18240, 32819, 48339, 63908, 12999, 28599, 43094, 58741, 7698, 23346, 38872, 53410, 3480, 18104, 33539, 48245, 63762, 12851, 28290, 43943, 58515, 8629, 23040, 38769, 53271, 3431};
                                private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 4780695696424078012L;

                                /* JADX WARN: Code duplicated, block: B:10:0x0021  */
                                /* JADX WARN: Code duplicated, block: B:8:0x0019  */
                                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
                                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                    */
                                private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
                                    /*
                                        byte[] r0 = com.mixpanel.android.mpmetrics.MixpanelAPI.AnonymousClass5.$$a
                                        int r8 = 214 - r8
                                        int r1 = 53 - r6
                                        int r7 = r7 + 84
                                        byte[] r1 = new byte[r1]
                                        int r6 = 52 - r6
                                        r2 = 0
                                        if (r0 != 0) goto L13
                                        r7 = r6
                                        r3 = r8
                                        r4 = r2
                                        goto L29
                                    L13:
                                        r3 = r2
                                    L14:
                                        byte r4 = (byte) r7
                                        r1[r3] = r4
                                        if (r3 != r6) goto L21
                                        java.lang.String r6 = new java.lang.String
                                        r6.<init>(r1, r2)
                                        r9[r2] = r6
                                        return
                                    L21:
                                        int r3 = r3 + 1
                                        r4 = r0[r8]
                                        r5 = r3
                                        r3 = r8
                                        r8 = r4
                                        r4 = r5
                                    L29:
                                        int r7 = r7 + r8
                                        int r7 = r7 + (-11)
                                        int r8 = r3 + 1
                                        r3 = r4
                                        goto L14
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MixpanelAPI.AnonymousClass5.c(byte, short, int, java.lang.Object[]):void");
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x0020  */
                                /* JADX WARN: Code duplicated, block: B:8:0x0018  */
                                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
                                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
                                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                    */
                                private static void d(short r6, byte r7, int r8, java.lang.Object[] r9) {
                                    /*
                                        int r7 = 115 - r7
                                        byte[] r0 = com.mixpanel.android.mpmetrics.MixpanelAPI.AnonymousClass5.$$d
                                        int r8 = r8 + 1
                                        int r6 = 359 - r6
                                        byte[] r1 = new byte[r8]
                                        r2 = 0
                                        if (r0 != 0) goto L10
                                        r3 = r8
                                        r4 = r2
                                        goto L22
                                    L10:
                                        r3 = r2
                                    L11:
                                        int r4 = r3 + 1
                                        byte r5 = (byte) r7
                                        r1[r3] = r5
                                        if (r4 != r8) goto L20
                                        java.lang.String r6 = new java.lang.String
                                        r6.<init>(r1, r2)
                                        r9[r2] = r6
                                        return
                                    L20:
                                        r3 = r0[r6]
                                    L22:
                                        int r3 = -r3
                                        int r7 = r7 + r3
                                        int r6 = r6 + 1
                                        int r7 = r7 + (-2)
                                        r3 = r4
                                        goto L11
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MixpanelAPI.AnonymousClass5.d(short, byte, int, java.lang.Object[]):void");
                                }

                                /* JADX WARN: Code duplicated, block: B:45:0x0215  */
                                /* JADX WARN: Code duplicated, block: B:46:0x0216  */
                                private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
                                    long j;
                                    Throwable cause;
                                    int i3 = 2 % 2;
                                    lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                                    long[] jArr = new long[i2];
                                    lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                                    while (true) {
                                        j = 0;
                                        if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                                            break;
                                        }
                                        int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        try {
                                            Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i4])};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                byte b2 = (byte) 0;
                                                byte b3 = b2;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.normalizeMetaState(0), ExpandableListView.getPackedPositionGroup(0L) + 2187, 41 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 841711447, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                                            }
                                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                byte b4 = (byte) 0;
                                                byte b5 = b4;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 33017), 3011 - (Process.myTid() >> 22), 26 - View.MeasureSpec.getSize(0), 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                            }
                                            jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                byte b6 = (byte) 0;
                                                byte b7 = b6;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), View.resolveSizeAndState(0, 0, 0) + 3376, TextUtils.indexOf((CharSequence) "", '0') + 18, -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                                            }
                                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                        } catch (Throwable th) {
                                            cause = th.getCause();
                                            if (cause != null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                        cause = th.getCause();
                                        if (cause != null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                    char[] cArr = new char[i2];
                                    lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                                    int i5 = $10 + 125;
                                    $11 = i5 % 128;
                                    if (i5 % 2 == 0) {
                                        int i6 = 5 / 4;
                                    }
                                    while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                                        int i7 = $10 + 101;
                                        $11 = i7 % 128;
                                        if (i7 % 2 == 0) {
                                            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                                            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                byte b8 = (byte) 0;
                                                byte b9 = b8;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36504 - ExpandableListView.getPackedPositionChild(j)), TextUtils.lastIndexOf("", '0') + 3377, 17 - (ViewConfiguration.getWindowTouchSlop() >> 8), -968507904, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                                            }
                                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                                            throw null;
                                        }
                                        cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                                        Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            byte b10 = (byte) 0;
                                            byte b11 = b10;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (36505 - View.MeasureSpec.getSize(0)), 3376 - ExpandableListView.getPackedPositionType(j), (ViewConfiguration.getPressedStateDuration() >> 16) + 17, -968507904, false, $$g(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                                        }
                                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                                        j = 0;
                                    }
                                    objArr[0] = new String(cArr);
                                }

                                /* JADX WARN: Code duplicated, block: B:20:0x01a2  */
                                /* JADX WARN: Code duplicated, block: B:23:0x01ac  */
                                /* JADX WARN: Code duplicated, block: B:272:0x1927  */
                                /* JADX WARN: Code duplicated, block: B:273:0x1991  */
                                /* JADX WARN: Code duplicated, block: B:275:0x199d  */
                                /* JADX WARN: Code duplicated, block: B:278:0x19a1 A[LOOP:3: B:276:0x199e->B:278:0x19a1, LOOP_END] */
                                /* JADX WARN: Code duplicated, block: B:282:0x1a3c  */
                                /* JADX WARN: Code duplicated, block: B:285:0x1aa7  */
                                /* JADX WARN: Code duplicated, block: B:286:0x1ae9  */
                                /* JADX WARN: Code duplicated, block: B:289:0x1afe  */
                                /* JADX WARN: Code duplicated, block: B:291:0x1b07  */
                                /* JADX WARN: Code duplicated, block: B:294:0x1bb2 A[DONT_INVERT] */
                                /* JADX WARN: Code duplicated, block: B:295:0x1bb4  */
                                /* JADX WARN: Code duplicated, block: B:301:0x1bc4  */
                                /* JADX WARN: Code duplicated, block: B:302:0x1bc9  */
                                /* JADX WARN: Code duplicated, block: B:306:0x1c61  */
                                /* JADX WARN: Code duplicated, block: B:308:0x1c6a  */
                                /* JADX WARN: Code duplicated, block: B:313:0x1cce  */
                                /* JADX WARN: Code duplicated, block: B:314:0x1d0f  */
                                /* JADX WARN: Code duplicated, block: B:317:0x1d27  */
                                /* JADX WARN: Code duplicated, block: B:321:0x1d77  */
                                /* JADX WARN: Code duplicated, block: B:325:0x1d8c  */
                                /* JADX WARN: Code duplicated, block: B:326:0x1df5  */
                                /* JADX WARN: Code duplicated, block: B:329:0x1e70  */
                                /* JADX WARN: Code duplicated, block: B:332:0x1edc  */
                                /* JADX WARN: Code duplicated, block: B:333:0x1f1c  */
                                /* JADX WARN: Code duplicated, block: B:336:0x1f33  */
                                /* JADX WARN: Code duplicated, block: B:338:0x1f3c  */
                                /* JADX WARN: Code duplicated, block: B:341:0x1ff7 A[DONT_INVERT] */
                                /* JADX WARN: Code duplicated, block: B:342:0x1ff9  */
                                /* JADX WARN: Code duplicated, block: B:344:0x2005  */
                                /* JADX WARN: Code duplicated, block: B:350:0x2016  */
                                /* JADX WARN: Code duplicated, block: B:351:0x201d  */
                                /* JADX WARN: Code duplicated, block: B:353:0x2021  */
                                /* JADX WARN: Code duplicated, block: B:357:0x20a8  */
                                /* JADX WARN: Code duplicated, block: B:359:0x20b1  */
                                /* JADX WARN: Code duplicated, block: B:364:0x211d  */
                                /* JADX WARN: Code duplicated, block: B:365:0x2166  */
                                /* JADX WARN: Code duplicated, block: B:368:0x217e  */
                                /* JADX WARN: Code duplicated, block: B:372:0x21d0  */
                                /* JADX WARN: Code duplicated, block: B:376:0x21e7  */
                                /* JADX WARN: Code duplicated, block: B:377:0x225d  */
                                /* JADX WARN: Code duplicated, block: B:380:0x22df  */
                                /* JADX WARN: Code duplicated, block: B:383:0x233f  */
                                /* JADX WARN: Code duplicated, block: B:384:0x2385  */
                                /* JADX WARN: Code duplicated, block: B:387:0x239c  */
                                /* JADX WARN: Code duplicated, block: B:389:0x23af  */
                                /* JADX WARN: Code duplicated, block: B:391:0x2462  */
                                /* JADX WARN: Code duplicated, block: B:394:0x246c A[Catch: all -> 0x34f4, TryCatch #13 {all -> 0x34f4, blocks: (B:476:0x2c82, B:478:0x2c97, B:479:0x2ccd, B:481:0x2d01, B:482:0x2d79, B:392:0x2466, B:394:0x246c, B:395:0x2495, B:397:0x24c0, B:398:0x2548, B:114:0x0a35, B:116:0x0a4a, B:117:0x0a81, B:27:0x01d2, B:29:0x01e6, B:30:0x0214, B:32:0x024e, B:33:0x02d0), top: B:582:0x01d2 }] */
                                /* JADX WARN: Code duplicated, block: B:397:0x24c0 A[Catch: all -> 0x34f4, TryCatch #13 {all -> 0x34f4, blocks: (B:476:0x2c82, B:478:0x2c97, B:479:0x2ccd, B:481:0x2d01, B:482:0x2d79, B:392:0x2466, B:394:0x246c, B:395:0x2495, B:397:0x24c0, B:398:0x2548, B:114:0x0a35, B:116:0x0a4a, B:117:0x0a81, B:27:0x01d2, B:29:0x01e6, B:30:0x0214, B:32:0x024e, B:33:0x02d0), top: B:582:0x01d2 }] */
                                /* JADX WARN: Code duplicated, block: B:401:0x255b  */
                                /* JADX WARN: Code duplicated, block: B:406:0x25ca  */
                                /* JADX WARN: Code duplicated, block: B:409:0x2626  */
                                /* JADX WARN: Code duplicated, block: B:413:0x267b  */
                                /* JADX WARN: Code duplicated, block: B:415:0x26f1  */
                                /* JADX WARN: Code duplicated, block: B:418:0x2735  */
                                /* JADX WARN: Code duplicated, block: B:420:0x273e  */
                                /* JADX WARN: Code duplicated, block: B:423:0x2801  */
                                /* JADX WARN: Code duplicated, block: B:424:0x2803  */
                                /* JADX WARN: Code duplicated, block: B:430:0x2813  */
                                /* JADX WARN: Code duplicated, block: B:434:0x28ae  */
                                /* JADX WARN: Code duplicated, block: B:436:0x28b7  */
                                /* JADX WARN: Code duplicated, block: B:441:0x2922  */
                                /* JADX WARN: Code duplicated, block: B:442:0x2961  */
                                /* JADX WARN: Code duplicated, block: B:445:0x2979  */
                                /* JADX WARN: Code duplicated, block: B:449:0x29c6  */
                                /* JADX WARN: Code duplicated, block: B:453:0x29db  */
                                /* JADX WARN: Code duplicated, block: B:454:0x2a3f  */
                                /* JADX WARN: Code duplicated, block: B:456:0x2a4b  */
                                /* JADX WARN: Code duplicated, block: B:459:0x2a4f A[LOOP:1: B:457:0x2a4c->B:459:0x2a4f, LOOP_END] */
                                /* JADX WARN: Code duplicated, block: B:463:0x2ae4  */
                                /* JADX WARN: Code duplicated, block: B:466:0x2b49  */
                                /* JADX WARN: Code duplicated, block: B:467:0x2b8b  */
                                /* JADX WARN: Code duplicated, block: B:470:0x2ba2  */
                                /* JADX WARN: Code duplicated, block: B:472:0x2bb5  */
                                /* JADX WARN: Code duplicated, block: B:475:0x2c64  */
                                /* JADX WARN: Code duplicated, block: B:478:0x2c97 A[Catch: all -> 0x34f4, TryCatch #13 {all -> 0x34f4, blocks: (B:476:0x2c82, B:478:0x2c97, B:479:0x2ccd, B:481:0x2d01, B:482:0x2d79, B:392:0x2466, B:394:0x246c, B:395:0x2495, B:397:0x24c0, B:398:0x2548, B:114:0x0a35, B:116:0x0a4a, B:117:0x0a81, B:27:0x01d2, B:29:0x01e6, B:30:0x0214, B:32:0x024e, B:33:0x02d0), top: B:582:0x01d2 }] */
                                /* JADX WARN: Code duplicated, block: B:481:0x2d01 A[Catch: all -> 0x34f4, TryCatch #13 {all -> 0x34f4, blocks: (B:476:0x2c82, B:478:0x2c97, B:479:0x2ccd, B:481:0x2d01, B:482:0x2d79, B:392:0x2466, B:394:0x246c, B:395:0x2495, B:397:0x24c0, B:398:0x2548, B:114:0x0a35, B:116:0x0a4a, B:117:0x0a81, B:27:0x01d2, B:29:0x01e6, B:30:0x0214, B:32:0x024e, B:33:0x02d0), top: B:582:0x01d2 }] */
                                /* JADX WARN: Code duplicated, block: B:485:0x2d8c  */
                                /* JADX WARN: Code duplicated, block: B:490:0x2dee  */
                                /* JADX WARN: Code duplicated, block: B:493:0x2e3b  */
                                /* JADX WARN: Code duplicated, block: B:497:0x2e88  */
                                /* JADX WARN: Code duplicated, block: B:499:0x2f04  */
                                /* JADX WARN: Code duplicated, block: B:501:0x2f10  */
                                /* JADX WARN: Code duplicated, block: B:504:0x2f14 A[LOOP:0: B:502:0x2f11->B:504:0x2f14, LOOP_END] */
                                /* JADX WARN: Code duplicated, block: B:510:0x343d  */
                                /* JADX WARN: Code duplicated, block: B:512:0x344c  */
                                /* JADX WARN: Code duplicated, block: B:515:0x3450 A[LOOP:2: B:513:0x344d->B:515:0x3450, LOOP_END] */
                                /* JADX WARN: Code duplicated, block: B:93:0x08e0 A[PHI: r0
  0x08e0: PHI (r0v77 android.os.Bundle) = (r0v76 android.os.Bundle), (r0v464 android.os.Bundle) binds: [B:92:0x08de, B:89:0x08d3] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code duplicated, block: B:96:0x08ee  */
                                @Override // android.content.BroadcastReceiver
                                public final void onReceive(Context context2, Intent intent) throws Throwable {
                                    Context applicationContext2;
                                    Object[] objArr;
                                    Object[] objArr2;
                                    Object[] objArr3;
                                    Bundle bundleExtra;
                                    JSONObject jSONObject;
                                    Object[] objArr4;
                                    Object[] objArr5;
                                    int i;
                                    Object[] objArr6;
                                    Context applicationContext3;
                                    Object[] objArr7;
                                    Object[] objArr8;
                                    int i2;
                                    Object[] objArr9;
                                    String str2;
                                    int i3;
                                    int i4;
                                    ArrayList arrayList;
                                    String[] strArr;
                                    Object[] objArr10;
                                    int i5;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    long j;
                                    long jLongValue;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                    Context applicationContext4;
                                    String str3;
                                    Object[] objArr11;
                                    Object[] objArr12;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                    int i6;
                                    int i7;
                                    Object[] objArr13;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                    long j2;
                                    long jLongValue2;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                    Object obj;
                                    Context applicationContext5;
                                    Object[] objArr14;
                                    String str4;
                                    Object[] objArr15;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                    int i8;
                                    int i9;
                                    int i10;
                                    Object[] objArr16;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                    long j3;
                                    long jLongValue3;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16;
                                    Object[] objArr17;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19;
                                    int i11;
                                    int i12;
                                    int i13;
                                    int i14;
                                    ArrayList arrayList2;
                                    String[] strArr2;
                                    int i15;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20;
                                    String str5;
                                    Object[] objArr18;
                                    Object[] objArr19;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23;
                                    int i16;
                                    int i17;
                                    ArrayList arrayList3;
                                    String[] strArr3;
                                    Object[] objArr20;
                                    int i18;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24;
                                    long j4;
                                    long jLongValue4;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27;
                                    Object[] objArr21;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30;
                                    int i19;
                                    int i20;
                                    ArrayList arrayList4;
                                    String[] strArr4;
                                    Object[] objArr22;
                                    char c;
                                    int i21;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35;
                                    int i22 = 2 % 2;
                                    Object[] objArr23 = new Object[1];
                                    a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 32, ExpandableListView.getPackedPositionChild(0L) + 23, (char) ExpandableListView.getPackedPositionType(0L), objArr23);
                                    String str6 = (String) objArr23[0];
                                    Object[] objArr24 = new Object[1];
                                    a(54 - View.MeasureSpec.getMode(0), ((Process.getThreadPriority(0) + 20) >> 6) + 15, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr24);
                                    String str7 = (String) objArr24[0];
                                    Object[] objArr25 = new Object[1];
                                    a(View.MeasureSpec.makeMeasureSpec(0, 0), (Process.myTid() >> 22) + 16, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr25);
                                    String str8 = (String) objArr25[0];
                                    Object[] objArr26 = new Object[1];
                                    a(16 - (ViewConfiguration.getPressedStateDuration() >> 16), AndroidCharacter.getMirror('0') - ' ', (char) View.MeasureSpec.getSize(0), objArr26);
                                    String str9 = (String) objArr26[0];
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                                        char mode = (char) (53893 - View.MeasureSpec.getMode(0));
                                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1320;
                                        int iResolveSize = View.resolveSize(0, 0) + 36;
                                        Object[] objArr27 = new Object[1];
                                        c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr27);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(mode, minimumFlingVelocity, iResolveSize, -1433084963, false, (String) objArr27[0], null);
                                    }
                                    if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).getLong(null) != -1) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                                            char scrollDefaultDelay = (char) (53893 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                                            int iIndexOf = 1319 - TextUtils.indexOf((CharSequence) "", '0');
                                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 36;
                                            byte b2 = $$a[7];
                                            byte b3 = b2;
                                            Object[] objArr28 = new Object[1];
                                            c(b2, b3, (short) (b3 | 210), objArr28);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(scrollDefaultDelay, iIndexOf, jumpTapTimeout, -1920778747, false, (String) objArr28[0], null);
                                        }
                                        Object[] objArr29 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).get(null);
                                        objArr = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                                        int i23 = ((int[]) objArr29[0])[0];
                                        int i24 = ((int[]) objArr29[3])[0];
                                        String[] strArr5 = (String[]) objArr29[2];
                                        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                        int i25 = (((-594451762) + (((-220201613) | iElapsedRealtime) * (-381))) + (((~((~iElapsedRealtime) | 575642707)) | (-221060815)) * 381)) - 431838851;
                                        int i26 = (i25 << 13) ^ i25;
                                        int i27 = i26 ^ (i26 >>> 17);
                                        ((int[]) objArr[1])[0] = i27 ^ (i27 << 5);
                                    } else {
                                        if (context2 != null) {
                                            int i28 = b + 95;
                                            TuitionPaymentFragmentbindingInflater1 = i28 % 128;
                                            if (i28 % 2 == 0) {
                                                int i29 = 62 / 0;
                                                if (context2 instanceof ContextWrapper) {
                                                    if (((ContextWrapper) context2).getBaseContext() != null) {
                                                        applicationContext2 = null;
                                                    }
                                                }
                                            } else if (context2 instanceof ContextWrapper) {
                                                if (((ContextWrapper) context2).getBaseContext() != null) {
                                                    applicationContext2 = null;
                                                }
                                            }
                                            applicationContext2 = context2.getApplicationContext();
                                        } else {
                                            applicationContext2 = context2;
                                        }
                                        int iIntValue = ((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue();
                                        try {
                                            Object[] objArr30 = {365346511};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b((char) (47976 - TextUtils.lastIndexOf("", '0', 0, 0)), 1300 - View.MeasureSpec.getMode(0), View.MeasureSpec.getSize(0) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
                                            }
                                            Object[] objArr31 = {applicationContext2, "com.bpjstku", 1570692897, Integer.valueOf(iIntValue), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).newInstance(objArr30), false};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                                                char cResolveSize = (char) (53893 - View.resolveSize(0, 0));
                                                int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1320;
                                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 37;
                                                byte b4 = $$a[7];
                                                byte b5 = b4;
                                                Object[] objArr32 = new Object[1];
                                                c(b4, b5, (short) (b5 | 210), objArr32);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(cResolveSize, minimumFlingVelocity2, iIndexOf2, 819724799, false, (String) objArr32[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1393, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 76), Boolean.TYPE});
                                            }
                                            Object[] objArr33 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).invoke(null, objArr31);
                                            if (applicationContext2 != null) {
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                                                    char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 53893);
                                                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1320;
                                                    int threadPriority = 36 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                    byte b6 = $$a[7];
                                                    byte b7 = b6;
                                                    Object[] objArr34 = new Object[1];
                                                    c(b6, b7, (short) (b7 | 210), objArr34);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(c2, windowTouchSlop, threadPriority, -1920778747, false, (String) objArr34[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, objArr33);
                                                try {
                                                    long jLongValue5 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                                                    Long lValueOf = Long.valueOf(jLongValue5);
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                                                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 53894);
                                                        int iAlpha = Color.alpha(0) + 1320;
                                                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36;
                                                        byte[] bArr = $$a;
                                                        byte b8 = (byte) (bArr[33] - 1);
                                                        byte b9 = bArr[7];
                                                        Object[] objArr35 = new Object[1];
                                                        c(b8, b9, (short) (b9 | 158), objArr35);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(modifierMetaStateMask, iAlpha, maximumFlingVelocity, -1273706634, false, (String) objArr35[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf);
                                                    Long lValueOf2 = Long.valueOf(jLongValue5 >> 12);
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                                                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 53893);
                                                        int iBlue = Color.blue(0) + 1320;
                                                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 36;
                                                        Object[] objArr36 = new Object[1];
                                                        c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr36);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(trimmedLength, iBlue, iResolveSizeAndState, -1433084963, false, (String) objArr36[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, lValueOf2);
                                                } catch (Exception unused) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                objArr33 = objArr33;
                                            }
                                            objArr = objArr33;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause == null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                    }
                                    int i30 = ((int[]) objArr[3])[0];
                                    int i31 = ((int[]) objArr[0])[0];
                                    if (i31 == i30) {
                                        objArr2 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                                        int i32 = ((int[]) objArr[1])[0];
                                        int i33 = ((int[]) objArr[0])[0];
                                        int i34 = ((int[]) objArr[3])[0];
                                        String[] strArr6 = (String[]) objArr[2];
                                        int iNextInt = new Random().nextInt(375924737);
                                        int i35 = 721961712 + (((~(583211904 | iNextInt)) | 787415920) * 672);
                                        int i36 = ~iNextInt;
                                        int i37 = i32 + i35 + (((~(iNextInt | 787415920)) | (~((-583211905) | i36))) * (-672)) + (((~((-787415921) | i36)) | 204210288) * 672);
                                        int i38 = (i37 << 13) ^ i37;
                                        int i39 = i38 ^ (i38 >>> 17);
                                        ((int[]) objArr2[1])[0] = i39 ^ (i39 << 5);
                                    } else {
                                        int[] iArr = new int[i31];
                                        int i40 = i31 - 1;
                                        iArr[i40] = 1;
                                        Toast.makeText((Context) null, iArr[((i31 * i40) % 2) - 1], 1).show();
                                        objArr2 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                                        int i41 = ((int[]) objArr[1])[0];
                                        int i42 = ((int[]) objArr[0])[0];
                                        int i43 = ((int[]) objArr[3])[0];
                                        String[] strArr7 = (String[]) objArr[2];
                                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                        int i44 = ~elapsedCpuTime;
                                        int i45 = i41 + (-196621472) + (((~(i44 | 814595328)) | 556032496) * (-1042)) + ((814595328 | elapsedCpuTime) * 521) + (((~(elapsedCpuTime | (-556032497))) | 537141504 | (~(i44 | 833486320))) * 521);
                                        int i46 = (i45 << 13) ^ i45;
                                        int i47 = i46 ^ (i46 >>> 17);
                                        ((int[]) objArr2[1])[0] = i47 ^ (i47 << 5);
                                    }
                                    JSONObject jSONObject2 = new JSONObject();
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                                        char cMyTid = (char) (Process.myTid() >> 22);
                                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 876;
                                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 10;
                                        Object[] objArr37 = new Object[1];
                                        c((byte) 42, $$a[101], (short) 121, objArr37);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(cMyTid, maxKeyCode, iResolveOpacity, -1199417970, false, (String) objArr37[0], null);
                                    }
                                    long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null);
                                    long jLongValue6 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                                        char c3 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                        int i48 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
                                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 10;
                                        Object[] objArr38 = new Object[1];
                                        c((byte) 52, $$a[33], (short) 111, objArr38);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(c3, i48, iKeyCodeFromString, 254769921, false, (String) objArr38[0], null);
                                    }
                                    if (j5 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).getLong(null) << 52) >>> 52)) >> 12)) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                                            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                            int i49 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                                            int iIndexOf3 = TextUtils.indexOf("", "") + 10;
                                            byte[] bArr2 = $$a;
                                            byte b10 = bArr2[44];
                                            byte b11 = bArr2[101];
                                            Object[] objArr39 = new Object[1];
                                            c(b10, b11, (short) (b11 | 98), objArr39);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(pressedStateDuration, i49, iIndexOf3, 1324201839, false, (String) objArr39[0], null);
                                        }
                                        Object[] objArr40 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).get(null);
                                        objArr3 = new Object[]{new int[]{((int[]) objArr40[0])[0]}, new int[1], new int[]{((int[]) objArr40[2])[0]}, (String[]) objArr40[3]};
                                        int iIdentityHashCode = System.identityHashCode(this);
                                        int i50 = ~iIdentityHashCode;
                                        int i51 = 1167521145 + (((~(198753610 | i50)) | (-268435296)) * 98) + (((~(i50 | (-239063840))) | 198753610 | (~(239063839 | iIdentityHashCode))) * (-49)) + (((~(iIdentityHashCode | 198753610)) | 29371456) * 49) + 1100116193;
                                        int i52 = (i51 << 13) ^ i51;
                                        int i53 = i52 ^ (i52 >>> 17);
                                        ((int[]) objArr3[1])[0] = i53 ^ (i53 << 5);
                                    } else {
                                        try {
                                            Object[] objArr41 = {Integer.valueOf(((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue()), 1100116193};
                                            byte[] bArr3 = $$d;
                                            byte b12 = bArr3[55];
                                            Object[] objArr42 = new Object[1];
                                            d((short) 355, b12, (byte) (b12 | 14), objArr42);
                                            Class<?> cls2 = Class.forName((String) objArr42[0]);
                                            Object[] objArr43 = new Object[1];
                                            d((short) 325, (byte) ($$e & 127), (byte) (-bArr3[154]), objArr43);
                                            objArr3 = (Object[]) cls2.getMethod((String) objArr43[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr41);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                                                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                                                int longPressTimeout = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                int i54 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9;
                                                byte[] bArr4 = $$a;
                                                byte b13 = bArr4[44];
                                                byte b14 = bArr4[101];
                                                Object[] objArr44 = new Object[1];
                                                c(b13, b14, (short) (b14 | 98), objArr44);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cResolveOpacity, longPressTimeout, i54, 1324201839, false, (String) objArr44[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, objArr3);
                                            try {
                                                long jLongValue7 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                                                Long lValueOf3 = Long.valueOf(jLongValue7);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                                                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                                                    int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 877;
                                                    int i55 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9;
                                                    Object[] objArr45 = new Object[1];
                                                    c((byte) 52, $$a[33], (short) 111, objArr45);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(cLastIndexOf, modifierMetaStateMask2, i55, 254769921, false, (String) objArr45[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf3);
                                                Long lValueOf4 = Long.valueOf(jLongValue7 >> 12);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                                                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                                    int iResolveOpacity2 = 876 - Drawable.resolveOpacity(0, 0);
                                                    int iRgb = Color.rgb(0, 0, 0) + 16777226;
                                                    Object[] objArr46 = new Object[1];
                                                    c((byte) 42, $$a[101], (short) 121, objArr46);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cKeyCodeFromString, iResolveOpacity2, iRgb, -1199417970, false, (String) objArr46[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, lValueOf4);
                                            } catch (Exception unused2) {
                                                throw new RuntimeException();
                                            }
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 == null) {
                                                throw th2;
                                            }
                                            throw cause2;
                                        }
                                    }
                                    int i56 = ((int[]) objArr3[2])[0];
                                    int i57 = ((int[]) objArr3[0])[0];
                                    if (i57 != i56) {
                                        ArrayList arrayList5 = new ArrayList();
                                        String[] strArr8 = (String[]) objArr3[3];
                                        if (strArr8 != null) {
                                            int i58 = TuitionPaymentFragmentbindingInflater1 + 35;
                                            b = i58 % 128;
                                            int i59 = i58 % 2;
                                            for (String str10 : strArr8) {
                                                arrayList5.add(str10);
                                            }
                                        }
                                        throw new RuntimeException(String.valueOf(i57));
                                    }
                                    int i60 = ((int[]) objArr3[1])[0];
                                    Object[] objArr47 = {new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
                                    int iIdentityHashCode2 = System.identityHashCode(this);
                                    int i61 = ~iIdentityHashCode2;
                                    int i62 = i60 + 1900139060 + (((-8786985) | iIdentityHashCode2) * (-676)) + (((~(24707478 | i61)) | 8786984) * 676) + (((~(iIdentityHashCode2 | 33494462)) | (~(i61 | (-15602751))) | 6815766) * 676);
                                    int i63 = (i62 << 13) ^ i62;
                                    int i64 = i63 ^ (i63 >>> 17);
                                    ((int[]) objArr47[1])[0] = i64 ^ (i64 << 5);
                                    int i65 = TuitionPaymentFragmentbindingInflater1 + 101;
                                    b = i65 % 128;
                                    if (i65 % 2 != 0) {
                                        bundleExtra = intent.getBundleExtra("event_args");
                                        int i66 = 89 / 0;
                                        if (bundleExtra != null) {
                                            for (String str11 : bundleExtra.keySet()) {
                                                try {
                                                    jSONObject = jSONObject2;
                                                    try {
                                                        jSONObject.put(str11, bundleExtra.get(str11));
                                                    } catch (JSONException unused3) {
                                                    }
                                                } catch (JSONException unused4) {
                                                    jSONObject = jSONObject2;
                                                }
                                                jSONObject2 = jSONObject;
                                            }
                                        }
                                    } else {
                                        bundleExtra = intent.getBundleExtra("event_args");
                                        if (bundleExtra != null) {
                                            while (r2.hasNext()) {
                                                jSONObject = jSONObject2;
                                                jSONObject.put(str11, bundleExtra.get(str11));
                                                jSONObject2 = jSONObject;
                                            }
                                        }
                                    }
                                    JSONObject jSONObject3 = jSONObject2;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                                        char modifierMetaStateMask3 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 29945);
                                        int iArgb = Color.argb(0, 0, 0, 0) + 1755;
                                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 23;
                                        byte[] bArr5 = $$a;
                                        byte b15 = (byte) (bArr5[33] - 1);
                                        byte b16 = bArr5[7];
                                        Object[] objArr48 = new Object[1];
                                        c(b15, b16, (short) (b16 | 158), objArr48);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(modifierMetaStateMask3, iArgb, packedPositionGroup, 986134021, false, (String) objArr48[0], null);
                                    }
                                    if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).getLong(null) != -1) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                                            char c4 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
                                            int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1755;
                                            int trimmedLength2 = TextUtils.getTrimmedLength("") + 23;
                                            byte b17 = $$a[7];
                                            byte b18 = b17;
                                            Object[] objArr49 = new Object[1];
                                            c(b17, b18, (short) (b18 | 210), objArr49);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(c4, minimumFlingVelocity3, trimmedLength2, 1599039318, false, (String) objArr49[0], null);
                                        }
                                        Object[] objArr50 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).get(null);
                                        objArr4 = new Object[]{new int[]{((int[]) objArr50[0])[0]}, new int[]{((int[]) objArr50[1])[0]}, (Object[]) objArr50[2], new int[1], (String[]) objArr50[4]};
                                        int i67 = (~System.identityHashCode(this)) | 854541967;
                                        int i68 = (((-812668078) + (i67 * 495)) + (((~i67) | 279725706) * 495)) - 990006;
                                        int i69 = (i68 << 13) ^ i68;
                                        int i70 = i69 ^ (i69 >>> 17);
                                        ((int[]) objArr4[3])[0] = i70 ^ (i70 << 5);
                                        jSONObject3 = jSONObject3;
                                    } else {
                                        int iIntValue2 = ((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue();
                                        Object[] objArr51 = {1874013154};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b((char) (42048 - ExpandableListView.getPackedPositionChild(0L)), 1727 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 30 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                                        }
                                        Object[] objArrB$7879113 = onScroll.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).newInstance(objArr51), -990006, false, true);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                                            char cResolveSize2 = (char) (View.resolveSize(0, 0) + 29944);
                                            int i71 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 24;
                                            byte b19 = $$a[7];
                                            byte b20 = b19;
                                            Object[] objArr52 = new Object[1];
                                            c(b19, b20, (short) (b20 | 210), objArr52);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(cResolveSize2, i71, iLastIndexOf, 1599039318, false, (String) objArr52[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, objArrB$7879113);
                                        try {
                                            long jLongValue8 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                                            Long lValueOf5 = Long.valueOf(jLongValue8);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                                                char maximumFlingVelocity2 = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
                                                int edgeSlop = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                byte b21 = $$a[7];
                                                byte b22 = b21;
                                                Object[] objArr53 = new Object[1];
                                                c(b21, b22, (short) (b22 | 104), objArr53);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(maximumFlingVelocity2, edgeSlop, scrollBarSize, 1596667560, false, (String) objArr53[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf5);
                                            Long lValueOf6 = Long.valueOf(jLongValue8 >> 12);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                                                char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
                                                int iIndexOf4 = TextUtils.indexOf("", "") + 1755;
                                                int i72 = 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                byte[] bArr6 = $$a;
                                                byte b23 = (byte) (bArr6[33] - 1);
                                                byte b24 = bArr6[7];
                                                Object[] objArr54 = new Object[1];
                                                c(b23, b24, (short) (b24 | 158), objArr54);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(fadingEdgeLength, iIndexOf4, i72, 986134021, false, (String) objArr54[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, lValueOf6);
                                            objArr4 = objArrB$7879113;
                                        } catch (Exception unused5) {
                                            throw new RuntimeException();
                                        }
                                    }
                                    int i73 = ((int[]) objArr4[1])[0];
                                    int i74 = ((int[]) objArr4[0])[0];
                                    if (i74 == i73) {
                                        int i75 = ((int[]) objArr4[3])[0];
                                        objArr5 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                                        int iMyPid = Process.myPid();
                                        int i76 = ~(366976958 | iMyPid);
                                        int i77 = i75 + (-1443127459) + ((17535360 | i76) * (-476)) + (i76 * 952) + ((~((~iMyPid) | 366976958)) * 476);
                                        int i78 = (i77 << 13) ^ i77;
                                        int i79 = i78 ^ (i78 >>> 17);
                                        i = 0;
                                        ((int[]) objArr5[3])[0] = i79 ^ (i79 << 5);
                                    } else {
                                        ArrayList arrayList6 = new ArrayList();
                                        String[] strArr9 = (String[]) objArr4[4];
                                        if (strArr9 != null) {
                                            for (String str12 : strArr9) {
                                                arrayList6.add(str12);
                                            }
                                        }
                                        int[] iArr2 = new int[i74];
                                        int i80 = i74 - 1;
                                        iArr2[i80] = 1;
                                        Toast.makeText((Context) null, iArr2[((i74 * i80) % 2) - 1], 1).show();
                                        int i81 = ((int[]) objArr4[3])[0];
                                        objArr5 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                                        int iIdentityHashCode3 = System.identityHashCode(this);
                                        int i82 = i81 + (-676980857) + (((~((-102092986) | iIdentityHashCode3)) | 33673393) * (-140)) + ((~((-68419593) | iIdentityHashCode3)) * 70) + (((~(iIdentityHashCode3 | 314695411)) | (-349441611)) * 70);
                                        int i83 = (i82 << 13) ^ i82;
                                        int i84 = i83 ^ (i83 >>> 17);
                                        i = 0;
                                        ((int[]) objArr5[3])[0] = i84 ^ (i84 << 5);
                                    }
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                                        char size = (char) (43042 - View.MeasureSpec.getSize(i));
                                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3111;
                                        int iIndexOf5 = 22 - TextUtils.indexOf("", "", i);
                                        byte b25 = $$a[7];
                                        byte b26 = b25;
                                        Object[] objArr55 = new Object[1];
                                        c(b25, b26, (short) (b26 | 52), objArr55);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(size, maximumDrawingCacheSize, iIndexOf5, -1272852037, false, (String) objArr55[0], null);
                                    }
                                    if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).getLong(null) != -1) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                                            char bitsPerPixel = (char) (43041 - ImageFormat.getBitsPerPixel(0));
                                            int iIndexOf6 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3112;
                                            int iIndexOf7 = TextUtils.indexOf((CharSequence) "", '0') + 23;
                                            byte[] bArr7 = $$a;
                                            byte b27 = (byte) (bArr7[33] - 1);
                                            byte b28 = bArr7[7];
                                            Object[] objArr56 = new Object[1];
                                            c(b27, b28, (short) (b28 | 158), objArr56);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(bitsPerPixel, iIndexOf6, iIndexOf7, 154975793, false, (String) objArr56[0], null);
                                        }
                                        Object[] objArr57 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).get(null);
                                        int i85 = ((int[]) objArr57[2])[0];
                                        int i86 = ((int[]) objArr57[1])[0];
                                        String[] strArr10 = (String[]) objArr57[3];
                                        int[] iArr3 = {i86};
                                        int iMyTid = Process.myTid();
                                        int i87 = ~iMyTid;
                                        int i88 = (~((-1018674727) | i87)) | 681621540;
                                        int i89 = ~(iMyTid | 1023409918);
                                        int i90 = ((281660858 + ((i88 | i89) * (-502))) + ((i89 | (~(i87 | (-337053187)))) * TypedValues.PositionType.TYPE_DRAWPATH)) - 1792483797;
                                        int i91 = (i90 << 13) ^ i90;
                                        int i92 = i91 ^ (i91 >>> 17);
                                        ((int[]) objArr6[0])[0] = i92 ^ (i92 << 5);
                                        objArr6 = new Object[]{new int[1], iArr3, new int[]{i85}, strArr10};
                                        objArr5 = objArr5;
                                    } else {
                                        Object[] objArr58 = {null, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue()), 0, -1792483797};
                                        byte[] bArr8 = $$d;
                                        Object[] objArr59 = new Object[1];
                                        d((short) 288, bArr8[5], (byte) (-bArr8[7]), objArr59);
                                        Class<?> cls3 = Class.forName((String) objArr59[0]);
                                        Object[] objArr60 = new Object[1];
                                        d((short) 325, (byte) ($$e & 127), (byte) (-bArr8[154]), objArr60);
                                        Object[] objArr61 = (Object[]) cls3.getMethod((String) objArr60[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr58);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                                            char c5 = (char) (43042 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                            int i93 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3110;
                                            int iKeyCodeFromString2 = 22 - KeyEvent.keyCodeFromString("");
                                            byte[] bArr9 = $$a;
                                            byte b29 = (byte) (bArr9[33] - 1);
                                            byte b30 = bArr9[7];
                                            Object[] objArr62 = new Object[1];
                                            c(b29, b30, (short) (b30 | 158), objArr62);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(c5, i93, iKeyCodeFromString2, 154975793, false, (String) objArr62[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, objArr61);
                                        try {
                                            long jLongValue9 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                                            Long lValueOf7 = Long.valueOf(jLongValue9);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                                                char cMakeMeasureSpec = (char) (43042 - View.MeasureSpec.makeMeasureSpec(0, 0));
                                                int iIndexOf8 = 3110 - TextUtils.indexOf((CharSequence) "", '0');
                                                int iRgb2 = (-16777194) - Color.rgb(0, 0, 0);
                                                byte b31 = $$a[7];
                                                byte b32 = b31;
                                                Object[] objArr63 = new Object[1];
                                                c(b31, b32, (short) (b32 | 210), objArr63);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cMakeMeasureSpec, iIndexOf8, iRgb2, -1269618118, false, (String) objArr63[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf7);
                                            Long lValueOf8 = Long.valueOf(jLongValue9 >> 12);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                                                char c6 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43041);
                                                int iBlue2 = 3111 - Color.blue(0);
                                                int iKeyCodeFromString3 = KeyEvent.keyCodeFromString("") + 22;
                                                byte b33 = $$a[7];
                                                byte b34 = b33;
                                                Object[] objArr64 = new Object[1];
                                                c(b33, b34, (short) (b34 | 52), objArr64);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(c6, iBlue2, iKeyCodeFromString3, -1272852037, false, (String) objArr64[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, lValueOf8);
                                            objArr6 = objArr61;
                                        } catch (Exception unused6) {
                                            throw new RuntimeException();
                                        }
                                    }
                                    if (((int[]) objArr6[2])[0] != ((int[]) objArr6[1])[0]) {
                                        ArrayList arrayList7 = new ArrayList();
                                        String[] strArr11 = (String[]) objArr6[3];
                                        if (strArr11 != null) {
                                            for (String str13 : strArr11) {
                                                int i94 = b + 65;
                                                TuitionPaymentFragmentbindingInflater1 = i94 % 128;
                                                int i95 = i94 % 2;
                                                arrayList7.add(str13);
                                            }
                                        }
                                        throw null;
                                    }
                                    int i96 = ((int[]) objArr6[0])[0];
                                    int i97 = ((int[]) objArr6[2])[0];
                                    int i98 = ((int[]) objArr6[1])[0];
                                    String[] strArr12 = (String[]) objArr6[3];
                                    int[] iArr4 = {i98};
                                    int iIdentityHashCode4 = System.identityHashCode(this);
                                    int i99 = ~iIdentityHashCode4;
                                    int i100 = i96 + (-1452760962) + (((~((-1057304835) | i99)) | 419705090) * 98) + (((~(i99 | (-647726625))) | (-1057304835) | (~(647726624 | iIdentityHashCode4))) * (-49)) + (((~(iIdentityHashCode4 | (-1057304835))) | (-1067431715)) * 49);
                                    int i101 = (i100 << 13) ^ i100;
                                    int i102 = i101 ^ (i101 >>> 17);
                                    ((int[]) objArr[0])[0] = i102 ^ (i102 << 5);
                                    Object[] objArr65 = {new int[1], iArr4, new int[]{i97}, strArr12};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                                        char cMakeMeasureSpec2 = (char) (31533 - View.MeasureSpec.makeMeasureSpec(0, 0));
                                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 921;
                                        int maxKeyCode2 = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                                        Object[] objArr66 = new Object[1];
                                        c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr66);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(cMakeMeasureSpec2, scrollBarFadeDuration, maxKeyCode2, -1048449946, false, (String) objArr66[0], null);
                                    }
                                    if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).getLong(null) != -1) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                                            char cAxisFromString = (char) (31532 - MotionEvent.axisFromString(""));
                                            int modifierMetaStateMask4 = 920 - ((byte) KeyEvent.getModifierMetaStateMask());
                                            int iIndexOf9 = TextUtils.indexOf("", "") + 28;
                                            byte[] bArr10 = $$a;
                                            byte b35 = (byte) (bArr10[33] - 1);
                                            byte b36 = bArr10[7];
                                            Object[] objArr67 = new Object[1];
                                            c(b35, b36, (short) (b36 | 158), objArr67);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(cAxisFromString, modifierMetaStateMask4, iIndexOf9, -1142834547, false, (String) objArr67[0], null);
                                        }
                                        Object[] objArr68 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).get(null);
                                        objArr7 = new Object[]{new int[1], new int[]{((int[]) objArr68[1])[0]}, (Object[]) objArr68[2], new int[]{((int[]) objArr68[3])[0]}, (String[]) objArr68[4]};
                                        int iIdentityHashCode5 = System.identityHashCode(this);
                                        int i103 = ~iIdentityHashCode5;
                                        int i104 = (((81443043 + (((~((-1508167295) | i103)) | 163610652) * 168)) + ((~((-163610653) | iIdentityHashCode5)) * 168)) + (((~(iIdentityHashCode5 | (-1344556643))) | ((~(i103 | (-265912350))) | 102301697)) * 168)) - 2061906559;
                                        int i105 = (i104 << 13) ^ i104;
                                        int i106 = i105 ^ (i105 >>> 17);
                                        ((int[]) objArr7[0])[0] = i106 ^ (i106 << 5);
                                        applicationContext3 = context2;
                                        objArr47 = objArr47;
                                        objArr65 = objArr65;
                                    } else {
                                        applicationContext3 = context2;
                                        Object[] objArr69 = {applicationContext3 != null ? ((applicationContext3 instanceof ContextWrapper) && ((ContextWrapper) applicationContext3).getBaseContext() == null) ? null : context2.getApplicationContext() : applicationContext3, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue()), 0, -2061906559};
                                        byte[] bArr11 = $$d;
                                        Object[] objArr70 = new Object[1];
                                        d((short) 235, bArr11[55], bArr11[134], objArr70);
                                        Class<?> cls4 = Class.forName((String) objArr70[0]);
                                        Object[] objArr71 = new Object[1];
                                        d((short) 180, bArr11[130], bArr11[5], objArr71);
                                        Object[] objArr72 = (Object[]) cls4.getMethod((String) objArr71[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr69);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                                            char cMakeMeasureSpec3 = (char) (31533 - View.MeasureSpec.makeMeasureSpec(0, 0));
                                            int i107 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 920;
                                            int i108 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            byte[] bArr12 = $$a;
                                            byte b37 = (byte) (bArr12[33] - 1);
                                            byte b38 = bArr12[7];
                                            Object[] objArr73 = new Object[1];
                                            c(b37, b38, (short) (b38 | 158), objArr73);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(cMakeMeasureSpec3, i107, i108, -1142834547, false, (String) objArr73[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArr72);
                                        try {
                                            long jLongValue10 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                                            Long lValueOf9 = Long.valueOf(jLongValue10);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                                                char size2 = (char) (31533 - View.MeasureSpec.getSize(0));
                                                int mirror = 969 - AndroidCharacter.getMirror('0');
                                                int minimumFlingVelocity4 = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                byte b39 = $$a[7];
                                                byte b40 = b39;
                                                Object[] objArr74 = new Object[1];
                                                c(b39, b40, (short) (b40 | 210), objArr74);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(size2, mirror, minimumFlingVelocity4, -778300370, false, (String) objArr74[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf9);
                                            Long lValueOf10 = Long.valueOf(jLongValue10 >> 12);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                                                char scrollBarFadeDuration2 = (char) (31533 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                int packedPositionType = 921 - ExpandableListView.getPackedPositionType(0L);
                                                int iIndexOf10 = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                                Object[] objArr75 = new Object[1];
                                                c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr75);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(scrollBarFadeDuration2, packedPositionType, iIndexOf10, -1048449946, false, (String) objArr75[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf10);
                                            objArr7 = objArr72;
                                        } catch (Exception unused7) {
                                            throw new RuntimeException();
                                        }
                                    }
                                    int i109 = ((int[]) objArr7[1])[0];
                                    int i110 = ((int[]) objArr7[3])[0];
                                    if (i110 == i109) {
                                        int i111 = ((int[]) objArr7[0])[0];
                                        objArr8 = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                                        int iMyUid = Process.myUid();
                                        int i112 = ~iMyUid;
                                        int i113 = i111 + (-790506937) + (((~((-1174143482) | i112)) | (-599936163) | (~(1174143481 | iMyUid))) * (-564)) + ((~(iMyUid | (-570575875))) * 1128) + (((~((-599936163) | i112)) | (-1744719356)) * 564);
                                        int i114 = (i113 << 13) ^ i113;
                                        int i115 = i114 ^ (i114 >>> 17);
                                        i2 = 0;
                                        ((int[]) objArr8[0])[0] = i115 ^ (i115 << 5);
                                    } else {
                                        ArrayList arrayList8 = new ArrayList();
                                        String[] strArr13 = (String[]) objArr7[4];
                                        if (strArr13 != null) {
                                            for (String str14 : strArr13) {
                                                arrayList8.add(str14);
                                            }
                                        }
                                        Toast.makeText((Context) null, i110 / (((i110 - 1) * i110) % 2), 0).show();
                                        int i116 = ((int[]) objArr7[0])[0];
                                        objArr8 = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                                        int i117 = (int) Runtime.getRuntime().totalMemory();
                                        int i118 = i116 + 2139271263 + ((~((~i117) | 968703643)) * (-116)) + ((949563538 | i117) * 116) + (((~(i117 | (-824516106))) | 805376000) * 116);
                                        int i119 = (i118 << 13) ^ i118;
                                        int i120 = i119 ^ (i119 >>> 17);
                                        i2 = 0;
                                        ((int[]) objArr8[0])[0] = i120 ^ (i120 << 5);
                                    }
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                                        char cResolveSize3 = (char) (View.resolveSize(i2, i2) + 37567);
                                        int iCombineMeasuredStates = 625 - View.combineMeasuredStates(i2, i2);
                                        int iIndexOf11 = 13 - TextUtils.indexOf((CharSequence) "", '0', i2, i2);
                                        Object[] objArr76 = new Object[1];
                                        c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr76);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cResolveSize3, iCombineMeasuredStates, iIndexOf11, -477065106, false, (String) objArr76[0], null);
                                    }
                                    long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null);
                                    long jLongValue11 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                                        char cCombineMeasuredStates = (char) (37567 - View.combineMeasuredStates(0, 0));
                                        int iBlue3 = Color.blue(0) + 625;
                                        int defaultSize = View.getDefaultSize(0, 0) + 14;
                                        byte b41 = $$a[7];
                                        byte b42 = b41;
                                        Object[] objArr77 = new Object[1];
                                        c(b41, b42, (short) (b42 | 52), objArr77);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(cCombineMeasuredStates, iBlue3, defaultSize, -976899241, false, (String) objArr77[0], null);
                                    }
                                    if (j6 != ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) << 52) >>> 52)) >> 12)) {
                                        Context applicationContext6 = applicationContext3 != null ? ((applicationContext3 instanceof ContextWrapper) && ((ContextWrapper) applicationContext3).getBaseContext() == null) ? null : context2.getApplicationContext() : applicationContext3;
                                        int iIntValue3 = ((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue();
                                        Object[] objArr78 = new Object[1];
                                        a(Process.getGidForName("") + 70, 64 - TextUtils.getTrimmedLength(""), (char) (MotionEvent.axisFromString("") + 1), objArr78);
                                        String str15 = (String) objArr78[0];
                                        Object[] objArr79 = new Object[1];
                                        a(TextUtils.indexOf("", "", 0, 0) + 133, 63 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (12413 - View.getDefaultSize(0, 0)), objArr79);
                                        Object[] objArr80 = {applicationContext6, new String[]{str15, (String) objArr79[0]}, Integer.valueOf(iIntValue3), 17, 2002920741};
                                        byte[] bArr13 = $$d;
                                        Object[] objArr81 = new Object[1];
                                        d((short) 180, bArr13[5], bArr13[390], objArr81);
                                        Class<?> cls5 = Class.forName((String) objArr81[0]);
                                        int i121 = $$e;
                                        Object[] objArr82 = new Object[1];
                                        d((short) (i121 & PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW), (byte) (i121 & 127), bArr13[29], objArr82);
                                        objArr9 = (Object[]) cls5.getMethod((String) objArr82[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr80);
                                        int i122 = ((int[]) objArr9[0])[0];
                                        int i123 = ((int[]) objArr9[2])[0];
                                        if (applicationContext6 != null) {
                                            int i124 = TuitionPaymentFragmentbindingInflater1 + 67;
                                            b = i124 % 128;
                                            try {
                                                if (i124 % 2 != 0) {
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                                                        char c7 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 37566);
                                                        int windowTouchSlop2 = 625 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                        int iNormalizeMetaState = 14 - KeyEvent.normalizeMetaState(0);
                                                        byte b43 = $$a[7];
                                                        byte b44 = b43;
                                                        Object[] objArr83 = new Object[1];
                                                        c(b43, b44, (short) (b44 | 210), objArr83);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(c7, windowTouchSlop2, iNormalizeMetaState, -973632554, false, (String) objArr83[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).set(null, objArr9);
                                                    str2 = str7;
                                                    long jLongValue12 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[1])).longValue();
                                                    Long lValueOf11 = Long.valueOf(jLongValue12);
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                                                        char maxKeyCode3 = (char) (37567 - (KeyEvent.getMaxKeyCode() >> 16));
                                                        int minimumFlingVelocity5 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 625;
                                                        int i125 = 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                        byte b45 = $$a[7];
                                                        byte b46 = b45;
                                                        Object[] objArr84 = new Object[1];
                                                        c(b45, b46, (short) (b46 | 52), objArr84);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(maxKeyCode3, minimumFlingVelocity5, i125, -976899241, false, (String) objArr84[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, lValueOf11);
                                                    Long lValueOf12 = Long.valueOf(jLongValue12 >>> 71);
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                                                        char size3 = (char) (37567 - View.MeasureSpec.getSize(0));
                                                        int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 625;
                                                        int iResolveSizeAndState2 = 14 - View.resolveSizeAndState(0, 0, 0);
                                                        Object[] objArr85 = new Object[1];
                                                        c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr85);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(size3, iCombineMeasuredStates2, iResolveSizeAndState2, -477065106, false, (String) objArr85[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf12);
                                                } else {
                                                    str9 = str9;
                                                    str2 = str7;
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                                                        char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 37568);
                                                        int mode2 = View.MeasureSpec.getMode(0) + 625;
                                                        int iRgb3 = (-16777202) - Color.rgb(0, 0, 0);
                                                        byte b47 = $$a[7];
                                                        byte b48 = b47;
                                                        Object[] objArr86 = new Object[1];
                                                        c(b47, b48, (short) (b48 | 210), objArr86);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cLastIndexOf2, mode2, iRgb3, -973632554, false, (String) objArr86[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, objArr9);
                                                    long jLongValue13 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                                                    Long lValueOf13 = Long.valueOf(jLongValue13);
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                                                        char cResolveOpacity2 = (char) (Drawable.resolveOpacity(0, 0) + 37567);
                                                        int i126 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 624;
                                                        int iCombineMeasuredStates3 = View.combineMeasuredStates(0, 0) + 14;
                                                        byte b49 = $$a[7];
                                                        byte b50 = b49;
                                                        Object[] objArr87 = new Object[1];
                                                        c(b49, b50, (short) (b50 | 52), objArr87);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(cResolveOpacity2, i126, iCombineMeasuredStates3, -976899241, false, (String) objArr87[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf13);
                                                    Long lValueOf14 = Long.valueOf(jLongValue13 >> 12);
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                                                        char tapTimeout = (char) (37567 - (ViewConfiguration.getTapTimeout() >> 16));
                                                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 625;
                                                        int offsetBefore = 14 - TextUtils.getOffsetBefore("", 0);
                                                        Object[] objArr88 = new Object[1];
                                                        c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr88);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(tapTimeout, touchSlop, offsetBefore, -477065106, false, (String) objArr88[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf14);
                                                }
                                            } catch (Exception unused8) {
                                                throw new RuntimeException();
                                            }
                                        }
                                        i3 = ((int[]) objArr9[0])[0];
                                        i4 = ((int[]) objArr9[2])[0];
                                        if (i4 == i3) {
                                            int i127 = ((int[]) objArr9[1])[0];
                                            int i128 = ((int[]) objArr9[2])[0];
                                            int i129 = ((int[]) objArr9[0])[0];
                                            String[] strArr14 = (String[]) objArr9[3];
                                            int[] iArr5 = {i128};
                                            int iMyUid2 = Process.myUid();
                                            int i130 = ~((-770894097) | (~iMyUid2));
                                            int i131 = i127 + ((302061288 | i130 | (~(770894096 | iMyUid2))) * (-338)) + 841238360 + (((~(iMyUid2 | 1072955384)) | i130) * 338);
                                            int i132 = (i131 << 13) ^ i131;
                                            int i133 = i132 ^ (i132 >>> 17);
                                            ((int[]) objArr10[1])[0] = i133 ^ (i133 << 5);
                                            objArr10 = new Object[]{new int[]{i129}, new int[1], iArr5, strArr14};
                                        } else {
                                            arrayList = new ArrayList();
                                            strArr = (String[]) objArr9[3];
                                            if (strArr != null) {
                                                for (String str16 : strArr) {
                                                    arrayList.add(str16);
                                                }
                                            }
                                            int[] iArr6 = new int[i4];
                                            int i134 = i4 - 1;
                                            iArr6[i134] = 1;
                                            Toast.makeText((Context) null, iArr6[((i4 * i134) % 2) - 1], 1).show();
                                            int i135 = ((int[]) objArr9[1])[0];
                                            int i136 = ((int[]) objArr9[2])[0];
                                            int i137 = ((int[]) objArr9[0])[0];
                                            String[] strArr15 = (String[]) objArr9[3];
                                            int i138 = ~((int) SystemClock.elapsedRealtime());
                                            int i139 = i135 + 1281253440 + ((~(1609825991 | i138)) * 52) + (((~(215023297 | i138)) | (~((-1608714824) | i138)) | 1394802694) * (-52)) + (((~(i138 | (-215023298))) | 1111168) * 52);
                                            int i140 = (i139 << 13) ^ i139;
                                            int i141 = i140 ^ (i140 >>> 17);
                                            ((int[]) objArr10[1])[0] = i141 ^ (i141 << 5);
                                            objArr10 = new Object[]{new int[]{i137}, new int[1], new int[]{i136}, strArr15};
                                        }
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char c8 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                            int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
                                            int packedPositionGroup2 = 10 - ExpandableListView.getPackedPositionGroup(0L);
                                            byte[] bArr14 = $$a;
                                            byte b51 = (byte) (bArr14[33] - 1);
                                            byte b52 = bArr14[7];
                                            Object[] objArr89 = new Object[1];
                                            c(b51, b52, (short) (b52 | 158), objArr89);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c8, scrollDefaultDelay2, packedPositionGroup2, -1650998592, false, (String) objArr89[0], null);
                                        }
                                        j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                                        jLongValue = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char modifierMetaStateMask5 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                                            int i142 = 876 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 11;
                                            byte b53 = $$a[7];
                                            byte b54 = b53;
                                            Object[] objArr90 = new Object[1];
                                            c(b53, b54, (short) (b54 | 210), objArr90);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask5, i142, packedPositionChild, 2012020043, false, (String) objArr90[0], null);
                                        }
                                        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                                                char c9 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                int iKeyCodeFromString4 = KeyEvent.keyCodeFromString("") + 876;
                                                int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                                                byte b55 = $$a[7];
                                                byte b56 = b55;
                                                Object[] objArr91 = new Object[1];
                                                c(b55, b56, (short) (b56 | 52), objArr91);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c9, iKeyCodeFromString4, edgeSlop2, 2012931276, false, (String) objArr91[0], null);
                                            }
                                            Object[] objArr92 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).get(null);
                                            objArr12 = new Object[]{new int[]{((int[]) objArr92[0])[0]}, new int[1], new int[]{((int[]) objArr92[2])[0]}, (String[]) objArr92[3]};
                                            int iIdentityHashCode6 = System.identityHashCode(this);
                                            int i143 = ((420329028 + (((-67372113) | iIdentityHashCode6) * (-381))) + (((~((~iIdentityHashCode6) | (-69529214))) | 44624431) * 381)) - 1596424072;
                                            int i144 = (i143 << 13) ^ i143;
                                            int i145 = i144 ^ (i144 >>> 17);
                                            ((int[]) objArr12[1])[0] = i145 ^ (i145 << 5);
                                            str3 = str9;
                                        } else {
                                            if (applicationContext3 != null) {
                                                applicationContext4 = applicationContext3;
                                            } else if ((applicationContext3 instanceof ContextWrapper) || ((ContextWrapper) applicationContext3).getBaseContext() != null) {
                                                applicationContext4 = context2.getApplicationContext();
                                            } else {
                                                applicationContext4 = null;
                                            }
                                            str3 = str9;
                                            Object[] objArr93 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str3, Object.class).invoke(null, this)).intValue()), 0, -1495394968};
                                            byte[] bArr15 = $$d;
                                            Object[] objArr94 = new Object[1];
                                            d((short) 101, bArr15[55], bArr15[337], objArr94);
                                            Class<?> cls6 = Class.forName((String) objArr94[0]);
                                            Object[] objArr95 = new Object[1];
                                            d((short) 87, (byte) ($$e & 127), bArr15[29], objArr95);
                                            objArr11 = (Object[]) cls6.getMethod((String) objArr95[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr93);
                                            if (applicationContext4 != null) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 876;
                                                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 10;
                                                    byte b57 = $$a[7];
                                                    byte b58 = b57;
                                                    Object[] objArr96 = new Object[1];
                                                    c(b57, b58, (short) (b58 | 52), objArr96);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop2, capsMode, offsetBefore2, 2012931276, false, (String) objArr96[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr11);
                                                try {
                                                    long jLongValue14 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                                                    Long lValueOf15 = Long.valueOf(jLongValue14);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                        char maximumFlingVelocity3 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                        int i146 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 875;
                                                        int iIndexOf12 = TextUtils.indexOf("", "", 0) + 10;
                                                        byte b59 = $$a[7];
                                                        byte b60 = b59;
                                                        Object[] objArr97 = new Object[1];
                                                        c(b59, b60, (short) (b60 | 210), objArr97);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity3, i146, iIndexOf12, 2012020043, false, (String) objArr97[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf15);
                                                    Long lValueOf16 = Long.valueOf(jLongValue14 >> 12);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                        char cMyPid = (char) (Process.myPid() >> 22);
                                                        int iLastIndexOf2 = 875 - TextUtils.lastIndexOf("", '0', 0);
                                                        int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 10;
                                                        byte[] bArr16 = $$a;
                                                        byte b61 = (byte) (bArr16[33] - 1);
                                                        byte b62 = bArr16[7];
                                                        Object[] objArr98 = new Object[1];
                                                        c(b61, b62, (short) (b62 | 158), objArr98);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, iLastIndexOf2, packedPositionType2, -1650998592, false, (String) objArr98[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf16);
                                                } catch (Exception unused9) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                objArr11 = objArr11;
                                            }
                                            objArr12 = objArr11;
                                        }
                                        i6 = ((int[]) objArr12[2])[0];
                                        i7 = ((int[]) objArr12[0])[0];
                                        if (i7 == i6) {
                                            int i147 = ((int[]) objArr12[1])[0];
                                            objArr13 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
                                            int iIdentityHashCode7 = System.identityHashCode(this);
                                            int i148 = (~((-1025916324) | iIdentityHashCode7)) | 83892257;
                                            int i149 = i147 + 1521273620 + (i148 * 992) + ((i148 | (~((~iIdentityHashCode7) | (-43582029)))) * (-496)) + ((iIdentityHashCode7 | (-985606095)) * 496);
                                            int i150 = (i149 << 13) ^ i149;
                                            int i151 = i150 ^ (i150 >>> 17);
                                            ((int[]) objArr13[1])[0] = i151 ^ (i151 << 5);
                                        } else {
                                            int[] iArr7 = new int[i7];
                                            int i152 = i7 - 1;
                                            iArr7[i152] = 1;
                                            Toast.makeText((Context) null, iArr7[((i7 * i152) % 2) - 1], 1).show();
                                            int i153 = ((int[]) objArr12[1])[0];
                                            objArr13 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
                                            int i154 = ~(System.identityHashCode(this) | 366156158);
                                            int i155 = i153 + (((-113187544) | i154) * (-658)) + 1491734180 + ((i154 | (-402594816)) * 658);
                                            int i156 = (i155 << 13) ^ i155;
                                            int i157 = i156 ^ (i156 >>> 17);
                                            ((int[]) objArr13[1])[0] = i157 ^ (i157 << 5);
                                        }
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char c10 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                            int iLastIndexOf3 = 875 - TextUtils.lastIndexOf("", '0');
                                            int i158 = 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                            Object[] objArr99 = new Object[1];
                                            c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr99);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c10, iLastIndexOf3, i158, 252381699, false, (String) objArr99[0], null);
                                        }
                                        j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
                                        jLongValue2 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                            char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                            int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 876;
                                            int packedPositionGroup3 = 10 - ExpandableListView.getPackedPositionGroup(0L);
                                            byte b63 = $$a[7];
                                            byte b64 = b63;
                                            Object[] objArr100 = new Object[1];
                                            c(b63, b64, (short) (b64 | 104), objArr100);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(tapTimeout2, iResolveOpacity3, packedPositionGroup3, 2009631821, false, (String) objArr100[0], null);
                                        }
                                        if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                                                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                                                int i159 = 876 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int i160 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
                                                byte[] bArr17 = $$a;
                                                Object[] objArr101 = new Object[1];
                                                c((byte) 52, bArr17[54], bArr17[7], objArr101);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cIndexOf, i159, i160, 256017550, false, (String) objArr101[0], null);
                                            }
                                            Object[] objArr102 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).get(null);
                                            objArr15 = new Object[]{new int[]{((int[]) objArr102[0])[0]}, new int[1], new int[]{((int[]) objArr102[2])[0]}, (String[]) objArr102[3]};
                                            int iIdentityHashCode8 = System.identityHashCode(this);
                                            int i161 = ~((-143165443) | iIdentityHashCode8);
                                            int i162 = ~iIdentityHashCode8;
                                            int i163 = (-380255966) + ((i161 | (~(1069547263 | i162))) * 497) + (((~(iIdentityHashCode8 | 1069547263)) | (~((-966692051) | i162)) | 823526608) * 497) + 1755934038;
                                            int i164 = (i163 << 13) ^ i163;
                                            int i165 = i164 ^ (i164 >>> 17);
                                            ((int[]) objArr15[1])[0] = i165 ^ (i165 << 5);
                                            str4 = str2;
                                        } else {
                                            if (applicationContext3 != null) {
                                                i8 = b + 113;
                                                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                                                if (i8 % 2 != 0) {
                                                    boolean z2 = applicationContext3 instanceof ContextWrapper;
                                                    throw null;
                                                }
                                                if ((applicationContext3 instanceof ContextWrapper) || ((ContextWrapper) applicationContext3).getBaseContext() != null) {
                                                    applicationContext5 = context2.getApplicationContext();
                                                    obj = null;
                                                } else {
                                                    obj = null;
                                                    applicationContext5 = null;
                                                }
                                            } else {
                                                obj = null;
                                                applicationContext5 = applicationContext3;
                                            }
                                            Object[] objArr103 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str3, Object.class).invoke(obj, this)).intValue()), 1755934038};
                                            byte[] bArr18 = $$d;
                                            byte b65 = bArr18[73];
                                            Object[] objArr104 = new Object[1];
                                            d(b65, bArr18[239], b65, objArr104);
                                            Class<?> cls7 = Class.forName((String) objArr104[0]);
                                            Object[] objArr105 = new Object[1];
                                            d((short) 180, bArr18[130], bArr18[5], objArr105);
                                            objArr14 = (Object[]) cls7.getMethod((String) objArr105[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr103);
                                            if (applicationContext5 != null) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                    char cResolveSize4 = (char) View.resolveSize(0, 0);
                                                    int iIndexOf13 = 876 - TextUtils.indexOf("", "", 0);
                                                    int i166 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                    byte[] bArr19 = $$a;
                                                    Object[] objArr106 = new Object[1];
                                                    c((byte) 52, bArr19[54], bArr19[7], objArr106);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveSize4, iIndexOf13, i166, 256017550, false, (String) objArr106[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, objArr14);
                                                try {
                                                    str4 = str2;
                                                    long jLongValue15 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                                                    Long lValueOf17 = Long.valueOf(jLongValue15);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                        char c11 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                        int i167 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 876;
                                                        int i168 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                                                        byte b66 = $$a[7];
                                                        byte b67 = b66;
                                                        Object[] objArr107 = new Object[1];
                                                        c(b66, b67, (short) (b67 | 104), objArr107);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c11, i167, i168, 2009631821, false, (String) objArr107[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, lValueOf17);
                                                    Long lValueOf18 = Long.valueOf(jLongValue15 >> 12);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                        char c12 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                        int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 876;
                                                        int i169 = 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        Object[] objArr108 = new Object[1];
                                                        c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr108);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c12, scrollBarSize2, i169, 252381699, false, (String) objArr108[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf18);
                                                } catch (Exception unused10) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                str4 = str2;
                                                objArr14 = objArr14;
                                            }
                                            objArr15 = objArr14;
                                        }
                                        i9 = ((int[]) objArr15[2])[0];
                                        i10 = ((int[]) objArr15[0])[0];
                                        if (i10 == i9) {
                                            int i170 = ((int[]) objArr15[1])[0];
                                            objArr16 = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[1], new int[]{((int[]) objArr15[2])[0]}, (String[]) objArr15[3]};
                                            int iMyTid2 = Process.myTid();
                                            int i171 = ~iMyTid2;
                                            int i172 = (~(707222216 | i171)) | (-783252190) | (~(747532445 | i171));
                                            int i173 = i170 + 728518848 + (((~(iMyTid2 | (-671502473))) | i172) * 590) + (i172 * (-1180)) + (((~((-747532446) | i171)) | (~(i171 | (-707222217)))) * 590);
                                            int i174 = (i173 << 13) ^ i173;
                                            int i175 = i174 ^ (i174 >>> 17);
                                            ((int[]) objArr16[1])[0] = i175 ^ (i175 << 5);
                                        } else {
                                            Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
                                            int i176 = ((int[]) objArr15[1])[0];
                                            objArr16 = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[1], new int[]{((int[]) objArr15[2])[0]}, (String[]) objArr15[3]};
                                            int iMyUid3 = Process.myUid();
                                            int i177 = i176 + 1073274324 + (((~((-876894998) | iMyUid3)) | 872435712) * (-140)) + ((~((-4459286) | iMyUid3)) * 70) + (((~(iMyUid3 | 917205226)) | (-49228800)) * 70);
                                            int i178 = i177 ^ (i177 << 13);
                                            int i179 = i178 ^ (i178 >>> 17);
                                            ((int[]) objArr16[1])[0] = i179 ^ (i179 << 5);
                                        }
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                            char cIndexOf2 = (char) TextUtils.indexOf("", "");
                                            int maxKeyCode4 = (KeyEvent.getMaxKeyCode() >> 16) + 651;
                                            int trimmedLength3 = 44 - TextUtils.getTrimmedLength("");
                                            byte b68 = $$a[7];
                                            byte b69 = b68;
                                            Object[] objArr109 = new Object[1];
                                            c(b68, b69, (short) (b69 | 104), objArr109);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf2, maxKeyCode4, trimmedLength3, -459846511, false, (String) objArr109[0], null);
                                        }
                                        j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).getLong(null);
                                        jLongValue3 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                            char cLastIndexOf3 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                                            int deadChar = KeyEvent.getDeadChar(0, 0) + 651;
                                            int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 44;
                                            Object[] objArr110 = new Object[1];
                                            c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr110);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf3, deadChar, jumpTapTimeout2, -873460649, false, (String) objArr110[0], null);
                                        }
                                        if (j3 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) << 52) >>> 52)) >> 12)) {
                                            int i180 = b + 29;
                                            TuitionPaymentFragmentbindingInflater1 = i180 % 128;
                                            int i181 = i180 % 2;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                                                char tapTimeout3 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                                int i182 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 650;
                                                int iIndexOf14 = 43 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                byte[] bArr20 = $$a;
                                                byte b70 = (byte) (bArr20[33] - 1);
                                                byte b71 = bArr20[7];
                                                Object[] objArr111 = new Object[1];
                                                c(b70, b71, (short) (b71 | 158), objArr111);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(tapTimeout3, i182, iIndexOf14, -1595579076, false, (String) objArr111[0], null);
                                            }
                                            Object[] objArr112 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).get(null);
                                            objArr17 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                                            int i183 = ((int[]) objArr112[2])[0];
                                            int i184 = ((int[]) objArr112[0])[0];
                                            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                                            int i185 = (((((~((-337773634) | iFreeMemory)) | (-352317408)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1300072508) + ((~((~iFreeMemory) | (-337773634))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - 1264995403;
                                            int i186 = (i185 << 13) ^ i185;
                                            int i187 = i186 ^ (i186 >>> 17);
                                            ((int[]) objArr17[3])[0] = i187 ^ (i187 << 5);
                                            i11 = 0;
                                        } else {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b((char) TextUtils.indexOf("", "", 0), 1610 - ExpandableListView.getPackedPositionGroup(0L), 26 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2145681644, false, null, new Class[0]);
                                            }
                                            Object[] objArr113 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).newInstance(null), -1264995403, 0};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                                                char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                                                int iRgb4 = (-16776565) - Color.rgb(0, 0, 0);
                                                int i188 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43;
                                                Object[] objArr114 = new Object[1];
                                                c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr114);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(capsMode2, iRgb4, i188, 2075921419, false, (String) objArr114[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.red(0), 696 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - View.MeasureSpec.makeMeasureSpec(0, 0)), Process.getGidForName("") + 794, 83 - View.getDefaultSize(0, 0)), Integer.TYPE, Integer.TYPE});
                                            }
                                            objArr17 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr113);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                                                char c13 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                int iMyPid2 = (Process.myPid() >> 22) + 651;
                                                int packedPositionGroup4 = ExpandableListView.getPackedPositionGroup(0L) + 44;
                                                byte[] bArr21 = $$a;
                                                byte b72 = (byte) (bArr21[33] - 1);
                                                byte b73 = bArr21[7];
                                                Object[] objArr115 = new Object[1];
                                                c(b72, b73, (short) (b73 | 158), objArr115);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c13, iMyPid2, packedPositionGroup4, -1595579076, false, (String) objArr115[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr17);
                                            try {
                                                long jLongValue16 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                                                Long lValueOf19 = Long.valueOf(jLongValue16);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                                                    char c14 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                                                    int i189 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 650;
                                                    int i190 = 45 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                    Object[] objArr116 = new Object[1];
                                                    c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr116);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(c14, i189, i190, -873460649, false, (String) objArr116[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf19);
                                                Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                                    char scrollBarSize3 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                                    int i191 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 651;
                                                    int i192 = 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    byte b74 = $$a[7];
                                                    byte b75 = b74;
                                                    Object[] objArr117 = new Object[1];
                                                    c(b74, b75, (short) (b75 | 104), objArr117);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(scrollBarSize3, i191, i192, -459846511, false, (String) objArr117[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf20);
                                                i11 = 0;
                                            } catch (Exception unused11) {
                                                throw new RuntimeException();
                                            }
                                        }
                                        i12 = ((int[]) objArr17[i11])[i11];
                                        i13 = ((int[]) objArr17[2])[i11];
                                        if (i13 == i12) {
                                            i14 = i11;
                                            arrayList2 = new ArrayList();
                                            strArr2 = (String[]) objArr17[1];
                                            if (strArr2 != null) {
                                                for (i15 = i14; i15 < strArr2.length; i15++) {
                                                    int i193 = b + 15;
                                                    TuitionPaymentFragmentbindingInflater1 = i193 % 128;
                                                    int i194 = i193 % 2;
                                                    arrayList2.add(strArr2[i15]);
                                                }
                                            }
                                            throw new RuntimeException(String.valueOf(i13));
                                        }
                                        Object[] objArr118 = new Object[4];
                                        int[] iArr8 = new int[1];
                                        objArr118[i11] = iArr8;
                                        int[] iArr9 = new int[1];
                                        objArr118[2] = iArr9;
                                        objArr118[3] = new int[1];
                                        int i195 = ((int[]) objArr17[3])[i11];
                                        int i196 = ((int[]) objArr17[2])[i11];
                                        int i197 = ((int[]) objArr17[i11])[i11];
                                        iArr9[i11] = i196;
                                        iArr8[i11] = i197;
                                        objArr118[1] = new String[i11];
                                        int iMyUid4 = Process.myUid();
                                        int i198 = ~iMyUid4;
                                        int i199 = i195 + (-268670412) + (((~(i198 | (-772931189))) | 776361998) * (-1042)) + (((-772931189) | iMyUid4) * 521) + (((~(iMyUid4 | (-776361999))) | 4587530 | (~(i198 | (-1156721)))) * 521);
                                        int i200 = (i199 << 13) ^ i199;
                                        int i201 = i200 ^ (i200 >>> 17);
                                        ((int[]) objArr118[3])[0] = i201 ^ (i201 << 5);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                                            char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                                            int iResolveSize2 = 2267 - View.resolveSize(0, 0);
                                            int iAxisFromString = MotionEvent.axisFromString("") + 34;
                                            byte b76 = $$a[7];
                                            byte b77 = b76;
                                            Object[] objArr119 = new Object[1];
                                            c(b76, b77, (short) (b77 | 210), objArr119);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(deadChar2, iResolveSize2, iAxisFromString, -887667012, false, (String) objArr119[0], null);
                                        }
                                        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null) != -1) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                                                char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                                                int size4 = 2267 - View.MeasureSpec.getSize(0);
                                                int edgeSlop3 = 33 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                byte[] bArr22 = $$a;
                                                byte b78 = (byte) (bArr22[33] - 1);
                                                byte b79 = bArr22[7];
                                                Object[] objArr120 = new Object[1];
                                                c(b78, b79, (short) (b79 | 158), objArr120);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(packedPositionChild2, size4, edgeSlop3, -654680577, false, (String) objArr120[0], null);
                                            }
                                            Object[] objArr121 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).get(null);
                                            objArr19 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                                            int i202 = ((int[]) objArr121[0])[0];
                                            int i203 = ((int[]) objArr121[3])[0];
                                            String[] strArr16 = (String[]) objArr121[1];
                                            int i204 = ~System.identityHashCode(this);
                                            int i205 = (((564028751 + ((~(800062463 | i204)) * 52)) + (((~(613198206 | i204)) | ((~((-195515110) | i204)) | 186864257)) * (-52))) + (((~(i204 | (-613198207))) | 604547354) * 52)) - 5637858;
                                            int i206 = (i205 << 13) ^ i205;
                                            int i207 = i206 ^ (i206 >>> 17);
                                            ((int[]) objArr19[2])[0] = i207 ^ (i207 << 5);
                                            str5 = str3;
                                        } else {
                                            if (applicationContext3 != null) {
                                                if ((applicationContext3 instanceof ContextWrapper) || ((ContextWrapper) applicationContext3).getBaseContext() != null) {
                                                    applicationContext3 = context2.getApplicationContext();
                                                } else {
                                                    applicationContext3 = null;
                                                }
                                            }
                                            str5 = str3;
                                            Object[] objArr122 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, -5637858};
                                            byte[] bArr23 = $$d;
                                            short s = bArr23[5];
                                            byte b80 = (byte) (-bArr23[86]);
                                            Object[] objArr123 = new Object[1];
                                            d(s, b80, (byte) (b80 - 5), objArr123);
                                            Class<?> cls8 = Class.forName((String) objArr123[0]);
                                            Object[] objArr124 = new Object[1];
                                            d((short) 87, (byte) ($$e & 127), bArr23[29], objArr124);
                                            objArr18 = (Object[]) cls8.getMethod((String) objArr124[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr122);
                                            if (applicationContext3 != null) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                                                    char edgeSlop4 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                                    int keyRepeatTimeout = 2267 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                    int iRed = Color.red(0) + 33;
                                                    byte[] bArr24 = $$a;
                                                    byte b81 = (byte) (bArr24[33] - 1);
                                                    byte b82 = bArr24[7];
                                                    Object[] objArr125 = new Object[1];
                                                    c(b81, b82, (short) (b82 | 158), objArr125);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(edgeSlop4, keyRepeatTimeout, iRed, -654680577, false, (String) objArr125[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, objArr18);
                                                try {
                                                    long jLongValue17 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                                                    Long lValueOf21 = Long.valueOf(jLongValue17);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                                                        char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                                        int capsMode3 = 2267 - TextUtils.getCapsMode("", 0, 0);
                                                        int iResolveOpacity4 = Drawable.resolveOpacity(0, 0) + 33;
                                                        byte b83 = $$a[7];
                                                        byte b84 = b83;
                                                        Object[] objArr126 = new Object[1];
                                                        c(b83, b84, (short) (b84 | 52), objArr126);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(longPressTimeout2, capsMode3, iResolveOpacity4, -874156483, false, (String) objArr126[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf21);
                                                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                                                        char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                                                        int iAlpha2 = Color.alpha(0) + 2267;
                                                        int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 33;
                                                        byte b85 = $$a[7];
                                                        byte b86 = b85;
                                                        Object[] objArr127 = new Object[1];
                                                        c(b85, b86, (short) (b86 | 210), objArr127);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cIndexOf3, iAlpha2, pressedStateDuration2, -887667012, false, (String) objArr127[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf22);
                                                } catch (Exception unused12) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                objArr18 = objArr18;
                                            }
                                            objArr19 = objArr18;
                                        }
                                        i16 = ((int[]) objArr19[3])[0];
                                        i17 = ((int[]) objArr19[0])[0];
                                        if (i17 == i16) {
                                            objArr20 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                                            int i208 = ((int[]) objArr19[2])[0];
                                            int i209 = ((int[]) objArr19[0])[0];
                                            int i210 = ((int[]) objArr19[3])[0];
                                            String[] strArr17 = (String[]) objArr19[1];
                                            int iIdentityHashCode9 = System.identityHashCode(this);
                                            int i211 = i208 + (-1641828168) + (((~(iIdentityHashCode9 | 520817114)) | (-522976220)) * 305) + (((~((~iIdentityHashCode9) | 520817114)) | (-287896202)) * 305);
                                            int i212 = (i211 << 13) ^ i211;
                                            int i213 = i212 ^ (i212 >>> 17);
                                            ((int[]) objArr20[2])[0] = i213 ^ (i213 << 5);
                                        } else {
                                            arrayList3 = new ArrayList();
                                            strArr3 = (String[]) objArr19[1];
                                            if (strArr3 != null) {
                                                for (String str17 : strArr3) {
                                                    arrayList3.add(str17);
                                                }
                                            }
                                            int[] iArr10 = new int[i17];
                                            int i214 = i17 - 1;
                                            iArr10[i214] = 1;
                                            Toast.makeText((Context) null, iArr10[((i17 * i214) % 2) - 1], 1).show();
                                            objArr20 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                                            int i215 = ((int[]) objArr19[2])[0];
                                            int i216 = ((int[]) objArr19[0])[0];
                                            int i217 = ((int[]) objArr19[3])[0];
                                            String[] strArr18 = (String[]) objArr19[1];
                                            int iIdentityHashCode10 = System.identityHashCode(this);
                                            int i218 = (~((-257832739) | iIdentityHashCode10)) | 5506304;
                                            int i219 = ~iIdentityHashCode10;
                                            int i220 = i215 + 1204980387 + ((i218 | (~(803207011 | i219))) * 886) + (((~(i219 | 257832738)) | 550880577) * (-1772)) + ((~(i219 | 550880577)) * 886);
                                            int i221 = (i220 << 13) ^ i220;
                                            int i222 = i221 ^ (i221 >>> 17);
                                            ((int[]) objArr20[2])[0] = i222 ^ (i222 << 5);
                                        }
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                                            char c15 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 1031;
                                            int i223 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            byte b87 = $$a[7];
                                            byte b88 = b87;
                                            Object[] objArr128 = new Object[1];
                                            c(b87, b88, (short) (b88 | 52), objArr128);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c15, packedPositionType3, i223, 1357589585, false, (String) objArr128[0], null);
                                        }
                                        j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null);
                                        jLongValue4 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                                            char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                            int iLastIndexOf4 = 1030 - TextUtils.lastIndexOf("", '0', 0);
                                            int deadChar3 = 15 - KeyEvent.getDeadChar(0, 0);
                                            byte b89 = $$a[7];
                                            byte b90 = b89;
                                            Object[] objArr129 = new Object[1];
                                            c(b89, b90, (short) (b90 | 210), objArr129);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(threadPriority2, iLastIndexOf4, deadChar3, 1344079056, false, (String) objArr129[0], null);
                                        }
                                        if (j4 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null) << 52) >>> 52)) >> 12)) {
                                            int i224 = TuitionPaymentFragmentbindingInflater1 + 113;
                                            b = i224 % 128;
                                            int i225 = i224 % 2;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                                                char c16 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                                                int scrollBarFadeDuration3 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                                                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 15;
                                                Object[] objArr130 = new Object[1];
                                                c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr130);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(c16, scrollBarFadeDuration3, offsetAfter, 632103528, false, (String) objArr130[0], null);
                                            }
                                            Object[] objArr131 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).get(null);
                                            objArr21 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                                            int i226 = ((int[]) objArr131[3])[0];
                                            int i227 = ((int[]) objArr131[1])[0];
                                            String[] strArr19 = (String[]) objArr131[0];
                                            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                            int i228 = ~elapsedCpuTime2;
                                            int i229 = ((271006987 + (((~(586569836 | i228)) | (~((-830850007) | elapsedCpuTime2))) * 210)) + (((~(elapsedCpuTime2 | 871881726)) | (~(i228 | (-545538117)))) * 210)) - 53111639;
                                            int i230 = (i229 << 13) ^ i229;
                                            int i231 = i230 ^ (i230 >>> 17);
                                            ((int[]) objArr21[2])[0] = i231 ^ (i231 << 5);
                                        } else {
                                            int iIntValue4 = ((Integer) Class.forName(str8).getMethod(str5, Object.class).invoke(null, this)).intValue();
                                            Object[] objArr132 = {1874013154};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b((char) (46038 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1133, 18 - (ViewConfiguration.getPressedStateDuration() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                                            }
                                            Object[] objArr133 = {Integer.valueOf(iIntValue4), 0, -53111639, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).newInstance(objArr132), false};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                                                char cAxisFromString2 = (char) ((-1) - MotionEvent.axisFromString(""));
                                                int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                                                int scrollBarFadeDuration4 = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                byte b91 = $$a[7];
                                                byte b92 = b91;
                                                Object[] objArr134 = new Object[1];
                                                c(b91, b92, (short) (b92 | 52), objArr134);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cAxisFromString2, keyRepeatTimeout2, scrollBarFadeDuration4, 1298546779, false, (String) objArr134[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 45993), (-16776099) - Color.rgb(0, 0, 0), TextUtils.lastIndexOf("", '0') + 18), Boolean.TYPE});
                                            }
                                            objArr21 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).invoke(null, objArr133);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                                                char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                                                int absoluteGravity = 1031 - Gravity.getAbsoluteGravity(0, 0);
                                                int iBlue4 = 15 - Color.blue(0);
                                                Object[] objArr135 = new Object[1];
                                                c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr135);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cRgb, absoluteGravity, iBlue4, 632103528, false, (String) objArr135[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, objArr21);
                                            try {
                                                long jLongValue18 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                                                Long lValueOf23 = Long.valueOf(jLongValue18);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                                                    char mirror2 = (char) (AndroidCharacter.getMirror('0') - '0');
                                                    int i232 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
                                                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 15;
                                                    byte b93 = $$a[7];
                                                    byte b94 = b93;
                                                    Object[] objArr136 = new Object[1];
                                                    c(b93, b94, (short) (b94 | 210), objArr136);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(mirror2, i232, absoluteGravity2, 1344079056, false, (String) objArr136[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, lValueOf23);
                                                Long lValueOf24 = Long.valueOf(jLongValue18 >> 12);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                                                    char absoluteGravity3 = (char) Gravity.getAbsoluteGravity(0, 0);
                                                    int deadChar4 = 1031 - KeyEvent.getDeadChar(0, 0);
                                                    int i233 = 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                    byte b95 = $$a[7];
                                                    byte b96 = b95;
                                                    Object[] objArr137 = new Object[1];
                                                    c(b95, b96, (short) (b96 | 52), objArr137);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(absoluteGravity3, deadChar4, i233, 1357589585, false, (String) objArr137[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, lValueOf24);
                                            } catch (Exception unused13) {
                                                throw new RuntimeException();
                                            }
                                        }
                                        i19 = ((int[]) objArr21[1])[0];
                                        i20 = ((int[]) objArr21[3])[0];
                                        if (i20 == i19) {
                                            objArr22 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                                            int i234 = ((int[]) objArr21[2])[0];
                                            int i235 = ((int[]) objArr21[3])[0];
                                            int i236 = ((int[]) objArr21[1])[0];
                                            String[] strArr20 = (String[]) objArr21[0];
                                            int iMyTid3 = Process.myTid();
                                            int i237 = ~((-245908510) | iMyTid3);
                                            int i238 = ~iMyTid3;
                                            int i239 = i234 + 679292273 + ((i237 | (~((-1628340) | i238))) * (-1808)) + (((~((-245367821) | iMyTid3)) | (~(i238 | (-1087651)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iMyTid3 | 1628339)) | 540689 | (~(245908509 | i238))) * TypedValues.Custom.TYPE_BOOLEAN);
                                            int i240 = (i239 << 13) ^ i239;
                                            int i241 = i240 ^ (i240 >>> 17);
                                            c = 0;
                                            ((int[]) objArr22[2])[0] = i241 ^ (i241 << 5);
                                        } else {
                                            arrayList4 = new ArrayList();
                                            strArr4 = (String[]) objArr21[0];
                                            if (strArr4 != null) {
                                                for (String str18 : strArr4) {
                                                    arrayList4.add(str18);
                                                }
                                            }
                                            int[] iArr11 = new int[i20];
                                            int i242 = i20 - 1;
                                            iArr11[i242] = 1;
                                            Toast.makeText((Context) null, iArr11[((i20 * i242) % 2) - 1], 1).show();
                                            objArr22 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                                            int i243 = ((int[]) objArr21[2])[0];
                                            int i244 = ((int[]) objArr21[3])[0];
                                            int i245 = ((int[]) objArr21[1])[0];
                                            String[] strArr21 = (String[]) objArr21[0];
                                            int iIdentityHashCode11 = System.identityHashCode(this);
                                            int i246 = ~iIdentityHashCode11;
                                            int i247 = i243 + 1489559257 + (((~(i246 | 507622374)) | (~(263342204 | i246)) | (-536083455)) * 464) + (((-272741251) | iIdentityHashCode11) * (-464)) + (((~(iIdentityHashCode11 | 507622374)) | (-536083455)) * 464);
                                            int i248 = (i247 << 13) ^ i247;
                                            int i249 = i248 ^ (i248 >>> 17);
                                            c = 0;
                                            ((int[]) objArr22[2])[0] = i249 ^ (i249 << 5);
                                        }
                                        MixpanelAPI mixpanelAPI4 = MixpanelAPI.this;
                                        int i250 = ((int[]) objArr13[1])[c];
                                        int i251 = i250 * i250;
                                        int i252 = -(460759618 * i250);
                                        int i253 = (i251 ^ i252) + ((i251 & i252) << 1);
                                        int i254 = -(i250 * (-1154749042));
                                        int i255 = (i253 ^ i254) + ((i254 & i253) << 1);
                                        int i256 = (i255 ^ (-2063433152)) + (((-2063433152) & i255) << 1);
                                        int i257 = i256 >> 24;
                                        int i258 = ((i257 & (-511)) + (i257 | (-511))) / 256;
                                        int i259 = i258 ^ 1;
                                        int i260 = ((i258 & 1) << 1) + i259;
                                        int i261 = -(((i256 & i260) + (i260 | i256)) ^ (((i258 | 1) << 1) - i259));
                                        int i262 = (i261 & 2) + (i261 | 2);
                                        int i263 = i262 >> 26;
                                        int i264 = 1152130 / (((-((((i263 & ComposerKt.defaultsKey) + (i263 | ComposerKt.defaultsKey)) / 64) + 2)) & i262) * 1057);
                                        int i265 = ((int[]) objArr16[1])[0];
                                        int i266 = i265 * i265;
                                        int i267 = -(1733799245 * i265);
                                        int i268 = (i266 & i267) + (i266 | i267);
                                        int i269 = -(i265 * 406156519);
                                        int i270 = (i268 ^ i269) + ((i269 & i268) << 1);
                                        int i271 = (i270 ^ (-1837730140)) + (((-1837730140) & i270) << 1);
                                        int i272 = i271 >> 16;
                                        int i273 = (((-131071) ^ i272) + ((i272 & (-131071)) << 1)) / 65536;
                                        int i274 = (i273 & 1) + (i273 | 1);
                                        int i275 = -(((((i271 >> 22) - 2047) / 1024) + 1) ^ ((i271 ^ i274) + ((i274 & i271) << 1)));
                                        int i276 = ((i275 | 3) << 1) - (i275 ^ 3);
                                        int i277 = i276 >> 27;
                                        int i278 = (((i277 & (-63)) + (i277 | (-63))) / 32) + 1;
                                        int i279 = i264 + (2038755 / (((-((i278 ^ 1) + ((i278 & 1) << 1))) & i276) * 683));
                                        int i280 = ((int[]) objArr22[2])[0];
                                        int i281 = ((((i280 * i280) - (~(-(399611608 * i280)))) - 1) - (~(-(i280 * (-180646140))))) - 1;
                                        int i282 = (i281 & 1299993924) + (i281 | 1299993924);
                                        int i283 = i282 >> 20;
                                        int i284 = (((i283 | (-8191)) << 1) - (i283 ^ (-8191))) / 4096;
                                        int i285 = (i284 & 1) + (i284 | 1);
                                        int i286 = (i282 & i285) + (i285 | i282);
                                        int i287 = ((i282 >> 28) - 31) / 16;
                                        int i288 = (-(i286 ^ ((i287 & 1) + (i287 | 1)))) + 5;
                                        int i289 = ((i288 >> 22) - 2047) / 1024;
                                        int i290 = ((i289 | 1) << 1) - (i289 ^ 1);
                                        StringBuilder sb = new StringBuilder("27|17|30|7|$".substring(i279 + ((-14548435) / ((i288 & (-(((i290 | 1) << 1) - (i290 ^ 1)))) * 1903))));
                                        int i291 = ((int[]) objArr2[1])[0];
                                        int i292 = ((i291 * i291) - (~(-(155368094 * i291)))) - 1;
                                        int i293 = -(i291 * (-2090085810));
                                        int i294 = (i292 ^ i293) + ((i293 & i292) << 1);
                                        int i295 = ((i294 | 2140716644) << 1) - (i294 ^ 2140716644);
                                        int i296 = i295 >> 15;
                                        int i297 = (((-262143) & i296) + (i296 | (-262143))) / 131072;
                                        int i298 = (i297 & 1) + (i297 | 1);
                                        int i299 = (i295 ^ i298) + ((i298 & i295) << 1);
                                        int i300 = i295 >> 18;
                                        int i301 = ((i300 ^ (-32767)) + ((i300 & (-32767)) << 1)) / 16384;
                                        int i302 = -(((i301 & 1) + (i301 | 1)) ^ i299);
                                        int i303 = (i302 & 9) + (i302 | 9);
                                        int i304 = i303 >> 19;
                                        int i305 = ((((i304 | (-16383)) << 1) - (i304 ^ (-16383))) / 8192) + 1;
                                        int i306 = 10591740 / (((-(((i305 | 1) << 1) - (i305 ^ 1))) & i303) * 1630);
                                        int i307 = ((int[]) objArr47[1])[0];
                                        int i308 = ((i307 * i307) - (~(-(231441836 * i307)))) - 1;
                                        int i309 = -(i307 * (-457797358));
                                        int i310 = (i308 & i309) + (i309 | i308);
                                        int i311 = (i310 & (-1799402175)) + ((-1799402175) | i310);
                                        int i312 = ((i311 >> 23) - 1023) / 512;
                                        int i313 = (i312 ^ 1) + ((i312 & 1) << 1);
                                        int i314 = (i311 & i313) + (i313 | i311);
                                        int i315 = i311 >> 22;
                                        int i316 = -(i314 ^ (((((i315 | (-2047)) << 1) - (i315 ^ (-2047))) / 1024) + 1));
                                        int i317 = ((i316 | 7) << 1) - (i316 ^ 7);
                                        int i318 = ((i317 >> 15) - 262143) / 131072;
                                        int i319 = (i318 ^ 1) + ((i318 & 1) << 1);
                                        int i320 = i306 + (6813450 / (((-((i319 & 1) + (i319 | 1))) & i317) * 1050));
                                        int i321 = ((int[]) objArr5[3])[0];
                                        int i322 = i321 * i321;
                                        int i323 = -(444581867 * i321);
                                        int i324 = (i322 & i323) + (i322 | i323);
                                        int i325 = -(i321 * (-554768047));
                                        int i326 = (i324 ^ i325) + ((i325 & i324) << 1);
                                        int i327 = (i326 ^ (-527367804)) + (((-527367804) & i326) << 1);
                                        int i328 = i327 >> 21;
                                        int i329 = ((i328 ^ (-4095)) + ((i328 & (-4095)) << 1)) / 2048;
                                        int i330 = (i329 & 1) + (i329 | 1);
                                        int i331 = ((i327 | i330) << 1) - (i330 ^ i327);
                                        int i332 = i327 >> 29;
                                        int i333 = (((i332 | (-15)) << 1) - (i332 ^ (-15))) / 8;
                                        int i334 = (-(((i333 & 1) + (i333 | 1)) ^ i331)) + 9;
                                        int i335 = i334 >> 17;
                                        int i336 = (((-65535) & i335) + (i335 | (-65535))) / 32768;
                                        int i337 = (i336 & 1) + (i336 | 1);
                                        int i338 = i320 + (2175255 / ((i334 & (-((i337 ^ 1) + ((i337 & 1) << 1)))) * 393));
                                        int i339 = ((int[]) objArr65[0])[0];
                                        int i340 = ((((i339 * i339) - (~(-(1657312069 * i339)))) - 1) - (~(-(i339 * 1368160965)))) - 1;
                                        int i341 = ((i340 | 416957977) << 1) - (i340 ^ 416957977);
                                        int i342 = i341 >> 19;
                                        int i343 = ((((i342 | (-16383)) << 1) - (i342 ^ (-16383))) / 8192) + 1;
                                        int i344 = (i341 & i343) + (i343 | i341);
                                        int i345 = i341 >> 26;
                                        int i346 = (((i345 | ComposerKt.defaultsKey) << 1) - (i345 ^ ComposerKt.defaultsKey)) / 64;
                                        int i347 = -(i344 ^ ((i346 ^ 1) + ((i346 & 1) << 1)));
                                        int i348 = (i347 & 2) + (i347 | 2);
                                        int i349 = i348 >> 23;
                                        int i350 = ((i349 ^ (-1023)) + ((i349 & (-1023)) << 1)) / 512;
                                        int i351 = i338 + (115362 / (((-((((i350 | 1) << 1) - (i350 ^ 1)) + 1)) & i348) * 1479));
                                        int i352 = ((int[]) objArr8[0])[0];
                                        int i353 = ((((i352 * i352) - (~(-(193394499 * i352)))) - 1) - (~(-(i352 * (-1315238763))))) - (-2103161231);
                                        int i354 = i353 >> 27;
                                        int i355 = ((i354 ^ (-63)) + ((i354 & (-63)) << 1)) / 32;
                                        int i356 = (i355 & 1) + (i355 | 1);
                                        int i357 = (i353 & i356) + (i356 | i353);
                                        int i358 = i353 >> 26;
                                        int i359 = ((i358 & ComposerKt.defaultsKey) + (i358 | ComposerKt.defaultsKey)) / 64;
                                        int i360 = -(((i359 & 1) + (i359 | 1)) ^ i357);
                                        int i361 = ((i360 | 4) << 1) - (i360 ^ 4);
                                        int i362 = i361 >> 16;
                                        int i363 = (((-131071) ^ i362) + ((i362 & (-131071)) << 1)) / 65536;
                                        int i364 = (i363 ^ 1) + ((i363 & 1) << 1);
                                        int i365 = i351 + (3249488 / (((-((i364 & 1) + (i364 | 1))) & i361) * 1996));
                                        int i366 = ((int[]) objArr10[1])[0];
                                        int i367 = ((i366 * i366) - (~(-(533021361 * i366)))) - 1;
                                        int i368 = -(i366 * 1279473907);
                                        int i369 = (i367 & i368) + (i368 | i367);
                                        int i370 = (i369 & (-1786920892)) + ((-1786920892) | i369);
                                        int i371 = ((i370 >> 16) - 131071) / 65536;
                                        int i372 = (i371 ^ 1) + ((i371 & 1) << 1);
                                        int i373 = ((i370 | i372) << 1) - (i372 ^ i370);
                                        int i374 = i370 >> 15;
                                        int i375 = (((-262143) ^ i374) + ((i374 & (-262143)) << 1)) / 131072;
                                        int i376 = -(i373 ^ ((i375 ^ 1) + ((i375 & 1) << 1)));
                                        int i377 = ((i376 | 2) << 1) - (i376 ^ 2);
                                        int i378 = i377 >> 15;
                                        int i379 = ((((-262143) | i378) << 1) - (i378 ^ (-262143))) / 131072;
                                        int i380 = (i379 & 1) + (i379 | 1);
                                        int i381 = i365 + (937250 / (((-((i380 ^ 1) + ((i380 & 1) << 1))) & i377) * 815));
                                        int i382 = ((int[]) objArr118[3])[0];
                                        int i383 = i382 * i382;
                                        int i384 = -(1452691898 * i382);
                                        int i385 = ((i383 | i384) << 1) - (i383 ^ i384);
                                        int i386 = -(i382 * 1080796196);
                                        int i387 = (i385 ^ i386) + ((i386 & i385) << 1);
                                        int i388 = (i387 ^ (-285758687)) + (((-285758687) & i387) << 1);
                                        int i389 = i388 >> 28;
                                        int i390 = ((i389 & (-31)) + (i389 | (-31))) / 16;
                                        int i391 = (i388 - (~(((i390 | 1) << 1) - (i390 ^ 1)))) - 1;
                                        int i392 = i388 >> 17;
                                        int i393 = (((-65535) & i392) + (i392 | (-65535))) / 32768;
                                        int i394 = -(i391 ^ (((i393 | 1) << 1) - (i393 ^ 1)));
                                        int i395 = (i394 ^ 3) + ((i394 & 3) << 1);
                                        int i396 = i395 >> 28;
                                        int i397 = (((i396 | (-31)) << 1) - (i396 ^ (-31))) / 16;
                                        int i398 = ((i397 | 1) << 1) - (i397 ^ 1);
                                        int i399 = i381 + (2337615 / (((-(((i398 | 1) << 1) - (i398 ^ 1))) & i395) * TypedValues.Custom.TYPE_DIMENSION));
                                        int i400 = ((int[]) objArr20[2])[0];
                                        int i401 = i400 * i400;
                                        int i402 = -(720385373 * i400);
                                        int i403 = (i401 ^ i402) + ((i401 & i402) << 1);
                                        int i404 = -(i400 * (-1502551805));
                                        int i405 = (i403 & i404) + (i404 | i403);
                                        int i406 = (i405 & (-1381160704)) + ((-1381160704) | i405);
                                        int i407 = i406 >> 24;
                                        int i408 = (i406 - (~((((i407 ^ (-511)) + ((i407 & (-511)) << 1)) / 256) + 1))) - 1;
                                        int i409 = i406 >> 16;
                                        int i410 = (((-131071) ^ i409) + ((i409 & (-131071)) << 1)) / 65536;
                                        int i411 = (-(i408 ^ ((i410 & 1) + (i410 | 1)))) + 7;
                                        int i412 = i411 >> 24;
                                        int i413 = ((i412 ^ (-511)) + ((i412 & (-511)) << 1)) / 256;
                                        int i414 = (i413 ^ 1) + ((i413 & 1) << 1);
                                        sb.append(intent.getStringExtra("8,event_name".substring(i399 + ((-34867616) / ((i411 & (-((i414 ^ 1) + ((i414 & 1) << 1)))) * 1202)))));
                                        mixpanelAPI4.track(sb.toString(), jSONObject3);
                                    }
                                    int i415 = b + 125;
                                    TuitionPaymentFragmentbindingInflater1 = i415 % 128;
                                    int i416 = i415 % 2;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
                                        char cBlue = (char) (37567 - Color.blue(0));
                                        int iResolveSize3 = View.resolveSize(0, 0) + 625;
                                        int iRgb5 = (-16777202) - Color.rgb(0, 0, 0);
                                        byte b97 = $$a[7];
                                        byte b98 = b97;
                                        Object[] objArr138 = new Object[1];
                                        c(b97, b98, (short) (b98 | 210), objArr138);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(cBlue, iResolveSize3, iRgb5, -973632554, false, (String) objArr138[0], null);
                                    }
                                    Object[] objArr139 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).get(null);
                                    int i417 = ((int[]) objArr139[2])[0];
                                    int i418 = ((int[]) objArr139[0])[0];
                                    String[] strArr22 = (String[]) objArr139[3];
                                    int[] iArr12 = {i417};
                                    int iIdentityHashCode12 = System.identityHashCode(this);
                                    int i419 = ~iIdentityHashCode12;
                                    int i420 = 1969616568 + (((~(iIdentityHashCode12 | 1005538350)) | (~((-818154507) | i419)) | (-1005583615)) * (-68)) + ((~((-45265) | i419)) * (-68)) + (((~((-1005538351) | i419)) | (-818199771)) * 68) + 2002920741;
                                    int i421 = (i420 << 13) ^ i420;
                                    int i422 = i421 ^ (i421 >>> 17);
                                    ((int[]) objArr9[1])[0] = i422 ^ (i422 << 5);
                                    objArr9 = new Object[]{new int[]{i418}, new int[1], iArr12, strArr22};
                                    str9 = str9;
                                    str2 = str7;
                                    i3 = ((int[]) objArr9[0])[0];
                                    i4 = ((int[]) objArr9[2])[0];
                                    if (i4 == i3) {
                                        int i1210 = ((int[]) objArr9[1])[0];
                                        int i1211 = ((int[]) objArr9[2])[0];
                                        int i1212 = ((int[]) objArr9[0])[0];
                                        String[] strArr110 = (String[]) objArr9[3];
                                        int[] iArr13 = {i1211};
                                        int iMyUid5 = Process.myUid();
                                        int i1310 = ~((-770894097) | (~iMyUid5));
                                        int i1311 = i1210 + ((302061288 | i1310 | (~(770894096 | iMyUid5))) * (-338)) + 841238360 + (((~(iMyUid5 | 1072955384)) | i1310) * 338);
                                        int i1312 = (i1311 << 13) ^ i1311;
                                        int i1313 = i1312 ^ (i1312 >>> 17);
                                        ((int[]) objArr10[1])[0] = i1313 ^ (i1313 << 5);
                                        objArr10 = new Object[]{new int[]{i1212}, new int[1], iArr13, strArr110};
                                    } else {
                                        arrayList = new ArrayList();
                                        strArr = (String[]) objArr9[3];
                                        if (strArr != null) {
                                            while (i5 < strArr.length) {
                                                arrayList.add(str16);
                                            }
                                        }
                                        int[] iArr14 = new int[i4];
                                        int i1314 = i4 - 1;
                                        iArr14[i1314] = 1;
                                        Toast.makeText((Context) null, iArr14[((i4 * i1314) % 2) - 1], 1).show();
                                        int i1315 = ((int[]) objArr9[1])[0];
                                        int i1316 = ((int[]) objArr9[2])[0];
                                        int i1317 = ((int[]) objArr9[0])[0];
                                        String[] strArr111 = (String[]) objArr9[3];
                                        int i1318 = ~((int) SystemClock.elapsedRealtime());
                                        int i1319 = i1315 + 1281253440 + ((~(1609825991 | i1318)) * 52) + (((~(215023297 | i1318)) | (~((-1608714824) | i1318)) | 1394802694) * (-52)) + (((~(i1318 | (-215023298))) | 1111168) * 52);
                                        int i1410 = (i1319 << 13) ^ i1319;
                                        int i1411 = i1410 ^ (i1410 >>> 17);
                                        ((int[]) objArr10[1])[0] = i1411 ^ (i1411 << 5);
                                        objArr10 = new Object[]{new int[]{i1317}, new int[1], new int[]{i1316}, strArr111};
                                    }
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char c17 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                        int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
                                        int packedPositionGroup5 = 10 - ExpandableListView.getPackedPositionGroup(0L);
                                        byte[] bArr110 = $$a;
                                        byte b510 = (byte) (bArr110[33] - 1);
                                        byte b511 = bArr110[7];
                                        Object[] objArr810 = new Object[1];
                                        c(b510, b511, (short) (b511 | 158), objArr810);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c17, scrollDefaultDelay3, packedPositionGroup5, -1650998592, false, (String) objArr810[0], null);
                                    }
                                    j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                                    jLongValue = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char modifierMetaStateMask6 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                                        int i1412 = 876 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L) + 11;
                                        byte b512 = $$a[7];
                                        byte b513 = b512;
                                        Object[] objArr910 = new Object[1];
                                        c(b512, b513, (short) (b513 | 210), objArr910);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask6, i1412, packedPositionChild3, 2012020043, false, (String) objArr910[0], null);
                                    }
                                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                                            char c18 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                            int iKeyCodeFromString5 = KeyEvent.keyCodeFromString("") + 876;
                                            int edgeSlop5 = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                                            byte b514 = $$a[7];
                                            byte b515 = b514;
                                            Object[] objArr911 = new Object[1];
                                            c(b514, b515, (short) (b515 | 52), objArr911);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c18, iKeyCodeFromString5, edgeSlop5, 2012931276, false, (String) objArr911[0], null);
                                        }
                                        Object[] objArr912 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).get(null);
                                        objArr12 = new Object[]{new int[]{((int[]) objArr912[0])[0]}, new int[1], new int[]{((int[]) objArr912[2])[0]}, (String[]) objArr912[3]};
                                        int iIdentityHashCode13 = System.identityHashCode(this);
                                        int i1413 = ((420329028 + (((-67372113) | iIdentityHashCode13) * (-381))) + (((~((~iIdentityHashCode13) | (-69529214))) | 44624431) * 381)) - 1596424072;
                                        int i1414 = (i1413 << 13) ^ i1413;
                                        int i1415 = i1414 ^ (i1414 >>> 17);
                                        ((int[]) objArr12[1])[0] = i1415 ^ (i1415 << 5);
                                        str3 = str9;
                                    } else {
                                        if (applicationContext3 != null) {
                                            applicationContext4 = applicationContext3;
                                        } else if (applicationContext3 instanceof ContextWrapper) {
                                            applicationContext4 = context2.getApplicationContext();
                                        } else {
                                            applicationContext4 = context2.getApplicationContext();
                                        }
                                        str3 = str9;
                                        Object[] objArr913 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str3, Object.class).invoke(null, this)).intValue()), 0, -1495394968};
                                        byte[] bArr111 = $$d;
                                        Object[] objArr914 = new Object[1];
                                        d((short) 101, bArr111[55], bArr111[337], objArr914);
                                        Class<?> cls9 = Class.forName((String) objArr914[0]);
                                        Object[] objArr915 = new Object[1];
                                        d((short) 87, (byte) ($$e & 127), bArr111[29], objArr915);
                                        objArr11 = (Object[]) cls9.getMethod((String) objArr915[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr913);
                                        if (applicationContext4 != null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char touchSlop3 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                                int capsMode4 = TextUtils.getCapsMode("", 0, 0) + 876;
                                                int offsetBefore3 = TextUtils.getOffsetBefore("", 0) + 10;
                                                byte b516 = $$a[7];
                                                byte b517 = b516;
                                                Object[] objArr916 = new Object[1];
                                                c(b516, b517, (short) (b517 | 52), objArr916);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop3, capsMode4, offsetBefore3, 2012931276, false, (String) objArr916[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr11);
                                            long jLongValue19 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                                            Long lValueOf110 = Long.valueOf(jLongValue19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char maximumFlingVelocity4 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                int i1416 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 875;
                                                int iIndexOf15 = TextUtils.indexOf("", "", 0) + 10;
                                                byte b518 = $$a[7];
                                                byte b610 = b518;
                                                Object[] objArr917 = new Object[1];
                                                c(b518, b610, (short) (b610 | 210), objArr917);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity4, i1416, iIndexOf15, 2012020043, false, (String) objArr917[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf110);
                                            Long lValueOf111 = Long.valueOf(jLongValue19 >> 12);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                char cMyPid2 = (char) (Process.myPid() >> 22);
                                                int iLastIndexOf5 = 875 - TextUtils.lastIndexOf("", '0', 0);
                                                int packedPositionType4 = ExpandableListView.getPackedPositionType(0L) + 10;
                                                byte[] bArr112 = $$a;
                                                byte b611 = (byte) (bArr112[33] - 1);
                                                byte b612 = bArr112[7];
                                                Object[] objArr918 = new Object[1];
                                                c(b611, b612, (short) (b612 | 158), objArr918);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid2, iLastIndexOf5, packedPositionType4, -1650998592, false, (String) objArr918[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf111);
                                        } else {
                                            objArr11 = objArr11;
                                        }
                                        objArr12 = objArr11;
                                    }
                                    i6 = ((int[]) objArr12[2])[0];
                                    i7 = ((int[]) objArr12[0])[0];
                                    if (i7 == i6) {
                                        int i1417 = ((int[]) objArr12[1])[0];
                                        objArr13 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
                                        int iIdentityHashCode14 = System.identityHashCode(this);
                                        int i1418 = (~((-1025916324) | iIdentityHashCode14)) | 83892257;
                                        int i1419 = i1417 + 1521273620 + (i1418 * 992) + ((i1418 | (~((~iIdentityHashCode14) | (-43582029)))) * (-496)) + ((iIdentityHashCode14 | (-985606095)) * 496);
                                        int i1510 = (i1419 << 13) ^ i1419;
                                        int i1511 = i1510 ^ (i1510 >>> 17);
                                        ((int[]) objArr13[1])[0] = i1511 ^ (i1511 << 5);
                                    } else {
                                        int[] iArr15 = new int[i7];
                                        int i1512 = i7 - 1;
                                        iArr15[i1512] = 1;
                                        Toast.makeText((Context) null, iArr15[((i7 * i1512) % 2) - 1], 1).show();
                                        int i1513 = ((int[]) objArr12[1])[0];
                                        objArr13 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
                                        int i1514 = ~(System.identityHashCode(this) | 366156158);
                                        int i1515 = i1513 + (((-113187544) | i1514) * (-658)) + 1491734180 + ((i1514 | (-402594816)) * 658);
                                        int i1516 = (i1515 << 13) ^ i1515;
                                        int i1517 = i1516 ^ (i1516 >>> 17);
                                        ((int[]) objArr13[1])[0] = i1517 ^ (i1517 << 5);
                                    }
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char c19 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                        int iLastIndexOf6 = 875 - TextUtils.lastIndexOf("", '0');
                                        int i1518 = 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        Object[] objArr919 = new Object[1];
                                        c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr919);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c19, iLastIndexOf6, i1518, 252381699, false, (String) objArr919[0], null);
                                    }
                                    j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
                                    jLongValue2 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                        char tapTimeout4 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                        int iResolveOpacity5 = Drawable.resolveOpacity(0, 0) + 876;
                                        int packedPositionGroup6 = 10 - ExpandableListView.getPackedPositionGroup(0L);
                                        byte b613 = $$a[7];
                                        byte b614 = b613;
                                        Object[] objArr1010 = new Object[1];
                                        c(b613, b614, (short) (b614 | 104), objArr1010);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(tapTimeout4, iResolveOpacity5, packedPositionGroup6, 2009631821, false, (String) objArr1010[0], null);
                                    }
                                    if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                                            char cIndexOf4 = (char) TextUtils.indexOf("", "", 0, 0);
                                            int i1519 = 876 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int i1610 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
                                            byte[] bArr113 = $$a;
                                            Object[] objArr1011 = new Object[1];
                                            c((byte) 52, bArr113[54], bArr113[7], objArr1011);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cIndexOf4, i1519, i1610, 256017550, false, (String) objArr1011[0], null);
                                        }
                                        Object[] objArr1012 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).get(null);
                                        objArr15 = new Object[]{new int[]{((int[]) objArr1012[0])[0]}, new int[1], new int[]{((int[]) objArr1012[2])[0]}, (String[]) objArr1012[3]};
                                        int iIdentityHashCode15 = System.identityHashCode(this);
                                        int i1611 = ~((-143165443) | iIdentityHashCode15);
                                        int i1612 = ~iIdentityHashCode15;
                                        int i1613 = (-380255966) + ((i1611 | (~(1069547263 | i1612))) * 497) + (((~(iIdentityHashCode15 | 1069547263)) | (~((-966692051) | i1612)) | 823526608) * 497) + 1755934038;
                                        int i1614 = (i1613 << 13) ^ i1613;
                                        int i1615 = i1614 ^ (i1614 >>> 17);
                                        ((int[]) objArr15[1])[0] = i1615 ^ (i1615 << 5);
                                        str4 = str2;
                                    } else {
                                        if (applicationContext3 != null) {
                                            i8 = b + 113;
                                            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                                            if (i8 % 2 != 0) {
                                                boolean z3 = applicationContext3 instanceof ContextWrapper;
                                                throw null;
                                            }
                                            if (applicationContext3 instanceof ContextWrapper) {
                                                applicationContext5 = context2.getApplicationContext();
                                                obj = null;
                                            } else {
                                                applicationContext5 = context2.getApplicationContext();
                                                obj = null;
                                            }
                                        } else {
                                            obj = null;
                                            applicationContext5 = applicationContext3;
                                        }
                                        Object[] objArr1013 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str3, Object.class).invoke(obj, this)).intValue()), 1755934038};
                                        byte[] bArr114 = $$d;
                                        byte b615 = bArr114[73];
                                        Object[] objArr1014 = new Object[1];
                                        d(b615, bArr114[239], b615, objArr1014);
                                        Class<?> cls10 = Class.forName((String) objArr1014[0]);
                                        Object[] objArr1015 = new Object[1];
                                        d((short) 180, bArr114[130], bArr114[5], objArr1015);
                                        objArr14 = (Object[]) cls10.getMethod((String) objArr1015[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr1013);
                                        if (applicationContext5 != null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                char cResolveSize5 = (char) View.resolveSize(0, 0);
                                                int iIndexOf16 = 876 - TextUtils.indexOf("", "", 0);
                                                int i1616 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                byte[] bArr115 = $$a;
                                                Object[] objArr1016 = new Object[1];
                                                c((byte) 52, bArr115[54], bArr115[7], objArr1016);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveSize5, iIndexOf16, i1616, 256017550, false, (String) objArr1016[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, objArr14);
                                            str4 = str2;
                                            long jLongValue110 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                                            Long lValueOf112 = Long.valueOf(jLongValue110);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                char c110 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                int i1617 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 876;
                                                int i1618 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                                                byte b616 = $$a[7];
                                                byte b617 = b616;
                                                Object[] objArr1017 = new Object[1];
                                                c(b616, b617, (short) (b617 | 104), objArr1017);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c110, i1617, i1618, 2009631821, false, (String) objArr1017[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, lValueOf112);
                                            Long lValueOf113 = Long.valueOf(jLongValue110 >> 12);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                char c111 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                int scrollBarSize4 = (ViewConfiguration.getScrollBarSize() >> 8) + 876;
                                                int i1619 = 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                Object[] objArr1018 = new Object[1];
                                                c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr1018);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c111, scrollBarSize4, i1619, 252381699, false, (String) objArr1018[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf113);
                                        } else {
                                            str4 = str2;
                                            objArr14 = objArr14;
                                        }
                                        objArr15 = objArr14;
                                    }
                                    i9 = ((int[]) objArr15[2])[0];
                                    i10 = ((int[]) objArr15[0])[0];
                                    if (i10 == i9) {
                                        int i1710 = ((int[]) objArr15[1])[0];
                                        objArr16 = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[1], new int[]{((int[]) objArr15[2])[0]}, (String[]) objArr15[3]};
                                        int iMyTid4 = Process.myTid();
                                        int i1711 = ~iMyTid4;
                                        int i1712 = (~(707222216 | i1711)) | (-783252190) | (~(747532445 | i1711));
                                        int i1713 = i1710 + 728518848 + (((~(iMyTid4 | (-671502473))) | i1712) * 590) + (i1712 * (-1180)) + (((~((-747532446) | i1711)) | (~(i1711 | (-707222217)))) * 590);
                                        int i1714 = (i1713 << 13) ^ i1713;
                                        int i1715 = i1714 ^ (i1714 >>> 17);
                                        ((int[]) objArr16[1])[0] = i1715 ^ (i1715 << 5);
                                    } else {
                                        Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
                                        int i1716 = ((int[]) objArr15[1])[0];
                                        objArr16 = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[1], new int[]{((int[]) objArr15[2])[0]}, (String[]) objArr15[3]};
                                        int iMyUid6 = Process.myUid();
                                        int i1717 = i1716 + 1073274324 + (((~((-876894998) | iMyUid6)) | 872435712) * (-140)) + ((~((-4459286) | iMyUid6)) * 70) + (((~(iMyUid6 | 917205226)) | (-49228800)) * 70);
                                        int i1718 = i1717 ^ (i1717 << 13);
                                        int i1719 = i1718 ^ (i1718 >>> 17);
                                        ((int[]) objArr16[1])[0] = i1719 ^ (i1719 << 5);
                                    }
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                        char cIndexOf5 = (char) TextUtils.indexOf("", "");
                                        int maxKeyCode5 = (KeyEvent.getMaxKeyCode() >> 16) + 651;
                                        int trimmedLength4 = 44 - TextUtils.getTrimmedLength("");
                                        byte b618 = $$a[7];
                                        byte b619 = b618;
                                        Object[] objArr1019 = new Object[1];
                                        c(b618, b619, (short) (b619 | 104), objArr1019);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf5, maxKeyCode5, trimmedLength4, -459846511, false, (String) objArr1019[0], null);
                                    }
                                    j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).getLong(null);
                                    jLongValue3 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                        char cLastIndexOf4 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                                        int deadChar5 = KeyEvent.getDeadChar(0, 0) + 651;
                                        int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 44;
                                        Object[] objArr1110 = new Object[1];
                                        c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr1110);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf4, deadChar5, jumpTapTimeout3, -873460649, false, (String) objArr1110[0], null);
                                    }
                                    if (j3 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) << 52) >>> 52)) >> 12)) {
                                        int i1810 = b + 29;
                                        TuitionPaymentFragmentbindingInflater1 = i1810 % 128;
                                        int i1811 = i1810 % 2;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                                            char tapTimeout5 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                            int i1812 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 650;
                                            int iIndexOf17 = 43 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                            byte[] bArr25 = $$a;
                                            byte b710 = (byte) (bArr25[33] - 1);
                                            byte b711 = bArr25[7];
                                            Object[] objArr1111 = new Object[1];
                                            c(b710, b711, (short) (b711 | 158), objArr1111);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(tapTimeout5, i1812, iIndexOf17, -1595579076, false, (String) objArr1111[0], null);
                                        }
                                        Object[] objArr1112 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).get(null);
                                        objArr17 = new Object[]{new int[]{i184}, new String[0], new int[]{i183}, new int[1]};
                                        int i1813 = ((int[]) objArr1112[2])[0];
                                        int i1814 = ((int[]) objArr1112[0])[0];
                                        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                                        int i1815 = (((((~((-337773634) | iFreeMemory2)) | (-352317408)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1300072508) + ((~((~iFreeMemory2) | (-337773634))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - 1264995403;
                                        int i1816 = (i1815 << 13) ^ i1815;
                                        int i1817 = i1816 ^ (i1816 >>> 17);
                                        ((int[]) objArr17[3])[0] = i1817 ^ (i1817 << 5);
                                        i11 = 0;
                                    } else {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b((char) TextUtils.indexOf("", "", 0), 1610 - ExpandableListView.getPackedPositionGroup(0L), 26 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2145681644, false, null, new Class[0]);
                                        }
                                        Object[] objArr1113 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).newInstance(null), -1264995403, 0};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                                            char capsMode5 = (char) TextUtils.getCapsMode("", 0, 0);
                                            int iRgb6 = (-16776565) - Color.rgb(0, 0, 0);
                                            int i1818 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43;
                                            Object[] objArr1114 = new Object[1];
                                            c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr1114);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(capsMode5, iRgb6, i1818, 2075921419, false, (String) objArr1114[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.red(0), 696 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - View.MeasureSpec.makeMeasureSpec(0, 0)), Process.getGidForName("") + 794, 83 - View.getDefaultSize(0, 0)), Integer.TYPE, Integer.TYPE});
                                        }
                                        objArr17 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr1113);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                                            char c112 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                            int iMyPid3 = (Process.myPid() >> 22) + 651;
                                            int packedPositionGroup7 = ExpandableListView.getPackedPositionGroup(0L) + 44;
                                            byte[] bArr26 = $$a;
                                            byte b712 = (byte) (bArr26[33] - 1);
                                            byte b713 = bArr26[7];
                                            Object[] objArr1115 = new Object[1];
                                            c(b712, b713, (short) (b713 | 158), objArr1115);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c112, iMyPid3, packedPositionGroup7, -1595579076, false, (String) objArr1115[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr17);
                                        long jLongValue111 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                                        Long lValueOf114 = Long.valueOf(jLongValue111);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                                            char c113 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                                            int i1819 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 650;
                                            int i1910 = 45 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            Object[] objArr1116 = new Object[1];
                                            c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr1116);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(c113, i1819, i1910, -873460649, false, (String) objArr1116[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf114);
                                        Long lValueOf25 = Long.valueOf(jLongValue111 >> 12);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                            char scrollBarSize5 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                            int i1911 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 651;
                                            int i1912 = 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            byte b714 = $$a[7];
                                            byte b715 = b714;
                                            Object[] objArr1117 = new Object[1];
                                            c(b714, b715, (short) (b715 | 104), objArr1117);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(scrollBarSize5, i1911, i1912, -459846511, false, (String) objArr1117[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf25);
                                        i11 = 0;
                                    }
                                    i12 = ((int[]) objArr17[i11])[i11];
                                    i13 = ((int[]) objArr17[2])[i11];
                                    if (i13 == i12) {
                                        i14 = i11;
                                        arrayList2 = new ArrayList();
                                        strArr2 = (String[]) objArr17[1];
                                        if (strArr2 != null) {
                                            while (i15 < strArr2.length) {
                                                int i1913 = b + 15;
                                                TuitionPaymentFragmentbindingInflater1 = i1913 % 128;
                                                int i1914 = i1913 % 2;
                                                arrayList2.add(strArr2[i15]);
                                            }
                                        }
                                        throw new RuntimeException(String.valueOf(i13));
                                    }
                                    Object[] objArr1118 = new Object[4];
                                    int[] iArr16 = new int[1];
                                    objArr1118[i11] = iArr16;
                                    int[] iArr17 = new int[1];
                                    objArr1118[2] = iArr17;
                                    objArr1118[3] = new int[1];
                                    int i1915 = ((int[]) objArr17[3])[i11];
                                    int i1916 = ((int[]) objArr17[2])[i11];
                                    int i1917 = ((int[]) objArr17[i11])[i11];
                                    iArr17[i11] = i1916;
                                    iArr16[i11] = i1917;
                                    objArr1118[1] = new String[i11];
                                    int iMyUid7 = Process.myUid();
                                    int i1918 = ~iMyUid7;
                                    int i1919 = i1915 + (-268670412) + (((~(i1918 | (-772931189))) | 776361998) * (-1042)) + (((-772931189) | iMyUid7) * 521) + (((~(iMyUid7 | (-776361999))) | 4587530 | (~(i1918 | (-1156721)))) * 521);
                                    int i2010 = (i1919 << 13) ^ i1919;
                                    int i2011 = i2010 ^ (i2010 >>> 17);
                                    ((int[]) objArr1118[3])[0] = i2011 ^ (i2011 << 5);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                                        char deadChar6 = (char) KeyEvent.getDeadChar(0, 0);
                                        int iResolveSize4 = 2267 - View.resolveSize(0, 0);
                                        int iAxisFromString2 = MotionEvent.axisFromString("") + 34;
                                        byte b716 = $$a[7];
                                        byte b717 = b716;
                                        Object[] objArr1119 = new Object[1];
                                        c(b716, b717, (short) (b717 | 210), objArr1119);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(deadChar6, iResolveSize4, iAxisFromString2, -887667012, false, (String) objArr1119[0], null);
                                    }
                                    if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null) != -1) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                                            char packedPositionChild4 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                                            int size5 = 2267 - View.MeasureSpec.getSize(0);
                                            int edgeSlop6 = 33 - (ViewConfiguration.getEdgeSlop() >> 16);
                                            byte[] bArr27 = $$a;
                                            byte b718 = (byte) (bArr27[33] - 1);
                                            byte b719 = bArr27[7];
                                            Object[] objArr1210 = new Object[1];
                                            c(b718, b719, (short) (b719 | 158), objArr1210);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(packedPositionChild4, size5, edgeSlop6, -654680577, false, (String) objArr1210[0], null);
                                        }
                                        Object[] objArr1211 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).get(null);
                                        objArr19 = new Object[]{new int[]{i202}, strArr16, new int[1], new int[]{i203}};
                                        int i2012 = ((int[]) objArr1211[0])[0];
                                        int i2013 = ((int[]) objArr1211[3])[0];
                                        String[] strArr112 = (String[]) objArr1211[1];
                                        int i2014 = ~System.identityHashCode(this);
                                        int i2015 = (((564028751 + ((~(800062463 | i2014)) * 52)) + (((~(613198206 | i2014)) | ((~((-195515110) | i2014)) | 186864257)) * (-52))) + (((~(i2014 | (-613198207))) | 604547354) * 52)) - 5637858;
                                        int i2016 = (i2015 << 13) ^ i2015;
                                        int i2017 = i2016 ^ (i2016 >>> 17);
                                        ((int[]) objArr19[2])[0] = i2017 ^ (i2017 << 5);
                                        str5 = str3;
                                    } else {
                                        if (applicationContext3 != null) {
                                            if (applicationContext3 instanceof ContextWrapper) {
                                                applicationContext3 = context2.getApplicationContext();
                                            } else {
                                                applicationContext3 = context2.getApplicationContext();
                                            }
                                        }
                                        str5 = str3;
                                        Object[] objArr1212 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, -5637858};
                                        byte[] bArr28 = $$d;
                                        short s2 = bArr28[5];
                                        byte b810 = (byte) (-bArr28[86]);
                                        Object[] objArr1213 = new Object[1];
                                        d(s2, b810, (byte) (b810 - 5), objArr1213);
                                        Class<?> cls11 = Class.forName((String) objArr1213[0]);
                                        Object[] objArr1214 = new Object[1];
                                        d((short) 87, (byte) ($$e & 127), bArr28[29], objArr1214);
                                        objArr18 = (Object[]) cls11.getMethod((String) objArr1214[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr1212);
                                        if (applicationContext3 != null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                                                char edgeSlop7 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                                int keyRepeatTimeout3 = 2267 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                int iRed2 = Color.red(0) + 33;
                                                byte[] bArr29 = $$a;
                                                byte b811 = (byte) (bArr29[33] - 1);
                                                byte b812 = bArr29[7];
                                                Object[] objArr1215 = new Object[1];
                                                c(b811, b812, (short) (b812 | 158), objArr1215);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(edgeSlop7, keyRepeatTimeout3, iRed2, -654680577, false, (String) objArr1215[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, objArr18);
                                            long jLongValue112 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                                            Long lValueOf26 = Long.valueOf(jLongValue112);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                                                char longPressTimeout3 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                                int capsMode6 = 2267 - TextUtils.getCapsMode("", 0, 0);
                                                int iResolveOpacity6 = Drawable.resolveOpacity(0, 0) + 33;
                                                byte b813 = $$a[7];
                                                byte b814 = b813;
                                                Object[] objArr1216 = new Object[1];
                                                c(b813, b814, (short) (b814 | 52), objArr1216);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(longPressTimeout3, capsMode6, iResolveOpacity6, -874156483, false, (String) objArr1216[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf26);
                                            Long lValueOf27 = Long.valueOf(jLongValue112 >> 12);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                                                char cIndexOf6 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                                                int iAlpha3 = Color.alpha(0) + 2267;
                                                int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 33;
                                                byte b815 = $$a[7];
                                                byte b816 = b815;
                                                Object[] objArr1217 = new Object[1];
                                                c(b815, b816, (short) (b816 | 210), objArr1217);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cIndexOf6, iAlpha3, pressedStateDuration3, -887667012, false, (String) objArr1217[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf27);
                                        } else {
                                            objArr18 = objArr18;
                                        }
                                        objArr19 = objArr18;
                                    }
                                    i16 = ((int[]) objArr19[3])[0];
                                    i17 = ((int[]) objArr19[0])[0];
                                    if (i17 == i16) {
                                        objArr20 = new Object[]{new int[]{i209}, strArr17, new int[1], new int[]{i210}};
                                        int i2018 = ((int[]) objArr19[2])[0];
                                        int i2019 = ((int[]) objArr19[0])[0];
                                        int i2110 = ((int[]) objArr19[3])[0];
                                        String[] strArr113 = (String[]) objArr19[1];
                                        int iIdentityHashCode16 = System.identityHashCode(this);
                                        int i2111 = i2018 + (-1641828168) + (((~(iIdentityHashCode16 | 520817114)) | (-522976220)) * 305) + (((~((~iIdentityHashCode16) | 520817114)) | (-287896202)) * 305);
                                        int i2112 = (i2111 << 13) ^ i2111;
                                        int i2113 = i2112 ^ (i2112 >>> 17);
                                        ((int[]) objArr20[2])[0] = i2113 ^ (i2113 << 5);
                                    } else {
                                        arrayList3 = new ArrayList();
                                        strArr3 = (String[]) objArr19[1];
                                        if (strArr3 != null) {
                                            while (i18 < strArr3.length) {
                                                arrayList3.add(str17);
                                            }
                                        }
                                        int[] iArr18 = new int[i17];
                                        int i2114 = i17 - 1;
                                        iArr18[i2114] = 1;
                                        Toast.makeText((Context) null, iArr18[((i17 * i2114) % 2) - 1], 1).show();
                                        objArr20 = new Object[]{new int[]{i216}, strArr18, new int[1], new int[]{i217}};
                                        int i2115 = ((int[]) objArr19[2])[0];
                                        int i2116 = ((int[]) objArr19[0])[0];
                                        int i2117 = ((int[]) objArr19[3])[0];
                                        String[] strArr114 = (String[]) objArr19[1];
                                        int iIdentityHashCode17 = System.identityHashCode(this);
                                        int i2118 = (~((-257832739) | iIdentityHashCode17)) | 5506304;
                                        int i2119 = ~iIdentityHashCode17;
                                        int i2210 = i2115 + 1204980387 + ((i2118 | (~(803207011 | i2119))) * 886) + (((~(i2119 | 257832738)) | 550880577) * (-1772)) + ((~(i2119 | 550880577)) * 886);
                                        int i2211 = (i2210 << 13) ^ i2210;
                                        int i2212 = i2211 ^ (i2211 >>> 17);
                                        ((int[]) objArr20[2])[0] = i2212 ^ (i2212 << 5);
                                    }
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                                        char c114 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int packedPositionType5 = ExpandableListView.getPackedPositionType(0L) + 1031;
                                        int i2213 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                        byte b817 = $$a[7];
                                        byte b818 = b817;
                                        Object[] objArr1218 = new Object[1];
                                        c(b817, b818, (short) (b818 | 52), objArr1218);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c114, packedPositionType5, i2213, 1357589585, false, (String) objArr1218[0], null);
                                    }
                                    j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null);
                                    jLongValue4 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                                        char threadPriority3 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                        int iLastIndexOf7 = 1030 - TextUtils.lastIndexOf("", '0', 0);
                                        int deadChar7 = 15 - KeyEvent.getDeadChar(0, 0);
                                        byte b819 = $$a[7];
                                        byte b99 = b819;
                                        Object[] objArr1219 = new Object[1];
                                        c(b819, b99, (short) (b99 | 210), objArr1219);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(threadPriority3, iLastIndexOf7, deadChar7, 1344079056, false, (String) objArr1219[0], null);
                                    }
                                    if (j4 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null) << 52) >>> 52)) >> 12)) {
                                        int i2214 = TuitionPaymentFragmentbindingInflater1 + 113;
                                        b = i2214 % 128;
                                        int i2215 = i2214 % 2;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                                            char c115 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                                            int scrollBarFadeDuration5 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                                            int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 15;
                                            Object[] objArr1310 = new Object[1];
                                            c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr1310);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(c115, scrollBarFadeDuration5, offsetAfter2, 632103528, false, (String) objArr1310[0], null);
                                        }
                                        Object[] objArr1311 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).get(null);
                                        objArr21 = new Object[]{strArr19, new int[]{i227}, new int[1], new int[]{i226}};
                                        int i2216 = ((int[]) objArr1311[3])[0];
                                        int i2217 = ((int[]) objArr1311[1])[0];
                                        String[] strArr115 = (String[]) objArr1311[0];
                                        int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                        int i2218 = ~elapsedCpuTime3;
                                        int i2219 = ((271006987 + (((~(586569836 | i2218)) | (~((-830850007) | elapsedCpuTime3))) * 210)) + (((~(elapsedCpuTime3 | 871881726)) | (~(i2218 | (-545538117)))) * 210)) - 53111639;
                                        int i2310 = (i2219 << 13) ^ i2219;
                                        int i2311 = i2310 ^ (i2310 >>> 17);
                                        ((int[]) objArr21[2])[0] = i2311 ^ (i2311 << 5);
                                    } else {
                                        int iIntValue5 = ((Integer) Class.forName(str8).getMethod(str5, Object.class).invoke(null, this)).intValue();
                                        Object[] objArr1312 = {1874013154};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b((char) (46038 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1133, 18 - (ViewConfiguration.getPressedStateDuration() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                                        }
                                        Object[] objArr1313 = {Integer.valueOf(iIntValue5), 0, -53111639, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).newInstance(objArr1312), false};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                                            char cAxisFromString3 = (char) ((-1) - MotionEvent.axisFromString(""));
                                            int keyRepeatTimeout4 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                                            int scrollBarFadeDuration6 = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                            byte b910 = $$a[7];
                                            byte b911 = b910;
                                            Object[] objArr1314 = new Object[1];
                                            c(b910, b911, (short) (b911 | 52), objArr1314);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cAxisFromString3, keyRepeatTimeout4, scrollBarFadeDuration6, 1298546779, false, (String) objArr1314[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 45993), (-16776099) - Color.rgb(0, 0, 0), TextUtils.lastIndexOf("", '0') + 18), Boolean.TYPE});
                                        }
                                        objArr21 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).invoke(null, objArr1313);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                                            char cRgb2 = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                                            int absoluteGravity4 = 1031 - Gravity.getAbsoluteGravity(0, 0);
                                            int iBlue5 = 15 - Color.blue(0);
                                            Object[] objArr1315 = new Object[1];
                                            c((byte) 52, (byte) ($$a[101] + 1), (short) 210, objArr1315);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cRgb2, absoluteGravity4, iBlue5, 632103528, false, (String) objArr1315[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, objArr21);
                                        long jLongValue113 = ((Long) Class.forName(str6).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                                        Long lValueOf28 = Long.valueOf(jLongValue113);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                                            char mirror3 = (char) (AndroidCharacter.getMirror('0') - '0');
                                            int i2312 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
                                            int absoluteGravity5 = Gravity.getAbsoluteGravity(0, 0) + 15;
                                            byte b912 = $$a[7];
                                            byte b913 = b912;
                                            Object[] objArr1316 = new Object[1];
                                            c(b912, b913, (short) (b913 | 210), objArr1316);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(mirror3, i2312, absoluteGravity5, 1344079056, false, (String) objArr1316[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, lValueOf28);
                                        Long lValueOf29 = Long.valueOf(jLongValue113 >> 12);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                                            char absoluteGravity6 = (char) Gravity.getAbsoluteGravity(0, 0);
                                            int deadChar8 = 1031 - KeyEvent.getDeadChar(0, 0);
                                            int i2313 = 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            byte b914 = $$a[7];
                                            byte b915 = b914;
                                            Object[] objArr1317 = new Object[1];
                                            c(b914, b915, (short) (b915 | 52), objArr1317);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(absoluteGravity6, deadChar8, i2313, 1357589585, false, (String) objArr1317[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, lValueOf29);
                                    }
                                    i19 = ((int[]) objArr21[1])[0];
                                    i20 = ((int[]) objArr21[3])[0];
                                    if (i20 == i19) {
                                        objArr22 = new Object[]{strArr20, new int[]{i236}, new int[1], new int[]{i235}};
                                        int i2314 = ((int[]) objArr21[2])[0];
                                        int i2315 = ((int[]) objArr21[3])[0];
                                        int i2316 = ((int[]) objArr21[1])[0];
                                        String[] strArr23 = (String[]) objArr21[0];
                                        int iMyTid5 = Process.myTid();
                                        int i2317 = ~((-245908510) | iMyTid5);
                                        int i2318 = ~iMyTid5;
                                        int i2319 = i2314 + 679292273 + ((i2317 | (~((-1628340) | i2318))) * (-1808)) + (((~((-245367821) | iMyTid5)) | (~(i2318 | (-1087651)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iMyTid5 | 1628339)) | 540689 | (~(245908509 | i2318))) * TypedValues.Custom.TYPE_BOOLEAN);
                                        int i2410 = (i2319 << 13) ^ i2319;
                                        int i2411 = i2410 ^ (i2410 >>> 17);
                                        c = 0;
                                        ((int[]) objArr22[2])[0] = i2411 ^ (i2411 << 5);
                                    } else {
                                        arrayList4 = new ArrayList();
                                        strArr4 = (String[]) objArr21[0];
                                        if (strArr4 != null) {
                                            while (i21 < strArr4.length) {
                                                arrayList4.add(str18);
                                            }
                                        }
                                        int[] iArr19 = new int[i20];
                                        int i2412 = i20 - 1;
                                        iArr19[i2412] = 1;
                                        Toast.makeText((Context) null, iArr19[((i20 * i2412) % 2) - 1], 1).show();
                                        objArr22 = new Object[]{strArr21, new int[]{i245}, new int[1], new int[]{i244}};
                                        int i2413 = ((int[]) objArr21[2])[0];
                                        int i2414 = ((int[]) objArr21[3])[0];
                                        int i2415 = ((int[]) objArr21[1])[0];
                                        String[] strArr24 = (String[]) objArr21[0];
                                        int iIdentityHashCode18 = System.identityHashCode(this);
                                        int i2416 = ~iIdentityHashCode18;
                                        int i2417 = i2413 + 1489559257 + (((~(i2416 | 507622374)) | (~(263342204 | i2416)) | (-536083455)) * 464) + (((-272741251) | iIdentityHashCode18) * (-464)) + (((~(iIdentityHashCode18 | 507622374)) | (-536083455)) * 464);
                                        int i2418 = (i2417 << 13) ^ i2417;
                                        int i2419 = i2418 ^ (i2418 >>> 17);
                                        c = 0;
                                        ((int[]) objArr22[2])[0] = i2419 ^ (i2419 << 5);
                                    }
                                    MixpanelAPI mixpanelAPI5 = MixpanelAPI.this;
                                    int i2510 = ((int[]) objArr13[1])[c];
                                    int i2511 = i2510 * i2510;
                                    int i2512 = -(460759618 * i2510);
                                    int i2513 = (i2511 ^ i2512) + ((i2511 & i2512) << 1);
                                    int i2514 = -(i2510 * (-1154749042));
                                    int i2515 = (i2513 ^ i2514) + ((i2514 & i2513) << 1);
                                    int i2516 = (i2515 ^ (-2063433152)) + (((-2063433152) & i2515) << 1);
                                    int i2517 = i2516 >> 24;
                                    int i2518 = ((i2517 & (-511)) + (i2517 | (-511))) / 256;
                                    int i2519 = i2518 ^ 1;
                                    int i2610 = ((i2518 & 1) << 1) + i2519;
                                    int i2611 = -(((i2516 & i2610) + (i2610 | i2516)) ^ (((i2518 | 1) << 1) - i2519));
                                    int i2612 = (i2611 & 2) + (i2611 | 2);
                                    int i2613 = i2612 >> 26;
                                    int i2614 = 1152130 / (((-((((i2613 & ComposerKt.defaultsKey) + (i2613 | ComposerKt.defaultsKey)) / 64) + 2)) & i2612) * 1057);
                                    int i2615 = ((int[]) objArr16[1])[0];
                                    int i2616 = i2615 * i2615;
                                    int i2617 = -(1733799245 * i2615);
                                    int i2618 = (i2616 & i2617) + (i2616 | i2617);
                                    int i2619 = -(i2615 * 406156519);
                                    int i2710 = (i2618 ^ i2619) + ((i2619 & i2618) << 1);
                                    int i2711 = (i2710 ^ (-1837730140)) + (((-1837730140) & i2710) << 1);
                                    int i2712 = i2711 >> 16;
                                    int i2713 = (((-131071) ^ i2712) + ((i2712 & (-131071)) << 1)) / 65536;
                                    int i2714 = (i2713 & 1) + (i2713 | 1);
                                    int i2715 = -(((((i2711 >> 22) - 2047) / 1024) + 1) ^ ((i2711 ^ i2714) + ((i2714 & i2711) << 1)));
                                    int i2716 = ((i2715 | 3) << 1) - (i2715 ^ 3);
                                    int i2717 = i2716 >> 27;
                                    int i2718 = (((i2717 & (-63)) + (i2717 | (-63))) / 32) + 1;
                                    int i2719 = i2614 + (2038755 / (((-((i2718 ^ 1) + ((i2718 & 1) << 1))) & i2716) * 683));
                                    int i2810 = ((int[]) objArr22[2])[0];
                                    int i2811 = ((((i2810 * i2810) - (~(-(399611608 * i2810)))) - 1) - (~(-(i2810 * (-180646140))))) - 1;
                                    int i2812 = (i2811 & 1299993924) + (i2811 | 1299993924);
                                    int i2813 = i2812 >> 20;
                                    int i2814 = (((i2813 | (-8191)) << 1) - (i2813 ^ (-8191))) / 4096;
                                    int i2815 = (i2814 & 1) + (i2814 | 1);
                                    int i2816 = (i2812 & i2815) + (i2815 | i2812);
                                    int i2817 = ((i2812 >> 28) - 31) / 16;
                                    int i2818 = (-(i2816 ^ ((i2817 & 1) + (i2817 | 1)))) + 5;
                                    int i2819 = ((i2818 >> 22) - 2047) / 1024;
                                    int i2910 = ((i2819 | 1) << 1) - (i2819 ^ 1);
                                    StringBuilder sb2 = new StringBuilder("27|17|30|7|$".substring(i2719 + ((-14548435) / ((i2818 & (-(((i2910 | 1) << 1) - (i2910 ^ 1)))) * 1903))));
                                    int i2911 = ((int[]) objArr2[1])[0];
                                    int i2912 = ((i2911 * i2911) - (~(-(155368094 * i2911)))) - 1;
                                    int i2913 = -(i2911 * (-2090085810));
                                    int i2914 = (i2912 ^ i2913) + ((i2913 & i2912) << 1);
                                    int i2915 = ((i2914 | 2140716644) << 1) - (i2914 ^ 2140716644);
                                    int i2916 = i2915 >> 15;
                                    int i2917 = (((-262143) & i2916) + (i2916 | (-262143))) / 131072;
                                    int i2918 = (i2917 & 1) + (i2917 | 1);
                                    int i2919 = (i2915 ^ i2918) + ((i2918 & i2915) << 1);
                                    int i3010 = i2915 >> 18;
                                    int i3011 = ((i3010 ^ (-32767)) + ((i3010 & (-32767)) << 1)) / 16384;
                                    int i3012 = -(((i3011 & 1) + (i3011 | 1)) ^ i2919);
                                    int i3013 = (i3012 & 9) + (i3012 | 9);
                                    int i3014 = i3013 >> 19;
                                    int i3015 = ((((i3014 | (-16383)) << 1) - (i3014 ^ (-16383))) / 8192) + 1;
                                    int i3016 = 10591740 / (((-(((i3015 | 1) << 1) - (i3015 ^ 1))) & i3013) * 1630);
                                    int i3017 = ((int[]) objArr47[1])[0];
                                    int i3018 = ((i3017 * i3017) - (~(-(231441836 * i3017)))) - 1;
                                    int i3019 = -(i3017 * (-457797358));
                                    int i3110 = (i3018 & i3019) + (i3019 | i3018);
                                    int i3111 = (i3110 & (-1799402175)) + ((-1799402175) | i3110);
                                    int i3112 = ((i3111 >> 23) - 1023) / 512;
                                    int i3113 = (i3112 ^ 1) + ((i3112 & 1) << 1);
                                    int i3114 = (i3111 & i3113) + (i3113 | i3111);
                                    int i3115 = i3111 >> 22;
                                    int i3116 = -(i3114 ^ (((((i3115 | (-2047)) << 1) - (i3115 ^ (-2047))) / 1024) + 1));
                                    int i3117 = ((i3116 | 7) << 1) - (i3116 ^ 7);
                                    int i3118 = ((i3117 >> 15) - 262143) / 131072;
                                    int i3119 = (i3118 ^ 1) + ((i3118 & 1) << 1);
                                    int i3210 = i3016 + (6813450 / (((-((i3119 & 1) + (i3119 | 1))) & i3117) * 1050));
                                    int i3211 = ((int[]) objArr5[3])[0];
                                    int i3212 = i3211 * i3211;
                                    int i3213 = -(444581867 * i3211);
                                    int i3214 = (i3212 & i3213) + (i3212 | i3213);
                                    int i3215 = -(i3211 * (-554768047));
                                    int i3216 = (i3214 ^ i3215) + ((i3215 & i3214) << 1);
                                    int i3217 = (i3216 ^ (-527367804)) + (((-527367804) & i3216) << 1);
                                    int i3218 = i3217 >> 21;
                                    int i3219 = ((i3218 ^ (-4095)) + ((i3218 & (-4095)) << 1)) / 2048;
                                    int i3310 = (i3219 & 1) + (i3219 | 1);
                                    int i3311 = ((i3217 | i3310) << 1) - (i3310 ^ i3217);
                                    int i3312 = i3217 >> 29;
                                    int i3313 = (((i3312 | (-15)) << 1) - (i3312 ^ (-15))) / 8;
                                    int i3314 = (-(((i3313 & 1) + (i3313 | 1)) ^ i3311)) + 9;
                                    int i3315 = i3314 >> 17;
                                    int i3316 = (((-65535) & i3315) + (i3315 | (-65535))) / 32768;
                                    int i3317 = (i3316 & 1) + (i3316 | 1);
                                    int i3318 = i3210 + (2175255 / ((i3314 & (-((i3317 ^ 1) + ((i3317 & 1) << 1)))) * 393));
                                    int i3319 = ((int[]) objArr65[0])[0];
                                    int i3410 = ((((i3319 * i3319) - (~(-(1657312069 * i3319)))) - 1) - (~(-(i3319 * 1368160965)))) - 1;
                                    int i3411 = ((i3410 | 416957977) << 1) - (i3410 ^ 416957977);
                                    int i3412 = i3411 >> 19;
                                    int i3413 = ((((i3412 | (-16383)) << 1) - (i3412 ^ (-16383))) / 8192) + 1;
                                    int i3414 = (i3411 & i3413) + (i3413 | i3411);
                                    int i3415 = i3411 >> 26;
                                    int i3416 = (((i3415 | ComposerKt.defaultsKey) << 1) - (i3415 ^ ComposerKt.defaultsKey)) / 64;
                                    int i3417 = -(i3414 ^ ((i3416 ^ 1) + ((i3416 & 1) << 1)));
                                    int i3418 = (i3417 & 2) + (i3417 | 2);
                                    int i3419 = i3418 >> 23;
                                    int i3510 = ((i3419 ^ (-1023)) + ((i3419 & (-1023)) << 1)) / 512;
                                    int i3511 = i3318 + (115362 / (((-((((i3510 | 1) << 1) - (i3510 ^ 1)) + 1)) & i3418) * 1479));
                                    int i3512 = ((int[]) objArr8[0])[0];
                                    int i3513 = ((((i3512 * i3512) - (~(-(193394499 * i3512)))) - 1) - (~(-(i3512 * (-1315238763))))) - (-2103161231);
                                    int i3514 = i3513 >> 27;
                                    int i3515 = ((i3514 ^ (-63)) + ((i3514 & (-63)) << 1)) / 32;
                                    int i3516 = (i3515 & 1) + (i3515 | 1);
                                    int i3517 = (i3513 & i3516) + (i3516 | i3513);
                                    int i3518 = i3513 >> 26;
                                    int i3519 = ((i3518 & ComposerKt.defaultsKey) + (i3518 | ComposerKt.defaultsKey)) / 64;
                                    int i3610 = -(((i3519 & 1) + (i3519 | 1)) ^ i3517);
                                    int i3611 = ((i3610 | 4) << 1) - (i3610 ^ 4);
                                    int i3612 = i3611 >> 16;
                                    int i3613 = (((-131071) ^ i3612) + ((i3612 & (-131071)) << 1)) / 65536;
                                    int i3614 = (i3613 ^ 1) + ((i3613 & 1) << 1);
                                    int i3615 = i3511 + (3249488 / (((-((i3614 & 1) + (i3614 | 1))) & i3611) * 1996));
                                    int i3616 = ((int[]) objArr10[1])[0];
                                    int i3617 = ((i3616 * i3616) - (~(-(533021361 * i3616)))) - 1;
                                    int i3618 = -(i3616 * 1279473907);
                                    int i3619 = (i3617 & i3618) + (i3618 | i3617);
                                    int i3710 = (i3619 & (-1786920892)) + ((-1786920892) | i3619);
                                    int i3711 = ((i3710 >> 16) - 131071) / 65536;
                                    int i3712 = (i3711 ^ 1) + ((i3711 & 1) << 1);
                                    int i3713 = ((i3710 | i3712) << 1) - (i3712 ^ i3710);
                                    int i3714 = i3710 >> 15;
                                    int i3715 = (((-262143) ^ i3714) + ((i3714 & (-262143)) << 1)) / 131072;
                                    int i3716 = -(i3713 ^ ((i3715 ^ 1) + ((i3715 & 1) << 1)));
                                    int i3717 = ((i3716 | 2) << 1) - (i3716 ^ 2);
                                    int i3718 = i3717 >> 15;
                                    int i3719 = ((((-262143) | i3718) << 1) - (i3718 ^ (-262143))) / 131072;
                                    int i3810 = (i3719 & 1) + (i3719 | 1);
                                    int i3811 = i3615 + (937250 / (((-((i3810 ^ 1) + ((i3810 & 1) << 1))) & i3717) * 815));
                                    int i3812 = ((int[]) objArr1118[3])[0];
                                    int i3813 = i3812 * i3812;
                                    int i3814 = -(1452691898 * i3812);
                                    int i3815 = ((i3813 | i3814) << 1) - (i3813 ^ i3814);
                                    int i3816 = -(i3812 * 1080796196);
                                    int i3817 = (i3815 ^ i3816) + ((i3816 & i3815) << 1);
                                    int i3818 = (i3817 ^ (-285758687)) + (((-285758687) & i3817) << 1);
                                    int i3819 = i3818 >> 28;
                                    int i3910 = ((i3819 & (-31)) + (i3819 | (-31))) / 16;
                                    int i3911 = (i3818 - (~(((i3910 | 1) << 1) - (i3910 ^ 1)))) - 1;
                                    int i3912 = i3818 >> 17;
                                    int i3913 = (((-65535) & i3912) + (i3912 | (-65535))) / 32768;
                                    int i3914 = -(i3911 ^ (((i3913 | 1) << 1) - (i3913 ^ 1)));
                                    int i3915 = (i3914 ^ 3) + ((i3914 & 3) << 1);
                                    int i3916 = i3915 >> 28;
                                    int i3917 = (((i3916 | (-31)) << 1) - (i3916 ^ (-31))) / 16;
                                    int i3918 = ((i3917 | 1) << 1) - (i3917 ^ 1);
                                    int i3919 = i3811 + (2337615 / (((-(((i3918 | 1) << 1) - (i3918 ^ 1))) & i3915) * TypedValues.Custom.TYPE_DIMENSION));
                                    int i4010 = ((int[]) objArr20[2])[0];
                                    int i4011 = i4010 * i4010;
                                    int i4012 = -(720385373 * i4010);
                                    int i4013 = (i4011 ^ i4012) + ((i4011 & i4012) << 1);
                                    int i4014 = -(i4010 * (-1502551805));
                                    int i4015 = (i4013 & i4014) + (i4014 | i4013);
                                    int i4016 = (i4015 & (-1381160704)) + ((-1381160704) | i4015);
                                    int i4017 = i4016 >> 24;
                                    int i4018 = (i4016 - (~((((i4017 ^ (-511)) + ((i4017 & (-511)) << 1)) / 256) + 1))) - 1;
                                    int i4019 = i4016 >> 16;
                                    int i4110 = (((-131071) ^ i4019) + ((i4019 & (-131071)) << 1)) / 65536;
                                    int i4111 = (-(i4018 ^ ((i4110 & 1) + (i4110 | 1)))) + 7;
                                    int i4112 = i4111 >> 24;
                                    int i4113 = ((i4112 ^ (-511)) + ((i4112 & (-511)) << 1)) / 256;
                                    int i4114 = (i4113 ^ 1) + ((i4113 & 1) << 1);
                                    sb2.append(intent.getStringExtra("8,event_name".substring(i3919 + ((-34867616) / ((i4111 & (-((i4114 ^ 1) + ((i4114 & 1) << 1)))) * 1202)))));
                                    mixpanelAPI5.track(sb2.toString(), jSONObject3);
                                }

                                /* JADX WARN: Code duplicated, block: B:10:0x0028  */
                                /* JADX WARN: Code duplicated, block: B:8:0x0022  */
                                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
                                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                    */
                                private static java.lang.String $$g(short r6, short r7, int r8) {
                                    /*
                                        int r7 = r7 * 2
                                        int r7 = r7 + 4
                                        int r8 = r8 * 3
                                        int r8 = 115 - r8
                                        int r6 = r6 * 3
                                        int r0 = r6 + 1
                                        byte[] r1 = com.mixpanel.android.mpmetrics.MixpanelAPI.AnonymousClass5.$$c
                                        byte[] r0 = new byte[r0]
                                        r2 = 0
                                        if (r1 != 0) goto L17
                                        r3 = r8
                                        r4 = r2
                                        r8 = r7
                                        goto L2d
                                    L17:
                                        r3 = r2
                                    L18:
                                        r5 = r8
                                        r8 = r7
                                        r7 = r5
                                        byte r4 = (byte) r7
                                        r0[r3] = r4
                                        int r4 = r3 + 1
                                        if (r3 != r6) goto L28
                                        java.lang.String r6 = new java.lang.String
                                        r6.<init>(r0, r2)
                                        return r6
                                    L28:
                                        r3 = r1[r8]
                                        r5 = r8
                                        r8 = r7
                                        r7 = r5
                                    L2d:
                                        int r3 = -r3
                                        int r7 = r7 + 1
                                        int r8 = r8 + r3
                                        r3 = r4
                                        goto L18
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MixpanelAPI.AnonymousClass5.$$g(short, short, int):java.lang.String");
                                }
                            }, new IntentFilter("com.parse.bolts.measurement_event"));
                        } catch (ClassNotFoundException e2) {
                            e = e2;
                            e.getMessage();
                        } catch (IllegalAccessException e3) {
                            e = e3;
                            e.getMessage();
                        } catch (NoSuchMethodException e4) {
                            e = e4;
                            e.getMessage();
                        } catch (InvocationTargetException unused) {
                        }
                    } catch (ClassNotFoundException e5) {
                        e = e5;
                        mixpanelAPI2 = mixpanelAPI3;
                    } catch (IllegalAccessException e6) {
                        e = e6;
                        mixpanelAPI2 = mixpanelAPI3;
                    } catch (NoSuchMethodException e7) {
                        e = e7;
                        mixpanelAPI2 = mixpanelAPI3;
                    } catch (InvocationTargetException unused2) {
                        mixpanelAPI2 = mixpanelAPI3;
                    }
                    map3.put(applicationContext, mixpanelAPI2);
                    mixpanelAPI = mixpanelAPI2;
                }
            }
            if (context instanceof Activity) {
                try {
                    try {
                        try {
                            Class.forName("bolts.AppLinks").getMethod("getTargetUrlFromInboundIntent", Context.class, Intent.class).invoke(null, context, ((Activity) context).getIntent());
                        } catch (ClassNotFoundException e8) {
                            e8.getMessage();
                        }
                    } catch (IllegalAccessException e9) {
                        e9.getMessage();
                    }
                } catch (NoSuchMethodException e10) {
                    e10.getMessage();
                } catch (InvocationTargetException unused3) {
                }
            }
        }
        return mixpanelAPI;
    }

    public double eventElapsedTime(String str) {
        Long l;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.cancelAll) {
            l = this.cancelAll.get(str);
        }
        if (l == null) {
            return 0.0d;
        }
        return (jCurrentTimeMillis - l.longValue()) / 1000;
    }

    public void reset() {
        this.TuitionPaymentFragmentbindingInflater1.asBinder();
        forceSetProvider forcesetproviderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.d);
        forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.obj = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        forcesetproviderTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(messageObtain);
        String strG = this.TuitionPaymentFragmentbindingInflater1.g();
        if (!this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && strG != null) {
            synchronized (this.TuitionPaymentFragmentbindingInflater1) {
                String strG2 = this.TuitionPaymentFragmentbindingInflater1.g();
                if (!strG.equals(strG2) && !strG.startsWith("$device:")) {
                    getChildFormat getchildformat = this.TuitionPaymentFragmentbindingInflater1;
                    synchronized (getchildformat) {
                        if (!getchildformat.d) {
                            getchildformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        }
                        getchildformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = strG;
                        getchildformat.asInterface();
                    }
                    getChildFormat getchildformat2 = this.TuitionPaymentFragmentbindingInflater1;
                    synchronized (getchildformat2) {
                        if (!getchildformat2.d) {
                            getchildformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        }
                        if (getchildformat2.b == null) {
                            getchildformat2.b = strG2;
                            getchildformat2.TuitionPaymentFragmentbindingInflater1 = true;
                            getchildformat2.asInterface();
                        }
                    }
                    getChildFormat getchildformat3 = this.TuitionPaymentFragmentbindingInflater1;
                    synchronized (getchildformat3) {
                        if (!getchildformat3.d) {
                            getchildformat3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        }
                        getchildformat3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                        getchildformat3.asInterface();
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("$anon_distinct_id", strG2);
                        track("$identify", jSONObject);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(MixpanelAPI mixpanelAPI, byte b) {
            this();
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, double d) {
            MixpanelAPI mixpanelAPI = MixpanelAPI.this;
            if (mixpanelAPI.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mixpanelAPI.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return;
            }
            HashMap map = new HashMap();
            map.put(str, Double.valueOf(d));
            MixpanelAPI mixpanelAPI2 = MixpanelAPI.this;
            if (mixpanelAPI2.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mixpanelAPI2.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return;
            }
            try {
                MixpanelAPI.b(MixpanelAPI.this, TuitionPaymentFragmentspecialinlinedviewModeldefault3("$add", new JSONObject(map)));
            } catch (JSONException unused) {
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final void b() {
            MixpanelAPI mixpanelAPI = MixpanelAPI.this;
            if (mixpanelAPI.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mixpanelAPI.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put("$transactions");
                MixpanelAPI.b(MixpanelAPI.this, TuitionPaymentFragmentspecialinlinedviewModeldefault3("$unset", jSONArray));
            } catch (JSONException unused) {
            }
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            try {
                MixpanelAPI.b(MixpanelAPI.this, TuitionPaymentFragmentspecialinlinedviewModeldefault3("$delete", JSONObject.NULL));
            } catch (JSONException unused) {
            }
        }

        private JSONObject TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, Object obj) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            String strCancel = MixpanelAPI.this.TuitionPaymentFragmentbindingInflater1.cancel();
            String strA = MixpanelAPI.this.TuitionPaymentFragmentbindingInflater1.a();
            jSONObject.put(str, obj);
            jSONObject.put("$token", MixpanelAPI.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            jSONObject.put("$time", System.currentTimeMillis());
            jSONObject.put("$had_persisted_distinct_id", MixpanelAPI.this.TuitionPaymentFragmentbindingInflater1.INotificationSideChannel());
            if (strA != null) {
                jSONObject.put("$device_id", strA);
            }
            if (strCancel != null) {
                jSONObject.put("$distinct_id", strCancel);
                jSONObject.put("$user_id", strCancel);
            }
            jSONObject.put("$mp_metadata", MixpanelAPI.this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false));
            return jSONObject;
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return MixpanelAPI.this.TuitionPaymentFragmentbindingInflater1.cancel() != null;
        }
    }

    public final void b() {
        this.INotificationSideChannel.TuitionPaymentFragmentbindingInflater1();
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        Map<String, Map<Context, MixpanelAPI>> map = asBinder;
        synchronized (map) {
            Iterator<Map<Context, MixpanelAPI>> it = map.values().iterator();
            while (it.hasNext()) {
                Iterator<MixpanelAPI> it2 = it.next().values().iterator();
                while (it2.hasNext()) {
                    tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(it2.next());
                }
            }
        }
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(MixpanelAPI mixpanelAPI, String str) {
        forceSetProvider forcesetprovider = mixpanelAPI.onTransact;
        forceSetProvider.asBinder asbinder = new forceSetProvider.asBinder(str, mixpanelAPI.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = asbinder;
        forcesetprovider.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(messageObtain);
    }

    static /* synthetic */ void b(MixpanelAPI mixpanelAPI, JSONObject jSONObject) {
        if (mixpanelAPI.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mixpanelAPI.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            return;
        }
        forceSetProvider forcesetprovider = mixpanelAPI.onTransact;
        forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jSONObject, mixpanelAPI.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        messageObtain.obj = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        forcesetprovider.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(messageObtain);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            return;
        }
        forceSetProvider forcesetprovider = this.onTransact;
        forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = tuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
        messageObtain.arg1 = 0;
        forcesetprovider.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(messageObtain);
    }

    public void timeEvent(String str) {
        if (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.cancelAll) {
            this.cancelAll.put(str, Long.valueOf(jCurrentTimeMillis));
            getChildFormat getchildformat = this.TuitionPaymentFragmentbindingInflater1;
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            try {
                try {
                    SharedPreferences.Editor editorEdit = getchildformat.notify.get().edit();
                    editorEdit.putLong(str, lValueOf.longValue());
                    getChildFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(editorEdit);
                } catch (ExecutionException e2) {
                    e2.printStackTrace();
                }
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            }
        }
    }

    public void track(String str, JSONObject jSONObject) {
        if (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            return;
        }
        TuitionPaymentFragmentbindingInflater1(str, jSONObject, false);
    }

    public final void TuitionPaymentFragmentbindingInflater1(String str, JSONObject jSONObject, boolean z) {
        Long l;
        if (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            return;
        }
        if (!z || this.b.booleanValue()) {
            synchronized (this.cancelAll) {
                l = this.cancelAll.get(str);
                this.cancelAll.remove(str);
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, String> entry : this.TuitionPaymentFragmentbindingInflater1.cancelAll().entrySet()) {
                    try {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    } catch (JSONException unused) {
                        return;
                    }
                }
                this.TuitionPaymentFragmentbindingInflater1.b(jSONObject2);
                double dCurrentTimeMillis = System.currentTimeMillis() / 1000.0d;
                String strG = this.TuitionPaymentFragmentbindingInflater1.g();
                String strA = this.TuitionPaymentFragmentbindingInflater1.a();
                String strD = this.TuitionPaymentFragmentbindingInflater1.d();
                jSONObject2.put("time", System.currentTimeMillis());
                jSONObject2.put("distinct_id", strG);
                jSONObject2.put("$had_persisted_distinct_id", this.TuitionPaymentFragmentbindingInflater1.INotificationSideChannel());
                if (strA != null) {
                    jSONObject2.put("$device_id", strA);
                }
                if (strD != null) {
                    jSONObject2.put("$user_id", strD);
                }
                if (l != null) {
                    jSONObject2.put("$duration", dCurrentTimeMillis - (l.longValue() / 1000.0d));
                }
                if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                }
                this.onTransact.b(new forceSetProvider.b(str, jSONObject2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, z, this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(true)));
            } catch (JSONException unused2) {
            }
        }
    }
}
