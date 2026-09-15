package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.browser.trusted.sharing.ShareTarget;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.BuildConfig;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.ViewPortBuilder;
import defpackage.abortCapture;
import defpackage.initSession;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ConfigRealtimeHttpClient {
    private static final String API_KEY_HEADER = "X-Goog-Api-Key";
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES;
    private static final Pattern GMP_APP_ID_PATTERN;
    private static final String INSTALLATIONS_AUTH_TOKEN_HEADER = "X-Goog-Firebase-Installations-Auth";
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static final String X_ACCEPT_RESPONSE_STREAMING = "X-Accept-Response-Streaming";
    private static final String X_ANDROID_CERT_HEADER = "X-Android-Cert";
    private static final String X_ANDROID_PACKAGE_HEADER = "X-Android-Package";
    private static final String X_GOOGLE_GFE_CAN_RETRY = "X-Google-GFE-Can-Retry";
    private static long b;
    ConfigCacheClient activatedCache;
    private ConfigAutoFetch configAutoFetch;
    private final ConfigFetchHandler configFetchHandler;
    private final Context context;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private int httpRetriesRemaining;
    private HttpURLConnection httpURLConnection;
    private final Set<ConfigUpdateListener> listeners;
    private final String namespace;
    private final ScheduledExecutorService scheduledExecutorService;
    private final ConfigSharedPrefsClient sharedPrefsClient;
    private static final byte[] $$c = {31, -3, -46, 11};
    private static final int $$f = 5;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {49, 84, -120, 101, 59, 14, 7, 18, 13, -9, 48, 19, 4, 21, 14, -59, 31};
    private static final int $$e = 41;
    private static final byte[] $$a = {6, 51, 46, 31, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 104;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private final int ORIGINAL_RETRIES = 8;
    private boolean isHttpConnectionRunning = false;
    private final Random random = new Random();
    private final Clock clock = DefaultClock.getInstance();
    private boolean isRealtimeDisabled = false;
    private boolean isInBackground = false;
    private final Object backgroundLock = new Object();

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 15
            int r9 = 53 - r9
            int r8 = r8 + 4
            byte[] r0 = com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.$$a
            int r7 = r7 * 2
            int r7 = r7 + 84
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L29:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            int r8 = r3 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.a(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 13
            int r7 = 16 - r7
            byte[] r0 = com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.$$d
            int r8 = r8 * 13
            int r1 = 14 - r8
            int r6 = r6 * 31
            int r6 = r6 + 67
            byte[] r1 = new byte[r1]
            int r8 = 13 - r8
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L31:
            int r6 = r6 + r7
            int r6 = r6 + (-15)
            r7 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.d(int, short, byte, java.lang.Object[]):void");
    }

    static /* synthetic */ void access$000(ConfigRealtimeHttpClient configRealtimeHttpClient) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        configRealtimeHttpClient.enableBackoff();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void access$100(ConfigRealtimeHttpClient configRealtimeHttpClient, FirebaseRemoteConfigException firebaseRemoteConfigException) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        configRealtimeHttpClient.propagateErrors(firebaseRemoteConfigException);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 25;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 64838);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1356;
                    int iNormalizeMetaState = 38 - KeyEvent.normalizeMetaState(0);
                    byte b2 = (byte) ($$f - 5);
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, iMakeMeasureSpec, iNormalizeMetaState, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - KeyEvent.keyCodeFromString("")), 468 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getTapTimeout() >> 16) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $10 + 111;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentbindingInflater1();
        BACKOFF_TIME_DURATIONS_IN_MINUTES = new int[]{2, 4, 8, 16, 32, 64, 128, 256};
        GMP_APP_ID_PATTERN = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        int i2 = i % 2;
    }

    public ConfigRealtimeHttpClient(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, Set<ConfigUpdateListener> set, ConfigSharedPrefsClient configSharedPrefsClient, ScheduledExecutorService scheduledExecutorService) {
        this.listeners = set;
        this.scheduledExecutorService = scheduledExecutorService;
        this.httpRetriesRemaining = Math.max(8 - configSharedPrefsClient.getRealtimeBackoffMetadata().getNumFailedStreams(), 1);
        this.firebaseApp = firebaseApp;
        this.configFetchHandler = configFetchHandler;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.activatedCache = configCacheClient;
        this.context = context;
        this.namespace = str;
        this.sharedPrefsClient = configSharedPrefsClient;
    }

    private static String extractProjectNumberFromAppId(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Matcher matcher = GMP_APP_ID_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return strGroup;
    }

    private String getFingerprintHashForPackage() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Context context = this.context;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                this.context.getPackageName();
                return null;
            }
            String strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return strBytesToStringUppercase;
        } catch (PackageManager.NameNotFoundException unused) {
            this.context.getPackageName();
            return null;
        }
    }

    private void setCommonRequestHeaders(HttpURLConnection httpURLConnection, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        httpURLConnection.setRequestProperty(INSTALLATIONS_AUTH_TOKEN_HEADER, str);
        httpURLConnection.setRequestProperty(API_KEY_HEADER, this.firebaseApp.getOptions().getApiKey());
        httpURLConnection.setRequestProperty(X_ANDROID_PACKAGE_HEADER, this.context.getPackageName());
        httpURLConnection.setRequestProperty(X_ANDROID_CERT_HEADER, getFingerprintHashForPackage());
        httpURLConnection.setRequestProperty(X_GOOGLE_GFE_CAN_RETRY, "yes");
        httpURLConnection.setRequestProperty(X_ACCEPT_RESPONSE_STREAMING, "true");
        httpURLConnection.setRequestProperty(HttpHeaderParser.HEADER_CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private JSONObject createRequestBody(String str) {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put("project", extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId()));
        map.put("namespace", this.namespace);
        map.put("lastKnownVersionNumber", Long.toString(this.configFetchHandler.getTemplateVersionNumber()));
        map.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.firebaseApp.getOptions().getApplicationId());
        map.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, BuildConfig.VERSION_NAME);
        map.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, str);
        JSONObject jSONObject = new JSONObject(map);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return jSONObject;
    }

    public void setRequestParams(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        int i = 2 % 2;
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
        setCommonRequestHeaders(httpURLConnection, str2);
        byte[] bytes = createRequestBody(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(ViewPortBuilder.TuitionPaymentFragmentbindingInflater1(httpURLConnection));
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        int i2 = TuitionPaymentFragmentbindingInflater1 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void propagateErrors(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        synchronized (this) {
            Iterator<ConfigUpdateListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onError(firebaseRemoteConfigException);
            }
        }
    }

    public int getNumberOfFailedStreams() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        ConfigSharedPrefsClient.RealtimeBackoffMetadata realtimeBackoffMetadata = this.sharedPrefsClient.getRealtimeBackoffMetadata();
        if (i3 != 0) {
            return realtimeBackoffMetadata.getNumFailedStreams();
        }
        realtimeBackoffMetadata.getNumFailedStreams();
        throw null;
    }

    public Date getBackoffEndTime() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.sharedPrefsClient.getRealtimeBackoffMetadata().getBackoffEndTime();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Date backoffEndTime = this.sharedPrefsClient.getRealtimeBackoffMetadata().getBackoffEndTime();
        int i3 = TuitionPaymentFragmentbindingInflater1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 97 / 0;
        }
        return backoffEndTime;
    }

    private void updateBackoffMetadataWithLastFailedStreamConnectionTime(Date date) {
        int i = 2 % 2;
        int numFailedStreams = this.sharedPrefsClient.getRealtimeBackoffMetadata().getNumFailedStreams() + 1;
        this.sharedPrefsClient.setRealtimeBackoffMetadata(numFailedStreams, new Date(date.getTime() + getRandomizedBackoffDurationInMillis(numFailedStreams)));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    private long getRandomizedBackoffDurationInMillis(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        int i4 = i3 % 128;
        TuitionPaymentFragmentbindingInflater1 = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            int length = BACKOFF_TIME_DURATIONS_IN_MINUTES.length;
            obj.hashCode();
            throw null;
        }
        int[] iArr = BACKOFF_TIME_DURATIONS_IN_MINUTES;
        int length2 = iArr.length;
        if (i >= length2) {
            int i5 = i4 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 70 / 0;
            }
            i = length2;
        }
        long millis = TimeUnit.MINUTES.toMillis(iArr[i - 1]);
        long jNextInt = (millis / 2) + ((long) this.random.nextInt((int) millis));
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        if (i7 % 2 != 0) {
            return jNextInt;
        }
        throw null;
    }

    private void enableBackoff() {
        synchronized (this) {
            this.isRealtimeDisabled = true;
        }
    }

    private boolean canMakeHttpStreamConnection() {
        boolean z;
        synchronized (this) {
            z = (this.listeners.isEmpty() || this.isHttpConnectionRunning || this.isRealtimeDisabled || this.isInBackground) ? false : true;
        }
        return z;
    }

    private String getRealtimeURL(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String str2 = String.format(RemoteConfigConstants.REALTIME_REGEX_URL, extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId()), str);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    private URL getUrl() {
        int i = 2 % 2;
        Object obj = null;
        try {
            URL url = new URL(getRealtimeURL(this.namespace));
            int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                return url;
            }
            obj.hashCode();
            throw null;
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public Task<HttpURLConnection> createRealtimeConnection() {
        int i = 2 % 2;
        final Task<InstallationTokenResult> token = this.firebaseInstallations.getToken(false);
        final Task<String> id2 = this.firebaseInstallations.getId();
        Task taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{token, id2}).continueWithTask(this.scheduledExecutorService, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f$0.m7998xad28ecdf(token, id2, task);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return taskContinueWithTask;
    }

    /* JADX INFO: renamed from: lambda$createRealtimeConnection$0$com-google-firebase-remoteconfig-internal-ConfigRealtimeHttpClient, reason: not valid java name */
    /* synthetic */ Task m7998xad28ecdf(Task task, Task task2, Task task3) throws Exception {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            task.isSuccessful();
            throw null;
        }
        if (!task.isSuccessful()) {
            Task taskForException = Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task.getException()));
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 != 0) {
                return taskForException;
            }
            throw null;
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task2.getException()));
        }
        try {
            URLConnection uRLConnectionOpenConnection = getUrl().openConnection();
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            setRequestParams(httpURLConnection, (String) task2.getResult(), ((InstallationTokenResult) task.getResult()).getToken());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e2) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e2));
        }
    }

    public void startHttpConnection() throws Throwable {
        Object[] objArr;
        char c = 2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int mode = View.MeasureSpec.getMode(0) + 876;
            int iKeyCodeFromString = 10 - KeyEvent.keyCodeFromString("");
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b2, bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, mode, iKeyCodeFromString, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{51713, 21327, 7816, 51808, 10948, 51062, 13890, 38835, 39730, 46741, 25830, 9355, 26838, 25651, 54720, 29994, 15980, 56151, 574, 39864, 36636, 35531, 28922, 10462, 23726, 30727}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{51029, 37008, 50754, 50992, 460, 1195, 61069, 48313, 38522, 30022, 48172, 4095, 25992, 43006, 3400, 24069, 13096, 6294, 56037}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 876;
            int iAxisFromString = 9 - MotionEvent.axisFromString("");
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b4, (byte) (b4 | 37), b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iNormalizeMetaState, iAxisFromString, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                int iMyPid = (Process.myPid() >> 22) + 876;
                int i4 = 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                a(b6, (byte) (b6 | 89), b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, iMyPid, i4, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i5 = ~((-940516086) | elapsedCpuTime);
            int i6 = 43344348 + ((805830688 | i5) * (-280)) + ((i5 | (~(900205856 | elapsedCpuTime))) * 140);
            int i7 = ~((-134685398) | elapsedCpuTime);
            int i8 = ~elapsedCpuTime;
            int i9 = i6 + (((~(i8 | 1034891253)) | i7 | (~((-805830689) | i8))) * 140) + 1684155892;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{52760, 32126, 59756, 52857, 54944, 59719, 49574, 27607, 40747, 39076, 37634, 55535, 27841, 18945, 8826, 35123, 14925, 62838, 62938, 26576, 35614, 42192, 34566, 54444, 22656, 22069, 22116, 34068, 9809, 357}, Color.argb(0, 0, 0, 0) + 1, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{21638, 62119, 21525, 21733, 35917, 26245, 31945, 12602, 1471, 6010, 11883, 33389, 63054, 50648, 40735, 54169, 41201, 31405, 18595, 15677, 4505, 11022}, 1 - (Process.myTid() >> 22), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
                    TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                    int i13 = i12 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{15547, 36325, 12122, 15569, 54065, 6611, 1922, 28245, 28105, 26682, 21809, 56638, 40548, 47812, 58479, 36085, 51420, 1530, 13309, 25157}, 1 - ExpandableListView.getPackedPositionType(0L), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{63082, 45049, 21150, 62979, 19894, 15306, 31317, 61661, 42818, 18979, 10464, 17326, 21658, 39063, 39307, 4707, 573, 10237, 20024, 64714}, View.resolveSizeAndState(0, 0, 0) + 1, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1684155892};
                byte b7 = (byte) 0;
                byte b8 = (byte) (b7 + 1);
                Object[] objArr13 = new Object[1];
                d(b7, b8, (byte) (b8 - 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b9 = (byte) ($$e & 7);
                byte b10 = (byte) (b9 - 1);
                Object[] objArr14 = new Object[1];
                d(b9, b10, (byte) (b10 + 1), objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                        int keyRepeatDelay = 876 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iResolveSize = View.resolveSize(0, 0) + 10;
                        byte b11 = $$a[7];
                        byte b12 = b11;
                        Object[] objArr15 = new Object[1];
                        a(b12, (byte) (b12 | 89), b11, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, keyRepeatDelay, iResolveSize, 2012931276, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(new char[]{51713, 21327, 7816, 51808, 10948, 51062, 13890, 38835, 39730, 46741, 25830, 9355, 26838, 25651, 54720, 29994, 15980, 56151, 574, 39864, 36636, 35531, 28922, 10462, 23726, 30727}, -Process.getGidForName(""), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(new char[]{51029, 37008, 50754, 50992, 460, 1195, 61069, 48313, 38522, 30022, 48172, 4095, 25992, 43006, 3400, 24069, 13096, 6294, 56037}, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c4 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int iArgb = 876 - Color.argb(0, 0, 0, 0);
                            int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            byte b13 = $$a[7];
                            byte b14 = b13;
                            Object[] objArr18 = new Object[1];
                            a(b14, (byte) (b14 | 37), b13, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, iArgb, iIndexOf, 2012020043, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                            int mirror = 924 - AndroidCharacter.getMirror('0');
                            int modifierMetaStateMask = 9 - ((byte) KeyEvent.getModifierMetaStateMask());
                            byte[] bArr2 = $$a;
                            byte b15 = bArr2[7];
                            Object[] objArr19 = new Object[1];
                            a(b15, b15, bArr2[5], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(capsMode, mirror, modifierMetaStateMask, -1650998592, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i14 = ((int[]) objArr[c])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 != i14) {
            throw new RuntimeException(String.valueOf(i15));
        }
        int i16 = ((int[]) objArr[1])[0];
        Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iNextInt = new Random().nextInt();
        int i17 = ~iNextInt;
        int i18 = i16 + 810373284 + (((~((-479609915) | i17)) | 479477770) * 184) + ((iNextInt | (-520052288)) * (-184)) + ((~((-519920144) | i17)) * 184);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        Object obj = objArr20[1];
        ((int[]) obj)[0] = i20 ^ (i20 << 5);
        int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentbindingInflater1 = i21 % 128;
        int i22 = i21 % 2;
        int i23 = ((int[]) obj)[0];
        int i24 = i23 * i23;
        int i25 = -(1994757803 * i23);
        int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
        int i27 = -(i23 * 680245173);
        int i28 = ((i26 & i27) + (i27 | i26)) - (-1647290624);
        int i29 = ((i28 >> 17) - 65535) / 32768;
        int i30 = (i29 ^ 1) + ((i29 & 1) << 1);
        int i31 = (i28 ^ i30) + ((i30 & i28) << 1);
        int i32 = i28 >> 18;
        int i33 = ((i32 ^ (-32767)) + ((i32 & (-32767)) << 1)) / 16384;
        int i34 = -(i31 ^ (((i33 | 1) << 1) - (i33 ^ 1)));
        int i35 = (i34 ^ 2) + ((i34 & 2) << 1);
        int i36 = i35 >> 20;
        int i37 = ((i36 ^ (-8191)) + ((i36 & (-8191)) << 1)) / 4096;
        int i38 = ((i37 | 1) << 1) - (i37 ^ 1);
        makeRealtimeHttpConnection(((long) (1695600 / (((-((i38 ^ 1) + ((i38 & 1) << 1))) & i35) * 1884))) - 450);
        int i39 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        TuitionPaymentFragmentbindingInflater1 = i39 % 128;
        if (i39 % 2 == 0) {
            int i40 = 60 / 0;
        }
    }

    public void retryHttpConnectionWhenBackoffEnds() {
        synchronized (this) {
            makeRealtimeHttpConnection(Math.max(0L, this.sharedPrefsClient.getRealtimeBackoffMetadata().getBackoffEndTime().getTime() - new Date(this.clock.currentTimeMillis()).getTime()));
        }
    }

    private void makeRealtimeHttpConnection(long j) {
        synchronized (this) {
            if (canMakeHttpStreamConnection()) {
                int i = this.httpRetriesRemaining;
                if (i > 0) {
                    this.httpRetriesRemaining = i - 1;
                    this.scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ConfigRealtimeHttpClient.this.beginRealtimeHttpStream();
                        }
                    }, j, TimeUnit.MILLISECONDS);
                } else if (!this.isInBackground) {
                    propagateErrors(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        }
    }

    public void setIsInBackground(boolean z) {
        HttpURLConnection httpURLConnection;
        synchronized (this.backgroundLock) {
            this.isInBackground = z;
            ConfigAutoFetch configAutoFetch = this.configAutoFetch;
            if (configAutoFetch != null) {
                configAutoFetch.setIsInBackground(z);
            }
            if (Build.VERSION.SDK_INT >= 26 && z && (httpURLConnection = this.httpURLConnection) != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    private void resetRetryCount() {
        synchronized (this) {
            this.httpRetriesRemaining = 8;
        }
    }

    private boolean checkAndSetHttpConnectionFlagIfNotRunning() {
        boolean zCanMakeHttpStreamConnection;
        synchronized (this) {
            zCanMakeHttpStreamConnection = canMakeHttpStreamConnection();
            if (zCanMakeHttpStreamConnection) {
                setIsHttpConnectionRunning(true);
            }
        }
        return zCanMakeHttpStreamConnection;
    }

    private void setIsHttpConnectionRunning(boolean z) {
        synchronized (this) {
            this.isHttpConnectionRunning = z;
        }
    }

    public ConfigAutoFetch startAutoFetch(HttpURLConnection httpURLConnection) {
        ConfigAutoFetch configAutoFetch;
        synchronized (this) {
            configAutoFetch = new ConfigAutoFetch(httpURLConnection, this.configFetchHandler, this.activatedCache, this.listeners, new ConfigUpdateListener() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.2
                @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
                public void onUpdate(ConfigUpdate configUpdate) {
                }

                @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
                public void onError(FirebaseRemoteConfigException firebaseRemoteConfigException) {
                    ConfigRealtimeHttpClient.access$000(ConfigRealtimeHttpClient.this);
                    ConfigRealtimeHttpClient.access$100(ConfigRealtimeHttpClient.this, firebaseRemoteConfigException);
                }
            }, this.scheduledExecutorService);
        }
        return configAutoFetch;
    }

    private String parseForbiddenErrorResponseMessage(InputStream inputStream) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                int i2 = TuitionPaymentFragmentbindingInflater1 + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                if (i2 % 2 != 0) {
                    sb.append(line);
                    int i3 = 36 / 0;
                } else {
                    sb.append(line);
                }
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        String string = sb.toString();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public void beginRealtimeHttpStream() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (checkAndSetHttpConnectionFlagIfNotRunning()) {
            Object obj = null;
            if (new Date(this.clock.currentTimeMillis()).before(this.sharedPrefsClient.getRealtimeBackoffMetadata().getBackoffEndTime())) {
                retryHttpConnectionWhenBackoffEnds();
                int i4 = TuitionPaymentFragmentbindingInflater1 + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                return;
            }
            final Task<HttpURLConnection> taskCreateRealtimeConnection = createRealtimeConnection();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{taskCreateRealtimeConnection}).continueWith(this.scheduledExecutorService, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return this.f$0.m7997x5fb1dc1(taskCreateRealtimeConnection, task);
                }
            });
            int i5 = TuitionPaymentFragmentbindingInflater1 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #3 {all -> 0x0157, blocks: (B:8:0x002e, B:10:0x0034, B:42:0x00d7, B:44:0x00db), top: B:95:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Code duplicated, block: B:66:0x014b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0167  */
    /* JADX WARN: Code duplicated, block: B:76:0x017a  */
    /* JADX WARN: Code duplicated, block: B:78:0x017d  */
    /* JADX WARN: Code duplicated, block: B:80:0x018d  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Number, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: lambda$beginRealtimeHttpStream$1$com-google-firebase-remoteconfig-internal-ConfigRealtimeHttpClient, reason: not valid java name */
    /* synthetic */ Task m7997x5fb1dc1(Task task, Task task2) throws Exception {
        Throwable th;
        InputStream inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Throwable th2;
        ?? r7;
        Integer numValueOf;
        String forbiddenErrorResponseMessage;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        int i;
        int i2 = 2 % 2;
        boolean z = false;
        boolean z2 = true;
        InputStream errorStream = null;
        try {
            if (!task.isSuccessful()) {
                throw new IOException(task.getException());
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) task.getResult();
            this.httpURLConnection = httpURLConnection;
            inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(httpURLConnection);
            try {
                errorStream = this.httpURLConnection.getErrorStream();
                try {
                    numValueOf = Integer.valueOf(ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.httpURLConnection));
                    try {
                        try {
                            if (numValueOf.intValue() == 200) {
                                resetRetryCount();
                                this.sharedPrefsClient.resetRealtimeBackoff();
                                ConfigAutoFetch configAutoFetchStartAutoFetch = startAutoFetch(this.httpURLConnection);
                                this.configAutoFetch = configAutoFetchStartAutoFetch;
                                configAutoFetchStartAutoFetch.listenForNotifications();
                            }
                            closeRealtimeHttpConnection(inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3, errorStream);
                            setIsHttpConnectionRunning(false);
                            if (this.isInBackground || (numValueOf != null && !isStatusCodeRetryable(numValueOf.intValue()))) {
                                z2 = false;
                            }
                            if (z2) {
                                updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(this.clock.currentTimeMillis()));
                            }
                            if (z2 || numValueOf.intValue() == 200) {
                                retryHttpConnectionWhenBackoffEnds();
                            } else {
                                String forbiddenErrorResponseMessage2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                if (numValueOf.intValue() == 403) {
                                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                                    TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        forbiddenErrorResponseMessage2 = parseForbiddenErrorResponseMessage(this.httpURLConnection.getErrorStream());
                                        int i4 = 26 / 0;
                                    } else {
                                        forbiddenErrorResponseMessage2 = parseForbiddenErrorResponseMessage(this.httpURLConnection.getErrorStream());
                                    }
                                }
                                firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(numValueOf.intValue(), forbiddenErrorResponseMessage2, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                                propagateErrors(firebaseRemoteConfigServerException);
                            }
                        } catch (IOException unused) {
                            if (this.isInBackground) {
                                resetRetryCount();
                            }
                            closeRealtimeHttpConnection(inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3, errorStream);
                            setIsHttpConnectionRunning(false);
                            if (!this.isInBackground) {
                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
                                TuitionPaymentFragmentbindingInflater1 = i % 128;
                                if (i % 2 == 0) {
                                    if (numValueOf != null) {
                                    }
                                } else if (numValueOf != null) {
                                    z = true;
                                }
                                if (!(!isStatusCodeRetryable(numValueOf.intValue()))) {
                                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
                                    TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                                    int i6 = i5 % 2;
                                    z = true;
                                }
                                retryHttpConnectionWhenBackoffEnds();
                                this.httpURLConnection = null;
                                this.configAutoFetch = null;
                                return Tasks.forResult(null);
                            }
                            if (z) {
                                updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(this.clock.currentTimeMillis()));
                            }
                            if (!z || numValueOf.intValue() == 200) {
                                retryHttpConnectionWhenBackoffEnds();
                            } else {
                                String forbiddenErrorResponseMessage3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                if (numValueOf.intValue() == 403) {
                                    forbiddenErrorResponseMessage3 = parseForbiddenErrorResponseMessage(this.httpURLConnection.getErrorStream());
                                }
                                firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(numValueOf.intValue(), forbiddenErrorResponseMessage3, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                            }
                            this.httpURLConnection = null;
                            this.configAutoFetch = null;
                            return Tasks.forResult(null);
                        }
                    } catch (Throwable th3) {
                        errorStream = inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        th2 = th3;
                        r7 = numValueOf;
                        closeRealtimeHttpConnection(errorStream, errorStream);
                        setIsHttpConnectionRunning(false);
                        if (!this.isInBackground) {
                            if (r7 != 0) {
                                int i7 = TuitionPaymentFragmentbindingInflater1 + 9;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                                int i8 = i7 % 2;
                                if (isStatusCodeRetryable(r7.intValue())) {
                                    z = true;
                                }
                            } else {
                                z = true;
                            }
                        }
                        if (z) {
                            updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(this.clock.currentTimeMillis()));
                        }
                        if (!z || r7.intValue() == 200) {
                            retryHttpConnectionWhenBackoffEnds();
                            throw th2;
                        }
                        int i9 = TuitionPaymentFragmentbindingInflater1 + 125;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                        if (i9 % 2 != 0) {
                            forbiddenErrorResponseMessage = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r7);
                            if (r7.intValue() == 25953) {
                                forbiddenErrorResponseMessage = parseForbiddenErrorResponseMessage(this.httpURLConnection.getErrorStream());
                            }
                        } else {
                            forbiddenErrorResponseMessage = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r7);
                            if (r7.intValue() == 403) {
                                forbiddenErrorResponseMessage = parseForbiddenErrorResponseMessage(this.httpURLConnection.getErrorStream());
                            }
                        }
                        propagateErrors(new FirebaseRemoteConfigServerException(r7.intValue(), forbiddenErrorResponseMessage, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                        throw th2;
                    }
                } catch (IOException unused2) {
                    numValueOf = null;
                } catch (Throwable th4) {
                    errorStream = inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    th2 = th4;
                    r7 = 0;
                    closeRealtimeHttpConnection(errorStream, errorStream);
                    setIsHttpConnectionRunning(false);
                    if (!this.isInBackground) {
                        if (r7 != 0) {
                            int i10 = TuitionPaymentFragmentbindingInflater1 + 9;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                            int i11 = i10 % 2;
                            if (isStatusCodeRetryable(r7.intValue())) {
                                z = true;
                            }
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(this.clock.currentTimeMillis()));
                    }
                    if (z) {
                    }
                    retryHttpConnectionWhenBackoffEnds();
                    throw th2;
                }
            } catch (IOException unused3) {
                errorStream = null;
                numValueOf = null;
                if (this.isInBackground) {
                    resetRetryCount();
                }
                closeRealtimeHttpConnection(inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3, errorStream);
                setIsHttpConnectionRunning(false);
                if (!this.isInBackground) {
                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
                    TuitionPaymentFragmentbindingInflater1 = i % 128;
                    if (i % 2 == 0) {
                        if (numValueOf != null) {
                        }
                    } else if (numValueOf != null) {
                        z = true;
                    }
                    if (!(!isStatusCodeRetryable(numValueOf.intValue()))) {
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
                        TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                        int i13 = i12 % 2;
                        z = true;
                    }
                    retryHttpConnectionWhenBackoffEnds();
                    this.httpURLConnection = null;
                    this.configAutoFetch = null;
                    return Tasks.forResult(null);
                }
                if (z) {
                    updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(this.clock.currentTimeMillis()));
                }
                if (z) {
                }
                retryHttpConnectionWhenBackoffEnds();
                this.httpURLConnection = null;
                this.configAutoFetch = null;
                return Tasks.forResult(null);
            } catch (Throwable th5) {
                th = th5;
                errorStream = inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                th2 = th;
                r7 = errorStream;
                closeRealtimeHttpConnection(errorStream, errorStream);
                setIsHttpConnectionRunning(false);
                if (!this.isInBackground) {
                    if (r7 != 0) {
                        int i14 = TuitionPaymentFragmentbindingInflater1 + 9;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                        int i15 = i14 % 2;
                        if (isStatusCodeRetryable(r7.intValue())) {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(this.clock.currentTimeMillis()));
                }
                if (z) {
                }
                retryHttpConnectionWhenBackoffEnds();
                throw th2;
            }
            this.httpURLConnection = null;
            this.configAutoFetch = null;
            return Tasks.forResult(null);
        } catch (IOException unused4) {
            inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private void closeHttpConnectionInputStream(InputStream inputStream) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        if (inputStream != null) {
            int i5 = i3 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    inputStream.close();
                } else {
                    inputStream.close();
                    int i6 = 75 / 0;
                }
            } catch (IOException unused) {
            }
        }
    }

    public void closeRealtimeHttpConnection(InputStream inputStream, InputStream inputStream2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 119;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        HttpURLConnection httpURLConnection = this.httpURLConnection;
        if (httpURLConnection != null) {
            int i5 = i3 + 53;
            int i6 = i5 % 128;
            TuitionPaymentFragmentbindingInflater1 = i6;
            Object obj = null;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (!this.isInBackground) {
                int i7 = i6 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                if (i7 % 2 != 0) {
                    httpURLConnection.disconnect();
                    obj.hashCode();
                    throw null;
                }
                httpURLConnection.disconnect();
            }
        }
        closeHttpConnectionInputStream(inputStream);
        closeHttpConnectionInputStream(inputStream2);
    }

    private boolean isStatusCodeRetryable(int i) {
        int i2 = 2 % 2;
        if (i == 408) {
            return true;
        }
        int i3 = TuitionPaymentFragmentbindingInflater1 + 59;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4;
        int i5 = i3 % 2;
        if (i == 429 || i == 502) {
            return true;
        }
        int i6 = i4 + 103;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        if (i == 503) {
            return true;
        }
        int i8 = i4 + 11;
        TuitionPaymentFragmentbindingInflater1 = i8 % 128;
        int i9 = i8 % 2;
        return i == 504;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        b = -674241277979296207L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, short r8) {
        /*
            int r8 = r8 * 4
            int r0 = r8 + 1
            int r7 = r7 * 3
            int r7 = r7 + 107
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r1 = com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r7 = r7 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.$$g(int, short, short):java.lang.String");
    }
}
