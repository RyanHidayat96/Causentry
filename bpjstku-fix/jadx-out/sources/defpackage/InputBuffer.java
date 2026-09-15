package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.mlkit.common.MlKitException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class InputBuffer {
    private static final byte[] $$c = {15, -9, 64, -81};
    private static final int $$f = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {99, -43, -44, -62, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static final byte[] $$a = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, -6, 24, -18, 26, -71, 67, -6, 18, -67, 72, 3, -4, -59, 40, 3, -4, -6, 47, 2, 9, -12, 22, -1, 8, -2, 14, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 40, 21, 1, 21, 0, -10, -16, 18, 16, -7, 14, 1};
    private static final int $$b = 196;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {59705, 59746, 59744, 59749, 59751, 59730, 59702, 59738, 59744, 59759, 59747, 59746, 59758, 59744, 59739, 59713, 59745, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59809, 59820, 59809, 59822, 59835, 59781, 59838, 59821, 59811, 59839, 59832, 59821, 59710, 59758, 59744, 59744, 59724, 59718, 59757, 59756, 59745, 59713, 59739, 59744, 59758, 59746, 59747, 59759, 59744, 59738, 59702, 59733, 59746, 59757, 59756, 59756, 59756, 59744, 59775, 59882, 59883, 59863, 59842, 59865, 59883, 59858, 59751, 59862, 59844, 59841, 59858, 59863, 59862, 59870, 59855, 59847, 59870, 59844, 59844, 59792, 59451, 59429, 59443, 59425, 59436, 59428, 59451, 59451, 59430, 59424, 59430, 59430, 59415, 59437, 59451, 59425};

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.InputBuffer.$$a
            int r9 = r9 + 4
            int r8 = r8 * 2
            int r8 = 26 - r8
            int r7 = r7 + 105
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r5 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            int r9 = r9 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r7 = r7 + r9
            int r7 = r7 + (-3)
            r9 = r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.InputBuffer.a(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 52
            int r8 = 53 - r8
            int r9 = 103 - r9
            byte[] r0 = defpackage.InputBuffer.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r9 = r7
            r3 = r8
            r5 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.InputBuffer.c(int, byte, byte, java.lang.Object[]):void");
    }

    private static void d(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        char[] cArr2;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i9 = -1;
        if (cArr3 != null) {
            int i10 = $10 + 63;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i12 = 0;
            while (i12 < length) {
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[i3] = Integer.valueOf(cArr3[i12]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i9;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myTid() >> 22), TextUtils.indexOf("", "", i3) + 1270, 18 - (ViewConfiguration.getPressedStateDuration() >> 16), 407021364, false, $$g((byte) 5, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i12++;
                    i3 = 0;
                    i5 = 1;
                    i9 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        char[] cArr5 = new char[i6];
        char c = 0;
        System.arraycopy(cArr3, i4, cArr5, 0, i6);
        if (bArr != null) {
            int i13 = $10 + 95;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                cArr2 = new char[i6];
                setvideostabilizationmode.b = 0;
            } else {
                cArr2 = new char[i6];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i6) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i14 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr5[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 3273 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getJumpTapTimeout() >> 16) + 13, 2133916302, false, $$g((byte) 6, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr5[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char minimumFlingVelocity = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int defaultSize = View.getDefaultSize(0, 0) + 1755;
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                        byte length2 = (byte) $$c.length;
                        byte b4 = (byte) (length2 - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, defaultSize, keyRepeatDelay, 387247676, false, $$g(length2, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr2[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - View.combineMeasuredStates(0, 0)), TextUtils.lastIndexOf("", '0') + 1706, 21 - View.MeasureSpec.getMode(0), -1434471773, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr5 = cArr2;
        }
        if (i8 > 0) {
            char[] cArr6 = new char[i6];
            System.arraycopy(cArr5, 0, cArr6, 0, i6);
            int i16 = i6 - i8;
            System.arraycopy(cArr6, 0, cArr5, i16, i8);
            System.arraycopy(cArr6, i8, cArr5, 0, i16);
        }
        if (z) {
            int i17 = $10 + 3;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr = new char[i6];
                i = 1;
                setvideostabilizationmode.b = 1;
            } else {
                i = 1;
                cArr = new char[i6];
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i6) {
                cArr[setvideostabilizationmode.b] = cArr5[(i6 - setvideostabilizationmode.b) - i];
                setvideostabilizationmode.b += i;
                i = 1;
            }
            cArr5 = cArr;
        }
        if (i7 > 0) {
            int i18 = $10 + 43;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                setvideostabilizationmode.b = 1;
            } else {
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i6) {
                int i19 = $11 + 109;
                $10 = i19 % 128;
                int i20 = i19 % 2;
                cArr5[setvideostabilizationmode.b] = (char) (cArr5[setvideostabilizationmode.b] - iArr[2]);
                setvideostabilizationmode.b++;
            }
        }
        objArr[0] = new String(cArr5);
        int i21 = $11 + 73;
        $10 = i21 % 128;
        if (i21 % 2 != 0) {
            int i22 = 83 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0376 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0131  */
    /* JADX WARN: Code duplicated, block: B:17:0x0153  */
    /* JADX WARN: Code duplicated, block: B:21:0x01c7 A[Catch: all -> 0x048e, TRY_ENTER, TryCatch #1 {all -> 0x048e, blocks: (B:18:0x0166, B:21:0x01c7, B:23:0x0204, B:25:0x0218, B:31:0x0233, B:41:0x02c0, B:42:0x02d6, B:44:0x02f8, B:43:0x02e1, B:36:0x0276, B:22:0x01e6), top: B:107:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x01e6 A[Catch: all -> 0x048e, TryCatch #1 {all -> 0x048e, blocks: (B:18:0x0166, B:21:0x01c7, B:23:0x0204, B:25:0x0218, B:31:0x0233, B:41:0x02c0, B:42:0x02d6, B:44:0x02f8, B:43:0x02e1, B:36:0x0276, B:22:0x01e6), top: B:107:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0225  */
    /* JADX WARN: Code duplicated, block: B:30:0x0231  */
    /* JADX WARN: Code duplicated, block: B:34:0x0271  */
    /* JADX WARN: Code duplicated, block: B:35:0x0274  */
    /* JADX WARN: Code duplicated, block: B:41:0x02c0 A[Catch: all -> 0x048e, TRY_ENTER, TryCatch #1 {all -> 0x048e, blocks: (B:18:0x0166, B:21:0x01c7, B:23:0x0204, B:25:0x0218, B:31:0x0233, B:41:0x02c0, B:42:0x02d6, B:44:0x02f8, B:43:0x02e1, B:36:0x0276, B:22:0x01e6), top: B:107:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x02e1 A[Catch: all -> 0x048e, TryCatch #1 {all -> 0x048e, blocks: (B:18:0x0166, B:21:0x01c7, B:23:0x0204, B:25:0x0218, B:31:0x0233, B:41:0x02c0, B:42:0x02d6, B:44:0x02f8, B:43:0x02e1, B:36:0x0276, B:22:0x01e6), top: B:107:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0316  */
    /* JADX WARN: Code duplicated, block: B:49:0x0329  */
    /* JADX WARN: Code duplicated, block: B:51:0x033d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0352  */
    /* JADX WARN: Code duplicated, block: B:57:0x037c  */
    /* JADX WARN: Code duplicated, block: B:60:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:64:0x0421 A[Catch: all -> 0x0668, TryCatch #0 {all -> 0x0668, blocks: (B:79:0x04da, B:81:0x04e7, B:82:0x0520, B:84:0x053c, B:85:0x0583, B:62:0x040e, B:64:0x0421, B:65:0x0466), top: B:105:0x040e }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0475  */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) throws Throwable {
        Method[] declaredMethods;
        int length;
        int i;
        Method method;
        Object[] objArr;
        String str;
        int i2;
        Class<?> cls;
        String str2;
        int i3;
        Method method2;
        int i4;
        Class cls2;
        Class<?> cls3;
        Object[] objArr2;
        int i5;
        Class<?> cls4;
        Object[] objArr3;
        int i6;
        int[] iArr;
        Class<?> cls5;
        Object obj;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Class cls6;
        Class<?> cls7;
        Object[] objArr4;
        Method method3;
        int i7 = 2;
        int i8 = 2 % 2;
        int i9 = TuitionPaymentFragmentbindingInflater1 + 87;
        b = i9 % 128;
        int i10 = i9 % 2;
        Method[] methodArr = new Method[1];
        byte[] bArr = $$a;
        int i11 = 36;
        byte b2 = bArr[36];
        int i12 = 26;
        Object[] objArr5 = new Object[1];
        a(b2, b2, bArr[26], objArr5);
        int i13 = 0;
        Class<?> cls8 = Class.forName((String) objArr5[0]);
        Object[] objArr6 = new Object[1];
        a(bArr[38], (byte) (-bArr[35]), bArr[25], objArr6);
        String str3 = (String) objArr6[0];
        Class<?>[] clsArr = new Class[3];
        int i14 = b;
        int i15 = (i14 & 13) + (i14 | 13);
        TuitionPaymentFragmentbindingInflater1 = i15 % 128;
        int i16 = i15 % 2;
        clsArr[0] = KeyManager[].class;
        clsArr[1] = TrustManager[].class;
        byte b3 = bArr[36];
        byte b4 = bArr[38];
        Object[] objArr7 = new Object[1];
        a(b3, b4, (byte) (b4 | 25), objArr7);
        Class<?> cls9 = Class.forName((String) objArr7[0]);
        int i17 = TuitionPaymentFragmentbindingInflater1 + 13;
        b = i17 % 128;
        String string = null;
        if (i17 % 2 == 0) {
            clsArr[2] = cls9;
            methodArr[0] = cls8.getMethod(str3, clsArr);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cRed = (char) Color.red(0);
                int iRgb = (-16774393) - Color.rgb(0, 0, 0);
                int i18 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
                byte[] bArr2 = $$d;
                Object[] objArr8 = new Object[1];
                c(bArr2[5], bArr2[7], bArr2[54], objArr8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRed, iRgb, i18, 1814927978, false, (String) objArr8[0], null);
            }
            int i19 = 89 / 0;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getScrollBarSize() >> 8), 2823 - View.MeasureSpec.makeMeasureSpec(0, 0), ImageFormat.getBitsPerPixel(0) + 23)).getDeclaredMethods();
                length = declaredMethods.length;
                i = 0;
                while (i < length) {
                    method = declaredMethods[i];
                    int i20 = TuitionPaymentFragmentbindingInflater1;
                    int i21 = ((i20 | 111) << 1) - (i20 ^ 111);
                    b = i21 % 128;
                    int i22 = i21 % i7;
                    try {
                        Object[] objArr9 = new Object[1];
                        d(new int[]{0, 24, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr9);
                        Class<?> cls10 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        d(new int[]{24, 12, 65, 9}, true, null, objArr10);
                        objArr = new Object[]{Integer.valueOf(((Integer) cls10.getMethod((String) objArr10[0], null).invoke(method, null)).intValue())};
                        int[] iArr2 = {i11, i12, 0, 0};
                        byte[] bArr3 = new byte[i12];
                        // fill-array-data instruction
                        bArr3[0] = 0;
                        bArr3[1] = 1;
                        bArr3[2] = 1;
                        bArr3[3] = 1;
                        bArr3[4] = 1;
                        bArr3[5] = 0;
                        bArr3[6] = 1;
                        bArr3[7] = 1;
                        bArr3[8] = 1;
                        bArr3[9] = 1;
                        bArr3[10] = 0;
                        bArr3[11] = 1;
                        bArr3[12] = 1;
                        bArr3[13] = 0;
                        bArr3[14] = 1;
                        bArr3[15] = 0;
                        bArr3[16] = 1;
                        bArr3[17] = 0;
                        bArr3[18] = 1;
                        bArr3[19] = 0;
                        bArr3[20] = 1;
                        bArr3[21] = 1;
                        bArr3[22] = 1;
                        bArr3[23] = 1;
                        bArr3[24] = 0;
                        bArr3[25] = 1;
                        Object[] objArr11 = new Object[1];
                        d(iArr2, false, bArr3, objArr11);
                        str = (String) objArr11[0];
                        int i23 = b;
                        i2 = (i23 ^ 87) + ((i23 & 87) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                        if (i2 % 2 != 0) {
                            cls = Class.forName(str);
                            Object[] objArr12 = new Object[1];
                            d(new int[]{62, 8, 114, 7}, true, new byte[]{0, 1, 1, 1, 1, 1, 0, 0}, objArr12);
                            str2 = (String) objArr12[0];
                            i3 = 0;
                        } else {
                            cls = Class.forName(str);
                            Object[] objArr13 = new Object[1];
                            d(new int[]{62, 8, 114, 7}, true, new byte[]{0, 1, 1, 1, 1, 1, 0, 0}, objArr13);
                            str2 = (String) objArr13[0];
                            i3 = 1;
                        }
                        Class<?>[] clsArr2 = new Class[i3];
                        clsArr2[0] = Integer.TYPE;
                        method2 = cls.getMethod(str2, clsArr2);
                        int i24 = TuitionPaymentFragmentbindingInflater1 + 67;
                        b = i24 % 128;
                        int i25 = i24 % 2;
                        if (!(!((Boolean) method2.invoke(null, objArr)).booleanValue())) {
                            i4 = TuitionPaymentFragmentbindingInflater1 + 91;
                            b = i4 % 128;
                            if (i4 % 2 == 0) {
                                cls6 = Long.TYPE;
                                Object[] objArr14 = new Object[1];
                                d(new int[]{0, 24, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr14);
                                cls7 = Class.forName((String) objArr14[0]);
                                objArr4 = new Object[1];
                                d(new int[]{70, 13, 105, 12}, true, new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0}, objArr4);
                                if (cls6.equals(cls7.getMethod((String) objArr4[0], null).invoke(method, null))) {
                                }
                            } else {
                                cls2 = Long.TYPE;
                                Object[] objArr15 = new Object[1];
                                d(new int[]{0, 24, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr15);
                                cls3 = Class.forName((String) objArr15[0]);
                                objArr2 = new Object[1];
                                d(new int[]{70, 13, 105, 12}, true, new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0}, objArr2);
                                if (cls2.equals(cls3.getMethod((String) objArr2[0], null).invoke(method, null))) {
                                }
                            }
                            i5 = b + 23;
                            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                            if (i5 % 2 != 0) {
                                Object[] objArr16 = new Object[1];
                                d(new int[]{0, 24, 0, 0}, false, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr16);
                                cls4 = Class.forName((String) objArr16[0]);
                            } else {
                                Object[] objArr17 = new Object[1];
                                d(new int[]{0, 24, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr17);
                                cls4 = Class.forName((String) objArr17[0]);
                            }
                            Object[] objArr18 = new Object[1];
                            d(new int[]{83, 17, 196, 0}, true, new byte[]{1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0}, objArr18);
                            objArr3 = (Object[]) cls4.getMethod((String) objArr18[0], null).invoke(method, null);
                            if (objArr3.length == 2) {
                                int i26 = TuitionPaymentFragmentbindingInflater1 + 45;
                                b = i26 % 128;
                                int i27 = i26 % 2;
                                if (Long.TYPE.equals(objArr3[0])) {
                                    int i28 = TuitionPaymentFragmentbindingInflater1;
                                    i6 = ((i28 | 19) << 1) - (i28 ^ 19);
                                    b = i6 % 128;
                                    iArr = new int[]{0, 24, 0, 0};
                                    if (i6 % 2 == 0) {
                                        Object[] objArr19 = new Object[1];
                                        d(iArr, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr19);
                                        cls5 = Class.forName((String) objArr19[0]);
                                        obj = objArr3[0];
                                    } else {
                                        Object[] objArr20 = new Object[1];
                                        d(iArr, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr20);
                                        cls5 = Class.forName((String) objArr20[0]);
                                        obj = objArr3[1];
                                    }
                                    int i29 = TuitionPaymentFragmentbindingInflater1 + 59;
                                    b = i29 % 128;
                                    int i30 = i29 % 2;
                                    if (cls5.equals(obj)) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                            int i31 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2823;
                                            int iResolveSizeAndState = 22 - View.resolveSizeAndState(0, 0, 0);
                                            byte[] bArr4 = $$d;
                                            Object[] objArr21 = new Object[1];
                                            c(bArr4[5], bArr4[7], bArr4[54], objArr21);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, i31, iResolveSizeAndState, 1814927978, false, (String) objArr21[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                            int packedPositionGroup = 2823 - ExpandableListView.getPackedPositionGroup(0L);
                                            int touchSlop = 22 - (ViewConfiguration.getTouchSlop() >> 8);
                                            byte[] bArr5 = $$d;
                                            Object[] objArr22 = new Object[1];
                                            c(bArr5[5], bArr5[7], bArr5[54], objArr22);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, packedPositionGroup, touchSlop, 1814927978, false, (String) objArr22[0], null);
                                        }
                                        try {
                                            Object[] objArr23 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                int iResolveSize = View.resolveSize(0, 0) + 2823;
                                                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                                                byte b5 = (byte) ($$e >>> 2);
                                                byte[] bArr6 = $$d;
                                                Object[] objArr24 = new Object[1];
                                                c(b5, (byte) (-bArr6[5]), bArr6[7], objArr24);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iResolveSize, maxKeyCode, -2137287382, false, (String) objArr24[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr23)).longValue();
                                            break;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            }
                        }
                        int i32 = (i & 24) + (i | 24);
                        i = (i32 & (-23)) + (i32 | (-23));
                        i7 = 2;
                        i11 = 36;
                        i12 = 26;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
        } else {
            clsArr[2] = cls9;
            methodArr[0] = cls8.getMethod(str3, clsArr);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                int iAlpha = 2823 - Color.alpha(0);
                int iRgb2 = Color.rgb(0, 0, 0) + 16777238;
                byte[] bArr7 = $$d;
                Object[] objArr25 = new Object[1];
                c(bArr7[5], bArr7[7], bArr7[54], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, iAlpha, iRgb2, 1814927978, false, (String) objArr25[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null) == null) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getScrollBarSize() >> 8), 2823 - View.MeasureSpec.makeMeasureSpec(0, 0), ImageFormat.getBitsPerPixel(0) + 23)).getDeclaredMethods();
                length = declaredMethods.length;
                i = 0;
                while (i < length) {
                    method = declaredMethods[i];
                    int i210 = TuitionPaymentFragmentbindingInflater1;
                    int i211 = ((i210 | 111) << 1) - (i210 ^ 111);
                    b = i211 % 128;
                    int i212 = i211 % i7;
                    Object[] objArr26 = new Object[1];
                    d(new int[]{0, 24, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr26);
                    Class<?> cls11 = Class.forName((String) objArr26[0]);
                    Object[] objArr110 = new Object[1];
                    d(new int[]{24, 12, 65, 9}, true, null, objArr110);
                    objArr = new Object[]{Integer.valueOf(((Integer) cls11.getMethod((String) objArr110[0], null).invoke(method, null)).intValue())};
                    int[] iArr3 = {i11, i12, 0, 0};
                    byte[] bArr8 = new byte[i12];
                    // fill-array-data instruction
                    bArr8[0] = 0;
                    bArr8[1] = 1;
                    bArr8[2] = 1;
                    bArr8[3] = 1;
                    bArr8[4] = 1;
                    bArr8[5] = 0;
                    bArr8[6] = 1;
                    bArr8[7] = 1;
                    bArr8[8] = 1;
                    bArr8[9] = 1;
                    bArr8[10] = 0;
                    bArr8[11] = 1;
                    bArr8[12] = 1;
                    bArr8[13] = 0;
                    bArr8[14] = 1;
                    bArr8[15] = 0;
                    bArr8[16] = 1;
                    bArr8[17] = 0;
                    bArr8[18] = 1;
                    bArr8[19] = 0;
                    bArr8[20] = 1;
                    bArr8[21] = 1;
                    bArr8[22] = 1;
                    bArr8[23] = 1;
                    bArr8[24] = 0;
                    bArr8[25] = 1;
                    Object[] objArr111 = new Object[1];
                    d(iArr3, false, bArr8, objArr111);
                    str = (String) objArr111[0];
                    int i213 = b;
                    i2 = (i213 ^ 87) + ((i213 & 87) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                    if (i2 % 2 != 0) {
                        cls = Class.forName(str);
                        Object[] objArr112 = new Object[1];
                        d(new int[]{62, 8, 114, 7}, true, new byte[]{0, 1, 1, 1, 1, 1, 0, 0}, objArr112);
                        str2 = (String) objArr112[0];
                        i3 = 0;
                    } else {
                        cls = Class.forName(str);
                        Object[] objArr113 = new Object[1];
                        d(new int[]{62, 8, 114, 7}, true, new byte[]{0, 1, 1, 1, 1, 1, 0, 0}, objArr113);
                        str2 = (String) objArr113[0];
                        i3 = 1;
                    }
                    Class<?>[] clsArr3 = new Class[i3];
                    clsArr3[0] = Integer.TYPE;
                    method2 = cls.getMethod(str2, clsArr3);
                    int i214 = TuitionPaymentFragmentbindingInflater1 + 67;
                    b = i214 % 128;
                    int i215 = i214 % 2;
                    if (!(!((Boolean) method2.invoke(null, objArr)).booleanValue())) {
                        i4 = TuitionPaymentFragmentbindingInflater1 + 91;
                        b = i4 % 128;
                        if (i4 % 2 == 0) {
                            cls6 = Long.TYPE;
                            Object[] objArr114 = new Object[1];
                            d(new int[]{0, 24, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr114);
                            cls7 = Class.forName((String) objArr114[0]);
                            objArr4 = new Object[1];
                            d(new int[]{70, 13, 105, 12}, true, new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0}, objArr4);
                            if (cls6.equals(cls7.getMethod((String) objArr4[0], null).invoke(method, null))) {
                            }
                        } else {
                            cls2 = Long.TYPE;
                            Object[] objArr115 = new Object[1];
                            d(new int[]{0, 24, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr115);
                            cls3 = Class.forName((String) objArr115[0]);
                            objArr2 = new Object[1];
                            d(new int[]{70, 13, 105, 12}, true, new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0}, objArr2);
                            if (cls2.equals(cls3.getMethod((String) objArr2[0], null).invoke(method, null))) {
                            }
                        }
                        i5 = b + 23;
                        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                        if (i5 % 2 != 0) {
                            Object[] objArr116 = new Object[1];
                            d(new int[]{0, 24, 0, 0}, false, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr116);
                            cls4 = Class.forName((String) objArr116[0]);
                        } else {
                            Object[] objArr117 = new Object[1];
                            d(new int[]{0, 24, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr117);
                            cls4 = Class.forName((String) objArr117[0]);
                        }
                        Object[] objArr118 = new Object[1];
                        d(new int[]{83, 17, 196, 0}, true, new byte[]{1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0}, objArr118);
                        objArr3 = (Object[]) cls4.getMethod((String) objArr118[0], null).invoke(method, null);
                        if (objArr3.length == 2) {
                            int i216 = TuitionPaymentFragmentbindingInflater1 + 45;
                            b = i216 % 128;
                            int i217 = i216 % 2;
                            if (Long.TYPE.equals(objArr3[0])) {
                                int i218 = TuitionPaymentFragmentbindingInflater1;
                                i6 = ((i218 | 19) << 1) - (i218 ^ 19);
                                b = i6 % 128;
                                iArr = new int[]{0, 24, 0, 0};
                                if (i6 % 2 == 0) {
                                    Object[] objArr119 = new Object[1];
                                    d(iArr, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr119);
                                    cls5 = Class.forName((String) objArr119[0]);
                                    obj = objArr3[0];
                                } else {
                                    Object[] objArr27 = new Object[1];
                                    d(iArr, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr27);
                                    cls5 = Class.forName((String) objArr27[0]);
                                    obj = objArr3[1];
                                }
                                int i219 = TuitionPaymentFragmentbindingInflater1 + 59;
                                b = i219 % 128;
                                int i33 = i219 % 2;
                                if (cls5.equals(obj)) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                        int i34 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2823;
                                        int iResolveSizeAndState2 = 22 - View.resolveSizeAndState(0, 0, 0);
                                        byte[] bArr9 = $$d;
                                        Object[] objArr28 = new Object[1];
                                        c(bArr9[5], bArr9[7], bArr9[54], objArr28);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize2, i34, iResolveSizeAndState2, 1814927978, false, (String) objArr28[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                        int packedPositionGroup2 = 2823 - ExpandableListView.getPackedPositionGroup(0L);
                                        int touchSlop2 = 22 - (ViewConfiguration.getTouchSlop() >> 8);
                                        byte[] bArr10 = $$d;
                                        Object[] objArr29 = new Object[1];
                                        c(bArr10[5], bArr10[7], bArr10[54], objArr29);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf3, packedPositionGroup2, touchSlop2, 1814927978, false, (String) objArr29[0], null);
                                    }
                                    Object[] objArr210 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char c2 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                        int iResolveSize2 = View.resolveSize(0, 0) + 2823;
                                        int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                                        byte b6 = (byte) ($$e >>> 2);
                                        byte[] bArr11 = $$d;
                                        Object[] objArr211 = new Object[1];
                                        c(b6, (byte) (-bArr11[5]), bArr11[7], objArr211);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iResolveSize2, maxKeyCode2, -2137287382, false, (String) objArr211[0], new Class[]{Long.TYPE, Method.class});
                                    }
                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr210)).longValue();
                                    break;
                                }
                            }
                        }
                    }
                    int i35 = (i & 24) + (i | 24);
                    i = (i35 & (-23)) + (i35 | (-23));
                    i7 = 2;
                    i11 = 36;
                    i12 = 26;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2823;
            int iResolveSize3 = View.resolveSize(0, 0) + 22;
            byte[] bArr12 = $$d;
            Object[] objArr30 = new Object[1];
            c(bArr12[5], bArr12[7], bArr12[54], objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, keyRepeatTimeout, iResolveSize3, 1814927978, false, (String) objArr30[0], null);
        }
        Object[] objArr31 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int iAxisFromString = MotionEvent.axisFromString("") + 2824;
            int iIndexOf = 22 - TextUtils.indexOf("", "");
            byte b7 = (byte) ($$e >>> 2);
            byte b8 = (byte) (-$$d[5]);
            Object[] objArr32 = new Object[1];
            c(b7, b8, (byte) (b8 + 4), objArr32);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatDelay, iAxisFromString, iIndexOf, 1025296417, false, (String) objArr32[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr31);
        Object[] objArr33 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char packedPositionChild = (char) (37656 - ExpandableListView.getPackedPositionChild(0L));
            int iCombineMeasuredStates = 2720 - View.combineMeasuredStates(0, 0);
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 19;
            byte b9 = (byte) ($$e >>> 2);
            byte b10 = (byte) (-$$d[5]);
            Object[] objArr34 = new Object[1];
            c(b9, b10, (byte) (b10 + 4), objArr34);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionChild, iCombineMeasuredStates, pressedStateDuration, -1568796068, false, (String) objArr34[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr33)).longValue();
        int i36 = TuitionPaymentFragmentbindingInflater1;
        int i37 = (i36 & 55) + (i36 | 55);
        b = i37 % 128;
        int i38 = i37 % 2;
        long j = -1381097882;
        long j2 = -560;
        long jMyPid = Process.myPid();
        long j3 = -1;
        long j4 = jMyPid ^ j3;
        long j5 = (((long) (-559)) * j) + (((long) 561) * jLongValue) + (((j4 | j) ^ j3) * j2) + (j2 * ((((jLongValue ^ j3) | j) | jMyPid) ^ j3)) + (((long) 560) * (((j4 | jLongValue) ^ j3) | (((j ^ j3) | jLongValue) ^ j3))) + ((long) (-429307963));
        int iNextInt = new Random().nextInt();
        int i39 = ((int) (j5 >> 32)) & (961065794 + (((~((-1116090970) | iNextInt)) | (-1741649916)) * (-756)) + (((~iNextInt) | (-1116090970)) * 756));
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i40 = ~elapsedCpuTime;
        int i41 = ((int) j5) & (1187451943 + (((~(i40 | 1596329935)) | (-1596956624) | (~((-1260784263) | elapsedCpuTime))) * 717) + (((~(elapsedCpuTime | 1596329935)) | (~(i40 | (-1260784263))) | (-1596956624)) * 717));
        int i42 = (i39 & i41) | (i39 ^ i41);
        int i43 = i42 >>> 24;
        int i44 = i42 & ViewCompat.MEASURED_SIZE_MASK;
        boolean z = i43 != 0;
        if (z) {
            int i45 = TuitionPaymentFragmentbindingInflater1;
            int i46 = (i45 & 119) + (i45 | 119);
            b = i46 % 128;
            int i47 = i46 % 2;
            i13 = 1;
        }
        if (z && i44 < 1 && (method3 = methodArr[i44]) != null) {
            string = method3.toString();
        }
        list.add(string);
        int i48 = (i43 & 6) + (i43 | 6);
        int i49 = b + 15;
        TuitionPaymentFragmentbindingInflater1 = i49 % 128;
        int i50 = i49 % 2;
        return i48 * i13;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, byte r8, short r9) {
        /*
            byte[] r0 = defpackage.InputBuffer.$$c
            int r9 = r9 * 4
            int r9 = r9 + 1
            int r8 = r8 + 4
            int r7 = 105 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r8
            r3 = r9
            r5 = r2
            goto L28
        L13:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L17:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r7]
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.InputBuffer.$$g(short, byte, short):java.lang.String");
    }
}
