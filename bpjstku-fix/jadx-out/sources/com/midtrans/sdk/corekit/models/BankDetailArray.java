package com.midtrans.sdk.corekit.models;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
public class BankDetailArray implements Serializable {
    private ArrayList<BankDetail> bankDetails;
    private static final byte[] $$c = {83, -4, -55, -17};
    private static final int $$f = 33;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {118, 35, -100, -35, 9, -20, 28, -27, -10, 2, -10, 2, 14, -24, -16, 6, -1, -24, 6, -10, 2, 16, -24, -17, -9, 11, -19, -6};
    private static final int $$e = 255;
    private static final byte[] $$a = {21, 65, -9, -121, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 73;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {45565, 27427, 1114, 8605, 55991, 63456, 37150, 18949, 26491, Typography.paragraph, 15768, 55092, 61481, 44402, 18054, 25542, 7393, 13886, 54082, 35952, 43435, 17106, 45561, 27425, 1119, 8607, 55979, 63468, 37150, 19065, 26481, 164, 15834, 55059, 61497, 44396, 18071, 45565, 27427, 1114, 8605, 55991, 63456, 37150, 18949, 26485, 181, 15814, 55113, 61457, 44386, 18054, 25546, 7418, 13844, 54106, 35942, 43420, 17105, 31768, 6462, 12901, 61329, 45567, 27448, 1100, 8605, 55997, 63463, 37134, 19050, 26468, 181, 15834, 55054, 61491, 44384, 18054, 25546, 7395, 13843, 45558, 27436, 1096, 8590, 56054, 63461, 37147, 19013, 26483, 235, 15845, 55070, 61475, 44405, 18071, 25550, 24749, 47729, 54531, 61657, 3060, 9912, 16470, 39690, 46596, 53756, 60573, 1623, 8523, 31798, 38862, 45726};
    private static long TuitionPaymentFragmentbindingInflater1 = -4069694647077541043L;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = 53 - r7
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = com.midtrans.sdk.corekit.models.BankDetailArray.$$a
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r8 = r8 + 1
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-10)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.BankDetailArray.a(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.midtrans.sdk.corekit.models.BankDetailArray.$$d
            int r5 = r5 * 17
            int r5 = 115 - r5
            int r6 = r6 * 24
            int r1 = 25 - r6
            int r7 = r7 * 24
            int r7 = 28 - r7
            byte[] r1 = new byte[r1]
            int r6 = 24 - r6
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2a:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-5)
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.BankDetailArray.d(int, int, byte, java.lang.Object[]):void");
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $11 + 77;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2187, View.resolveSizeAndState(0, 0, 0) + 40, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 2;
                    byte b5 = (byte) (b4 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33016), 3011 - KeyEvent.getDeadChar(0, 0), 26 - View.getDefaultSize(0, 0), 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cKeyCodeFromString = (char) (36505 - KeyEvent.keyCodeFromString(""));
                    int iRgb = (-16773840) - Color.rgb(0, 0, 0);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 17;
                    byte b6 = (byte) ($$f & 7);
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, iRgb, packedPositionType, -968507904, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
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
            int i7 = $10 + 89;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char mode = (char) (36505 - View.MeasureSpec.getMode(0));
                int iMyPid = (Process.myPid() >> 22) + 3376;
                int iIndexOf = 16 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte b8 = (byte) ($$f & 7);
                byte b9 = (byte) (b8 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mode, iMyPid, iIndexOf, -968507904, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0221  */
    /* JADX WARN: Code duplicated, block: B:25:0x022b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0235  */
    /* JADX WARN: Code duplicated, block: B:29:0x0237  */
    public void setBankDetails(ArrayList<BankDetail> arrayList) throws Throwable {
        Object[] objArr;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        b = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 31533);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 922;
            int iAlpha = Color.alpha(0) + 28;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[7], (byte) 52, bArr[37], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, iIndexOf, iAlpha, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(ViewConfiguration.getEdgeSlop() >> 16, 22 - ExpandableListView.getPackedPositionType(0L), (char) KeyEvent.keyCodeFromString(""), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c((ViewConfiguration.getTouchSlop() >> 8) + 22, 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((-1) - TextUtils.lastIndexOf("", '0')), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAxisFromString = (char) (31532 - MotionEvent.axisFromString(""));
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 921;
            int keyRepeatTimeout = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[80];
            Object[] objArr5 = new Object[1];
            a(b2, b2, bArr2[37], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, doubleTapTimeout, keyRepeatTimeout, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength2 = (char) (TextUtils.getTrimmedLength("") + 31533);
                int longPressTimeout = 921 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int i5 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr3[80], (byte) (-bArr3[33]), (byte) 51, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength2, longPressTimeout, i5, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = (((2139271263 + ((~((~iIdentityHashCode) | 1505639291)) * (-116))) + ((411048747 | iIdentityHashCode) * 116)) + (((~(iIdentityHashCode | (-1363030897))) | 268440352) * 116)) - 241058293;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(37 - KeyEvent.normalizeMetaState(0), 26 - View.MeasureSpec.getSize(0), (char) Color.argb(0, 0, 0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(63 - (ViewConfiguration.getWindowTouchSlop() >> 8), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, (char) TextUtils.indexOf("", "", 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i9 = b + 37;
                int i10 = i9 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10;
                if (i9 % 2 != 0) {
                    int i11 = 90 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        i = i10 + 17;
                        b = i % 128;
                        if (i % 2 != 0) {
                            ((ContextWrapper) applicationContext).getBaseContext();
                            obj.hashCode();
                            throw null;
                        }
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    i = i10 + 17;
                    b = i % 128;
                    if (i % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        obj.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(View.getDefaultSize(0, 0) + 81, TextUtils.indexOf("", "", 0) + 16, (char) ExpandableListView.getPackedPositionType(0L), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 96, 16 - (Process.myTid() >> 22), (char) (Drawable.resolveOpacity(0, 0) + 53592), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -241058293};
                byte[] bArr4 = $$d;
                byte b3 = bArr4[16];
                byte b4 = (byte) (b3 + 1);
                Object[] objArr13 = new Object[1];
                d(b4, b4, (byte) (-b3), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = (byte) (-bArr4[16]);
                byte b6 = b5;
                Object[] objArr14 = new Object[1];
                d(b5, b6, (byte) (b6 - 1), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (31533 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 921;
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                    byte[] bArr5 = $$a;
                    Object[] objArr16 = new Object[1];
                    a(bArr5[80], (byte) (-bArr5[33]), (byte) 51, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, fadingEdgeLength, pressedStateDuration, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(View.MeasureSpec.getMode(0), 22 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(ImageFormat.getBitsPerPixel(0) + 23, 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarSize = (char) (31533 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 921;
                        int iRed = Color.red(0) + 28;
                        byte[] bArr6 = $$a;
                        byte b7 = bArr6[80];
                        Object[] objArr19 = new Object[1];
                        a(b7, b7, bArr6[37], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, doubleTapTimeout2, iRed, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char doubleTapTimeout3 = (char) (31533 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0);
                        int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                        byte[] bArr7 = $$a;
                        Object[] objArr20 = new Object[1];
                        a(bArr7[7], (byte) 52, bArr7[37], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(doubleTapTimeout3, iLastIndexOf, longPressTimeout2, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i12 = b + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                    int i13 = i12 % 2;
                    objArr = objArr15;
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i17 = i16 + (-1878640843) + (((~(startUptimeMillis | 1608296768)) | 165782875) * 191) + (((~((~startUptimeMillis) | 1608296768)) | 2163739) * 191);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr21[0])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i20 = b + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                    int i21 = i20 % 2;
                    arrayList2.add(str);
                }
            }
            int[] iArr = new int[i15];
            int i22 = i15 - 1;
            iArr[i22] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i22) % 2) - 1], 1).show();
            int i23 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i24 = (~System.identityHashCode(this)) | 964177506;
            int i25 = i23 + 499135146 + (i24 * 495) + (((~i24) | 809508896) * 495);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr22[0])[0] = i27 ^ (i27 << 5);
        }
        this.bankDetails = arrayList;
    }

    public ArrayList<BankDetail> getBankDetails() {
        int i = 2 % 2;
        int i2 = b + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.bankDetails;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 109
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r1 = com.midtrans.sdk.corekit.models.BankDetailArray.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2f
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.BankDetailArray.$$g(byte, int, byte):java.lang.String");
    }
}
