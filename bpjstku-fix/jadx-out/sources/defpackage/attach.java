package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class attach {
    abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z);

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    /* synthetic */ attach(byte b) {
        this();
    }

    private attach() {
    }

    public static class TuitionPaymentFragmentbindingInflater1 extends attach {
        private volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static final byte[] $$c = {27, -8, 5, 78};
        private static final int $$f = 72;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {49, 89, 41, 48, 15, 1, -60, 72, 1, 7, -17, 20, -10, 19, -2, -63, 69, -4, -3, 1, 21, 3, -1, -62, 37, 28, -3, 1, 21, 3, -1, -72, 51, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, -15, 10, 8, -7, 8, 8, -4, -27, 40, -5, 9, -8, 22, -12, 16, -62, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, 2, 0, -8, 1, 9, -5, 14, 0, 8, 1, 0, 8, -6, 2, 21, -10, -1, 21, -39, 37, -8, 4, 10, -5, 4, 4, -2, 23, -6, 11, -62};
        private static final int $$e = 242;
        private static final byte[] $$a = {73, 55, 58, 33, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$b = 146;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static char[] b = {59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59745, 59859, 59857, 59862, 59860, 59870, 59865, 59841, 59841, 59864, 59856, 59883, 59868, 59870, 59868, 59715, 59804, 59794, 59792, 59819, 59799, 59805, 59762, 59772, 59795, 59819, 59764, 59756, 59785, 59792, 59797, 59796, 59796, 59797, 59821, 59805, 59781, 59798, 59792, 59800, 59801, 59748, 59880, 59872, 59871, 59865, 59873, 59875, 59887, 59883, 59863, 59887, 59875, 59885, 59875, 59881, 59885, 59878, 59879, 59699, 59750, 59771, 59772, 59761, 59745, 59727, 59717, 59749, 59744, 59745, 59738, 59712, 59748, 59748, 59746, 59711, 59757, 59759, 59746, 59770, 59749, 59749, 59773, 59755, 59743, 59745, 59750, 59742, 59730, 59746, 59759};

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 4
                int r7 = r7 * 52
                int r7 = 53 - r7
                byte[] r0 = attach.TuitionPaymentFragmentbindingInflater1.$$a
                int r8 = 103 - r8
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L13
                r8 = r6
                r3 = r7
                r4 = r2
                goto L2c
            L13:
                r3 = r2
            L14:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                r4 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r3 = r3 + r6
                int r6 = r3 + (-11)
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: attach.TuitionPaymentFragmentbindingInflater1.a(byte, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(short r5, byte r6, short r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 14
                int r0 = 67 - r7
                int r6 = r6 * 15
                int r6 = 99 - r6
                byte[] r1 = attach.TuitionPaymentFragmentbindingInflater1.$$d
                int r5 = r5 * 66
                int r5 = 70 - r5
                byte[] r0 = new byte[r0]
                int r7 = 66 - r7
                r2 = 0
                if (r1 != 0) goto L18
                r3 = r5
                r4 = r2
                goto L2a
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L28
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L28:
                r3 = r1[r5]
            L2a:
                int r5 = r5 + 1
                int r6 = r6 + r3
                int r6 = r6 + (-3)
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: attach.TuitionPaymentFragmentbindingInflater1.d(short, byte, short, java.lang.Object[]):void");
        }

        public TuitionPaymentFragmentbindingInflater1() {
            super((byte) 0);
        }

        @Override // defpackage.attach
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                throw new IllegalStateException("Already released");
            }
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2 % 2;
            setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
            int i3 = 0;
            int i4 = iArr[0];
            int i5 = 1;
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            char[] cArr = b;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i9 = 0;
                while (i9 < length) {
                    try {
                        Object[] objArr2 = new Object[i5];
                        objArr2[i3] = Integer.valueOf(cArr[i9]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char threadPriority = (char) ((Process.getThreadPriority(i3) + 20) >> 6);
                            int iIndexOf = 1270 - TextUtils.indexOf("", "");
                            int iResolveSize = View.resolveSize(i3, i3) + 18;
                            byte b2 = (byte) i5;
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, iIndexOf, iResolveSize, 407021364, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i9++;
                        i3 = 0;
                        i5 = 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i6];
            System.arraycopy(cArr, i4, cArr3, 0, i6);
            if (bArr != null) {
                int i10 = $10 + 65;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char[] cArr4 = new char[i6];
                setvideostabilizationmode.b = 0;
                char c = 0;
                while (setvideostabilizationmode.b < i6) {
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i12 = setvideostabilizationmode.b;
                        Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3225, 13 - (KeyEvent.getMaxKeyCode() >> 16), 2133916302, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } else {
                        int i13 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 2;
                            byte b7 = (byte) (b6 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29945), 1755 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.makeMeasureSpec(0, 0) + 23, 387247676, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[setvideostabilizationmode.b];
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1705, 21 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1434471773, false, $$g((byte) ($$c[2] + 1), b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    int i14 = $10 + 43;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                }
                cArr3 = cArr4;
            }
            if (i8 > 0) {
                int i16 = $10 + 79;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    char[] cArr5 = new char[i6];
                    i = 0;
                    System.arraycopy(cArr3, 0, cArr5, 0, i6);
                    int i17 = i6 % i8;
                    System.arraycopy(cArr5, 0, cArr3, i17, i8);
                    System.arraycopy(cArr5, i8, cArr3, 1, i17);
                } else {
                    i = 0;
                    char[] cArr6 = new char[i6];
                    System.arraycopy(cArr3, 0, cArr6, 0, i6);
                    int i18 = i6 - i8;
                    System.arraycopy(cArr6, 0, cArr3, i18, i8);
                    System.arraycopy(cArr6, i8, cArr3, 0, i18);
                }
            } else {
                i = 0;
            }
            if (z) {
                char[] cArr7 = new char[i6];
                while (true) {
                    setvideostabilizationmode.b = i;
                    if (setvideostabilizationmode.b >= i6) {
                        break;
                    }
                    cArr7[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                    i = setvideostabilizationmode.b + 1;
                }
                cArr3 = cArr7;
            }
            if (i7 > 0) {
                int i19 = $10 + 101;
                $11 = i19 % 128;
                char c2 = 2;
                int i20 = i19 % 2;
                setvideostabilizationmode.b = 0;
                while (setvideostabilizationmode.b < i6) {
                    cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[c2]);
                    setvideostabilizationmode.b++;
                    int i21 = $10 + 85;
                    $11 = i21 % 128;
                    if (i21 % 2 == 0) {
                        int i22 = 5 % 2;
                    }
                    c2 = 2;
                }
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x01f0  */
        @Override // defpackage.attach
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                int gidForName = Process.getGidForName("") + 877;
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 10;
                byte b2 = $$a[5];
                byte b3 = (byte) (-b2);
                Object[] objArr2 = new Object[1];
                a(b2, b3, (byte) (b3 + 4), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, gidForName, absoluteGravity, 252381699, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new int[]{22, 15, 111, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                int i2 = 877 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int packedPositionType = 10 - ExpandableListView.getPackedPositionType(0L);
                byte[] bArr = $$a;
                Object[] objArr5 = new Object[1];
                a(bArr[5], bArr[7], bArr[54], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i2, packedPositionType, 2009631821, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i3 = TuitionPaymentFragmentbindingInflater1 + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int iGreen = 876 - Color.green(0);
                    int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte[] bArr2 = $$a;
                    Object[] objArr6 = new Object[1];
                    a((byte) 51, (byte) (-bArr2[5]), bArr2[7], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, iGreen, minimumFlingVelocity, 256017550, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i5 = 2001032466 + (((~(797020038 | iIdentityHashCode)) | 837330267) * (-366)) + (((~(iIdentityHashCode | 1072279519)) | 562070786) * 366) + 1373800781;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new int[]{37, 26, 48, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new int[]{63, 18, 122, 14}, false, new byte[]{1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (applicationContext instanceof ContextWrapper) {
                        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                        TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                        int i9 = i8 % 2;
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
                c(new int[]{81, 16, 4, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new int[]{97, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 1373800781};
                    byte[] bArr3 = $$d;
                    byte b4 = bArr3[5];
                    byte b5 = bArr3[92];
                    Object[] objArr13 = new Object[1];
                    d(b4, b5, b5, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr3[92];
                    byte b7 = bArr3[5];
                    Object[] objArr14 = new Object[1];
                    d(b6, b7, b7, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                            int i10 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                            int iIndexOf = TextUtils.indexOf("", "") + 10;
                            byte[] bArr4 = $$a;
                            Object[] objArr16 = new Object[1];
                            a((byte) 51, (byte) (-bArr4[5]), bArr4[7], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, i10, iIndexOf, 256017550, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(new int[]{22, 15, 111, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                int touchSlop = 876 - (ViewConfiguration.getTouchSlop() >> 8);
                                int i11 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                byte[] bArr5 = $$a;
                                Object[] objArr19 = new Object[1];
                                a(bArr5[5], bArr5[7], bArr5[54], objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, touchSlop, i11, 2009631821, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                                int i12 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
                                int iResolveSize = 10 - View.resolveSize(0, 0);
                                byte b8 = $$a[5];
                                byte b9 = (byte) (-b8);
                                Object[] objArr20 = new Object[1];
                                a(b8, b9, (byte) (b9 + 4), objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, i12, iResolveSize, 252381699, false, (String) objArr20[0], null);
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
            int i13 = ((int[]) objArr[2])[0];
            int i14 = ((int[]) objArr[0])[0];
            if (i14 == i13) {
                int i15 = TuitionPaymentFragmentbindingInflater1 + 11;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                int i16 = i15 % 2;
                int i17 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iMyUid = Process.myUid();
                int i18 = 904766436 + ((iMyUid | 114699022) * (-50));
                int i19 = ~((-43002375) | iMyUid);
                int i20 = ~iMyUid;
                int i21 = i17 + i18 + ((i19 | (~(117391167 | i20))) * 50) + (((~(i20 | 114699022)) | (~(74388793 | i20)) | (-117391168)) * 50);
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr21[1])[0] = i23 ^ (i23 << 5);
            } else {
                int[] iArr = new int[i14];
                int i24 = i14 - 1;
                iArr[i24] = 1;
                Toast.makeText((Context) null, iArr[((i14 * i24) % 2) - 1], 1).show();
                int i25 = ((int[]) objArr[1])[0];
                Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i26 = i25 + (-126134553) + (((~(iIdentityHashCode2 | (-3006327))) | (-43316556)) * (-465)) + (((-3006327) | (~((-43316556) | iIdentityHashCode2))) * 930) + ((iIdentityHashCode2 | (-316739)) * 465);
                int i27 = (i26 << 13) ^ i26;
                int i28 = i27 ^ (i27 >>> 17);
                ((int[]) objArr22[1])[0] = i28 ^ (i28 << 5);
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r6, int r7, byte r8) {
            /*
                byte[] r0 = attach.TuitionPaymentFragmentbindingInflater1.$$c
                int r7 = r7 * 3
                int r7 = 4 - r7
                int r6 = r6 + 99
                int r8 = r8 * 2
                int r8 = 1 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r6
                r6 = r8
                r4 = r2
                goto L25
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r8) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                r3 = r0[r7]
            L25:
                int r6 = r6 + r3
                int r7 = r7 + 1
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: attach.TuitionPaymentFragmentbindingInflater1.$$g(byte, int, byte):java.lang.String");
        }
    }
}
