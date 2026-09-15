package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.presentation.compose.common.UtilKt$handlePickedFile$2;
import com.google.android.libraries.places.internal.zzrf;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes3.dex */
public final class ContextThemeWrapper {
    private static final byte[] $$a = {49, -45, -112, 57};
    private static final int $$b = 225;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static long TuitionPaymentFragmentbindingInflater1 = -6909645145416825517L;
    private static long b = 7372497301845353912L;

    public static final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(File file, String str, Function1<? super String, Unit> function1, Continuation<? super File> continuation) {
        int i = 2 % 2;
        Object objTuitionPaymentFragmentbindingInflater1 = BuildersKt.TuitionPaymentFragmentbindingInflater1(Dispatchers.getIO(), new UtilKt$handlePickedFile$2(str, file, function1, null), continuation);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return objTuitionPaymentFragmentbindingInflater1;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 119;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $10 + 47;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 64838), 1355 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 38 - TextUtils.getCapsMode("", 0, 0), 894276454, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getPressedStateDuration() >> 16)), 468 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 41;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 19472), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2624, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() | (b % 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - View.MeasureSpec.makeMeasureSpec(0, 0)), 481 - TextUtils.indexOf("", "", 0), 38 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19520 - AndroidCharacter.getMirror('0')), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2623, 13 - TextUtils.indexOf("", ""), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (b ^ 9053247990562531611L);
                    try {
                        Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 481 - TextUtils.getTrimmedLength(""), 37 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
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
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - Color.red(0)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 481, View.resolveSizeAndState(0, 0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
        int i6 = $11 + 43;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r0 = 3 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r1 = android.graphics.BitmapFactory.decodeFile(r6.getAbsolutePath());
        r3 = new java.io.File(r6.getParent(), "compressed_".concat(java.lang.String.valueOf(r6.getName())));
        r6 = defpackage.ContextThemeWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        defpackage.ContextThemeWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r6 % 128;
        r6 = r6 % 2;
        r6 = 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        r0 = new java.io.ByteArrayOutputStream();
        r1.compress(android.graphics.Bitmap.CompressFormat.JPEG, r6, r0);
        r2 = r0.toByteArray().length;
        r6 = r6 - 5;
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
    
        if (r2 <= 2097152) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        if (r6 > 10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        r0 = new java.io.FileOutputStream(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        r1.compress(android.graphics.Bitmap.CompressFormat.JPEG, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        kotlin.io.CloseableKt.closeFinally(r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        kotlin.io.CloseableKt.closeFinally(r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r6.length() <= android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r6.length() <= android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r1 = defpackage.ContextThemeWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        defpackage.ContextThemeWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.File b(java.io.File r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.ContextThemeWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r1 = r1 + 125
            int r2 = r1 % 128
            defpackage.ContextThemeWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            r2 = 2097152(0x200000, double:1.036131E-317)
            java.lang.String r4 = ""
            if (r1 != 0) goto L23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            long r4 = r6.length()
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r2 = 13
            int r2 = r2 / 0
            if (r1 > 0) goto L3d
            goto L2e
        L23:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            long r4 = r6.length()
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L3d
        L2e:
            int r1 = defpackage.ContextThemeWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r1 = r1 + 113
            int r2 = r1 % 128
            defpackage.ContextThemeWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L3c
            r0 = 3
            int r0 = r0 / 0
        L3c:
            return r6
        L3d:
            java.lang.String r1 = r6.getAbsolutePath()
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r1)
            java.lang.String r2 = r6.getParent()
            java.lang.String r6 = r6.getName()
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "compressed_"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r4.concat(r6)
            r3.<init>(r2, r6)
            int r6 = defpackage.ContextThemeWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r6 = r6 + 97
            int r2 = r6 % 128
            defpackage.ContextThemeWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r6 = r6 % r0
            r6 = 90
        L67:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
            r4 = r0
            java.io.OutputStream r4 = (java.io.OutputStream) r4
            r1.compress(r2, r6, r4)
            byte[] r2 = r0.toByteArray()
            int r2 = r2.length
            int r6 = r6 + (-5)
            r0.close()
            r0 = 2097152(0x200000, float:2.938736E-39)
            if (r2 <= r0) goto L86
            r0 = 10
            if (r6 > r0) goto L67
        L86:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r3)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r2 = r0
            java.io.FileOutputStream r2 = (java.io.FileOutputStream) r2     // Catch: java.lang.Throwable -> L9c
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L9c
            java.io.OutputStream r2 = (java.io.OutputStream) r2     // Catch: java.lang.Throwable -> L9c
            r1.compress(r4, r6, r2)     // Catch: java.lang.Throwable -> L9c
            r6 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r6)
            return r3
        L9c:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ContextThemeWrapper.b(java.io.File):java.io.File");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static Object[] b(Context context, int i, int i2) {
        char[] cArr;
        Class<?> cls;
        char[] cArr2;
        Object obj;
        int keyRepeatDelay;
        int i3;
        int iB;
        int i4;
        Method method;
        int i5;
        char[] cArr3;
        int i6;
        int iB2;
        int doubleTapTimeout;
        Class<?> cls2;
        char[] cArr4;
        int i7;
        int iB3;
        int i8;
        int i9 = i2;
        int i10 = 2 % 2;
        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
        ?? r4 = i11 % 2;
        if (context != null) {
            try {
                try {
                    Object[] objArr = new Object[1];
                    a(new char[]{63444, 63383, 49360, 44971, 32038, 7709, 41841, 21443, 19310, 60605, 58986, 5121, 36373, 10345, 9492, 55582, 49613, 25859, 27061, 39521, 1192, 41498, 44193, 24243, 18334, 57325, 62426, 58289, 39749, 7321, 13928, 42185, 56869, 22916, 30019}, 1 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
                    try {
                        Object[] objArr2 = {(String) objArr[0]};
                        char[] cArr5 = {3273, 24363, 43783, 63353, 17279, 44800, 64422, 18329, 37768, 65511, 19403, 38857, 57915, 19983, 39475, 58981, 12870, 40622, 60073, 14022, 33519, 61067, 14997, 34172, 53589, 15674, 35132, 54528, 8687, 36246, 55711, 9725, 29165, 56777, 10296, 29704, 49158, 11362};
                        int i12 = -View.resolveSize(0, 0);
                        int iB4 = zzrf.b();
                        int i13 = i12 * (-1965);
                        int i14 = ((((i13 | 21137304) << 1) - (i13 ^ 21137304)) - (~((i12 | (-21482)) * 983))) - 1;
                        int i15 = ~i12;
                        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i17 = ((i16 | 81) << 1) - (i16 ^ 81);
                        int i18 = i17 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
                        int i19 = i17 % 2;
                        int i20 = ~iB4;
                        int i21 = ~(((-21482) ^ i20) | ((-21482) & i20));
                        int i22 = (-983) * ((i15 ^ i21) | (i15 & i21));
                        int i23 = (i14 ^ i22) + ((i14 & i22) << 1);
                        int i24 = ~i12;
                        int i25 = ~((i20 & i24) | (i24 ^ i20));
                        int i26 = (i18 ^ 99) + ((i18 & 99) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                        if (i26 % 2 != 0) {
                            int i27 = ~(i24 | 21481);
                            int i28 = i23 >>> (983 % ((i27 & i25) | (i25 ^ i27)));
                            Object[] objArr3 = new Object[1];
                            c(cArr5, i28, objArr3);
                            Class<?> cls3 = Class.forName((String) objArr3[0]);
                            Class<?>[] clsArr = new Class[0];
                            clsArr[1] = String.class;
                            Object objNewInstance = cls3.getDeclaredConstructor(clsArr).newInstance(objArr2);
                            cArr = new char[31];
                            r4 = objNewInstance;
                        } else {
                            int i29 = ~((i24 & 21481) | (i24 ^ 21481));
                            int i30 = ((i29 & i25) | (i25 ^ i29)) * 983;
                            int i31 = (i23 ^ i30) + ((i30 & i23) << 1);
                            Object[] objArr4 = new Object[1];
                            c(cArr5, i31, objArr4);
                            Object objNewInstance2 = Class.forName((String) objArr4[0]).getDeclaredConstructor(String.class).newInstance(objArr2);
                            cArr = new char[31];
                            r4 = objNewInstance2;
                        }
                        // fill-array-data instruction
                        cArr[0] = 3296;
                        cArr[1] = 63553;
                        cArr[2] = 58696;
                        cArr[3] = 53869;
                        cArr[4] = 57331;
                        cArr[5] = 50359;
                        cArr[6] = 45476;
                        cArr[7] = 48891;
                        cArr[8] = 43573;
                        cArr[9] = 38672;
                        cArr[10] = 40039;
                        cArr[11] = 35161;
                        cArr[12] = 30398;
                        cArr[13] = 25492;
                        cArr[14] = 26813;
                        cArr[15] = 22001;
                        cArr[16] = 16669;
                        cArr[17] = 20049;
                        cArr[18] = 15180;
                        cArr[19] = 8256;
                        cArr[20] = 11691;
                        cArr[21] = 6810;
                        cArr[22] = 2022;
                        cArr[23] = 3267;
                        cArr[24] = 63535;
                        cArr[25] = 58692;
                        cArr[26] = 53825;
                        cArr[27] = 57155;
                        cArr[28] = 50341;
                        cArr[29] = 45461;
                        cArr[30] = 48870;
                        int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i33 = ((i32 | 59) << 1) - (i32 ^ 59);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i33 % 128;
                        int i34 = i33 % 2;
                        int iArgb = Color.argb(0, 0, 0, 0);
                        int iB5 = zzrf.b();
                        int i35 = iArgb * 471;
                        int i36 = ((i35 | 29525577) << 1) - (i35 ^ 29525577);
                        int i37 = -(-(((iArgb ^ 62687) | (iArgb & 62687)) * (-470)));
                        int i38 = (i36 & i37) + (i37 | i36);
                        int i39 = ~iArgb;
                        int i40 = ~((i39 ^ (-62688)) | (i39 & (-62688)));
                        int i41 = ~(((-62688) ^ iB5) | ((-62688) & iB5));
                        int i42 = (i40 ^ i41) | (i41 & i40);
                        int i43 = ~iB5;
                        int i44 = (i43 ^ iArgb) | (i43 & iArgb);
                        int i45 = ~((i44 ^ 62687) | (i44 & 62687));
                        int i46 = ((i42 ^ i45) | (i42 & i45)) * (-470);
                        int i47 = (i38 ^ i46) + ((i38 & i46) << 1);
                        int i48 = ((-62688) ^ iArgb) | ((-62688) & iArgb);
                        int i49 = ~((i48 & iB5) | (i48 ^ iB5));
                        int i50 = (iArgb & i43) | (i43 ^ iArgb);
                        int i51 = ~((i50 & 62687) | (i50 ^ 62687));
                        int i52 = i47 + (((i49 & i51) | (i49 ^ i51)) * 470);
                        Object[] objArr5 = new Object[1];
                        c(cArr, i52, objArr5);
                        try {
                            Object[] objArr6 = {(String) objArr5[0]};
                            Object[] objArr7 = new Object[1];
                            c(new char[]{3273, 24363, 43783, 63353, 17279, 44800, 64422, 18329, 37768, 65511, 19403, 38857, 57915, 19983, 39475, 58981, 12870, 40622, 60073, 14022, 33519, 61067, 14997, 34172, 53589, 15674, 35132, 54528, 8687, 36246, 55711, 9725, 29165, 56777, 10296, 29704, 49158, 11362}, 21481 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), objArr7);
                            Object objNewInstance3 = Class.forName((String) objArr7[0]).getDeclaredConstructor(String.class).newInstance(objArr6);
                            try {
                                Object[] objArr8 = new Object[1];
                                a(new char[]{12841, 12872, 43746, 50617, 28679, 49742, 44553, 36771, 36498, 34434, 60253, 51219, 19426, 16976, 10363, 1405, 1072, 3901, 25749, 18043, 49466, 51208, 41427, 33493, 33384, 46531, 65277}, 0 - (~(-KeyEvent.getDeadChar(0, 0))), objArr8);
                                Class<?> cls4 = Class.forName((String) objArr8[0]);
                                Object[] objArr9 = new Object[1];
                                c(new char[]{3268, 63101, 63905, 64706, 58926, 59751, 60586, 55263, 55580, 56405, 51104, 51915, 52233, 47037, 47870, 48179, 42849}, 64188 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr9);
                                Object objInvoke = cls4.getMethod((String) objArr9[0], null).invoke(context, null);
                                int i53 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i54 = (i53 ^ 95) + ((i53 & 95) << 1);
                                int i55 = i54 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i55;
                                int i56 = i54 % 2;
                                int i57 = (i55 ^ 39) + ((i55 & 39) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i57 % 128;
                                try {
                                    if (i57 % 2 != 0) {
                                        Object[] objArr10 = new Object[1];
                                        a(new char[]{12841, 12872, 43746, 50617, 28679, 49742, 44553, 36771, 36498, 34434, 60253, 51219, 19426, 16976, 10363, 1405, 1072, 3901, 25749, 18043, 49466, 51208, 41427, 33493, 33384, 46531, 65277}, (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1)), objArr10);
                                        cls = Class.forName((String) objArr10[0]);
                                        cArr2 = new char[]{3268, 34359, 6453, 44064, 9990, 47733, 19822, 49237, 23372, 61119, 24967, 62617, 36738, 763};
                                    } else {
                                        Object[] objArr11 = new Object[1];
                                        a(new char[]{12841, 12872, 43746, 50617, 28679, 49742, 44553, 36771, 36498, 34434, 60253, 51219, 19426, 16976, 10363, 1405, 1072, 3901, 25749, 18043, 49466, 51208, 41427, 33493, 33384, 46531, 65277}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr11);
                                        cls = Class.forName((String) objArr11[0]);
                                        cArr2 = new char[]{3268, 34359, 6453, 44064, 9990, 47733, 19822, 49237, 23372, 61119, 24967, 62617, 36738, 763};
                                    }
                                    int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                                    int iB6 = zzrf.b();
                                    int i58 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i59 = (i58 & 35) + (i58 | 35);
                                    int i60 = i59 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i60;
                                    int i61 = i59 % 2;
                                    int i62 = (TypedValues.PositionType.TYPE_PERCENT_WIDTH * pressedStateDuration) + 17891207;
                                    int i63 = (pressedStateDuration ^ 35569) | (pressedStateDuration & 35569);
                                    int i64 = (i60 & 119) + (i60 | 119);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i64 % 128;
                                    int i65 = i64 % 2;
                                    int i66 = -(-((-502) * i63));
                                    int i67 = ((i62 | i66) << 1) - (i62 ^ i66);
                                    int i68 = ~pressedStateDuration;
                                    int i69 = ~((i68 ^ (-35570)) | ((-35570) & i68));
                                    int i70 = ~pressedStateDuration;
                                    int i71 = ~iB6;
                                    int i72 = ~((i70 ^ i71) | (i70 & i71));
                                    int i73 = (i69 ^ i72) | (i72 & i69);
                                    int i74 = ~((i63 ^ iB6) | (i63 & iB6));
                                    int i75 = i67 + (((i73 ^ i74) | (i73 & i74)) * (-502));
                                    int i76 = (i68 ^ i71) | (i71 & i68);
                                    int i77 = i60 + 9;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i77 % 128;
                                    if (i77 % 2 != 0) {
                                        int i78 = ~(i76 | 35569);
                                        int i79 = pressedStateDuration | 35569;
                                        int i80 = ~((iB6 & i79) | (i79 ^ iB6));
                                        Object[] objArr12 = new Object[1];
                                        c(cArr2, i75 >>> (((i80 & i78) | (i78 ^ i80)) * TypedValues.PositionType.TYPE_DRAWPATH), objArr12);
                                        obj = objArr12[0];
                                    } else {
                                        int i81 = ~((i76 & 35569) | (i76 ^ 35569));
                                        int i82 = pressedStateDuration | 35569;
                                        int i83 = ~((iB6 & i82) | (i82 ^ iB6));
                                        int i84 = (i75 - (~(((i83 & i81) | (i81 ^ i83)) * TypedValues.PositionType.TYPE_DRAWPATH))) - 1;
                                        Object[] objArr13 = new Object[1];
                                        c(cArr2, i84, objArr13);
                                        obj = objArr13[0];
                                    }
                                    try {
                                        Object[] objArr14 = {cls.getMethod((String) obj, null).invoke(context, null), 64};
                                        Object[] objArr15 = new Object[1];
                                        a(new char[]{36948, 36917, 4279, 32748, 44459, 5278, 29605, 22899, 11503, 15575, 14065, 7875, 59807, 63493, 62935, 54189, 42573, 46440, 47417, 37035, 25460, 29279, 31807, 21537, 8209, 3981, 9038, 59708, 64715, 52479, 59012, 44648, 47606, 35287, 42490, 25488, 30342}, 0 - (~(-(-(Process.myTid() >> 22)))), objArr15);
                                        Class<?> cls5 = Class.forName((String) objArr15[0]);
                                        Object[] objArr16 = new Object[1];
                                        a(new char[]{39069, 39162, 10484, 18340, 50018, 15392, 7548, 29167, 9256, 1182, 22583, 13874, 57682, 49228, 39737, 64265, 44679, 36138}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr16);
                                        Object objInvoke2 = cls5.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                        char[] cArr6 = {3266, 11618, 20377, 27100, 35440, 42145, 50909, 59204, 440, 9195, 23579, 32338, 39154, 47406, 56133, 62924, 5667, 12369, 21187, 29454, 44398, 53147, 59842, 2683, 9388, 18129, 26412, 33208, 41953, 56351};
                                        int i85 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i85 % 128;
                                        if (i85 % 2 == 0) {
                                            int keyRepeatDelay2 = ViewConfiguration.getKeyRepeatDelay();
                                            keyRepeatDelay = (keyRepeatDelay2 & 68) + (keyRepeatDelay2 | 68);
                                            i3 = 31824;
                                        } else {
                                            keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                            i3 = 8623;
                                        }
                                        int i86 = -(-(keyRepeatDelay * 306));
                                        int i87 = (610 & i86) + (i86 | TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) + (i3 * 306);
                                        int i88 = ~((keyRepeatDelay ^ i3) | (keyRepeatDelay & i3));
                                        int i89 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i89 % 128;
                                        int i90 = i89 % 2;
                                        int i91 = ~((keyRepeatDelay ^ i) | (keyRepeatDelay & i));
                                        int i92 = (i87 - (~(305 * ((i88 & i91) | (i88 ^ i91))))) - 1;
                                        int i93 = ~i3;
                                        int i94 = ~i;
                                        int i95 = (i92 - (~((i93 | (~((keyRepeatDelay & i94) | (i94 ^ keyRepeatDelay)))) * 305))) - 1;
                                        Object[] objArr17 = new Object[1];
                                        c(cArr6, i95, objArr17);
                                        Class<?> cls6 = Class.forName((String) objArr17[0]);
                                        Object[] objArr18 = new Object[1];
                                        c(new char[]{3280, 24943, 55182, 17442, 47702, 10478, 40200, 62290, 25070, 54813}, 28068 - TextUtils.indexOf((CharSequence) "", '0'), objArr18);
                                        Object[] objArr19 = (Object[]) cls6.getField((String) objArr18[0]).get(objInvoke2);
                                        int length = objArr19.length;
                                        int i96 = 0;
                                        r4 = r4;
                                        while (true) {
                                            if (i96 < length) {
                                                Object obj2 = objArr19[i96];
                                                Object[] objArr20 = new Object[1];
                                                c(new char[]{3323, 64184, 57596, 60940, 54350}, 63027 - (~(-TextUtils.lastIndexOf("", '0'))), objArr20);
                                                try {
                                                    Object[] objArr21 = {(String) objArr20[0]};
                                                    char[] cArr7 = {3273, 6235, 9703, 12553, 24297, 27181, 30544, 40175, 43038, 46512, 49456, 60996, 64502, 1864, 11422, 14385, 17729, 21246, 32335, 35771, 38706, 48220, 51697, 54645, 58013, 3643, 6986, 8417, 19563, 22931, 25867, 29253, 40928, 43886, 45214, 56378, 59742};
                                                    int tapTimeout = ViewConfiguration.getTapTimeout();
                                                    int i97 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i97 % 128;
                                                    int i98 = tapTimeout >> 16;
                                                    if (i97 % 2 != 0) {
                                                        iB = zzrf.b();
                                                        i4 = 495 % i98;
                                                    } else {
                                                        iB = zzrf.b();
                                                        i4 = i98 * 495;
                                                    }
                                                    int i99 = i4 - 2599589;
                                                    int i100 = (i98 | (-5274)) * (-988);
                                                    int i101 = (i99 ^ i100) + ((i99 & i100) << 1);
                                                    int i102 = ~i98;
                                                    Object[] objArr22 = objArr19;
                                                    int i103 = ((~iB) | i102 | 5273) * 494;
                                                    int i104 = ((i101 | i103) << 1) - (i103 ^ i101);
                                                    int i105 = ~((i102 ^ (-5274)) | (i102 & (-5274)));
                                                    int i106 = ~iB;
                                                    int i107 = ~((i106 & 5273) | (i106 ^ 5273));
                                                    int i108 = (i105 & i107) | (i105 ^ i107);
                                                    int i109 = ~((i98 & 5273) | (i98 ^ 5273));
                                                    int i110 = ((i108 & i109) | (i108 ^ i109)) * 494;
                                                    int i111 = ((i104 | i110) << 1) - (i110 ^ i104);
                                                    Object[] objArr23 = new Object[1];
                                                    c(cArr7, i111, objArr23);
                                                    Class<?> cls7 = Class.forName((String) objArr23[0]);
                                                    char[] cArr8 = {3268, 52317, 36321, 19771, 3745, 53207, 36725, 18687, 2069, 51635, 35528};
                                                    int scrollBarSize = ViewConfiguration.getScrollBarSize();
                                                    int i112 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                    int i113 = (i112 ^ 95) + ((i112 & 95) << 1);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i113 % 128;
                                                    if (i113 % 2 != 0) {
                                                        Object[] objArr24 = new Object[1];
                                                        c(cArr8, 49307 % (scrollBarSize / 8), objArr24);
                                                        method = cls7.getMethod((String) objArr24[0], String.class);
                                                    } else {
                                                        int i114 = -(scrollBarSize >> 8);
                                                        int i115 = ((i114 | 49307) << 1) - (i114 ^ 49307);
                                                        Object[] objArr25 = new Object[1];
                                                        c(cArr8, i115, objArr25);
                                                        method = cls7.getMethod((String) objArr25[0], String.class);
                                                    }
                                                    Object objInvoke3 = method.invoke(null, objArr21);
                                                    try {
                                                        char[] cArr9 = {3266, 25650, 56633, 13868, 44848, '1', 31037, 53876, 19256, 48187, 5435, 36386, 59186, 22590, 45349, 10876, 33571, 62497, 28003, 50717, 16166, 36911, 2343, 25131, 56127, 19505, 42295, 7715};
                                                        int i116 = -ExpandableListView.getPackedPositionGroup(0L);
                                                        int iB7 = zzrf.b();
                                                        int i117 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                        int i118 = (i117 & 81) + (i117 | 81);
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i118 % 128;
                                                        int i119 = i118 % 2 == 0 ? (934 >>> i116) / (-932) : (i116 * 934) - 25051228;
                                                        int i120 = (i117 ^ 11) + ((i117 & 11) << 1);
                                                        int i121 = i120 % 128;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i121;
                                                        int i122 = i120 % 2;
                                                        int i123 = ~i116;
                                                        int i124 = length;
                                                        int i125 = ~iB7;
                                                        int i126 = ~((i123 ^ i125) | (i125 & i123));
                                                        int i127 = i119 + ((-933) * (((-26880) ^ i126) | (i126 & (-26880))));
                                                        int i128 = ~iB7;
                                                        int i129 = ~((i128 & (-26880)) | ((-26880) ^ i128));
                                                        int i130 = ((i121 | 51) << 1) - (i121 ^ 51);
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i130 % 128;
                                                        if (i130 % 2 != 0) {
                                                            int i131 = ~(((-26880) & i116) | ((-26880) ^ i116));
                                                            int i132 = -(933 << ((i129 & i131) | (i129 ^ i131)));
                                                            i5 = (i127 & i132) + (i132 | i127);
                                                        } else {
                                                            int i133 = ~(((-26880) & i116) | ((-26880) ^ i116));
                                                            int i134 = ((i129 & i133) | (i129 ^ i133)) * 933;
                                                            i5 = ((i127 | i134) << 1) - (i134 ^ i127);
                                                        }
                                                        int i135 = -(-(933 * (~((i116 ^ 26879) | (i116 & 26879)))));
                                                        int i136 = (i5 & i135) + (i135 | i5);
                                                        Object[] objArr26 = new Object[1];
                                                        c(cArr9, i136, objArr26);
                                                        Class<?> cls8 = Class.forName((String) objArr26[0]);
                                                        char[] cArr10 = {41299, 41255, 21588, 15118, 55776, 53761, 1992, 40935, 7667, 30776, 17055, 55296, 55433, 48360, 33163};
                                                        int i137 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                        int i138 = (i137 ^ 105) + ((i137 & 105) << 1);
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i138 % 128;
                                                        int i139 = i138 % 2;
                                                        Object[] objArr27 = new Object[1];
                                                        a(cArr10, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr27);
                                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) cls8.getMethod((String) objArr27[0], null).invoke(obj2, null));
                                                        int i140 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                        int i141 = ((i140 | 125) << 1) - (i140 ^ 125);
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i141 % 128;
                                                        int i142 = i141 % 2;
                                                        try {
                                                            Object[] objArr28 = {byteArrayInputStream};
                                                            Object[] objArr29 = new Object[1];
                                                            c(new char[]{3273, 6235, 9703, 12553, 24297, 27181, 30544, 40175, 43038, 46512, 49456, 60996, 64502, 1864, 11422, 14385, 17729, 21246, 32335, 35771, 38706, 48220, 51697, 54645, 58013, 3643, 6986, 8417, 19563, 22931, 25867, 29253, 40928, 43886, 45214, 56378, 59742}, Color.rgb(0, 0, 0) + 16782489, objArr29);
                                                            Class<?> cls9 = Class.forName((String) objArr29[0]);
                                                            char[] cArr11 = {3268, 16903, 37199, 57477, 14293, 34055, 54353, 11137, 31464, 51215, 8027, 28316, 48582, 62216, 16964, 37263, 57554, 13830, 34132};
                                                            int tapTimeout2 = ViewConfiguration.getTapTimeout() >> 16;
                                                            int iB8 = zzrf.b();
                                                            int i143 = (tapTimeout2 * 398) - 7983756;
                                                            int i144 = ~tapTimeout2;
                                                            int i145 = ~iB8;
                                                            int i146 = (i144 ^ 20161) | (i144 & 20161);
                                                            int i147 = (~i146) | (~((i144 ^ i145) | (i144 & i145)));
                                                            int i148 = ~(i145 | 20161);
                                                            int i149 = ((i147 & i148) | (i147 ^ i148)) * (-397);
                                                            int i150 = (i143 & i149) + (i143 | i149);
                                                            int i151 = (~i146) * (-397);
                                                            int i152 = (i150 & i151) + (i151 | i150);
                                                            int i153 = ~tapTimeout2;
                                                            int i154 = (~((i153 & 20161) | (i153 ^ 20161))) | iB8;
                                                            int i155 = ~((tapTimeout2 & (-20162)) | ((-20162) ^ tapTimeout2));
                                                            int i156 = i152 + (((i154 & i155) | (i154 ^ i155)) * 397);
                                                            try {
                                                                Object[] objArr30 = new Object[1];
                                                                c(cArr11, i156, objArr30);
                                                                Object objInvoke4 = cls9.getMethod((String) objArr30[0], InputStream.class).invoke(objInvoke3, objArr28);
                                                                try {
                                                                    int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                                                                    int i157 = (packedPositionType ^ 1) + ((packedPositionType & 1) << 1);
                                                                    Object[] objArr31 = new Object[1];
                                                                    a(new char[]{34228, 34270, 46000, 56548, 4711, 7838, 52347, 21344, 14670, 40906, 35132, 5262, 64617, 23327, 18972, 55725, 46001, 5679, 1762, 39648, 30358, 53569, 50163, 24105, 13733, 44249, 40144, 58142, 59689, 28655, 22897, 42080, 44062, 10968, 6706, 27028, 25440, 58880}, i157, objArr31);
                                                                    Class<?> cls10 = Class.forName((String) objArr31[0]);
                                                                    int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                                    int i158 = ((minimumFlingVelocity | 30403) << 1) - (minimumFlingVelocity ^ 30403);
                                                                    Object[] objArr32 = new Object[1];
                                                                    c(new char[]{3268, 31237, 57681, 26809, 55258, 23822, 50267, 13203, 47832, 8204, 44901, 5879, 40375, 2932, 29273, 63932, 24826, 60990, 21878, 56499, 19439, 45373, 14349}, i158, objArr32);
                                                                    String str = (String) objArr32[0];
                                                                    int i159 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                                    int i160 = (i159 & 39) + (i159 | 39);
                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i160 % 128;
                                                                    if (i160 % 2 != 0) {
                                                                        try {
                                                                            if (!r4.equals(cls10.getMethod(str, null).invoke(objInvoke4, null))) {
                                                                                int i161 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                                                int i162 = ((i161 | 79) << 1) - (i161 ^ 79);
                                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i162 % 128;
                                                                                if (i162 % 2 != 0) {
                                                                                    try {
                                                                                        cArr3 = new char[]{34228, 34270, 46000, 56548, 4711, 7838, 52347, 21344, 14670, 40906, 35132, 5262, 64617, 23327, 18972, 55725, 46001, 5679, 1762, 39648, 30358, 53569, 50163, 24105, 13733, 44249, 40144, 58142, 59689, 28655, 22897, 42080, 44062, 10968, 6706, 27028, 25440, 58880};
                                                                                        int doubleTapTimeout2 = ViewConfiguration.getDoubleTapTimeout() + 103;
                                                                                        i6 = doubleTapTimeout2 * (-419);
                                                                                        iB2 = zzrf.b();
                                                                                        doubleTapTimeout = doubleTapTimeout2;
                                                                                    } catch (Throwable th) {
                                                                                        Throwable cause = th.getCause();
                                                                                        if (cause != null) {
                                                                                            throw cause;
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                } else {
                                                                                    cArr3 = new char[]{34228, 34270, 46000, 56548, 4711, 7838, 52347, 21344, 14670, 40906, 35132, 5262, 64617, 23327, 18972, 55725, 46001, 5679, 1762, 39648, 30358, 53569, 50163, 24105, 13733, 44249, 40144, 58142, 59689, 28655, 22897, 42080, 44062, 10968, 6706, 27028, 25440, 58880};
                                                                                    doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                                                                    iB2 = zzrf.b();
                                                                                    i6 = doubleTapTimeout * (-419);
                                                                                }
                                                                                int i163 = i6 + 421;
                                                                                int i164 = -(-((~(1 | iB2)) * TypedValues.CycleType.TYPE_EASING));
                                                                                int i165 = ~doubleTapTimeout;
                                                                                int i166 = (i163 ^ i164) + ((i163 & i164) << 1) + ((1 | i165) * (-420));
                                                                                int i167 = ~((i165 & (-2)) | (i165 ^ (-2)));
                                                                                int i168 = ~iB2;
                                                                                int i169 = ~((i168 & 1) | (i168 ^ 1));
                                                                                int i170 = (i166 - (~(-(-(((i167 & i169) | (i167 ^ i169)) * TypedValues.CycleType.TYPE_EASING))))) - 1;
                                                                                int i171 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                                                int i172 = (i171 ^ 59) + ((i171 & 59) << 1);
                                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i172 % 128;
                                                                                if (i172 % 2 != 0) {
                                                                                    Object[] objArr33 = new Object[1];
                                                                                    a(cArr3, i170, objArr33);
                                                                                    cls2 = Class.forName((String) objArr33[0]);
                                                                                    cArr4 = new char[]{3268, 31237, 57681, 26809, 55258, 23822, 50267, 13203, 47832, 8204, 44901, 5879, 40375, 2932, 29273, 63932, 24826, 60990, 21878, 56499, 19439, 45373, 14349};
                                                                                    i7 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                                    i8 = 31679;
                                                                                    iB3 = zzrf.b();
                                                                                } else {
                                                                                    Object[] objArr34 = new Object[1];
                                                                                    a(cArr3, i170, objArr34);
                                                                                    cls2 = Class.forName((String) objArr34[0]);
                                                                                    cArr4 = new char[]{3268, 31237, 57681, 26809, 55258, 23822, 50267, 13203, 47832, 8204, 44901, 5879, 40375, 2932, 29273, 63932, 24826, 60990, 21878, 56499, 19439, 45373, 14349};
                                                                                    i7 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                                    iB3 = zzrf.b();
                                                                                    i8 = 30403;
                                                                                }
                                                                                int i173 = (471 * i7) + (i8 * 471);
                                                                                int i174 = ((i7 ^ i8) | (i7 & i8)) * (-470);
                                                                                int i175 = ((i173 | i174) << 1) - (i174 ^ i173);
                                                                                int i176 = ~i7;
                                                                                int i177 = ~i8;
                                                                                int i178 = ~((i176 & i177) | (i176 ^ i177));
                                                                                int i179 = ~i8;
                                                                                int i180 = ~((i179 ^ iB3) | (i179 & iB3));
                                                                                int i181 = (i178 ^ i180) | (i178 & i180);
                                                                                int i182 = ~iB3;
                                                                                int i183 = (i182 ^ i7) | (i182 & i7);
                                                                                int i184 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                                                int i185 = i184 + 61;
                                                                                ?? r25 = r4;
                                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i185 % 128;
                                                                                int i186 = i185 % 2;
                                                                                int i187 = ~((i183 ^ i8) | (i183 & i8));
                                                                                int i188 = i175 + (((i181 & i187) | (i181 ^ i187)) * (-470));
                                                                                int i189 = ~((i179 ^ i7) | (i179 & i7) | iB3);
                                                                                int i190 = ~iB3;
                                                                                int i191 = (i190 & i7) | (i190 ^ i7);
                                                                                int i192 = (i184 ^ 45) + ((i184 & 45) << 1);
                                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i192 % 128;
                                                                                int i193 = i192 % 2;
                                                                                int i194 = ~((i191 & i8) | (i191 ^ i8));
                                                                                int i195 = -(-(470 * ((i189 & i194) | (i189 ^ i194))));
                                                                                int i196 = (i188 ^ i195) + ((i195 & i188) << 1);
                                                                                Object[] objArr35 = new Object[1];
                                                                                c(cArr4, i196, objArr35);
                                                                                if (!objNewInstance3.equals(cls2.getMethod((String) objArr35[0], null).invoke(objInvoke4, null))) {
                                                                                    int i197 = ((i96 | 45) << 1) - (i96 ^ 45);
                                                                                    i96 = (i197 & (-44)) + (i197 | (-44));
                                                                                    objArr19 = objArr22;
                                                                                    i9 = i2;
                                                                                    length = i124;
                                                                                    r4 = r25;
                                                                                }
                                                                            }
                                                                            int[] iArr = new int[1];
                                                                            Object[] objArr36 = {new int[]{i}, iArr, new int[]{(~(i & 1)) & (i | 1)}, null};
                                                                            int i198 = (-1760911308) + (((~(241711172 | i94)) | (-519011934) | (~(i94 | 282021401))) * 464) + (((-277300762) | i) * (-464)) + (((~(i | 282021401)) | (-519011934)) * 464);
                                                                            int i199 = (i198 & 16) + (i198 | 16);
                                                                            int i200 = (i199 * 319) + (i2 * (-317));
                                                                            int i201 = ~i2;
                                                                            int i202 = ~i199;
                                                                            int i203 = -(-(((~((i202 & i) | (i202 ^ i))) | i201) * (-318)));
                                                                            int i204 = ((i200 | i203) << 1) - (i200 ^ i203);
                                                                            int i205 = ~((i201 ^ i) | (i201 & i));
                                                                            int i206 = ~i;
                                                                            int i207 = (i206 & i199) | (i206 ^ i199);
                                                                            int i208 = ~((i207 & i2) | (i207 ^ i2));
                                                                            int i209 = (i204 - (~(-(-(((i205 & i208) | (i205 ^ i208)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))))) - 1;
                                                                            int i210 = (i201 ^ i94) | (i201 & i94);
                                                                            int i211 = ~((i210 & i199) | (i210 ^ i199));
                                                                            int i212 = (i199 & i2) | (i199 ^ i2);
                                                                            int i213 = -(-(((~((i212 & i) | (i212 ^ i))) | i211) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                                                            int i214 = (i209 ^ i213) + ((i213 & i209) << 1);
                                                                            int i215 = (i214 << 13) ^ i214;
                                                                            int i216 = i215 ^ (i215 >>> 17);
                                                                            int i217 = i216 << 5;
                                                                            iArr[0] = ((~i216) & i217) | ((~i217) & i216);
                                                                            return objArr36;
                                                                        } catch (Throwable unused) {
                                                                            r4 = i2;
                                                                        }
                                                                    } else {
                                                                        try {
                                                                            r4.equals(cls10.getMethod(str, null).invoke(objInvoke4, null));
                                                                            throw null;
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                        }
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                }
                                                                Throwable cause2 = th.getCause();
                                                                if (cause2 != null) {
                                                                    throw cause2;
                                                                }
                                                                throw th;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                Throwable cause3 = th.getCause();
                                                                if (cause3 != null) {
                                                                    throw cause3;
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                        }
                                                    } catch (Throwable th6) {
                                                        Throwable cause4 = th6.getCause();
                                                        if (cause4 != null) {
                                                            throw cause4;
                                                        }
                                                        throw th6;
                                                    }
                                                } catch (Throwable th7) {
                                                    Throwable cause5 = th7.getCause();
                                                    if (cause5 != null) {
                                                        throw cause5;
                                                    }
                                                    throw th7;
                                                }
                                            } else {
                                                r4 = i9;
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        Throwable cause6 = th8.getCause();
                                        if (cause6 != null) {
                                            throw cause6;
                                        }
                                        throw th8;
                                    }
                                } catch (Throwable th9) {
                                    Throwable cause7 = th9.getCause();
                                    if (cause7 != null) {
                                        throw cause7;
                                    }
                                    throw th9;
                                }
                            } catch (Throwable th10) {
                                Throwable cause8 = th10.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th10;
                            }
                        } catch (Throwable th11) {
                            Throwable cause9 = th11.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th11;
                        }
                    } catch (Throwable th12) {
                        Throwable cause10 = th12.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th12;
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
            }
        } else {
            r4 = i9;
        }
        int[] iArr2 = new int[1];
        int i218 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i219 = ((i218 | 121) << 1) - (i218 ^ 121);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i219 % 128;
        int i220 = i219 % 2;
        Object[] objArr37 = {new int[]{i}, iArr2, new int[]{i}, null};
        int i221 = (-1302761969) + (((~(i | (-794813983))) | (-835124212)) * (-465)) + (((-794813983) | (~((-835124212) | i))) * 930) + (((-558293523) | i) * 465);
        int i222 = ~i221;
        int i223 = ~(i222 | ((-1) ^ i222));
        int i224 = ~i221;
        int i225 = ~((i224 & i) | (i224 ^ i));
        int i226 = (i223 & i225) | (i223 ^ i225);
        int i227 = ~i;
        int i228 = ~((i227 ^ i221) | (i227 & i221));
        int i229 = (i221 * (-885)) + (((i226 & i228) | (i226 ^ i228)) * 886);
        int i230 = ~i;
        int i231 = (~(i221 | i230)) * (-1772);
        int i232 = (i229 & i231) + (i229 | i231);
        int i233 = -(-((~i227) * 886));
        int i234 = (i232 ^ i233) + ((i233 & i232) << 1);
        int i235 = i234 * (-501);
        int i236 = r4 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
        int i237 = (i235 ^ i236) + ((i235 & i236) << 1);
        int i238 = ~r4;
        int i239 = ((~((i238 ^ i) | (i238 & i))) | (~((i234 ^ r4) | ((i234 & r4) == true ? 1 : 0)))) * (-502);
        int i240 = ((i237 | i239) << 1) - (i239 ^ i237);
        int i241 = (i238 & i230) | (i238 ^ i230);
        int i242 = -(-((~((i241 & i234) | (i241 ^ i234))) * (-502)));
        int i243 = (i240 ^ i242) + ((i242 & i240) << 1);
        int i244 = ~r4;
        int i245 = ~i234;
        int i246 = ((i218 | 1) << 1) - (i218 ^ 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i246 % 128;
        if (i246 % 2 != 0) {
            int i247 = i243 >>> (TypedValues.PositionType.TYPE_DRAWPATH << ((~((i & i245) | (i245 ^ i))) | i244));
            int i248 = (i247 ^ 22) + ((i247 & 22) << 1);
            int i249 = ((~i247) & i248) | ((~i248) & i247);
            int i250 = ((i249 | 58) << 1) - (i249 ^ 58);
            int i251 = ((~i249) & i250) | ((~i250) & i249);
            int i252 = ((i251 | (-4)) << 1) - (i251 ^ (-4));
            iArr2[0] = ((~i251) & i252) | ((~i252) & i251);
        } else {
            int i253 = ~((i & i245) | (i245 ^ i));
            int i254 = ((i253 & i244) | (i244 ^ i253)) * TypedValues.PositionType.TYPE_DRAWPATH;
            int i255 = (i243 ^ i254) + ((i254 & i243) << 1);
            int i256 = i255 << 13;
            int i257 = (i256 | i255) & (~(i255 & i256));
            int i258 = i257 >>> 17;
            int i259 = (i257 | i258) & (~(i257 & i258));
            iArr2[0] = i259 ^ (i259 << 5);
        }
        return objArr37;
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
    private static java.lang.String $$c(int r6, short r7, int r8) {
        /*
            byte[] r0 = defpackage.ContextThemeWrapper.$$a
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r8 = r8 * 3
            int r8 = 107 - r8
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
        L26:
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ContextThemeWrapper.$$c(int, short, int):java.lang.String");
    }
}
