package com.bpjstku.data.payment;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
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
import androidx.core.view.ViewCompat;
import com.bpjstku.data.payment.model.response.CreateOneTimePaymentResponse;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl;
import defpackage.readableMs;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PaymentDataStore$$ExternalSyntheticLambda43 implements readableMs {
    private static int $10 = 0;
    private static int $11 = 1;
    public final /* synthetic */ Function1 f$0;
    private static final byte[] $$d = {53, -70, 9, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 62;
    private static final byte[] $$a = {8, -36, 87, -65, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 36, 19, 4, 10, -8, 8, 0, -22, 22, 15, -11, 8, 0, 15, 0, 17, -34, 19, 4, 10, -8, 8, 0, -26, 39, -6, 11};
    private static final int $$b = 91;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -213918150971160916L;

    public /* synthetic */ PaymentDataStore$$ExternalSyntheticLambda43(Function1 function1) {
        this.f$0 = function1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 19
            int r8 = 33 - r8
            int r6 = r6 * 6
            int r6 = 103 - r6
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda43.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r7]
        L28:
            int r6 = r6 + r3
            int r6 = r6 + (-2)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda43.a(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda43.$$d
            int r5 = r5 * 52
            int r1 = 53 - r5
            int r6 = 103 - r6
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r5 = 52 - r5
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r5
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r3 = r0[r7]
        L28:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda43.c(short, short, byte, java.lang.Object[]):void");
    }

    @Override // defpackage.readableMs
    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = b + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        CreateOneTimePaymentResponse createOneTimePaymentResponseCreateOneTimePayment$lambda$9 = PaymentDataStore.createOneTimePayment$lambda$9(this.f$0, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        b = i4 % 128;
        int i5 = i4 % 2;
        return createOneTimePaymentResponseCreateOneTimePayment$lambda$9;
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 3;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - View.MeasureSpec.getMode(0)), View.MeasureSpec.getMode(0) + 2624, 14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                try {
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39421 - MotionEvent.axisFromString("")), 480 - MotionEvent.axisFromString(""), 37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i6 = $11 + 67;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $11 + 81;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-16737794) - Color.rgb(0, 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 482, (ViewConfiguration.getTouchSlop() >> 8) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0844  */
    /* JADX WARN: Code duplicated, block: B:106:0x0848  */
    /* JADX WARN: Code duplicated, block: B:120:0x04d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x05e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x05e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x045d A[PHI: r1
  0x045d: PHI (r1v120 java.lang.Object[]) = (r1v119 java.lang.Object[]), (r1v138 java.lang.Object[]) binds: [B:45:0x045b, B:40:0x0438] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0468  */
    /* JADX WARN: Code duplicated, block: B:52:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:55:0x0532  */
    /* JADX WARN: Code duplicated, block: B:59:0x0593 A[Catch: all -> 0x0867, TryCatch #1 {all -> 0x0867, blocks: (B:57:0x057d, B:59:0x0593, B:60:0x05d9, B:72:0x0657, B:74:0x0664, B:75:0x06a7, B:77:0x06c4, B:78:0x070e), top: B:117:0x057d }] */
    /* JADX WARN: Code duplicated, block: B:84:0x07f3 A[PHI: r0 r1
  0x07f3: PHI (r0v28 int) = (r0v16 int), (r0v31 int) binds: [B:86:0x07ff, B:82:0x07f0] A[DONT_GENERATE, DONT_INLINE]
  0x07f3: PHI (r1v56 int) = (r1v41 int), (r1v59 int) binds: [B:86:0x07ff, B:82:0x07f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x0801 A[PHI: r0 r1
  0x0801: PHI (r0v17 int) = (r0v16 int), (r0v31 int) binds: [B:86:0x07ff, B:82:0x07f0] A[DONT_GENERATE, DONT_INLINE]
  0x0801: PHI (r1v42 int) = (r1v41 int), (r1v59 int) binds: [B:86:0x07ff, B:82:0x07f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0816  */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) throws Throwable {
        Method[] methodArr;
        Class<?> cls;
        Object obj;
        Class<?> cls2;
        Object obj2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        String string;
        Method method;
        Method[] declaredMethods;
        int length;
        int i5;
        Object[] objArr;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i6 = 2 % 2;
        int i7 = b;
        int i8 = (i7 & 103) + (i7 | 103);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        int i9 = 0;
        if (i8 % 2 != 0) {
            methodArr = new Method[5];
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[13], bArr[7], bArr[28], objArr3);
            cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[28];
            Object[] objArr4 = new Object[1];
            a(b2, (byte) (b2 | 31), bArr[13], objArr4);
            obj = objArr4[0];
        } else {
            methodArr = new Method[2];
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr2[13], bArr2[7], bArr2[28], objArr5);
            cls = Class.forName((String) objArr5[0]);
            byte b3 = bArr2[28];
            Object[] objArr6 = new Object[1];
            a(b3, (byte) (b3 | 31), bArr2[13], objArr6);
            obj = objArr6[0];
        }
        String str = (String) obj;
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        b = i10 % 128;
        int i11 = i10 % 2;
        Class<?>[] clsArr = new Class[2];
        clsArr[0] = String.class;
        Class<?> cls3 = Integer.TYPE;
        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        b = i12 % 128;
        if (i12 % 2 == 0) {
            clsArr[1] = cls3;
            methodArr[0] = cls.getMethod(str, clsArr);
            cls2 = Class.forName("android.app.ApplicationPackageManager");
            byte[] bArr3 = $$a;
            byte b4 = bArr3[28];
            Object[] objArr7 = new Object[1];
            a(b4, (byte) (b4 | 31), bArr3[13], objArr7);
            obj2 = objArr7[0];
        } else {
            clsArr[1] = cls3;
            methodArr[0] = cls.getMethod(str, clsArr);
            cls2 = Class.forName("android.app.ApplicationPackageManager");
            byte[] bArr4 = $$a;
            byte b5 = bArr4[28];
            Object[] objArr8 = new Object[1];
            a(b5, (byte) (b5 | 31), bArr4[13], objArr8);
            obj2 = objArr8[0];
        }
        methodArr[1] = cls2.getMethod((String) obj2, String.class, Integer.TYPE);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int trimmedLength = 2823 - TextUtils.getTrimmedLength("");
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 23;
            byte[] bArr5 = $$d;
            Object[] objArr9 = new Object[1];
            c(bArr5[7], bArr5[10], (byte) (-bArr5[5]), objArr9);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, trimmedLength, modifierMetaStateMask, 1814927978, false, (String) objArr9[0], null);
        }
        char c = '0';
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            int i13 = b;
            int i14 = (i13 ^ 17) + ((i13 & 17) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
            if (i14 % 2 != 0) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 2823 - View.combineMeasuredStates(0, 0), 22 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getDeclaredMethods();
                length = declaredMethods.length;
                i5 = 1;
            } else {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.alpha(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2823, 22 - Color.red(0))).getDeclaredMethods();
                length = declaredMethods.length;
                i5 = 0;
            }
            while (i5 < length) {
                Method method2 = declaredMethods[i5];
                int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
                b = i15 % 128;
                int i16 = i15 % 2;
                try {
                    char[] cArr = {45021, 10157, 48951, 13991, 36469, 1468, 40244, 5252, 60424, 25546, 64267, 29339, 51733, 16868, 55656, 20705, 10355, 49074, 14172, 36595, 1631, 40392, 5450, 60638};
                    char mirror = AndroidCharacter.getMirror(c);
                    int iB = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
                    int i17 = mirror * 65016;
                    int i18 = ((i17 | 18213102) << 1) - (i17 ^ 18213102);
                    int i19 = ~mirror;
                    int i20 = (i19 ^ 34891) | (i19 & 34891);
                    int i21 = (~((i20 ^ iB) | (i20 & iB))) * 521;
                    int i22 = (i18 ^ i21) + ((i18 & i21) << 1) + ((~((-34892) | mirror)) * (-1042));
                    int i23 = ~(((-34892) ^ mirror) | ((-34892) & mirror));
                    int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i25 = ((i24 | 11) << 1) - (i24 ^ 11);
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    int i27 = ~mirror;
                    int i28 = ~iB;
                    int i29 = (i27 & i28) | (i27 ^ i28);
                    int i30 = -(-(521 * (i23 | (~((i29 & 34891) | (i29 ^ 34891))))));
                    int i31 = ((i22 | i30) << 1) - (i22 ^ i30);
                    Object[] objArr10 = new Object[1];
                    d(cArr, i31, objArr10);
                    Class<?> cls4 = Class.forName((String) objArr10[i9]);
                    char[] cArr2 = {45008, 3233, 59685, 17827, 8724, 40684, 31596, 55284, 46150, 4313, 52667, 43573};
                    int i32 = -Color.blue(i9);
                    int iB2 = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
                    int i33 = b;
                    int i34 = (i33 ^ 93) + ((i33 & 93) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i34 % 128;
                    int i35 = i34 % 2;
                    int i36 = i32 * 46;
                    int i37 = (i36 ^ 1924778) + ((i36 & 1924778) << 1);
                    int i38 = ~iB2;
                    int i39 = ~((-41844) | i38);
                    int i40 = -(-(((i32 ^ i39) | (i39 & i32)) * (-90)));
                    int i41 = i33 + 81;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i41 % 128;
                    int i42 = i41 % 2;
                    int i43 = ((((i37 | i40) << 1) - (i37 ^ i40)) - (~((-45) * ((~((-41844) | iB2)) | (~((41843 & i32) | (i32 ^ 41843))))))) - 1;
                    int i44 = ~i32;
                    int i45 = ~((i44 & iB2) | (i44 ^ iB2));
                    int i46 = (i45 & (-41844)) | ((-41844) ^ i45);
                    int i47 = ~((i38 & i32) | (i38 ^ i32));
                    Object[] objArr11 = new Object[1];
                    d(cArr2, (i43 - (~(-(-(((i47 & i46) | (i46 ^ i47)) * 45))))) - 1, objArr11);
                    Object[] objArr12 = {Integer.valueOf(((Integer) cls4.getMethod((String) objArr11[0], null).invoke(method2, null)).intValue())};
                    int i48 = -(-ExpandableListView.getPackedPositionGroup(0L));
                    int i49 = (i48 ^ 39581) + ((i48 & 39581) << 1);
                    Object[] objArr13 = new Object[1];
                    d(new char[]{45021, 13643, 39675, 24577, 50669, 43722, 12408, 38290, 31544, 49180, 42471, 2925, 37005, 30242, 56132, 41191, 1555, 60404, 28912, 54911, 48023, 319, 59055, 19397, 53610, 46736}, i49, objArr13);
                    Class<?> cls5 = Class.forName((String) objArr13[0]);
                    int i50 = -TextUtils.getOffsetAfter("", 0);
                    int i51 = ((i50 | 18181) << 1) - (i50 ^ 18181);
                    Object[] objArr14 = new Object[1];
                    d(new char[]{45022, 59585, 8691, 31449, 46039, 52423, 1503, 24305}, i51, objArr14);
                    String str2 = (String) objArr14[0];
                    Class<?>[] clsArr2 = new Class[1];
                    int i52 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i53 = (i52 ^ 39) + ((i52 & 39) << 1);
                    b = i53 % 128;
                    int i54 = i53 % 2;
                    clsArr2[0] = Integer.TYPE;
                    if (((Boolean) cls5.getMethod(str2, clsArr2).invoke(null, objArr12)).booleanValue()) {
                        Class cls6 = Long.TYPE;
                        Object[] objArr15 = new Object[1];
                        d(new char[]{45021, 10157, 48951, 13991, 36469, 1468, 40244, 5252, 60424, 25546, 64267, 29339, 51733, 16868, 55656, 20705, 10355, 49074, 14172, 36595, 1631, 40392, 5450, 60638}, 34940 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr15);
                        Class<?> cls7 = Class.forName((String) objArr15[0]);
                        int i55 = -AndroidCharacter.getMirror('0');
                        int i56 = (i55 & 21317) + (i55 | 21317);
                        Object[] objArr16 = new Object[1];
                        d(new char[]{45008, 64711, 2537, 22234, 58246, 12458, 23996, 59990, 14193, 17502, 37148, 15904, 19246}, i56, objArr16);
                        if (!(!cls6.equals(cls7.getMethod((String) objArr16[0], null).invoke(method2, null)))) {
                            int i57 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i58 = (i57 & 105) + (i57 | 105);
                            b = i58 % 128;
                            int i59 = i58 % 2;
                            int i60 = -View.getDefaultSize(0, 0);
                            int iB3 = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
                            int i61 = ~i60;
                            int i62 = ~iB3;
                            int i63 = (i60 * 236) + 16456269 + (((~((i61 & i62) | (i61 ^ i62))) | 34939) * (-235));
                            int i64 = ~i60;
                            int i65 = ~(i64 | iB3);
                            int i66 = (i64 & 34939) | (i64 ^ 34939);
                            int i67 = i63 + (((i65 ^ 34939) | (i65 & 34939)) * (-470)) + (((~(i60 | (-34940))) | (~((iB3 & i66) | (i66 ^ iB3)))) * 235);
                            Object[] objArr17 = new Object[1];
                            d(new char[]{45021, 10157, 48951, 13991, 36469, 1468, 40244, 5252, 60424, 25546, 64267, 29339, 51733, 16868, 55656, 20705, 10355, 49074, 14172, 36595, 1631, 40392, 5450, 60638}, i67, objArr17);
                            Class<?> cls8 = Class.forName((String) objArr17[0]);
                            char[] cArr3 = {45008, 40915, 53185, 16356, 28626, 24512, 36816, 65501, 12250, 8138, 20440, 49102, 61423, 57283, 4041, 32733, 45012};
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                            int iB4 = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
                            int i68 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i69 = (i68 & 85) + (i68 | 85);
                            int i70 = i69 % 128;
                            b = i70;
                            int i71 = i69 % 2;
                            int i72 = (iLastIndexOf * (-665)) - (-4104860);
                            int i73 = ~iLastIndexOf;
                            int i74 = i73 * (-333);
                            int i75 = (i72 & i74) + (i74 | i72);
                            int i76 = ~iLastIndexOf;
                            int i77 = ~iB4;
                            int i78 = -(-(((~((i76 & i77) | (i76 ^ i77))) | (~((iB4 ^ 12290) | (iB4 & 12290)))) * 333));
                            int i79 = (i75 ^ i78) + ((i75 & i78) << 1);
                            int i80 = ~((i73 ^ iB4) | (i73 & iB4));
                            int i81 = ~iB4;
                            int i82 = ~((i81 & 12290) | (i81 ^ 12290));
                            int i83 = (i70 & 81) + (i70 | 81);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i83 % 128;
                            if (i83 % 2 != 0) {
                                int i84 = -((i82 & i80) | (i80 ^ i82));
                                int i85 = (i79 - (~(-((i84 ^ 333) + ((i84 & 333) << 1))))) - 1;
                                Object[] objArr18 = new Object[1];
                                d(cArr3, i85, objArr18);
                                objArr = (Object[]) cls8.getMethod((String) objArr18[0], null).invoke(method2, null);
                                if (objArr.length != 3) {
                                    continue;
                                } else if (Long.TYPE.equals(objArr[0])) {
                                    int i86 = b + 47;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i86 % 128;
                                    int i87 = i86 % 2;
                                    int i88 = -ImageFormat.getBitsPerPixel(0);
                                    int iB5 = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
                                    int i89 = (i88 * (-755)) - 26378190;
                                    int i90 = ~i88;
                                    int i91 = (~((i90 & (-34939)) | (i90 ^ (-34939)))) * 1512;
                                    int i92 = (i89 & i91) + (i89 | i91);
                                    int i93 = ~i88;
                                    int i94 = ~((i93 & (-34939)) | (i93 ^ (-34939)));
                                    int i95 = i88 | 34938;
                                    int i96 = ~((i95 ^ iB5) | (i95 & iB5));
                                    int i97 = ((i94 ^ i96) | (i94 & i96)) * (-756);
                                    int i98 = (i92 ^ i97) + ((i97 & i92) << 1);
                                    int i99 = ((i88 & 34938) | (i88 ^ 34938) | (~iB5)) * 756;
                                    int i100 = (i98 & i99) + (i99 | i98);
                                    objArr2 = new Object[1];
                                    d(new char[]{45021, 10157, 48951, 13991, 36469, 1468, 40244, 5252, 60424, 25546, 64267, 29339, 51733, 16868, 55656, 20705, 10355, 49074, 14172, 36595, 1631, 40392, 5450, 60638}, i100, objArr2);
                                    if (Class.forName((String) objArr2[0]).equals(objArr[1])) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2823;
                                            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 23;
                                            byte[] bArr6 = $$d;
                                            Object[] objArr19 = new Object[1];
                                            c(bArr6[7], bArr6[10], (byte) (-bArr6[5]), objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iResolveOpacity, iLastIndexOf2, 1814927978, false, (String) objArr19[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2823;
                                            int trimmedLength2 = 22 - TextUtils.getTrimmedLength("");
                                            byte[] bArr7 = $$d;
                                            Object[] objArr20 = new Object[1];
                                            c(bArr7[7], bArr7[10], (byte) (-bArr7[5]), objArr20);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, scrollBarSize, trimmedLength2, 1814927978, false, (String) objArr20[0], null);
                                        }
                                        try {
                                            Object[] objArr21 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                                                int i101 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2822;
                                                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 22;
                                                byte[] bArr8 = $$d;
                                                byte b6 = bArr8[5];
                                                byte b7 = bArr8[7];
                                                Object[] objArr22 = new Object[1];
                                                c(b6, b7, (byte) (b7 | 51), objArr22);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter, i101, iCombineMeasuredStates, -2137287382, false, (String) objArr22[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr21)).longValue();
                                            break;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                int i102 = ((i82 & i80) | (i80 ^ i82)) * 333;
                                int i103 = (i79 & i102) + (i102 | i79);
                                Object[] objArr23 = new Object[1];
                                d(cArr3, i103, objArr23);
                                objArr = (Object[]) cls8.getMethod((String) objArr23[0], null).invoke(method2, null);
                                if (objArr.length != 2) {
                                    continue;
                                } else if (Long.TYPE.equals(objArr[0])) {
                                    int i810 = b + 47;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i810 % 128;
                                    int i811 = i810 % 2;
                                    int i812 = -ImageFormat.getBitsPerPixel(0);
                                    int iB6 = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
                                    int i813 = (i812 * (-755)) - 26378190;
                                    int i910 = ~i812;
                                    int i911 = (~((i910 & (-34939)) | (i910 ^ (-34939)))) * 1512;
                                    int i912 = (i813 & i911) + (i813 | i911);
                                    int i913 = ~i812;
                                    int i914 = ~((i913 & (-34939)) | (i913 ^ (-34939)));
                                    int i915 = i812 | 34938;
                                    int i916 = ~((i915 ^ iB6) | (i915 & iB6));
                                    int i917 = ((i914 ^ i916) | (i914 & i916)) * (-756);
                                    int i918 = (i912 ^ i917) + ((i917 & i912) << 1);
                                    int i919 = ((i812 & 34938) | (i812 ^ 34938) | (~iB6)) * 756;
                                    int i104 = (i918 & i919) + (i919 | i918);
                                    objArr2 = new Object[1];
                                    d(new char[]{45021, 10157, 48951, 13991, 36469, 1468, 40244, 5252, 60424, 25546, 64267, 29339, 51733, 16868, 55656, 20705, 10355, 49074, 14172, 36595, 1631, 40392, 5450, 60638}, i104, objArr2);
                                    if (Class.forName((String) objArr2[0]).equals(objArr[1])) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char cRgb2 = (char) (Color.rgb(0, 0, 0) + 16777216);
                                            int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 2823;
                                            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0') + 23;
                                            byte[] bArr9 = $$d;
                                            Object[] objArr110 = new Object[1];
                                            c(bArr9[7], bArr9[10], (byte) (-bArr9[5]), objArr110);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb2, iResolveOpacity2, iLastIndexOf3, 1814927978, false, (String) objArr110[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                                            int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 2823;
                                            int trimmedLength3 = 22 - TextUtils.getTrimmedLength("");
                                            byte[] bArr10 = $$d;
                                            Object[] objArr24 = new Object[1];
                                            c(bArr10[7], bArr10[10], (byte) (-bArr10[5]), objArr24);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, scrollBarSize2, trimmedLength3, 1814927978, false, (String) objArr24[0], null);
                                        }
                                        Object[] objArr25 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
                                            int i105 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2822;
                                            int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 22;
                                            byte[] bArr11 = $$d;
                                            byte b8 = bArr11[5];
                                            byte b9 = bArr11[7];
                                            Object[] objArr26 = new Object[1];
                                            c(b8, b9, (byte) (b9 | 51), objArr26);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter2, i105, iCombineMeasuredStates2, -2137287382, false, (String) objArr26[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr25)).longValue();
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i5++;
                    int i106 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i107 = ((i106 | 107) << 1) - (i106 ^ 107);
                    b = i107 % 128;
                    int i108 = i107 % 2;
                    c = '0';
                    i9 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int capsMode = 2823 - TextUtils.getCapsMode("", 0, 0);
            int iIndexOf = 22 - TextUtils.indexOf("", "");
            byte[] bArr12 = $$d;
            Object[] objArr27 = new Object[1];
            c(bArr12[7], bArr12[10], (byte) (-bArr12[5]), objArr27);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, capsMode, iIndexOf, 1814927978, false, (String) objArr27[0], null);
        }
        Object[] objArr28 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c4 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
            int maximumFlingVelocity = 2823 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int keyRepeatDelay = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte b10 = $$d[5];
            Object[] objArr29 = new Object[1];
            c(b10, (byte) (b10 + 4), (byte) 51, objArr29);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c4, maximumFlingVelocity, keyRepeatDelay, 1025296417, false, (String) objArr29[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr28);
        Object[] objArr30 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char defaultSize2 = (char) (View.getDefaultSize(0, 0) + 37657);
            int iLastIndexOf4 = 2719 - TextUtils.lastIndexOf("", '0');
            int iMyPid = (Process.myPid() >> 22) + 19;
            byte b11 = $$d[5];
            Object[] objArr31 = new Object[1];
            c(b11, (byte) (b11 + 4), (byte) 51, objArr31);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(defaultSize2, iLastIndexOf4, iMyPid, -1568796068, false, (String) objArr31[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr30)).longValue();
        long j = 228518581;
        long j2 = -1;
        long j3 = j ^ j2;
        long jMyPid = Process.myPid();
        long j4 = (j3 | (jMyPid ^ j2)) ^ j2;
        long j5 = 338;
        long j6 = (((long) (-337)) * j) + (((long) 339) * jLongValue) + (((long) (-338)) * (j4 | (((jLongValue ^ j2) | j) ^ j2) | ((j | jMyPid) ^ j2))) + (((j3 | jLongValue) ^ j2) * j5) + (j5 * (j4 | ((jMyPid | (jLongValue | j)) ^ j2))) + ((long) (-2038924426));
        int i109 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i109 % 128;
        int i110 = i109 % 2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i111 = ~iFreeMemory;
        int i112 = 1408559628 + (((~((-1516549813) | i111)) | 268698644) * (-1188));
        int i113 = (~(iFreeMemory | 1516549812)) | 268698644;
        int i114 = ~((-1341191073) | i111);
        int i115 = ((int) (j6 >> 32)) & (i112 + ((i113 | i114) * 594) + (((~(1516549812 | i111)) | 93339904 | i114) * 594));
        int iNextInt = new Random().nextInt(342146107);
        int i116 = ~iNextInt;
        int i117 = ((((~(1526181823 | i116)) | (~((-1479573675) | iNextInt))) * 988) - 1522438339) + (((~(iNextInt | 1483834559)) | 42347264 | (~(i116 | (-1479573675)))) * 988);
        int i118 = b;
        int i119 = (i118 & 27) + (i118 | 27);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i119 % 128;
        int i120 = ((int) j6) & i117;
        if (i119 % 2 != 0) {
            int i121 = (i115 & i120) | (i115 ^ i120);
            i = (i121 ^ (-37)) + ((i121 & (-37)) << 1);
            i2 = i121 & ViewCompat.MEASURED_SIZE_MASK;
            if (i != 0) {
                int i122 = i118 + 113;
                int i123 = i122 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i123;
                int i124 = i122 % 2;
                i3 = ((i123 | 19) << 1) - (i123 ^ 19);
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    int i125 = 4 / 2;
                }
                i4 = i;
                z = true;
            } else {
                int i126 = i118 + 99;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i126 % 128;
                int i127 = i126 % 2;
                i4 = i;
                z = false;
            }
        } else {
            int i128 = (i115 & i120) | (i115 ^ i120);
            i = i128 >>> 24;
            i2 = i128 & ViewCompat.MEASURED_SIZE_MASK;
            if (i != 0) {
                int i129 = i118 + 113;
                int i1210 = i129 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1210;
                int i1211 = i129 % 2;
                i3 = ((i1210 | 19) << 1) - (i1210 ^ 19);
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    int i1212 = 4 / 2;
                }
                i4 = i;
                z = true;
            } else {
                int i1213 = i118 + 99;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1213 % 128;
                int i1214 = i1213 % 2;
                i4 = i;
                z = false;
            }
        }
        int i130 = !(z ^ true) ? 1 : 0;
        if (z) {
            int i131 = b + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i131 % 128;
            if (i131 % 2 != 0) {
                int i132 = 67 / 0;
                if (i2 < methodArr.length) {
                    method = methodArr[i2];
                    if (method != null) {
                        string = method.toString();
                    }
                }
            } else if (i2 < methodArr.length) {
                method = methodArr[i2];
                if (method != null) {
                    string = method.toString();
                }
            }
            string = null;
        } else {
            string = null;
        }
        list.add(string);
        int i133 = b;
        int i134 = (i133 ^ 103) + ((i133 & 103) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i134 % 128;
        int i135 = i134 % 2;
        return (i4 + 6) * i130;
    }
}
