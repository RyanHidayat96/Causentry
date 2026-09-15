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
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class lambdanew1androidxcameraviewPreviewView {
    boolean TuitionPaymentFragmentbindingInflater1;
    public final updateDisplayRotationIfNeeded TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {39, -79, 42};
    private static final int $$f = 42;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {49, 84, -120, 101, 8, 25, -39, 47, 11, 13, 2, -24, 55, 16, 3, 0, 25, -18, 28, 21, -2, 11, 15, -17, 28, 6, 27, -5, 15, -8, 29, 6, 28, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
    private static final int $$e = 143;
    private static final byte[] $$a = {5, 11, -122, -94, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 21;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int asInterface = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {45565, 14058, 49096, 9382, 44435, 4749, 39784, 26, 35123, 3639, 63298, 32711, 58565, 28119, 53944, 23441, 49265, 18759, 52800, 46907, 15391, 42255, 45561, 14056, 49101, 9380, 44431, 4737, 39784, 'f', 35129, 3621, 63232, 32736, 58581, 28105, 53929, 45565, 14058, 49096, 9382, 44435, 4749, 39784, 26, 35133, 3636, 63260, 32698, 58621, 28103, 53944, 23453, 49258, 18797, 52824, 46893, 15400, 42252, 11774, 37585, 7101, 32928, 57468, 26482, 61021, 29989, 64538, 17161, 51963, 20982, 55471, 24503, 42627, 11902, 46428, 15430, 33595, 2590, 37360, 6377, 45558, 14053, 49114, 9397, 44498, 4744, 39789, 'Z', 35131, 3690, 63295, 32749, 58575, 28112, 53929, 23449, 45557, 14048, 49097, 9402, 44424, 4749, 39800, 'M', 35092, 3621, 63263, 32764, 58623, 28107, 53928, 23441};
    private static long b = -1196775194247350652L;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 15
            int r8 = 53 - r8
            byte[] r0 = defpackage.lambdanew1androidxcameraviewPreviewView.$$a
            int r7 = r7 * 3
            int r7 = 84 - r7
            int r9 = 92 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2c:
            int r9 = r9 + r7
            int r7 = r9 + (-11)
            r9 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdanew1androidxcameraviewPreviewView.a(byte, int, byte, java.lang.Object[]):void");
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
    private static void d(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.lambdanew1androidxcameraviewPreviewView.$$d
            int r6 = r6 * 29
            int r6 = 33 - r6
            int r8 = r8 * 19
            int r8 = 103 - r8
            int r7 = r7 * 23
            int r7 = r7 + 30
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r8]
        L2c:
            int r6 = r6 + r4
            int r8 = r8 + 1
            int r6 = r6 + (-10)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdanew1androidxcameraviewPreviewView.d(short, int, byte, java.lang.Object[]):void");
    }

    public lambdanew1androidxcameraviewPreviewView(updateDisplayRotationIfNeeded updatedisplayrotationifneeded) {
        Intrinsics.checkNotNullParameter(updatedisplayrotationifneeded, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = updatedisplayrotationifneeded;
        this.TuitionPaymentFragmentbindingInflater1 = true;
    }

    public void b() {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.TuitionPaymentFragmentbindingInflater1 = true;
        int i5 = i3 + 121;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.TuitionPaymentFragmentbindingInflater1 = false;
        int i5 = i3 + 103;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
    }

    public void TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 75;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.TuitionPaymentFragmentbindingInflater1 = false;
        int i5 = i2 + 39;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte b2) {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(b2);
        int i4 = asInterface + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $10 + 87;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            j = 0;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i6 = $11 + 63;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i8])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2188;
                    int i10 = 41 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte b2 = (byte) ($$f & 7);
                    byte b3 = (byte) (b2 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, i9, i10, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(b), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33018), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3011, 26 - (Process.myPid() >> 22), 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 1;
                            byte b7 = (byte) (b6 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3376, TextUtils.indexOf((CharSequence) "", '0') + 18, -968507904, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i11 = $10 + 89;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            try {
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 1;
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - TextUtils.getOffsetBefore("", 0)), 3377 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17, -968507904, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                j = 0;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x01f5  */
    public void b(short s) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int mirror = 924 - AndroidCharacter.getMirror('0');
            int pressedStateDuration = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[28];
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 | 88), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, mirror, pressedStateDuration, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(Process.myTid() >> 22, 22 - Drawable.resolveOpacity(0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, TextUtils.getCapsMode("", 0, 0) + 15, (char) TextUtils.indexOf("", "", 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iAxisFromString = 875 - MotionEvent.axisFromString("");
            int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
            byte b4 = $$a[7];
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            a(b4, b5, (byte) (b5 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, iAxisFromString, deadChar, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                int gidForName = 875 - Process.getGidForName("");
                int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0');
                byte b6 = $$a[7];
                byte b7 = b6;
                Object[] objArr6 = new Object[1];
                a(b6, b7, b7, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, gidForName, iLastIndexOf, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i2 = (~System.identityHashCode(this)) | 182546243;
            int i3 = ((716086228 + (i2 * 495)) + (((~i2) | 42018305) * 495)) - 1821342838;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36, 26 - ((Process.getThreadPriority(0) + 20) >> 6), (char) TextUtils.getOffsetAfter("", 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(63 - (ViewConfiguration.getPressedStateDuration() >> 16), View.getDefaultSize(0, 0) + 18, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 20867), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(Color.blue(0) + 81, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, (char) View.getDefaultSize(0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(96 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 17 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1821342838};
                byte[] bArr2 = $$d;
                byte b8 = bArr2[66];
                byte b9 = bArr2[15];
                Object[] objArr13 = new Object[1];
                d(b8, b9, b9, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b10 = bArr2[15];
                byte b11 = bArr2[66];
                Object[] objArr14 = new Object[1];
                d(b10, b11, b11, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i10 = asInterface + 41;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                    int i11 = i10 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                        int iNormalizeMetaState = 876 - KeyEvent.normalizeMetaState(0);
                        int threadPriority = 10 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b12 = $$a[7];
                        byte b13 = b12;
                        Object[] objArr15 = new Object[1];
                        a(b12, b13, b13, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionChild, iNormalizeMetaState, threadPriority, 2012931276, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.resolveSize(0, 0) + 22, (char) View.combineMeasuredStates(0, 0), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(22 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getOffsetBefore("", 0) + 15, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                            int i12 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
                            byte b14 = $$a[7];
                            byte b15 = b14;
                            Object[] objArr18 = new Object[1];
                            a(b14, b15, (byte) (b15 | 52), objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i12, keyRepeatDelay, 2012020043, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                            int iMyPid = 876 - (Process.myPid() >> 22);
                            int iResolveSize = View.resolveSize(0, 0) + 10;
                            byte[] bArr3 = $$a;
                            byte b16 = bArr3[7];
                            byte b17 = bArr3[28];
                            Object[] objArr19 = new Object[1];
                            a(b16, b17, (byte) (b17 | 88), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode, iMyPid, iResolveSize, -1650998592, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
            asInterface = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i18 = i17 + (((1804341404 + (((-76027393) | (~iIdentityHashCode)) * (-490))) + (((~(iIdentityHashCode | 459350463)) | (-535377856)) * 490)) - 20603698);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr20[1])[0] = i20 ^ (i20 << 5);
            int i21 = asInterface + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
            int i22 = i21 % 2;
        } else {
            int[] iArr = new int[i14];
            int i23 = i14 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i25 = ~Process.myTid();
            int i26 = ~(646970567 | i25);
            int i27 = i24 + (-331353568) + ((i26 | (-606660339)) * 764) + (((~(i25 | (-606660339))) | 604562626) * (-1528)) + (((-44505654) | i26) * 764);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr21[1])[0] = i29 ^ (i29 << 5);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(s);
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        updateDisplayRotationIfNeeded updatedisplayrotationifneeded = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i4 == 0) {
            updatedisplayrotationifneeded.b(i);
        } else {
            updatedisplayrotationifneeded.b(i);
            throw null;
        }
    }

    public void b(long j) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(j);
        int i4 = asInterface + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, int r8, int r9) {
        /*
            byte[] r0 = defpackage.lambdanew1androidxcameraviewPreviewView.$$c
            int r8 = r8 * 3
            int r8 = r8 + 3
            int r7 = r7 * 3
            int r7 = 115 - r7
            int r9 = r9 * 2
            int r9 = 1 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r5 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L29:
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdanew1androidxcameraviewPreviewView.$$g(byte, int, int):java.lang.String");
    }
}
