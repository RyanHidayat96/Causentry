package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
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
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appsflyer.internal.AFa1tSDK;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    private static final byte[] $$c = {106, -66, 28, 119};
    private static final int $$f = 249;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {19, 78, 114, 113, -2, -19, 30, -33, -4, -9, 35, -28, -13, -11, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 63, 10, -19, 44, -41, -14, -1, 0, 7, -28, 40, -38, 7, -5, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 62, -16, -2, 59, -61, -12, -4, 4, -9, 3, 51, -55, -17, 6, -18, -1, 2, 1, 50, -61, -10, -10, 65, -55, -24, -3, 8, 54, -55, -19, 3, 55, -63, 1, -5, -13, -10, 7, -15, -9, 71, -24, -39, -6, -6, -9, 23, -26, -2, -11, 33, -41, 24, -23, -16, -8, 12, -18, -5, 76, -48, -21, -22, -4, 4, 2, -24, 43, -45, 0, -3, 24, -23, -16, -8, 12, -18, -5, 33, -37, -8, 7, -10, -3, -9, 75, -34, -55, 8, -7, 4, -5, -17, -16, -2, 59, -56, -18, 2, -13, -5, 5, -14, 67, -58, -1, -23, 15, 47, -76, 3, 8, -2, -23, 7, -10, -3, 60, -44, -29, 8, -2, -23, 7, -10, -3, 38, -33, -23, 15, 10, -37, 1, -7, 9, Base64.padSymbol, -4, -37, -55, 0, 11, -17, 0, 9, -15, 21, -42, 7, -10, 8, -1, -19, 7, 2, 19, -25, -16, 7, -6, -1, 44, -7, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, Base64.padSymbol, -28, -3, -9, 4, 26, -48, -3, -10, -2, -1, -1, -4, 3, -17, 43, -48, -2, -7, 11, -23, 45, -34, -15, -4, 6, -3, -6, -12, -15, 13, -17, -10, 27, -33, 5, 21, -25, -17, 1, 0, -14, -4, 6, -10, -3, 22, -31, 27, -38, -1, -11, 9, 1, -5, -17, -16, -2, 59, -56, -18, 2, -13, -5, 5, -14, 67, -58, -1, -23, 15, 47, -75, -2, 10, -17, 64, -67, -6, 7, -5, -11, 58, -72, 9, -16, -8, 12, -18, -5, 66, -43, -31, 8, -1, -23, 11, 29, -37, -21, 9, 2, -6, 13, -31, 0, 2, -13};
    private static final int $$e = 150;
    private static final byte[] $$a = {7, 15, 25, 25, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
    private static final int $$b = 196;
    private static int b = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722415;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 1
            int r6 = 214 - r6
            int r7 = 103 - r7
            byte[] r0 = com.appsflyer.SingleInstallBroadcastReceiver.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r6
            r7 = r8
            r4 = r2
            goto L23
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r3 = r0[r6]
        L23:
            int r6 = r6 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.SingleInstallBroadcastReceiver.c(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 399 - r6
            int r7 = r7 + 77
            int r0 = r8 + 1
            byte[] r1 = com.appsflyer.SingleInstallBroadcastReceiver.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r7 = r6
            r4 = r8
            r3 = r2
            goto L26
        L11:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-4)
            int r7 = r7 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.SingleInstallBroadcastReceiver.d(short, byte, int, java.lang.Object[]):void");
    }

    private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $10 + 91;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.alpha(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3291, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31, 1199271174, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 650 - Process.getGidForName(""), '\\' - AndroidCharacter.getMirror('0'), -450685997, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i8 = $11 + 119;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i9 = $10 + 11;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                try {
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.myPid() >> 22), 651 - (KeyEvent.getMaxKeyCode() >> 16), 44 - ExpandableListView.getPackedPositionType(0L), -450685997, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i;
        Object[] objArr3;
        Object[] objArr4;
        int i2;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        Context applicationContext;
        Object[] objArr8;
        Object[] objArr9;
        String str;
        Object[] objArr10;
        Object[] objArr11;
        int i3;
        Object[] objArr12;
        char c;
        int i4;
        Object[] objArr13;
        Object[] objArr14;
        int i5;
        Object[] objArr15;
        Object[] objArr16;
        Object[] objArr17;
        int i6;
        Context context2;
        Object[] objArr18;
        String stringExtra;
        int i7 = 2 % 2;
        Object[] objArr19 = new Object[1];
        a(true, 148 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11}, objArr19);
        String str2 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        a(false, 153 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getTrimmedLength("") + 16, 13 - TextUtils.indexOf("", ""), new char[]{'\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535}, objArr20);
        String str3 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        a(false, View.MeasureSpec.makeMeasureSpec(0, 0) + 150, 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (Process.myTid() >> 22) + 21, new char[]{11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534}, objArr21);
        String str4 = (String) objArr21[0];
        Object[] objArr22 = new Object[1];
        a(true, 154 - Color.argb(0, 0, 0, 0), (Process.myPid() >> 22) + 15, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, new char[]{65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t'}, objArr22);
        String str5 = (String) objArr22[0];
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0));
            int iRgb = Color.rgb(0, 0, 0) + 16778137;
            int scrollBarSize = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte[] bArr = $$a;
            Object[] objArr23 = new Object[1];
            c((short) 210, (byte) (bArr[88] - 1), bArr[7], objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iRgb, scrollBarSize, -1048449946, false, (String) objArr23[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cCombineMeasuredStates = (char) (31533 - View.combineMeasuredStates(0, 0));
                int i8 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 920;
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 28;
                Object[] objArr24 = new Object[1];
                c((short) 210, $$a[91], (byte) 37, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, i8, edgeSlop, -1142834547, false, (String) objArr24[0], null);
            }
            Object[] objArr25 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr25[1])[0]}, (Object[]) objArr25[2], new int[]{((int[]) objArr25[3])[0]}, (String[]) objArr25[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i9 = (~((-742556927) | iUptimeMillis)) | 742555804;
            int i10 = ~iUptimeMillis;
            int i11 = (-799174077) + ((i9 | (~(1031523839 | i10))) * 886) + (((~(i10 | 742556926)) | 1031522717) * (-1772)) + ((~(i10 | 1031522717)) * 886) + 1358952932;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
        } else {
            try {
                Object[] objArr26 = {context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context, Integer.valueOf(((Integer) Class.forName(str2).getMethod(str3, Object.class).invoke(null, this)).intValue()), 0, 1358952932};
                byte[] bArr2 = $$d;
                Object[] objArr27 = new Object[1];
                d((short) 395, bArr2[20], bArr2[66], objArr27);
                Class<?> cls = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                d((short) 385, bArr2[17], (byte) (bArr2[140] + 1), objArr28);
                Object[] objArr29 = (Object[]) cls.getMethod((String) objArr28[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr26);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char trimmedLength = (char) (31533 - TextUtils.getTrimmedLength(""));
                    int i14 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921;
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 29;
                    Object[] objArr30 = new Object[1];
                    c((short) 210, $$a[91], (byte) 37, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, i14, packedPositionChild, -1142834547, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr29);
                try {
                    long jLongValue = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf2 = (char) (31533 - TextUtils.indexOf("", ""));
                        int i15 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 921;
                        int minimumFlingVelocity = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        Object[] objArr31 = new Object[1];
                        c((short) 173, $$a[91], (byte) 52, objArr31);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, i15, minimumFlingVelocity, -778300370, false, (String) objArr31[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char minimumFlingVelocity2 = (char) (31533 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 922;
                        int i16 = 29 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr3 = $$a;
                        Object[] objArr32 = new Object[1];
                        c((short) 210, (byte) (bArr3[88] - 1), bArr3[7], objArr32);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity2, modifierMetaStateMask, i16, -1048449946, false, (String) objArr32[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    objArr = objArr29;
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
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[3])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i20 = i19 + (((~((-843823020) | iIdentityHashCode)) | 87630171) * 398) + 143944423 + (((~((~iIdentityHashCode) | (-843823020))) | 87630171) * 398);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            i = 0;
            ((int[]) objArr2[0])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str6 : strArr) {
                    arrayList.add(str6);
                }
            }
            int[] iArr = new int[i18];
            int i23 = i18 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i18 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i25 = i24 + (-94641885) + (((~(iIdentityHashCode2 | 834628957)) | (-939450687)) * (-465)) + ((834628957 | (~((-939450687) | iIdentityHashCode2))) * 930) + ((iIdentityHashCode2 | (-104890403)) * 465);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            i = 0;
            ((int[]) objArr2[0])[0] = i27 ^ (i27 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char mirror = (char) (29992 - AndroidCharacter.getMirror('0'));
            int iRgb2 = Color.rgb(i, i, i) + 16778971;
            int modifierMetaStateMask2 = 22 - ((byte) KeyEvent.getModifierMetaStateMask());
            Object[] objArr33 = new Object[1];
            c((short) 210, $$a[91], (byte) 37, objArr33);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, iRgb2, modifierMetaStateMask2, 986134021, false, (String) objArr33[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char size = (char) (View.MeasureSpec.getSize(0) + 29944);
                int i28 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                int i29 = 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                Object[] objArr34 = new Object[1];
                c((short) 173, $$a[91], (byte) 52, objArr34);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(size, i28, i29, 1599039318, false, (String) objArr34[0], null);
            }
            Object[] objArr35 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr35[0])[0]}, new int[]{((int[]) objArr35[1])[0]}, (Object[]) objArr35[2], new int[1], (String[]) objArr35[4]};
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int i30 = (((1173421866 + ((~((~iUptimeMillis2) | (-570461505))) * 433)) + (((~(572047170 | iUptimeMillis2)) | (-784649597)) * (-433))) + (((~(iUptimeMillis2 | (-784649597))) | 1585666) * 433)) - 20565502;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr3[3])[0] = i32 ^ (i32 << 5);
            objArr2 = objArr2;
        } else {
            int iIntValue = ((Integer) Class.forName(str2).getMethod(str3, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr36 = {-1625532971};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (42049 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1726 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).newInstance(objArr36), -20565502, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29945);
                    int mode = View.MeasureSpec.getMode(0) + 1755;
                    int capsMode = 23 - TextUtils.getCapsMode("", 0, 0);
                    Object[] objArr37 = new Object[1];
                    c((short) 173, $$a[91], (byte) 52, objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cLastIndexOf, mode, capsMode, 1599039318, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    long jLongValue2 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29944);
                        int bitsPerPixel = 1754 - ImageFormat.getBitsPerPixel(0);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                        Object[] objArr38 = new Object[1];
                        c((short) 121, $$a[91], (byte) 52, objArr38);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(tapTimeout, bitsPerPixel, keyRepeatDelay, 1596667560, false, (String) objArr38[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29945);
                        int absoluteGravity = 1755 - Gravity.getAbsoluteGravity(0, 0);
                        int i33 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        Object[] objArr39 = new Object[1];
                        c((short) 210, $$a[91], (byte) 37, objArr39);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cLastIndexOf2, absoluteGravity, i33, 986134021, false, (String) objArr39[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf4);
                    objArr3 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i34 = ((int[]) objArr3[1])[0];
        int i35 = ((int[]) objArr3[0])[0];
        if (i35 == i34) {
            int i36 = ((int[]) objArr3[3])[0];
            objArr4 = new Object[]{new int[]{((int[]) objArr3[0])[0]}, new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[1], (String[]) objArr3[4]};
            int i37 = (int) Runtime.getRuntime().totalMemory();
            int i38 = ~((-852919890) | (~i37));
            int i39 = i36 + (((-922680920) | i38 | (~(852919889 | i37))) * (-338)) + 1879064073 + (((~(i37 | (-69761031))) | i38) * 338);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            i2 = 0;
            ((int[]) objArr4[3])[0] = i41 ^ (i41 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr2 = (String[]) objArr3[4];
            if (strArr2 != null) {
                for (String str7 : strArr2) {
                    int i42 = TuitionPaymentFragmentbindingInflater1 + 77;
                    b = i42 % 128;
                    int i43 = i42 % 2;
                    arrayList2.add(str7);
                }
            }
            Toast.makeText((Context) null, i35 / (((i35 - 1) * i35) % 2), 0).show();
            int i44 = ((int[]) objArr3[3])[0];
            objArr4 = new Object[]{new int[]{((int[]) objArr3[0])[0]}, new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[1], (String[]) objArr3[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i45 = i44 + (-761985607) + (((~(525931942 | iIdentityHashCode3)) | 738534368) * (-366)) + (((~(iIdentityHashCode3 | 1063073766)) | 201392544) * 366);
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            i2 = 0;
            ((int[]) objArr4[3])[0] = i47 ^ (i47 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char c2 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int iLastIndexOf = 2266 - TextUtils.lastIndexOf("", '0', i2, i2);
            int i48 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32;
            Object[] objArr40 = new Object[1];
            c((short) 173, $$a[91], (byte) 52, objArr40);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, iLastIndexOf, i48, -887667012, false, (String) objArr40[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char c3 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                int touchSlop = 2267 - (ViewConfiguration.getTouchSlop() >> 8);
                int longPressTimeout = 33 - (ViewConfiguration.getLongPressTimeout() >> 16);
                Object[] objArr41 = new Object[1];
                c((short) 210, $$a[91], (byte) 37, objArr41);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, touchSlop, longPressTimeout, -654680577, false, (String) objArr41[0], null);
            }
            Object[] objArr42 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).get(null);
            objArr5 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i49 = ((int[]) objArr42[0])[0];
            int i50 = ((int[]) objArr42[3])[0];
            String[] strArr3 = (String[]) objArr42[1];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i51 = 121412562 + (((-671088641) | iFreeMemory) * (-381)) + (((~((~iFreeMemory) | 132905567)) | (-799275100)) * 381) + 1898857952;
            int i52 = (i51 << 13) ^ i51;
            int i53 = i52 ^ (i52 >>> 17);
            ((int[]) objArr5[2])[0] = i53 ^ (i53 << 5);
            objArr4 = objArr4;
        } else {
            Context applicationContext2 = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            Object[] objArr43 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str2).getMethod(str3, Object.class).invoke(null, this)).intValue()), 0, -382843424};
            byte[] bArr4 = $$d;
            Object[] objArr44 = new Object[1];
            d((short) 333, bArr4[53], bArr4[29], objArr44);
            Class<?> cls2 = Class.forName((String) objArr44[0]);
            Object[] objArr45 = new Object[1];
            d((short) 320, bArr4[17], (byte) (bArr4[140] + 1), objArr45);
            Object[] objArr46 = (Object[]) cls2.getMethod((String) objArr45[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr43);
            if (applicationContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int packedPositionGroup = 2267 - ExpandableListView.getPackedPositionGroup(0L);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 34;
                    Object[] objArr47 = new Object[1];
                    c((short) 210, $$a[91], (byte) 37, objArr47);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(longPressTimeout2, packedPositionGroup, iIndexOf, -654680577, false, (String) objArr47[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, objArr46);
                try {
                    long jLongValue3 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i54 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2266;
                        int absoluteGravity2 = 33 - Gravity.getAbsoluteGravity(0, 0);
                        Object[] objArr48 = new Object[1];
                        c((short) 69, $$a[91], (byte) 52, objArr48);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(fadingEdgeLength, i54, absoluteGravity2, -874156483, false, (String) objArr48[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int edgeSlop2 = 2267 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 33;
                        Object[] objArr49 = new Object[1];
                        c((short) 173, $$a[91], (byte) 52, objArr49);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(scrollBarFadeDuration, edgeSlop2, iKeyCodeFromString, -887667012, false, (String) objArr49[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } else {
                objArr46 = objArr46;
                objArr4 = objArr4;
            }
            objArr5 = objArr46;
        }
        int i55 = ((int[]) objArr5[3])[0];
        int i56 = ((int[]) objArr5[0])[0];
        if (i56 == i55) {
            int i57 = b + 67;
            TuitionPaymentFragmentbindingInflater1 = i57 % 128;
            int i58 = i57 % 2;
            objArr6 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i59 = ((int[]) objArr5[2])[0];
            int i60 = ((int[]) objArr5[0])[0];
            int i61 = ((int[]) objArr5[3])[0];
            String[] strArr4 = (String[]) objArr5[1];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i62 = ~startUptimeMillis;
            int i63 = i59 + 596375563 + (((~((-75530815) | i62)) | 8389156 | (~((-733182502) | i62))) * (-1136)) + (((~((-75530815) | startUptimeMillis)) | (~((-733182502) | startUptimeMillis)) | (~(800324159 | i62))) * (-568)) + (((~(startUptimeMillis | (-8389157))) | (~(i62 | 733182501)) | (~(75530814 | i62))) * 568);
            int i64 = (i63 << 13) ^ i63;
            int i65 = i64 ^ (i64 >>> 17);
            ((int[]) objArr6[2])[0] = i65 ^ (i65 << 5);
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr5 = (String[]) objArr5[1];
            if (strArr5 != null) {
                for (String str8 : strArr5) {
                    arrayList3.add(str8);
                }
            }
            int[] iArr2 = new int[i56];
            int i66 = i56 - 1;
            iArr2[i66] = 1;
            Toast.makeText((Context) null, iArr2[((i56 * i66) % 2) - 1], 1).show();
            objArr6 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i67 = ((int[]) objArr5[2])[0];
            int i68 = ((int[]) objArr5[0])[0];
            int i69 = ((int[]) objArr5[3])[0];
            String[] strArr6 = (String[]) objArr5[1];
            int iNextInt = new Random().nextInt(936435346);
            int i70 = ~iNextInt;
            int i71 = i67 + 1883488172 + (((~((-732976285) | i70)) | (~((-75737032) | i70))) * (-867)) + (((~((-732976285) | iNextInt)) | 8389764 | (~((-75737032) | iNextInt))) * (-1734)) + (((~(iNextInt | (-67347268))) | (~(i70 | (-8389765))) | (~((-724586521) | iNextInt))) * 867);
            int i72 = (i71 << 13) ^ i71;
            int i73 = i72 ^ (i72 >>> 17);
            ((int[]) objArr6[2])[0] = i73 ^ (i73 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
            char c4 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43042);
            int i74 = 3111 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 22;
            Object[] objArr50 = new Object[1];
            c((short) 69, $$a[91], (byte) 52, objArr50);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(c4, i74, iResolveOpacity, -1272852037, false, (String) objArr50[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char c5 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43041);
                int iRed = Color.red(0) + 3111;
                int iMakeMeasureSpec = 22 - View.MeasureSpec.makeMeasureSpec(0, 0);
                Object[] objArr51 = new Object[1];
                c((short) 210, $$a[91], (byte) 37, objArr51);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c5, iRed, iMakeMeasureSpec, 154975793, false, (String) objArr51[0], null);
            }
            Object[] objArr52 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).get(null);
            int i75 = ((int[]) objArr52[2])[0];
            int i76 = ((int[]) objArr52[1])[0];
            String[] strArr7 = (String[]) objArr52[3];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i77 = 1535808974 + ((1432305874 | iElapsedRealtime) * 614);
            int i78 = ~iElapsedRealtime;
            int i79 = i77 + (((~((-422181691) | i78)) | 285818898 | (~(1282849768 | i78))) * (-1228)) + (((~(i78 | 1568668666)) | (~((-136362793) | i78))) * 614) + 1324360294;
            int i80 = (i79 << 13) ^ i79;
            int i81 = i80 ^ (i80 >>> 17);
            ((int[]) objArr7[0])[0] = i81 ^ (i81 << 5);
            objArr7 = new Object[]{new int[1], new int[]{i76}, new int[]{i75}, strArr7};
            objArr6 = objArr6;
        } else {
            Object[] objArr53 = {null, Integer.valueOf(((Integer) Class.forName(str2).getMethod(str3, Object.class).invoke(null, this)).intValue()), 0, 1324360294};
            byte[] bArr5 = $$d;
            Object[] objArr54 = new Object[1];
            d((short) 268, bArr5[389], (byte) 92, objArr54);
            Class<?> cls3 = Class.forName((String) objArr54[0]);
            Object[] objArr55 = new Object[1];
            d((short) 176, bArr5[275], bArr5[51], objArr55);
            Object[] objArr56 = (Object[]) cls3.getMethod((String) objArr55[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr53);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char cGreen = (char) (Color.green(0) + 43042);
                int iIndexOf2 = 3111 - TextUtils.indexOf("", "", 0, 0);
                int iLastIndexOf2 = 21 - TextUtils.lastIndexOf("", '0', 0, 0);
                Object[] objArr57 = new Object[1];
                c((short) 210, $$a[91], (byte) 37, objArr57);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cGreen, iIndexOf2, iLastIndexOf2, 154975793, false, (String) objArr57[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, objArr56);
            try {
                long jLongValue4 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char mode2 = (char) (43042 - View.MeasureSpec.getMode(0));
                    int iMyTid = 3111 - (Process.myTid() >> 22);
                    int iLastIndexOf3 = 21 - TextUtils.lastIndexOf("", '0', 0);
                    Object[] objArr58 = new Object[1];
                    c((short) 173, $$a[91], (byte) 52, objArr58);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(mode2, iMyTid, iLastIndexOf3, -1269618118, false, (String) objArr58[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char c6 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43041);
                    int iAlpha = Color.alpha(0) + 3111;
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 22;
                    Object[] objArr59 = new Object[1];
                    c((short) 69, $$a[91], (byte) 52, objArr59);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(c6, iAlpha, offsetAfter, -1272852037, false, (String) objArr59[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf8);
                objArr7 = objArr56;
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr7[2])[0] != ((int[]) objArr7[1])[0]) {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr8 = (String[]) objArr7[3];
            if (strArr8 != null) {
                for (String str9 : strArr8) {
                    arrayList4.add(str9);
                }
            }
            throw null;
        }
        int i82 = ((int[]) objArr7[0])[0];
        int i83 = ((int[]) objArr7[2])[0];
        int i84 = ((int[]) objArr7[1])[0];
        String[] strArr9 = (String[]) objArr7[3];
        int[] iArr3 = {i83};
        int iIdentityHashCode4 = System.identityHashCode(this);
        int i85 = (-889669558) + ((362719004 | iIdentityHashCode4) * 614);
        int i86 = ~iIdentityHashCode4;
        int i87 = i82 + i85 + (((~((-1007791648) | i86)) | 336635420 | (~(697239811 | i86))) * (-1228)) + (((~(i86 | 1033875231)) | (~((-671156228) | i86))) * 614);
        int i88 = (i87 << 13) ^ i87;
        int i89 = i88 ^ (i88 >>> 17);
        ((int[]) objArr[0])[0] = i89 ^ (i89 << 5);
        Object[] objArr60 = {new int[1], new int[]{i84}, iArr3, strArr9};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
            char c7 = (char) (53894 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int i90 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1320;
            int doubleTapTimeout = 36 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            byte[] bArr6 = $$a;
            Object[] objArr61 = new Object[1];
            c((short) 210, (byte) (bArr6[88] - 1), bArr6[7], objArr61);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c7, i90, doubleTapTimeout, -1433084963, false, (String) objArr61[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null) != -1) {
            int i91 = b + 27;
            TuitionPaymentFragmentbindingInflater1 = i91 % 128;
            int i92 = i91 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char offsetBefore = (char) (53893 - TextUtils.getOffsetBefore("", 0));
                int i93 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1319;
                int trimmedLength2 = 36 - TextUtils.getTrimmedLength("");
                Object[] objArr62 = new Object[1];
                c((short) 173, $$a[91], (byte) 52, objArr62);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(offsetBefore, i93, trimmedLength2, -1920778747, false, (String) objArr62[0], null);
            }
            Object[] objArr63 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).get(null);
            objArr8 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i94 = ((int[]) objArr63[0])[0];
            int i95 = ((int[]) objArr63[3])[0];
            String[] strArr10 = (String[]) objArr63[2];
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i96 = (-44025648) + (((~((~iIdentityHashCode5) | (-978573425))) | 307380224) * 446) + (((~(iIdentityHashCode5 | (-671193201))) | 84674176) * 446) + 1014456013;
            int i97 = (i96 << 13) ^ i96;
            int i98 = i97 ^ (i97 >>> 17);
            ((int[]) objArr8[1])[0] = i98 ^ (i98 << 5);
            objArr60 = objArr60;
        } else {
            if (context != null) {
                int i99 = b + 109;
                TuitionPaymentFragmentbindingInflater1 = i99 % 128;
                int i100 = i99 % 2;
                applicationContext = ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext();
            } else {
                applicationContext = context;
            }
            int iIntValue2 = ((Integer) Class.forName(str2).getMethod(str3, Object.class).invoke(null, this)).intValue();
            Object[] objArr64 = {-1625532971};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 47977), Color.blue(0) + 1300, 21 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr65 = {applicationContext, "com.bpjstku", 1361829581, Integer.valueOf(iIntValue2), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).newInstance(objArr64), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char scrollBarSize2 = (char) (53893 - (ViewConfiguration.getScrollBarSize() >> 8));
                int iIndexOf3 = TextUtils.indexOf("", "", 0) + 1320;
                int iIndexOf4 = 35 - TextUtils.indexOf((CharSequence) "", '0');
                Object[] objArr66 = new Object[1];
                c((short) 173, $$a[91], (byte) 52, objArr66);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(scrollBarSize2, iIndexOf3, iIndexOf4, 819724799, false, (String) objArr66[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 57878), 1394 - (ViewConfiguration.getPressedStateDuration() >> 16), ExpandableListView.getPackedPositionChild(0L) + 76), Boolean.TYPE});
            }
            Object[] objArr67 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).invoke(null, objArr65);
            if (applicationContext != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                    char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 53894);
                    int mode3 = View.MeasureSpec.getMode(0) + 1320;
                    int offsetBefore2 = 36 - TextUtils.getOffsetBefore("", 0);
                    Object[] objArr68 = new Object[1];
                    c((short) 173, $$a[91], (byte) 52, objArr68);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cIndexOf3, mode3, offsetBefore2, -1920778747, false, (String) objArr68[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, objArr67);
                try {
                    long jLongValue5 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue5);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                        char offsetAfter2 = (char) (TextUtils.getOffsetAfter("", 0) + 53893);
                        int iResolveSize = View.resolveSize(0, 0) + 1320;
                        int i101 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36;
                        Object[] objArr69 = new Object[1];
                        c((short) 210, $$a[91], (byte) 37, objArr69);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(offsetAfter2, iResolveSize, i101, -1273706634, false, (String) objArr69[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue5 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                        char cMakeMeasureSpec = (char) (53893 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        int i102 = 1320 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i103 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36;
                        byte[] bArr7 = $$a;
                        Object[] objArr70 = new Object[1];
                        c((short) 210, (byte) (bArr7[88] - 1), bArr7[7], objArr70);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cMakeMeasureSpec, i102, i103, -1433084963, false, (String) objArr70[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } else {
                objArr67 = objArr67;
                objArr60 = objArr60;
            }
            objArr8 = objArr67;
        }
        if (((int[]) objArr8[0])[0] != ((int[]) objArr8[3])[0]) {
            throw null;
        }
        Object[] objArr71 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i104 = ((int[]) objArr8[1])[0];
        int i105 = ((int[]) objArr8[0])[0];
        int i106 = ((int[]) objArr8[3])[0];
        String[] strArr11 = (String[]) objArr8[2];
        int iIdentityHashCode6 = System.identityHashCode(this);
        int i107 = ~iIdentityHashCode6;
        int i108 = i104 + 1537615656 + ((iIdentityHashCode6 | 528456) * 988) + (((~(297424730 | i107)) | 776306820) * (-1976)) + (((~(iIdentityHashCode6 | (-1073203095))) | 528456 | (~(1073203094 | i107))) * 988);
        int i109 = (i108 << 13) ^ i108;
        int i110 = i109 ^ (i109 >>> 17);
        ((int[]) objArr71[1])[0] = i110 ^ (i110 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int i111 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
            int iRgb3 = (-16777206) - Color.rgb(0, 0, 0);
            Object[] objArr72 = new Object[1];
            c((short) 210, $$a[91], (byte) 37, objArr72);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(maxKeyCode, i111, iRgb3, -1650998592, false, (String) objArr72[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).getLong(null);
        long jLongValue6 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
            char c8 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 877;
            int iIndexOf5 = 10 - TextUtils.indexOf("", "");
            Object[] objArr73 = new Object[1];
            c((short) 173, $$a[91], (byte) 52, objArr73);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(c8, modifierMetaStateMask3, iIndexOf5, 2012020043, false, (String) objArr73[0], null);
        }
        if (j == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).getLong(null) << 52) >>> 52)) >> 12)) {
            int i112 = b + 87;
            TuitionPaymentFragmentbindingInflater1 = i112 % 128;
            int i113 = i112 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                char scrollBarSize3 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int i114 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                int i115 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                Object[] objArr74 = new Object[1];
                c((short) 69, $$a[91], (byte) 52, objArr74);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(scrollBarSize3, i114, i115, 2012931276, false, (String) objArr74[0], null);
            }
            Object[] objArr75 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).get(null);
            objArr9 = new Object[]{new int[]{((int[]) objArr75[0])[0]}, new int[1], new int[]{((int[]) objArr75[2])[0]}, (String[]) objArr75[3]};
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i116 = ~iIdentityHashCode7;
            int i117 = ((((-342440027) + ((((~((-275251206) | i116)) | (~((-555161027) | iIdentityHashCode7))) | (~(1065353207 | iIdentityHashCode7))) * 765)) + (((~((-830412232) | i116)) | 275251205) * 1530)) + (((~(iIdentityHashCode7 | (-830412232))) | (~(i116 | 1065353207))) * 765)) - 1492895246;
            int i118 = (i117 << 13) ^ i117;
            int i119 = i118 ^ (i118 >>> 17);
            ((int[]) objArr9[1])[0] = i119 ^ (i119 << 5);
        } else {
            Context applicationContext3 = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            Object[] objArr76 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str2).getMethod(str3, Object.class).invoke(null, this)).intValue()), 0, -1492895246};
            byte[] bArr8 = $$d;
            Object[] objArr77 = new Object[1];
            d((short) 176, bArr8[389], (byte) 69, objArr77);
            Class<?> cls4 = Class.forName((String) objArr77[0]);
            Object[] objArr78 = new Object[1];
            d((short) 107, bArr8[17], (byte) (bArr8[140] + 1), objArr78);
            objArr9 = (Object[]) cls4.getMethod((String) objArr78[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr76);
            if (applicationContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                    char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 876;
                    int i120 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    Object[] objArr79 = new Object[1];
                    c((short) 69, $$a[91], (byte) 52, objArr79);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(touchSlop2, doubleTapTimeout2, i120, 2012931276, false, (String) objArr79[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, objArr9);
                try {
                    long jLongValue7 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue7);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int i121 = 877 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 10;
                        Object[] objArr80 = new Object[1];
                        c((short) 173, $$a[91], (byte) 52, objArr80);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(packedPositionType, i121, iNormalizeMetaState, 2012020043, false, (String) objArr80[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue7 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                        char trimmedLength3 = (char) TextUtils.getTrimmedLength(r0);
                        int scrollDefaultDelay = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
                        Object[] objArr81 = new Object[1];
                        c((short) 210, $$a[91], (byte) 37, objArr81);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(trimmedLength3, scrollDefaultDelay, keyRepeatTimeout, -1650998592, false, (String) objArr81[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            }
        }
        int i122 = ((int[]) objArr9[2])[0];
        int i123 = ((int[]) objArr9[0])[0];
        if (i123 != i122) {
            throw new RuntimeException(String.valueOf(i123));
        }
        int i124 = ((int[]) objArr9[1])[0];
        Object[] objArr82 = {new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
        int iIdentityHashCode8 = System.identityHashCode(this);
        int i125 = i124 + 1065175284 + (((~((-53488098) | (~iIdentityHashCode8))) | (~((-13177869) | iIdentityHashCode8))) * (-272)) + (((~((-187837428) | iIdentityHashCode8)) | 134349330) * (-272)) + (((~(iIdentityHashCode8 | 187837427)) | (-147527199)) * 272);
        int i126 = (i125 << 13) ^ i125;
        int i127 = i126 ^ (i126 >>> 17);
        ((int[]) objArr82[1])[0] = i127 ^ (i127 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
            char c9 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
            int scrollDefaultDelay2 = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int threadPriority = 10 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte[] bArr9 = $$a;
            Object[] objArr83 = new Object[1];
            c(bArr9[8], bArr9[88], bArr9[9], objArr83);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(c9, scrollDefaultDelay2, threadPriority, -1199417970, false, (String) objArr83[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).getLong(null);
        long jLongValue8 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
            str = "";
            char offsetBefore3 = (char) TextUtils.getOffsetBefore(str, 0);
            int i128 = 876 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iAlpha2 = Color.alpha(0) + 10;
            byte[] bArr10 = $$a;
            Object[] objArr84 = new Object[1];
            c(bArr10[0], bArr10[14], bArr10[7], objArr84);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(offsetBefore3, i128, iAlpha2, 254769921, false, (String) objArr84[0], null);
        } else {
            str = r0;
        }
        if (j2 == ((jLongValue8 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int iAxisFromString = 875 - MotionEvent.axisFromString(str);
                int i129 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte[] bArr11 = $$a;
                byte b2 = bArr11[0];
                Object[] objArr85 = new Object[1];
                c(b2, bArr11[88], b2, objArr85);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(fadingEdgeLength2, iAxisFromString, i129, 1324201839, false, (String) objArr85[0], null);
            }
            Object[] objArr86 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).get(null);
            objArr10 = new Object[]{new int[]{((int[]) objArr86[0])[0]}, new int[1], new int[]{((int[]) objArr86[2])[0]}, (String[]) objArr86[3]};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i130 = ~((-75571734) | iIdentityHashCode9);
            int i131 = ~iIdentityHashCode9;
            int i132 = ((385409029 + ((i130 | (~(652160757 | i131))) * 497)) + (((~(iIdentityHashCode9 | 652160757)) | ((~((-616899254) | i131)) | 541327520)) * 497)) - 1555735037;
            int i133 = (i132 << 13) ^ i132;
            int i134 = i133 ^ (i133 >>> 17);
            ((int[]) objArr10[1])[0] = i134 ^ (i134 << 5);
            int i135 = b + 21;
            TuitionPaymentFragmentbindingInflater1 = i135 % 128;
            int i136 = i135 % 2;
        } else {
            Object[] objArr87 = {Integer.valueOf(((Integer) Class.forName(str2).getMethod(str3, Object.class).invoke(null, this)).intValue()), -1555735037};
            byte[] bArr12 = $$d;
            Object[] objArr88 = new Object[1];
            d(bArr12[161], bArr12[51], (byte) (-bArr12[11]), objArr88);
            Class<?> cls5 = Class.forName((String) objArr88[0]);
            Object[] objArr89 = new Object[1];
            d((short) 176, bArr12[275], bArr12[51], objArr89);
            Object[] objArr90 = (Object[]) cls5.getMethod((String) objArr89[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr87);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                char size2 = (char) View.MeasureSpec.getSize(0);
                int iIndexOf6 = 875 - TextUtils.indexOf((CharSequence) str, '0');
                int trimmedLength4 = 10 - TextUtils.getTrimmedLength(str);
                byte[] bArr13 = $$a;
                byte b3 = bArr13[0];
                Object[] objArr91 = new Object[1];
                c(b3, bArr13[88], b3, objArr91);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(size2, iIndexOf6, trimmedLength4, 1324201839, false, (String) objArr91[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, objArr90);
            try {
                long jLongValue9 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                    char offsetAfter3 = (char) TextUtils.getOffsetAfter(str, 0);
                    int scrollBarSize4 = 876 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int iLastIndexOf4 = 9 - TextUtils.lastIndexOf(str, '0');
                    byte[] bArr14 = $$a;
                    Object[] objArr92 = new Object[1];
                    c(bArr14[0], bArr14[14], bArr14[7], objArr92);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(offsetAfter3, scrollBarSize4, iLastIndexOf4, 254769921, false, (String) objArr92[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue9 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iIndexOf7 = TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 877;
                    int fadingEdgeLength3 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 10;
                    byte[] bArr15 = $$a;
                    Object[] objArr93 = new Object[1];
                    c(bArr15[8], bArr15[88], bArr15[9], objArr93);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(maximumFlingVelocity, iIndexOf7, fadingEdgeLength3, -1199417970, false, (String) objArr93[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, lValueOf14);
                objArr10 = objArr90;
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        int i137 = ((int[]) objArr10[2])[0];
        int i138 = ((int[]) objArr10[0])[0];
        if (i138 == i137) {
            int i139 = ((int[]) objArr10[1])[0];
            objArr11 = new Object[]{new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
            int iIdentityHashCode10 = System.identityHashCode(this);
            int i140 = i139 + (-1703544620) + (((~(630175894 | iIdentityHashCode10)) | 40912489) * 576) + (((~((~iIdentityHashCode10) | 671088383)) | 629573634) * 576) + 2090757184;
            int i141 = (i140 << 13) ^ i140;
            int i142 = i141 ^ (i141 >>> 17);
            i3 = 0;
            ((int[]) objArr11[1])[0] = i142 ^ (i142 << 5);
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr12 = (String[]) objArr10[3];
            if (strArr12 != null) {
                for (String str10 : strArr12) {
                    arrayList5.add(str10);
                }
            }
            int[] iArr4 = new int[i138];
            int i143 = i138 - 1;
            iArr4[i143] = 1;
            Toast.makeText((Context) null, iArr4[((i138 * i143) % 2) - 1], 1).show();
            int i144 = ((int[]) objArr10[1])[0];
            objArr11 = new Object[]{new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
            int iIdentityHashCode11 = System.identityHashCode(this);
            int i145 = i144 + 1910855720 + (((~(747689297 | iIdentityHashCode11)) | 787999526) * (-366)) + (((~(iIdentityHashCode11 | 788004727)) | 747684096) * 366);
            int i146 = (i145 << 13) ^ i145;
            int i147 = i146 ^ (i146 >>> 17);
            i3 = 0;
            ((int[]) objArr11[1])[0] = i147 ^ (i147 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
            char c10 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1));
            int deadChar = 876 - KeyEvent.getDeadChar(i3, i3);
            int i148 = (ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1)) + 11;
            byte[] bArr16 = $$a;
            Object[] objArr94 = new Object[1];
            c((short) 210, (byte) (bArr16[88] - 1), bArr16[7], objArr94);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(c10, deadChar, i148, 252381699, false, (String) objArr94[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null);
        long jLongValue10 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
            char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 876;
            int i149 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
            Object[] objArr95 = new Object[1];
            c((short) 121, $$a[91], (byte) 52, objArr95);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(tapTimeout2, packedPositionGroup2, i149, 2009631821, false, (String) objArr95[0], null);
        }
        if (j3 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 1);
                int iIndexOf8 = TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 877;
                int fadingEdgeLength4 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 10;
                short s = $$a[7];
                byte b4 = (byte) s;
                Object[] objArr96 = new Object[1];
                c(s, b4, b4, objArr96);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cIndexOf4, iIndexOf8, fadingEdgeLength4, 256017550, false, (String) objArr96[0], null);
            }
            Object[] objArr97 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).get(null);
            Object[] objArr98 = {new int[]{((int[]) objArr97[0])[0]}, new int[1], new int[]{((int[]) objArr97[2])[0]}, (String[]) objArr97[3]};
            int i150 = (int) Runtime.getRuntime().totalMemory();
            int i151 = (((44368112 + (((~((-317335587) | i150)) | 272640034) * (-140))) + ((~((-44695553) | i150)) * 70)) + (((~(i150 | 357645815)) | (-129701334)) * 70)) - 2039489950;
            int i152 = (i151 << 13) ^ i151;
            int i153 = i152 ^ (i152 >>> 17);
            ((int[]) objArr98[1])[0] = i153 ^ (i153 << 5);
            objArr12 = objArr98;
            c = 2;
        } else {
            Context applicationContext4 = context != null ? (((context instanceof ContextWrapper) ^ true) || ((ContextWrapper) context).getBaseContext() != null) ? context.getApplicationContext() : null : context;
            Object[] objArr99 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str2).getMethod(str3, Object.class).invoke(null, this)).intValue()), -2039489950};
            byte[] bArr17 = $$d;
            byte b5 = bArr17[376];
            Object[] objArr100 = new Object[1];
            d(b5, bArr17[20], b5, objArr100);
            Class<?> cls6 = Class.forName((String) objArr100[0]);
            Object[] objArr101 = new Object[1];
            d((short) 176, bArr17[275], bArr17[51], objArr101);
            objArr12 = (Object[]) cls6.getMethod((String) objArr101[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr99);
            if (applicationContext4 != null) {
                int i154 = b + 71;
                TuitionPaymentFragmentbindingInflater1 = i154 % 128;
                int i155 = i154 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                    char offsetAfter4 = (char) TextUtils.getOffsetAfter(str, 0);
                    int i156 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                    int i157 = 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    short s2 = $$a[7];
                    byte b6 = (byte) s2;
                    Object[] objArr102 = new Object[1];
                    c(s2, b6, b6, objArr102);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(offsetAfter4, i156, i157, 256017550, false, (String) objArr102[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, objArr12);
                try {
                    long jLongValue11 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue11);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                        char c11 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 876;
                        int mode4 = 10 - View.MeasureSpec.getMode(0);
                        Object[] objArr103 = new Object[1];
                        c((short) 121, $$a[91], (byte) 52, objArr103);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(c11, iResolveSizeAndState, mode4, 2009631821, false, (String) objArr103[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue11 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                        char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                        int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
                        int scrollDefaultDelay4 = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte[] bArr18 = $$a;
                        Object[] objArr104 = new Object[1];
                        c((short) 210, (byte) (bArr18[88] - 1), bArr18[7], objArr104);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(bitsPerPixel2, scrollDefaultDelay3, scrollDefaultDelay4, 252381699, false, (String) objArr104[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, lValueOf16);
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            } else {
                objArr12 = objArr12;
            }
            c = 2;
        }
        int i158 = ((int[]) objArr12[c])[0];
        int i159 = ((int[]) objArr12[0])[0];
        if (i159 == i158) {
            int i160 = ((int[]) objArr12[1])[0];
            Object[] objArr105 = {new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i161 = ~iMaxMemory;
            int i162 = i160 + 907771904 + ((iMaxMemory | 873153548) * (-859)) + (((~(iMaxMemory | (-67846153))) | (~(873153548 | i161))) * 859) + (((~(832843319 | i161)) | (-900689472)) * 859);
            int i163 = (i162 << 13) ^ i162;
            int i164 = i163 ^ (i163 >>> 17);
            ((int[]) objArr105[1])[0] = i164 ^ (i164 << 5);
            objArr13 = objArr105;
            i4 = 0;
        } else {
            int[] iArr5 = new int[i159];
            int i165 = i159 - 1;
            iArr5[i165] = 1;
            Toast.makeText((Context) null, iArr5[((i159 * i165) % 2) - 1], 1).show();
            int i166 = ((int[]) objArr12[1])[0];
            Object[] objArr106 = {new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
            int iIdentityHashCode12 = System.identityHashCode(this);
            int i167 = ~iIdentityHashCode12;
            int i168 = i166 + (((2070192700 + (((~(109743971 | i167)) | (~((-150054201) | iIdentityHashCode12))) * (-370))) + ((((~(iIdentityHashCode12 | 109743971)) | (~(i167 | (-150054201)))) | 101321283) * (-370))) - 1165830954);
            int i169 = (i168 << 13) ^ i168;
            int i170 = i169 ^ (i169 >>> 17);
            i4 = 0;
            ((int[]) objArr106[1])[0] = i170 ^ (i170 << 5);
            objArr13 = objArr106;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
            char c12 = (char) (ExpandableListView.getPackedPositionForGroup(i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i4) == 0L ? 0 : -1));
            int i171 = 652 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 44;
            Object[] objArr107 = new Object[1];
            c((short) 121, $$a[91], (byte) 52, objArr107);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(c12, i171, packedPositionGroup3, -459846511, false, (String) objArr107[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).getLong(null);
        long jLongValue12 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
            char cIndexOf5 = (char) ((-1) - TextUtils.indexOf((CharSequence) str, '0'));
            int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 651;
            int mode5 = View.MeasureSpec.getMode(0) + 44;
            byte[] bArr19 = $$a;
            Object[] objArr108 = new Object[1];
            c((short) 210, (byte) (bArr19[88] - 1), bArr19[7], objArr108);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cIndexOf5, maximumFlingVelocity2, mode5, -873460649, false, (String) objArr108[0], null);
        }
        if (j4 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                char cIndexOf6 = (char) TextUtils.indexOf(str, str, 0, 0);
                int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 651;
                int minimumFlingVelocity3 = 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                Object[] objArr109 = new Object[1];
                c((short) 210, $$a[91], (byte) 37, objArr109);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cIndexOf6, iResolveOpacity2, minimumFlingVelocity3, -1595579076, false, (String) objArr109[0], null);
            }
            Object[] objArr110 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).get(null);
            objArr14 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i172 = ((int[]) objArr110[2])[0];
            int i173 = ((int[]) objArr110[0])[0];
            int iIdentityHashCode13 = System.identityHashCode(this);
            int i174 = (((((~(iIdentityHashCode13 | 950130928)) | (-946700119)) * 56) - 468175151) + (((~((~iIdentityHashCode13) | (-946700119))) | 950130928) * 56)) - 1185230243;
            int i175 = (i174 << 13) ^ i174;
            int i176 = i175 ^ (i175 >>> 17);
            i5 = 0;
            ((int[]) objArr14[3])[0] = i176 ^ (i176 << 5);
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b((char) TextUtils.getOffsetAfter(str, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1610, 26 - Color.argb(0, 0, 0, 0), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr111 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).newInstance(null), -1185230243, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int touchSlop3 = 651 - (ViewConfiguration.getTouchSlop() >> 8);
                int iAxisFromString2 = MotionEvent.axisFromString(str) + 45;
                byte[] bArr20 = $$a;
                Object[] objArr112 = new Object[1];
                c((short) 210, (byte) (bArr20[88] - 1), bArr20[7], objArr112);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cResolveSizeAndState, touchSlop3, iAxisFromString2, 2075921419, false, (String) objArr112[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 695 - Color.blue(0), 97 - ((byte) KeyEvent.getModifierMetaStateMask())), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getScrollBarSize() >> 8)), Drawable.resolveOpacity(0, 0) + 793, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 83), Integer.TYPE, Integer.TYPE});
            }
            objArr14 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).invoke(null, objArr111);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char cIndexOf7 = (char) TextUtils.indexOf(str, str, 0);
                int i177 = 652 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int iResolveSizeAndState2 = 44 - View.resolveSizeAndState(0, 0, 0);
                Object[] objArr113 = new Object[1];
                c((short) 210, $$a[91], (byte) 37, objArr113);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(cIndexOf7, i177, iResolveSizeAndState2, -1595579076, false, (String) objArr113[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, objArr14);
            try {
                long jLongValue13 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf17 = Long.valueOf(jLongValue13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                    char c13 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int iIndexOf9 = 651 - TextUtils.indexOf(str, str);
                    int i178 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43;
                    byte[] bArr21 = $$a;
                    Object[] objArr114 = new Object[1];
                    c((short) 210, (byte) (bArr21[88] - 1), bArr21[7], objArr114);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(c13, iIndexOf9, i178, -873460649, false, (String) objArr114[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, lValueOf17);
                Long lValueOf18 = Long.valueOf(jLongValue13 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    char c14 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int iResolveOpacity3 = 651 - Drawable.resolveOpacity(0, 0);
                    int iAlpha3 = Color.alpha(0) + 44;
                    Object[] objArr115 = new Object[1];
                    c((short) 121, $$a[91], (byte) 52, objArr115);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(c14, iResolveOpacity3, iAlpha3, -459846511, false, (String) objArr115[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf18);
                i5 = 0;
            } catch (Exception unused9) {
                throw new RuntimeException();
            }
        }
        int i179 = ((int[]) objArr14[i5])[i5];
        int i180 = ((int[]) objArr14[2])[i5];
        if (i180 == i179) {
            objArr15 = new Object[4];
            int[] iArr6 = new int[1];
            objArr15[i5] = iArr6;
            int[] iArr7 = new int[1];
            objArr15[2] = iArr7;
            objArr15[3] = new int[1];
            int i181 = ((int[]) objArr14[3])[i5];
            int i182 = ((int[]) objArr14[2])[i5];
            int i183 = ((int[]) objArr14[i5])[i5];
            iArr7[i5] = i182;
            iArr6[i5] = i183;
            objArr15[1] = new String[i5];
            int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
            int i184 = ~iUptimeMillis3;
            int i185 = (-1495547971) + (((~((-224573539) | i184)) | 218239072) * (-1188));
            int i186 = (~(iUptimeMillis3 | 224573538)) | 218239072;
            int i187 = ~(228004348 | i184);
            int i188 = i181 + i185 + ((i186 | i187) * 594) + (((~(224573538 | i184)) | (-234338815) | i187) * 594);
            int i189 = (i188 << 13) ^ i188;
            int i190 = i189 ^ (i189 >>> 17);
            ((int[]) objArr15[3])[0] = i190 ^ (i190 << 5);
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr13 = (String[]) objArr14[1];
            if (strArr13 != null) {
                for (String str11 : strArr13) {
                    arrayList6.add(str11);
                }
            }
            int[] iArr8 = new int[i180];
            int i191 = i180 - 1;
            iArr8[i191] = 1;
            Toast.makeText((Context) null, iArr8[((i180 * i191) % 2) - 1], 1).show();
            objArr15 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i192 = ((int[]) objArr14[3])[0];
            int i193 = ((int[]) objArr14[2])[0];
            int i194 = ((int[]) objArr14[0])[0];
            int iIdentityHashCode14 = System.identityHashCode(this);
            int i195 = i192 + ((((-1605747453) + (((-3473837) | (~iIdentityHashCode14)) * (-490))) + (((~(iIdentityHashCode14 | 969584147)) | (-973057984)) * 490)) - 35959564);
            int i196 = (i195 << 13) ^ i195;
            int i197 = i196 ^ (i196 >>> 17);
            ((int[]) objArr15[3])[0] = i197 ^ (i197 << 5);
        }
        Object[] objArr116 = objArr15;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
            char scrollBarSize5 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int tapTimeout3 = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
            int mirror2 = AndroidCharacter.getMirror('0') - '!';
            Object[] objArr117 = new Object[1];
            c((short) 69, $$a[91], (byte) 52, objArr117);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(scrollBarSize5, tapTimeout3, mirror2, 1357589585, false, (String) objArr117[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).getLong(null);
        long jLongValue14 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int iKeyCodeFromString2 = 1031 - KeyEvent.keyCodeFromString(str);
            int iMakeMeasureSpec2 = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
            Object[] objArr118 = new Object[1];
            c((short) 173, $$a[91], (byte) 52, objArr118);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(pressedStateDuration, iKeyCodeFromString2, iMakeMeasureSpec2, 1344079056, false, (String) objArr118[0], null);
        }
        if (j5 == ((jLongValue14 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                int i198 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1030;
                int absoluteGravity3 = 15 - Gravity.getAbsoluteGravity(0, 0);
                byte[] bArr22 = $$a;
                Object[] objArr119 = new Object[1];
                c((short) 210, (byte) (bArr22[88] - 1), bArr22[7], objArr119);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(deadChar2, i198, absoluteGravity3, 632103528, false, (String) objArr119[0], null);
            }
            Object[] objArr120 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).get(null);
            objArr16 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i199 = ((int[]) objArr120[3])[0];
            int i200 = ((int[]) objArr120[1])[0];
            String[] strArr14 = (String[]) objArr120[0];
            int iMyPid = Process.myPid();
            int i201 = ((((~((-6820098) | iMyPid)) * 521) - 1073777092) + (((~((~iMyPid) | (-6820098))) | 201802244) * 521)) - 1120021829;
            int i202 = (i201 << 13) ^ i201;
            int i203 = i202 ^ (i202 >>> 17);
            ((int[]) objArr16[2])[0] = i203 ^ (i203 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str2).getMethod(str3, Object.class).invoke(null, this)).intValue();
            Object[] objArr121 = {-1625532971};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 46038), Drawable.resolveOpacity(0, 0) + 1134, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr122 = {Integer.valueOf(iIntValue3), 0, -1120021829, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).newInstance(objArr121), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                int iAxisFromString3 = MotionEvent.axisFromString(str) + 1032;
                int doubleTapTimeout3 = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                Object[] objArr123 = new Object[1];
                c((short) 69, $$a[91], (byte) 52, objArr123);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(packedPositionType2, iAxisFromString3, doubleTapTimeout3, 1298546779, false, (String) objArr123[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - ((byte) KeyEvent.getModifierMetaStateMask())), 1117 - TextUtils.indexOf(str, str, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17), Boolean.TYPE});
            }
            objArr16 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).invoke(null, objArr122);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char c15 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int iLastIndexOf5 = 1030 - TextUtils.lastIndexOf(str, '0', 0, 0);
                int i204 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
                byte[] bArr23 = $$a;
                Object[] objArr124 = new Object[1];
                c((short) 210, (byte) (bArr23[88] - 1), bArr23[7], objArr124);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(c15, iLastIndexOf5, i204, 632103528, false, (String) objArr124[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArr16);
            try {
                long jLongValue15 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue15);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    char c16 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i205 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1030;
                    int i206 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                    Object[] objArr125 = new Object[1];
                    c((short) 173, $$a[91], (byte) 52, objArr125);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(c16, i205, i206, 1344079056, false, (String) objArr125[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char scrollDefaultDelay5 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 1031;
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
                    Object[] objArr126 = new Object[1];
                    c((short) 69, $$a[91], (byte) 52, objArr126);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(scrollDefaultDelay5, packedPositionType3, jumpTapTimeout, 1357589585, false, (String) objArr126[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf20);
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        int i207 = ((int[]) objArr16[1])[0];
        int i208 = ((int[]) objArr16[3])[0];
        if (i208 == i207) {
            objArr17 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i209 = ((int[]) objArr16[2])[0];
            int i210 = ((int[]) objArr16[3])[0];
            int i211 = ((int[]) objArr16[1])[0];
            String[] strArr15 = (String[]) objArr16[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i212 = ~elapsedCpuTime;
            int i213 = i209 + (-1686631363) + (((~((-10008026) | i212)) | (-234272145) | (~(10008025 | elapsedCpuTime))) * (-564)) + ((~(elapsedCpuTime | (-224788481))) * 1128) + (((~((-234272145) | i212)) | (-234796506)) * 564);
            int i214 = (i213 << 13) ^ i213;
            int i215 = i214 ^ (i214 >>> 17);
            ((int[]) objArr17[2])[0] = i215 ^ (i215 << 5);
            i6 = 0;
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr16 = (String[]) objArr16[0];
            if (strArr16 != null) {
                int i216 = TuitionPaymentFragmentbindingInflater1 + 19;
                b = i216 % 128;
                int i217 = i216 % 2;
                for (String str12 : strArr16) {
                    arrayList7.add(str12);
                }
            }
            int[] iArr9 = new int[i208];
            int i218 = i208 - 1;
            iArr9[i218] = 1;
            Toast.makeText((Context) null, iArr9[((i208 * i218) % 2) - 1], 1).show();
            objArr17 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i219 = ((int[]) objArr16[2])[0];
            int i220 = ((int[]) objArr16[3])[0];
            int i221 = ((int[]) objArr16[1])[0];
            String[] strArr17 = (String[]) objArr16[0];
            int iMyUid = Process.myUid();
            int i222 = ~iMyUid;
            int i223 = i219 + (-325303155) + (((~((-34679051) | i222)) | 278959220) * 220) + (((~(i222 | (-257255691))) | 501535860) * (-440)) + ((iMyUid | (-34679051)) * 220);
            int i224 = (i223 << 13) ^ i223;
            int i225 = i224 ^ (i224 >>> 17);
            i6 = 0;
            ((int[]) objArr17[2])[0] = i225 ^ (i225 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char threadPriority2 = (char) (((Process.getThreadPriority(i6) + 20) >> 6) + 37567);
            int offsetAfter5 = TextUtils.getOffsetAfter(str, i6) + 625;
            int i226 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13;
            byte[] bArr24 = $$a;
            Object[] objArr127 = new Object[1];
            c((short) 210, (byte) (bArr24[88] - 1), bArr24[7], objArr127);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(threadPriority2, offsetAfter5, i226, -477065106, false, (String) objArr127[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null);
        long jLongValue16 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char cIndexOf8 = (char) (TextUtils.indexOf(str, str, 0, 0) + 37567);
            int iBlue = 625 - Color.blue(0);
            int i227 = 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr128 = new Object[1];
            c((short) 69, $$a[91], (byte) 52, objArr128);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(cIndexOf8, iBlue, i227, -976899241, false, (String) objArr128[0], null);
        }
        if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char c17 = (char) (37568 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int iKeyCodeFromString3 = KeyEvent.keyCodeFromString(str) + 625;
                int iGreen = Color.green(0) + 14;
                Object[] objArr129 = new Object[1];
                c((short) 173, $$a[91], (byte) 52, objArr129);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(c17, iKeyCodeFromString3, iGreen, -973632554, false, (String) objArr129[0], null);
            }
            Object[] objArr130 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
            int i228 = ((int[]) objArr130[2])[0];
            int i229 = ((int[]) objArr130[0])[0];
            String[] strArr18 = (String[]) objArr130[3];
            int[] iArr10 = {i228};
            int iIdentityHashCode15 = System.identityHashCode(this);
            int i230 = (((~((-139337) | iIdentityHashCode15)) * 521) - 2105587200) + (((~((~iIdentityHashCode15) | (-139337))) | 1614923904) * 521) + 86788654;
            int i231 = (i230 << 13) ^ i230;
            int i232 = i231 ^ (i231 >>> 17);
            ((int[]) objArr18[1])[0] = i232 ^ (i232 << 5);
            objArr18 = new Object[]{new int[]{i229}, new int[1], iArr10, strArr18};
            context2 = context;
        } else {
            context2 = context;
            Context applicationContext5 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
            int iIntValue4 = ((Integer) Class.forName(str2).getMethod(str3, Object.class).invoke(null, this)).intValue();
            Object[] objArr131 = new Object[1];
            a(false, 123 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getEdgeSlop() >> 16) + 64, 54 - ExpandableListView.getPackedPositionChild(0L), new char[]{29, 29, 65516, 28, 28, 24, 65516, 65518, 65512, 65517, 28, 65516, 65518, 65518, 25, 28, 65518, 25, 65512, 65514, 27, 65515, 65520, 65520, 24, 65513, 65520, 65512, 65512, 65519, 24, 29, 65516, 65515, 65519, 29, 28, 65514, 65516, 24, 65511, 65519, 24, 65515, 65519, 65513, 25, 65520, 65519, 65515, 25, 25, 29, 65513, 25, 65513, 28, 29, 24, 24, 25, 29, 65517, 65520}, objArr131);
            String str13 = (String) objArr131[0];
            Object[] objArr132 = new Object[1];
            a(false, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 120, 64 - TextUtils.indexOf(str, str, 0, 0), 35 - Drawable.resolveOpacity(0, 0), new char[]{65524, 65524, 65523, 65524, 29, 65520, 65516, 65519, ' ', 28, 65517, 65517, ' ', '!', 65521, 65522, 65519, 65518, 65518, 65524, 30, 65524, 65524, 29, 65519, 65518, 65517, 30, '!', 65517, 65519, 28, 65515, 65521, '!', 30, 28, 31, 65521, 65515, 65520, 29, 65522, ' ', '!', 65515, 29, ' ', 65517, '!', 65519, 65517, 65518, 65521, 65518, 65520, 65522, '!', 65521, 29, 65519, 29, 65524, 65518}, objArr132);
            Object[] objArr133 = {applicationContext5, new String[]{str13, (String) objArr132[0]}, Integer.valueOf(iIntValue4), 17, 86788654};
            byte[] bArr25 = $$d;
            Object[] objArr134 = new Object[1];
            d(bArr25[51], bArr25[389], (byte) (bArr25[140] + 1), objArr134);
            Class<?> cls7 = Class.forName((String) objArr134[0]);
            Object[] objArr135 = new Object[1];
            d((short) 176, bArr25[275], bArr25[51], objArr135);
            Object[] objArr136 = (Object[]) cls7.getMethod((String) objArr135[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr133);
            int i233 = ((int[]) objArr136[0])[0];
            int i234 = ((int[]) objArr136[2])[0];
            if (applicationContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                    char cAxisFromString = (char) (MotionEvent.axisFromString(str) + 37568);
                    int edgeSlop3 = 625 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int i235 = 15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    Object[] objArr137 = new Object[1];
                    c((short) 173, $$a[91], (byte) 52, objArr137);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(cAxisFromString, edgeSlop3, i235, -973632554, false, (String) objArr137[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr136);
                try {
                    long jLongValue17 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char c18 = (char) (37568 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int i236 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 624;
                        int iIndexOf10 = 13 - TextUtils.indexOf((CharSequence) str, '0');
                        Object[] objArr138 = new Object[1];
                        c((short) 69, $$a[91], (byte) 52, objArr138);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(c18, i236, iIndexOf10, -976899241, false, (String) objArr138[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char gidForName = (char) (37566 - Process.getGidForName(str));
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 625;
                        int offsetAfter6 = 14 - TextUtils.getOffsetAfter(str, 0);
                        byte[] bArr26 = $$a;
                        Object[] objArr139 = new Object[1];
                        c((short) 210, (byte) (bArr26[88] - 1), bArr26[7], objArr139);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(gidForName, maximumDrawingCacheSize, offsetAfter6, -477065106, false, (String) objArr139[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                    int i237 = b + 121;
                    TuitionPaymentFragmentbindingInflater1 = i237 % 128;
                    if (i237 % 2 == 0) {
                        int i238 = 3 % 4;
                    }
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
            objArr18 = objArr136;
        }
        int i239 = ((int[]) objArr18[0])[0];
        int i240 = ((int[]) objArr18[2])[0];
        if (i240 != i239) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr19 = (String[]) objArr18[3];
            if (strArr19 != null) {
                for (String str14 : strArr19) {
                    arrayList8.add(str14);
                }
            }
            throw new RuntimeException(String.valueOf(i240));
        }
        int i241 = ((int[]) objArr18[1])[0];
        int i242 = ((int[]) objArr18[2])[0];
        int i243 = ((int[]) objArr18[0])[0];
        String[] strArr20 = (String[]) objArr18[3];
        int iIdentityHashCode16 = System.identityHashCode(this);
        int i244 = i241 + (((~((~iIdentityHashCode16) | (-1375799521))) * 130) - 2116518884) + (((~(iIdentityHashCode16 | (-1375799521))) | 9076758) * 130);
        int i245 = (i244 << 13) ^ i244;
        int i246 = i245 ^ (i245 >>> 17);
        ((int[]) objArr[1])[0] = i246 ^ (i246 << 5);
        Object[] objArr140 = {new int[]{i243}, new int[1], new int[]{i242}, strArr20};
        if (intent != null) {
            try {
                int i247 = ((int[]) objArr11[1])[0];
                int i248 = i247 * i247;
                int i249 = -(1738792612 * i247);
                int i250 = ((i248 | i249) << 1) - (i248 ^ i249);
                int i251 = -(i247 * 760259290);
                int i252 = ((i250 | i251) << 1) - (i251 ^ i250);
                int i253 = (i252 ^ 845942401) + ((845942401 & i252) << 1);
                int i254 = ((i253 >> 27) - 63) / 32;
                int i255 = (i253 - (~((i254 & 1) + (i254 | 1)))) - 1;
                int i256 = i253 >> 21;
                int i257 = ((i256 ^ (-4095)) + ((i256 & (-4095)) << 1)) / 2048;
                int i258 = -(i255 ^ ((i257 & 1) + (i257 | 1)));
                int i259 = (i258 ^ 7) + ((i258 & 7) << 1);
                int i260 = i259 >> 21;
                int i261 = ((i260 & (-4095)) + (i260 | (-4095))) / 2048;
                int i262 = 169092 / (((-(((i261 & 1) + (i261 | 1)) + 1)) & i259) * 122);
                int i263 = ((int[]) objArr17[2])[0];
                int i264 = i263 * i263;
                int i265 = -(165951930 * i263);
                int i266 = (i264 ^ i265) + ((i264 & i265) << 1);
                int i267 = -(i263 * 1039447274);
                int i268 = (i266 & i267) + (i267 | i266);
                int i269 = ((i268 | (-1563601340)) << 1) - ((-1563601340) ^ i268);
                int i270 = i269 >> 29;
                int i271 = ((i270 & (-15)) + (i270 | (-15))) / 8;
                int i272 = (i271 & 1) + (i271 | 1);
                int i273 = ((i269 | i272) << 1) - (i272 ^ i269);
                int i274 = i269 >> 27;
                int i275 = ((i274 & (-63)) + (i274 | (-63))) / 32;
                int i276 = (-(((i275 & 1) + (i275 | 1)) ^ i273)) + 5;
                int i277 = i276 >> 16;
                int i278 = ((((-131071) ^ i277) + ((i277 & (-131071)) << 1)) / 65536) + 1;
                stringExtra = intent.getStringExtra("1/4/12/21/referrer".substring(i262 + ((-1096040) / ((i276 & (-((i278 & 1) + (i278 | 1)))) * 1166))));
            } catch (Throwable th3) {
                AFLogger.afErrorLog("error in BroadcastReceiver ", th3);
                stringExtra = null;
            }
            if (stringExtra != null) {
                SharedPreferences sharedPreferencesC_ = AFa1tSDK.c_(context);
                int i279 = ((int[]) objArr71[1])[0];
                int i280 = i279 * i279;
                int i281 = -(656379063 * i279);
                int i282 = (((i280 ^ i281) + ((i280 & i281) << 1)) - (~(-(i279 * 1034428677)))) - 1676941181;
                int i283 = i282 >> 19;
                int i284 = (((i283 | (-16383)) << 1) - (i283 ^ (-16383))) / 8192;
                int i285 = (i284 & 1) + (i284 | 1);
                int i286 = (i282 ^ i285) + ((i285 & i282) << 1);
                int i287 = i282 >> 20;
                int i288 = ((i287 ^ (-8191)) + ((i287 & (-8191)) << 1)) / 4096;
                int i289 = -(((i288 & 1) + (i288 | 1)) ^ i286);
                int i290 = (i289 ^ 4) + ((i289 & 4) << 1);
                int i291 = (((i290 >> 15) - 262143) / 131072) + 1;
                if (sharedPreferencesC_.getString("18;4;17;9;referrer".substring(28000 / (((-((i291 & 1) + (i291 | 1))) & i290) * TypedValues.TransitionType.TYPE_DURATION)), null) != null) {
                    int i292 = ((int[]) objArr60[0])[0];
                    int i293 = i292 * i292;
                    int i294 = -(675587804 * i292);
                    int i295 = (i293 ^ i294) + ((i293 & i294) << 1);
                    int i296 = -(i292 * (-364459986));
                    int i297 = (i295 & i296) + (i296 | i295);
                    int i298 = (i297 & (-884905191)) + ((-884905191) | i297);
                    int i299 = i298 >> 17;
                    int i300 = (((((-65535) | i299) << 1) - (i299 ^ (-65535))) / 32768) + 1;
                    int i301 = (i298 & i300) + (i300 | i298);
                    int i302 = i298 >> 29;
                    int i303 = (((i302 | (-15)) << 1) - (i302 ^ (-15))) / 8;
                    int i304 = (-(i301 ^ (((i303 | 1) << 1) - (i303 ^ 1)))) + 8;
                    int i305 = i304 >> 15;
                    int i306 = ((((-262143) | i305) << 1) - (i305 ^ (-262143))) / 131072;
                    int i307 = (i306 & 1) + (i306 | 1);
                    ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0 / ((i304 & (-(((i307 | 1) << 1) - (i307 ^ 1)))) * 819)], -631580017, 631580017, (int) System.currentTimeMillis())).getMediationNetwork(context2, stringExtra);
                    return;
                }
            }
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            int i308 = ((int[]) objArr6[2])[0];
            int i309 = i308 * i308;
            int i310 = -(165042251 * i308);
            int i311 = ((i309 | i310) << 1) - (i309 ^ i310);
            int i312 = -(i308 * (-732180137));
            int i313 = (((i311 | i312) << 1) - (i312 ^ i311)) - (-1350783649);
            int i314 = ((i313 >> 21) - 4095) / 2048;
            int i315 = (i314 ^ 1) + ((i314 & 1) << 1);
            int i316 = (i313 ^ i315) + ((i315 & i313) << 1);
            int i317 = ((i313 >> 23) - 1023) / 512;
            int i318 = (-(i316 ^ ((i317 ^ 1) + ((i317 & 1) << 1)))) + 4;
            int i319 = i318 >> 16;
            int i320 = (((-131071) ^ i319) + ((i319 & (-131071)) << 1)) / 65536;
            int i321 = (i320 ^ 1) + ((i320 & 1) << 1);
            String string = appsFlyerProperties.getString("26/referrer_timestamp".substring(1392 / ((i318 & (-((i321 & 1) + (i321 | 1)))) * 116)));
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (string != null) {
                long j7 = jCurrentTimeMillis - Long.parseLong(string);
                int i322 = ((int[]) objArr2[0])[0];
                int i323 = i322 * i322;
                int i324 = -(116004856 * i322);
                int i325 = (((i323 & i324) + (i323 | i324)) - (~(-(i322 * (-432811520))))) - 1;
                int i326 = (i325 ^ 33642512) + ((33642512 & i325) << 1);
                int i327 = ((i326 >> 29) - 15) / 8;
                int i328 = (i326 - (~((i327 & 1) + (i327 | 1)))) - 1;
                int i329 = i326 >> 25;
                int i330 = ((i329 & (-255)) + (i329 | (-255))) / 128;
                int i331 = -(i328 ^ ((i330 & 1) + (i330 | 1)));
                int i332 = ((i331 | 3) << 1) - (i331 ^ 3);
                int i333 = ((i332 >> 20) - 8191) / 4096;
                int i334 = 888675 / (((-(((i333 ^ 1) + ((i333 & 1) << 1)) + 1)) & i332) * TypedValues.CycleType.TYPE_WAVE_PHASE);
                int i335 = ((int[]) objArr13[1])[0];
                int i336 = ((i335 * i335) - (~(-(330667934 * i335)))) - 1;
                int i337 = -(i335 * 789420402);
                int i338 = (i336 ^ i337) + ((i337 & i336) << 1);
                int i339 = (i338 & 32622656) + (32622656 | i338);
                int i340 = i339 >> 29;
                int i341 = (((i340 | (-15)) << 1) - (i340 ^ (-15))) / 8;
                int i342 = (i341 ^ 1) + ((i341 & 1) << 1);
                int i343 = ((i339 | i342) << 1) - (i342 ^ i339);
                int i344 = i339 >> 25;
                int i345 = (((i344 | (-255)) << 1) - (i344 ^ (-255))) / 128;
                int i346 = (-((((i345 | 1) << 1) - (i345 ^ 1)) ^ i343)) + 9;
                int i347 = ((i346 >> 24) - 511) / 256;
                if (j7 < ((long) (i334 + ((-2176758) / ((i346 & (-(((i347 & 1) + (i347 | 1)) + 1))) * 1457)))) + 1469) {
                    return;
                }
            }
            int i348 = ((int[]) objArr82[1])[0];
            int i349 = i348 * i348;
            int i350 = -(629877512 * i348);
            int i351 = ((i349 | i350) << 1) - (i349 ^ i350);
            int i352 = -(i348 * (-346651374));
            int i353 = (i351 ^ i352) + ((i352 & i351) << 1);
            int i354 = (i353 ^ (-1850347351)) + (((-1850347351) & i353) << 1);
            int i355 = i354 >> 16;
            int i356 = (((-131071) ^ i355) + ((i355 & (-131071)) << 1)) / 65536;
            int i357 = (i356 & 1) + (i356 | 1);
            int i358 = ((i354 | i357) << 1) - (i357 ^ i354);
            int i359 = i354 >> 26;
            int i360 = -(i358 ^ ((((i359 ^ ComposerKt.defaultsKey) + ((i359 & ComposerKt.defaultsKey) << 1)) / 64) + 1));
            int i361 = (i360 & 7) + (i360 | 7);
            int i362 = ((i361 >> 22) - 2047) / 1024;
            int i363 = (i362 & 1) + (i362 | 1);
            AFLogger.afInfoLog("20\\6\\13\\13\\21\\SingleInstallBroadcastReceiver called".substring(89474 / (((-((i363 ^ 1) + ((i363 & 1) << 1))) & i361) * 913)));
            int i364 = ((int[]) objArr4[3])[0];
            int i365 = ((((i364 * i364) - (~(-(2003031918 * i364)))) - 1) - (~(-(i364 * (-318446688))))) - 586982096;
            int i366 = (i365 - (~((((i365 >> 26) + ComposerKt.defaultsKey) / 64) + 1))) - 1;
            int i367 = i365 >> 15;
            int i368 = (((-262143) & i367) + (i367 | (-262143))) / 131072;
            int i369 = -(i366 ^ ((i368 & 1) + (i368 | 1)));
            int i370 = (i369 & 5) + (i369 | 5);
            int i371 = i370 >> 23;
            int i372 = (((i371 | (-1023)) << 1) - (i371 ^ (-1023))) / 512;
            Object[] objArr141 = new Object[0 / (((-(((i372 ^ 1) + ((i372 & 1) << 1)) + 1)) & i370) * 541)];
            int i373 = ((int[]) objArr140[1])[0];
            int i374 = i373 * i373;
            int i375 = -(945075486 * i373);
            int i376 = (i374 ^ i375) + ((i374 & i375) << 1);
            int i377 = -(i373 * (-1389829576));
            int i378 = ((i376 ^ i377) + ((i377 & i376) << 1)) - (-1071424569);
            int i379 = i378 >> 17;
            int i380 = (((-65535) ^ i379) + ((i379 & (-65535)) << 1)) / 32768;
            int i381 = ((i380 | 1) << 1) - (i380 ^ 1);
            int i382 = ((i378 | i381) << 1) - (i381 ^ i378);
            int i383 = i378 >> 23;
            int i384 = (-(i382 ^ ((((i383 ^ (-1023)) + ((i383 & (-1023)) << 1)) / 512) + 1))) + 5;
            int i385 = ((i384 >> 28) - 31) / 16;
            int i386 = (i385 ^ 1) + ((i385 & 1) << 1);
            ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(objArr141, ((-1557047060) / ((i384 & (-((i386 ^ 1) + ((i386 & 1) << 1)))) * 2)) - 475875311, 631580017, (int) System.currentTimeMillis())).b_(context2, intent);
            AppsFlyerProperties appsFlyerProperties2 = AppsFlyerProperties.getInstance();
            int i387 = ((int[]) objArr116[3])[0];
            int i388 = i387 * i387;
            int i389 = -(1544772930 * i387);
            int i390 = (i388 ^ i389) + ((i388 & i389) << 1);
            int i391 = -(i387 * (-894249972));
            int i392 = (i390 & i391) + (i391 | i390);
            int i393 = (i392 & (-578175759)) + ((-578175759) | i392);
            int i394 = i393 >> 19;
            int i395 = ((i394 & (-16383)) + (i394 | (-16383))) / 8192;
            int i396 = ((i395 | 1) << 1) - (i395 ^ 1);
            int i397 = ((i393 | i396) << 1) - (i396 ^ i393);
            int i398 = i393 >> 18;
            int i399 = -(i397 ^ ((((i398 & (-32767)) + (i398 | (-32767))) / 16384) + 1));
            int i400 = (i399 & 5) + (i399 | 5);
            int i401 = i400 >> 24;
            int i402 = (((i401 | (-511)) << 1) - (i401 ^ (-511))) / 256;
            int i403 = (i402 & 1) + (i402 | 1);
            appsFlyerProperties2.set("18\\5\\15\\referrer_timestamp".substring(60320 / (((-((i403 & 1) + (i403 | 1))) & i400) * 1508)), String.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, int r6, short r7) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r7 = r7 + 119
            byte[] r0 = com.appsflyer.SingleInstallBroadcastReceiver.$$c
            int r5 = r5 * 2
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L20:
            r4 = r0[r6]
            int r3 = r3 + 1
        L24:
            int r4 = -r4
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.SingleInstallBroadcastReceiver.$$g(short, int, short):java.lang.String");
    }
}
