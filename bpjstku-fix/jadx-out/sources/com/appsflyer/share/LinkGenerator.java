package com.appsflyer.share;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.internal.AFc1dSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFe1lSDK;
import com.appsflyer.internal.AFe1lSDK.AnonymousClass5;
import com.appsflyer.internal.AFj1bSDK;
import com.appsflyer.internal.AFk1wSDK;
import defpackage.SessionProcessor;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
public class LinkGenerator {
    private String AFAdRevenueData;
    private String areAllFieldsValid;
    private String component1;
    private String component2;
    private String component3;
    private String component4;
    private final Map<String, String> equals = new HashMap();
    String getCurrencyIso4217Code;
    private final String getMediationNetwork;
    String getMonetizationNetwork;
    private String getRevenue;
    private String hashCode;
    private String toString;
    private static final byte[] $$c = {93, -77, 2, Base64.padSymbol};
    private static final int $$f = 229;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {113, 29, -123, -97, 4, -11, -11, -19, -10, 6, -22, 38, -39, -21, -1, -22, 8, 52, -57, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, 9, -16, -14, 1, -14, -14, -2, 21, -46, -1, -15, 2, -28, 6, -22, 56, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, -8, -6, 2, -7, -15, -1, -20, -6, -14, -7, -6, -14, 0, -8, -27, 4, -5, -27, 33, -43, 2, -10, -16, -1, -10, -10, -4, -29, 0, -17, 57};
    private static final int $$e = 51;
    private static final byte[] $$a = {46, 47, -18, 64, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 130;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {60063, 60040, 60034, 60062, 60056, 60055, 60058, 60088, 60090, 60051, 60045, 59745, 60047, 60052, 60073, 60117, 60041, 60054, 60072, 60043, 60079, 60050, 60046, 60053, 60048};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 57188;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 1
            byte[] r0 = com.appsflyer.share.LinkGenerator.$$a
            int r6 = r6 * 52
            int r6 = 55 - r6
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r5
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            int r6 = r6 + 1
            r4 = r0[r6]
        L29:
            int r7 = r7 + r4
            int r7 = r7 + (-10)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.LinkGenerator.a(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.appsflyer.share.LinkGenerator.$$d
            int r6 = r6 * 52
            int r6 = 55 - r6
            int r7 = r7 * 30
            int r7 = r7 + 84
            int r8 = r8 * 3
            int r1 = 53 - r8
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L33
        L18:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1c:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r7 = r7 + 1
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L33:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-9)
            r7 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.LinkGenerator.c(byte, int, int, java.lang.Object[]):void");
    }

    public LinkGenerator(String str) {
        this.getMediationNetwork = str;
    }

