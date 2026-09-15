package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import com.bpjstku.presentation.program.jkp.JkpMainActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Camera2CapturePipelineTorchTask implements Function0 {
    private static int $10 = 0;
    private static int $11 = 1;
    private /* synthetic */ JkpMainActivity TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$d = {87, 51, -85, 78, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 46;
    private static final byte[] $$a = {57, -56, 23, -36, -16, 15, 0, 11};
    private static final int $$b = 154;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 3906767565217414404L;

    public /* synthetic */ Camera2CapturePipelineTorchTask(JkpMainActivity jkpMainActivity) {
        this.TuitionPaymentFragmentbindingInflater1 = jkpMainActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 5
            byte[] r1 = defpackage.Camera2CapturePipelineTorchTask.$$a
            int r7 = r7 * 3
            int r7 = r7 + 98
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r0 = new byte[r0]
            int r6 = r6 + 4
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L30
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L30:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + 3
            r8 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Camera2CapturePipelineTorchTask.a(int, byte, short, java.lang.Object[]):void");
    }

    private static void b(short s, byte b, short s2, Object[] objArr) {
        int i = b + 4;
        byte[] bArr = $$d;
        int i2 = 103 - s;
        int i3 = s2 * 52;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = (i3 + i) - 11;
            i = i;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i + 1;
            i2 = (i2 + bArr[i6]) - 11;
            i = i6;
            i4 = i5;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        JkpMainActivity jkpMainActivity = this.TuitionPaymentFragmentbindingInflater1;
        if (i3 != 0) {
            return JkpMainActivity.b(jkpMainActivity);
        }
        JkpMainActivity.b(jkpMainActivity);
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 71;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 2625 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 13 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 39422), 481 - TextUtils.indexOf("", "", 0, 0), 37 - KeyEvent.getDeadChar(0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 1;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 482 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i8 = $11 + 15;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr2);
        int i10 = $11 + 31;
        $10 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0881 A[PHI: r0 r1
  0x0881: PHI (r0v26 int) = (r0v25 int), (r0v41 int) binds: [B:107:0x087f, B:104:0x0876] A[DONT_GENERATE, DONT_INLINE]
  0x0881: PHI (r1v57 int) = (r1v56 int), (r1v74 int) binds: [B:107:0x087f, B:104:0x0876] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x0884 A[PHI: r0 r1
  0x0884: PHI (r0v40 int) = (r0v25 int), (r0v41 int) binds: [B:107:0x087f, B:104:0x0876] A[DONT_GENERATE, DONT_INLINE]
  0x0884: PHI (r1v72 int) = (r1v56 int), (r1v74 int) binds: [B:107:0x087f, B:104:0x0876] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x08a1  */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(List list) throws Throwable {
        Method[] methodArr;
        Class<OkHttpClient.Builder> cls;
        Object obj;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String string;
        char[] cArr;
        int mode;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i7;
        int i8;
        Class<?> cls2;
        char[] cArr2;
        int i9;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i10;
        int i11;
        int i12;
        Method[] methodArr2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 2;
        int i18 = 2 % 2;
        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i20 = 1;
        int i21 = (i19 ^ 95) + ((i19 & 95) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
        int i22 = 0;
        if (i21 % 2 != 0) {
            methodArr = new Method[1];
            cls = OkHttpClient.Builder.class;
            byte b = $$a[6];
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            obj = objArr[0];
        } else {
            methodArr = new Method[1];
            cls = OkHttpClient.Builder.class;
            byte b3 = $$a[6];
            byte b4 = b3;
            Object[] objArr2 = new Object[1];
            a(b3, b4, b4, objArr2);
            obj = objArr2[0];
        }
        methodArr[0] = cls.getMethod((String) obj, new Class[0]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int i23 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2822;
            int iGreen = Color.green(0) + 22;
            byte[] bArr = $$d;
            byte b5 = bArr[54];
            byte b6 = bArr[5];
            Object[] objArr3 = new Object[1];
            b(b5, b6, (byte) (-b6), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i23, iGreen, 1814927978, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getTapTimeout() >> 16) + 2823, 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i24 = 0;
            while (i24 < length) {
                Method method = declaredMethods[i24];
                int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i26 = (i25 ^ 27) + ((i25 & 27) << i20);
                int i27 = i26 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27;
                int i28 = i26 % i17;
                int i29 = i27 + 79;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i29 % 128;
                if (i29 % i17 != 0) {
                    try {
                        cArr = new char[]{38005, 34267, 46883, 41105, 53925, 52298, 64928, 61426, 6480, 2812, 9247, 22125, 18373, 28946, 25468, 40151, 36411, 49092, 43464, 56133, 62607, 59134, 4190, 424};
                        mode = View.MeasureSpec.getMode(i22);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i30 = ~((mode ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (mode & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        i7 = 3628;
                        i8 = ((673 / mode) * 1048575) / (672 >> ((i30 ^ 3628) | (i30 & 3628)));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    cArr = new char[]{38005, 34267, 46883, 41105, 53925, 52298, 64928, 61426, 6480, 2812, 9247, 22125, 18373, 28946, 25468, 40151, 36411, 49092, 43464, 56133, 62607, 59134, 4190, 424};
                    mode = View.MeasureSpec.getMode(i22);
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i31 = mode * 673;
                    i7 = 4517;
                    i8 = (i31 ^ (-6066331)) + ((i31 & (-6066331)) << i20) + (((~(mode | iTuitionPaymentFragmentspecialinlinedviewModeldefault1)) | 4517) * 672);
                }
                int i32 = ~mode;
                int i33 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i34 = ~((i32 ^ i33) | (i32 & i33));
                int i35 = ~(i7 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i36 = (-672) * ((i34 ^ i35) | (i34 & i35));
                int i37 = (i8 ^ i36) + ((i8 & i36) << i20);
                int i38 = ~i7;
                int i39 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i40 = ~((i39 & i38) | (i38 ^ i39));
                int i41 = ~(i38 | mode);
                int i42 = ((i41 & i40) | (i40 ^ i41)) * 672;
                int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i43 % 128;
                if (i43 % i17 != 0) {
                    int i44 = i37 % i42;
                    Object[] objArr4 = new Object[i20];
                    c(cArr, i44, objArr4);
                    cls2 = Class.forName((String) objArr4[i22]);
                    cArr2 = new char[]{38008, 9007, 64193, 45485, 18724, 210, 57224, 38698, 11998, 58759, 48447, 29899};
                    i9 = -ExpandableListView.getPackedPositionGroup(1L);
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    i10 = (503 - i9) * ((-503) - (~(-((i9 ^ 46933) | (46933 & i9)))));
                } else {
                    int i45 = (i37 ^ i42) + ((i37 & i42) << i20);
                    Object[] objArr5 = new Object[i20];
                    c(cArr, i45, objArr5);
                    cls2 = Class.forName((String) objArr5[i22]);
                    cArr2 = new char[]{38008, 9007, 64193, 45485, 18724, 210, 57224, 38698, 11998, 58759, 48447, 29899};
                    i9 = -ExpandableListView.getPackedPositionGroup(0L);
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i46 = i9 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                    int i47 = ((i46 | 23607299) << 1) - (i46 ^ 23607299);
                    int i48 = -(-((46933 | i9) * (-502)));
                    i10 = (i47 | i48) + (i47 & i48);
                }
                int i49 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i49 % 128;
                if (i49 % i17 != 0) {
                    int i50 = ~i9;
                    int i51 = ~((i50 ^ (-46934)) | (i50 & (-46934)));
                    i12 = ~i9;
                    int i52 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i53 = (~((i12 ^ i52) | (i52 & i12))) | i51;
                    int i54 = (i9 ^ 46933) | (i9 & 46933);
                    int i55 = ~((i54 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i54 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    i11 = i10 >> ((-502) / ((i53 ^ i55) | (i53 & i55)));
                } else {
                    int i56 = ~i9;
                    int i57 = ~(((-46934) & i56) | (i56 ^ (-46934)));
                    int i58 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i59 = (~((i56 ^ i58) | (i56 & i58))) | i57;
                    int i60 = (i9 ^ 46933) | (i9 & 46933);
                    int i61 = ~((i60 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i60 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    i11 = (i10 - (~(-(-(((i59 & i61) | (i59 ^ i61)) * (-502)))))) - 1;
                    i12 = ~i9;
                }
                int i62 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i63 = (i12 & i62) | (i12 ^ i62);
                int i64 = (i11 - (~(TypedValues.PositionType.TYPE_DRAWPATH * ((~((i63 & 46933) | (i63 ^ 46933))) | (~(((i9 & 46933) | (i9 ^ 46933)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2)))))) - i20;
                Object[] objArr6 = new Object[i20];
                c(cArr2, i64, objArr6);
                Object[] objArr7 = new Object[i20];
                objArr7[0] = Integer.valueOf(((Integer) cls2.getMethod((String) objArr6[0], null).invoke(method, null)).intValue());
                int i65 = -Color.rgb(0, 0, 0);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i66 = i65 * (-381);
                int i67 = (i66 & 1075105600) + (i66 | 1075105600);
                int i68 = (~i65) * (-191);
                int i69 = (((i67 & i68) + (i68 | i67)) - (~(((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault3 | (-16770113))) | i65) * 191))) - i20;
                int i70 = ~i65;
                int i71 = ~((i70 & (-16770113)) | (i70 ^ (-16770113)));
                int i72 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i73 = ~((i72 & (-16770113)) | (i72 ^ (-16770113)));
                int i74 = i69 + (((i71 & i73) | (i71 ^ i73)) * 191);
                Object[] objArr8 = new Object[i20];
                c(new char[]{38005, 36801, 41751, 51011, 64205, 7880, 12804, 22088, 18816, 28038, 33051, 42319, 55437, 64704, 4104, 13389, 12187, 17310, 26428, 39773, 48791, 53981, 62995, 59999, 3474, 8650}, i74, objArr8);
                Class<?> cls3 = Class.forName((String) objArr8[0]);
                char[] cArr3 = {38006, 22885, 3651, 62309, 41039, 38235, 23135, 3909};
                int i75 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i76 = (i75 & 77) + (i75 | 77);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i76 % 128;
                int i77 = i76 % 2;
                Object[] objArr9 = new Object[i20];
                c(cArr3, 52487 - (~(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr9);
                String str = (String) objArr9[0];
                Class<?>[] clsArr = new Class[i20];
                clsArr[0] = Integer.TYPE;
                if (((Boolean) cls3.getMethod(str, clsArr).invoke(null, objArr7)).booleanValue()) {
                    Class cls4 = Long.TYPE;
                    int i78 = -(-ImageFormat.getBitsPerPixel(0));
                    int i79 = (i78 & 4518) + (i78 | 4518);
                    Object[] objArr10 = new Object[i20];
                    c(new char[]{38005, 34267, 46883, 41105, 53925, 52298, 64928, 61426, 6480, 2812, 9247, 22125, 18373, 28946, 25468, 40151, 36411, 49092, 43464, 56133, 62607, 59134, 4190, 424}, i79, objArr10);
                    Class<?> cls5 = Class.forName((String) objArr10[0]);
                    char[] cArr4 = {38008, 14017, 53533, 31868, 7830, 47564, 17416, 59248, 33193, 11480, 53032, 27238, 13502};
                    int i80 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i81 = (i80 ^ 3) + ((i80 & 3) << i20);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i81 % 128;
                    int i82 = ((i81 % 2 == 0 ? TypedValue.complexToFloat(0) : TypedValue.complexToFloat(0)) > 0.0f ? 1 : ((i81 % 2 == 0 ? TypedValue.complexToFloat(0) : TypedValue.complexToFloat(0)) == 0.0f ? 0 : -1));
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i83 = i82 * (-589);
                    int i84 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i85 = (i84 ^ 123) + ((i84 & 123) << i20);
                    int i86 = i85 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i86;
                    int i87 = i85 % 2 != 0 ? i83 * (591 / 41659) : i83 + 24620469;
                    int i88 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (-41660));
                    int i89 = ~((-41660) | i82);
                    int i90 = (i88 ^ i89) | (i89 & i88);
                    int i91 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i92 = ~((i91 ^ i82) | (i91 & i82));
                    int i93 = (i90 ^ i92) | (i90 & i92);
                    int i94 = ~i82;
                    int i95 = (i94 ^ 41659) | (i94 & 41659);
                    methodArr2 = declaredMethods;
                    int i96 = i86 + 3;
                    i13 = length;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i96 % 128;
                    if (i96 % 2 == 0) {
                        int i97 = ~((i95 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i95 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i98 = -((i93 & i97) | (i93 ^ i97));
                        int i99 = -((590 ^ i98) + ((i98 & 590) << 1));
                        i15 = ((i87 | i99) << 1) - (i99 ^ i87);
                        i16 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (-41660));
                        i14 = 1;
                    } else {
                        int i100 = ~((i95 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i95 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i101 = i87 - (~(-(-(590 * ((i93 & i100) | (i93 ^ i100))))));
                        i14 = 1;
                        i15 = i101 - 1;
                        i16 = ~((-41660) | i91);
                    }
                    int i102 = (i86 ^ 37) + ((i86 & 37) << i14);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i102 % 128;
                    int i103 = i102 % 2;
                    int i104 = ~(((-41660) & i82) | ((-41660) ^ i82));
                    int i105 = (i104 & i16) | (i16 ^ i104);
                    int i106 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i107 = ~((i106 ^ i82) | (i106 & i82));
                    int i108 = i15 + ((-1180) * ((i105 & i107) | (i105 ^ i107)));
                    int i109 = i86 + 123;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i109 % 128;
                    int i110 = i109 % 2;
                    int i111 = ~i82;
                    int i112 = ~((i111 & i106) | (i111 ^ i106));
                    int i113 = ~(i106 | 41659);
                    int i114 = 590 * ((i112 & i113) | (i112 ^ i113));
                    int i115 = (i108 ^ i114) + ((i108 & i114) << 1);
                    Object[] objArr11 = new Object[1];
                    c(cArr4, i115, objArr11);
                    String str2 = (String) objArr11[0];
                    int i116 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i117 = (i116 ^ 81) + ((i116 & 81) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i117 % 128;
                    if (i117 % 2 == 0) {
                        Object obj2 = null;
                        cls4.equals(cls5.getMethod(str2, null).invoke(method, null));
                        obj2.hashCode();
                        throw null;
                    }
                    if (cls4.equals(cls5.getMethod(str2, null).invoke(method, null))) {
                        Object[] objArr12 = new Object[1];
                        c(new char[]{38005, 34267, 46883, 41105, 53925, 52298, 64928, 61426, 6480, 2812, 9247, 22125, 18373, 28946, 25468, 40151, 36411, 49092, 43464, 56133, 62607, 59134, 4190, 424}, 4517 - View.combineMeasuredStates(0, 0), objArr12);
                        Class<?> cls6 = Class.forName((String) objArr12[0]);
                        int i118 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i119 = ((i118 | 45659) << 1) - (i118 ^ 45659);
                        Object[] objArr13 = new Object[1];
                        c(new char[]{38008, 9761, 61661, 33630, 23826, 61354, 47708, 29711, 1698, 53592, 25588, 15748, 51215, 39673, 21653, 59183, 45532}, i119, objArr13);
                        Object[] objArr14 = (Object[]) cls6.getMethod((String) objArr13[0], null).invoke(method, null);
                        if (objArr14.length == 2) {
                            int i120 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i120 % 128;
                            int i121 = i120 % 2;
                            if (!Long.TYPE.equals(objArr14[0])) {
                                continue;
                            } else {
                                int i122 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i123 = ((i122 | 51) << 1) - (i122 ^ 51);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i123 % 128;
                                int i124 = i123 % 2;
                                int i125 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i126 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i127 = (i126 & 19) + (i126 | 19);
                                int i128 = i127 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i128;
                                int i129 = i127 % 2;
                                int i130 = ~i125;
                                int i131 = ~((i130 ^ (-4518)) | (i130 & (-4518)));
                                int i132 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                int i133 = ~((i132 & i130) | (i130 ^ i132));
                                int i134 = (((i125 * 483) - (-1093114)) - (~(((i131 & i133) | (i131 ^ i133)) * (-241)))) - 1;
                                int i135 = (i128 & 63) + (i128 | 63);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i135 % 128;
                                int i136 = i135 % 2;
                                int i137 = ((i125 ^ 4517) | (i125 & 4517)) * (-482);
                                int i138 = ~((i125 & (-4518)) | ((-4518) ^ i125));
                                int i139 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | i130;
                                int i140 = (((i134 & i137) + (i134 | i137)) - (~(-(-((i138 | (~((i139 & 4517) | (i139 ^ 4517)))) * 241))))) - 1;
                                Object[] objArr15 = new Object[1];
                                c(new char[]{38005, 34267, 46883, 41105, 53925, 52298, 64928, 61426, 6480, 2812, 9247, 22125, 18373, 28946, 25468, 40151, 36411, 49092, 43464, 56133, 62607, 59134, 4190, 424}, i140, objArr15);
                                if (Class.forName((String) objArr15[0]).equals(objArr14[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2824;
                                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                                        byte[] bArr2 = $$d;
                                        byte b7 = bArr2[54];
                                        byte b8 = bArr2[5];
                                        Object[] objArr16 = new Object[1];
                                        b(b7, b8, (byte) (-b8), objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, packedPositionChild, minimumFlingVelocity, 1814927978, false, (String) objArr16[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                        int iIndexOf = TextUtils.indexOf("", "", 0) + 2823;
                                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 22;
                                        byte[] bArr3 = $$d;
                                        byte b9 = bArr3[54];
                                        byte b10 = bArr3[5];
                                        Object[] objArr17 = new Object[1];
                                        b(b9, b10, (byte) (-b10), objArr17);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, iIndexOf, iMakeMeasureSpec, 1814927978, false, (String) objArr17[0], null);
                                    }
                                    try {
                                        Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2824;
                                            int iIndexOf2 = 22 - TextUtils.indexOf("", "");
                                            byte[] bArr4 = $$d;
                                            byte b11 = bArr4[7];
                                            Object[] objArr19 = new Object[1];
                                            b(b11, bArr4[1], b11, objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iLastIndexOf, iIndexOf2, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr18)).longValue();
                                        break;
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    methodArr2 = declaredMethods;
                    i13 = length;
                }
                i24++;
                declaredMethods = methodArr2;
                length = i13;
                i17 = 2;
                i22 = 0;
                i20 = 1;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int trimmedLength = 2823 - TextUtils.getTrimmedLength("");
            int i141 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21;
            byte[] bArr5 = $$d;
            byte b12 = bArr5[54];
            byte b13 = bArr5[5];
            Object[] objArr20 = new Object[1];
            b(b12, b13, (byte) (-b13), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, trimmedLength, i141, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int iAxisFromString = MotionEvent.axisFromString("") + 2824;
            int iAxisFromString2 = 21 - MotionEvent.axisFromString("");
            byte[] bArr6 = $$d;
            Object[] objArr22 = new Object[1];
            b((byte) (bArr6[51] - 1), bArr6[1], bArr6[7], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, iAxisFromString, iAxisFromString2, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char deadChar2 = (char) (37657 - KeyEvent.getDeadChar(0, 0));
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2720;
            int iAxisFromString3 = 18 - MotionEvent.axisFromString("");
            byte[] bArr7 = $$d;
            Object[] objArr24 = new Object[1];
            b((byte) (bArr7[51] - 1), bArr7[1], bArr7[7], objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar2, touchSlop, iAxisFromString3, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j = -215370486;
        long j2 = -1;
        long j3 = jLongValue ^ j2;
        Method[] methodArr3 = methodArr;
        long jMyUid = ((((long) Process.myUid()) ^ j2) | jLongValue) ^ j2;
        long j4 = (((long) (-1939)) * j) + (((long) 971) * jLongValue) + (((long) (-970)) * (((j3 | j) ^ j2) | jMyUid));
        long j5 = j ^ j2;
        long j6 = j4 + (((long) 1940) * ((j5 | jLongValue) ^ j2)) + (((long) 970) * (jMyUid | ((j5 | j3) ^ j2))) + ((long) (-1595035359));
        int iMyPid = Process.myPid();
        int i142 = ((int) (j6 >> 32)) & (95360174 + (((~((-365979692) | iMyPid)) | (~(1071246719 | iMyPid))) * 69) + (((~(iMyPid | 1070689339)) | (~((-366537072) | iMyPid)) | 557380) * (-69)) + 1380325456);
        int iMyUid = Process.myUid();
        int i143 = ~iMyUid;
        int i144 = (~(1810992873 | i143)) | 335950102;
        int i145 = ~(iMyUid | (-1773176513));
        int i146 = ((int) j6) & (((i144 | i145) * (-252)) + 1617820669 + ((i145 | (~(i143 | 2146942975))) * 252));
        int i147 = (i142 & i146) | (i142 ^ i146);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i148 = ~(((-1817509252) & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | ((-1817509252) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
        int i149 = (i148 & 1280372736) | (1280372736 ^ i148);
        int i150 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        int i151 = (i150 ^ 1316548700) | (i150 & 1316548700);
        int i152 = ~((i151 & 1817509251) | (i151 ^ 1817509251));
        int i153 = (-104315059) + (((i149 & i152) | (i149 ^ i152)) * 886);
        int i154 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | 1817509251);
        int i155 = -(-(((i154 & 1316548700) | (1316548700 ^ i154)) * (-1772)));
        int i156 = (i153 & i155) + (i155 | i153);
        int i157 = (~(i150 | 1316548700)) * 886;
        int i158 = ((i156 | i157) << 1) - (i157 ^ i156);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i159 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i160 = (1772864239 & i159) | (i159 ^ 1772864239);
        int i161 = (-610654223) - (~((~(((-1466005709) & i160) | (i160 ^ (-1466005709)))) * 52));
        int i162 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i163 = (~((i162 & 1466005708) | (1466005708 ^ i162))) | (-2146171632);
        int i164 = ~i160;
        int i165 = (i161 - (~(-(-(((i163 & i164) | (i163 ^ i164)) * (-52)))))) - 1;
        int i166 = ~((-1772864240) | i159);
        if (i158 > i165 + (((i166 & 1092698316) | (i166 ^ 1092698316)) * 52)) {
            i = i147 / 22;
            i2 = i147 & ViewCompat.MEASURED_SIZE_MASK;
            if (i != 0) {
                i3 = i;
                i4 = 1;
            } else {
                i3 = i;
                i4 = 0;
            }
        } else {
            i = i147 >>> 24;
            i2 = i147 & ViewCompat.MEASURED_SIZE_MASK;
            if (i != 0) {
                i3 = i;
                i4 = 1;
            } else {
                i3 = i;
                i4 = 0;
            }
        }
        if ((i4 ^ 1) != 1) {
            i5 = 1;
            i6 = 1;
        } else {
            int i167 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i168 = (i167 & 53) + (i167 | 53);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i168 % 128;
            int i169 = i168 % 2;
            i5 = 1;
            i6 = 0;
        }
        if (i4 != i5) {
            string = null;
        } else {
            int i170 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i171 = (i170 ^ 115) + ((i170 & 115) << i5);
            int i172 = i171 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i172;
            int i173 = i171 % 2;
            if (i2 < methodArr3.length) {
                int i174 = ((i172 | 33) << i5) - (i172 ^ 33);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i174 % 128;
                if (i174 % 2 != 0) {
                    Method method2 = methodArr3[i2];
                    throw null;
                }
                Method method3 = methodArr3[i2];
                if (method3 != null) {
                    string = method3.toString();
                    int i175 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i176 = ((i175 | 41) << 1) - (i175 ^ 41);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i176 % 128;
                    int i177 = i176 % 2;
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
        }
        list.add(string);
        return ((i3 & 6) + (i3 | 6)) * i6;
    }
}
