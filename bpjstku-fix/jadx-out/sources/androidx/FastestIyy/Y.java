package androidx.FastestIyy;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Y extends AbstractC0201w {
    public Y(Context context) {
        super(context);
    }

    public static /* synthetic */ void b(String str) {
    }

    public final void a() {
        a0.a(56, new b0() { // from class: androidx.FastestIyy.Y$$ExternalSyntheticLambda1
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.b(jSONArray);
            }
        });
        a0.a(57, new b0() { // from class: androidx.FastestIyy.Y$$ExternalSyntheticLambda2
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.c(jSONArray);
            }
        });
        a0.a(74, new b0() { // from class: androidx.FastestIyy.Y$$ExternalSyntheticLambda3
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.d(jSONArray);
            }
        });
        a0.a(182, new b0() { // from class: androidx.FastestIyy.Y$$ExternalSyntheticLambda4
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.e(jSONArray);
            }
        });
        a0.a(132, new b0() { // from class: androidx.FastestIyy.Y$$ExternalSyntheticLambda5
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.f(jSONArray);
            }
        });
        a0.a(218, new b0() { // from class: androidx.FastestIyy.Y$$ExternalSyntheticLambda6
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.g(jSONArray);
            }
        });
        a0.a(284, new b0() { // from class: androidx.FastestIyy.Y$$ExternalSyntheticLambda7
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.h(jSONArray);
            }
        });
    }

    public final /* synthetic */ Object b(JSONArray jSONArray) {
        return a(this.f301a);
    }

    public final Object c(JSONArray jSONArray) {
        WifiManager wifiManager = (WifiManager) this.f301a.getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            return (wifiManager.getConnectionInfo() == null || wifiManager.getConnectionInfo().getBSSID() == null) ? "" : wifiManager.getConnectionInfo().getBSSID().replace("\"", "");
        }
        throw new RuntimeException("No WifiManager");
    }

    public final Object d(JSONArray jSONArray) {
        WifiConfiguration next;
        String[] strArr;
        String str;
        StringBuilder sb;
        WifiManager wifiManager = (WifiManager) this.f301a.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            throw new RuntimeException("No WifiManager");
        }
        String strTrim = a(this.f301a).trim();
        a("android.permission.ACCESS_FINE_LOCATION");
        a("android.permission.ACCESS_COARSE_LOCATION");
        if (Build.VERSION.SDK_INT >= 29) {
            a("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        boolean z = true;
        ArrayList arrayListA = a(true);
        arrayListA.size();
        Iterator it = arrayListA.iterator();
        while (true) {
            if (!it.hasNext()) {
                List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
                configuredNetworks.size();
                Iterator<WifiConfiguration> it2 = configuredNetworks.iterator();
                do {
                    if (!it2.hasNext()) {
                        break;
                    }
                    next = it2.next();
                    Objects.toString(next);
                    if (next.SSID.equals(strTrim.trim())) {
                        break;
                    }
                    str = next.SSID;
                    sb = new StringBuilder("\"");
                    sb.append(strTrim.trim());
                    sb.append("\"");
                } while (!str.equals(sb.toString()));
                Objects.toString(next.allowedKeyManagement);
                if (!next.allowedKeyManagement.get(1) && !next.allowedKeyManagement.get(2) && !next.allowedKeyManagement.get(3) && !next.allowedKeyManagement.get(4) && !next.allowedKeyManagement.get(5) && !next.allowedKeyManagement.get(6) && !next.allowedKeyManagement.get(7) && ((strArr = next.wepKeys) == null || strArr.length <= 0 || strArr[0] == null)) {
                    z = false;
                    break;
                }
                break;
                break;
                break;
                break;
                break;
                break;
                break;
                break;
            }
            ScanResult scanResult = (ScanResult) it.next();
            Objects.toString(scanResult);
            if (TextUtils.equals(scanResult.SSID.toLowerCase(), strTrim.toLowerCase())) {
                String str2 = scanResult.capabilities;
                String[] strArr2 = {"WEP", "WPA", "WPA2", "WPA-EAP", "IEEE8021X"};
                for (int i = 4; i >= 0; i--) {
                    if (str2.contains(strArr2[i])) {
                        break;
                    }
                }
                z = false;
                break;
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object e(JSONArray jSONArray) {
        WifiManager wifiManager = (WifiManager) this.f301a.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            throw new RuntimeException("No WifiManager");
        }
        String strTrim = a(this.f301a).trim();
        for (ScanResult scanResult : a(true)) {
            Objects.toString(scanResult);
            if (TextUtils.equals(scanResult.SSID.toLowerCase(), strTrim.toLowerCase())) {
                return scanResult.capabilities;
            }
        }
        for (WifiConfiguration wifiConfiguration : wifiManager.getConfiguredNetworks()) {
            if (!wifiConfiguration.SSID.equals(strTrim.trim())) {
                String str = wifiConfiguration.SSID;
                StringBuilder sb = new StringBuilder("\"");
                sb.append(strTrim.trim());
                sb.append("\"");
                if (!str.equals(sb.toString())) {
                    continue;
                }
            }
            if (wifiConfiguration.allowedKeyManagement.get(1)) {
                return "WPA";
            }
            if (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) {
                return "WPA-EAP";
            }
            if (wifiConfiguration.allowedKeyManagement.get(4) || wifiConfiguration.allowedKeyManagement.get(5) || wifiConfiguration.allowedKeyManagement.get(6) || wifiConfiguration.allowedKeyManagement.get(7)) {
                return "WPA2";
            }
            String[] strArr = wifiConfiguration.wepKeys;
            if (strArr != null && strArr.length > 0 && strArr[0] != null) {
                return "WEP";
            }
        }
        return "";
    }

    public final Object f(JSONArray jSONArray) throws JSONException {
        boolean zOptBoolean = jSONArray.optBoolean(0, false);
        JSONArray jSONArray2 = new JSONArray();
        for (ScanResult scanResult : a(zOptBoolean)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ssid", scanResult.SSID);
            jSONObject.put("bssid", scanResult.BSSID);
            jSONObject.put("timestamp", scanResult.timestamp);
            jSONObject.put("capabilities", scanResult.capabilities);
            jSONArray2.put(jSONObject);
        }
        return jSONArray2;
    }

    public final Object g(JSONArray jSONArray) {
        WifiManager wifiManager = (WifiManager) this.f301a.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            return "";
        }
        int i = wifiManager.getDhcpInfo().gateway;
        StringBuilder sb = new StringBuilder();
        sb.append(i & 255);
        sb.append(".");
        sb.append((i >> 8) & 255);
        sb.append(".");
        sb.append((i >> 16) & 255);
        sb.append(".");
        sb.append((i >> 24) & 255);
        return sb.toString();
    }

    public final Object h(JSONArray jSONArray) {
        int ipAddress = ((WifiManager) this.f301a.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
        if (ipAddress == 0) {
            if (Build.VERSION.SDK_INT < 31) {
                return "";
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f301a.getSystemService("connectivity");
            return connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork()).getLinkAddresses().get(0).getAddress().getHostAddress();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ipAddress & 255);
        sb.append(".");
        sb.append((ipAddress >> 8) & 255);
        sb.append(".");
        sb.append((ipAddress >> 16) & 255);
        sb.append(".");
        sb.append((ipAddress >> 24) & 255);
        return sb.toString();
    }

    public static String a(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            return (wifiManager.getConnectionInfo() == null || wifiManager.getConnectionInfo().getSSID() == null || wifiManager.getConnectionInfo().getSSID().equals("<unknown ssid>")) ? "" : wifiManager.getConnectionInfo().getSSID().replace("\"", "");
        }
        throw new RuntimeException("No WifiManager");
    }

    public final boolean a(String str) {
        return this.f301a.checkSelfPermission(str) == 0;
    }

    public static void a(ArrayList arrayList) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ScanResult scanResult = (ScanResult) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bssid", scanResult.BSSID);
            jSONObject.put("ssid", scanResult.SSID);
            jSONObject.put("frequency", scanResult.frequency);
            jSONObject.put(FirebaseAnalytics.Param.LEVEL, scanResult.level);
            jSONObject.put("capabilities", scanResult.capabilities);
            jSONArray.put(jSONObject);
        }
        C cA = i0.a();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("networks", jSONArray);
        } catch (JSONException unused) {
        }
        ((i0) cA).a("com.zimperium.hotspothelper.scanlist", jSONObject2.toString(), new j0() { // from class: androidx.FastestIyy.Y$$ExternalSyntheticLambda0
            @Override // androidx.FastestIyy.j0
            public final void a(String str) {
                Y.b(str);
            }
        });
    }

    public final ArrayList a(boolean z) {
        WifiManager wifiManager = (WifiManager) this.f301a.getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            ArrayList arrayList = new ArrayList();
            int i = Build.VERSION.SDK_INT;
            if (i > 27 ? !(i != 28 ? !a("android.permission.ACCESS_FINE_LOCATION") || !a("android.permission.CHANGE_WIFI_STATE") : (!a("android.permission.ACCESS_FINE_LOCATION") && !a("android.permission.ACCESS_COARSE_LOCATION")) || !a("android.permission.CHANGE_WIFI_STATE")) : !(!a("android.permission.ACCESS_FINE_LOCATION") && !a("android.permission.ACCESS_COARSE_LOCATION") && !a("android.permission.CHANGE_WIFI_STATE"))) {
                ConditionVariable conditionVariable = new ConditionVariable(false);
                if (z && wifiManager.startScan()) {
                    X x = new X(this, wifiManager, arrayList, conditionVariable);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
                    this.f301a.getApplicationContext().registerReceiver(x, intentFilter);
                    conditionVariable.block(5000L);
                    this.f301a.getApplicationContext().unregisterReceiver(x);
                } else {
                    arrayList.addAll(wifiManager.getScanResults());
                }
                arrayList.size();
            }
            return arrayList;
        }
        throw new RuntimeException("No WifiManager");
    }
}
