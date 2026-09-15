package androidx.FastestIyy;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import java.net.InetAddress;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class V extends AbstractC0201w {
    public static W b;

    public V(Context context) {
        super(context);
    }

    public final void a() {
        a0.a(9, new b0() { // from class: androidx.FastestIyy.V$$ExternalSyntheticLambda0
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.b(jSONArray);
            }
        });
        a0.a(130, new b0() { // from class: androidx.FastestIyy.V$$ExternalSyntheticLambda1
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.c(jSONArray);
            }
        });
        a0.a(131, new b0() { // from class: androidx.FastestIyy.V$$ExternalSyntheticLambda2
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.d(jSONArray);
            }
        });
        a0.a(149, new b0() { // from class: androidx.FastestIyy.V$$ExternalSyntheticLambda3
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.e(jSONArray);
            }
        });
        a0.a(152, new b0() { // from class: androidx.FastestIyy.V$$ExternalSyntheticLambda4
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.f(jSONArray);
            }
        });
        a0.a(196, new b0() { // from class: androidx.FastestIyy.V$$ExternalSyntheticLambda5
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.g(jSONArray);
            }
        });
        a0.a(151, new b0() { // from class: androidx.FastestIyy.V$$ExternalSyntheticLambda6
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.h(jSONArray);
            }
        });
        a0.a(349, new b0() { // from class: androidx.FastestIyy.V$$ExternalSyntheticLambda7
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.i(jSONArray);
            }
        });
    }

    public final Object b(JSONArray jSONArray) {
        String strA = AbstractC0201w.a(jSONArray);
        boolean z = true;
        String strOptString = jSONArray.isNull(1) ? null : jSONArray.optString(1);
        WifiManager wifiManager = (WifiManager) this.f301a.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            throw new RuntimeException("No WifiManager");
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 27 ? i != 28 ? !(a("android.permission.ACCESS_FINE_LOCATION") && a("android.permission.CHANGE_WIFI_STATE")) : !((a("android.permission.ACCESS_FINE_LOCATION") || a("android.permission.ACCESS_COARSE_LOCATION")) && a("android.permission.CHANGE_WIFI_STATE")) : !(a("android.permission.ACCESS_FINE_LOCATION") || a("android.permission.ACCESS_COARSE_LOCATION") || a("android.permission.CHANGE_WIFI_STATE"))) {
            z = false;
        } else {
            for (ScanResult scanResult : wifiManager.getScanResults()) {
                if ((strA == null || !strA.equals(scanResult.SSID)) && (strOptString == null || !strOptString.equals(scanResult.BSSID))) {
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0084 A[LOOP:1: B:18:0x0082->B:19:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fa  */
    public final Object c(JSONArray jSONArray) {
        int i;
        SecureRandom secureRandom;
        StringBuilder sb;
        int i2;
        int iAddNetwork;
        String strA = AbstractC0201w.a(jSONArray);
        WifiManager wifiManager = (WifiManager) this.f301a.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            throw new RuntimeException("No WifiManager");
        }
        WifiManager wifiManager2 = (WifiManager) this.f301a.getApplicationContext().getSystemService("wifi");
        if (wifiManager2 == null) {
            throw new RuntimeException("No WifiManager");
        }
        List<WifiConfiguration> configuredNetworks = wifiManager2.getConfiguredNetworks();
        if (configuredNetworks != null) {
            for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                String str = wifiConfiguration.SSID;
                StringBuilder sb2 = new StringBuilder("\"");
                sb2.append(strA);
                sb2.append("\"");
                if (str.equals(sb2.toString())) {
                    if (wifiConfiguration.networkId < 0) {
                        break;
                    }
                }
            }
            i = Build.VERSION.SDK_INT;
            if (i < 29) {
                StringBuilder sb3 = new StringBuilder("Cannot create network on ");
                sb3.append(i);
                sb3.append(" without KNOX.");
                throw new RuntimeException(sb3.toString());
            }
            WifiConfiguration wifiConfiguration2 = new WifiConfiguration();
            StringBuilder sb4 = new StringBuilder("\"");
            sb4.append(strA);
            sb4.append("\"");
            wifiConfiguration2.SSID = sb4.toString();
            secureRandom = new SecureRandom();
            sb = new StringBuilder(63);
            for (i2 = 0; i2 < 63; i2++) {
                sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(secureRandom.nextInt(36)));
            }
            wifiConfiguration2.preSharedKey = "\"".concat(sb.toString()).concat("\"");
            wifiConfiguration2.hiddenSSID = true;
            wifiConfiguration2.status = 2;
            wifiConfiguration2.allowedGroupCiphers.set(2);
            wifiConfiguration2.allowedGroupCiphers.set(3);
            wifiConfiguration2.allowedKeyManagement.set(1);
            wifiConfiguration2.allowedPairwiseCiphers.set(1);
            wifiConfiguration2.allowedPairwiseCiphers.set(2);
            wifiConfiguration2.allowedProtocols.set(1);
            iAddNetwork = wifiManager.addNetwork(wifiConfiguration2);
            if (iAddNetwork != -1) {
                throw new RuntimeException("wifiManager.addNetwork failed");
            }
            if (wifiManager.enableNetwork(iAddNetwork, false)) {
                throw new RuntimeException("wifiManager.enableNetwork failed");
            }
            if (!wifiManager.saveConfiguration()) {
                throw new RuntimeException("wifiManager.saveConfiguration failed");
            }
        } else {
            i = Build.VERSION.SDK_INT;
            if (i < 29) {
                StringBuilder sb5 = new StringBuilder("Cannot create network on ");
                sb5.append(i);
                sb5.append(" without KNOX.");
                throw new RuntimeException(sb5.toString());
            }
            WifiConfiguration wifiConfiguration3 = new WifiConfiguration();
            StringBuilder sb6 = new StringBuilder("\"");
            sb6.append(strA);
            sb6.append("\"");
            wifiConfiguration3.SSID = sb6.toString();
            secureRandom = new SecureRandom();
            sb = new StringBuilder(63);
            while (i2 < 63) {
                sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(secureRandom.nextInt(36)));
            }
            wifiConfiguration3.preSharedKey = "\"".concat(sb.toString()).concat("\"");
            wifiConfiguration3.hiddenSSID = true;
            wifiConfiguration3.status = 2;
            wifiConfiguration3.allowedGroupCiphers.set(2);
            wifiConfiguration3.allowedGroupCiphers.set(3);
            wifiConfiguration3.allowedKeyManagement.set(1);
            wifiConfiguration3.allowedPairwiseCiphers.set(1);
            wifiConfiguration3.allowedPairwiseCiphers.set(2);
            wifiConfiguration3.allowedProtocols.set(1);
            iAddNetwork = wifiManager.addNetwork(wifiConfiguration3);
            if (iAddNetwork != -1) {
                throw new RuntimeException("wifiManager.addNetwork failed");
            }
            if (wifiManager.enableNetwork(iAddNetwork, false)) {
                throw new RuntimeException("wifiManager.enableNetwork failed");
            }
            if (!wifiManager.saveConfiguration()) {
                throw new RuntimeException("wifiManager.saveConfiguration failed");
            }
        }
        return Boolean.TRUE;
    }

    public final Object d(JSONArray jSONArray) {
        String strA = AbstractC0201w.a(jSONArray);
        WifiManager wifiManager = (WifiManager) this.f301a.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            throw new RuntimeException("No WifiManager");
        }
        List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
        boolean z = false;
        if (configuredNetworks != null) {
            StringBuilder sb = new StringBuilder("\"");
            sb.append(strA);
            sb.append("\"");
            String string = sb.toString();
            boolean z2 = false;
            for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                if (!TextUtils.isEmpty(wifiConfiguration.SSID) && wifiConfiguration.SSID.length() == string.length() && wifiConfiguration.SSID.contains(strA)) {
                    wifiManager.disableNetwork(wifiConfiguration.networkId);
                    boolean zRemoveNetwork = wifiManager.removeNetwork(wifiConfiguration.networkId);
                    if (!z2 && zRemoveNetwork) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                wifiManager.saveConfiguration();
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object e(JSONArray jSONArray) {
        NetworkInfo networkInfo = ((ConnectivityManager) this.f301a.getSystemService("connectivity")).getNetworkInfo(1);
        networkInfo.isConnected();
        return Boolean.valueOf(networkInfo.isConnected());
    }

    public final Object f(JSONArray jSONArray) {
        Network activeNetwork;
        LinkProperties linkProperties;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f301a.getSystemService("connectivity");
        if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<InetAddress> it = linkProperties.getDnsServers().iterator();
            while (it.hasNext()) {
                jSONArray2.put(it.next().getHostAddress());
            }
            return jSONArray2;
        }
        WifiManager wifiManager = (WifiManager) this.f301a.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            return new JSONArray();
        }
        JSONArray jSONArray3 = new JSONArray();
        jSONArray3.put(wifiManager.getDhcpInfo().dns1);
        jSONArray3.put(wifiManager.getDhcpInfo().dns2);
        return jSONArray3;
    }

    public final Object g(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String property = System.getProperty("http.proxyHost");
        if (property == null) {
            property = "";
        }
        jSONObject.put("host", property);
        String property2 = System.getProperty("http.proxyPort");
        if (property2 == null) {
            property2 = "-1";
        }
        jSONObject.put("port", Integer.parseInt(property2));
        return jSONObject;
    }

    public final Object h(JSONArray jSONArray) {
        Network activeNetwork;
        LinkProperties linkProperties;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f301a.getSystemService("connectivity");
        if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
            for (RouteInfo routeInfo : linkProperties.getRoutes()) {
                routeInfo.getInterface();
                routeInfo.getGateway().getHostAddress();
                if (routeInfo.isDefaultRoute() && routeInfo.getGateway() != null) {
                    routeInfo.getGateway().getHostAddress();
                    return routeInfo.getGateway().getHostAddress();
                }
            }
        }
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

    public final /* synthetic */ Object i(JSONArray jSONArray) {
        AbstractC0201w.a(jSONArray);
        return "00:00:00:00:00:00";
    }

    public final boolean a(String str) {
        return this.f301a.checkSelfPermission(str) == 0;
    }
}
