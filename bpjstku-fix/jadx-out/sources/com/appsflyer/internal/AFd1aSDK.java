package com.appsflyer.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
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
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFd1aSDK<Body> implements ResponseNetwork<Body> {
    private static int $10 = 0;
    private static int $11 = 1;
    final boolean AFAdRevenueData;
    final Map<String, List<String>> getCurrencyIso4217Code;
    final int getMediationNetwork;
    private final Body getMonetizationNetwork;
    public final AFd1hSDK getRevenue;
    private static final byte[] $$d = {6, 51, 46, 31, 53, 3, 23, 12, -39, 54, 9, 16, 8, 7, 7, 10, 3, 23, -39, 53, 3, 23, 12, -26, 27, 27, -7, 22, 16, -54, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$e = 185;
    private static final byte[] $$a = {60, 80, 13, 34, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 77;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6101946541876773487L;

    private static void a(short s, int i, int i2, Object[] objArr) {
        int i3 = 98 - (s * 14);
        int i4 = i + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = (i3 + (-i2)) - 10;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4++;
                i3 = (i3 + (-bArr[i4])) - 10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 19
            int r7 = r7 + 65
            int r6 = r6 * 11
            int r0 = r6 + 27
            byte[] r1 = com.appsflyer.internal.AFd1aSDK.$$d
            int r5 = r5 * 26
            int r5 = 30 - r5
            byte[] r0 = new byte[r0]
            int r6 = r6 + 26
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r5
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r1[r5]
            int r3 = r3 + 1
        L2b:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-10)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1aSDK.d(short, short, short, java.lang.Object[]):void");
    }

    public AFd1aSDK(Body body, int i, boolean z, Map<String, List<String>> map, AFd1hSDK aFd1hSDK) {
        this.getMonetizationNetwork = body;
        this.getMediationNetwork = i;
        this.AFAdRevenueData = z;
        this.getCurrencyIso4217Code = new HashMap(map);
        this.getRevenue = aFd1hSDK;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public Body getBody() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        Body body = this.getMonetizationNetwork;
        int i5 = i3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return body;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        int i = 2 % 2;
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getMediationNetwork;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0255  */
    /* JADX WARN: Code duplicated, block: B:53:0x0256  */
    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $10 + 65;
        $11 = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            obj = null;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i5 = $11 + 103;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 19473), ((Process.getThreadPriority(0) + 20) >> 6) + 2624, 12 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() % (TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 39422), 481 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - (ViewConfiguration.getPressedStateDuration() >> 16)), ExpandableListView.getPackedPositionGroup(0L) + 2624, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39421 - ((byte) KeyEvent.getModifierMetaStateMask())), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 480, Process.getGidForName("") + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            i3 = $11 + 31;
            $10 = i3 % 128;
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $10 + 53;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 39422), 481 - TextUtils.getOffsetBefore("", 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                obj.hashCode();
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (39422 - TextUtils.getOffsetBefore("", 0)), 529 - AndroidCharacter.getMirror('0'), 36 - Process.getGidForName(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0219  */
    /* JADX WARN: Code duplicated, block: B:27:0x021b  */
    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
            int scrollBarFadeDuration = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[37], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, scrollBarFadeDuration, touchSlop, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{21739, 37727, 56216, 969, 18953, 45636, 64140, 8889, 26941, 20842, 39402, 49616, 2103, 28806, 47300, 59162, 12119, 6050, 24512, 34308, 52853, 14006}, 51131 - KeyEvent.normalizeMetaState(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{21743, 15581, 33949, 27723, 62485, 24008, 9612, 36165, 5431, 65272, 18088, 11895, 46631, 7704, 59349}, 26683 - Color.green(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSize = (char) (31533 - View.resolveSize(0, 0));
            int offsetBefore = 921 - TextUtils.getOffsetBefore("", 0);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 29;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            byte b4 = bArr2[37];
            Object[] objArr5 = new Object[1];
            a(b3, b4, (byte) (b4 & 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, offsetBefore, iIndexOf, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
            b = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31533);
                int size = 921 - View.MeasureSpec.getSize(0);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 29;
                byte[] bArr3 = $$a;
                byte b5 = bArr3[7];
                byte b6 = (byte) (bArr3[17] + 1);
                Object[] objArr6 = new Object[1];
                a(b5, (byte) (b5 | 50), b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, size, iIndexOf2, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = (((-975111961) + (((~(iIdentityHashCode | 1205900711)) | 568178932) * 191)) + (((~((~iIdentityHashCode) | 1205900711)) | 538781776) * 191)) - 924993894;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{21739, 49785, 31188, 38703, 3729, 42482, 54080, 19183, 57347, 8063, 46808, 11291, 23447, 61712, 26728, 34768, 15660, 21646, 50164, 31060, 37018, 3587, 42374, 56564, 19027, 57787}, 38557 - TextUtils.getTrimmedLength(""), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{21737, 594, 63906, 20735, 3675, 58757, 23792, 2672, 57746, 22767, 13860, 60812, 17653, 12834, 59784, 16576, 15925, 38297}, 22189 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = b + 61;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 87 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{21728, 53108, 25538, 34358, 15064, 24317, 61777, 5565, 34837, 11315, 16623, 64294, 8077, 46061, 54877, 19126}, 39838 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{21731, 34599, 62333, 12223, 7130, 30222, 41544, 40588, 51850, 9978, 4387, 19777, 47525, 38352, 49168, 15400}, 54217 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -924993894};
                byte[] bArr4 = $$d;
                byte b7 = (byte) (-bArr4[33]);
                byte b8 = bArr4[54];
                Object[] objArr13 = new Object[1];
                d(b7, b8, b8, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b9 = bArr4[54];
                byte b10 = (byte) (-bArr4[33]);
                Object[] objArr14 = new Object[1];
                d(b9, b10, b10, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char offsetBefore2 = (char) (TextUtils.getOffsetBefore("", 0) + 31533);
                    int gidForName = 920 - Process.getGidForName("");
                    int deadChar = 28 - KeyEvent.getDeadChar(0, 0);
                    byte[] bArr5 = $$a;
                    byte b11 = bArr5[7];
                    byte b12 = (byte) (bArr5[17] + 1);
                    Object[] objArr16 = new Object[1];
                    a(b11, (byte) (b11 | 50), b12, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore2, gidForName, deadChar, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{21739, 37727, 56216, 969, 18953, 45636, 64140, 8889, 26941, 20842, 39402, 49616, 2103, 28806, 47300, 59162, 12119, 6050, 24512, 34308, 52853, 14006}, 51131 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{21743, 15581, 33949, 27723, 62485, 24008, 9612, 36165, 5431, 65272, 18088, 11895, 46631, 7704, 59349}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26683, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (31534 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int iAxisFromString = MotionEvent.axisFromString("") + 922;
                        int i11 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte[] bArr6 = $$a;
                        byte b13 = bArr6[7];
                        byte b14 = bArr6[37];
                        Object[] objArr19 = new Object[1];
                        a(b13, b14, (byte) (b14 & 52), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iAxisFromString, i11, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31533);
                        int deadChar2 = KeyEvent.getDeadChar(0, 0) + 921;
                        int i12 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28;
                        byte[] bArr7 = $$a;
                        byte b15 = bArr7[80];
                        Object[] objArr20 = new Object[1];
                        a(b15, bArr7[37], b15, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatTimeout, deadChar2, i12, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            int i13 = b + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
            int i14 = i13 % 2;
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i15 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i18 = i17 + 2106421723 + (((~((-1180386576) | iIdentityHashCode2)) | 37945612) * 576) + (((~((~iIdentityHashCode2) | (-1142440964))) | 555747456) * 576) + 381836032;
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr21[0])[0] = i20 ^ (i20 << 5);
        int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        b = i21 % 128;
        if (i21 % 2 != 0) {
            return this.AFAdRevenueData;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public List<String> getHeaderField(String str) {
        int i = 2 % 2;
        int i2 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.getCurrencyIso4217Code.keySet().iterator();
            throw null;
        }
        int i3 = b + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        for (String str2 : this.getCurrencyIso4217Code.keySet()) {
            if (str2 != null) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
                b = i5 % 128;
                int i6 = i5 % 2;
                if (str2.equalsIgnoreCase(str)) {
                    return this.getCurrencyIso4217Code.get(str2);
                }
            }
        }
        return null;
    }

    public final String getCurrencyIso4217Code(String str) {
        int i = 2 % 2;
        List<String> headerField = getHeaderField(str);
        if (headerField == null) {
            return null;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb = new StringBuilder(it.next());
        while (it.hasNext()) {
            int i4 = b + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            sb.append(", ");
            sb.append(it.next());
        }
        String string = sb.toString();
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 38 / 0;
        }
        return string;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFd1aSDK aFd1aSDK = (AFd1aSDK) obj;
        if (this.getMediationNetwork != aFd1aSDK.getMediationNetwork) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = i2 + 1;
            b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 31;
            b = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.AFAdRevenueData != aFd1aSDK.AFAdRevenueData) {
            int i7 = b + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!this.getMonetizationNetwork.equals(aFd1aSDK.getMonetizationNetwork)) {
            int i8 = b + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.getCurrencyIso4217Code.equals(aFd1aSDK.getCurrencyIso4217Code)) {
            return this.getRevenue.equals(aFd1aSDK.getRevenue);
        }
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        b = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = b + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.getMonetizationNetwork.hashCode();
        int i4 = this.getMediationNetwork;
        boolean z = this.AFAdRevenueData;
        int iHashCode2 = (((((((iHashCode * 31) + i4) * 31) + (z ? 1 : 0)) * 31) + this.getCurrencyIso4217Code.hashCode()) * 31) + this.getRevenue.hashCode();
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        b = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode2;
    }
}
