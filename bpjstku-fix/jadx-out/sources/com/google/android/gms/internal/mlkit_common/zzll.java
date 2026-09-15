package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.onCaptureSessionEnd;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public final class zzll {
    private static final byte[] $$a = {70, -114, 113, 8};
    private static final int $$b = 146;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int g = 0;
    private static int asInterface = 1;
    private static char[] b = {45535, 25609, 6679, 12364, 59038, 40127, 45772, 26894, 7981, 13643, 60210, 33201, 47037, 28129, 19, 13870, 60416, 33368, 47303, 28316, 1262, 15119, 53564, 34654, 48509, 21403, 2446, 16326, 53845, 34822, 48741, 45558, 25638, 6748, 12396, 59016, 40181, 45773, 26884, 7975, 13658, 60256, 33180, 47020, 28154, 'H', 13864, 60505, 33379, 47250, 28403, 1272, 15198, 53630, 34561, 48442, 21415, 2455, 16309, 53848, 34819, 48708, 21616, 2706, 8388, 55011, 36125, 41777, 22871, 15014, 61187, 37126, 47911, 28069, 6125, 14842, 57945, 37971, 48690, 24601, 2787, 15560, 59038, 35635, 48499, 26395, 2387, 13250, 58826, 36765, 45152, 23128, 3105, 13833, 55462, 33439, 46233, 22899, 863, 13608, 45565, 25641, 6734, 12415, 59039, 40114, 45786, 26959, 7975, 13632, 60284, 33153, 47037, 28141, 18, 13927, 60527, 33400, 47252, 28329, 1253, 15123, 53562, 45563, 25634, 6750, 12381, 59025, 40120, 45781, 26880, 7971, 13642, 60255, 33172, 47030, 28130, 1, 13868, 60510, 47147, 28159, 5016, 14761, 61257, 38244, 47884, 24729, 5873, 15510, 58026, 34903, 48747, 25659, 2500, 16305, 58762, 35756, 45314, 26459, 3383, 13022, 55539, 36486, 46245, 23116, '9', 13874, 56272, 33252, 46983, 23978, 856, 12163, 64087, 33840, 44545, 30945, 716, 11428, 63281, 33113, 43838, 29954, 8191, 10691, 62355, 40556, 43033, 29218, 7172, 9898, 61683, 39583, 42358, 20315, 6446, 8973, 52708, 38805, 41365, 19568, 5698, 6390, 52535, 45908, 39290, 20360, 13750, 7122, 49162, 46648, 40005, 45508, 25705, 6687, 12349, 59081, 23969, 34913, 63009, 56381, 2765, 28919, 24246, 34138, 62335, 55559, 1826, 41322, 29875, 2773, 8441, 62995, 35883, 41563, 31125, 3990, 9691, 64497, 37136, 42784, 32116, 4254, 9915, 64732, 37618, 43022, 52868, 6996, 25902, 20254, 39340, 58330, 52649, 5744, 24643, 18991, 37897, 65267, 51411, 4831, 32631, 18782, 37676, 64785, 51110, 4599, 31687, 17449, 44549, 63488, 49667, 11519, 30372, 16542, 44412, 63304, 49447, 11018, 30202, 24496};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1585269245984545721L;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 5903;
    private static char TuitionPaymentFragmentbindingInflater1 = 8519;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 54324;
    private static char d = 1189;

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i5 = $10 + 3;
            $11 = i5 % 128;
            if (i5 % i3 == 0) {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(b[i << i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.argb(0, 0, 0, 0), Color.red(0) + 2187, 39 - TextUtils.indexOf((CharSequence) "", '0', 0), 841711447, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.resolveSize(0, 0) + 33017), 3011 - Color.red(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25, 321985076, false, $$c((byte) ($$a[3] - 1), b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 36505);
                        int longPressTimeout = 3376 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iLastIndexOf = 16 - TextUtils.lastIndexOf("", '0', 0);
                        byte length = (byte) $$a.length;
                        byte b5 = (byte) (length - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumDrawingCacheSize, longPressTimeout, iLastIndexOf, -968507904, false, $$c(length, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(b[i + i7])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Drawable.resolveOpacity(0, 0), AndroidCharacter.getMirror('0') + 2139, 40 - View.getDefaultSize(0, 0), 841711447, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b8 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33018 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Process.getGidForName("") + 3012, Process.getGidForName("") + 27, 321985076, false, $$c((byte) ($$a[3] - 1), b8, b8), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) (36505 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int iIndexOf = 3375 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 17;
                    byte length2 = (byte) $$a.length;
                    byte b9 = (byte) (length2 - 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iIndexOf, iResolveOpacity, -968507904, false, $$c(length2, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
            int i8 = $11 + 11;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            i3 = 2;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i10 = $11 + 15;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 36505);
                    int i11 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3375;
                    int iIndexOf2 = 17 - TextUtils.indexOf("", "");
                    byte length3 = (byte) $$a.length;
                    byte b10 = (byte) (length3 - 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(jumpTapTimeout, i11, iIndexOf2, -968507904, false, $$c(length3, b10, b10), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                int i12 = 37 / 0;
            } else {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char windowTouchSlop = (char) (36505 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int trimmedLength = 3376 - TextUtils.getTrimmedLength("");
                    int i13 = 17 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte length4 = (byte) $$a.length;
                    byte b11 = (byte) (length4 - 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(windowTouchSlop, trimmedLength, i13, -968507904, false, $$c(length4, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
            }
        }
        objArr[0] = new String(cArr);
        int i14 = $11 + 101;
        $10 = i14 % 128;
        int i15 = i14 % 2;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i5 = $10 + 7;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i7 = $11 + 121;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            int i9 = 58224;
            int i10 = 0;
            while (i10 < 16) {
                int i11 = $10 + 43;
                $11 = i11 % 128;
                int i12 = i11 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i13 = i10;
                int i14 = (c3 + i9) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i15 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(d);
                    objArr2[i3] = Integer.valueOf(i15);
                    objArr2[1] = Integer.valueOf(i14);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cMyPid = (char) ((Process.myPid() >> 22) + 47773);
                        int maximumDrawingCacheSize = 468 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i3] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, maximumDrawingCacheSize, iMakeMeasureSpec, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    onCaptureSessionEnd oncapturesessionend2 = oncapturesessionend;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AndroidCharacter.getMirror('0') + 47725), 468 - Color.argb(0, 0, 0, 0), 13 - (ViewConfiguration.getScrollBarSize() >> 8), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10 = i13 + 1;
                    oncapturesessionend = oncapturesessionend2;
                    i3 = 2;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            onCaptureSessionEnd oncapturesessionend3 = oncapturesessionend;
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend3, oncapturesessionend3};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int i16 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2322;
                int iIndexOf = 44 - TextUtils.indexOf("", "", 0, 0);
                byte b2 = (byte) 0;
                byte b3 = b2;
                String str$$c = $$c(b2, b3, b3);
                i2 = 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, i16, iIndexOf, -1312321721, false, str$$c, new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            oncapturesessionend = oncapturesessionend3;
            i3 = i2;
        }
    }

    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2) {
        int capsMode;
        int tapTimeout;
        int i3;
        String str;
        int i4;
        int i5;
        char c;
        char cIndexOf;
        int i6;
        Object[] objArr;
        Method method;
        int i7;
        int i8;
        int i9;
        int iTuitionPaymentFragmentbindingInflater1;
        int i10;
        int i11 = 2 % 2;
        if (context != null) {
            int i12 = asInterface + 89;
            g = i12 % 128;
            try {
                if (i12 % 2 != 0) {
                    capsMode = TextUtils.getCapsMode("", 1, 1);
                    tapTimeout = ViewConfiguration.getTapTimeout();
                    i3 = 47;
                } else {
                    capsMode = TextUtils.getCapsMode("", 0, 0);
                    tapTimeout = ViewConfiguration.getTapTimeout();
                    i3 = 31;
                }
                int i13 = -(tapTimeout >> 16);
                int i14 = (i3 & i13) + (i13 | i3);
                char mirror = AndroidCharacter.getMirror('0');
                int i15 = asInterface;
                int i16 = (i15 & 9) + (i15 | 9);
                g = i16 % 128;
                int i17 = i16 % 2;
                Object[] objArr2 = new Object[1];
                a(capsMode, i14, (char) ('0' - mirror), objArr2);
                try {
                    Object[] objArr3 = {(String) objArr2[0]};
                    int i18 = -Gravity.getAbsoluteGravity(0, 0);
                    Object[] objArr4 = new Object[1];
                    a(((i18 | 31) << 1) - (i18 ^ 31), 37 - (~(-(-TextUtils.indexOf("", "", 0, 0)))), (char) Gravity.getAbsoluteGravity(0, 0), objArr4);
                    Object objNewInstance = Class.forName((String) objArr4[0]).getDeclaredConstructor(String.class).newInstance(objArr3);
                    int i19 = -Color.argb(0, 0, 0, 0);
                    int i20 = (i19 ^ 69) + ((i19 & 69) << 1);
                    int i21 = asInterface + 31;
                    g = i21 % 128;
                    int i22 = i21 % 2;
                    int i23 = -(KeyEvent.getMaxKeyCode() >> 16);
                    int i24 = ((i23 | 31) << 1) - (i23 ^ 31);
                    int iBlue = Color.blue(0);
                    int iTuitionPaymentFragmentbindingInflater2 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                    int i25 = iBlue * (-445);
                    int i26 = (i25 ^ (-15888725)) + ((i25 & (-15888725)) << 1);
                    int i27 = ~iBlue;
                    int i28 = ~((i27 ^ (-35706)) | (i27 & (-35706)));
                    int i29 = ~iTuitionPaymentFragmentbindingInflater2;
                    int i30 = (i28 | (~(((-35706) ^ i29) | ((-35706) & i29)))) * 446;
                    int i31 = (i26 & i30) + (i26 | i30);
                    int i32 = ~((i27 ^ 35705) | (35705 & i27));
                    int i33 = ((-35706) ^ iBlue) | ((-35706) & iBlue);
                    int i34 = ~((i33 ^ iTuitionPaymentFragmentbindingInflater2) | (i33 & iTuitionPaymentFragmentbindingInflater2));
                    int i35 = i31 + (((i32 & i34) | (i32 ^ i34)) * 446);
                    int i36 = asInterface;
                    int i37 = (i36 & 17) + (i36 | 17);
                    g = i37 % 128;
                    int i38 = i37 % 2;
                    Object[] objArr5 = new Object[1];
                    a(i20, i24, (char) (i35 + ((~((i27 & (-35706)) | (i27 ^ (-35706)))) * 446)), objArr5);
                    String str2 = (String) objArr5[0];
                    int i39 = g;
                    int i40 = (i39 ^ 65) + ((i39 & 65) << 1);
                    asInterface = i40 % 128;
                    int i41 = i40 % 2;
                    try {
                        Object[] objArr6 = {str2};
                        int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                        int i42 = ((keyRepeatDelay | 31) << 1) - (keyRepeatDelay ^ 31);
                        int i43 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int i44 = (i43 ^ 38) + ((i43 & 38) << 1);
                        int i45 = asInterface;
                        int i46 = ((i45 | 47) << 1) - (i45 ^ 47);
                        g = i46 % 128;
                        if (i46 % 2 != 0) {
                            Object[] objArr7 = new Object[1];
                            a(i42, i44, (char) ((-1) << (ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1))), objArr7);
                            str = (String) objArr7[0];
                        } else {
                            Object[] objArr8 = new Object[1];
                            a(i42, i44, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr8);
                            str = (String) objArr8[0];
                        }
                        Object objNewInstance2 = Class.forName(str).getDeclaredConstructor(String.class).newInstance(objArr6);
                        try {
                            int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                            int i47 = (doubleTapTimeout ^ 100) + ((doubleTapTimeout & 100) << 1);
                            int modifierMetaStateMask = 22 - ((byte) KeyEvent.getModifierMetaStateMask());
                            char mirror2 = AndroidCharacter.getMirror('0');
                            char c2 = (char) (((mirror2 | (-48)) << 1) - (mirror2 ^ (-48)));
                            Object[] objArr9 = new Object[1];
                            a(i47, modifierMetaStateMask, c2, objArr9);
                            Class<?> cls = Class.forName((String) objArr9[0]);
                            int i48 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int i49 = (i48 ^ 124) + ((i48 & 124) << 1);
                            int i50 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentbindingInflater3 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                            int i51 = g;
                            int i52 = i51 + 125;
                            asInterface = i52 % 128;
                            if (i52 % 2 == 0) {
                                i4 = (592 >> i50) << (-14);
                                int i53 = ~i50;
                                i5 = (i53 ^ 18) | (i53 & 18);
                            } else {
                                i4 = (i50 * 592) - 10620;
                                i5 = (~i50) | 18;
                            }
                            int i54 = -(-((~i5) * (-1182)));
                            int i55 = (i4 & i54) + (i4 | i54);
                            int i56 = ~i50;
                            int i57 = (i56 ^ (-19)) | (i56 & (-19));
                            int i58 = ~iTuitionPaymentFragmentbindingInflater3;
                            int i59 = (i57 ^ i58) | (i57 & i58);
                            int i60 = (i51 ^ 103) + ((i51 & 103) << 1);
                            asInterface = i60 % 128;
                            int i61 = i60 % 2;
                            int i62 = ~i59;
                            int i63 = ~((i50 ^ 18) | (i50 & 18));
                            int i64 = i55 + ((-591) * ((i62 & i63) | (i62 ^ i63)));
                            int i65 = ((~(1527994978 | i)) | 549749896) * 1504;
                            int i66 = ((-1366844457) & i65) + (i65 | (-1366844457));
                            int i67 = -(-((~((2077744874 & i) | (2077744874 ^ i))) * (-1504)));
                            int i68 = ((i66 & i67) + (i67 | i66)) - 575541360;
                            int iTuitionPaymentFragmentbindingInflater4 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                            int i69 = ~((iTuitionPaymentFragmentbindingInflater4 & (-1501135797)) | ((-1501135797) ^ iTuitionPaymentFragmentbindingInflater4));
                            int i70 = ((67397706 & i69) | (67397706 ^ i69)) * (-196);
                            int i71 = (((-2131821560) | i70) << 1) - (i70 ^ (-2131821560));
                            if (i68 > (i71 ^ (-2127389608)) + ((i71 & (-2127389608)) << 1) + ((((-1568533503) ^ i69) | (i69 & (-1568533503))) * 196)) {
                                int i72 = (i56 & iTuitionPaymentFragmentbindingInflater3) | (iTuitionPaymentFragmentbindingInflater3 ^ i56);
                                int i73 = i64 * (591 >>> ((i72 & (-19)) | (i72 ^ (-19))));
                                cIndexOf = (char) ((-1) >>> TextUtils.indexOf((CharSequence) "", '@', 1, 1));
                                i6 = i73;
                                c = 0;
                            } else {
                                int i74 = (i56 & iTuitionPaymentFragmentbindingInflater3) | (iTuitionPaymentFragmentbindingInflater3 ^ i56);
                                int i75 = (i64 - (~(((i74 & (-19)) | (i74 ^ (-19))) * 591))) - 1;
                                c = 0;
                                cIndexOf = (char) ((-TextUtils.indexOf((CharSequence) "", '0', 0, 0)) - 1);
                                i6 = i75;
                            }
                            Object[] objArr10 = new Object[1];
                            a(i49, i6, cIndexOf, objArr10);
                            Object objInvoke = cls.getMethod((String) objArr10[c], null).invoke(context, null);
                            try {
                                int i76 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                int iTuitionPaymentFragmentbindingInflater5 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                                int i77 = (i76 * (-523)) + 26300;
                                int i78 = ~i76;
                                int i79 = (i78 & 100) | (i78 ^ 100);
                                int i80 = ~i79;
                                int i81 = ~((-101) | i76);
                                int i82 = (i80 ^ i81) | (i80 & i81);
                                int i83 = ~(((-101) ^ iTuitionPaymentFragmentbindingInflater5) | ((-101) & iTuitionPaymentFragmentbindingInflater5));
                                int i84 = -(-(((i82 ^ i83) | (i82 & i83)) * 262));
                                int i85 = (i77 ^ i84) + ((i77 & i84) << 1) + ((~((-101) | i76)) * (-786));
                                int i86 = ~iTuitionPaymentFragmentbindingInflater5;
                                int i87 = ~((i86 & (-101)) | ((-101) ^ i86));
                                int i88 = ~i79;
                                int i89 = (i87 & i88) | (i87 ^ i88);
                                int i90 = ~((i76 & (-101)) | ((-101) ^ i76));
                                int i91 = (i85 - (~(((i90 & i89) | (i89 ^ i90)) * 262))) - 1;
                                int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                                int i92 = (edgeSlop & 23) + (edgeSlop | 23);
                                int i93 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                Object[] objArr11 = new Object[1];
                                a(i91, i92, (char) ((i93 ^ (-1)) + (i93 << 1)), objArr11);
                                Class<?> cls2 = Class.forName((String) objArr11[0]);
                                int i94 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                int i95 = ((i94 | 14) << 1) - (i94 ^ 14);
                                Object[] objArr12 = new Object[1];
                                c(new char[]{63044, 47482, 25037, 51912, 24153, 48700, 12889, 64884, 6852, 40476, 38125, 44674, 39205, 7329, 26846, 2680}, i95, objArr12);
                                Object objInvoke2 = cls2.getMethod((String) objArr12[0], null).invoke(context, null);
                                int i96 = asInterface + 99;
                                g = i96 % 128;
                                if (i96 % 2 != 0) {
                                    int i97 = 5 % 5;
                                }
                                try {
                                    Object[] objArr13 = {objInvoke2, 64};
                                    int i98 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int i99 = (i98 & 141) + (i98 | 141);
                                    int i100 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int iTuitionPaymentFragmentbindingInflater6 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                                    int i101 = i100 * (-589);
                                    int i102 = (i101 & 18912) + (i101 | 18912);
                                    int i103 = ~iTuitionPaymentFragmentbindingInflater6;
                                    int i104 = ~(((-33) ^ i103) | ((-33) & i103));
                                    int i105 = ~(((-33) ^ i100) | ((-33) & i100));
                                    int i106 = (i104 ^ i105) | (i104 & i105);
                                    int i107 = ~((i103 ^ i100) | (i103 & i100));
                                    int i108 = ~i100;
                                    int i109 = (i108 ^ 32) | (i108 & 32);
                                    int i110 = i102 + (((i106 ^ i107) | (i106 & i107) | (~((i109 ^ iTuitionPaymentFragmentbindingInflater6) | (i109 & iTuitionPaymentFragmentbindingInflater6)))) * 590);
                                    int i111 = (~(((-33) & i100) | ((-33) ^ i100))) | (~(((-33) ^ i103) | ((-33) & i103)));
                                    int i112 = (i110 - (~(-(-(((i111 & i107) | (i111 ^ i107)) * (-1180)))))) - 1;
                                    int i113 = ~(i108 | i103);
                                    int i114 = ~((~iTuitionPaymentFragmentbindingInflater6) | 32);
                                    int i115 = ((i113 & i114) | (i113 ^ i114)) * 590;
                                    int i116 = (i112 ^ i115) + ((i115 & i112) << 1);
                                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                                    Object[] objArr14 = new Object[1];
                                    a(i99, i116, (char) ((iMakeMeasureSpec ^ 2518) + ((iMakeMeasureSpec & 2518) << 1)), objArr14);
                                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                                    int deadChar = KeyEvent.getDeadChar(0, 0);
                                    int i117 = (deadChar & 14) + (deadChar | 14);
                                    Object[] objArr15 = new Object[1];
                                    c(new char[]{59039, 7186, 49444, 50250, 40856, 10614, 47219, 5979, 56825, 36039, 63552, 5255, 33208, 46168, 23531, 2341}, i117, objArr15);
                                    Object objInvoke3 = cls3.getMethod((String) objArr15[0], String.class, Integer.TYPE).invoke(objInvoke, objArr13);
                                    int iIndexOf = TextUtils.indexOf("", "");
                                    com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                                    int i118 = ~i;
                                    int i119 = ~i;
                                    int i120 = (iIndexOf * 784) - 135286;
                                    int i121 = ((i120 | 136242) << 1) - (i120 ^ 136242);
                                    int i122 = ~iIndexOf;
                                    int i123 = (i122 & i119) | (i122 ^ i119);
                                    int i124 = -(-((~((i123 & 173) | (i123 ^ 173))) * (-783)));
                                    int i125 = ((i121 | i124) << 1) - (i124 ^ i121);
                                    int i126 = ~iIndexOf;
                                    int i127 = ~((i118 ^ 173) | (i118 & 173));
                                    int i128 = ((i126 & i127) | (i126 ^ i127)) * 783;
                                    int i129 = (i125 & i128) + (i128 | i125);
                                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                                    int i130 = g;
                                    int i131 = (i130 & 57) + (i130 | 57);
                                    asInterface = i131 % 128;
                                    int i132 = i131 % 2;
                                    int i133 = (absoluteGravity * (-391)) - 5850;
                                    int i134 = ~(((-31) ^ absoluteGravity) | ((-31) & absoluteGravity));
                                    int i135 = ~((30 ^ i) | (30 & i));
                                    int i136 = -(-(((i134 & i135) | (i134 ^ i135)) * (-196)));
                                    int i137 = (((i133 | i136) << 1) - (i133 ^ i136)) + (((absoluteGravity ^ 30) | (absoluteGravity & 30)) * 392);
                                    int i138 = ~absoluteGravity;
                                    int i139 = ~((i138 & (-31)) | (i138 ^ (-31)));
                                    int i140 = ~(30 | i);
                                    int i141 = (i137 - (~(-(-(((i139 & i140) | (i139 ^ i140)) * 196))))) - 1;
                                    int trimmedLength = TextUtils.getTrimmedLength("");
                                    int i142 = trimmedLength * 483;
                                    int i143 = (i142 ^ 9818908) + ((i142 & 9818908) << 1);
                                    int i144 = ~trimmedLength;
                                    int i145 = ~(((-40575) & i144) | (i144 ^ (-40575)));
                                    int i146 = ~((i144 & i118) | (i144 ^ i118));
                                    int i147 = i143 + (((i146 & i145) | (i145 ^ i146)) * (-241));
                                    int i148 = -(-(((trimmedLength ^ 40574) | (trimmedLength & 40574)) * (-482)));
                                    int i149 = (i147 & i148) + (i148 | i147);
                                    int i150 = ~(((-40575) & trimmedLength) | ((-40575) ^ trimmedLength));
                                    int i151 = ~trimmedLength;
                                    int i152 = g;
                                    int i153 = ((i152 | 73) << 1) - (i152 ^ 73);
                                    asInterface = i153 % 128;
                                    int i154 = i153 % 2;
                                    int i155 = (i151 & i119) | (i151 ^ i119);
                                    int i156 = ~((i155 & 40574) | (i155 ^ 40574));
                                    int i157 = -(-(241 * ((i156 & i150) | (i150 ^ i156))));
                                    Object[] objArr16 = new Object[1];
                                    a(i129, i141, (char) ((i149 ^ i157) + ((i157 & i149) << 1)), objArr16);
                                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                                    int i158 = -((byte) KeyEvent.getModifierMetaStateMask());
                                    int i159 = (i158 & 202) + (i158 | 202);
                                    int i160 = -((Process.getThreadPriority(0) + 20) >> 6);
                                    int iTuitionPaymentFragmentbindingInflater7 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                                    int i161 = i160 * (-109);
                                    int i162 = ((i161 | 1110) << 1) - (i161 ^ 1110);
                                    int i163 = ~i160;
                                    int i164 = ~((iTuitionPaymentFragmentbindingInflater7 & 10) | (iTuitionPaymentFragmentbindingInflater7 ^ 10));
                                    int i165 = -(-(((i163 ^ i164) | (i163 & i164)) * (-220)));
                                    int i166 = (i162 ^ i165) + ((i162 & i165) << 1);
                                    int i167 = ~((i160 ^ 10) | (i160 & 10));
                                    int i168 = -(-(((i164 & i167) | (i167 ^ i164)) * 220));
                                    int i169 = (i166 & i168) + (i168 | i166);
                                    int i170 = ~((i163 ^ 10) | (i163 & 10));
                                    int i171 = ~((i160 & (-11)) | ((-11) ^ i160));
                                    Object[] objArr17 = new Object[1];
                                    a(i159, (i169 - (~(-(-(((i171 & i170) | (i170 ^ i171)) * 110))))) - 1, (char) (43289 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr17);
                                    Object[] objArr18 = (Object[]) cls4.getField((String) objArr17[0]).get(objInvoke3);
                                    int length = objArr18.length;
                                    int i172 = 0;
                                    while (i172 < length) {
                                        int i173 = asInterface + 7;
                                        g = i173 % 128;
                                        int i174 = i173 % 2;
                                        Object obj = objArr18[i172];
                                        int i175 = 212 - (~(-(-View.MeasureSpec.getMode(0))));
                                        int i176 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                        int iTuitionPaymentFragmentbindingInflater8 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                                        int i177 = ~i176;
                                        Object[] objArr19 = objArr18;
                                        int i178 = (i176 * 483) + 1210 + (((~((~iTuitionPaymentFragmentbindingInflater8) | i177)) | (~((i177 ^ (-6)) | (i177 & (-6))))) * (-241));
                                        int i179 = -(-(((i176 ^ 5) | (i176 & 5)) * (-482)));
                                        int i180 = (i178 ^ i179) + ((i179 & i178) << 1);
                                        int i181 = ~(((-6) & i176) | ((-6) ^ i176));
                                        int i182 = ~iTuitionPaymentFragmentbindingInflater8;
                                        int i183 = ~((i182 & i177) | (i177 ^ i182) | 5);
                                        int i184 = ((i181 & i183) | (i181 ^ i183)) * 241;
                                        Object[] objArr20 = new Object[1];
                                        a(i175, ((i180 | i184) << 1) - (i184 ^ i180), (char) View.getDefaultSize(0, 0), objArr20);
                                        String str3 = (String) objArr20[0];
                                        int i185 = asInterface;
                                        int i186 = (i185 & 17) + (i185 | 17);
                                        g = i186 % 128;
                                        int i187 = i186 % 2;
                                        try {
                                            int i188 = -Drawable.resolveOpacity(0, 0);
                                            int i189 = (i188 ^ 37) + ((i188 & 37) << 1);
                                            Object[] objArr21 = new Object[1];
                                            c(new char[]{22504, 19719, 4037, 4084, 65029, 4093, 45433, 49839, 4394, 53612, 3900, 28664, 56716, 55526, 36144, 17704, 40380, 48848, 34297, 38375, 13350, 58818, 14302, 25698, 36830, 49844, 62769, 49220, 36095, 22007, 15745, 22897, 35723, 60300, 38235, 43910, 14948, 53887, 65264, 44056}, i189, objArr21);
                                            Class<?> cls5 = Class.forName((String) objArr21[0]);
                                            int gidForName = Process.getGidForName("");
                                            int i190 = (gidForName * 319) - 3804;
                                            int i191 = ~gidForName;
                                            int i192 = ~((i191 ^ i) | (i191 & i));
                                            int i193 = -(-((((-13) ^ i192) | ((-13) & i192)) * (-318)));
                                            int i194 = (i190 ^ i193) + ((i193 & i190) << 1);
                                            int i195 = ~((-13) | i);
                                            int i196 = ~((i118 ^ gidForName) | (i118 & gidForName) | 12);
                                            int i197 = ((i195 ^ i196) | (i196 & i195)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                            int i198 = (-13) | i118;
                                            int i199 = (gidForName ^ 12) | (gidForName & 12);
                                            int i200 = (((i194 ^ i197) + ((i194 & i197) << 1)) - (~(((~((i198 & gidForName) | (i198 ^ gidForName))) | (~((i199 & i) | (i199 ^ i)))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))) - 1;
                                            Object[] objArr22 = new Object[1];
                                            c(new char[]{53255, 6384, 14323, 30753, 54447, 32799, 9400, 25120, 29499, 2, 65219, 340, 60613, 10869}, i200, objArr22);
                                            Object objInvoke4 = cls5.getMethod((String) objArr22[0], String.class).invoke(null, str3);
                                            try {
                                                int i201 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                int i202 = ((i201 | 28) << 1) - (i201 ^ 28);
                                                Object[] objArr23 = new Object[1];
                                                c(new char[]{25766, 4146, 35352, 12517, 57389, 50298, 60107, 50490, 46381, 25418, 647, 44978, 39446, 47018, 62232, 13933, 33457, 753, 6455, 61410, 42831, 34681, 3185, 8248, 51955, 21312, 8108, 501, 53009, 3779}, i202, objArr23);
                                                Class<?> cls6 = Class.forName((String) objArr23[0]);
                                                int iNormalizeMetaState = 218 - KeyEvent.normalizeMetaState(0);
                                                int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                                int iTuitionPaymentFragmentbindingInflater9 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                                                int i203 = asInterface;
                                                int i204 = ((i203 | 29) << 1) - (i203 ^ 29);
                                                int i205 = length;
                                                int i206 = i204 % 128;
                                                g = i206;
                                                int i207 = i204 % 2 != 0 ? (55 << maximumFlingVelocity) >> (-9) : (maximumFlingVelocity * 55) - 1177;
                                                int i208 = ~maximumFlingVelocity;
                                                int i209 = ~((i208 ^ 11) | (i208 & 11));
                                                int i210 = i172;
                                                int i211 = ~iTuitionPaymentFragmentbindingInflater9;
                                                Object obj2 = objNewInstance2;
                                                int i212 = ~((i211 ^ 11) | (i211 & 11));
                                                int i213 = (-108) * ((i209 ^ i212) | (i212 & i209));
                                                int i214 = (i207 ^ i213) + ((i207 & i213) << 1);
                                                int i215 = (i206 ^ 119) + ((i206 & 119) << 1);
                                                int i216 = i215 % 128;
                                                asInterface = i216;
                                                int i217 = i215 % 2;
                                                int i218 = ~maximumFlingVelocity;
                                                Object obj3 = objNewInstance;
                                                int i219 = (~(((-12) ^ maximumFlingVelocity) | ((-12) & maximumFlingVelocity))) | (~((i218 ^ iTuitionPaymentFragmentbindingInflater9) | (i218 & iTuitionPaymentFragmentbindingInflater9)));
                                                int i220 = ~((i211 & maximumFlingVelocity) | (i211 ^ maximumFlingVelocity));
                                                int i221 = i214 + (((i219 & i220) | (i219 ^ i220)) * 54);
                                                int i222 = ~(((-12) & maximumFlingVelocity) | ((-12) ^ maximumFlingVelocity));
                                                int i223 = (i222 & iTuitionPaymentFragmentbindingInflater9) | (iTuitionPaymentFragmentbindingInflater9 ^ i222);
                                                int i224 = i216 + 33;
                                                g = i224 % 128;
                                                if (i224 % 2 != 0) {
                                                    Object[] objArr24 = new Object[1];
                                                    a(iNormalizeMetaState, i221 % (54 >>> i223), (char) (TextUtils.indexOf("", "", 1, 0) * 60489), objArr24);
                                                    method = cls6.getMethod((String) objArr24[0], null);
                                                    objArr = null;
                                                } else {
                                                    int i225 = -(-(i223 * 54));
                                                    Object[] objArr25 = new Object[1];
                                                    a(iNormalizeMetaState, (i221 ^ i225) + ((i225 & i221) << 1), (char) (60488 - (~TextUtils.indexOf("", "", 0, 0))), objArr25);
                                                    objArr = null;
                                                    method = cls6.getMethod((String) objArr25[0], null);
                                                }
                                                try {
                                                    Object[] objArr26 = {new ByteArrayInputStream((byte[]) method.invoke(obj, objArr))};
                                                    int i226 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int i227 = i226 * 868;
                                                    int i228 = ((i227 | 32116) << 1) - (i227 ^ 32116);
                                                    int i229 = ~i226;
                                                    int i230 = ((~(i229 | i118)) | (~((-38) | i119))) * (-867);
                                                    int i231 = (i228 ^ i230) + ((i228 & i230) << 1);
                                                    int i232 = ~i226;
                                                    int i233 = (i231 - (~(-(-((((~((i232 & i) | (i232 ^ i))) | (~((i232 ^ (-38)) | (i232 & (-38))))) | (~(((-38) & i) | ((-38) ^ i)))) * (-1734)))))) - 1;
                                                    int i234 = (i229 ^ (-38)) | (i229 & (-38));
                                                    int i235 = ~((i234 & i118) | (i234 ^ i118));
                                                    int i236 = i229 | 37;
                                                    int i237 = ~((i236 & i) | (i236 ^ i));
                                                    int i238 = (i237 & i235) | (i235 ^ i237);
                                                    int i239 = ~((i226 & (-38)) | ((-38) ^ i226) | i);
                                                    int i240 = (i233 - (~(((i238 & i239) | (i238 ^ i239)) * 867))) - 1;
                                                    Object[] objArr27 = new Object[1];
                                                    c(new char[]{22504, 19719, 4037, 4084, 65029, 4093, 45433, 49839, 4394, 53612, 3900, 28664, 56716, 55526, 36144, 17704, 40380, 48848, 34297, 38375, 13350, 58818, 14302, 25698, 36830, 49844, 62769, 49220, 36095, 22007, 15745, 22897, 35723, 60300, 38235, 43910, 14948, 53887, 65264, 44056}, i240, objArr27);
                                                    Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                    int i241 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                    int i242 = ((i241 | 230) << 1) - (i241 ^ 230);
                                                    int i243 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    int i244 = g + 109;
                                                    asInterface = i244 % 128;
                                                    if (i244 % 2 == 0) {
                                                        int i245 = (609 - (~(-(-(306 >> i243))))) % 288;
                                                        int i246 = ~((i243 ^ 18) | (i243 & 18));
                                                        int i247 = ~((i243 ^ i) | (i243 & i));
                                                        i7 = (i245 - (~(-(305 / ((i246 & i247) | (i246 ^ i247)))))) - 1;
                                                    } else {
                                                        int i248 = 6117 - (~(-(-(i243 * 306))));
                                                        int i249 = ((~(i243 | 18)) | (~((i243 ^ i) | (i243 & i)))) * 305;
                                                        i7 = (i248 | i249) + (i248 & i249);
                                                    }
                                                    int i250 = ~((i243 & i118) | (i118 ^ i243));
                                                    int i251 = 305 * ((i250 & (-19)) | ((-19) ^ i250));
                                                    int i252 = (i7 ^ i251) + ((i7 & i251) << 1);
                                                    char mirror3 = AndroidCharacter.getMirror('0');
                                                    int iTuitionPaymentFragmentbindingInflater10 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                                                    int i253 = asInterface + 21;
                                                    g = i253 % 128;
                                                    int i254 = i253 % 2;
                                                    int i255 = (mirror3 * 63571) + 4125912 + (((mirror3 ^ (-4194)) | (mirror3 & (-4194))) * 983);
                                                    int i256 = ~mirror3;
                                                    int i257 = ~iTuitionPaymentFragmentbindingInflater10;
                                                    int i258 = ~(((-4194) ^ i257) | ((-4194) & i257));
                                                    int i259 = ((i256 ^ i258) | (i256 & i258)) * (-983);
                                                    int i260 = ((i255 | i259) << 1) - (i255 ^ i259);
                                                    int i261 = ~mirror3;
                                                    int i262 = ~iTuitionPaymentFragmentbindingInflater10;
                                                    int i263 = ~((i262 & i261) | (i261 ^ i262));
                                                    int i264 = ~((i261 & 4193) | (i261 ^ 4193));
                                                    int i265 = -(-(((i264 & i263) | (i263 ^ i264)) * 983));
                                                    Object[] objArr28 = new Object[1];
                                                    a(i242, i252, (char) ((i260 ^ i265) + ((i265 & i260) << 1)), objArr28);
                                                    Object objInvoke5 = cls7.getMethod((String) objArr28[0], InputStream.class).invoke(objInvoke4, objArr26);
                                                    int i266 = g;
                                                    int i267 = ((i266 | 117) << 1) - (i266 ^ 117);
                                                    asInterface = i267 % 128;
                                                    int i268 = i267 % 2;
                                                    try {
                                                        int i269 = 248 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                        int i270 = -KeyEvent.normalizeMetaState(0);
                                                        int i271 = (i270 * 367) + 12478;
                                                        int i272 = -(-(((i270 ^ 34) | (i270 & 34)) * (-366)));
                                                        int i273 = (i271 & i272) + (i271 | i272);
                                                        int i274 = ~(((-35) ^ i) | ((-35) & i));
                                                        int i275 = ((i274 & i270) | (i270 ^ i274)) * (-366);
                                                        int i276 = (i273 & i275) + (i275 | i273);
                                                        int i277 = ~((~i270) | 34);
                                                        int i278 = (i270 & (-35)) | ((-35) ^ i270);
                                                        int i279 = asInterface;
                                                        int i280 = ((i279 | 105) << 1) - (i279 ^ 105);
                                                        g = i280 % 128;
                                                        if (i280 % 2 != 0) {
                                                            i8 = i276 * (366 % ((~((i278 & i) | (i278 ^ i))) | i277));
                                                            i9 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                            iTuitionPaymentFragmentbindingInflater1 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                                                            i10 = 5713;
                                                        } else {
                                                            i8 = i276 + (((~((i278 & i) | (i278 ^ i))) | i277) * 366);
                                                            i9 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                            iTuitionPaymentFragmentbindingInflater1 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                                                            i10 = 32627;
                                                        }
                                                        int i281 = ((-445) * i9) + (i10 * (-445));
                                                        int i282 = ~i9;
                                                        int i283 = ~i10;
                                                        int i284 = ~((i282 ^ i283) | (i282 & i283));
                                                        int i285 = ~iTuitionPaymentFragmentbindingInflater1;
                                                        int i286 = ~((i283 ^ i285) | (i285 & i283));
                                                        int i287 = -(-(((i284 ^ i286) | (i284 & i286)) * 446));
                                                        int i288 = ((i281 | i287) << 1) - (i287 ^ i281);
                                                        int i289 = ~((i282 ^ i10) | (i282 & i10));
                                                        int i290 = i283 | i9;
                                                        com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                                                        int i291 = (i289 | (~((iTuitionPaymentFragmentbindingInflater1 & i290) | (i290 ^ iTuitionPaymentFragmentbindingInflater1)))) * 446;
                                                        int i292 = (i288 ^ i291) + ((i291 & i288) << 1);
                                                        int i293 = -(-((~((~i9) | (~i10))) * 446));
                                                        Object[] objArr29 = new Object[1];
                                                        a(i269, i8, (char) ((i292 ^ i293) + ((i293 & i292) << 1)), objArr29);
                                                        Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0);
                                                        int i294 = ((iNormalizeMetaState2 | 23) << 1) - (iNormalizeMetaState2 ^ 23);
                                                        Object[] objArr30 = new Object[1];
                                                        c(new char[]{47099, 62464, 60405, 32620, 5136, 11052, 64746, 25254, 59366, 41651, 35652, 42297, 33305, 61881, 32041, 62548, 50260, 37388, 6786, 45833, 7953, 25654, 45072, 24093, 5135, 16417}, i294, objArr30);
                                                        if (!obj3.equals(cls8.getMethod((String) objArr30[0], null).invoke(objInvoke5, null))) {
                                                            try {
                                                                int i295 = -TextUtils.indexOf("", "", 0, 0);
                                                                int i296 = (i295 * (-574)) - 142352;
                                                                int i297 = ~i295;
                                                                int i298 = ~((i297 & i118) | (i297 ^ i118));
                                                                int i299 = ~(((-249) & i) | ((-249) ^ i));
                                                                int i300 = ((i298 & i299) | (i298 ^ i299)) * 1150;
                                                                int i301 = (i296 & i300) + (i296 | i300);
                                                                int i302 = ~(((-249) & i) | ((-249) ^ i));
                                                                int i303 = ~((i119 ^ 248) | (i119 & 248));
                                                                int i304 = -(-(((i302 & i303) | (i302 ^ i303)) * (-575)));
                                                                int i305 = (i301 ^ i304) + ((i304 & i301) << 1);
                                                                int i306 = ~i295;
                                                                int i307 = i305 + (((~(i295 | i119)) | (~((i306 & i) | (i306 ^ i)))) * 575);
                                                                int i308 = -TextUtils.getOffsetAfter("", 0);
                                                                int i309 = i308 * 628;
                                                                int i310 = (i309 ^ 21352) + ((i309 & 21352) << 1);
                                                                int i311 = ((i ^ 34) | (i & 34) | (~i308)) * (-627);
                                                                int i312 = (i310 ^ i311) + ((i311 & i310) << 1);
                                                                int i313 = ~((-35) | i);
                                                                int i314 = ((i313 & i308) | (i308 ^ i313)) * (-627);
                                                                int i315 = (i312 ^ i314) + ((i314 & i312) << 1);
                                                                int i316 = ~((i118 ^ 34) | (i118 & 34));
                                                                int i317 = ~(i308 | i);
                                                                int i318 = i315 + (((i317 & i316) | (i316 ^ i317)) * 627);
                                                                int i319 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                                int iTuitionPaymentFragmentbindingInflater11 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                                                                int i320 = i319 * 881;
                                                                int i321 = (i320 & 28743506) + (i320 | 28743506);
                                                                int i322 = ~i319;
                                                                int i323 = ~(i322 | (-32627));
                                                                int i324 = ~((i322 & iTuitionPaymentFragmentbindingInflater11) | (i322 ^ iTuitionPaymentFragmentbindingInflater11));
                                                                int i325 = (i324 & i323) | (i323 ^ i324);
                                                                int i326 = ~(((-32627) & iTuitionPaymentFragmentbindingInflater11) | ((-32627) ^ iTuitionPaymentFragmentbindingInflater11));
                                                                int i327 = i321 + (((i325 & i326) | (i325 ^ i326)) * (-880));
                                                                int i328 = ~i319;
                                                                int i329 = ~iTuitionPaymentFragmentbindingInflater11;
                                                                int i330 = ~((i328 & i329) | (i328 ^ i329));
                                                                int i331 = (i330 & 32626) | (i330 ^ 32626);
                                                                int i332 = (i319 & iTuitionPaymentFragmentbindingInflater11) | (i319 ^ iTuitionPaymentFragmentbindingInflater11);
                                                                int i333 = ~i332;
                                                                int i334 = ((i333 & i331) | (i331 ^ i333)) * (-880);
                                                                Object[] objArr31 = new Object[1];
                                                                a(i307, i318, (char) ((i327 & i334) + (i334 | i327) + ((~i332) * 880)), objArr31);
                                                                Class<?> cls9 = Class.forName((String) objArr31[0]);
                                                                Object[] objArr32 = new Object[1];
                                                                c(new char[]{47099, 62464, 60405, 32620, 5136, 11052, 64746, 25254, 59366, 41651, 35652, 42297, 33305, 61881, 32041, 62548, 50260, 37388, 6786, 45833, 7953, 25654, 45072, 24093, 5135, 16417}, 22 - Process.getGidForName(""), objArr32);
                                                                if (!obj2.equals(cls9.getMethod((String) objArr32[0], null).invoke(objInvoke5, null))) {
                                                                    i172 = ((i210 | 1) << 1) - (i210 ^ 1);
                                                                    objNewInstance2 = obj2;
                                                                    objNewInstance = obj3;
                                                                    objArr18 = objArr19;
                                                                    length = i205;
                                                                }
                                                            } catch (Throwable th) {
                                                                Throwable cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        Object[] objArr33 = {new int[]{i}, new int[1], new int[]{(i & (-2)) | (i118 & 1)}, null};
                                                        int i335 = ~((int) Runtime.getRuntime().maxMemory());
                                                        int i336 = (-16928116) + (((-84183425) | i335) * 494) + (((~(i335 | (-85821909))) | 43587197) * 494);
                                                        int i337 = i2 + (i336 & 16) + (16 | i336);
                                                        int i338 = i337 << 13;
                                                        int i339 = (i337 | i338) & (~(i337 & i338));
                                                        int i340 = i339 >>> 17;
                                                        int i341 = (i339 | i340) & (~(i339 & i340));
                                                        int i342 = i341 << 5;
                                                        ((int[]) objArr33[1])[0] = (i341 | i342) & (~(i341 & i342));
                                                        return objArr33;
                                                    } catch (Throwable th2) {
                                                        Throwable cause2 = th2.getCause();
                                                        if (cause2 != null) {
                                                            throw cause2;
                                                        }
                                                        throw th2;
                                                    }
                                                } catch (Throwable th3) {
                                                    Throwable cause3 = th3.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th3;
                                                }
                                            } catch (Throwable th4) {
                                                Throwable cause4 = th4.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th4;
                                            }
                                        } catch (Throwable th5) {
                                            Throwable cause5 = th5.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th5;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (Throwable th8) {
                            Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (Throwable th10) {
                    Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (Throwable unused) {
            }
        }
        int i343 = asInterface;
        int i344 = ((i343 | 125) << 1) - (i343 ^ 125);
        g = i344 % 128;
        int i345 = i344 % 2;
        int[] iArr = new int[1];
        Object[] objArr34 = {new int[]{i}, iArr, new int[]{i}, null};
        int i346 = ~i;
        int i347 = -(-((-758029428) + (((~((-658320373) | i346)) | 698630601) * (-328)) + ((i | 698630601) * 164) + (((~(i | 658320372)) | 142622729 | (~(i346 | (-102312501)))) * 164)));
        int i348 = ((i2 | i347) << 1) - (i2 ^ i347);
        int i349 = (i348 << 13) ^ i348;
        int i350 = i349 >>> 17;
        int i351 = (i349 | i350) & (~(i349 & i350));
        int i352 = i351 << 5;
        int i353 = i343 + 3;
        g = i353 % 128;
        int i354 = i353 % 2;
        iArr[0] = (i351 | i352) & (~(i351 & i352));
        return objArr34;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(int r7, byte r8, int r9) {
        /*
            byte[] r0 = com.google.android.gms.internal.mlkit_common.zzll.$$a
            int r9 = r9 * 4
            int r9 = r9 + 1
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r7 = r7 + 108
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            r6 = r8
            r8 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzll.$$c(int, byte, int):java.lang.String");
    }
}
