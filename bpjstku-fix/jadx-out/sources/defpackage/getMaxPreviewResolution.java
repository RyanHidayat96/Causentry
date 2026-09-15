package defpackage;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getMaxPreviewResolution implements Function1 {
    private /* synthetic */ PreviewDelayWhenVideoCaptureIsBoundQuirk TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {55, -47, -47, 67};
    private static final int $$f = 214;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {58, 66, -14, -31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 34;
    private static final byte[] $$a = {119, -102, -34, -3, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 36, 19, 4, 10, -8, 8, 0, -22, 22, 15, -11, 8, 0, 15, 0, 17, -34, 19, 4, 10, -8, 8, 0, -26, 39, -6, 11};
    private static final int $$b = 29;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] b = {39188, 20554, 2978, 49888, 48132, 30651, 12001, 6211, 54193, 35501, 17502, 16316, 63204, 41027, 39869, 21222, 3162, 51189, 48841, 26708, 9134, 6895, 54367, 36793, 44453, 25842, 16156, 63088, 35065, 17167, 6741, 11511, 59139, 48730, 28898, 2838, 45558, 30888, 9024, 59906, 38118, 24409, 1539, 12449, 64339, 41551, 27836, 5982, 56838, 34977, 45919, 31236, 9400, 61207, 38443, 16572, 2908, 12812, 64692, 42838, 28161, 6307, 20671, 39408, 49714, 2888, 30198, 48662, 59230, 53728, 45563, 30892, 9026, 59953, 38061, 24385, 1559, 12477, 64346, 41525, 27831, 5963, 56837, 45563, 30892, 9026, 59955, 38057, 24391, 1539, 12450, 64337, 41493, 27819, 5961, 56884, 34996, 45898, 31234, 9407};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 7176403511946868937L;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 32
            int r8 = 36 - r8
            int r6 = r6 * 6
            int r6 = 103 - r6
            byte[] r0 = defpackage.getMaxPreviewResolution.$$a
            int r7 = r7 * 19
            int r1 = 33 - r7
            byte[] r1 = new byte[r1]
            int r7 = 32 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r7
            r6 = r8
            r3 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L31:
            int r8 = r8 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-2)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getMaxPreviewResolution.a(byte, byte, int, java.lang.Object[]):void");
    }

    private static void c(int i, short s, short s2, Object[] objArr) {
        int i2 = 55 - (s2 * 52);
        int i3 = s * 52;
        int i4 = i + 84;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 = (i3 + i4) - 11;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2++;
                i4 = (i4 + bArr[i2]) - 11;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitB = PreviewDelayWhenVideoCaptureIsBoundQuirk.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return unitB;
    }

    private static void d(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $10 + 115;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i6 = $11 + 11;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(b[i - i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), View.MeasureSpec.getSize(0) + 2187, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 40, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-16744199) - Color.rgb(0, 0, 0)), 3011 - TextUtils.getCapsMode("", 0, 0), 25 - ExpandableListView.getPackedPositionChild(0L), 321985076, false, $$g(b4, b5, (byte) (b5 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 3376 - View.MeasureSpec.getSize(0), (ViewConfiguration.getTouchSlop() >> 8) + 17, -968507904, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
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
            } else {
                int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr5 = {Integer.valueOf(b[i + i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2187, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 40, 841711447, false, $$g(b8, b9, b9), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33016 - ImageFormat.getBitsPerPixel(0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3010, 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 321985076, false, $$g(b10, b11, (byte) (b11 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                        Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            byte b12 = (byte) 0;
                            byte b13 = (byte) (b12 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 36506), AndroidCharacter.getMirror('0') + 3328, Drawable.resolveOpacity(0, 0) + 17, -968507904, false, $$g(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i9 = $11 + 41;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36505 - KeyEvent.normalizeMetaState(0)), View.combineMeasuredStates(0, 0) + 3376, 18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -968507904, false, $$g(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                obj.hashCode();
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                byte b16 = (byte) 0;
                byte b17 = (byte) (b16 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (36505 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3376, 17 - Drawable.resolveOpacity(0, 0), -968507904, false, $$g(b16, b17, (byte) (b17 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0adc  */
    /* JADX WARN: Code duplicated, block: B:104:0x0aec  */
    /* JADX WARN: Code duplicated, block: B:106:0x0afa  */
    /* JADX WARN: Code duplicated, block: B:107:0x0b17  */
    /* JADX WARN: Code duplicated, block: B:110:0x0b55  */
    /* JADX WARN: Code duplicated, block: B:111:0x0b5b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0b80  */
    /* JADX WARN: Code duplicated, block: B:115:0x0b89  */
    /* JADX WARN: Code duplicated, block: B:127:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x07d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x08de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x08de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x08de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x08de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x08de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x08de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0197  */
    /* JADX WARN: Code duplicated, block: B:23:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:24:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:26:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:37:0x047d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0556  */
    /* JADX WARN: Code duplicated, block: B:51:0x0766  */
    /* JADX WARN: Code duplicated, block: B:53:0x0778  */
    /* JADX WARN: Code duplicated, block: B:56:0x0783  */
    /* JADX WARN: Code duplicated, block: B:58:0x078c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0798  */
    /* JADX WARN: Code duplicated, block: B:61:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:69:0x082d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0885 A[Catch: all -> 0x0ba6, TryCatch #0 {all -> 0x0ba6, blocks: (B:86:0x094a, B:88:0x0957, B:89:0x0996, B:91:0x09b5, B:92:0x0a00, B:71:0x086e, B:73:0x0885, B:74:0x08c4), top: B:123:0x086e }] */
    /* JADX WARN: Code duplicated, block: B:84:0x090a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0957 A[Catch: all -> 0x0ba6, TryCatch #0 {all -> 0x0ba6, blocks: (B:86:0x094a, B:88:0x0957, B:89:0x0996, B:91:0x09b5, B:92:0x0a00, B:71:0x086e, B:73:0x0885, B:74:0x08c4), top: B:123:0x086e }] */
    /* JADX WARN: Code duplicated, block: B:91:0x09b5 A[Catch: all -> 0x0ba6, TryCatch #0 {all -> 0x0ba6, blocks: (B:86:0x094a, B:88:0x0957, B:89:0x0996, B:91:0x09b5, B:92:0x0a00, B:71:0x086e, B:73:0x0885, B:74:0x08c4), top: B:123:0x086e }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0abb  */
    /* JADX WARN: Code duplicated, block: B:96:0x0abd  */
    /* JADX WARN: Code duplicated, block: B:98:0x0ac0  */
    /* JADX WARN: Code duplicated, block: B:99:0x0ad7  */
    public static int TuitionPaymentFragmentbindingInflater1(List list) throws Throwable {
        Object obj;
        int i;
        Method[] declaredMethods;
        int length;
        int i2;
        Method method;
        Object[] objArr;
        Class<?> cls;
        Object[] objArr2;
        Class cls2;
        Class<?> cls3;
        Object[] objArr3;
        Object[] objArr4;
        int i3;
        Class cls4;
        int i4;
        int i5;
        int longPressTimeout;
        int i6;
        int offsetBefore;
        int i7;
        Object[] objArr5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i8;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        String string;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Method method2;
        int i24 = 2;
        int i25 = 2 % 2;
        int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i27 = 1;
        int i28 = (i26 ^ 71) + ((i26 & 71) << 1);
        TuitionPaymentFragmentbindingInflater1 = i28 % 128;
        int i29 = i28 % 2;
        Method[] methodArr = new Method[2];
        byte[] bArr = $$a;
        byte b2 = bArr[13];
        Object[] objArr6 = new Object[1];
        a(b2, bArr[28], b2, objArr6);
        int i30 = 0;
        Class<?> cls5 = Class.forName((String) objArr6[0]);
        byte b3 = bArr[28];
        Object[] objArr7 = new Object[1];
        a(b3, bArr[13], b3, objArr7);
        methodArr[0] = cls5.getMethod((String) objArr7[0], String.class, PackageManager.PackageInfoFlags.class);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i31 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i32 = (i31 & 413939560) | (413939560 ^ i31);
        int i33 = (~((i32 & 1770346426) | (i32 ^ 1770346426))) * 130;
        int i34 = ((867070091 | i33) << 1) - (i33 ^ 867070091);
        int i35 = (i34 & (-1808934164)) + ((-1808934164) | i34);
        int i36 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 2041411578) | (2041411578 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
        int i37 = ((i36 & 142874408) | (142874408 ^ i36)) * 130;
        int i38 = (i35 & i37) + (i37 | i35);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i39 = (-743639347) + (((~((-609751299) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) | 538444034) * (-566));
        int i40 = (i39 ^ 1646430942) + ((1646430942 & i39) << 1);
        int i41 = -(-((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault3 | (-71307265))) * 566));
        int i42 = (i40 & i41) + (i41 | i40);
        Class<?> cls6 = Class.forName("android.app.ApplicationPackageManager");
        if (i38 <= i42) {
            byte b4 = bArr[28];
            Object[] objArr8 = new Object[1];
            a(b4, bArr[13], b4, objArr8);
            obj = objArr8[0];
        } else {
            byte b5 = bArr[28];
            Object[] objArr9 = new Object[1];
            a(b5, bArr[13], b5, objArr9);
            obj = objArr9[0];
        }
        String str = (String) obj;
        Class<?>[] clsArr = new Class[2];
        int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i44 = ((i43 | 95) << 1) - (i43 ^ 95);
        TuitionPaymentFragmentbindingInflater1 = i44 % 128;
        int i45 = -2001519171;
        if (i44 % 2 != 0) {
            clsArr[0] = String.class;
            clsArr[1] = PackageManager.PackageInfoFlags.class;
            methodArr[1] = cls6.getMethod(str, clsArr);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                int modifierMetaStateMask = 2822 - ((byte) KeyEvent.getModifierMetaStateMask());
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                byte[] bArr2 = $$d;
                byte b6 = bArr2[7];
                byte b7 = (byte) (-bArr2[5]);
                Object[] objArr10 = new Object[1];
                c(b6, b7, b7, objArr10);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAxisFromString, modifierMetaStateMask, maximumDrawingCacheSize, 1814927978, false, (String) objArr10[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null) == null) {
                int i46 = TuitionPaymentFragmentbindingInflater1;
                i = (i46 ^ 69) + ((i46 & 69) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
                if (i % 2 != 0) {
                    declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2824 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-16777194) - Color.rgb(0, 0, 0))).getDeclaredMethods();
                    length = declaredMethods.length;
                    i2 = 1;
                } else {
                    declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2824, 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getDeclaredMethods();
                    length = declaredMethods.length;
                    i2 = 0;
                }
                while (true) {
                    if (i2 < length) {
                        method = declaredMethods[i2];
                        int i47 = TuitionPaymentFragmentbindingInflater1 + 115;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i47 % 128;
                        int i48 = i47 % i24;
                        int i49 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i50 = -Drawable.resolveOpacity(i30, i30);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i51 = i50 * (-574);
                        int i52 = ((i51 | (-13776)) << i27) - (i51 ^ (-13776));
                        int i53 = ~i50;
                        int i54 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        int i55 = ~((i53 ^ i54) | (i53 & i54));
                        int i56 = ~(((-25) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-25) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i57 = ((i55 ^ i56) | (i55 & i56)) * 1150;
                        int i58 = (i52 & i57) + (i57 | i52);
                        int i59 = ~(((-25) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-25) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i60 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
                        TuitionPaymentFragmentbindingInflater1 = i60 % 128;
                        int i61 = i60 % i24;
                        int i62 = ~((i54 ^ 24) | (i54 & 24));
                        int i63 = (-575) * ((i62 & i59) | (i59 ^ i62));
                        int i64 = ((i58 | i63) << 1) - (i63 ^ i58);
                        int i65 = ~((i53 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i53 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i66 = ~(i54 | i50);
                        int i67 = -(-(((i66 & i65) | (i65 ^ i66)) * 575));
                        int i68 = (i64 & i67) + (i67 | i64);
                        int iIndexOf = TextUtils.indexOf("", "");
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i69 = ~(((-10467) ^ iIndexOf) | ((-10467) & iIndexOf));
                        int i70 = (iIndexOf ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iIndexOf & iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                        int i71 = ~i70;
                        int i72 = (((iIndexOf * (-813)) + 4270128) - (~(-(-(((i69 ^ i71) | (i69 & i71)) * (-814)))))) - 1;
                        int i73 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i74 = ~((i73 & (-10467)) | ((-10467) ^ i73));
                        int i75 = ~iIndexOf;
                        int i76 = ~((i75 & 10466) | (i75 ^ 10466));
                        int i77 = (i76 & i74) | (i74 ^ i76);
                        int i78 = ~i70;
                        int i79 = (i72 - (~(((i77 & i78) | (i77 ^ i78)) * 407))) - 1;
                        int i80 = ~((~iIndexOf) | 10466);
                        int i81 = ~((i75 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i75 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                        int i82 = (i80 & i81) | (i80 ^ i81);
                        int i83 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & 10466) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ 10466));
                        int i84 = ((i82 & i83) | (i82 ^ i83)) * 407;
                        char c = (char) ((i79 & i84) + (i84 | i79));
                        Object[] objArr11 = new Object[1];
                        d(i49, i68, c, objArr11);
                        Class<?> cls7 = Class.forName((String) objArr11[0]);
                        int i85 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int i86 = ((i85 | 25) << 1) - (i85 ^ 25);
                        int i87 = -(ViewConfiguration.getTapTimeout() >> 16);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i88 = ~i87;
                        int i89 = (i88 & 12) | (i88 ^ 12);
                        int i90 = (((i87 * (-520)) + 6264) - (~(-(-((~((i89 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i89 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) * 521))))) - 1;
                        int i91 = (~(((-13) & i87) | ((-13) ^ i87))) * (-1042);
                        int i92 = ((i90 | i91) << 1) - (i90 ^ i91);
                        int i93 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i94 = (i93 & 47) + (i93 | 47);
                        TuitionPaymentFragmentbindingInflater1 = i94 % 128;
                        int i95 = i94 % 2;
                        int i96 = ~(((-13) & i87) | ((-13) ^ i87));
                        int i97 = ~i87;
                        int i98 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        int i99 = ~((i97 & i98) | (i97 ^ i98) | 12);
                        int i100 = -(-(521 * ((i99 & i96) | (i96 ^ i99))));
                        int i101 = ((i92 | i100) << 1) - (i100 ^ i92);
                        int i102 = -TextUtils.indexOf("", "", 0);
                        Object[] objArr12 = new Object[1];
                        d(i86, i101, (char) ((i102 & 7262) + (i102 | 7262)), objArr12);
                        objArr = new Object[]{Integer.valueOf(((Integer) cls7.getMethod((String) objArr12[0], null).invoke(method, null)).intValue())};
                        int iResolveSize = View.resolveSize(0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i103 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
                        TuitionPaymentFragmentbindingInflater1 = i103 % 128;
                        int i104 = i103 % 2;
                        int i105 = 784 * iResolveSize;
                        int i106 = (i105 & (-28152)) + (i105 | (-28152)) + 28971;
                        int i107 = ~iResolveSize;
                        int i108 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        int i109 = (i108 & i107) | (i107 ^ i108);
                        int i110 = i106 + ((~((i109 & 36) | (i109 ^ 36))) * (-783));
                        int i111 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        int i112 = ~((i111 & 36) | (i111 ^ 36));
                        int i113 = ((i107 & i112) | (i107 ^ i112)) * 783;
                        Object[] objArr13 = new Object[1];
                        d(((i110 | i113) << 1) - (i113 ^ i110), View.MeasureSpec.makeMeasureSpec(0, 0) + 26, (char) ExpandableListView.getPackedPositionGroup(0L), objArr13);
                        cls = Class.forName((String) objArr13[0]);
                        int maxKeyCode = KeyEvent.getMaxKeyCode();
                        int i114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
                        TuitionPaymentFragmentbindingInflater1 = i114 % 128;
                        int i115 = i114 % 2;
                        int i116 = 61 - (~(-(maxKeyCode >> 16)));
                        int i117 = -(-((Process.getThreadPriority(0) + 20) >> 6));
                        int i118 = (i117 & 8) + (i117 | 8);
                        int i119 = -KeyEvent.keyCodeFromString("");
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i120 = i119 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                        int i121 = (i119 ^ 57674) | (i119 & 57674);
                        int i122 = ((((i120 | 29010022) << 1) - (i120 ^ 29010022)) - (~(i121 * (-502)))) - 1;
                        int i123 = ~i119;
                        int i124 = ~(i123 | (-57675));
                        Method[] methodArr2 = declaredMethods;
                        int i125 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                        int i126 = ~((i123 ^ i125) | (i123 & i125));
                        int i127 = (i124 ^ i126) | (i126 & i124);
                        int i128 = ~((i121 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i121 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                        int i129 = ((i127 & i128) | (i127 ^ i128)) * (-502);
                        int i130 = (i122 ^ i129) + ((i129 & i122) << 1);
                        int i131 = (~i119) | i125;
                        int i132 = ~((i131 & 57674) | (i131 ^ 57674));
                        int i133 = i119 | 57674;
                        int i134 = ~((i133 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i133 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                        objArr2 = new Object[1];
                        d(i116, i118, (char) ((i130 - (~(((i132 & i134) | (i132 ^ i134)) * TypedValues.PositionType.TYPE_DRAWPATH))) - 1), objArr2);
                        if (((Boolean) cls.getMethod((String) objArr2[0], Integer.TYPE).invoke(null, objArr)).booleanValue()) {
                            cls2 = Long.TYPE;
                            int i135 = (-ExpandableListView.getPackedPositionChild(0L)) - 1;
                            int i136 = 23 - (~(-KeyEvent.keyCodeFromString("")));
                            int i137 = TuitionPaymentFragmentbindingInflater1 + 31;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i137 % 128;
                            int i138 = i137 % 2;
                            int i139 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                            Object[] objArr14 = new Object[1];
                            d(i135, i136, (char) ((i139 & 10465) + (i139 | 10465)), objArr14);
                            cls3 = Class.forName((String) objArr14[0]);
                            int i140 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i141 = (i140 ^ 5) + ((i140 & 5) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i141 % 128;
                            int i142 = i141 % 2;
                            int iArgb = Color.argb(0, 0, 0, 0);
                            int i143 = ((iArgb | 70) << 1) - (iArgb ^ 70);
                            int iRed = Color.red(0) + 13;
                            int i144 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i145 = TuitionPaymentFragmentbindingInflater1 + 25;
                            int i146 = i145 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i146;
                            int i147 = i145 % 2;
                            int i148 = i144 * 370;
                            int i149 = ((i148 | (-370)) << 1) - (i148 ^ (-370));
                            int i150 = ~i144;
                            int i151 = i150 | i144;
                            int i152 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                            int i153 = -(-(((i151 ^ i152) | (i151 & i152)) * (-369)));
                            int i154 = (i152 & i150) | (i150 ^ i152);
                            int i155 = ((i146 | 61) << 1) - (i146 ^ 61);
                            TuitionPaymentFragmentbindingInflater1 = i155 % 128;
                            int i156 = i155 % 2;
                            int i157 = ~i154;
                            int i158 = (i149 & i153) + (i149 | i153) + ((-369) * (i157 | ((-1) ^ i157)));
                            int i159 = i146 + 43;
                            TuitionPaymentFragmentbindingInflater1 = i159 % 128;
                            int i160 = i159 % 2;
                            int i161 = 369 * ((~i144) | (~((i144 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i144 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9))));
                            char c2 = (char) (((i158 | i161) << 1) - (i158 ^ i161));
                            objArr3 = new Object[1];
                            d(i143, iRed, c2, objArr3);
                            if (cls2.equals(cls3.getMethod((String) objArr3[0], null).invoke(method, null))) {
                                int i162 = -AndroidCharacter.getMirror('0');
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i163 = i162 * (-159);
                                int i164 = ((i163 | (-7632)) << 1) - (i163 ^ (-7632));
                                int i165 = ~i162;
                                int i166 = -(-(((i165 & 48) | (i165 ^ 48)) * 160));
                                int i167 = ((i164 | i166) << 1) - (i166 ^ i164);
                                int i168 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                int i169 = ~((i168 ^ i162) | (i168 & i162));
                                int i170 = ~(i162 | 48);
                                int i171 = -(-(((i169 & i170) | (i169 ^ i170)) * (-160)));
                                int i172 = ~((i168 & (-49)) | ((-49) ^ i168));
                                int i173 = (i167 ^ i171) + ((i171 & i167) << 1) + (((i162 & i172) | (i162 ^ i172)) * 160);
                                int i174 = -ExpandableListView.getPackedPositionType(0L);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i175 = (i174 * 302) + 14472;
                                int i176 = ~i174;
                                int i177 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                int i178 = ~((i177 & i176) | (i176 ^ i177));
                                int i179 = ((i178 & 24) | (i178 ^ 24)) * (-602);
                                int i180 = ((i175 | i179) << 1) - (i175 ^ i179);
                                int i181 = ~((i176 ^ (-25)) | (i176 & (-25)));
                                int i182 = ~((i176 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i176 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                int i183 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                int i184 = (i174 & i183) | (i183 ^ i174);
                                int i185 = -(-(((~((i184 & 24) | (i184 ^ 24))) | (i181 & i182) | (i181 ^ i182)) * (-301)));
                                int i186 = ((i180 | i185) << 1) - (i185 ^ i180);
                                int i187 = -(-((~(i183 | 24)) * 301));
                                int i188 = (i186 ^ i187) + ((i187 & i186) << 1);
                                int i189 = -TextUtils.getCapsMode("", 0, 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i190 = ~i189;
                                int i191 = ~((i190 & (-10467)) | (i190 ^ (-10467)));
                                int i192 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                int i193 = (i192 & i189) | (i192 ^ i189);
                                int i194 = ~((i193 & 10466) | (i193 ^ 10466));
                                int i195 = (((i189 * 221) - 2292054) - (~(((i191 & i194) | (i191 ^ i194)) * 220))) - 1;
                                int i196 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | 10466);
                                int i197 = (i195 - (~(((i196 & i189) | (i189 ^ i196)) * (-440)))) - 1;
                                int i198 = (i189 & 10466) | (i189 ^ 10466);
                                char c3 = (char) (i197 + (((i198 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i198 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12)) * 220));
                                Object[] objArr15 = new Object[1];
                                d(i173, i188, c3, objArr15);
                                Class<?> cls8 = Class.forName((String) objArr15[0]);
                                int iRgb = Color.rgb(0, 0, 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i199 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                int i200 = ~(((-16777300) & i199) | ((-16777300) ^ i199));
                                int i201 = ~iRgb;
                                int i202 = ~(i201 | iTuitionPaymentFragmentspecialinlinedviewModeldefault13);
                                int i203 = (((iRgb * 371) - (-1929410633)) - (~(-(-(((i200 & i202) | (i200 ^ i202)) * (-370)))))) - 1;
                                int i204 = ~((i199 & i201) | (i201 ^ i199));
                                int i205 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault13 & (-16777300)) | ((-16777300) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13));
                                int i206 = (i205 & i204) | (i204 ^ i205);
                                int i207 = ~((iRgb & 16777299) | (iRgb ^ 16777299));
                                int i208 = -(-(((i206 & i207) | (i206 ^ i207)) * (-370)));
                                int i209 = ((i203 | i208) << 1) - (i208 ^ i203);
                                int i210 = -(-(i207 * 370));
                                int i211 = (i209 & i210) + (i210 | i209);
                                int i212 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i213 = i212 * (-183);
                                int i214 = ((i213 | 3145) << 1) - (i213 ^ 3145);
                                int i215 = ~i212;
                                int i216 = i212 | (-18);
                                int i217 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                                int i218 = i214 + (((i215 ^ 17) | (i215 & 17)) * (-368)) + (((i216 & i217) | (i216 ^ i217)) * 184);
                                int i219 = ~(i215 | (-18));
                                int i220 = ~((i217 & i212) | (i217 ^ i212));
                                int i221 = (i220 & i219) | (i219 ^ i220);
                                int i222 = ~((i212 & 17) | (i212 ^ 17));
                                int i223 = (i218 - (~(-(-(((i222 & i221) | (i221 ^ i222)) * 184))))) - 1;
                                int i224 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i225 = i224 * 51;
                                int i226 = ((i225 | (-49)) << 1) - (i225 ^ (-49));
                                int i227 = (i224 | iTuitionPaymentFragmentspecialinlinedviewModeldefault15) * (-50);
                                int i228 = ((i226 | i227) << 1) - (i226 ^ i227);
                                int i229 = ~i224;
                                int i230 = ~((i229 & (-2)) | (i229 ^ (-2)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault15);
                                int i231 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                                int i232 = ((-2) ^ i231) | ((-2) & i231);
                                int i233 = ~((i232 ^ i224) | (i232 & i224));
                                int i234 = -(-(((i230 ^ i233) | (i230 & i233)) * 50));
                                int i235 = (i228 & i234) + (i234 | i228);
                                int i236 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                                int i237 = ~((i236 & (-2)) | ((-2) ^ i236));
                                int i238 = ~(((-2) ^ i224) | ((-2) & i224));
                                int i239 = (i237 & i238) | (i237 ^ i238);
                                int i240 = ~(i224 | i231);
                                Object[] objArr16 = new Object[1];
                                d(i211, i223, (char) ((i235 - (~(-(-(((i239 & i240) | (i239 ^ i240)) * 50))))) - 1), objArr16);
                                objArr4 = (Object[]) cls8.getMethod((String) objArr16[0], null).invoke(method, null);
                                if (objArr4.length == 2) {
                                    int i241 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i242 = (i241 ^ 95) + ((i241 & 95) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i242 % 128;
                                    i3 = i242 % 2;
                                    cls4 = Long.TYPE;
                                    if (i3 == 0) {
                                        if (!cls4.equals(objArr4[1])) {
                                            continue;
                                        } else {
                                            i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
                                            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                                            if (i4 % 2 == 0) {
                                                longPressTimeout = ViewConfiguration.getLongPressTimeout() / 73;
                                                i5 = 0;
                                                offsetBefore = 45 % TextUtils.getOffsetBefore("", 0);
                                                i7 = 25568;
                                                i6 = 1;
                                            } else {
                                                i5 = 0;
                                                longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                                                int offsetBefore2 = TextUtils.getOffsetBefore("", 0);
                                                i6 = 1;
                                                offsetBefore = ((offsetBefore2 & 24) << 1) + (offsetBefore2 ^ 24);
                                                i7 = 10466;
                                            }
                                            objArr5 = new Object[i6];
                                            d(longPressTimeout, offsetBefore, (char) (i7 - View.combineMeasuredStates(i5, i5)), objArr5);
                                            if (Class.forName((String) objArr5[i5]).equals(objArr4[i6])) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char defaultSize = (char) View.getDefaultSize(i5, i5);
                                                    int keyRepeatTimeout = 2823 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                    int keyRepeatDelay = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    byte[] bArr3 = $$d;
                                                    byte b8 = bArr3[7];
                                                    byte b9 = (byte) (-bArr3[5]);
                                                    Object[] objArr17 = new Object[1];
                                                    c(b8, b9, b9, objArr17);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, keyRepeatTimeout, keyRepeatDelay, 1814927978, false, (String) objArr17[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                                    int i243 = 2824 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    int i244 = 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    byte[] bArr4 = $$d;
                                                    byte b10 = bArr4[7];
                                                    byte b11 = (byte) (-bArr4[5]);
                                                    Object[] objArr18 = new Object[1];
                                                    c(b10, b11, b11, objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, i243, i244, 1814927978, false, (String) objArr18[0], null);
                                                }
                                                Object[] objArr19 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                    int iRed2 = Color.red(0) + 2823;
                                                    int trimmedLength = TextUtils.getTrimmedLength("") + 22;
                                                    byte[] bArr5 = $$d;
                                                    byte b12 = bArr5[54];
                                                    byte b13 = bArr5[7];
                                                    Object[] objArr20 = new Object[1];
                                                    c(b12, b13, b13, objArr20);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, iRed2, trimmedLength, -2137287382, false, (String) objArr20[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr19)).longValue();
                                                int i245 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                                                TuitionPaymentFragmentbindingInflater1 = i245 % 128;
                                                int i246 = i245 % 2;
                                                i8 = -2001519171;
                                                break;
                                            }
                                        }
                                    } else if (cls4.equals(objArr4[0])) {
                                        i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
                                        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                                        if (i4 % 2 == 0) {
                                            longPressTimeout = ViewConfiguration.getLongPressTimeout() / 73;
                                            i5 = 0;
                                            offsetBefore = 45 % TextUtils.getOffsetBefore("", 0);
                                            i7 = 25568;
                                            i6 = 1;
                                        } else {
                                            i5 = 0;
                                            longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                                            int offsetBefore3 = TextUtils.getOffsetBefore("", 0);
                                            i6 = 1;
                                            offsetBefore = ((offsetBefore3 & 24) << 1) + (offsetBefore3 ^ 24);
                                            i7 = 10466;
                                        }
                                        objArr5 = new Object[i6];
                                        d(longPressTimeout, offsetBefore, (char) (i7 - View.combineMeasuredStates(i5, i5)), objArr5);
                                        if (Class.forName((String) objArr5[i5]).equals(objArr4[i6])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char defaultSize2 = (char) View.getDefaultSize(i5, i5);
                                                int keyRepeatTimeout2 = 2823 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                int keyRepeatDelay2 = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                byte[] bArr6 = $$d;
                                                byte b14 = bArr6[7];
                                                byte b15 = (byte) (-bArr6[5]);
                                                Object[] objArr110 = new Object[1];
                                                c(b14, b15, b15, objArr110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize2, keyRepeatTimeout2, keyRepeatDelay2, 1814927978, false, (String) objArr110[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                                                int i247 = 2824 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                int i248 = 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                byte[] bArr7 = $$d;
                                                byte b16 = bArr7[7];
                                                byte b17 = (byte) (-bArr7[5]);
                                                Object[] objArr111 = new Object[1];
                                                c(b16, b17, b17, objArr111);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType2, i247, i248, 1814927978, false, (String) objArr111[0], null);
                                            }
                                            Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                int iRed3 = Color.red(0) + 2823;
                                                int trimmedLength2 = TextUtils.getTrimmedLength("") + 22;
                                                byte[] bArr8 = $$d;
                                                byte b18 = bArr8[54];
                                                byte b19 = bArr8[7];
                                                Object[] objArr21 = new Object[1];
                                                c(b18, b19, b19, objArr21);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity2, iRed3, trimmedLength2, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                            int i249 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                                            TuitionPaymentFragmentbindingInflater1 = i249 % 128;
                                            int i2410 = i249 % 2;
                                            i8 = -2001519171;
                                            break;
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
                        int i250 = ((i2 | (-61)) << 1) - (i2 ^ (-61));
                        i2 = ((i250 | 62) << 1) - (i250 ^ 62);
                        declaredMethods = methodArr2;
                        i24 = 2;
                        i27 = 1;
                        i30 = 0;
                        i45 = -2001519171;
                    }
                }
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int iRgb2 = (-16774393) - Color.rgb(0, 0, 0);
                int i251 = 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte[] bArr9 = $$d;
                byte b20 = bArr9[7];
                byte b21 = (byte) (-bArr9[5]);
                Object[] objArr22 = new Object[1];
                c(b20, b21, b21, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, iRgb2, i251, 1814927978, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null)};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2823;
                int iRed4 = Color.red(0) + 22;
                byte[] bArr10 = $$d;
                byte b22 = (byte) (-bArr10[2]);
                byte b23 = bArr10[7];
                Object[] objArr24 = new Object[1];
                c(b22, b23, b23, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority, tapTimeout, iRed4, 1025296417, false, (String) objArr24[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr23);
            Object[] objArr25 = {0, methodArr, null};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char c4 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37658);
                int gidForName = 2719 - Process.getGidForName("");
                int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19;
                byte[] bArr11 = $$d;
                byte b24 = (byte) (-bArr11[2]);
                byte b25 = bArr11[7];
                Object[] objArr26 = new Object[1];
                c(b24, b25, b25, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c4, gidForName, maximumFlingVelocity3, -1568796068, false, (String) objArr26[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr25)).longValue();
            long j = -743728702;
            long j2 = 590;
            long j3 = -1;
            long j4 = jLongValue ^ j3;
            long jMyUid = Process.myUid();
            long j5 = jMyUid ^ j3;
            long j6 = ((j4 | j5) ^ j3) | ((j4 | j) ^ j3) | ((j5 | j) ^ j3);
            long j7 = j ^ j3;
            long j8 = (((long) (-589)) * j) + (((long) 591) * jLongValue) + (((((j7 | jLongValue) | jMyUid) ^ j3) | j6) * j2) + (((long) (-1180)) * j6) + (j2 * (((j7 | j5) ^ j3) | ((j5 | jLongValue) ^ j3))) + ((long) (-1066677143));
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i252 = ((int) (j8 >> 32)) & ((-2072279902) + ((~((~iUptimeMillis) | (-6815881))) * (-116)) + ((2132180851 | iUptimeMillis) * 116) + (((~(iUptimeMillis | 694954440)) | 1444042291) * 116));
            int i253 = ~((int) Process.getElapsedCpuTime());
            int i254 = ((int) j8) & (819810129 + ((~(1506541037 | i253)) * 52) + (((~(1489763693 | i253)) | (~((-1367977193) | i253)) | 16777344) * (-52)) + (((~(i253 | (-1489763694))) | 138563845) * 52));
            int i255 = (i252 & i254) | (i252 ^ i254);
            i9 = i255 >>> 24;
            i10 = i255 & ViewCompat.MEASURED_SIZE_MASK;
            if (i9 != 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (i11 != 0) {
                int i256 = TuitionPaymentFragmentbindingInflater1;
                int i257 = (i256 & 73) + (i256 | 73);
                int i258 = i257 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i258;
                int i259 = i257 % 2;
                int i260 = i258 + 55;
                TuitionPaymentFragmentbindingInflater1 = i260 % 128;
                int i261 = i260 % 2;
                i12 = 1;
                i13 = 1;
            } else {
                i12 = 1;
                i13 = 0;
            }
            if ((i11 ^ i12) != i12) {
                int i262 = TuitionPaymentFragmentbindingInflater1;
                int i263 = (i262 ^ 75) + ((i262 & 75) << i12);
                i22 = i263 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22;
                int i264 = i263 % 2;
                if (i10 < 2) {
                    int i265 = (i22 & 27) + (i22 | 27);
                    i23 = i265 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i23;
                    int i266 = i265 % 2;
                    method2 = methodArr[i10];
                    if (method2 != null) {
                        int i267 = (i23 & 83) + (i23 | 83);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i267 % 128;
                        int i268 = i267 % 2;
                        string = method2.toString();
                        int i269 = TuitionPaymentFragmentbindingInflater1;
                        int i270 = (i269 & 117) + (i269 | 117);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i270 % 128;
                        int i271 = i270 % 2;
                    } else {
                        string = null;
                    }
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
            list.add(string);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault16 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i272 = i9 * (-721);
            i14 = (((-4326) | i272) << 1) - (i272 ^ (-4326));
            int i273 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault16;
            i15 = ~i9;
            int i274 = ~(((-7) ^ i15) | ((-7) & i15));
            int i275 = (i273 & i274) | (i273 ^ i274);
            i16 = ~((i9 ^ 6) | (i9 & 6));
            i17 = ((i275 & i16) | (i275 ^ i16)) * 1444;
            int i276 = TuitionPaymentFragmentbindingInflater1;
            i18 = ((i276 | 21) << 1) - (i276 ^ 21);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
            if (i18 % 2 != 0) {
                int i277 = -i17;
                i19 = (i14 & i277) + (i277 | i14);
            } else {
                i19 = i14 + i17;
                i16 = ~(i9 | 6);
            }
            int i278 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault16 ^ 6) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault16 & 6));
            int i279 = i19 + ((-1444) * ((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault16 | i9)) | (i278 & i16) | (i16 ^ i278)));
            i20 = (i276 ^ 87) + ((i276 & 87) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
            if (i20 % 2 != 0) {
                i21 = ~((-7) | i9);
                i15 = ~i9;
                int i280 = 52 / 0;
            } else {
                i21 = ~(((-7) ^ i9) | ((-7) & i9));
            }
            int i281 = ~((i15 ^ 6) | (i15 & 6));
            int i282 = -(-(722 * ((i21 & i281) | (i21 ^ i281))));
            return (((i279 | i282) << 1) - (i282 ^ i279)) * i13;
        }
        clsArr[0] = String.class;
        clsArr[0] = PackageManager.PackageInfoFlags.class;
        methodArr[1] = cls6.getMethod(str, clsArr);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
            int offsetAfter = 2823 - TextUtils.getOffsetAfter("", 0);
            int gidForName2 = Process.getGidForName("") + 23;
            byte[] bArr12 = $$d;
            byte b26 = bArr12[7];
            byte b27 = (byte) (-bArr12[5]);
            Object[] objArr27 = new Object[1];
            c(b26, b27, b27, objArr27);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(absoluteGravity, offsetAfter, gidForName2, 1814927978, false, (String) objArr27[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null) == null) {
            int i410 = TuitionPaymentFragmentbindingInflater1;
            i = (i410 ^ 69) + ((i410 & 69) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
            if (i % 2 != 0) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2824 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-16777194) - Color.rgb(0, 0, 0))).getDeclaredMethods();
                length = declaredMethods.length;
                i2 = 1;
            } else {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2824, 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getDeclaredMethods();
                length = declaredMethods.length;
                i2 = 0;
            }
            while (true) {
                if (i2 < length) {
                    method = declaredMethods[i2];
                    int i411 = TuitionPaymentFragmentbindingInflater1 + 115;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i411 % 128;
                    int i412 = i411 % i24;
                    try {
                        int i413 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i510 = -Drawable.resolveOpacity(i30, i30);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault17 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i511 = i510 * (-574);
                        int i512 = ((i511 | (-13776)) << i27) - (i511 ^ (-13776));
                        int i513 = ~i510;
                        int i514 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault17;
                        int i515 = ~((i513 ^ i514) | (i513 & i514));
                        int i516 = ~(((-25) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault17) | ((-25) & iTuitionPaymentFragmentspecialinlinedviewModeldefault17));
                        int i517 = ((i515 ^ i516) | (i515 & i516)) * 1150;
                        int i518 = (i512 & i517) + (i517 | i512);
                        int i519 = ~(((-25) & iTuitionPaymentFragmentspecialinlinedviewModeldefault17) | ((-25) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault17));
                        int i610 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
                        TuitionPaymentFragmentbindingInflater1 = i610 % 128;
                        int i611 = i610 % i24;
                        int i612 = ~((i514 ^ 24) | (i514 & 24));
                        int i613 = (-575) * ((i612 & i519) | (i519 ^ i612));
                        int i614 = ((i518 | i613) << 1) - (i613 ^ i518);
                        int i615 = ~((i513 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault17) | (i513 & iTuitionPaymentFragmentspecialinlinedviewModeldefault17));
                        int i616 = ~(i514 | i510);
                        int i617 = -(-(((i616 & i615) | (i615 ^ i616)) * 575));
                        int i618 = (i614 & i617) + (i617 | i614);
                        int iIndexOf2 = TextUtils.indexOf("", "");
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault18 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i619 = ~(((-10467) ^ iIndexOf2) | ((-10467) & iIndexOf2));
                        int i710 = (iIndexOf2 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault18) | (iIndexOf2 & iTuitionPaymentFragmentspecialinlinedviewModeldefault18);
                        int i711 = ~i710;
                        int i712 = (((iIndexOf2 * (-813)) + 4270128) - (~(-(-(((i619 ^ i711) | (i619 & i711)) * (-814)))))) - 1;
                        int i713 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault18;
                        int i714 = ~((i713 & (-10467)) | ((-10467) ^ i713));
                        int i715 = ~iIndexOf2;
                        int i716 = ~((i715 & 10466) | (i715 ^ 10466));
                        int i717 = (i716 & i714) | (i714 ^ i716);
                        int i718 = ~i710;
                        int i719 = (i712 - (~(((i717 & i718) | (i717 ^ i718)) * 407))) - 1;
                        int i810 = ~((~iIndexOf2) | 10466);
                        int i811 = ~((i715 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault18) | (i715 & iTuitionPaymentFragmentspecialinlinedviewModeldefault18));
                        int i812 = (i810 & i811) | (i810 ^ i811);
                        int i813 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault18 & 10466) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault18 ^ 10466));
                        int i814 = ((i812 & i813) | (i812 ^ i813)) * 407;
                        char c5 = (char) ((i719 & i814) + (i814 | i719));
                        Object[] objArr113 = new Object[1];
                        d(i413, i618, c5, objArr113);
                        Class<?> cls9 = Class.forName((String) objArr113[0]);
                        int i815 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int i816 = ((i815 | 25) << 1) - (i815 ^ 25);
                        int i817 = -(ViewConfiguration.getTapTimeout() >> 16);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault19 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i818 = ~i817;
                        int i819 = (i818 & 12) | (i818 ^ 12);
                        int i910 = (((i817 * (-520)) + 6264) - (~(-(-((~((i819 & iTuitionPaymentFragmentspecialinlinedviewModeldefault19) | (i819 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault19))) * 521))))) - 1;
                        int i911 = (~(((-13) & i817) | ((-13) ^ i817))) * (-1042);
                        int i912 = ((i910 | i911) << 1) - (i910 ^ i911);
                        int i913 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i914 = (i913 & 47) + (i913 | 47);
                        TuitionPaymentFragmentbindingInflater1 = i914 % 128;
                        int i915 = i914 % 2;
                        int i916 = ~(((-13) & i817) | ((-13) ^ i817));
                        int i917 = ~i817;
                        int i918 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault19;
                        int i919 = ~((i917 & i918) | (i917 ^ i918) | 12);
                        int i1010 = -(-(521 * ((i919 & i916) | (i916 ^ i919))));
                        int i1011 = ((i912 | i1010) << 1) - (i1010 ^ i912);
                        int i1012 = -TextUtils.indexOf("", "", 0);
                        Object[] objArr114 = new Object[1];
                        d(i816, i1011, (char) ((i1012 & 7262) + (i1012 | 7262)), objArr114);
                        objArr = new Object[]{Integer.valueOf(((Integer) cls9.getMethod((String) objArr114[0], null).invoke(method, null)).intValue())};
                        int iResolveSize2 = View.resolveSize(0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault20 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i1013 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
                        TuitionPaymentFragmentbindingInflater1 = i1013 % 128;
                        int i1014 = i1013 % 2;
                        int i1015 = 784 * iResolveSize2;
                        int i1016 = (i1015 & (-28152)) + (i1015 | (-28152)) + 28971;
                        int i1017 = ~iResolveSize2;
                        int i1018 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault20;
                        int i1019 = (i1018 & i1017) | (i1017 ^ i1018);
                        int i1110 = i1016 + ((~((i1019 & 36) | (i1019 ^ 36))) * (-783));
                        int i1111 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault20;
                        int i1112 = ~((i1111 & 36) | (i1111 ^ 36));
                        int i1113 = ((i1017 & i1112) | (i1017 ^ i1112)) * 783;
                        Object[] objArr115 = new Object[1];
                        d(((i1110 | i1113) << 1) - (i1113 ^ i1110), View.MeasureSpec.makeMeasureSpec(0, 0) + 26, (char) ExpandableListView.getPackedPositionGroup(0L), objArr115);
                        cls = Class.forName((String) objArr115[0]);
                        int maxKeyCode2 = KeyEvent.getMaxKeyCode();
                        int i1114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
                        TuitionPaymentFragmentbindingInflater1 = i1114 % 128;
                        int i1115 = i1114 % 2;
                        int i1116 = 61 - (~(-(maxKeyCode2 >> 16)));
                        int i1117 = -(-((Process.getThreadPriority(0) + 20) >> 6));
                        int i1118 = (i1117 & 8) + (i1117 | 8);
                        int i1119 = -KeyEvent.keyCodeFromString("");
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault21 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i1210 = i1119 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                        int i1211 = (i1119 ^ 57674) | (i1119 & 57674);
                        int i1212 = ((((i1210 | 29010022) << 1) - (i1210 ^ 29010022)) - (~(i1211 * (-502)))) - 1;
                        int i1213 = ~i1119;
                        int i1214 = ~(i1213 | (-57675));
                        Method[] methodArr3 = declaredMethods;
                        int i1215 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault21;
                        int i1216 = ~((i1213 ^ i1215) | (i1213 & i1215));
                        int i1217 = (i1214 ^ i1216) | (i1216 & i1214);
                        int i1218 = ~((i1211 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault21) | (i1211 & iTuitionPaymentFragmentspecialinlinedviewModeldefault21));
                        int i1219 = ((i1217 & i1218) | (i1217 ^ i1218)) * (-502);
                        int i1310 = (i1212 ^ i1219) + ((i1219 & i1212) << 1);
                        int i1311 = (~i1119) | i1215;
                        int i1312 = ~((i1311 & 57674) | (i1311 ^ 57674));
                        int i1313 = i1119 | 57674;
                        int i1314 = ~((i1313 & iTuitionPaymentFragmentspecialinlinedviewModeldefault21) | (i1313 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault21));
                        objArr2 = new Object[1];
                        d(i1116, i1118, (char) ((i1310 - (~(((i1312 & i1314) | (i1312 ^ i1314)) * TypedValues.PositionType.TYPE_DRAWPATH))) - 1), objArr2);
                        if (((Boolean) cls.getMethod((String) objArr2[0], Integer.TYPE).invoke(null, objArr)).booleanValue()) {
                            cls2 = Long.TYPE;
                            int i1315 = (-ExpandableListView.getPackedPositionChild(0L)) - 1;
                            int i1316 = 23 - (~(-KeyEvent.keyCodeFromString("")));
                            int i1317 = TuitionPaymentFragmentbindingInflater1 + 31;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1317 % 128;
                            int i1318 = i1317 % 2;
                            int i1319 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                            Object[] objArr116 = new Object[1];
                            d(i1315, i1316, (char) ((i1319 & 10465) + (i1319 | 10465)), objArr116);
                            cls3 = Class.forName((String) objArr116[0]);
                            int i1410 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i1411 = (i1410 ^ 5) + ((i1410 & 5) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i1411 % 128;
                            int i1412 = i1411 % 2;
                            int iArgb2 = Color.argb(0, 0, 0, 0);
                            int i1413 = ((iArgb2 | 70) << 1) - (iArgb2 ^ 70);
                            int iRed5 = Color.red(0) + 13;
                            int i1414 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault22 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i1415 = TuitionPaymentFragmentbindingInflater1 + 25;
                            int i1416 = i1415 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1416;
                            int i1417 = i1415 % 2;
                            int i1418 = i1414 * 370;
                            int i1419 = ((i1418 | (-370)) << 1) - (i1418 ^ (-370));
                            int i1510 = ~i1414;
                            int i1511 = i1510 | i1414;
                            int i1512 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault22;
                            int i1513 = -(-(((i1511 ^ i1512) | (i1511 & i1512)) * (-369)));
                            int i1514 = (i1512 & i1510) | (i1510 ^ i1512);
                            int i1515 = ((i1416 | 61) << 1) - (i1416 ^ 61);
                            TuitionPaymentFragmentbindingInflater1 = i1515 % 128;
                            int i1516 = i1515 % 2;
                            int i1517 = ~i1514;
                            int i1518 = (i1419 & i1513) + (i1419 | i1513) + ((-369) * (i1517 | ((-1) ^ i1517)));
                            int i1519 = i1416 + 43;
                            TuitionPaymentFragmentbindingInflater1 = i1519 % 128;
                            int i1610 = i1519 % 2;
                            int i1611 = 369 * ((~i1414) | (~((i1414 & iTuitionPaymentFragmentspecialinlinedviewModeldefault22) | (i1414 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault22))));
                            char c6 = (char) (((i1518 | i1611) << 1) - (i1518 ^ i1611));
                            objArr3 = new Object[1];
                            d(i1413, iRed5, c6, objArr3);
                            if (cls2.equals(cls3.getMethod((String) objArr3[0], null).invoke(method, null))) {
                                int i1612 = -AndroidCharacter.getMirror('0');
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault110 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i1613 = i1612 * (-159);
                                int i1614 = ((i1613 | (-7632)) << 1) - (i1613 ^ (-7632));
                                int i1615 = ~i1612;
                                int i1616 = -(-(((i1615 & 48) | (i1615 ^ 48)) * 160));
                                int i1617 = ((i1614 | i1616) << 1) - (i1616 ^ i1614);
                                int i1618 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault110;
                                int i1619 = ~((i1618 ^ i1612) | (i1618 & i1612));
                                int i1710 = ~(i1612 | 48);
                                int i1711 = -(-(((i1619 & i1710) | (i1619 ^ i1710)) * (-160)));
                                int i1712 = ~((i1618 & (-49)) | ((-49) ^ i1618));
                                int i1713 = (i1617 ^ i1711) + ((i1711 & i1617) << 1) + (((i1612 & i1712) | (i1612 ^ i1712)) * 160);
                                int i1714 = -ExpandableListView.getPackedPositionType(0L);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault111 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i1715 = (i1714 * 302) + 14472;
                                int i1716 = ~i1714;
                                int i1717 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault111;
                                int i1718 = ~((i1717 & i1716) | (i1716 ^ i1717));
                                int i1719 = ((i1718 & 24) | (i1718 ^ 24)) * (-602);
                                int i1810 = ((i1715 | i1719) << 1) - (i1715 ^ i1719);
                                int i1811 = ~((i1716 ^ (-25)) | (i1716 & (-25)));
                                int i1812 = ~((i1716 & iTuitionPaymentFragmentspecialinlinedviewModeldefault111) | (i1716 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault111));
                                int i1813 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault111;
                                int i1814 = (i1714 & i1813) | (i1813 ^ i1714);
                                int i1815 = -(-(((~((i1814 & 24) | (i1814 ^ 24))) | (i1811 & i1812) | (i1811 ^ i1812)) * (-301)));
                                int i1816 = ((i1810 | i1815) << 1) - (i1815 ^ i1810);
                                int i1817 = -(-((~(i1813 | 24)) * 301));
                                int i1818 = (i1816 ^ i1817) + ((i1817 & i1816) << 1);
                                int i1819 = -TextUtils.getCapsMode("", 0, 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault112 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i1910 = ~i1819;
                                int i1911 = ~((i1910 & (-10467)) | (i1910 ^ (-10467)));
                                int i1912 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault112;
                                int i1913 = (i1912 & i1819) | (i1912 ^ i1819);
                                int i1914 = ~((i1913 & 10466) | (i1913 ^ 10466));
                                int i1915 = (((i1819 * 221) - 2292054) - (~(((i1911 & i1914) | (i1911 ^ i1914)) * 220))) - 1;
                                int i1916 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault112) | 10466);
                                int i1917 = (i1915 - (~(((i1916 & i1819) | (i1819 ^ i1916)) * (-440)))) - 1;
                                int i1918 = (i1819 & 10466) | (i1819 ^ 10466);
                                char c7 = (char) (i1917 + (((i1918 & iTuitionPaymentFragmentspecialinlinedviewModeldefault112) | (i1918 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault112)) * 220));
                                Object[] objArr117 = new Object[1];
                                d(i1713, i1818, c7, objArr117);
                                Class<?> cls10 = Class.forName((String) objArr117[0]);
                                int iRgb3 = Color.rgb(0, 0, 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault113 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i1919 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault113;
                                int i2010 = ~(((-16777300) & i1919) | ((-16777300) ^ i1919));
                                int i2011 = ~iRgb3;
                                int i2012 = ~(i2011 | iTuitionPaymentFragmentspecialinlinedviewModeldefault113);
                                int i2013 = (((iRgb3 * 371) - (-1929410633)) - (~(-(-(((i2010 & i2012) | (i2010 ^ i2012)) * (-370)))))) - 1;
                                int i2014 = ~((i1919 & i2011) | (i2011 ^ i1919));
                                int i2015 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault113 & (-16777300)) | ((-16777300) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault113));
                                int i2016 = (i2015 & i2014) | (i2014 ^ i2015);
                                int i2017 = ~((iRgb3 & 16777299) | (iRgb3 ^ 16777299));
                                int i2018 = -(-(((i2016 & i2017) | (i2016 ^ i2017)) * (-370)));
                                int i2019 = ((i2013 | i2018) << 1) - (i2018 ^ i2013);
                                int i2110 = -(-(i2017 * 370));
                                int i2111 = (i2019 & i2110) + (i2110 | i2019);
                                int i2112 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault114 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i2113 = i2112 * (-183);
                                int i2114 = ((i2113 | 3145) << 1) - (i2113 ^ 3145);
                                int i2115 = ~i2112;
                                int i2116 = i2112 | (-18);
                                int i2117 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault114;
                                int i2118 = i2114 + (((i2115 ^ 17) | (i2115 & 17)) * (-368)) + (((i2116 & i2117) | (i2116 ^ i2117)) * 184);
                                int i2119 = ~(i2115 | (-18));
                                int i2210 = ~((i2117 & i2112) | (i2117 ^ i2112));
                                int i2211 = (i2210 & i2119) | (i2119 ^ i2210);
                                int i2212 = ~((i2112 & 17) | (i2112 ^ 17));
                                int i2213 = (i2118 - (~(-(-(((i2212 & i2211) | (i2211 ^ i2212)) * 184))))) - 1;
                                int i2214 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault115 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i2215 = i2214 * 51;
                                int i2216 = ((i2215 | (-49)) << 1) - (i2215 ^ (-49));
                                int i2217 = (i2214 | iTuitionPaymentFragmentspecialinlinedviewModeldefault115) * (-50);
                                int i2218 = ((i2216 | i2217) << 1) - (i2216 ^ i2217);
                                int i2219 = ~i2214;
                                int i2310 = ~((i2219 & (-2)) | (i2219 ^ (-2)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault115);
                                int i2311 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault115;
                                int i2312 = ((-2) ^ i2311) | ((-2) & i2311);
                                int i2313 = ~((i2312 ^ i2214) | (i2312 & i2214));
                                int i2314 = -(-(((i2310 ^ i2313) | (i2310 & i2313)) * 50));
                                int i2315 = (i2218 & i2314) + (i2314 | i2218);
                                int i2316 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault115;
                                int i2317 = ~((i2316 & (-2)) | ((-2) ^ i2316));
                                int i2318 = ~(((-2) ^ i2214) | ((-2) & i2214));
                                int i2319 = (i2317 & i2318) | (i2317 ^ i2318);
                                int i2411 = ~(i2214 | i2311);
                                Object[] objArr118 = new Object[1];
                                d(i2111, i2213, (char) ((i2315 - (~(-(-(((i2319 & i2411) | (i2319 ^ i2411)) * 50))))) - 1), objArr118);
                                objArr4 = (Object[]) cls10.getMethod((String) objArr118[0], null).invoke(method, null);
                                if (objArr4.length == 2) {
                                    int i2412 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i2413 = (i2412 ^ 95) + ((i2412 & 95) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i2413 % 128;
                                    i3 = i2413 % 2;
                                    cls4 = Long.TYPE;
                                    if (i3 == 0) {
                                        if (!cls4.equals(objArr4[1])) {
                                            continue;
                                        } else {
                                            i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
                                            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                                            if (i4 % 2 == 0) {
                                                longPressTimeout = ViewConfiguration.getLongPressTimeout() / 73;
                                                i5 = 0;
                                                offsetBefore = 45 % TextUtils.getOffsetBefore("", 0);
                                                i7 = 25568;
                                                i6 = 1;
                                            } else {
                                                i5 = 0;
                                                longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                                                int offsetBefore4 = TextUtils.getOffsetBefore("", 0);
                                                i6 = 1;
                                                offsetBefore = ((offsetBefore4 & 24) << 1) + (offsetBefore4 ^ 24);
                                                i7 = 10466;
                                            }
                                            objArr5 = new Object[i6];
                                            d(longPressTimeout, offsetBefore, (char) (i7 - View.combineMeasuredStates(i5, i5)), objArr5);
                                            if (Class.forName((String) objArr5[i5]).equals(objArr4[i6])) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char defaultSize3 = (char) View.getDefaultSize(i5, i5);
                                                    int keyRepeatTimeout3 = 2823 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                    int keyRepeatDelay3 = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    byte[] bArr13 = $$d;
                                                    byte b110 = bArr13[7];
                                                    byte b111 = (byte) (-bArr13[5]);
                                                    Object[] objArr119 = new Object[1];
                                                    c(b110, b111, b111, objArr119);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize3, keyRepeatTimeout3, keyRepeatDelay3, 1814927978, false, (String) objArr119[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char packedPositionType3 = (char) ExpandableListView.getPackedPositionType(0L);
                                                    int i2414 = 2824 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    int i2415 = 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    byte[] bArr14 = $$d;
                                                    byte b112 = bArr14[7];
                                                    byte b113 = (byte) (-bArr14[5]);
                                                    Object[] objArr1110 = new Object[1];
                                                    c(b112, b113, b113, objArr1110);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType3, i2414, i2415, 1814927978, false, (String) objArr1110[0], null);
                                                }
                                                try {
                                                    Object[] objArr1111 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char maximumFlingVelocity4 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                        int iRed6 = Color.red(0) + 2823;
                                                        int trimmedLength3 = TextUtils.getTrimmedLength("") + 22;
                                                        byte[] bArr15 = $$d;
                                                        byte b114 = bArr15[54];
                                                        byte b115 = bArr15[7];
                                                        Object[] objArr28 = new Object[1];
                                                        c(b114, b115, b115, objArr28);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity4, iRed6, trimmedLength3, -2137287382, false, (String) objArr28[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr1111)).longValue();
                                                    int i2416 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                                                    TuitionPaymentFragmentbindingInflater1 = i2416 % 128;
                                                    int i2417 = i2416 % 2;
                                                    i8 = -2001519171;
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
                                    } else if (cls4.equals(objArr4[0])) {
                                        i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
                                        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                                        if (i4 % 2 == 0) {
                                            longPressTimeout = ViewConfiguration.getLongPressTimeout() / 73;
                                            i5 = 0;
                                            offsetBefore = 45 % TextUtils.getOffsetBefore("", 0);
                                            i7 = 25568;
                                            i6 = 1;
                                        } else {
                                            i5 = 0;
                                            longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                                            int offsetBefore5 = TextUtils.getOffsetBefore("", 0);
                                            i6 = 1;
                                            offsetBefore = ((offsetBefore5 & 24) << 1) + (offsetBefore5 ^ 24);
                                            i7 = 10466;
                                        }
                                        objArr5 = new Object[i6];
                                        d(longPressTimeout, offsetBefore, (char) (i7 - View.combineMeasuredStates(i5, i5)), objArr5);
                                        if (Class.forName((String) objArr5[i5]).equals(objArr4[i6])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char defaultSize4 = (char) View.getDefaultSize(i5, i5);
                                                int keyRepeatTimeout4 = 2823 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                int keyRepeatDelay4 = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                byte[] bArr16 = $$d;
                                                byte b116 = bArr16[7];
                                                byte b117 = (byte) (-bArr16[5]);
                                                Object[] objArr1112 = new Object[1];
                                                c(b116, b117, b117, objArr1112);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize4, keyRepeatTimeout4, keyRepeatDelay4, 1814927978, false, (String) objArr1112[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char packedPositionType4 = (char) ExpandableListView.getPackedPositionType(0L);
                                                int i2418 = 2824 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                int i2419 = 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                byte[] bArr17 = $$d;
                                                byte b118 = bArr17[7];
                                                byte b119 = (byte) (-bArr17[5]);
                                                Object[] objArr1113 = new Object[1];
                                                c(b118, b119, b119, objArr1113);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType4, i2418, i2419, 1814927978, false, (String) objArr1113[0], null);
                                            }
                                            Object[] objArr1114 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char maximumFlingVelocity5 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                int iRed7 = Color.red(0) + 2823;
                                                int trimmedLength4 = TextUtils.getTrimmedLength("") + 22;
                                                byte[] bArr18 = $$d;
                                                byte b1110 = bArr18[54];
                                                byte b1111 = bArr18[7];
                                                Object[] objArr29 = new Object[1];
                                                c(b1110, b1111, b1111, objArr29);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity5, iRed7, trimmedLength4, -2137287382, false, (String) objArr29[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr1114)).longValue();
                                            int i24110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                                            TuitionPaymentFragmentbindingInflater1 = i24110 % 128;
                                            int i24111 = i24110 % 2;
                                            i8 = -2001519171;
                                            break;
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
                        int i2510 = ((i2 | (-61)) << 1) - (i2 ^ (-61));
                        i2 = ((i2510 | 62) << 1) - (i2510 ^ 62);
                        declaredMethods = methodArr3;
                        i24 = 2;
                        i27 = 1;
                        i30 = 0;
                        i45 = -2001519171;
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
        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char cKeyCodeFromString2 = (char) KeyEvent.keyCodeFromString("");
            int iRgb4 = (-16774393) - Color.rgb(0, 0, 0);
            int i2511 = 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr19 = $$d;
            byte b28 = bArr19[7];
            byte b29 = (byte) (-bArr19[5]);
            Object[] objArr210 = new Object[1];
            c(b28, b29, b29, objArr210);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString2, iRgb4, i2511, 1814927978, false, (String) objArr210[0], null);
        }
        Object[] objArr211 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null)};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 2823;
            int iRed8 = Color.red(0) + 22;
            byte[] bArr110 = $$d;
            byte b210 = (byte) (-bArr110[2]);
            byte b211 = bArr110[7];
            Object[] objArr212 = new Object[1];
            c(b210, b211, b211, objArr212);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority2, tapTimeout2, iRed8, 1025296417, false, (String) objArr212[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr211);
        Object[] objArr213 = {0, methodArr, null};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c8 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37658);
            int gidForName3 = 2719 - Process.getGidForName("");
            int maximumFlingVelocity6 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19;
            byte[] bArr111 = $$d;
            byte b212 = (byte) (-bArr111[2]);
            byte b213 = bArr111[7];
            Object[] objArr214 = new Object[1];
            c(b212, b213, b213, objArr214);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c8, gidForName3, maximumFlingVelocity6, -1568796068, false, (String) objArr214[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr213)).longValue();
        long j9 = -743728702;
        long j10 = 590;
        long j11 = -1;
        long j12 = jLongValue2 ^ j11;
        long jMyUid2 = Process.myUid();
        long j13 = jMyUid2 ^ j11;
        long j14 = ((j12 | j13) ^ j11) | ((j12 | j9) ^ j11) | ((j13 | j9) ^ j11);
        long j15 = j9 ^ j11;
        long j16 = (((long) (-589)) * j9) + (((long) 591) * jLongValue2) + (((((j15 | jLongValue2) | jMyUid2) ^ j11) | j14) * j10) + (((long) (-1180)) * j14) + (j10 * (((j15 | j13) ^ j11) | ((j13 | jLongValue2) ^ j11))) + ((long) (-1066677143));
        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
        int i2512 = ((int) (j16 >> 32)) & ((-2072279902) + ((~((~iUptimeMillis2) | (-6815881))) * (-116)) + ((2132180851 | iUptimeMillis2) * 116) + (((~(iUptimeMillis2 | 694954440)) | 1444042291) * 116));
        int i2513 = ~((int) Process.getElapsedCpuTime());
        int i2514 = ((int) j16) & (819810129 + ((~(1506541037 | i2513)) * 52) + (((~(1489763693 | i2513)) | (~((-1367977193) | i2513)) | 16777344) * (-52)) + (((~(i2513 | (-1489763694))) | 138563845) * 52));
        int i2515 = (i2512 & i2514) | (i2512 ^ i2514);
        i9 = i2515 >>> 24;
        i10 = i2515 & ViewCompat.MEASURED_SIZE_MASK;
        if (i9 != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (i11 != 0) {
            int i2516 = TuitionPaymentFragmentbindingInflater1;
            int i2517 = (i2516 & 73) + (i2516 | 73);
            int i2518 = i2517 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2518;
            int i2519 = i2517 % 2;
            int i2610 = i2518 + 55;
            TuitionPaymentFragmentbindingInflater1 = i2610 % 128;
            int i2611 = i2610 % 2;
            i12 = 1;
            i13 = 1;
        } else {
            i12 = 1;
            i13 = 0;
        }
        if ((i11 ^ i12) != i12) {
            int i2612 = TuitionPaymentFragmentbindingInflater1;
            int i2613 = (i2612 ^ 75) + ((i2612 & 75) << i12);
            i22 = i2613 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22;
            int i2614 = i2613 % 2;
            if (i10 < 2) {
                int i2615 = (i22 & 27) + (i22 | 27);
                i23 = i2615 % 128;
                TuitionPaymentFragmentbindingInflater1 = i23;
                int i2616 = i2615 % 2;
                method2 = methodArr[i10];
                if (method2 != null) {
                    int i2617 = (i23 & 83) + (i23 | 83);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2617 % 128;
                    int i2618 = i2617 % 2;
                    string = method2.toString();
                    int i2619 = TuitionPaymentFragmentbindingInflater1;
                    int i2710 = (i2619 & 117) + (i2619 | 117);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2710 % 128;
                    int i2711 = i2710 % 2;
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
        } else {
            string = null;
        }
        list.add(string);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault116 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i2712 = i9 * (-721);
        i14 = (((-4326) | i2712) << 1) - (i2712 ^ (-4326));
        int i2713 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault116;
        i15 = ~i9;
        int i2714 = ~(((-7) ^ i15) | ((-7) & i15));
        int i2715 = (i2713 & i2714) | (i2713 ^ i2714);
        i16 = ~((i9 ^ 6) | (i9 & 6));
        i17 = ((i2715 & i16) | (i2715 ^ i16)) * 1444;
        int i2716 = TuitionPaymentFragmentbindingInflater1;
        i18 = ((i2716 | 21) << 1) - (i2716 ^ 21);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
        if (i18 % 2 != 0) {
            int i2717 = -i17;
            i19 = (i14 & i2717) + (i2717 | i14);
        } else {
            i19 = i14 + i17;
            i16 = ~(i9 | 6);
        }
        int i2718 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault116 ^ 6) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault116 & 6));
        int i2719 = i19 + ((-1444) * ((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault116 | i9)) | (i2718 & i16) | (i16 ^ i2718)));
        i20 = (i2716 ^ 87) + ((i2716 & 87) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
        if (i20 % 2 != 0) {
            i21 = ~((-7) | i9);
            i15 = ~i9;
            int i283 = 52 / 0;
        } else {
            i21 = ~(((-7) ^ i9) | ((-7) & i9));
        }
        int i284 = ~((i15 ^ 6) | (i15 & 6));
        int i285 = -(-(722 * ((i21 & i284) | (i21 ^ i284))));
        return (((i2719 | i285) << 1) - (i285 ^ i2719)) * i13;
        i8 = i45;
        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char cKeyCodeFromString3 = (char) KeyEvent.keyCodeFromString("");
            int iRgb5 = (-16774393) - Color.rgb(0, 0, 0);
            int i25110 = 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr112 = $$d;
            byte b214 = bArr112[7];
            byte b215 = (byte) (-bArr112[5]);
            Object[] objArr215 = new Object[1];
            c(b214, b215, b215, objArr215);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString3, iRgb5, i25110, 1814927978, false, (String) objArr215[0], null);
        }
        Object[] objArr216 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null)};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char threadPriority3 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 2823;
            int iRed9 = Color.red(0) + 22;
            byte[] bArr113 = $$d;
            byte b216 = (byte) (-bArr113[2]);
            byte b217 = bArr113[7];
            Object[] objArr217 = new Object[1];
            c(b216, b217, b217, objArr217);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority3, tapTimeout3, iRed9, 1025296417, false, (String) objArr217[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr216);
        Object[] objArr218 = {0, methodArr, null};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c9 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37658);
            int gidForName4 = 2719 - Process.getGidForName("");
            int maximumFlingVelocity7 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19;
            byte[] bArr114 = $$d;
            byte b218 = (byte) (-bArr114[2]);
            byte b219 = bArr114[7];
            Object[] objArr219 = new Object[1];
            c(b218, b219, b219, objArr219);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c9, gidForName4, maximumFlingVelocity7, -1568796068, false, (String) objArr219[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr218)).longValue();
        long j17 = -743728702;
        long j18 = 590;
        long j19 = -1;
        long j110 = jLongValue3 ^ j19;
        long jMyUid3 = Process.myUid();
        long j111 = jMyUid3 ^ j19;
        long j112 = ((j110 | j111) ^ j19) | ((j110 | j17) ^ j19) | ((j111 | j17) ^ j19);
        long j113 = j17 ^ j19;
        long j114 = (((long) (-589)) * j17) + (((long) 591) * jLongValue3) + (((((j113 | jLongValue3) | jMyUid3) ^ j19) | j112) * j18) + (((long) (-1180)) * j112) + (j18 * (((j113 | j111) ^ j19) | ((j111 | jLongValue3) ^ j19))) + ((long) (-1066677143));
        int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
        int i25111 = ((int) (j114 >> 32)) & ((-2072279902) + ((~((~iUptimeMillis3) | (-6815881))) * (-116)) + ((2132180851 | iUptimeMillis3) * 116) + (((~(iUptimeMillis3 | 694954440)) | 1444042291) * 116));
        int i25112 = ~((int) Process.getElapsedCpuTime());
        int i25113 = ((int) j114) & (819810129 + ((~(1506541037 | i25112)) * 52) + (((~(1489763693 | i25112)) | (~((-1367977193) | i25112)) | 16777344) * (-52)) + (((~(i25112 | (-1489763694))) | 138563845) * 52));
        int i25114 = (i25111 & i25113) | (i25111 ^ i25113);
        i9 = i25114 >>> 24;
        i10 = i25114 & ViewCompat.MEASURED_SIZE_MASK;
        if (i9 != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (i11 != 0) {
            int i25115 = TuitionPaymentFragmentbindingInflater1;
            int i25116 = (i25115 & 73) + (i25115 | 73);
            int i25117 = i25116 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i25117;
            int i25118 = i25116 % 2;
            int i26110 = i25117 + 55;
            TuitionPaymentFragmentbindingInflater1 = i26110 % 128;
            int i26111 = i26110 % 2;
            i12 = 1;
            i13 = 1;
        } else {
            i12 = 1;
            i13 = 0;
        }
        if ((i11 ^ i12) != i12) {
            int i26112 = TuitionPaymentFragmentbindingInflater1;
            int i26113 = (i26112 ^ 75) + ((i26112 & 75) << i12);
            i22 = i26113 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22;
            int i26114 = i26113 % 2;
            if (i10 < 2) {
                int i26115 = (i22 & 27) + (i22 | 27);
                i23 = i26115 % 128;
                TuitionPaymentFragmentbindingInflater1 = i23;
                int i26116 = i26115 % 2;
                method2 = methodArr[i10];
                if (method2 != null) {
                    int i26117 = (i23 & 83) + (i23 | 83);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26117 % 128;
                    int i26118 = i26117 % 2;
                    string = method2.toString();
                    int i26119 = TuitionPaymentFragmentbindingInflater1;
                    int i27110 = (i26119 & 117) + (i26119 | 117);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i27110 % 128;
                    int i27111 = i27110 % 2;
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
        } else {
            string = null;
        }
        list.add(string);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault117 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i27112 = i9 * (-721);
        i14 = (((-4326) | i27112) << 1) - (i27112 ^ (-4326));
        int i27113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault117;
        i15 = ~i9;
        int i27114 = ~(((-7) ^ i15) | ((-7) & i15));
        int i27115 = (i27113 & i27114) | (i27113 ^ i27114);
        i16 = ~((i9 ^ 6) | (i9 & 6));
        i17 = ((i27115 & i16) | (i27115 ^ i16)) * 1444;
        int i27116 = TuitionPaymentFragmentbindingInflater1;
        i18 = ((i27116 | 21) << 1) - (i27116 ^ 21);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
        if (i18 % 2 != 0) {
            int i27117 = -i17;
            i19 = (i14 & i27117) + (i27117 | i14);
        } else {
            i19 = i14 + i17;
            i16 = ~(i9 | 6);
        }
        int i27118 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault117 ^ 6) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault117 & 6));
        int i27119 = i19 + ((-1444) * ((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault117 | i9)) | (i27118 & i16) | (i16 ^ i27118)));
        i20 = (i27116 ^ 87) + ((i27116 & 87) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
        if (i20 % 2 != 0) {
            i21 = ~((-7) | i9);
            i15 = ~i9;
            int i286 = 52 / 0;
        } else {
            i21 = ~(((-7) ^ i9) | ((-7) & i9));
        }
        int i287 = ~((i15 ^ 6) | (i15 & 6));
        int i288 = -(-(722 * ((i21 & i287) | (i21 ^ i287))));
        return (((i27119 | i288) << 1) - (i288 ^ i27119)) * i13;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 1
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r7 = r7 * 3
            int r7 = r7 + 109
            byte[] r0 = defpackage.getMaxPreviewResolution.$$c
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r8]
        L26:
            int r8 = r8 + 1
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getMaxPreviewResolution.$$g(short, short, byte):java.lang.String");
    }
}
