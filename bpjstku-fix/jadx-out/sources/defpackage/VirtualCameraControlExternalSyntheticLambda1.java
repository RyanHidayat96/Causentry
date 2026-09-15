package defpackage;

import android.R;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.InputMethodManager;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes4.dex */
public final class VirtualCameraControlExternalSyntheticLambda1 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {108, -26, -110, 50, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 38;
    private static final byte[] $$a = {59, -124, -78, 46, 2, -10, 10};
    private static final int $$b = 36;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long b = 4008642363683668152L;

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.VirtualCameraControlExternalSyntheticLambda1.$$a
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = 111 - r6
            int r8 = r8 * 2
            int r1 = 4 - r8
            byte[] r1 = new byte[r1]
            int r8 = 3 - r8
            r2 = 0
            if (r0 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2e
        L19:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r0[r6]
        L2e:
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            int r6 = r6 + 1
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VirtualCameraControlExternalSyntheticLambda1.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r0 = defpackage.VirtualCameraControlExternalSyntheticLambda1.$$d
            int r6 = r6 + 84
            int r8 = r8 * 52
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r6 = r8
            r5 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r7]
        L27:
            int r6 = r6 + r3
            int r7 = r7 + 1
            int r6 = r6 + (-11)
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VirtualCameraControlExternalSyntheticLambda1.c(byte, int, short, java.lang.Object[]):void");
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (KeyEvent.getMaxKeyCode() >> 16)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2623, Color.rgb(0, 0, 0) + 16777229, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (b ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - Gravity.getAbsoluteGravity(0, 0)), Color.red(0) + 481, (ViewConfiguration.getTapTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        while (getrealtimecapturelatency.b < cArr.length) {
            int i4 = $11 + 91;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - TextUtils.getCapsMode("", 0, 0)), 481 - View.getDefaultSize(0, 0), TextUtils.lastIndexOf("", '0', 0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 39422), 480 - TextUtils.indexOf((CharSequence) "", '0', 0), (KeyEvent.getMaxKeyCode() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            int i5 = $11 + 99;
            $10 = i5 % 128;
            int i6 = i5 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0503  */
    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, String str) throws Throwable {
        int i;
        boolean z;
        int i2;
        String string;
        int i3 = 2;
        int i4 = 2 % 2;
        AssetManager assets = context.getAssets();
        ArrayList arrayList = new ArrayList();
        byte b2 = (byte) 0;
        byte b3 = b2;
        Object[] objArr = new Object[1];
        a(b2, b3, b3, objArr);
        Method[] methodArr = {AssetManager.class.getMethod((String) objArr[0], String.class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
            int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2822;
            int i6 = 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            byte[] bArr = $$d;
            byte b4 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b4, b4, (byte) (-bArr[5]), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i5, i6, 1814927978, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 2822 - TextUtils.lastIndexOf("", '0'), 22 - (ViewConfiguration.getJumpTapTimeout() >> 16))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i7 = 0;
            while (i7 < length) {
                Method method = declaredMethods[i7];
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr3 = new Object[1];
                    d(new char[]{10697, 22639, 51855, 31941, 61241, 4526, 33740, 12918, 42156, 54936, 22803, 52137, 32217, 60422, 7856, 32995, 13063, 42480, 55236, 17937, 51283, 31482, 60690, 8012}, 29101 - View.combineMeasuredStates(0, 0), objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    d(new char[]{10692, 19671, 58357, 1757, 48520, 53394, 30636, 60082, 322, 42079, 56187, 32363}, 25873 - View.MeasureSpec.getMode(0), objArr4);
                    Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], null).invoke(method, null)).intValue())};
                    Object[] objArr6 = new Object[1];
                    d(new char[]{10697, 54669, 53579, 56623, 55473, 50244, 49176, 53220, 52156, 63306, 62151, 65187, 64113, 63948, 58772, 57697, 60711, 59570, 37984, 36881, 40939, 39857, 34575, 33491, 36526, 35430}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 64590, objArr6);
                    Class<?> cls2 = Class.forName((String) objArr6[0]);
                    Object[] objArr7 = new Object[1];
                    d(new char[]{10698, 58507, 45915, 16851, 7355, 11021, 63991, 46267}, 52571 - KeyEvent.getDeadChar(0, 0), objArr7);
                    if (((Boolean) cls2.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue()) {
                        Class cls3 = Long.TYPE;
                        Object[] objArr8 = new Object[1];
                        d(new char[]{10697, 22639, 51855, 31941, 61241, 4526, 33740, 12918, 42156, 54936, 22803, 52137, 32217, 60422, 7856, 32995, 13063, 42480, 55236, 17937, 51283, 31482, 60690, 8012}, 29100 - MotionEvent.axisFromString(""), objArr8);
                        Class<?> cls4 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        d(new char[]{10692, 1425, 29049, 44276, 39066, 62564, 9180, 8112, 19317, 42744, 37564, 52846, 15826}, TextUtils.getOffsetBefore("", 0) + 11351, objArr9);
                        if (cls3.equals(cls4.getMethod((String) objArr9[0], null).invoke(method, null))) {
                            Object[] objArr10 = new Object[1];
                            d(new char[]{10697, 22639, 51855, 31941, 61241, 4526, 33740, 12918, 42156, 54936, 22803, 52137, 32217, 60422, 7856, 32995, 13063, 42480, 55236, 17937, 51283, 31482, 60690, 8012}, (ViewConfiguration.getPressedStateDuration() >> 16) + 29101, objArr10);
                            Class<?> cls5 = Class.forName((String) objArr10[0]);
                            Object[] objArr11 = new Object[1];
                            d(new char[]{10692, 545, 32281, 43590, 34398, 62034, 11944, 6815, 30462, 41672, 40640, 52028, 10019, 4961, 20337, 47951, 38816}, (ViewConfiguration.getEdgeSlop() >> 16) + 11239, objArr11);
                            Object[] objArr12 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method, null);
                            if (objArr12.length == 2 && Long.TYPE.equals(objArr12[0])) {
                                Object[] objArr13 = new Object[1];
                                d(new char[]{10697, 22639, 51855, 31941, 61241, 4526, 33740, 12918, 42156, 54936, 22803, 52137, 32217, 60422, 7856, 32995, 13063, 42480, 55236, 17937, 51283, 31482, 60690, 8012}, 29102 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr13);
                                if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char defaultSize = (char) View.getDefaultSize(0, 0);
                                        int i10 = 2823 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        int iIndexOf = 22 - TextUtils.indexOf("", "");
                                        byte[] bArr2 = $$d;
                                        byte b5 = bArr2[7];
                                        Object[] objArr14 = new Object[1];
                                        c(b5, b5, (byte) (-bArr2[5]), objArr14);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, i10, iIndexOf, 1814927978, false, (String) objArr14[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2823;
                                        int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23;
                                        byte[] bArr3 = $$d;
                                        byte b6 = bArr3[7];
                                        Object[] objArr15 = new Object[1];
                                        c(b6, b6, (byte) (-bArr3[5]), objArr15);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumDrawingCacheSize, maxKeyCode, i11, 1814927978, false, (String) objArr15[0], null);
                                    }
                                    try {
                                        Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                                            int absoluteGravity = 2823 - Gravity.getAbsoluteGravity(0, 0);
                                            int gidForName = 21 - Process.getGidForName("");
                                            byte[] bArr4 = $$d;
                                            Object[] objArr17 = new Object[1];
                                            c(bArr4[54], (byte) (-bArr4[5]), bArr4[7], objArr17);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, absoluteGravity, gidForName, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr16)).longValue();
                                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
                                        TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                                        int i13 = i12 % 2;
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
                        } else {
                            continue;
                        }
                    }
                    i7++;
                    i3 = 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int iRed = Color.red(0) + 2823;
            int i14 = 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte[] bArr5 = $$d;
            byte b7 = bArr5[7];
            Object[] objArr18 = new Object[1];
            c(b7, b7, (byte) (-bArr5[5]), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(modifierMetaStateMask, iRed, i14, 1814927978, false, (String) objArr18[0], null);
        }
        Object[] objArr19 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
            int iResolveSize = 2823 - View.resolveSize(0, 0);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 23;
            byte[] bArr6 = $$d;
            Object[] objArr20 = new Object[1];
            c((byte) 14, (byte) (-bArr6[5]), bArr6[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iResolveSize, iLastIndexOf, 1025296417, false, (String) objArr20[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr19);
        Object[] objArr21 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 37658);
            int iMyPid = 2720 - (Process.myPid() >> 22);
            int i15 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20;
            byte[] bArr7 = $$d;
            Object[] objArr22 = new Object[1];
            c((byte) 14, (byte) (-bArr7[5]), bArr7[7], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionChild, iMyPid, i15, -1568796068, false, (String) objArr22[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21)).longValue();
        long j = -26515175;
        long j2 = -661;
        long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
        long j3 = -1;
        long j4 = j ^ j3;
        long j5 = jLongValue ^ j3;
        long j6 = (j2 * j) + (j2 * jLongValue) + (((long) 1324) * ((jMaxMemory ^ j3) | ((j4 | j5) ^ j3))) + (((long) (-1324)) * (((j | jMaxMemory) ^ j3) | ((jMaxMemory | jLongValue) ^ j3))) + (((long) 662) * ((j3 ^ (j5 | j)) | ((j4 | jLongValue) ^ j3))) + ((long) (-1783890670));
        int i16 = ~((int) Runtime.getRuntime().maxMemory());
        int i17 = ((int) (j6 >> 32)) & ((((~(23868323 | i16)) | 1444055116) * (-241)) + 1750577748 + (((~(i16 | 1467923439)) | R.string.accessibility_shortcut_enabling_service) * 241));
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i18 = i17 | (((int) j6) & ((-46416210) + ((~((-1712609283) | startElapsedRealtime)) * (-301)) + (((~((-275392218) | startElapsedRealtime)) | (~((~startElapsedRealtime) | (-1712618628)))) * (-301)) + (((~(startElapsedRealtime | 1712618627)) | (-275392218)) * 301)));
        int i19 = i18 >>> 24;
        int i20 = i18 & ViewCompat.MEASURED_SIZE_MASK;
        if (i19 != 0) {
            int i21 = TuitionPaymentFragmentbindingInflater1 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
            i = 2;
            int i22 = i21 % 2;
            z = true;
        } else {
            i = 2;
            z = false;
        }
        if (z) {
            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
            TuitionPaymentFragmentbindingInflater1 = i23 % 128;
            int i24 = i23 % i;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (!z || i20 >= 1) {
            string = null;
        } else {
            int i25 = TuitionPaymentFragmentbindingInflater1 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i25 % 128;
            int i26 = i25 % 2;
            Method method2 = methodArr[i20];
            if (method2 != null) {
                string = method2.toString();
            } else {
                string = null;
            }
        }
        arrayList.add(string);
        if ((i19 + 6) * i2 != 0) {
            throw null;
        }
        InputStream inputStreamOpen = assets.open(str);
        Intrinsics.checkExpressionValueIsNotNull(inputStreamOpen, "");
        byte[] bArr8 = new byte[inputStreamOpen.available()];
        inputStreamOpen.read(bArr8);
        inputStreamOpen.close();
        Charset charsetForName = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
        Intrinsics.checkExpressionValueIsNotNull(charsetForName, "");
        return new String(bArr8, charsetForName);
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view, Context context) {
        Object systemService;
        int i = 2 % 2;
        if (context != null) {
            systemService = context.getSystemService("input_method");
            int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            systemService = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (inputMethodManager != null) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
