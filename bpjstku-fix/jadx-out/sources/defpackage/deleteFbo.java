package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.text.Typography;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes4.dex */
public final class deleteFbo {
    private static final byte[] $$c = {106, -22, 107, 95};
    private static final int $$f = 91;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {114, -59, 10, 31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 231;
    private static final byte[] $$a = {21, ByteCompanionObject.MAX_VALUE, 49, -115, -2, -5, -32, 32, 1, -20, 8, -20, -3, 6, -1, -10, -2, 14, -17, -2, -13};
    private static final int $$b = 207;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {60085, 60052, 60089, 60049, 60055, 60073, 60053, 60041, 60050, 60062, 60058, 60084, 60117, 60094, 60043, 60091, 60045, 60046, 60040, 60060, 60075, 60090, 60088, 60092, 60034, 60063, 60095, 60056, 60087, 60061, 60051, 60054, 60093, 60047, 60079, 60086};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 57191;

    private static void c(short s, int i, byte b, Object[] objArr) {
        int i2 = 16 - (s * 13);
        byte[] bArr = $$a;
        int i3 = b + 97;
        int i4 = i * 9;
        byte[] bArr2 = new byte[14 - i4];
        int i5 = 13 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3 = i3 + i5 + 5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            i2++;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = i3 + bArr[i2] + 5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 4
            int r7 = r7 + 84
            byte[] r0 = defpackage.deleteFbo.$$d
            int r5 = r5 * 52
            int r1 = 53 - r5
            byte[] r1 = new byte[r1]
            int r5 = 52 - r5
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
        L28:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deleteFbo.d(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:110:0x07d8 A[Catch: all -> 0x0927, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0927, blocks: (B:97:0x06ae, B:102:0x0765, B:110:0x07d8, B:107:0x07a0), top: B:179:0x06ae }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0b17  */
    /* JADX WARN: Code duplicated, block: B:188:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x03b5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0218  */
    /* JADX WARN: Code duplicated, block: B:29:0x0224 A[Catch: all -> 0x03c1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x03c1, blocks: (B:14:0x00fa, B:19:0x01a9, B:29:0x0224, B:33:0x025f, B:24:0x01e1), top: B:177:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:33:0x025f A[Catch: all -> 0x03c1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x03c1, blocks: (B:14:0x00fa, B:19:0x01a9, B:29:0x0224, B:33:0x025f, B:24:0x01e1), top: B:177:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0296 A[PHI: r1
  0x0296: PHI (r1v72 java.lang.Object[]) = (r1v71 java.lang.Object[]), (r1v99 java.lang.Object[]) binds: [B:35:0x0294, B:31:0x025c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:82:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:84:0x05c4  */
    public final OkHttpClient TuitionPaymentFragmentbindingInflater1(boolean z) throws Throwable {
        HttpLoggingInterceptor httpLoggingInterceptor;
        String string;
        CharSequence charSequence;
        int i;
        boolean z2;
        int i2;
        int i3;
        String string2;
        Throwable th;
        Object[] objArr;
        int i4;
        Object[] objArr2;
        int i5 = 2 % 2;
        Object[] objArr3 = new Object[1];
        a(new char[]{4, '\t', 22, 16, 16, 0, 11, 7, 18, '\r', '\b', '\n', 28, 5, 15, '!', 30, 15, '!', 11, Typography.quote, 31, 7, 31}, (byte) (MotionEvent.axisFromString("") + 73), 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
        int i6 = 0;
        String str = (String) objArr3[0];
        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor();
        httpLoggingInterceptor2.setLevel(z ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderConnectTimeout = builder.connectTimeout(5L, timeUnit);
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        byte b = $$a[8];
        byte b2 = (byte) (b - 1);
        Object[] objArr4 = new Object[1];
        c(b, b2, b2, objArr4);
        Method[] methodArr = {OkHttpClient.Builder.class.getMethod((String) objArr4[0], Interceptor.class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2823;
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22;
            byte b3 = $$d[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            d(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iNormalizeMetaState, maximumFlingVelocity, 1814927978, false, (String) objArr5[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) != null) {
            httpLoggingInterceptor = httpLoggingInterceptor2;
            break;
        }
        Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 2823 - View.MeasureSpec.getMode(0), 22 - KeyEvent.keyCodeFromString(""))).getDeclaredMethods();
        int length = declaredMethods.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                httpLoggingInterceptor = httpLoggingInterceptor2;
                break;
            }
            Method method = declaredMethods[i7];
            try {
                Class<?> cls = Class.forName(str);
                Method[] methodArr2 = declaredMethods;
                int i8 = length;
                Object[] objArr6 = new Object[1];
                a(new char[]{21, 7, Typography.quote, 30, 7, 31, 11, 26, '\t', '\n', 6, 19}, (byte) (TextUtils.getOffsetBefore("", i6) + 16), 12 - Color.blue(i6), objArr6);
                Object[] objArr7 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr6[0], null).invoke(method, null)).intValue())};
                Object[] objArr8 = new Object[1];
                a(new char[]{4, '\t', 22, 16, 16, 0, 11, 7, 18, '\r', '\b', '\n', 28, 5, 15, '!', 30, 15, 31, 5, 26, 7, 26, 11, '\n', '\b'}, (byte) (TextUtils.indexOf("", "", 0) + 39), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                httpLoggingInterceptor = httpLoggingInterceptor2;
                Object[] objArr9 = new Object[1];
                a(new char[]{6, 20, 4, 6, ' ', '\t', 15, '\n'}, (byte) (KeyEvent.normalizeMetaState(0) + 116), 8 - TextUtils.indexOf("", "", 0, 0), objArr9);
                if (((Boolean) cls2.getMethod((String) objArr9[0], Integer.TYPE).invoke(null, objArr7)).booleanValue()) {
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
                    TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                    if (i9 % 2 == 0) {
                        Class cls3 = Long.TYPE;
                        Class<?> cls4 = Class.forName(str);
                        Object[] objArr10 = new Object[1];
                        a(new char[]{21, 7, '#', 3, 15, 3, '\r', 11, '\n', 30, 26, '\f', 13936}, (byte) ((Process.myPid() << 52) * 40), 28 - View.resolveSizeAndState(0, 1, 1), objArr10);
                        if (cls3.equals(cls4.getMethod((String) objArr10[0], null).invoke(method, null))) {
                            i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                            if (i4 % 2 == 0) {
                                Class<?> cls5 = Class.forName(str);
                                Object[] objArr11 = new Object[1];
                                a(new char[]{21, 7, ' ', 21, 11, '\b', 7, Typography.quote, 15, 3, '\n', '\b', 30, 28, 15, '\b', 13829}, (byte) ((AudioTrack.getMaxVolume() > 1.0f ? 1 : (AudioTrack.getMaxVolume() == 1.0f ? 0 : -1)) + 51), 62 >>> (KeyEvent.getMaxKeyCode() + 111), objArr11);
                                objArr2 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method, null);
                                if (objArr2.length == 5) {
                                    continue;
                                } else if (Long.TYPE.equals(objArr2[0]) && Class.forName(str).equals(objArr2[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                        int iRgb = Color.rgb(0, 0, 0) + 16780039;
                                        int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                        byte b5 = $$d[7];
                                        byte b6 = b5;
                                        Object[] objArr12 = new Object[1];
                                        d(b5, b6, b6, objArr12);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup, iRgb, iIndexOf, 1814927978, false, (String) objArr12[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                        int i10 = 2824 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 22;
                                        byte b7 = $$d[7];
                                        byte b8 = b7;
                                        Object[] objArr13 = new Object[1];
                                        d(b7, b8, b8, objArr13);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop, i10, tapTimeout, 1814927978, false, (String) objArr13[0], null);
                                    }
                                    try {
                                        Object[] objArr14 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2823;
                                            int scrollBarFadeDuration = 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                            byte[] bArr = $$d;
                                            byte b9 = (byte) (-bArr[5]);
                                            Object[] objArr15 = new Object[1];
                                            d(b9, b9, bArr[54], objArr15);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup2, threadPriority, scrollBarFadeDuration, -2137287382, false, (String) objArr15[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr14)).longValue();
                                        break;
                                    } catch (Throwable th2) {
                                        Throwable cause = th2.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th2;
                                    }
                                }
                            } else {
                                Class<?> cls6 = Class.forName(str);
                                Object[] objArr16 = new Object[1];
                                a(new char[]{21, 7, ' ', 21, 11, '\b', 7, Typography.quote, 15, 3, '\n', '\b', 30, 28, 15, '\b', 13829}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27), (KeyEvent.getMaxKeyCode() >> 16) + 17, objArr16);
                                objArr2 = (Object[]) cls6.getMethod((String) objArr16[0], null).invoke(method, null);
                                if (objArr2.length == 2) {
                                    continue;
                                } else if (Long.TYPE.equals(objArr2[0])) {
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Class cls7 = Long.TYPE;
                        Class<?> cls8 = Class.forName(str);
                        Object[] objArr17 = new Object[1];
                        a(new char[]{21, 7, '#', 3, 15, 3, '\r', 11, '\n', 30, 26, '\f', 13936}, (byte) (113 - (Process.myPid() >> 22)), 13 - View.resolveSizeAndState(0, 0, 0), objArr17);
                        if (cls7.equals(cls8.getMethod((String) objArr17[0], null).invoke(method, null))) {
                            i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                            if (i4 % 2 == 0) {
                                Class<?> cls9 = Class.forName(str);
                                Object[] objArr18 = new Object[1];
                                a(new char[]{21, 7, ' ', 21, 11, '\b', 7, Typography.quote, 15, 3, '\n', '\b', 30, 28, 15, '\b', 13829}, (byte) ((AudioTrack.getMaxVolume() > 1.0f ? 1 : (AudioTrack.getMaxVolume() == 1.0f ? 0 : -1)) + 51), 62 >>> (KeyEvent.getMaxKeyCode() + 111), objArr18);
                                objArr2 = (Object[]) cls9.getMethod((String) objArr18[0], null).invoke(method, null);
                                if (objArr2.length == 5) {
                                    continue;
                                } else if (Long.TYPE.equals(objArr2[0])) {
                                    continue;
                                }
                            } else {
                                Class<?> cls10 = Class.forName(str);
                                Object[] objArr19 = new Object[1];
                                a(new char[]{21, 7, ' ', 21, 11, '\b', 7, Typography.quote, 15, 3, '\n', '\b', 30, 28, 15, '\b', 13829}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27), (KeyEvent.getMaxKeyCode() >> 16) + 17, objArr19);
                                objArr2 = (Object[]) cls10.getMethod((String) objArr19[0], null).invoke(method, null);
                                if (objArr2.length == 2) {
                                    continue;
                                } else if (Long.TYPE.equals(objArr2[0])) {
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i7++;
                declaredMethods = methodArr2;
                length = i8;
                httpLoggingInterceptor2 = httpLoggingInterceptor;
                i6 = 0;
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
            int i11 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2822;
            int iArgb = Color.argb(0, 0, 0, 0) + 22;
            byte b10 = $$d[7];
            byte b11 = b10;
            Object[] objArr20 = new Object[1];
            d(b10, b11, b11, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i11, iArgb, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int mirror = 2871 - AndroidCharacter.getMirror('0');
            int i12 = 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte b12 = (byte) (-$$d[5]);
            Object[] objArr22 = new Object[1];
            d(b12, b12, (byte) 14, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration2, mirror, i12, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char touchSlop = (char) (37657 - (ViewConfiguration.getTouchSlop() >> 8));
            int keyRepeatTimeout = 2720 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int deadChar = 19 - KeyEvent.getDeadChar(0, 0);
            byte b13 = (byte) (-$$d[5]);
            Object[] objArr24 = new Object[1];
            d(b13, b13, (byte) 14, objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(touchSlop, keyRepeatTimeout, deadChar, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j = -363185274;
        long j2 = 52;
        long j3 = -1;
        long jIdentityHashCode = ((long) System.identityHashCode(this)) ^ j3;
        long j4 = jIdentityHashCode | j;
        long j5 = jLongValue ^ j3;
        long j6 = j ^ j3;
        long j7 = (((long) (-51)) * j) + (((long) 53) * jLongValue) + (((j4 | jLongValue) ^ j3) * j2) + (((long) (-52)) * (((j5 | jIdentityHashCode) ^ j3) | ((j5 | j) ^ j3) | (j4 ^ j3))) + (j2 * (((j6 | jLongValue) ^ j3) | ((j6 | jIdentityHashCode) ^ j3))) + ((long) (-1447220571));
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i13 = ~iFreeMemory;
        int i14 = 755804920 + (((~((-197806903) | i13)) | 20971552) * (-1188));
        int i15 = (~(iFreeMemory | 197806902)) | 20971552;
        int i16 = ~(1635033313 | i13);
        int i17 = ((int) (j7 >> 32)) & (i14 + ((i15 | i16) * 594) + (((~(197806902 | i13)) | (-1811868664) | i16) * 594));
        int iIdentityHashCode = System.identityHashCode(this);
        int i18 = ~iIdentityHashCode;
        int i19 = i17 | (((int) j7) & (((((~(i18 | (-606542289))) | ((~(830684121 | i18)) | 69468160)) * (-397)) - 2036276640) + ((iIdentityHashCode | 363078153) * 397)));
        int i20 = i19 >>> 24;
        int i21 = i19 & ViewCompat.MEASURED_SIZE_MASK;
        int i22 = i20 != 0 ? 1 : 0;
        if (i22 != 0) {
            int i23 = TuitionPaymentFragmentbindingInflater1 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 46 / 0;
                if (i21 < 1) {
                    Method method2 = methodArr[i21];
                    string = method2 != null ? method2.toString() : null;
                }
            } else if (i21 < 1) {
                Method method3 = methodArr[i21];
                if (method3 != null) {
                }
            }
        }
        arrayList.add(string);
        if ((i20 + 6) * i22 != 0) {
            int[] iArr = new int[iIntValue];
            int i25 = iIntValue - 1;
            iArr[i25] = 1;
            Toast.makeText((Context) null, iArr[((iIntValue * i25) % 2) - 1], 1).show();
        }
        OkHttpClient.Builder builderWriteTimeout = builderConnectTimeout.readTimeout(5L, timeUnit).writeTimeout(5L, timeUnit);
        ArrayList arrayList2 = new ArrayList();
        byte b14 = $$a[8];
        byte b15 = (byte) (b14 - 1);
        byte b16 = b14;
        Object[] objArr25 = new Object[1];
        c(b15, b16, b16, objArr25);
        Method[] methodArr3 = {OkHttpClient.Builder.class.getMethod((String) objArr25[0], new Class[0])};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int mirror2 = 2871 - AndroidCharacter.getMirror('0');
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 22;
            byte b17 = $$d[7];
            byte b18 = b17;
            Object[] objArr26 = new Object[1];
            d(b17, b18, b18, objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveSizeAndState, mirror2, edgeSlop, 1814927978, false, (String) objArr26[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null) == null) {
            Method[] declaredMethods2 = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 2823 - View.MeasureSpec.getSize(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22)).getDeclaredMethods();
            int length2 = declaredMethods2.length;
            int i26 = 0;
            while (i26 < length2) {
                Method method4 = declaredMethods2[i26];
                try {
                    Class<?> cls11 = Class.forName(str);
                    Object[] objArr27 = new Object[1];
                    a(new char[]{21, 7, Typography.quote, 30, 7, 31, 11, 26, '\t', '\n', 6, 19}, (byte) (16 - (ViewConfiguration.getLongPressTimeout() >> 16)), View.resolveSizeAndState(0, 0, 0) + 12, objArr27);
                    Object[] objArr28 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr27[0], null).invoke(method4, null)).intValue())};
                    Object[] objArr29 = new Object[1];
                    a(new char[]{4, '\t', 22, 16, 16, 0, 11, 7, 18, '\r', '\b', '\n', 28, 5, 15, '!', 30, 15, 31, 5, 26, 7, 26, 11, '\n', '\b'}, (byte) (39 - (ViewConfiguration.getTapTimeout() >> 16)), 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr29);
                    Class<?> cls12 = Class.forName((String) objArr29[0]);
                    Method[] methodArr4 = declaredMethods2;
                    Object[] objArr30 = new Object[1];
                    a(new char[]{6, 20, 4, 6, ' ', '\t', 15, '\n'}, (byte) (Color.rgb(0, 0, 0) + 16777332), 8 - (ViewConfiguration.getEdgeSlop() >> 16), objArr30);
                    if (((Boolean) cls12.getMethod((String) objArr30[0], Integer.TYPE).invoke(null, objArr28)).booleanValue()) {
                        int i27 = TuitionPaymentFragmentbindingInflater1 + 29;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i27 % 128;
                        if (i27 % 2 != 0) {
                            Class cls13 = Long.TYPE;
                            Class<?> cls14 = Class.forName(str);
                            Object[] objArr31 = new Object[1];
                            a(new char[]{21, 7, '#', 3, 15, 3, '\r', 11, '\n', 30, 26, '\f', 13936}, (byte) (16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 13 - KeyEvent.keyCodeFromString(""), objArr31);
                            if (cls13.equals(cls14.getMethod((String) objArr31[0], null).invoke(method4, null))) {
                                Class<?> cls15 = Class.forName(str);
                                Object[] objArr32 = new Object[1];
                                a(new char[]{21, 7, ' ', 21, 11, '\b', 7, Typography.quote, 15, 3, '\n', '\b', 30, 28, 15, '\b', 13829}, (byte) (View.resolveSize(0, 0) + 28), 17 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr32);
                                objArr = (Object[]) cls15.getMethod((String) objArr32[0], null).invoke(method4, null);
                                if (objArr.length == 2 && Long.TYPE.equals(objArr[0]) && Class.forName(str).equals(objArr[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                        char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        int maximumDrawingCacheSize = 2823 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        int maxKeyCode = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                                        byte b19 = $$d[7];
                                        byte b20 = b19;
                                        Object[] objArr33 = new Object[1];
                                        d(b19, b20, b20, objArr33);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, maximumDrawingCacheSize, maxKeyCode, 1814927978, false, (String) objArr33[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, method4);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2824;
                                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 22;
                                        byte b21 = $$d[7];
                                        byte b22 = b21;
                                        Object[] objArr34 = new Object[1];
                                        d(b21, b22, b22, objArr34);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(fadingEdgeLength, bitsPerPixel, iResolveOpacity, 1814927978, false, (String) objArr34[0], null);
                                    }
                                    Object[] objArr35 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                        char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2823;
                                        int i28 = 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                        byte[] bArr2 = $$d;
                                        byte b23 = (byte) (-bArr2[5]);
                                        Object[] objArr36 = new Object[1];
                                        d(b23, b23, bArr2[54], objArr36);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(maximumFlingVelocity2, absoluteGravity, i28, -2137287382, false, (String) objArr36[0], new Class[]{Long.TYPE, Method.class});
                                    }
                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr35)).longValue();
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            Class cls16 = Long.TYPE;
                            Class<?> cls17 = Class.forName(str);
                            Object[] objArr37 = new Object[1];
                            a(new char[]{21, 7, '#', 3, 15, 3, '\r', 11, '\n', 30, 26, '\f', 13936}, (byte) (114 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 13 - KeyEvent.keyCodeFromString(""), objArr37);
                            if (cls16.equals(cls17.getMethod((String) objArr37[0], null).invoke(method4, null))) {
                                Class<?> cls18 = Class.forName(str);
                                Object[] objArr38 = new Object[1];
                                a(new char[]{21, 7, ' ', 21, 11, '\b', 7, Typography.quote, 15, 3, '\n', '\b', 30, 28, 15, '\b', 13829}, (byte) (View.resolveSize(0, 0) + 28), 17 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr38);
                                objArr = (Object[]) cls18.getMethod((String) objArr38[0], null).invoke(method4, null);
                                if (objArr.length == 2) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i26++;
                    declaredMethods2 = methodArr4;
                } catch (Throwable th4) {
                    Throwable cause3 = th4.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th4;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int trimmedLength = 2823 - TextUtils.getTrimmedLength("");
            int maxKeyCode2 = 22 - (KeyEvent.getMaxKeyCode() >> 16);
            byte b24 = $$d[7];
            byte b25 = b24;
            Object[] objArr39 = new Object[1];
            d(b24, b25, b25, objArr39);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(mode, trimmedLength, maxKeyCode2, 1814927978, false, (String) objArr39[0], null);
        }
        Object[] objArr40 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            charSequence = "";
            char cIndexOf = (char) TextUtils.indexOf(charSequence, charSequence, 0, 0);
            int iRed = 2823 - Color.red(0);
            int i29 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
            byte b26 = (byte) (-$$d[5]);
            Object[] objArr41 = new Object[1];
            d(b26, b26, (byte) 14, objArr41);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf, iRed, i29, 1025296417, false, (String) objArr41[0], new Class[]{Object.class});
        } else {
            charSequence = "";
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr40);
        Object[] objArr42 = {0, methodArr3, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
            char tapTimeout2 = (char) (37657 - (ViewConfiguration.getTapTimeout() >> 16));
            int offsetBefore = 2720 - TextUtils.getOffsetBefore(charSequence, 0);
            int size = View.MeasureSpec.getSize(0) + 19;
            byte b27 = (byte) (-$$d[5]);
            Object[] objArr43 = new Object[1];
            d(b27, b27, (byte) 14, objArr43);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(tapTimeout2, offsetBefore, size, -1568796068, false, (String) objArr43[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr42)).longValue();
        long j8 = 306038373;
        long j9 = 471;
        long j10 = (j9 * j8) + (j9 * jLongValue2);
        long j11 = -470;
        long j12 = jLongValue2 ^ j3;
        long jIdentityHashCode2 = System.identityHashCode(this);
        long j13 = (((jIdentityHashCode2 ^ j3) | j8) | jLongValue2) ^ j3;
        long j14 = j10 + ((j8 | jLongValue2) * j11) + (j11 * ((((j8 ^ j3) | j12) ^ j3) | ((j12 | jIdentityHashCode2) ^ j3) | j13)) + (((long) 470) * (j13 | (((j12 | j8) | jIdentityHashCode2) ^ j3))) + ((long) (-2116444218));
        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int i30 = (-818885110) + (((~(1933058954 | iFreeMemory2)) | (-2000529355) | (~(924681930 | iFreeMemory2))) * (-880));
        int i31 = (~(1933058954 | (~iFreeMemory2))) | (-924681931);
        int i32 = ~(iFreeMemory2 | (-1933058955));
        int i33 = ((int) (j14 >> 32)) & (i30 + ((i31 | i32) * (-880)) + (i32 * 880));
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i34 = ~((-815269025) | iIdentityHashCode2);
        int i35 = ~iIdentityHashCode2;
        int i36 = i33 | (((int) j14) & (1361507824 + ((i34 | (~((-136585477) | i35))) * 497) + (((~(iIdentityHashCode2 | (-136585477))) | (~((-1905886386) | i35)) | 1090617361) * 497)));
        int i37 = i36 >>> 24;
        int i38 = i36 & ViewCompat.MEASURED_SIZE_MASK;
        if (i37 != 0) {
            int i39 = TuitionPaymentFragmentbindingInflater1 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i39 % 128;
            i = 2;
            int i40 = i39 % 2;
            z2 = true;
        } else {
            i = 2;
            z2 = false;
        }
        if (z2) {
            int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
            TuitionPaymentFragmentbindingInflater1 = i41 % 128;
            int i42 = i41 % i;
            i2 = 1;
            i3 = 1;
        } else {
            i2 = 1;
            i3 = 0;
        }
        if (!(!z2) && i38 < i2) {
            int i43 = TuitionPaymentFragmentbindingInflater1 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i43 % 128;
            if (i43 % 2 != 0) {
                Method method5 = methodArr3[i38];
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Method method6 = methodArr3[i38];
            if (method6 != null) {
                string2 = method6.toString();
                th = null;
            } else {
                th = null;
                string2 = null;
            }
        } else {
            th = null;
            string2 = null;
        }
        arrayList2.add(string2);
        if ((i37 + 6) * i3 == 0) {
            return builderWriteTimeout.addInterceptor(httpLoggingInterceptor).build();
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0123  */
    /* JADX WARN: Code duplicated, block: B:36:0x013a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0186 A[Catch: all -> 0x007d, TryCatch #1 {all -> 0x007d, blocks: (B:7:0x0022, B:9:0x0030, B:10:0x0064, B:37:0x013c, B:39:0x0186, B:40:0x01ff, B:44:0x021e, B:46:0x025a, B:48:0x02c5), top: B:71:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0212  */
    /* JADX WARN: Code duplicated, block: B:46:0x025a A[Catch: all -> 0x007d, TryCatch #1 {all -> 0x007d, blocks: (B:7:0x0022, B:9:0x0030, B:10:0x0064, B:37:0x013c, B:39:0x0186, B:40:0x01ff, B:44:0x021e, B:46:0x025a, B:48:0x02c5), top: B:71:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:50:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:52:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x0322  */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        char c = '0';
        int i4 = 1770390596;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", c, 0) + 1);
                        int maxKeyCode = 2267 - (KeyEvent.getMaxKeyCode() >> 16);
                        int packedPositionType = ExpandableListView.getPackedPositionType(j) + 33;
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, maxKeyCode, packedPositionType, -1927765101, false, $$g(b2, b3, (byte) (b3 + 4)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                    i5++;
                    c = '0';
                    i4 = 1770390596;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b4 = (byte) 0;
                byte b5 = (byte) (b4 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 2267 - (ViewConfiguration.getLongPressTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 33, -1927765101, false, $$g(b4, b5, (byte) (b5 + 4)), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i6 = $10 + 53;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        } else {
                            objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49266), 3261 - (Process.myPid() >> 22), View.MeasureSpec.getMode(0) + 30, -127612708, false, $$g(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                int i7 = $11 + 125;
                                $10 = i7 % 128;
                                int i8 = i7 % 2;
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b8 = (byte) 0;
                                    byte b9 = (byte) (b8 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22878 - TextUtils.getCapsMode("", 0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 593, 17 - View.MeasureSpec.makeMeasureSpec(0, 0), 1570859318, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                int i9 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i9];
                                int i10 = $11 + 9;
                                $10 = i10 % 128;
                                int i11 = i10 % 2;
                            } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                            } else {
                                int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                            }
                        }
                    } else {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        } else {
                            objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = (byte) (b10 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49266), 3261 - (Process.myPid() >> 22), View.MeasureSpec.getMode(0) + 30, -127612708, false, $$g(b10, b11, (byte) (b11 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                int i16 = $11 + 125;
                                $10 = i16 % 128;
                                int i17 = i16 % 2;
                                Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b12 = (byte) 0;
                                    byte b13 = (byte) (b12 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22878 - TextUtils.getCapsMode("", 0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 593, 17 - View.MeasureSpec.makeMeasureSpec(0, 0), 1570859318, false, $$g(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                                int i19 = $11 + 9;
                                $10 = i19 % 128;
                                int i110 = i19 % 2;
                            } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i111 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i112 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i111];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i112];
                            } else {
                                int i113 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i114 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i113];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i114];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                }
            }
            int i20 = $11 + 107;
            $10 = i20 % 128;
            int i21 = i20 % 2;
            for (int i22 = 0; i22 < i; i22++) {
                cArr4[i22] = (char) (cArr4[i22] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, short r6, int r7) {
        /*
            int r7 = 116 - r7
            int r6 = r6 + 4
            int r5 = r5 * 2
            int r0 = 1 - r5
            byte[] r1 = defpackage.deleteFbo.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
        L27:
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deleteFbo.$$g(byte, short, int):java.lang.String");
    }
}
