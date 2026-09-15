package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AFf1uSDK extends AFf1rSDK {
    private final AFa1gSDK AFInAppEventParameterName;
    private final AFh1vSDK AFInAppEventType;
    private final AFh1uSDK AFKeystoreWrapper;
    private final AppsFlyerProperties AFLogger;
    public Map<String, Object> copydefault;
    private final AFj1sSDK equals;
    private final AFc1qSDK hashCode;
    private final AFf1oSDK registerClient;

    public AFf1uSDK(AFh1rSDK aFh1rSDK, AFc1dSDK aFc1dSDK) {
        super(aFh1rSDK, aFc1dSDK);
        this.equals = aFc1dSDK.AFLogger();
        this.hashCode = aFc1dSDK.component2();
        this.AFInAppEventType = aFc1dSDK.areAllFieldsValid();
        this.registerClient = aFc1dSDK.component1();
        this.AFLogger = AppsFlyerProperties.getInstance();
        this.AFInAppEventParameterName = aFc1dSDK.afVerboseLog();
        this.AFKeystoreWrapper = aFc1dSDK.afErrorLogForExcManagerOnly();
        this.AFAdRevenueData.add(AFe1mSDK.RESOLVE_ESP);
        this.AFAdRevenueData.add(AFe1mSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        super.getRevenue();
        AFh1vSDK aFh1vSDK = this.AFInAppEventType;
        int i = ((AFf1rSDK) this).component2.component2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i == 1) {
            if (aFh1vSDK.areAllFieldsValid != 0) {
                aFh1vSDK.AFAdRevenueData.put("net", Long.valueOf(jCurrentTimeMillis - aFh1vSDK.areAllFieldsValid));
                aFh1vSDK.getCurrencyIso4217Code.getMediationNetwork("first_launch", new JSONObject(aFh1vSDK.AFAdRevenueData).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: launch start ts is missing");
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public boolean getMediationNetwork() {
        return super.getMediationNetwork() || equals();
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        AFh1uSDK aFh1uSDK;
        AFh1uSDK aFh1uSDK2;
        super.AFAdRevenueData(aFh1rSDK);
        int i = aFh1rSDK.component2;
        AFAdRevenueData(i);
        Map map = (Map) aFh1rSDK.AFAdRevenueData.get("meta");
        if (map == null) {
            map = new HashMap();
            aFh1rSDK.AFAdRevenueData.put("meta", map);
        }
        if (!aFh1rSDK.AFAdRevenueData.containsKey("af_deeplink")) {
            aFh1rSDK.getMediationNetwork(this.AFInAppEventParameterName.getCurrencyIso4217Code());
        }
        AFi1vSDK aFi1vSDKAFAdRevenueData = this.registerClient.AFAdRevenueData();
        if (aFi1vSDKAFAdRevenueData != null) {
            HashMap map2 = new HashMap();
            map2.put("cdn_token", aFi1vSDKAFAdRevenueData.AFAdRevenueData);
            if (aFi1vSDKAFAdRevenueData.getCurrencyIso4217Code != null) {
                map2.put("c_ver", aFi1vSDKAFAdRevenueData.getCurrencyIso4217Code);
            }
            if (aFi1vSDKAFAdRevenueData.getRevenue > 0) {
                map2.put("latency", Long.valueOf(aFi1vSDKAFAdRevenueData.getRevenue));
            }
            if (aFi1vSDKAFAdRevenueData.getMediationNetwork > 0) {
                map2.put("delay", Long.valueOf(aFi1vSDKAFAdRevenueData.getMediationNetwork));
            }
            if (aFi1vSDKAFAdRevenueData.getMonetizationNetwork > 0) {
                map2.put("res_code", Integer.valueOf(aFi1vSDKAFAdRevenueData.getMonetizationNetwork));
            }
            if (aFi1vSDKAFAdRevenueData.component1 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(aFi1vSDKAFAdRevenueData.component1.getClass().getSimpleName());
                sb.append(": ");
                sb.append(aFi1vSDKAFAdRevenueData.component1.getMessage());
                map2.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, sb.toString());
            }
            if (aFi1vSDKAFAdRevenueData.component4 != null) {
                map2.put("sig", aFi1vSDKAFAdRevenueData.component4.toString());
            }
            if (aFi1vSDKAFAdRevenueData.component3 != null) {
                map2.put("cdn_cache_status", aFi1vSDKAFAdRevenueData.component3);
            }
            map.put("rc", map2);
        }
        this.toString.getCurrencyIso4217Code(aFh1rSDK.AFAdRevenueData);
        if (i == 1) {
            if (this.AFLogger.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFh1rSDK.AFAdRevenueData.put("wait_cid", Boolean.toString(true));
            }
            HashMap map3 = new HashMap(this.AFInAppEventType.getMonetizationNetwork);
            this.AFInAppEventType.getCurrencyIso4217Code.getMonetizationNetwork("ddl");
            if (!map3.isEmpty()) {
                map.put("ddl", map3);
            }
            HashMap map4 = new HashMap(this.AFInAppEventType.AFAdRevenueData);
            if (!map4.isEmpty()) {
                map.put("first_launch", map4);
            }
            AFh1uSDK aFh1uSDK3 = this.AFKeystoreWrapper;
            if (aFh1uSDK3 != null) {
                aFh1uSDK3.getCurrencyIso4217Code(aFh1rSDK);
            }
        } else if (i == 2) {
            HashMap map5 = new HashMap(this.AFInAppEventType.AFAdRevenueData);
            if (!map5.isEmpty()) {
                map.put("first_launch", map5);
            }
            this.AFInAppEventType.getCurrencyIso4217Code.getMonetizationNetwork("first_launch");
            if ((aFh1rSDK instanceof AFh1kSDK) && (aFh1uSDK2 = this.AFKeystoreWrapper) != null && !aFh1uSDK2.getMonetizationNetwork()) {
                this.AFKeystoreWrapper.getMediationNetwork(aFh1rSDK);
            }
        }
        if (map.isEmpty()) {
            aFh1rSDK.AFAdRevenueData.remove("meta");
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1qSDK aFj1qSDK : this.equals.getRevenue()) {
                boolean z = aFj1qSDK instanceof AFi1aSDK;
                int i2 = AnonymousClass1.AFAdRevenueData[aFj1qSDK.component4.ordinal()];
                if (i2 == 1) {
                    if (z) {
                        aFh1rSDK.getMediationNetwork("rfr", ((AFi1aSDK) aFj1qSDK).getCurrencyIso4217Code);
                        this.hashCode.getCurrencyIso4217Code(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1qSDK.AFAdRevenueData);
                } else if (i2 == 2 && i == 2 && !z) {
                    HashMap map6 = new HashMap();
                    map6.put("source", aFj1qSDK.component2);
                    map6.put("response", "TIMEOUT");
                    map6.put("type", aFj1qSDK.areAllFieldsValid);
                    arrayList.add(map6);
                }
            }
            if (!arrayList.isEmpty()) {
                aFh1rSDK.getMediationNetwork("referrers", arrayList);
            }
            Object obj = this.copydefault;
            if (obj != null) {
                aFh1rSDK.getMediationNetwork("fb_ddl", obj);
            }
        }
        if (aFh1rSDK.getCurrencyIso4217Code() == AFe1mSDK.LAUNCH && (aFh1uSDK = this.AFKeystoreWrapper) != null && aFh1uSDK.getRevenue()) {
            this.AFKeystoreWrapper.getMonetizationNetwork(aFh1rSDK);
        }
        this.toString.getCurrencyIso4217Code(aFh1rSDK);
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1uSDK$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AFj1qSDK.AFa1ySDK.values().length];
            AFAdRevenueData = iArr;
            try {
                iArr[AFj1qSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFAdRevenueData[AFj1qSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected void AFAdRevenueData(int i) {
        this.AFInAppEventType.getCurrencyIso4217Code(i);
    }

    private boolean equals() {
        ResponseNetwork responseNetwork = ((AFe1dSDK) this).component1;
        return (this.getMediationNetwork == AFe1rSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1) && (this.getMonetizationNetwork == AFe1mSDK.CONVERSION || this.getMonetizationNetwork == AFe1mSDK.ATTR);
    }
}
