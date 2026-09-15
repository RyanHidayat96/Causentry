package defpackage;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.android.libraries.places.internal.zzrt;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getCompleter implements lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor {
    private /* synthetic */ getExif TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {48, -110, 22, 55};
    private static final int $$f = 124;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {84, 10, 24, -102, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 73;
    private static final byte[] $$a = {39, -79, 42, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 36, 19, 4, 10, -8, 8, 0, -22, 22, 15, -11, 8, 0, 15, 0, 17, -34, 19, 4, 10, -8, 8, 0, -26, 39, -6, 11};
    private static final int $$b = 16;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] b = {59705, 59746, 59744, 59749, 59751, 59730, 59702, 59738, 59744, 59759, 59747, 59746, 59758, 59744, 59739, 59713, 59745, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59785, 59899, 59877, 59890, 59901, 59900, 59900, 59900, 59888, 59401, 59894, 59901, 59716, 59794, 59796, 59796, 59760, 59786, 59793, 59792, 59797, 59765, 59791, 59796, 59794, 59798, 59799, 59795, 59796, 59790, 59770, 59801, 59798, 59793, 59792, 59792, 59792, 59796, 59759, 59866, 59864, 59865, 59845, 59824, 59855, 59865, 59783, 59420, 59395, 59398, 59408, 59418, 59398, 59398, 59416, 59393, 59401, 59416, 59408, 59804, 59425, 59435, 59433, 59432, 59415, 59433, 59411, 59397, 59412, 59412, 59414, 59412, 59433, 59433, 59434, 59410};

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 6
            int r8 = r8 + 97
            int r6 = r6 * 19
            int r6 = r6 + 14
            byte[] r0 = defpackage.getCompleter.$$a
            int r7 = r7 * 32
            int r7 = 34 - r7
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
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r7]
        L2b:
            int r8 = r8 + r3
            int r8 = r8 + (-2)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getCompleter.a(byte, int, int, java.lang.Object[]):void");
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
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.getCompleter.$$d
            int r8 = 103 - r8
            int r7 = r7 * 52
            int r7 = 56 - r7
            int r6 = r6 * 52
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getCompleter.c(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ba A[PHI: r8
  0x00ba: PHI (r8v5 char) = (r8v4 char), (r8v23 char) binds: [B:26:0x00b8, B:23:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d9 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:7:0x002c, B:9:0x003d, B:10:0x0071, B:34:0x0129, B:36:0x0142, B:37:0x0181, B:40:0x0194, B:42:0x01a1, B:44:0x01e1, B:28:0x00c1, B:30:0x00d9, B:31:0x0112), top: B:72:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0122  */
    /* JADX WARN: Code duplicated, block: B:36:0x0142 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:7:0x002c, B:9:0x003d, B:10:0x0071, B:34:0x0129, B:36:0x0142, B:37:0x0181, B:40:0x0194, B:42:0x01a1, B:44:0x01e1, B:28:0x00c1, B:30:0x00d9, B:31:0x0112), top: B:72:0x002c }] */
    private static void d(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char c;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = b;
        char c2 = '0';
        if (cArr != null) {
            int i8 = $10 + 89;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = new Object[i4];
                    objArr2[i2] = Integer.valueOf(cArr[i10]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", c2, i2, i2) + i4);
                        int mode = 1270 - View.MeasureSpec.getMode(i2);
                        int deadChar = 18 - KeyEvent.getDeadChar(i2, i2);
                        byte b2 = (byte) i2;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, mode, deadChar, 407021364, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr2)).charValue();
                    i10++;
                    i2 = 0;
                    i4 = 1;
                    c2 = '0';
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
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i3, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            char c3 = 0;
            while (setvideostabilizationmode.b < i5) {
                int i11 = $11 + 85;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    c = 1;
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i12 = setvideostabilizationmode.b;
                        char c4 = cArr3[setvideostabilizationmode.b];
                        Object[] objArr3 = new Object[2];
                        objArr3[c] = Integer.valueOf(c3);
                        objArr3[0] = Integer.valueOf(c4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 3226, 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2133916302, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).charValue();
                    } else {
                        int i13 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c3)};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getSize(0) + 29944), 1755 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 24, 387247676, false, $$g(b6, b7, (byte) (b7 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4)).charValue();
                    }
                } else {
                    c = 1;
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i14 = setvideostabilizationmode.b;
                        char c5 = cArr3[setvideostabilizationmode.b];
                        Object[] objArr5 = new Object[2];
                        objArr5[c] = Integer.valueOf(c3);
                        objArr5[0] = Integer.valueOf(c5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 3226, 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2133916302, false, $$g(b8, b9, b9), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr5)).charValue();
                    } else {
                        int i15 = setvideostabilizationmode.b;
                        Object[] objArr6 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c3)};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getSize(0) + 29944), 1755 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 24, 387247676, false, $$g(b10, b11, (byte) (b11 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).charValue();
                    }
                }
                c3 = cArr4[setvideostabilizationmode.b];
                Object[] objArr7 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b12 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1753 - AndroidCharacter.getMirror('0'), 21 - View.MeasureSpec.getSize(0), -1434471773, false, $$g(b12, (byte) (b12 | 6), b12), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr7);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i16 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i16, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i16);
        }
        if (!(!z)) {
            int i17 = $11 + 85;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr6 = new char[i5];
            int i19 = 0;
            while (true) {
                setvideostabilizationmode.b = i19;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                i19 = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i20 = 0;
            loop3: while (true) {
                setvideostabilizationmode.b = i20;
                while (true) {
                    if (setvideostabilizationmode.b >= i5) {
                        break loop3;
                    }
                    int i21 = $11 + 79;
                    $10 = i21 % 128;
                    if (i21 % 2 != 0) {
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] % iArr[2]);
                        setvideostabilizationmode.b = setvideostabilizationmode.b;
                    }
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i20 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // defpackage.lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        getExif getexif = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i3 != 0) {
            getexif.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } else {
            getexif.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i4 = 6 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:46:0x0300  */
    /* JADX WARN: Code duplicated, block: B:50:0x035d A[Catch: all -> 0x05ed, TryCatch #1 {all -> 0x05ed, blocks: (B:48:0x0348, B:50:0x035d, B:51:0x03a4, B:64:0x041a, B:66:0x0427, B:67:0x046b, B:69:0x0486, B:70:0x04cc), top: B:99:0x0348 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x05ce  */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(List list) throws Throwable {
        int i;
        boolean z;
        int i2;
        String string;
        Method method;
        Method[] declaredMethods;
        int length;
        Class<?> cls;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentbindingInflater1;
        int i5 = (i4 ^ 87) + ((i4 & 87) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArr = $$a;
        int i7 = 12;
        byte b2 = bArr[12];
        Object[] objArr = new Object[1];
        a(b2, b2, bArr[27], objArr);
        Class<?> cls2 = Class.forName((String) objArr[0]);
        byte b3 = bArr[27];
        Object[] objArr2 = new Object[1];
        a(b3, b3, bArr[12], objArr2);
        Method method2 = cls2.getMethod((String) objArr2[0], String.class, Integer.TYPE);
        Class<?> cls3 = Class.forName("android.app.ApplicationPackageManager");
        byte b4 = bArr[27];
        Object[] objArr3 = new Object[1];
        a(b4, b4, bArr[12], objArr3);
        Method[] methodArr = {method2, cls3.getMethod((String) objArr3[0], String.class, Integer.TYPE)};
        int i8 = -2001519171;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2823;
            int iMyPid = 22 - (Process.myPid() >> 22);
            byte[] bArr2 = $$d;
            Object[] objArr4 = new Object[1];
            c(bArr2[7], (byte) (-bArr2[5]), bArr2[54], objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, absoluteGravity, iMyPid, 1814927978, false, (String) objArr4[0], null);
        }
        Object obj = null;
        int i9 = 24;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            int i10 = TuitionPaymentFragmentbindingInflater1 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            int i11 = 8;
            if (i10 % 2 != 0) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", "", 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 2823, TextUtils.indexOf("", "", 0, 0) + 22)).getDeclaredMethods();
                length = declaredMethods.length;
            } else {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.rgb(0, 0, 0) + 16777216), 2823 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 22)).getDeclaredMethods();
                length = declaredMethods.length;
            }
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    Method method3 = declaredMethods[i12];
                    try {
                        byte[] bArr3 = new byte[i9];
                        // fill-array-data instruction
                        bArr3[0] = 0;
                        bArr3[1] = 1;
                        bArr3[2] = 1;
                        bArr3[3] = 0;
                        bArr3[4] = 1;
                        bArr3[5] = 0;
                        bArr3[6] = 1;
                        bArr3[7] = 0;
                        bArr3[8] = 1;
                        bArr3[9] = 0;
                        bArr3[10] = 1;
                        bArr3[11] = 0;
                        bArr3[12] = 1;
                        bArr3[13] = 1;
                        bArr3[14] = 0;
                        bArr3[15] = 1;
                        bArr3[16] = 1;
                        bArr3[17] = 1;
                        bArr3[18] = 1;
                        bArr3[19] = 0;
                        bArr3[20] = 1;
                        bArr3[21] = 1;
                        bArr3[22] = 1;
                        bArr3[23] = 1;
                        Object[] objArr5 = new Object[1];
                        d(new int[]{0, i9, 0, 0}, true, bArr3, objArr5);
                        Class<?> cls4 = Class.forName((String) objArr5[0]);
                        int[] iArr = {i9, i7, 144, 10};
                        byte[] bArr4 = new byte[i7];
                        // fill-array-data instruction
                        bArr4[0] = 0;
                        bArr4[1] = 1;
                        bArr4[2] = 0;
                        bArr4[3] = 1;
                        bArr4[4] = 1;
                        bArr4[5] = 1;
                        bArr4[6] = 1;
                        bArr4[7] = 0;
                        bArr4[8] = 1;
                        bArr4[9] = 1;
                        bArr4[10] = 0;
                        bArr4[11] = 0;
                        Object[] objArr6 = new Object[1];
                        d(iArr, false, bArr4, objArr6);
                        Object[] objArr7 = {Integer.valueOf(((Integer) cls4.getMethod((String) objArr6[0], null).invoke(method3, null)).intValue())};
                        Object[] objArr8 = new Object[1];
                        d(new int[]{36, 26, 52, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1}, objArr8);
                        Class<?> cls5 = Class.forName((String) objArr8[0]);
                        int[] iArr2 = {62, i11, 100, 0};
                        byte[] bArr5 = new byte[i11];
                        // fill-array-data instruction
                        bArr5[0] = 1;
                        bArr5[1] = 1;
                        bArr5[2] = 1;
                        bArr5[3] = 1;
                        bArr5[4] = 1;
                        bArr5[5] = 1;
                        bArr5[6] = 1;
                        bArr5[7] = 0;
                        Object[] objArr9 = new Object[1];
                        d(iArr2, true, bArr5, objArr9);
                        if (((Boolean) cls5.getMethod((String) objArr9[0], Integer.TYPE).invoke(null, objArr7)).booleanValue()) {
                            Class cls6 = Long.TYPE;
                            byte[] bArr6 = new byte[i9];
                            // fill-array-data instruction
                            bArr6[0] = 0;
                            bArr6[1] = 1;
                            bArr6[2] = 1;
                            bArr6[3] = 0;
                            bArr6[4] = 1;
                            bArr6[5] = 0;
                            bArr6[6] = 1;
                            bArr6[7] = 0;
                            bArr6[8] = 1;
                            bArr6[9] = 0;
                            bArr6[10] = 1;
                            bArr6[11] = 0;
                            bArr6[12] = 1;
                            bArr6[13] = 1;
                            bArr6[14] = 0;
                            bArr6[15] = 1;
                            bArr6[16] = 1;
                            bArr6[17] = 1;
                            bArr6[18] = 1;
                            bArr6[19] = 0;
                            bArr6[20] = 1;
                            bArr6[21] = 1;
                            bArr6[22] = 1;
                            bArr6[23] = 1;
                            Object[] objArr10 = new Object[1];
                            d(new int[]{0, i9, 0, 0}, true, bArr6, objArr10);
                            Class<?> cls7 = Class.forName((String) objArr10[0]);
                            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i14 = (i13 ^ 59) + ((i13 & 59) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                            int i15 = i14 % 2;
                            Object[] objArr11 = new Object[1];
                            d(new int[]{70, 13, 167, 6}, false, new byte[]{1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1}, objArr11);
                            if (cls6.equals(cls7.getMethod((String) objArr11[0], null).invoke(method3, null))) {
                                int i16 = TuitionPaymentFragmentbindingInflater1 + 123;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                                if (i16 % 2 != 0) {
                                    Object[] objArr12 = new Object[1];
                                    d(new int[]{0, 24, 0, 0}, false, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr12);
                                    cls = Class.forName((String) objArr12[0]);
                                } else {
                                    Object[] objArr13 = new Object[1];
                                    d(new int[]{0, 24, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr13);
                                    cls = Class.forName((String) objArr13[0]);
                                }
                                Object[] objArr14 = new Object[1];
                                d(new int[]{83, 17, 182, 4}, false, new byte[]{1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0}, objArr14);
                                Object[] objArr15 = (Object[]) cls.getMethod((String) objArr14[0], null).invoke(method3, null);
                                if (objArr15.length == 2) {
                                    int i17 = TuitionPaymentFragmentbindingInflater1 + 113;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                                    int i18 = i17 % 2;
                                    if (Long.TYPE.equals(objArr15[0])) {
                                        zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        Object[] objArr16 = new Object[1];
                                        d(new int[]{0, 24, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr16);
                                        Class<?> cls8 = Class.forName((String) objArr16[0]);
                                        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i20 = (i19 ^ 9) + ((i19 & 9) << 1);
                                        TuitionPaymentFragmentbindingInflater1 = i20 % 128;
                                        if (i20 % 2 == 0) {
                                            if (cls8.equals(objArr15[0])) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                                                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2823;
                                                    int i21 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                    byte[] bArr7 = $$d;
                                                    Object[] objArr17 = new Object[1];
                                                    c(bArr7[7], (byte) (-bArr7[5]), bArr7[54], objArr17);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iKeyCodeFromString, i21, 1814927978, false, (String) objArr17[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2823;
                                                    int minimumFlingVelocity = 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    byte[] bArr8 = $$d;
                                                    Object[] objArr18 = new Object[1];
                                                    c(bArr8[7], (byte) (-bArr8[5]), bArr8[54], objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, windowTouchSlop, minimumFlingVelocity, 1814927978, false, (String) objArr18[0], null);
                                                }
                                                try {
                                                    Object[] objArr19 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2823;
                                                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 23;
                                                        byte[] bArr9 = $$d;
                                                        byte b5 = (byte) (-bArr9[5]);
                                                        byte b6 = bArr9[7];
                                                        Object[] objArr20 = new Object[1];
                                                        c(b5, b6, b6, objArr20);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, threadPriority, iIndexOf, -2137287382, false, (String) objArr20[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr19)).longValue();
                                                    i = -2001519171;
                                                } catch (Throwable th) {
                                                    Throwable cause = th.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } else if (!(!cls8.equals(objArr15[1]))) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                                                int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 2823;
                                                int i22 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                byte[] bArr10 = $$d;
                                                Object[] objArr110 = new Object[1];
                                                c(bArr10[7], (byte) (-bArr10[5]), bArr10[54], objArr110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iKeyCodeFromString2, i22, 1814927978, false, (String) objArr110[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                                                int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2823;
                                                int minimumFlingVelocity2 = 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                byte[] bArr11 = $$d;
                                                Object[] objArr111 = new Object[1];
                                                c(bArr11[7], (byte) (-bArr11[5]), bArr11[54], objArr111);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType2, windowTouchSlop2, minimumFlingVelocity2, 1814927978, false, (String) objArr111[0], null);
                                            }
                                            Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cKeyCodeFromString2 = (char) KeyEvent.keyCodeFromString("");
                                                int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 2823;
                                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 23;
                                                byte[] bArr12 = $$d;
                                                byte b7 = (byte) (-bArr12[5]);
                                                byte b8 = bArr12[7];
                                                Object[] objArr21 = new Object[1];
                                                c(b7, b8, b8, objArr21);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString2, threadPriority2, iIndexOf2, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                            i = -2001519171;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        i12++;
                        i7 = 12;
                        i8 = -2001519171;
                        i9 = 24;
                        i11 = 8;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } else {
                    i = i8;
                }
            }
        } else {
            i = i8;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2823;
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22;
            byte[] bArr13 = $$d;
            Object[] objArr22 = new Object[1];
            c(bArr13[7], (byte) (-bArr13[5]), bArr13[54], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(absoluteGravity2, maximumDrawingCacheSize, doubleTapTimeout, 1814927978, false, (String) objArr22[0], null);
        }
        Object[] objArr23 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2823;
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 22;
            byte[] bArr14 = $$d;
            byte b9 = (byte) (-bArr14[5]);
            byte b10 = bArr14[7];
            Object[] objArr24 = new Object[1];
            c(b9, b10, (byte) (b10 + 5), objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize2, iNormalizeMetaState, maxKeyCode, 1025296417, false, (String) objArr24[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr23);
        Object[] objArr25 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf2 = (char) (37656 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int iArgb = 2720 - Color.argb(0, 0, 0, 0);
            int iAlpha = 19 - Color.alpha(0);
            byte[] bArr15 = $$d;
            byte b11 = (byte) (-bArr15[5]);
            byte b12 = bArr15[7];
            Object[] objArr26 = new Object[1];
            c(b11, b12, (byte) (b12 + 5), objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf2, iArgb, iAlpha, -1568796068, false, (String) objArr26[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr25)).longValue();
        long j = 224516383;
        long j2 = -919;
        long j3 = (j2 * j) + (j2 * jLongValue);
        long j4 = 920;
        long j5 = -1;
        long j6 = j ^ j5;
        long j7 = jLongValue ^ j5;
        long j8 = j6 | j7;
        long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
        long j9 = jMaxMemory ^ j5;
        long j10 = j3 + ((((j8 | jMaxMemory) ^ j5) | (((j7 | j9) | j) ^ j5)) * j4) + (((j8 ^ j5) | ((j6 | j9) ^ j5)) * j4) + (j4 * ((((j7 | j) | jMaxMemory) ^ j5) | ((j8 | j9) ^ j5) | (((j6 | jLongValue) | jMaxMemory) ^ j5))) + ((long) (-2034922228));
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i23 = ((int) (j10 >> 32)) & (((((~((-414864890) | iUptimeMillis)) | 609593928) * 262) - 1208084700) + (((~((~iUptimeMillis) | (-414864890))) | 609593928) * 262));
        int iMyUid = Process.myUid();
        int i24 = ~iMyUid;
        int i25 = (~(1387011140 | i24)) | 5382433;
        int i26 = ~(iMyUid | (-1342178305));
        int i27 = i23 | (((int) j10) & ((-1089942722) + ((i25 | i26) * (-713)) + (i26 * 1426) + ((~(50215269 | i24)) * 713)));
        int i28 = i27 >>> 24;
        int i29 = i27 & ViewCompat.MEASURED_SIZE_MASK;
        if (i28 != 0) {
            int i30 = TuitionPaymentFragmentbindingInflater1 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
            int i31 = i30 % 2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
            int i33 = i32 % 128;
            TuitionPaymentFragmentbindingInflater1 = i33;
            int i34 = i32 % 2;
            int i35 = i33 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i35 % 128;
            int i36 = i35 % 2;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (z) {
            int i37 = TuitionPaymentFragmentbindingInflater1 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i37 % 128;
            if (i37 % 2 != 0) {
                throw null;
            }
            if (i29 >= 2 || (method = methodArr[i29]) == null) {
                string = null;
            } else {
                string = method.toString();
                int i38 = TuitionPaymentFragmentbindingInflater1;
                int i39 = (i38 ^ 103) + ((i38 & 103) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i39 % 128;
                int i40 = i39 % 2;
            }
        } else {
            string = null;
        }
        list.add(string);
        int i41 = ((i28 ^ 6) + ((6 & i28) << 1)) * i2;
        int i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentbindingInflater1 = i42 % 128;
        if (i42 % 2 != 0) {
            return i41;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, byte r6, byte r7) {
        /*
            int r5 = r5 * 3
            int r0 = r5 + 1
            int r6 = r6 + 99
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r1 = defpackage.getCompleter.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r5
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r7 = r7 + 1
            r3 = r1[r7]
        L26:
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getCompleter.$$g(int, byte, byte):java.lang.String");
    }
}
