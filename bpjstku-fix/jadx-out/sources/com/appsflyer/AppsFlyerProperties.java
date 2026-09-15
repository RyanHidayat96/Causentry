package com.appsflyer;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.appsflyer.internal.AFc1qSDK;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppsFlyerProperties {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    public static final String AF_STORE_FROM_API = "api_store_value";
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_OAID = "collectOAID";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_NETWORK_DATA = "disableCollectNetworkData";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String DPM = "disableProxy";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String ENABLE_TCF_DATA_COLLECTION = "enableTCFDataCollection";
    public static final String EXTENSION = "sdkExtension";
    public static final String HTTP_CACHE = "http_cache";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String NEW_REFERRER_SENT = "newGPReferrerSent";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String ONELINK_VERSION = "onelinkVersion";
    public static final String USER_EMAILS = "userEmails";
    public static AppsFlyerProperties instance;
    public boolean getCurrencyIso4217Code;
    public String getMediationNetwork;
    private static final byte[] $$d = {109, 7, 114, -90, -8, -25, 40, -41, -28, 4, 37, -8, -41, -32, -8, -17, 3, -29, -11, -7, 3, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
    private static final int $$e = 28;
    private static final byte[] $$a = {109, 48, -62, 38, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 201;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long b = -1186766190744076320L;
    private final Map<String, Object> getRevenue = new HashMap();
    private boolean AFAdRevenueData = false;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r0 = com.appsflyer.AppsFlyerProperties.$$a
            int r8 = r8 * 15
            int r1 = r8 + 38
            int r6 = r6 * 4
            int r6 = r6 + 84
            byte[] r1 = new byte[r1]
            int r8 = r8 + 37
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            int r7 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerProperties.a(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.appsflyer.AppsFlyerProperties.$$d
            int r8 = r8 + 4
            int r7 = r7 * 35
            int r1 = 53 - r7
            int r6 = r6 * 19
            int r6 = r6 + 84
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2e
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2e:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-10)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerProperties.d(int, byte, int, java.lang.Object[]):void");
    }

    public static AppsFlyerProperties getInstance() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (instance == null) {
            instance = new AppsFlyerProperties();
        }
        AppsFlyerProperties appsFlyerProperties = instance;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return appsFlyerProperties;
        }
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 105;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - Drawable.resolveOpacity(0, 0)), 2624 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.alpha(0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() / (b + 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39421 - Process.getGidForName("")), 481 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - View.combineMeasuredStates(0, 0)), 2624 - (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionChild(0L) + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (b ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 39422), 481 - TextUtils.getOffsetAfter("", 0), 37 - (ViewConfiguration.getPressedStateDuration() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i6 = $10 + 103;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $11 + 9;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                try {
                    Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 39423), 529 - AndroidCharacter.getMirror('0'), 37 - TextUtils.indexOf("", ""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    throw null;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 39422), (ViewConfiguration.getWindowTouchSlop() >> 8) + 481, 37 - (KeyEvent.getMaxKeyCode() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    public void remove(String str) {
        synchronized (this) {
            this.getRevenue.remove(str);
        }
    }

    public void set(String str, String str2) {
        synchronized (this) {
            this.getRevenue.put(str, str2);
        }
    }

    public void set(String str, String[] strArr) {
        synchronized (this) {
            this.getRevenue.put(str, strArr);
        }
    }

    public void set(String str, int i) {
        synchronized (this) {
            this.getRevenue.put(str, Integer.toString(i));
        }
    }

    public void set(String str, long j) {
        synchronized (this) {
            this.getRevenue.put(str, Long.toString(j));
        }
    }

    public void set(String str, boolean z) {
        synchronized (this) {
            this.getRevenue.put(str, Boolean.toString(z));
        }
    }

    public void setCustomData(String str) {
        synchronized (this) {
            this.getRevenue.put(ADDITIONAL_CUSTOM_DATA, str);
        }
    }

    public void setUserEmails(String str) {
        synchronized (this) {
            this.getRevenue.put(USER_EMAILS, str);
        }
    }

    public String getString(String str) {
        String str2;
        synchronized (this) {
            str2 = (String) this.getRevenue.get(str);
        }
        return str2;
    }

    public boolean getBoolean(String str, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String string = getString(str);
        if (string != null) {
            return Boolean.parseBoolean(string);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public int getLogLevel() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return getInt("logLevel", AFLogger.LogLevel.NONE.getLevel());
        }
        getInt("logLevel", AFLogger.LogLevel.NONE.getLevel());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getInt(String str, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            getString(str);
            obj.hashCode();
            throw null;
        }
        String string = getString(str);
        if (string != null) {
            return Integer.parseInt(string);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return i;
        }
        obj.hashCode();
        throw null;
    }

    public long getLong(String str, long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            getString(str);
            throw null;
        }
        String string = getString(str);
        if (string == null) {
            return j;
        }
        long j2 = Long.parseLong(string);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            return j2;
        }
        throw null;
    }

    public final boolean AFAdRevenueData() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.getCurrencyIso4217Code;
        int i5 = i2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);

        private final int getRevenue;

        EmailsCryptType(int i) {
            this.getRevenue = i;
        }

        public final int getValue() {
            return this.getRevenue;
        }
    }

    public String getReferrer(AFc1qSDK aFc1qSDK) {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (43042 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            int iAlpha = Color.alpha(0) + 3111;
            int i2 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b2, b2, bArr[5], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iAlpha, i2, -1272852037, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{54938, 24916, 47389, 61898, 2448, 16471, 38937, 53394, 26780, 41793, 64351, 13283, 19342, 33349, 55809, 4817, 43654, 58729, 15621, 30151, 36236, 50245}, 47040 - TextUtils.lastIndexOf("", '0'), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{54942, 53724, 55308, 50026, 52132, 62185, 64861, 58788, 60614, 38713, 40569, 34486, 33046, 34905, 45188}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1868, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "") + 43042);
            int iGreen = Color.green(0) + 3111;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 23;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            byte b4 = bArr2[5];
            Object[] objArr6 = new Object[1];
            a(b3, b4, b4, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iGreen, iLastIndexOf, -1269618118, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 43042);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 3111;
                int i5 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
                byte[] bArr3 = $$a;
                byte b5 = bArr3[7];
                Object[] objArr7 = new Object[1];
                a(b5, bArr3[40], b5, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maxKeyCode, iMakeMeasureSpec, i5, 154975793, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr8[2])[0];
            int i7 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i6};
            int[] iArr2 = {i7};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~iIdentityHashCode;
            int i9 = (-706191550) + ((iIdentityHashCode | 586114241) * (-859)) + (((~(iIdentityHashCode | (-44122178))) | (~(586114241 | i8))) * 859) + (((~((-1118917218) | i8)) | 1074795040) * 859) + 857035993;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{new int[1], iArr2, iArr, strArr};
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{54929, 44429, 8355, 42975, 14985, 45540, 13328, 35636, 3620, 34074, 6222, 40831, 5020, 38564, 28124, 57551}, (ViewConfiguration.getTouchSlop() >> 8) + 31511, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{54930, 916, 31880, 43444, 33443, 65445, 10445, 1487, 32491, 44025, 34022, 61930, 10812, 1819, 28677, 44347}, ((Process.getThreadPriority(0) + 20) >> 6) + 54539, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr11 = {null, Integer.valueOf(iIntValue), 0, 857035993};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[24];
                Object[] objArr12 = new Object[1];
                d(b6, b6, bArr4[54], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b7 = (byte) (bArr4[24] - 1);
                Object[] objArr13 = new Object[1];
                d(b7, b7, (byte) (-bArr4[25]), objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (43042 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int iGreen2 = 3111 - Color.green(0);
                    int i14 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21;
                    byte[] bArr5 = $$a;
                    byte b8 = bArr5[7];
                    Object[] objArr15 = new Object[1];
                    a(b8, bArr5[40], b8, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iGreen2, i14, 154975793, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new char[]{54938, 24916, 47389, 61898, 2448, 16471, 38937, 53394, 26780, 41793, 64351, 13283, 19342, 33349, 55809, 4817, 43654, 58729, 15621, 30151, 36236, 50245}, (-16730175) - Color.rgb(0, 0, 0), objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new char[]{54942, 53724, 55308, 50026, 52132, 62185, 64861, 58788, 60614, 38713, 40569, 34486, 33046, 34905, 45188}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1867, objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char defaultSize = (char) (43042 - View.getDefaultSize(0, 0));
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3111;
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
                        byte[] bArr6 = $$a;
                        byte b9 = bArr6[7];
                        byte b10 = bArr6[5];
                        Object[] objArr18 = new Object[1];
                        a(b9, b10, b10, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, scrollDefaultDelay, pressedStateDuration, -1269618118, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cBlue = (char) (Color.blue(0) + 43042);
                        int packedPositionGroup = 3111 - ExpandableListView.getPackedPositionGroup(0L);
                        int offsetAfter = 22 - TextUtils.getOffsetAfter("", 0);
                        byte[] bArr7 = $$a;
                        byte b11 = bArr7[7];
                        Object[] objArr19 = new Object[1];
                        a(b11, b11, bArr7[5], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, packedPositionGroup, offsetAfter, -1272852037, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr14;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 == i15) {
            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((int[]) objArr[0])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i22 = i19 + 1486959606 + (((~((~iIdentityHashCode2) | (-274604161))) | (~(1006596094 | iIdentityHashCode2))) * (-302)) + ((~((-274604161) | iIdentityHashCode2)) * (-604)) + (((~(iIdentityHashCode2 | 731991934)) | 33556570) * 302);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr2[0])[0] = i24 ^ (i24 << 5);
            objArr2 = new Object[]{new int[1], new int[]{i21}, new int[]{i20}, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            int i25 = ((int[]) objArr[0])[0];
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i28 = i25 + ((((~((-637256065) | iIdentityHashCode3)) | 5963776) * (-283)) - 902187230) + ((~(iIdentityHashCode3 | (-631292289))) * 283);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[0])[0] = i30 ^ (i30 << 5);
            objArr2 = new Object[]{new int[1], new int[]{i27}, new int[]{i26}, strArr4};
        }
        String str2 = this.getMediationNetwork;
        if (str2 != null) {
            int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i31 % 128;
            if (i31 % 2 == 0) {
                return str2;
            }
            throw null;
        }
        int i32 = ((int[]) objArr2[0])[0];
        int i33 = i32 * i32;
        int i34 = -(1044794022 * i32);
        int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
        int i36 = -(i32 * 490509086);
        int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
        int i38 = ((i37 | (-724893820)) << 1) - ((-724893820) ^ i37);
        int i39 = i38 >> 20;
        int i40 = ((i39 ^ (-8191)) + ((i39 & (-8191)) << 1)) / 4096;
        int i41 = (i38 - (~((i40 ^ 1) + ((i40 & 1) << 1)))) - 1;
        int i42 = i38 >> 22;
        int i43 = ((i42 & (-2047)) + (i42 | (-2047))) / 1024;
        int i44 = -(i41 ^ (((i43 | 1) << 1) - (i43 ^ 1)));
        int i45 = ((i44 | 8) << 1) - (i44 ^ 8);
        int i46 = i45 >> 16;
        int i47 = (((-131071) & i46) + (i46 | (-131071))) / 65536;
        int i48 = (i47 & 1) + (i47 | 1);
        if (getString("26,13,2,AF_REFERRER".substring(90176 / (((-((i48 ^ 1) + ((i48 & 1) << 1))) & i45) * 1409))) == null) {
            return aFc1qSDK.AFAdRevenueData("referrer", (String) null);
        }
        String string = getString("AF_REFERRER");
        int i49 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i49 % 128;
        if (i49 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public boolean isEnableLog() {
        int i = 2 % 2;
        if (getLogLevel() <= AFLogger.LogLevel.NONE.getLevel()) {
            return false;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        boolean z = i3 % 2 == 0;
        int i4 = i2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isLogsDisabledCompletely() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        return getBoolean(DISABLE_LOGS_COMPLETELY, i2 % 2 != 0);
    }

    public boolean isOtherSdkStringDisabled() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        return getBoolean(DISABLE_OTHER_SDK, i2 % 2 == 0);
    }

    public void saveProperties(AFc1qSDK aFc1qSDK) {
        synchronized (this) {
            this.getRevenue.remove("AppsFlyerKey");
            aFc1qSDK.getMediationNetwork("savedProperties", new JSONObject(this.getRevenue).toString());
        }
    }

    public void loadProperties(AFc1qSDK aFc1qSDK) {
        synchronized (this) {
            if (getCurrencyIso4217Code()) {
                return;
            }
            String strAFAdRevenueData = aFc1qSDK.AFAdRevenueData("savedProperties", (String) null);
            if (strAFAdRevenueData != null) {
                AFLogger.afDebugLog("Loading properties..");
                try {
                    JSONObject jSONObject = new JSONObject(strAFAdRevenueData);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (this.getRevenue.get(next) == null) {
                            this.getRevenue.put(next, jSONObject.getString(next));
                        }
                    }
                    String[] strArr = {"AppsFlyerKey", "custom_host", "custom_host_prefix", "advertiserIdEnabled", "advertiserId"};
                    for (int i = 0; i < 5; i++) {
                        this.getRevenue.remove(strArr[i]);
                    }
                    saveProperties(aFc1qSDK);
                    this.AFAdRevenueData = true;
                } catch (JSONException e2) {
                    AFLogger.afErrorLog("Failed loading properties", e2);
                }
                StringBuilder sb = new StringBuilder("Done loading properties: ");
                sb.append(this.AFAdRevenueData);
                AFLogger.afDebugLog(sb.toString());
            }
        }
    }

    private boolean getCurrencyIso4217Code() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        boolean z = this.AFAdRevenueData;
        int i5 = i3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }
}
