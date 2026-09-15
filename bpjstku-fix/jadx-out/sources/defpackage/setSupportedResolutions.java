package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public final class setSupportedResolutions {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final ConcurrentMap<String, getCameraControl> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$d = {58, 66, -14, -31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 143;
    private static final byte[] $$a = {41, 2, 45, -60, -2, 15, -36, 17, 2, 8, -10, 6, -2, -28, 37, -8, 9};
    private static final int $$b = 181;
    private static int b = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    private static void a(short s, byte b2, short s2, Object[] objArr) {
        int i = s + 4;
        int i2 = b2 * 4;
        byte[] bArr = $$a;
        int i3 = (s2 * 4) + 103;
        byte[] bArr2 = new byte[i2 + 14];
        int i4 = i2 + 13;
        int i5 = -1;
        if (bArr == null) {
            i3 = i + i4;
            i = i;
        }
        while (true) {
            int i6 = i + 1;
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 += bArr[i6];
                i = i6;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 84
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r8 = r8 * 52
            int r8 = 53 - r8
            byte[] r0 = defpackage.setSupportedResolutions.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setSupportedResolutions.c(byte, short, short, java.lang.Object[]):void");
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ConcurrentHashMap();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r5 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r3 = defpackage.setSupportedResolutions.b + 3;
        defpackage.setSupportedResolutions.g = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if ((r3 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r5 = java.lang.String.valueOf(r5.versionCode);
        r3 = 88 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r5 = java.lang.String.valueOf(r5.versionCode);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        r5 = java.util.UUID.randomUUID().toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        r3 = new defpackage.setResolutionSelector(r5);
        r5 = r2.putIfAbsent(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (r5 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        r5 = defpackage.setSupportedResolutions.b + 95;
        defpackage.setSupportedResolutions.g = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if ((r5 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        r5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.getCameraControl TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context r5) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.setSupportedResolutions.b
            int r1 = r1 + 105
            int r2 = r1 % 128
            defpackage.setSupportedResolutions.g = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L21
            java.lang.String r1 = r5.getPackageName()
            java.util.concurrent.ConcurrentMap<java.lang.String, getCameraControl> r2 = defpackage.setSupportedResolutions.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            java.lang.Object r3 = r2.get(r1)
            getCameraControl r3 = (defpackage.getCameraControl) r3
            r4 = 71
            int r4 = r4 / 0
            if (r3 != 0) goto L76
            goto L2f
        L21:
            java.lang.String r1 = r5.getPackageName()
            java.util.concurrent.ConcurrentMap<java.lang.String, getCameraControl> r2 = defpackage.setSupportedResolutions.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            java.lang.Object r3 = r2.get(r1)
            getCameraControl r3 = (defpackage.getCameraControl) r3
            if (r3 != 0) goto L76
        L2f:
            android.content.pm.PackageInfo r5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(r5)
            if (r5 == 0) goto L52
            int r3 = defpackage.setSupportedResolutions.b
            int r3 = r3 + 3
            int r4 = r3 % 128
            defpackage.setSupportedResolutions.g = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L4b
            int r5 = r5.versionCode
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3 = 88
            int r3 = r3 / 0
            goto L5a
        L4b:
            int r5 = r5.versionCode
            java.lang.String r5 = java.lang.String.valueOf(r5)
            goto L5a
        L52:
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
        L5a:
            setResolutionSelector r3 = new setResolutionSelector
            r3.<init>(r5)
            java.lang.Object r5 = r2.putIfAbsent(r1, r3)
            getCameraControl r5 = (defpackage.getCameraControl) r5
            if (r5 != 0) goto L75
            int r5 = defpackage.setSupportedResolutions.b
            int r5 = r5 + 95
            int r1 = r5 % 128
            defpackage.setSupportedResolutions.g = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L73
            return r3
        L73:
            r5 = 0
            throw r5
        L75:
            return r5
        L76:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setSupportedResolutions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context):getCameraControl");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0240  */
    /* JADX WARN: Code duplicated, block: B:57:0x0241  */
    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (true) {
            obj = null;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i3 = $10 + 57;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 19472), 2623 - TextUtils.lastIndexOf("", '0'), 13 - KeyEvent.getDeadChar(0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() * (TuitionPaymentFragmentspecialinlinedviewModeldefault1 % 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.red(0) + 39422), Color.blue(0) + 481, (ViewConfiguration.getJumpTapTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - Gravity.getAbsoluteGravity(0, 0)), TextUtils.getTrimmedLength("") + 2624, TextUtils.lastIndexOf("", '0') + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.getDefaultSize(0, 0) + 39422), 481 - (ViewConfiguration.getTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 9;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                try {
                    Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - (Process.myTid() >> 22)), View.MeasureSpec.makeMeasureSpec(0, 0) + 481, 36 - TextUtils.lastIndexOf("", '0'), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39421), TextUtils.getOffsetBefore("", 0) + 481, KeyEvent.normalizeMetaState(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x024c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0295  */
    /* JADX WARN: Code duplicated, block: B:37:0x02e7 A[Catch: all -> 0x0544, TryCatch #1 {all -> 0x0544, blocks: (B:35:0x02d2, B:37:0x02e7, B:38:0x032b, B:50:0x038a, B:52:0x0397, B:53:0x03d0, B:55:0x03ec, B:56:0x0439), top: B:90:0x02d2 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0516  */
    private static PackageInfo TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context) throws Throwable {
        int i;
        int i2;
        String string;
        Method method;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Class<?> cls = Class.forName("android.content.pm.PackageManager");
        byte[] bArr = $$a;
        byte b2 = (byte) (bArr[4] + 1);
        byte b3 = (byte) (b2 + 1);
        Object[] objArr = new Object[1];
        a(b2, b3, b3, objArr);
        Method method2 = cls.getMethod((String) objArr[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        byte b4 = (byte) (bArr[4] + 1);
        byte b5 = (byte) (b4 + 1);
        Object[] objArr2 = new Object[1];
        a(b4, b5, b5, objArr2);
        Method[] methodArr = {method2, cls2.getMethod((String) objArr2[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int iIndexOf = 2822 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 22;
            byte[] bArr2 = $$d;
            byte b6 = bArr2[7];
            Object[] objArr3 = new Object[1];
            c(b6, (byte) (-bArr2[5]), b6, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMakeMeasureSpec, iIndexOf, scrollBarSize, 1814927978, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getTouchSlop() >> 8), 2823 - Color.alpha(0), 22 - KeyEvent.getDeadChar(0, 0))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    Method method3 = declaredMethods[i4];
                    try {
                        Object[] objArr4 = new Object[1];
                        d(new char[]{55337, 19755, 61991, 26425, 35913, 12546, 42516, 51986, 28780, 58684, 2667, 48965, 9289, 18778, 65112, 25511, 34983, 15860, 41644, 55181, 31875, 57750, 5866, 48104}, TextUtils.indexOf("", "", 0, 0) + 38153, objArr4);
                        Class<?> cls3 = Class.forName((String) objArr4[0]);
                        Object[] objArr5 = new Object[1];
                        d(new char[]{55332, 16013, 5473, 27663, 17024, 22896, 45096, 38536, 60786, 50213, 55967, 12649}, Color.blue(0) + 59051, objArr5);
                        Object[] objArr6 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr5[0], null).invoke(method3, null)).intValue())};
                        Object[] objArr7 = new Object[1];
                        d(new char[]{55337, 20881, 52051, 17723, 65185, 26704, 57872, 7112, 38332, 3878, 47311, 12951, 44097, 9784, 24556, 51549, 17159, 64654, 30360, 57445, 6619, 37765, 3399, 34623, 12526, 43594}, 35251 - KeyEvent.keyCodeFromString(""), objArr7);
                        Class<?> cls4 = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        d(new char[]{55338, 34509, 26103, 50389, 41923, 731, 57819, 16589}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24317, objArr8);
                        if (((Boolean) cls4.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue()) {
                            Class cls5 = Long.TYPE;
                            Object[] objArr9 = new Object[1];
                            d(new char[]{55337, 19755, 61991, 26425, 35913, 12546, 42516, 51986, 28780, 58684, 2667, 48965, 9289, 18778, 65112, 25511, 34983, 15860, 41644, 55181, 31875, 57750, 5866, 48104}, ((Process.getThreadPriority(0) + 20) >> 6) + 38153, objArr9);
                            Class<?> cls6 = Class.forName((String) objArr9[0]);
                            Object[] objArr10 = new Object[1];
                            d(new char[]{55332, 45461, 2897, 58632, 32490, 51272, 41476, 15316, 38325, 28508, 63684, 21122, 11330}, (Process.myTid() >> 22) + 27059, objArr10);
                            if (cls5.equals(cls6.getMethod((String) objArr10[0], null).invoke(method3, null))) {
                                Object[] objArr11 = new Object[1];
                                d(new char[]{55337, 19755, 61991, 26425, 35913, 12546, 42516, 51986, 28780, 58684, 2667, 48965, 9289, 18778, 65112, 25511, 34983, 15860, 41644, 55181, 31875, 57750, 5866, 48104}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 38153, objArr11);
                                Class<?> cls7 = Class.forName((String) objArr11[0]);
                                Object[] objArr12 = new Object[1];
                                d(new char[]{55332, 4837, 19889, 47194, 62254, 11774, 6320, 21371, 36414, 63724, 13240, 28240, 22835, 37853, 52889, 14667, 29696}, ((byte) KeyEvent.getModifierMetaStateMask()) + 51908, objArr12);
                                Object[] objArr13 = (Object[]) cls7.getMethod((String) objArr12[0], null).invoke(method3, null);
                                if (objArr13.length == 2 && Long.TYPE.equals(objArr13[0])) {
                                    int i5 = b + 53;
                                    g = i5 % 128;
                                    if (i5 % 2 == 0) {
                                        Object[] objArr14 = new Object[1];
                                        d(new char[]{55337, 19755, 61991, 26425, 35913, 12546, 42516, 51986, 28780, 58684, 2667, 48965, 9289, 18778, 65112, 25511, 34983, 15860, 41644, 55181, 31875, 57750, 5866, 48104}, 38154 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr14);
                                        if (Class.forName((String) objArr14[0]).equals(objArr13[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                                int mode = View.MeasureSpec.getMode(0) + 2823;
                                                int iRed = Color.red(0) + 22;
                                                byte[] bArr3 = $$d;
                                                byte b7 = bArr3[7];
                                                Object[] objArr15 = new Object[1];
                                                c(b7, (byte) (-bArr3[5]), b7, objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, mode, iRed, 1814927978, false, (String) objArr15[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                                int iArgb = 2823 - Color.argb(0, 0, 0, 0);
                                                int offsetAfter = 22 - TextUtils.getOffsetAfter("", 0);
                                                byte[] bArr4 = $$d;
                                                byte b8 = bArr4[7];
                                                Object[] objArr16 = new Object[1];
                                                c(b8, (byte) (-bArr4[5]), b8, objArr16);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iArgb, offsetAfter, 1814927978, false, (String) objArr16[0], null);
                                            }
                                            try {
                                                Object[] objArr17 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                                                    int threadPriority2 = 2823 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                    int iIndexOf2 = 21 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                                    byte[] bArr5 = $$d;
                                                    Object[] objArr18 = new Object[1];
                                                    c(bArr5[54], bArr5[7], (byte) (-bArr5[5]), objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, threadPriority2, iIndexOf2, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr17)).longValue();
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                    } else {
                                        Object[] objArr19 = new Object[1];
                                        d(new char[]{55337, 19755, 61991, 26425, 35913, 12546, 42516, 51986, 28780, 58684, 2667, 48965, 9289, 18778, 65112, 25511, 34983, 15860, 41644, 55181, 31875, 57750, 5866, 48104}, 38154 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr19);
                                        if (Class.forName((String) objArr19[0]).equals(objArr13[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char threadPriority3 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                                int mode2 = View.MeasureSpec.getMode(0) + 2823;
                                                int iRed2 = Color.red(0) + 22;
                                                byte[] bArr6 = $$d;
                                                byte b9 = bArr6[7];
                                                Object[] objArr110 = new Object[1];
                                                c(b9, (byte) (-bArr6[5]), b9, objArr110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority3, mode2, iRed2, 1814927978, false, (String) objArr110[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                                int iArgb2 = 2823 - Color.argb(0, 0, 0, 0);
                                                int offsetAfter2 = 22 - TextUtils.getOffsetAfter("", 0);
                                                byte[] bArr7 = $$d;
                                                byte b10 = bArr7[7];
                                                Object[] objArr111 = new Object[1];
                                                c(b10, (byte) (-bArr7[5]), b10, objArr111);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iArgb2, offsetAfter2, 1814927978, false, (String) objArr111[0], null);
                                            }
                                            Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cArgb2 = (char) Color.argb(0, 0, 0, 0);
                                                int threadPriority4 = 2823 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                int iIndexOf3 = 21 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                                byte[] bArr8 = $$d;
                                                Object[] objArr113 = new Object[1];
                                                c(bArr8[54], bArr8[7], (byte) (-bArr8[5]), objArr113);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb2, threadPriority4, iIndexOf3, -2137287382, false, (String) objArr113[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i4++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int iIndexOf4 = 2822 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int i6 = 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte[] bArr9 = $$d;
            byte b11 = bArr9[7];
            Object[] objArr20 = new Object[1];
            c(b11, (byte) (-bArr9[5]), b11, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, iIndexOf4, i6, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int trimmedLength2 = TextUtils.getTrimmedLength("") + 2823;
            int iResolveOpacity = 22 - Drawable.resolveOpacity(0, 0);
            byte[] bArr10 = $$d;
            Object[] objArr22 = new Object[1];
            c((byte) (-bArr10[2]), bArr10[7], (byte) (-bArr10[5]), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, trimmedLength2, iResolveOpacity, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char trimmedLength3 = (char) (37657 - TextUtils.getTrimmedLength(""));
            int i7 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2719;
            int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 20;
            byte[] bArr11 = $$d;
            Object[] objArr24 = new Object[1];
            c((byte) (-bArr11[2]), bArr11[7], (byte) (-bArr11[5]), objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(trimmedLength3, i7, iIndexOf5, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j = -114054397;
        long j2 = 371;
        long j3 = (j2 * j) + (j2 * jLongValue);
        long j4 = -370;
        long j5 = -1;
        long j6 = jLongValue ^ j5;
        long jMyPid = Process.myPid();
        long j7 = jMyPid ^ j5;
        long j8 = j ^ j5;
        long j9 = j3 + ((((j6 | j7) ^ j5) | ((j8 | jMyPid) ^ j5)) * j4);
        long j10 = ((j8 | j7) ^ j5) | ((j6 | jMyPid) ^ j5);
        long j11 = j5 ^ (j | jLongValue);
        long j12 = j9 + (j4 * (j10 | j11)) + (((long) 370) * j11) + ((long) (-1696351448));
        int i8 = ~((int) SystemClock.elapsedRealtime());
        int i9 = ((int) (j12 >> 32)) & (393969010 + ((~(1432878458 | i8)) * 52) + (((~(1430706488 | i8)) | (~((-6519923) | i8)) | 2171970) * (-52)) + (((~(i8 | (-1430706489))) | 1426358536) * 52));
        int iMyUid = Process.myUid();
        int i10 = i9 | (((int) j12) & ((-1365736079) + (((~((-1669027629) | iMyUid)) | (-1188713258)) * (-948)) + ((~((~iMyUid) | (-1113215785))) * (-948)) + 1371348348));
        int i11 = i10 >>> 24;
        int i12 = i10 & ViewCompat.MEASURED_SIZE_MASK;
        boolean z = i11 != 0;
        if (z) {
            int i13 = b + 125;
            g = i13 % 128;
            i = 2;
            int i14 = i13 % 2;
            i2 = 1;
        } else {
            i = 2;
            i2 = 0;
        }
        if (z) {
            int i15 = g + 51;
            b = i15 % 128;
            if (i15 % i != 0) {
                throw null;
            }
            if (i12 >= i || (method = methodArr[i12]) == null) {
                string = null;
            } else {
                string = method.toString();
            }
        } else {
            string = null;
        }
        arrayList.add(string);
        if ((i11 + 6) * i2 != 0) {
            throw new RuntimeException("0");
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            int i16 = g + 109;
            b = i16 % 128;
            int i17 = i16 % 2;
            return packageInfo;
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
            return null;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6901549248154996392L;
    }
}
