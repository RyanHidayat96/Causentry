package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public enum zzhl implements zzag {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);

    private static int $10 = 0;
    private static int $11 = 1;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final int zzh;
    private static final byte[] $$d = {68, -119, -76, 97, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -23, 17, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -21, 4, 2, -13, 2, 2, -10, -33, 34, -11, 3, -14, 16, -18, 10, -68};
    private static final int $$e = 198;
    private static final byte[] $$a = {123, -2, -101, -104, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 219;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int b = 0;

    static {
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = b + 105;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
    }

    zzhl(int i) {
        this.zzh = i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 1
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_common.zzhl.$$a
            int r5 = r5 * 52
            int r5 = 56 - r5
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r0[r5]
        L26:
            int r6 = r6 + r4
            int r6 = r6 + (-10)
            int r5 = r5 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzhl.a(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 48
            int r7 = 52 - r7
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_common.zzhl.$$d
            int r6 = r6 * 11
            int r6 = r6 + 38
            int r8 = r8 * 15
            int r8 = r8 + 84
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2c
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r8]
        L2c:
            int r7 = r7 + r4
            int r8 = r8 + 1
            int r7 = r7 + 3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzhl.d(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static zzhl[] valuesCustom() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzhl[] zzhlVarArr = (zzhl[]) values().clone();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return zzhlVarArr;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $11 + 37;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 19472), TextUtils.lastIndexOf("", '0', 0) + 2625, TextUtils.indexOf("", "", 0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-16737794) - Color.rgb(0, 0, 0)), 481 - View.MeasureSpec.getSize(0), TextUtils.lastIndexOf("", '0') + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i6 = $10 + 5;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $10 + 83;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 39423), 481 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            try {
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - Color.red(0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 481, 37 - (Process.myTid() >> 22), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0217  */
    /* JADX WARN: Code duplicated, block: B:27:0x0223  */
    @Override // com.google.android.gms.internal.mlkit_vision_common.zzag
    public final int zza() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "") + 31533);
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 921;
            int iAxisFromString = 27 - MotionEvent.axisFromString("");
            byte[] bArr = $$a;
            byte b2 = bArr[37];
            Object[] objArr2 = new Object[1];
            a(b2, b2, bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iIndexOf, iAxisFromString, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{421, 33709, 1454, 34723, 2487, 35726, 3466, 36827, 4499, 37768, 5548, 38874, 6633, 39916, 7634, 40904, 8665, 41968, 9686, 42798, 10539, 43836}, 33286 - TextUtils.lastIndexOf("", '0'), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{417, 64609, 64055, 63727, 63123, 62796, 62230, 61929, 61417, 60852, 59506, 58899, 58561, 58012, 57695}, TextUtils.lastIndexOf("", '0', 0, 0) + 64970, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 31533);
            int jumpTapTimeout = 921 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iResolveSize = View.resolveSize(0, 0) + 28;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[37];
            byte b4 = bArr2[80];
            Object[] objArr5 = new Object[1];
            a(b3, b4, (byte) (b4 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, jumpTapTimeout, iResolveSize, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (31533 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 921;
                int scrollDefaultDelay = 28 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte b5 = $$a[80];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                a(b5, b6, (byte) (b6 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, windowTouchSlop, scrollDefaultDelay, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i2 = ~((-781015897) | iUptimeMillis);
            int i3 = (-2142815721) + ((76351512 | i2) * (-280)) + ((i2 | (~((-993063748) | iUptimeMillis))) * 140);
            int i4 = ~((-704664385) | iUptimeMillis);
            int i5 = ~iUptimeMillis;
            int i6 = i3 + (((~(i5 | (-288399364))) | i4 | (~((-76351513) | i5))) * 140) + 950614300;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{421, 46791, 28538, 10225, 56351, 38028, 19758, 529, 47821, 29537, 11254, 57413, 39065, 20782, 1606, 48846, 30562, 12176, 58394, 40106, 21780, 2653, 49896, 31594, 13213, 59397}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 46957, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{423, 55320, 45796, 36173, 26373, 16871, 6214, 61978, 52476, 42821, 33074, 23534, 12875, 3120, 59022, 49482, 39739, 30099}, TextUtils.indexOf("", "") + 55721, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 77 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                            int i12 = i11 % 2;
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                        int i14 = i13 % 2;
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{430, 27170, 54972, 17200, 45046, 6155, 33935, 61723, 23963, 50773, 13009, 40816, 3043, 29803, 57539, 19776}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 27527, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{429, 2433, 4579, 6601, 8500, 10504, 12662, 14682, 16516, 18572, 20733, 22727, 24587, 26630, 28782, 30798}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2081, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 950614300};
                byte[] bArr3 = $$d;
                byte b7 = (byte) (-bArr3[35]);
                byte b8 = b7;
                Object[] objArr13 = new Object[1];
                d(b7, b8, b8, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b9 = (byte) (bArr3[35] + 1);
                byte b10 = b9;
                Object[] objArr14 = new Object[1];
                d(b9, b10, b10, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31533);
                    int iAlpha = 921 - Color.alpha(0);
                    int iAxisFromString2 = 27 - MotionEvent.axisFromString("");
                    byte b11 = $$a[80];
                    byte b12 = b11;
                    Object[] objArr16 = new Object[1];
                    a(b11, b12, (byte) (b12 | 37), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iAlpha, iAxisFromString2, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{421, 33709, 1454, 34723, 2487, 35726, 3466, 36827, 4499, 37768, 5548, 38874, 6633, 39916, 7634, 40904, 8665, 41968, 9686, 42798, 10539, 43836}, 33287 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{417, 64609, 64055, 63727, 63123, 62796, 62230, 61929, 61417, 60852, 59506, 58899, 58561, 58012, 57695}, 64968 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c3 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 921;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 29;
                        byte[] bArr4 = $$a;
                        byte b13 = bArr4[37];
                        byte b14 = bArr4[80];
                        Object[] objArr19 = new Object[1];
                        a(b13, b14, (byte) (b14 | 52), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, offsetBefore, iLastIndexOf, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cCombineMeasuredStates = (char) (31533 - View.combineMeasuredStates(0, 0));
                        int packedPositionGroup = 921 - ExpandableListView.getPackedPositionGroup(0L);
                        int maxKeyCode = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte[] bArr5 = $$a;
                        byte b15 = bArr5[37];
                        Object[] objArr20 = new Object[1];
                        a(b15, b15, bArr5[80], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, packedPositionGroup, maxKeyCode, -1048449946, false, (String) objArr20[0], null);
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
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[3])[0];
        if (i18 == i17) {
            int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 % 128;
            int i20 = i19 % 2;
            int i21 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iNextInt = new Random().nextInt(1938510833);
            int i22 = i21 + 413785123 + (((~(727839851 | iNextInt)) | (-1065221756) | (~(1046239792 | iNextInt))) * (-744)) + (((~iNextInt) | 708857888) * 744) + ((iNextInt | 1065221755) * 744);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr21[0])[0] = i24 ^ (i24 << 5);
            int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i25 % 128;
            int i26 = i25 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
            int i27 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i28 = ~iIdentityHashCode;
            int i29 = ~((-213642084) | i28);
            int i30 = ~((-1560437561) | iIdentityHashCode);
            int i31 = i27 + (-414465930) + ((i29 | i30) * 1150) + (((~(1560437560 | i28)) | i30) * (-575)) + (((~(iIdentityHashCode | (-213642084))) | (~(i28 | 213642083))) * 575);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr22[0])[0] = i33 ^ (i33 << 5);
        }
        return this.zzh;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6180128664549742369L;
    }
}
