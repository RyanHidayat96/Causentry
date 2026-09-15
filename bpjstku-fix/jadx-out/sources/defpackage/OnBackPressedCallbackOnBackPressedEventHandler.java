package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import com.bpjstku.data.payment.model.response.CreateOneTimePaymentResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OnBackPressedCallbackOnBackPressedEventHandler implements Function1 {
    private static final byte[] $$c = {115, 98, 19, 9};
    private static final int $$d = 222;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {99, -43, -44, -62, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 218;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int d = 1;
    private static char[] b = {47205, 47204, 47249, 47174, 47208, 47206, 47201, 47171, 47200, 47261, 47263, 47251, 47195, 47259, 47202, 47221, 47255, 47258, 47250, 47207, 47257, 47253, 47222, 47262, 47176, 47248, 47252};
    private static int TuitionPaymentFragmentbindingInflater1 = 2047719433;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = defpackage.OnBackPressedCallbackOnBackPressedEventHandler.$$a
            int r6 = r6 * 52
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.OnBackPressedCallbackOnBackPressedEventHandler.c(byte, byte, int, java.lang.Object[]):void");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        d = i2 % 128;
        int i3 = i2 % 2;
        CreateOneTimePaymentResponse createOneTimePaymentResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = removeOnReportDrawnListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3((CreateOneTimePaymentResponse) obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return createOneTimePaymentResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = b;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 2994 - View.resolveSize(i3, i3), KeyEvent.getDeadChar(i3, i3) + 17, 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 0;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 43325), 253 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i5 = $11 + 17;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33601 - ImageFormat.getBitsPerPixel(0)), 3086 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 26 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2146875848, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        int i7 = 0;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i8 = $11 + 27;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 3085 - (ViewConfiguration.getEdgeSlop() >> 16), Color.alpha(0) + 26, -2146875848, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                int i10 = $10 + 59;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            i7 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0826  */
    /* JADX WARN: Code duplicated, block: B:92:0x0837  */
    /* JADX WARN: Code duplicated, block: B:93:0x083a  */
    /* JADX WARN: Code duplicated, block: B:95:0x083d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0869  */
    /* JADX WARN: Code duplicated, block: B:99:0x0872  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r5v108 */
    /* JADX WARN: Type inference failed for: r5v129 */
    /* JADX WARN: Type inference failed for: r5v130 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v82, types: [long] */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v92, types: [long] */
    public static Object[] TuitionPaymentFragmentbindingInflater1(Class cls, int i, int i2, int i3) throws Throwable {
        ?? r4;
        int i4;
        int i5;
        int i6;
        int i7;
        Object[] objArr;
        int[] iArr;
        int i8;
        char c;
        int i9;
        int i10;
        ?? LongValue;
        ?? offsetBefore;
        char c2;
        String string;
        String[][] strArr;
        Class<Class> cls2;
        int i11;
        int i12;
        int i13;
        int iTuitionPaymentFragmentbindingInflater1;
        int i14 = i3;
        int i15 = 2 % 2;
        String str = "";
        if ((i2 & 2) != 0) {
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
            d = i16 % 128;
            try {
                if (i16 % 2 == 0) {
                    strArr = new String[0][];
                    cls2 = Class.class;
                    i11 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    iTuitionPaymentFragmentbindingInflater1 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
                    i13 = (-501) >>> i11;
                    i12 = 37;
                } else {
                    strArr = new String[1][];
                    cls2 = Class.class;
                    i11 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    i12 = 127;
                    i13 = i11 * (-501);
                    iTuitionPaymentFragmentbindingInflater1 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
                }
                int i17 = -(-(i12 * TypedValues.PositionType.TYPE_PERCENT_WIDTH));
                int i18 = (i13 ^ i17) + ((i13 & i17) << 1);
                int i19 = ~i12;
                int i20 = ~(i19 | iTuitionPaymentFragmentbindingInflater1);
                int i21 = ~((i11 ^ i12) | (i12 & i11));
                int i22 = i18 + (((i20 ^ i21) | (i20 & i21)) * (-502));
                int i23 = ~iTuitionPaymentFragmentbindingInflater1;
                int i24 = d;
                int i25 = (i24 & 97) + (i24 | 97);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
                int i26 = i25 % 2;
                int i27 = (i22 - (~(-(-((-502) * (~(((i23 & i19) | (i19 ^ i23)) | i11))))))) - 1;
                int i28 = ~i11;
                int i29 = ~((iTuitionPaymentFragmentbindingInflater1 & i28) | (i28 ^ iTuitionPaymentFragmentbindingInflater1));
                Object[] objArr2 = new Object[1];
                a(null, null, (i27 - (~(((i19 & i29) | (i19 ^ i29)) * TypedValues.PositionType.TYPE_DRAWPATH))) - 1, new byte[]{-126, -121, -122, -123, -124, -125, -126, -127}, objArr2);
                String str2 = (String) objArr2[0];
                int i30 = d + 23;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
                int i31 = i30 % 2;
                Field declaredField = cls2.getDeclaredField(str2);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(cls);
                Class<?> cls3 = obj.getClass();
                int iAlpha = Color.alpha(0);
                int i32 = iAlpha * (-183);
                int i33 = ((i32 | 23495) << 1) - (i32 ^ 23495);
                int i34 = ~((~iAlpha) | 127);
                int i35 = ~i;
                int i36 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
                int i37 = i36 % 128;
                d = i37;
                int i38 = i36 % 2;
                int i39 = ~((i35 ^ 127) | (i35 & 127));
                int i40 = i33 + (184 * ((i39 & i34) | (i34 ^ i39)));
                int i41 = ~(((-128) & iAlpha) | ((-128) ^ iAlpha));
                int i42 = -(-(((i41 & i) | (i ^ i41)) * (-184)));
                int i43 = (i40 & i42) + (i42 | i40);
                int i44 = ~iAlpha;
                int i45 = ~i;
                int i46 = (~((i44 & i45) | (i44 ^ i45))) * 184;
                int i47 = ((i43 | i46) << 1) - (i46 ^ i43);
                byte[] bArr = {-126, -118, -119, -120, -125, -126, -127};
                int i48 = (i37 ^ 87) + ((i37 & 87) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i48 % 128;
                if (i48 % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    a(null, null, i47, bArr, objArr3);
                    Field declaredField2 = cls3.getDeclaredField((String) objArr3[0]);
                    declaredField2.setAccessible(true);
                    LongValue = ((Number) declaredField2.get(obj)).longValue() | 281474976710655L;
                } else {
                    Object[] objArr4 = new Object[1];
                    a(null, null, i47, bArr, objArr4);
                    Field declaredField3 = cls3.getDeclaredField((String) objArr4[0]);
                    declaredField3.setAccessible(true);
                    LongValue = ((Number) declaredField3.get(obj)).longValue() & 281474976710655L;
                }
                try {
                    Object[] objArr5 = {Long.valueOf((long) LongValue), strArr};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486768121);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 41241);
                        int keyRepeatTimeout = 1705 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        offsetBefore = TextUtils.getOffsetBefore("", 0) + 21;
                        byte[] bArr2 = $$a;
                        byte b2 = bArr2[7];
                        Object[] objArr6 = new Object[1];
                        c(b2, b2, (byte) (-bArr2[5]), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, keyRepeatTimeout, offsetBefore, -107095506, false, (String) objArr6[0], new Class[]{Long.TYPE, String[][].class});
                    }
                    LongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr5)).longValue();
                    long j = -2094860699;
                    offsetBefore = "";
                    String[][] strArr2 = strArr;
                    long j2 = 184;
                    long j3 = -1;
                    long j4 = j ^ j3;
                    long jNextInt = new Random().nextInt(804137285);
                    long j5 = jNextInt ^ j3;
                    long j6 = (((long) (-183)) * j) + (((long) 185) * LongValue) + ((((j4 | LongValue) ^ j3) | ((j5 | LongValue) ^ j3)) * j2) + (((long) (-184)) * ((((LongValue ^ j3) | j) ^ j3) | jNextInt)) + (((j4 | j5) ^ j3) * j2) + ((long) (-11156362));
                    i14 = i;
                    int i49 = ((int) (j6 >> 32)) & (501358106 + (((~(766527222 | i14)) | (-2109040639)) * 336) + (((~((-2091213663) | i14)) | 748700246) * (-168)) + ((766527222 | (~((-2091213663) | i45))) * 168));
                    int i50 = ~(830000196 | i14);
                    int i51 = ((int) j6) & ((((18874436 | i50) * (-196)) - 2099663259) + ((i50 | 811125760) * 196));
                    int i52 = (i49 & i51) | (i49 ^ i51);
                    if (i52 != 0) {
                        int i53 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
                        d = i53 % 128;
                        int i54 = i53 % 2;
                        int i55 = i52 ^ i14;
                        try {
                            String[] strArr3 = strArr2[0];
                            String[] strArr4 = {cls.getName(), strArr3[0], strArr3[1], strArr3[2]};
                            Object[] objArr7 = new Object[4];
                            objArr7[0] = new int[1];
                            objArr7[1] = new int[]{i55};
                            objArr7[2] = new int[]{i14};
                            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                            int i56 = 563330354 + (((-1503606483) | iFreeMemory) * 376) + (((~((~iFreeMemory) | 370012840)) | (-1604318971)) * (-376)) + (((~(iFreeMemory | (-370012841))) | 1335018618) * 376);
                            int i57 = (i56 ^ 16) + ((i56 & 16) << 1);
                            int i58 = i57 * (-405);
                            int i59 = i3 * 407;
                            int i60 = (i58 & i59) + (i58 | i59);
                            int i61 = ~i3;
                            int i62 = ~((i61 & i14) | (i61 ^ i14));
                            int i63 = ~((i45 ^ i57) | (i45 & i57) | i3);
                            int i64 = ((i62 & i63) | (i62 ^ i63)) * (-406);
                            int i65 = ((i60 | i64) << 1) - (i64 ^ i60);
                            int i66 = ~i3;
                            int i67 = -(-((~((i66 & i45) | (i66 ^ i45) | i57)) * (-406)));
                            int i68 = (i65 ^ i67) + ((i67 & i65) << 1);
                            int i69 = -(-(((~((~i57) | i14)) | (~((i35 ^ i3) | (i35 & i3)))) * 406));
                            int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
                            int i71 = (i70 << 13) ^ i70;
                            int i72 = i71 >>> 17;
                            int i73 = ((~i71) & i72) | ((~i72) & i71);
                            ((int[]) objArr7[0])[0] = i73 ^ (i73 << 5);
                            objArr7[3] = strArr4;
                            return objArr7;
                        } catch (Throwable th) {
                            th = th;
                            LongValue = i3;
                            try {
                                StringWriter stringWriter = new StringWriter();
                                try {
                                    Object[] objArr8 = {new PrintWriter(stringWriter)};
                                    ?? r5 = offsetBefore;
                                    int i74 = -TextUtils.indexOf((CharSequence) r5, (CharSequence) r5);
                                    int i75 = i74 * (-375);
                                    int i76 = ((i75 | (-47625)) << 1) - (i75 ^ (-47625));
                                    int i77 = (~((~i74) | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) | i14;
                                    int i78 = (i74 ^ 127) | (i74 & 127);
                                    int i79 = ~i78;
                                    int i80 = (i76 - (~(((i77 & i79) | (i77 ^ i79)) * 376))) - 1;
                                    int i81 = ~i14;
                                    int i82 = -(-(((~((i81 & i74) | (i81 ^ i74))) | (~i78)) * (-376)));
                                    int i83 = (i80 & i82) + (i82 | i80);
                                    int i84 = ~i74;
                                    int i85 = -(-(((~((i84 & i14) | (i84 ^ i14))) | 127) * 376));
                                    Object[] objArr9 = new Object[1];
                                    a(null, null, (i83 & i85) + (i85 | i83), new byte[]{-126, -118, -108, -123, -109, -110, -111, -121, -112, -115, -113, -114, -123, -118, -115, -123, -116, -123, -117}, objArr9);
                                    Class<?> cls4 = Class.forName((String) objArr9[0]);
                                    int i86 = -(ViewConfiguration.getTouchSlop() >> 8);
                                    Object[] objArr10 = new Object[1];
                                    a(null, null, (i86 & 127) + (i86 | 127), new byte[]{-126, -122, -123, -111, -112, -104, -122, -123, -106, -105, -106, -114, -119, -111, -107}, objArr10);
                                    cls4.getMethod((String) objArr10[0], PrintWriter.class).invoke(th, objArr8);
                                    string = stringWriter.toString();
                                    c2 = 0;
                                } catch (Throwable th2) {
                                    Throwable cause = th2.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th2;
                                }
                            } catch (Throwable unused) {
                                int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                c2 = 0;
                                Object[] objArr11 = new Object[1];
                                a(null, null, (doubleTapTimeout ^ 127) + ((doubleTapTimeout & 127) << 1), new byte[]{-115}, objArr11);
                                string = (String) objArr11[0];
                            }
                            int i87 = (~(i14 & 31)) & (i14 | 31);
                            String[] strArr5 = new String[2];
                            strArr5[c2] = cls.getName();
                            int i88 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i89 = ((i88 | 55) << 1) - (i88 ^ 55);
                            d = i89 % 128;
                            int i90 = i89 % 2;
                            strArr5[1] = string;
                            int i91 = i88 + 105;
                            d = i91 % 128;
                            int i92 = i91 % 2;
                            int[] iArr2 = {i14};
                            int i93 = (i88 & 121) + (i88 | 121);
                            d = i93 % 128;
                            int i94 = i93 % 2;
                            int[] iArr3 = {i87};
                            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                            int i95 = ~iFreeMemory2;
                            int i96 = (-161408718) + (((~(777417240 | i95)) | 285738242) * 184) + ((iFreeMemory2 | 135541264) * (-184)) + ((~((-927614219) | i95)) * 184);
                            int i97 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i98 = (i97 ^ 33) + ((i97 & 33) << 1);
                            d = i98 % 128;
                            int i99 = i98 % 2;
                            int i100 = (i96 & 16) + (16 | i96);
                            int i101 = (LongValue ^ i100) + ((i100 & LongValue) << 1);
                            int i102 = i101 << 13;
                            int i103 = (i102 | i101) & (~(i101 & i102));
                            int i104 = i103 >>> 17;
                            int i105 = ((~i103) & i104) | ((~i104) & i103);
                            ((int[]) objArr[0])[0] = i105 ^ (i105 << 5);
                            Object[] objArr12 = {new int[1], iArr3, iArr2, strArr5};
                            return objArr12;
                        }
                    }
                    r4 = offsetBefore;
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                LongValue = i14;
                offsetBefore = "";
                i14 = i;
            }
        } else {
            i14 = i;
            r4 = str;
        }
        int[] iArr4 = {-1844476378, 1276062274, -797088743, 965014536, -30564408, 800164665, 427080095, -63109426, -2128711273, 443823261, -421827424, -1596256068, -554832609, -49350782, -437871410, 1291703475, -587285223, 1359539528, -706062319, 1866472215};
        String[][] strArr6 = new String[1][];
        int iCurrentTimeMillis = ((int) System.currentTimeMillis()) ^ 343337308;
        try {
            Object[] objArr13 = {Integer.valueOf((~(i14 & iCurrentTimeMillis)) & (i14 | iCurrentTimeMillis)), iArr4, Integer.valueOf(i2), strArr6};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-561316232);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 43042);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 3112;
                int maximumDrawingCacheSize = 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr3 = $$a;
                byte b3 = bArr3[7];
                Object[] objArr14 = new Object[1];
                c(b3, b3, (byte) (-bArr3[5]), objArr14);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, packedPositionChild, maximumDrawingCacheSize, 974412207, false, (String) objArr14[0], new Class[]{Integer.TYPE, int[].class, Integer.TYPE, String[][].class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr13)).longValue();
            long j7 = -1711528490;
            long j8 = -209;
            long j9 = (j8 * j7) + (j8 * jLongValue);
            long j10 = 210;
            long j11 = -1;
            long j12 = j7 ^ j11;
            long j13 = jLongValue ^ j11;
            ?? r20 = r4;
            long j14 = i14;
            long j15 = j14 ^ j11;
            long j16 = j9 + (((j12 | j13) ^ j11) * j10) + ((((j13 | j15) ^ j11) | ((j12 | j14) ^ j11)) * j10) + (j10 * (((j14 | (j13 | j7)) ^ j11) | (((j12 | j15) | jLongValue) ^ j11))) + ((long) 1815262555);
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i106 = ~iElapsedRealtime;
            int i107 = ((int) (j16 >> 32)) & ((-1872456792) + (((~(1847867083 | i106)) | 1009873801) * (-865)) + ((~(iElapsedRealtime | (-1847867084))) * 865) + (((~(1009873801 | i106)) | (~(i106 | (-1847867084)))) * 865));
            int iMyPid = Process.myPid();
            int i108 = ~iMyPid;
            int i109 = ((int) j16) & ((((-635053777) + (((~((-990751475) | i108)) | (~((-1866989412) | iMyPid))) * (-370))) + ((((~(iMyPid | (-990751475))) | (~(i108 | (-1866989412)))) | (-2135949300)) * (-370))) - 27258536);
            int i110 = (i107 & i109) | (i107 ^ i109);
            int i111 = (i110 | iCurrentTimeMillis) & (~(i110 & iCurrentTimeMillis));
            if (i111 != i14) {
                String[] strArr7 = strArr6[0];
                Object[] objArr15 = new Object[4];
                objArr15[0] = new int[1];
                objArr15[1] = new int[]{i111};
                objArr15[2] = new int[]{i14};
                int i112 = (-1819106998) + (((~(1153793187 | i14)) | 538575452) * (-140)) + ((~(1692368639 | i14)) * 70) + (((~(551238271 | i14)) | 1679705820) * 70);
                int iTuitionPaymentFragmentbindingInflater2 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
                int i113 = d;
                int i114 = ((i113 | 61) << 1) - (i113 ^ 61);
                int i115 = i114 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i115;
                if (i114 % 2 != 0) {
                    int i116 = ~i112;
                    int i117 = ~iTuitionPaymentFragmentbindingInflater2;
                    int i118 = ~((i116 & i117) | (i116 ^ i117));
                    int i119 = ~i112;
                    int i120 = ~((i119 & 16) | (i119 ^ 16));
                    i10 = ((34 << (i112 * (-97))) - (~(((i118 & i120) | (i118 ^ i120)) * 98))) - 1;
                } else {
                    int i121 = 800 + (i112 * (-97));
                    int i122 = ~i112;
                    int i123 = ~((~iTuitionPaymentFragmentbindingInflater2) | i122);
                    int i124 = ~((i122 & 16) | (i122 ^ 16));
                    int i125 = ((i124 & i123) | (i123 ^ i124)) * 98;
                    i10 = ((i121 | i125) << 1) - (i125 ^ i121);
                }
                int i126 = ~i112;
                int i127 = ~iTuitionPaymentFragmentbindingInflater2;
                int i128 = ~((i127 & (-17)) | ((-17) ^ i127));
                int i129 = (i128 & i126) | (i126 ^ i128);
                int i130 = ~((iTuitionPaymentFragmentbindingInflater2 ^ 16) | (iTuitionPaymentFragmentbindingInflater2 & 16));
                int i131 = (i10 - (~(((i129 & i130) | (i129 ^ i130)) * (-49)))) - 1;
                int i132 = i115 + 31;
                d = i132 % 128;
                int i133 = i132 % 2;
                int i134 = ~((iTuitionPaymentFragmentbindingInflater2 & i126) | (i126 ^ iTuitionPaymentFragmentbindingInflater2));
                int i135 = ~((i112 & 16) | (16 ^ i112));
                int i136 = i131 + (49 * ((i134 & i135) | (i134 ^ i135)));
                int iTuitionPaymentFragmentbindingInflater3 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
                int i137 = i136 * 980;
                int i138 = -(-(i3 * (-978)));
                int i139 = ((i137 | i138) << 1) - (i137 ^ i138);
                int i140 = ~i3;
                int i141 = ~iTuitionPaymentFragmentbindingInflater3;
                int i142 = (((i139 - (~((~((i141 & i140) | (i140 ^ i141))) * 979))) - 1) - (~(-(-(((i136 ^ iTuitionPaymentFragmentbindingInflater3) | (i136 & iTuitionPaymentFragmentbindingInflater3)) * (-979)))))) - 1;
                int i143 = ~((i140 & iTuitionPaymentFragmentbindingInflater3) | (i140 ^ iTuitionPaymentFragmentbindingInflater3));
                int i144 = ~iTuitionPaymentFragmentbindingInflater3;
                int i145 = d;
                int i146 = (i145 ^ 115) + ((i145 & 115) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i146 % 128;
                int i147 = i146 % 2;
                int i148 = ~((i144 & i136) | (i144 ^ i136));
                int i149 = 979 * ((i148 & i143) | (i143 ^ i148));
                int i150 = (i142 ^ i149) + ((i149 & i142) << 1);
                int i151 = i150 << 13;
                int i152 = ((~i150) & i151) | ((~i151) & i150);
                int i153 = i152 >>> 17;
                int i154 = (i152 | i153) & (~(i152 & i153));
                ((int[]) objArr15[0])[0] = i154 ^ (i154 << 5);
                objArr15[3] = strArr7;
                return objArr15;
            }
            try {
                int i155 = -TextUtils.indexOf((CharSequence) r20, (CharSequence) r20, 0);
                Object[] objArr16 = new Object[1];
                a(null, null, ((i155 | 127) << 1) - (i155 ^ 127), new byte[]{-127, -123, -126, -111, -121, -112, -102, -106, -119, -116, -119, -106, -122, -103, -115, -107, -107, -123, -115, -127, -119, -110, -111, -127, -114, -123}, objArr16);
                Class<?> cls5 = Class.forName((String) objArr16[0]);
                int scrollBarSize = ViewConfiguration.getScrollBarSize();
                int i156 = d;
                int i157 = (i156 & 67) + (i156 | 67);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i157 % 128;
                int i158 = i157 % 2;
                Object[] objArr17 = new Object[1];
                a(null, null, 127 - (scrollBarSize >> 8), new byte[]{-114, -110, -119, -106, -123, -122, -119, -118, -107, -107, -103, -106, -114, -126, -111, -111, -101, -122}, objArr17);
                Method method = cls5.getMethod((String) objArr17[0], new Class[0]);
                int i159 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                d = i159 % 128;
                int i160 = i159 % 2;
                if (method.invoke(null, null) != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1289074282);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString(r20) + 22878);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 594;
                        i4 = 16;
                        int i161 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16;
                        byte[] bArr4 = $$a;
                        byte b4 = (byte) (-bArr4[5]);
                        byte b5 = bArr4[7];
                        Object[] objArr18 = new Object[1];
                        c(b4, b5, b5, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, touchSlop, i161, -1471475267, false, (String) objArr18[0], null);
                    } else {
                        i4 = 16;
                    }
                    if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null) != 0) {
                        i5 = (~(i14 & 9)) & (i14 | 9);
                    } else {
                        int i162 = d + 49;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i162 % 128;
                        int i163 = i162 % 2;
                    }
                    if (i5 != i14) {
                        int i164 = d;
                        i9 = (i164 ^ 11) + ((i164 & 11) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                        if (i9 % 2 != 0) {
                            i7 = 111;
                        } else {
                            i7 = i4;
                        }
                        i6 = 0;
                    } else {
                        i6 = 0;
                        i7 = 0;
                    }
                    String[] strArr8 = new String[i6];
                    objArr = new Object[4];
                    int i165 = d;
                    int i166 = (i165 ^ 105) + ((i165 & 105) << 1);
                    int i167 = i166 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i167;
                    int i168 = i166 % 2;
                    objArr[0] = new int[1];
                    int[] iArr5 = new int[1];
                    objArr[1] = iArr5;
                    iArr = new int[1];
                    objArr[2] = iArr;
                    i8 = i167 + 67;
                    d = i8 % 128;
                    if (i8 % 2 == 0) {
                        c = 0;
                        ((int[]) objArr[4])[0] = i14;
                    } else {
                        c = 0;
                        iArr[0] = i14;
                    }
                    iArr5[c] = i5;
                    int iNextInt = new Random().nextInt(517372799);
                    int i169 = 563330354 + (((-1499334161) | iNextInt) * 376) + (((~((~iNextInt) | 394223257)) | (-1602182810)) * (-376)) + (((~(iNextInt | (-394223258))) | 1310808201) * 376);
                    int i170 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
                    d = i170 % 128;
                    int i171 = i170 % 2;
                    int iTuitionPaymentFragmentbindingInflater4 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
                    int i172 = (i7 * 980) + (i169 * (-978));
                    int i173 = ~i169;
                    int i174 = ~iTuitionPaymentFragmentbindingInflater4;
                    int i175 = -(-((~((i173 & i174) | (i173 ^ i174))) * 979));
                    int i176 = (i172 ^ i175) + ((i172 & i175) << 1) + (((i7 ^ iTuitionPaymentFragmentbindingInflater4) | (i7 & iTuitionPaymentFragmentbindingInflater4)) * (-979));
                    int i177 = ~i169;
                    int i178 = ~((i177 & iTuitionPaymentFragmentbindingInflater4) | (i177 ^ iTuitionPaymentFragmentbindingInflater4));
                    int i179 = ~iTuitionPaymentFragmentbindingInflater4;
                    int i180 = ((~((i179 & i7) | (i179 ^ i7))) | i178) * 979;
                    int i181 = ((i176 | i180) << 1) - (i180 ^ i176);
                    int i182 = ((i3 | i181) << 1) - (i181 ^ i3);
                    int i183 = i182 ^ (i182 << 13);
                    int i184 = i183 >>> 17;
                    int i185 = (i183 | i184) & (~(i183 & i184));
                    ((int[]) objArr[0])[0] = i185 ^ (i185 << 5);
                    objArr[3] = strArr8;
                    return objArr;
                }
                int i186 = d;
                int i187 = (i186 ^ 43) + ((i186 & 43) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i187 % 128;
                int i188 = i187 % 2;
                i4 = 16;
            } catch (Exception unused2) {
            }
            i5 = i14;
            if (i5 != i14) {
                int i1610 = d;
                i9 = (i1610 ^ 11) + ((i1610 & 11) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                if (i9 % 2 != 0) {
                    i7 = 111;
                } else {
                    i7 = i4;
                }
                i6 = 0;
            } else {
                i6 = 0;
                i7 = 0;
            }
            String[] strArr9 = new String[i6];
            objArr = new Object[4];
            int i1611 = d;
            int i1612 = (i1611 ^ 105) + ((i1611 & 105) << 1);
            int i1613 = i1612 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1613;
            int i1614 = i1612 % 2;
            objArr[0] = new int[1];
            int[] iArr6 = new int[1];
            objArr[1] = iArr6;
            iArr = new int[1];
            objArr[2] = iArr;
            i8 = i1613 + 67;
            d = i8 % 128;
            if (i8 % 2 == 0) {
                c = 0;
                ((int[]) objArr[4])[0] = i14;
            } else {
                c = 0;
                iArr[0] = i14;
            }
            iArr6[c] = i5;
            int iNextInt2 = new Random().nextInt(517372799);
            int i1615 = 563330354 + (((-1499334161) | iNextInt2) * 376) + (((~((~iNextInt2) | 394223257)) | (-1602182810)) * (-376)) + (((~(iNextInt2 | (-394223258))) | 1310808201) * 376);
            int i1710 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
            d = i1710 % 128;
            int i1711 = i1710 % 2;
            int iTuitionPaymentFragmentbindingInflater5 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
            int i1712 = (i7 * 980) + (i1615 * (-978));
            int i1713 = ~i1615;
            int i1714 = ~iTuitionPaymentFragmentbindingInflater5;
            int i1715 = -(-((~((i1713 & i1714) | (i1713 ^ i1714))) * 979));
            int i1716 = (i1712 ^ i1715) + ((i1712 & i1715) << 1) + (((i7 ^ iTuitionPaymentFragmentbindingInflater5) | (i7 & iTuitionPaymentFragmentbindingInflater5)) * (-979));
            int i1717 = ~i1615;
            int i1718 = ~((i1717 & iTuitionPaymentFragmentbindingInflater5) | (i1717 ^ iTuitionPaymentFragmentbindingInflater5));
            int i1719 = ~iTuitionPaymentFragmentbindingInflater5;
            int i189 = ((~((i1719 & i7) | (i1719 ^ i7))) | i1718) * 979;
            int i1810 = ((i1716 | i189) << 1) - (i189 ^ i1716);
            int i1811 = ((i3 | i1810) << 1) - (i1810 ^ i3);
            int i1812 = i1811 ^ (i1811 << 13);
            int i1813 = i1812 >>> 17;
            int i1814 = (i1812 | i1813) & (~(i1812 & i1813));
            ((int[]) objArr[0])[0] = i1814 ^ (i1814 << 5);
            objArr[3] = strArr9;
            return objArr;
        } catch (Throwable th5) {
            Throwable cause3 = th5.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th5;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            sizeToRectF.b[1] = within360.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0];
        } else {
            sizeToRectF.b[0] = within360.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0];
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = 68 - r7
            byte[] r1 = defpackage.OnBackPressedCallbackOnBackPressedEventHandler.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.OnBackPressedCallbackOnBackPressedEventHandler.$$e(byte, byte, byte):java.lang.String");
    }
}
