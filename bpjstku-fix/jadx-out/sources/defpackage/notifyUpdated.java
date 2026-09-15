package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes5.dex */
public final class notifyUpdated {
    private static final byte[] $$c = {48, -110, 22, 55};
    private static final int $$f = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {87, -91, 60, 112, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 59, 0, -15, -5, 16, -14, 3, -4, -67, 73, -3, -5};
    private static final int $$e = 222;
    private static final byte[] $$a = {Base64.padSymbol, -108, 49, -100, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 168;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722241;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.notifyUpdated.$$a
            int r7 = r7 * 52
            int r1 = 53 - r7
            int r8 = r8 + 4
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2e:
            int r8 = r8 + r6
            int r6 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.notifyUpdated.a(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 34
            int r7 = r7 + 4
            int r6 = r6 * 34
            int r0 = 35 - r6
            byte[] r1 = defpackage.notifyUpdated.$$d
            int r8 = r8 + 98
            byte[] r0 = new byte[r0]
            int r6 = 34 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r7
            int r7 = r3 + 3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.notifyUpdated.c(short, byte, byte, java.lang.Object[]):void");
    }

    private static void b(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $10 + 55;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3292, 31 - TextUtils.indexOf("", "", 0), 1199271174, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getTrimmedLength(""), (-16776565) - Color.rgb(0, 0, 0), TextUtils.getCapsMode("", 0, 0) + 44, -450685997, false, $$g(b3, b4, (byte) (-b4)), new Class[]{Object.class, Object.class});
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
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            int i8 = $10 + 119;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        if (z) {
            int i10 = $10 + 35;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), 650 - TextUtils.indexOf((CharSequence) "", '0'), 44 - (ViewConfiguration.getLongPressTimeout() >> 16), -450685997, false, $$g(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final StringBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2(notifyState notifystate) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        setViewPort setviewport = notifystate.RemoteActionCompatParcelizer;
        setViewPort setviewport2 = notifystate.onTransact;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSizeAndState = (char) (37567 - View.resolveSizeAndState(0, 0, 0));
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 625;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 15;
            byte[] bArr = $$a;
            byte b = bArr[7];
            byte b2 = bArr[5];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (-b2), b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, doubleTapTimeout, iLastIndexOf, -477065106, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        b(true, 257 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, 13 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b(false, (ViewConfiguration.getTouchSlop() >> 8) + 260, Process.getGidForName("") + 16, (Process.myTid() >> 22) + 12, new char[]{'\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionGroup = (char) (37567 - ExpandableListView.getPackedPositionGroup(0L));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 626;
            int maxKeyCode = 14 - (KeyEvent.getMaxKeyCode() >> 16);
            byte[] bArr2 = $$a;
            byte b3 = bArr2[5];
            Object[] objArr6 = new Object[1];
            a((byte) (-b3), bArr2[7], b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup, iIndexOf, maxKeyCode, -976899241, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSize = (char) (37567 - View.resolveSize(0, 0));
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 625;
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 14;
                byte[] bArr3 = $$a;
                byte b4 = (byte) (-bArr3[5]);
                byte b5 = bArr3[7];
                Object[] objArr7 = new Object[1];
                a(b4, b5, (byte) (b5 | 51), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, keyRepeatDelay, edgeSlop, -973632554, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr8[2])[0];
            int i7 = ((int[]) objArr8[0])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i7};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i8 = ~startElapsedRealtime;
            int i9 = (((1612430296 + (((~(1605631998 | i8)) | 218106122) * 220)) + (((~(i8 | 1605400846)) | 218337274) * (-440))) + ((startElapsedRealtime | 1605631998) * 220)) - 336098823;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i6}, strArr};
        } else {
            Object[] objArr9 = new Object[1];
            b(false, (ViewConfiguration.getLongPressTimeout() >> 16) + 256, 26 - (ViewConfiguration.getEdgeSlop() >> 16), View.resolveSize(0, 0) + 10, new char[]{19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            b(false, KeyEvent.getDeadChar(0, 0) + 263, TextUtils.indexOf((CharSequence) "", '0') + 19, 14 - TextUtils.getOffsetBefore("", 0), new char[]{65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b'}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            b(false, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 255, (ViewConfiguration.getWindowTouchSlop() >> 8) + 16, 2 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            b(true, (Process.myPid() >> 22) + 259, 16 - KeyEvent.keyCodeFromString(""), View.combineMeasuredStates(0, 0) + 9, new char[]{65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531}, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr13 = new Object[1];
            b(false, 230 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 63 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Gravity.getAbsoluteGravity(0, 0) + 37, new char[]{65512, 65514, 27, 65515, 65520, 65520, 24, 65513, 65520, 65512, 65512, 65519, 24, 29, 65516, 65515, 65519, 29, 28, 65514, 65516, 24, 65511, 65519, 24, 65515, 65519, 65513, 25, 65520, 65519, 65515, 25, 25, 29, 65513, 25, 65513, 28, 29, 24, 24, 25, 29, 65517, 65520, 29, 29, 65516, 28, 28, 24, 65516, 65518, 65512, 65517, 28, 65516, 65518, 65518, 25, 28, 65518, 25}, objArr13);
            String str = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            b(true, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 226, Drawable.resolveOpacity(0, 0) + 64, MotionEvent.axisFromString("") + 63, new char[]{65515, 28, 65519, 65517, '!', 30, 65517, 65518, 65519, 29, 65524, 65524, 30, 65524, 65518, 65518, 65519, 65522, 65521, '!', ' ', 65517, 65517, 28, ' ', 65519, 65516, 65520, 29, 65524, 65523, 65524, 65524, 65518, 65524, 29, 65519, 29, 65521, '!', 65522, 65520, 65518, 65521, 65518, 65517, 65519, '!', 65517, ' ', 29, 65515, '!', ' ', 65522, 29, 65520, 65515, 65521, 31, 28, 30, '!', 65521}, objArr14);
            try {
                Object[] objArr15 = {applicationContext, new String[]{str, (String) objArr14[0]}, Integer.valueOf(iIntValue), 17, -336098823};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[27];
                byte b7 = b6;
                Object[] objArr16 = new Object[1];
                c(b6, b7, (byte) (b7 + 1), objArr16);
                Class<?> cls4 = Class.forName((String) objArr16[0]);
                byte b8 = (byte) (bArr4[11] - 1);
                Object[] objArr17 = new Object[1];
                c(b8, b8, bArr4[27], objArr17);
                objArr = (Object[]) cls4.getMethod((String) objArr17[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr15);
                int i12 = ((int[]) objArr[0])[0];
                int i13 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 37567);
                        int iIndexOf2 = 625 - TextUtils.indexOf("", "", 0, 0);
                        int i14 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13;
                        byte[] bArr5 = $$a;
                        byte b9 = (byte) (-bArr5[5]);
                        byte b10 = bArr5[7];
                        Object[] objArr18 = new Object[1];
                        a(b9, b10, (byte) (b10 | 51), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, iIndexOf2, i14, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr19 = new Object[1];
                        b(true, AndroidCharacter.getMirror('0') + 208, 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 13 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16}, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        b(false, 260 - TextUtils.getTrimmedLength(""), 15 - (ViewConfiguration.getWindowTouchSlop() >> 8), 12 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{'\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530}, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0'));
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 626;
                            int mode = View.MeasureSpec.getMode(0) + 14;
                            byte[] bArr6 = $$a;
                            byte b11 = bArr6[5];
                            Object[] objArr21 = new Object[1];
                            a((byte) (-b11), bArr6[7], b11, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, packedPositionChild, mode, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char absoluteGravity = (char) (37567 - Gravity.getAbsoluteGravity(0, 0));
                            int iIndexOf3 = TextUtils.indexOf("", "", 0) + 625;
                            int iArgb = Color.argb(0, 0, 0, 0) + 14;
                            byte[] bArr7 = $$a;
                            byte b12 = bArr7[7];
                            byte b13 = bArr7[5];
                            Object[] objArr22 = new Object[1];
                            a(b12, (byte) (-b13), b13, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(absoluteGravity, iIndexOf3, iArgb, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i15 = ((int[]) objArr[0])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 == i15) {
            int i17 = TuitionPaymentFragmentbindingInflater1 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((int[]) objArr[1])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i20};
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i22 = i19 + (-2122724920) + (((~(93277707 | startElapsedRealtime2)) | (-1739587328) | (~(1730460413 | startElapsedRealtime2))) * (-744)) + (((~startElapsedRealtime2) | 84150793) * 744) + ((startElapsedRealtime2 | 1739587327) * 744);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr2[1])[0] = i24 ^ (i24 << 5);
            objArr2 = new Object[]{new int[]{i21}, new int[1], iArr2, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i25 = 0;
                while (i25 < strArr3.length) {
                    int i26 = TuitionPaymentFragmentbindingInflater1 + 31;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                    if (i26 % 2 != 0) {
                        arrayList.add(strArr3[i25]);
                        i25 += 75;
                    } else {
                        arrayList.add(strArr3[i25]);
                        i25++;
                    }
                }
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            int i27 = ((int[]) objArr[1])[0];
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[0])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr3 = {i28};
            int[] iArr4 = {i29};
            int iIdentityHashCode = System.identityHashCode(this);
            int i30 = (-1265034092) + (((~((-387024322) | iIdentityHashCode)) | (-1436713800)) * (-318));
            int i31 = ~((-1436713800) | iIdentityHashCode);
            int i32 = ~iIdentityHashCode;
            int i33 = i27 + i30 + ((i31 | (~(1471383495 | i32))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode | 1471383495)) | (~((-1084359175) | i32))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr2[1])[0] = i35 ^ (i35 << 5);
            objArr2 = new Object[]{iArr4, new int[1], iArr3, strArr4};
        }
        StringBuilder sb = new StringBuilder();
        sb.append("et=");
        sb.append(notifystate.TuitionPaymentFragmentspecialinlinedviewModeldefault2().protocolId);
        if (notifystate.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            sb.append("&na=");
            sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(notifystate.asBinder));
            int i36 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
            TuitionPaymentFragmentbindingInflater1 = i36 % 128;
            int i37 = i36 % 2;
        }
        sb.append("&it=");
        sb.append(Thread.currentThread().getId());
        sb.append("&ca=");
        sb.append(notifystate.asInterface);
        sb.append("&pa=");
        sb.append(notifystate.a());
        sb.append("&s0=");
        sb.append(setviewport.b);
        sb.append("&t0=");
        sb.append(setviewport.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append("&s1=");
        sb.append(setviewport2.b);
        sb.append("&t1=");
        sb.append(setviewport2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i38 = ((int[]) objArr2[1])[0];
        int i39 = i38 * i38;
        int i40 = -(945439987 * i38);
        int i41 = (i39 & i40) + (i39 | i40);
        int i42 = -(i38 * 1733692963);
        int i43 = (i41 & i42) + (i42 | i41);
        int i44 = (i43 ^ (-347221639)) + (((-347221639) & i43) << 1);
        int i45 = i44 >> 17;
        int i46 = (((-65535) ^ i45) + ((i45 & (-65535)) << 1)) / 32768;
        int i47 = ((i46 | 1) << 1) - (i46 ^ 1);
        int i48 = ((i44 | i47) << 1) - (i47 ^ i44);
        int i49 = i44 >> 19;
        int i50 = -(i48 ^ ((((i49 & (-16383)) + (i49 | (-16383))) / 8192) + 1));
        int i51 = (i50 ^ 2) + ((i50 & 2) << 1);
        int i52 = i51 >> 15;
        int i53 = ((((-262143) & i52) + (i52 | (-262143))) / 131072) + 1;
        sb.append("8;&fw=".substring(3672 / (((-(((i53 | 1) << 1) - (i53 ^ 1))) & i51) * 918)));
        sb.append(notifystate.INotificationSideChannelStub ? "1" : "0");
        return sb;
    }

    private static String $$g(byte b, byte b2, short s) {
        byte[] bArr = $$c;
        int i = 120 - b2;
        int i2 = b * 3;
        int i3 = s + 4;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i += -i4;
        }
        while (true) {
            i3++;
            i5++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i += -bArr[i3];
        }
    }
}
