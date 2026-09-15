package com.appsflyer.internal;

import com.android.volley.toolbox.HttpHeaderParser;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import defpackage.ViewPortBuilder;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1jSDK {
    private final int getRevenue;

    public AFd1jSDK(int i) {
        this.getRevenue = i;
    }

    public final AFd1aSDK<String> getMonetizationNetwork(AFd1cSDK aFd1cSDK) throws IOException {
        HttpURLConnection httpURLConnection;
        String mediationNetwork;
        BufferedOutputStream bufferedOutputStream;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] revenue = aFd1cSDK.getRevenue();
            StringBuilder sb = new StringBuilder();
            sb.append(aFd1cSDK.getRevenue);
            sb.append(":");
            sb.append(aFd1cSDK.getMonetizationNetwork);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            byte[] revenue2 = aFd1cSDK.getRevenue();
            if (aFd1cSDK.getCurrencyIso4217Code() && revenue2 != null) {
                try {
                    String str = aFd1cSDK.AFAdRevenueData() ? "<encrypted>" : new String(revenue2, Charset.defaultCharset());
                    sb2.append("\n payload: ");
                    sb2.append(str);
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = null;
                    try {
                        AFd1hSDK aFd1hSDK = new AFd1hSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                        StringBuilder sb3 = new StringBuilder("error: ");
                        sb3.append(th);
                        sb3.append("\n took ");
                        sb3.append(aFd1hSDK.getRevenue);
                        sb3.append("ms");
                        String string = sb3.toString();
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
                        StringBuilder sb4 = new StringBuilder("[");
                        sb4.append(aFd1cSDK.hashCode());
                        sb4.append("] ");
                        sb4.append(string);
                        aFLogger.e(aFg1cSDK, sb4.toString(), th, false, false, false);
                        throw new HttpException(th, aFd1hSDK);
                    } catch (Throwable th2) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th2;
                    }
                }
            }
            for (Map.Entry<String, String> entry : aFd1cSDK.AFAdRevenueData.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
            StringBuilder sb5 = new StringBuilder("[");
            sb5.append(aFd1cSDK.hashCode());
            sb5.append("] ");
            sb5.append((Object) sb2);
            AFLogger.INSTANCE.d(AFg1cSDK.HTTP_CLIENT, sb5.toString());
            URLConnection uRLConnectionOpenConnection = new URL(aFd1cSDK.getMonetizationNetwork).openConnection();
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                httpURLConnection2.setRequestMethod(aFd1cSDK.getRevenue);
                if (aFd1cSDK.getMonetizationNetwork()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFd1cSDK.component3()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                try {
                    int i = this.getRevenue;
                    int i2 = aFd1cSDK.component4;
                    if (i2 != -1) {
                        i = i2;
                    }
                    httpURLConnection2.setConnectTimeout(i);
                    httpURLConnection2.setReadTimeout(i);
                    httpURLConnection2.addRequestProperty(HttpHeaderParser.HEADER_CONTENT_TYPE, aFd1cSDK.AFAdRevenueData() ? "application/octet-stream" : "application/json");
                    for (Map.Entry<String, String> entry2 : aFd1cSDK.AFAdRevenueData.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    if (revenue != null) {
                        httpURLConnection2.setDoOutput(true);
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(revenue.length);
                        httpURLConnection2.setRequestProperty("Content-Length", sb6.toString());
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(ViewPortBuilder.TuitionPaymentFragmentbindingInflater1((URLConnection) httpURLConnection2));
                            try {
                                bufferedOutputStream2.write(revenue);
                                bufferedOutputStream2.close();
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedOutputStream = null;
                        }
                    }
                    boolean z = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection2) / 100 == 2;
                    if (!aFd1cSDK.getMediationNetwork()) {
                        mediationNetwork = "";
                    } else {
                        mediationNetwork = getMediationNetwork(httpURLConnection2);
                    }
                    String str2 = mediationNetwork;
                    AFd1hSDK aFd1hSDK2 = new AFd1hSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb7 = new StringBuilder("response code:");
                    sb7.append(ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection2));
                    sb7.append(" ");
                    sb7.append(httpURLConnection2.getResponseMessage());
                    sb7.append("\n body:");
                    sb7.append(str2);
                    sb7.append("\n took ");
                    sb7.append(aFd1hSDK2.getRevenue);
                    sb7.append("ms");
                    String string2 = sb7.toString();
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb8 = new StringBuilder("[");
                    sb8.append(aFd1cSDK.hashCode());
                    sb8.append("] ");
                    sb8.append(string2);
                    aFLogger2.d(aFg1cSDK2, sb8.toString());
                    HashMap map = new HashMap(httpURLConnection2.getHeaderFields());
                    map.remove(null);
                    AFd1aSDK<String> aFd1aSDK = new AFd1aSDK<>(str2, ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection2), z, map, aFd1hSDK2);
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    return aFd1aSDK;
                } catch (Throwable th5) {
                    th = th5;
                    httpURLConnection = httpURLConnection2;
                    AFd1hSDK aFd1hSDK3 = new AFd1hSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb9 = new StringBuilder("error: ");
                    sb9.append(th);
                    sb9.append("\n took ");
                    sb9.append(aFd1hSDK3.getRevenue);
                    sb9.append("ms");
                    String string3 = sb9.toString();
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK3 = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb10 = new StringBuilder("[");
                    sb10.append(aFd1cSDK.hashCode());
                    sb10.append("] ");
                    sb10.append(string3);
                    aFLogger3.e(aFg1cSDK3, sb10.toString(), th, false, false, false);
                    throw new HttpException(th, aFd1hSDK3);
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    private static String getMediationNetwork(HttpURLConnection httpURLConnection) throws Throwable {
        Throwable th;
        Reader reader;
        InputStream errorStream;
        Reader reader2 = null;
        try {
            try {
                errorStream = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2((URLConnection) httpURLConnection);
            } catch (Exception e2) {
                errorStream = httpURLConnection.getErrorStream();
                AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, e2.getMessage() != null ? e2.getMessage() : "", e2, false, false, false, false);
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                boolean z = true;
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            if (!z) {
                                sb.append('\n');
                            }
                            sb.append(line);
                            z = false;
                        } else {
                            String string = sb.toString();
                            inputStreamReader.close();
                            bufferedReader.close();
                            return string;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        reader2 = bufferedReader;
                        reader = reader2;
                        reader2 = inputStreamReader;
                        if (reader2 != null) {
                            reader2.close();
                        }
                        if (reader != null) {
                            reader.close();
                            throw th;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            reader = null;
        }
        if (reader2 != null) {
            reader2.close();
        }
        if (reader != null) {
            reader.close();
            throw th;
        }
        throw th;
    }
}