    public LinkGenerator setBrandDomain(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.hashCode = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public String getBrandDomain() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.hashCode;
        }
        throw null;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.component3 = str;
        if (i3 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.toString = str;
        int i5 = i2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public String getChannel() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 == 0) {
            str = this.getRevenue;
            int i4 = 49 / 0;
        } else {
            str = this.getRevenue;
        }
        int i5 = i3 + 5;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public LinkGenerator setChannel(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.getRevenue = str;
        int i5 = i2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 69;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.component1 = str;
        int i5 = i3 + 117;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public String getMediaSource() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 15;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getMediationNetwork;
        int i5 = i2 + 113;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, String> getUserParams() {
        int i = 2 % 2;
        HashMap map = new HashMap(this.equals);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public String getCampaign() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.AFAdRevenueData;
        int i5 = i3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    public LinkGenerator setCampaign(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 57;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.AFAdRevenueData = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 95;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return this;
    }

    public LinkGenerator addParameter(String str, String str2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.equals.put(str, str2);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (map != null) {
            this.equals.putAll(map);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LinkGenerator setReferrerUID(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.areAllFieldsValid = str;
        int i5 = i3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.component4 = str;
        if (i3 == 0) {
            return this;
        }
        throw null;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.component2 = str;
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return this;
    }

    private static void b(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = 1770390596;
        Object obj2 = null;
        int i5 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 53;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myPid() >> 22), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2266, 32 - ((byte) KeyEvent.getModifierMetaStateMask()), -1927765101, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    i4 = 1770390596;
                    i5 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $11 + 125;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b4 = (byte) (-1);
            byte b5 = (byte) (b4 + 1);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 2267 - Color.green(0), 33 - TextUtils.indexOf("", "", 0, 0), -1927765101, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i11 = $10 + 35;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                i2 = i + 100;
                cArr4[i2] = (char) (cArr[i2] >> b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i12 = $11 + 75;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49266 - MotionEvent.axisFromString("")), 3261 - Color.alpha(0), 29 - MotionEvent.axisFromString(""), -127612708, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        int i14 = $10 + 79;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) (-1);
                            byte b9 = (byte) (b8 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), View.MeasureSpec.getMode(0) + 594, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17, 1570859318, false, $$g(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                        } else {
                            int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i20 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i19];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i20];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0238  */
    public LinkGenerator setBaseURL(String str, String str2, String str3) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 31533);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 922;
            int fadingEdgeLength = 28 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte[] bArr = $$a;
            byte b = bArr[80];
            byte b2 = bArr[37];
            Object[] objArr2 = new Object[1];
            a(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, iLastIndexOf, fadingEdgeLength, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(new char[]{'\b', 21, 1, 15, 11, 23, 5, 20, 11, 3, 16, 19, 3, 2, '\r', 2, 22, '\f', '\b', '\n', '\t', 4}, (byte) (Drawable.resolveOpacity(0, 0) + 93), Color.rgb(0, 0, 0) + 16777238, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(new char[]{0, '\b', '\t', 16, 2, 4, 4, '\n', 1, '\b', 7, '\n', 22, 16, 13926}, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 103), 15 - Color.red(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 31533);
            int iMyPid = 921 - (Process.myPid() >> 22);
            int iResolveSizeAndState = 28 - View.resolveSizeAndState(0, 0, 0);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) 52, bArr2[37], bArr2[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, iMyPid, iResolveSizeAndState, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSize = (char) (31533 - View.resolveSize(0, 0));
                int scrollBarSize = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
                int i4 = 29 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte b3 = $$a[80];
                Object[] objArr6 = new Object[1];
                a((byte) 37, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, scrollBarSize, i4, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = (-1397614243) + ((297347355 | iIdentityHashCode) * 614);
            int i6 = ~iIdentityHashCode;
            int i7 = ((i5 + ((((~((-1017363164) | i6)) | 278997019) | (~(756716480 | i6))) * (-1228))) + (((~(i6 | 1035713499)) | (~((-738366145) | i6))) * 614)) - 142915428;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b(new char[]{'\b', 21, 1, 15, 11, 23, 5, 20, '\t', 16, 15, 16, '\t', 3, 11, 22, 11, 20, 17, 7, 24, 5, 18, 1, 5, 1}, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 81), View.getDefaultSize(0, 0) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(new char[]{2, 24, 13921, 13921, '\b', 3, '\r', 7, 13923, 13923, 6, 20, 1, '\t', 11, 22, 18, 3}, (byte) (121 - (ViewConfiguration.getTapTimeout() >> 16)), 18 - (ViewConfiguration.getTapTimeout() >> 16), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
                    TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                    int i11 = i10 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(str != null ? str.length() : 0), 0, -142915428};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[43];
                Object[] objArr11 = new Object[1];
                c(b4, b4, bArr3[89], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b5 = bArr3[89];
                byte b6 = b5;
                Object[] objArr12 = new Object[1];
                c(b5, b6, b6, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cRgb = (char) ((-16745683) - Color.rgb(0, 0, 0));
                    int iIndexOf = 920 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int iMakeMeasureSpec = 28 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte b7 = $$a[80];
                    Object[] objArr14 = new Object[1];
                    a((byte) 37, b7, b7, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb, iIndexOf, iMakeMeasureSpec, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    b(new char[]{'\b', 21, 1, 15, 11, 23, 5, 20, 11, 3, 16, 19, 3, 2, '\r', 2, 22, '\f', '\b', '\n', '\t', 4}, (byte) (KeyEvent.keyCodeFromString("") + 93), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    b(new char[]{0, '\b', '\t', 16, 2, 4, 4, '\n', 1, '\b', 7, '\n', 22, 16, 13926}, (byte) (TextUtils.getOffsetAfter("", 0) + 103), Color.green(0) + 15, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (31533 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 921;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28;
                        byte[] bArr4 = $$a;
                        Object[] objArr17 = new Object[1];
                        a((byte) 52, bArr4[37], bArr4[80], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, scrollDefaultDelay, minimumFlingVelocity, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 31533);
                        int modifierMetaStateMask = 920 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int maximumFlingVelocity = 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[80];
                        byte b9 = bArr5[37];
                        Object[] objArr18 = new Object[1];
                        a(b8, b9, b9, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetBefore, modifierMetaStateMask, maximumFlingVelocity, -1048449946, false, (String) objArr18[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
                TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                int i15 = i14 % 2;
                for (String str4 : strArr) {
                    arrayList.add(str4);
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentbindingInflater1 = i16 % 128;
        int i17 = i16 % 2;
        int i18 = ((int[]) objArr[0])[0];
        Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int i19 = ~Process.myTid();
        int i20 = i18 + 1591100188 + (((~((-622246565) | i19)) | (-1151833080)) * (-933)) + (((~(i19 | (-1151833080))) | 1084293459) * 933) + 1231024424;
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr19[0])[0] = i22 ^ (i22 << 5);
        if (str != null && str.length() > 0) {
            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
            TuitionPaymentFragmentbindingInflater1 = i23 % 128;
            if (i23 % 2 != 0) {
                throw null;
            }
            this.getCurrencyIso4217Code = String.format("https://%s/%s", (str2 == null || str2.length() < 5) ? "go.onelink.me" : str2, str);
            return this;
        }
        String hostPrefix = AppsFlyerLib.getInstance().getHostPrefix();
        int i24 = ((int[]) objArr19[0])[0];
        int i25 = i24 * i24;
        int i26 = -(42108921 * i24);
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        int i28 = -(i24 * 1196116193);
        int i29 = ((i27 ^ i28) + ((i28 & i27) << 1)) - (-518110825);
        int i30 = ((i29 >> 23) - 1023) / 512;
        int i31 = (i29 - (~(((i30 | 1) << 1) - (i30 ^ 1)))) - 1;
        int i32 = ((i29 >> 21) - 4095) / 2048;
        int i33 = (-(i31 ^ ((i32 & 1) + (i32 | 1)))) + 3;
        int i34 = i33 >> 27;
        int i35 = ((i34 ^ (-63)) + ((i34 & (-63)) << 1)) / 32;
        int i36 = (i35 & 1) + (i35 | 1);
        this.getCurrencyIso4217Code = String.format("https://%s/%s", String.format("%sapp.%s", hostPrefix, ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, (1379750202 / ((i33 & (-(((i36 | 1) << 1) - (1 ^ i36)))) * 3)) + 478274439, (int) System.currentTimeMillis())).getHostName()), str3);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    private Map<String, String> getMediationNetwork() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put("pid", this.getMediationNetwork);
        String str = this.areAllFieldsValid;
        if (str != null) {
            map.put("af_referrer_uid", str);
        }
        String str2 = this.getRevenue;
        if (str2 != null) {
            map.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.component1;
        if (str3 != null) {
            map.put("af_referrer_customer_id", str3);
        }
        String str4 = this.AFAdRevenueData;
        if (str4 != null) {
            map.put("c", str4);
            int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
        }
        String str5 = this.component4;
        if (str5 != null) {
            map.put("af_referrer_name", str5);
        }
        String str6 = this.component2;
        if (str6 != null) {
            map.put("af_referrer_image_url", str6);
        }
        if (this.toString != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.toString);
            String str7 = this.component3;
            if (str7 != null) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 39;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                String str8 = "/";
                if (i4 % 2 == 0) {
                    this.component3 = str7.replaceFirst("^[/]", "");
                    int i5 = 14 / 0;
                    if (this.toString.endsWith("/")) {
                        str8 = "";
                    }
                } else {
                    this.component3 = str7.replaceFirst("^[/]", "");
                    if (this.toString.endsWith("/")) {
                        str8 = "";
                    }
                }
                sb.append(str8);
                sb.append(this.component3);
            }
            map.put("af_dp", sb.toString());
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 4;
            }
        }
        for (Map.Entry<String, String> entry : this.equals.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return AFj1bSDK.getRevenue(map);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public String generateLink() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        String str = this.getCurrencyIso4217Code;
        if (str != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            if (str.startsWith("http")) {
                sb.append(this.getCurrencyIso4217Code);
            } else {
                sb.append(String.format(AFk1wSDK.getMediationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getHostName()));
            }
        } else {
            sb.append(String.format(AFk1wSDK.getMediationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getHostName()));
        }
        if (this.getMonetizationNetwork != null) {
            sb.append('/');
            sb.append(this.getMonetizationNetwork);
        }
        Map<String, String> mediationNetwork = getMediationNetwork();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : mediationNetwork.entrySet()) {
            if (sb2.length() == 0) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                if (i4 % 2 == 0) {
                    sb2.append((char) 30);
                } else {
                    sb2.append('?');
                }
            } else {
                sb2.append(Typography.amp);
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        int i = 2 % 2;
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.2
            private static final byte[] $$c = {41, 2, 45, -60};
            private static final int $$d = 206;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {39, 27, 2, 54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 175;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -17776430129158348L;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
            private static char b = 34097;

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 52
                    int r7 = 56 - r7
                    int r0 = r8 + 1
                    byte[] r1 = com.appsflyer.share.LinkGenerator.AnonymousClass2.$$a
                    int r6 = r6 * 14
                    int r6 = 98 - r6
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L14
                    r3 = r7
                    r4 = r2
                    goto L29
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L24:
                    r3 = r1[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r5
                L29:
                    int r6 = r6 + r7
                    int r6 = r6 + (-11)
                    int r7 = r3 + 1
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.LinkGenerator.AnonymousClass2.a(byte, int, int, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, char[] cArr2, char c, int i2, char[] cArr3, Object[] objArr) throws Throwable {
                int i3;
                int i4 = 2;
                int i5 = 2 % 2;
                SessionProcessor sessionProcessor = new SessionProcessor();
                int length = cArr2.length;
                char[] cArr4 = new char[length];
                int length2 = cArr.length;
                char[] cArr5 = new char[length2];
                int i6 = 0;
                System.arraycopy(cArr2, 0, cArr4, 0, length);
                System.arraycopy(cArr, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i2));
                int length3 = cArr3.length;
                char[] cArr6 = new char[length3];
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                    int i7 = $11 + 81;
                    $10 = i7 % 128;
                    int i8 = i7 % i4;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c2 = (char) ((TypedValue.complexToFraction(i6, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i6, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8328);
                            int size = View.MeasureSpec.getSize(i6) + 1235;
                            int iIndexOf = 35 - TextUtils.indexOf("", "", i6);
                            byte b2 = (byte) i6;
                            String str$$e = $$e(b2, b2, $$c[1]);
                            Class[] clsArr = new Class[1];
                            clsArr[i6] = Object.class;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, size, iIndexOf, -653973969, false, str$$e, clsArr);
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) i6;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.keyCodeFromString(""), (TypedValue.complexToFraction(i6, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i6, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2764, 14 - View.resolveSizeAndState(i6, i6, i6), 1504416861, false, $$e(b3, b4, b4), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43324 - TextUtils.lastIndexOf("", '0', 0)), View.resolveSizeAndState(0, 0, 0) + 253, KeyEvent.getDeadChar(0, 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 65199);
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2891;
                            int i9 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16;
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            String str$$e2 = $$e(b5, b6, (byte) (b6 + 1));
                            i3 = 2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, maxKeyCode, i9, 2012627446, false, str$$e2, new Class[]{Integer.TYPE, Integer.TYPE});
                        } else {
                            i3 = 2;
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = sessionProcessor.b;
                        cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) b) ^ (-6377398940819159759L)))));
                        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                        int i10 = $10 + 99;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        i4 = i3;
                        i6 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArr6);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) throws Throwable {
                Object[] objArr;
                int i2 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                int i3 = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int i4 = 651 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i5 = 45 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte b2 = $$a[80];
                    Object[] objArr2 = new Object[1];
                    a(b2, b2, (byte) 52, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, i4, i5, -459846511, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{25093, 37187, 13597, 22718}, new char[]{45510, 58669, 28108, 26470}, (char) Color.red(0), Color.alpha(0), new char[]{46933, 340, 32728, 56112, 58469, 18760, 48204, 49406, 26475, 44920, 31505, 38254, 51346, 17333, 64170, 40209, 5721, 9382, 20025, 13994, 43343, 51951}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{25093, 37187, 13597, 22718}, new char[]{51806, 44938, 50094, 56351}, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8130), (-1364227382) - (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{37762, 7933, 63038, 61492, 10381, 43870, 5349, 10286, 15616, 22710, 7277, 43129, 42987, 46038, 28362}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int i6 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 651;
                    int tapTimeout = 44 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr5 = new Object[1];
                    a(b3, b4, b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i6, tapTimeout, -873460649, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i7 = TuitionPaymentFragmentbindingInflater1 + 15;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                    int i8 = i7 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int i9 = 650 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int i10 = 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        byte[] bArr = $$a;
                        byte b5 = bArr[80];
                        byte b6 = bArr[7];
                        Object[] objArr6 = new Object[1];
                        a(b5, b6, (byte) (b6 | 37), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, i9, i10, -1595579076, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i11 = ((int[]) objArr7[2])[0];
                    int i12 = ((int[]) objArr7[0])[0];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i13 = 199209431 + ((iIdentityHashCode | 776767304) * (-50));
                    int i14 = ~((-4489793) | iIdentityHashCode);
                    int i15 = ~iIdentityHashCode;
                    int i16 = i13 + ((i14 | (~(777826286 | i15))) * 50) + (((~(i15 | 776767304)) | (~(773336494 | i15)) | (-777826287)) * 50) + 1581937139;
                    int i17 = (i16 << 13) ^ i16;
                    int i18 = i17 ^ (i17 >>> 17);
                    ((int[]) objArr[3])[0] = i18 ^ (i18 << 5);
                } else {
                    try {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.indexOf("", ""), 1610 - Color.green(0), 26 - View.resolveSizeAndState(0, 0, 0), 2145681644, false, null, new Class[0]);
                        }
                        Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 1581937139, 0};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int iMyPid = (Process.myPid() >> 22) + 651;
                            int iKeyCodeFromString = 44 - KeyEvent.keyCodeFromString("");
                            byte b7 = $$a[7];
                            byte b8 = b7;
                            Object[] objArr9 = new Object[1];
                            a(b7, b8, b8, objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, iMyPid, iKeyCodeFromString, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.resolveSize(0, 0) + 695, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 63406), Color.rgb(0, 0, 0) + 16778009, 82 - MotionEvent.axisFromString("")), Integer.TYPE, Integer.TYPE});
                        }
                        Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cAlpha = (char) Color.alpha(0);
                            int i19 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 650;
                            int i20 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43;
                            byte[] bArr2 = $$a;
                            byte b9 = bArr2[80];
                            byte b10 = bArr2[7];
                            Object[] objArr11 = new Object[1];
                            a(b9, b10, (byte) (b10 | 37), objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAlpha, i19, i20, -1595579076, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                        try {
                            Object[] objArr12 = new Object[1];
                            c(new char[]{25093, 37187, 13597, 22718}, new char[]{45510, 58669, 28108, 26470}, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), Gravity.getAbsoluteGravity(0, 0), new char[]{46933, 340, 32728, 56112, 58469, 18760, 48204, 49406, 26475, 44920, 31505, 38254, 51346, 17333, 64170, 40209, 5721, 9382, 20025, 13994, 43343, 51951}, objArr12);
                            Class<?> cls2 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            c(new char[]{25093, 37187, 13597, 22718}, new char[]{51806, 44938, 50094, 56351}, (char) (TextUtils.getTrimmedLength("") + 8131), Color.argb(0, 0, 0, 0) - 1364227382, new char[]{37762, 7933, 63038, 61492, 10381, 43870, 5349, 10286, 15616, 22710, 7277, 43129, 42987, 46038, 28362}, objArr13);
                            long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char cResolveSize = (char) View.resolveSize(0, 0);
                                int threadPriority = 651 - ((Process.getThreadPriority(0) + 20) >> 6);
                                int capsMode = 44 - TextUtils.getCapsMode("", 0, 0);
                                byte b11 = $$a[7];
                                byte b12 = b11;
                                Object[] objArr14 = new Object[1];
                                a(b11, b12, b12, objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveSize, threadPriority, capsMode, -873460649, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                int iArgb = 651 - Color.argb(0, 0, 0, 0);
                                int trimmedLength = TextUtils.getTrimmedLength("") + 44;
                                byte b13 = $$a[80];
                                Object[] objArr15 = new Object[1];
                                a(b13, b13, (byte) 52, objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumDrawingCacheSize, iArgb, trimmedLength, -459846511, false, (String) objArr15[0], null);
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
                int i21 = ((int[]) objArr[0])[0];
                int i22 = ((int[]) objArr[2])[0];
                if (i22 != i21) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[1];
                    if (strArr != null) {
                        while (i3 < strArr.length) {
                            arrayList.add(strArr[i3]);
                            i3++;
                            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                            TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                            int i24 = i23 % 2;
                        }
                    }
                    throw new RuntimeException(String.valueOf(i22));
                }
                Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i25 = ((int[]) objArr[3])[0];
                int i26 = ((int[]) objArr[2])[0];
                int i27 = ((int[]) objArr[0])[0];
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i28 = i25 + (-1931146398) + ((~((-6664297) | iMaxMemory)) * (-301)) + (((~(258340076 | iMaxMemory)) | (~((~iMaxMemory) | 261770886))) * (-301)) + (((~(iMaxMemory | (-261770887))) | 258340076) * 301);
                int i29 = (i28 << 13) ^ i28;
                int i30 = i29 ^ (i29 >>> 17);
                ((int[]) objArr16[3])[0] = i30 ^ (i30 << 5);
                responseListener.onResponse(str);
                int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
                TuitionPaymentFragmentbindingInflater1 = i31 % 128;
                if (i31 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                int i2 = 2 % 2;
                int i3 = TuitionPaymentFragmentbindingInflater1 + 75;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
                responseListener.onResponseError(str);
                if (i4 != 0) {
                    int i5 = 8 / 0;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0020  */
            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(byte r6, byte r7, byte r8) {
                /*
                    int r6 = r6 * 2
                    int r6 = 3 - r6
                    byte[] r0 = com.appsflyer.share.LinkGenerator.AnonymousClass2.$$c
                    int r7 = r7 * 2
                    int r1 = r7 + 1
                    int r8 = 104 - r8
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r7
                    r4 = r2
                    goto L2a
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r7) goto L20
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L20:
                    int r6 = r6 + 1
                    int r3 = r3 + 1
                    r4 = r0[r6]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2a:
                    int r8 = -r8
                    int r8 = r8 + r3
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.LinkGenerator.AnonymousClass2.$$e(byte, byte, byte):java.lang.String");
            }
        });
        int i2 = TuitionPaymentFragmentbindingInflater1 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        int i = 2 % 2;
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.hashCode;
        Map<String, String> mediationNetwork = getMediationNetwork();
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getMediationNetwork(context);
            AFc1dSDK aFc1dSDKAFAdRevenueData = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData();
            AFe1kSDK aFe1kSDK = new AFe1kSDK(aFc1dSDKAFAdRevenueData, UUID.randomUUID(), string, mediationNetwork, str, responseListener, this);
            AFe1lSDK aFe1lSDKCopydefault = aFc1dSDKAFAdRevenueData.copydefault();
            aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(aFe1kSDK));
            int i2 = TuitionPaymentFragmentbindingInflater1 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
        } else {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r0 = com.appsflyer.share.LinkGenerator.$$c
            int r8 = r8 + 113
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r6
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L28:
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.LinkGenerator.$$g(int, byte, short):java.lang.String");
    }
}
