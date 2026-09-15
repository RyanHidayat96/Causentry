package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
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
import android.widget.Toast;
import androidx.core.os.EnvironmentCompat;
import com.dynatrace.android.agent.CommunicationManager;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.conf.InstrumentationFlavor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class getExpectedFrameRate implements getMirrorModeInternal {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f936a;
    private static int d;
    private static int g;
    private CommunicationManager TuitionPaymentFragmentbindingInflater1;
    private final getTargetRotationInternal b = new getTargetRotationInternal();
    private static final byte[] $$c = {5, -91, 77, 46};
    private static final int $$f = 254;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {51, -99, -8, -59, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 60, -4, -4, -5, 8, -24, 20, -16, 7, -13, 3, -4, -18, 4, -8, -1, -1, -58, 73, -3, -26, 8};
    private static final int $$e = 6;
    private static final byte[] $$a = {110, -73, -111, 99, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 231;
    private static int asInterface = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.getExpectedFrameRate.$$a
            int r9 = r9 * 15
            int r9 = 53 - r9
            int r7 = 92 - r7
            int r8 = r8 * 4
            int r8 = 84 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2c
        L15:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r8]
        L2c:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getExpectedFrameRate.c(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = 99 - r7
            int r9 = r9 * 53
            int r9 = 54 - r9
            int r8 = r8 * 53
            int r8 = 57 - r8
            byte[] r0 = defpackage.getExpectedFrameRate.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r7 = r7 + r8
            int r7 = r7 + 3
            int r8 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getExpectedFrameRate.f(byte, byte, byte, java.lang.Object[]):void");
    }

    static {
        d = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("CrashReporter");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
        int i = asInterface + 11;
        d = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public getExpectedFrameRate(CommunicationManager communicationManager) {
        this.TuitionPaymentFragmentbindingInflater1 = communicationManager;
    }

    @Override // defpackage.getMirrorModeInternal
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        synchronized (this) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x063b A[Catch: all -> 0x0690, TryCatch #1 {, blocks: (B:5:0x0006, B:7:0x001b, B:9:0x002c, B:10:0x0060, B:12:0x00f3, B:13:0x012f, B:15:0x0144, B:17:0x014d, B:18:0x0189, B:48:0x0476, B:50:0x0484, B:52:0x0569, B:55:0x056f, B:57:0x0576, B:58:0x05eb, B:60:0x05f5, B:61:0x05fc, B:63:0x0608, B:79:0x063b, B:80:0x0643, B:83:0x064f, B:85:0x0657, B:86:0x065d, B:88:0x067a, B:67:0x060f, B:69:0x0615, B:71:0x061f, B:78:0x0635, B:74:0x062a, B:75:0x062d, B:51:0x04f6, B:19:0x0209, B:21:0x0283, B:23:0x0287, B:27:0x0293, B:32:0x0304, B:34:0x030a, B:35:0x033f, B:37:0x0346, B:38:0x03ca, B:40:0x03d7, B:41:0x0412, B:43:0x0429, B:44:0x0468, B:45:0x046f, B:46:0x0474, B:90:0x0681, B:92:0x0687, B:93:0x0688, B:94:0x0689, B:29:0x0298), top: B:102:0x0006, inners: #0, #2 }] */
    @Override // defpackage.getMirrorModeInternal
    public final void TuitionPaymentFragmentbindingInflater1(Thread thread, Throwable th) {
        Object[] objArr;
        char c;
        String str;
        Object[] objArr2;
        String message;
        getViewPortCropRect getrelativerotation;
        synchronized (this) {
            mergeConfigs mergeconfigsTuitionPaymentFragmentbindingInflater1 = mergeConfigs.TuitionPaymentFragmentbindingInflater1(true);
            int i = lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().notify;
            this.TuitionPaymentFragmentbindingInflater1.b();
            if (mergeconfigsTuitionPaymentFragmentbindingInflater1.f1275a.active) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
                    int iRed = 10 - Color.red(0);
                    byte[] bArr = $$a;
                    Object[] objArr3 = new Object[1];
                    c((byte) 89, bArr[7], bArr[28], objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, scrollDefaultDelay, iRed, -1650998592, false, (String) objArr3[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr4 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{39970, 8376, 19789, 47009}, (char) View.getDefaultSize(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{64778, 14937, 59841, 51392, 42320, 50264, 15845, 2042, 55879, 30561, 48829, 39784, 2786, 3291, 23921, 32567, 36438, 44520, 38625, 58818, 32478, 46336}, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{23896, 4947, 65263, 1949}, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 40446), View.resolveSizeAndState(0, 0, 0) - 283946147, new char[]{8543, 62837, 42625, 58742, 52051, 63255, 30792, 37353, 61615, 39362, 36113, 49608, 5481, 21473, 35101}, objArr5);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int i2 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 875;
                    int scrollBarSize = 10 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte b = $$a[7];
                    Object[] objArr6 = new Object[1];
                    c((byte) 52, b, b, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i2, scrollBarSize, 2012020043, false, (String) objArr6[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int i3 = 876 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0');
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        c(b2, b3, b3, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, i3, iIndexOf, 2012931276, false, (String) objArr7[0], null);
                    }
                    Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
                    int i4 = ~new Random().nextInt(1886582554);
                    int i5 = (-172169828) + ((~((-2189873) | i4)) * 52) + (((~(517771341 | i4)) | (~(477461112 | i4)) | (-519961214)) * (-52)) + (((~(i4 | (-517771342))) | 475271240) * 52) + 243770112;
                    int i6 = (i5 << 13) ^ i5;
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
                    c = 2;
                } else {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{17898, 31414, 13684, 54976}, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49205), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{44803, 33446, 56988, 25021, 22259, 13264, 11460, 20067, 59518, 63966, 49357, 61137, 20720, 46630, 33565, 23328, 59339, 55982, 60878, 14634, 7856, 40821, 3750, 31242, 46343, 65520}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{28971, 51217, 12747, 29755}, (char) (15152 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.alpha(0), new char[]{39340, 14535, 13923, 5206, 48871, 46991, 7745, 32215, 1836, 62274, 27605, 3395, 25588, 62642, 40098, 21134, 38025, 59105}, objArr10);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    try {
                        Object[] objArr11 = {applicationContext, Integer.valueOf(i), 0, 243770112};
                        byte[] bArr2 = $$d;
                        byte b4 = bArr2[50];
                        byte b5 = (byte) (b4 + 1);
                        byte b6 = (byte) (-b4);
                        Object[] objArr12 = new Object[1];
                        f(b5, b6, (byte) (b6 - 1), objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        byte b7 = bArr2[50];
                        byte b8 = (byte) (-b7);
                        Object[] objArr13 = new Object[1];
                        f(b8, (byte) (b8 - 1), (byte) (-b7), objArr13);
                        objArr = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                        if (applicationContext != null) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                int iResolveSize = View.resolveSize(0, 0) + 876;
                                int size = View.MeasureSpec.getSize(0) + 10;
                                byte b9 = $$a[7];
                                byte b10 = b9;
                                Object[] objArr14 = new Object[1];
                                c(b9, b10, b10, objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode, iResolveSize, size, 2012931276, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr15 = new Object[1];
                                e(new char[]{0, 0, 0, 0}, new char[]{39970, 8376, 19789, 47009}, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), KeyEvent.getMaxKeyCode() >> 16, new char[]{64778, 14937, 59841, 51392, 42320, 50264, 15845, 2042, 55879, 30561, 48829, 39784, 2786, 3291, 23921, 32567, 36438, 44520, 38625, 58818, 32478, 46336}, objArr15);
                                Class<?> cls4 = Class.forName((String) objArr15[0]);
                                Object[] objArr16 = new Object[1];
                                e(new char[]{0, 0, 0, 0}, new char[]{23896, 4947, 65263, 1949}, (char) (View.MeasureSpec.getSize(0) + 40446), TextUtils.indexOf((CharSequence) "", '0', 0) - 283946146, new char[]{8543, 62837, 42625, 58742, 52051, 63255, 30792, 37353, 61615, 39362, 36113, 49608, 5481, 21473, 35101}, objArr16);
                                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char defaultSize = (char) View.getDefaultSize(0, 0);
                                    int i8 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int i9 = 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    byte b11 = $$a[7];
                                    Object[] objArr17 = new Object[1];
                                    c((byte) 52, b11, b11, objArr17);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, i8, i9, 2012020043, false, (String) objArr17[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 876;
                                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 11;
                                    byte[] bArr3 = $$a;
                                    Object[] objArr18 = new Object[1];
                                    c((byte) 89, bArr3[7], bArr3[28], objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, offsetAfter, iLastIndexOf, -1650998592, false, (String) objArr18[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                        c = 2;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                int i10 = ((int[]) objArr[c])[0];
                int i11 = ((int[]) objArr[0])[0];
                if (i11 == i10) {
                    int i12 = ((int[]) objArr[1])[0];
                    objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iMyTid = Process.myTid();
                    int i13 = 1153572500 + (((~((-524340877) | iMyTid)) | 50349576 | (~(484030647 | iMyTid))) * (-880));
                    int i14 = (~((-524340877) | (~iMyTid))) | (-484030648);
                    int i15 = ~(iMyTid | 524340876);
                    int i16 = i12 + i13 + ((i14 | i15) * (-880)) + (i15 * 880);
                    int i17 = (i16 << 13) ^ i16;
                    int i18 = i17 ^ (i17 >>> 17);
                    ((int[]) objArr2[1])[0] = i18 ^ (i18 << 5);
                    str = null;
                } else {
                    int[] iArr = new int[i11];
                    int i19 = i11 - 1;
                    iArr[i19] = 1;
                    int i20 = iArr[((i11 * i19) % 2) - 1];
                    str = null;
                    Toast.makeText((Context) null, i20, 1).show();
                    int i21 = ((int[]) objArr[1])[0];
                    objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i22 = i21 + ((((~(iUptimeMillis | 552070644)) | (-511760416)) * 56) - 338244340) + (((~((~iUptimeMillis) | (-511760416))) | 552070644) * 56);
                    int i23 = (i22 << 13) ^ i22;
                    int i24 = i23 ^ (i23 >>> 17);
                    ((int[]) objArr2[1])[0] = i24 ^ (i24 << 5);
                }
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    String name = thread != null ? thread.getName() : EnvironmentCompat.MEDIA_UNKNOWN;
                    int i25 = ((int[]) objArr2[1])[0];
                    int i26 = i25 * i25;
                    int i27 = -(488483599 * i25);
                    int i28 = (i26 & i27) + (i26 | i27);
                    int i29 = -(i25 * (-1605755733));
                    int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                    int i31 = (i30 & (-1109414711)) + ((-1109414711) | i30);
                    int i32 = i31 >> 23;
                    int i33 = ((((i32 | (-1023)) << 1) - (i32 ^ (-1023))) / 512) + 1;
                    int i34 = (i31 ^ i33) + ((i33 & i31) << 1);
                    int i35 = i31 >> 17;
                    int i36 = -(i34 ^ ((((((-65535) | i35) << 1) - (i35 ^ (-65535))) / 32768) + 1));
                    int i37 = (i36 ^ 3) + ((i36 & 3) << 1);
                    int i38 = i37 >> 21;
                    int i39 = (((i38 | (-4095)) << 1) - (i38 ^ (-4095))) / 2048;
                    int i40 = ((i39 | 1) << 1) - (i39 ^ 1);
                    Object[] objArr19 = new Object[3339 / (((-(((i40 | 1) << 1) - (1 ^ i40))) & i37) * 1113)];
                    objArr19[0] = name;
                    ViewPort.a(String.format("Processing exception (in thread %s) ...", objArr19));
                }
                if (!mergeconfigsTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(EventType.CRASH)) {
                    getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3("a crash");
                } else {
                    InstrumentationFlavor instrumentationFlavor = lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify;
                    if (instrumentationFlavor == InstrumentationFlavor.XAMARIN || instrumentationFlavor == InstrumentationFlavor.MAUI) {
                        Throwable cause2 = th;
                        loop0: while (true) {
                            if (cause2 == null) {
                                message = str;
                                break;
                            }
                            message = cause2.getMessage();
                            if (message != null) {
                                for (String str2 : message.split("\n")) {
                                    if (str2.startsWith("  at ")) {
                                        break loop0;
                                    }
                                }
                            }
                            cause2 = cause2.getCause();
                        }
                        if (message != null) {
                            getrelativerotation = new getRelativeRotation(th, message);
                        } else {
                            getrelativerotation = new getSecondaryCamera(th, Integer.MAX_VALUE);
                        }
                    } else {
                        getrelativerotation = new getSecondaryCamera(th, Integer.MAX_VALUE);
                    }
                    getTargetFrameRateInternal gettargetframerateinternalTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getrelativerotation.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    String str3 = gettargetframerateinternalTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (instrumentationFlavor == InstrumentationFlavor.REACT_NATIVE && str3 != null && str3.contains("JavascriptException")) {
                        getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3("a crash");
                    } else {
                        lambdaupdateTransformationInfo7 lambdaupdatetransformationinfo7 = new lambdaupdateTransformationInfo7(str3, gettargetframerateinternalTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3, gettargetframerateinternalTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, mergeconfigsTuitionPaymentFragmentbindingInflater1, i, gettargetframerateinternalTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.protocolValue);
                        getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3("a crash");
                        if (!this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaupdatetransformationinfo7, i, mergeconfigsTuitionPaymentFragmentbindingInflater1)) {
                            lambdaupdatetransformationinfo7.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
                            getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaupdatetransformationinfo7);
                        }
                    }
                }
            }
            getDeferrableSurface.b(5000L);
        }
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i5 = $11 + 51;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i7 = $10 + 37;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.myPid() >> 22) + 8328), 1234 - TextUtils.indexOf((CharSequence) "", '0', 0), 35 - KeyEvent.getDeadChar(0, 0), -653973969, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iIndexOf = TextUtils.indexOf("", "") + 2764;
                    int i9 = 15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte b3 = (byte) ($$f & 3);
                    byte b4 = (byte) (b3 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, iIndexOf, i9, 1504416861, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43324), 253 - (ViewConfiguration.getWindowTouchSlop() >> 8), 22 - Color.red(0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 65200);
                    int iAxisFromString = MotionEvent.axisFromString("") + 2892;
                    int bitsPerPixel = 16 - ImageFormat.getBitsPerPixel(0);
                    byte b5 = (byte) 1;
                    byte b6 = (byte) (b5 - 1);
                    String str$$g = $$g(b5, b6, (byte) (b6 - 1));
                    i2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iAxisFromString, bitsPerPixel, 2012627446, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) g) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) f936a) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6377398940819159759L;
        g = -981105359;
        f936a = (char) 46868;
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
    private static java.lang.String $$g(byte r5, int r6, int r7) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r7 = r7 + 4
            int r5 = r5 + 102
            byte[] r1 = defpackage.getExpectedFrameRate.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
        L26:
            int r4 = -r4
            int r5 = r5 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getExpectedFrameRate.$$g(byte, int, int):java.lang.String");
    }
}
