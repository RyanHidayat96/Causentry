package defpackage;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class Bitmap2JpegBytes implements Bitmap2JpegBytesIn {
    private static final byte[] $$c = {39, -79, 42};
    private static final int $$d = 227;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {81, -102, -70, -91};
    private static final int $$b = 79;
    private static int b = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {45557, 64477, 9660, 28527, 39222, 49939, 3287, 46757, 57449, 10796, 21547, 33237, 52138, 30072, 48965, 59665, 4808, 23723, 34428, 45547, 64463, 9617, 28542, 39229, 49928, 3287, 46724, 57443, 10796, 21548, 33247, 52134, 30051, 48967, 59669, 4825, 23740, 45565, 64448, 9628, 28536, 39227, 49935, 3284, 46828, 57443, 10797, 21574, 33278, 52129, 30068, 48981, 59669, 42972, 60850, 13294, 30998, 36628, 54626, 6842, 41183, 62989, 15444, 17003, 38906, 56783, 25372, 43309, 65384, 1204, 19086, 36867, 9783, 27770, 45450, 51158, 3555, 21284, 39230, 11908, 29888, 47865, 49195, 5706, 23443, 57799, 14302, 32035, 33623, 51354, 7850, 42234, 59935, 48466, 63329, 10536, 16765, 2832, 54596, 40875, 27129, 13191, 64525, 18037, 4273, 55999, 42189, 28945, 15224, 34230, 20363, 6608, 57949, 44134, 30370, 49302, 35547, 22315, 8571, 60275, 46471, 32734, 51239, 37494, 23622, 9885, 61674, 43002, 45491, 64477, 9601, 28537, 39291, 49933, 3285, 46768, 57442, 10811, 21508, 33173, 52128, 30067, 48962, 59655, 4827, 23777, 34412, 12376, 31253, 42981, 53689, 7052, 17739, 36689, 14588, 25256, 44165, 54869, ')', 19964, 63419, 8625, 27479, 38180};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -7792144478854972498L;

    private static void c(int i, int i2, byte b2, Object[] objArr) {
        int i3 = i2 * 4;
        byte[] bArr = $$a;
        int i4 = b2 + 4;
        int i5 = 98 - (i * 2);
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5 += i4;
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i4 + 1;
            bArr2[i7] = (byte) i5;
            if (i7 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i5 += bArr[i8];
                i4 = i8;
                i6 = i7;
            }
        }
    }

    @Override // defpackage.Bitmap2JpegBytesIn
    public final getSessionConfigCameraCaptureCallbacks TuitionPaymentFragmentspecialinlinedviewModeldefault2(Activity activity) {
        int i = 2 % 2;
        getSessionConfigCameraCaptureCallbacks.b bVar = new getSessionConfigCameraCaptureCallbacks.b();
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        if (Build.VERSION.SDK_INT > 29) {
            Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bounds.width();
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bounds.height();
            int i2 = activity.getResources().getConfiguration().densityDpi;
            bVar.TuitionPaymentFragmentbindingInflater1 = i2 / 160.0f;
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2;
            int i3 = TuitionPaymentFragmentbindingInflater1 + 83;
            b = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = b + 27;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetricsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CaptureNode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(defaultDisplay);
            bVar.TuitionPaymentFragmentbindingInflater1 = displayMetricsTuitionPaymentFragmentspecialinlinedviewModeldefault2.density;
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = displayMetricsTuitionPaymentFragmentspecialinlinedviewModeldefault2.densityDpi;
            Point pointTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CaptureNode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(defaultDisplay);
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = pointTuitionPaymentFragmentspecialinlinedviewModeldefault1.x;
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = pointTuitionPaymentFragmentspecialinlinedviewModeldefault1.y;
        }
        return new getSessionConfigCameraCaptureCallbacks(bVar, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x034e  */
    /* JADX WARN: Code duplicated, block: B:63:0x034f  */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            obj = null;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = $11 + 27;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i << i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                        int iRed = 2187 - Color.red(0);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 40;
                        byte b2 = (byte) ($$d & 14);
                        byte b3 = (byte) (b2 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, iRed, offsetAfter, 841711447, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - View.MeasureSpec.getSize(0)), Gravity.getAbsoluteGravity(0, 0) + 3011, 25 - TextUtils.lastIndexOf("", '0', 0, 0), 321985076, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c2 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 36505);
                        int iLastIndexOf = 3375 - TextUtils.lastIndexOf("", '0', 0);
                        int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 17;
                        byte b6 = (byte) ($$d & 5);
                        byte b7 = (byte) (-b6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iLastIndexOf, offsetBefore2, -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                    int iGreen = Color.green(0) + 2187;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 41;
                    byte b8 = (byte) ($$d & 14);
                    byte b9 = (byte) (b8 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, iGreen, iIndexOf, 841711447, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 33017), 3010 - MotionEvent.axisFromString(""), (ViewConfiguration.getPressedStateDuration() >> 16) + 26, 321985076, false, $$e(b10, b11, (byte) (b11 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 36506);
                    int gidForName = 3375 - Process.getGidForName("");
                    int iResolveOpacity = 17 - Drawable.resolveOpacity(0, 0);
                    byte b12 = (byte) ($$d & 5);
                    byte b13 = (byte) (-b12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, gidForName, iResolveOpacity, -968507904, false, $$e(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 65;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "") + 36505);
                    int mirror = 3424 - AndroidCharacter.getMirror('0');
                    int iIndexOf2 = 16 - TextUtils.indexOf((CharSequence) "", '0');
                    byte b14 = (byte) ($$d & 5);
                    byte b15 = (byte) (-b14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, mirror, iIndexOf2, -968507904, false, $$e(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                obj.hashCode();
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char c3 = (char) (36506 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int iRed2 = 3376 - Color.red(0);
                int iKeyCodeFromString = 17 - KeyEvent.keyCodeFromString("");
                byte b16 = (byte) ($$d & 5);
                byte b17 = (byte) (-b16);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, iRed2, iKeyCodeFromString, -968507904, false, $$e(b16, b17, (byte) (b17 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
            int i8 = $10 + 65;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0947 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:106:0x0948  */
    /* JADX WARN: Code duplicated, block: B:43:0x01d0 A[Catch: all -> 0x094a, TryCatch #4 {all -> 0x094a, blocks: (B:41:0x01ca, B:43:0x01d0, B:44:0x0206), top: B:122:0x01ca }] */
    /* JADX WARN: Code duplicated, block: B:48:0x038e  */
    /* JADX WARN: Code duplicated, block: B:50:0x039f  */
    /* JADX WARN: Code duplicated, block: B:56:0x03a8 A[Catch: Exception -> 0x044a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x044a, blocks: (B:46:0x02c7, B:51:0x03a2, B:56:0x03a8, B:60:0x042a, B:63:0x043b, B:65:0x0443, B:66:0x0449, B:57:0x03b2), top: B:121:0x02c7, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x042a A[Catch: Exception -> 0x044a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x044a, blocks: (B:46:0x02c7, B:51:0x03a2, B:56:0x03a8, B:60:0x042a, B:63:0x043b, B:65:0x0443, B:66:0x0449, B:57:0x03b2), top: B:121:0x02c7, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0431  */
    /* JADX WARN: Code duplicated, block: B:70:0x0534  */
    /* JADX WARN: Code duplicated, block: B:72:0x0540  */
    /* JADX WARN: Code duplicated, block: B:73:0x0545 A[Catch: Exception -> 0x07e3, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x07e3, blocks: (B:68:0x044b, B:73:0x0545, B:77:0x0698, B:79:0x06a0, B:83:0x0722, B:85:0x0762, B:96:0x07d4, B:97:0x07da, B:99:0x07dc, B:100:0x07e2, B:84:0x072c, B:74:0x054f, B:76:0x062a), top: B:126:0x044b, inners: #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x06a0 A[Catch: Exception -> 0x07e3, TRY_LEAVE, TryCatch #6 {Exception -> 0x07e3, blocks: (B:68:0x044b, B:73:0x0545, B:77:0x0698, B:79:0x06a0, B:83:0x0722, B:85:0x0762, B:96:0x07d4, B:97:0x07da, B:99:0x07dc, B:100:0x07e2, B:84:0x072c, B:74:0x054f, B:76:0x062a), top: B:126:0x044b, inners: #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0716  */
    /* JADX WARN: Code duplicated, block: B:83:0x0722 A[Catch: Exception -> 0x07e3, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x07e3, blocks: (B:68:0x044b, B:73:0x0545, B:77:0x0698, B:79:0x06a0, B:83:0x0722, B:85:0x0762, B:96:0x07d4, B:97:0x07da, B:99:0x07dc, B:100:0x07e2, B:84:0x072c, B:74:0x054f, B:76:0x062a), top: B:126:0x044b, inners: #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x076a  */
    /* JADX WARN: Code duplicated, block: B:89:0x077b  */
    /* JADX WARN: Code duplicated, block: B:91:0x079a  */
    /* JADX WARN: Code duplicated, block: B:92:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:94:0x07d1  */
    public static Object[] TuitionPaymentFragmentbindingInflater1(int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i6;
        String line;
        char c;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        boolean zEquals;
        File file2;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        boolean zEquals2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        File file3;
        FileReader fileReader3;
        BufferedReader bufferedReader3;
        Object[] objArr3;
        int i14;
        int i15;
        String str;
        int i16;
        int i17;
        Object obj;
        int i18 = 2 % 2;
        try {
            String[] strArr = new String[2];
            int offsetBefore = TextUtils.getOffsetBefore("", 0);
            int i19 = -TextUtils.getCapsMode("", 0, 0);
            int i20 = (i19 & 19) + (i19 | 19);
            int i21 = -TextUtils.indexOf((CharSequence) "", '0');
            Object[] objArr4 = new Object[1];
            a(offsetBefore, i20, (char) ((i21 ^ (-1)) + (i21 << 1)), objArr4);
            strArr[0] = (String) objArr4[0];
            int i22 = b + 3;
            TuitionPaymentFragmentbindingInflater1 = i22 % 128;
            int i23 = i22 % 2;
            int packedPositionType = ExpandableListView.getPackedPositionType(0L);
            int i24 = ((packedPositionType | 19) << 1) - (packedPositionType ^ 19);
            int i25 = -Gravity.getAbsoluteGravity(0, 0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i26 = b;
            int i27 = (i26 & 69) + (i26 | 69);
            TuitionPaymentFragmentbindingInflater1 = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = TypedValues.PositionType.TYPE_PERCENT_WIDTH % i25;
                i15 = 0 / ((-502) % ((i25 ^ 18) | (i25 & 18)));
            } else {
                int i29 = i25 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                int i30 = (i29 & 9054) + (i29 | 9054);
                int i31 = (i25 | 18) * (-502);
                i15 = ((i30 | i31) << 1) - (i31 ^ i30);
            }
            int i32 = ~i25;
            int i33 = ~(i32 | (-19));
            int i34 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i35 = (~((i32 ^ i34) | (i32 & i34))) | i33;
            int i36 = (i25 ^ 18) | (i25 & 18);
            int i37 = ~((i36 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i36 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
            int i38 = (-502) * ((i35 ^ i37) | (i35 & i37));
            int i39 = ~((i34 & i32) | (i32 ^ i34) | 18);
            int i40 = ~(i36 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i41 = i39 ^ i40;
            Object[] objArr5 = new Object[1];
            a(i24, ((((i15 | i38) << 1) - (i15 ^ i38)) - (~(-(-(((i40 & i39) | i41) * TypedValues.PositionType.TYPE_DRAWPATH))))) - 1, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
            strArr[1] = (String) objArr5[0];
            int i42 = 0;
            while (true) {
                try {
                    try {
                        try {
                            if (i42 < 2) {
                                int i43 = b;
                                int i44 = ((i43 | 41) << 1) - (i43 ^ 41);
                                TuitionPaymentFragmentbindingInflater1 = i44 % 128;
                                if (i44 % 2 == 0) {
                                    str = strArr[i42];
                                    int iIndexOf = TextUtils.indexOf("", "", 0, 1);
                                    i16 = ((iIndexOf | 11) << 1) - (iIndexOf ^ 11);
                                } else {
                                    str = strArr[i42];
                                    int iIndexOf2 = TextUtils.indexOf("", "", 0, 0);
                                    i16 = (iIndexOf2 ^ 37) + ((iIndexOf2 & 37) << 1);
                                }
                                int i45 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i46 = b;
                                int i47 = ((i46 | 17) << 1) - (i46 ^ 17);
                                TuitionPaymentFragmentbindingInflater1 = i47 % 128;
                                int i48 = i47 % 2;
                                int i49 = i45 * 217;
                                int i50 = (i49 ^ (-3440)) + ((i49 & (-3440)) << 1);
                                int i51 = i46 + 101;
                                TuitionPaymentFragmentbindingInflater1 = i51 % 128;
                                if (i51 % 2 == 0) {
                                    int i52 = -(-(~((i45 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i45 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2))));
                                    i17 = i50 * ((i52 ^ 216) + ((i52 & 216) << 1));
                                } else {
                                    i17 = i50 + ((~(i45 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 216);
                                }
                                int i53 = (i45 ^ (-17)) | (i45 & (-17));
                                int i54 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i55 = i17 + ((-216) * ((i53 & i54) | (i53 ^ i54)));
                                int i56 = i46 + 57;
                                TuitionPaymentFragmentbindingInflater1 = i56 % 128;
                                if (i56 % 2 == 0) {
                                    int i57 = ~((i45 & i54) | (i54 ^ i45));
                                    Object[] objArr6 = new Object[1];
                                    a(i16, i55 * (216 / ((i57 & 16) | (i57 ^ 16))), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(1) > 1.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(1) == 1.0d ? 0 : -1)), objArr6);
                                    obj = objArr6[0];
                                } else {
                                    int i58 = ~((i45 & i54) | (i54 ^ i45));
                                    Object[] objArr7 = new Object[1];
                                    a(i16, i55 + (((i58 & 16) | (i58 ^ 16)) * 216), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr7);
                                    obj = objArr7[0];
                                }
                                Class<?> cls = Class.forName((String) obj);
                                if (((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue()) {
                                    int i59 = TuitionPaymentFragmentbindingInflater1;
                                    int i60 = ((i59 | 93) << 1) - (i59 ^ 93);
                                    b = i60 % 128;
                                    if (i60 % 2 == 0) {
                                        i3 = ~(i & 1);
                                        i4 = i | 1;
                                        i5 = i3 & i4;
                                    }
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char windowTouchSlop = (char) (2419 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                                        int iRed = 2845 - Color.red(0);
                                        int mode = 5 - View.MeasureSpec.getMode(0);
                                        byte b2 = (byte) 0;
                                        byte b3 = b2;
                                        Object[] objArr8 = new Object[1];
                                        c(b2, b3, (byte) (b3 - 1), objArr8);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, iRed, mode, -501222268, false, (String) objArr8[0], new Class[0]);
                                    }
                                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                                    long j = -192259977;
                                    long j2 = (((long) (-947)) * j) + (((long) 949) * jLongValue);
                                    long j3 = -948;
                                    long j4 = -1;
                                    long j5 = j ^ j4;
                                    long j6 = jLongValue ^ j4;
                                    long j7 = i;
                                    long j8 = j2 + ((j5 | ((j6 | j7) ^ j4)) * j3) + (j3 * (j4 ^ ((j5 | j6) | (j7 ^ j4)))) + (((long) 948) * (j | j6)) + ((long) (-966926709));
                                    int i61 = (~Process.myUid()) | 536154117;
                                    int i62 = ((int) (j8 >> 32)) & (1554992622 + (i61 * 495) + (((~i61) | 364183557) * 495));
                                    i6 = ~i;
                                    int i63 = ((int) j8) & ((-149258101) + ((26558857 | i) * 614) + (((~(714066840 | i6)) | R.raw.nodomain | (~((-723159570) | i6))) * (-1228)) + (((~(731892633 | i6)) | (~((-705333777) | i6))) * 614));
                                    int i64 = (i62 & i63) | (i62 ^ i63);
                                    int i65 = (~(i & 10)) & (i | 10);
                                    int i66 = i64 ^ 1;
                                    int i67 = -i66;
                                    int i68 = (i66 & i67) | (i66 ^ i67);
                                    int i69 = TuitionPaymentFragmentbindingInflater1;
                                    int i70 = ((i69 | 55) << 1) - (i69 ^ 55);
                                    b = i70 % 128;
                                    int i71 = i70 % 2;
                                    int i72 = i68 >> 31;
                                    int i73 = (i72 & i) | (i65 & (~i72));
                                    int i74 = i ^ i5;
                                    int i75 = (i74 | (-i74)) >> 31;
                                    int i76 = i73 & (~i75);
                                    int i77 = i5 & i75;
                                    int i78 = (i76 ^ i77) | (i77 & i76);
                                    int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i79 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i80 = (~(((-54) ^ i79) | ((-54) & i79))) | (~(((-54) ^ pressedStateDuration) | ((-54) & pressedStateDuration)));
                                    int i81 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i82 = ~(i81 | pressedStateDuration);
                                    int i83 = (i80 ^ i82) | (i80 & i82);
                                    int i84 = (~pressedStateDuration) | 53;
                                    int i85 = (pressedStateDuration * (-589)) + 31323 + (((~((i84 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i84))) | i83) * 590);
                                    int i86 = (~(((-54) ^ i81) | ((-54) & i81))) | (~(((-54) & pressedStateDuration) | ((-54) ^ pressedStateDuration)));
                                    int i87 = ~((i79 ^ pressedStateDuration) | (i79 & pressedStateDuration));
                                    int i88 = i85 + (((i86 & i87) | (i86 ^ i87)) * (-1180));
                                    int i89 = ~((~pressedStateDuration) | i81);
                                    int i90 = ~(i79 | 53);
                                    int i91 = i88 + (((i89 & i90) | (i89 ^ i90)) * 590);
                                    int i92 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                    int i93 = (i92 ^ 40) + ((i92 & 40) << 1);
                                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0);
                                    int i94 = offsetBefore2 * 450;
                                    int i95 = (i94 ^ (-2572864)) + ((i94 & (-2572864)) << 1);
                                    int i96 = ~offsetBefore2;
                                    int i97 = ~((i96 & 5743) | (i96 ^ 5743));
                                    int i98 = ((-5744) ^ offsetBefore2) | ((-5744) & offsetBefore2);
                                    int i99 = i95 + (((~((i98 & i) | (i98 ^ i))) | i97) * 449);
                                    int i100 = ~offsetBefore2;
                                    int i101 = (~((i100 & 5743) | (i100 ^ 5743))) * (-1347);
                                    int i102 = (i99 ^ i101) + ((i99 & i101) << 1);
                                    int i103 = ~i;
                                    int i104 = ~(offsetBefore2 | ((-5744) & i103) | ((-5744) ^ i103));
                                    int i105 = ((i97 & i104) | (i97 ^ i104)) * 449;
                                    Object[] objArr9 = new Object[1];
                                    a(i91, i93, (char) ((i102 & i105) + (i105 | i102)), objArr9);
                                    file3 = new File((String) objArr9[0]);
                                    if (!file3.canRead()) {
                                        fileReader3 = new FileReader(file3);
                                        bufferedReader3 = new BufferedReader(fileReader3);
                                        try {
                                            line = bufferedReader3.readLine();
                                            int mode2 = 93 - View.MeasureSpec.getMode(0);
                                            int iIndexOf3 = TextUtils.indexOf("", "") + 3;
                                            int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                            int i106 = scrollBarFadeDuration * 302;
                                            int i107 = ((i106 | 1948896) << 1) - (i106 ^ 1948896);
                                            int i108 = ~scrollBarFadeDuration;
                                            int i109 = (i107 - (~(-(-(((~((i108 & i6) | (i108 ^ i6))) | 3232) * (-602)))))) - 1;
                                            int i110 = ~scrollBarFadeDuration;
                                            int i111 = ~((i110 & (-3233)) | (i110 ^ (-3233)));
                                            int i112 = ~((i110 & i) | (i110 ^ i));
                                            int i113 = (i111 & i112) | (i111 ^ i112);
                                            int i114 = (scrollBarFadeDuration & i6) | (i6 ^ scrollBarFadeDuration);
                                            int i115 = ~((i114 & 3232) | (i114 ^ 3232));
                                            int i116 = ((i113 & i115) | (i113 ^ i115)) * (-301);
                                            int i117 = ((i109 | i116) << 1) - (i116 ^ i109);
                                            int i118 = (~((i6 ^ 3232) | (i6 & 3232))) * 301;
                                            objArr3 = new Object[1];
                                            a(mode2, iIndexOf3, (char) (((i117 | i118) << 1) - (i118 ^ i117)), objArr3);
                                            if (!(!line.equals((String) objArr3[0]))) {
                                                fileReader3.close();
                                                bufferedReader3.close();
                                            } else {
                                                int i119 = b + 69;
                                                TuitionPaymentFragmentbindingInflater1 = i119 % 128;
                                                int i120 = i119 % 2;
                                                fileReader3.close();
                                                bufferedReader3.close();
                                            }
                                            int threadPriority = Process.getThreadPriority(0);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i121 = threadPriority * (-764);
                                            int i122 = ((-30580) ^ i121) + ((i121 & (-30580)) << 1);
                                            int i123 = ~threadPriority;
                                            int i124 = ((-21) ^ i123) | ((-21) & i123);
                                            int i125 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                            int i126 = ~((i124 ^ i125) | (i124 & i125));
                                            int i127 = ~(((-21) ^ threadPriority) | ((-21) & threadPriority) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                            int i128 = (i126 ^ i127) | (i127 & i126);
                                            int i129 = ~threadPriority;
                                            int i130 = (i129 & 20) | (i129 ^ 20);
                                            int i131 = ~((i130 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i130 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                            int i132 = ((i128 & i131) | (i128 ^ i131)) * 765;
                                            int i133 = (i122 ^ i132) + ((i132 & i122) << 1);
                                            int i134 = -(-(((~((-21) | i123)) | (~(((-21) ^ i125) | (i125 & (-21))))) * 1530));
                                            int i135 = (i133 ^ i134) + ((i133 & i134) << 1);
                                            int i136 = ~(((-21) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-21) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                            int i137 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                            int i138 = (i137 & i123) | (i123 ^ i137);
                                            int i139 = ~((i138 & 20) | (i138 ^ 20));
                                            int i140 = -(-(((i139 & i136) | (i136 ^ i139)) * 765));
                                            int i141 = -((((i135 | i140) << 1) - (i140 ^ i135)) >> 6);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i142 = ~i141;
                                            int i143 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                            int i144 = ~(((-97) & i143) | ((-97) ^ i143));
                                            int i145 = (i142 & i144) | (i142 ^ i144);
                                            int i146 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ 96) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & 96));
                                            int i147 = (i141 * (-563)) + 54240 + (((i145 & i146) | (i145 ^ i146)) * (-564));
                                            int i148 = ~i141;
                                            int i149 = i147 + ((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault5 | (i148 ^ 96) | (i148 & 96))) * 1128);
                                            int i150 = -(-(((~(i141 | 96)) | (~(i148 | i143))) * 564));
                                            int i151 = (i149 & i150) + (i150 | i149);
                                            int i152 = -View.getDefaultSize(0, 0);
                                            int i153 = (i152 ^ 31) + ((i152 & 31) << 1);
                                            int iResolveSize = View.resolveSize(0, 0);
                                            char c2 = (char) ((iResolveSize ^ 61646) + ((61646 & iResolveSize) << 1));
                                            Object[] objArr10 = new Object[1];
                                            a(i151, i153, c2, objArr10);
                                            file = new File((String) objArr10[0]);
                                            if (!file.canRead()) {
                                                fileReader = new FileReader(file);
                                                bufferedReader = new BufferedReader(fileReader);
                                                try {
                                                    String line2 = bufferedReader.readLine();
                                                    int i154 = -AndroidCharacter.getMirror('0');
                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                    int i155 = (i154 * (-574)) - 100450;
                                                    int i156 = ~i154;
                                                    int i157 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                    int i158 = ~((i156 ^ i157) | (i156 & i157));
                                                    int i159 = ~(((-176) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | ((-176) & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                                    int i160 = -(-(((i158 ^ i159) | (i159 & i158)) * 1150));
                                                    int i161 = (i155 & i160) + (i160 | i155);
                                                    int i162 = ~(((-176) & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | ((-176) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                                    int i163 = ~((i157 ^ 175) | (i157 & 175));
                                                    int i164 = (i161 - (~(-(-(((i162 & i163) | (i162 ^ i163)) * (-575)))))) - 1;
                                                    int i165 = ~(i156 | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                                                    int i166 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                    int i167 = ~((i154 & i166) | (i166 ^ i154));
                                                    int i168 = -(-(((i165 & i167) | (i165 ^ i167)) * 575));
                                                    int i169 = (i164 & i168) + (i168 | i164);
                                                    int i170 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                    int i171 = i170 * (-167);
                                                    int i172 = (i171 & (-167)) + (i171 | (-167));
                                                    int i173 = ~i170;
                                                    int i174 = ~((i173 ^ (-2)) | (i173 & (-2)));
                                                    int i175 = ~(((-2) ^ i6) | ((-2) & i6));
                                                    int i176 = ((i174 ^ i175) | (i175 & i174)) * 168;
                                                    int i177 = (i172 ^ i176) + ((i176 & i172) << 1);
                                                    int i178 = (i173 ^ (-2)) | (i173 & (-2));
                                                    int i179 = (i177 - (~(-(-((~((i178 ^ i) | (i178 & i))) * 168))))) - 1;
                                                    int i180 = ~((i173 & i6) | (i173 ^ i6));
                                                    int i181 = ~i170;
                                                    int i182 = ~((i181 ^ 1) | (i181 & 1));
                                                    int i183 = (i180 ^ i182) | (i180 & i182);
                                                    int i184 = (i170 & (-2)) | ((-2) ^ i170);
                                                    int i185 = ~((i184 & i) | (i184 ^ i));
                                                    int i186 = (i179 - (~(-(-(((i185 & i183) | (i183 ^ i185)) * 168))))) - 1;
                                                    int i187 = TuitionPaymentFragmentbindingInflater1;
                                                    int i188 = (i187 ^ 109) + ((i187 & 109) << 1);
                                                    b = i188 % 128;
                                                    int i189 = i188 % 2;
                                                    int iRgb = Color.rgb(0, 0, 0);
                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                    int i190 = (iRgb * 595) + 1553492635;
                                                    int i191 = ~iRgb;
                                                    int i192 = ~((i191 ^ 16782935) | (i191 & 16782935));
                                                    int i193 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                    int i194 = ~(i193 | 16782935);
                                                    int i195 = ((i192 ^ i194) | (i194 & i192)) * (-1188);
                                                    int i196 = (i190 & i195) + (i195 | i190);
                                                    int i197 = ~(((-16782936) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | ((-16782936) & iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                    int i198 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                    int i199 = ~((i198 & iRgb) | (i198 ^ iRgb));
                                                    int i200 = ((i192 ^ i197) | (i197 & i192) | i199) * 594;
                                                    int i201 = ~((-16782936) | i193);
                                                    int i202 = ~(((-16782936) & iRgb) | ((-16782936) ^ iRgb));
                                                    Object[] objArr11 = new Object[1];
                                                    a(i169, i186, (char) (((((i196 | i200) << 1) - (i196 ^ i200)) - (~((((i201 & i202) | (i201 ^ i202)) | i199) * 594))) - 1), objArr11);
                                                    zEquals = line2.equals((String) objArr11[0]);
                                                    fileReader.close();
                                                    bufferedReader.close();
                                                    if (zEquals) {
                                                        int i203 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                        int i204 = i203 * (-391);
                                                        int i205 = ((i204 | (-24960)) << 1) - (i204 ^ (-24960));
                                                        int i206 = ~(((-129) ^ i203) | ((-129) & i203));
                                                        int i207 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & 128) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 ^ 128);
                                                        int i208 = ~i207;
                                                        int i209 = ((i206 & i208) | (i206 ^ i208)) * (-196);
                                                        int i210 = (i205 ^ i209) + ((i205 & i209) << 1);
                                                        int i211 = ((i203 ^ 128) | (i203 & 128)) * 392;
                                                        int i212 = (i210 & i211) + (i211 | i210);
                                                        int i213 = ~i203;
                                                        int i214 = ~((i213 & (-129)) | (i213 ^ (-129)));
                                                        int i215 = ~i207;
                                                        int i216 = ((i214 & i215) | (i214 ^ i215)) * 196;
                                                        int i217 = (i212 & i216) + (i216 | i212);
                                                        int i218 = -TextUtils.indexOf((CharSequence) "", '0');
                                                        Object[] objArr12 = new Object[1];
                                                        a(i217, ((i218 | 35) << 1) - (i218 ^ 35), (char) (Process.myPid() >> 22), objArr12);
                                                        file2 = new File((String) objArr12[0]);
                                                        if (!file2.canRead()) {
                                                            int i219 = b + 65;
                                                            TuitionPaymentFragmentbindingInflater1 = i219 % 128;
                                                            int i220 = i219 % 2;
                                                        } else {
                                                            fileReader2 = new FileReader(file2);
                                                            bufferedReader2 = new BufferedReader(fileReader2);
                                                            try {
                                                                String line3 = bufferedReader2.readLine();
                                                                int i221 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127;
                                                                int i222 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                int i223 = -TextUtils.getOffsetBefore("", 0);
                                                                Object[] objArr13 = new Object[1];
                                                                a(i221, ((i222 | 1) << 1) - (i222 ^ 1), (char) ((i223 ^ 5719) + ((i223 & 5719) << 1)), objArr13);
                                                                zEquals2 = line3.equals((String) objArr13[0]);
                                                                fileReader2.close();
                                                                bufferedReader2.close();
                                                                if (zEquals2) {
                                                                    int i224 = b;
                                                                    int i225 = (i224 ^ 91) + ((i224 & 91) << 1);
                                                                    i9 = i225 % 128;
                                                                    TuitionPaymentFragmentbindingInflater1 = i9;
                                                                    int i226 = i225 % 2;
                                                                    if (line != null) {
                                                                        int i227 = (i9 & 39) + (i9 | 39);
                                                                        int i228 = i227 % 128;
                                                                        b = i228;
                                                                        int i229 = i227 % 2;
                                                                        objArr = new Object[2];
                                                                        objArr[0] = new int[1];
                                                                        i10 = (i228 & 29) + (i228 | 29);
                                                                        int i230 = i10 % 128;
                                                                        TuitionPaymentFragmentbindingInflater1 = i230;
                                                                        if (i10 % 2 == 0) {
                                                                            i12 = (i & (-53)) | (i6 & 52);
                                                                            i11 = 1;
                                                                        } else {
                                                                            i11 = 1;
                                                                            i12 = (~(i & 20)) & (i | 20);
                                                                        }
                                                                        String[] strArr2 = new String[i11];
                                                                        int i231 = ((i230 | 35) << i11) - (i230 ^ 35);
                                                                        b = i231 % 128;
                                                                        int i232 = i231 % 2;
                                                                        strArr2[0] = line;
                                                                        int[] iArr = (int[]) objArr[0];
                                                                        int i233 = ((i230 | 51) << 1) - (i230 ^ 51);
                                                                        b = i233 % 128;
                                                                        int i234 = i233 % 2;
                                                                        iArr[0] = i12;
                                                                        objArr[1] = strArr2;
                                                                        c = 0;
                                                                    } else {
                                                                        i8 = 2;
                                                                    }
                                                                }
                                                                objArr = new Object[i8];
                                                                c = 0;
                                                                objArr[0] = new int[]{i};
                                                                objArr[1] = new String[0];
                                                            } catch (Throwable th) {
                                                                fileReader2.close();
                                                                bufferedReader2.close();
                                                                throw th;
                                                            }
                                                        }
                                                    }
                                                    int i235 = ((int[]) objArr[c])[c];
                                                    int i236 = (~(i & i78)) & (i | i78);
                                                    int i237 = (i236 | (-i236)) >> 31;
                                                    int i238 = (~i237) & i235;
                                                    int i239 = i237 & i78;
                                                    int i240 = (i239 & i238) | (i238 ^ i239);
                                                    Object obj2 = objArr[1];
                                                    int i241 = b + 71;
                                                    int i242 = i241 % 128;
                                                    TuitionPaymentFragmentbindingInflater1 = i242;
                                                    int i243 = i241 % 2;
                                                    Object[] objArr14 = new Object[2];
                                                    int i244 = (i235 | i) & (~(i & i235));
                                                    int i245 = ((i244 | (-i244)) >> 31) & 1;
                                                    int i246 = -i245;
                                                    int i247 = (~(((i246 & i245) | (i245 ^ i246)) >> 31)) & 1;
                                                    objArr14[i245] = null;
                                                    objArr14[i247] = (String[]) obj2;
                                                    String[] strArr3 = (String[]) objArr14[0];
                                                    int i248 = i ^ i240;
                                                    int i249 = i242 + 101;
                                                    b = i249 % 128;
                                                    int i250 = i249 % 2;
                                                    int i251 = ((i248 | (-i248)) >> 31) & 16;
                                                    objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i240}, strArr3};
                                                    int i252 = 1924454364 + (((~((-536879130) | i6)) | 496568900 | (~((-530569799) | i))) * (-68)) + ((~((-34000899) | i6)) * (-68)) + (((~(530569798 | i6)) | (-570880028)) * 68);
                                                    int i253 = (609 - (~(i251 * 306))) + (i252 * 306);
                                                    int i254 = ~(i251 | i252);
                                                    DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                    int i255 = ~((i251 ^ i) | (i251 & i));
                                                    int i256 = -(-(305 * ((i254 & i255) | (i254 ^ i255))));
                                                    int i257 = (i253 ^ i256) + ((i253 & i256) << 1);
                                                    int i258 = ~i252;
                                                    int i259 = ~(i6 | i251);
                                                    int i260 = ((i258 & i259) | (i258 ^ i259)) * 305;
                                                    int i261 = ((i257 | i260) << 1) - (i260 ^ i257);
                                                    int i262 = (i261 * (-515)) + (i2 * 517);
                                                    int i263 = TuitionPaymentFragmentbindingInflater1;
                                                    int i264 = ((i263 | 99) << 1) - (i263 ^ 99);
                                                    b = i264 % 128;
                                                    int i265 = i264 % 2;
                                                    int i266 = ~i2;
                                                    int i267 = ~(i266 | i);
                                                    int i268 = ~i;
                                                    int i269 = i267 | (~((i268 ^ i261) | (i268 & i261)));
                                                    int i270 = ~((i268 ^ i2) | (i268 & i2));
                                                    int i271 = -(-((-516) * ((i269 & i270) | (i269 ^ i270))));
                                                    int i272 = ((i262 | i271) << 1) - (i262 ^ i271);
                                                    int i273 = ~i261;
                                                    int i274 = i273 | i266;
                                                    int i275 = ~((i & i274) | (i274 ^ i));
                                                    int i276 = i273 | i268;
                                                    int i277 = -(-((i275 | (~((i276 & i2) | (i276 ^ i2)))) * 516));
                                                    int i278 = (i272 ^ i277) + ((i277 & i272) << 1);
                                                    int i279 = ~(i273 | i2);
                                                    int i280 = ~((i6 ^ i2) | (i2 & i6));
                                                    int i281 = ((i279 & i280) | (i279 ^ i280)) * 516;
                                                    int i282 = (i278 ^ i281) + ((i281 & i278) << 1);
                                                    int i283 = (i282 << 13) ^ i282;
                                                    int i284 = i283 >>> 17;
                                                    int i285 = ((~i283) & i284) | ((~i284) & i283);
                                                    int i286 = i285 << 5;
                                                    ((int[]) objArr2[1])[0] = (i285 | i286) & (~(i285 & i286));
                                                    i7 = i263 + 79;
                                                    b = i7 % 128;
                                                    if (i7 % 2 == 0) {
                                                        return objArr2;
                                                    }
                                                    throw null;
                                                } catch (Throwable th2) {
                                                    fileReader.close();
                                                    bufferedReader.close();
                                                    throw th2;
                                                }
                                            }
                                            i13 = b + 29;
                                            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                                            if (i13 % 2 == 0) {
                                                int i287 = 3 % 5;
                                            }
                                            i8 = 2;
                                            objArr = new Object[i8];
                                            c = 0;
                                            objArr[0] = new int[]{i};
                                            objArr[1] = new String[0];
                                            int i2310 = ((int[]) objArr[c])[c];
                                            int i2311 = (~(i & i78)) & (i | i78);
                                            int i2312 = (i2311 | (-i2311)) >> 31;
                                            int i2313 = (~i2312) & i2310;
                                            int i2314 = i2312 & i78;
                                            int i2410 = (i2314 & i2313) | (i2313 ^ i2314);
                                            Object obj3 = objArr[1];
                                            int i2411 = b + 71;
                                            int i2412 = i2411 % 128;
                                            TuitionPaymentFragmentbindingInflater1 = i2412;
                                            int i2413 = i2411 % 2;
                                            Object[] objArr15 = new Object[2];
                                            int i2414 = (i2310 | i) & (~(i & i2310));
                                            int i2415 = ((i2414 | (-i2414)) >> 31) & 1;
                                            int i2416 = -i2415;
                                            int i2417 = (~(((i2416 & i2415) | (i2415 ^ i2416)) >> 31)) & 1;
                                            objArr15[i2415] = null;
                                            objArr15[i2417] = (String[]) obj3;
                                            String[] strArr4 = (String[]) objArr15[0];
                                            int i2418 = i ^ i2410;
                                            int i2419 = i2412 + 101;
                                            b = i2419 % 128;
                                            int i2510 = i2419 % 2;
                                            int i2511 = ((i2418 | (-i2418)) >> 31) & 16;
                                            objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i2410}, strArr4};
                                            int i2512 = 1924454364 + (((~((-536879130) | i6)) | 496568900 | (~((-530569799) | i))) * (-68)) + ((~((-34000899) | i6)) * (-68)) + (((~(530569798 | i6)) | (-570880028)) * 68);
                                            int i2513 = (609 - (~(i2511 * 306))) + (i2512 * 306);
                                            int i2514 = ~(i2511 | i2512);
                                            DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i2515 = ~((i2511 ^ i) | (i2511 & i));
                                            int i2516 = -(-(305 * ((i2514 & i2515) | (i2514 ^ i2515))));
                                            int i2517 = (i2513 ^ i2516) + ((i2513 & i2516) << 1);
                                            int i2518 = ~i2512;
                                            int i2519 = ~(i6 | i2511);
                                            int i2610 = ((i2518 & i2519) | (i2518 ^ i2519)) * 305;
                                            int i2611 = ((i2517 | i2610) << 1) - (i2610 ^ i2517);
                                            int i2612 = (i2611 * (-515)) + (i2 * 517);
                                            int i2613 = TuitionPaymentFragmentbindingInflater1;
                                            int i2614 = ((i2613 | 99) << 1) - (i2613 ^ 99);
                                            b = i2614 % 128;
                                            int i2615 = i2614 % 2;
                                            int i2616 = ~i2;
                                            int i2617 = ~(i2616 | i);
                                            int i2618 = ~i;
                                            int i2619 = i2617 | (~((i2618 ^ i2611) | (i2618 & i2611)));
                                            int i2710 = ~((i2618 ^ i2) | (i2618 & i2));
                                            int i2711 = -(-((-516) * ((i2619 & i2710) | (i2619 ^ i2710))));
                                            int i2712 = ((i2612 | i2711) << 1) - (i2612 ^ i2711);
                                            int i2713 = ~i2611;
                                            int i2714 = i2713 | i2616;
                                            int i2715 = ~((i & i2714) | (i2714 ^ i));
                                            int i2716 = i2713 | i2618;
                                            int i2717 = -(-((i2715 | (~((i2716 & i2) | (i2716 ^ i2)))) * 516));
                                            int i2718 = (i2712 ^ i2717) + ((i2717 & i2712) << 1);
                                            int i2719 = ~(i2713 | i2);
                                            int i288 = ~((i6 ^ i2) | (i2 & i6));
                                            int i289 = ((i2719 & i288) | (i2719 ^ i288)) * 516;
                                            int i2810 = (i2718 ^ i289) + ((i289 & i2718) << 1);
                                            int i2811 = (i2810 << 13) ^ i2810;
                                            int i2812 = i2811 >>> 17;
                                            int i2813 = ((~i2811) & i2812) | ((~i2812) & i2811);
                                            int i2814 = i2813 << 5;
                                            ((int[]) objArr2[1])[0] = (i2813 | i2814) & (~(i2813 & i2814));
                                            i7 = i2613 + 79;
                                            b = i7 % 128;
                                            if (i7 % 2 == 0) {
                                                return objArr2;
                                            }
                                            throw null;
                                        } catch (Throwable th3) {
                                            fileReader3.close();
                                            bufferedReader3.close();
                                            throw th3;
                                        }
                                    }
                                    int i290 = TuitionPaymentFragmentbindingInflater1;
                                    i14 = (i290 ^ 19) + ((i290 & 19) << 1);
                                    b = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        int i291 = 74 / 0;
                                    }
                                    line = null;
                                    int threadPriority2 = Process.getThreadPriority(0);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i1210 = threadPriority2 * (-764);
                                    int i1211 = ((-30580) ^ i1210) + ((i1210 & (-30580)) << 1);
                                    int i1212 = ~threadPriority2;
                                    int i1213 = ((-21) ^ i1212) | ((-21) & i1212);
                                    int i1214 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                    int i1215 = ~((i1213 ^ i1214) | (i1213 & i1214));
                                    int i1216 = ~(((-21) ^ threadPriority2) | ((-21) & threadPriority2) | iTuitionPaymentFragmentspecialinlinedviewModeldefault9);
                                    int i1217 = (i1215 ^ i1216) | (i1216 & i1215);
                                    int i1218 = ~threadPriority2;
                                    int i1310 = (i1218 & 20) | (i1218 ^ 20);
                                    int i1311 = ~((i1310 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i1310 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                    int i1312 = ((i1217 & i1311) | (i1217 ^ i1311)) * 765;
                                    int i1313 = (i1211 ^ i1312) + ((i1312 & i1211) << 1);
                                    int i1314 = -(-(((~((-21) | i1212)) | (~(((-21) ^ i1214) | (i1214 & (-21))))) * 1530));
                                    int i1315 = (i1313 ^ i1314) + ((i1313 & i1314) << 1);
                                    int i1316 = ~(((-21) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | ((-21) & iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                    int i1317 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                    int i1318 = (i1317 & i1212) | (i1212 ^ i1317);
                                    int i1319 = ~((i1318 & 20) | (i1318 ^ 20));
                                    int i1410 = -(-(((i1319 & i1316) | (i1316 ^ i1319)) * 765));
                                    int i1411 = -((((i1315 | i1410) << 1) - (i1410 ^ i1315)) >> 6);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i1412 = ~i1411;
                                    int i1413 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                    int i1414 = ~(((-97) & i1413) | ((-97) ^ i1413));
                                    int i1415 = (i1412 & i1414) | (i1412 ^ i1414);
                                    int i1416 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault10 ^ 96) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & 96));
                                    int i1417 = (i1411 * (-563)) + 54240 + (((i1415 & i1416) | (i1415 ^ i1416)) * (-564));
                                    int i1418 = ~i1411;
                                    int i1419 = i1417 + ((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault10 | (i1418 ^ 96) | (i1418 & 96))) * 1128);
                                    int i1510 = -(-(((~(i1411 | 96)) | (~(i1418 | i1413))) * 564));
                                    int i1511 = (i1419 & i1510) + (i1510 | i1419);
                                    int i1512 = -View.getDefaultSize(0, 0);
                                    int i1513 = (i1512 ^ 31) + ((i1512 & 31) << 1);
                                    int iResolveSize2 = View.resolveSize(0, 0);
                                    char c3 = (char) ((iResolveSize2 ^ 61646) + ((61646 & iResolveSize2) << 1));
                                    Object[] objArr16 = new Object[1];
                                    a(i1511, i1513, c3, objArr16);
                                    file = new File((String) objArr16[0]);
                                    if (!file.canRead()) {
                                        fileReader = new FileReader(file);
                                        bufferedReader = new BufferedReader(fileReader);
                                        String line4 = bufferedReader.readLine();
                                        int i1514 = -AndroidCharacter.getMirror('0');
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i1515 = (i1514 * (-574)) - 100450;
                                        int i1516 = ~i1514;
                                        int i1517 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                        int i1518 = ~((i1516 ^ i1517) | (i1516 & i1517));
                                        int i1519 = ~(((-176) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | ((-176) & iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                        int i1610 = -(-(((i1518 ^ i1519) | (i1519 & i1518)) * 1150));
                                        int i1611 = (i1515 & i1610) + (i1610 | i1515);
                                        int i1612 = ~(((-176) & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | ((-176) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                        int i1613 = ~((i1517 ^ 175) | (i1517 & 175));
                                        int i1614 = (i1611 - (~(-(-(((i1612 & i1613) | (i1612 ^ i1613)) * (-575)))))) - 1;
                                        int i1615 = ~(i1516 | iTuitionPaymentFragmentspecialinlinedviewModeldefault11);
                                        int i1616 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                        int i1617 = ~((i1514 & i1616) | (i1616 ^ i1514));
                                        int i1618 = -(-(((i1615 & i1617) | (i1615 ^ i1617)) * 575));
                                        int i1619 = (i1614 & i1618) + (i1618 | i1614);
                                        int i1710 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        int i1711 = i1710 * (-167);
                                        int i1712 = (i1711 & (-167)) + (i1711 | (-167));
                                        int i1713 = ~i1710;
                                        int i1714 = ~((i1713 ^ (-2)) | (i1713 & (-2)));
                                        int i1715 = ~(((-2) ^ i6) | ((-2) & i6));
                                        int i1716 = ((i1714 ^ i1715) | (i1715 & i1714)) * 168;
                                        int i1717 = (i1712 ^ i1716) + ((i1716 & i1712) << 1);
                                        int i1718 = (i1713 ^ (-2)) | (i1713 & (-2));
                                        int i1719 = (i1717 - (~(-(-((~((i1718 ^ i) | (i1718 & i))) * 168))))) - 1;
                                        int i1810 = ~((i1713 & i6) | (i1713 ^ i6));
                                        int i1811 = ~i1710;
                                        int i1812 = ~((i1811 ^ 1) | (i1811 & 1));
                                        int i1813 = (i1810 ^ i1812) | (i1810 & i1812);
                                        int i1814 = (i1710 & (-2)) | ((-2) ^ i1710);
                                        int i1815 = ~((i1814 & i) | (i1814 ^ i));
                                        int i1816 = (i1719 - (~(-(-(((i1815 & i1813) | (i1813 ^ i1815)) * 168))))) - 1;
                                        int i1817 = TuitionPaymentFragmentbindingInflater1;
                                        int i1818 = (i1817 ^ 109) + ((i1817 & 109) << 1);
                                        b = i1818 % 128;
                                        int i1819 = i1818 % 2;
                                        int iRgb2 = Color.rgb(0, 0, 0);
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i1910 = (iRgb2 * 595) + 1553492635;
                                        int i1911 = ~iRgb2;
                                        int i1912 = ~((i1911 ^ 16782935) | (i1911 & 16782935));
                                        int i1913 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                        int i1914 = ~(i1913 | 16782935);
                                        int i1915 = ((i1912 ^ i1914) | (i1914 & i1912)) * (-1188);
                                        int i1916 = (i1910 & i1915) + (i1915 | i1910);
                                        int i1917 = ~(((-16782936) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | ((-16782936) & iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                        int i1918 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                        int i1919 = ~((i1918 & iRgb2) | (i1918 ^ iRgb2));
                                        int i2010 = ((i1912 ^ i1917) | (i1917 & i1912) | i1919) * 594;
                                        int i2011 = ~((-16782936) | i1913);
                                        int i2012 = ~(((-16782936) & iRgb2) | ((-16782936) ^ iRgb2));
                                        Object[] objArr17 = new Object[1];
                                        a(i1619, i1816, (char) (((((i1916 | i2010) << 1) - (i1916 ^ i2010)) - (~((((i2011 & i2012) | (i2011 ^ i2012)) | i1919) * 594))) - 1), objArr17);
                                        zEquals = line4.equals((String) objArr17[0]);
                                        fileReader.close();
                                        bufferedReader.close();
                                        if (zEquals) {
                                            int i2013 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i2014 = i2013 * (-391);
                                            int i2015 = ((i2014 | (-24960)) << 1) - (i2014 ^ (-24960));
                                            int i2016 = ~(((-129) ^ i2013) | ((-129) & i2013));
                                            int i2017 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault13 & 128) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault13 ^ 128);
                                            int i2018 = ~i2017;
                                            int i2019 = ((i2016 & i2018) | (i2016 ^ i2018)) * (-196);
                                            int i2110 = (i2015 ^ i2019) + ((i2015 & i2019) << 1);
                                            int i2111 = ((i2013 ^ 128) | (i2013 & 128)) * 392;
                                            int i2112 = (i2110 & i2111) + (i2111 | i2110);
                                            int i2113 = ~i2013;
                                            int i2114 = ~((i2113 & (-129)) | (i2113 ^ (-129)));
                                            int i2115 = ~i2017;
                                            int i2116 = ((i2114 & i2115) | (i2114 ^ i2115)) * 196;
                                            int i2117 = (i2112 & i2116) + (i2116 | i2112);
                                            int i2118 = -TextUtils.indexOf((CharSequence) "", '0');
                                            Object[] objArr18 = new Object[1];
                                            a(i2117, ((i2118 | 35) << 1) - (i2118 ^ 35), (char) (Process.myPid() >> 22), objArr18);
                                            file2 = new File((String) objArr18[0]);
                                            if (!file2.canRead()) {
                                                int i2119 = b + 65;
                                                TuitionPaymentFragmentbindingInflater1 = i2119 % 128;
                                                int i2210 = i2119 % 2;
                                            } else {
                                                fileReader2 = new FileReader(file2);
                                                bufferedReader2 = new BufferedReader(fileReader2);
                                                String line5 = bufferedReader2.readLine();
                                                int i2211 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127;
                                                int i2212 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                int i2213 = -TextUtils.getOffsetBefore("", 0);
                                                Object[] objArr19 = new Object[1];
                                                a(i2211, ((i2212 | 1) << 1) - (i2212 ^ 1), (char) ((i2213 ^ 5719) + ((i2213 & 5719) << 1)), objArr19);
                                                zEquals2 = line5.equals((String) objArr19[0]);
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                if (zEquals2) {
                                                    int i2214 = b;
                                                    int i2215 = (i2214 ^ 91) + ((i2214 & 91) << 1);
                                                    i9 = i2215 % 128;
                                                    TuitionPaymentFragmentbindingInflater1 = i9;
                                                    int i2216 = i2215 % 2;
                                                    if (line != null) {
                                                        int i2217 = (i9 & 39) + (i9 | 39);
                                                        int i2218 = i2217 % 128;
                                                        b = i2218;
                                                        int i2219 = i2217 % 2;
                                                        objArr = new Object[2];
                                                        objArr[0] = new int[1];
                                                        i10 = (i2218 & 29) + (i2218 | 29);
                                                        int i2315 = i10 % 128;
                                                        TuitionPaymentFragmentbindingInflater1 = i2315;
                                                        if (i10 % 2 == 0) {
                                                            i12 = (i & (-53)) | (i6 & 52);
                                                            i11 = 1;
                                                        } else {
                                                            i11 = 1;
                                                            i12 = (~(i & 20)) & (i | 20);
                                                        }
                                                        String[] strArr5 = new String[i11];
                                                        int i2316 = ((i2315 | 35) << i11) - (i2315 ^ 35);
                                                        b = i2316 % 128;
                                                        int i2317 = i2316 % 2;
                                                        strArr5[0] = line;
                                                        int[] iArr2 = (int[]) objArr[0];
                                                        int i2318 = ((i2315 | 51) << 1) - (i2315 ^ 51);
                                                        b = i2318 % 128;
                                                        int i2319 = i2318 % 2;
                                                        iArr2[0] = i12;
                                                        objArr[1] = strArr5;
                                                        c = 0;
                                                    } else {
                                                        i8 = 2;
                                                    }
                                                }
                                                objArr = new Object[i8];
                                                c = 0;
                                                objArr[0] = new int[]{i};
                                                objArr[1] = new String[0];
                                            }
                                        }
                                        int i23110 = ((int[]) objArr[c])[c];
                                        int i23111 = (~(i & i78)) & (i | i78);
                                        int i23112 = (i23111 | (-i23111)) >> 31;
                                        int i23113 = (~i23112) & i23110;
                                        int i23114 = i23112 & i78;
                                        int i24110 = (i23114 & i23113) | (i23113 ^ i23114);
                                        Object obj4 = objArr[1];
                                        int i24111 = b + 71;
                                        int i24112 = i24111 % 128;
                                        TuitionPaymentFragmentbindingInflater1 = i24112;
                                        int i24113 = i24111 % 2;
                                        Object[] objArr110 = new Object[2];
                                        int i24114 = (i23110 | i) & (~(i & i23110));
                                        int i24115 = ((i24114 | (-i24114)) >> 31) & 1;
                                        int i24116 = -i24115;
                                        int i24117 = (~(((i24116 & i24115) | (i24115 ^ i24116)) >> 31)) & 1;
                                        objArr110[i24115] = null;
                                        objArr110[i24117] = (String[]) obj4;
                                        String[] strArr6 = (String[]) objArr110[0];
                                        int i24118 = i ^ i24110;
                                        int i24119 = i24112 + 101;
                                        b = i24119 % 128;
                                        int i25110 = i24119 % 2;
                                        int i25111 = ((i24118 | (-i24118)) >> 31) & 16;
                                        objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i24110}, strArr6};
                                        int i25112 = 1924454364 + (((~((-536879130) | i6)) | 496568900 | (~((-530569799) | i))) * (-68)) + ((~((-34000899) | i6)) * (-68)) + (((~(530569798 | i6)) | (-570880028)) * 68);
                                        int i25113 = (609 - (~(i25111 * 306))) + (i25112 * 306);
                                        int i25114 = ~(i25111 | i25112);
                                        DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i25115 = ~((i25111 ^ i) | (i25111 & i));
                                        int i25116 = -(-(305 * ((i25114 & i25115) | (i25114 ^ i25115))));
                                        int i25117 = (i25113 ^ i25116) + ((i25113 & i25116) << 1);
                                        int i25118 = ~i25112;
                                        int i25119 = ~(i6 | i25111);
                                        int i26110 = ((i25118 & i25119) | (i25118 ^ i25119)) * 305;
                                        int i26111 = ((i25117 | i26110) << 1) - (i26110 ^ i25117);
                                        int i26112 = (i26111 * (-515)) + (i2 * 517);
                                        int i26113 = TuitionPaymentFragmentbindingInflater1;
                                        int i26114 = ((i26113 | 99) << 1) - (i26113 ^ 99);
                                        b = i26114 % 128;
                                        int i26115 = i26114 % 2;
                                        int i26116 = ~i2;
                                        int i26117 = ~(i26116 | i);
                                        int i26118 = ~i;
                                        int i26119 = i26117 | (~((i26118 ^ i26111) | (i26118 & i26111)));
                                        int i27110 = ~((i26118 ^ i2) | (i26118 & i2));
                                        int i27111 = -(-((-516) * ((i26119 & i27110) | (i26119 ^ i27110))));
                                        int i27112 = ((i26112 | i27111) << 1) - (i26112 ^ i27111);
                                        int i27113 = ~i26111;
                                        int i27114 = i27113 | i26116;
                                        int i27115 = ~((i & i27114) | (i27114 ^ i));
                                        int i27116 = i27113 | i26118;
                                        int i27117 = -(-((i27115 | (~((i27116 & i2) | (i27116 ^ i2)))) * 516));
                                        int i27118 = (i27112 ^ i27117) + ((i27117 & i27112) << 1);
                                        int i27119 = ~(i27113 | i2);
                                        int i2815 = ~((i6 ^ i2) | (i2 & i6));
                                        int i2816 = ((i27119 & i2815) | (i27119 ^ i2815)) * 516;
                                        int i2817 = (i27118 ^ i2816) + ((i2816 & i27118) << 1);
                                        int i2818 = (i2817 << 13) ^ i2817;
                                        int i2819 = i2818 >>> 17;
                                        int i28110 = ((~i2818) & i2819) | ((~i2819) & i2818);
                                        int i28111 = i28110 << 5;
                                        ((int[]) objArr2[1])[0] = (i28110 | i28111) & (~(i28110 & i28111));
                                        i7 = i26113 + 79;
                                        b = i7 % 128;
                                        if (i7 % 2 == 0) {
                                            return objArr2;
                                        }
                                        throw null;
                                    }
                                    i13 = b + 29;
                                    TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        int i2820 = 3 % 5;
                                    }
                                    i8 = 2;
                                    objArr = new Object[i8];
                                    c = 0;
                                    objArr[0] = new int[]{i};
                                    objArr[1] = new String[0];
                                    int i23115 = ((int[]) objArr[c])[c];
                                    int i23116 = (~(i & i78)) & (i | i78);
                                    int i23117 = (i23116 | (-i23116)) >> 31;
                                    int i23118 = (~i23117) & i23115;
                                    int i23119 = i23117 & i78;
                                    int i241110 = (i23119 & i23118) | (i23118 ^ i23119);
                                    Object obj5 = objArr[1];
                                    int i241111 = b + 71;
                                    int i241112 = i241111 % 128;
                                    TuitionPaymentFragmentbindingInflater1 = i241112;
                                    int i241113 = i241111 % 2;
                                    Object[] objArr111 = new Object[2];
                                    int i241114 = (i23115 | i) & (~(i & i23115));
                                    int i241115 = ((i241114 | (-i241114)) >> 31) & 1;
                                    int i241116 = -i241115;
                                    int i241117 = (~(((i241116 & i241115) | (i241115 ^ i241116)) >> 31)) & 1;
                                    objArr111[i241115] = null;
                                    objArr111[i241117] = (String[]) obj5;
                                    String[] strArr7 = (String[]) objArr111[0];
                                    int i241118 = i ^ i241110;
                                    int i241119 = i241112 + 101;
                                    b = i241119 % 128;
                                    int i251110 = i241119 % 2;
                                    int i251111 = ((i241118 | (-i241118)) >> 31) & 16;
                                    objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i241110}, strArr7};
                                    int i251112 = 1924454364 + (((~((-536879130) | i6)) | 496568900 | (~((-530569799) | i))) * (-68)) + ((~((-34000899) | i6)) * (-68)) + (((~(530569798 | i6)) | (-570880028)) * 68);
                                    int i251113 = (609 - (~(i251111 * 306))) + (i251112 * 306);
                                    int i251114 = ~(i251111 | i251112);
                                    DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i251115 = ~((i251111 ^ i) | (i251111 & i));
                                    int i251116 = -(-(305 * ((i251114 & i251115) | (i251114 ^ i251115))));
                                    int i251117 = (i251113 ^ i251116) + ((i251113 & i251116) << 1);
                                    int i251118 = ~i251112;
                                    int i251119 = ~(i6 | i251111);
                                    int i261110 = ((i251118 & i251119) | (i251118 ^ i251119)) * 305;
                                    int i261111 = ((i251117 | i261110) << 1) - (i261110 ^ i251117);
                                    int i261112 = (i261111 * (-515)) + (i2 * 517);
                                    int i261113 = TuitionPaymentFragmentbindingInflater1;
                                    int i261114 = ((i261113 | 99) << 1) - (i261113 ^ 99);
                                    b = i261114 % 128;
                                    int i261115 = i261114 % 2;
                                    int i261116 = ~i2;
                                    int i261117 = ~(i261116 | i);
                                    int i261118 = ~i;
                                    int i261119 = i261117 | (~((i261118 ^ i261111) | (i261118 & i261111)));
                                    int i271110 = ~((i261118 ^ i2) | (i261118 & i2));
                                    int i271111 = -(-((-516) * ((i261119 & i271110) | (i261119 ^ i271110))));
                                    int i271112 = ((i261112 | i271111) << 1) - (i261112 ^ i271111);
                                    int i271113 = ~i261111;
                                    int i271114 = i271113 | i261116;
                                    int i271115 = ~((i & i271114) | (i271114 ^ i));
                                    int i271116 = i271113 | i261118;
                                    int i271117 = -(-((i271115 | (~((i271116 & i2) | (i271116 ^ i2)))) * 516));
                                    int i271118 = (i271112 ^ i271117) + ((i271117 & i271112) << 1);
                                    int i271119 = ~(i271113 | i2);
                                    int i28112 = ~((i6 ^ i2) | (i2 & i6));
                                    int i28113 = ((i271119 & i28112) | (i271119 ^ i28112)) * 516;
                                    int i28114 = (i271118 ^ i28113) + ((i28113 & i271118) << 1);
                                    int i28115 = (i28114 << 13) ^ i28114;
                                    int i28116 = i28115 >>> 17;
                                    int i28117 = ((~i28115) & i28116) | ((~i28116) & i28115);
                                    int i28118 = i28117 << 5;
                                    ((int[]) objArr2[1])[0] = (i28117 | i28118) & (~(i28117 & i28118));
                                    i7 = i261113 + 79;
                                    b = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        return objArr2;
                                    }
                                    throw null;
                                }
                                i42++;
                            }
                            if (!file3.canRead()) {
                                fileReader3 = new FileReader(file3);
                                bufferedReader3 = new BufferedReader(fileReader3);
                                line = bufferedReader3.readLine();
                                int mode3 = 93 - View.MeasureSpec.getMode(0);
                                int iIndexOf4 = TextUtils.indexOf("", "") + 3;
                                int scrollBarFadeDuration2 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                int i1010 = scrollBarFadeDuration2 * 302;
                                int i1011 = ((i1010 | 1948896) << 1) - (i1010 ^ 1948896);
                                int i1012 = ~scrollBarFadeDuration2;
                                int i1013 = (i1011 - (~(-(-(((~((i1012 & i6) | (i1012 ^ i6))) | 3232) * (-602)))))) - 1;
                                int i1110 = ~scrollBarFadeDuration2;
                                int i1111 = ~((i1110 & (-3233)) | (i1110 ^ (-3233)));
                                int i1112 = ~((i1110 & i) | (i1110 ^ i));
                                int i1113 = (i1111 & i1112) | (i1111 ^ i1112);
                                int i1114 = (scrollBarFadeDuration2 & i6) | (i6 ^ scrollBarFadeDuration2);
                                int i1115 = ~((i1114 & 3232) | (i1114 ^ 3232));
                                int i1116 = ((i1113 & i1115) | (i1113 ^ i1115)) * (-301);
                                int i1117 = ((i1013 | i1116) << 1) - (i1116 ^ i1013);
                                int i1118 = (~((i6 ^ 3232) | (i6 & 3232))) * 301;
                                objArr3 = new Object[1];
                                a(mode3, iIndexOf4, (char) (((i1117 | i1118) << 1) - (i1118 ^ i1117)), objArr3);
                                if (!(!line.equals((String) objArr3[0]))) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                } else {
                                    int i1119 = b + 69;
                                    TuitionPaymentFragmentbindingInflater1 = i1119 % 128;
                                    int i1219 = i1119 % 2;
                                    fileReader3.close();
                                    bufferedReader3.close();
                                }
                                int threadPriority3 = Process.getThreadPriority(0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i12110 = threadPriority3 * (-764);
                                int i12111 = ((-30580) ^ i12110) + ((i12110 & (-30580)) << 1);
                                int i12112 = ~threadPriority3;
                                int i12113 = ((-21) ^ i12112) | ((-21) & i12112);
                                int i12114 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                                int i12115 = ~((i12113 ^ i12114) | (i12113 & i12114));
                                int i12116 = ~(((-21) ^ threadPriority3) | ((-21) & threadPriority3) | iTuitionPaymentFragmentspecialinlinedviewModeldefault14);
                                int i12117 = (i12115 ^ i12116) | (i12116 & i12115);
                                int i12118 = ~threadPriority3;
                                int i13110 = (i12118 & 20) | (i12118 ^ 20);
                                int i13111 = ~((i13110 & iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | (i13110 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14));
                                int i13112 = ((i12117 & i13111) | (i12117 ^ i13111)) * 765;
                                int i13113 = (i12111 ^ i13112) + ((i13112 & i12111) << 1);
                                int i13114 = -(-(((~((-21) | i12112)) | (~(((-21) ^ i12114) | (i12114 & (-21))))) * 1530));
                                int i13115 = (i13113 ^ i13114) + ((i13113 & i13114) << 1);
                                int i13116 = ~(((-21) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | ((-21) & iTuitionPaymentFragmentspecialinlinedviewModeldefault14));
                                int i13117 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                                int i13118 = (i13117 & i12112) | (i12112 ^ i13117);
                                int i13119 = ~((i13118 & 20) | (i13118 ^ 20));
                                int i14110 = -(-(((i13119 & i13116) | (i13116 ^ i13119)) * 765));
                                int i14111 = -((((i13115 | i14110) << 1) - (i14110 ^ i13115)) >> 6);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i14112 = ~i14111;
                                int i14113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                                int i14114 = ~(((-97) & i14113) | ((-97) ^ i14113));
                                int i14115 = (i14112 & i14114) | (i14112 ^ i14114);
                                int i14116 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault15 ^ 96) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & 96));
                                int i14117 = (i14111 * (-563)) + 54240 + (((i14115 & i14116) | (i14115 ^ i14116)) * (-564));
                                int i14118 = ~i14111;
                                int i14119 = i14117 + ((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault15 | (i14118 ^ 96) | (i14118 & 96))) * 1128);
                                int i15110 = -(-(((~(i14111 | 96)) | (~(i14118 | i14113))) * 564));
                                int i15111 = (i14119 & i15110) + (i15110 | i14119);
                                int i15112 = -View.getDefaultSize(0, 0);
                                int i15113 = (i15112 ^ 31) + ((i15112 & 31) << 1);
                                int iResolveSize3 = View.resolveSize(0, 0);
                                char c4 = (char) ((iResolveSize3 ^ 61646) + ((61646 & iResolveSize3) << 1));
                                Object[] objArr112 = new Object[1];
                                a(i15111, i15113, c4, objArr112);
                                file = new File((String) objArr112[0]);
                                if (!file.canRead()) {
                                    fileReader = new FileReader(file);
                                    bufferedReader = new BufferedReader(fileReader);
                                    String line6 = bufferedReader.readLine();
                                    int i15114 = -AndroidCharacter.getMirror('0');
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault16 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i15115 = (i15114 * (-574)) - 100450;
                                    int i15116 = ~i15114;
                                    int i15117 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault16;
                                    int i15118 = ~((i15116 ^ i15117) | (i15116 & i15117));
                                    int i15119 = ~(((-176) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault16) | ((-176) & iTuitionPaymentFragmentspecialinlinedviewModeldefault16));
                                    int i16110 = -(-(((i15118 ^ i15119) | (i15119 & i15118)) * 1150));
                                    int i16111 = (i15115 & i16110) + (i16110 | i15115);
                                    int i16112 = ~(((-176) & iTuitionPaymentFragmentspecialinlinedviewModeldefault16) | ((-176) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault16));
                                    int i16113 = ~((i15117 ^ 175) | (i15117 & 175));
                                    int i16114 = (i16111 - (~(-(-(((i16112 & i16113) | (i16112 ^ i16113)) * (-575)))))) - 1;
                                    int i16115 = ~(i15116 | iTuitionPaymentFragmentspecialinlinedviewModeldefault16);
                                    int i16116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault16;
                                    int i16117 = ~((i15114 & i16116) | (i16116 ^ i15114));
                                    int i16118 = -(-(((i16115 & i16117) | (i16115 ^ i16117)) * 575));
                                    int i16119 = (i16114 & i16118) + (i16118 | i16114);
                                    int i17110 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                    int i17111 = i17110 * (-167);
                                    int i17112 = (i17111 & (-167)) + (i17111 | (-167));
                                    int i17113 = ~i17110;
                                    int i17114 = ~((i17113 ^ (-2)) | (i17113 & (-2)));
                                    int i17115 = ~(((-2) ^ i6) | ((-2) & i6));
                                    int i17116 = ((i17114 ^ i17115) | (i17115 & i17114)) * 168;
                                    int i17117 = (i17112 ^ i17116) + ((i17116 & i17112) << 1);
                                    int i17118 = (i17113 ^ (-2)) | (i17113 & (-2));
                                    int i17119 = (i17117 - (~(-(-((~((i17118 ^ i) | (i17118 & i))) * 168))))) - 1;
                                    int i18110 = ~((i17113 & i6) | (i17113 ^ i6));
                                    int i18111 = ~i17110;
                                    int i18112 = ~((i18111 ^ 1) | (i18111 & 1));
                                    int i18113 = (i18110 ^ i18112) | (i18110 & i18112);
                                    int i18114 = (i17110 & (-2)) | ((-2) ^ i17110);
                                    int i18115 = ~((i18114 & i) | (i18114 ^ i));
                                    int i18116 = (i17119 - (~(-(-(((i18115 & i18113) | (i18113 ^ i18115)) * 168))))) - 1;
                                    int i18117 = TuitionPaymentFragmentbindingInflater1;
                                    int i18118 = (i18117 ^ 109) + ((i18117 & 109) << 1);
                                    b = i18118 % 128;
                                    int i18119 = i18118 % 2;
                                    int iRgb3 = Color.rgb(0, 0, 0);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault17 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i19110 = (iRgb3 * 595) + 1553492635;
                                    int i19111 = ~iRgb3;
                                    int i19112 = ~((i19111 ^ 16782935) | (i19111 & 16782935));
                                    int i19113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault17;
                                    int i19114 = ~(i19113 | 16782935);
                                    int i19115 = ((i19112 ^ i19114) | (i19114 & i19112)) * (-1188);
                                    int i19116 = (i19110 & i19115) + (i19115 | i19110);
                                    int i19117 = ~(((-16782936) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault17) | ((-16782936) & iTuitionPaymentFragmentspecialinlinedviewModeldefault17));
                                    int i19118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault17;
                                    int i19119 = ~((i19118 & iRgb3) | (i19118 ^ iRgb3));
                                    int i20110 = ((i19112 ^ i19117) | (i19117 & i19112) | i19119) * 594;
                                    int i20111 = ~((-16782936) | i19113);
                                    int i20112 = ~(((-16782936) & iRgb3) | ((-16782936) ^ iRgb3));
                                    Object[] objArr113 = new Object[1];
                                    a(i16119, i18116, (char) (((((i19116 | i20110) << 1) - (i19116 ^ i20110)) - (~((((i20111 & i20112) | (i20111 ^ i20112)) | i19119) * 594))) - 1), objArr113);
                                    zEquals = line6.equals((String) objArr113[0]);
                                    fileReader.close();
                                    bufferedReader.close();
                                    if (zEquals) {
                                        int i20113 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault18 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i20114 = i20113 * (-391);
                                        int i20115 = ((i20114 | (-24960)) << 1) - (i20114 ^ (-24960));
                                        int i20116 = ~(((-129) ^ i20113) | ((-129) & i20113));
                                        int i20117 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault18 & 128) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault18 ^ 128);
                                        int i20118 = ~i20117;
                                        int i20119 = ((i20116 & i20118) | (i20116 ^ i20118)) * (-196);
                                        int i21110 = (i20115 ^ i20119) + ((i20115 & i20119) << 1);
                                        int i21111 = ((i20113 ^ 128) | (i20113 & 128)) * 392;
                                        int i21112 = (i21110 & i21111) + (i21111 | i21110);
                                        int i21113 = ~i20113;
                                        int i21114 = ~((i21113 & (-129)) | (i21113 ^ (-129)));
                                        int i21115 = ~i20117;
                                        int i21116 = ((i21114 & i21115) | (i21114 ^ i21115)) * 196;
                                        int i21117 = (i21112 & i21116) + (i21116 | i21112);
                                        int i21118 = -TextUtils.indexOf((CharSequence) "", '0');
                                        Object[] objArr114 = new Object[1];
                                        a(i21117, ((i21118 | 35) << 1) - (i21118 ^ 35), (char) (Process.myPid() >> 22), objArr114);
                                        file2 = new File((String) objArr114[0]);
                                        if (!file2.canRead()) {
                                            int i21119 = b + 65;
                                            TuitionPaymentFragmentbindingInflater1 = i21119 % 128;
                                            int i22110 = i21119 % 2;
                                        } else {
                                            fileReader2 = new FileReader(file2);
                                            bufferedReader2 = new BufferedReader(fileReader2);
                                            String line7 = bufferedReader2.readLine();
                                            int i22111 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127;
                                            int i22112 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            int i22113 = -TextUtils.getOffsetBefore("", 0);
                                            Object[] objArr115 = new Object[1];
                                            a(i22111, ((i22112 | 1) << 1) - (i22112 ^ 1), (char) ((i22113 ^ 5719) + ((i22113 & 5719) << 1)), objArr115);
                                            zEquals2 = line7.equals((String) objArr115[0]);
                                            fileReader2.close();
                                            bufferedReader2.close();
                                            if (zEquals2) {
                                                int i22114 = b;
                                                int i22115 = (i22114 ^ 91) + ((i22114 & 91) << 1);
                                                i9 = i22115 % 128;
                                                TuitionPaymentFragmentbindingInflater1 = i9;
                                                int i22116 = i22115 % 2;
                                                if (line != null) {
                                                    int i22117 = (i9 & 39) + (i9 | 39);
                                                    int i22118 = i22117 % 128;
                                                    b = i22118;
                                                    int i22119 = i22117 % 2;
                                                    objArr = new Object[2];
                                                    objArr[0] = new int[1];
                                                    i10 = (i22118 & 29) + (i22118 | 29);
                                                    int i23120 = i10 % 128;
                                                    TuitionPaymentFragmentbindingInflater1 = i23120;
                                                    if (i10 % 2 == 0) {
                                                        i12 = (i & (-53)) | (i6 & 52);
                                                        i11 = 1;
                                                    } else {
                                                        i11 = 1;
                                                        i12 = (~(i & 20)) & (i | 20);
                                                    }
                                                    String[] strArr8 = new String[i11];
                                                    int i23121 = ((i23120 | 35) << i11) - (i23120 ^ 35);
                                                    b = i23121 % 128;
                                                    int i23122 = i23121 % 2;
                                                    strArr8[0] = line;
                                                    int[] iArr3 = (int[]) objArr[0];
                                                    int i23123 = ((i23120 | 51) << 1) - (i23120 ^ 51);
                                                    b = i23123 % 128;
                                                    int i23124 = i23123 % 2;
                                                    iArr3[0] = i12;
                                                    objArr[1] = strArr8;
                                                    c = 0;
                                                } else {
                                                    i8 = 2;
                                                }
                                            }
                                            objArr = new Object[i8];
                                            c = 0;
                                            objArr[0] = new int[]{i};
                                            objArr[1] = new String[0];
                                        }
                                    }
                                    int i231110 = ((int[]) objArr[c])[c];
                                    int i231111 = (~(i & i78)) & (i | i78);
                                    int i231112 = (i231111 | (-i231111)) >> 31;
                                    int i231113 = (~i231112) & i231110;
                                    int i231114 = i231112 & i78;
                                    int i2411110 = (i231114 & i231113) | (i231113 ^ i231114);
                                    Object obj6 = objArr[1];
                                    int i2411111 = b + 71;
                                    int i2411112 = i2411111 % 128;
                                    TuitionPaymentFragmentbindingInflater1 = i2411112;
                                    int i2411113 = i2411111 % 2;
                                    Object[] objArr116 = new Object[2];
                                    int i2411114 = (i231110 | i) & (~(i & i231110));
                                    int i2411115 = ((i2411114 | (-i2411114)) >> 31) & 1;
                                    int i2411116 = -i2411115;
                                    int i2411117 = (~(((i2411116 & i2411115) | (i2411115 ^ i2411116)) >> 31)) & 1;
                                    objArr116[i2411115] = null;
                                    objArr116[i2411117] = (String[]) obj6;
                                    String[] strArr9 = (String[]) objArr116[0];
                                    int i2411118 = i ^ i2411110;
                                    int i2411119 = i2411112 + 101;
                                    b = i2411119 % 128;
                                    int i2511110 = i2411119 % 2;
                                    int i2511111 = ((i2411118 | (-i2411118)) >> 31) & 16;
                                    objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i2411110}, strArr9};
                                    int i2511112 = 1924454364 + (((~((-536879130) | i6)) | 496568900 | (~((-530569799) | i))) * (-68)) + ((~((-34000899) | i6)) * (-68)) + (((~(530569798 | i6)) | (-570880028)) * 68);
                                    int i2511113 = (609 - (~(i2511111 * 306))) + (i2511112 * 306);
                                    int i2511114 = ~(i2511111 | i2511112);
                                    DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i2511115 = ~((i2511111 ^ i) | (i2511111 & i));
                                    int i2511116 = -(-(305 * ((i2511114 & i2511115) | (i2511114 ^ i2511115))));
                                    int i2511117 = (i2511113 ^ i2511116) + ((i2511113 & i2511116) << 1);
                                    int i2511118 = ~i2511112;
                                    int i2511119 = ~(i6 | i2511111);
                                    int i2611110 = ((i2511118 & i2511119) | (i2511118 ^ i2511119)) * 305;
                                    int i2611111 = ((i2511117 | i2611110) << 1) - (i2611110 ^ i2511117);
                                    int i2611112 = (i2611111 * (-515)) + (i2 * 517);
                                    int i2611113 = TuitionPaymentFragmentbindingInflater1;
                                    int i2611114 = ((i2611113 | 99) << 1) - (i2611113 ^ 99);
                                    b = i2611114 % 128;
                                    int i2611115 = i2611114 % 2;
                                    int i2611116 = ~i2;
                                    int i2611117 = ~(i2611116 | i);
                                    int i2611118 = ~i;
                                    int i2611119 = i2611117 | (~((i2611118 ^ i2611111) | (i2611118 & i2611111)));
                                    int i2711110 = ~((i2611118 ^ i2) | (i2611118 & i2));
                                    int i2711111 = -(-((-516) * ((i2611119 & i2711110) | (i2611119 ^ i2711110))));
                                    int i2711112 = ((i2611112 | i2711111) << 1) - (i2611112 ^ i2711111);
                                    int i2711113 = ~i2611111;
                                    int i2711114 = i2711113 | i2611116;
                                    int i2711115 = ~((i & i2711114) | (i2711114 ^ i));
                                    int i2711116 = i2711113 | i2611118;
                                    int i2711117 = -(-((i2711115 | (~((i2711116 & i2) | (i2711116 ^ i2)))) * 516));
                                    int i2711118 = (i2711112 ^ i2711117) + ((i2711117 & i2711112) << 1);
                                    int i2711119 = ~(i2711113 | i2);
                                    int i28119 = ~((i6 ^ i2) | (i2 & i6));
                                    int i281110 = ((i2711119 & i28119) | (i2711119 ^ i28119)) * 516;
                                    int i281111 = (i2711118 ^ i281110) + ((i281110 & i2711118) << 1);
                                    int i281112 = (i281111 << 13) ^ i281111;
                                    int i281113 = i281112 >>> 17;
                                    int i281114 = ((~i281112) & i281113) | ((~i281113) & i281112);
                                    int i281115 = i281114 << 5;
                                    ((int[]) objArr2[1])[0] = (i281114 | i281115) & (~(i281114 & i281115));
                                    i7 = i2611113 + 79;
                                    b = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        return objArr2;
                                    }
                                    throw null;
                                }
                                i13 = b + 29;
                                TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                                if (i13 % 2 == 0) {
                                    int i2821 = 3 % 5;
                                }
                                i8 = 2;
                                objArr = new Object[i8];
                                c = 0;
                                objArr[0] = new int[]{i};
                                objArr[1] = new String[0];
                                int i231115 = ((int[]) objArr[c])[c];
                                int i231116 = (~(i & i78)) & (i | i78);
                                int i231117 = (i231116 | (-i231116)) >> 31;
                                int i231118 = (~i231117) & i231115;
                                int i231119 = i231117 & i78;
                                int i24111110 = (i231119 & i231118) | (i231118 ^ i231119);
                                Object obj7 = objArr[1];
                                int i24111111 = b + 71;
                                int i24111112 = i24111111 % 128;
                                TuitionPaymentFragmentbindingInflater1 = i24111112;
                                int i24111113 = i24111111 % 2;
                                Object[] objArr117 = new Object[2];
                                int i24111114 = (i231115 | i) & (~(i & i231115));
                                int i24111115 = ((i24111114 | (-i24111114)) >> 31) & 1;
                                int i24111116 = -i24111115;
                                int i24111117 = (~(((i24111116 & i24111115) | (i24111115 ^ i24111116)) >> 31)) & 1;
                                objArr117[i24111115] = null;
                                objArr117[i24111117] = (String[]) obj7;
                                String[] strArr10 = (String[]) objArr117[0];
                                int i24111118 = i ^ i24111110;
                                int i24111119 = i24111112 + 101;
                                b = i24111119 % 128;
                                int i25111110 = i24111119 % 2;
                                int i25111111 = ((i24111118 | (-i24111118)) >> 31) & 16;
                                objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i24111110}, strArr10};
                                int i25111112 = 1924454364 + (((~((-536879130) | i6)) | 496568900 | (~((-530569799) | i))) * (-68)) + ((~((-34000899) | i6)) * (-68)) + (((~(530569798 | i6)) | (-570880028)) * 68);
                                int i25111113 = (609 - (~(i25111111 * 306))) + (i25111112 * 306);
                                int i25111114 = ~(i25111111 | i25111112);
                                DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i25111115 = ~((i25111111 ^ i) | (i25111111 & i));
                                int i25111116 = -(-(305 * ((i25111114 & i25111115) | (i25111114 ^ i25111115))));
                                int i25111117 = (i25111113 ^ i25111116) + ((i25111113 & i25111116) << 1);
                                int i25111118 = ~i25111112;
                                int i25111119 = ~(i6 | i25111111);
                                int i26111110 = ((i25111118 & i25111119) | (i25111118 ^ i25111119)) * 305;
                                int i26111111 = ((i25111117 | i26111110) << 1) - (i26111110 ^ i25111117);
                                int i26111112 = (i26111111 * (-515)) + (i2 * 517);
                                int i26111113 = TuitionPaymentFragmentbindingInflater1;
                                int i26111114 = ((i26111113 | 99) << 1) - (i26111113 ^ 99);
                                b = i26111114 % 128;
                                int i26111115 = i26111114 % 2;
                                int i26111116 = ~i2;
                                int i26111117 = ~(i26111116 | i);
                                int i26111118 = ~i;
                                int i26111119 = i26111117 | (~((i26111118 ^ i26111111) | (i26111118 & i26111111)));
                                int i27111110 = ~((i26111118 ^ i2) | (i26111118 & i2));
                                int i27111111 = -(-((-516) * ((i26111119 & i27111110) | (i26111119 ^ i27111110))));
                                int i27111112 = ((i26111112 | i27111111) << 1) - (i26111112 ^ i27111111);
                                int i27111113 = ~i26111111;
                                int i27111114 = i27111113 | i26111116;
                                int i27111115 = ~((i & i27111114) | (i27111114 ^ i));
                                int i27111116 = i27111113 | i26111118;
                                int i27111117 = -(-((i27111115 | (~((i27111116 & i2) | (i27111116 ^ i2)))) * 516));
                                int i27111118 = (i27111112 ^ i27111117) + ((i27111117 & i27111112) << 1);
                                int i27111119 = ~(i27111113 | i2);
                                int i281116 = ~((i6 ^ i2) | (i2 & i6));
                                int i281117 = ((i27111119 & i281116) | (i27111119 ^ i281116)) * 516;
                                int i281118 = (i27111118 ^ i281117) + ((i281117 & i27111118) << 1);
                                int i281119 = (i281118 << 13) ^ i281118;
                                int i2811110 = i281119 >>> 17;
                                int i2811111 = ((~i281119) & i2811110) | ((~i2811110) & i281119);
                                int i2811112 = i2811111 << 5;
                                ((int[]) objArr2[1])[0] = (i2811111 | i2811112) & (~(i2811111 & i2811112));
                                i7 = i26111113 + 79;
                                b = i7 % 128;
                                if (i7 % 2 == 0) {
                                    return objArr2;
                                }
                                throw null;
                            }
                            int i292 = TuitionPaymentFragmentbindingInflater1;
                            i14 = (i292 ^ 19) + ((i292 & 19) << 1);
                            b = i14 % 128;
                            if (i14 % 2 != 0) {
                                int i293 = 74 / 0;
                            }
                            int threadPriority4 = Process.getThreadPriority(0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault19 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i12119 = threadPriority4 * (-764);
                            int i121110 = ((-30580) ^ i12119) + ((i12119 & (-30580)) << 1);
                            int i121111 = ~threadPriority4;
                            int i121112 = ((-21) ^ i121111) | ((-21) & i121111);
                            int i121113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault19;
                            int i121114 = ~((i121112 ^ i121113) | (i121112 & i121113));
                            int i121115 = ~(((-21) ^ threadPriority4) | ((-21) & threadPriority4) | iTuitionPaymentFragmentspecialinlinedviewModeldefault19);
                            int i121116 = (i121114 ^ i121115) | (i121115 & i121114);
                            int i121117 = ~threadPriority4;
                            int i131110 = (i121117 & 20) | (i121117 ^ 20);
                            int i131111 = ~((i131110 & iTuitionPaymentFragmentspecialinlinedviewModeldefault19) | (i131110 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault19));
                            int i131112 = ((i121116 & i131111) | (i121116 ^ i131111)) * 765;
                            int i131113 = (i121110 ^ i131112) + ((i131112 & i121110) << 1);
                            int i131114 = -(-(((~((-21) | i121111)) | (~(((-21) ^ i121113) | (i121113 & (-21))))) * 1530));
                            int i131115 = (i131113 ^ i131114) + ((i131113 & i131114) << 1);
                            int i131116 = ~(((-21) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault19) | ((-21) & iTuitionPaymentFragmentspecialinlinedviewModeldefault19));
                            int i131117 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault19;
                            int i131118 = (i131117 & i121111) | (i121111 ^ i131117);
                            int i131119 = ~((i131118 & 20) | (i131118 ^ 20));
                            int i141110 = -(-(((i131119 & i131116) | (i131116 ^ i131119)) * 765));
                            int i141111 = -((((i131115 | i141110) << 1) - (i141110 ^ i131115)) >> 6);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault110 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i141112 = ~i141111;
                            int i141113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault110;
                            int i141114 = ~(((-97) & i141113) | ((-97) ^ i141113));
                            int i141115 = (i141112 & i141114) | (i141112 ^ i141114);
                            int i141116 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault110 ^ 96) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault110 & 96));
                            int i141117 = (i141111 * (-563)) + 54240 + (((i141115 & i141116) | (i141115 ^ i141116)) * (-564));
                            int i141118 = ~i141111;
                            int i141119 = i141117 + ((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault110 | (i141118 ^ 96) | (i141118 & 96))) * 1128);
                            int i151110 = -(-(((~(i141111 | 96)) | (~(i141118 | i141113))) * 564));
                            int i151111 = (i141119 & i151110) + (i151110 | i141119);
                            int i151112 = -View.getDefaultSize(0, 0);
                            int i151113 = (i151112 ^ 31) + ((i151112 & 31) << 1);
                            int iResolveSize4 = View.resolveSize(0, 0);
                            char c5 = (char) ((iResolveSize4 ^ 61646) + ((61646 & iResolveSize4) << 1));
                            Object[] objArr118 = new Object[1];
                            a(i151111, i151113, c5, objArr118);
                            file = new File((String) objArr118[0]);
                            if (!file.canRead()) {
                                fileReader = new FileReader(file);
                                bufferedReader = new BufferedReader(fileReader);
                                String line8 = bufferedReader.readLine();
                                int i151114 = -AndroidCharacter.getMirror('0');
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault111 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i151115 = (i151114 * (-574)) - 100450;
                                int i151116 = ~i151114;
                                int i151117 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault111;
                                int i151118 = ~((i151116 ^ i151117) | (i151116 & i151117));
                                int i151119 = ~(((-176) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault111) | ((-176) & iTuitionPaymentFragmentspecialinlinedviewModeldefault111));
                                int i161110 = -(-(((i151118 ^ i151119) | (i151119 & i151118)) * 1150));
                                int i161111 = (i151115 & i161110) + (i161110 | i151115);
                                int i161112 = ~(((-176) & iTuitionPaymentFragmentspecialinlinedviewModeldefault111) | ((-176) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault111));
                                int i161113 = ~((i151117 ^ 175) | (i151117 & 175));
                                int i161114 = (i161111 - (~(-(-(((i161112 & i161113) | (i161112 ^ i161113)) * (-575)))))) - 1;
                                int i161115 = ~(i151116 | iTuitionPaymentFragmentspecialinlinedviewModeldefault111);
                                int i161116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault111;
                                int i161117 = ~((i151114 & i161116) | (i161116 ^ i151114));
                                int i161118 = -(-(((i161115 & i161117) | (i161115 ^ i161117)) * 575));
                                int i161119 = (i161114 & i161118) + (i161118 | i161114);
                                int i171110 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int i171111 = i171110 * (-167);
                                int i171112 = (i171111 & (-167)) + (i171111 | (-167));
                                int i171113 = ~i171110;
                                int i171114 = ~((i171113 ^ (-2)) | (i171113 & (-2)));
                                int i171115 = ~(((-2) ^ i6) | ((-2) & i6));
                                int i171116 = ((i171114 ^ i171115) | (i171115 & i171114)) * 168;
                                int i171117 = (i171112 ^ i171116) + ((i171116 & i171112) << 1);
                                int i171118 = (i171113 ^ (-2)) | (i171113 & (-2));
                                int i171119 = (i171117 - (~(-(-((~((i171118 ^ i) | (i171118 & i))) * 168))))) - 1;
                                int i181110 = ~((i171113 & i6) | (i171113 ^ i6));
                                int i181111 = ~i171110;
                                int i181112 = ~((i181111 ^ 1) | (i181111 & 1));
                                int i181113 = (i181110 ^ i181112) | (i181110 & i181112);
                                int i181114 = (i171110 & (-2)) | ((-2) ^ i171110);
                                int i181115 = ~((i181114 & i) | (i181114 ^ i));
                                int i181116 = (i171119 - (~(-(-(((i181115 & i181113) | (i181113 ^ i181115)) * 168))))) - 1;
                                int i181117 = TuitionPaymentFragmentbindingInflater1;
                                int i181118 = (i181117 ^ 109) + ((i181117 & 109) << 1);
                                b = i181118 % 128;
                                int i181119 = i181118 % 2;
                                int iRgb4 = Color.rgb(0, 0, 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault112 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i191110 = (iRgb4 * 595) + 1553492635;
                                int i191111 = ~iRgb4;
                                int i191112 = ~((i191111 ^ 16782935) | (i191111 & 16782935));
                                int i191113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault112;
                                int i191114 = ~(i191113 | 16782935);
                                int i191115 = ((i191112 ^ i191114) | (i191114 & i191112)) * (-1188);
                                int i191116 = (i191110 & i191115) + (i191115 | i191110);
                                int i191117 = ~(((-16782936) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault112) | ((-16782936) & iTuitionPaymentFragmentspecialinlinedviewModeldefault112));
                                int i191118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault112;
                                int i191119 = ~((i191118 & iRgb4) | (i191118 ^ iRgb4));
                                int i201110 = ((i191112 ^ i191117) | (i191117 & i191112) | i191119) * 594;
                                int i201111 = ~((-16782936) | i191113);
                                int i201112 = ~(((-16782936) & iRgb4) | ((-16782936) ^ iRgb4));
                                Object[] objArr119 = new Object[1];
                                a(i161119, i181116, (char) (((((i191116 | i201110) << 1) - (i191116 ^ i201110)) - (~((((i201111 & i201112) | (i201111 ^ i201112)) | i191119) * 594))) - 1), objArr119);
                                zEquals = line8.equals((String) objArr119[0]);
                                fileReader.close();
                                bufferedReader.close();
                                if (zEquals) {
                                    int i201113 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault113 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i201114 = i201113 * (-391);
                                    int i201115 = ((i201114 | (-24960)) << 1) - (i201114 ^ (-24960));
                                    int i201116 = ~(((-129) ^ i201113) | ((-129) & i201113));
                                    int i201117 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault113 & 128) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault113 ^ 128);
                                    int i201118 = ~i201117;
                                    int i201119 = ((i201116 & i201118) | (i201116 ^ i201118)) * (-196);
                                    int i211110 = (i201115 ^ i201119) + ((i201115 & i201119) << 1);
                                    int i211111 = ((i201113 ^ 128) | (i201113 & 128)) * 392;
                                    int i211112 = (i211110 & i211111) + (i211111 | i211110);
                                    int i211113 = ~i201113;
                                    int i211114 = ~((i211113 & (-129)) | (i211113 ^ (-129)));
                                    int i211115 = ~i201117;
                                    int i211116 = ((i211114 & i211115) | (i211114 ^ i211115)) * 196;
                                    int i211117 = (i211112 & i211116) + (i211116 | i211112);
                                    int i211118 = -TextUtils.indexOf((CharSequence) "", '0');
                                    Object[] objArr1110 = new Object[1];
                                    a(i211117, ((i211118 | 35) << 1) - (i211118 ^ 35), (char) (Process.myPid() >> 22), objArr1110);
                                    file2 = new File((String) objArr1110[0]);
                                    if (!file2.canRead()) {
                                        int i211119 = b + 65;
                                        TuitionPaymentFragmentbindingInflater1 = i211119 % 128;
                                        int i221110 = i211119 % 2;
                                    } else {
                                        fileReader2 = new FileReader(file2);
                                        bufferedReader2 = new BufferedReader(fileReader2);
                                        String line9 = bufferedReader2.readLine();
                                        int i221111 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127;
                                        int i221112 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        int i221113 = -TextUtils.getOffsetBefore("", 0);
                                        Object[] objArr1111 = new Object[1];
                                        a(i221111, ((i221112 | 1) << 1) - (i221112 ^ 1), (char) ((i221113 ^ 5719) + ((i221113 & 5719) << 1)), objArr1111);
                                        zEquals2 = line9.equals((String) objArr1111[0]);
                                        fileReader2.close();
                                        bufferedReader2.close();
                                        if (zEquals2) {
                                            int i221114 = b;
                                            int i221115 = (i221114 ^ 91) + ((i221114 & 91) << 1);
                                            i9 = i221115 % 128;
                                            TuitionPaymentFragmentbindingInflater1 = i9;
                                            int i221116 = i221115 % 2;
                                            if (line != null) {
                                                int i221117 = (i9 & 39) + (i9 | 39);
                                                int i221118 = i221117 % 128;
                                                b = i221118;
                                                int i221119 = i221117 % 2;
                                                objArr = new Object[2];
                                                objArr[0] = new int[1];
                                                i10 = (i221118 & 29) + (i221118 | 29);
                                                int i23125 = i10 % 128;
                                                TuitionPaymentFragmentbindingInflater1 = i23125;
                                                if (i10 % 2 == 0) {
                                                    i12 = (i & (-53)) | (i6 & 52);
                                                    i11 = 1;
                                                } else {
                                                    i11 = 1;
                                                    i12 = (~(i & 20)) & (i | 20);
                                                }
                                                String[] strArr11 = new String[i11];
                                                int i23126 = ((i23125 | 35) << i11) - (i23125 ^ 35);
                                                b = i23126 % 128;
                                                int i23127 = i23126 % 2;
                                                strArr11[0] = line;
                                                int[] iArr4 = (int[]) objArr[0];
                                                int i23128 = ((i23125 | 51) << 1) - (i23125 ^ 51);
                                                b = i23128 % 128;
                                                int i23129 = i23128 % 2;
                                                iArr4[0] = i12;
                                                objArr[1] = strArr11;
                                                c = 0;
                                            } else {
                                                i8 = 2;
                                            }
                                        }
                                        objArr = new Object[i8];
                                        c = 0;
                                        objArr[0] = new int[]{i};
                                        objArr[1] = new String[0];
                                    }
                                }
                                int i2311110 = ((int[]) objArr[c])[c];
                                int i2311111 = (~(i & i78)) & (i | i78);
                                int i2311112 = (i2311111 | (-i2311111)) >> 31;
                                int i2311113 = (~i2311112) & i2311110;
                                int i2311114 = i2311112 & i78;
                                int i241111110 = (i2311114 & i2311113) | (i2311113 ^ i2311114);
                                Object obj8 = objArr[1];
                                int i241111111 = b + 71;
                                int i241111112 = i241111111 % 128;
                                TuitionPaymentFragmentbindingInflater1 = i241111112;
                                int i241111113 = i241111111 % 2;
                                Object[] objArr1112 = new Object[2];
                                int i241111114 = (i2311110 | i) & (~(i & i2311110));
                                int i241111115 = ((i241111114 | (-i241111114)) >> 31) & 1;
                                int i241111116 = -i241111115;
                                int i241111117 = (~(((i241111116 & i241111115) | (i241111115 ^ i241111116)) >> 31)) & 1;
                                objArr1112[i241111115] = null;
                                objArr1112[i241111117] = (String[]) obj8;
                                String[] strArr12 = (String[]) objArr1112[0];
                                int i241111118 = i ^ i241111110;
                                int i241111119 = i241111112 + 101;
                                b = i241111119 % 128;
                                int i251111110 = i241111119 % 2;
                                int i251111111 = ((i241111118 | (-i241111118)) >> 31) & 16;
                                objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i241111110}, strArr12};
                                int i251111112 = 1924454364 + (((~((-536879130) | i6)) | 496568900 | (~((-530569799) | i))) * (-68)) + ((~((-34000899) | i6)) * (-68)) + (((~(530569798 | i6)) | (-570880028)) * 68);
                                int i251111113 = (609 - (~(i251111111 * 306))) + (i251111112 * 306);
                                int i251111114 = ~(i251111111 | i251111112);
                                DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i251111115 = ~((i251111111 ^ i) | (i251111111 & i));
                                int i251111116 = -(-(305 * ((i251111114 & i251111115) | (i251111114 ^ i251111115))));
                                int i251111117 = (i251111113 ^ i251111116) + ((i251111113 & i251111116) << 1);
                                int i251111118 = ~i251111112;
                                int i251111119 = ~(i6 | i251111111);
                                int i261111110 = ((i251111118 & i251111119) | (i251111118 ^ i251111119)) * 305;
                                int i261111111 = ((i251111117 | i261111110) << 1) - (i261111110 ^ i251111117);
                                int i261111112 = (i261111111 * (-515)) + (i2 * 517);
                                int i261111113 = TuitionPaymentFragmentbindingInflater1;
                                int i261111114 = ((i261111113 | 99) << 1) - (i261111113 ^ 99);
                                b = i261111114 % 128;
                                int i261111115 = i261111114 % 2;
                                int i261111116 = ~i2;
                                int i261111117 = ~(i261111116 | i);
                                int i261111118 = ~i;
                                int i261111119 = i261111117 | (~((i261111118 ^ i261111111) | (i261111118 & i261111111)));
                                int i271111110 = ~((i261111118 ^ i2) | (i261111118 & i2));
                                int i271111111 = -(-((-516) * ((i261111119 & i271111110) | (i261111119 ^ i271111110))));
                                int i271111112 = ((i261111112 | i271111111) << 1) - (i261111112 ^ i271111111);
                                int i271111113 = ~i261111111;
                                int i271111114 = i271111113 | i261111116;
                                int i271111115 = ~((i & i271111114) | (i271111114 ^ i));
                                int i271111116 = i271111113 | i261111118;
                                int i271111117 = -(-((i271111115 | (~((i271111116 & i2) | (i271111116 ^ i2)))) * 516));
                                int i271111118 = (i271111112 ^ i271111117) + ((i271111117 & i271111112) << 1);
                                int i271111119 = ~(i271111113 | i2);
                                int i2811113 = ~((i6 ^ i2) | (i2 & i6));
                                int i2811114 = ((i271111119 & i2811113) | (i271111119 ^ i2811113)) * 516;
                                int i2811115 = (i271111118 ^ i2811114) + ((i2811114 & i271111118) << 1);
                                int i2811116 = (i2811115 << 13) ^ i2811115;
                                int i2811117 = i2811116 >>> 17;
                                int i2811118 = ((~i2811116) & i2811117) | ((~i2811117) & i2811116);
                                int i2811119 = i2811118 << 5;
                                ((int[]) objArr2[1])[0] = (i2811118 | i2811119) & (~(i2811118 & i2811119));
                                i7 = i261111113 + 79;
                                b = i7 % 128;
                                if (i7 % 2 == 0) {
                                    return objArr2;
                                }
                                throw null;
                            }
                            i13 = b + 29;
                            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i2822 = 3 % 5;
                            }
                        } catch (Exception unused) {
                        }
                        int pressedStateDuration2 = ViewConfiguration.getPressedStateDuration() >> 16;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault20 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i710 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault20;
                        int i810 = (~(((-54) ^ i710) | ((-54) & i710))) | (~(((-54) ^ pressedStateDuration2) | ((-54) & pressedStateDuration2)));
                        int i811 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault20;
                        int i812 = ~(i811 | pressedStateDuration2);
                        int i813 = (i810 ^ i812) | (i810 & i812);
                        int i814 = (~pressedStateDuration2) | 53;
                        int i815 = (pressedStateDuration2 * (-589)) + 31323 + (((~((i814 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault20) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault20 & i814))) | i813) * 590);
                        int i816 = (~(((-54) ^ i811) | ((-54) & i811))) | (~(((-54) & pressedStateDuration2) | ((-54) ^ pressedStateDuration2)));
                        int i817 = ~((i710 ^ pressedStateDuration2) | (i710 & pressedStateDuration2));
                        int i818 = i815 + (((i816 & i817) | (i816 ^ i817)) * (-1180));
                        int i819 = ~((~pressedStateDuration2) | i811);
                        int i910 = ~(i710 | 53);
                        int i911 = i818 + (((i819 & i910) | (i819 ^ i910)) * 590);
                        int i912 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int i913 = (i912 ^ 40) + ((i912 & 40) << 1);
                        int offsetBefore3 = TextUtils.getOffsetBefore("", 0);
                        int i914 = offsetBefore3 * 450;
                        int i915 = (i914 ^ (-2572864)) + ((i914 & (-2572864)) << 1);
                        int i916 = ~offsetBefore3;
                        int i917 = ~((i916 & 5743) | (i916 ^ 5743));
                        int i918 = ((-5744) ^ offsetBefore3) | ((-5744) & offsetBefore3);
                        int i919 = i915 + (((~((i918 & i) | (i918 ^ i))) | i917) * 449);
                        int i1014 = ~offsetBefore3;
                        int i1015 = (~((i1014 & 5743) | (i1014 ^ 5743))) * (-1347);
                        int i1016 = (i919 ^ i1015) + ((i919 & i1015) << 1);
                        int i1017 = ~i;
                        int i1018 = ~(offsetBefore3 | ((-5744) & i1017) | ((-5744) ^ i1017));
                        int i1019 = ((i917 & i1018) | (i917 ^ i1018)) * 449;
                        Object[] objArr20 = new Object[1];
                        a(i911, i913, (char) ((i1016 & i1019) + (i1019 | i1016)), objArr20);
                        file3 = new File((String) objArr20[0]);
                    } catch (Exception unused2) {
                    }
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char windowTouchSlop2 = (char) (2419 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        int iRed2 = 2845 - Color.red(0);
                        int mode4 = 5 - View.MeasureSpec.getMode(0);
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        Object[] objArr21 = new Object[1];
                        c(b4, b5, (byte) (b5 - 1), objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop2, iRed2, mode4, -501222268, false, (String) objArr21[0], new Class[0]);
                    }
                    long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                    long j9 = -192259977;
                    long j10 = (((long) (-947)) * j9) + (((long) 949) * jLongValue2);
                    long j11 = -948;
                    long j12 = -1;
                    long j13 = j9 ^ j12;
                    long j14 = jLongValue2 ^ j12;
                    long j15 = i;
                    long j16 = j10 + ((j13 | ((j14 | j15) ^ j12)) * j11) + (j11 * (j12 ^ ((j13 | j14) | (j15 ^ j12)))) + (((long) 948) * (j9 | j14)) + ((long) (-966926709));
                    int i610 = (~Process.myUid()) | 536154117;
                    int i611 = ((int) (j16 >> 32)) & (1554992622 + (i610 * 495) + (((~i610) | 364183557) * 495));
                    i6 = ~i;
                    int i612 = ((int) j16) & ((-149258101) + ((26558857 | i) * 614) + (((~(714066840 | i6)) | R.raw.nodomain | (~((-723159570) | i6))) * (-1228)) + (((~(731892633 | i6)) | (~((-705333777) | i6))) * 614));
                    int i613 = (i611 & i612) | (i611 ^ i612);
                    int i614 = (~(i & 10)) & (i | 10);
                    int i615 = i613 ^ 1;
                    int i616 = -i615;
                    int i617 = (i615 & i616) | (i615 ^ i616);
                    int i618 = TuitionPaymentFragmentbindingInflater1;
                    int i711 = ((i618 | 55) << 1) - (i618 ^ 55);
                    b = i711 % 128;
                    int i712 = i711 % 2;
                    int i713 = i617 >> 31;
                    int i714 = (i713 & i) | (i614 & (~i713));
                    int i715 = i ^ i5;
                    int i716 = (i715 | (-i715)) >> 31;
                    int i717 = i714 & (~i716);
                    int i718 = i5 & i716;
                    int i719 = (i717 ^ i718) | (i718 & i717);
                    line = null;
                    i8 = 2;
                    objArr = new Object[i8];
                    c = 0;
                    objArr[0] = new int[]{i};
                    objArr[1] = new String[0];
                    int i2311115 = ((int[]) objArr[c])[c];
                    int i2311116 = (~(i & i719)) & (i | i719);
                    int i2311117 = (i2311116 | (-i2311116)) >> 31;
                    int i2311118 = (~i2311117) & i2311115;
                    int i2311119 = i2311117 & i719;
                    int i2411111110 = (i2311119 & i2311118) | (i2311118 ^ i2311119);
                    Object obj9 = objArr[1];
                    int i2411111111 = b + 71;
                    int i2411111112 = i2411111111 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i2411111112;
                    int i2411111113 = i2411111111 % 2;
                    Object[] objArr1113 = new Object[2];
                    int i2411111114 = (i2311115 | i) & (~(i & i2311115));
                    int i2411111115 = ((i2411111114 | (-i2411111114)) >> 31) & 1;
                    int i2411111116 = -i2411111115;
                    int i2411111117 = (~(((i2411111116 & i2411111115) | (i2411111115 ^ i2411111116)) >> 31)) & 1;
                    objArr1113[i2411111115] = null;
                    objArr1113[i2411111117] = (String[]) obj9;
                    String[] strArr13 = (String[]) objArr1113[0];
                    int i2411111118 = i ^ i2411111110;
                    int i2411111119 = i2411111112 + 101;
                    b = i2411111119 % 128;
                    int i2511111110 = i2411111119 % 2;
                    int i2511111111 = ((i2411111118 | (-i2411111118)) >> 31) & 16;
                    objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i2411111110}, strArr13};
                    int i2511111112 = 1924454364 + (((~((-536879130) | i6)) | 496568900 | (~((-530569799) | i))) * (-68)) + ((~((-34000899) | i6)) * (-68)) + (((~(530569798 | i6)) | (-570880028)) * 68);
                    int i2511111113 = (609 - (~(i2511111111 * 306))) + (i2511111112 * 306);
                    int i2511111114 = ~(i2511111111 | i2511111112);
                    DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i2511111115 = ~((i2511111111 ^ i) | (i2511111111 & i));
                    int i2511111116 = -(-(305 * ((i2511111114 & i2511111115) | (i2511111114 ^ i2511111115))));
                    int i2511111117 = (i2511111113 ^ i2511111116) + ((i2511111113 & i2511111116) << 1);
                    int i2511111118 = ~i2511111112;
                    int i2511111119 = ~(i6 | i2511111111);
                    int i2611111110 = ((i2511111118 & i2511111119) | (i2511111118 ^ i2511111119)) * 305;
                    int i2611111111 = ((i2511111117 | i2611111110) << 1) - (i2611111110 ^ i2511111117);
                    int i2611111112 = (i2611111111 * (-515)) + (i2 * 517);
                    int i2611111113 = TuitionPaymentFragmentbindingInflater1;
                    int i2611111114 = ((i2611111113 | 99) << 1) - (i2611111113 ^ 99);
                    b = i2611111114 % 128;
                    int i2611111115 = i2611111114 % 2;
                    int i2611111116 = ~i2;
                    int i2611111117 = ~(i2611111116 | i);
                    int i2611111118 = ~i;
                    int i2611111119 = i2611111117 | (~((i2611111118 ^ i2611111111) | (i2611111118 & i2611111111)));
                    int i2711111110 = ~((i2611111118 ^ i2) | (i2611111118 & i2));
                    int i2711111111 = -(-((-516) * ((i2611111119 & i2711111110) | (i2611111119 ^ i2711111110))));
                    int i2711111112 = ((i2611111112 | i2711111111) << 1) - (i2611111112 ^ i2711111111);
                    int i2711111113 = ~i2611111111;
                    int i2711111114 = i2711111113 | i2611111116;
                    int i2711111115 = ~((i & i2711111114) | (i2711111114 ^ i));
                    int i2711111116 = i2711111113 | i2611111118;
                    int i2711111117 = -(-((i2711111115 | (~((i2711111116 & i2) | (i2711111116 ^ i2)))) * 516));
                    int i2711111118 = (i2711111112 ^ i2711111117) + ((i2711111117 & i2711111112) << 1);
                    int i2711111119 = ~(i2711111113 | i2);
                    int i28111110 = ~((i6 ^ i2) | (i2 & i6));
                    int i28111111 = ((i2711111119 & i28111110) | (i2711111119 ^ i28111110)) * 516;
                    int i28111112 = (i2711111118 ^ i28111111) + ((i28111111 & i2711111118) << 1);
                    int i28111113 = (i28111112 << 13) ^ i28111112;
                    int i28111114 = i28111113 >>> 17;
                    int i28111115 = ((~i28111113) & i28111114) | ((~i28111114) & i28111113);
                    int i28111116 = i28111115 << 5;
                    ((int[]) objArr2[1])[0] = (i28111115 | i28111116) & (~(i28111115 & i28111116));
                    i7 = i2611111113 + 79;
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        return objArr2;
                    }
                    throw null;
                } catch (Throwable th4) {
                    Throwable cause = th4.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th4;
                }
                i5 = i;
            }
        } catch (Exception unused3) {
            i3 = ~(i & 2);
            i4 = i | 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r7, int r8, short r9) {
        /*
            int r8 = r8 + 3
            int r7 = r7 * 3
            int r7 = 115 - r7
            int r9 = r9 * 2
            int r9 = r9 + 1
            byte[] r0 = defpackage.Bitmap2JpegBytes.$$c
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            int r7 = r7 + 1
            r3 = r0[r7]
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Bitmap2JpegBytes.$$e(short, int, short):java.lang.String");
    }
}
