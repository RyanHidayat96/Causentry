package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class setUsingExifOrientation implements mapPoint {
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {42, -104, -68, 105};
    private static final int $$f = 191;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {88, 99, -94, -58, 20, 6, -55, 69, 12, 14, 6, -3, 9, 10, 1, 25, 7, 8, -11, -43, 59, 26, 14, -3, -3, -45, 27, 58, 14, -3, -3, -8, 26, 21, 12, -9, 21, -70, 21, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -58};
    private static final int $$e = 143;
    private static final byte[] $$a = {110, -73, -111, 99, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 68;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = -83722411;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r7 = r7 + 1
            byte[] r0 = defpackage.setUsingExifOrientation.$$a
            int r9 = r9 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2b
        L13:
            r3 = r2
        L14:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = -r8
            int r9 = r9 + r8
            int r8 = r9 + (-10)
            r9 = r3
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setUsingExifOrientation.a(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 15
            int r8 = r8 + 84
            int r6 = r6 * 17
            int r6 = 53 - r6
            int r7 = r7 * 35
            int r7 = 38 - r7
            byte[] r0 = defpackage.setUsingExifOrientation.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            int r7 = r7 + 1
            r1[r3] = r5
            if (r4 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r7]
        L2b:
            int r8 = r8 + r3
            int r8 = r8 + (-8)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setUsingExifOrientation.c(int, int, int, java.lang.Object[]):void");
    }

    public setUsingExifOrientation(String str) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
    }

    private static void b(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $11 + 19;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 3290 - TextUtils.lastIndexOf("", '0', 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32, 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 651 - Color.blue(0), 44 - TextUtils.getCapsMode("", 0, 0), -450685997, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
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
            int i8 = $11 + 65;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $11 + 79;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.red(0), AndroidCharacter.getMirror('0') + 603, 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -450685997, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final String toString() throws Throwable {
        char c;
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 31534);
            int iIndexOf = 920 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28;
            byte[] bArr = $$a;
            byte b = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b, b, bArr[37], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, iIndexOf, maximumDrawingCacheSize, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(false, 153 - ((byte) KeyEvent.getModifierMetaStateMask()), 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2 - Drawable.resolveOpacity(0, 0), new char[]{0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f'}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(false, 158 - Gravity.getAbsoluteGravity(0, 0), 14 - ((byte) KeyEvent.getModifierMetaStateMask()), 4 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r'}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0'));
            int i2 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 920;
            int jumpTapTimeout = 28 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) 52, bArr2[7], bArr2[37], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i2, jumpTapTimeout, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
                int iIndexOf2 = 921 - TextUtils.indexOf("", "");
                int iMyPid = (Process.myPid() >> 22) + 28;
                byte[] bArr3 = $$a;
                byte b2 = (byte) (bArr3[17] + 1);
                byte b3 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b2, b3, (byte) (b3 | 50), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, iIndexOf2, iMyPid, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            c = 4;
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i5 = (((((~((-1211638284) | elapsedCpuTime)) | 3216) * 449) - 1088518096) + (((~((~elapsedCpuTime) | (-1211638284))) | 3216) * 449)) - 451873680;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            c = 4;
            Object[] objArr8 = new Object[1];
            b(false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 154, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25, 18 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(false, 161 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, ';' - AndroidCharacter.getMirror('0'), new char[]{65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n'}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                if (i8 % 2 == 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            b(true, Color.alpha(0) + 153, 16 - ((Process.getThreadPriority(0) + 20) >> 6), 5 - View.MeasureSpec.getMode(0), new char[]{65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n'}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b(false, 156 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 16 - TextUtils.indexOf("", ""), View.resolveSize(0, 0) + 10, new char[]{14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -451873680};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[14];
                byte b5 = b4;
                Object[] objArr13 = new Object[1];
                c(b4, b5, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[49];
                byte b7 = b6;
                Object[] objArr14 = new Object[1];
                c(b6, b7, b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cBlue = (char) (Color.blue(0) + 31533);
                    int iIndexOf3 = 920 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte[] bArr5 = $$a;
                    byte b8 = (byte) (bArr5[17] + 1);
                    byte b9 = bArr5[7];
                    Object[] objArr16 = new Object[1];
                    a(b8, b9, (byte) (b9 | 50), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, iIndexOf3, tapTimeout, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    b(false, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 153, 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f'}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    b(false, TextUtils.indexOf("", "", 0) + 158, Color.blue(0) + 15, (ViewConfiguration.getPressedStateDuration() >> 16) + 3, new char[]{2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r'}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                        int jumpTapTimeout2 = 921 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i9 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27;
                        byte[] bArr6 = $$a;
                        Object[] objArr19 = new Object[1];
                        a((byte) 52, bArr6[7], bArr6[37], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, jumpTapTimeout2, i9, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31533);
                        int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
                        int threadPriority = 28 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte[] bArr7 = $$a;
                        byte b10 = bArr7[80];
                        Object[] objArr20 = new Object[1];
                        a(b10, b10, bArr7[37], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iResolveOpacity, threadPriority, -1048449946, false, (String) objArr20[0], null);
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
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[3])[0];
        if (i11 == i10) {
            Object[] objArr21 = new Object[5];
            objArr21[0] = new int[1];
            objArr21[1] = new int[]{i};
            objArr21[3] = new int[]{i};
            int i12 = ((int[]) objArr[0])[0];
            int i13 = ((int[]) objArr[3])[0];
            int i14 = ((int[]) objArr[1])[0];
            String[] strArr = (String[]) objArr[c];
            Object[] objArr22 = (Object[]) objArr[2];
            objArr21[c] = strArr;
            objArr21[2] = objArr22;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i15 = ~iFreeMemory;
            int i16 = (~((-387105168) | i15)) | 302153996;
            int i17 = ~(iFreeMemory | 1471925647);
            int i18 = i12 + (-1163437021) + ((i16 | i17) * (-502)) + ((i17 | (~(i15 | (-84951172)))) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr21[0])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[c];
            if (strArr2 != null) {
                int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                int i22 = i21 % 2;
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i11];
            int i23 = i11 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i23) % 2) - 1], 1).show();
            Object[] objArr23 = new Object[5];
            objArr23[0] = new int[1];
            objArr23[1] = new int[]{i};
            objArr23[3] = new int[]{i};
            int i24 = ((int[]) objArr[0])[0];
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[c];
            Object[] objArr24 = (Object[]) objArr[2];
            objArr23[c] = strArr3;
            objArr23[2] = objArr24;
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i27 = i24 + (((828708792 + (((~((-29429441) | elapsedCpuTime2)) | (~(1744650203 | elapsedCpuTime2))) * 69)) + (((~(elapsedCpuTime2 | 1640841169)) | ((~((-133238475) | elapsedCpuTime2)) | 103809034)) * (-69))) - 481740395);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr23[0])[0] = i29 ^ (i29 << 5);
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((defpackage.setUsingExifOrientation) r6).TuitionPaymentFragmentspecialinlinedviewModeldefault3) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.setUsingExifOrientation.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r2 = r1 + 35
            int r3 = r2 % 128
            defpackage.setUsingExifOrientation.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r3
            int r2 = r2 % r0
            r2 = 0
            r3 = 1
            if (r5 == r6) goto L42
            int r1 = r1 + 115
            int r4 = r1 % 128
            defpackage.setUsingExifOrientation.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L3b
            boolean r1 = r6 instanceof defpackage.setUsingExifOrientation
            r1 = r1 ^ r3
            if (r1 == r3) goto L31
            int r4 = r4 + 107
            int r1 = r4 % 128
            defpackage.setUsingExifOrientation.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1
            int r4 = r4 % r0
            setUsingExifOrientation r6 = (defpackage.setUsingExifOrientation) r6
            java.lang.String r1 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            java.lang.String r6 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L42
        L31:
            int r6 = defpackage.setUsingExifOrientation.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r6 = r6 + 59
            int r1 = r6 % 128
            defpackage.setUsingExifOrientation.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1
            int r6 = r6 % r0
            return r2
        L3b:
            boolean r6 = r6 instanceof defpackage.setUsingExifOrientation
            r6 = 0
            r6.hashCode()
            throw r6
        L42:
            int r6 = defpackage.setUsingExifOrientation.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r6 = r6 + 19
            int r1 = r6 % 128
            defpackage.setUsingExifOrientation.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L50
            r6 = 82
            int r6 = r6 / r2
        L50:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setUsingExifOrientation.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 2 % 2;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (str == null) {
            return 0;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = str.hashCode();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
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
    private static java.lang.String $$g(byte r6, short r7, short r8) {
        /*
            int r8 = 120 - r8
            byte[] r0 = defpackage.setUsingExifOrientation.$$c
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
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
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setUsingExifOrientation.$$g(byte, short, short):java.lang.String");
    }
}
