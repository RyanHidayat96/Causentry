package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ReportDrawnKtExternalSyntheticLambda4 {
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public String b;
    private static final byte[] $$c = {8, -36, 87, -65};
    private static final int $$d = 178;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {88, 99, -94, -58, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 126;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int[] TuitionPaymentFragmentbindingInflater1 = {835993201, -493757729, 1999266620, -1488840144, 1857796026, -136743422, -453473751, 294387026, 1006476857, -1340271261, 2090451802, 1675786308, -938755894, -1404029860, -1563772129, 1698946518, -2119157164, -551237010};

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 53 - r7
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r0 = defpackage.ReportDrawnKtExternalSyntheticLambda4.$$a
            int r6 = r6 * 52
            int r6 = 55 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ReportDrawnKtExternalSyntheticLambda4.a(short, int, int, java.lang.Object[]):void");
    }

    public ReportDrawnKtExternalSyntheticLambda4(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.b = str2;
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentbindingInflater1;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $10 + 77;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 1;
                        byte b2 = (byte) (b - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 3339 - AndroidCharacter.getMirror('0'), 31 - View.resolveSize(0, 0), 1948206109, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i9++;
                    i4 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
        if (iArr5 != null) {
            int i10 = $10 + 33;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $10 + 27;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    Object[] objArr3 = new Object[i5];
                    objArr3[i6] = Integer.valueOf(iArr5[i12]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3291;
                        int deadChar = KeyEvent.getDeadChar(i6, i6) + 31;
                        byte b3 = (byte) i5;
                        byte b4 = (byte) (b3 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, doubleTapTimeout, deadChar, 1948206109, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                } else {
                    length3 = length3;
                    Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 1;
                        byte b6 = (byte) (b5 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.keyCodeFromString(""), 3291 - (Process.myTid() >> 22), TextUtils.getOffsetAfter("", 0) + 31, 1948206109, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    i12++;
                    iArr5 = iArr5;
                }
                length3 = length3;
                i5 = 1;
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i14 = $10 + 57;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i16 = 17;
            for (int i17 = 1; i16 > i17; i17 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Color.red(0), Process.getGidForName("") + 2560, 30 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 683220507, false, $$e(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i16--;
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (View.MeasureSpec.getSize(0) + 28879), ImageFormat.getBitsPerPixel(0) + 349, (ViewConfiguration.getLongPressTimeout() >> 16) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final int hashCode() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        char c;
        int i = 2 % 2;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int i2 = 652 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int iRgb = Color.rgb(0, 0, 0) + 16777260;
            byte[] bArr = $$a;
            byte b = bArr[5];
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b, b2, b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, i2, iRgb, -459846511, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new int[]{-2013447346, 148946231, 38545581, 1437222295, -149031463, 758790060, -1573020710, 152828179, 885747796, 1567595428, -1779137402, 436470256, 1556965869, -313365284}, 22 - (ViewConfiguration.getScrollBarSize() >> 8), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new int[]{1965286908, 543780994, 1244179902, -1197907819, -1085833703, 256276671, -1636127580, 220963422, -1281173064, 830755610}, KeyEvent.keyCodeFromString("") + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
            int size = View.MeasureSpec.getSize(0) + 651;
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 44;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr6 = new Object[1];
            a(b3, (byte) (b3 | 52), bArr2[5], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, size, tapTimeout, -873460649, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int iRed = Color.red(0) + 651;
                int modifierMetaStateMask = 43 - ((byte) KeyEvent.getModifierMetaStateMask());
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr7 = new Object[1];
                a(b5, (byte) (b5 | 15), b4, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, iRed, modifierMetaStateMask, -1595579076, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr8[2])[0];
            int i6 = ((int[]) objArr8[0])[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i7 = ~iUptimeMillis;
            int i8 = ((((-1775367587) + (((~((-163088792) | i7)) | 166519601) * (-328))) + ((iUptimeMillis | 166519601) * 164)) + ((((~(iUptimeMillis | 163088791)) | 4481568) | (~(i7 | (-1050759)))) * 164)) - 72543761;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1609, 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr9 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -72543761, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                    int maxKeyCode = 651 - (KeyEvent.getMaxKeyCode() >> 16);
                    int mode = View.MeasureSpec.getMode(0) + 44;
                    byte[] bArr3 = $$a;
                    byte b6 = bArr3[7];
                    Object[] objArr10 = new Object[1];
                    a(b6, (byte) (b6 | 52), bArr3[5], objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, maxKeyCode, mode, 2075921419, false, (String) objArr10[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.getDefaultSize(0, 0), 695 - (ViewConfiguration.getWindowTouchSlop() >> 8), 99 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 793 - (ViewConfiguration.getEdgeSlop() >> 16), 83 - ExpandableListView.getPackedPositionGroup(0L)), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr11 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int gidForName = 650 - Process.getGidForName("");
                    int jumpTapTimeout = 44 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte b7 = $$a[7];
                    byte b8 = b7;
                    Object[] objArr12 = new Object[1];
                    a(b8, (byte) (b8 | 15), b7, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, gidForName, jumpTapTimeout, -1595579076, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr11);
                try {
                    Object[] objArr13 = new Object[1];
                    c(new int[]{-2013447346, 148946231, 38545581, 1437222295, -149031463, 758790060, -1573020710, 152828179, 885747796, 1567595428, -1779137402, 436470256, 1556965869, -313365284}, 22 - (KeyEvent.getMaxKeyCode() >> 16), objArr13);
                    Class<?> cls2 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    c(new int[]{1965286908, 543780994, 1244179902, -1197907819, -1085833703, 256276671, -1636127580, 220963422, -1281173064, 830755610}, 15 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr14);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                        int keyRepeatDelay = 651 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i11 = 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[7];
                        Object[] objArr15 = new Object[1];
                        a(b9, (byte) (b9 | 52), bArr4[5], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mirror, keyRepeatDelay, i11, -873460649, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int offsetBefore2 = 651 - TextUtils.getOffsetBefore("", 0);
                        int iResolveSize = 44 - View.resolveSize(0, 0);
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[5];
                        byte b11 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        a(b10, b11, b11, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(touchSlop, offsetBefore2, iResolveSize, -459846511, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr11;
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
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 == i12) {
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
            int i15 = i14 % 2;
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i19 = i16 + ((((~(581425781 | iIdentityHashCode)) | (-8121979)) * 262) - 1549034719) + (((~((~iIdentityHashCode) | 581425781)) | (-8121979)) * 262);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr2[3])[0] = i21 ^ (i21 << 5);
            c = 3;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
                int i23 = 2;
                int i24 = i22 % 2;
                int i25 = 0;
                while (i25 < strArr.length) {
                    int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
                    int i27 = i26 % i23;
                    arrayList.add(strArr[i25]);
                    i25++;
                    i23 = 2;
                }
            }
            int[] iArr = new int[i13];
            int i28 = i13 - 1;
            iArr[i28] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i28) % 2) - 1], 1).show();
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i29 = ((int[]) objArr[3])[0];
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[0])[0];
            int iNextInt = new Random().nextInt(420075539);
            int i32 = i29 + (-1180198296) + (((~((-513838805) | iNextInt)) | 8424132) * 345) + (((~((-513838805) | (~iNextInt))) | (-518832127)) * 345) + ((~(iNextInt | (-8424133))) * 345);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            c = 3;
            ((int[]) objArr2[3])[0] = i34 ^ (i34 << 5);
        }
        int iHashCode = str.hashCode();
        int i35 = ((int[]) objArr2[c])[0];
        int i36 = i35 * i35;
        int i37 = -(1288462342 * i35);
        int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
        int i39 = -(i35 * 1779403190);
        int i40 = (((i38 | i39) << 1) - (i39 ^ i38)) - (-1128525956);
        int i41 = i40 >> 18;
        int i42 = ((i41 ^ (-32767)) + ((i41 & (-32767)) << 1)) / 16384;
        int i43 = (i42 ^ 1) + ((i42 & 1) << 1);
        int i44 = (i40 ^ i43) + ((i43 & i40) << 1);
        int i45 = i40 >> 15;
        int i46 = (-(i44 ^ ((((((-262143) | i45) << 1) - (i45 ^ (-262143))) / 131072) + 1))) + 1;
        int i47 = i46 >> 17;
        int i48 = (((((-65535) | i47) << 1) - (i47 ^ (-65535))) / 32768) + 1;
        return (iHashCode * (5270 / ((i46 & (-((i48 ^ 1) + ((i48 & 1) << 1)))) * 170))) + this.b.hashCode();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof ReportDrawnKtExternalSyntheticLambda4)) {
            return false;
        }
        ReportDrawnKtExternalSyntheticLambda4 reportDrawnKtExternalSyntheticLambda4 = (ReportDrawnKtExternalSyntheticLambda4) obj;
        if (!Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, reportDrawnKtExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            return false;
        }
        if (Intrinsics.areEqual(this.b, reportDrawnKtExternalSyntheticLambda4.b)) {
            return true;
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder("PensionSimulation(title=");
        sb.append(str);
        sb.append(", value=");
        sb.append(str2);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, byte r7, short r8) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r6 = r6 * 56
            int r6 = 122 - r6
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r1 = defpackage.ReportDrawnKtExternalSyntheticLambda4.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2c
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
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ReportDrawnKtExternalSyntheticLambda4.$$e(int, byte, short):java.lang.String");
    }
}
