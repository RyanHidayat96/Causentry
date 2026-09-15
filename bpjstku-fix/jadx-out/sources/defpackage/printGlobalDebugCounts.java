package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class printGlobalDebugCounts<V> extends addCameraCaptureCallback implements Future<V> {
    private static final byte[] $$c = {33, -59, 107, -108};
    private static final int $$d = 245;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {38, 31, -70, -1, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 188;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {48644, 4077, 56781, 43941, 31122, 51058, 38245, 25345, 12602, 65280, 19639, 6868, 59604, 46776, 1157, 53882, 41064, 28256, 15397, 35352, 23550, 10704, 45561, 22, 53809, 42078, 30327, 51335, 39580, 27780, 16073, 61675, 17164, 5386, 59197, 47455, 2925, 60318, 23155, 34894, 65063, 11330, 37606, 49393, 14032, 25763, 43724, 6491, 20335, 48463, 58158, 20741, 34787, 45557, 30, 53813, 42048, 30320, 51339, 39564, 27823, 16100, 61675, 17171, 5398, 59159, 47453, 2924, 56707};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -8244171283531038598L;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 84
            int r6 = r6 * 15
            int r0 = 53 - r6
            int r8 = r8 + 4
            byte[] r1 = defpackage.printGlobalDebugCounts.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2f
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r8 = r8 + 1
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.printGlobalDebugCounts.a(int, int, int, java.lang.Object[]):void");
    }

    protected abstract Future<? extends V> TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    @Override // defpackage.addCameraCaptureCallback
    public /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected printGlobalDebugCounts() {
    }

    public boolean cancel(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean zCancel = TuitionPaymentFragmentspecialinlinedviewModeldefault2().cancel(z);
        int i4 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return zCancel;
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i5 = $11 + 101;
            $10 = i5 % 128;
            if (i5 % i3 == 0) {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.resolveSize(0, 0), Color.red(0) + 2187, ExpandableListView.getPackedPositionChild(0L) + 41, 841711447, false, $$e(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getTouchSlop() >> 8) + 3011, 26 - TextUtils.getCapsMode("", 0, 0), 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (Process.myPid() >> 22)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3376, 17 - View.MeasureSpec.getSize(0), -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } else {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i >>> i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), 2186 - ((byte) KeyEvent.getModifierMetaStateMask()), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40, 841711447, false, $$e(b8, b9, (byte) (b9 + 2)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33016 - ExpandableListView.getPackedPositionChild(0L)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3010, 27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 321985076, false, $$e(b10, b11, b11), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 36506), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3375, 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -968507904, false, $$e(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            i3 = 2;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (TextUtils.indexOf("", "") + 36505), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3377, 16 - ImageFormat.getBitsPerPixel(0), -968507904, false, $$e(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
        int i8 = $11 + 73;
        $10 = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatTimeout = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
            int iGreen = Color.green(0) + 1755;
            int tapTimeout = 23 - (ViewConfiguration.getTapTimeout() >> 16);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[28], bArr[7], bArr[3], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, iGreen, tapTimeout, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(View.MeasureSpec.getSize(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, (char) (4089 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(TextUtils.getOffsetBefore("", 0) + 22, Color.alpha(0) + 15, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 29944);
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1755;
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 23;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            a(b2, b3, (byte) (b3 | 36), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, iResolveSizeAndState, fadingEdgeLength, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = b + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSizeAndState = (char) (29944 - View.resolveSizeAndState(0, 0, 0));
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1755;
                int capsMode = 23 - TextUtils.getCapsMode("", 0, 0);
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b4, b5, (byte) (b5 | 88), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, packedPositionType, capsMode, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[0])[0];
            objArr = new Object[]{new int[]{i7}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = 789895319 + (((~((~iIdentityHashCode) | (-137053234))) | (~((-362025543) | iIdentityHashCode))) * (-302)) + ((~((-137053234) | iIdentityHashCode)) * (-604)) + (((~(iIdentityHashCode | (-499078776))) | (-1073706744)) * 302) + 2131051858;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(View.combineMeasuredStates(0, 0) + 37, TextUtils.indexOf("", "", 0, 0) + 16, (char) (23144 - Color.green(0)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((ViewConfiguration.getLongPressTimeout() >> 16) + 53, Color.red(0) + 16, (char) Color.red(0), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {792332944};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - View.combineMeasuredStates(0, 0)), 1726 - (ViewConfiguration.getEdgeSlop() >> 16), ImageFormat.getBitsPerPixel(0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 2131051858, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                    int i11 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int iArgb = Color.argb(0, 0, 0, 0) + 23;
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr11 = new Object[1];
                    a(b6, b7, (byte) (b7 | 88), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, i11, iArgb, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    c(ViewConfiguration.getWindowTouchSlop() >> 8, 22 - KeyEvent.keyCodeFromString(""), (char) (View.MeasureSpec.getMode(0) + 4089), objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(TextUtils.lastIndexOf("", '0', 0, 0) + 23, '?' - AndroidCharacter.getMirror('0'), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                        int i12 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr14 = new Object[1];
                        a(b8, b9, (byte) (b9 | 36), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, i12, iLastIndexOf, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char doubleTapTimeout = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        int jumpTapTimeout = 1755 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iKeyCodeFromString = 23 - KeyEvent.keyCodeFromString("");
                        byte[] bArr2 = $$a;
                        Object[] objArr15 = new Object[1];
                        a(bArr2[28], bArr2[7], bArr2[3], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(doubleTapTimeout, jumpTapTimeout, iKeyCodeFromString, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentbindingInflater1$7879113;
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            while (i4 < strArr.length) {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
                b = i13 % 128;
                if (i13 % 2 == 0) {
                    arrayList.add(strArr[i4]);
                    i4 += 2;
                } else {
                    arrayList.add(strArr[i4]);
                    i4++;
                }
            }
            throw null;
        }
        int i14 = ((int[]) objArr[3])[0];
        int i15 = ((int[]) objArr[0])[0];
        Object[] objArr16 = {new int[]{i15}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
        int iNextInt = new Random().nextInt(2111057897);
        int i16 = ~iNextInt;
        int i17 = i14 + (-1656966403) + (((~((-373513268) | i16)) | (~(iNextInt | (-160910842)))) * 333) + (((~(iNextInt | (-373513268))) | (~(i16 | (-160910842)))) * 333);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr16[3])[0] = i19 ^ (i19 << 5);
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsDone = TuitionPaymentFragmentspecialinlinedviewModeldefault2().isDone();
        int i4 = b + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsDone;
        }
        throw null;
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        b = i2 % 128;
        int i3 = i2 % 2;
        Future<? extends V> futureTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (i3 != 0) {
            return futureTuitionPaymentFragmentspecialinlinedviewModeldefault2.get();
        }
        futureTuitionPaymentFragmentspecialinlinedviewModeldefault2.get();
        throw null;
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        int i = 2 % 2;
        int i2 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        V v = TuitionPaymentFragmentspecialinlinedviewModeldefault2().get(j, timeUnit);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        b = i4 % 128;
        int i5 = i4 % 2;
        return v;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r7, short r8, byte r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r0 = defpackage.printGlobalDebugCounts.$$c
            int r9 = r9 * 3
            int r9 = 115 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2a
        L17:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L1b:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r9]
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.printGlobalDebugCounts.$$e(int, short, byte):java.lang.String");
    }
}
