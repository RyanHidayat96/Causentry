package androidx.FastestIyy;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.view.accessibility.AccessibilityManager;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: androidx.FastestIyy.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0192v extends AbstractC0201w {
    public C0192v(Context context) {
        super(context);
    }

    public final void a() {
        a0.a(16, new b0() { // from class: androidx.FastestIyy.v$$ExternalSyntheticLambda0
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.b(jSONArray);
            }
        });
        a0.a(38, new b0() { // from class: androidx.FastestIyy.v$$ExternalSyntheticLambda3
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.c(jSONArray);
            }
        });
        a0.a(39, new b0() { // from class: androidx.FastestIyy.v$$ExternalSyntheticLambda4
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.d(jSONArray);
            }
        });
        a0.a(40, new b0() { // from class: androidx.FastestIyy.v$$ExternalSyntheticLambda5
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.e(jSONArray);
            }
        });
        a0.a(46, new b0() { // from class: androidx.FastestIyy.v$$ExternalSyntheticLambda6
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.f(jSONArray);
            }
        });
        a0.a(103, new b0() { // from class: androidx.FastestIyy.v$$ExternalSyntheticLambda7
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.g(jSONArray);
            }
        });
        a0.a(173, new b0() { // from class: androidx.FastestIyy.v$$ExternalSyntheticLambda8
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.h(jSONArray);
            }
        });
        a0.a(269, new b0() { // from class: androidx.FastestIyy.v$$ExternalSyntheticLambda9
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.i(jSONArray);
            }
        });
        a0.a(302, new b0() { // from class: androidx.FastestIyy.v$$ExternalSyntheticLambda10
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.j(jSONArray);
            }
        });
        a0.a(332, new b0() { // from class: androidx.FastestIyy.v$$ExternalSyntheticLambda1
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.k(jSONArray);
            }
        });
        ((i0) i0.a()).a("com.zimperium.appinfo.get", new B() { // from class: androidx.FastestIyy.v$$ExternalSyntheticLambda2
            @Override // androidx.FastestIyy.B
            public final void a(String str, String str2, j0 j0Var) {
                this.f$0.a(str, str2, j0Var);
            }
        });
    }

    public final Object b(JSONArray jSONArray) {
        return a(AbstractC0201w.a(jSONArray), jSONArray.isNull(1) ? null : jSONArray.optString(1));
    }

    public final Object c(JSONArray jSONArray) {
        List<ResolveInfo> listQueryBroadcastReceivers = this.f301a.getPackageManager().queryBroadcastReceivers(new Intent(AbstractC0201w.a(jSONArray), (Uri) null), 0);
        HashSet hashSet = new HashSet();
        Iterator<ResolveInfo> it = listQueryBroadcastReceivers.iterator();
        while (it.hasNext()) {
            hashSet.add(((PackageItemInfo) ((ComponentInfo) it.next().activityInfo).applicationInfo).packageName);
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            jSONArray2.put((String) it2.next());
        }
        return jSONArray2;
    }

    public final Object d(JSONArray jSONArray) {
        List<ComponentName> activeAdmins = ((DevicePolicyManager) Objects.requireNonNull((DevicePolicyManager) this.f301a.getSystemService("device_policy"))).getActiveAdmins();
        if (activeAdmins == null) {
            return new JSONArray();
        }
        HashSet hashSet = new HashSet();
        Iterator<ComponentName> it = activeAdmins.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getPackageName());
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            jSONArray2.put((String) it2.next());
        }
        return jSONArray2;
    }

    public final Object e(JSONArray jSONArray) throws JSONException {
        boolean zOptBoolean = jSONArray.optBoolean(0, false);
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        PackageManager packageManager = this.f301a.getPackageManager();
        for (PackageInfo packageInfo : packageManager.getInstalledPackages(64)) {
            boolean zA = a(packageInfo);
            if (zOptBoolean || !zA) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, packageInfo.packageName);
                jSONObject.put("apkPath", packageInfo.applicationInfo.sourceDir);
                jSONObject.put("versionName", TextUtils.isEmpty(packageInfo.versionName) ? Integer.toString(packageInfo.versionCode) : packageInfo.versionName);
                jSONObject.put("versionCode", packageInfo.versionCode);
                jSONObject.put("enabled", packageInfo.applicationInfo.enabled);
                jSONObject.put("isSystemApp", zA);
                jSONObject.put("firstInstallTime", packageInfo.firstInstallTime);
                jSONObject.put("lastUpdateTime", packageInfo.lastUpdateTime);
                try {
                    jSONObject.put("installerSource", packageManager.getInstallerPackageName(packageInfo.packageName));
                } catch (Exception unused) {
                }
                try {
                    jSONObject.put(Constants.ScionAnalytics.PARAM_LABEL, packageInfo.applicationInfo.loadLabel(packageManager));
                } catch (Exception unused2) {
                    jSONObject.put(Constants.ScionAnalytics.PARAM_LABEL, "Unknown");
                }
                JSONArray jSONArray4 = new JSONArray();
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr.length > 0) {
                    jSONArray4.put(Base64.encodeToString(signatureArr[0].toByteArray(), 2));
                }
                jSONObject.put("signatures", jSONArray4);
                if (zA) {
                    jSONArray3.put(jSONObject);
                } else {
                    jSONArray2.put(jSONObject);
                }
            }
        }
        jSONArray2.length();
        jSONArray3.length();
        for (int i = 0; i < jSONArray3.length(); i++) {
            jSONArray2.put(jSONArray3.get(i));
        }
        return jSONArray2;
    }

    public final Object f(JSONArray jSONArray) {
        return this.f301a.getPackageName();
    }

    public final Object g(JSONArray jSONArray) throws JSONException {
        String installerPackageName;
        JSONArray jSONArray2 = jSONArray.getJSONArray(0);
        String strOptString = jSONArray.isNull(1) ? null : jSONArray.optString(1);
        new SimpleDateFormat("MM-dd-yyyy", Locale.getDefault()).format(new Date(Build.TIME));
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray2.length(); i++) {
            hashSet.add(jSONArray2.getString(i));
        }
        JSONArray jSONArray3 = new JSONArray();
        for (PackageInfo packageInfo : this.f301a.getPackageManager().getInstalledPackages(0)) {
            if (strOptString == null || packageInfo.packageName.equals(strOptString)) {
                if (!a(packageInfo)) {
                    String str = packageInfo.packageName;
                    try {
                        installerPackageName = Build.VERSION.SDK_INT <= 29 ? this.f301a.getPackageManager().getInstallerPackageName(str) : this.f301a.getPackageManager().getInstallSourceInfo(str).getInstallingPackageName();
                    } catch (PackageManager.NameNotFoundException unused) {
                        installerPackageName = null;
                    }
                    if (installerPackageName == null || !hashSet.contains(installerPackageName)) {
                        jSONArray3.put(packageInfo.packageName);
                    }
                }
            }
        }
        return jSONArray3;
    }

    public final Object h(JSONArray jSONArray) {
        String strA = AbstractC0201w.a(jSONArray);
        StringBuilder sb = new StringBuilder();
        try {
            for (Signature signature : this.f301a.getPackageManager().getPackageInfo(strA, 64).signatures) {
                try {
                    sb.append(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getSubjectDN());
                } catch (CertificateException unused) {
                }
            }
        } catch (Exception unused2) {
        }
        return sb.toString();
    }

    public final Object i(JSONArray jSONArray) {
        String strA = AbstractC0201w.a(jSONArray);
        boolean z = false;
        try {
            if (((strA == null ? this.f301a.getApplicationInfo() : this.f301a.getPackageManager().getApplicationInfo(strA, 0)).flags & 2) != 0) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }

    public final Object j(JSONArray jSONArray) {
        return Boolean.valueOf(((DevicePolicyManager) Objects.requireNonNull((DevicePolicyManager) this.f301a.getSystemService("device_policy"))).isProfileOwnerApp(AbstractC0201w.a(jSONArray)));
    }

    public final Object k(JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        for (AccessibilityServiceInfo accessibilityServiceInfo : ((AccessibilityManager) this.f301a.getSystemService("accessibility")).getEnabledAccessibilityServiceList(-1)) {
            ServiceInfo serviceInfo = accessibilityServiceInfo.getResolveInfo().serviceInfo;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, ((PackageItemInfo) serviceInfo).packageName);
            jSONObject.put("capabilities", accessibilityServiceInfo.getCapabilities());
            jSONObject.put("eventTypes", accessibilityServiceInfo.eventTypes);
            jSONObject.put("flags", accessibilityServiceInfo.flags);
            jSONObject.put("feedbackType", accessibilityServiceInfo.feedbackType);
            jSONObject.put("name", accessibilityServiceInfo.getSettingsActivityName());
            jSONArray2.put(jSONObject);
        }
        return jSONArray2;
    }

    public final void a(String str, String str2, j0 j0Var) {
        String string;
        String str3;
        JSONObject jSONObjectA;
        JSONObject jSONObject;
        int iIntValue = ((Integer) J.a(J.a(str2).f263a, "uid", -1)).intValue();
        try {
            try {
                if (iIntValue >= 0) {
                    try {
                        String[] packagesForUid = this.f301a.getPackageManager().getPackagesForUid(iIntValue);
                        if (packagesForUid != null) {
                            str3 = null;
                            for (String str4 : packagesForUid) {
                                if (str3 == null || str4.length() < str3.length()) {
                                    str3 = str4;
                                }
                            }
                        } else {
                            str3 = null;
                        }
                        if (str3 != null) {
                            jSONObjectA = a(str3, null);
                            jSONObjectA.put("uid", iIntValue);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("app uid ");
                            sb.append(iIntValue);
                            sb.append(" is not currently assigned");
                            string = sb.toString();
                        }
                    } catch (Exception e2) {
                        string = e2.toString();
                    }
                    j0Var.a(jSONObjectA.toString());
                }
                string = "invalid app uid ".concat(String.valueOf(iIntValue));
                jSONObject.put("uid", iIntValue);
            } catch (JSONException unused) {
            }
            if (string == null) {
                jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, JSONObject.NULL);
            } else {
                jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, string);
            }
        } catch (JSONException unused2) {
        }
        jSONObject = new JSONObject();
        jSONObjectA = jSONObject;
        j0Var.a(jSONObjectA.toString());
    }

    public static boolean a(String str) {
        if (str != null) {
            return str.startsWith("/system") || str.startsWith("/product") || str.startsWith("/vendor") || str.startsWith("/mnt/asec/") || str.startsWith("/version/");
        }
        return false;
    }

    public static boolean a(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (a(applicationInfo.publicSourceDir)) {
            return true;
        }
        int i = applicationInfo.flags;
        return (i & 1) != 0 || (i & 128) != 0 || packageInfo.firstInstallTime <= 1330768000000L || a(applicationInfo.publicSourceDir);
    }

    public final JSONObject a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            PackageManager packageManager = this.f301a.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            boolean zEquals = (str2 == null || str2.length() <= 0 || str2.equalsIgnoreCase("any")) ? true : packageInfo.versionName.equals(str2);
            jSONObject.put("isInstalled", zEquals);
            if (zEquals) {
                jSONObject.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, packageInfo.packageName);
                jSONObject.put("apkPath", packageInfo.applicationInfo.sourceDir);
                jSONObject.put("versionName", TextUtils.isEmpty(packageInfo.versionName) ? Integer.toString(packageInfo.versionCode) : packageInfo.versionName);
                jSONObject.put("versionCode", packageInfo.versionCode);
                jSONObject.put("enabled", packageInfo.applicationInfo.enabled);
                jSONObject.put("isSystemApp", a(packageInfo));
                jSONObject.put("firstInstallTime", packageInfo.firstInstallTime);
                jSONObject.put("lastUpdateTime", packageInfo.lastUpdateTime);
                try {
                    jSONObject.put("installerSource", packageManager.getInstallerPackageName(packageInfo.packageName));
                } catch (Exception unused) {
                }
                try {
                    jSONObject.put(Constants.ScionAnalytics.PARAM_LABEL, packageInfo.applicationInfo.loadLabel(packageManager));
                } catch (Exception unused2) {
                    jSONObject.put(Constants.ScionAnalytics.PARAM_LABEL, "Unknown");
                }
                JSONArray jSONArray = new JSONArray();
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr.length > 0) {
                    jSONArray.put(Base64.encodeToString(signatureArr[0].toByteArray(), 2));
                }
                jSONObject.put("signatures", jSONArray);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            jSONObject.put("isInstalled", false);
        }
        return jSONObject;
    }
}
