package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class FallbackStrategyRuleStrategy implements higherQualityOrLowerThan {
    private boolean TuitionPaymentFragmentbindingInflater1;
    private final Cache TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Call.Factory b;
    private static final byte[] $$c = {5, -91, 77, 46};
    private static final int $$f = 15;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {59, -124, -78, 46, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 68;
    private static final byte[] $$a = {83, -4, -55, -17, 16, -15, 0, -11};
    private static final int $$b = 197;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f140a = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {45558, 38253, 63690, 56397, 9202, 1824, 27293, 19970, 38267, 63650, 56398, 9161, 1850, 27296, 19993, 38287, 63720, 56354, 9201, 1865, 27304, 20004, 38291, 63752, 19614, 26636, 1453, 8452, 57046, 64077, 38896, 45935, 26640, 1420, 8491, 57018, 53398, 62477, 39338, 48429, 17042, 26176, 3069, 12130, 62491, 39362, 48430, 17065, 26202, 3008, 12153, 62703, 39304, 48450, 17041, 26147, 3032, 12101, 62714, 39013, 48409, 17054, 45557, 38271, 63730, 56397, 9128, 1829, 27274, 19977, 4929, 14291, 23154, 32452, 33027, 42370, 51251, 60580, 14280, 23138, 32511, 33126, 42371, 41947, 34633, 60136, 52828, 12701, 5406, 30909, 23585, 34649, 60120, 52857, 12798, 5416, 30869, 23596, 34729, 60111};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1779959743334410996L;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r0 = 5 - r8
            int r6 = r6 * 2
            int r6 = r6 + 98
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = defpackage.FallbackStrategyRuleStrategy.$$a
            byte[] r0 = new byte[r0]
            int r8 = 4 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r7 = r7 + r4
            int r7 = r7 + 3
            int r6 = r6 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FallbackStrategyRuleStrategy.c(byte, int, short, java.lang.Object[]):void");
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
    private static void d(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 1
            int r8 = 103 - r8
            int r7 = r7 + 4
            byte[] r0 = defpackage.FallbackStrategyRuleStrategy.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L27
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r7]
        L27:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FallbackStrategyRuleStrategy.d(int, short, short, java.lang.Object[]):void");
    }

    public FallbackStrategyRuleStrategy(Context context) {
        this(outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(context));
    }

    private FallbackStrategyRuleStrategy(File file) {
        this(file, outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(file));
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0663  */
    private FallbackStrategyRuleStrategy(File file, long j) throws Throwable {
        int i;
        int i2;
        String string;
        ArrayList arrayList = new ArrayList();
        byte b = $$a[6];
        byte b2 = b;
        Object[] objArr = new Object[1];
        c(b, b2, b2, objArr);
        Method[] methodArr = {OkHttpClient.Builder.class.getMethod((String) objArr[0], new Class[0])};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int jumpTapTimeout = 2823 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int trimmedLength = TextUtils.getTrimmedLength("") + 22;
            byte[] bArr = $$d;
            byte b3 = bArr[5];
            Object[] objArr2 = new Object[1];
            d((byte) (-b3), b3, bArr[54], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, jumpTapTimeout, trimmedLength, 1814927978, false, (String) objArr2[0], null);
        }
        Class<?>[] clsArr = null;
        int i3 = 2;
        try {
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.getThreadPriority(0) + 20) >> 6), Gravity.getAbsoluteGravity(0, 0) + 2823, 22 - ExpandableListView.getPackedPositionType(0L))).getDeclaredMethods();
                int length = declaredMethods.length;
                int i4 = 0;
                while (i4 < length) {
                    Method method = declaredMethods[i4];
                    int i5 = f140a + 119;
                    asInterface = i5 % 128;
                    int i6 = i5 % i3;
                    try {
                        Object[] objArr3 = new Object[1];
                        e(KeyEvent.getMaxKeyCode() >> 16, (Process.myPid() >> 22) + 24, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr3);
                        Class<?> cls = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        e(Gravity.getAbsoluteGravity(0, 0) + 24, 12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (64869 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr4);
                        Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], clsArr).invoke(method, clsArr)).intValue())};
                        Object[] objArr6 = new Object[1];
                        e(AndroidCharacter.getMirror('0') - '\f', 26 - View.resolveSizeAndState(0, 0, 0), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24928), objArr6);
                        Class<?> cls2 = Class.forName((String) objArr6[0]);
                        Object[] objArr7 = new Object[1];
                        e(62 - View.combineMeasuredStates(0, 0), TextUtils.lastIndexOf("", '0', 0) + 9, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
                        if (((Boolean) cls2.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue()) {
                            Class cls3 = Long.TYPE;
                            Object[] objArr8 = new Object[1];
                            e(TextUtils.getCapsMode("", 0, 0), 24 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr8);
                            Class<?> cls4 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            e(70 - Color.alpha(0), 13 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 41658), objArr9);
                            if (cls3.equals(cls4.getMethod((String) objArr9[0], null).invoke(method, null))) {
                                Object[] objArr10 = new Object[1];
                                e(TextUtils.getOffsetBefore("", 0), 24 - Color.argb(0, 0, 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), objArr10);
                                Class<?> cls5 = Class.forName((String) objArr10[0]);
                                Object[] objArr11 = new Object[1];
                                e(83 - KeyEvent.normalizeMetaState(0), TextUtils.getOffsetBefore("", 0) + 17, (char) (Color.alpha(0) + 4640), objArr11);
                                Object[] objArr12 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method, null);
                                if (objArr12.length == 2 && Long.TYPE.equals(objArr12[0])) {
                                    int i7 = asInterface + 37;
                                    f140a = i7 % 128;
                                    int i8 = i7 % 2;
                                    Object[] objArr13 = new Object[1];
                                    e(ViewConfiguration.getTapTimeout() >> 16, 24 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr13);
                                    if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                        int i9 = f140a + 69;
                                        asInterface = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                                                int packedPositionGroup = 2823 - ExpandableListView.getPackedPositionGroup(0L);
                                                int i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                                                byte[] bArr2 = $$d;
                                                byte b4 = bArr2[5];
                                                Object[] objArr14 = new Object[1];
                                                d((byte) (-b4), b4, bArr2[54], objArr14);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, packedPositionGroup, i10, 1814927978, false, (String) objArr14[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                                                int i11 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2822;
                                                int tapTimeout = 22 - (ViewConfiguration.getTapTimeout() >> 16);
                                                byte[] bArr3 = $$d;
                                                byte b5 = bArr3[5];
                                                Object[] objArr15 = new Object[1];
                                                d((byte) (-b5), b5, bArr3[54], objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, i11, tapTimeout, 1814927978, false, (String) objArr15[0], null);
                                            }
                                            Object[] objArr16 = {1L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char cArgb2 = (char) Color.argb(0, 0, 0, 0);
                                                int iMyPid = 2823 - (Process.myPid() >> 22);
                                                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22;
                                                byte b6 = $$d[7];
                                                byte b7 = b6;
                                                Object[] objArr17 = new Object[1];
                                                d(b7, (byte) (b7 | 51), b6, objArr17);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb2, iMyPid, keyRepeatDelay, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr16)).longValue();
                                        } else {
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                int defaultSize = View.getDefaultSize(0, 0) + 2823;
                                                int deadChar2 = 22 - KeyEvent.getDeadChar(0, 0);
                                                byte[] bArr4 = $$d;
                                                byte b8 = bArr4[5];
                                                Object[] objArr18 = new Object[1];
                                                d((byte) (-b8), b8, bArr4[54], objArr18);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout2, defaultSize, deadChar2, 1814927978, false, (String) objArr18[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, method);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                char c = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2824;
                                                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 22;
                                                byte[] bArr5 = $$d;
                                                byte b9 = bArr5[5];
                                                Object[] objArr19 = new Object[1];
                                                d((byte) (-b9), b9, bArr5[54], objArr19);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iIndexOf, windowTouchSlop, 1814927978, false, (String) objArr19[0], null);
                                            }
                                            Object[] objArr20 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                                                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 2823;
                                                int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 22;
                                                byte b10 = $$d[7];
                                                byte b11 = b10;
                                                Object[] objArr21 = new Object[1];
                                                d(b11, (byte) (b11 | 51), b10, objArr21);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(bitsPerPixel, iResolveSizeAndState, packedPositionGroup2, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr20)).longValue();
                                        }
                                        int i12 = 2 % 2;
                                        break;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i4++;
                        clsArr = null;
                        i3 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2823;
                int iResolveSize = View.resolveSize(0, 0) + 22;
                byte[] bArr6 = $$d;
                byte b12 = bArr6[5];
                Object[] objArr22 = new Object[1];
                d((byte) (-b12), b12, bArr6[54], objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cRgb, jumpTapTimeout3, iResolveSize, 1814927978, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i13 = 2824 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i14 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte[] bArr7 = $$d;
                byte b13 = bArr7[7];
                Object[] objArr24 = new Object[1];
                d(b13, (byte) (b13 | 51), (byte) (bArr7[51] - 1), objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(maximumDrawingCacheSize, i13, i14, 1025296417, false, (String) objArr24[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr23);
            Object[] objArr25 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cIndexOf = (char) (37657 - TextUtils.indexOf("", "", 0));
                int iArgb = 2720 - Color.argb(0, 0, 0, 0);
                int i15 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19;
                byte[] bArr8 = $$d;
                byte b14 = bArr8[7];
                byte b15 = (byte) (bArr8[51] - 1);
                Object[] objArr26 = new Object[1];
                d(b14, (byte) (b14 | 51), b15, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf, iArgb, i15, -1568796068, false, (String) objArr26[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr25)).longValue();
            long j2 = -812213840;
            int iNextInt = new Random().nextInt();
            long j3 = -500;
            long j4 = (j3 * j2) + (j3 * jLongValue);
            long j5 = TypedValues.PositionType.TYPE_TRANSITION_EASING;
            long j6 = -1;
            long j7 = jLongValue ^ j6;
            long j8 = (j7 | j2) ^ j6;
            long j9 = j2 ^ j6;
            long j10 = iNextInt;
            long j11 = j4 + ((j8 | (((j9 | jLongValue) | j10) ^ j6)) * j5) + (((long) 1002) * ((j9 | j7) ^ j6)) + (j5 * (j6 ^ (jLongValue | (j9 | (j10 ^ j6))))) + ((long) (-998192005));
            int iNextInt2 = new Random().nextInt(965460594);
            int i16 = ((int) (j11 >> 32)) & (1114466002 + (((~(328285923 | iNextInt2)) | 1765512334) * (-366)) + (((~(iNextInt2 | 2075901679)) | 17896578) * 366));
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i17 = ~iElapsedRealtime;
            int i18 = i16 | (((int) j11) & ((-1943661036) + (((-1144472868) | i17) * (-757)) + ((~((-1141130530) | iElapsedRealtime)) * 1514) + (((~(iElapsedRealtime | (-3342339))) | (~(i17 | 292753542)) | (-1433884072)) * 757)));
            int i19 = i18 >>> 24;
            int i20 = i18 & ViewCompat.MEASURED_SIZE_MASK;
            boolean z = i19 != 0;
            if (z) {
                int i21 = asInterface + 37;
                f140a = i21 % 128;
                i = 2;
                if (i21 % 2 == 0) {
                    int i22 = 2 / 3;
                } else {
                    int i23 = 2 % 2;
                }
                i2 = 1;
            } else {
                i = 2;
                int i24 = f140a + 61;
                asInterface = i24 % 128;
                int i25 = i24 % 2;
                int i26 = 2 % 2;
                i2 = 0;
            }
            if (!z || i20 >= 1) {
                string = null;
            } else {
                int i27 = f140a;
                int i28 = i27 + 95;
                asInterface = i28 % 128;
                int i29 = i28 % i;
                Method method2 = methodArr[i20];
                if (method2 != null) {
                    int i30 = i27 + 81;
                    asInterface = i30 % 128;
                    if (i30 % i != 0) {
                        method2.toString();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    string = method2.toString();
                } else {
                    string = null;
                }
            }
            arrayList.add(string);
            if ((i19 + 6) * i2 != 0) {
                int i31 = 0 % 2;
                throw new ArithmeticException();
            }
            this(new OkHttpClient.Builder().cache(new Cache(file, j)).build());
            this.TuitionPaymentFragmentbindingInflater1 = false;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private FallbackStrategyRuleStrategy(OkHttpClient okHttpClient) {
        this.TuitionPaymentFragmentbindingInflater1 = true;
        this.b = okHttpClient;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = okHttpClient.cache();
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $10 + 95;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.getDeadChar(0, 0), 2188 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 40, 841711447, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.alpha(0) + 33017), 3012 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 26, 321985076, false, $$g(b3, b4, (byte) (b4 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 36505), 3376 - ExpandableListView.getPackedPositionType(0L), 17 - (ViewConfiguration.getScrollBarSize() >> 8), -968507904, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i7 = $11 + 115;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i9 = $11 + 107;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b7 = (byte) 0;
                byte b8 = (byte) (b7 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 36505), 3376 - View.resolveSize(0, 0), 16 - TextUtils.indexOf((CharSequence) "", '0'), -968507904, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    @Override // defpackage.higherQualityOrLowerThan
    public final Response TuitionPaymentFragmentspecialinlinedviewModeldefault3(Request request) throws Exception {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        f140a = i2 % 128;
        int i3 = i2 % 2;
        Response responseTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b.newCall(request));
        int i4 = asInterface + 121;
        f140a = i4 % 128;
        if (i4 % 2 != 0) {
            return responseTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, short r8, int r9) {
        /*
            int r9 = r9 * 2
            int r9 = 3 - r9
            byte[] r0 = defpackage.FallbackStrategyRuleStrategy.$$c
            int r8 = r8 * 3
            int r8 = r8 + 109
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r9 = -r9
            int r8 = r8 + r9
            r9 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FallbackStrategyRuleStrategy.$$g(short, short, int):java.lang.String");
    }
}
