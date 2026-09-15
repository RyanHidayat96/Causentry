package com.appsflyer.internal;

import android.graphics.Color;
import android.view.Gravity;
import android.view.MotionEvent;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AFf1rSDK extends AFe1dSDK<String> {
    private static final AFe1mSDK[] AFInAppEventType = {AFe1mSDK.DLSDK, AFe1mSDK.ONELINK, AFe1mSDK.REGISTER};
    private final AFf1dSDK AFKeystoreWrapper;
    private final AFc1iSDK AFLogger;
    public final AFh1rSDK component2;
    protected final AFc1qSDK copy;
    private final AFc1pSDK copydefault;
    private final AFe1zSDK equals;
    private final AFf1oSDK hashCode;
    protected final AFg1qSDK toString;

    @Override // com.appsflyer.internal.AFe1dSDK
    protected boolean copydefault() {
        return true;
    }

    public AFf1rSDK(AFh1rSDK aFh1rSDK, AFc1dSDK aFc1dSDK) {
        this(aFh1rSDK, aFc1dSDK, null);
    }

    public AFf1rSDK(AFh1rSDK aFh1rSDK, AFc1dSDK aFc1dSDK, String str) {
        super(aFh1rSDK.getCurrencyIso4217Code(), new AFe1mSDK[]{AFe1mSDK.RC_CDN, AFe1mSDK.FETCH_ADVERTISING_ID}, aFc1dSDK, str);
        this.component2 = aFh1rSDK;
        this.equals = aFc1dSDK.AFKeystoreWrapper();
        this.copy = aFc1dSDK.component2();
        this.hashCode = aFc1dSDK.component1();
        this.AFLogger = aFc1dSDK.AFInAppEventType();
        this.copydefault = aFc1dSDK.getRevenue();
        this.toString = aFc1dSDK.component3();
        this.AFKeystoreWrapper = aFc1dSDK.afErrorLog();
        for (AFe1mSDK aFe1mSDK : AFInAppEventType) {
            if (this.getMonetizationNetwork == aFe1mSDK) {
                return;
            }
        }
        int i = this.component2.component2;
        AFe1mSDK aFe1mSDK2 = this.getMonetizationNetwork;
        if (i <= 0) {
            if (aFe1mSDK2 != AFe1mSDK.CONVERSION) {
                this.getCurrencyIso4217Code.add(AFe1mSDK.CONVERSION);
                return;
            }
            return;
        }
        this.AFAdRevenueData.add(AFe1mSDK.CONVERSION);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0119  */
    /* JADX WARN: Code duplicated, block: B:63:0x0120  */
    /* JADX WARN: Code duplicated, block: B:68:0x013b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0152  */
    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AFd1nSDK<String> getRevenue(String str) {
        double d;
        JSONObject jSONObject;
        String string;
        String strReplaceAll;
        Exception exc;
        String str2;
        AFAdRevenueData(this.component2);
        if (this.component2.AFAdRevenueData.containsKey("meta")) {
            try {
                d = this.hashCode.getMediationNetwork.getCurrencyIso4217Code.getMonetizationNetwork.getCurrencyIso4217Code.getMonetizationNetwork;
            } catch (NullPointerException unused) {
                d = 1.0d;
            }
            if (AFh1rSDK.getCurrencyIso4217Code(d)) {
                this.component2.AFAdRevenueData.remove("meta");
            }
        }
        AFd1nSDK<String> currencyIso4217Code = this.component4.getCurrencyIso4217Code(this.component2, str, this.AFLogger);
        Map<String, Object> map = this.component2.AFAdRevenueData;
        try {
            jSONObject = new JSONObject(map);
            try {
                string = jSONObject.toString();
                try {
                    if (string != null) {
                        strReplaceAll = string.replaceAll("\\p{C}", "*Non-printing character*");
                        str2 = string != null ? string : "";
                        if (strReplaceAll.equals(str2)) {
                            strReplaceAll = str2;
                        } else {
                            AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                            try {
                                jSONObject = new JSONObject(strReplaceAll);
                            } catch (JSONException e2) {
                                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Couldn't parse the payload to a json object", e2);
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(this);
                        sb.append(": preparing data: ");
                        AFh1ySDK.getCurrencyIso4217Code(sb.toString(), jSONObject);
                        ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, strReplaceAll);
                        return currencyIso4217Code;
                    }
                    throw new NullPointerException("JSON toString of eventParams map returns null");
                } catch (NullPointerException e3) {
                    e = e3;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "JSONObject return null String object. Trying to create AFJsonObject.", e);
                    try {
                        Object[] objArr = {map};
                        Object method = AFa1kSDK.i.get(-1183302619);
                        if (method == null) {
                            method = ((Class) AFa1kSDK.getCurrencyIso4217Code(Gravity.getAbsoluteGravity(0, 0) + 196, (char) Color.green(0), 36 - MotionEvent.axisFromString(""))).getMethod("getCurrencyIso4217Code", Map.class);
                            AFa1kSDK.i.put(-1183302619, method);
                        }
                        String str3 = (String) ((Method) method).invoke(null, objArr);
                        try {
                            if (str3 != null) {
                                strReplaceAll = str3.replaceAll("\\p{C}", "*Non-printing character*");
                                string = str3;
                            } else {
                                throw new NullPointerException("JSON toString of eventParams map returns null");
                            }
                        } catch (NullPointerException e4) {
                            e = e4;
                            string = str3;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFJsonObject return null String object.", e);
                            strReplaceAll = "";
                        } catch (Exception e5) {
                            exc = e5;
                            string = str3;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            strReplaceAll = "";
                        } catch (Throwable th) {
                            th = th;
                            string = str3;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                            strReplaceAll = "";
                        }
                    } catch (Throwable th2) {
                        try {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        } catch (NullPointerException e6) {
                            e = e6;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFJsonObject return null String object.", e);
                            strReplaceAll = "";
                            if (string != null) {
                            }
                            if (strReplaceAll.equals(str2)) {
                                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject = new JSONObject(strReplaceAll);
                            } else {
                                strReplaceAll = str2;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this);
                            sb2.append(": preparing data: ");
                            AFh1ySDK.getCurrencyIso4217Code(sb2.toString(), jSONObject);
                            ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, strReplaceAll);
                            return currencyIso4217Code;
                        } catch (Exception e7) {
                            exc = e7;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            strReplaceAll = "";
                            if (string != null) {
                            }
                            if (strReplaceAll.equals(str2)) {
                                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject = new JSONObject(strReplaceAll);
                            } else {
                                strReplaceAll = str2;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this);
                            sb3.append(": preparing data: ");
                            AFh1ySDK.getCurrencyIso4217Code(sb3.toString(), jSONObject);
                            ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, strReplaceAll);
                            return currencyIso4217Code;
                        } catch (Throwable th3) {
                            th = th3;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                            strReplaceAll = "";
                            if (string != null) {
                            }
                            if (strReplaceAll.equals(str2)) {
                                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject = new JSONObject(strReplaceAll);
                            } else {
                                strReplaceAll = str2;
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(this);
                            sb4.append(": preparing data: ");
                            AFh1ySDK.getCurrencyIso4217Code(sb4.toString(), jSONObject);
                            ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, strReplaceAll);
                            return currencyIso4217Code;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                    strReplaceAll = "";
                }
            } catch (NullPointerException e8) {
                e = e8;
                string = null;
            } catch (Throwable th5) {
                th = th5;
                string = null;
            }
        } catch (NullPointerException e9) {
            e = e9;
            jSONObject = null;
            string = null;
        } catch (Throwable th6) {
            th = th6;
            jSONObject = null;
            string = null;
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AppsFlyerRequestListener component3() {
        return this.component2.getCurrencyIso4217Code;
    }

    protected void getRevenue(AFh1rSDK aFh1rSDK) {
        this.toString.getRevenue(aFh1rSDK.AFAdRevenueData);
    }

    protected void getMonetizationNetwork(AFh1rSDK aFh1rSDK) {
        this.toString.getRevenue(aFh1rSDK);
    }

    protected void getMediationNetwork(AFh1rSDK aFh1rSDK) {
        this.toString.getMonetizationNetwork(aFh1rSDK);
    }

    protected void getCurrencyIso4217Code(AFh1rSDK aFh1rSDK) {
        this.toString.getMediationNetwork(aFh1rSDK);
    }

    protected void component3(AFh1rSDK aFh1rSDK) {
        this.toString.AFAdRevenueData(aFh1rSDK);
    }

    protected void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        AFe1wSDK aFe1wSDK;
        try {
            try {
                getCurrencyIso4217Code(aFh1rSDK);
                getRevenue(aFh1rSDK);
                getMediationNetwork(aFh1rSDK);
                getMonetizationNetwork(aFh1rSDK);
                component3(aFh1rSDK);
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while collecting payload params", th, true, true, false);
            }
            if (aFh1rSDK.getRevenue()) {
                aFh1rSDK.getMediationNetwork(((AFe1dSDK) this).component3.AFAdRevenueData(aFh1rSDK.AFAdRevenueData));
                aFh1rSDK.getMediationNetwork(((AFe1dSDK) this).component3.getMonetizationNetwork(aFh1rSDK.AFAdRevenueData));
                if (this.copydefault.getMonetizationNetwork("com.appsflyer.security.enable", false)) {
                    AFf1gSDK aFf1gSDK = ((AFe1dSDK) this).component3;
                    AFf1gSDK.getCurrencyIso4217Code(new Object[]{aFh1rSDK}, -211782083, 211782085, (int) System.currentTimeMillis());
                }
            }
            if (aFh1rSDK.component2()) {
                aFh1rSDK.getMediationNetwork(((AFe1dSDK) this).component3.getCurrencyIso4217Code());
            }
            Set<AFe1mSDK> set = this.getCurrencyIso4217Code;
            boolean z = set.contains(AFe1mSDK.LAUNCH) || set.contains(AFe1mSDK.CONVERSION);
            if (areAllFieldsValid() && z) {
                aFh1rSDK.AFAdRevenueData(this.copy.AFAdRevenueData("appsFlyerCount", 0));
            }
            if (aFh1rSDK.areAllFieldsValid()) {
                Map<String, Object> mapComponent1 = component1(aFh1rSDK);
                AFe1zSDK aFe1zSDK = this.equals;
                String mediationNetwork = aFe1zSDK.getMediationNetwork();
                String currencyIso4217Code = aFe1zSDK.getCurrencyIso4217Code();
                if (AFe1zSDK.AFAdRevenueData()) {
                    aFe1wSDK = AFe1wSDK.DEFAULT;
                } else {
                    aFe1wSDK = AFe1wSDK.API;
                }
                AFe1xSDK aFe1xSDK = new AFe1xSDK(mediationNetwork, currencyIso4217Code, aFe1wSDK);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", aFe1xSDK.getCurrencyIso4217Code);
                if (aFe1xSDK.getRevenue != AFe1wSDK.DEFAULT) {
                    jSONObject.put(FirebaseAnalytics.Param.METHOD, aFe1xSDK.getRevenue.getMonetizationNetwork);
                }
                String str = aFe1xSDK.getMonetizationNetwork;
                if (str != null && !StringsKt.isBlank(str)) {
                    jSONObject.put("prefix", aFe1xSDK.getMonetizationNetwork);
                }
                mapComponent1.put("host", jSONObject);
            }
            if (this.copydefault.getMonetizationNetwork("AF_PREINSTALL_DISABLED", false)) {
                component1(aFh1rSDK).put("preinstall_disabled", Boolean.TRUE);
            }
            this.AFKeystoreWrapper.AFAdRevenueData(aFh1rSDK.AFAdRevenueData, aFh1rSDK.getCurrencyIso4217Code());
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while preparing to send event", th2, true, true, false);
        }
    }

    protected static Map<String, Object> component1(AFh1rSDK aFh1rSDK) {
        Map<String, Object> map = (Map) aFh1rSDK.AFAdRevenueData.get("meta");
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        aFh1rSDK.AFAdRevenueData.put("meta", map2);
        return map2;
    }
}
