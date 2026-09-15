package com.midtrans.sdk.corekit.models.snap;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
public class BankTransfer {
    private List<String> banks;
    private static final byte[] $$c = {102, -96, -78, -55};
    private static final int $$f = 111;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {1, -81, 2, 79, -20, -6, 55, -65, -16, -8, 0, -13, -1, 47, -64, -11, -17, 5, -5, -7, -26, 6, 47, -61, -23, 9, -26, 3, -12, -21, -3, 3, -2, -24, Base64.padSymbol, -67, -13, -14, 7, -21, -4, 5, -19, 54, -71, -10, 3, -9, -15, 54, -27, -60, -7, -3, 17, -19, -19, -17, 8, -2, 20, -55, 9, -26, 3, -12, -21, -3, 3, -2, -24, 25, -27, -19, -7, -11, -10, 13, 4, -26, -22, -8, 2, -14, -7, 7, 18, -57, 9, -17, -14, 13, 5, -37, -5, -8, -11, -14, -7, 43, -58, -8, 2, -6, -15, -7, 0, -17, -14, 72, -21};
    private static final int $$e = 93;
    private static final byte[] $$a = {107, 48, 57, 107, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 175;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {60052, 60055, 60043, 60048, 60049, 60063, 60072, 60045, 60083, 60062, 60056, 59745, 60059, 59744, 60079, 60117, 60058, 60073, 60050, 59749, 59748, 60061, 60088, 60053, 59746, 60040, 60041, 60034, 60054, 60051, 59747, 60047, 60046, 60090, 60057, 60060};
    private static char TuitionPaymentFragmentbindingInflater1 = 57191;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 52
            int r6 = 108 - r6
            int r5 = r5 * 15
            int r0 = r5 + 38
            int r7 = r7 * 3
            int r7 = r7 + 84
            byte[] r1 = com.midtrans.sdk.corekit.models.snap.BankTransfer.$$a
            byte[] r0 = new byte[r0]
            int r5 = r5 + 37
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2a:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            int r6 = r6 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.snap.BankTransfer.a(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 107
            int r7 = r7 + 4
            int r8 = r8 * 107
            int r8 = 108 - r8
            byte[] r0 = com.midtrans.sdk.corekit.models.snap.BankTransfer.$$d
            int r9 = r9 + 98
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r7]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r3 = r3 + r9
            int r7 = r7 + 1
            int r9 = r3 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.snap.BankTransfer.c(int, short, byte, java.lang.Object[]):void");
    }

