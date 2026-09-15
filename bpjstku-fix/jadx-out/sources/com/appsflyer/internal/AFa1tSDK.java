package com.appsflyer.internal;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1lSDK.AnonymousClass5;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.messaging.Constants;
import defpackage.DecorContentParent;
import defpackage.ResolutionInfo;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.text.Typography;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1tSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    static AppsFlyerInAppPurchaseValidatorListener AFAdRevenueData = null;
    private static int AFInAppEventParameterName = 0;
    private static int AFInAppEventType = 1;
    private static int[] AFKeystoreWrapper;
    private static long TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static AFa1tSDK areAllFieldsValid;
    private static int g;
    public static final String getMonetizationNetwork;
    public static final String getRevenue;
    Application component1;
    private Map<Long, String> copydefault;
    private AFf1mSDK equals;
    private SharedPreferences hashCode;
    private boolean toString;
    private static final byte[] $$c = {112, 19, -59, 97};
    private static final int $$f = 8;
    private static int $12 = 0;
    private static int $13 = 1;
    private static final byte[] $$g = {0, -94, -62, -97, 10, -4, -65, 52, -5, 17, -21, 1, 9, -10, -59, 49, 11, -12, 12, -5, -8, -7, -56, 66, 1, -10, -65, 57, 3, 4, -17, 11, -6, -15, 9, -64, 52, 9, -4, -14, 6, 3, -66, 67, -18, 10, -1, -13, -57, 34, 33, -10, -46, 32, 15, -13, 4, -3, -29, 14, 10, -1, -13, -67, 77, -16, 7, -12, -37, 32, 15, -13, 4, -3, -76, 12, -16, 12, 31, -14, 9, -13, 4, -3, -32, 15, 22, -14, -10, 7, 4, -48, 42, -19, 4, 4, -10, 7, 4, -20, 5, 3, -12, 3, 3, -9, -32, 35, -10, 4, -13, 17, -17, 11, -67};
    private static final int $$h = 102;
    private static final byte[] $$d = {30, 17, -35, 104, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$e = 37;
    private static final byte[] $$a = {42, -104, -68, 105, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -36, -19, -4, -10, 8, -8, 0, 22, -22, -15, 11, -8, 0, -15, 0, -17, 34, -19, -4, -10, 8, -8, 0, 26, -39, 6, -11};
    private static final int $$b = 68;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    public volatile AppsFlyerConversionListener getCurrencyIso4217Code = null;
    private long component2 = -1;
    long getMediationNetwork = -1;
    private long component3 = TimeUnit.SECONDS.toMillis(5);
    boolean component4 = false;
    private final AFc1eSDK copy = new AFc1eSDK();

    static void areAllFieldsValid() {
        int i = 2 % 2;
        int i2 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int[] iArr = {1173848566, -581264425, 1049631762, -184971919, -1510845523, 293648529, -317712227, 1299495101, -345507000, 2098071530, -62356939, -1430410937, 823748430, 809610160, -1818352164, -849605125, 1727658104, 1621127117};
        if (i2 % 2 == 0) {
            AFKeystoreWrapper = iArr;
        } else {
            AFKeystoreWrapper = iArr;
            int i3 = 4 / 0;
        }
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
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.appsflyer.internal.AFa1tSDK.$$a
            int r6 = r6 * 19
            int r1 = 33 - r6
            int r8 = r8 * 32
            int r8 = 35 - r8
            int r7 = r7 * 6
            int r7 = 103 - r7
            byte[] r1 = new byte[r1]
            int r6 = 32 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L31:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-2)
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.c(short, byte, short, java.lang.Object[]):void");
    }

    private boolean component1() {
        Object monetizationNetwork;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            objArr[1] = this;
            monetizationNetwork = getMonetizationNetwork(objArr, -1610644480, 1610644503, System.identityHashCode(this));
        } else {
            monetizationNetwork = getMonetizationNetwork(new Object[]{this}, -1610644480, 1610644503, System.identityHashCode(this));
        }
        return ((Boolean) monetizationNetwork).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.appsflyer.internal.AFa1tSDK.$$d
            int r9 = r9 + 4
            int r8 = r8 + 84
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r8 = r9
            r4 = r2
            goto L28
        L11:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
        L28:
            int r9 = r9 + r3
            int r9 = r9 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.d(int, short, short, java.lang.Object[]):void");
    }

    private /* synthetic */ void d_(Context context, Intent intent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        b = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork(new Object[]{this, context, intent}, 507699176, -507699170, System.identityHashCode(this));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public static AFa1tSDK getCurrencyIso4217Code() {
        int i = 2 % 2;
        int i2 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return aFa1tSDK;
    }

    private void getCurrencyIso4217Code(Context context, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        b = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork(new Object[]{this, context, str}, 1659672083, -1659672066, System.identityHashCode(this));
        int i4 = b + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void getCurrencyIso4217Code(Context context, String str, Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[5];
            objArr[0] = this;
            objArr[0] = context;
            objArr[2] = str;
            objArr[4] = map;
            getMonetizationNetwork(objArr, 1732368696, -1732368678, System.identityHashCode(this));
        } else {
            getMonetizationNetwork(new Object[]{this, context, str, map}, 1732368696, -1732368678, System.identityHashCode(this));
        }
        int i3 = b + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void getCurrencyIso4217Code(String str, String str2) {
        int i = 2 % 2;
        int i2 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork(new Object[]{str, str2}, -692563571, 692563575, (int) System.currentTimeMillis());
        int i4 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static boolean getCurrencyIso4217Code(Context context) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getMonetizationNetwork(new Object[]{context}, -1675611583, 1675611591, (int) System.currentTimeMillis())).booleanValue();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        b = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static int getMonetizationNetwork(AFc1qSDK aFc1qSDK, boolean z) {
        Object monetizationNetwork;
        int i = 2 % 2;
        int i2 = b + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[3];
            objArr[0] = aFc1qSDK;
            objArr[0] = Boolean.valueOf(z);
            monetizationNetwork = getMonetizationNetwork(objArr, -1175980247, 1175980268, (int) System.currentTimeMillis());
        } else {
            monetizationNetwork = getMonetizationNetwork(new Object[]{aFc1qSDK, Boolean.valueOf(z)}, -1175980247, 1175980268, (int) System.currentTimeMillis());
        }
        return ((Integer) monetizationNetwork).intValue();
    }

    private static void getRevenue(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            getMonetizationNetwork(new Object[]{str}, 998031041, -998031039, (int) System.currentTimeMillis());
            return;
        }
        Object[] objArr = new Object[0];
        objArr[1] = str;
        getMonetizationNetwork(objArr, 998031041, -998031039, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.appsflyer.internal.AFa1tSDK.$$g
            int r8 = r8 * 37
            int r8 = r8 + 38
            int r7 = r7 * 15
            int r7 = 99 - r7
            int r6 = r6 * 74
            int r6 = 78 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r5 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r6]
        L28:
            int r7 = r7 + r3
            int r7 = r7 + 2
            int r6 = r6 + 1
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.h(short, short, int, java.lang.Object[]):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            getMonetizationNetwork(new Object[]{this, str, map}, 1307261109, -1307261102, System.identityHashCode(this));
            return;
        }
        Object[] objArr = {this, str};
        objArr[4] = map;
        getMonetizationNetwork(objArr, 1307261109, -1307261102, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void disableAppSetId() {
        int i = 2 % 2;
        int i2 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[1];
            objArr[1] = this;
            getMonetizationNetwork(objArr, -2040336732, 2040336751, System.identityHashCode(this));
        } else {
            getMonetizationNetwork(new Object[]{this}, -2040336732, 2040336751, System.identityHashCode(this));
        }
        int i3 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        int i = 2 % 2;
        int i2 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getMonetizationNetwork(new Object[]{this, context}, -1689317276, 1689317287, System.identityHashCode(this));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    final void getRevenue(AFh1rSDK aFh1rSDK) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            getMonetizationNetwork(new Object[]{this, aFh1rSDK}, 974724333, -974724320, System.identityHashCode(this));
            return;
        }
        Object[] objArr = new Object[4];
        objArr[1] = this;
        objArr[1] = aFh1rSDK;
        getMonetizationNetwork(objArr, 974724333, -974724320, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        int i = 2 % 2;
        int i2 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerLib appsFlyerLib = (AppsFlyerLib) getMonetizationNetwork(new Object[]{this, str, appsFlyerConversionListener, context}, -235242605, 235242617, System.identityHashCode(this));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return appsFlyerLib;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        Object monetizationNetwork;
        int i = 2 % 2;
        int i2 = b + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[1];
            objArr[1] = this;
            monetizationNetwork = getMonetizationNetwork(objArr, -1621727139, 1621727154, System.identityHashCode(this));
        } else {
            monetizationNetwork = getMonetizationNetwork(new Object[]{this}, -1621727139, 1621727154, System.identityHashCode(this));
        }
        return ((Boolean) monetizationNetwork).booleanValue();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i = 2 % 2;
        int i2 = b + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[3];
            objArr[1] = this;
            objArr[1] = context;
            getMonetizationNetwork(objArr, -1480636038, 1480636052, System.identityHashCode(this));
        } else {
            getMonetizationNetwork(new Object[]{this, context}, -1480636038, 1480636052, System.identityHashCode(this));
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[5];
            objArr[0] = this;
            objArr[0] = map;
            getMonetizationNetwork(objArr, -2145945282, 2145945283, System.identityHashCode(this));
        } else {
            getMonetizationNetwork(new Object[]{this, map}, -2145945282, 2145945283, System.identityHashCode(this));
        }
        int i3 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        b = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork(new Object[]{this, Boolean.valueOf(z)}, 2015599714, -2015599705, System.identityHashCode(this));
        int i4 = b + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        b = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork(new Object[]{this, str, map}, 841587779, -841587759, System.identityHashCode(this));
        int i4 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        int i = 2 % 2;
        int i2 = b + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork(new Object[]{this, emailsCryptType, strArr}, -363126917, 363126927, System.identityHashCode(this));
        int i4 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        b = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork(new Object[]{this, strArr}, 1505056603, -1505056581, System.identityHashCode(this));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            getMonetizationNetwork(new Object[]{this, context, str}, -1758296594, 1758296610, System.identityHashCode(this));
            return;
        }
        Object[] objArr = new Object[4];
        objArr[0] = this;
        objArr[1] = context;
        objArr[3] = str;
        getMonetizationNetwork(objArr, -1758296594, 1758296610, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str, AppsFlyerRequestListener appsFlyerRequestListener) {
        int i = 2 % 2;
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[5];
            objArr[0] = this;
            objArr[0] = context;
            objArr[2] = str;
            objArr[2] = appsFlyerRequestListener;
            getMonetizationNetwork(objArr, -1542206359, 1542206364, System.identityHashCode(this));
        } else {
            getMonetizationNetwork(new Object[]{this, context, str, appsFlyerRequestListener}, -1542206359, 1542206364, System.identityHashCode(this));
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        int i = 2 % 2;
        int i2 = b + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        getMonetizationNetwork(new Object[]{this, context, str, str2, str3, str4, str5, map}, 203099708, -203099705, System.identityHashCode(this));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.myPid() >> 22) + 19472), TextUtils.indexOf("", "", 0) + 2624, 13 - KeyEvent.keyCodeFromString(""), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                try {
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 39422), 480 - TextUtils.lastIndexOf("", '0', 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i4 = $13 + 61;
            $12 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39421), View.MeasureSpec.makeMeasureSpec(0, 0) + 481, Process.getGidForName("") + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
        int i6 = $12 + 7;
        $13 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 14 / 0;
        }
    }

    static {
        g = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        areAllFieldsValid();
        getMonetizationNetwork = "348";
        getRevenue = "6.17";
        AFAdRevenueData = null;
        areAllFieldsValid = new AFa1tSDK();
        AFInAppEventType = (AFInAppEventParameterName + 83) % 128;
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        g = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0178  */
    /* JADX WARN: Code duplicated, block: B:33:0x0179  */
    private static void f(char[] cArr, boolean z, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            j = 0;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i) {
                break;
            }
            int i6 = $12 + 113;
            $13 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i2 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 3292, 31 - Color.alpha(0), 1199271174, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), 651 - (ViewConfiguration.getScrollBarSize() >> 8), ((Process.getThreadPriority(0) + 20) >> 6) + 44, -450685997, false, $$i(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i9 = $13 + 59;
            $12 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i11 = $13 + 79;
            $12 = i11 % 128;
            int i12 = i11 % 2;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
                int i13 = $12 + 91;
                $13 = i13 % 128;
                int i14 = i13 % 2;
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 652, 44 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), -450685997, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
                j = 0;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = AFKeystoreWrapper;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = ($11 + 113) % 128;
                $10 = i4;
                iArr3[i3] = (int) (((long) iArr2[i3]) ^ 3670241895213185600L);
                i3++;
                $11 = (i4 + 83) % 128;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AFKeystoreWrapper;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i5 = 0; i5 < length3; i5++) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
                b = i6 % 128;
                int i7 = i6 % 2;
                iArr6[i5] = (int) (((long) iArr5[i5]) ^ 3670241895213185600L);
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1kSDK.getCurrencyIso4217Code = 0;
        int i8 = $11 + 21;
        $10 = i8 % 128;
        while (true) {
            int i9 = i8 % 2;
            if (aFk1kSDK.getCurrencyIso4217Code >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr[0] = (char) (iArr[aFk1kSDK.getCurrencyIso4217Code] >> 16);
            cArr[1] = (char) iArr[aFk1kSDK.getCurrencyIso4217Code];
            cArr[2] = (char) (iArr[aFk1kSDK.getCurrencyIso4217Code + 1] >> 16);
            cArr[3] = (char) iArr[aFk1kSDK.getCurrencyIso4217Code + 1];
            aFk1kSDK.AFAdRevenueData = (cArr[0] << 16) + cArr[1];
            aFk1kSDK.getMonetizationNetwork = (cArr[2] << 16) + cArr[3];
            AFk1kSDK.getMediationNetwork(iArr4);
            for (int i10 = 0; i10 < 16; i10++) {
                $11 = ($10 + 47) % 128;
                aFk1kSDK.AFAdRevenueData ^= iArr4[i10];
                aFk1kSDK.getMonetizationNetwork = AFk1kSDK.AFAdRevenueData(aFk1kSDK.AFAdRevenueData) ^ aFk1kSDK.getMonetizationNetwork;
                int i11 = aFk1kSDK.AFAdRevenueData;
                aFk1kSDK.AFAdRevenueData = aFk1kSDK.getMonetizationNetwork;
                aFk1kSDK.getMonetizationNetwork = i11;
            }
            int i12 = aFk1kSDK.AFAdRevenueData;
            aFk1kSDK.AFAdRevenueData = aFk1kSDK.getMonetizationNetwork;
            aFk1kSDK.getMonetizationNetwork = i12;
            aFk1kSDK.getMonetizationNetwork ^= iArr4[16];
            aFk1kSDK.AFAdRevenueData ^= iArr4[17];
            int i13 = aFk1kSDK.AFAdRevenueData;
            int i14 = aFk1kSDK.getMonetizationNetwork;
            cArr[0] = (char) (aFk1kSDK.AFAdRevenueData >>> 16);
            cArr[1] = (char) aFk1kSDK.AFAdRevenueData;
            cArr[2] = (char) (aFk1kSDK.getMonetizationNetwork >>> 16);
            cArr[3] = (char) aFk1kSDK.getMonetizationNetwork;
            AFk1kSDK.getMediationNetwork(iArr4);
            cArr2[aFk1kSDK.getCurrencyIso4217Code * 2] = cArr[0];
            cArr2[(aFk1kSDK.getCurrencyIso4217Code * 2) + 1] = cArr[1];
            cArr2[(aFk1kSDK.getCurrencyIso4217Code * 2) + 2] = cArr[2];
            cArr2[(aFk1kSDK.getCurrencyIso4217Code * 2) + 3] = cArr[3];
            aFk1kSDK.getCurrencyIso4217Code += 2;
            i8 = b + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if ((r2 << 5) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if ((r2 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r1 = r1 + 123;
        com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFc1dSDK AFAdRevenueData() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r2 = r1 + 65
            int r3 = r2 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L23
            int r2 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r3 = r2 >> 109
            int r3 = r3 % 9115
            com.appsflyer.internal.AFc1eSDK r3 = r5.copy
            int r2 = r2 + 74
            r4 = 20589(0x506d, float:2.8851E-41)
            int r4 = r2 << r4
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r4
            int r2 = r2 << 5
            if (r2 == 0) goto L3e
            goto L36
        L23:
            int r2 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r3 = r2 + 61
            int r3 = r3 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r3
            com.appsflyer.internal.AFc1eSDK r3 = r5.copy
            int r2 = r2 + 85
            int r4 = r2 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L3e
        L36:
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            return r3
        L3e:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.AFAdRevenueData():com.appsflyer.internal.AFc1dSDK");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d A[PHI: r1
  0x002d: PHI (r1v6 com.appsflyer.internal.AFc1iSDK) = (r1v5 com.appsflyer.internal.AFc1iSDK), (r1v10 com.appsflyer.internal.AFc1iSDK) binds: [B:10:0x002b, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public final void getMediationNetwork(Context context) {
        AFc1iSDK aFc1iSDK;
        int i = 2 % 2;
        int i2 = AFInAppEventType;
        AFInAppEventParameterName = (i2 + 121) % 128;
        AFc1eSDK aFc1eSDK = this.copy;
        if (context != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                AFInAppEventParameterName = i2 + 28345;
                aFc1iSDK = aFc1eSDK.AFAdRevenueData;
                if (context != null) {
                    AFInAppEventType = (AFInAppEventParameterName + 117) % 128;
                    aFc1iSDK.getMonetizationNetwork = context.getApplicationContext();
                    int i4 = AFInAppEventParameterName + 19;
                    AFInAppEventType = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
                    b = i6 % 128;
                    int i7 = i6 % 2;
                }
            } else {
                AFInAppEventParameterName = (i2 + 113) % 128;
                aFc1iSDK = aFc1eSDK.AFAdRevenueData;
                if (context != null) {
                    AFInAppEventType = (AFInAppEventParameterName + 117) % 128;
                    aFc1iSDK.getMonetizationNetwork = context.getApplicationContext();
                    int i8 = AFInAppEventParameterName + 19;
                    AFInAppEventType = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
                    b = i10 % 128;
                    int i11 = i10 % 2;
                }
            }
        }
        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        b = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e A[PHI: r1
  0x002e: PHI (r1v8 com.appsflyer.internal.AFc1dSDK) = (r1v7 com.appsflyer.internal.AFc1dSDK), (r1v13 com.appsflyer.internal.AFc1dSDK) binds: [B:8:0x002c, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    private /* synthetic */ void getCurrencyIso4217Code(AFf1nSDK aFf1nSDK) {
        AFc1dSDK aFc1dSDKAFAdRevenueData;
        int i;
        int i2 = 2 % 2;
        int i3 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            AFInAppEventParameterName = AFInAppEventType >>> 4643;
            aFc1dSDKAFAdRevenueData = AFAdRevenueData();
            if (aFf1nSDK == AFf1nSDK.SUCCESS) {
                i = AFInAppEventParameterName + 75;
                AFInAppEventType = i % 128;
                if (i % 2 != 0) {
                    aFc1dSDKAFAdRevenueData.afRDLog().getCurrencyIso4217Code();
                    throw null;
                }
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                b = i4 % 128;
                int i5 = i4 % 2;
                aFc1dSDKAFAdRevenueData.afRDLog().getCurrencyIso4217Code();
            }
        } else {
            AFInAppEventParameterName = (AFInAppEventType + 1) % 128;
            aFc1dSDKAFAdRevenueData = AFAdRevenueData();
            if (aFf1nSDK == AFf1nSDK.SUCCESS) {
                i = AFInAppEventParameterName + 75;
                AFInAppEventType = i % 128;
                if (i % 2 != 0) {
                    aFc1dSDKAFAdRevenueData.afRDLog().getCurrencyIso4217Code();
                    throw null;
                }
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                b = i6 % 128;
                int i7 = i6 % 2;
                aFc1dSDKAFAdRevenueData.afRDLog().getCurrencyIso4217Code();
            }
        }
        if (!(!aFc1dSDKAFAdRevenueData.copy().getMonetizationNetwork())) {
            int i8 = b + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            int i9 = i8 % 2;
            aFc1dSDKAFAdRevenueData.v().AFAdRevenueData();
            return;
        }
        AFInAppEventParameterName = (AFInAppEventType + 69) % 128;
        aFc1dSDKAFAdRevenueData.v().getMediationNetwork();
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    final AFf1mSDK getMonetizationNetwork() {
        AFf1mSDK aFf1mSDK;
        synchronized (this) {
            int i = AFInAppEventType + 17;
            AFInAppEventParameterName = i % 128;
            if (i % 2 == 0) {
                if (this.equals == null) {
                    this.equals = new AFf1mSDK() { // from class: com.appsflyer.internal.AFa1tSDK$$ExternalSyntheticLambda3
                        @Override // com.appsflyer.internal.AFf1mSDK
                        public final void onRemoteConfigUpdateFinished(AFf1nSDK aFf1nSDK) {
                            AFa1tSDK.$r8$lambda$DtqUaIgQQ0uS9RC3fGV_uljmFrg(this.f$0, aFf1nSDK);
                        }
                    };
                    int i2 = AFInAppEventType + 119;
                    AFInAppEventParameterName = i2 % 128;
                    int i3 = i2 % 2;
                }
                aFf1mSDK = this.equals;
            } else {
                throw new NullPointerException();
            }
        }
        return aFf1mSDK;
    }

    public AFa1tSDK() {
        AFAdRevenueData().v().AFAdRevenueData();
        AFAdRevenueData().v().getMonetizationNetwork();
        AFe1lSDK aFe1lSDKCopydefault = AFAdRevenueData().copydefault();
        aFe1lSDKCopydefault.AFAdRevenueData.add(new AFa1vSDK());
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        int i = 2 % 2;
        int i2 = AFInAppEventParameterName + 35;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException();
        }
        if (uri != null) {
            int i3 = b + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            if (!uri.toString().isEmpty()) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (context != null) {
                    getMediationNetwork(context);
                    AFAdRevenueData().d().f_(AFa1jSDK.getCurrencyIso4217Code(AFAdRevenueData().afVerboseLog()), Uri.parse(uri.toString()));
                    AFInAppEventParameterName = (AFInAppEventType + 113) % 128;
                    return;
                }
                AFa1oSDK aFa1oSDKD = AFAdRevenueData().d();
                StringBuilder sb = new StringBuilder("Context is \"");
                sb.append(context);
                sb.append("\"");
                aFa1oSDKD.AFAdRevenueData(sb.toString(), DeepLinkResult.Error.NETWORK);
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
                b = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
        }
        AFa1oSDK aFa1oSDKD2 = AFAdRevenueData().d();
        StringBuilder sb2 = new StringBuilder("Link is \"");
        sb2.append(uri);
        sb2.append("\"");
        aFa1oSDKD2.AFAdRevenueData(sb2.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        b = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType = (AFInAppEventParameterName + 9) % 128;
        setSharingFilterForPartners(strArr);
        int i4 = AFInAppEventParameterName + 9;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i = 2 % 2;
        int i2 = b + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = AFInAppEventType + 87;
        AFInAppEventParameterName = i4 % 128;
        int i5 = i4 % 2;
        setSharingFilterForPartners("all");
        int i6 = AFInAppEventParameterName + 27;
        AFInAppEventType = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        int i7 = b + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 41 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        int i = 2 % 2;
        AFAdRevenueData().afInfoLog().getRevenue = new AFb1uSDK(strArr);
        AFInAppEventParameterName = (AFInAppEventType + 77) % 128;
        int i2 = b + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0042 A[PHI: r3
  0x0042: PHI (r3v6 com.appsflyer.PurchaseHandler) = (r3v5 com.appsflyer.PurchaseHandler), (r3v13 com.appsflyer.PurchaseHandler) binds: [B:8:0x0040, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) throws Throwable {
        PurchaseHandler purchaseHandlerComponent4;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = AFInAppEventParameterName + 101;
        AFInAppEventType = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            getMediationNetwork(context);
            purchaseHandlerComponent4 = AFAdRevenueData().component4();
            String[] strArr = new String[0];
            strArr[0] = "purchases";
            if (purchaseHandlerComponent4.AFAdRevenueData(map, purchaseValidationCallback, strArr)) {
                AFe1cSDK aFe1cSDK = new AFe1cSDK(map, purchaseValidationCallback, purchaseHandlerComponent4.getCurrencyIso4217Code);
                AFe1lSDK aFe1lSDK = purchaseHandlerComponent4.getRevenue;
                aFe1lSDK.getRevenue.execute(aFe1lSDK.new AnonymousClass5(aFe1cSDK));
            }
        } else {
            getMediationNetwork(context);
            purchaseHandlerComponent4 = AFAdRevenueData().component4();
            if (purchaseHandlerComponent4.AFAdRevenueData(map, purchaseValidationCallback, "purchases")) {
                AFe1cSDK aFe1cSDK2 = new AFe1cSDK(map, purchaseValidationCallback, purchaseHandlerComponent4.getCurrencyIso4217Code);
                AFe1lSDK aFe1lSDK2 = purchaseHandlerComponent4.getRevenue;
                aFe1lSDK2.getRevenue.execute(aFe1lSDK2.new AnonymousClass5(aFe1cSDK2));
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 29944);
            int i4 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
            int iAlpha = 23 - Color.alpha(0);
            byte[] bArr = $$d;
            byte b2 = (byte) (bArr[33] - 1);
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            d(b2, b3, (short) (b3 | 155), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, i4, iAlpha, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        f(new char[]{6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1}, true, 'F' - AndroidCharacter.getMirror('0'), TextUtils.getOffsetAfter("", 0) + 234, 6 - TextUtils.indexOf("", "", 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        f(new char[]{65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5}, false, 15 - (ViewConfiguration.getPressedStateDuration() >> 16), View.MeasureSpec.getMode(0) + 238, ExpandableListView.getPackedPositionGroup(0L) + 13, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1755;
            int i5 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
            byte[] bArr2 = $$d;
            byte b4 = bArr2[7];
            Object[] objArr5 = new Object[1];
            d(b4, b4, bArr2[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity, packedPositionType, i5, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
                int i6 = 1756 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i7 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte b5 = $$d[7];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                d(b5, b6, (short) (b6 | 103), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i6, i7, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i8 = ((int[]) objArr7[0])[0];
            objArr = new Object[]{new int[]{i8}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ((((-345238589) + (((~(140964129 | iIdentityHashCode)) | 67177496) * (-140))) + ((~(208141625 | iIdentityHashCode)) * 70)) + (((~(iIdentityHashCode | 71638296)) | 203680825) * 70)) - 731772779;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{39561, 13733, 50395, 38903, 9809, 61772, 32872, 20636, 58300, 45714, 19766, 7223, 44868, 32364, 3748, 55751}, 44838 - MotionEvent.axisFromString(""), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{39562, 29148, 19504, 22684, 14331, 589, 7861, 62951, 49267, 56497, 43806, 34402, 37604, 26899, 17533, 20691}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 60251, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {941996711};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 42050), 1726 - (KeyEvent.getMaxKeyCode() >> 16), 28 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -731772779);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
                    int mode = View.MeasureSpec.getMode(0) + 1755;
                    int iArgb = 23 - Color.argb(0, 0, 0, 0);
                    byte b7 = $$d[7];
                    byte b8 = b7;
                    Object[] objArr11 = new Object[1];
                    d(b7, b8, (short) (b8 | 103), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, mode, iArgb, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr12 = new Object[1];
                    f(new char[]{6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1}, true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, 234 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 6 - (Process.myPid() >> 22), objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    f(new char[]{65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5}, false, TextUtils.indexOf("", "") + 15, 238 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cGreen = (char) (Color.green(0) + 29944);
                        int iResolveSize = 1755 - View.resolveSize(0, 0);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
                        byte[] bArr3 = $$d;
                        byte b9 = bArr3[7];
                        Object[] objArr14 = new Object[1];
                        d(b9, b9, bArr3[5], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, iResolveSize, scrollBarFadeDuration, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
                        int gidForName = 22 - Process.getGidForName("");
                        byte[] bArr4 = $$d;
                        byte b10 = (byte) (bArr4[33] - 1);
                        byte b11 = bArr4[7];
                        Object[] objArr15 = new Object[1];
                        d(b10, b11, (short) (b11 | 155), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(jumpTapTimeout, iCombineMeasuredStates, gidForName, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[4];
            if (strArr2 == null) {
                throw null;
            }
            int i12 = b + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
            int i13 = i12 % 2;
            while (i3 < strArr2.length) {
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                b = i14 % 128;
                if (i14 % 2 == 0) {
                    arrayList.add(strArr2[i3]);
                    i3 += 49;
                } else {
                    arrayList.add(strArr2[i3]);
                    i3++;
                }
            }
            throw null;
        }
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        b = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((int[]) objArr[3])[0];
        int i18 = ((int[]) objArr[0])[0];
        Object[] objArr16 = {new int[]{i18}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
        int iMyTid = Process.myTid();
        int i19 = ~((-78708891) | iMyTid);
        int i20 = ~iMyTid;
        int i21 = i17 + (-1907975030) + ((i19 | (~((-54659329) | i20))) * 497) + (((~(iMyTid | (-54659329))) | (~((-79234208) | i20)) | 525317) * 497);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        Object obj = objArr16[3];
        ((int[]) obj)[0] = i23 ^ (i23 << 5);
        int i24 = AFInAppEventParameterName + 27;
        int i25 = ((int[]) obj)[0];
        int i26 = i25 * i25;
        int i27 = -(310107238 * i25);
        int i28 = (i26 & i27) + (i26 | i27);
        int i29 = -(i25 * (-362146262));
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        int i31 = (i30 & (-690150336)) + ((-690150336) | i30);
        int i32 = ((i31 >> 16) - 131071) / 65536;
        int i33 = (i31 - (~((i32 & 1) + (i32 | 1)))) - 1;
        int i34 = i31 >> 29;
        int i35 = ((i34 & (-15)) + (i34 | (-15))) / 8;
        int i36 = -(i33 ^ ((i35 ^ 1) + ((i35 & 1) << 1)));
        int i37 = ((i36 | 6) << 1) - (i36 ^ 6);
        int i38 = i37 >> 24;
        int i39 = ((i38 ^ (-511)) + ((i38 & (-511)) << 1)) / 256;
        AFInAppEventType = i24 % (1109760 / (((-(((i39 & 1) + (1 | i39)) + 1)) & i37) * 1445));
        if (i24 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        int i = 2 % 2;
        int i2 = b + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        String str = (String) objArr[1];
        Map<String, String> map = (Map) objArr[2];
        AFInAppEventType = (AFInAppEventParameterName + 123) % 128;
        AFa1oSDK aFa1oSDKD = aFa1tSDK.AFAdRevenueData().d();
        aFa1oSDKD.getCurrencyIso4217Code = str;
        aFa1oSDKD.getRevenue = map;
        int i4 = AFInAppEventParameterName + 103;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        b = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName = (AFInAppEventType + 47) % 128;
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        AFInAppEventParameterName = (AFInAppEventType + 3) % 128;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        b = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType = (AFInAppEventParameterName + 7) % 128;
        AFAdRevenueData().d().getMonetizationNetwork = deepLinkListener;
        AFAdRevenueData().d().component3 = j;
        AFInAppEventParameterName = (AFInAppEventType + 7) % 128;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r5 = r5 + 61;
        com.appsflyer.internal.AFa1tSDK.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if ((r5 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        AFAdRevenueData().d().AFAdRevenueData("performOnDeepLinking was called with null intent", com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR);
        r7 = 42 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        AFAdRevenueData().d().AFAdRevenueData("performOnDeepLinking was called with null intent", com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        r7 = com.appsflyer.internal.AFa1tSDK.b + 111;
        com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if ((r7 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r8 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        r2 = r2 + 55;
        com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2 % 128;
        r2 = r2 % 2;
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = (r1 + 29) % 128;
        AFAdRevenueData().d().AFAdRevenueData("performOnDeepLinking was called with null context", com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        r8 = r8.getApplicationContext();
        getMediationNetwork(r8);
        AFAdRevenueData().getMonetizationNetwork().execute(new com.appsflyer.internal.AFa1tSDK$$ExternalSyntheticLambda5(r6, r8, r7));
        r7 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType + 59;
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        if ((r7 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r7 == null) goto L10;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performOnDeepLinking(final android.content.Intent r7, android.content.Context r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r2 = r1 + 55
            int r3 = r2 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto La0
            int r2 = com.appsflyer.internal.AFa1tSDK.b
            int r4 = r2 + 105
            int r5 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L21
            r4 = 17
            int r4 = r4 / 0
            if (r7 != 0) goto L5d
            goto L23
        L21:
            if (r7 != 0) goto L5d
        L23:
            int r5 = r5 + 61
            int r7 = r5 % 128
            com.appsflyer.internal.AFa1tSDK.b = r7
            int r5 = r5 % r0
            java.lang.String r7 = "performOnDeepLinking was called with null intent"
            if (r5 != 0) goto L40
            com.appsflyer.internal.AFc1dSDK r8 = r6.AFAdRevenueData()
            com.appsflyer.internal.AFa1oSDK r8 = r8.d()
            com.appsflyer.deeplink.DeepLinkResult$Error r1 = com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR
            r8.AFAdRevenueData(r7, r1)
            r7 = 42
            int r7 = r7 / 0
            goto L4d
        L40:
            com.appsflyer.internal.AFc1dSDK r8 = r6.AFAdRevenueData()
            com.appsflyer.internal.AFa1oSDK r8 = r8.d()
            com.appsflyer.deeplink.DeepLinkResult$Error r1 = com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR
            r8.AFAdRevenueData(r7, r1)
        L4d:
            int r7 = com.appsflyer.internal.AFa1tSDK.b
            int r7 = r7 + 111
            int r8 = r7 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r8
            int r7 = r7 % r0
            if (r7 != 0) goto L59
            return
        L59:
            r3.hashCode()
            throw r3
        L5d:
            if (r8 != 0) goto L7c
            int r2 = r2 + 55
            int r7 = r2 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r7
            int r2 = r2 % r0
            int r1 = r1 + 29
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r1
            com.appsflyer.internal.AFc1dSDK r7 = r6.AFAdRevenueData()
            com.appsflyer.internal.AFa1oSDK r7 = r7.d()
            java.lang.String r8 = "performOnDeepLinking was called with null context"
            com.appsflyer.deeplink.DeepLinkResult$Error r0 = com.appsflyer.deeplink.DeepLinkResult.Error.DEVELOPER_ERROR
            r7.AFAdRevenueData(r8, r0)
            return
        L7c:
            android.content.Context r8 = r8.getApplicationContext()
            r6.getMediationNetwork(r8)
            com.appsflyer.internal.AFc1dSDK r1 = r6.AFAdRevenueData()
            java.util.concurrent.ExecutorService r1 = r1.getMonetizationNetwork()
            com.appsflyer.internal.AFa1tSDK$$ExternalSyntheticLambda5 r2 = new com.appsflyer.internal.AFa1tSDK$$ExternalSyntheticLambda5
            r2.<init>()
            r1.execute(r2)
            int r7 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r7 = r7 + 59
            int r8 = r7 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r8
            int r7 = r7 % r0
            if (r7 != 0) goto L9f
            return
        L9f:
            throw r3
        La0:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.performOnDeepLinking(android.content.Intent, android.content.Context):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i = 2 % 2;
        AFInAppEventParameterName = (AFInAppEventType + 41) % 128;
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = AFAdRevenueData().d().getMediationNetwork;
        Object obj = null;
        if (!list.contains(listAsList)) {
            int i2 = b + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                list.add(listAsList);
            } else {
                list.add(listAsList);
                obj.hashCode();
                throw null;
            }
        }
        AFInAppEventType = (AFInAppEventParameterName + 33) % 128;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        int i = 2 % 2;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = AFInAppEventParameterName + 29;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(zBooleanValue)));
            throw new ArithmeticException();
        }
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(zBooleanValue)));
        AFb1jSDK.getRevenue = Boolean.valueOf(true ^ zBooleanValue);
        AFc1dSDK aFc1dSDKAFAdRevenueData = aFa1tSDK.AFAdRevenueData();
        aFc1dSDKAFAdRevenueData.afInfoLog().areAllFieldsValid = zBooleanValue;
        Object obj = null;
        if (zBooleanValue) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                aFc1dSDKAFAdRevenueData.afInfoLog().component3 = null;
                return null;
            }
            aFc1dSDKAFAdRevenueData.afInfoLog().component3 = null;
            int i4 = 33 / 0;
            return null;
        }
        AFe1lSDK aFe1lSDKCopydefault = aFc1dSDKAFAdRevenueData.copydefault();
        aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(new AFe1eSDK(aFa1tSDK.AFAdRevenueData())));
        int i5 = AFInAppEventParameterName + 57;
        AFInAppEventType = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = b + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            AFInAppEventType = (AFInAppEventParameterName / 76) % 22477;
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
            getCurrencyIso4217Code(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
            i = (AFInAppEventType % 122) >>> 2845;
        } else {
            AFInAppEventType = (AFInAppEventParameterName + 61) % 128;
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
            getCurrencyIso4217Code(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
            i = (AFInAppEventType + 19) % 128;
        }
        AFInAppEventParameterName = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005b, code lost:
    
        if ((r3 + 5) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if ((r3 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        r4 = r4 + 79;
        com.appsflyer.internal.AFa1tSDK.b = r4 % 128;
        r4 = r4 % 2;
        getRevenue(r8).getMediationNetwork("referrer", r1);
        r9 = com.appsflyer.AppsFlyerProperties.getInstance();
        r9.set("AF_REFERRER", r1);
        r9.getMediationNetwork = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
    
        if (com.appsflyer.AppsFlyerProperties.getInstance().AFAdRevenueData() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008a, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("onReceive: isLaunchCalled");
        getCurrencyIso4217Code(r8, com.appsflyer.internal.AFh1xSDK.onReceive);
        getMediationNetwork(r1);
        r8 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        com.appsflyer.internal.AFa1tSDK.b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:
    
        getRevenue(r8).getMediationNetwork("referrer", r1);
        r8 = com.appsflyer.AppsFlyerProperties.getInstance();
        r8.set("AF_REFERRER", r1);
        r8.getMediationNetwork = r1;
        com.appsflyer.AppsFlyerProperties.getInstance().AFAdRevenueData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b8, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b_(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            com.appsflyer.internal.AFj1jSDK r1 = new com.appsflyer.internal.AFj1jSDK
            r1.<init>(r9)
            java.lang.String r9 = "appsflyer_preinstall"
            java.lang.String r2 = r1.getRevenue(r9)
            if (r2 == 0) goto L26
            java.lang.String r9 = r1.getRevenue(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            long r2 = java.lang.System.currentTimeMillis()
            int r2 = (int) r2
            r3 = 998031041(0x3b7cbec1, float:0.0038565847)
            r4 = -998031039(0xffffffffc4834141, float:-1050.0392)
            getMonetizationNetwork(r9, r3, r4, r2)
        L26:
            java.lang.String r9 = "****** onReceive called *******"
            com.appsflyer.AFLogger.afInfoLog(r9)
            com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r9 = "referrer"
            java.lang.String r1 = r1.getRevenue(r9)
            java.lang.String r2 = "Play store referrer: "
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r2 = r2.concat(r3)
            com.appsflyer.AFLogger.afInfoLog(r2)
            r2 = 0
            if (r1 == 0) goto Lb9
            int r3 = com.appsflyer.internal.AFa1tSDK.b
            int r3 = r3 + 67
            int r4 = r3 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r4
            int r3 = r3 % r0
            java.lang.String r5 = "AF_REFERRER"
            if (r3 == 0) goto L5e
            int r3 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r3 = r3 >> 70
            int r6 = r3 + (-16497)
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r6
            int r3 = r3 + 5
            if (r3 == 0) goto La1
            goto L69
        L5e:
            int r3 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r3 = r3 + 41
            int r6 = r3 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r6
            int r3 = r3 % r0
            if (r3 == 0) goto La1
        L69:
            int r4 = r4 + 79
            int r3 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.b = r3
            int r4 = r4 % r0
            com.appsflyer.internal.AFc1qSDK r3 = r7.getRevenue(r8)
            r3.getMediationNetwork(r9, r1)
            com.appsflyer.AppsFlyerProperties r9 = com.appsflyer.AppsFlyerProperties.getInstance()
            r9.set(r5, r1)
            r9.getMediationNetwork = r1
            com.appsflyer.AppsFlyerProperties r9 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r9 = r9.AFAdRevenueData()
            if (r9 == 0) goto Lb9
            java.lang.String r9 = "onReceive: isLaunchCalled"
            com.appsflyer.AFLogger.afInfoLog(r9)
            com.appsflyer.internal.AFh1xSDK r9 = com.appsflyer.internal.AFh1xSDK.onReceive
            r7.getCurrencyIso4217Code(r8, r9)
            r7.getMediationNetwork(r1)
            int r8 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r8 = r8 + 107
            int r9 = r8 % 128
            com.appsflyer.internal.AFa1tSDK.b = r9
            int r8 = r8 % r0
            goto Lb9
        La1:
            com.appsflyer.internal.AFc1qSDK r8 = r7.getRevenue(r8)
            r8.getMediationNetwork(r9, r1)
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()
            r8.set(r5, r1)
            r8.getMediationNetwork = r1
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()
            r8.AFAdRevenueData()
            throw r2
        Lb9:
            int r8 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r8 = r8 + 63
            int r9 = r8 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r9
            int r8 = r8 % r0
            if (r8 != 0) goto Lc5
            return
        Lc5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.b_(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0099 A[Catch: JSONException -> 0x011b, TRY_ENTER, TryCatch #1 {JSONException -> 0x011b, blocks: (B:26:0x007c, B:27:0x0088, B:31:0x0099, B:36:0x00be, B:40:0x00e3, B:34:0x00ac), top: B:64:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[Catch: JSONException -> 0x011b, TryCatch #1 {JSONException -> 0x011b, blocks: (B:26:0x007c, B:27:0x0088, B:31:0x0099, B:36:0x00be, B:40:0x00e3, B:34:0x00ac), top: B:64:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00be A[Catch: JSONException -> 0x011b, TRY_LEAVE, TryCatch #1 {JSONException -> 0x011b, blocks: (B:26:0x007c, B:27:0x0088, B:31:0x0099, B:36:0x00be, B:40:0x00e3, B:34:0x00ac), top: B:64:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:45:0x0105  */
    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:74:0x004f A[EDGE_INSN: B:74:0x004f->B:73:0x004f BREAK  A[LOOP:3: B:16:0x0050->B:79:0x0050], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x004f A[EDGE_INSN: B:75:0x004f->B:73:0x004f BREAK  A[LOOP:3: B:16:0x0050->B:79:0x0050], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x004f A[EDGE_INSN: B:76:0x004f->B:73:0x004f BREAK  A[LOOP:3: B:16:0x0050->B:79:0x0050], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x004f A[EDGE_INSN: B:77:0x004f->B:73:0x004f BREAK  A[LOOP:3: B:16:0x0050->B:79:0x0050], SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013c, code lost:
    
        if ((r0 + 5) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0148, code lost:
    
        if ((r1 % 2) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014a, code lost:
    
        r13.remove(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014e, code lost:
    
        r13.remove(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0156, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void getMediationNetwork(org.json.JSONObject r13) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getMediationNetwork(org.json.JSONObject):void");
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1tSDK$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getRevenue = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getRevenue[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final void getMediationNetwork(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        int i = 2 % 2;
        int i2 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType = (AFInAppEventParameterName + 43) % 128;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strAFAdRevenueData = getRevenue(context).AFAdRevenueData("extraReferrers", (String) null);
            if (strAFAdRevenueData == null) {
                jSONObject = new JSONObject();
                jSONArray2 = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(strAFAdRevenueData);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray = new JSONArray();
                    int i4 = b + 117;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                    int i5 = i4 % 2;
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if (jSONArray2.length() < 5) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
                b = i6 % 128;
                int i7 = i6 % 2;
                int i8 = AFInAppEventType + 25;
                AFInAppEventParameterName = i8 % 128;
                if (i8 % 2 != 0) {
                    jSONArray2.put(jCurrentTimeMillis);
                    throw new ArithmeticException();
                }
                jSONArray2.put(jCurrentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                int i9 = b + 31;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                int i10 = i9 % 2;
                getMediationNetwork(jSONObject);
            }
            jSONObject.put(str, jSONArray2.toString());
            getRevenue(context).getMediationNetwork("extraReferrers", jSONObject.toString());
            AFInAppEventType = (AFInAppEventParameterName + 121) % 128;
        } catch (JSONException e2) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e2);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if ((r1 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if ((r1 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r3 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        com.appsflyer.internal.AFa1tSDK.b = r3 % 128;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void getRevenue(com.appsflyer.internal.AFc1dSDK r3) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L21
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 / 56
            int r2 = r1 * 2731
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r2
            com.appsflyer.internal.AFc1vSDK r3 = r3.AFInAppEventParameterName()
            r3.getMediationNetwork()
            int r1 = r1 % r0
            if (r1 == 0) goto L3d
            goto L33
        L21:
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r2
            com.appsflyer.internal.AFc1vSDK r3 = r3.AFInAppEventParameterName()
            r3.getMediationNetwork()
            int r1 = r1 % r0
            if (r1 == 0) goto L3d
        L33:
            int r3 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r3 = r3 + 95
            int r1 = r3 % 128
            com.appsflyer.internal.AFa1tSDK.b = r1
            int r3 = r3 % r0
            return
        L3d:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getRevenue(com.appsflyer.internal.AFc1dSDK):void");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        AFc1qSDK aFc1qSDKComponent2;
        int i = 2 % 2;
        getMediationNetwork(context);
        final AFc1dSDK aFc1dSDKAFAdRevenueData = AFAdRevenueData();
        aFc1dSDKAFAdRevenueData.registerClient().getMediationNetwork(z);
        aFc1dSDKAFAdRevenueData.getMonetizationNetwork().submit(new Runnable() { // from class: com.appsflyer.internal.AFa1tSDK$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                AFa1tSDK.$r8$lambda$uHRHSQiyPEPIrLNOloCalS47Mhw(aFc1dSDKAFAdRevenueData);
            }
        });
        boolean z2 = true;
        if (!(!z)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = AFInAppEventParameterName / 5;
                AFInAppEventType = i3 >> 13248;
                if ((i3 >> 4) == 0) {
                    aFc1qSDKComponent2 = aFc1dSDKAFAdRevenueData.component2();
                    z2 = false;
                } else {
                    aFc1qSDKComponent2 = aFc1dSDKAFAdRevenueData.component2();
                }
            } else {
                int i4 = AFInAppEventParameterName + 15;
                AFInAppEventType = i4 % 128;
                if (i4 % 2 == 0) {
                    aFc1qSDKComponent2 = aFc1dSDKAFAdRevenueData.component2();
                    z2 = false;
                } else {
                    aFc1qSDKComponent2 = aFc1dSDKAFAdRevenueData.component2();
                }
            }
            aFc1qSDKComponent2.getCurrencyIso4217Code("is_stop_tracking_used", z2);
        }
        AFInAppEventParameterName = (AFInAppEventType + 51) % 128;
        int i5 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AFInAppEventParameterName + 97;
        AFInAppEventType = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = i2 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 != 0) {
                AFAdRevenueData().copy().getMediationNetwork("getSdkVersion", new String[1]);
            } else {
                AFAdRevenueData().copy().getMediationNetwork("getSdkVersion", new String[1]);
            }
        } else {
            AFAdRevenueData().copy().getMediationNetwork("getSdkVersion", new String[0]);
        }
        String strComponent1 = AFc1pSDK.component1();
        AFInAppEventParameterName = (AFInAppEventType + 87) % 128;
        return strComponent1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        getMonetizationNetwork(new java.lang.Object[]{com.appsflyer.AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, java.lang.Boolean.toString(r7)}, -692563571, 692563575, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if ((r1 >>> 109) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if ((r1 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        getMonetizationNetwork(new java.lang.Object[]{com.appsflyer.AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, java.lang.Boolean.toString(r7)}, -692563571, 692563575, (int) java.lang.System.currentTimeMillis());
        r7 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        com.appsflyer.internal.AFa1tSDK.b = r7 % 128;
        r7 = r7 % 2;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void enableTCFDataCollection(boolean r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.b = r2
            int r1 = r1 % r0
            r2 = 692563575(0x2947ae77, float:4.43382E-14)
            r3 = -692563571(0xffffffffd6b8518d, float:-1.013302E14)
            java.lang.String r4 = "enableTCFDataCollection"
            if (r1 != 0) goto L23
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r5 = r1 >>> 104
            int r5 = r5 + (-9199)
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r5
            int r1 = r1 >>> 109
            if (r1 == 0) goto L48
            goto L2e
        L23:
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 + 43
            int r5 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L48
        L2e:
            java.lang.String r7 = java.lang.Boolean.toString(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r4, r7}
            long r4 = java.lang.System.currentTimeMillis()
            int r1 = (int) r4
            getMonetizationNetwork(r7, r3, r2, r1)
            int r7 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r7 = r7 + 47
            int r1 = r7 % 128
            com.appsflyer.internal.AFa1tSDK.b = r1
            int r7 = r7 % r0
            return
        L48:
            java.lang.String r7 = java.lang.Boolean.toString(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r4, r7}
            long r0 = java.lang.System.currentTimeMillis()
            int r0 = (int) r0
            getMonetizationNetwork(r7, r3, r2, r0)
            java.lang.ArithmeticException r7 = new java.lang.ArithmeticException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.enableTCFDataCollection(boolean):void");
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 23;
        b = i3 % 128;
        int i4 = i3 % 2;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        int i5 = AFInAppEventParameterName + 1;
        AFInAppEventType = i5 % 128;
        if (i5 % 2 == 0) {
            aFa1tSDK.AFAdRevenueData().afDebugLog().AFAdRevenueData();
            throw null;
        }
        int i6 = i2 + 55;
        b = i6 % 128;
        int i7 = i6 % 2;
        aFa1tSDK.AFAdRevenueData().afDebugLog().AFAdRevenueData();
        AFInAppEventParameterName = (AFInAppEventType + 17) % 128;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        int i;
        AFLogger.LogLevel logLevel;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            AFInAppEventType = (AFInAppEventParameterName / 21) + 30139;
            if (z) {
                int i5 = i3 + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                i = i5 % 2;
                logLevel = AFLogger.LogLevel.DEBUG;
                if (i != 0) {
                    AFInAppEventParameterName = (AFInAppEventType << 85) >> 7796;
                } else {
                    AFInAppEventParameterName = (AFInAppEventType + 101) % 128;
                }
            } else {
                logLevel = AFLogger.LogLevel.NONE;
            }
        } else {
            AFInAppEventType = (AFInAppEventParameterName + 115) % 128;
            if (!(!z)) {
                int i6 = i3 + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                i = i6 % 2;
                logLevel = AFLogger.LogLevel.DEBUG;
                if (i != 0) {
                    AFInAppEventParameterName = (AFInAppEventType << 85) >> 7796;
                } else {
                    AFInAppEventParameterName = (AFInAppEventType + 101) % 128;
                }
            } else {
                logLevel = AFLogger.LogLevel.NONE;
            }
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i = 2 % 2;
        int i2 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName = (AFInAppEventType + 37) % 128;
        AFAdRevenueData().copy().getMediationNetwork("setImeiData", str);
        AFAdRevenueData().registerClient().getMediationNetwork(str);
        AFInAppEventType = (AFInAppEventParameterName + 125) % 128;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i = 2 % 2;
        int i2 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = AFInAppEventType + 85;
        AFInAppEventParameterName = i4 % 128;
        if (i4 % 2 != 0) {
            AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
            String[] strArr = new String[1];
            strArr[1] = str;
            aFd1pSDKCopy.getMediationNetwork("setOaidData", strArr);
        } else {
            AFAdRevenueData().copy().getMediationNetwork("setOaidData", str);
            int i5 = b + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        }
        AFb1jSDK.getMonetizationNetwork = str;
        AFInAppEventParameterName = (AFInAppEventType + 103) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i = 2 % 2;
        int i2 = b + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName = (AFInAppEventType + 13) % 128;
        AFAdRevenueData().copy().getMediationNetwork("setAndroidIdData", str);
        AFAdRevenueData().afInfoLog().AFAdRevenueData = str;
        int i4 = AFInAppEventType + 41;
        AFInAppEventParameterName = i4 % 128;
        if (i4 % 2 != 0) {
            throw new ArithmeticException();
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        com.appsflyer.AppsFlyerProperties.getInstance().set(r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if ((r2 >> 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if ((r3 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        com.appsflyer.AppsFlyerProperties.getInstance().set(r1, r4);
        com.appsflyer.internal.AFa1tSDK.AFInAppEventType = (com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName + 81) % 128;
        r4 = com.appsflyer.internal.AFa1tSDK.b + 27;
        com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getCurrencyIso4217Code(java.lang.Object[] r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r1 = r1 + 119
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L20
            r4 = r4[r2]
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = (java.lang.String) r4
            int r2 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r3 = r2 % 30867
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r3
            int r2 = r2 >> r0
            if (r2 == 0) goto L50
            goto L33
        L20:
            r1 = r4[r2]
            java.lang.String r1 = (java.lang.String) r1
            r2 = 1
            r4 = r4[r2]
            java.lang.String r4 = (java.lang.String) r4
            int r3 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r3 = r3 + r2
            int r2 = r3 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r2
            int r3 = r3 % r0
            if (r3 == 0) goto L50
        L33:
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            r2.set(r1, r4)
            int r4 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r4 = r4 + 81
            int r4 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r4
            int r4 = com.appsflyer.internal.AFa1tSDK.b
            int r4 = r4 + 27
            int r1 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1
            int r4 = r4 % r0
            r0 = 0
            if (r4 != 0) goto L4f
            return r0
        L4f:
            throw r0
        L50:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            r0.set(r1, r4)
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getCurrencyIso4217Code(java.lang.Object[]):java.lang.Object");
    }

    private static void getCurrencyIso4217Code(String str, boolean z) {
        int i = 2 % 2;
        int i2 = b + 81;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        int i5 = AFInAppEventParameterName + 19;
        AFInAppEventType = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = i3 + 125;
            b = i6 % 128;
            int i7 = i6 % 2;
            AppsFlyerProperties.getInstance().set(str, z);
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
            b = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        AppsFlyerProperties.getInstance().set(str, z);
        throw null;
    }

    private static String getMonetizationNetwork(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        b = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName = (AFInAppEventType + 111) % 128;
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i4 = AFInAppEventType + 1;
        AFInAppEventParameterName = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    private static boolean getCurrencyIso4217Code(String str) {
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = b + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            AFInAppEventType = (AFInAppEventParameterName % 105) * 26724;
            z = AppsFlyerProperties.getInstance().getBoolean(str, false);
            i = (AFInAppEventParameterName * 2) >> 14941;
        } else {
            AFInAppEventType = (AFInAppEventParameterName + 35) % 128;
            z = AppsFlyerProperties.getInstance().getBoolean(str, false);
            i = (AFInAppEventParameterName + 5) % 128;
        }
        AFInAppEventType = i;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return z;
    }

    public final boolean getMediationNetwork() {
        int i = 2 % 2;
        int i2 = b + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType = (AFInAppEventParameterName + 47) % 128;
        if (!getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID)) {
            return false;
        }
        int i4 = b + 93;
        int i5 = i4 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5;
        int i6 = i4 % 2;
        int i7 = AFInAppEventType + 69;
        AFInAppEventParameterName = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            getRevenue();
            throw null;
        }
        int i8 = i5 + 25;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return getRevenue() == null;
        }
        getRevenue();
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName = (AFInAppEventType + 1) % 128;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
        AFInAppEventParameterName = (AFInAppEventType + 39) % 128;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (context != null) {
            if (!getMediationNetwork()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb = new StringBuilder("CustomerUserId set: ");
            sb.append(str);
            sb.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(AFAdRevenueData().component2());
            getCurrencyIso4217Code(context, AFh1xSDK.setCustomerIdAndLogSession);
            AFAdRevenueData().registerClient().getMediationNetwork();
            if (referrer == null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i5 = i4 + 7;
                b = i5 % 128;
                int i6 = i5 % 2;
                AFInAppEventType = (AFInAppEventParameterName + 35) % 128;
                int i7 = i4 + 93;
                b = i7 % 128;
                int i8 = i7 % 2;
                referrer = "";
            }
            if (!(!(context instanceof Activity))) {
                ((Activity) context).getIntent();
                AFInAppEventType = (AFInAppEventParameterName + 107) % 128;
            }
            getMonetizationNetwork(new Object[]{this, context, referrer}, 1659672083, -1659672066, System.identityHashCode(this));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        b = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName = (AFInAppEventType + 115) % 128;
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string == null) {
            String revenue = getRevenue(context, "AF_STORE");
            if (revenue == null) {
                AFLogger.afInfoLog("No out-of-store value set");
                return null;
            }
            int i4 = AFInAppEventParameterName + 99;
            AFInAppEventType = i4 % 128;
            if (i4 % 2 == 0) {
                throw new ArithmeticException();
            }
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            b = i5 % 128;
            int i6 = i5 % 2;
            return revenue;
        }
        AFInAppEventType = (AFInAppEventParameterName + 107) % 128;
        return string;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i = 2 % 2;
        int i2 = b + 73;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        int i5 = AFInAppEventParameterName + 81;
        int i6 = i5 % 128;
        AFInAppEventType = i6;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            int i7 = i3 + 83;
            b = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 25;
            AFInAppEventParameterName = i9 % 128;
            if (i9 % 2 != 0) {
                String lowerCase = str.toLowerCase(Locale.getDefault());
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
                AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), false);
                return;
            } else {
                String lowerCase2 = str.toLowerCase(Locale.getDefault());
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase2);
                AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase2)), true);
                return;
            }
        }
        AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0066  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = AFInAppEventType % 55;
            AFInAppEventParameterName = i3 * 12596;
            if ((i3 >>> 3) != 0) {
                AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
                String[] strArr = new String[1];
                strArr[1] = str;
                aFd1pSDKCopy.getMediationNetwork("setAppInviteOneLink", strArr);
                AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
                if (str != null) {
                    if (!str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
                    }
                }
            } else {
                AFAdRevenueData().copy().getMediationNetwork("setAppInviteOneLink", str);
                AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
                if (str != null) {
                    if (!str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
                    }
                }
            }
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
            AFInAppEventParameterName = (AFInAppEventType + 29) % 128;
            int i4 = b + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = AFInAppEventType + 15;
            AFInAppEventParameterName = i6 % 128;
            if (i6 % 2 != 0) {
                AFd1pSDK aFd1pSDKCopy2 = AFAdRevenueData().copy();
                String[] strArr2 = new String[1];
                strArr2[1] = str;
                aFd1pSDKCopy2.getMediationNetwork("setAppInviteOneLink", strArr2);
                AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
                if (str != null) {
                    if (!str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
                    }
                }
            } else {
                AFAdRevenueData().copy().getMediationNetwork("setAppInviteOneLink", str);
                AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
                if (str != null) {
                    if (!str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
                    }
                }
            }
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
            AFInAppEventParameterName = (AFInAppEventType + 29) % 128;
            int i7 = b + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
        }
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.ONELINK_ID, str}, -692563571, 692563575, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFa1tSDK aFa1tSDK;
        Map map;
        int i = 2 % 2;
        int i2 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = objArr[1];
            aFa1tSDK = (AFa1tSDK) obj;
            map = (Map) obj;
            int i3 = AFInAppEventParameterName;
            int i4 = i3 << 56;
            AFInAppEventType = i3 << 15889;
            if ((i4 >> 4) == 0) {
                throw null;
            }
        } else {
            aFa1tSDK = (AFa1tSDK) objArr[0];
            map = (Map) objArr[1];
            int i5 = AFInAppEventParameterName + 103;
            AFInAppEventType = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
        if (map != null) {
            aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            int i6 = AFInAppEventType + 45;
            AFInAppEventParameterName = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = b + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:8:0x0050  */
    /* JADX WARN: Code duplicated, block: B:9:0x006e  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPushNotificationData(Activity activity) {
        long jLongValue;
        int i = 2 % 2;
        int i2 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (activity != null) {
            AFInAppEventType = (AFInAppEventParameterName + 119) % 128;
            if (activity.getIntent() != null) {
                AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
                String localClassName = activity.getLocalClassName();
                StringBuilder sb = new StringBuilder("activity_intent_");
                sb.append(activity.getIntent().toString());
                aFd1pSDKCopy.getMediationNetwork("sendPushNotificationData", localClassName, sb.toString());
            } else if (activity != null) {
                AFInAppEventType = (AFInAppEventParameterName + 65) % 128;
                AFAdRevenueData().copy().getMediationNetwork("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
            } else {
                AFAdRevenueData().copy().getMediationNetwork("sendPushNotificationData", "activity_null");
            }
        } else if (activity != null) {
            AFInAppEventType = (AFInAppEventParameterName + 65) % 128;
            AFAdRevenueData().copy().getMediationNetwork("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            AFAdRevenueData().copy().getMediationNetwork("sendPushNotificationData", "activity_null");
        }
        AFc1kSDK aFc1kSDKAfInfoLog = AFAdRevenueData().afInfoLog();
        aFc1kSDKAfInfoLog.getCurrencyIso4217Code = getMediationNetwork(activity);
        if (aFc1kSDKAfInfoLog.getCurrencyIso4217Code != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.copydefault == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.copydefault = new ConcurrentHashMap();
                jLongValue = jCurrentTimeMillis;
            } else {
                try {
                    long j = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    Iterator<Long> it = this.copydefault.keySet().iterator();
                    int i4 = b + 87;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                    int i5 = i4 % 2;
                    jLongValue = jCurrentTimeMillis;
                    while (it.hasNext()) {
                        try {
                            Long next = it.next();
                            JSONObject jSONObject = new JSONObject(aFc1kSDKAfInfoLog.getCurrencyIso4217Code);
                            JSONObject jSONObject2 = new JSONObject(this.copydefault.get(next));
                            Iterator<Long> it2 = it;
                            if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                StringBuilder sb2 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                sb2.append(jSONObject2);
                                sb2.append(", new: ");
                                sb2.append(jSONObject);
                                sb2.append(")");
                                AFLogger.afInfoLog(sb2.toString());
                                aFc1kSDKAfInfoLog.getCurrencyIso4217Code = null;
                                return;
                            }
                            if (jCurrentTimeMillis - next.longValue() > j) {
                                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                                b = i6 % 128;
                                int i7 = i6 % 2;
                                this.copydefault.remove(next);
                            }
                            if (next.longValue() <= jLongValue) {
                                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                                b = i8 % 128;
                                int i9 = i8 % 2;
                                jLongValue = next.longValue();
                            }
                            AFInAppEventType = (AFInAppEventParameterName + 83) % 128;
                            it = it2;
                        } catch (Throwable th) {
                            th = th;
                            StringBuilder sb3 = new StringBuilder("Error while handling push notification measurement: ");
                            sb3.append(th.getClass().getSimpleName());
                            AFLogger.afErrorLog(sb3.toString(), th);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    jLongValue = jCurrentTimeMillis;
                }
            }
            if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                StringBuilder sb4 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                sb4.append(jLongValue);
                sb4.append(")");
                AFLogger.afInfoLog(sb4.toString());
                this.copydefault.remove(Long.valueOf(jLongValue));
            }
            this.copydefault.put(Long.valueOf(jCurrentTimeMillis), aFc1kSDKAfInfoLog.getCurrencyIso4217Code);
            start(activity);
            AFInAppEventParameterName = (AFInAppEventType + 11) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        r2.AFAdRevenueData().copy().getMediationNetwork("setUserEmails", r8);
        r2.setUserEmails(com.appsflyer.AppsFlyerProperties.EmailsCryptType.NONE, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if ((r5 + 86) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if ((r5 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        r1 = r1 + 125;
        com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1 % 128;
        r1 = r1 % 2;
        r2.AFAdRevenueData().copy().getMediationNetwork("setUserEmails", r8);
        r2.setUserEmails(com.appsflyer.AppsFlyerProperties.EmailsCryptType.NONE, r8);
        r8 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        com.appsflyer.internal.AFa1tSDK.b = r8 % 128;
        r8 = r8 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object AFLogger(java.lang.Object[] r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r2 = r1 + 87
            int r3 = r2 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r2 = r2 % r0
            r3 = 0
            java.lang.String r4 = "setUserEmails"
            r5 = 0
            if (r2 == 0) goto L28
            r8 = r8[r5]
            r2 = r8
            com.appsflyer.internal.AFa1tSDK r2 = (com.appsflyer.internal.AFa1tSDK) r2
            java.lang.String[] r8 = (java.lang.String[]) r8
            int r5 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r6 = r5 + 88
            r7 = 17245(0x435d, float:2.4165E-41)
            int r6 = r6 >>> r7
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r6
            int r5 = r5 + 86
            if (r5 == 0) goto L5d
            goto L3c
        L28:
            r2 = r8[r5]
            com.appsflyer.internal.AFa1tSDK r2 = (com.appsflyer.internal.AFa1tSDK) r2
            r5 = 1
            r8 = r8[r5]
            java.lang.String[] r8 = (java.lang.String[]) r8
            int r5 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r5 = r5 + 69
            int r6 = r5 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L5d
        L3c:
            int r1 = r1 + 125
            int r5 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r5
            int r1 = r1 % r0
            com.appsflyer.internal.AFc1dSDK r1 = r2.AFAdRevenueData()
            com.appsflyer.internal.AFd1pSDK r1 = r1.copy()
            r1.getMediationNetwork(r4, r8)
            com.appsflyer.AppsFlyerProperties$EmailsCryptType r1 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.NONE
            r2.setUserEmails(r1, r8)
            int r8 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r8 = r8 + 79
            int r1 = r8 % 128
            com.appsflyer.internal.AFa1tSDK.b = r1
            int r8 = r8 % r0
            return r3
        L5d:
            com.appsflyer.internal.AFc1dSDK r0 = r2.AFAdRevenueData()
            com.appsflyer.internal.AFd1pSDK r0 = r0.copy()
            r0.getMediationNetwork(r4, r8)
            com.appsflyer.AppsFlyerProperties$EmailsCryptType r0 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.NONE
            r2.setUserEmails(r0, r8)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.AFLogger(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        int i = 2 % 2;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        AppsFlyerProperties.EmailsCryptType emailsCryptType = (AppsFlyerProperties.EmailsCryptType) objArr[1];
        String[] strArr = (String[]) objArr[2];
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int i2 = b + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String str = null;
        for (String str2 : strArr) {
            AFInAppEventType = (AFInAppEventParameterName + 35) % 128;
            if (AnonymousClass3.getRevenue[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFj1cSDK.getMonetizationNetwork(str2));
                AFInAppEventParameterName = (AFInAppEventType + 111) % 128;
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
                b = i4 % 128;
                int i5 = i4 % 2;
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        map.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
        int i6 = AFInAppEventParameterName + 87;
        AFInAppEventType = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        b = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        int i = 2 % 2;
        int i2 = b + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName = (AFInAppEventType + 99) % 128;
        AFAdRevenueData().copy().getMediationNetwork("setCollectAndroidID", String.valueOf(z));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z)}, -692563571, 692563575, (int) System.currentTimeMillis());
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z)}, -692563571, 692563575, (int) System.currentTimeMillis());
        int i4 = AFInAppEventType + 109;
        AFInAppEventParameterName = i4 % 128;
        if (i4 % 2 != 0) {
            throw new ArithmeticException();
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        AFInAppEventType = (AFInAppEventParameterName + 45) % 128;
        AFAdRevenueData().copy().getMediationNetwork("setCollectIMEI", String.valueOf(z));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z)}, -692563571, 692563575, (int) System.currentTimeMillis());
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z)}, -692563571, 692563575, (int) System.currentTimeMillis());
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int i2 = 651 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 44;
            byte[] bArr = $$d;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            d(b2, b2, bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, i2, touchSlop, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        f(new char[]{6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1}, true, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, 235 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16777222, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        f(new char[]{65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5}, false, 15 - (ViewConfiguration.getTapTimeout() >> 16), MotionEvent.axisFromString("") + 239, 12 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
            int doubleTapTimeout = 651 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44;
            Object[] objArr5 = new Object[1];
            d((byte) 52, (byte) 14, (short) 51, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, doubleTapTimeout, minimumFlingVelocity, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = b + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int mode = 651 - View.MeasureSpec.getMode(0);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44;
                byte[] bArr2 = $$d;
                byte b3 = (byte) (bArr2[33] - 1);
                byte b4 = bArr2[7];
                Object[] objArr6 = new Object[1];
                d(b3, b4, (short) (b4 | 155), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarFadeDuration, mode, keyRepeatTimeout, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ((((-572945103) + (((~(182441698 | iIdentityHashCode)) | 16785436) * 336)) + (((~(iIdentityHashCode | 185872508)) | 13354626) * (-168))) + (((~((~iIdentityHashCode) | 185872508)) | 182441698) * 168)) - 1777737011;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            b = i10 % 128;
            int i11 = i10 % 2;
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), 1610 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 26 - (Process.myPid() >> 22), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1777737011, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cMyPid = (char) (Process.myPid() >> 22);
                    int i12 = 652 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 45;
                    Object[] objArr9 = new Object[1];
                    d((byte) 52, (byte) 14, (short) 51, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, i12, iIndexOf, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.myTid() >> 22), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 694, (ViewConfiguration.getPressedStateDuration() >> 16) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - Gravity.getAbsoluteGravity(0, 0)), ExpandableListView.getPackedPositionChild(0L) + 794, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 83), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                    int i13 = 652 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int mode2 = 44 - View.MeasureSpec.getMode(0);
                    byte[] bArr3 = $$d;
                    byte b5 = (byte) (bArr3[33] - 1);
                    byte b6 = bArr3[7];
                    Object[] objArr11 = new Object[1];
                    d(b5, b6, (short) (b6 | 155), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength, i13, mode2, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    f(new char[]{6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1}, true, 22 - TextUtils.indexOf("", "", 0, 0), 234 - Drawable.resolveOpacity(0, 0), 6 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    f(new char[]{65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5}, false, 14 - TextUtils.lastIndexOf("", '0', 0), 238 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 13, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 651;
                        int modifierMetaStateMask = 43 - ((byte) KeyEvent.getModifierMetaStateMask());
                        Object[] objArr14 = new Object[1];
                        d((byte) 52, (byte) 14, (short) 51, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionGroup, pressedStateDuration, modifierMetaStateMask, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int iResolveSize = 651 - View.resolveSize(0, 0);
                        int i14 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44;
                        byte[] bArr4 = $$d;
                        byte b7 = bArr4[7];
                        Object[] objArr15 = new Object[1];
                        d(b7, b7, bArr4[5], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveSizeAndState, iResolveSize, i14, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i15 = ((int[]) objArr[0])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                b = i17 % 128;
                int i18 = i17 % 2 != 0 ? 0 : 1;
                while (i18 < strArr.length) {
                    int i19 = b + 81;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 % 128;
                    if (i19 % 2 != 0) {
                        arrayList.add(strArr[i18]);
                        i18 += 19;
                    } else {
                        arrayList.add(strArr[i18]);
                        i18++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        int i20 = b + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
        int i21 = i20 % 2;
        Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i22 = ((int[]) objArr[3])[0];
        int i23 = ((int[]) objArr[2])[0];
        int i24 = ((int[]) objArr[0])[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i25 = ~(747538072 | iIdentityHashCode2);
        int i26 = i22 + (-811149088) + (((-752791295) | i25) * (-814)) + ((i25 | (~((~iIdentityHashCode2) | 744107262)) | 738854040) * 407) + (((~(iIdentityHashCode2 | (-744107263))) | (~((-747538073) | iIdentityHashCode2)) | 738854040) * 407);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        Object obj = objArr16[3];
        ((int[]) obj)[0] = i28 ^ (i28 << 5);
        int i29 = b + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i29 % 128;
        int i30 = i29 % 2;
        int i31 = AFInAppEventType + 117;
        AFInAppEventParameterName = i31 % 128;
        int i32 = ((int[]) obj)[0];
        int i33 = ((i32 * i32) - (~(-(1478887782 * i32)))) - 1;
        int i34 = -(i32 * (-1076264244));
        int i35 = (i33 & i34) + (i34 | i33);
        int i36 = (i35 ^ 1696116337) + ((1696116337 & i35) << 1);
        int i37 = ((i36 >> 21) - 4095) / 2048;
        int i38 = ((i37 | 1) << 1) - (i37 ^ 1);
        int i39 = (i36 ^ i38) + ((i38 & i36) << 1);
        int i40 = i36 >> 17;
        int i41 = -(i39 ^ (((((-65535) & i40) + (i40 | (-65535))) / 32768) + 1));
        int i42 = (i41 ^ 4) + ((i41 & 4) << 1);
        int i43 = i42 >> 18;
        int i44 = ((i43 & (-32767)) + (i43 | (-32767))) / 16384;
        if (i31 % (1072 / (((-((((i44 | 1) << 1) - (i44 ^ 1)) + 1)) & i42) * 134)) != 0) {
            throw new ArithmeticException();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        b = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType = (AFInAppEventParameterName + 125) % 128;
        AFAdRevenueData().copy().getMediationNetwork("setCollectOaid", String.valueOf(z));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z)}, -692563571, 692563575, (int) System.currentTimeMillis());
        int i4 = AFInAppEventType + 85;
        AFInAppEventParameterName = i4 % 128;
        if (i4 % 2 != 0) {
            throw new ArithmeticException();
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        int i = 2 % 2;
        int i2 = b + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType = (AFInAppEventParameterName + 9) % 128;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFa1oSDK aFa1oSDKD = AFAdRevenueData().d();
        aFa1oSDKD.component2.clear();
        aFa1oSDKD.component2.addAll(Arrays.asList(strArr));
        AFInAppEventParameterName = (AFInAppEventType + 41) % 128;
        int i4 = b + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        String str;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AFInAppEventParameterName + 125;
        AFInAppEventType = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = i2 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 != 0) {
                str = String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr));
            } else {
                Object[] objArr = new Object[0];
                objArr[1] = Arrays.toString(strArr);
                str = String.format("setOneLinkCustomDomain %s", objArr);
            }
        } else {
            str = String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr));
        }
        AFLogger.afDebugLog(str);
        AFAdRevenueData().d().component4 = strArr;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        String str;
        int i = 2 % 2;
        final AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        String str2 = (String) objArr[1];
        AppsFlyerConversionListener appsFlyerConversionListener = (AppsFlyerConversionListener) objArr[2];
        Context context = (Context) objArr[3];
        int i2 = AFInAppEventType + 117;
        AFInAppEventParameterName = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = aFa1tSDK.toString;
            throw null;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z2 = aFa1tSDK.toString;
            throw null;
        }
        if (aFa1tSDK.toString) {
            return aFa1tSDK;
        }
        aFa1tSDK.toString = true;
        aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData(str2);
        if (context != null) {
            AFInAppEventType = (AFInAppEventParameterName + 25) % 128;
            aFa1tSDK.getMediationNetwork(context);
            Application applicationO_ = AFj1iSDK.O_(context);
            if (applicationO_ == null) {
                return aFa1tSDK;
            }
            aFa1tSDK.component1 = applicationO_;
            aFa1tSDK.AFAdRevenueData().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFa1tSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1tSDK.$r8$lambda$blQPRvNkGfIV2BOvh4_sCBVm0qs(this.f$0);
                }
            });
            aFa1tSDK.AFAdRevenueData().areAllFieldsValid().getMediationNetwork = System.currentTimeMillis();
            AFe1lSDK aFe1lSDKCopydefault = aFa1tSDK.AFAdRevenueData().copydefault();
            aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(new AFe1eSDK(aFa1tSDK.AFAdRevenueData())));
            AFi1tSDK aFi1tSDKI = aFa1tSDK.AFAdRevenueData().i();
            aFi1tSDKI.getMediationNetwork = Build.VERSION.SDK_INT >= 31 ? new AFi1sSDK(aFi1tSDKI.getCurrencyIso4217Code) : new AFi1qSDK(aFi1tSDKI.getCurrencyIso4217Code);
            aFa1tSDK.AFAdRevenueData().afRDLog().AFAdRevenueData(new AFd1vSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFa1tSDK$$ExternalSyntheticLambda1
                @Override // com.appsflyer.internal.AFd1vSDK.AFa1ySDK
                public final void onConfigurationChanged(boolean z3) {
                    AFa1tSDK.m7536$r8$lambda$1X7p9XpoKZG_iJodZqM9lWPA(this.f$0, z3);
                }
            });
            aFa1tSDK.AFAdRevenueData().component1().getCurrencyIso4217Code(aFa1tSDK.getMonetizationNetwork());
            AFj1sSDK aFj1sSDKAFLogger = aFa1tSDK.AFAdRevenueData().AFLogger();
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFa1tSDK$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1tSDK.m7537$r8$lambda$EaQm2Z1NlPxGCpde4Qq8_cAhoI(this.f$0);
                }
            };
            AFi1aSDK aFi1aSDKAFAdRevenueData = aFj1sSDKAFLogger.AFAdRevenueData(runnable);
            Runnable runnableAFAdRevenueData = aFj1sSDKAFLogger.AFAdRevenueData(aFi1aSDKAFAdRevenueData, runnable);
            aFj1sSDKAFLogger.getMediationNetwork(aFi1aSDKAFAdRevenueData);
            aFj1sSDKAFLogger.getMediationNetwork(new AFj1oSDK(aFj1sSDKAFLogger.getMediationNetwork.getRevenue(), runnableAFAdRevenueData));
            aFj1sSDKAFLogger.getMediationNetwork(new AFj1vSDK(runnableAFAdRevenueData, aFj1sSDKAFLogger.getMediationNetwork, new AFj1wSDK()));
            aFj1sSDKAFLogger.getMediationNetwork(new AFj1tSDK(runnableAFAdRevenueData, aFj1sSDKAFLogger.getMediationNetwork));
            aFj1sSDKAFLogger.getMediationNetwork(new AFj1uSDK(aFj1sSDKAFLogger.getMediationNetwork.getMonetizationNetwork(), aFj1sSDKAFLogger.getMediationNetwork.getRevenue(), runnableAFAdRevenueData));
            aFj1sSDKAFLogger.getMediationNetwork(runnableAFAdRevenueData);
            if (!aFj1sSDKAFLogger.getMonetizationNetwork()) {
                Context context2 = aFj1sSDKAFLogger.getMediationNetwork.AFInAppEventType().getMonetizationNetwork;
                AFc1dSDK aFc1dSDK = aFj1sSDKAFLogger.getMediationNetwork;
                List<ResolveInfo> listQueryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                if (listQueryIntentContentProviders != null) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
                    b = i4 % 128;
                    int i5 = i4 % 2;
                    if (!listQueryIntentContentProviders.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
                        while (it.hasNext()) {
                            AFInAppEventParameterName = (AFInAppEventType + 59) % 128;
                            ProviderInfo providerInfo = it.next().providerInfo;
                            if (providerInfo != null) {
                                arrayList.add(new AFj1rSDK(providerInfo, runnableAFAdRevenueData, aFc1dSDK));
                            } else {
                                AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            aFj1sSDKAFLogger.getCurrencyIso4217Code.addAll(arrayList);
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK = AFg1cSDK.PREINSTALL;
                            StringBuilder sb = new StringBuilder("Detected ");
                            sb.append(arrayList.size());
                            sb.append(" valid preinstall provider(s)");
                            aFLogger.d(aFg1cSDK, sb.toString());
                            int i6 = b + 103;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                            int i7 = i6 % 2;
                        }
                    }
                }
            }
            for (AFj1qSDK aFj1qSDK : aFj1sSDKAFLogger.getRevenue()) {
                AFInAppEventType = (AFInAppEventParameterName + 29) % 128;
                aFj1qSDK.getRevenue(aFj1sSDKAFLogger.getMediationNetwork.AFInAppEventType().getMonetizationNetwork);
            }
            aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData(aFa1tSDK.AFAdRevenueData().getRevenue());
            if (aFa1tSDK.AFAdRevenueData().afWarnLog().getCurrencyIso4217Code()) {
                aFa1tSDK.AFAdRevenueData().afWarnLog().getMediationNetwork();
            }
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFd1pSDK aFd1pSDKCopy = aFa1tSDK.AFAdRevenueData().copy();
        String[] strArr = new String[2];
        strArr[0] = str2;
        if (appsFlyerConversionListener == null) {
            str = "null";
        } else {
            AFInAppEventParameterName = (AFInAppEventType + 101) % 128;
            str = "conversionDataListener";
        }
        strArr[1] = str;
        aFd1pSDKCopy.getMediationNetwork("init", strArr);
        AFLogger.INSTANCE.force(AFg1cSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.17.0", getMonetizationNetwork));
        aFa1tSDK.getCurrencyIso4217Code = appsFlyerConversionListener;
        return aFa1tSDK;
    }

    private /* synthetic */ void equals() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        b = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType = (AFInAppEventParameterName + 27) % 128;
        AFAdRevenueData().AFInAppEventParameterName().AFAdRevenueData();
        component2();
        int i4 = AFInAppEventType + 17;
        AFInAppEventParameterName = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = b + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    private /* synthetic */ void getMonetizationNetwork(boolean z) {
        int i = 2 % 2;
        int i2 = AFInAppEventParameterName + 95;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException();
        }
        if (z) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
            b = i3 % 128;
            int i4 = i3 % 2;
            AFAdRevenueData().v().getRevenue();
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
            b = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        AFAdRevenueData().v().getCurrencyIso4217Code();
        AFInAppEventParameterName = (AFInAppEventType + 43) % 128;
    }

    private /* synthetic */ void copydefault() {
        int i = 2 % 2;
        getMonetizationNetwork(new Object[]{this, new AFh1kSDK()}, 974724333, -974724320, System.identityHashCode(this));
        int i2 = AFInAppEventType + 71;
        AFInAppEventParameterName = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = b + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private /* synthetic */ void AFAdRevenueData(AFi1fSDK aFi1fSDK) {
        int i = 2 % 2;
        AFf1wSDK aFf1wSDK = new AFf1wSDK(aFi1fSDK, AFAdRevenueData().getRevenue(), AFAdRevenueData());
        AFe1lSDK aFe1lSDKCopydefault = AFAdRevenueData().copydefault();
        aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(aFf1wSDK));
        int i2 = AFInAppEventType + 111;
        AFInAppEventParameterName = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException();
        }
        int i3 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    private void component2() {
        final AFi1fSDK aFi1fSDKForce;
        int i = 2 % 2;
        int i2 = AFInAppEventType + 37;
        AFInAppEventParameterName = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                AFAdRevenueData().force();
                throw null;
            }
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                aFi1fSDKForce = AFAdRevenueData().force();
                int i4 = 75 / 0;
                if (aFi1fSDKForce == null) {
                    return;
                }
            } else {
                aFi1fSDKForce = AFAdRevenueData().force();
                if (aFi1fSDKForce == null) {
                    return;
                }
            }
            AFInAppEventParameterName = (AFInAppEventType + 77) % 128;
            if (aFi1fSDKForce.getMediationNetwork()) {
                aFi1fSDKForce.AFAdRevenueData(new AFi1cSDK() { // from class: com.appsflyer.internal.AFa1tSDK$$ExternalSyntheticLambda4
                    @Override // com.appsflyer.internal.AFi1cSDK
                    public final void onRequestFinished() {
                        AFa1tSDK.$r8$lambda$pCCpcEMM3mmsR2pSmbZkaRQJvfg(this.f$0, aFi1fSDKForce);
                    }
                });
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th);
            AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th)));
            int i5 = b + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if ((r5 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        r5 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        com.appsflyer.internal.AFa1tSDK.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if ((r5 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        AFAdRevenueData().e().getCurrencyIso4217Code(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if ((r1 % 5) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if ((r1 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        AFAdRevenueData().e().getCurrencyIso4217Code(r5);
        r5 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType + 1;
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r5 % 128;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void enableFacebookDeferredApplinks(boolean r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1e
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 * 57
            r3 = 6625(0x19e1, float:9.284E-42)
            int r3 = r1 >> r3
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r3
            int r1 = r1 % 5
            if (r1 == 0) goto L4d
            goto L29
        L1e:
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 + 107
            int r3 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L4d
        L29:
            com.appsflyer.internal.AFc1dSDK r1 = r4.AFAdRevenueData()
            com.appsflyer.internal.AFa1aSDK r1 = r1.e()
            r1.getCurrencyIso4217Code(r5)
            int r5 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r5 = r5 + 1
            int r1 = r5 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L4c
            int r5 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r5 = r5 + 67
            int r1 = r5 % 128
            com.appsflyer.internal.AFa1tSDK.b = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L4b
            return
        L4b:
            throw r2
        L4c:
            throw r2
        L4d:
            com.appsflyer.internal.AFc1dSDK r0 = r4.AFAdRevenueData()
            com.appsflyer.internal.AFa1aSDK r0 = r0.e()
            r0.getCurrencyIso4217Code(r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.enableFacebookDeferredApplinks(boolean):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        int i = 2 % 2;
        int i2 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType = (AFInAppEventParameterName + 15) % 128;
        start(context, null);
        AFInAppEventType = (AFInAppEventParameterName + 107) % 128;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        int i = 2 % 2;
        int i2 = b + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        AFInAppEventParameterName = (AFInAppEventType + 71) % 128;
        aFa1tSDK.start(context, str, null);
        int i4 = AFInAppEventParameterName + 65;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = b + 97;
        int i6 = i5 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 109;
        b = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        b = i2 % 128;
        int i3 = i2 % 2;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        final AppsFlyerRequestListener appsFlyerRequestListener = (AppsFlyerRequestListener) objArr[3];
        if (aFa1tSDK.AFAdRevenueData().afDebugLog().getCurrencyIso4217Code()) {
            return null;
        }
        if (!aFa1tSDK.toString) {
            AFInAppEventParameterName = (AFInAppEventType + 33) % 128;
            AFAdRevenueData("start");
            if (str == null) {
                int i4 = AFInAppEventType + 19;
                AFInAppEventParameterName = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 40 / 0;
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(41, "No dev key");
                    }
                } else if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                }
                return null;
            }
        }
        aFa1tSDK.getMediationNetwork(context);
        final AFh1vSDK aFh1vSDKAreAllFieldsValid = aFa1tSDK.AFAdRevenueData().areAllFieldsValid();
        aFh1vSDKAreAllFieldsValid.getMediationNetwork(AFh1tSDK.getRevenue(context));
        if (aFa1tSDK.component1 == null) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
            b = i7 % 128;
            int i8 = i7 % 2;
            AFInAppEventType = (AFInAppEventParameterName + 23) % 128;
            Application applicationO_ = AFj1iSDK.O_(context);
            if (applicationO_ == null) {
                return null;
            }
            int i9 = AFInAppEventType + 119;
            AFInAppEventParameterName = i9 % 128;
            if (i9 % 2 != 0) {
                aFa1tSDK.component1 = applicationO_;
                throw null;
            }
            aFa1tSDK.component1 = applicationO_;
        }
        aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
        String str2 = getMonetizationNetwork;
        aFLogger.i(aFg1cSDK, String.format("Starting AppsFlyer: (v%s.%s)", "6.17.0", str2));
        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "Build Number: ".concat(String.valueOf(str2)));
        AppsFlyerProperties.getInstance().loadProperties(aFa1tSDK.AFAdRevenueData().component2());
        if (!TextUtils.isEmpty(str)) {
            AFInAppEventParameterName = (AFInAppEventType + 45) % 128;
            aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData(str);
            AFInAppEventParameterName = (AFInAppEventType + 109) % 128;
        } else if (TextUtils.isEmpty(aFa1tSDK.AFAdRevenueData().registerClient().getMediationNetwork())) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
            b = i10 % 128;
            if (i10 % 2 == 0) {
                copy();
                throw null;
            }
            copy();
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
            }
            return null;
        }
        aFa1tSDK.AFAdRevenueData().component1().getCurrencyIso4217Code(aFa1tSDK.getMonetizationNetwork());
        aFa1tSDK.component4();
        getMonetizationNetwork(aFa1tSDK.component1.getBaseContext());
        aFa1tSDK.AFAdRevenueData().e().getRevenue();
        aFa1tSDK.copy.afDebugLog().AFAdRevenueData(context, new AFb1bSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFa1tSDK.1
            @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
            public final void getRevenue(AFh1qSDK aFh1qSDK) {
                aFh1vSDKAreAllFieldsValid.AFAdRevenueData();
                AFc1dSDK aFc1dSDKAFAdRevenueData = AFa1tSDK.this.AFAdRevenueData();
                aFc1dSDKAFAdRevenueData.component1().getCurrencyIso4217Code(AFa1tSDK.this.getMonetizationNetwork());
                AFa1tSDK.this.component4();
                int iAFAdRevenueData = aFc1dSDKAFAdRevenueData.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (iAFAdRevenueData < 2) {
                    AFa1tSDK.this.AFAdRevenueData().equals().getCurrencyIso4217Code();
                }
                AFh1iSDK aFh1iSDK = new AFh1iSDK();
                if (aFh1qSDK != null) {
                    AFa1tSDK.this.AFAdRevenueData().d().e_(AFa1jSDK.AFAdRevenueData(aFh1iSDK), aFh1qSDK.getRevenue, aFc1dSDKAFAdRevenueData.AFInAppEventType().getMonetizationNetwork);
                    AFh1uSDK aFh1uSDKAfErrorLogForExcManagerOnly = aFc1dSDKAFAdRevenueData.afErrorLogForExcManagerOnly();
                    if (aFh1uSDKAfErrorLogForExcManagerOnly != null && aFh1qSDK.getRevenue != null) {
                        aFh1uSDKAfErrorLogForExcManagerOnly.u_(aFh1qSDK.getRevenue, AFa1tSDK.this.AFAdRevenueData().d());
                    }
                }
                AFa1tSDK aFa1tSDK2 = AFa1tSDK.this;
                aFh1iSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
                aFa1tSDK2.getMonetizationNetwork(aFh1iSDK, aFh1qSDK);
                AFa1tSDK.this.AFAdRevenueData().getMediationNetwork().getRevenue();
                AFa1tSDK.this.AFAdRevenueData().getMediationNetwork().AFAdRevenueData.getCurrencyIso4217Code("didSendRevenueTriggerOnLastBackground", false);
            }

            @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
            public final void getCurrencyIso4217Code() {
                Context context2 = AFa1tSDK.this.AFAdRevenueData().AFInAppEventType().getMonetizationNetwork;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1vSDK aFh1vSDK = aFh1vSDKAreAllFieldsValid;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (aFh1vSDK.component3 != 0) {
                    long j = jCurrentTimeMillis - aFh1vSDK.component3;
                    if (j > 0 && j < 1000) {
                        j = 1000;
                    }
                    aFh1vSDK.toString = TimeUnit.MILLISECONDS.toSeconds(j);
                    aFh1vSDK.getCurrencyIso4217Code.getMonetizationNetwork("prev_session_dur", aFh1vSDK.toString);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFa1tSDK.this.AFAdRevenueData().afRDLog().AFAdRevenueData();
                AFd1pSDK aFd1pSDKCopy = AFa1tSDK.this.AFAdRevenueData().copy();
                if (aFd1pSDKCopy.component4()) {
                    aFd1pSDKCopy.getMediationNetwork();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        aFd1pSDKCopy.o_(context2.getPackageName(), context2.getPackageManager());
                    }
                    aFd1pSDKCopy.AFAdRevenueData();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFa1tSDK.this.AFAdRevenueData().equals().getRevenue();
                AFa1tSDK.this.AFAdRevenueData().afVerboseLog().getMonetizationNetwork();
                AFa1tSDK.this.AFAdRevenueData().getMediationNetwork().getRevenue();
                AFh1uSDK aFh1uSDKAfErrorLogForExcManagerOnly = AFa1tSDK.this.AFAdRevenueData().afErrorLogForExcManagerOnly();
                if (aFh1uSDKAfErrorLogForExcManagerOnly != null) {
                    aFh1uSDKAfErrorLogForExcManagerOnly.getMediationNetwork();
                }
            }
        });
        int i11 = AFInAppEventParameterName + 105;
        AFInAppEventType = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static void getMonetizationNetwork(Context context) throws Throwable {
        int i;
        int i2;
        String string;
        Method method;
        int i3 = 2;
        int i4 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        byte[] bArr = $$a;
        byte b2 = bArr[28];
        byte b3 = bArr[7];
        Object[] objArr = new Object[1];
        c(b2, b3, b3, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        byte b4 = bArr[7];
        byte b5 = bArr[28];
        Object[] objArr2 = new Object[1];
        c(b4, b5, b5, objArr2);
        Method method2 = cls.getMethod((String) objArr2[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        byte b6 = bArr[7];
        byte b7 = bArr[28];
        Object[] objArr3 = new Object[1];
        c(b6, b7, b7, objArr3);
        Method[] methodArr = {method2, cls2.getMethod((String) objArr3[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2823;
            int i5 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte[] bArr2 = $$d;
            byte b8 = bArr2[7];
            Object[] objArr4 = new Object[1];
            d(b8, b8, bArr2[5], objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, scrollDefaultDelay, i5, 1814927978, false, (String) objArr4[0], null);
        }
        long j = 0;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0') + 1), Color.blue(0) + 2823, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i6 = 0;
            while (i6 < length) {
                Method method3 = declaredMethods[i6];
                int i7 = b + 39;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr5 = new Object[1];
                    e(new char[]{39561, 50363, 9959, 32809, 57897, 19858, 45012, 2306, 27468, 51916, 13483, 38645, 61481, 21098, 48536, 8151, 30983, 56068, 15020, 25789, 50915, Typography.ellipsis, 33386, 60824}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24121, objArr5);
                    Class<?> cls3 = Class.forName((String) objArr5[0]);
                    Object[] objArr6 = new Object[1];
                    f(new char[]{7, 65532, 1, 65534, 1, 65533, '\n', 11, 65535, 65533, '\f', 65509}, false, (Process.myPid() >> 22) + 12, 239 - Gravity.getAbsoluteGravity(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 9, objArr6);
                    Object[] objArr7 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr6[0], null).invoke(method3, null)).intValue())};
                    Object[] objArr8 = new Object[1];
                    f(new char[]{11, 5, 4, 17, 65485, 6, '\r', 0, 11, 65485, 0, 21, 0, '\t', 17, 4, '\b', 5, '\b', 3, 14, 65516, 65485, 19, 2, 4}, true, 26 - ExpandableListView.getPackedPositionGroup(j), 232 - (Process.myPid() >> 22), 14 - KeyEvent.normalizeMetaState(0), objArr8);
                    Class<?> cls4 = Class.forName((String) objArr8[0]);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(j) + 21768;
                    Object[] objArr9 = new Object[1];
                    e(new char[]{39562, 53143, 12451, 26007, 52875, 13225, 25791, 51639}, packedPositionChild, objArr9);
                    if (!(!((Boolean) cls4.getMethod((String) objArr9[0], Integer.TYPE).invoke(null, objArr7)).booleanValue())) {
                        Class cls5 = Long.TYPE;
                        Object[] objArr10 = new Object[1];
                        e(new char[]{39561, 50363, 9959, 32809, 57897, 19858, 45012, 2306, 27468, 51916, 13483, 38645, 61481, 21098, 48536, 8151, 30983, 56068, 15020, 25789, 50915, Typography.ellipsis, 33386, 60824}, KeyEvent.getDeadChar(0, 0) + 24121, objArr10);
                        Class<?> cls6 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        f(new char[]{65533, 65531, 6, 15, 65514, 4, '\b', 11, '\n', 65531, 65512, '\n', 65531}, true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13, 241 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr11);
                        if (cls5.equals(cls6.getMethod((String) objArr11[0], null).invoke(method3, null))) {
                            Object[] objArr12 = new Object[1];
                            e(new char[]{39561, 50363, 9959, 32809, 57897, 19858, 45012, 2306, 27468, 51916, 13483, 38645, 61481, 21098, 48536, 8151, 30983, 56068, 15020, 25789, 50915, Typography.ellipsis, 33386, 60824}, 24122 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr12);
                            Class<?> cls7 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            f(new char[]{65529, 5, 65533, '\f', 65533, '\n', 65516, 17, '\b', 65533, 11, 65535, 65533, '\f', 65512, 65529, '\n'}, false, (KeyEvent.getMaxKeyCode() >> 16) + 17, 238 - ImageFormat.getBitsPerPixel(0), View.getDefaultSize(0, 0) + 11, objArr13);
                            Object[] objArr14 = (Object[]) cls7.getMethod((String) objArr13[0], null).invoke(method3, null);
                            if (objArr14.length == 2 && Long.TYPE.equals(objArr14[0])) {
                                Object[] objArr15 = new Object[1];
                                e(new char[]{39561, 50363, 9959, 32809, 57897, 19858, 45012, 2306, 27468, 51916, 13483, 38645, 61481, 21098, 48536, 8151, 30983, 56068, 15020, 25789, 50915, Typography.ellipsis, 33386, 60824}, 24121 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr15);
                                if (Class.forName((String) objArr15[0]).equals(objArr14[1])) {
                                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                                    b = i9 % 128;
                                    int i10 = i9 % 2;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                                        int keyRepeatDelay = 2823 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
                                        byte[] bArr3 = $$d;
                                        byte b9 = bArr3[7];
                                        Object[] objArr16 = new Object[1];
                                        d(b9, b9, bArr3[5], objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf2, keyRepeatDelay, pressedStateDuration, 1814927978, false, (String) objArr16[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method3);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                        int i11 = 2823 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        int i12 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21;
                                        byte[] bArr4 = $$d;
                                        byte b10 = bArr4[7];
                                        Object[] objArr17 = new Object[1];
                                        d(b10, b10, bArr4[5], objArr17);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, i11, i12, 1814927978, false, (String) objArr17[0], null);
                                    }
                                    try {
                                        Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2823;
                                            int jumpTapTimeout = 22 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                            byte b11 = $$d[54];
                                            Object[] objArr19 = new Object[1];
                                            d((byte) 52, b11, (short) (b11 | 32), objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout, threadPriority, jumpTapTimeout, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
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
                    i3 = 2;
                    j = 0;
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
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int i13 = 2824 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i14 = 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr5 = $$d;
            byte b12 = bArr5[7];
            Object[] objArr20 = new Object[1];
            d(b12, b12, bArr5[5], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, i13, i14, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 2823;
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 22;
            Object[] objArr22 = new Object[1];
            d((byte) 52, (byte) 14, (short) 51, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetBefore, pressedStateDuration2, packedPositionType, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 37657);
            int i15 = 2720 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iIndexOf = 19 - TextUtils.indexOf("", "", 0);
            Object[] objArr24 = new Object[1];
            d((byte) 52, (byte) 14, (short) 51, objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(trimmedLength, i15, iIndexOf, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j2 = -316665571;
        long j3 = -751;
        long j4 = -1;
        long j5 = j2 ^ j4;
        long j6 = jLongValue ^ j4;
        long jMyTid = Process.myTid();
        long j7 = (j3 * j2) + (j3 * jLongValue) + (((long) 1504) * (((j5 | j6) ^ j4) | ((j5 | jMyTid) ^ j4)));
        long j8 = j5 | jLongValue;
        long j9 = j7 + (((long) (-1504)) * ((jMyTid | j8) ^ j4)) + (((long) 752) * ((j8 ^ j4) | ((j6 | j2) ^ j4))) + ((long) (-1493740274));
        int iNextInt = new Random().nextInt();
        int i16 = ((int) (j9 >> 32)) & ((-1774750850) + (((~((-25402546) | iNextInt)) | 16879632) * (-140)) + ((~((-8522914) | iNextInt)) * 70) + (((~(iNextInt | 1462628956)) | (-1454272238)) * 70));
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i17 = ~(871873951 | startUptimeMillis);
        int i18 = ~startUptimeMillis;
        int i19 = i16 | (((int) j9) & (370071472 + ((i17 | (~((-37822598) | i18))) * 497) + (((~(startUptimeMillis | (-37822598))) | (~(603175055 | i18)) | 268698896) * 497)));
        int i20 = i19 >>> 24;
        int i21 = i19 & ViewCompat.MEASURED_SIZE_MASK;
        boolean z = i20 != 0;
        if (z) {
            int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
            b = i22 % 128;
            i = 2;
            int i23 = i22 % 2;
            i2 = 1;
        } else {
            i = 2;
            i2 = 0;
        }
        if (!z || i21 >= i || (method = methodArr[i21]) == null) {
            string = null;
        } else {
            int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
            b = i24 % 128;
            if (i24 % i == 0) {
                method.toString();
                throw null;
            }
            string = method.toString();
        }
        arrayList.add(string);
        if ((i20 + 6) * i2 != 0) {
            int i25 = 0 % 2;
            throw new ArithmeticException();
        }
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                if (Build.VERSION.SDK_INT < 31) {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                    return;
                }
                int i26 = (AFInAppEventParameterName + 61) % 128;
                AFInAppEventType = i26;
                int i27 = i26 + 119;
                AFInAppEventParameterName = i27 % 128;
                if (i27 % 2 != 0) {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", false);
                } else {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                }
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while checking BackupRules: ", th3);
        }
    }

    public static String getRevenue() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        b = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType = (AFInAppEventParameterName + 61) % 128;
        String monetizationNetwork = getMonetizationNetwork(AppsFlyerProperties.APP_USER_ID);
        AFInAppEventType = (AFInAppEventParameterName + 11) % 128;
        int i4 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return monetizationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        b = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName = (AFInAppEventType + 65) % 128;
        AFAdRevenueData().copy().getMediationNetwork("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.APP_USER_ID, str}, -692563571, 692563575, (int) System.currentTimeMillis());
        getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        AFInAppEventParameterName = (AFInAppEventType + 33) % 128;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        AFAdRevenueData().afInfoLog().getMediationNetwork = com.appsflyer.internal.AFj1cSDK.getMonetizationNetwork(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if ((r3 + 5) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if ((r2 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r1 = r1 + 67;
        com.appsflyer.internal.AFa1tSDK.b = r1 % 128;
        r1 = r1 % 2;
        AFAdRevenueData().afInfoLog().getMediationNetwork = com.appsflyer.internal.AFj1cSDK.getMonetizationNetwork(r6);
        r6 = com.appsflyer.internal.AFa1tSDK.b + 33;
        com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r6 % 128;
        r6 = r6 % 2;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPhoneNumber(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r2 = r1 + 25
            int r3 = r2 % 128
            com.appsflyer.internal.AFa1tSDK.b = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L1d
            int r2 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r3 = r2 * 89
            r4 = 449984(0x6ddc0, float:6.30562E-40)
            int r2 = r2 * r4
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r2
            int r3 = r3 + 5
            if (r3 == 0) goto L47
            goto L28
        L1d:
            int r2 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r2 = r2 + 113
            int r3 = r2 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L47
        L28:
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.b = r2
            int r1 = r1 % r0
            com.appsflyer.internal.AFc1dSDK r1 = r5.AFAdRevenueData()
            com.appsflyer.internal.AFc1kSDK r1 = r1.afInfoLog()
            java.lang.String r6 = com.appsflyer.internal.AFj1cSDK.getMonetizationNetwork(r6)
            r1.getMediationNetwork = r6
            int r6 = com.appsflyer.internal.AFa1tSDK.b
            int r6 = r6 + 33
            int r1 = r6 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1
            int r6 = r6 % r0
            return
        L47:
            com.appsflyer.internal.AFc1dSDK r0 = r5.AFAdRevenueData()
            com.appsflyer.internal.AFc1kSDK r0 = r0.afInfoLog()
            java.lang.String r6 = com.appsflyer.internal.AFj1cSDK.getMonetizationNetwork(r6)
            r0.getMediationNetwork = r6
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.setPhoneNumber(java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        b = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName = (AFInAppEventType + 53) % 128;
        AFAdRevenueData().copy().getMediationNetwork("setAppId", str);
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.APP_ID, str}, -692563571, 692563575, (int) System.currentTimeMillis());
        AFInAppEventType = (AFInAppEventParameterName + 95) % 128;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i = 2 % 2;
        int i2 = AFInAppEventParameterName + 101;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
                String[] strArr = new String[1];
                strArr[1] = str;
                aFd1pSDKCopy.getMediationNetwork("setExtension", strArr);
            } else {
                AFd1pSDK aFd1pSDKCopy2 = AFAdRevenueData().copy();
                String[] strArr2 = new String[0];
                strArr2[0] = str;
                aFd1pSDKCopy2.getMediationNetwork("setExtension", strArr2);
            }
        } else {
            AFAdRevenueData().copy().getMediationNetwork("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = AFInAppEventParameterName + 1;
        AFInAppEventType = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = AFInAppEventParameterName + 31;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = b + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
                String[] strArr = new String[0];
                strArr[1] = String.valueOf(z);
                aFd1pSDKCopy.getMediationNetwork("setIsUpdate", strArr);
            } else {
                AFd1pSDK aFd1pSDKCopy2 = AFAdRevenueData().copy();
                String[] strArr2 = new String[0];
                strArr2[1] = String.valueOf(z);
                aFd1pSDKCopy2.getMediationNetwork("setIsUpdate", strArr2);
            }
            i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
            i2 = i % 128;
        } else {
            AFAdRevenueData().copy().getMediationNetwork("setIsUpdate", String.valueOf(z));
            i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
            i2 = i % 128;
        }
        b = i2;
        int i6 = i % 2;
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        AFInAppEventType = (AFInAppEventParameterName + 51) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        int i = 2 % 2;
        int i2 = b + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName = (AFInAppEventType + 73) % 128;
        AFAdRevenueData().copy().getMediationNetwork("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        AFInAppEventType = (AFInAppEventParameterName + 9) % 128;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d, double d2) {
        int i = 2 % 2;
        AFAdRevenueData().copy().getMediationNetwork("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap map = new HashMap();
        map.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d2));
        map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        getMonetizationNetwork(new Object[]{this, context, AFInAppEventType.LOCATION_COORDINATES, map}, 1732368696, -1732368678, System.identityHashCode(this));
        int i2 = AFInAppEventParameterName + 93;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException();
        }
        int i3 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        b = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName = (AFInAppEventType + 67) % 128;
        AFAdRevenueData().copy().getMediationNetwork("logSession", new String[0]);
        AFAdRevenueData().copy().getCurrencyIso4217Code();
        getCurrencyIso4217Code(context, AFh1xSDK.logSession);
        getMonetizationNetwork(new Object[]{this, context, null, null}, 1732368696, -1732368678, System.identityHashCode(this));
        int i4 = AFInAppEventParameterName + 87;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 == 0) {
            throw new ArithmeticException();
        }
        int i5 = b + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        int i = 2 % 2;
        Boolean bool = Boolean.FALSE;
        if (ResolutionInfo.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ArrayList()) != 0) {
            throw new RuntimeException("0");
        }
        Context context = (Context) objArr[0];
        AFInAppEventParameterName = (AFInAppEventType + 105) % 128;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                int i2 = AFInAppEventParameterName + 35;
                AFInAppEventType = i2 % 128;
                if (i2 % 2 != 0) {
                    return Boolean.TRUE;
                }
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 8 / 0;
                }
                return bool;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            Boolean bool2 = Boolean.TRUE;
            int i5 = b + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                return bool2;
            }
            throw null;
        } catch (PackageManager.NameNotFoundException e2) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e2);
            return bool;
        }
    }

    private void getCurrencyIso4217Code(Context context, AFh1xSDK aFh1xSDK) {
        int i = 2 % 2;
        getMediationNetwork(context);
        AFh1vSDK aFh1vSDKAreAllFieldsValid = AFAdRevenueData().areAllFieldsValid();
        AFh1tSDK revenue = AFh1tSDK.getRevenue(context);
        if (aFh1vSDKAreAllFieldsValid.getCurrencyIso4217Code()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
            b = i2 % 128;
            int i3 = i2 % 2;
            int i4 = AFInAppEventType + 5;
            AFInAppEventParameterName = i4 % 128;
            if (i4 % 2 == 0) {
                aFh1vSDKAreAllFieldsValid.AFAdRevenueData.put("api_name", aFh1xSDK.toString());
                aFh1vSDKAreAllFieldsValid.getMediationNetwork(revenue);
            } else {
                aFh1vSDKAreAllFieldsValid.AFAdRevenueData.put("api_name", aFh1xSDK.toString());
                aFh1vSDKAreAllFieldsValid.getMediationNetwork(revenue);
                throw null;
            }
        }
        aFh1vSDKAreAllFieldsValid.AFAdRevenueData();
        AFInAppEventParameterName = (AFInAppEventType + 19) % 128;
        int i5 = b + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        Map map2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        b = i2 % 128;
        int i3 = i2 % 2;
        HashMap map3 = map == null ? null : new HashMap(map);
        getMediationNetwork(context);
        AFh1fSDK aFh1fSDK = new AFh1fSDK();
        aFh1fSDK.areAllFieldsValid = str;
        aFh1fSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
        if (map3 != null && map3.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap map4 = new HashMap();
            Object obj = map3.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map5 = new HashMap();
                map5.put("x", Float.valueOf(motionEvent.getX()));
                map5.put("y", Float.valueOf(motionEvent.getY()));
                map4.put("loc", map5);
                map4.put("pf", Float.valueOf(motionEvent.getPressure()));
                map4.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map4.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFg1cSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map4);
            map3.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1fSDK.getMediationNetwork(mapSingletonMap);
        }
        aFh1fSDK.getMonetizationNetwork = map3;
        AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
        String[] strArr = new String[2];
        strArr[0] = str;
        if (aFh1fSDK.getMonetizationNetwork == null) {
            map2 = new HashMap();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
            b = i4 % 128;
            int i5 = i4 % 2;
        } else {
            map2 = aFh1fSDK.getMonetizationNetwork;
        }
        strArr[1] = new JSONObject(map2).toString();
        aFd1pSDKCopy.getMediationNetwork("logEvent", strArr);
        if (str == null) {
            int i6 = b + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            getCurrencyIso4217Code(context, AFh1xSDK.logEvent);
        }
        getMonetizationNetwork(aFh1fSDK, component1(context));
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        int i = 2 % 2;
        AFInAppEventType = (AFInAppEventParameterName + 95) % 128;
        if (!this.toString) {
            int i2 = b + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            AFAdRevenueData("logAdRevenue");
            return;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            int i4 = AFInAppEventType + 81;
            AFInAppEventParameterName = i4 % 128;
            if (i4 % 2 != 0) {
                AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
                throw null;
            }
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
            AFInAppEventType = (AFInAppEventParameterName + 111) % 128;
            return;
        }
        if (AFAdRevenueData().registerClient().AFAdRevenueData()) {
            AFInAppEventParameterName = (AFInAppEventType + 93) % 128;
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 64 / 0;
                return;
            }
            return;
        }
        int i7 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        int i8 = i7 % 2;
        if (!AFk1ySDK.getMediationNetwork(AFAdRevenueData().registerClient().getMediationNetwork())) {
            AFAdRevenueData(new AFh1lSDK(aFAdRevenueData, map));
            return;
        }
        AFInAppEventParameterName = (AFInAppEventType + 41) % 128;
        copy();
        int i9 = AFInAppEventParameterName + 51;
        AFInAppEventType = i9 % 128;
        if (i9 % 2 == 0) {
            throw new ArithmeticException();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = b + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName = (AFInAppEventType + 103) % 128;
        logEvent(context, str, map, null);
        int i4 = AFInAppEventType + 57;
        AFInAppEventParameterName = i4 % 128;
        if (i4 % 2 != 0) {
            throw new ArithmeticException();
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    private AFh1qSDK component1(Context context) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 9;
        AFInAppEventParameterName = i2 % 128;
        if (i2 % 2 == 0) {
            if (!(context instanceof Activity)) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            AFh1qSDK aFh1qSDK = new AFh1qSDK((Activity) context, AFAdRevenueData().w());
            int i4 = AFInAppEventType + 105;
            AFInAppEventParameterName = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            b = i5 % 128;
            int i6 = i5 % 2;
            return aFh1qSDK;
        }
        throw new ArithmeticException();
    }

    private static /* synthetic */ Object copy(Object[] objArr) {
        int i = 2 % 2;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        Map<String, Object> map = (Map) objArr[3];
        AFh1fSDK aFh1fSDK = new AFh1fSDK();
        aFh1fSDK.areAllFieldsValid = str;
        aFh1fSDK.getMonetizationNetwork = map;
        aFa1tSDK.getMonetizationNetwork(aFh1fSDK, aFa1tSDK.component1(context));
        int i2 = AFInAppEventParameterName + 15;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException();
        }
        int i3 = b + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    final void getMonetizationNetwork(AFh1rSDK aFh1rSDK, AFh1qSDK aFh1qSDK) {
        int i = 2 % 2;
        getCurrencyIso4217Code(aFh1rSDK, aFh1qSDK);
        if (AFAdRevenueData().registerClient().getMediationNetwork() == null) {
            AFInAppEventParameterName = (AFInAppEventType + 45) % 128;
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = aFh1rSDK.getCurrencyIso4217Code;
            if (appsFlyerRequestListener != null) {
                int i2 = AFInAppEventType + 105;
                AFInAppEventParameterName = i2 % 128;
                appsFlyerRequestListener.onError(i2 % 2 != 0 ? 108 : 41, "No dev key");
            }
            AFInAppEventParameterName = (AFInAppEventType + 11) % 128;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
            b = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(AFAdRevenueData().component2());
        if (referrer == null) {
            int i5 = b + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            referrer = "";
        } else {
            int i6 = AFInAppEventParameterName + 9;
            AFInAppEventType = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                b = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 4 / 4;
            }
        }
        aFh1rSDK.component3 = referrer;
        AFAdRevenueData(aFh1rSDK);
    }

    private static void getCurrencyIso4217Code(AFh1rSDK aFh1rSDK, AFh1qSDK aFh1qSDK) {
        int i = 2 % 2;
        int i2 = b + 37;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        int i5 = (AFInAppEventType + 73) % 128;
        AFInAppEventParameterName = i5;
        if (aFh1qSDK != null) {
            int i6 = i3 + 95;
            b = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 79;
            AFInAppEventType = i8 % 128;
            if (i8 % 2 != 0) {
                aFh1rSDK.getMediationNetwork = aFh1qSDK.getCurrencyIso4217Code;
                aFh1rSDK.component4 = aFh1qSDK.getMediationNetwork;
            } else {
                aFh1rSDK.getMediationNetwork = aFh1qSDK.getCurrencyIso4217Code;
                aFh1rSDK.component4 = aFh1qSDK.getMediationNetwork;
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i = 2 % 2;
        int i2 = b + 107;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        int i5 = AFInAppEventType + 1;
        AFInAppEventParameterName = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = i3 + 125;
            b = i6 % 128;
            int i7 = i6 % 2;
            AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z);
            aFd1pSDKCopy.getMediationNetwork("anonymizeUser", strArr);
        } else {
            AFAdRevenueData().copy().getMediationNetwork("anonymizeUser", String.valueOf(z));
            int i8 = b + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 / 4;
            }
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
        int i10 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName = (AFInAppEventType + 69) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i;
        AFd1pSDK aFd1pSDKCopy;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = AFInAppEventType >> 70;
            AFInAppEventParameterName = i5 * 12892;
            if (i5 % 4 != 0) {
                int i6 = i3 + 83;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                i = i6 % 2;
                aFd1pSDKCopy = AFAdRevenueData().copy();
                if (i != 0) {
                    aFd1pSDKCopy.getMediationNetwork("registerConversionListener", new String[1]);
                } else {
                    aFd1pSDKCopy.getMediationNetwork("registerConversionListener", new String[0]);
                }
            } else {
                AFAdRevenueData().copy().getMediationNetwork("registerConversionListener", new String[0]);
            }
        } else {
            int i7 = AFInAppEventType + 79;
            AFInAppEventParameterName = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = i3 + 83;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                i = i8 % 2;
                aFd1pSDKCopy = AFAdRevenueData().copy();
                if (i != 0) {
                    aFd1pSDKCopy.getMediationNetwork("registerConversionListener", new String[1]);
                } else {
                    aFd1pSDKCopy.getMediationNetwork("registerConversionListener", new String[0]);
                }
            } else {
                AFAdRevenueData().copy().getMediationNetwork("registerConversionListener", new String[0]);
            }
        }
        getRevenue(appsFlyerConversionListener);
    }

    private void getRevenue(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = 2 % 2;
        int i2 = AFInAppEventParameterName + 113;
        int i3 = i2 % 128;
        AFInAppEventType = i3;
        if (i2 % 2 != 0) {
            int i4 = b;
            int i5 = i4 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            if (appsFlyerConversionListener != null) {
                this.getCurrencyIso4217Code = appsFlyerConversionListener;
                return;
            }
            int i7 = i4 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            if (i7 % 2 != 0) {
                AFInAppEventParameterName = (i3 * 15) % 6714;
                return;
            } else {
                AFInAppEventParameterName = (i3 + 125) % 128;
                return;
            }
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        b = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventParameterName = (AFInAppEventType + 79) % 128;
        AFAdRevenueData().copy().getMediationNetwork("unregisterConversionListener", new String[0]);
        Object obj = null;
        this.getCurrencyIso4217Code = null;
        int i4 = AFInAppEventType + 75;
        AFInAppEventParameterName = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        int i = 2 % 2;
        int i2 = b + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AFAdRevenueData().copy().getMediationNetwork("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            AFAdRevenueData = appsFlyerInAppPurchaseValidatorListener;
            AFInAppEventParameterName = (AFInAppEventType + 11) % 128;
            return;
        }
        int i4 = AFInAppEventParameterName + 25;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 == 0) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
            throw null;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
            throw null;
        }
        AFLogger.afDebugLog("registerValidatorListener null listener");
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static String getRevenue(SimpleDateFormat simpleDateFormat, long j) {
        int i = 2 % 2;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j));
        int i2 = AFInAppEventParameterName + 61;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = b;
        int i4 = i3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = i3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    final class AFa1ySDK implements Runnable {
        private final AFh1rSDK getCurrencyIso4217Code;

        AFa1ySDK(AFh1rSDK aFh1rSDK) {
            this.getCurrencyIso4217Code = aFh1rSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFa1tSDK aFa1tSDK = AFa1tSDK.this;
            AFa1tSDK.getMonetizationNetwork(new Object[]{aFa1tSDK, this.getCurrencyIso4217Code}, 974724333, -974724320, System.identityHashCode(aFa1tSDK));
        }
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        int i = 2 % 2;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        AFh1iSDK aFh1iSDK = new AFh1iSDK();
        aFa1tSDK.getMediationNetwork(context);
        aFh1iSDK.areAllFieldsValid = null;
        aFh1iSDK.getMonetizationNetwork = null;
        aFh1iSDK.component3 = str;
        aFh1iSDK.getMediationNetwork = null;
        aFa1tSDK.AFAdRevenueData(aFh1iSDK);
        int i2 = AFInAppEventParameterName + 101;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException();
        }
        int i3 = b + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        boolean z;
        int i = 2 % 2;
        int i2 = AFInAppEventParameterName + 3;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            String str = aFh1rSDK.areAllFieldsValid;
            throw new ArithmeticException();
        }
        if (aFh1rSDK.areAllFieldsValid == null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
            b = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getMediationNetwork()) {
            int i5 = b + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                AFInAppEventParameterName = (AFInAppEventType >>> 98) >> 2981;
                AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                return;
            } else {
                AFInAppEventParameterName = (AFInAppEventType + 87) % 128;
                AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                return;
            }
        }
        if (z) {
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            } else if (component1()) {
                int i6 = b + 29;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                int i7 = i6 % 2;
                AFInAppEventType = (AFInAppEventParameterName + 117) % 128;
                AppsFlyerRequestListener appsFlyerRequestListener = aFh1rSDK.getCurrencyIso4217Code;
                if (appsFlyerRequestListener != null) {
                    AFInAppEventParameterName = (AFInAppEventType + 113) % 128;
                    appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                }
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
                b = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
            this.component2 = System.currentTimeMillis();
            AFInAppEventType = (AFInAppEventParameterName + 101) % 128;
        }
        AFj1dSDK.getMediationNetwork(AFAdRevenueData().AFAdRevenueData(), new AFa1ySDK(aFh1rSDK), 0L, TimeUnit.MILLISECONDS);
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        b = i10 % 128;
        int i11 = i10 % 2;
    }

    private void getMediationNetwork(String str) {
        int i = 2 % 2;
        AFh1rSDK aFh1rSDKAFAdRevenueData = new AFh1jSDK().AFAdRevenueData(AFAdRevenueData().getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0));
        aFh1rSDKAFAdRevenueData.component3 = str;
        if (str != null) {
            AFInAppEventType = (AFInAppEventParameterName + 31) % 128;
            if (str.length() > 5) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
                b = i2 % 128;
                int i3 = i2 % 2;
                AFInAppEventParameterName = (AFInAppEventType + 59) % 128;
                if (AFAdRevenueData().AFLogger().getCurrencyIso4217Code(aFh1rSDKAFAdRevenueData)) {
                    AFj1dSDK.getMediationNetwork(AFAdRevenueData().AFAdRevenueData(), new AFa1ySDK(aFh1rSDKAFAdRevenueData), 5L, TimeUnit.MILLISECONDS);
                }
            }
        }
        int i4 = b + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final class AFa1vSDK implements AFe1qSDK {
        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getMediationNetwork(AFe1sSDK<?> aFe1sSDK) {
        }

        AFa1vSDK() {
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getMonetizationNetwork(AFe1sSDK<?> aFe1sSDK) {
            if (aFe1sSDK instanceof AFf1uSDK) {
                AFa1tSDK.this.AFAdRevenueData().areAllFieldsValid().getCurrencyIso4217Code(((AFf1rSDK) aFe1sSDK).component2.component2);
            }
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getCurrencyIso4217Code(AFe1sSDK<?> aFe1sSDK, AFe1rSDK aFe1rSDK) {
            JSONObject revenue;
            AFf1aSDK revenue2;
            if (aFe1sSDK instanceof AFf1rSDK) {
                AFf1rSDK aFf1rSDK = (AFf1rSDK) aFe1sSDK;
                boolean z = aFe1sSDK instanceof AFf1uSDK;
                if (z && getCurrencyIso4217Code()) {
                    AFf1uSDK aFf1uSDK = (AFf1uSDK) aFe1sSDK;
                    if (aFf1uSDK.getMediationNetwork == AFe1rSDK.SUCCESS || aFf1uSDK.getRevenue == 1) {
                        AFg1rSDK aFg1rSDK = new AFg1rSDK(aFf1uSDK, AFa1tSDK.this.AFAdRevenueData().component2());
                        AFe1lSDK aFe1lSDKCopydefault = AFa1tSDK.this.AFAdRevenueData().copydefault();
                        aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(aFg1rSDK));
                    }
                }
                AFh1uSDK aFh1uSDKAfErrorLogForExcManagerOnly = AFa1tSDK.this.AFAdRevenueData().afErrorLogForExcManagerOnly();
                if (aFh1uSDKAfErrorLogForExcManagerOnly != null && z) {
                    aFh1uSDKAfErrorLogForExcManagerOnly.getRevenue((AFf1uSDK) aFe1sSDK, new Function0() { // from class: com.appsflyer.internal.AFa1tSDK$AFa1vSDK$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.f$0.getRevenue();
                        }
                    });
                }
                if (aFe1rSDK == AFe1rSDK.SUCCESS) {
                    AFa1tSDK aFa1tSDK = AFa1tSDK.this;
                    aFa1tSDK.getRevenue(aFa1tSDK.component1).getMediationNetwork("sentSuccessfully", "true");
                    if (!(aFe1sSDK instanceof AFf1tSDK) && (revenue2 = new AFg1ySDK(AFa1tSDK.this.component1).getRevenue()) != null && revenue2.getMediationNetwork) {
                        String str = revenue2.getRevenue;
                        AFLogger.INSTANCE.d(AFg1cSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                        AFc1dSDK aFc1dSDKAFAdRevenueData = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData();
                        AFf1tSDK aFf1tSDK = new AFf1tSDK(str, aFc1dSDKAFAdRevenueData);
                        AFe1lSDK aFe1lSDKCopydefault2 = aFc1dSDKAFAdRevenueData.copydefault();
                        aFe1lSDKCopydefault2.getRevenue.execute(aFe1lSDKCopydefault2.new AnonymousClass5(aFf1tSDK));
                    }
                    ResponseNetwork responseNetwork = ((AFe1dSDK) aFf1rSDK).component1;
                    if (responseNetwork != null && (revenue = AFa1qSDK.getRevenue((String) responseNetwork.getBody())) != null) {
                        AFa1tSDK.this.component4 = revenue.optBoolean("send_background", false);
                    }
                    if (z) {
                        AFa1tSDK.this.getMediationNetwork = System.currentTimeMillis();
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(aFe1sSDK instanceof AFg1rSDK) || aFe1rSDK == AFe1rSDK.SUCCESS) {
                return;
            }
            AFg1pSDK aFg1pSDK = new AFg1pSDK(AFa1tSDK.this.AFAdRevenueData());
            AFe1lSDK aFe1lSDKCopydefault3 = AFa1tSDK.this.AFAdRevenueData().copydefault();
            aFe1lSDKCopydefault3.getRevenue.execute(aFe1lSDKCopydefault3.new AnonymousClass5(aFg1pSDK));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit getRevenue() {
            AFa1tSDK aFa1tSDK = AFa1tSDK.this;
            AFa1tSDK.getMonetizationNetwork(new Object[]{aFa1tSDK, new AFh1kSDK()}, 974724333, -974724320, System.identityHashCode(aFa1tSDK));
            return Unit.INSTANCE;
        }

        private boolean getCurrencyIso4217Code() {
            return AFa1tSDK.this.getCurrencyIso4217Code != null;
        }
    }

    private void getCurrencyIso4217Code(Map<String, Object> map) {
        int i = 2 % 2;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return;
        }
        int i2 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            map.get("advertiserId");
            throw null;
        }
        if (map.get("advertiserId") != null) {
            AFInAppEventParameterName = (AFInAppEventType + 41) % 128;
            try {
                if (AFk1ySDK.getMediationNetwork(AFAdRevenueData().afInfoLog().AFAdRevenueData)) {
                    int i3 = AFInAppEventType + 29;
                    AFInAppEventParameterName = i3 % 128;
                    if (i3 % 2 != 0) {
                        map.remove("android_id");
                        try {
                            throw new ArithmeticException();
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (map.remove("android_id") != null) {
                        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
                        b = i4 % 128;
                        int i5 = i4 % 2;
                        AFInAppEventParameterName = (AFInAppEventType + 117) % 128;
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                    }
                }
                if (!(!AFk1ySDK.getMediationNetwork(AFAdRevenueData().registerClient().getRevenue()))) {
                    int i6 = b + 119;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                    if (i6 % 2 != 0) {
                        map.remove("imei");
                        try {
                            obj.hashCode();
                            throw null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (map.remove("imei") != null) {
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                        int i7 = b + 47;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
            } catch (Exception e2) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e2);
            }
        }
    }

    final Map<String, Object> getMediationNetwork(AFh1rSDK aFh1rSDK) {
        String str;
        int i = 2 % 2;
        Context context = AFAdRevenueData().AFInAppEventType().getMonetizationNetwork;
        AFc1qSDK revenue = getRevenue(context);
        AFg1qSDK aFg1qSDKComponent3 = AFAdRevenueData().component3();
        boolean zAFAdRevenueData = AFAdRevenueData().registerClient().AFAdRevenueData();
        boolean mediationNetwork = aFh1rSDK.getMediationNetwork();
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        a(new int[]{1293966833, -1332243105, 2001922811, -600378744, 548813369, -684723692}, 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (zAFAdRevenueData) {
                int i2 = b + 39;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 != 0) {
                    AFInAppEventParameterName = (AFInAppEventType + 15) % 20328;
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
                } else {
                    AFInAppEventParameterName = (AFInAppEventType + 83) % 128;
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
                }
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                if (!mediationNetwork) {
                    str = aFh1rSDK.areAllFieldsValid;
                } else {
                    int i3 = AFInAppEventParameterName;
                    AFInAppEventType = (i3 + 125) % 128;
                    AFInAppEventType = (i3 + 7) % 128;
                    str = "Launch";
                }
                sb.append(str);
                aFLogger.i(aFg1cSDK, sb.toString(), true);
                int i4 = b + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
            }
            component4(context);
            int iIntValue = ((Integer) getMonetizationNetwork(new Object[]{revenue, Boolean.valueOf(mediationNetwork)}, -1175980247, 1175980268, (int) System.currentTimeMillis())).intValue();
            int currencyIso4217Code = getCurrencyIso4217Code(revenue, aFh1rSDK.areAllFieldsValid != null);
            if (mediationNetwork) {
                int i6 = AFInAppEventType;
                AFInAppEventParameterName = (i6 + 69) % 128;
                if (iIntValue == 1) {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    AFInAppEventParameterName = (i6 + 61) % 128;
                    AppsFlyerProperties.getInstance().getCurrencyIso4217Code = true;
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
                    b = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 2 / 3;
                    }
                }
            }
            aFg1qSDKComponent3.getRevenue(map, iIntValue, currencyIso4217Code);
            return map;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Error while preparing to send event", th, true, true, true);
            return map;
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0295  */
    /* JADX WARN: Code duplicated, block: B:35:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x030b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0361 A[Catch: all -> 0x06a3, TryCatch #1 {all -> 0x06a3, blocks: (B:40:0x034c, B:42:0x0361, B:43:0x03a6, B:56:0x0419, B:58:0x0426, B:59:0x0466, B:61:0x0482, B:62:0x04ce), top: B:127:0x034c }] */
    /* JADX WARN: Code duplicated, block: B:69:0x059e  */
    /* JADX WARN: Code duplicated, block: B:83:0x05d5  */
    private static void component4(Context context) throws Throwable {
        int i;
        boolean z;
        int i2;
        int i3;
        String string;
        List listAsList;
        Method[] declaredMethods;
        int length;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i4 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        byte[] bArr = $$a;
        byte b2 = bArr[28];
        byte b3 = bArr[7];
        Object[] objArr2 = new Object[1];
        c(b2, b3, b3, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        byte b4 = bArr[7];
        byte b5 = bArr[28];
        Object[] objArr3 = new Object[1];
        c(b4, b5, b5, objArr3);
        Method method = cls.getMethod((String) objArr3[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        byte b6 = bArr[7];
        byte b7 = bArr[28];
        Object[] objArr4 = new Object[1];
        c(b6, b7, b7, objArr4);
        Method[] methodArr = {method, cls2.getMethod((String) objArr4[0], String.class, Integer.TYPE)};
        int i5 = -2001519171;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2823;
            int iCombineMeasuredStates = 22 - View.combineMeasuredStates(0, 0);
            byte[] bArr2 = $$d;
            byte b8 = bArr2[7];
            Object[] objArr5 = new Object[1];
            d(b8, b8, bArr2[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, jumpTapTimeout, iCombineMeasuredStates, 1814927978, false, (String) objArr5[0], null);
        }
        long j = 0;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) != null) {
            i = i5;
            break;
        }
        int i6 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 != 0) {
            declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.combineMeasuredStates(0, 0), 2823 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 23)).getDeclaredMethods();
            length = declaredMethods.length;
        } else {
            declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.green(0), 2823 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).getDeclaredMethods();
            length = declaredMethods.length;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i = i5;
                break;
            }
            Method method2 = declaredMethods[i7];
            try {
                char[] cArr = {39561, 50363, 9959, 32809, 57897, 19858, 45012, 2306, 27468, 51916, 13483, 38645, 61481, 21098, 48536, 8151, 30983, 56068, 15020, 25789, 50915, Typography.ellipsis, 33386, 60824};
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(j) + 24121;
                Object[] objArr6 = new Object[1];
                e(cArr, packedPositionGroup, objArr6);
                Class<?> cls3 = Class.forName((String) objArr6[0]);
                Object[] objArr7 = new Object[1];
                f(new char[]{7, 65532, 1, 65534, 1, 65533, '\n', 11, 65535, 65533, '\f', 65509}, false, 12 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 239, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8, objArr7);
                Object[] objArr8 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr7[0], null).invoke(method2, null)).intValue())};
                Object[] objArr9 = new Object[1];
                f(new char[]{11, 5, 4, 17, 65485, 6, '\r', 0, 11, 65485, 0, 21, 0, '\t', 17, 4, '\b', 5, '\b', 3, 14, 65516, 65485, 19, 2, 4}, true, 26 - View.combineMeasuredStates(0, 0), Color.alpha(0) + 232, (-16777202) - Color.rgb(0, 0, 0), objArr9);
                Class<?> cls4 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                e(new char[]{39562, 53143, 12451, 26007, 52875, 13225, 25791, 51639}, (ViewConfiguration.getScrollBarSize() >> 8) + 21767, objArr10);
                if (((Boolean) cls4.getMethod((String) objArr10[0], Integer.TYPE).invoke(null, objArr8)).booleanValue()) {
                    Class cls5 = Long.TYPE;
                    Object[] objArr11 = new Object[1];
                    e(new char[]{39561, 50363, 9959, 32809, 57897, 19858, 45012, 2306, 27468, 51916, 13483, 38645, 61481, 21098, 48536, 8151, 30983, 56068, 15020, 25789, 50915, Typography.ellipsis, 33386, 60824}, 24121 - View.resolveSizeAndState(0, 0, 0), objArr11);
                    Class<?> cls6 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    f(new char[]{65533, 65531, 6, 15, 65514, 4, '\b', 11, '\n', 65531, 65512, '\n', 65531}, true, Process.getGidForName("") + 14, (ViewConfiguration.getJumpTapTimeout() >> 16) + 241, (Process.myTid() >> 22) + 1, objArr12);
                    if (cls5.equals(cls6.getMethod((String) objArr12[0], null).invoke(method2, null))) {
                        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
                        b = i8 % 128;
                        int i9 = i8 % 2;
                        Object[] objArr13 = new Object[1];
                        e(new char[]{39561, 50363, 9959, 32809, 57897, 19858, 45012, 2306, 27468, 51916, 13483, 38645, 61481, 21098, 48536, 8151, 30983, 56068, 15020, 25789, 50915, Typography.ellipsis, 33386, 60824}, Gravity.getAbsoluteGravity(0, 0) + 24121, objArr13);
                        Class<?> cls7 = Class.forName((String) objArr13[0]);
                        Object[] objArr14 = new Object[1];
                        f(new char[]{65529, 5, 65533, '\f', 65533, '\n', 65516, 17, '\b', 65533, 11, 65535, 65533, '\f', 65512, 65529, '\n'}, false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, 239 - ExpandableListView.getPackedPositionGroup(0L), 10 - TextUtils.lastIndexOf("", '0', 0, 0), objArr14);
                        Object[] objArr15 = (Object[]) cls7.getMethod((String) objArr14[0], null).invoke(method2, null);
                        if (objArr15.length == 2) {
                            int i10 = b + 49;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                            if (i10 % 2 != 0) {
                                if (Long.TYPE.equals(objArr15[0])) {
                                    objArr = new Object[1];
                                    e(new char[]{39561, 50363, 9959, 32809, 57897, 19858, 45012, 2306, 27468, 51916, 13483, 38645, 61481, 21098, 48536, 8151, 30983, 56068, 15020, 25789, 50915, Typography.ellipsis, 33386, 60824}, TextUtils.lastIndexOf("", '0') + 24122, objArr);
                                    if (Class.forName((String) objArr[0]).equals(objArr15[1])) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char cMyTid = (char) (Process.myTid() >> 22);
                                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2823;
                                            int i11 = 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            byte[] bArr3 = $$d;
                                            byte b9 = bArr3[7];
                                            Object[] objArr16 = new Object[1];
                                            d(b9, b9, bArr3[5], objArr16);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, tapTimeout, i11, 1814927978, false, (String) objArr16[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int iIndexOf = 2823 - TextUtils.indexOf("", "");
                                            int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22;
                                            byte[] bArr4 = $$d;
                                            byte b10 = bArr4[7];
                                            Object[] objArr17 = new Object[1];
                                            d(b10, b10, bArr4[5], objArr17);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, iIndexOf, scrollDefaultDelay2, 1814927978, false, (String) objArr17[0], null);
                                        }
                                        try {
                                            Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cResolveSize = (char) View.resolveSize(0, 0);
                                                int offsetBefore = 2823 - TextUtils.getOffsetBefore("", 0);
                                                int iMyTid = 22 - (Process.myTid() >> 22);
                                                byte b11 = $$d[54];
                                                Object[] objArr19 = new Object[1];
                                                d((byte) 52, b11, (short) (b11 | 32), objArr19);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, offsetBefore, iMyTid, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr18)).longValue();
                                            i = -2001519171;
                                            break;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause == null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } else if (!(!Long.TYPE.equals(objArr15[0]))) {
                                objArr = new Object[1];
                                e(new char[]{39561, 50363, 9959, 32809, 57897, 19858, 45012, 2306, 27468, 51916, 13483, 38645, 61481, 21098, 48536, 8151, 30983, 56068, 15020, 25789, 50915, Typography.ellipsis, 33386, 60824}, TextUtils.lastIndexOf("", '0') + 24122, objArr);
                                if (Class.forName((String) objArr[0]).equals(objArr15[1])) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char cMyTid2 = (char) (Process.myTid() >> 22);
                                        int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 2823;
                                        int i12 = 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                        byte[] bArr5 = $$d;
                                        byte b12 = bArr5[7];
                                        Object[] objArr110 = new Object[1];
                                        d(b12, b12, bArr5[5], objArr110);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid2, tapTimeout2, i12, 1814927978, false, (String) objArr110[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char scrollDefaultDelay3 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                        int iIndexOf2 = 2823 - TextUtils.indexOf("", "");
                                        int scrollDefaultDelay4 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22;
                                        byte[] bArr6 = $$d;
                                        byte b13 = bArr6[7];
                                        Object[] objArr111 = new Object[1];
                                        d(b13, b13, bArr6[5], objArr111);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay3, iIndexOf2, scrollDefaultDelay4, 1814927978, false, (String) objArr111[0], null);
                                    }
                                    Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cResolveSize2 = (char) View.resolveSize(0, 0);
                                        int offsetBefore2 = 2823 - TextUtils.getOffsetBefore("", 0);
                                        int iMyTid2 = 22 - (Process.myTid() >> 22);
                                        byte b14 = $$d[54];
                                        Object[] objArr113 = new Object[1];
                                        d((byte) 52, b14, (short) (b14 | 32), objArr113);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize2, offsetBefore2, iMyTid2, -2137287382, false, (String) objArr113[0], new Class[]{Long.TYPE, Method.class});
                                    }
                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                    i = -2001519171;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                i7++;
                i5 = -2001519171;
                j = 0;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int i13 = 2823 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i14 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte[] bArr7 = $$d;
            byte b15 = bArr7[7];
            Object[] objArr20 = new Object[1];
            d(b15, b15, bArr7[5], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i13, i14, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
            int packedPositionType = 2823 - ExpandableListView.getPackedPositionType(0L);
            int iRgb = (-16777194) - Color.rgb(0, 0, 0);
            Object[] objArr22 = new Object[1];
            d((byte) 52, (byte) 14, (short) 51, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel, packedPositionType, iRgb, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cLastIndexOf = (char) (37656 - TextUtils.lastIndexOf("", '0', 0, 0));
            int pressedStateDuration = 2720 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 20;
            Object[] objArr24 = new Object[1];
            d((byte) 52, (byte) 14, (short) 51, objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf, pressedStateDuration, iLastIndexOf, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j2 = -246401349;
        long j3 = 69;
        long j4 = -1;
        long j5 = j2 ^ j4;
        long j6 = jLongValue ^ j4;
        long jMyPid = Process.myPid();
        long j7 = (((long) 70) * j2) + (((long) (-68)) * jLongValue) + (((((j5 | j6) | jMyPid) ^ j4) | (((j2 | jLongValue) | jMyPid) ^ j4)) * j3) + (((long) (-69)) * (((j5 | jLongValue) ^ j4) | ((j5 | jMyPid) ^ j4) | ((jLongValue | jMyPid) ^ j4))) + (j3 * ((j6 | j2) ^ j4)) + ((long) (-1564004496));
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i15 = ~elapsedCpuTime;
        int i16 = ((int) (j7 >> 32)) & (805526090 + (((~((-1267191525) | i15)) | R.id.popup_submenu_presenter) * 184) + ((elapsedCpuTime | 340267280) * (-184)) + ((~(1590549360 | i15)) * 184));
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i17 = 1457148447 + (((~((-1771076009) | iMaxMemory)) | (-1086664878)) * (-318));
        int i18 = ~((-1086664878) | iMaxMemory);
        int i19 = ~iMaxMemory;
        int i20 = i16 | (((int) j7) & (i17 + ((i18 | (~(1775597997 | i19))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iMaxMemory | 1775597997)) | (~((-4521990) | i19))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)));
        int i21 = i20 >>> 24;
        int i22 = i20 & ViewCompat.MEASURED_SIZE_MASK;
        if (i21 != 0) {
            int i23 = b + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
            if (i23 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
            b = i24 % 128;
            i2 = 2;
            int i25 = i24 % 2;
            i3 = 1;
        } else {
            i2 = 2;
            i3 = 0;
        }
        if (z) {
            int i26 = b;
            int i27 = i26 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27 % 128;
            int i28 = i27 % i2;
            if (i22 < i2) {
                int i29 = i26 + 9;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i29 % 128;
                if (i29 % i2 != 0) {
                    Method method3 = methodArr[i22];
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Method method4 = methodArr[i22];
                if (method4 != null) {
                    string = method4.toString();
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
        } else {
            string = null;
        }
        arrayList.add(string);
        if ((i21 + 6) * i3 != 0) {
            throw null;
        }
        int i30 = AFInAppEventParameterName + 5;
        AFInAppEventType = i30 % 128;
        try {
            if (i30 % 2 == 0) {
                int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                b = i31 % 128;
                int i32 = i31 % 2;
                listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 13800).requestedPermissions);
                if (!listAsList.contains("android.permission.INTERNET")) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                }
            } else {
                listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
                if (!listAsList.contains("android.permission.INTERNET")) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                }
            }
            if (!listAsList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                int i33 = AFInAppEventType + 23;
                AFInAppEventParameterName = i33 % 128;
                if (i33 % 2 != 0) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                    throw new NullPointerException();
                }
                int i34 = b + 83;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i34 % 128;
                int i35 = i34 % 2;
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32 && !listAsList.contains("com.google.android.gms.permission.AD_ID")) {
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                AFInAppEventType = (AFInAppEventParameterName + 71) % 128;
            }
            AFInAppEventParameterName = (AFInAppEventType + 125) % 128;
        } catch (Exception e2) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while validation permissions. ", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r5 = (java.util.Map) r5.get("meta");
        r1 = com.appsflyer.internal.AFa1tSDK.b + 123;
        com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if ((r1 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r1 = 2 % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        r5 = (java.util.Map) r5.get("meta");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if ((r1 << 5) == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.Object> getRevenue(java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.b = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "meta"
            if (r1 == 0) goto L74
            boolean r1 = r5.containsKey(r3)
            if (r1 == 0) goto L55
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r1 = r1 + 95
            int r4 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L2f
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r1 = r1 * 60
            int r4 = r1 / 9463
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r4
            int r1 = r1 << 5
            if (r1 != 0) goto L4e
            goto L3a
        L2f:
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r1 = r1 + 117
            int r4 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L4e
        L3a:
            java.lang.Object r5 = r5.get(r3)
            java.util.Map r5 = (java.util.Map) r5
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r1 = r1 + 123
            int r3 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L5e
            int r1 = r0 % 4
            goto L5e
        L4e:
            java.lang.Object r5 = r5.get(r3)
            java.util.Map r5 = (java.util.Map) r5
            throw r2
        L55:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r5.put(r3, r1)
            r5 = r1
        L5e:
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 + 45
            int r3 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L73
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            return r5
        L73:
            throw r2
        L74:
            r5.containsKey(r3)
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getRevenue(java.util.Map):java.util.Map");
    }

    private static String getMediationNetwork(Activity activity) {
        Intent intent;
        Throwable th;
        int i = 2 % 2;
        int i2 = AFInAppEventType + 37;
        AFInAppEventParameterName = i2 % 128;
        String string = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (activity != null && (intent = activity.getIntent()) != null) {
            AFInAppEventType = (AFInAppEventParameterName + 99) % 128;
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    int i3 = AFInAppEventType + 39;
                    AFInAppEventParameterName = i3 % 128;
                    if (i3 % 2 != 0) {
                        String string2 = extras.getString("af");
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            th = th2;
                            string = string2;
                            AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, th.getMessage(), th);
                            int i4 = b + 85;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                            int i5 = i4 % 2;
                            return string;
                        }
                    }
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
                    b = i6 % 128;
                    int i7 = i6 % 2;
                    string = extras.getString("af");
                    if (string != null) {
                        int i8 = b + 25;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                        int i9 = i8 % 2;
                        AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(string)));
                        extras.remove("af");
                        activity.setIntent(intent.putExtras(extras));
                        int i10 = AFInAppEventParameterName + 29;
                        AFInAppEventType = i10 % 128;
                        int i11 = i10 % 2;
                    }
                }
                return string;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return string;
    }

    private String getRevenue(Context context, String str) {
        int i = 2 % 2;
        int i2 = b + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = (AFInAppEventType + 15) % 128;
        AFInAppEventParameterName = i4;
        if (context == null) {
            AFInAppEventType = (i4 + 7) % 128;
            return null;
        }
        getMediationNetwork(context);
        String currencyIso4217Code = AFAdRevenueData().getRevenue().getCurrencyIso4217Code(str);
        int i5 = AFInAppEventType + 65;
        AFInAppEventParameterName = i5 % 128;
        if (i5 % 2 != 0) {
            throw new ArithmeticException();
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        int i = 2 % 2;
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        try {
            if (str != null) {
                int i2 = AFInAppEventType + 3;
                AFInAppEventParameterName = i2 % 128;
                if (i2 % 2 != 0) {
                    jSONObject.put("pid", str);
                    throw new ArithmeticException();
                }
                jSONObject.put("pid", str);
            }
            if (str2 != null) {
                int i3 = b + 87;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                if (i3 % 2 != 0) {
                    jSONObject.put("c", str2);
                    throw null;
                }
                jSONObject.put("c", str2);
            }
            if (str3 != null) {
                jSONObject.put("af_siteid", str3);
            }
        } catch (JSONException e2) {
            AFLogger.afErrorLog(e2.getMessage(), e2);
        }
        if (!jSONObject.has("pid")) {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            int i4 = AFInAppEventType + 5;
            AFInAppEventParameterName = i4 % 128;
            if (i4 % 2 != 0) {
                throw new ArithmeticException();
            }
            return;
        }
        int i5 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        AFInAppEventType = (AFInAppEventParameterName + 85) % 128;
        getMonetizationNetwork(new Object[]{"preInstallName", jSONObject.toString()}, -692563571, 692563575, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        int i = 2 % 2;
        String str = (String) objArr[0];
        try {
            if (new JSONObject(str).has("pid")) {
                AFInAppEventType = (AFInAppEventParameterName + 107) % 128;
                getMonetizationNetwork(new Object[]{"preInstallName", str}, -692563571, 692563575, (int) System.currentTimeMillis());
                return null;
            }
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                int i3 = AFInAppEventType / 46;
                AFInAppEventParameterName = i3 % 28715;
                if (i3 % 3 != 0) {
                    throw null;
                }
            } else {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                int i4 = AFInAppEventType + 125;
                AFInAppEventParameterName = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }
            int i5 = b + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return null;
        } catch (JSONException e2) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        getMediationNetwork(r5);
        AFAdRevenueData().getRevenue();
        com.appsflyer.internal.AFc1pSDK.AFAdRevenueData(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if ((r1 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if ((r1 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        getMediationNetwork(r5);
        AFAdRevenueData().getRevenue();
        r5 = com.appsflyer.internal.AFc1pSDK.AFAdRevenueData(r5);
        r1 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        com.appsflyer.internal.AFa1tSDK.b = r1 % 128;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isPreInstalledApp(android.content.Context r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.b = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1b
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 + (-41)
            int r3 = r1 * 30075
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L41
            goto L26
        L1b:
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 + 77
            int r3 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L41
        L26:
            r4.getMediationNetwork(r5)
            com.appsflyer.internal.AFc1dSDK r1 = r4.AFAdRevenueData()
            r1.getRevenue()
            boolean r5 = com.appsflyer.internal.AFc1pSDK.AFAdRevenueData(r5)
            int r1 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 47
            int r3 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.b = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L40
            return r5
        L40:
            throw r2
        L41:
            r4.getMediationNetwork(r5)
            com.appsflyer.internal.AFc1dSDK r0 = r4.AFAdRevenueData()
            r0.getRevenue()
            com.appsflyer.internal.AFc1pSDK.AFAdRevenueData(r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.isPreInstalledApp(android.content.Context):boolean");
    }

    public static String getMonetizationNetwork(AFc1qSDK aFc1qSDK, String str) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 99;
        AFInAppEventParameterName = i2 % 128;
        if (i2 % 2 != 0) {
            aFc1qSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
            throw null;
        }
        String strAFAdRevenueData = aFc1qSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
        if (strAFAdRevenueData != null) {
            int i3 = b + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            return strAFAdRevenueData;
        }
        aFc1qSDK.getMediationNetwork("CACHED_CHANNEL", str);
        AFInAppEventType = (AFInAppEventParameterName + 103) % 128;
        int i5 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static SharedPreferences c_(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (AFa1tSDK.class) {
            AFInAppEventParameterName = (AFInAppEventType + 63) % 128;
            if (((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).hashCode == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    ((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).hashCode = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    AFInAppEventParameterName = (AFInAppEventType + 35) % 128;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th;
                }
            }
            sharedPreferences = ((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).hashCode;
            AFInAppEventParameterName = (AFInAppEventType + 103) % 128;
        }
        return sharedPreferences;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r1 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        com.appsflyer.internal.AFa1tSDK.b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        getMediationNetwork(r5);
        AFAdRevenueData().component2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if ((r1 >> 5) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if ((r1 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        getMediationNetwork(r5);
        r5 = AFAdRevenueData().component2();
        r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName + 121;
        com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFc1qSDK getRevenue(android.content.Context r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1c
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 / 61
            int r3 = r1 + 14290
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r3
            int r1 = r1 >> 5
            if (r1 == 0) goto L48
            goto L27
        L1c:
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 + 11
            int r3 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L48
        L27:
            r4.getMediationNetwork(r5)
            com.appsflyer.internal.AFc1dSDK r5 = r4.AFAdRevenueData()
            com.appsflyer.internal.AFc1qSDK r5 = r5.component2()
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 + 121
            int r3 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L47
            int r1 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.b = r2
            int r1 = r1 % r0
            return r5
        L47:
            throw r2
        L48:
            r4.getMediationNetwork(r5)
            com.appsflyer.internal.AFc1dSDK r5 = r4.AFAdRevenueData()
            r5.component2()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getRevenue(android.content.Context):com.appsflyer.internal.AFc1qSDK");
    }

    private static int getCurrencyIso4217Code(AFc1qSDK aFc1qSDK, boolean z) {
        int monetizationNetwork;
        int i = 2 % 2;
        int i2 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            AFInAppEventType = (AFInAppEventParameterName + 7) * 351;
            monetizationNetwork = getMonetizationNetwork(aFc1qSDK, "appsFlyerInAppEventCount", z);
            int i3 = AFInAppEventParameterName % 63;
            AFInAppEventType = i3 * 16595;
            if ((i3 >>> 2) == 0) {
                throw null;
            }
        } else {
            AFInAppEventType = (AFInAppEventParameterName + 125) % 128;
            monetizationNetwork = getMonetizationNetwork(aFc1qSDK, "appsFlyerInAppEventCount", z);
            int i4 = AFInAppEventParameterName + 123;
            AFInAppEventType = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
        int i5 = b + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    private static int getMonetizationNetwork(AFc1qSDK aFc1qSDK, String str, boolean z) {
        int i = 2 % 2;
        int i2 = b + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AFInAppEventType = (AFInAppEventParameterName + 35) % 128;
        int iAFAdRevenueData = aFc1qSDK.AFAdRevenueData(str, 0);
        if (!(!z)) {
            int i4 = b + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            iAFAdRevenueData++;
            aFc1qSDK.getMediationNetwork(str, iAFAdRevenueData);
            int i6 = b + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = AFInAppEventParameterName + 61;
        AFInAppEventType = i8 % 128;
        if (i8 % 2 != 0) {
            return iAFAdRevenueData;
        }
        throw null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        b = i2 % 128;
        int i3 = i2 % 2;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        String str4 = (String) objArr[5];
        String str5 = (String) objArr[6];
        Map map = (Map) objArr[7];
        AFInAppEventParameterName = (AFInAppEventType + 117) % 128;
        AFd1pSDK aFd1pSDKCopy = aFa1tSDK.AFAdRevenueData().copy();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        strArr[3] = str4;
        strArr[4] = str5;
        strArr[5] = map == null ? "" : map.toString();
        aFd1pSDKCopy.getMediationNetwork("validateAndTrackInAppPurchase", strArr);
        if (!aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.PURCHASE_VALIDATION;
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            sb.append(" ");
            sb.append(str5);
            aFLogger.i(aFg1cSDK, sb.toString());
        }
        if (str != null && str4 != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            int i5 = i4 % 128;
            b = i5;
            int i6 = i4 % 2;
            int i7 = AFInAppEventParameterName;
            AFInAppEventType = (i7 + 105) % 128;
            if (str2 != null) {
                int i8 = i5 + 59;
                int i9 = i8 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9;
                int i10 = i8 % 2;
                AFInAppEventType = (i7 + 39) % 128;
                if (str5 != null) {
                    int i11 = i9 + 85;
                    b = i11 % 128;
                    int i12 = i11 % 2;
                    if (str3 != null) {
                        new Thread(new com.appsflyer.internal.AFa1ySDK(context.getApplicationContext(), aFa1tSDK.AFAdRevenueData().registerClient().getMediationNetwork(), str, str2, str3, str4, str5, map)).start();
                        return null;
                    }
                }
            }
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFAdRevenueData;
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            return null;
        }
        int i13 = b + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
        if (i13 % 2 != 0) {
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
            int i14 = AFInAppEventType / 55;
            AFInAppEventParameterName = i14 >>> 24712;
            if (i14 - 4 == 0) {
                return null;
            }
        } else {
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
            int i15 = AFInAppEventType + 91;
            AFInAppEventParameterName = i15 % 128;
            if (i15 % 2 == 0) {
                return null;
            }
        }
        throw new ArithmeticException();
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        int i = 2 % 2;
        int i2 = b + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        AFInAppEventParameterName = (AFInAppEventType + 115) % 128;
        boolean zAFAdRevenueData = aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData();
        int i4 = AFInAppEventType + 9;
        AFInAppEventParameterName = i4 % 128;
        if (i4 % 2 != 0) {
            throw new ArithmeticException();
        }
        Boolean boolValueOf = Boolean.valueOf(zAFAdRevenueData);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return boolValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        b = i2 % 128;
        boolean z = false;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
            if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
                z = true;
            } else {
                AFInAppEventType = (AFInAppEventParameterName + 51) % 128;
            }
        } else if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            z = true;
        } else {
            AFInAppEventType = (AFInAppEventParameterName + 51) % 128;
        }
        AFAdRevenueData().copy().getMediationNetwork("log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (z) {
            AFAdRevenueData().v().component4();
            return;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        int i5 = i4 % 128;
        b = i5;
        int i6 = i4 % 2;
        int i7 = AFInAppEventParameterName + 121;
        AFInAppEventType = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            AFAdRevenueData().v().getMonetizationNetwork();
            throw null;
        }
        int i8 = i5 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        if (i8 % 2 == 0) {
            AFAdRevenueData().v().getMonetizationNetwork();
        } else {
            AFAdRevenueData().v().getMonetizationNetwork();
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        String strTrim;
        int i = 2 % 2;
        AFInAppEventType = (AFInAppEventParameterName + 13) % 128;
        if (!(!AFk1ySDK.getCurrencyIso4217Code(str2))) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            int i2 = b + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 6 / 0;
                return;
            }
            return;
        }
        int i4 = b + 49;
        int i5 = i4 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5;
        int i6 = i4 % 2;
        int i7 = AFInAppEventType + 27;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        int i8 = i5 + 95;
        b = i8 % 128;
        int i9 = i8 % 2;
        if (str != null) {
            int i10 = i5 + 37;
            b = i10 % 128;
            int i11 = i10 % 2;
            strTrim = str.trim();
        } else {
            strTrim = "";
        }
        AFe1zSDK.getMediationNetwork(new AFe1vSDK(strTrim, str2.trim()));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43043);
            int i3 = 3111 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 22;
            byte b2 = $$d[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            d(b2, b3, (short) (b3 | 51), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i3, fadingEdgeLength, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        f(new char[]{6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1}, true, 22 - ExpandableListView.getPackedPositionType(0L), 235 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        f(new char[]{65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5}, false, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, 238 - Color.alpha(0), 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSize = (char) (43042 - View.resolveSize(0, 0));
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 3111;
            int fadingEdgeLength2 = 22 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte b4 = $$d[7];
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            d(b4, b5, (short) (b5 | 103), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, iMakeMeasureSpec, fadingEdgeLength2, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
            b = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (43041 - TextUtils.lastIndexOf("", '0'));
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 3112;
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
                byte[] bArr = $$d;
                byte b6 = (byte) (bArr[33] - 1);
                byte b7 = bArr[7];
                Object[] objArr6 = new Object[1];
                d(b6, b7, (short) (b7 | 155), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, iIndexOf, jumpTapTimeout, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i6};
            int[] iArr2 = {i7};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = (-1941968734) + (((~((-151212850) | iIdentityHashCode)) | (-1553818610)) * (-318));
            int i9 = ~((-1553818610) | iIdentityHashCode);
            int i10 = ~iIdentityHashCode;
            int i11 = i8 + ((i9 | (~(1570730993 | i10))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode | 1570730993)) | (~((-1419518145) | i10))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 920898758;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
            objArr = new Object[]{new int[1], iArr2, iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{39561, 13733, 50395, 38903, 9809, 61772, 32872, 20636, 58300, 45714, 19766, 7223, 44868, 32364, 3748, 55751}, 44838 - TextUtils.indexOf((CharSequence) "", '0'), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{39562, 29148, 19504, 22684, 14331, 589, 7861, 62951, 49267, 56497, 43806, 34402, 37604, 26899, 17533, 20691}, TextUtils.indexOf("", "") + 60251, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i14 = b + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, 920898758};
                byte[] bArr2 = $$g;
                byte b8 = bArr2[11];
                Object[] objArr11 = new Object[1];
                h(b8, bArr2[0], b8, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b9 = bArr2[0];
                byte b10 = b9;
                Object[] objArr12 = new Object[1];
                h(b9, bArr2[11], b10, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (43043 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int iResolveSize = 3111 - View.resolveSize(0, 0);
                    int mirror = 'F' - AndroidCharacter.getMirror('0');
                    byte[] bArr3 = $$d;
                    byte b11 = (byte) (bArr3[33] - 1);
                    byte b12 = bArr3[7];
                    Object[] objArr14 = new Object[1];
                    d(b11, b12, (short) (b12 | 155), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iResolveSize, mirror, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    f(new char[]{6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1}, true, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21, 233 - ImageFormat.getBitsPerPixel(0), 5 - MotionEvent.axisFromString(""), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    f(new char[]{65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5}, false, 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 238 - TextUtils.indexOf("", "", 0), 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43041);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 3111;
                        int i16 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21;
                        byte b13 = $$d[7];
                        byte b14 = b13;
                        Object[] objArr17 = new Object[1];
                        d(b13, b14, (short) (b14 | 103), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, tapTimeout, i16, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mode = (char) (43042 - View.MeasureSpec.getMode(0));
                        int i17 = 3111 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int gidForName = 21 - Process.getGidForName("");
                        byte b15 = $$d[7];
                        byte b16 = b15;
                        Object[] objArr18 = new Object[1];
                        d(b15, b16, (short) (b16 | 51), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, i17, gidForName, -1272852037, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        int i18 = ((int[]) objArr[1])[0];
        int i19 = ((int[]) objArr[2])[0];
        if (i19 != i18) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    int i20 = b + 107;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                    if (i20 % 2 != 0) {
                        arrayList.add(strArr2[i2]);
                        i2 += 58;
                    } else {
                        arrayList.add(strArr2[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i19));
        }
        int i21 = ((int[]) objArr[0])[0];
        int i22 = ((int[]) objArr[2])[0];
        int i23 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr3 = {i22};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i24 = ~iIdentityHashCode2;
        int i25 = i21 + (-1272411950) + (((~((-655341159) | i24)) | 637599780) * 168) + ((~((-637599781) | iIdentityHashCode2)) * 168) + (((~(iIdentityHashCode2 | (-17741379))) | (~(i24 | (-1049690301))) | 412090520) * 168);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        ((int[]) objArr[0])[0] = i27 ^ (i27 << 5);
        Object[] objArr19 = {new int[1], new int[]{i23}, iArr3, strArr3};
        int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        b = i28 % 128;
        int i29 = i28 % 2;
        AFInAppEventType = (AFInAppEventParameterName + 21) % 128;
        String mediationNetwork = AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork();
        int i30 = AFInAppEventParameterName + 71;
        int i31 = ((int[]) objArr19[0])[0];
        int i32 = i31 * i31;
        int i33 = -(399683387 * i31);
        int i34 = (i32 & i33) + (i32 | i33);
        int i35 = -(i31 * (-1967468217));
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        int i37 = (i36 & (-705851263)) + ((-705851263) | i36);
        int i38 = i37 >> 23;
        int i39 = ((i38 ^ (-1023)) + ((i38 & (-1023)) << 1)) / 512;
        int i40 = ((i39 | 1) << 1) - (i39 ^ 1);
        int i41 = -(((((i37 >> 22) - 2047) / 1024) + 1) ^ ((i37 & i40) + (i40 | i37)));
        int i42 = (i41 ^ 5) + ((i41 & 5) << 1);
        int i43 = i42 >> 22;
        int i44 = ((((i43 | (-2047)) << 1) - (i43 ^ (-2047))) / 1024) + 1;
        AFInAppEventType = i30 % (569600 / (((-(((i44 | 1) << 1) - (i44 ^ 1))) & i42) * 890));
        return mediationNetwork;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        r0 = 84 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if ((r2 >> 5) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        if ((r2 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        r2 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        com.appsflyer.internal.AFa1tSDK.b = r2 % 128;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getHostPrefix() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r1 = r1 + 71
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L2d
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r1 = r1 + 3
            int r1 = r1 * 17006
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r1
            com.appsflyer.internal.AFc1dSDK r1 = r4.AFAdRevenueData()
            com.appsflyer.internal.AFe1zSDK r1 = r1.AFKeystoreWrapper()
            java.lang.String r1 = r1.getCurrencyIso4217Code()
            int r2 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r3 = r2 * 2553
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r3
            int r2 = r2 >> 5
            if (r2 == 0) goto L5c
            goto L4c
        L2d:
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r1 = r1 + 3
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r1
            com.appsflyer.internal.AFc1dSDK r1 = r4.AFAdRevenueData()
            com.appsflyer.internal.AFe1zSDK r1 = r1.AFKeystoreWrapper()
            java.lang.String r1 = r1.getCurrencyIso4217Code()
            int r2 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r2 = r2 + 67
            int r3 = r2 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L5c
        L4c:
            int r2 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r2 = r2 + 35
            int r3 = r2 % 128
            com.appsflyer.internal.AFa1tSDK.b = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L5b
            r0 = 84
            int r0 = r0 / 0
        L5b:
            return r1
        L5c:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getHostPrefix():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if ((r5 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        r4.component3 = java.util.concurrent.TimeUnit.SECONDS.toMillis(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if ((r1 >>> 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if ((r1 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r4.component3 = java.util.concurrent.TimeUnit.SECONDS.toMillis(r5);
        r5 = com.appsflyer.internal.AFa1tSDK.b + 15;
        com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r5 % 128;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setMinTimeBetweenSessions(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.b = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1a
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 + 4
            int r2 = r1 * 7193
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r2
            int r1 = r1 >>> r0
            if (r1 == 0) goto L3c
            goto L25
        L1a:
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L3c
        L25:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = (long) r5
            long r1 = r1.toMillis(r2)
            r4.component3 = r1
            int r5 = com.appsflyer.internal.AFa1tSDK.b
            int r5 = r5 + 15
            int r1 = r5 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L3a
            return
        L3a:
            r5 = 0
            throw r5
        L3c:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = (long) r5
            long r0 = r0.toMillis(r1)
            r4.component3 = r0
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.setMinTimeBetweenSessions(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if ((r3 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r3 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        r4 = r3 + 5;
        com.appsflyer.internal.AFa1tSDK.b = r4 % 128;
        r4 = r4 % 2;
        r3 = r3 + 33;
        com.appsflyer.internal.AFa1tSDK.b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if ((r3 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        AFAdRevenueData().AFLogger().getRevenue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if ((r1 * 4) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if ((r1 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r1 = AFAdRevenueData().AFLogger().getRevenue();
        r3 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName + 65;
        com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.appsflyer.internal.AFj1qSDK[] component3() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r1 = r1 + 15
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1e
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r1 = r1 >> 81
            r3 = 5917(0x171d, float:8.291E-42)
            int r3 = r1 >>> r3
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r3
            int r1 = r1 * 4
            if (r1 != 0) goto L58
            goto L29
        L1e:
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r1 = r1 + 121
            int r3 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L58
        L29:
            com.appsflyer.internal.AFc1dSDK r1 = r6.AFAdRevenueData()
            com.appsflyer.internal.AFj1sSDK r1 = r1.AFLogger()
            com.appsflyer.internal.AFj1qSDK[] r1 = r1.getRevenue()
            int r3 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r3 = r3 + 65
            int r4 = r3 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L57
            int r3 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r4 = r3 + 5
            int r5 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.b = r5
            int r4 = r4 % r0
            int r3 = r3 + 33
            int r4 = r3 % 128
            com.appsflyer.internal.AFa1tSDK.b = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L53
            return r1
        L53:
            r2.hashCode()
            throw r2
        L57:
            throw r2
        L58:
            com.appsflyer.internal.AFc1dSDK r0 = r6.AFAdRevenueData()
            com.appsflyer.internal.AFj1sSDK r0 = r0.AFLogger()
            r0.getRevenue()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.component3():com.appsflyer.internal.AFj1qSDK[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if ((r4 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        r4 = com.appsflyer.internal.AFa1tSDK.b + 75;
        com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        java.util.Objects.requireNonNull(r4);
        AFAdRevenueData().unregisterClient().AFAdRevenueData(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if ((r1 + 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if ((r1 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        java.util.Objects.requireNonNull(r4);
        AFAdRevenueData().unregisterClient().AFAdRevenueData(r4);
        r4 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName + 95;
        com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r4 % 128;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPluginInfo(com.appsflyer.internal.platform_extension.PluginInfo r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r1 = r1 + 105
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1a
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r1 = r1 % 105
            int r2 = r1 * 23622
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r2
            int r1 = r1 + r0
            if (r1 != 0) goto L4e
            goto L25
        L1a:
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r1 = r1 + 71
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L4e
        L25:
            java.util.Objects.requireNonNull(r4)
            com.appsflyer.internal.AFc1dSDK r1 = r3.AFAdRevenueData()
            com.appsflyer.internal.AFi1lSDK r1 = r1.unregisterClient()
            r1.AFAdRevenueData(r4)
            int r4 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r4 = r4 + 95
            int r1 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L48
            int r4 = com.appsflyer.internal.AFa1tSDK.b
            int r4 = r4 + 75
            int r1 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1
            int r4 = r4 % r0
            return
        L48:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            r4.<init>()
            throw r4
        L4e:
            java.util.Objects.requireNonNull(r4)
            com.appsflyer.internal.AFc1dSDK r0 = r3.AFAdRevenueData()
            com.appsflyer.internal.AFi1lSDK r0 = r0.unregisterClient()
            r0.AFAdRevenueData(r4)
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.setPluginInfo(com.appsflyer.internal.platform_extension.PluginInfo):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        int i;
        int i2 = 2 % 2;
        int i3 = b + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            AFInAppEventParameterName = (AFInAppEventType >>> 127) >> 15903;
            Objects.requireNonNull(appsFlyerConsent);
            AFAdRevenueData().afInfoLog().component2 = appsFlyerConsent;
            i = (AFInAppEventParameterName >>> 103) << 2043;
        } else {
            AFInAppEventParameterName = (AFInAppEventType + 77) % 128;
            Objects.requireNonNull(appsFlyerConsent);
            AFAdRevenueData().afInfoLog().component2 = appsFlyerConsent;
            i = (AFInAppEventParameterName + 45) % 128;
        }
        AFInAppEventType = i;
        int i4 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        int i = 2 % 2;
        AFe1lSDK aFe1lSDKCopydefault = this.copy.copydefault();
        aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(new AFe1fSDK(this.copy, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        AFInAppEventType = (AFInAppEventParameterName + 65) % 128;
        int i2 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void AFAdRevenueData(String str) {
        int i = 2 % 2;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.SDK_LIFECYCLE;
        StringBuilder sb = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb.append(str);
        sb.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(aFg1cSDK, sb.toString());
        int i2 = AFInAppEventType + 115;
        AFInAppEventParameterName = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void copy() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 103;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AFInAppEventType + 55;
        AFInAppEventParameterName = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = i2 + 3;
            b = i6 % 128;
            int i7 = i6 % 2;
            AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            return;
        }
        AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (AFAdRevenueData().getRevenue().getMonetizationNetwork("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID", false) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.d(com.appsflyer.internal.AFg1cSDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r7 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r7 = com.appsflyer.internal.AFa1tSDK.b + 41;
        com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if ((r7 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.d(com.appsflyer.internal.AFg1cSDK.GENERAL, "AppsFlyer installId can't be null");
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = (com.appsflyer.internal.AFa1tSDK.AFInAppEventType + androidx.compose.runtime.ComposerKt.defaultsKey) / 9910;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.d(com.appsflyer.internal.AFg1cSDK.GENERAL, "AppsFlyer installId can't be null");
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = (com.appsflyer.internal.AFa1tSDK.AFInAppEventType + 95) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        com.appsflyer.internal.AFb1iSDK.getCurrencyIso4217Code(r7, AFAdRevenueData().component2());
        r7 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType + 25;
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        if ((r7 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.d(com.appsflyer.internal.AFg1cSDK.GENERAL, "AppsFlyerLib.init() method should be called first");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r6.toString != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if ((!r6.toString) != true) goto L9;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setInstallId(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            java.lang.String r2 = "setInstallId"
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L24
            com.appsflyer.internal.AFc1dSDK r1 = r6.AFAdRevenueData()
            com.appsflyer.internal.AFd1pSDK r1 = r1.copy()
            java.lang.String[] r5 = new java.lang.String[r4]
            r1.getMediationNetwork(r2, r5)
            boolean r1 = r6.toString
            if (r1 == r3) goto L98
            goto L36
        L24:
            com.appsflyer.internal.AFc1dSDK r1 = r6.AFAdRevenueData()
            com.appsflyer.internal.AFd1pSDK r1 = r1.copy()
            java.lang.String[] r5 = new java.lang.String[r4]
            r1.getMediationNetwork(r2, r5)
            boolean r1 = r6.toString
            r1 = r1 ^ r3
            if (r1 == r3) goto L98
        L36:
            com.appsflyer.internal.AFc1dSDK r1 = r6.AFAdRevenueData()
            com.appsflyer.internal.AFc1pSDK r1 = r1.getRevenue()
            java.lang.String r2 = "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID"
            boolean r1 = r1.getMonetizationNetwork(r2, r4)
            if (r1 != 0) goto L50
            com.appsflyer.AFLogger r7 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r0 = com.appsflyer.internal.AFg1cSDK.GENERAL
            java.lang.String r1 = "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first"
            r7.d(r0, r1)
            return
        L50:
            if (r7 != 0) goto L7f
            int r7 = com.appsflyer.internal.AFa1tSDK.b
            int r7 = r7 + 41
            int r1 = r7 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1
            int r7 = r7 % r0
            java.lang.String r0 = "AppsFlyer installId can't be null"
            if (r7 == 0) goto L6f
            com.appsflyer.AFLogger r7 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r1 = com.appsflyer.internal.AFg1cSDK.GENERAL
            r7.d(r1, r0)
            int r7 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r7 = r7 + (-127)
            int r7 = r7 / 9910
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r7
            return
        L6f:
            com.appsflyer.AFLogger r7 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r1 = com.appsflyer.internal.AFg1cSDK.GENERAL
            r7.d(r1, r0)
            int r7 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r7 = r7 + 95
            int r7 = r7 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r7
            return
        L7f:
            com.appsflyer.internal.AFc1dSDK r1 = r6.AFAdRevenueData()
            com.appsflyer.internal.AFc1qSDK r1 = r1.component2()
            com.appsflyer.internal.AFb1iSDK.getCurrencyIso4217Code(r7, r1)
            int r7 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r7 = r7 + 25
            int r1 = r7 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L96
            return
        L96:
            r7 = 0
            throw r7
        L98:
            com.appsflyer.AFLogger r7 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r0 = com.appsflyer.internal.AFg1cSDK.GENERAL
            java.lang.String r1 = "AppsFlyerLib.init() method should be called first"
            r7.d(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.setInstallId(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (r5.AFAdRevenueData(r6, r7, r1) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        r1 = com.appsflyer.internal.AFa1tSDK.b + 45;
        com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r5.AFAdRevenueData(r6, r7, r1) != false) goto L11;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendPurchaseData(android.content.Context r5, java.util.Map<java.lang.String, java.lang.Object> r6, com.appsflyer.PurchaseHandler.PurchaseValidationCallback r7) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r2
            int r1 = r1 % r0
            java.lang.String r2 = "subscriptions"
            if (r1 != 0) goto L53
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r1 = r1 + 63
            int r3 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r1 = r1 % r0
            r3 = 1
            if (r1 == 0) goto L33
            r4.getMediationNetwork(r5)
            com.appsflyer.internal.AFc1dSDK r5 = r4.AFAdRevenueData()
            com.appsflyer.PurchaseHandler r5 = r5.component4()
            java.lang.String[] r1 = new java.lang.String[r3]
            r1[r3] = r2
            boolean r1 = r5.AFAdRevenueData(r6, r7, r1)
            if (r1 == 0) goto L7b
            goto L49
        L33:
            r4.getMediationNetwork(r5)
            com.appsflyer.internal.AFc1dSDK r5 = r4.AFAdRevenueData()
            com.appsflyer.PurchaseHandler r5 = r5.component4()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            r1[r3] = r2
            boolean r1 = r5.AFAdRevenueData(r6, r7, r1)
            if (r1 == 0) goto L7b
        L49:
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            goto L68
        L53:
            r4.getMediationNetwork(r5)
            com.appsflyer.internal.AFc1dSDK r5 = r4.AFAdRevenueData()
            com.appsflyer.PurchaseHandler r5 = r5.component4()
            java.lang.String[] r0 = new java.lang.String[]{r2}
            boolean r0 = r5.AFAdRevenueData(r6, r7, r0)
            if (r0 == 0) goto L7b
        L68:
            com.appsflyer.internal.AFe1hSDK r0 = new com.appsflyer.internal.AFe1hSDK
            com.appsflyer.internal.AFc1dSDK r1 = r5.getCurrencyIso4217Code
            r0.<init>(r6, r7, r1)
            com.appsflyer.internal.AFe1lSDK r5 = r5.getRevenue
            java.util.concurrent.Executor r6 = r5.getRevenue
            com.appsflyer.internal.AFe1lSDK$5 r7 = new com.appsflyer.internal.AFe1lSDK$5
            r7.<init>(r0)
            r6.execute(r7)
        L7b:
            int r5 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r5 = r5 + 21
            int r5 = r5 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.sendPurchaseData(android.content.Context, java.util.Map, com.appsflyer.PurchaseHandler$PurchaseValidationCallback):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        boolean z;
        int i;
        int i2 = 2 % 2;
        getMediationNetwork(context);
        AFg1ySDK aFg1ySDK = new AFg1ySDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFg1cSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFg1cSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(String.valueOf(str)));
        AFf1aSDK revenue = aFg1ySDK.getRevenue();
        if (revenue != null) {
            int i3 = b + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            if (!str.equals(revenue.getRevenue)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (revenue != null) {
                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                    b = i % 128;
                    if (i % 2 == 0 ? jCurrentTimeMillis - revenue.AFAdRevenueData > TimeUnit.SECONDS.toMillis(2L) : (revenue.AFAdRevenueData ^ jCurrentTimeMillis) > TimeUnit.SECONDS.toMillis(2L)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                AFf1aSDK aFf1aSDK = new AFf1aSDK(str, jCurrentTimeMillis, !z);
                aFg1ySDK.AFAdRevenueData.getMediationNetwork("afUninstallToken", aFf1aSDK.getRevenue);
                aFg1ySDK.AFAdRevenueData.getMonetizationNetwork("afUninstallToken_received_time", aFf1aSDK.AFAdRevenueData);
                aFg1ySDK.AFAdRevenueData.getCurrencyIso4217Code("afUninstallToken_queued", aFf1aSDK.getMediationNetwork);
                if (z) {
                    AFc1dSDK aFc1dSDKAFAdRevenueData = ((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData();
                    AFf1tSDK aFf1tSDK = new AFf1tSDK(str, aFc1dSDKAFAdRevenueData);
                    AFe1lSDK aFe1lSDKCopydefault = aFc1dSDKAFAdRevenueData.copydefault();
                    aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(aFf1tSDK));
                }
            }
        } else {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (revenue != null) {
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                b = i % 128;
                if (i % 2 == 0) {
                    z = true;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            AFf1aSDK aFf1aSDK2 = new AFf1aSDK(str, jCurrentTimeMillis2, !z);
            aFg1ySDK.AFAdRevenueData.getMediationNetwork("afUninstallToken", aFf1aSDK2.getRevenue);
            aFg1ySDK.AFAdRevenueData.getMonetizationNetwork("afUninstallToken_received_time", aFf1aSDK2.AFAdRevenueData);
            aFg1ySDK.AFAdRevenueData.getCurrencyIso4217Code("afUninstallToken_queued", aFf1aSDK2.getMediationNetwork);
            if (z) {
                AFc1dSDK aFc1dSDKAFAdRevenueData2 = ((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData();
                AFf1tSDK aFf1tSDK2 = new AFf1tSDK(str, aFc1dSDKAFAdRevenueData2);
                AFe1lSDK aFe1lSDKCopydefault2 = aFc1dSDKAFAdRevenueData2.copydefault();
                aFe1lSDKCopydefault2.getRevenue.execute(aFe1lSDKCopydefault2.new AnonymousClass5(aFf1tSDK2));
            }
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0439  */
    /* JADX WARN: Code duplicated, block: B:140:0x0450  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014d, code lost:
    
        if (r11.isEmpty() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0154, code lost:
    
        if (r11.isEmpty() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0156, code lost:
    
        r14 = new java.lang.StringBuilder("Setting partner data for ");
        r14.append(r13);
        r14.append(": ");
        r14.append(r11);
        com.appsflyer.AFLogger.afDebugLog(r14.toString());
        r14 = new org.json.JSONObject(r11).toString().length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017e, code lost:
    
        if (r14 <= 1000) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0180, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
        r11 = new java.util.HashMap();
        r11.put(com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, "limit exceeded: ".concat(java.lang.String.valueOf(r14)));
        r12.AFAdRevenueData.put(r13, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x019e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x019f, code lost:
    
        r12.getCurrencyIso4217Code.put(r13, r11);
        r12.AFAdRevenueData.remove(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a9, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object getMonetizationNetwork(java.lang.Object[] r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getMonetizationNetwork(java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r1 = AFAdRevenueData();
        r2 = r1.copydefault();
        r2.getRevenue.execute(new com.appsflyer.internal.AFe1lSDK.AnonymousClass5(r2, new com.appsflyer.internal.AFe1bSDK(r1)));
        r1 = com.appsflyer.internal.AFa1tSDK.b + 69;
        com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if ((r1 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        r0 = 42 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (com.appsflyer.internal.AFe1bSDK.component3() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if ((!com.appsflyer.internal.AFe1bSDK.component3()) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType + 93;
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void component4() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            r2 = 1
            int r1 = r1 + r2
            int r3 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 + (-58)
            int r1 = r1 / 25498
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r1
            boolean r1 = com.appsflyer.internal.AFe1bSDK.component3()
            if (r1 == 0) goto L3e
            goto L2c
        L1d:
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 + 123
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r1
            boolean r1 = com.appsflyer.internal.AFe1bSDK.component3()
            r1 = r1 ^ r2
            if (r1 == r2) goto L3e
        L2c:
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L38
            return
        L38:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>()
            throw r0
        L3e:
            com.appsflyer.internal.AFc1dSDK r1 = r5.AFAdRevenueData()
            com.appsflyer.internal.AFe1lSDK r2 = r1.copydefault()
            com.appsflyer.internal.AFe1bSDK r3 = new com.appsflyer.internal.AFe1bSDK
            r3.<init>(r1)
            java.util.concurrent.Executor r1 = r2.getRevenue
            com.appsflyer.internal.AFe1lSDK$5 r4 = new com.appsflyer.internal.AFe1lSDK$5
            r4.<init>(r3)
            r1.execute(r4)
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L64
            r0 = 42
            int r0 = r0 / 0
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.component4():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r6 == null) goto L11;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getAppsFlyerUID(android.content.Context r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.b
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            int r1 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r2
            int r1 = r1 % r0
            java.lang.String r2 = "getAppsFlyerUID"
            r3 = 0
            if (r1 != 0) goto L37
            com.appsflyer.internal.AFc1dSDK r1 = r5.AFAdRevenueData()
            com.appsflyer.internal.AFd1pSDK r1 = r1.copy()
            java.lang.String[] r4 = new java.lang.String[r3]
            r1.getMediationNetwork(r2, r4)
            if (r6 != 0) goto L62
            int r6 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r6 = r6 + 35
            int r1 = r6 % 128
            com.appsflyer.internal.AFa1tSDK.b = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L46
            r6 = 4
            int r6 = r6 % r6
            goto L46
        L37:
            com.appsflyer.internal.AFc1dSDK r1 = r5.AFAdRevenueData()
            com.appsflyer.internal.AFd1pSDK r1 = r1.copy()
            java.lang.String[] r4 = new java.lang.String[r3]
            r1.getMediationNetwork(r2, r4)
            if (r6 != 0) goto L62
        L46:
            int r6 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r6 = r6 + 69
            int r1 = r6 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r1
            int r6 = r6 % r0
            r1 = 0
            if (r6 != 0) goto L61
            int r6 = com.appsflyer.internal.AFa1tSDK.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r6 = r6 + 11
            int r2 = r6 % 128
            com.appsflyer.internal.AFa1tSDK.b = r2
            int r6 = r6 % r0
            if (r6 != 0) goto L60
            r6 = 72
            int r6 = r6 / r3
        L60:
            return r1
        L61:
            throw r1
        L62:
            r5.getMediationNetwork(r6)
            com.appsflyer.internal.AFc1dSDK r6 = r5.AFAdRevenueData()
            com.appsflyer.internal.AFc1pSDK r6 = r6.getRevenue()
            com.appsflyer.internal.AFc1qSDK r6 = r6.getMonetizationNetwork
            java.lang.String r6 = com.appsflyer.internal.AFb1iSDK.getRevenue(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getAppsFlyerUID(android.content.Context):java.lang.String");
    }

    /* JADX INFO: renamed from: $r8$lambda$1X7p9Xpo-KZG_--iJodZqM9lWPA, reason: not valid java name */
    public static /* synthetic */ void m7536$r8$lambda$1X7p9XpoKZG_iJodZqM9lWPA(AFa1tSDK aFa1tSDK, boolean z) {
        int i = 2 % 2;
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        aFa1tSDK.getMonetizationNetwork(z);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = b + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void $r8$lambda$Cm4qmQAd1onsSxtU9wWQElPXXcY(AFa1tSDK aFa1tSDK, Context context, Intent intent) {
        int i = 2 % 2;
        int i2 = b + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        aFa1tSDK.d_(context, intent);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void $r8$lambda$DtqUaIgQQ0uS9RC3fGV_uljmFrg(AFa1tSDK aFa1tSDK, AFf1nSDK aFf1nSDK) {
        int i = 2 % 2;
        int i2 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        aFa1tSDK.getCurrencyIso4217Code(aFf1nSDK);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$E-aQm2Z1NlPxGCpde4Qq8_cAhoI, reason: not valid java name */
    public static /* synthetic */ void m7537$r8$lambda$EaQm2Z1NlPxGCpde4Qq8_cAhoI(AFa1tSDK aFa1tSDK) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        b = i2 % 128;
        int i3 = i2 % 2;
        aFa1tSDK.copydefault();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void $r8$lambda$blQPRvNkGfIV2BOvh4_sCBVm0qs(AFa1tSDK aFa1tSDK) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        b = i2 % 128;
        int i3 = i2 % 2;
        aFa1tSDK.equals();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void $r8$lambda$pCCpcEMM3mmsR2pSmbZkaRQJvfg(AFa1tSDK aFa1tSDK, AFi1fSDK aFi1fSDK) {
        int i = 2 % 2;
        int i2 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        aFa1tSDK.AFAdRevenueData(aFi1fSDK);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void $r8$lambda$uHRHSQiyPEPIrLNOloCalS47Mhw(AFc1dSDK aFc1dSDK) {
        int i = 2 % 2;
        int i2 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        getRevenue(aFc1dSDK);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentbindingInflater1 = 8482841104832738296L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722267;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, int r8) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r6 = 120 - r6
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r1 = com.appsflyer.internal.AFa1tSDK.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.$$i(byte, byte, int):java.lang.String");
    }
}
