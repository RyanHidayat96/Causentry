package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class onActionModeFinished implements Function0 {
    private static final byte[] $$c = {115, 98, 19, 9};
    private static final int $$f = 211;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {14, 70, 6, -35, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 82;
    private static final byte[] $$a = {6, -86, -9, -124, 1, 31, -11, 33, -64, 63, 25, 17, 1, 14, 5, -55, 31, 48, 17, 2, 7, 23, 21, -31, 45, 15, -3, 21};
    private static final int $$b = 217;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722257;

    private static void a(int i, int i2, short s, Object[] objArr) {
        int i3 = 106 - (i * 6);
        int i4 = (s * 18) + 4;
        int i5 = i2 * 12;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[19 - i5];
        int i6 = 18 - i5;
        int i7 = -1;
        if (bArr == null) {
            int i8 = i4 + i3;
            int i9 = i4 + 1;
            int i10 = i8 - 10;
            i7 = -1;
            i4 = i9;
            i3 = i10;
        }
        while (true) {
            int i11 = i7 + 1;
            bArr2[i11] = (byte) i3;
            if (i11 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = i11;
            i4++;
            i3 = (i3 + bArr[i4]) - 10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 84
            int r6 = r6 * 52
            int r0 = r6 + 1
            byte[] r1 = defpackage.onActionModeFinished.$$d
            int r7 = r7 * 52
            int r7 = 55 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onActionModeFinished.c(int, short, short, java.lang.Object[]):void");
    }

    private static void d(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int i5 = $10 + 21;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 3291 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength("") + 31, 1199271174, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), 651 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44, -450685997, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            int i8 = $10 + 61;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i10 = $10 + 21;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i11 = $11 + 59;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), Color.alpha(0) + 651, 44 - View.MeasureSpec.makeMeasureSpec(0, 0), -450685997, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = b + 87;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 105;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0cda A[PHI: r0 r1
  0x0cda: PHI (r0v105 int) = (r0v104 int), (r0v117 int) binds: [B:118:0x0cd8, B:115:0x0ccb] A[DONT_GENERATE, DONT_INLINE]
  0x0cda: PHI (r1v215 int) = (r1v214 int), (r1v228 int) binds: [B:118:0x0cd8, B:115:0x0ccb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x0ce6 A[PHI: r0 r1
  0x0ce6: PHI (r0v114 int) = (r0v104 int), (r0v117 int) binds: [B:118:0x0cd8, B:115:0x0ccb] A[DONT_GENERATE, DONT_INLINE]
  0x0ce6: PHI (r1v226 int) = (r1v214 int), (r1v228 int) binds: [B:118:0x0cd8, B:115:0x0ccb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x0d3e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0ac5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0ac5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x011b A[PHI: r2
  0x011b: PHI (r2v10 java.lang.reflect.Method[]) = (r2v9 java.lang.reflect.Method[]), (r2v16 java.lang.reflect.Method[]) binds: [B:14:0x0119, B:8:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0142  */
    /* JADX WARN: Code duplicated, block: B:32:0x047a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0486  */
    /* JADX WARN: Code duplicated, block: B:37:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x05a3 A[Catch: all -> 0x0ae5, TRY_ENTER, TryCatch #0 {all -> 0x0ae5, blocks: (B:18:0x0154, B:20:0x01bb, B:22:0x0247, B:24:0x02a6, B:26:0x033d, B:28:0x0388, B:30:0x0450, B:35:0x0488, B:41:0x0535, B:44:0x05a3, B:46:0x05e4, B:50:0x065c, B:52:0x06d0, B:54:0x0705, B:45:0x05c3, B:38:0x04b3), top: B:143:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x05c3 A[Catch: all -> 0x0ae5, TryCatch #0 {all -> 0x0ae5, blocks: (B:18:0x0154, B:20:0x01bb, B:22:0x0247, B:24:0x02a6, B:26:0x033d, B:28:0x0388, B:30:0x0450, B:35:0x0488, B:41:0x0535, B:44:0x05a3, B:46:0x05e4, B:50:0x065c, B:52:0x06d0, B:54:0x0705, B:45:0x05c3, B:38:0x04b3), top: B:143:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0657  */
    /* JADX WARN: Code duplicated, block: B:99:0x0af2 A[PHI: r2
  0x0af2: PHI (r2v15 java.lang.reflect.Method[]) = (r2v9 java.lang.reflect.Method[]), (r2v16 java.lang.reflect.Method[]) binds: [B:14:0x0119, B:8:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) throws Throwable {
        Method[] methodArr;
        Method[] declaredMethods;
        int length;
        int i;
        int i2;
        Method method;
        Object[] objArr;
        Class<?> cls;
        String str;
        Class<?>[] clsArr;
        int i3;
        Class cls2;
        int iMyTid;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4;
        int i5;
        int i6;
        boolean z;
        Class<?> cls3;
        int i7;
        int i8;
        int i9;
        int jumpTapTimeout;
        int i10;
        int i11;
        int i12;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i13;
        Object[] objArr2;
        Object[] objArr3;
        int i14;
        Long l;
        int i15;
        int i16;
        int i17;
        boolean z2;
        boolean z3;
        int i18;
        String string;
        int i19 = 2 % 2;
        int i20 = b;
        int i21 = 1;
        int i22 = (i20 ^ 7) + ((i20 & 7) << 1);
        TuitionPaymentFragmentbindingInflater1 = i22 % 128;
        long j = 0;
        int i23 = 0;
        try {
            if (i22 % 2 != 0) {
                methodArr = new Method[1];
                byte[] bArr = $$a;
                byte b2 = (byte) (bArr[4] - 1);
                byte b3 = b2;
                Object[] objArr4 = new Object[1];
                a(b2, b3, b3, objArr4);
                Class<?> cls4 = Class.forName((String) objArr4[0]);
                byte b4 = bArr[4];
                byte b5 = b4;
                Object[] objArr5 = new Object[1];
                a(b4, b5, b5, objArr5);
                String str2 = (String) objArr5[0];
                Class<?>[] clsArr2 = new Class[5];
                clsArr2[1] = byte[].class;
                clsArr2[0] = Integer.TYPE;
                clsArr2[4] = Integer.TYPE;
                methodArr[1] = cls4.getMethod(str2, clsArr2);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                    int gidForName = 2822 - Process.getGidForName("");
                    int defaultSize = 22 - View.getDefaultSize(0, 0);
                    byte[] bArr2 = $$d;
                    byte b6 = bArr2[5];
                    Object[] objArr6 = new Object[1];
                    c(b6, b6, bArr2[7], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, gidForName, defaultSize, 1814927978, false, (String) objArr6[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                    declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 2822 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 22 - View.getDefaultSize(0, 0))).getDeclaredMethods();
                    length = declaredMethods.length;
                    i = 0;
                    while (i < length) {
                        method = declaredMethods[i];
                        int i24 = TuitionPaymentFragmentbindingInflater1;
                        int i25 = (i24 ^ 113) + ((i24 & 113) << i21);
                        b = i25 % 128;
                        int i26 = i25 % 2;
                        try {
                            int i27 = 238 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1));
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(i23);
                            int i28 = (bitsPerPixel ^ 25) + ((bitsPerPixel & 25) << i21);
                            int defaultSize2 = View.getDefaultSize(i23, i23);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i29 = defaultSize2 * (-109);
                            int i30 = (i29 ^ 2553) + ((i29 & 2553) << i21);
                            int i31 = ~defaultSize2;
                            int i32 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ 23) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & 23);
                            int i33 = ~i32;
                            int i34 = (i30 - (~(-(-(((i31 ^ i33) | (i31 & i33)) * (-220)))))) - i21;
                            int i35 = ~((defaultSize2 ^ 23) | (defaultSize2 & 23));
                            int i36 = ~i32;
                            int i37 = (i34 - (~(((i35 & i36) | (i35 ^ i36)) * 220))) - i21;
                            int i38 = ~((~defaultSize2) | 23);
                            int i39 = b + 35;
                            TuitionPaymentFragmentbindingInflater1 = i39 % 128;
                            int i40 = i39 % 2;
                            int i41 = ~((-24) | defaultSize2);
                            int i42 = i37 + (110 * ((i38 & i41) | (i38 ^ i41)));
                            Object[] objArr7 = new Object[i21];
                            d(false, i27, i28, i42, new char[]{1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n'}, objArr7);
                            Class<?> cls5 = Class.forName((String) objArr7[i23]);
                            int i43 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i44 = i43 * (-495);
                            int i45 = (i44 & (-121275)) + (i44 | (-121275));
                            int i46 = ~i43;
                            int i47 = ~(i46 | (-246));
                            int i48 = ~i43;
                            int i49 = ~((i48 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i48 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                            int i50 = -(-(((i47 ^ i49) | (i49 & i47)) * 992));
                            int i51 = ((i45 | i50) << i21) - (i45 ^ i50);
                            int i52 = ~((i48 & (-246)) | (i48 ^ (-246)));
                            int i53 = TuitionPaymentFragmentbindingInflater1;
                            int i54 = ((i53 | 23) << 1) - (i53 ^ 23);
                            b = i54 % 128;
                            int i55 = i54 % 2;
                            int i56 = ((i46 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i46 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6)) ^ (-1);
                            int i57 = (i52 & i56) | (i52 ^ i56);
                            int i58 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                            int i59 = (i43 & i58) | (i58 ^ i43);
                            int i60 = ~((i59 & 245) | (i59 ^ 245));
                            int i61 = (-496) * ((i57 & i60) | (i57 ^ i60));
                            int i62 = (((i51 | i61) << i21) - (i61 ^ i51)) + (((245 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & 245)) * 496);
                            int defaultSize3 = View.getDefaultSize(i23, i23);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i63 = defaultSize3 * 302;
                            int i64 = ((i63 | 7236) << i21) - (i63 ^ 7236);
                            int i65 = ~defaultSize3;
                            int i66 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                            int i67 = (i64 - (~(-(-(((~((i65 & i66) | (i65 ^ i66))) | 12) * (-602)))))) - i21;
                            int i68 = ~defaultSize3;
                            int i69 = ~((i68 ^ (-13)) | (i68 & (-13)));
                            int i70 = ~((i68 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i68 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                            int i71 = TuitionPaymentFragmentbindingInflater1;
                            int i72 = ((i71 | 41) << 1) - (i71 ^ 41);
                            b = i72 % 128;
                            int i73 = i72 % 2;
                            int i74 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                            int i75 = defaultSize3 | i74;
                            int i76 = (i67 - (~(-(-((-301) * ((~((i75 & 12) | (i75 ^ 12))) | ((i70 & i69) | (i69 ^ i70)))))))) - i21;
                            int i77 = (~((i74 ^ 12) | (i74 & 12))) * 301;
                            int i78 = (i76 ^ i77) + ((i77 & i76) << i21);
                            int i79 = -TextUtils.getCapsMode("", 0, 0);
                            Object[] objArr8 = new Object[i21];
                            d(false, i62, i78, (i79 ^ 5) + ((i79 & 5) << i21), new char[]{65534, 1, 65533, '\n', 11, 65535, 65533, '\f', 65509, 7, 65532, 1}, objArr8);
                            int iIntValue = ((Integer) cls5.getMethod((String) objArr8[0], null).invoke(method, null)).intValue();
                            objArr = new Object[i21];
                            objArr[0] = Integer.valueOf(iIntValue);
                            int i80 = -ImageFormat.getBitsPerPixel(0);
                            int i81 = (i80 & 237) + (i80 | 237);
                            int i82 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i83 = TuitionPaymentFragmentbindingInflater1 + 11;
                            b = i83 % 128;
                            int i84 = i83 % 2;
                            int i85 = (-500) * i82;
                            int i86 = ((i85 | (-13500)) << i21) - (i85 ^ (-13500));
                            int i87 = ~(((-28) & i82) | ((-28) ^ i82));
                            int i88 = ~i82;
                            int i89 = i88 | 27;
                            int i90 = ~((i89 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i89 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                            int i91 = (((i86 - (~(-(-(((i87 & i90) | (i87 ^ i90)) * TypedValues.PositionType.TYPE_TRANSITION_EASING))))) - i21) - (~(-(-((~((i88 ^ (-28)) | (i88 & (-28)))) * 1002))))) - i21;
                            int i92 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                            int i93 = i91 + ((~((i88 & i92) | (i88 ^ i92) | 27)) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i94 = TuitionPaymentFragmentbindingInflater1;
                            int i95 = (i94 ^ 75) + ((i94 & 75) << i21);
                            b = i95 % 128;
                            int i96 = i95 % 2;
                            int i97 = (iResolveSizeAndState * (-391)) - 585;
                            int i98 = ~(((-4) & iResolveSizeAndState) | ((-4) ^ iResolveSizeAndState));
                            int i99 = ~(3 | iTuitionPaymentFragmentspecialinlinedviewModeldefault9);
                            int i100 = ((i98 & i99) | (i98 ^ i99)) * (-196);
                            int i101 = (((i97 | i100) << i21) - (i97 ^ i100)) + (((iResolveSizeAndState ^ 3) | (iResolveSizeAndState & 3)) * 392);
                            int i102 = ~((~iResolveSizeAndState) | (-4));
                            int i103 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & 3) | (3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                            int i104 = i101 + (((i103 & i102) | (i102 ^ i103)) * 196);
                            Object[] objArr9 = new Object[i21];
                            d(false, i81, i93, i104, new char[]{'\b', 4, 17, '\t', 0, 21, 0, 65485, 11, 0, '\r', 6, 65485, 17, 4, 5, 11, 4, 2, 19, 65485, 65516, 14, 3, '\b', 5}, objArr9);
                            cls = Class.forName((String) objArr9[0]);
                            int iArgb = Color.argb(0, 0, 0, 0);
                            int i105 = (iArgb & 245) + (iArgb | 245);
                            int i106 = -View.MeasureSpec.getMode(0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i107 = i106 * (-300);
                            int i108 = ((i107 | 2416) << i21) - (i107 ^ 2416);
                            int i109 = i106 | 8;
                            int i110 = -(-((~((i109 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i109 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10))) * (-301)));
                            int i111 = ((i108 | i110) << i21) - (i110 ^ i108);
                            int i112 = ~(((-9) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | ((-9) & iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                            int i113 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | i106);
                            int i114 = ((i112 & i113) | (i112 ^ i113)) * (-301);
                            int i115 = (i111 & i114) + (i114 | i111);
                            int i116 = ~i106;
                            int i117 = ~((i116 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i116 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                            int i118 = -(-(((i117 & (-9)) | ((-9) ^ i117)) * 301));
                            int i119 = ((i115 | i118) << i21) - (i118 ^ i115);
                            int i120 = -ExpandableListView.getPackedPositionChild(0L);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i121 = i120 * (-375);
                            int i122 = ((i121 | (-1125)) << i21) - (i121 ^ (-1125));
                            MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i123 = ~i120;
                            int i124 = ~((i123 ^ (-4)) | (i123 & (-4)));
                            int i125 = -(-(376 * ((i124 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault11 ^ i124) | (~((i120 ^ 3) | (i120 & 3))))));
                            int i126 = (i122 & i125) + (i122 | i125);
                            int i127 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                            int i128 = ~((i127 & i120) | (i127 ^ i120));
                            int i129 = ~(i120 | 3);
                            int i130 = -(-(((i129 & i128) | (i128 ^ i129)) * (-376)));
                            int i131 = (i126 & i130) + (i130 | i126);
                            int i132 = ~(i123 | iTuitionPaymentFragmentspecialinlinedviewModeldefault11);
                            int i133 = (i131 - (~(-(-(((i132 & 3) | (3 ^ i132)) * 376))))) - 1;
                            Object[] objArr10 = new Object[i21];
                            d(false, i105, i119, i133, new char[]{'\f', 1, 14, 65533, 1, 11, 65510, 65529}, objArr10);
                            str = (String) objArr10[0];
                            clsArr = new Class[i21];
                            clsArr[0] = Integer.TYPE;
                            if (((Boolean) cls.getMethod(str, clsArr).invoke(null, objArr)).booleanValue()) {
                                i3 = TuitionPaymentFragmentbindingInflater1 + 13;
                                b = i3 % 128;
                                if (i3 % 2 == 0) {
                                    cls2 = Long.TYPE;
                                    int jumpTapTimeout2 = 17171 % (ViewConfiguration.getJumpTapTimeout() / 88);
                                    int keyRepeatDelay = 26 % (ViewConfiguration.getKeyRepeatDelay() >> 119);
                                    int iMyTid2 = Process.myTid();
                                    iMyTid = ((iMyTid2 | 22) << i21) - (iMyTid2 ^ 22);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    i6 = 127;
                                    z = i21;
                                    i4 = jumpTapTimeout2;
                                    i5 = keyRepeatDelay;
                                } else {
                                    cls2 = Long.TYPE;
                                    int i134 = 236 - (~(-(-(ViewConfiguration.getJumpTapTimeout() >> 16))));
                                    int i135 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    int i136 = ((i135 | 24) << i21) - (i135 ^ 24);
                                    iMyTid = Process.myTid() >> 22;
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    i4 = i134;
                                    i5 = i136;
                                    i6 = 23;
                                    z = 0;
                                }
                                int i137 = ((-751) * iMyTid) + (i6 * (-751));
                                int i138 = ~iMyTid;
                                int i139 = ~i6;
                                int i140 = ~((i138 & i139) | (i138 ^ i139));
                                int i141 = ~iMyTid;
                                int i142 = ~((i141 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i141 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                int i143 = ((i140 ^ i142) | (i140 & i142)) * 1504;
                                int i144 = ((i137 | i143) << i21) - (i137 ^ i143);
                                int i145 = TuitionPaymentFragmentbindingInflater1;
                                int i146 = (i145 ^ 39) + ((i145 & 39) << i21);
                                b = i146 % 128;
                                int i147 = i146 % 2;
                                int i148 = i141 | i6;
                                int i149 = (i144 - (~((-1504) * (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i148) | (i148 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3)))))) - i21;
                                int i150 = ~((i141 ^ i6) | (i141 & i6));
                                int i151 = ~((i139 ^ iMyTid) | (i139 & iMyTid));
                                int i152 = -(-(((i150 & i151) | (i150 ^ i151)) * 752));
                                int i153 = (i149 & i152) + (i152 | i149);
                                Object[] objArr11 = new Object[i21];
                                d(z, i4, i5, i153, new char[]{1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n'}, objArr11);
                                cls3 = Class.forName((String) objArr11[0]);
                                int i154 = 246 - (~View.getDefaultSize(0, 0));
                                int i155 = -(ViewConfiguration.getTapTimeout() >> 16);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i156 = i155 * 934;
                                int i157 = (i156 ^ (-12116)) + ((i156 & (-12116)) << i21);
                                int i158 = ~i155;
                                int i159 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                int i160 = ~((i158 & i159) | (i158 ^ i159));
                                int i161 = i157 + (((i160 & (-14)) | ((-14) ^ i160)) * (-933));
                                int i162 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                int i163 = ~((i162 & (-14)) | ((-14) ^ i162));
                                int i164 = ~(((-14) ^ i155) | ((-14) & i155));
                                int i165 = -(-(((i163 & i164) | (i163 ^ i164)) * 933));
                                i7 = ((i161 | i165) << i21) - (i165 ^ i161);
                                int i166 = TuitionPaymentFragmentbindingInflater1 + 15;
                                b = i166 % 128;
                                i8 = i166 % 2;
                                i9 = ~(i155 | 13);
                                if (i8 == 0) {
                                    int i167 = (i7 - (~(-(933 / i9)))) - i21;
                                    jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() << 67;
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    i10 = (755 >>> jumpTapTimeout) << (-771072);
                                    int i168 = ~jumpTapTimeout;
                                    i11 = (i168 ^ 10) | (i168 & 10);
                                    i12 = i167;
                                    i13 = 10;
                                } else {
                                    int i169 = i9 * 933;
                                    int i170 = (i7 ^ i169) + ((i169 & i7) << i21);
                                    jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    i10 = (jumpTapTimeout * 755) - 5271;
                                    int i171 = ~jumpTapTimeout;
                                    i11 = (i171 ^ 7) | (i171 & 7);
                                    i12 = i170;
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                    i13 = 7;
                                }
                                int i172 = ~i11;
                                int i173 = ~jumpTapTimeout;
                                int i174 = ~((i173 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i173 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                int i175 = (i172 ^ i174) | (i174 & i172);
                                int i176 = ~((i13 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i13 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                int i177 = (-754) * ((i175 ^ i176) | (i175 & i176));
                                int i178 = (i10 ^ i177) + ((i10 & i177) << 1);
                                int i179 = (i173 ^ i13) | (i173 & i13);
                                int i180 = ~((i179 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i179 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                int i181 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                int i182 = (jumpTapTimeout & i181) | (i181 ^ jumpTapTimeout);
                                int i183 = ((~((i182 & i13) | (i182 ^ i13))) | i180) * (-754);
                                int i184 = (i178 & i183) + (i178 | i183);
                                int i185 = -(-(((i173 ^ i181) | (i173 & i181)) * 754));
                                objArr2 = new Object[1];
                                d(true, i154, i12, (i184 & i185) + (i185 | i184), new char[]{11, '\n', 65531, 65512, '\n', 65531, 65533, 65531, 6, 15, 65514, 4, '\b'}, objArr2);
                                if (cls2.equals(cls3.getMethod((String) objArr2[0], null).invoke(method, null))) {
                                    int iLastIndexOf = 236 - TextUtils.lastIndexOf("", '0', 0, 0);
                                    int iRgb = Color.rgb(0, 0, 0);
                                    int i186 = ((iRgb | 16777240) << 1) - (iRgb ^ 16777240);
                                    int i187 = -Color.argb(0, 0, 0, 0);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i188 = TuitionPaymentFragmentbindingInflater1;
                                    int i189 = (i188 ^ 39) + ((i188 & 39) << 1);
                                    b = i189 % 128;
                                    int i190 = i189 % 2;
                                    int i191 = (592 * i187) - 13570;
                                    int i192 = ~i187;
                                    int i193 = (~((i192 & 23) | (i192 ^ 23))) * (-1182);
                                    int i194 = ((i191 | i193) << 1) - (i191 ^ i193);
                                    int i195 = ~i187;
                                    int i196 = (i195 ^ (-24)) | (i195 & (-24));
                                    int i197 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                                    int i198 = ~((i196 & i197) | (i196 ^ i197));
                                    int i199 = ~((i187 & 23) | (i187 ^ 23));
                                    int i200 = (i194 - (~(-(-(((i199 & i198) | (i198 ^ i199)) * (-591)))))) - 1;
                                    int i201 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault14 ^ i195) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault14 & i195);
                                    int i202 = ((i201 & (-24)) | (i201 ^ (-24))) * 591;
                                    int i203 = (i200 ^ i202) + ((i202 & i200) << 1);
                                    Object[] objArr12 = new Object[1];
                                    d(false, iLastIndexOf, i186, i203, new char[]{1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n'}, objArr12);
                                    Class<?> cls6 = Class.forName((String) objArr12[0]);
                                    int i204 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    int i205 = (i204 ^ 245) + ((i204 & 245) << 1);
                                    int i206 = b + 55;
                                    TuitionPaymentFragmentbindingInflater1 = i206 % 128;
                                    int i207 = i206 % 2;
                                    int longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i208 = longPressTimeout * 71;
                                    int i209 = (i208 & (-1173)) + (i208 | (-1173));
                                    int i210 = ~longPressTimeout;
                                    int i211 = ~((i210 ^ 17) | (i210 & 17));
                                    int i212 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault15 ^ 17) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & 17));
                                    int i213 = ((i211 & i212) | (i211 ^ i212)) * (-140);
                                    int i214 = (i209 & i213) + (i209 | i213);
                                    int i215 = (longPressTimeout ^ 17) | (longPressTimeout & 17);
                                    int i216 = -(-((~((i215 & iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | (i215 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15))) * 70));
                                    int i217 = ((i214 | i216) << 1) - (i216 ^ i214);
                                    int i218 = ~(i210 | 17);
                                    int i219 = ~((-18) | longPressTimeout);
                                    int i220 = (i218 & i219) | (i218 ^ i219);
                                    int i221 = ~((longPressTimeout & iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | (longPressTimeout ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15));
                                    int i222 = -(-(((i221 & i220) | (i220 ^ i221)) * 70));
                                    int i223 = (i217 & i222) + (i222 | i217);
                                    int i224 = -Color.blue(0);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault16 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i225 = i224 * 659;
                                    int i226 = (i225 & (-10512)) + (i225 | (-10512));
                                    int i227 = ~i224;
                                    int i228 = ~((i227 & 16) | (i227 ^ 16));
                                    int i229 = ~(((-17) & i224) | ((-17) ^ i224));
                                    int i230 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault16 & i224) | (i224 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault16);
                                    int i231 = i226 + (((i228 & i229) | (i228 ^ i229) | (~i230)) * (-658));
                                    int i232 = ~((i224 & (-17)) | ((-17) ^ i224));
                                    int i233 = -(-(i232 * 658));
                                    int i234 = ((i231 | i233) << 1) - (i233 ^ i231);
                                    int i235 = ~i230;
                                    int i236 = -(-(((i232 & i235) | (i232 ^ i235)) * 658));
                                    Object[] objArr13 = new Object[1];
                                    d(true, i205, i223, (i234 & i236) + (i236 | i234), new char[]{65533, '\b', 17, 65516, '\n', 65533, '\f', 65533, 5, 65529, '\n', 65529, 65512, '\f', 65533, 65535, 11}, objArr13);
                                    objArr3 = (Object[]) cls6.getMethod((String) objArr13[0], null).invoke(method, null);
                                    if (objArr3.length == 2 && Long.TYPE.equals(objArr3[0])) {
                                        int i237 = -Color.argb(0, 0, 0, 0);
                                        int i238 = ((i237 | 237) << 1) - (i237 ^ 237);
                                        int i239 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                        int i240 = (i239 & 24) + (i239 | 24);
                                        int i241 = -(KeyEvent.getMaxKeyCode() >> 16);
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault17 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i242 = (i241 * 236) + 10833;
                                        int i243 = ~i241;
                                        int i244 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault17;
                                        int i245 = ~((i244 & i243) | (i243 ^ i244));
                                        int i246 = TuitionPaymentFragmentbindingInflater1;
                                        int i247 = (i246 ^ 123) + ((i246 & 123) << 1);
                                        b = i247 % 128;
                                        if (i247 % 2 == 0) {
                                            i14 = i242 >>> ((-235) >> ((i245 & 23) | (i245 ^ 23)));
                                        } else {
                                            int i248 = -(-(((i245 ^ 23) | (i245 & 23)) * (-235)));
                                            i14 = ((i242 & i248) << 1) + (i242 ^ i248);
                                            i243 = ~i241;
                                        }
                                        int i249 = ~((i243 & iTuitionPaymentFragmentspecialinlinedviewModeldefault17) | (i243 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault17));
                                        int i250 = -(-((-470) * ((i249 & 23) | (i249 ^ 23))));
                                        int i251 = ((i14 | i250) << 1) - (i14 ^ i250);
                                        int i252 = ~(((-24) & i241) | ((-24) ^ i241));
                                        int i253 = ~i241;
                                        int i254 = (i253 & 23) | (i253 ^ 23);
                                        int i255 = ~((i254 & iTuitionPaymentFragmentspecialinlinedviewModeldefault17) | (i254 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault17));
                                        int i256 = ((i255 & i252) | (i252 ^ i255)) * 235;
                                        Object[] objArr14 = new Object[1];
                                        d(false, i238, i240, (i251 & i256) + (i256 | i251), new char[]{1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n'}, objArr14);
                                        if (!(!Class.forName((String) objArr14[0]).equals(objArr3[1]))) {
                                            int i257 = TuitionPaymentFragmentbindingInflater1;
                                            int i258 = (i257 & 87) + (i257 | 87);
                                            b = i258 % 128;
                                            if (i258 % 2 == 0) {
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                    int i259 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2823;
                                                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 22;
                                                    byte[] bArr3 = $$d;
                                                    byte b7 = bArr3[5];
                                                    Object[] objArr15 = new Object[1];
                                                    c(b7, b7, bArr3[7], objArr15);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout, i259, offsetAfter, 1814927978, false, (String) objArr15[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                                                    int maximumDrawingCacheSize = 2823 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                    int scrollBarSize = 22 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                    byte[] bArr4 = $$d;
                                                    byte b8 = bArr4[5];
                                                    Object[] objArr16 = new Object[1];
                                                    c(b8, b8, bArr4[7], objArr16);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, maximumDrawingCacheSize, scrollBarSize, 1814927978, false, (String) objArr16[0], null);
                                                }
                                                Object[] objArr17 = {1L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                                                    int scrollBarSize2 = 2823 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                                                    byte[] bArr5 = $$d;
                                                    byte b9 = bArr5[7];
                                                    Object[] objArr18 = new Object[1];
                                                    c(b9, b9, bArr5[10], objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, scrollBarSize2, threadPriority, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                l = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr17);
                                            } else {
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                    char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                                    int i260 = 2824 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                    int i261 = 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                    byte[] bArr6 = $$d;
                                                    byte b10 = bArr6[5];
                                                    Object[] objArr19 = new Object[1];
                                                    c(b10, b10, bArr6[7], objArr19);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i260, i261, 1814927978, false, (String) objArr19[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, method);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2823;
                                                    int i262 = 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                    byte[] bArr7 = $$d;
                                                    byte b11 = bArr7[5];
                                                    Object[] objArr20 = new Object[1];
                                                    c(b11, b11, bArr7[7], objArr20);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, scrollDefaultDelay, i262, 1814927978, false, (String) objArr20[0], null);
                                                }
                                                Object[] objArr21 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                    char c3 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                                    int iRgb2 = Color.rgb(0, 0, 0) + 16780039;
                                                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 23;
                                                    byte[] bArr8 = $$d;
                                                    byte b12 = bArr8[7];
                                                    Object[] objArr22 = new Object[1];
                                                    c(b12, b12, bArr8[10], objArr22);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, iRgb2, iLastIndexOf2, -2137287382, false, (String) objArr22[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                l = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21);
                                            }
                                            l.longValue();
                                            break;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i = ((i | 1) << 1) - (i ^ 1);
                            int i263 = b + 95;
                            TuitionPaymentFragmentbindingInflater1 = i263 % 128;
                            int i264 = i263 % 2;
                            i21 = 1;
                            j = 0;
                            i23 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    i2 = -2001519171;
                } else {
                    i2 = -2001519171;
                }
            } else {
                byte[] bArr9 = $$a;
                byte b13 = (byte) (bArr9[4] - 1);
                byte b14 = b13;
                Object[] objArr23 = new Object[1];
                a(b13, b14, b14, objArr23);
                Class<?> cls7 = Class.forName((String) objArr23[0]);
                byte b15 = bArr9[4];
                byte b16 = b15;
                Object[] objArr24 = new Object[1];
                a(b15, b16, b16, objArr24);
                methodArr = new Method[]{cls7.getMethod((String) objArr24[0], byte[].class, Integer.TYPE, Integer.TYPE)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int scrollBarFadeDuration = 2823 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iAxisFromString = MotionEvent.axisFromString("") + 23;
                    byte[] bArr10 = $$d;
                    byte b17 = bArr10[5];
                    Object[] objArr25 = new Object[1];
                    c(b17, b17, bArr10[7], objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cKeyCodeFromString, scrollBarFadeDuration, iAxisFromString, 1814927978, false, (String) objArr25[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null) == null) {
                    declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 2822 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 22 - View.getDefaultSize(0, 0))).getDeclaredMethods();
                    length = declaredMethods.length;
                    i = 0;
                    while (i < length) {
                        method = declaredMethods[i];
                        int i265 = TuitionPaymentFragmentbindingInflater1;
                        int i266 = (i265 ^ 113) + ((i265 & 113) << i21);
                        b = i266 % 128;
                        int i267 = i266 % 2;
                        int i268 = 238 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1));
                        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(i23);
                        int i269 = (bitsPerPixel2 ^ 25) + ((bitsPerPixel2 & 25) << i21);
                        int defaultSize4 = View.getDefaultSize(i23, i23);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault18 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i270 = defaultSize4 * (-109);
                        int i310 = (i270 ^ 2553) + ((i270 & 2553) << i21);
                        int i311 = ~defaultSize4;
                        int i312 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault18 ^ 23) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault18 & 23);
                        int i313 = ~i312;
                        int i314 = (i310 - (~(-(-(((i311 ^ i313) | (i311 & i313)) * (-220)))))) - i21;
                        int i315 = ~((defaultSize4 ^ 23) | (defaultSize4 & 23));
                        int i316 = ~i312;
                        int i317 = (i314 - (~(((i315 & i316) | (i315 ^ i316)) * 220))) - i21;
                        int i318 = ~((~defaultSize4) | 23);
                        int i319 = b + 35;
                        TuitionPaymentFragmentbindingInflater1 = i319 % 128;
                        int i410 = i319 % 2;
                        int i411 = ~((-24) | defaultSize4);
                        int i412 = i317 + (110 * ((i318 & i411) | (i318 ^ i411)));
                        Object[] objArr26 = new Object[i21];
                        d(false, i268, i269, i412, new char[]{1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n'}, objArr26);
                        Class<?> cls8 = Class.forName((String) objArr26[i23]);
                        int i413 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault19 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i414 = i413 * (-495);
                        int i415 = (i414 & (-121275)) + (i414 | (-121275));
                        int i416 = ~i413;
                        int i417 = ~(i416 | (-246));
                        int i418 = ~i413;
                        int i419 = ~((i418 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault19) | (i418 & iTuitionPaymentFragmentspecialinlinedviewModeldefault19));
                        int i510 = -(-(((i417 ^ i419) | (i419 & i417)) * 992));
                        int i511 = ((i415 | i510) << i21) - (i415 ^ i510);
                        int i512 = ~((i418 & (-246)) | (i418 ^ (-246)));
                        int i513 = TuitionPaymentFragmentbindingInflater1;
                        int i514 = ((i513 | 23) << 1) - (i513 ^ 23);
                        b = i514 % 128;
                        int i515 = i514 % 2;
                        int i516 = ((i416 & iTuitionPaymentFragmentspecialinlinedviewModeldefault19) | (i416 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault19)) ^ (-1);
                        int i517 = (i512 & i516) | (i512 ^ i516);
                        int i518 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault19;
                        int i519 = (i413 & i518) | (i518 ^ i413);
                        int i610 = ~((i519 & 245) | (i519 ^ 245));
                        int i611 = (-496) * ((i517 & i610) | (i517 ^ i610));
                        int i612 = (((i511 | i611) << i21) - (i611 ^ i511)) + (((245 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault19) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault19 & 245)) * 496);
                        int defaultSize5 = View.getDefaultSize(i23, i23);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault20 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i613 = defaultSize5 * 302;
                        int i614 = ((i613 | 7236) << i21) - (i613 ^ 7236);
                        int i615 = ~defaultSize5;
                        int i616 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault20;
                        int i617 = (i614 - (~(-(-(((~((i615 & i616) | (i615 ^ i616))) | 12) * (-602)))))) - i21;
                        int i618 = ~defaultSize5;
                        int i619 = ~((i618 ^ (-13)) | (i618 & (-13)));
                        int i710 = ~((i618 & iTuitionPaymentFragmentspecialinlinedviewModeldefault20) | (i618 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault20));
                        int i711 = TuitionPaymentFragmentbindingInflater1;
                        int i712 = ((i711 | 41) << 1) - (i711 ^ 41);
                        b = i712 % 128;
                        int i713 = i712 % 2;
                        int i714 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault20;
                        int i715 = defaultSize5 | i714;
                        int i716 = (i617 - (~(-(-((-301) * ((~((i715 & 12) | (i715 ^ 12))) | ((i710 & i619) | (i619 ^ i710)))))))) - i21;
                        int i717 = (~((i714 ^ 12) | (i714 & 12))) * 301;
                        int i718 = (i716 ^ i717) + ((i717 & i716) << i21);
                        int i719 = -TextUtils.getCapsMode("", 0, 0);
                        Object[] objArr27 = new Object[i21];
                        d(false, i612, i718, (i719 ^ 5) + ((i719 & 5) << i21), new char[]{65534, 1, 65533, '\n', 11, 65535, 65533, '\f', 65509, 7, 65532, 1}, objArr27);
                        int iIntValue2 = ((Integer) cls8.getMethod((String) objArr27[0], null).invoke(method, null)).intValue();
                        objArr = new Object[i21];
                        objArr[0] = Integer.valueOf(iIntValue2);
                        int i810 = -ImageFormat.getBitsPerPixel(0);
                        int i811 = (i810 & 237) + (i810 | 237);
                        int i812 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault21 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i813 = TuitionPaymentFragmentbindingInflater1 + 11;
                        b = i813 % 128;
                        int i814 = i813 % 2;
                        int i815 = (-500) * i812;
                        int i816 = ((i815 | (-13500)) << i21) - (i815 ^ (-13500));
                        int i817 = ~(((-28) & i812) | ((-28) ^ i812));
                        int i818 = ~i812;
                        int i819 = i818 | 27;
                        int i910 = ~((i819 & iTuitionPaymentFragmentspecialinlinedviewModeldefault21) | (i819 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault21));
                        int i911 = (((i816 - (~(-(-(((i817 & i910) | (i817 ^ i910)) * TypedValues.PositionType.TYPE_TRANSITION_EASING))))) - i21) - (~(-(-((~((i818 ^ (-28)) | (i818 & (-28)))) * 1002))))) - i21;
                        int i912 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault21;
                        int i913 = i911 + ((~((i818 & i912) | (i818 ^ i912) | 27)) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                        int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault22 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i914 = TuitionPaymentFragmentbindingInflater1;
                        int i915 = (i914 ^ 75) + ((i914 & 75) << i21);
                        b = i915 % 128;
                        int i916 = i915 % 2;
                        int i917 = (iResolveSizeAndState2 * (-391)) - 585;
                        int i918 = ~(((-4) & iResolveSizeAndState2) | ((-4) ^ iResolveSizeAndState2));
                        int i919 = ~(3 | iTuitionPaymentFragmentspecialinlinedviewModeldefault22);
                        int i1010 = ((i918 & i919) | (i918 ^ i919)) * (-196);
                        int i1011 = (((i917 | i1010) << i21) - (i917 ^ i1010)) + (((iResolveSizeAndState2 ^ 3) | (iResolveSizeAndState2 & 3)) * 392);
                        int i1012 = ~((~iResolveSizeAndState2) | (-4));
                        int i1013 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault22 & 3) | (3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault22));
                        int i1014 = i1011 + (((i1013 & i1012) | (i1012 ^ i1013)) * 196);
                        Object[] objArr28 = new Object[i21];
                        d(false, i811, i913, i1014, new char[]{'\b', 4, 17, '\t', 0, 21, 0, 65485, 11, 0, '\r', 6, 65485, 17, 4, 5, 11, 4, 2, 19, 65485, 65516, 14, 3, '\b', 5}, objArr28);
                        cls = Class.forName((String) objArr28[0]);
                        int iArgb2 = Color.argb(0, 0, 0, 0);
                        int i1015 = (iArgb2 & 245) + (iArgb2 | 245);
                        int i1016 = -View.MeasureSpec.getMode(0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault110 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i1017 = i1016 * (-300);
                        int i1018 = ((i1017 | 2416) << i21) - (i1017 ^ 2416);
                        int i1019 = i1016 | 8;
                        int i1110 = -(-((~((i1019 & iTuitionPaymentFragmentspecialinlinedviewModeldefault110) | (i1019 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault110))) * (-301)));
                        int i1111 = ((i1018 | i1110) << i21) - (i1110 ^ i1018);
                        int i1112 = ~(((-9) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault110) | ((-9) & iTuitionPaymentFragmentspecialinlinedviewModeldefault110));
                        int i1113 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault110) | i1016);
                        int i1114 = ((i1112 & i1113) | (i1112 ^ i1113)) * (-301);
                        int i1115 = (i1111 & i1114) + (i1114 | i1111);
                        int i1116 = ~i1016;
                        int i1117 = ~((i1116 & iTuitionPaymentFragmentspecialinlinedviewModeldefault110) | (i1116 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault110));
                        int i1118 = -(-(((i1117 & (-9)) | ((-9) ^ i1117)) * 301));
                        int i1119 = ((i1115 | i1118) << i21) - (i1118 ^ i1115);
                        int i1210 = -ExpandableListView.getPackedPositionChild(0L);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault111 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i1211 = i1210 * (-375);
                        int i1212 = ((i1211 | (-1125)) << i21) - (i1211 ^ (-1125));
                        MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i1213 = ~i1210;
                        int i1214 = ~((i1213 ^ (-4)) | (i1213 & (-4)));
                        int i1215 = -(-(376 * ((i1214 & iTuitionPaymentFragmentspecialinlinedviewModeldefault111) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault111 ^ i1214) | (~((i1210 ^ 3) | (i1210 & 3))))));
                        int i1216 = (i1212 & i1215) + (i1212 | i1215);
                        int i1217 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault111;
                        int i1218 = ~((i1217 & i1210) | (i1217 ^ i1210));
                        int i1219 = ~(i1210 | 3);
                        int i1310 = -(-(((i1219 & i1218) | (i1218 ^ i1219)) * (-376)));
                        int i1311 = (i1216 & i1310) + (i1310 | i1216);
                        int i1312 = ~(i1213 | iTuitionPaymentFragmentspecialinlinedviewModeldefault111);
                        int i1313 = (i1311 - (~(-(-(((i1312 & 3) | (3 ^ i1312)) * 376))))) - 1;
                        Object[] objArr110 = new Object[i21];
                        d(false, i1015, i1119, i1313, new char[]{'\f', 1, 14, 65533, 1, 11, 65510, 65529}, objArr110);
                        str = (String) objArr110[0];
                        clsArr = new Class[i21];
                        clsArr[0] = Integer.TYPE;
                        if (((Boolean) cls.getMethod(str, clsArr).invoke(null, objArr)).booleanValue()) {
                            i3 = TuitionPaymentFragmentbindingInflater1 + 13;
                            b = i3 % 128;
                            if (i3 % 2 == 0) {
                                cls2 = Long.TYPE;
                                int jumpTapTimeout3 = 17171 % (ViewConfiguration.getJumpTapTimeout() / 88);
                                int keyRepeatDelay2 = 26 % (ViewConfiguration.getKeyRepeatDelay() >> 119);
                                int iMyTid3 = Process.myTid();
                                iMyTid = ((iMyTid3 | 22) << i21) - (iMyTid3 ^ 22);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                i6 = 127;
                                z = i21;
                                i4 = jumpTapTimeout3;
                                i5 = keyRepeatDelay2;
                            } else {
                                cls2 = Long.TYPE;
                                int i1314 = 236 - (~(-(-(ViewConfiguration.getJumpTapTimeout() >> 16))));
                                int i1315 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int i1316 = ((i1315 | 24) << i21) - (i1315 ^ 24);
                                iMyTid = Process.myTid() >> 22;
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                i4 = i1314;
                                i5 = i1316;
                                i6 = 23;
                                z = 0;
                            }
                            int i1317 = ((-751) * iMyTid) + (i6 * (-751));
                            int i1318 = ~iMyTid;
                            int i1319 = ~i6;
                            int i1410 = ~((i1318 & i1319) | (i1318 ^ i1319));
                            int i1411 = ~iMyTid;
                            int i1412 = ~((i1411 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i1411 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i1413 = ((i1410 ^ i1412) | (i1410 & i1412)) * 1504;
                            int i1414 = ((i1317 | i1413) << i21) - (i1317 ^ i1413);
                            int i1415 = TuitionPaymentFragmentbindingInflater1;
                            int i1416 = (i1415 ^ 39) + ((i1415 & 39) << i21);
                            b = i1416 % 128;
                            int i1417 = i1416 % 2;
                            int i1418 = i1411 | i6;
                            int i1419 = (i1414 - (~((-1504) * (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i1418) | (i1418 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3)))))) - i21;
                            int i1510 = ~((i1411 ^ i6) | (i1411 & i6));
                            int i1511 = ~((i1319 ^ iMyTid) | (i1319 & iMyTid));
                            int i1512 = -(-(((i1510 & i1511) | (i1510 ^ i1511)) * 752));
                            int i1513 = (i1419 & i1512) + (i1512 | i1419);
                            Object[] objArr111 = new Object[i21];
                            d(z, i4, i5, i1513, new char[]{1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n'}, objArr111);
                            cls3 = Class.forName((String) objArr111[0]);
                            int i1514 = 246 - (~View.getDefaultSize(0, 0));
                            int i1515 = -(ViewConfiguration.getTapTimeout() >> 16);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault112 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i1516 = i1515 * 934;
                            int i1517 = (i1516 ^ (-12116)) + ((i1516 & (-12116)) << i21);
                            int i1518 = ~i1515;
                            int i1519 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault112;
                            int i1610 = ~((i1518 & i1519) | (i1518 ^ i1519));
                            int i1611 = i1517 + (((i1610 & (-14)) | ((-14) ^ i1610)) * (-933));
                            int i1612 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault112;
                            int i1613 = ~((i1612 & (-14)) | ((-14) ^ i1612));
                            int i1614 = ~(((-14) ^ i1515) | ((-14) & i1515));
                            int i1615 = -(-(((i1613 & i1614) | (i1613 ^ i1614)) * 933));
                            i7 = ((i1611 | i1615) << i21) - (i1615 ^ i1611);
                            int i1616 = TuitionPaymentFragmentbindingInflater1 + 15;
                            b = i1616 % 128;
                            i8 = i1616 % 2;
                            i9 = ~(i1515 | 13);
                            if (i8 == 0) {
                                int i1617 = (i7 - (~(-(933 / i9)))) - i21;
                                jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() << 67;
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                i10 = (755 >>> jumpTapTimeout) << (-771072);
                                int i1618 = ~jumpTapTimeout;
                                i11 = (i1618 ^ 10) | (i1618 & 10);
                                i12 = i1617;
                                i13 = 10;
                            } else {
                                int i1619 = i9 * 933;
                                int i1710 = (i7 ^ i1619) + ((i1619 & i7) << i21);
                                jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault113 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                i10 = (jumpTapTimeout * 755) - 5271;
                                int i1711 = ~jumpTapTimeout;
                                i11 = (i1711 ^ 7) | (i1711 & 7);
                                i12 = i1710;
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = iTuitionPaymentFragmentspecialinlinedviewModeldefault113;
                                i13 = 7;
                            }
                            int i1712 = ~i11;
                            int i1713 = ~jumpTapTimeout;
                            int i1714 = ~((i1713 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i1713 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            int i1715 = (i1712 ^ i1714) | (i1714 & i1712);
                            int i1716 = ~((i13 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i13 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            int i1717 = (-754) * ((i1715 ^ i1716) | (i1715 & i1716));
                            int i1718 = (i10 ^ i1717) + ((i10 & i1717) << 1);
                            int i1719 = (i1713 ^ i13) | (i1713 & i13);
                            int i1810 = ~((i1719 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i1719 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            int i1811 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            int i1812 = (jumpTapTimeout & i1811) | (i1811 ^ jumpTapTimeout);
                            int i1813 = ((~((i1812 & i13) | (i1812 ^ i13))) | i1810) * (-754);
                            int i1814 = (i1718 & i1813) + (i1718 | i1813);
                            int i1815 = -(-(((i1713 ^ i1811) | (i1713 & i1811)) * 754));
                            objArr2 = new Object[1];
                            d(true, i1514, i12, (i1814 & i1815) + (i1815 | i1814), new char[]{11, '\n', 65531, 65512, '\n', 65531, 65533, 65531, 6, 15, 65514, 4, '\b'}, objArr2);
                            if (cls2.equals(cls3.getMethod((String) objArr2[0], null).invoke(method, null))) {
                                int iLastIndexOf3 = 236 - TextUtils.lastIndexOf("", '0', 0, 0);
                                int iRgb3 = Color.rgb(0, 0, 0);
                                int i1816 = ((iRgb3 | 16777240) << 1) - (iRgb3 ^ 16777240);
                                int i1817 = -Color.argb(0, 0, 0, 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault114 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i1818 = TuitionPaymentFragmentbindingInflater1;
                                int i1819 = (i1818 ^ 39) + ((i1818 & 39) << 1);
                                b = i1819 % 128;
                                int i1910 = i1819 % 2;
                                int i1911 = (592 * i1817) - 13570;
                                int i1912 = ~i1817;
                                int i1913 = (~((i1912 & 23) | (i1912 ^ 23))) * (-1182);
                                int i1914 = ((i1911 | i1913) << 1) - (i1911 ^ i1913);
                                int i1915 = ~i1817;
                                int i1916 = (i1915 ^ (-24)) | (i1915 & (-24));
                                int i1917 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault114;
                                int i1918 = ~((i1916 & i1917) | (i1916 ^ i1917));
                                int i1919 = ~((i1817 & 23) | (i1817 ^ 23));
                                int i2010 = (i1914 - (~(-(-(((i1919 & i1918) | (i1918 ^ i1919)) * (-591)))))) - 1;
                                int i2011 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault114 ^ i1915) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault114 & i1915);
                                int i2012 = ((i2011 & (-24)) | (i2011 ^ (-24))) * 591;
                                int i2013 = (i2010 ^ i2012) + ((i2012 & i2010) << 1);
                                Object[] objArr112 = new Object[1];
                                d(false, iLastIndexOf3, i1816, i2013, new char[]{1, 22, 1, 65486, '\f', 1, 14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n'}, objArr112);
                                Class<?> cls9 = Class.forName((String) objArr112[0]);
                                int i2014 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int i2015 = (i2014 ^ 245) + ((i2014 & 245) << 1);
                                int i2016 = b + 55;
                                TuitionPaymentFragmentbindingInflater1 = i2016 % 128;
                                int i2017 = i2016 % 2;
                                int longPressTimeout2 = ViewConfiguration.getLongPressTimeout() >> 16;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault115 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i2018 = longPressTimeout2 * 71;
                                int i2019 = (i2018 & (-1173)) + (i2018 | (-1173));
                                int i2110 = ~longPressTimeout2;
                                int i2111 = ~((i2110 ^ 17) | (i2110 & 17));
                                int i2112 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault115 ^ 17) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault115 & 17));
                                int i2113 = ((i2111 & i2112) | (i2111 ^ i2112)) * (-140);
                                int i2114 = (i2019 & i2113) + (i2019 | i2113);
                                int i2115 = (longPressTimeout2 ^ 17) | (longPressTimeout2 & 17);
                                int i2116 = -(-((~((i2115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault115) | (i2115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault115))) * 70));
                                int i2117 = ((i2114 | i2116) << 1) - (i2116 ^ i2114);
                                int i2118 = ~(i2110 | 17);
                                int i2119 = ~((-18) | longPressTimeout2);
                                int i2210 = (i2118 & i2119) | (i2118 ^ i2119);
                                int i2211 = ~((longPressTimeout2 & iTuitionPaymentFragmentspecialinlinedviewModeldefault115) | (longPressTimeout2 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault115));
                                int i2212 = -(-(((i2211 & i2210) | (i2210 ^ i2211)) * 70));
                                int i2213 = (i2117 & i2212) + (i2212 | i2117);
                                int i2214 = -Color.blue(0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault116 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i2215 = i2214 * 659;
                                int i2216 = (i2215 & (-10512)) + (i2215 | (-10512));
                                int i2217 = ~i2214;
                                int i2218 = ~((i2217 & 16) | (i2217 ^ 16));
                                int i2219 = ~(((-17) & i2214) | ((-17) ^ i2214));
                                int i2310 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault116 & i2214) | (i2214 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault116);
                                int i2311 = i2216 + (((i2218 & i2219) | (i2218 ^ i2219) | (~i2310)) * (-658));
                                int i2312 = ~((i2214 & (-17)) | ((-17) ^ i2214));
                                int i2313 = -(-(i2312 * 658));
                                int i2314 = ((i2311 | i2313) << 1) - (i2313 ^ i2311);
                                int i2315 = ~i2310;
                                int i2316 = -(-(((i2312 & i2315) | (i2312 ^ i2315)) * 658));
                                Object[] objArr113 = new Object[1];
                                d(true, i2015, i2213, (i2314 & i2316) + (i2316 | i2314), new char[]{65533, '\b', 17, 65516, '\n', 65533, '\f', 65533, 5, 65529, '\n', 65529, 65512, '\f', 65533, 65535, 11}, objArr113);
                                objArr3 = (Object[]) cls9.getMethod((String) objArr113[0], null).invoke(method, null);
                                if (objArr3.length == 2) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        i = ((i | 1) << 1) - (i ^ 1);
                        int i2610 = b + 95;
                        TuitionPaymentFragmentbindingInflater1 = i2610 % 128;
                        int i2611 = i2610 % 2;
                        i21 = 1;
                        j = 0;
                        i23 = 0;
                    }
                    i2 = -2001519171;
                } else {
                    i2 = -2001519171;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int scrollBarSize3 = 2823 - (ViewConfiguration.getScrollBarSize() >> 8);
                int iBlue = Color.blue(0) + 22;
                byte[] bArr11 = $$d;
                byte b18 = bArr11[5];
                Object[] objArr29 = new Object[1];
                c(b18, b18, bArr11[7], objArr29);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(minimumFlingVelocity, scrollBarSize3, iBlue, 1814927978, false, (String) objArr29[0], null);
            }
            Object[] objArr30 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 2824;
                int iMyTid4 = 22 - (Process.myTid() >> 22);
                byte[] bArr12 = $$d;
                byte b19 = bArr12[7];
                Object[] objArr31 = new Object[1];
                c(b19, b19, bArr12[0], objArr31);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cResolveSizeAndState, iIndexOf, iMyTid4, 1025296417, false, (String) objArr31[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr30);
            Object[] objArr32 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 37658);
                int keyRepeatDelay3 = 2720 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 19;
                byte[] bArr13 = $$d;
                byte b20 = bArr13[7];
                Object[] objArr33 = new Object[1];
                c(b20, b20, bArr13[0], objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(packedPositionChild, keyRepeatDelay3, iKeyCodeFromString, -1568796068, false, (String) objArr33[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr32)).longValue();
            long j2 = -931109650;
            long j3 = -375;
            long j4 = (j3 * j2) + (j3 * jLongValue);
            long j5 = 376;
            long jMyPid = Process.myPid();
            long j6 = -1;
            long j7 = j2 ^ j6;
            long j8 = (j2 | jLongValue) ^ j6;
            long j9 = j4 + ((jMyPid | ((j7 | (jLongValue ^ j6)) ^ j6) | j8) * j5) + (((long) (-376)) * ((((jMyPid ^ j6) | j2) ^ j6) | j8)) + (j5 * (jLongValue | ((j7 | jMyPid) ^ j6))) + ((long) (-879296195));
            int i271 = b + 107;
            TuitionPaymentFragmentbindingInflater1 = i271 % 128;
            int i272 = i271 % 2;
            int iNextInt = new Random().nextInt();
            int i273 = ~iNextInt;
            int i274 = ((int) (j9 >> 32)) & (((((~(i273 | (-1483846780))) | ((~(1373894105 | i273)) | 135266338)) * (-397)) - 22363606) + ((iNextInt | 160580002) * 397));
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i275 = ~iElapsedRealtime;
            int i276 = (-1687905466) + (((~(1426929366 | i275)) | (-10297044)) * (-90)) + (((~(1426929366 | iElapsedRealtime)) | 857810) * (-45)) + (((~(iElapsedRealtime | 10297043)) | 1426929366 | (~(i275 | (-10297044)))) * 45);
            int i277 = TuitionPaymentFragmentbindingInflater1;
            int i278 = (i277 & 21) + (i277 | 21);
            int i279 = i278 % 128;
            b = i279;
            int i280 = ((int) j9) & i276;
            if (i278 % 2 == 0) {
                int i281 = (i274 & i280) | (i274 ^ i280);
                i15 = i281 >> 43;
                i16 = i281 & ViewCompat.MEASURED_SIZE_MASK;
                if (i15 != 0) {
                    int i282 = i277 + 33;
                    b = i282 % 128;
                    int i283 = i282 % 2;
                    i17 = i15;
                    z2 = true;
                    z3 = true;
                } else {
                    int i284 = i279 ^ 29;
                    int i285 = i279 & 29;
                    z3 = true;
                    int i286 = i284 + (i285 << 1);
                    TuitionPaymentFragmentbindingInflater1 = i286 % 128;
                    int i287 = i286 % 2;
                    i17 = i15;
                    z2 = false;
                }
            } else {
                int i288 = (i274 & i280) | (i274 ^ i280);
                i15 = i288 >>> 24;
                i16 = i288 & ViewCompat.MEASURED_SIZE_MASK;
                if (i15 != 0) {
                    int i289 = i277 + 33;
                    b = i289 % 128;
                    int i2810 = i289 % 2;
                    i17 = i15;
                    z2 = true;
                    z3 = true;
                } else {
                    int i2811 = i279 ^ 29;
                    int i2812 = i279 & 29;
                    z3 = true;
                    int i2813 = i2811 + (i2812 << 1);
                    TuitionPaymentFragmentbindingInflater1 = i2813 % 128;
                    int i2814 = i2813 % 2;
                    i17 = i15;
                    z2 = false;
                }
            }
            if ((!z2) != z3) {
                int i290 = TuitionPaymentFragmentbindingInflater1;
                int i291 = i290 + 51;
                b = i291 % 128;
                int i292 = i291 % 2;
                int i293 = (i290 ^ 121) + ((i290 & 121) << 1);
                b = i293 % 128;
                int i294 = i293 % 2;
                i18 = 1;
            } else {
                i18 = 0;
            }
            if (!z2 || i16 >= methodArr.length) {
                string = null;
            } else {
                int i295 = b;
                int i296 = (i295 ^ 89) + ((i295 & 89) << 1);
                TuitionPaymentFragmentbindingInflater1 = i296 % 128;
                int i297 = i296 % 2;
                Method method2 = methodArr[i16];
                if (method2 != null) {
                    int i298 = (i295 ^ 13) + ((i295 & 13) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i298 % 128;
                    int i299 = i298 % 2;
                    string = method2.toString();
                } else {
                    string = null;
                }
            }
            list.add(string);
            int i300 = i17 + 6;
            int i301 = b + 29;
            TuitionPaymentFragmentbindingInflater1 = i301 % 128;
            return i301 % 2 != 0 ? i300 / i18 : i300 * i18;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    private static String $$g(short s, byte b2, short s2) {
        int i = b2 * 2;
        byte[] bArr = $$c;
        int i2 = (s * 3) + 4;
        int i3 = s2 + 119;
        byte[] bArr2 = new byte[1 - i];
        int i4 = 0 - i;
        int i5 = -1;
        if (bArr == null) {
            i3 += -i4;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i3 += -bArr[i2];
            i2++;
        }
    }
}