    public void setBanks(List<String> list) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2267;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 34;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[132], bArr[37], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, minimumFlingVelocity, iIndexOf, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(new char[]{17, 22, 2, 29, 6, 24, 3, 17, 1, 24, '\f', '\t', 28, 26, '!', 7, Typography.quote, 28, 2, 1, '\t', 4}, (byte) (TextUtils.lastIndexOf("", '0') + 14), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(new char[]{7, 3, 14, 4, 27, 7, 11, 23, '\n', 15, 7, 1, 22, 24, 13937}, (byte) (TextUtils.getCapsMode("", 0, 0) + 114), 14 - Process.getGidForName(""), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int capsMode = 2267 - TextUtils.getCapsMode("", 0, 0);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 33;
            byte[] bArr2 = $$a;
            byte b = bArr2[132];
            Object[] objArr5 = new Object[1];
            a(b, b, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, capsMode, keyRepeatDelay, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                int iBlue = Color.blue(0) + 2267;
                int i6 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                a(b2, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, iBlue, i6, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[0])[0];
            int i8 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i9 = ~iUptimeMillis;
            int i10 = (((1993297838 + (((~((-555938272) | i9)) | 252775044) * 519)) + (((~(i9 | (-539160924))) | (~(791935967 | iUptimeMillis))) * (-519))) + (((~(iUptimeMillis | 252775044)) | 555938271) * 519)) - 1350962777;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
            int i14 = i13 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            b(new char[]{17, 22, 2, 29, 6, 24, 3, 17, 14, 4, 3, 14, Typography.quote, '\t', 30, 19, 6, 19, '!', 25, 17, 26, 27, '\b', 17, 4}, (byte) (64 - (Process.myTid() >> 22)), 26 - (ViewConfiguration.getTouchSlop() >> 8), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(new char[]{'\b', Typography.quote, 13836, 13836, 11, 21, ' ', Typography.quote, 13838, 13838, 0, 19, 16, 22, 30, 19, 5, 18}, (byte) (37 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 17 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                    int i16 = i15 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            b(new char[]{'\n', 22, '\n', '\r', '\r', 3, 17, 22, '!', 17, '\t', 24, 31, 1, '\n', 27}, (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 60), 16 - (KeyEvent.getMaxKeyCode() >> 16), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b(new char[]{23, 0, 11, 21, 30, 19, '!', 25, '\n', 14, 26, 24, 18, 4, 3, 11}, (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 96), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
            int i18 = i17 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1350962777};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[10];
                Object[] objArr13 = new Object[1];
                c(b4, b4, bArr3[0], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr3[0];
                Object[] objArr14 = new Object[1];
                c(b5, b5, bArr3[10], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                        int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 2267;
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 33;
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr16 = new Object[1];
                        a(b6, b7, b7, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, scrollBarSize2, packedPositionGroup, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        b(new char[]{17, 22, 2, 29, 6, 24, 3, 17, 1, 24, '\f', '\t', 28, 26, '!', 7, Typography.quote, 28, 2, 1, '\t', 4}, (byte) (ImageFormat.getBitsPerPixel(0) + 14), 22 - TextUtils.indexOf("", "", 0), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        b(new char[]{7, 3, 14, 4, 27, 7, 11, 23, '\n', 15, 7, 1, 22, 24, 13937}, (byte) (114 - TextUtils.getOffsetBefore("", 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                            int absoluteGravity = 2267 - Gravity.getAbsoluteGravity(0, 0);
                            int i19 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32;
                            byte[] bArr4 = $$a;
                            byte b8 = bArr4[132];
                            Object[] objArr19 = new Object[1];
                            a(b8, b8, bArr4[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration, absoluteGravity, i19, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2267;
                            int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 33;
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            a(bArr5[132], bArr5[37], bArr5[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, scrollDefaultDelay, scrollDefaultDelay2, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i20 = ((int[]) objArr[3])[0];
        int i21 = ((int[]) objArr[0])[0];
        if (i21 == i20) {
            int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
            int i23 = i22 % 2;
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[0])[0];
            int i26 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i27 = i24 + ((((~((-136314905) | startElapsedRealtime)) | 537131779) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1580625780) + ((~((~startElapsedRealtime) | (-136314905))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
            int i28 = i27 ^ (i27 << 13);
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr21[2])[0] = i29 ^ (i29 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i21 / (((i21 - 1) * i21) % 2), 0).show();
            Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[0])[0];
            int i32 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int i33 = i30 + 1933949283 + (((~((-193310675) | iUptimeMillis2)) | (-615402642)) * (-964)) + (((~((~iUptimeMillis2) | (-193310675))) | 184656706) * (-964));
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr22[2])[0] = i35 ^ (i35 << 5);
        }
        this.banks = list;
    }

    private static void b(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object obj2 = null;
        int i4 = 8;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> i4), 2266 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getTapTimeout() >> 16) + 33, -1927765101, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 8;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        float f = 0.0f;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b4 = (byte) 0;
            byte b5 = b4;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), Color.argb(0, 0, 0, 0) + 2267, 33 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1927765101, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
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
                        char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49267);
                        int i6 = (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 3261;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 31;
                        byte b6 = (byte) ($$f & 1);
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, i6, iIndexOf, -127612708, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        int i7 = $10 + 69;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        try {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char mirror = (char) (22926 - AndroidCharacter.getMirror('0'));
                                int iArgb = Color.argb(0, 0, 0, 0) + 594;
                                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 17;
                                byte b8 = (byte) ($$f & 3);
                                byte b9 = (byte) (b8 - 3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror, iArgb, tapTimeout, 1570859318, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i9 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i9];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i10 = $11 + 95;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                        } else {
                            int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
                f = 0.0f;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public BankTransfer() {
    }

    public BankTransfer(List<String> list) throws Throwable {
        setBanks(list);
    }

    public List<String> getBanks() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        List<String> list = this.banks;
        int i4 = i3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, short r8, int r9) {
        /*
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r7 = r7 + 113
            byte[] r0 = com.midtrans.sdk.corekit.models.snap.BankTransfer.$$c
            int r9 = r9 * 3
            int r9 = 4 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L28:
            int r7 = r7 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.snap.BankTransfer.$$g(int, short, int):java.lang.String");
    }
}
