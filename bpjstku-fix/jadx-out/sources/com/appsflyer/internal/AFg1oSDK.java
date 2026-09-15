package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.tls.internal.der.DerHeader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1oSDK implements AFg1qSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean AFInAppEventParameterName = false;
    private static boolean AFInAppEventType = false;
    private static int AFKeystoreWrapper = 0;
    private static boolean TuitionPaymentFragmentbindingInflater1 = false;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
    private static int asBinder = 0;
    private static boolean b = false;
    private static int d = 1;
    private static char[] registerClient;
    private static int w;
    private final AFj1lSDK AFAdRevenueData;
    private final Lazy AFLogger;
    private final AFh1vSDK areAllFieldsValid;
    private final AFi1tSDK component1;
    private final AFg1vSDK component2;
    private final AFc1pSDK component3;
    private final AFc1qSDK component4;
    private final AFc1kSDK copy;
    private final Lazy copydefault;
    private final AFf1gSDK equals;
    private final String getCurrencyIso4217Code;
    private final AFg1uSDK getMediationNetwork;
    private final Context getMonetizationNetwork;
    private final AFi1lSDK getRevenue;
    private final AFg1xSDK hashCode;
    private final AFc1iSDK toString;
    private static final byte[] $$c = {31, -3, -46, 11};
    private static final int $$f = 70;
    private static int $12 = 0;
    private static int $13 = 1;
    private static final byte[] $$d = {123, -2, -101, -104, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 195;
    private static final byte[] $$a = {55, -64, 35, -71, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 36, 19, 4, 10, -8, 8, 0, -22, 22, 15, -11, 8, 0, 15, 0, 17, -34, 19, 4, 10, -8, 8, 0, -26, 39, -6, 11};
    private static final int $$b = 138;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f372a = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    static {
        asBinder = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        registerClient = new char[]{8582, 8581, 8594, 8595, 8592, 8312, 8589, 8593, 8606, 8579, 8580, 8288, 8577, 8578, 8576};
        AFKeystoreWrapper = -771284948;
        AFInAppEventParameterName = true;
        AFInAppEventType = true;
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private final String AFInAppEventType() throws PackageManager.NameNotFoundException {
        Object mediationNetwork;
        int i = 2 % 2;
        int i2 = f372a + 97;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            objArr[1] = this;
            mediationNetwork = getMediationNetwork(objArr, -1713193940, 1713193943, System.identityHashCode(this));
        } else {
            mediationNetwork = getMediationNetwork(new Object[]{this}, -1713193940, 1713193943, System.identityHashCode(this));
        }
        String str = (String) mediationNetwork;
        int i3 = g + 43;
        f372a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private void AFLogger(Map<String, Object> map) throws PackageManager.NameNotFoundException {
        int i = 2 % 2;
        int i2 = f372a + 103;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            getMediationNetwork(new Object[]{this, map}, -140518465, 140518471, System.identityHashCode(this));
            return;
        }
        Object[] objArr = new Object[5];
        objArr[1] = this;
        objArr[1] = map;
        getMediationNetwork(objArr, -140518465, 140518471, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.appsflyer.internal.AFg1oSDK.$$a
            int r7 = r7 * 19
            int r7 = r7 + 14
            int r8 = r8 * 32
            int r8 = 35 - r8
            int r9 = r9 * 6
            int r9 = 103 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2f
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2f:
            int r3 = r3 + r8
            int r8 = r3 + (-2)
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.c(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r8 = 103 - r8
            int r9 = r9 * 52
            int r9 = r9 + 1
            byte[] r0 = com.appsflyer.internal.AFg1oSDK.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r5 = r2
            goto L2c
        L12:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L16:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2c:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.f(byte, int, byte, java.lang.Object[]):void");
    }

    private static String getMediationNetwork(File file, String str) {
        int i = 2 % 2;
        int i2 = g + 15;
        f372a = i2 % 128;
        int i3 = i2 % 2;
        String str2 = (String) getMediationNetwork(new Object[]{file, str}, -2094417185, 2094417192, (int) System.currentTimeMillis());
        int i4 = g + 41;
        f372a = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    private static boolean getMediationNetwork(File file) {
        int i = 2 % 2;
        int i2 = g + 23;
        f372a = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {file};
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) (i3 != 0 ? getMediationNetwork(objArr, 1334456290, -1334456289, (int) jCurrentTimeMillis) : getMediationNetwork(objArr, 1334456290, -1334456289, (int) jCurrentTimeMillis))).booleanValue();
        int i4 = g + 21;
        f372a = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String getMonetizationNetwork(AFc1qSDK aFc1qSDK, String str) throws PackageManager.NameNotFoundException {
        Object mediationNetwork;
        int i = 2 % 2;
        int i2 = f372a + 7;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[4];
            objArr[0] = aFc1qSDK;
            objArr[1] = str;
            mediationNetwork = getMediationNetwork(objArr, 381318279, -381318268, (int) System.currentTimeMillis());
        } else {
            mediationNetwork = getMediationNetwork(new Object[]{aFc1qSDK, str}, 381318279, -381318268, (int) System.currentTimeMillis());
        }
        String str2 = (String) mediationNetwork;
        int i3 = g + 21;
        f372a = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    private final AppsFlyerProperties getRevenue() {
        int i = 2 % 2;
        int i2 = g + 121;
        f372a = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this));
        int i4 = g + 3;
        f372a = i4 % 128;
        int i5 = i4 % 2;
        return appsFlyerProperties;
    }

    private void getRevenue(Map<String, Object> map, String str) throws PackageManager.NameNotFoundException {
        int i = 2 % 2;
        int i2 = f372a + 119;
        g = i2 % 128;
        int i3 = i2 % 2;
        getMediationNetwork(new Object[]{this, map, str}, 1763970144, -1763970135, System.identityHashCode(this));
        int i4 = f372a + 71;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void i(Map<String, Object> map) throws PackageManager.NameNotFoundException {
        int i = 2 % 2;
        int i2 = f372a + 25;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[2];
            objArr[0] = this;
            objArr[0] = map;
            getMediationNetwork(objArr, -1753918152, 1753918160, System.identityHashCode(this));
        } else {
            getMediationNetwork(new Object[]{this, map}, -1753918152, 1753918160, System.identityHashCode(this));
        }
        int i3 = g + 59;
        f372a = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static PackageInfo s_(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        Object mediationNetwork;
        int i = 2 % 2;
        int i2 = g + 81;
        f372a = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[3];
            objArr[0] = packageManager;
            objArr[0] = str;
            mediationNetwork = getMediationNetwork(objArr, 1014234820, -1014234818, (int) System.currentTimeMillis());
        } else {
            mediationNetwork = getMediationNetwork(new Object[]{packageManager, str}, 1014234820, -1014234818, (int) System.currentTimeMillis());
        }
        PackageInfo packageInfo = (PackageInfo) mediationNetwork;
        int i3 = f372a + 77;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            return packageInfo;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final long AFAdRevenueData() {
        int i = 2 % 2;
        int i2 = f372a + 59;
        g = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue = ((Long) getMediationNetwork(new Object[]{this}, 1094427935, -1094427925, System.identityHashCode(this))).longValue();
        int i4 = f372a + 83;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return jLongValue;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void AFAdRevenueData(AFh1rSDK aFh1rSDK) throws PackageManager.NameNotFoundException {
        int i = 2 % 2;
        int i2 = g + 97;
        f372a = i2 % 128;
        int i3 = i2 % 2;
        getMediationNetwork(new Object[]{this, aFh1rSDK}, 840096269, -840096265, System.identityHashCode(this));
        int i4 = g + 31;
        f372a = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void AFAdRevenueData(Map<String, Object> map) throws PackageManager.NameNotFoundException {
        int i = 2 % 2;
        int i2 = f372a + 1;
        g = i2 % 128;
        int i3 = i2 % 2;
        getMediationNetwork(new Object[]{this, map}, -1412383531, 1412383531, System.identityHashCode(this));
        int i4 = g + 93;
        f372a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getRevenue(Map<String, Object> map) throws PackageManager.NameNotFoundException {
        int i = 2 % 2;
        int i2 = f372a + 105;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            getMediationNetwork(new Object[]{map, this}, -1435534785, 1435534790, System.identityHashCode(this));
        } else {
            getMediationNetwork(new Object[]{this, map}, -1435534785, 1435534790, System.identityHashCode(this));
        }
        int i3 = f372a + 31;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01de, code lost:
    
        if (r7.exists() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01eb, code lost:
    
        if (r7.exists() == true) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ef, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object getMediationNetwork(java.lang.Object[] r7, int r8, int r9, int r10) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.getMediationNetwork(java.lang.Object[], int, int, int):java.lang.Object");
    }

    private static void h(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = -1;
        int i5 = 0;
        if (cArr2 != null) {
            int i6 = $13 + 113;
            $12 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $13 + 121;
                $12 = i9 % 128;
                int i10 = i9 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(cArr2[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i4;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 31339), TextUtils.getOffsetBefore("", i5) + 2994, 17 - (ViewConfiguration.getLongPressTimeout() >> 16), 1182129903, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 2;
                    i4 = -1;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        float f = 0.0f;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.alpha(0) + 43325), Color.red(0) + 253, 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i11 = 1687675375;
        if (TuitionPaymentFragmentbindingInflater1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33602 - View.resolveSize(0, 0)), 3085 - Gravity.getAbsoluteGravity(0, 0), 25 - ((byte) KeyEvent.getModifierMetaStateMask()), -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (b) {
            int i12 = $12 + 103;
            $13 = i12 % 128;
            int i13 = i12 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                try {
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i11);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33603 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3085, TextUtils.lastIndexOf("", '0', 0, 0) + 27, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    i11 = 1687675375;
                    f = 0.0f;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i14 = 0;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i15 = $12 + 43;
            $13 = i15 % 128;
            int i16 = i15 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            i14 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        }
    }

    public AFg1oSDK(String str, Context context, AFi1lSDK aFi1lSDK, AFg1uSDK aFg1uSDK, AFj1lSDK aFj1lSDK, AFg1vSDK aFg1vSDK, AFh1vSDK aFh1vSDK, AFc1qSDK aFc1qSDK, AFc1pSDK aFc1pSDK, AFi1tSDK aFi1tSDK, AFf1gSDK aFf1gSDK, AFc1iSDK aFc1iSDK, AFg1xSDK aFg1xSDK, AFc1kSDK aFc1kSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1uSDK, "");
        Intrinsics.checkNotNullParameter(aFj1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFi1tSDK, "");
        Intrinsics.checkNotNullParameter(aFf1gSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFg1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        this.getCurrencyIso4217Code = str;
        this.getMonetizationNetwork = context;
        this.getRevenue = aFi1lSDK;
        this.getMediationNetwork = aFg1uSDK;
        this.AFAdRevenueData = aFj1lSDK;
        this.component2 = aFg1vSDK;
        this.areAllFieldsValid = aFh1vSDK;
        this.component4 = aFc1qSDK;
        this.component3 = aFc1pSDK;
        this.component1 = aFi1tSDK;
        this.equals = aFf1gSDK;
        this.toString = aFc1iSDK;
        this.hashCode = aFg1xSDK;
        this.copy = aFc1kSDK;
        this.copydefault = LazyKt.lazy(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1oSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.AFLogger = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1oSDK.1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    private final SimpleDateFormat getMonetizationNetwork() {
        int i = 2 % 2;
        int i2 = f372a + 123;
        g = i2 % 128;
        int i3 = i2 % 2;
        d = (w + 93) % 128;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.AFLogger.getValue();
        int i4 = d + 91;
        w = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = f372a + 45;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return simpleDateFormat;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getMonetizationNetwork(AFh1rSDK aFh1rSDK) throws PackageManager.NameNotFoundException {
        int i = 2 % 2;
        w = (d + 53) % 128;
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        if (aFh1rSDK.getMediationNetwork()) {
            getMonetizationNetwork(aFh1rSDK, aFh1rSDK.component3, this.copy.getMediationNetwork, this.copy.getMonetizationNetwork);
            w = (d + 107) % 128;
        } else if (!(aFh1rSDK instanceof AFh1hSDK)) {
            int i2 = f372a + 63;
            g = i2 % 128;
            int i3 = i2 % 2;
            int i4 = d + 7;
            w = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                String str = aFh1rSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str, "");
                getMediationNetwork(map, str);
                throw new ArithmeticException();
            }
            Intrinsics.checkNotNullExpressionValue(map, "");
            String str2 = aFh1rSDK.areAllFieldsValid;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            getMediationNetwork(map, str2);
        }
        if (CollectionsKt.listOf((Object[]) new AFe1mSDK[]{AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH, AFe1mSDK.INAPP}).contains(aFh1rSDK.getCurrencyIso4217Code())) {
            d = (w + 103) % 128;
            Intrinsics.checkNotNullExpressionValue(map, "");
            equals(map);
        }
        if (aFh1rSDK.getRevenue()) {
            int i5 = g + 103;
            f372a = i5 % 128;
            int i6 = i5 % 2;
            d = (w + 15) % 128;
            Intrinsics.checkNotNullExpressionValue(map, "");
            areAllFieldsValid(map);
            int i7 = f372a + 93;
            g = i7 % 128;
            int i8 = i7 % 2;
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        force(map);
        AFInAppEventType(map);
        getMediationNetwork(new Object[]{this, map}, -140518465, 140518471, System.identityHashCode(this));
        AFKeystoreWrapper(map);
        d(map);
        getMediationNetwork(map, aFh1rSDK.getMediationNetwork());
        e(map);
        afInfoLog(map);
        getRevenue(map, aFh1rSDK);
        map.put("af_events_api", "1");
        int i9 = g + 23;
        f372a = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getMediationNetwork(AFh1rSDK aFh1rSDK) throws Throwable {
        int i = 2 % 2;
        int i2 = f372a + 53;
        g = i2 % 128;
        int i3 = i2 % 2;
        d = (w + 11) % 128;
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        getMediationNetwork(map);
        Map<String, Object> map2 = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        getMonetizationNetwork(map2);
        Map<String, Object> map3 = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        AFInAppEventParameterName(map3);
        Map<String, Object> map4 = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        unregisterClient(map4);
        Map<String, Object> map5 = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map5, "");
        afDebugLog(map5);
        if (getMediationNetwork().contains(aFh1rSDK.getCurrencyIso4217Code())) {
            int i4 = f372a + 91;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                d = (w + 103) >>> 918;
                Map<String, Object> map6 = aFh1rSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map6, "");
                afErrorLog(map6);
                int i5 = w + 28;
                d = i5 >> 20727;
                int i6 = i5 / 2;
            } else {
                d = (w + 125) % 128;
                Map<String, Object> map7 = aFh1rSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map7, "");
                afErrorLog(map7);
                int i7 = w + 17;
                d = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        int i9 = g + 51;
        f372a = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    private static List<AFe1mSDK> getMediationNetwork() {
        int i = 2 % 2;
        w = (d + 109) % 128;
        List<AFe1mSDK> listListOf = CollectionsKt.listOf((Object[]) new AFe1mSDK[]{AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH, AFe1mSDK.INAPP, AFe1mSDK.MANUAL_PURCHASE_VALIDATION, AFe1mSDK.ARS_VALIDATE, AFe1mSDK.PURCHASE_VALIDATE, AFe1mSDK.ADREVENUE});
        int i2 = w + 75;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = g;
        int i4 = i3 + 123;
        f372a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 47;
        f372a = i6 % 128;
        int i7 = i6 % 2;
        return listListOf;
    }

    private static void a(String str, int[] iArr, String str2, int i, Object[] objArr) throws UnsupportedEncodingException {
        int i2 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i3 = g + 119;
            f372a = i3 % 128;
            int i4 = i3 % 2;
            $11 = ($10 + 17) % 128;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object bytes = str;
        if (str != null) {
            int i5 = g + 91;
            f372a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 84 / 0;
                bytes = str.getBytes("ISO-8859-1");
            } else {
                bytes = str.getBytes("ISO-8859-1");
            }
        }
        byte[] bArr = (byte[]) bytes;
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        char[] cArr2 = registerClient;
        if (cArr2 != null) {
            $11 = ($10 + 113) % 128;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = f372a + 47;
                g = i8 % 128;
                int i9 = i8 % 2;
                cArr3[i7] = (char) (((long) cArr2[i7]) ^ (-5879130172463570806L));
            }
            cArr2 = cArr3;
        }
        int i10 = (int) ((-5879130172463570806L) ^ ((long) AFKeystoreWrapper));
        if (AFInAppEventType) {
            aFk1nSDK.getMonetizationNetwork = bArr.length;
            char[] cArr4 = new char[aFk1nSDK.getMonetizationNetwork];
            aFk1nSDK.AFAdRevenueData = 0;
            while (aFk1nSDK.AFAdRevenueData < aFk1nSDK.getMonetizationNetwork) {
                int i11 = g + 99;
                f372a = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr4[aFk1nSDK.AFAdRevenueData] = (char) (cArr2[bArr[aFk1nSDK.getMonetizationNetwork << aFk1nSDK.AFAdRevenueData] * i] % i10);
                    aFk1nSDK.AFAdRevenueData = aFk1nSDK.AFAdRevenueData;
                } else {
                    cArr4[aFk1nSDK.AFAdRevenueData] = (char) (cArr2[bArr[(aFk1nSDK.getMonetizationNetwork - 1) - aFk1nSDK.AFAdRevenueData] + i] - i10);
                    aFk1nSDK.AFAdRevenueData++;
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!AFInAppEventParameterName) {
            aFk1nSDK.getMonetizationNetwork = iArr.length;
            char[] cArr5 = new char[aFk1nSDK.getMonetizationNetwork];
            aFk1nSDK.AFAdRevenueData = 0;
            int i12 = f372a + 69;
            g = i12 % 128;
            int i13 = i12 % 2;
            while (aFk1nSDK.AFAdRevenueData < aFk1nSDK.getMonetizationNetwork) {
                cArr5[aFk1nSDK.AFAdRevenueData] = (char) (cArr2[iArr[(aFk1nSDK.getMonetizationNetwork - 1) - aFk1nSDK.AFAdRevenueData] - i] - i10);
                aFk1nSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        $10 = ($11 + 81) % 128;
        aFk1nSDK.getMonetizationNetwork = cArr.length;
        char[] cArr6 = new char[aFk1nSDK.getMonetizationNetwork];
        aFk1nSDK.AFAdRevenueData = 0;
        while (aFk1nSDK.AFAdRevenueData < aFk1nSDK.getMonetizationNetwork) {
            int i14 = $10 + 13;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                cArr6[aFk1nSDK.AFAdRevenueData] = (char) (cArr2[cArr[aFk1nSDK.getMonetizationNetwork * aFk1nSDK.AFAdRevenueData] - i] / i10);
                int i15 = aFk1nSDK.AFAdRevenueData;
                throw new ArithmeticException();
            }
            cArr6[aFk1nSDK.AFAdRevenueData] = (char) (cArr2[cArr[(aFk1nSDK.getMonetizationNetwork - 1) - aFk1nSDK.AFAdRevenueData] - i] - i10);
            aFk1nSDK.AFAdRevenueData++;
        }
        objArr[0] = new String(cArr6);
        int i16 = g + 81;
        f372a = i16 % 128;
        int i17 = i16 % 2;
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getRevenue(AFh1rSDK aFh1rSDK) throws PackageManager.NameNotFoundException, UnsupportedEncodingException {
        int i = 2 % 2;
        int i2 = f372a + 23;
        g = i2 % 128;
        int i3 = i2 % 2;
        w = (d + 35) % 128;
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        getCurrencyIso4217Code(map, aFh1rSDK.getMediationNetwork());
        component2(map);
        w(map);
        getMediationNetwork(new Object[]{this, map}, -1412383531, 1412383531, System.identityHashCode(this));
        getCurrencyIso4217Code(map, this.copy.AFAdRevenueData);
        getMediationNetwork(new Object[]{this, map}, -1753918152, 1753918160, System.identityHashCode(this));
        map.put("cell", MapsKt.mapOf(TuplesKt.to("mcc", Integer.valueOf(this.getMonetizationNetwork.getResources().getConfiguration().mcc)), TuplesKt.to("mnc", Integer.valueOf(this.getMonetizationNetwork.getResources().getConfiguration().mnc))));
        map.put("sig", component4());
        map.put("last_boot_time", Long.valueOf(component1()));
        map.put("disk", component3());
        int i4 = w + 25;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = f372a + 109;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        String[] strArr;
        int i = 2 % 2;
        int i2 = g + 81;
        f372a = i2 % 128;
        int i3 = i2 % 2;
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i4 = d + 51;
        w = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.APP_ID);
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            w = (d + 31) % 128;
            map.put(AppsFlyerProperties.APP_ID, string);
            int i5 = f372a + 35;
            g = i5 % 128;
            int i6 = i5 % 2;
        }
        String string2 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                StringBuilder sb = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb.append(string2);
                sb.append("' is not a legal value.");
                String string3 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "");
                AFLogger.afWarnLog(string3);
            }
            map.put(FirebaseAnalytics.Param.CURRENCY, string2);
        }
        String string4 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.IS_UPDATE);
        if (string4 != null) {
            int i7 = g + 53;
            f372a = i7 % 128;
            if (i7 % 2 != 0) {
                map.put("isUpdate", string4);
                obj.hashCode();
                throw null;
            }
            map.put("isUpdate", string4);
        }
        String string5 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string5 != null) {
            int i8 = w + 5;
            d = i8 % 128;
            if (i8 % 2 == 0) {
                map.put("customData", string5);
                throw null;
            }
            int i9 = g + 25;
            f372a = i9 % 128;
            int i10 = i9 % 2;
            map.put("customData", string5);
        }
        String string6 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.APP_USER_ID);
        if (string6 != null) {
            int i11 = w + 69;
            d = i11 % 128;
            if (i11 % 2 == 0) {
                map.put("appUserId", string6);
                throw null;
            }
            int i12 = g + 11;
            f372a = i12 % 128;
            int i13 = i12 % 2;
            map.put("appUserId", string6);
            int i14 = f372a + 97;
            g = i14 % 128;
            int i15 = i14 % 2;
        }
        String string7 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getString(AppsFlyerProperties.USER_EMAILS);
        if (string7 != null) {
            map.put("user_emails", string7);
        }
        AFb1uSDK aFb1uSDK = aFg1oSDK.copy.getRevenue;
        if (aFb1uSDK != null && (strArr = aFb1uSDK.getMediationNetwork) != null) {
            int i16 = g + 85;
            f372a = i16 % 128;
            int i17 = i16 % 2;
            w = (d + 107) % 128;
            map.put("sharing_filter", strArr);
        }
        return null;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        int i = 2 % 2;
        boolean zAreEqual = false;
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        AFh1rSDK aFh1rSDK = (AFh1rSDK) objArr[1];
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Object obj = null;
        if (aFg1oSDK.component3.component4()) {
            AFh1oSDK aFh1oSDK = aFg1oSDK.component3.getCurrencyIso4217Code.component3;
            if (aFh1oSDK == null) {
                int i2 = f372a + 61;
                g = i2 % 128;
                if (i2 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            String str = aFh1oSDK.getMediationNetwork;
            if (str != null) {
                d = (w + 109) % 128;
                if (str.length() != 0) {
                    aFh1rSDK.getMediationNetwork("gaidError", aFh1oSDK.getMediationNetwork);
                    w = (d + 31) % 128;
                }
            }
            if (aFh1oSDK.getRevenue != null && aFh1oSDK.getMonetizationNetwork != null) {
                int i3 = g + 125;
                f372a = i3 % 128;
                if (i3 % 2 != 0) {
                    aFh1rSDK.getMediationNetwork("advertiserId", aFh1oSDK.getRevenue);
                    aFh1rSDK.getMediationNetwork("advertiserIdEnabled", String.valueOf(aFh1oSDK.getMonetizationNetwork));
                    aFh1rSDK.getMediationNetwork("isGaidWithGps", String.valueOf(aFh1oSDK.getCurrencyIso4217Code));
                    throw null;
                }
                aFh1rSDK.getMediationNetwork("advertiserId", aFh1oSDK.getRevenue);
                aFh1rSDK.getMediationNetwork("advertiserIdEnabled", String.valueOf(aFh1oSDK.getMonetizationNetwork));
                aFh1rSDK.getMediationNetwork("isGaidWithGps", String.valueOf(aFh1oSDK.getCurrencyIso4217Code));
            }
        } else {
            int i4 = g + 11;
            f372a = i4 % 128;
            int i5 = i4 % 2;
            Map<String, Object> revenue = AFa1tSDK.getRevenue(aFh1rSDK.AFAdRevenueData);
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            revenue.put("ad_ids_disabled", Boolean.TRUE);
        }
        AFh1oSDK aFh1oSDK2 = aFg1oSDK.component3.getCurrencyIso4217Code.component3;
        if (aFh1oSDK2 != null) {
            int i6 = d + 23;
            w = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.areEqual(aFh1oSDK2.component4, Boolean.TRUE);
                throw null;
            }
            zAreEqual = Intrinsics.areEqual(aFh1oSDK2.component4, Boolean.TRUE);
        }
        aFh1rSDK.getMediationNetwork("GAID_retry", String.valueOf(zAreEqual));
        if (CollectionsKt.listOf((Object[]) new AFe1mSDK[]{AFe1mSDK.CONVERSION, AFe1mSDK.LAUNCH}).contains(aFh1rSDK.getCurrencyIso4217Code())) {
            d = (w + 97) % 128;
            AFd1hSDK aFd1hSDK = aFg1oSDK.copy.component4;
            if (aFd1hSDK != null) {
                Map<String, Object> revenue2 = AFa1tSDK.getRevenue(aFh1rSDK.AFAdRevenueData);
                Intrinsics.checkNotNullExpressionValue(revenue2, "");
                revenue2.put("fetchAdIdLatency", Long.valueOf(aFd1hSDK.getRevenue));
                return null;
            }
        }
        int i7 = w + 35;
        d = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        int i8 = f372a + 71;
        g = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void getMediationNetwork(Map<String, Object> map) throws Throwable {
        int i;
        int i2;
        Method method;
        Method[] declaredMethods;
        int length;
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        byte[] bArr = $$a;
        byte b2 = bArr[13];
        byte b3 = b2;
        Object[] objArr = new Object[1];
        c(b2, b3, b3, objArr);
        int i4 = 0;
        Class<?> cls = Class.forName((String) objArr[0]);
        byte b4 = bArr[28];
        byte b5 = b4;
        Object[] objArr2 = new Object[1];
        c(b4, b5, b5, objArr2);
        Method method2 = cls.getMethod((String) objArr2[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        byte b6 = bArr[28];
        byte b7 = b6;
        Object[] objArr3 = new Object[1];
        c(b6, b7, b7, objArr3);
        Method[] methodArr = {method2, cls2.getMethod((String) objArr3[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int minimumFlingVelocity = 2823 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iMyPid = (Process.myPid() >> 22) + 22;
            byte[] bArr2 = $$d;
            byte b8 = bArr2[5];
            Object[] objArr4 = new Object[1];
            f((byte) (-b8), bArr2[10], b8, objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, minimumFlingVelocity, iMyPid, 1814927978, false, (String) objArr4[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            int i5 = f372a + 103;
            g = i5 % 128;
            if (i5 % 2 == 0) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 2823, 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getDeclaredMethods();
                length = declaredMethods.length;
            } else {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.blue(0), 2823 - (ViewConfiguration.getWindowTouchSlop() >> 8), 22 - View.resolveSizeAndState(0, 0, 0))).getDeclaredMethods();
                length = declaredMethods.length;
            }
            int i6 = 0;
            while (i6 < length) {
                Method method3 = declaredMethods[i6];
                int i7 = f372a + 57;
                g = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr5 = new Object[1];
                    h(null, null, MotionEvent.axisFromString("") + 128, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr5);
                    Class<?> cls3 = Class.forName((String) objArr5[i4]);
                    Object[] objArr6 = new Object[1];
                    h(null, null, 127 - Color.red(i4), new byte[]{-110, -120, -119, -111, -118, -111, -112, -113, -115, -116, -119, -121}, objArr6);
                    Object[] objArr7 = new Object[1];
                    objArr7[i4] = Integer.valueOf(((Integer) cls3.getMethod((String) objArr6[i4], null).invoke(method3, null)).intValue());
                    Object[] objArr8 = new Object[1];
                    h(null, null, (ViewConfiguration.getFadingEdgeLength() >> 16) + 127, new byte[]{-120, -119, -111, -118, -111, -112, -113, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr8);
                    Class<?> cls4 = Class.forName((String) objArr8[i4]);
                    Object[] objArr9 = new Object[1];
                    h(null, null, 127 - View.resolveSize(i4, i4), new byte[]{-119, -125, -111, -116, -126, -109, -110, -111}, objArr9);
                    if (!(!((Boolean) cls4.getMethod((String) objArr9[0], Integer.TYPE).invoke(null, objArr7)).booleanValue())) {
                        Class cls5 = Long.TYPE;
                        Object[] objArr10 = new Object[1];
                        h(null, null, 127 - View.combineMeasuredStates(0, 0), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr10);
                        Class<?> cls6 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        h(null, null, ExpandableListView.getPackedPositionGroup(0L) + 127, new byte[]{-119, -104, -105, -106, -122, -120, -107, -116, -119, -108, -116, -119, -121}, objArr11);
                        if (cls5.equals(cls6.getMethod((String) objArr11[0], null).invoke(method3, null))) {
                            int i9 = f372a + 41;
                            g = i9 % 128;
                            int i10 = i9 % 2;
                            Object[] objArr12 = new Object[1];
                            h(null, null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr12);
                            Class<?> cls7 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            h(null, null, AndroidCharacter.getMirror('0') + 'O', new byte[]{-110, -119, -104, -105, -106, -120, -119, -116, -119, -102, -126, -120, -126, -103, -116, -119, -121}, objArr13);
                            Object[] objArr14 = (Object[]) cls7.getMethod((String) objArr13[0], null).invoke(method3, null);
                            if (objArr14.length == 2 && !(!Long.TYPE.equals(objArr14[0]))) {
                                Object[] objArr15 = new Object[1];
                                h(null, null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr15);
                                if (Class.forName((String) objArr15[0]).equals(objArr14[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i11 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2823;
                                        int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                        byte[] bArr3 = $$d;
                                        byte b9 = bArr3[5];
                                        Object[] objArr16 = new Object[1];
                                        f((byte) (-b9), bArr3[10], b9, objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i11, iIndexOf, 1814927978, false, (String) objArr16[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method3);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                        int maximumDrawingCacheSize = 2823 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        int keyRepeatTimeout = 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                        byte[] bArr4 = $$d;
                                        byte b10 = bArr4[5];
                                        Object[] objArr17 = new Object[1];
                                        f((byte) (-b10), bArr4[10], b10, objArr17);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, maximumDrawingCacheSize, keyRepeatTimeout, 1814927978, false, (String) objArr17[0], null);
                                    }
                                    try {
                                        Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                                            int i12 = 2824 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            int i13 = 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            byte b11 = $$d[7];
                                            Object[] objArr19 = new Object[1];
                                            f((byte) 51, b11, b11, objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, i12, i13, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr18)).longValue();
                                        break;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i6++;
                    i4 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int i14 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2823;
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22;
            byte[] bArr5 = $$d;
            byte b12 = bArr5[5];
            Object[] objArr20 = new Object[1];
            f((byte) (-b12), bArr5[10], b12, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, i14, scrollDefaultDelay, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
            int mirror = 2871 - AndroidCharacter.getMirror('0');
            int iResolveOpacity = 22 - Drawable.resolveOpacity(0, 0);
            byte[] bArr6 = $$d;
            Object[] objArr22 = new Object[1];
            f((byte) 51, (byte) (bArr6[19] - 1), bArr6[7], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, mirror, iResolveOpacity, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 37657);
            int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 2720;
            int touchSlop = 19 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr7 = $$d;
            Object[] objArr24 = new Object[1];
            f((byte) 51, (byte) (bArr7[19] - 1), bArr7[7], objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar, iIndexOf2, touchSlop, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j = -1702198797;
        int iNextInt = new Random().nextInt();
        long j2 = -500;
        long j3 = (j2 * j) + (j2 * jLongValue);
        long j4 = TypedValues.PositionType.TYPE_TRANSITION_EASING;
        long j5 = -1;
        long j6 = jLongValue ^ j5;
        long j7 = (j6 | j) ^ j5;
        long j8 = j ^ j5;
        long j9 = iNextInt;
        long j10 = j3 + ((j7 | (((j8 | jLongValue) | j9) ^ j5)) * j4) + (((long) 1002) * ((j8 | j6) ^ j5)) + (j4 * ((((j9 ^ j5) | j8) | jLongValue) ^ j5)) + ((long) (-108207048));
        int iMyPid2 = Process.myPid();
        int i15 = ~iMyPid2;
        int i16 = ((int) (j10 >> 32)) & ((-753708564) + (((~(i15 | 675375484)) | 761850926) * (-1042)) + ((675375484 | iMyPid2) * 521) + (((~(iMyPid2 | (-761850927))) | 675309612 | (~(i15 | 761916798))) * 521));
        int iIdentityHashCode = System.identityHashCode(this);
        int i17 = ~iIdentityHashCode;
        int i18 = i16 | (((int) j10) & (2055568080 + (((~(634935917 | i17)) | (-802290493)) * 226) + (((~(i17 | (-167878929))) | (~(802290492 | iIdentityHashCode)) | 524353) * (-113)) + ((~(iIdentityHashCode | 634935917)) * 113)));
        int i19 = i18 >>> 24;
        int i20 = i18 & ViewCompat.MEASURED_SIZE_MASK;
        if (i19 != 0) {
            int i21 = f372a + 109;
            int i22 = i21 % 128;
            g = i22;
            i = 2;
            i2 = i21 % 2 == 0 ? 0 : 1;
            int i23 = i22 + 37;
            f372a = i23 % 128;
            int i24 = i23 % 2;
        } else {
            i = 2;
            i2 = 0;
        }
        arrayList.add((i2 == 0 || i20 >= i || (method = methodArr[i20]) == null) ? null : method.toString());
        if ((i19 + 6) * i2 != 0) {
            int i25 = f372a + 89;
            g = i25 % 128;
            if (i25 % 2 == 0) {
                Toast.makeText((Context) null, iIntValue << ((iIntValue >> (iIntValue % 0)) % 3), 0).show();
            } else {
                Toast.makeText((Context) null, iIntValue / (((iIntValue - 1) * iIntValue) % 2), 0).show();
            }
        }
        try {
            long j11 = this.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMonetizationNetwork.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j11)));
            int i26 = d + 111;
            w = i26 % 128;
            if (i26 % 2 != 0) {
                throw new ArithmeticException();
            }
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e2);
        }
    }

    private void getMediationNetwork(Map<String, Object> map, boolean z) {
        int i = 2 % 2;
        int i2 = g + 49;
        f372a = i2 % 128;
        int i3 = i2 % 2;
        d = (w + 29) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.getCurrencyIso4217Code);
        if (z) {
            int i4 = g + 101;
            f372a = i4 % 128;
            int i5 = i4 % 2;
            w = (d + 83) % 128;
            map.put("platform_extension_v2", this.getRevenue.getMediationNetwork());
        }
        d = (w + 5) % 128;
        int i6 = g + 81;
        f372a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 2 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        if ((r4 << 4) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        if ((r4 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        r4 = com.appsflyer.internal.AFg1oSDK.f372a + 3;
        com.appsflyer.internal.AFg1oSDK.g = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void areAllFieldsValid(java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFg1oSDK.f372a
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.g = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L2b
            int r1 = com.appsflyer.internal.AFg1oSDK.d
            int r1 = r1 + 15057
            com.appsflyer.internal.AFg1oSDK.w = r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            com.appsflyer.internal.AFc1pSDK r1 = r3.component3
            com.appsflyer.internal.AFf1gSDK.getRevenue(r4, r1)
            int r4 = com.appsflyer.internal.AFg1oSDK.d
            int r4 = r4 + 32
            int r1 = r4 * 9978
            com.appsflyer.internal.AFg1oSDK.w = r1
            int r4 = r4 << 4
            if (r4 != 0) goto L50
            goto L46
        L2b:
            int r1 = com.appsflyer.internal.AFg1oSDK.d
            int r1 = r1 + 59
            int r1 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.w = r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            com.appsflyer.internal.AFc1pSDK r1 = r3.component3
            com.appsflyer.internal.AFf1gSDK.getRevenue(r4, r1)
            int r4 = com.appsflyer.internal.AFg1oSDK.d
            int r4 = r4 + 85
            int r1 = r4 % 128
            com.appsflyer.internal.AFg1oSDK.w = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L50
        L46:
            int r4 = com.appsflyer.internal.AFg1oSDK.f372a
            int r4 = r4 + 3
            int r1 = r4 % 128
            com.appsflyer.internal.AFg1oSDK.g = r1
            int r4 = r4 % r0
            return
        L50:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.areAllFieldsValid(java.util.Map):void");
    }

    private void getCurrencyIso4217Code(Map<String, Object> map, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        HashMap map2 = new HashMap();
        map2.put("cpu_abi", getMediationNetwork("ro.product.cpu.abi"));
        map2.put("cpu_abi2", getMediationNetwork("ro.product.cpu.abi2"));
        map2.put("arch", getMediationNetwork("os.arch"));
        map2.put("build_display_id", getMediationNetwork("ro.build.display.id"));
        if (z) {
            w = (d + 13) % 128;
            component4(map2);
            if (this.component3.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) <= 2) {
                int i2 = f372a + 67;
                g = i2 % 128;
                int i3 = i2 % 2;
                map2.putAll(this.AFAdRevenueData.AFAdRevenueData());
                int i4 = f372a + 45;
                g = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 2;
                }
            }
        }
        map2.put("dim", this.component2.AFAdRevenueData(this.getMonetizationNetwork));
        map.put("deviceData", map2);
        d = (w + 1) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a A[PHI: r1 r8
  0x003a: PHI (r1v19 com.appsflyer.internal.AFg1oSDK) = (r1v5 com.appsflyer.internal.AFg1oSDK), (r1v21 com.appsflyer.internal.AFg1oSDK) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r8v12 java.util.Map) = (r8v2 java.util.Map), (r8v14 java.util.Map) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r1 r2 r8
  0x0035: PHI (r1v6 com.appsflyer.internal.AFg1oSDK) = (r1v5 com.appsflyer.internal.AFg1oSDK), (r1v21 com.appsflyer.internal.AFg1oSDK) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r2v4 com.appsflyer.internal.AFi1pSDK) = (r2v3 com.appsflyer.internal.AFi1pSDK), (r2v17 com.appsflyer.internal.AFi1pSDK) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r8v3 java.util.Map) = (r8v2 java.util.Map), (r8v14 java.util.Map) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
    
        if ((r2 * 144) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
    
        if ((r2 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
    
        r8.put("carrier", r1);
        r8 = com.appsflyer.internal.AFg1oSDK.g + 115;
        com.appsflyer.internal.AFg1oSDK.f372a = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        if ((r8 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
    
        r8.put("carrier", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getMediationNetwork(java.lang.Object[] r8) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.getMediationNetwork(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    /* JADX WARN: Code duplicated, block: B:15:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0077  */
    /* JADX WARN: Code duplicated, block: B:9:0x0045  */
    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getRevenue(Map<String, Object> map, int i, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = g + 23;
        f372a = i6 % 128;
        boolean z = true;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("counter", String.valueOf(i));
            map.put("iaecounter", String.valueOf(i2));
            if (!equals()) {
                i3 = d + 19;
                w = i3 % 128;
                if (i3 % 2 != 0) {
                    int i7 = f372a + 31;
                    g = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            map.put("isFirstCall", String.valueOf(z));
            w = (d + 107) % 128;
            i4 = f372a + 11;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i));
        map.put("iaecounter", String.valueOf(i2));
        if (equals()) {
            i3 = d + 19;
            w = i3 % 128;
            if (i3 % 2 != 0) {
                int i9 = f372a + 31;
                g = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        map.put("isFirstCall", String.valueOf(z));
        w = (d + 107) % 128;
        i4 = f372a + 11;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        z = false;
        map.put("isFirstCall", String.valueOf(z));
        w = (d + 107) % 128;
        i4 = f372a + 11;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r2 = com.appsflyer.internal.AFg1oSDK.f372a + 11;
        com.appsflyer.internal.AFg1oSDK.g = r2 % 128;
        r2 = r2 % 2;
        com.appsflyer.internal.AFg1oSDK.d = (com.appsflyer.internal.AFg1oSDK.w + 39) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r15.get("af_deeplink") == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        r15 = com.appsflyer.internal.AFg1oSDK.f372a;
        r1 = r15 + 37;
        com.appsflyer.internal.AFg1oSDK.g = r1 % 128;
        r1 = r1 % 2;
        r1 = com.appsflyer.internal.AFg1oSDK.w + 97;
        com.appsflyer.internal.AFg1oSDK.d = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        r15 = r15 + 101;
        com.appsflyer.internal.AFg1oSDK.g = r15 % 128;
        r15 = r15 % 2;
        com.appsflyer.AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r0 = r14;
        r0 = new org.json.JSONObject(r1);
        r0.put("isPush", "true");
        r15.put("af_deeplink", r0.toString());
        r15 = kotlin.Result.m8024constructorimpl(kotlin.Unit.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r15 = kotlin.Result.m8024constructorimpl(kotlin.ResultKt.createFailure(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c5, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, "");
        r15 = r14.copy.getCurrencyIso4217Code;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if ((r1 + 3) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if ((r1 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, "");
        r1 = r14.copy.getCurrencyIso4217Code;
     */
    @Override // com.appsflyer.internal.AFg1qSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getCurrencyIso4217Code(java.util.Map<java.lang.String, java.lang.Object> r15) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.getCurrencyIso4217Code(java.util.Map):void");
    }

    @Override // com.appsflyer.internal.AFg1qSDK
    public final void getCurrencyIso4217Code(AFh1rSDK aFh1rSDK) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put("open_referrer", aFh1rSDK.getMediationNetwork);
        String str = aFh1rSDK.component4;
        Object obj = null;
        if (str != null) {
            int i2 = g + 57;
            int i3 = i2 % 128;
            f372a = i3;
            int i4 = i2 % 2;
            int i5 = w + 43;
            d = i5 % 128;
            if (i5 % 2 == 0) {
                StringsKt.isBlank(str);
                throw null;
            }
            int i6 = i3 + 71;
            g = i6 % 128;
            if (i6 % 2 == 0) {
                StringsKt.isBlank(str);
                obj.hashCode();
                throw null;
            }
            if (!StringsKt.isBlank(str)) {
                int i7 = w + 119;
                d = i7 % 128;
                if (i7 % 2 != 0) {
                    map.put("af_web_referrer", aFh1rSDK.component4);
                    return;
                } else {
                    map.put("af_web_referrer", aFh1rSDK.component4);
                    throw new ArithmeticException();
                }
            }
        }
        int i8 = f372a + 67;
        g = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void component3(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = g + 105;
        f372a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = w + 63;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            String string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
            String string2 = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
            if (string != null) {
                d = (w + 121) % 128;
                map.put("onelink_id", string);
            }
            if (string2 != null) {
                int i5 = f372a + 39;
                g = i5 % 128;
                int i6 = i5 % 2;
                map.put("onelink_ver", string2);
                if (i6 == 0) {
                    int i7 = 30 / 0;
                    return;
                }
                return;
            }
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
        ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
        throw new ArithmeticException();
    }

    private final void getMonetizationNetwork(Map<String, Object> map) throws Throwable {
        int i;
        int i2;
        String string;
        int i3;
        PackageInfo packageInfo;
        Method method;
        int i4 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        byte[] bArr = $$a;
        byte b2 = bArr[13];
        byte b3 = b2;
        Object[] objArr = new Object[1];
        c(b2, b3, b3, objArr);
        int i5 = 0;
        Class<?> cls = Class.forName((String) objArr[0]);
        byte b4 = bArr[28];
        byte b5 = b4;
        Object[] objArr2 = new Object[1];
        c(b4, b5, b5, objArr2);
        Method method2 = cls.getMethod((String) objArr2[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        byte b6 = bArr[28];
        byte b7 = b6;
        Object[] objArr3 = new Object[1];
        c(b6, b7, b7, objArr3);
        Method[] methodArr = {method2, cls2.getMethod((String) objArr3[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int size = 2823 - View.MeasureSpec.getSize(0);
            int mode = 22 - View.MeasureSpec.getMode(0);
            byte[] bArr2 = $$d;
            byte b8 = bArr2[5];
            Object[] objArr4 = new Object[1];
            f((byte) (-b8), bArr2[10], b8, objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, size, mode, 1814927978, false, (String) objArr4[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.myPid() >> 22), 2823 - (ViewConfiguration.getEdgeSlop() >> 16), (Process.myPid() >> 22) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i6 = f372a + 69;
            g = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                Method method3 = declaredMethods[i8];
                try {
                    Object[] objArr5 = new Object[1];
                    h(null, null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr5);
                    Class<?> cls3 = Class.forName((String) objArr5[i5]);
                    Object[] objArr6 = new Object[1];
                    h(null, null, Color.green(i5) + 127, new byte[]{-110, -120, -119, -111, -118, -111, -112, -113, -115, -116, -119, -121}, objArr6);
                    Object[] objArr7 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr6[0], null).invoke(method3, null)).intValue())};
                    Object[] objArr8 = new Object[1];
                    h(null, null, Drawable.resolveOpacity(0, 0) + 127, new byte[]{-120, -119, -111, -118, -111, -112, -113, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr8);
                    Class<?> cls4 = Class.forName((String) objArr8[0]);
                    Method[] methodArr2 = declaredMethods;
                    Object[] objArr9 = new Object[1];
                    h(null, null, 127 - (Process.myPid() >> 22), new byte[]{-119, -125, -111, -116, -126, -109, -110, -111}, objArr9);
                    if (((Boolean) cls4.getMethod((String) objArr9[0], Integer.TYPE).invoke(null, objArr7)).booleanValue()) {
                        Class cls5 = Long.TYPE;
                        Object[] objArr10 = new Object[1];
                        h(null, null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr10);
                        Class<?> cls6 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        h(null, null, (KeyEvent.getMaxKeyCode() >> 16) + 127, new byte[]{-119, -104, -105, -106, -122, -120, -107, -116, -119, -108, -116, -119, -121}, objArr11);
                        if (cls5.equals(cls6.getMethod((String) objArr11[0], null).invoke(method3, null))) {
                            Object[] objArr12 = new Object[1];
                            h(null, null, KeyEvent.getDeadChar(0, 0) + 127, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr12);
                            Class<?> cls7 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            h(null, null, AndroidCharacter.getMirror('0') + 'O', new byte[]{-110, -119, -104, -105, -106, -120, -119, -116, -119, -102, -126, -120, -126, -103, -116, -119, -121}, objArr13);
                            Object[] objArr14 = (Object[]) cls7.getMethod((String) objArr13[0], null).invoke(method3, null);
                            if (objArr14.length == 2 && Long.TYPE.equals(objArr14[0])) {
                                Object[] objArr15 = new Object[1];
                                h(null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr15);
                                if (Class.forName((String) objArr15[0]).equals(objArr14[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cMyTid = (char) (Process.myTid() >> 22);
                                        int deadChar = 2823 - KeyEvent.getDeadChar(0, 0);
                                        int i9 = 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        byte[] bArr3 = $$d;
                                        byte b9 = bArr3[5];
                                        Object[] objArr16 = new Object[1];
                                        f((byte) (-b9), bArr3[10], b9, objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, deadChar, i9, 1814927978, false, (String) objArr16[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method3);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 2823;
                                        int iIndexOf = 22 - TextUtils.indexOf("", "", 0);
                                        byte[] bArr4 = $$d;
                                        byte b10 = bArr4[5];
                                        Object[] objArr17 = new Object[1];
                                        f((byte) (-b10), bArr4[10], b10, objArr17);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, edgeSlop, iIndexOf, 1814927978, false, (String) objArr17[0], null);
                                    }
                                    try {
                                        Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2823;
                                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                                            byte b11 = $$d[7];
                                            Object[] objArr19 = new Object[1];
                                            f((byte) 51, b11, b11, objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength, tapTimeout, maxKeyCode, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr18)).longValue();
                                        break;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i8++;
                    declaredMethods = methodArr2;
                    i5 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
            int i10 = 2823 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i11 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
            byte[] bArr5 = $$d;
            byte b12 = bArr5[5];
            Object[] objArr20 = new Object[1];
            f((byte) (-b12), bArr5[10], b12, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, i10, i11, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2823;
            int iMyTid = (Process.myTid() >> 22) + 22;
            byte[] bArr6 = $$d;
            Object[] objArr22 = new Object[1];
            f((byte) 51, (byte) (bArr6[19] - 1), bArr6[7], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, jumpTapTimeout, iMyTid, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char packedPositionGroup = (char) (37657 - ExpandableListView.getPackedPositionGroup(0L));
            int iResolveOpacity = 2720 - Drawable.resolveOpacity(0, 0);
            int capsMode = 19 - TextUtils.getCapsMode("", 0, 0);
            byte[] bArr7 = $$d;
            Object[] objArr24 = new Object[1];
            f((byte) 51, (byte) (bArr7[19] - 1), bArr7[7], objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionGroup, iResolveOpacity, capsMode, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j = -1668732752;
        long j2 = 193;
        long jIdentityHashCode = System.identityHashCode(this);
        long j3 = -1;
        long j4 = jIdentityHashCode ^ j3;
        long j5 = j ^ j3;
        long j6 = (j2 * j) + (j2 * jLongValue) + (((long) (-192)) * (j4 | ((j5 | jLongValue) ^ j3)));
        long j7 = jLongValue ^ j3;
        long j8 = j5 | j7;
        long j9 = j7 | j4;
        long j10 = j6 + (((long) (-384)) * ((j8 ^ j3) | (j9 ^ j3))) + (((long) DerHeader.TAG_CLASS_PRIVATE) * (((j8 | jIdentityHashCode) ^ j3) | ((j9 | j) ^ j3) | ((jIdentityHashCode | (j | jLongValue)) ^ j3))) + ((long) (-141673093));
        int iIdentityHashCode = System.identityHashCode(this);
        int i12 = ~iIdentityHashCode;
        int i13 = ((int) (j10 >> 32)) & (960373600 + (((~(801973682 | i12)) | (~(2055767202 | iIdentityHashCode))) * 210) + (((~(iIdentityHashCode | (-1342210049))) | (~(i12 | (-88416529)))) * 210));
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i14 = i13 | (((int) j10) & (1153123995 + (((~iIdentityHashCode2) | (-18961494)) * 1444) + (((~(iIdentityHashCode2 | (-728092908))) | (~((-709133503) | iIdentityHashCode2)) | 709132458) * (-1444)) + 805296058));
        int i15 = i14 >>> 24;
        int i16 = i14 & ViewCompat.MEASURED_SIZE_MASK;
        boolean z = i15 != 0;
        if (z) {
            int i17 = g + 37;
            f372a = i17 % 128;
            i = 2;
            int i18 = i17 % 2;
            i2 = 1;
        } else {
            i = 2;
            i2 = 0;
        }
        if (!z || i16 >= i || (method = methodArr[i16]) == null) {
            string = null;
        } else {
            int i19 = g + 45;
            f372a = i19 % 128;
            if (i19 % i != 0) {
                string = method.toString();
                int i20 = 60 / 0;
            } else {
                string = method.toString();
            }
        }
        arrayList.add(string);
        if ((i15 + 6) * i2 != 0) {
            i3 = 2;
            Toast.makeText((Context) null, iIntValue / (((iIntValue - 1) * iIntValue) % 2), 0).show();
            int i21 = g + 1;
            f372a = i21 % 128;
            int i22 = i21 % 2;
        } else {
            i3 = 2;
        }
        int i23 = w + 41;
        d = i23 % 128;
        try {
            if (i23 % i3 == 0) {
                packageInfo = this.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMonetizationNetwork.getPackageName(), 1);
                if (packageInfo.versionCode > this.component4.AFAdRevenueData("versionCode", 1)) {
                    this.component4.getMediationNetwork("versionCode", packageInfo.versionCode);
                }
            } else {
                packageInfo = this.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMonetizationNetwork.getPackageName(), 0);
                if (packageInfo.versionCode > this.component4.AFAdRevenueData("versionCode", 0)) {
                    this.component4.getMediationNetwork("versionCode", packageInfo.versionCode);
                }
            }
            map.put("app_version_code", String.valueOf(packageInfo.versionCode));
            AFc1pSDK aFc1pSDK = this.component3;
            map.put("app_version_name", AFj1iSDK.getMediationNetwork(aFc1pSDK.getRevenue.getMonetizationNetwork, aFc1pSDK.getRevenue.getMonetizationNetwork.getPackageName()));
            map.put("targetSDKver", Integer.valueOf(this.component3.getRevenue.getMonetizationNetwork.getApplicationInfo().targetSdkVersion));
            long j11 = packageInfo.firstInstallTime;
            long j12 = packageInfo.lastUpdateTime;
            map.put("date1", getMonetizationNetwork().format(new Date(j11)));
            map.put("date2", getMonetizationNetwork().format(new Date(j12)));
            Object[] objArr25 = new Object[1];
            a("\u008d\u0085\u0087\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 127 - TextUtils.getTrimmedLength(""), objArr25);
            String strIntern = ((String) objArr25[0]).intern();
            SimpleDateFormat monetizationNetwork = getMonetizationNetwork();
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            map.put(strIntern, getMediationNetwork(monetizationNetwork));
            w = (d + 47) % 128;
            int i24 = f372a + 35;
            g = i24 % 128;
            int i25 = i24 % 2;
        } catch (Throwable th3) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th3, true);
        }
    }

    private void component1(Map<String, ? extends Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFh1vSDK aFh1vSDK = this.areAllFieldsValid;
        HashMap map2 = new HashMap(aFh1vSDK.getRevenue);
        aFh1vSDK.getRevenue.clear();
        this.areAllFieldsValid.getCurrencyIso4217Code.getMonetizationNetwork("gcd");
        Intrinsics.checkNotNullExpressionValue(map2, "");
        if (map2.isEmpty()) {
            d = (w + 113) % 128;
            return;
        }
        int i2 = g + 55;
        f372a = i2 % 128;
        if (i2 % 2 != 0) {
            w = (d * 120) - 3568;
            Map<String, Object> revenue = AFa1tSDK.getRevenue(map);
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            revenue.put("gcd", map2);
        } else {
            w = (d + 71) % 128;
            Map<String, Object> revenue2 = AFa1tSDK.getRevenue(map);
            Intrinsics.checkNotNullExpressionValue(revenue2, "");
            revenue2.put("gcd", map2);
        }
        int i3 = g + 13;
        f372a = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r1 = r8.component4.AFAdRevenueData("prev_event_name", (java.lang.String) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r3 = new org.json.JSONObject();
        r3.put("prev_event_timestamp", r8.component4.getCurrencyIso4217Code("prev_event_timestamp", -1));
        r3.put("prev_event_name", r1);
        r9.put("prev_event", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        com.appsflyer.internal.AFg1oSDK.w = (com.appsflyer.internal.AFg1oSDK.d + 27) % 128;
        r9 = com.appsflyer.internal.AFg1oSDK.g + 105;
        com.appsflyer.internal.AFg1oSDK.f372a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        r8.component4.getMediationNetwork("prev_event_name", r10);
        r8.component4.getMonetizationNetwork("prev_event_timestamp", java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        r8.component4.AFAdRevenueData("prev_event_name", (java.lang.String) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if ((r2 >>> 5) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if ((r2 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r1 = r1 + 35;
        com.appsflyer.internal.AFg1oSDK.g = r1 % 128;
        r1 = r1 % 2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, "");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getMediationNetwork(java.util.Map<java.lang.String, java.lang.Object> r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFg1oSDK.f372a
            int r2 = r1 + 93
            int r3 = r2 % 128
            com.appsflyer.internal.AFg1oSDK.g = r3
            int r2 = r2 % r0
            r3 = 0
            java.lang.String r4 = "prev_event_name"
            java.lang.String r5 = ""
            if (r2 != 0) goto L20
            int r2 = com.appsflyer.internal.AFg1oSDK.d
            int r2 = r2 / 9
            int r6 = r2 / 21700
            com.appsflyer.internal.AFg1oSDK.w = r6
            int r2 = r2 >>> 5
            if (r2 != 0) goto L7a
            goto L2b
        L20:
            int r2 = com.appsflyer.internal.AFg1oSDK.d
            int r2 = r2 + 7
            int r6 = r2 % 128
            com.appsflyer.internal.AFg1oSDK.w = r6
            int r2 = r2 % r0
            if (r2 != 0) goto L7a
        L2b:
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.g = r2
            int r1 = r1 % r0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r5)
            com.appsflyer.internal.AFc1qSDK r1 = r8.component4     // Catch: java.lang.Exception -> L8d
            java.lang.String r1 = r1.AFAdRevenueData(r4, r3)     // Catch: java.lang.Exception -> L8d
            java.lang.String r2 = "prev_event_timestamp"
            if (r1 == 0) goto L6b
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8d
            r3.<init>()     // Catch: java.lang.Exception -> L8d
            com.appsflyer.internal.AFc1qSDK r5 = r8.component4     // Catch: java.lang.Exception -> L8d
            r6 = -1
            long r5 = r5.getCurrencyIso4217Code(r2, r6)     // Catch: java.lang.Exception -> L8d
            r3.put(r2, r5)     // Catch: java.lang.Exception -> L8d
            r3.put(r4, r1)     // Catch: java.lang.Exception -> L8d
            java.lang.String r1 = "prev_event"
            r9.put(r1, r3)     // Catch: java.lang.Exception -> L8d
            int r9 = com.appsflyer.internal.AFg1oSDK.d
            int r9 = r9 + 27
            int r9 = r9 % 128
            com.appsflyer.internal.AFg1oSDK.w = r9
            int r9 = com.appsflyer.internal.AFg1oSDK.g
            int r9 = r9 + 105
            int r1 = r9 % 128
            com.appsflyer.internal.AFg1oSDK.f372a = r1
            int r9 = r9 % r0
        L6b:
            com.appsflyer.internal.AFc1qSDK r9 = r8.component4     // Catch: java.lang.Exception -> L8d
            r9.getMediationNetwork(r4, r10)     // Catch: java.lang.Exception -> L8d
            com.appsflyer.internal.AFc1qSDK r9 = r8.component4     // Catch: java.lang.Exception -> L8d
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L8d
            r9.getMonetizationNetwork(r2, r0)     // Catch: java.lang.Exception -> L8d
            return
        L7a:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r5)
            com.appsflyer.internal.AFc1qSDK r9 = r8.component4     // Catch: java.lang.Exception -> L8d
            r9.AFAdRevenueData(r4, r3)     // Catch: java.lang.Exception -> L8d
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            r9.<init>()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            throw r9     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
        L8b:
            r9 = move-exception
            throw r9
        L8d:
            r9 = move-exception
            java.lang.String r10 = "Error while processing previous event."
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            com.appsflyer.AFLogger.afErrorLog(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.getMediationNetwork(java.util.Map, java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    private String getMediationNetwork(SimpleDateFormat simpleDateFormat) {
        int i = 2 % 2;
        int i2 = d + 113;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(simpleDateFormat, "");
            this.component4.AFAdRevenueData("appsFlyerFirstInstall", (String) null);
            throw null;
        }
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String strAFAdRevenueData = this.component4.AFAdRevenueData("appsFlyerFirstInstall", (String) null);
        if (strAFAdRevenueData == null) {
            int i3 = f372a + 95;
            g = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 67 / 0;
                if (copydefault()) {
                    AFLogger.afDebugLog("AppsFlyer: first launch detected");
                    strAFAdRevenueData = simpleDateFormat.format(new Date());
                } else {
                    w = (d + 11) % 128;
                    strAFAdRevenueData = "";
                }
            } else if (copydefault()) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                strAFAdRevenueData = simpleDateFormat.format(new Date());
            } else {
                w = (d + 11) % 128;
                strAFAdRevenueData = "";
            }
            this.component4.getMediationNetwork("appsFlyerFirstInstall", strAFAdRevenueData);
            int i5 = g + 101;
            f372a = i5 % 128;
            int i6 = i5 % 2;
        }
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "AppsFlyer: first launch date: ".concat(String.valueOf(strAFAdRevenueData)), false, 4, null);
        Intrinsics.checkNotNullExpressionValue(strAFAdRevenueData, "");
        return strAFAdRevenueData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r1 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r3 = com.appsflyer.internal.AFg1oSDK.d + 49;
        com.appsflyer.internal.AFg1oSDK.w = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((r3 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r3 = com.appsflyer.internal.AFg1oSDK.f372a + 39;
        com.appsflyer.internal.AFg1oSDK.g = r3 % 128;
        r3 = r3 % 2;
        r3 = r1.getPackageManager();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r3 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r1 = r1.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r1 = (android.content.pm.PackageInfo) getMediationNetwork(new java.lang.Object[]{r3, r1}, 1014234820, -1014234818, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        r3 = r1.firstInstallTime;
        com.appsflyer.internal.AFg1oSDK.d = (com.appsflyer.internal.AFg1oSDK.w + 47) % 128;
        r1 = java.lang.Long.valueOf(r3);
        r3 = com.appsflyer.internal.AFg1oSDK.g + 49;
        com.appsflyer.internal.AFg1oSDK.f372a = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if ((r3 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        r1 = com.appsflyer.internal.AFg1oSDK.d + 51;
        com.appsflyer.internal.AFg1oSDK.w = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        if ((r1 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        r1 = com.appsflyer.internal.AFg1oSDK.f372a + 39;
        com.appsflyer.internal.AFg1oSDK.g = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r1 != null) goto L11;
     */
    @Override // com.appsflyer.internal.AFg1qSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Long getCurrencyIso4217Code() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFg1oSDK.w
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.d = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L9d
            int r1 = com.appsflyer.internal.AFg1oSDK.g
            int r1 = r1 + 85
            int r3 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.f372a = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L25
            com.appsflyer.internal.AFc1iSDK r1 = r6.toString
            android.content.Context r1 = r1.getMonetizationNetwork
            r3 = 28
            int r3 = r3 / 0
            if (r1 == 0) goto L9c
            goto L2b
        L25:
            com.appsflyer.internal.AFc1iSDK r1 = r6.toString
            android.content.Context r1 = r1.getMonetizationNetwork
            if (r1 == 0) goto L9c
        L2b:
            int r3 = com.appsflyer.internal.AFg1oSDK.d
            int r3 = r3 + 49
            int r4 = r3 % 128
            com.appsflyer.internal.AFg1oSDK.w = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L9b
            int r3 = com.appsflyer.internal.AFg1oSDK.f372a
            int r3 = r3 + 39
            int r4 = r3 % 128
            com.appsflyer.internal.AFg1oSDK.g = r4
            int r3 = r3 % r0
            android.content.pm.PackageManager r3 = r1.getPackageManager()
            if (r3 == 0) goto L80
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}
            long r3 = java.lang.System.currentTimeMillis()
            int r3 = (int) r3
            r4 = 1014234820(0x3c73fec4, float:0.014892284)
            r5 = -1014234818(0xffffffffc38c013e, float:-280.0097)
            java.lang.Object r1 = getMediationNetwork(r1, r4, r5, r3)
            android.content.pm.PackageInfo r1 = (android.content.pm.PackageInfo) r1
            if (r1 == 0) goto L80
            long r3 = r1.firstInstallTime
            int r1 = com.appsflyer.internal.AFg1oSDK.w
            int r1 = r1 + 47
            int r1 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.d = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            int r3 = com.appsflyer.internal.AFg1oSDK.g
            int r3 = r3 + 49
            int r4 = r3 % 128
            com.appsflyer.internal.AFg1oSDK.f372a = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L7f
            return r1
        L7f:
            throw r2
        L80:
            int r1 = com.appsflyer.internal.AFg1oSDK.d
            int r1 = r1 + 51
            int r3 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.w = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L95
            int r1 = com.appsflyer.internal.AFg1oSDK.f372a
            int r1 = r1 + 39
            int r3 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.g = r3
            int r1 = r1 % r0
            return r2
        L95:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>()
            throw r0
        L9b:
            throw r2
        L9c:
            return r2
        L9d:
            com.appsflyer.internal.AFc1iSDK r0 = r6.toString
            android.content.Context r0 = r0.getMonetizationNetwork
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.getCurrencyIso4217Code():java.lang.Long");
    }

    private void getCurrencyIso4217Code(Map<String, Object> map, String str) {
        int i = 2 % 2;
        int i2 = f372a + 19;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (!(!((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false))) {
            int i4 = d + 89;
            w = i4 % 128;
            if (i4 % 2 == 0) {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                return;
            } else {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                throw new ArithmeticException();
            }
        }
        AFf1gSDK aFf1gSDK = this.equals;
        Object obj = (String) AFf1gSDK.getCurrencyIso4217Code(new Object[]{aFf1gSDK, this.component4}, -1198101809, 1198101809, System.identityHashCode(aFf1gSDK));
        String str2 = (CharSequence) obj;
        if (str2 != null && str2.length() != 0) {
            map.put("imei", obj);
        }
        String monetizationNetwork = getMonetizationNetwork(str);
        if (monetizationNetwork != null) {
            this.component4.getMediationNetwork("androidIdCached", monetizationNetwork);
            map.put("android_id", monetizationNetwork);
            int i5 = g + 121;
            f372a = i5 % 128;
            int i6 = i5 % 2;
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
            d = (w + 39) % 128;
        }
        AFb1mSDK mediationNetwork = AFb1jSDK.getMediationNetwork(this.getMonetizationNetwork);
        if (mediationNetwork != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = mediationNetwork.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            linkedHashMap.put("isManual", bool);
            String str3 = mediationNetwork.getMonetizationNetwork;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            linkedHashMap.put("val", str3);
            Boolean bool2 = mediationNetwork.getMediationNetwork;
            if (bool2 != null) {
                int i7 = g + 117;
                f372a = i7 % 128;
                int i8 = i7 % 2;
                linkedHashMap.put("isLat", bool2);
            }
            map.put("oaid", linkedHashMap);
        }
        int i9 = f372a + 101;
        g = i9 % 128;
        int i10 = i9 % 2;
    }

    private String component4() throws Throwable {
        int i = 2 % 2;
        int i2 = g + 27;
        f372a = i2 % 128;
        int i3 = i2 % 2;
        w = (d + 65) % 128;
        String strN_ = AFj1iSDK.N_(this.getMonetizationNetwork.getApplicationContext().getPackageManager(), this.getMonetizationNetwork.getApplicationContext().getPackageName());
        int i4 = w + 19;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = f372a + 63;
        g = i5 % 128;
        int i6 = i5 % 2;
        return strN_;
    }

    private static long component1() {
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        int i = 2 % 2;
        int i2 = g + 5;
        f372a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            w = (d * 40) - 4572;
            jCurrentTimeMillis = System.currentTimeMillis();
            jElapsedRealtime = SystemClock.elapsedRealtime();
            int i3 = w / 43;
            d = i3 + 19200;
            if ((i3 << 5) == 0) {
                throw null;
            }
        } else {
            w = (d + 11) % 128;
            jCurrentTimeMillis = System.currentTimeMillis();
            jElapsedRealtime = SystemClock.elapsedRealtime();
            int i4 = w + 67;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
        int i5 = g;
        int i6 = i5 + 51;
        f372a = i6 % 128;
        int i7 = i6 % 2;
        long j = jCurrentTimeMillis - jElapsedRealtime;
        int i8 = i5 + 53;
        f372a = i8 % 128;
        if (i8 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    private static String component3() {
        int i = 2 % 2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        long blockCountLong = statFs.getBlockCountLong();
        double dPow = Math.pow(2.0d, 20.0d);
        StringBuilder sb = new StringBuilder();
        sb.append((long) ((availableBlocksLong * blockSizeLong) / dPow));
        sb.append("/");
        sb.append((long) ((blockCountLong * blockSizeLong) / dPow));
        String string = sb.toString();
        w = (d + 67) % 128;
        int i2 = f372a + 101;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    private static void component2(Map<String, Object> map) throws UnsupportedEncodingException {
        int i = 2 % 2;
        int i2 = f372a + 107;
        g = i2 % 128;
        int i3 = i2 % 2;
        d = (w + 37) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a("\u008f\u0089\u0087\u0083\u008e", null, null, 127 - ExpandableListView.getPackedPositionType(0L), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i4 = w + 95;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = f372a + 117;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    private void getMonetizationNetwork(AFh1rSDK aFh1rSDK, String str, String str2, AFb1qSDK aFb1qSDK) throws PackageManager.NameNotFoundException {
        int i = 2 % 2;
        int i2 = f372a + 41;
        g = i2 % 128;
        int i3 = i2 % 2;
        w = (d + 121) % 128;
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        if (aFh1rSDK.getCurrencyIso4217Code() == AFe1mSDK.CONVERSION) {
            int i4 = d + 107;
            w = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                toString(map);
                copydefault(map);
                hashCode(map);
                AFa1zSDK.AFAdRevenueData(this.toString, this.component3);
                throw new ArithmeticException();
            }
            Intrinsics.checkNotNullExpressionValue(map, "");
            toString(map);
            copydefault(map);
            hashCode(map);
            AFa1zSDK.AFAdRevenueData(this.toString, this.component3);
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        copy(map);
        component3(map);
        component1((Map<String, ? extends Object>) map);
        getMonetizationNetwork(map, str2);
        getMediationNetwork(new Object[]{this, map, str}, 1763970144, -1763970135, System.identityHashCode(this));
        registerClient(map);
        if (aFb1qSDK != null) {
            int i5 = f372a + 69;
            g = i5 % 128;
            int i6 = i5 % 2;
            aFb1qSDK.getRevenue(map);
            if (i6 == 0) {
                int i7 = 59 / 0;
            }
        }
    }

    private void equals(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = w + 101;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = g + 97;
            f372a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getMonetizationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            int i5 = w + 99;
            d = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            int i6 = g + 77;
            f372a = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("is_pc", Boolean.valueOf(this.getMonetizationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        throw null;
    }

    private final void component4(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = g + 5;
        f372a = i2 % 128;
        int i3 = i2 % 2;
        AFg1uSDK.AFa1uSDK revenue = this.getMediationNetwork.getRevenue(this.getMonetizationNetwork);
        float f = revenue.getRevenue;
        String str = revenue.getMediationNetwork;
        map.put("btl", String.valueOf(f));
        if (str != null) {
            w = (d + 67) % 128;
            map.put("btch", str);
            w = (d + 109) % 128;
            int i4 = f372a + 115;
            g = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:14:0x005c A[PHI: r1 r6
  0x005c: PHI (r1v12 long) = (r1v8 long), (r1v15 long) binds: [B:10:0x0041, B:13:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x005c: PHI (r6v1 long) = (r6v0 long), (r6v3 long) binds: [B:10:0x0041, B:13:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x006e  */
    /* JADX WARN: Code duplicated, block: B:19:0x007a  */
    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    private void copy(Map<String, Object> map) {
        long currencyIso4217Code;
        long jCurrentTimeMillis;
        long seconds;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = g + 41;
        f372a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = d;
            w = (i5 << 53) >>> 2728;
            if ((i5 << 58) == 0) {
                Intrinsics.checkNotNullParameter(map, "");
                currencyIso4217Code = this.component4.getCurrencyIso4217Code("AppsFlyerTimePassedSincePrevLaunch", 0L);
                jCurrentTimeMillis = System.currentTimeMillis();
                this.component4.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
                if (currencyIso4217Code > 0) {
                    seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - currencyIso4217Code);
                    i = d + 81;
                    w = i % 128;
                    if (i % 2 != 0) {
                        i2 = g + 85;
                        f372a = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i6 = 4 / 2;
                        }
                    }
                } else {
                    seconds = -1;
                }
            } else {
                Intrinsics.checkNotNullParameter(map, "");
                currencyIso4217Code = this.component4.getCurrencyIso4217Code("AppsFlyerTimePassedSincePrevLaunch", 1L);
                jCurrentTimeMillis = System.currentTimeMillis();
                this.component4.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
                if (currencyIso4217Code > 1) {
                    seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - currencyIso4217Code);
                    i = d + 81;
                    w = i % 128;
                    if (i % 2 != 0) {
                        i2 = g + 85;
                        f372a = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i7 = 4 / 2;
                        }
                    }
                } else {
                    seconds = -1;
                }
            }
        } else {
            int i8 = d + 97;
            w = i8 % 128;
            if (i8 % 2 == 0) {
                Intrinsics.checkNotNullParameter(map, "");
                currencyIso4217Code = this.component4.getCurrencyIso4217Code("AppsFlyerTimePassedSincePrevLaunch", 0L);
                jCurrentTimeMillis = System.currentTimeMillis();
                this.component4.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
                if (currencyIso4217Code > 0) {
                    seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - currencyIso4217Code);
                    i = d + 81;
                    w = i % 128;
                    if (i % 2 != 0) {
                        i2 = g + 85;
                        f372a = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i9 = 4 / 2;
                        }
                    }
                } else {
                    seconds = -1;
                }
            } else {
                Intrinsics.checkNotNullParameter(map, "");
                currencyIso4217Code = this.component4.getCurrencyIso4217Code("AppsFlyerTimePassedSincePrevLaunch", 1L);
                jCurrentTimeMillis = System.currentTimeMillis();
                this.component4.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
                if (currencyIso4217Code > 1) {
                    seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - currencyIso4217Code);
                    i = d + 81;
                    w = i % 128;
                    if (i % 2 != 0) {
                        i2 = g + 85;
                        f372a = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i10 = 4 / 2;
                        }
                    }
                } else {
                    seconds = -1;
                }
            }
        }
        map.put("timepassedsincelastlaunch", String.valueOf(seconds));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r5 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r1 = com.appsflyer.internal.AFg1oSDK.f372a + 41;
        com.appsflyer.internal.AFg1oSDK.g = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        com.appsflyer.internal.AFg1oSDK.d = (com.appsflyer.internal.AFg1oSDK.w / 67) * 19104;
        r4.put(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        com.appsflyer.internal.AFg1oSDK.d = (com.appsflyer.internal.AFg1oSDK.w + 99) % 128;
        r4.put(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        com.appsflyer.internal.AFg1oSDK.w = (com.appsflyer.internal.AFg1oSDK.d + 15) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if ((r3 >>> 5) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if ((r1 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void getMonetizationNetwork(java.util.Map<java.lang.String, java.lang.Object> r4, java.lang.String r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFg1oSDK.f372a
            int r1 = r1 + 39
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.g = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L1d
            int r1 = com.appsflyer.internal.AFg1oSDK.d
            int r3 = r1 + (-20)
            int r1 = r1 + (-7464)
            com.appsflyer.internal.AFg1oSDK.w = r1
            int r1 = r3 >>> 5
            if (r1 != 0) goto L5a
            goto L28
        L1d:
            int r1 = com.appsflyer.internal.AFg1oSDK.d
            int r1 = r1 + 117
            int r3 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.w = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L5a
        L28:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            if (r5 == 0) goto L51
            int r1 = com.appsflyer.internal.AFg1oSDK.f372a
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.g = r2
            int r1 = r1 % r0
            java.lang.String r0 = "phone"
            if (r1 != 0) goto L46
            int r1 = com.appsflyer.internal.AFg1oSDK.w
            int r1 = r1 / 67
            int r1 = r1 * 19104
            com.appsflyer.internal.AFg1oSDK.d = r1
            r4.put(r0, r5)
            goto L51
        L46:
            int r1 = com.appsflyer.internal.AFg1oSDK.w
            int r1 = r1 + 99
            int r1 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.d = r1
            r4.put(r0, r5)
        L51:
            int r4 = com.appsflyer.internal.AFg1oSDK.d
            int r4 = r4 + 15
            int r4 = r4 % 128
            com.appsflyer.internal.AFg1oSDK.w = r4
            return
        L5a:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.getMonetizationNetwork(java.util.Map, java.lang.String):void");
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        int i = 2 % 2;
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = str;
        if (str2 != null) {
            int i2 = w + 53;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                throw new ArithmeticException();
            }
            if (str2.length() != 0) {
                int i3 = f372a + 13;
                g = i3 % 128;
                int i4 = i3 % 2;
                map.put("referrer", str);
                d = (w + 103) % 128;
            }
        }
        String strAFAdRevenueData = aFg1oSDK.component4.AFAdRevenueData("extraReferrers", (String) null);
        if (strAFAdRevenueData != null) {
            map.put("extraReferrers", strAFAdRevenueData);
        }
        String referrer = ((AppsFlyerProperties) getMediationNetwork(new Object[]{aFg1oSDK}, 2080605438, -2080605426, System.identityHashCode(aFg1oSDK))).getReferrer(aFg1oSDK.component4);
        String str3 = referrer;
        if (str3 != null && str3.length() != 0) {
            int i5 = f372a + 57;
            g = i5 % 128;
            int i6 = i5 % 2;
            if (map.get("referrer") == null) {
                int i7 = f372a + 13;
                g = i7 % 128;
                if (i7 % 2 == 0) {
                    d = (w >>> 111) >> 24067;
                    map.put("referrer", referrer);
                } else {
                    d = (w + 33) % 128;
                    map.put("referrer", referrer);
                }
                int i8 = g + 5;
                f372a = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 4 / 5;
                }
            }
        }
        int i10 = d + 15;
        w = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if ((r3 % 2) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r8.put("prev_session_dur", java.lang.Long.valueOf(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        r8.put("prev_session_dur", java.lang.Long.valueOf(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if ((r6 >> 4) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void registerClient(java.util.Map<java.lang.String, java.lang.Object> r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            com.appsflyer.internal.AFh1vSDK r1 = r7.areAllFieldsValid
            long r1 = r1.toString
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 == 0) goto L48
            int r3 = com.appsflyer.internal.AFg1oSDK.f372a
            int r3 = r3 + 15
            int r5 = r3 % 128
            com.appsflyer.internal.AFg1oSDK.g = r5
            int r3 = r3 % r0
            java.lang.String r5 = "prev_session_dur"
            if (r3 != 0) goto L2d
            int r3 = com.appsflyer.internal.AFg1oSDK.w
            int r6 = r3 + (-28)
            int r3 = r3 + 5632
            com.appsflyer.internal.AFg1oSDK.d = r3
            int r3 = r6 >> 4
            if (r3 == 0) goto L40
            goto L38
        L2d:
            int r3 = com.appsflyer.internal.AFg1oSDK.w
            int r3 = r3 + 97
            int r6 = r3 % 128
            com.appsflyer.internal.AFg1oSDK.d = r6
            int r3 = r3 % r0
            if (r3 == 0) goto L40
        L38:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r8.put(r5, r1)
            goto L48
        L40:
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r8.put(r5, r0)
            throw r4
        L48:
            int r8 = com.appsflyer.internal.AFg1oSDK.d
            int r8 = r8 + 105
            int r8 = r8 % 128
            com.appsflyer.internal.AFg1oSDK.w = r8
            int r8 = com.appsflyer.internal.AFg1oSDK.g
            int r8 = r8 + 75
            int r1 = r8 % 128
            com.appsflyer.internal.AFg1oSDK.f372a = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L5c
            return
        L5c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.registerClient(java.util.Map):void");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    private static void AFInAppEventType(Map<String, Object> map) {
        int i;
        int i2 = 2 % 2;
        int i3 = d + 109;
        w = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFa1zSDK aFa1zSDK = AFa1zSDK.INSTANCE;
            AFa1zSDK.getCurrencyIso4217Code();
            AFa1zSDK aFa1zSDK2 = AFa1zSDK.INSTANCE;
            AFa1zSDK.getRevenue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        AFa1zSDK aFa1zSDK3 = AFa1zSDK.INSTANCE;
        Object currencyIso4217Code = AFa1zSDK.getCurrencyIso4217Code();
        AFa1zSDK aFa1zSDK4 = AFa1zSDK.INSTANCE;
        String revenue = AFa1zSDK.getRevenue();
        if (currencyIso4217Code != null) {
            int i4 = g + 69;
            f372a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 54 / 0;
                if (revenue != null) {
                    if (Integer.parseInt(revenue) > 0) {
                        i = w + 27;
                        d = i % 128;
                        if (i % 2 != 0) {
                            map.put("reinstallCounter", revenue);
                            map.put("originalAppsflyerId", currencyIso4217Code);
                            return;
                        } else {
                            map.put("reinstallCounter", revenue);
                            map.put("originalAppsflyerId", currencyIso4217Code);
                            throw null;
                        }
                    }
                }
            } else if (revenue != null) {
                if (Integer.parseInt(revenue) > 0) {
                    i = w + 27;
                    d = i % 128;
                    if (i % 2 != 0) {
                        map.put("reinstallCounter", revenue);
                        map.put("originalAppsflyerId", currencyIso4217Code);
                        return;
                    } else {
                        map.put("reinstallCounter", revenue);
                        map.put("originalAppsflyerId", currencyIso4217Code);
                        throw null;
                    }
                }
            }
        }
        int i6 = g + 9;
        f372a = i6 % 128;
        int i7 = i6 % 2;
    }

    private String areAllFieldsValid() {
        int i = 2 % 2;
        int i2 = g + 33;
        f372a = i2 % 128;
        String strComponent2 = null;
        if (i2 % 2 == 0 ? !(!this.component4.getMediationNetwork("INSTALL_STORE")) : !this.component4.getMediationNetwork("INSTALL_STORE")) {
            String strAFAdRevenueData = this.component4.AFAdRevenueData("INSTALL_STORE", (String) null);
            int i3 = g + 75;
            f372a = i3 % 128;
            if (i3 % 2 == 0) {
                return strAFAdRevenueData;
            }
            throw null;
        }
        if (copydefault()) {
            int i4 = f372a + 25;
            g = i4 % 128;
            int i5 = i4 % 2;
            int i6 = d + 123;
            w = i6 % 128;
            if (i6 % 2 != 0) {
                component2();
                throw null;
            }
            strComponent2 = component2();
        } else {
            int i7 = w + 67;
            d = i7 % 128;
            int i8 = i7 % 2;
        }
        this.component4.getMediationNetwork("INSTALL_STORE", strComponent2);
        return strComponent2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "");
        r5.putAll(r1.hashCode.getCurrencyIso4217Code());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if ((r3 >>> 3) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if ((r3 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "");
        r5.putAll(r1.hashCode.getCurrencyIso4217Code());
        com.appsflyer.internal.AFg1oSDK.d = (com.appsflyer.internal.AFg1oSDK.w + 87) % 128;
        r5 = com.appsflyer.internal.AFg1oSDK.g + 121;
        com.appsflyer.internal.AFg1oSDK.f372a = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getMonetizationNetwork(java.lang.Object[] r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFg1oSDK.f372a
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.g = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L29
            r1 = r5[r4]
            com.appsflyer.internal.AFg1oSDK r1 = (com.appsflyer.internal.AFg1oSDK) r1
            r5 = r5[r3]
            java.util.Map r5 = (java.util.Map) r5
            int r3 = com.appsflyer.internal.AFg1oSDK.d
            int r3 = r3 + 88
            r4 = 20081(0x4e71, float:2.814E-41)
            int r4 = r3 << r4
            com.appsflyer.internal.AFg1oSDK.w = r4
            int r3 = r3 >>> 3
            if (r3 != 0) goto L5b
            goto L3c
        L29:
            r1 = r5[r3]
            com.appsflyer.internal.AFg1oSDK r1 = (com.appsflyer.internal.AFg1oSDK) r1
            r5 = r5[r4]
            java.util.Map r5 = (java.util.Map) r5
            int r3 = com.appsflyer.internal.AFg1oSDK.d
            int r3 = r3 + 65
            int r4 = r3 % 128
            com.appsflyer.internal.AFg1oSDK.w = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L5b
        L3c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            com.appsflyer.internal.AFg1xSDK r1 = r1.hashCode
            java.util.Map r1 = r1.getCurrencyIso4217Code()
            r5.putAll(r1)
            int r5 = com.appsflyer.internal.AFg1oSDK.w
            int r5 = r5 + 87
            int r5 = r5 % 128
            com.appsflyer.internal.AFg1oSDK.d = r5
            int r5 = com.appsflyer.internal.AFg1oSDK.g
            int r5 = r5 + 121
            int r1 = r5 % 128
            com.appsflyer.internal.AFg1oSDK.f372a = r1
            int r5 = r5 % r0
            r5 = 0
            return r5
        L5b:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            com.appsflyer.internal.AFg1xSDK r0 = r1.hashCode
            java.util.Map r0 = r0.getCurrencyIso4217Code()
            r5.putAll(r0)
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.getMonetizationNetwork(java.lang.Object[]):java.lang.Object");
    }

    private void AFKeystoreWrapper(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = f372a + 55;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = w + 111;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
        String str = string;
        if (str != null) {
            int i5 = f372a + 111;
            g = i5 % 128;
            int i6 = i5 % 2;
            w = (d + 125) % 128;
            if (str.length() != 0) {
                int i7 = g + 23;
                f372a = i7 % 128;
                int i8 = i7 % 2;
                map.put(AppsFlyerProperties.EXTENSION, string);
                int i9 = g + 1;
                f372a = i9 % 128;
                int i10 = i9 % 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    private String component2() {
        String string;
        int i = 2 % 2;
        int i2 = f372a + 59;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        int i5 = d + 119;
        w = i5 % 128;
        if (i5 % 2 != 0) {
            ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            throw null;
        }
        int i6 = i3 + 63;
        f372a = i6 % 128;
        if (i6 % 2 != 0) {
            Object[] objArr = new Object[0];
            objArr[1] = this;
            string = ((AppsFlyerProperties) getMediationNetwork(objArr, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string == null) {
                string = AFAdRevenueData("AF_STORE");
            }
        } else {
            string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string == null) {
                string = AFAdRevenueData("AF_STORE");
            }
        }
        int i7 = d + 11;
        w = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        int i8 = f372a + 111;
        g = i8 % 128;
        int i9 = i8 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r6.component3.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 1) > 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r6.component3.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) > 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        com.appsflyer.internal.AFg1oSDK.d = (com.appsflyer.internal.AFg1oSDK.w + 91) % 128;
        r1 = com.appsflyer.internal.AFg1oSDK.g + 109;
        com.appsflyer.internal.AFg1oSDK.f372a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if ((r1 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r0 = 48 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if ((r1 >>> 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if ((r1 % 2) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean copydefault() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFg1oSDK.f372a
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.g = r2
            int r1 = r1 % r0
            java.lang.String r2 = "appsFlyerCount"
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L1e
            int r1 = com.appsflyer.internal.AFg1oSDK.w
            int r1 = r1 + 87
            int r5 = r1 / 7270
            com.appsflyer.internal.AFg1oSDK.d = r5
            int r1 = r1 >>> r0
            if (r1 != 0) goto L34
            goto L29
        L1e:
            int r1 = com.appsflyer.internal.AFg1oSDK.w
            int r1 = r1 + 93
            int r5 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.d = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L34
        L29:
            com.appsflyer.internal.AFc1pSDK r1 = r6.component3
            com.appsflyer.internal.AFc1qSDK r1 = r1.getMonetizationNetwork
            int r1 = r1.AFAdRevenueData(r2, r4)
            if (r1 > r4) goto L55
            goto L3e
        L34:
            com.appsflyer.internal.AFc1pSDK r1 = r6.component3
            com.appsflyer.internal.AFc1qSDK r1 = r1.getMonetizationNetwork
            int r1 = r1.AFAdRevenueData(r2, r3)
            if (r1 > r4) goto L55
        L3e:
            int r1 = com.appsflyer.internal.AFg1oSDK.w
            int r1 = r1 + 91
            int r1 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.d = r1
            int r1 = com.appsflyer.internal.AFg1oSDK.g
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.f372a = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L54
            r0 = 48
            int r0 = r0 / r3
        L54:
            return r4
        L55:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.copydefault():boolean");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    private void AFInAppEventParameterName(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String strComponent2 = this.component3.component2();
        String str = (String) getMediationNetwork(new Object[]{this.component4, strComponent2}, 381318279, -381318268, (int) System.currentTimeMillis());
        boolean z = true;
        boolean z2 = (str == null || Intrinsics.areEqual(str, strComponent2)) ? false : true;
        if (str == null) {
            int i2 = g + 39;
            f372a = i2 % 128;
            if (i2 % 2 != 0) {
                d = (w / 96) >> 23913;
                if (strComponent2 == null) {
                    z = false;
                }
            } else {
                d = (w + 67) % 128;
                if (strComponent2 == null) {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        if (z2) {
            map.put("af_latestchannel", strComponent2);
        } else {
            d = (w + 9) % 128;
            if (z) {
                map.put("af_latestchannel", strComponent2);
            }
        }
        String strAreAllFieldsValid = areAllFieldsValid();
        if (strAreAllFieldsValid != null) {
            int i3 = w + 101;
            d = i3 % 128;
            if (i3 % 2 == 0) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = strAreAllFieldsValid.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                map.put("af_installstore", lowerCase);
                throw null;
            }
            int i4 = g + 9;
            f372a = i4 % 128;
            if (i4 % 2 != 0) {
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                String lowerCase2 = strAreAllFieldsValid.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                map.put("af_installstore", lowerCase2);
                int i5 = 15 / 0;
            } else {
                Locale locale3 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale3, "");
                String lowerCase3 = strAreAllFieldsValid.toLowerCase(locale3);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                map.put("af_installstore", lowerCase3);
            }
        }
        String strCopy = copy();
        if (strCopy != null) {
            int i6 = g + 91;
            f372a = i6 % 128;
            int i7 = i6 % 2;
            Locale locale4 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale4, "");
            String lowerCase4 = strCopy.toLowerCase(locale4);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
            map.put("af_preinstall_name", lowerCase4);
            int i8 = g + 75;
            f372a = i8 % 128;
            int i9 = i8 % 2;
        }
        String strComponent3 = component2();
        if (strComponent3 != null) {
            Locale locale5 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale5, "");
            String lowerCase5 = strComponent3.toLowerCase(locale5);
            Intrinsics.checkNotNullExpressionValue(lowerCase5, "");
            map.put("af_currentstore", lowerCase5);
        }
    }

    private boolean equals() {
        int i = 2 % 2;
        int i2 = f372a + 97;
        g = i2 % 128;
        int i3 = i2 % 2;
        d = (w + 89) % 128;
        boolean z = Boolean.parseBoolean(this.component4.AFAdRevenueData("sentSuccessfully", (String) null));
        int i4 = d + 49;
        w = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = g + 43;
        f372a = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private void unregisterClient(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = f372a + 17;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = d + 27;
        w = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(AFc1pSDK.AFAdRevenueData(this.getMonetizationNetwork)));
            int i5 = g + 1;
            f372a = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(AFc1pSDK.AFAdRevenueData(this.getMonetizationNetwork)));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x009d  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dc  */
    private String copy() {
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        w = (d + 21) % 128;
        String string = ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getString("preInstallName");
        Object obj = null;
        if (string != null) {
            int i5 = w + 77;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                return string;
            }
            throw null;
        }
        if (!this.component4.getMediationNetwork("preInstallName")) {
            if (copydefault()) {
                int i6 = f372a + 53;
                g = i6 % 128;
                if (i6 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    objArr[1] = this;
                    string = (String) getMediationNetwork(objArr, -1713193940, 1713193943, System.identityHashCode(this));
                    if (string == null) {
                        i2 = w + 119;
                        d = i2 % 128;
                        if (i2 % 2 != 0) {
                            AFAdRevenueData("AF_PRE_INSTALL_NAME");
                            throw null;
                        }
                        i3 = g + 21;
                        f372a = i3 % 128;
                        if (i3 % 2 != 0) {
                            string = AFAdRevenueData("AF_PRE_INSTALL_NAME");
                            int i7 = 82 / 0;
                        } else {
                            string = AFAdRevenueData("AF_PRE_INSTALL_NAME");
                        }
                    }
                } else {
                    string = (String) getMediationNetwork(new Object[]{this}, -1713193940, 1713193943, System.identityHashCode(this));
                    if (string == null) {
                        i2 = w + 119;
                        d = i2 % 128;
                        if (i2 % 2 != 0) {
                            AFAdRevenueData("AF_PRE_INSTALL_NAME");
                            throw null;
                        }
                        i3 = g + 21;
                        f372a = i3 % 128;
                        if (i3 % 2 != 0) {
                            string = AFAdRevenueData("AF_PRE_INSTALL_NAME");
                            int i8 = 82 / 0;
                        } else {
                            string = AFAdRevenueData("AF_PRE_INSTALL_NAME");
                        }
                    }
                }
            }
            if (string != null) {
                int i9 = g + 55;
                f372a = i9 % 128;
                if (i9 % 2 != 0) {
                    this.component4.getMediationNetwork("preInstallName", string);
                    obj.hashCode();
                    throw null;
                }
                this.component4.getMediationNetwork("preInstallName", string);
                i = f372a + 13;
            }
            if (string != null) {
                ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).set("preInstallName", string);
            }
            return string;
        }
        d = (w + 91) % 128;
        string = this.component4.AFAdRevenueData("preInstallName", (String) null);
        i = f372a + 37;
        g = i % 128;
        int i10 = i % 2;
        if (string != null) {
            ((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).set("preInstallName", string);
        }
        return string;
    }

    private static void w(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
            d = (w + 103) % 128;
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e2);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
            int i2 = d + 119;
            w = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = g + 89;
                int i4 = i3 % 128;
                f372a = i4;
                if (i3 % 2 == 0) {
                    int i5 = 5 / 4;
                }
                int i6 = i4 + 111;
                g = i6 % 128;
                int i7 = i6 % 2;
            }
        } catch (Exception e3) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e3);
        }
        try {
            map.put("country", Locale.getDefault().getCountry());
            d = (w + 103) % 128;
        } catch (Exception e4) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    /* JADX WARN: Code duplicated, block: B:13:0x005c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    private void d(Map<String, Object> map) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        int i = 2 % 2;
        d = (w + 13) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String revenue = AFb1iSDK.getRevenue(this.component3.getMonetizationNetwork);
        if (revenue != null) {
            int i2 = f372a + 103;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = d;
                int i4 = i3 >> 63;
                w = i3 >> 8730;
                if (i4 / 5 != 0) {
                    map.put("uid", revenue);
                    boolValueOf = Boolean.valueOf(this.component3.getMonetizationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", true));
                    Intrinsics.checkNotNullExpressionValue(boolValueOf, "");
                    if (boolValueOf.booleanValue()) {
                        return;
                    }
                    int i5 = f372a + 17;
                    g = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    map.put("uid", revenue);
                    boolValueOf2 = Boolean.valueOf(this.component3.getMonetizationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", false));
                    Intrinsics.checkNotNullExpressionValue(boolValueOf2, "");
                    if (!boolValueOf2.booleanValue()) {
                        return;
                    }
                }
            } else {
                int i7 = d + 13;
                w = i7 % 128;
                if (i7 % 2 != 0) {
                    map.put("uid", revenue);
                    boolValueOf = Boolean.valueOf(this.component3.getMonetizationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", true));
                    Intrinsics.checkNotNullExpressionValue(boolValueOf, "");
                    if (boolValueOf.booleanValue()) {
                        return;
                    }
                    int i8 = f372a + 17;
                    g = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    map.put("uid", revenue);
                    boolValueOf2 = Boolean.valueOf(this.component3.getMonetizationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", false));
                    Intrinsics.checkNotNullExpressionValue(boolValueOf2, "");
                    if (!boolValueOf2.booleanValue()) {
                        return;
                    }
                }
            }
            int i10 = w + 117;
            d = i10 % 128;
            if (i10 % 2 != 0) {
                map.put("custom_install_id", Boolean.TRUE);
            } else {
                map.put("custom_install_id", Boolean.TRUE);
                throw null;
            }
        }
    }

    private void e(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        boolean monetizationNetwork = AFg1ySDK.getMonetizationNetwork(this.getMonetizationNetwork);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=".concat(String.valueOf(monetizationNetwork)));
        if (!monetizationNetwork) {
            int i2 = g + 17;
            f372a = i2 % 128;
            if (i2 % 2 != 0) {
                d = w + 2285;
                map.put("tokenRefreshConfigured", Boolean.FALSE);
                w = (d + 10) >> 3344;
            } else {
                d = (w + 55) % 128;
                map.put("tokenRefreshConfigured", Boolean.FALSE);
                w = (d + 125) % 128;
            }
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1ySDK.getMonetizationNetwork(this.component4)));
        int i3 = f372a + 55;
        g = i3 % 128;
        int i4 = i3 % 2;
    }

    private void afInfoLog(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = f372a + 53;
        g = i2 % 128;
        int i3 = i2 % 2;
        d = (w + 11) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        if (!(!this.component4.getMediationNetwork("is_stop_tracking_used"))) {
            int i4 = f372a + 99;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                map.put("istu", String.valueOf(this.component4.getMediationNetwork("is_stop_tracking_used", false)));
            } else {
                map.put("istu", String.valueOf(this.component4.getMediationNetwork("is_stop_tracking_used", false)));
            }
        }
        d = (w + 87) % 128;
        int i5 = g + 99;
        f372a = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c A[PHI: r2
  0x003c: PHI (r2v8 java.lang.String) = (r2v7 java.lang.String), (r2v10 java.lang.String) binds: [B:10:0x003a, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r2.length() != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getMonetizationNetwork(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            r2 = -2080605426(0xffffffff83fc7b0e, float:-1.4839481E-36)
            int r3 = java.lang.System.identityHashCode(r6)
            r4 = 2080605438(0x7c0384fe, float:2.7315532E36)
            java.lang.Object r1 = getMediationNetwork(r1, r4, r2, r3)
            com.appsflyer.AppsFlyerProperties r1 = (com.appsflyer.AppsFlyerProperties) r1
            java.lang.String r2 = "collectAndroidId"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            r2 = 1
            r4 = 0
            if (r1 != r2) goto L76
            int r1 = com.appsflyer.internal.AFg1oSDK.g
            int r2 = r1 + 93
            int r5 = r2 % 128
            com.appsflyer.internal.AFg1oSDK.f372a = r5
            int r2 = r2 % r0
            r5 = 81
            if (r2 == 0) goto L37
            r2 = r7
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r3 = r5 / 0
            if (r2 == 0) goto L52
            goto L3c
        L37:
            r2 = r7
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L52
        L3c:
            int r1 = r1 + 33
            int r3 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.f372a = r3
            int r1 = r1 % r0
            int r1 = com.appsflyer.internal.AFg1oSDK.w
            int r1 = r1 + 119
            int r1 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.d = r1
            int r1 = r2.length()
            if (r1 == 0) goto L52
            goto L76
        L52:
            boolean r7 = r6.AFKeystoreWrapper()
            if (r7 == 0) goto L75
            int r7 = com.appsflyer.internal.AFg1oSDK.g
            int r7 = r7 + 41
            int r1 = r7 % 128
            com.appsflyer.internal.AFg1oSDK.f372a = r1
            int r7 = r7 % r0
            int r7 = com.appsflyer.internal.AFg1oSDK.d
            int r7 = r7 + 35
            int r7 = r7 % 128
            com.appsflyer.internal.AFg1oSDK.w = r7
            java.lang.String r7 = r6.AFInAppEventParameterName()
            int r0 = com.appsflyer.internal.AFg1oSDK.d
            int r0 = r0 + r5
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1oSDK.w = r0
            return r7
        L75:
            return r4
        L76:
            if (r7 == 0) goto L82
            int r1 = com.appsflyer.internal.AFg1oSDK.g
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.f372a = r2
            int r1 = r1 % r0
            return r7
        L82:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.getMonetizationNetwork(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if ((r0 + 5) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if ((r2 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        r7.put("appsflyerKey", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        r7.put("appsflyerKey", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void force(java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFg1oSDK.w
            int r1 = r1 + 113
            int r1 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.d = r1
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            com.appsflyer.internal.AFf1gSDK r1 = r6.equals
            java.lang.String r1 = r1.getMediationNetwork()
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L74
            int r3 = com.appsflyer.internal.AFg1oSDK.g
            int r3 = r3 + 85
            int r4 = r3 % 128
            com.appsflyer.internal.AFg1oSDK.f372a = r4
            int r3 = r3 % r0
            r4 = 0
            if (r3 == 0) goto L35
            int r3 = com.appsflyer.internal.AFg1oSDK.w
            int r3 = r3 + 118
            r5 = 1585(0x631, float:2.221E-42)
            int r5 = r3 >> r5
            com.appsflyer.internal.AFg1oSDK.d = r5
            int r3 = r3 >>> r0
            if (r3 == 0) goto L73
            goto L40
        L35:
            int r3 = com.appsflyer.internal.AFg1oSDK.w
            int r3 = r3 + 109
            int r5 = r3 % 128
            com.appsflyer.internal.AFg1oSDK.d = r5
            int r3 = r3 % r0
            if (r3 == 0) goto L73
        L40:
            int r2 = r2.length()
            if (r2 == 0) goto L74
            int r2 = com.appsflyer.internal.AFg1oSDK.f372a
            int r2 = r2 + 37
            int r3 = r2 % 128
            com.appsflyer.internal.AFg1oSDK.g = r3
            int r2 = r2 % r0
            java.lang.String r3 = "appsflyerKey"
            if (r2 != 0) goto L60
            int r0 = com.appsflyer.internal.AFg1oSDK.d
            int r0 = r0 >>> 62
            int r2 = r0 / 16507
            com.appsflyer.internal.AFg1oSDK.w = r2
            int r0 = r0 + 5
            if (r0 != 0) goto L6f
            goto L6b
        L60:
            int r2 = com.appsflyer.internal.AFg1oSDK.d
            int r2 = r2 + 41
            int r5 = r2 % 128
            com.appsflyer.internal.AFg1oSDK.w = r5
            int r2 = r2 % r0
            if (r2 != 0) goto L6f
        L6b:
            r7.put(r3, r1)
            return
        L6f:
            r7.put(r3, r1)
            throw r4
        L73:
            throw r4
        L74:
            int r7 = com.appsflyer.internal.AFg1oSDK.g
            int r7 = r7 + 65
            int r1 = r7 % 128
            com.appsflyer.internal.AFg1oSDK.f372a = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L83
            r7 = 15
            int r7 = r7 / 0
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.force(java.util.Map):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r2 = android.provider.Settings.Secure.getString(r6.getMonetizationNetwork.getContentResolver(), "android_id");
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r2 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r6.component4.AFAdRevenueData("androidIdCached", (java.lang.String) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        android.provider.Settings.Secure.getString(r6.getMonetizationNetwork.getContentResolver(), "android_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if ((r1 - 4) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if ((r1 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r1 = r6.component4.AFAdRevenueData("androidIdCached", (java.lang.String) null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String AFInAppEventParameterName() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFg1oSDK.g
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.f372a = r2
            int r1 = r1 % r0
            java.lang.String r2 = "android_id"
            java.lang.String r3 = "androidIdCached"
            r4 = 0
            if (r1 == 0) goto L20
            int r1 = com.appsflyer.internal.AFg1oSDK.w
            int r1 = r1 >>> 52
            int r5 = r1 + (-5332)
            com.appsflyer.internal.AFg1oSDK.d = r5
            int r1 = r1 + (-4)
            if (r1 == 0) goto L3e
            goto L2b
        L20:
            int r1 = com.appsflyer.internal.AFg1oSDK.w
            int r1 = r1 + 67
            int r5 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.d = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L3e
        L2b:
            com.appsflyer.internal.AFc1qSDK r1 = r6.component4
            java.lang.String r1 = r1.AFAdRevenueData(r3, r4)
            android.content.Context r3 = r6.getMonetizationNetwork     // Catch: java.lang.Exception -> L50
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Exception -> L50
            java.lang.String r2 = android.provider.Settings.Secure.getString(r3, r2)     // Catch: java.lang.Exception -> L50
            if (r2 == 0) goto L5a
            return r2
        L3e:
            com.appsflyer.internal.AFc1qSDK r1 = r6.component4
            java.lang.String r1 = r1.AFAdRevenueData(r3, r4)
            android.content.Context r3 = r6.getMonetizationNetwork     // Catch: java.lang.Exception -> L50
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Exception -> L50
            android.provider.Settings.Secure.getString(r3, r2)     // Catch: java.lang.Exception -> L50
            throw r4     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
        L4e:
            r0 = move-exception
            throw r0
        L50:
            r2 = move-exception
            java.lang.String r3 = r2.getMessage()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            com.appsflyer.AFLogger.afErrorLog(r3, r2)
        L5a:
            if (r1 == 0) goto L8d
            int r2 = com.appsflyer.internal.AFg1oSDK.w
            int r2 = r2 + 73
            int r2 = r2 % 128
            com.appsflyer.internal.AFg1oSDK.d = r2
            java.lang.String r2 = "use cached AndroidId: "
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r2 = r2.concat(r3)
            com.appsflyer.AFLogger.afDebugLog(r2)
            int r2 = com.appsflyer.internal.AFg1oSDK.d
            int r2 = r2 + 125
            int r3 = r2 % 128
            com.appsflyer.internal.AFg1oSDK.w = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L87
            int r2 = com.appsflyer.internal.AFg1oSDK.g
            int r2 = r2 + 29
            int r3 = r2 % 128
            com.appsflyer.internal.AFg1oSDK.f372a = r3
            int r2 = r2 % r0
            return r1
        L87:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>()
            throw r0
        L8d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.AFInAppEventParameterName():java.lang.String");
    }

    private void afDebugLog(Map<String, Object> map) {
        String currencyIso4217Code;
        int i = 2 % 2;
        int i2 = g + 43;
        int i3 = i2 % 128;
        f372a = i3;
        int i4 = i2 % 2;
        int i5 = w + 111;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = i3 + 5;
            g = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.checkNotNullParameter(map, "");
            if (!((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            if (!((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                return;
            }
        }
        Object obj = null;
        try {
            this.getMonetizationNetwork.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
            currencyIso4217Code = this.component3.getCurrencyIso4217Code(this.getMonetizationNetwork);
        } catch (Throwable unused) {
            currencyIso4217Code = null;
        }
        if (currencyIso4217Code != null) {
            int i8 = f372a + 109;
            g = i8 % 128;
            int i9 = i8 % 2;
            int i10 = d + 113;
            w = i10 % 128;
            if (i10 % 2 != 0) {
                map.put("fb", currencyIso4217Code);
                throw null;
            }
            map.put("fb", currencyIso4217Code);
            int i11 = g + 109;
            f372a = i11 % 128;
            if (i11 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private void afErrorLog(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = d + 89;
        w = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.copy.AFAdRevenueData();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        if (this.copy.AFAdRevenueData()) {
            int i3 = g + 99;
            f372a = i3 % 128;
            int i4 = i3 % 2;
            map.put("app_set_id", MapsKt.mapOf(TuplesKt.to("app_set_id_disabled", Boolean.TRUE)));
            if (this.copy.toString == null) {
                AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
                return;
            }
            AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
            int i5 = d + 109;
            w = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        AFb1gSDK aFb1gSDK = this.copy.toString;
        if (aFb1gSDK != null) {
            int i6 = g + 113;
            f372a = i6 % 128;
            int i7 = i6 % 2;
            w = (d + 89) % 128;
            map.put("app_set_id", MapsKt.mapOf(TuplesKt.to("scope", Integer.valueOf(aFb1gSDK.AFAdRevenueData)), TuplesKt.to("id", aFb1gSDK.getMonetizationNetwork)));
        }
        int i8 = g + 5;
        f372a = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void toString(Map<String, Object> map) {
        int i = 2 % 2;
        d = (w + 33) % 128;
        if (!((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).isOtherSdkStringDisabled()) {
            int i2 = g + 97;
            f372a = i2 % 128;
            int i3 = i2 % 2;
            d = (w + 69) % 128;
            map.put("batteryLevel", String.valueOf(this.getMediationNetwork.getRevenue(this.getMonetizationNetwork).getRevenue));
            w = (d + 103) % 128;
            int i4 = g + 95;
            f372a = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = f372a + 111;
        g = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void copydefault(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = (d + 33) % 128;
        w = i2;
        int i3 = i2 + 97;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        UiModeManager uiModeManager = (UiModeManager) this.getMonetizationNetwork.getSystemService(UiModeManager.class);
        if (uiModeManager != null) {
            int i4 = g + 71;
            f372a = i4 % 128;
            if (i4 % 2 != 0) {
                if (uiModeManager.getCurrentModeType() != 4) {
                    return;
                }
            } else if (uiModeManager.getCurrentModeType() != 4) {
                return;
            }
            int i5 = g + 43;
            f372a = i5 % 128;
            if (i5 % 2 == 0) {
                map.put("tv", Boolean.TRUE);
            } else {
                map.put("tv", Boolean.TRUE);
                int i6 = 23 / 0;
            }
        }
    }

    private final void hashCode(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = d + 49;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            AFg1kSDK.getMediationNetwork(this.getMonetizationNetwork);
            throw new ArithmeticException();
        }
        if (AFg1kSDK.getMediationNetwork(this.getMonetizationNetwork)) {
            int i3 = f372a + 35;
            g = i3 % 128;
            if (i3 % 2 == 0) {
                map.put("inst_app", Boolean.TRUE);
                w = (d << 123) / 24770;
            } else {
                map.put("inst_app", Boolean.TRUE);
                int i4 = d + 85;
                w = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        int i6 = f372a + 37;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 30 / 0;
        }
    }

    private static void getRevenue(Map<String, Object> map, AFh1rSDK aFh1rSDK) {
        Map map2;
        int i = 2 % 2;
        int i2 = f372a + 11;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        String str = aFh1rSDK.areAllFieldsValid;
        if (str != null) {
            int i4 = f372a + 71;
            g = i4 % 128;
            int i5 = i4 % 2;
            map.put("eventName", str);
            if (aFh1rSDK.getMonetizationNetwork == null) {
                map2 = new HashMap();
            } else {
                map2 = aFh1rSDK.getMonetizationNetwork;
                int i6 = f372a + 97;
                g = i6 % 128;
                int i7 = i6 % 2;
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        int i = 2 % 2;
        int i2 = g + 97;
        f372a = i2 % 128;
        int i3 = i2 % 2;
        AFc1qSDK aFc1qSDK = (AFc1qSDK) objArr[0];
        String str = (String) objArr[1];
        w = (d + 1) % 128;
        String strAFAdRevenueData = aFc1qSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
        if (strAFAdRevenueData == null) {
            aFc1qSDK.getMediationNetwork("CACHED_CHANNEL", str);
            d = (w + 19) % 128;
            return str;
        }
        int i4 = g + 1;
        int i5 = i4 % 128;
        f372a = i5;
        if (i4 % 2 != 0) {
            int i6 = d << 108;
            w = i6 / 1748;
            if ((i6 >> 3) != 0) {
                throw null;
            }
        } else {
            int i7 = d + 27;
            w = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        }
        int i8 = i5 + 101;
        g = i8 % 128;
        if (i8 % 2 != 0) {
            return strAFAdRevenueData;
        }
        throw null;
    }

    private static String getMediationNetwork(String str) {
        int i = 2 % 2;
        int i2 = g + 123;
        f372a = i2 % 128;
        int i3 = i2 % 2;
        w = (d + 91) % 128;
        Object obj = null;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.checkNotNull(objInvoke, "");
            String str2 = (String) objInvoke;
            w = (d + 43) % 128;
            int i4 = g + 71;
            f372a = i4 % 128;
            if (i4 % 2 == 0) {
                return str2;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if ((r1 << 4) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if ((r1 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        r1 = com.appsflyer.internal.AFg1oSDK.g + 41;
        com.appsflyer.internal.AFg1oSDK.f372a = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String AFAdRevenueData(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFg1oSDK.f372a
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.g = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L21
            int r1 = com.appsflyer.internal.AFg1oSDK.d
            int r1 = r1 / 5
            int r2 = r1 % 14495
            com.appsflyer.internal.AFg1oSDK.w = r2
            com.appsflyer.internal.AFc1pSDK r2 = r3.component3
            java.lang.String r4 = r2.getCurrencyIso4217Code(r4)
            int r1 = r1 << 4
            if (r1 != 0) goto L3c
            goto L32
        L21:
            int r1 = com.appsflyer.internal.AFg1oSDK.d
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.w = r2
            com.appsflyer.internal.AFc1pSDK r2 = r3.component3
            java.lang.String r4 = r2.getCurrencyIso4217Code(r4)
            int r1 = r1 % r0
            if (r1 != 0) goto L3c
        L32:
            int r1 = com.appsflyer.internal.AFg1oSDK.g
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.f372a = r2
            int r1 = r1 % r0
            return r4
        L3c:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.AFAdRevenueData(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (kotlin.text.StringsKt.trim((java.lang.CharSequence) r5).toString().length() <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        com.appsflyer.internal.AFg1oSDK.d = (com.appsflyer.internal.AFg1oSDK.w + 107) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        r1 = new java.io.File(kotlin.text.StringsKt.trim((java.lang.CharSequence) r5).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        r5 = com.appsflyer.internal.AFg1oSDK.f372a + 103;
        com.appsflyer.internal.AFg1oSDK.g = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if ((r5 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        r5 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r5).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if ((r1 + 23) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.io.File getCurrencyIso4217Code(java.lang.String r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFg1oSDK.w
            int r1 = r1 + 97
            int r1 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.d = r1
            r2 = 0
            if (r5 == 0) goto L82
            int r3 = com.appsflyer.internal.AFg1oSDK.f372a
            int r3 = r3 + 93
            int r4 = r3 % 128
            com.appsflyer.internal.AFg1oSDK.g = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L25
            int r3 = r1 + 25
            r4 = 7784(0x1e68, float:1.0908E-41)
            int r3 = r3 << r4
            com.appsflyer.internal.AFg1oSDK.w = r3
            int r1 = r1 + 23
            if (r1 != 0) goto L68
            goto L2e
        L25:
            int r1 = r1 + 105
            int r3 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.w = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L68
        L2e:
            r1 = r5
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Throwable -> L7a
            java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r1)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Throwable -> L7a
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L7a
            if (r1 <= 0) goto L82
            int r1 = com.appsflyer.internal.AFg1oSDK.w
            int r1 = r1 + 107
            int r1 = r1 % 128
            com.appsflyer.internal.AFg1oSDK.d = r1
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L7a
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Throwable -> L7a
            java.lang.CharSequence r5 = kotlin.text.StringsKt.trim(r5)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L7a
            int r5 = com.appsflyer.internal.AFg1oSDK.f372a
            int r5 = r5 + 103
            int r3 = r5 % 128
            com.appsflyer.internal.AFg1oSDK.g = r3
            int r5 = r5 % r0
            if (r5 == 0) goto L64
            return r1
        L64:
            r2.hashCode()
            throw r2
        L68:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Throwable -> L7a
            java.lang.CharSequence r5 = kotlin.text.StringsKt.trim(r5)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Throwable -> L7a
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L7a
            r5.<init>()     // Catch: java.lang.Throwable -> L7a
            throw r5     // Catch: java.lang.Throwable -> L7a
        L7a:
            r5 = move-exception
            java.lang.String r1 = r5.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r1, r5)
        L82:
            int r5 = com.appsflyer.internal.AFg1oSDK.g
            int r5 = r5 + 91
            int r1 = r5 % 128
            com.appsflyer.internal.AFg1oSDK.f372a = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L8e
            return r2
        L8e:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.getCurrencyIso4217Code(java.lang.String):java.io.File");
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        InputStreamReader inputStreamReader;
        int i = 2 % 2;
        File file = (File) objArr[0];
        String str = (String) objArr[1];
        Object obj = null;
        try {
            try {
                if (file == null) {
                    int i2 = g + 119;
                    f372a = i2 % 128;
                    if (i2 % 2 != 0) {
                        d = (w - 40) / 28945;
                    } else {
                        d = (w + 43) % 128;
                    }
                    return null;
                }
                try {
                    Properties properties = new Properties();
                    inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                    try {
                        properties.load(inputStreamReader);
                        AFLogger.afInfoLog("Found PreInstall property!");
                        String property = properties.getProperty(str);
                        try {
                            inputStreamReader.close();
                            int i3 = f372a + 59;
                            g = i3 % 128;
                            if (i3 % 2 != 0) {
                                return property;
                            }
                            obj.hashCode();
                            throw null;
                        } catch (Throwable th) {
                            AFLogger.afErrorLog(th.getMessage(), th);
                            return property;
                        }
                    } catch (FileNotFoundException unused) {
                        String absolutePath = file.getAbsolutePath();
                        StringBuilder sb = new StringBuilder("PreInstall file wasn't found: ");
                        sb.append(absolutePath);
                        AFLogger.afDebugLog(sb.toString());
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                            d = (w + 31) % 128;
                            int i4 = g + 109;
                            f372a = i4 % 128;
                            int i5 = i4 % 2;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        AFLogger.afErrorLog(th.getMessage(), th);
                        if (inputStreamReader != null) {
                            int i6 = g + 25;
                            f372a = i6 % 128;
                            if (i6 % 2 != 0) {
                                inputStreamReader.close();
                                obj.hashCode();
                                throw null;
                            }
                            inputStreamReader.close();
                        }
                        return null;
                    }
                } catch (FileNotFoundException unused2) {
                    inputStreamReader = null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = null;
                }
            } catch (Throwable th4) {
                if (inputStreamReader != null) {
                    try {
                        inputStreamReader.close();
                        w = (d + 91) % 128;
                    } catch (Throwable th5) {
                        AFLogger.afErrorLog(th5.getMessage(), th5);
                    }
                }
                throw th4;
            }
        } catch (Throwable th6) {
            AFLogger.afErrorLog(th6.getMessage(), th6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x006e  */
    /* JADX WARN: Code duplicated, block: B:19:0x008b  */
    /* JADX WARN: Code duplicated, block: B:21:0x009c  */
    private final boolean AFKeystoreWrapper() {
        int i = 2 % 2;
        if (((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            w = (d + 115) % 128;
        } else {
            int i2 = f372a + 5;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = w - 48;
                d = i3 * 21009;
                if (i3 % 2 == 0) {
                    if (((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                        w = (d + 115) % 128;
                    } else {
                        if (!(!AFa1tSDK.getCurrencyIso4217Code(this.getMonetizationNetwork))) {
                            int i4 = f372a + 75;
                            int i5 = i4 % 128;
                            g = i5;
                            int i6 = i4 % 2;
                            int i7 = i5 + 21;
                            f372a = i7 % 128;
                            int i8 = i7 % 2;
                            return false;
                        }
                    }
                } else if (((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                    w = (d + 115) % 128;
                } else {
                    if (!(!AFa1tSDK.getCurrencyIso4217Code(this.getMonetizationNetwork))) {
                        int i9 = f372a + 75;
                        int i10 = i9 % 128;
                        g = i10;
                        int i11 = i9 % 2;
                        int i12 = i10 + 21;
                        f372a = i12 % 128;
                        int i13 = i12 % 2;
                        return false;
                    }
                }
            } else {
                int i14 = w + 23;
                d = i14 % 128;
                if (i14 % 2 == 0) {
                    if (((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                        w = (d + 115) % 128;
                    } else {
                        if (!(!AFa1tSDK.getCurrencyIso4217Code(this.getMonetizationNetwork))) {
                            int i15 = f372a + 75;
                            int i16 = i15 % 128;
                            g = i16;
                            int i17 = i15 % 2;
                            int i18 = i16 + 21;
                            f372a = i18 % 128;
                            int i19 = i18 % 2;
                            return false;
                        }
                    }
                } else if (((AppsFlyerProperties) getMediationNetwork(new Object[]{this}, 2080605438, -2080605426, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                    if (!(!AFa1tSDK.getCurrencyIso4217Code(this.getMonetizationNetwork))) {
                        int i110 = f372a + 75;
                        int i111 = i110 % 128;
                        g = i111;
                        int i112 = i110 % 2;
                        int i113 = i111 + 21;
                        f372a = i113 % 128;
                        int i114 = i113 % 2;
                        return false;
                    }
                } else {
                    w = (d + 115) % 128;
                }
            }
        }
        return true;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{47370, 47379, 47422, 47302, 47368, 47366, 47373, 47362, 47375, 47374, 47377, 47360, 47335, 47372, 47365, 47376, 47371, 47361, 47334, 47330, 47423, 47328, 47419, 47364, 47332, 47367};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719604;
        b = true;
        TuitionPaymentFragmentbindingInflater1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, short r8) {
        /*
            int r6 = r6 + 4
            int r8 = r8 + 67
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = com.appsflyer.internal.AFg1oSDK.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1oSDK.$$g(short, int, short):java.lang.String");
    }
}
