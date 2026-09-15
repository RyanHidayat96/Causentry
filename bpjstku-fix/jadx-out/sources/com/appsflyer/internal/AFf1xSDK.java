package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1xSDK extends AFe1dSDK<AFa1mSDK> {
    private int AFInAppEventParameterName;
    private final List<AFj1qSDK> AFInAppEventType;
    private int AFKeystoreWrapper;
    private int AFLogger;
    private final AFa1pSDK component2;
    private final AFh1vSDK copy;
    private final AFc1kSDK copydefault;
    private final AFc1pSDK equals;
    private final AFa1oSDK hashCode;
    private final CountDownLatch registerClient;
    private final AFj1sSDK toString;

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final /* synthetic */ AppsFlyerRequestListener component3() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1xSDK(AFa1pSDK aFa1pSDK, AFc1dSDK aFc1dSDK) {
        super(AFe1mSDK.DLSDK, new AFe1mSDK[]{AFe1mSDK.RC_CDN, AFe1mSDK.FETCH_ADVERTISING_ID}, aFc1dSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        this.component2 = aFa1pSDK;
        this.registerClient = new CountDownLatch(1);
        this.AFInAppEventType = new ArrayList();
        AFc1pSDK revenue = aFc1dSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        this.equals = revenue;
        AFc1kSDK aFc1kSDKAfInfoLog = aFc1dSDK.afInfoLog();
        Intrinsics.checkNotNullExpressionValue(aFc1kSDKAfInfoLog, "");
        this.copydefault = aFc1kSDKAfInfoLog;
        AFa1oSDK aFa1oSDKD = aFc1dSDK.d();
        Intrinsics.checkNotNullExpressionValue(aFa1oSDKD, "");
        this.hashCode = aFa1oSDKD;
        AFh1vSDK aFh1vSDKAreAllFieldsValid = aFc1dSDK.areAllFieldsValid();
        Intrinsics.checkNotNullExpressionValue(aFh1vSDKAreAllFieldsValid, "");
        this.copy = aFh1vSDKAreAllFieldsValid;
        AFj1sSDK aFj1sSDKAFLogger = aFc1dSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFj1sSDKAFLogger, "");
        this.toString = aFj1sSDKAFLogger;
        AFj1qSDK[] revenue2 = aFj1sSDKAFLogger.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue2, "");
        ArrayList arrayList = new ArrayList();
        for (AFj1qSDK aFj1qSDK : revenue2) {
            AFj1qSDK aFj1qSDK2 = aFj1qSDK;
            if (aFj1qSDK2 != null && aFj1qSDK2.component4 != AFj1qSDK.AFa1ySDK.NOT_STARTED) {
                arrayList.add(aFj1qSDK);
            }
        }
        ArrayList<AFj1qSDK> arrayList2 = arrayList;
        this.AFInAppEventParameterName = arrayList2.size();
        for (final AFj1qSDK aFj1qSDK3 : arrayList2) {
            AFj1qSDK.AFa1ySDK aFa1ySDK = aFj1qSDK3.component4;
            int i = aFa1ySDK == null ? -1 : AFa1tSDK.AFAdRevenueData[aFa1ySDK.ordinal()];
            if (i == 1) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
                Object obj = aFj1qSDK3.AFAdRevenueData.get("source");
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append(" referrer collected earlier");
                AFg1gSDK.d$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1qSDK3, "");
                getMediationNetwork(aFj1qSDK3);
            } else if (i == 2) {
                aFj1qSDK3.addObserver(new Observer() { // from class: com.appsflyer.internal.AFf1xSDK$$ExternalSyntheticLambda0
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj2) {
                        AFf1xSDK.getMonetizationNetwork(aFj1qSDK3, this, observable, obj2);
                    }
                });
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final AFe1rSDK getCurrencyIso4217Code() {
        AFe1rSDK aFe1rSDK = AFe1rSDK.FAILURE;
        try {
            AFe1rSDK currencyIso4217Code = super.getCurrencyIso4217Code();
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
            try {
                AFh1vSDK aFh1vSDK = this.copy;
                int i = this.AFLogger;
                if (i <= 0 || i > 2) {
                    AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
                } else {
                    int i2 = i - 1;
                    aFh1vSDK.component2[i2] = System.currentTimeMillis();
                    if (aFh1vSDK.component1[i2] != 0) {
                        aFh1vSDK.component4[i2] = aFh1vSDK.component2[i2] - aFh1vSDK.component1[i2];
                        aFh1vSDK.getMonetizationNetwork.put("net", aFh1vSDK.component4);
                        aFh1vSDK.getCurrencyIso4217Code.getMediationNetwork("ddl", new JSONObject(aFh1vSDK.getMonetizationNetwork).toString());
                    } else {
                        StringBuilder sb = new StringBuilder("Metrics: ddlStart[");
                        sb.append(i2);
                        sb.append("] ts is missing");
                        AFLogger.afInfoLog(sb.toString());
                    }
                }
                int i3 = AFa1tSDK.getRevenue[currencyIso4217Code.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        return currencyIso4217Code;
                    }
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
                    ResponseNetwork responseNetwork = ((AFe1dSDK) this).component1;
                    Integer numValueOf = responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null;
                    StringBuilder sb2 = new StringBuilder("Error occurred. Server response code = ");
                    sb2.append(numValueOf);
                    AFg1gSDK.d$default(aFLogger, aFg1cSDK, sb2.toString(), false, 4, null);
                    DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                    this.copy.getMediationNetwork(deepLinkResult, this.hashCode.component3);
                    this.hashCode.getRevenue(deepLinkResult);
                    return currencyIso4217Code;
                }
                ResponseNetwork responseNetwork2 = ((AFe1dSDK) this).component1;
                Intrinsics.checkNotNull(responseNetwork2);
                Object body = responseNetwork2.getBody();
                Intrinsics.checkNotNullExpressionValue(body, "");
                AFa1mSDK aFa1mSDK = (AFa1mSDK) body;
                if (aFa1mSDK.getRevenue == null) {
                    if (this.AFLogger <= 1 && aFa1mSDK.getGetMonetizationNetwork() && copy()) {
                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Waiting for referrers...", false, 4, null);
                        this.registerClient.await();
                        AFh1vSDK aFh1vSDK2 = this.copy;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (aFh1vSDK2.component2[0] != 0) {
                            aFh1vSDK2.getMonetizationNetwork.put("rfr_wait", Long.valueOf(jCurrentTimeMillis - aFh1vSDK2.component2[0]));
                            aFh1vSDK2.getCurrencyIso4217Code.getMediationNetwork("ddl", new JSONObject(aFh1vSDK2.getMonetizationNetwork).toString());
                        } else {
                            AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                        }
                        if (this.AFKeystoreWrapper != this.AFInAppEventParameterName) {
                            return getCurrencyIso4217Code();
                        }
                        DeepLinkResult deepLinkResult2 = new DeepLinkResult(null, null);
                        this.copy.getMediationNetwork(deepLinkResult2, this.hashCode.component3);
                        this.hashCode.getRevenue(deepLinkResult2);
                        return AFe1rSDK.SUCCESS;
                    }
                    DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                    this.copy.getMediationNetwork(deepLinkResult3, this.hashCode.component3);
                    this.hashCode.getRevenue(deepLinkResult3);
                    return currencyIso4217Code;
                }
                DeepLinkResult deepLinkResult4 = new DeepLinkResult(aFa1mSDK.getRevenue, null);
                this.copy.getMediationNetwork(deepLinkResult4, this.hashCode.component3);
                this.hashCode.getRevenue(deepLinkResult4);
                return currencyIso4217Code;
            } catch (Exception e2) {
                e = e2;
                aFe1rSDK = currencyIso4217Code;
                Throwable cause = e.getCause();
                if ((cause instanceof InterruptedException) || (cause instanceof InterruptedIOException)) {
                    AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.DDL;
                    int i4 = this.AFLogger;
                    long j = this.hashCode.component3;
                    StringBuilder sb3 = new StringBuilder("Timeout, didn't manage to find deferred deeplink after ");
                    sb3.append(i4);
                    sb3.append(" attempt(s) within ");
                    sb3.append(j);
                    sb3.append(" milliseconds");
                    AFg1gSDK.d$default(aFLogger2, aFg1cSDK2, sb3.toString(), false, 4, null);
                    DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                    this.copy.getMediationNetwork(deepLinkResult5, this.hashCode.component3);
                    this.hashCode.getRevenue(deepLinkResult5);
                    return AFe1rSDK.TIMEOUT;
                }
                if (cause instanceof IOException) {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                    DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                    this.copy.getMediationNetwork(deepLinkResult6, this.hashCode.component3);
                    this.hashCode.getRevenue(deepLinkResult6);
                    return aFe1rSDK;
                }
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Unexpected Exception: ".concat(String.valueOf(e)), false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                this.copy.getMediationNetwork(deepLinkResult7, this.hashCode.component3);
                this.hashCode.getRevenue(deepLinkResult7);
                return aFe1rSDK;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private final void getMediationNetwork(AFj1qSDK aFj1qSDK) {
        if (getMonetizationNetwork(aFj1qSDK)) {
            this.AFInAppEventType.add(aFj1qSDK);
            this.registerClient.countDown();
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Added non-organic ".concat(String.valueOf(aFj1qSDK.getClass().getSimpleName())), false, 4, null);
        } else {
            int i = this.AFKeystoreWrapper + 1;
            this.AFKeystoreWrapper = i;
            if (i == this.AFInAppEventParameterName) {
                this.registerClient.countDown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFj1qSDK aFj1qSDK, AFf1xSDK aFf1xSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1xSDK, "");
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
        Object obj2 = aFj1qSDK.AFAdRevenueData.get("source");
        StringBuilder sb = new StringBuilder();
        sb.append(obj2);
        sb.append(" referrer collected via observer");
        AFg1gSDK.d$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
        Intrinsics.checkNotNull(observable, "");
        aFf1xSDK.getMediationNetwork((AFj1qSDK) observable);
    }

    private final boolean copy() {
        Object obj = this.component2.AFAdRevenueData.get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.AFInAppEventParameterName && !this.component2.AFAdRevenueData.containsKey("referrers");
    }

    private static boolean getMonetizationNetwork(AFj1qSDK aFj1qSDK) {
        Object obj = aFj1qSDK.AFAdRevenueData.get("click_ts");
        Long l = obj instanceof Long ? (Long) obj : null;
        if (l != null) {
            return System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1L);
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        return this.hashCode.component3;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x015a  */
    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AFd1nSDK<AFa1mSDK> getRevenue(String str) {
        Map mapMapOf;
        String[] strArr;
        Intrinsics.checkNotNullParameter(str, "");
        this.AFLogger++;
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Preparing request ".concat(String.valueOf(this.AFLogger)), false, 4, null);
        Map<String, Object> map = this.component2.AFAdRevenueData;
        if (this.AFLogger == 1) {
            map.put("is_first", Boolean.valueOf(this.equals.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) == 0));
            String language = Locale.getDefault().getLanguage();
            String country = Locale.getDefault().getCountry();
            StringBuilder sb = new StringBuilder();
            sb.append(language);
            sb.append("-");
            sb.append(country);
            map.put("lang", sb.toString());
            map.put("os", Build.VERSION.RELEASE);
            map.put("type", Build.MODEL);
            map.put("request_id", AFb1iSDK.getRevenue(this.equals.getMonetizationNetwork));
            AFb1uSDK aFb1uSDK = this.copydefault.getRevenue;
            if (aFb1uSDK != null && (strArr = aFb1uSDK.getMediationNetwork) != null) {
                Intrinsics.checkNotNullExpressionValue(strArr, "");
                map.put("sharing_filter", strArr);
            }
            AFh1oSDK aFh1oSDK = this.equals.getCurrencyIso4217Code.component3;
            Map<String, String> mapAFAdRevenueData = AFAdRevenueData(aFh1oSDK != null ? new AFb1mSDK(aFh1oSDK.getRevenue, aFh1oSDK.component3) : null);
            if (mapAFAdRevenueData != null) {
                map.put("gaid", mapAFAdRevenueData);
            }
            Map<String, String> mapAFAdRevenueData2 = AFAdRevenueData(AFb1jSDK.getMediationNetwork(this.equals.getRevenue.getMonetizationNetwork));
            if (mapAFAdRevenueData2 != null) {
                map.put("oaid", mapAFAdRevenueData2);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map.put("timestamp", simpleDateFormat.format(new Date(jCurrentTimeMillis)));
        map.put("request_count", Integer.valueOf(this.AFLogger));
        List<AFj1qSDK> list = this.AFInAppEventType;
        ArrayList arrayList = new ArrayList();
        for (AFj1qSDK aFj1qSDK : list) {
            if (aFj1qSDK.component4 == AFj1qSDK.AFa1ySDK.FINISHED) {
                Object obj = aFj1qSDK.AFAdRevenueData.get("referrer");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Object obj2 = aFj1qSDK.AFAdRevenueData.get("source");
                    Intrinsics.checkNotNull(obj2, "");
                    mapMapOf = MapsKt.mapOf(TuplesKt.to("source", (String) obj2), TuplesKt.to("value", str2));
                } else {
                    mapMapOf = null;
                }
            } else {
                mapMapOf = null;
            }
            if (mapMapOf != null) {
                arrayList.add(mapMapOf);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            map.put("referrers", arrayList2);
        }
        AFa1pSDK aFa1pSDK = this.component2;
        AFj1fSDK aFj1fSDK = new AFj1fSDK(this.equals, null, 2, null);
        String mediationNetwork = ((AFe1dSDK) this).component3.getMediationNetwork();
        Object obj3 = this.component2.AFAdRevenueData.get("timestamp");
        Intrinsics.checkNotNull(obj3, "");
        aFa1pSDK.component1 = aFj1fSDK.AFAdRevenueData(mediationNetwork, (String) obj3);
        AFh1vSDK aFh1vSDK = this.copy;
        int i = this.AFLogger;
        if (i <= 0 || i > 2) {
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
        } else {
            int i2 = i - 1;
            aFh1vSDK.component1[i2] = System.currentTimeMillis();
            if (i2 == 0) {
                if (aFh1vSDK.component3 != 0) {
                    aFh1vSDK.getMonetizationNetwork.put("from_fg", Long.valueOf(aFh1vSDK.component1[i2] - aFh1vSDK.component3));
                    aFh1vSDK.getCurrencyIso4217Code.getMediationNetwork("ddl", new JSONObject(aFh1vSDK.getMonetizationNetwork).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
            }
        }
        AFd1nSDK<AFa1mSDK> aFd1nSDKAFAdRevenueData = this.component4.AFAdRevenueData(this.component2);
        Intrinsics.checkNotNullExpressionValue(aFd1nSDKAFAdRevenueData, "");
        return aFd1nSDKAFAdRevenueData;
    }

    private static Map<String, String> AFAdRevenueData(AFb1mSDK aFb1mSDK) {
        String str;
        if (aFb1mSDK == null || (str = aFb1mSDK.getMonetizationNetwork) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1mSDK.getMediationNetwork;
        if (bool == null || !bool.booleanValue()) {
            return MapsKt.mapOf(TuplesKt.to("type", "unhashed"), TuplesKt.to("value", str));
        }
        return null;
    }

    public final /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFe1rSDK.values().length];
            try {
                iArr[AFe1rSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1rSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getRevenue = iArr;
            int[] iArr2 = new int[AFj1qSDK.AFa1ySDK.values().length];
            try {
                iArr2[AFj1qSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1qSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            AFAdRevenueData = iArr2;
        }
    }
}
