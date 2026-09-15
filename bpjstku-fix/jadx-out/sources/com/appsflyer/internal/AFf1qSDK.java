package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1qSDK extends AFe1sSDK<AFf1nSDK> {
    public final AFf1mSDK areAllFieldsValid;
    public AFf1nSDK component1;
    private final AFf1pSDK component2;
    public AFi1vSDK component3;
    private final AFc1pSDK component4;
    private final AFf1gSDK copy;
    private final AFf1lSDK copydefault;
    private final String equals;
    private final AFf1iSDK hashCode;
    private final AFd1oSDK toString;

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        return 1500L;
    }

    public AFf1qSDK(AFf1pSDK aFf1pSDK, AFc1pSDK aFc1pSDK, AFf1gSDK aFf1gSDK, AFf1lSDK aFf1lSDK, AFd1oSDK aFd1oSDK, AFf1iSDK aFf1iSDK, String str, AFf1mSDK aFf1mSDK) {
        super(AFe1mSDK.RC_CDN, new AFe1mSDK[0], "UpdateRemoteConfiguration");
        this.component1 = null;
        this.component2 = aFf1pSDK;
        this.component4 = aFc1pSDK;
        this.copy = aFf1gSDK;
        this.copydefault = aFf1lSDK;
        this.toString = aFd1oSDK;
        this.hashCode = aFf1iSDK;
        this.equals = str;
        this.areAllFieldsValid = aFf1mSDK;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final AFe1rSDK getCurrencyIso4217Code() throws Exception {
        try {
            AFf1nSDK aFf1nSDKComponent1 = component1();
            this.component1 = aFf1nSDKComponent1;
            if (aFf1nSDKComponent1 == AFf1nSDK.FAILURE) {
                return AFe1rSDK.FAILURE;
            }
            return AFe1rSDK.SUCCESS;
        } catch (InterruptedIOException e2) {
            e = e2;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component1 = AFf1nSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        } catch (InterruptedException e3) {
            e = e3;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component1 = AFf1nSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component1 = AFf1nSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    /* JADX WARN: Code duplicated, block: B:16:0x0065 A[Catch: all -> 0x01af, IOException -> 0x01ec, TryCatch #2 {IOException -> 0x01ec, all -> 0x01af, blocks: (B:14:0x005d, B:16:0x0065, B:18:0x00b2, B:20:0x00cd, B:23:0x00d9, B:25:0x00e5, B:27:0x015d, B:29:0x0173, B:31:0x017d, B:33:0x01a3), top: B:53:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:18:0x00b2 A[Catch: all -> 0x01af, IOException -> 0x01ec, TryCatch #2 {IOException -> 0x01ec, all -> 0x01af, blocks: (B:14:0x005d, B:16:0x0065, B:18:0x00b2, B:20:0x00cd, B:23:0x00d9, B:25:0x00e5, B:27:0x015d, B:29:0x0173, B:31:0x017d, B:33:0x01a3), top: B:53:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00e5 A[Catch: all -> 0x01af, IOException -> 0x01ec, TryCatch #2 {IOException -> 0x01ec, all -> 0x01af, blocks: (B:14:0x005d, B:16:0x0065, B:18:0x00b2, B:20:0x00cd, B:23:0x00d9, B:25:0x00e5, B:27:0x015d, B:29:0x0173, B:31:0x017d, B:33:0x01a3), top: B:53:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:27:0x015d A[Catch: all -> 0x01af, IOException -> 0x01ec, TryCatch #2 {IOException -> 0x01ec, all -> 0x01af, blocks: (B:14:0x005d, B:16:0x0065, B:18:0x00b2, B:20:0x00cd, B:23:0x00d9, B:25:0x00e5, B:27:0x015d, B:29:0x0173, B:31:0x017d, B:33:0x01a3), top: B:53:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:31:0x017d A[Catch: all -> 0x01af, IOException -> 0x01ec, TryCatch #2 {IOException -> 0x01ec, all -> 0x01af, blocks: (B:14:0x005d, B:16:0x0065, B:18:0x00b2, B:20:0x00cd, B:23:0x00d9, B:25:0x00e5, B:27:0x015d, B:29:0x0173, B:31:0x017d, B:33:0x01a3), top: B:53:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:33:0x01a3 A[Catch: all -> 0x01af, IOException -> 0x01ec, TRY_LEAVE, TryCatch #2 {IOException -> 0x01ec, all -> 0x01af, blocks: (B:14:0x005d, B:16:0x0065, B:18:0x00b2, B:20:0x00cd, B:23:0x00d9, B:25:0x00e5, B:27:0x015d, B:29:0x0173, B:31:0x017d, B:33:0x01a3), top: B:53:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:53:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private AFf1nSDK component1() throws InterruptedException, InterruptedIOException {
        String revenue;
        AFd1aSDK<AFi1wSDK> mediationNetwork;
        AFi1wSDK body;
        String currencyIso4217Code;
        String currencyIso4217Code2;
        String mediationNetwork2;
        AFi1uSDK revenue2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.equals;
        String mediationNetwork3 = this.copy.getMediationNetwork();
        if (mediationNetwork3 != null && mediationNetwork3.trim().length() != 0) {
            if (str == null) {
                AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
            } else {
                revenue = AFj1cSDK.getRevenue(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str, this.component4.getRevenue.getMonetizationNetwork.getPackageName()}), mediationNetwork3);
            }
            if (revenue == null) {
                AFLogger.INSTANCE.v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1nSDK.FAILURE;
            }
            try {
                if (this.hashCode.getMediationNetwork()) {
                    AFLogger.INSTANCE.i(AFg1cSDK.REMOTE_CONTROL, "Cached config is expired, updating...");
                    mediationNetwork = ((AFd1nSDK) AFd1oSDK.getCurrencyIso4217Code(new Object[]{this.toString, Boolean.valueOf(this.hashCode.getMonetizationNetwork()), Boolean.valueOf(this.hashCode.getRevenue()), revenue, Integer.valueOf(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)}, 662152322, -662152320, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).getMediationNetwork();
                    if (mediationNetwork.isSuccessful()) {
                        body = mediationNetwork.getBody();
                        currencyIso4217Code = mediationNetwork.getCurrencyIso4217Code("x-amz-meta-af-auth-v1");
                        currencyIso4217Code2 = mediationNetwork.getCurrencyIso4217Code("CF-Cache-Status");
                        mediationNetwork2 = this.copy.getMediationNetwork();
                        if (mediationNetwork2 != null && mediationNetwork2.trim().length() != 0) {
                            revenue2 = this.component2.getRevenue(body, currencyIso4217Code, revenue, mediationNetwork2);
                            if (revenue2.getRevenue()) {
                                long jAFAdRevenueData = this.hashCode.AFAdRevenueData();
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
                                StringBuilder sb = new StringBuilder("using max-age fallback: ");
                                sb.append(jAFAdRevenueData);
                                sb.append(" seconds");
                                aFLogger.v(aFg1cSDK, sb.toString());
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                AFf1lSDK aFf1lSDK = this.copydefault;
                                aFf1lSDK.getMonetizationNetwork.getMediationNetwork("af_remote_config", Base64.encodeToString(body.getCurrencyIso4217Code.getBytes(Charset.defaultCharset()), 2));
                                aFf1lSDK.AFAdRevenueData = aFf1lSDK.getCurrencyIso4217Code;
                                aFf1lSDK.getMonetizationNetwork.getMonetizationNetwork("af_rc_timestamp", jCurrentTimeMillis2);
                                aFf1lSDK.getMonetizationNetwork.getMonetizationNetwork("af_rc_max_age", jAFAdRevenueData);
                                aFf1lSDK.getCurrencyIso4217Code = body;
                                aFf1lSDK.getMediationNetwork = jCurrentTimeMillis2;
                                aFf1lSDK.getRevenue = jAFAdRevenueData;
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK2 = AFg1cSDK.REMOTE_CONTROL;
                                StringBuilder sb2 = new StringBuilder("Config successfully updated, timeToLive: ");
                                sb2.append(jAFAdRevenueData);
                                sb2.append(" seconds");
                                aFLogger2.d(aFg1cSDK2, sb2.toString());
                                AFAdRevenueData(revenue, jCurrentTimeMillis, revenue2.AFAdRevenueData, currencyIso4217Code2, mediationNetwork);
                                return AFf1nSDK.SUCCESS;
                            }
                            AFAdRevenueData(revenue, jCurrentTimeMillis, revenue2.AFAdRevenueData, currencyIso4217Code2, mediationNetwork);
                            AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "fetched config is not valid (MITM?) refuse to use it.");
                            return AFf1nSDK.FAILURE;
                        }
                        AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
                        return AFf1nSDK.FAILURE;
                    }
                    AFAdRevenueData(revenue, jCurrentTimeMillis, null, null, mediationNetwork);
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK3 = AFg1cSDK.REMOTE_CONTROL;
                    StringBuilder sb3 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
                    sb3.append(mediationNetwork.getStatusCode());
                    aFLogger3.w(aFg1cSDK3, sb3.toString());
                    return AFf1nSDK.FAILURE;
                }
                AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                return AFf1nSDK.USE_CACHED;
            } catch (IOException e2) {
                AFLogger aFLogger4 = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK4 = AFg1cSDK.REMOTE_CONTROL;
                StringBuilder sb4 = new StringBuilder("failed to fetch remote config: ");
                sb4.append(e2.getMessage());
                aFLogger4.e(aFg1cSDK4, sb4.toString(), e2, true, false, false);
                getRevenue(revenue, jCurrentTimeMillis, e2 instanceof ParsingException ? ((ParsingException) e2).getRawResponse() : null, null, null, null, e2);
                if (e2.getCause() instanceof InterruptedIOException) {
                    throw ((InterruptedIOException) e2.getCause());
                }
                return AFf1nSDK.FAILURE;
            } catch (Throwable th) {
                AFLogger aFLogger5 = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK5 = AFg1cSDK.REMOTE_CONTROL;
                StringBuilder sb5 = new StringBuilder("failed to update remote config: ");
                sb5.append(th.getMessage());
                aFLogger5.e(aFg1cSDK5, sb5.toString(), th, true, false, false);
                getRevenue(revenue, jCurrentTimeMillis, null, null, null, null, th);
                if (th.getCause() instanceof InterruptedException) {
                    throw ((InterruptedException) th.getCause());
                }
                return AFf1nSDK.FAILURE;
            }
        }
        AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        revenue = null;
        if (revenue == null) {
            AFLogger.INSTANCE.v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
            return AFf1nSDK.FAILURE;
        }
        if (this.hashCode.getMediationNetwork()) {
            AFLogger.INSTANCE.i(AFg1cSDK.REMOTE_CONTROL, "Cached config is expired, updating...");
            mediationNetwork = ((AFd1nSDK) AFd1oSDK.getCurrencyIso4217Code(new Object[]{this.toString, Boolean.valueOf(this.hashCode.getMonetizationNetwork()), Boolean.valueOf(this.hashCode.getRevenue()), revenue, Integer.valueOf(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)}, 662152322, -662152320, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).getMediationNetwork();
            if (mediationNetwork.isSuccessful()) {
                body = mediationNetwork.getBody();
                currencyIso4217Code = mediationNetwork.getCurrencyIso4217Code("x-amz-meta-af-auth-v1");
                currencyIso4217Code2 = mediationNetwork.getCurrencyIso4217Code("CF-Cache-Status");
                mediationNetwork2 = this.copy.getMediationNetwork();
                if (mediationNetwork2 != null) {
                    revenue2 = this.component2.getRevenue(body, currencyIso4217Code, revenue, mediationNetwork2);
                    if (revenue2.getRevenue()) {
                        long jAFAdRevenueData2 = this.hashCode.AFAdRevenueData();
                        AFLogger aFLogger6 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK6 = AFg1cSDK.REMOTE_CONTROL;
                        StringBuilder sb6 = new StringBuilder("using max-age fallback: ");
                        sb6.append(jAFAdRevenueData2);
                        sb6.append(" seconds");
                        aFLogger6.v(aFg1cSDK6, sb6.toString());
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        AFf1lSDK aFf1lSDK2 = this.copydefault;
                        aFf1lSDK2.getMonetizationNetwork.getMediationNetwork("af_remote_config", Base64.encodeToString(body.getCurrencyIso4217Code.getBytes(Charset.defaultCharset()), 2));
                        aFf1lSDK2.AFAdRevenueData = aFf1lSDK2.getCurrencyIso4217Code;
                        aFf1lSDK2.getMonetizationNetwork.getMonetizationNetwork("af_rc_timestamp", jCurrentTimeMillis3);
                        aFf1lSDK2.getMonetizationNetwork.getMonetizationNetwork("af_rc_max_age", jAFAdRevenueData2);
                        aFf1lSDK2.getCurrencyIso4217Code = body;
                        aFf1lSDK2.getMediationNetwork = jCurrentTimeMillis3;
                        aFf1lSDK2.getRevenue = jAFAdRevenueData2;
                        AFLogger aFLogger7 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK7 = AFg1cSDK.REMOTE_CONTROL;
                        StringBuilder sb7 = new StringBuilder("Config successfully updated, timeToLive: ");
                        sb7.append(jAFAdRevenueData2);
                        sb7.append(" seconds");
                        aFLogger7.d(aFg1cSDK7, sb7.toString());
                        AFAdRevenueData(revenue, jCurrentTimeMillis, revenue2.AFAdRevenueData, currencyIso4217Code2, mediationNetwork);
                        return AFf1nSDK.SUCCESS;
                    }
                    AFAdRevenueData(revenue, jCurrentTimeMillis, revenue2.AFAdRevenueData, currencyIso4217Code2, mediationNetwork);
                    AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "fetched config is not valid (MITM?) refuse to use it.");
                    return AFf1nSDK.FAILURE;
                }
                AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
                return AFf1nSDK.FAILURE;
            }
            AFAdRevenueData(revenue, jCurrentTimeMillis, null, null, mediationNetwork);
            AFLogger aFLogger8 = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK8 = AFg1cSDK.REMOTE_CONTROL;
            StringBuilder sb8 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
            sb8.append(mediationNetwork.getStatusCode());
            aFLogger8.w(aFg1cSDK8, sb8.toString());
            return AFf1nSDK.FAILURE;
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
        return AFf1nSDK.USE_CACHED;
    }

    private void AFAdRevenueData(String str, long j, AFi1ySDK aFi1ySDK, String str2, AFd1aSDK<AFi1wSDK> aFd1aSDK) {
        getRevenue(str, j, aFd1aSDK, aFd1aSDK != null ? aFd1aSDK.getBody() : null, aFi1ySDK, str2 == null ? null : str2, null);
    }

    private void getRevenue(String str, long j, AFd1aSDK<?> aFd1aSDK, AFi1wSDK aFi1wSDK, AFi1ySDK aFi1ySDK, String str2, Throwable th) {
        long j2;
        int statusCode;
        Throwable cause;
        long j3;
        if (aFd1aSDK != null) {
            j2 = aFd1aSDK.getRevenue.getRevenue;
            statusCode = aFd1aSDK.getStatusCode();
        } else {
            j2 = 0;
            statusCode = 0;
        }
        int i = statusCode;
        if (th instanceof HttpException) {
            cause = th.getCause();
            j3 = ((HttpException) th).getMetrics().getRevenue;
        } else {
            cause = th;
            j3 = j2;
        }
        this.component3 = new AFi1vSDK(aFi1wSDK != null ? aFi1wSDK.getRevenue : null, str, j3, System.currentTimeMillis() - j, i, aFi1ySDK, str2, cause);
    }
}
