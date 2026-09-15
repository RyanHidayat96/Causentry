package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.content.pm.PackageInfoCompat;
import androidx.core.view.ViewCompat;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.remoteconfig.BuildConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.ViewPortBuilder;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ConfigFetchHttpClient {
    private static final String API_KEY_HEADER = "X-Goog-Api-Key";
    private static final String ETAG_HEADER = "ETag";
    private static final Pattern GMP_APP_ID_PATTERN;
    private static final String IF_NONE_MATCH_HEADER = "If-None-Match";
    private static final String INSTALLATIONS_AUTH_TOKEN_HEADER = "X-Goog-Firebase-Installations-Auth";
    private static final String ISO_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static char[] TuitionPaymentFragmentbindingInflater1 = null;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static final String X_ANDROID_CERT_HEADER = "X-Android-Cert";
    private static final String X_ANDROID_PACKAGE_HEADER = "X-Android-Package";
    private static final String X_GOOGLE_GFE_CAN_RETRY = "X-Google-GFE-Can-Retry";
    private final String apiKey;
    private final String appId;
    private final long connectTimeoutInSeconds;
    private final Context context;
    private final String namespace;
    private final String projectNumber;
    private final long readTimeoutInSeconds;
    private static final byte[] $$c = {46, 47, -18, 64};
    private static final int $$f = 243;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {99, -43, -44, -62, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 140;
    private static final byte[] $$a = {21, 65, -9, -121, 2, -15, 36, -17, -2, -8, 10, -6, 2, 28, -37, 8, -9};
    private static final int $$b = 243;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int asBinder = 1;
    private static int b = 0;

    private static void a(int i, byte b2, short s, Object[] objArr) {
        int i2 = i * 4;
        byte[] bArr = $$a;
        int i3 = (b2 * 2) + 103;
        int i4 = s + 4;
        byte[] bArr2 = new byte[14 - i2];
        int i5 = 13 - i2;
        int i6 = -1;
        if (bArr == null) {
            int i7 = i4 + (-i5);
            i4 = i4;
            i3 = i7;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            int i8 = i4 + 1;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = i8;
            i3 += -bArr[i8];
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 52
            int r6 = 55 - r6
            byte[] r0 = com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.$$d
            int r7 = r7 + 84
            int r5 = r5 * 52
            int r1 = 53 - r5
            byte[] r1 = new byte[r1]
            int r5 = 52 - r5
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r5
            goto L2b
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r0[r6]
        L2b:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.c(int, int, byte, java.lang.Object[]):void");
    }

    private static void d(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $11 + 83;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), AndroidCharacter.getMirror('0') + 2139, 40 - Color.red(0), 841711447, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33017), 3011 - TextUtils.getOffsetAfter("", 0), 25 - TextUtils.indexOf((CharSequence) "", '0', 0), 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (ViewConfiguration.getLongPressTimeout() >> 16)), 3376 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 17, -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            try {
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 36505), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3376, KeyEvent.getDeadChar(0, 0) + 17, -968507904, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
        int i7 = $10 + 89;
        $11 = i7 % 128;
        int i8 = i7 % 2;
    }

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.context = context;
        this.appId = str;
        this.apiKey = str2;
        this.projectNumber = extractProjectNumberFromAppId(str);
        this.namespace = str3;
        this.connectTimeoutInSeconds = j;
        this.readTimeoutInSeconds = j2;
    }

    public long getConnectTimeoutInSeconds() {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        long j = this.connectTimeoutInSeconds;
        int i5 = i3 + 43;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public long getReadTimeoutInSeconds() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        long j = this.readTimeoutInSeconds;
        int i5 = i3 + 3;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        GMP_APP_ID_PATTERN = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
        int i = b + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return r3.group(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r3 = com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.asBinder + 99;
        com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r3 % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if ((r3 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r3.matches() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r3.matches() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String extractProjectNumberFromAppId(java.lang.String r3) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.asBinder = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1f
            java.util.regex.Pattern r1 = com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.GMP_APP_ID_PATTERN
            java.util.regex.Matcher r3 = r1.matcher(r3)
            boolean r1 = r3.matches()
            r2 = 41
            int r2 = r2 / 0
            if (r1 == 0) goto L31
            goto L2b
        L1f:
            java.util.regex.Pattern r1 = com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.GMP_APP_ID_PATTERN
            java.util.regex.Matcher r3 = r1.matcher(r3)
            boolean r1 = r3.matches()
            if (r1 == 0) goto L31
        L2b:
            r0 = 1
            java.lang.String r3 = r3.group(r0)
            return r3
        L31:
            int r3 = com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.asBinder
            int r3 = r3 + 99
            int r1 = r3 % 128
            com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1
            int r3 = r3 % r0
            r0 = 0
            if (r3 != 0) goto L3e
            return r0
        L3e:
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.extractProjectNumberFromAppId(java.lang.String):java.lang.String");
    }

    HttpURLConnection createHttpURLConnection() throws FirebaseRemoteConfigException {
        int i = 2 % 2;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(getFetchUrl(this.projectNumber, this.namespace)).openConnection();
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            int i2 = asBinder + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                return httpURLConnection;
            }
            throw null;
        } catch (IOException e2) {
            throw new FirebaseRemoteConfigException(e2.getMessage());
        }
    }

    ConfigFetchHandler.FetchResponse fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date, Map<String, String> map3) throws FirebaseRemoteConfigException {
        int i = 2 % 2;
        setUpUrlConnection(httpURLConnection, str3, str2, map2);
        try {
            try {
                setFetchRequestBody(httpURLConnection, createFetchRequestBody(str, str2, map, l, map3).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(httpURLConnection);
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != 200) {
                    throw new FirebaseRemoteConfigServerException(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField(ETAG_HEADER);
                JSONObject fetchResponseBody = getFetchResponseBody(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(httpURLConnection).close();
                } catch (IOException unused) {
                }
                ConfigContainer configContainerExtractConfigs = extractConfigs(fetchResponseBody, date);
                if (!backendHasUpdates(fetchResponseBody)) {
                    int i2 = asBinder + 25;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                    int i3 = i2 % 2;
                    return ConfigFetchHandler.FetchResponse.forBackendHasNoUpdates(date, configContainerExtractConfigs);
                }
                return ConfigFetchHandler.FetchResponse.forBackendUpdatesFetched(configContainerExtractConfigs, headerField);
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                try {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(httpURLConnection).close();
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (IOException | JSONException e2) {
            throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e2);
        }
    }

    private void setUpUrlConnection(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout((int) TimeUnit.SECONDS.toMillis(this.connectTimeoutInSeconds));
        httpURLConnection.setReadTimeout((int) TimeUnit.SECONDS.toMillis(this.readTimeoutInSeconds));
        httpURLConnection.setRequestProperty(IF_NONE_MATCH_HEADER, str);
        setCommonRequestHeaders(httpURLConnection, str2);
        setCustomRequestHeaders(httpURLConnection, map);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private String getFetchUrl(String str, String str2) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        String str3 = String.format(RemoteConfigConstants.FETCH_REGEX_URL, str, str2);
        int i4 = asBinder + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str3;
    }

    private void setCommonRequestHeaders(HttpURLConnection httpURLConnection, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        httpURLConnection.setRequestProperty(API_KEY_HEADER, this.apiKey);
        httpURLConnection.setRequestProperty(X_ANDROID_PACKAGE_HEADER, this.context.getPackageName());
        httpURLConnection.setRequestProperty(X_ANDROID_CERT_HEADER, getFingerprintHashForPackage());
        httpURLConnection.setRequestProperty(X_GOOGLE_GFE_CAN_RETRY, "yes");
        httpURLConnection.setRequestProperty(INSTALLATIONS_AUTH_TOKEN_HEADER, str);
        httpURLConnection.setRequestProperty(HttpHeaderParser.HEADER_CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        int i4 = asBinder + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
    }

    private void setCustomRequestHeaders(HttpURLConnection httpURLConnection, Map<String, String> map) {
        int i = 2 % 2;
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        int i2 = asBinder + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            Map.Entry<String, String> next = it.next();
            httpURLConnection.setRequestProperty(next.getKey(), next.getValue());
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private String getFingerprintHashForPackage() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        asBinder = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                Context context = this.context;
                byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
                if (packageCertificateHashBytes == null) {
                    this.context.getPackageName();
                    int i3 = asBinder + 109;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                    if (i3 % 2 == 0) {
                        return null;
                    }
                    obj.hashCode();
                    throw null;
                }
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Context context2 = this.context;
            AndroidUtilsLight.getPackageCertificateHashBytes(context2, context2.getPackageName());
            obj.hashCode();
            throw null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.context.getPackageName();
            return null;
        }
    }

    private JSONObject createFetchRequestBody(String str, String str2, Map<String, String> map, Long l, Map<String, String> map2) throws Throwable {
        int i;
        int i2;
        Method method;
        Method method2;
        int i3 = 2 % 2;
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
        }
        map3.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, str);
        map3.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID_TOKEN, str2);
        map3.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.appId);
        Locale locale = this.context.getResources().getConfiguration().locale;
        map3.put(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, locale.getCountry());
        String languageTag = locale.toLanguageTag();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int length = str != null ? str.length() : 0;
        Class<?> cls = Class.forName("android.content.pm.PackageManager");
        byte b2 = (byte) 0;
        byte b3 = b2;
        byte b4 = (byte) (b3 - 1);
        Object[] objArr = new Object[1];
        a(b2, b3, b4, objArr);
        Method method3 = cls.getMethod((String) objArr[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        Object[] objArr2 = new Object[1];
        a(b2, b3, b4, objArr2);
        Method[] methodArr = {method3, cls2.getMethod((String) objArr2[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        long j = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iAlpha = 2823 - Color.alpha(0);
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
            byte[] bArr = $$d;
            byte b5 = bArr[7];
            Object[] objArr3 = new Object[1];
            c(b5, (byte) (-bArr[5]), b5, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iAlpha, jumpTapTimeout, 1814927978, false, (String) objArr3[0], null);
        }
        char c2 = '0';
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.getDefaultSize(0, 0), 2823 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22)).getDeclaredMethods();
            int length2 = declaredMethods.length;
            int i5 = 0;
            while (i5 < length2) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                asBinder = i6 % 128;
                if (i6 % 2 == 0) {
                    method2 = declaredMethods[i5];
                    int i7 = 91 / i4;
                } else {
                    method2 = declaredMethods[i5];
                }
                try {
                    int i8 = (ExpandableListView.getPackedPositionForGroup(i4) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(i4) == j ? 0 : -1));
                    int capsMode = TextUtils.getCapsMode("", i4, i4) + 24;
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", c2, i4) + 29282);
                    Object[] objArr4 = new Object[1];
                    d(i8, capsMode, cLastIndexOf, objArr4);
                    Class<?> cls3 = Class.forName((String) objArr4[0]);
                    Method[] methodArr2 = declaredMethods;
                    Object[] objArr5 = new Object[1];
                    d(24 - Drawable.resolveOpacity(0, 0), 12 - (ViewConfiguration.getScrollBarSize() >> 8), (char) View.MeasureSpec.getMode(0), objArr5);
                    Object[] objArr6 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr5[0], null).invoke(method2, null)).intValue())};
                    Object[] objArr7 = new Object[1];
                    d(37 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, (char) (6714 - View.resolveSize(0, 0)), objArr7);
                    Class<?> cls4 = Class.forName((String) objArr7[0]);
                    int i9 = length2;
                    Object[] objArr8 = new Object[1];
                    d(62 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 8 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr8);
                    if (((Boolean) cls4.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue()) {
                        Class cls5 = Long.TYPE;
                        Object[] objArr9 = new Object[1];
                        d(ViewConfiguration.getTouchSlop() >> 8, 24 - KeyEvent.keyCodeFromString(""), (char) (29281 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr9);
                        Class<?> cls6 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        d(TextUtils.indexOf((CharSequence) "", '0', 0) + 71, 13 - Gravity.getAbsoluteGravity(0, 0), (char) (27589 - TextUtils.indexOf((CharSequence) "", '0')), objArr10);
                        if (cls5.equals(cls6.getMethod((String) objArr10[0], null).invoke(method2, null))) {
                            Object[] objArr11 = new Object[1];
                            d((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, 24 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (29282 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr11);
                            Class<?> cls7 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            d(83 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 17, (char) (50857 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr12);
                            Object[] objArr13 = (Object[]) cls7.getMethod((String) objArr12[0], null).invoke(method2, null);
                            if (objArr13.length == 2 && Long.TYPE.equals(objArr13[0])) {
                                Object[] objArr14 = new Object[1];
                                d((-1) - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, (char) (View.MeasureSpec.getSize(0) + 29281), objArr14);
                                if (!(!Class.forName((String) objArr14[0]).equals(objArr13[1]))) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2824;
                                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 23;
                                        byte[] bArr2 = $$d;
                                        byte b6 = bArr2[7];
                                        Object[] objArr15 = new Object[1];
                                        c(b6, (byte) (-bArr2[5]), b6, objArr15);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, bitsPerPixel, packedPositionChild, 1814927978, false, (String) objArr15[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 2824;
                                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 22;
                                        byte[] bArr3 = $$d;
                                        byte b7 = bArr3[7];
                                        Object[] objArr16 = new Object[1];
                                        c(b7, (byte) (-bArr3[5]), b7, objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumDrawingCacheSize, bitsPerPixel2, edgeSlop, 1814927978, false, (String) objArr16[0], null);
                                    }
                                    try {
                                        Object[] objArr17 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2823;
                                            int i10 = 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            byte[] bArr4 = $$d;
                                            Object[] objArr18 = new Object[1];
                                            c((byte) (-bArr4[5]), bArr4[7], bArr4[54], objArr18);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, maxKeyCode, i10, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr17)).longValue();
                                        break;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    j = 0;
                    i5++;
                    declaredMethods = methodArr2;
                    length2 = i9;
                    i4 = 0;
                    c2 = '0';
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int mirror = AndroidCharacter.getMirror('0') + 2775;
            int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
            byte[] bArr5 = $$d;
            byte b8 = bArr5[7];
            Object[] objArr19 = new Object[1];
            c(b8, (byte) (-bArr5[5]), b8, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, mirror, jumpTapTimeout2, 1814927978, false, (String) objArr19[0], null);
        }
        Object[] objArr20 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
            int iResolveSizeAndState = 2823 - View.resolveSizeAndState(0, 0, 0);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
            byte[] bArr6 = $$d;
            byte b9 = (byte) (-bArr6[5]);
            byte b10 = bArr6[7];
            Object[] objArr21 = new Object[1];
            c(b9, b10, (byte) (b10 | 14), objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(capsMode2, iResolveSizeAndState, longPressTimeout, 1025296417, false, (String) objArr21[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr20);
        Object[] objArr22 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cKeyCodeFromString = (char) (37657 - KeyEvent.keyCodeFromString(""));
            int iGreen = 2720 - Color.green(0);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 19;
            byte[] bArr7 = $$d;
            byte b11 = (byte) (-bArr7[5]);
            byte b12 = bArr7[7];
            Object[] objArr23 = new Object[1];
            c(b11, b12, (byte) (b12 | 14), objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cKeyCodeFromString, iGreen, iIndexOf, -1568796068, false, (String) objArr23[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr22)).longValue();
        long j2 = -763943825;
        long j3 = -574;
        long j4 = -1;
        long j5 = j2 ^ j4;
        int i11 = length;
        long jIdentityHashCode = System.identityHashCode(this);
        long j6 = jIdentityHashCode ^ j4;
        long j7 = ((jLongValue ^ j4) | jIdentityHashCode) ^ j4;
        long j8 = ((long) (-1046462020)) + (j3 * j2) + (j3 * jLongValue) + (((long) 1150) * (((j5 | j6) ^ j4) | j7)) + (((long) (-575)) * (j7 | ((j6 | jLongValue) ^ j4))) + (((long) 575) * (((j5 | jIdentityHashCode) ^ j4) | (j4 ^ (j6 | j2))));
        int iIdentityHashCode = System.identityHashCode(this);
        int i12 = ((int) (j8 >> 32)) & ((((-1771464918) + (((~((-1176240534) | iIdentityHashCode)) | 101449749) * 576)) + (((~((~iIdentityHashCode) | (-1074790785))) | 159536128) * 576)) - 1694486720);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i13 = ~((-92278785) | startElapsedRealtime);
        int i14 = (((int) j8) & ((-2115405327) + (((-2146860015) | i13) * (-476)) + (i13 * 952) + ((~((~startElapsedRealtime) | (-92278785))) * 476))) | i12;
        int i15 = i14 >>> 24;
        int i16 = i14 & ViewCompat.MEASURED_SIZE_MASK;
        boolean z = i15 != 0;
        if (z) {
            int i17 = asBinder + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
            i = 2;
            int i18 = i17 % 2;
            i2 = 1;
        } else {
            i = 2;
            i2 = 0;
        }
        arrayList.add((!z || i16 >= i || (method = methodArr[i16]) == null) ? null : method.toString());
        if ((i15 + 6) * i2 != 0) {
            int i19 = asBinder + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
            if (i19 % 2 != 0) {
                Toast.makeText((Context) null, ((i11 >> i11) - 4) * i11, 0).show();
            } else {
                Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            }
        }
        map3.put(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, languageTag);
        map3.put(RemoteConfigConstants.RequestFieldKey.PLATFORM_VERSION, Integer.toString(Build.VERSION.SDK_INT));
        map3.put(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, packageInfo.versionName);
                map3.put(RemoteConfigConstants.RequestFieldKey.APP_BUILD, Long.toString(PackageInfoCompat.getLongVersionCode(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, this.context.getPackageName());
        map3.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, BuildConfig.VERSION_NAME);
        map3.put(RemoteConfigConstants.RequestFieldKey.ANALYTICS_USER_PROPERTIES, new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put(RemoteConfigConstants.RequestFieldKey.CUSTOM_SIGNALS, new JSONObject(map2));
            Objects.toString(map2.keySet());
        }
        if (l != null) {
            map3.put(RemoteConfigConstants.RequestFieldKey.FIRST_OPEN_TIME, convertToISOString(l.longValue()));
            int i20 = asBinder + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 3 % 3;
            }
        }
        return new JSONObject(map3);
    }

    private String convertToISOString(long j) {
        int i = 2 % 2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO_DATE_PATTERN, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(Long.valueOf(j));
        int i2 = asBinder + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void setFetchRequestBody(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        int i = 2 % 2;
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(ViewPortBuilder.TuitionPaymentFragmentbindingInflater1(httpURLConnection));
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private JSONObject getFetchResponseBody(URLConnection uRLConnection) throws JSONException, IOException {
        int i = 2 % 2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(uRLConnection), "utf-8"));
        StringBuilder sb = new StringBuilder();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 % 4;
        }
        while (true) {
            int i4 = bufferedReader.read();
            if (i4 == -1) {
                return new JSONObject(sb.toString());
            }
            int i5 = asBinder + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            sb.append((char) i4);
        }
    }

    private boolean backendHasUpdates(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        try {
            return i2 % 2 != 0 ? jSONObject.get(RemoteConfigConstants.ResponseFieldKey.STATE).equals("NO_CHANGE") : !jSONObject.get(RemoteConfigConstants.ResponseFieldKey.STATE).equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    private static ConfigContainer extractConfigs(JSONObject jSONObject, Date date) throws FirebaseRemoteConfigClientException {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        int i = 2 % 2;
        int i2 = asBinder + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        JSONArray jSONArray2 = null;
        try {
            try {
                if (i2 % 2 != 0) {
                    ConfigContainer.Builder builderWithFetchTime = ConfigContainer.newBuilder().withFetchTime(date);
                    jSONObject2 = jSONObject.getJSONObject(RemoteConfigConstants.ResponseFieldKey.ENTRIES);
                    int i3 = 67 / 0;
                    date = builderWithFetchTime;
                } else {
                    ConfigContainer.Builder builderWithFetchTime2 = ConfigContainer.newBuilder().withFetchTime(date);
                    jSONObject2 = jSONObject.getJSONObject(RemoteConfigConstants.ResponseFieldKey.ENTRIES);
                    date = builderWithFetchTime2;
                }
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                date = date.replaceConfigsWith(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray(RemoteConfigConstants.ResponseFieldKey.EXPERIMENT_DESCRIPTIONS);
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    date.withAbtExperiments(jSONArray);
                    jSONArray2.hashCode();
                    throw null;
                }
                date = date.withAbtExperiments(jSONArray);
                int i5 = asBinder + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                int i6 = i5 % 2;
            }
            try {
                jSONObject3 = jSONObject.getJSONObject(RemoteConfigConstants.ResponseFieldKey.PERSONALIZATION_METADATA);
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                int i7 = asBinder + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                if (i7 % 2 != 0) {
                    date.withPersonalizationMetadata(jSONObject3);
                    jSONArray2.hashCode();
                    throw null;
                }
                date = date.withPersonalizationMetadata(jSONObject3);
            }
            String string = jSONObject.has(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER) ? jSONObject.getString(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER) : null;
            if (string != null) {
                date.withTemplateVersionNumber(Long.parseLong(string));
            }
            try {
                jSONArray2 = jSONObject.getJSONArray(RemoteConfigConstants.ResponseFieldKey.ROLLOUT_METADATA);
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
            } catch (JSONException unused4) {
            }
            if (jSONArray2 != null) {
                date = date.withRolloutMetadata(jSONArray2);
            }
            return date.build();
        } catch (JSONException e2) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e2);
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{50071, 6238, 29711, 20698, 44251, 35163, 58640, 49629, 7562, 31233, 22043, 45774, 36483, 60235, 50948, 9152, 32681, 21553, 45076, 36094, 59553, 50559, 8510, 32247, 45563, 27195, 1644, 8855, 57083, 64306, 38777, 46004, 28645, 2091, 9338, 49337, 43980, 28677, 7252, 14465, 50304, 57600, 36171, 43398, 30161, 4698, 15936, 55957, 59096, 33552, 44895, 19355, 6130, 15466, 55375, 58543, 33002, 44325, 18796, 5537, 12787, 56870, 45557, 27181, 1622, 8891, 57056, 64319, 38758, 46007, 55869, 509, 28074, 18766, 46391, 37092, 64675, 55398, 1060, 25564, 20407, 43900, 38695, 30546, 44178, 49349, 58403, 6236, 15757, 20952, 29974, 43328, 52883, 58052, 1553, 14969, 24470, 29657, 38670, 52070};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 3477734024531503710L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.$$c
            int r8 = r8 * 3
            int r8 = 115 - r8
            int r6 = r6 * 3
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r3 = r0[r8]
        L2a:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.$$g(int, short, short):java.lang.String");
    }
}
