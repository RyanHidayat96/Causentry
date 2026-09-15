package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import kotlin.io.encoding.Base64;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
public interface getSchedulerHandler<Model, Data> {
    TuitionPaymentFragmentbindingInflater1<Data> TuitionPaymentFragmentbindingInflater1(Model model, int i, int i2, getTargetRotation gettargetrotation);

    boolean TuitionPaymentFragmentbindingInflater1(Model model);

    public static class TuitionPaymentFragmentbindingInflater1<Data> {
        public final isUseCasesCombinationSupportedByFramework<Data> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final getCameraControl TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final List<getCameraControl> b;
        private static final byte[] $$c = {110, -73, -111, 99};
        private static final int $$f = 164;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {25, 5, -88, -44, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        private static final int $$e = DerHeader.TAG_CLASS_PRIVATE;
        private static final byte[] $$a = {19, 78, 114, 113, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -36, -19, -4, -10, 8, -8, 0, 22, -22, -15, 11, -8, 0, -15, 0, -17, 34, -19, -4, -10, 8, -8, 0, 26, -39, 6, -11};
        private static final int $$b = 26;
        private static int d = 0;
        private static int asInterface = 1;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 37776;
        private static char TuitionPaymentFragmentbindingInflater1 = 47610;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static char f976a = 14290;
        private static char asBinder = 59021;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 19
                int r7 = 33 - r7
                byte[] r0 = getSchedulerHandler.TuitionPaymentFragmentbindingInflater1.$$a
                int r9 = r9 * 6
                int r9 = 103 - r9
                int r8 = r8 * 32
                int r8 = r8 + 4
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r9
                r4 = r2
                r9 = r8
                goto L2c
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r6
            L2c:
                int r3 = -r3
                int r8 = r8 + r3
                int r8 = r8 + (-2)
                int r9 = r9 + 1
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: getSchedulerHandler.TuitionPaymentFragmentbindingInflater1.c(int, short, int, java.lang.Object[]):void");
        }

        private static void e(short s, byte b, int i, Object[] objArr) {
            int i2 = b + 84;
            byte[] bArr = $$d;
            int i3 = i + 4;
            int i4 = s * 52;
            byte[] bArr2 = new byte[53 - i4];
            int i5 = 52 - i4;
            int i6 = -1;
            if (bArr == null) {
                i2 = (i5 + (-i2)) - 11;
                i3 = i3;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i2;
                int i8 = i3 + 1;
                if (i7 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i2 = (i2 + (-bArr[i8])) - 11;
                i3 = i8;
                i6 = i7;
            }
        }

        public TuitionPaymentFragmentbindingInflater1(getCameraControl getcameracontrol, isUseCasesCombinationSupportedByFramework<Data> isusecasescombinationsupportedbyframework) {
            this(getcameracontrol, Collections.emptyList(), isusecasescombinationsupportedbyframework);
        }

        private TuitionPaymentFragmentbindingInflater1(getCameraControl getcameracontrol, List<getCameraControl> list, isUseCasesCombinationSupportedByFramework<Data> isusecasescombinationsupportedbyframework) {
            if (getcameracontrol == null) {
                throw new NullPointerException("Argument must not be null");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getcameracontrol;
            if (list != null) {
                int i = d;
                int i2 = i + 91;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                int i4 = i + 117;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                this.b = list;
                if (isusecasescombinationsupportedbyframework != null) {
                    int i7 = i + 85;
                    int i8 = i7 % 128;
                    asInterface = i8;
                    Object obj = null;
                    if (i7 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i9 = i8 + 21;
                    int i10 = i9 % 128;
                    d = i10;
                    int i11 = i9 % 2;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = isusecasescombinationsupportedbyframework;
                    int i12 = i10 + 11;
                    asInterface = i12 % 128;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }

        private static void f(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                char c = 0;
                if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i);
                    return;
                }
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i3 = 58224;
                int i4 = 0;
                while (i4 < 16) {
                    int i5 = $10 + 9;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    char c2 = cArr3[1];
                    char c3 = cArr3[c];
                    int i7 = (c3 + i3) ^ ((c3 << 4) + ((char) (((long) f976a) ^ 8611973335120459638L)));
                    int i8 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(asBinder);
                        objArr2[2] = Integer.valueOf(i8);
                        objArr2[1] = Integer.valueOf(i7);
                        objArr2[c] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c4 = (char) (47774 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 469;
                            int trimmedLength = TextUtils.getTrimmedLength("") + 13;
                            Class[] clsArr = new Class[4];
                            clsArr[c] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, packedPositionChild, trimmedLength, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        int i9 = i4;
                        Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - ImageFormat.getBitsPerPixel(0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 468, 12 - MotionEvent.axisFromString(""), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i3 -= 40503;
                        i4 = i9 + 1;
                        c = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.getDefaultSize(0, 0) + 2323, 44 - View.MeasureSpec.getMode(0), -1312321721, false, $$g(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i10 = $10 + 93;
                $11 = i10 % 128;
                int i11 = i10 % 2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:120:0x08d4  */
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) throws Throwable {
            String str;
            Class<?>[] clsArr;
            int i;
            int i2;
            boolean z;
            int i3;
            String string;
            Method method;
            Method[] declaredMethods;
            int length;
            Object obj;
            String str2;
            Class<?>[] clsArr2;
            int i4;
            int i5;
            String str3;
            Class<?>[] clsArr3;
            int i6 = 2;
            int i7 = 2 % 2;
            Method[] methodArr = new Method[2];
            byte[] bArr = $$a;
            byte b = bArr[28];
            int i8 = 1;
            Object[] objArr = new Object[1];
            c(b, b, bArr[7], objArr);
            int i9 = 0;
            Class<?> cls = Class.forName((String) objArr[0]);
            int i10 = d;
            int i11 = (i10 ^ 15) + ((i10 & 15) << 1);
            asInterface = i11 % 128;
            if (i11 % 2 == 0) {
                byte b2 = bArr[7];
                Object[] objArr2 = new Object[1];
                c(b2, b2, bArr[28], objArr2);
                str = (String) objArr2[0];
                clsArr = new Class[4];
                clsArr[0] = String.class;
            } else {
                byte b3 = bArr[7];
                Object[] objArr3 = new Object[1];
                c(b3, b3, bArr[28], objArr3);
                str = (String) objArr3[0];
                clsArr = new Class[2];
                clsArr[0] = String.class;
            }
            clsArr[1] = Integer.TYPE;
            methodArr[0] = cls.getMethod(str, clsArr);
            Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
            byte b4 = bArr[7];
            Object[] objArr4 = new Object[1];
            c(b4, b4, bArr[28], objArr4);
            String str4 = (String) objArr4[0];
            int i12 = asInterface;
            int i13 = (i12 & 47) + (i12 | 47);
            d = i13 % 128;
            int i14 = i13 % 2;
            Class<?>[] clsArr4 = {String.class, Integer.TYPE};
            int i15 = asInterface + 69;
            d = i15 % 128;
            int i16 = i15 % 2;
            methodArr[1] = cls2.getMethod(str4, clsArr4);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            int i17 = 16;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int iMyPid = 2823 - (Process.myPid() >> 22);
                int edgeSlop = 22 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte[] bArr2 = $$d;
                byte b5 = bArr2[7];
                Object[] objArr5 = new Object[1];
                e(b5, b5, (byte) (-bArr2[5]), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, iMyPid, edgeSlop, 1814927978, false, (String) objArr5[0], null);
            }
            Class<?>[] clsArr5 = null;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                int i18 = d;
                int i19 = (i18 ^ 123) + ((i18 & 123) << 1);
                asInterface = i19 % 128;
                if (i19 % 2 == 0) {
                    declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getCapsMode("", 0, 0), 2823 - Color.blue(0), Color.alpha(0) + 22)).getDeclaredMethods();
                    length = declaredMethods.length;
                } else {
                    declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 2823, 21 - ImageFormat.getBitsPerPixel(0))).getDeclaredMethods();
                    length = declaredMethods.length;
                }
                int i20 = 0;
                while (i20 < length) {
                    Method method2 = declaredMethods[i20];
                    try {
                        char[] cArr = {35848, 42585, 43744, 50735, 12302, 63780, 17074, 6575, 17547, 5211, 22993, 26868, 44006, 16744, 60781, 2833, 64698, 10592, 26938, 52370, 35422, 12091, 19644, 63439, 36787, 18098};
                        int tapTimeout = ViewConfiguration.getTapTimeout() >> i17;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i21 = ((tapTimeout * 495) - 11832) + (((tapTimeout ^ (-25)) | (tapTimeout & (-25))) * (-988));
                        int i22 = asInterface;
                        int i23 = (i22 & 13) + (i22 | 13);
                        d = i23 % 128;
                        if (i23 % i6 != 0) {
                            int i24 = ~tapTimeout;
                            int i25 = (i24 ^ 24) | (i24 & 24);
                            int i26 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i27 = i21 >>> (494 >>> ((i25 ^ i26) | (i26 & i25)));
                            int i28 = ~tapTimeout;
                            int i29 = ~((i28 & (-25)) | (i28 ^ (-25)));
                            int i30 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i31 = i29 | (~((i30 & 24) | (i30 ^ 24)));
                            int i32 = ~(tapTimeout | 24);
                            int i33 = i27 >> (((i31 & i32) | (i31 ^ i32)) * 494);
                            Object[] objArr6 = new Object[i8];
                            f(cArr, i33, objArr6);
                            obj = objArr6[i9];
                        } else {
                            int i34 = ~tapTimeout;
                            int i35 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i36 = i21 + ((i34 | 24 | i35) * 494);
                            int i37 = ~(i34 | (-25));
                            int i38 = ~((i35 ^ 24) | (i35 & 24));
                            int i39 = ((i37 & i38) | (i37 ^ i38) | (~((tapTimeout ^ 24) | (tapTimeout & 24)))) * 494;
                            int i40 = ((i36 | i39) << i8) - (i39 ^ i36);
                            Object[] objArr7 = new Object[i8];
                            f(cArr, i40, objArr7);
                            obj = objArr7[i9];
                        }
                        Class<?> cls3 = Class.forName((String) obj);
                        Object[] objArr8 = new Object[i8];
                        f(new char[]{45398, 19508, 7598, 58936, 38690, 19159, 47080, 26805, 19446, 22109, 42771, 18383, 43992, 45701}, TextUtils.indexOf((CharSequence) "", '0', i9, i9) + 13, objArr8);
                        Object[] objArr9 = new Object[i8];
                        objArr9[i9] = Integer.valueOf(((Integer) cls3.getMethod((String) objArr8[i9], clsArr5).invoke(method2, clsArr5)).intValue());
                        char[] cArr2 = {25011, 22903, 63816, 41953, 46552, 24932, 44717, 32624, 11876, 32991, 49656, 48446, 56617, 55927, 36182, 5672, 7301, 35863, 57113, 32647, 10242, 13246, 52330, 6219, 47241, 12905, 45876, 17610};
                        int i41 = asInterface;
                        int i42 = (i41 & 33) + (i41 | 33);
                        d = i42 % 128;
                        int i43 = i42 % 2;
                        int i44 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i45 = i44 * 765;
                        int i46 = (i45 ^ (-39702)) + ((i45 & (-39702)) << i8);
                        int i47 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i48 = ~((i47 ^ i44) | (i47 & i44));
                        int i49 = -(-(((i48 ^ 26) | (i48 & 26)) * 764));
                        int i50 = (i46 ^ i49) + ((i46 & i49) << i8);
                        int i51 = ~i44;
                        int i52 = ~((i51 ^ 26) | (i51 & 26));
                        int i53 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i54 = ~((i53 ^ 26) | (i53 & 26));
                        int i55 = ((i52 ^ i54) | (i54 & i52)) * (-1528);
                        int i56 = (i50 ^ i55) + ((i50 & i55) << i8);
                        int i57 = ~i44;
                        int i58 = ~((i57 ^ 26) | (i57 & 26));
                        int i59 = ~((-27) | i44);
                        int i60 = (i58 ^ i59) | (i59 & i58);
                        int i61 = d + 31;
                        asInterface = i61 % 128;
                        int i62 = i61 % 2;
                        int i63 = i56 + (764 * (i60 | (~(i47 | i44))));
                        Object[] objArr10 = new Object[i8];
                        f(cArr2, i63, objArr10);
                        Class<?> cls4 = Class.forName((String) objArr10[i9]);
                        char[] cArr3 = {12903, 43136, 26779, 36558, 50285, 29964, 43395, 25540, 22677, 65408};
                        int i64 = -ImageFormat.getBitsPerPixel(i9);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i65 = i64 * 46;
                        int i66 = (i65 ^ 322) + ((i65 & 322) << i8);
                        int i67 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i68 = ~(((-8) ^ i67) | (i67 & (-8)));
                        int i69 = ((i66 + (((i64 ^ i68) | (i68 & i64)) * (-90))) - (~(-(-(((~((i64 ^ 7) | (i64 & 7))) | (~(((-8) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-8) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3)))) * (-45)))))) - i8;
                        int i70 = (~i64) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i71 = d;
                        int i72 = (i71 & 119) + (i71 | 119);
                        asInterface = i72 % 128;
                        int i73 = i72 % 2;
                        int i74 = ~i70;
                        int i75 = (i74 & (-8)) | ((-8) ^ i74);
                        int i76 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i77 = ~((i64 & i76) | (i76 ^ i64));
                        int i78 = i69 + (45 * ((i75 & i77) | (i75 ^ i77)));
                        Object[] objArr11 = new Object[1];
                        f(cArr3, i78, objArr11);
                        if (((Boolean) cls4.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, objArr9)).booleanValue()) {
                            Class cls5 = Long.TYPE;
                            Object[] objArr12 = new Object[1];
                            f(new char[]{35848, 42585, 43744, 50735, 12302, 63780, 17074, 6575, 17547, 5211, 22993, 26868, 44006, 16744, 60781, 2833, 64698, 10592, 26938, 52370, 35422, 12091, 19644, 63439, 36787, 18098}, 23 - (~(-KeyEvent.keyCodeFromString(""))), objArr12);
                            Class<?> cls6 = Class.forName((String) objArr12[0]);
                            char[] cArr4 = {38574, 53268, 26634, 60824, 10091, 64373, 10430, 65356, 48008, 5097, 4159, 4744, 2056, 22519, 46928, 63942};
                            int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout();
                            int i79 = d + 87;
                            asInterface = i79 % 128;
                            if (i79 % 2 == 0) {
                                Object[] objArr13 = new Object[1];
                                f(cArr4, (jumpTapTimeout % 7) * 13, objArr13);
                                str2 = (String) objArr13[0];
                                clsArr2 = null;
                            } else {
                                Object[] objArr14 = new Object[1];
                                f(cArr4, (jumpTapTimeout >> 16) + 13, objArr14);
                                str2 = (String) objArr14[0];
                                clsArr2 = null;
                            }
                            Method method3 = cls6.getMethod(str2, clsArr2);
                            int i80 = d;
                            int i81 = (i80 ^ 33) + ((i80 & 33) << 1);
                            asInterface = i81 % 128;
                            int i82 = i81 % 2;
                            if (cls5.equals(method3.invoke(method2, null))) {
                                int i83 = -((Process.getThreadPriority(0) + 20) >> 6);
                                Object[] objArr15 = new Object[1];
                                f(new char[]{35848, 42585, 43744, 50735, 12302, 63780, 17074, 6575, 17547, 5211, 22993, 26868, 44006, 16744, 60781, 2833, 64698, 10592, 26938, 52370, 35422, 12091, 19644, 63439, 36787, 18098}, (i83 & 24) + (i83 | 24), objArr15);
                                Class<?> cls7 = Class.forName((String) objArr15[0]);
                                int i84 = d + 59;
                                asInterface = i84 % 128;
                                int i85 = i84 % 2;
                                char[] cArr5 = {16944, 50663, 31831, 16557, 25730, 33855, 4509, 65278, 27993, 9493, 1242, 27163, 27019, 59060, 56985, 31874, 51975, 26971, 50927, 20381};
                                int edgeSlop2 = ViewConfiguration.getEdgeSlop() >> 16;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i86 = d + 31;
                                int i87 = i86 % 128;
                                asInterface = i87;
                                if (i86 % 2 == 0) {
                                    i4 = (595 << edgeSlop2) + 1170;
                                } else {
                                    int i88 = edgeSlop2 * 595;
                                    i4 = ((i88 | (-20179)) << 1) - (i88 ^ (-20179));
                                }
                                int i89 = ~((~edgeSlop2) | 17);
                                int i90 = (i87 & 21) + (i87 | 21);
                                int i91 = i90 % 128;
                                d = i91;
                                if (i90 % 2 != 0) {
                                    int i92 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                    i5 = i4 << ((-1188) >> (i89 | (~((i92 & 17) | (i92 ^ 17)))));
                                } else {
                                    int i93 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | 17);
                                    i5 = (i4 - (~(-(-((-1188) * ((i89 & i93) | (i89 ^ i93))))))) - 1;
                                }
                                int i94 = ~edgeSlop2;
                                int i95 = (i94 & 17) | (i94 ^ 17);
                                int i96 = i91 + 67;
                                int i97 = i96 % 128;
                                asInterface = i97;
                                int i98 = i96 % 2;
                                int i99 = ~i95;
                                int i100 = ~(((-18) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-18) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                int i101 = (i99 & i100) | (i99 ^ i100);
                                int i102 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                int i103 = ~((i102 & edgeSlop2) | (i102 ^ edgeSlop2));
                                int i104 = 594 * ((i101 & i103) | (i101 ^ i103));
                                int i105 = (i5 ^ i104) + ((i5 & i104) << 1);
                                int i106 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                int i107 = ~(((-18) ^ i106) | ((-18) & i106));
                                int i108 = (i97 & 21) + (i97 | 21);
                                d = i108 % 128;
                                if (i108 % 2 != 0) {
                                    int i109 = ~(((-18) ^ edgeSlop2) | ((-18) & edgeSlop2));
                                    int i110 = (i107 & i109) | (i107 ^ i109);
                                    int i111 = ~((edgeSlop2 & i106) | (i106 ^ edgeSlop2));
                                    int i112 = i110 ^ i111;
                                    Object[] objArr16 = new Object[1];
                                    f(cArr5, i105 >>> (594 % ((i111 & i110) | i112)), objArr16);
                                    str3 = (String) objArr16[0];
                                    clsArr3 = null;
                                } else {
                                    int i113 = ~((edgeSlop2 & (-18)) | ((-18) ^ edgeSlop2));
                                    int i114 = (i113 & i107) | (i107 ^ i113);
                                    Object[] objArr17 = new Object[1];
                                    f(cArr5, i105 + (((i114 & i103) | (i114 ^ i103)) * 594), objArr17);
                                    str3 = (String) objArr17[0];
                                    clsArr3 = null;
                                }
                                Method method4 = cls7.getMethod(str3, clsArr3);
                                int i115 = asInterface;
                                int i116 = ((i115 | 23) << 1) - (i115 ^ 23);
                                d = i116 % 128;
                                int i117 = i116 % 2;
                                Object[] objArr18 = (Object[]) method4.invoke(method2, null);
                                if (objArr18.length == 2) {
                                    int i118 = d + 13;
                                    asInterface = i118 % 128;
                                    int i119 = i118 % 2;
                                    if (!Long.TYPE.equals(objArr18[0])) {
                                        continue;
                                    } else {
                                        int i120 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i121 = i120 * 46;
                                        int i122 = (i121 ^ 1150) + ((i121 & 1150) << 1);
                                        int i123 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                        int i124 = ~((-26) | i123);
                                        int i125 = ((i124 & i120) | (i120 ^ i124)) * (-90);
                                        int i126 = (i122 & i125) + (i122 | i125);
                                        int i127 = ~((-26) | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                                        int i128 = ~((i120 ^ 25) | (i120 & 25));
                                        int i129 = -(-(((i127 & i128) | (i127 ^ i128)) * (-45)));
                                        int i130 = ((i126 | i129) << 1) - (i129 ^ i126);
                                        int i131 = ~i120;
                                        int i132 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & i131) | (i131 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                        int i133 = (i132 & (-26)) | ((-26) ^ i132);
                                        int i134 = ~((i120 & i123) | (i123 ^ i120));
                                        int i135 = ((i134 & i133) | (i133 ^ i134)) * 45;
                                        int i136 = (i130 ^ i135) + ((i135 & i130) << 1);
                                        Object[] objArr19 = new Object[1];
                                        f(new char[]{35848, 42585, 43744, 50735, 12302, 63780, 17074, 6575, 17547, 5211, 22993, 26868, 44006, 16744, 60781, 2833, 64698, 10592, 26938, 52370, 35422, 12091, 19644, 63439, 36787, 18098}, i136, objArr19);
                                        if (Class.forName((String) objArr19[0]).equals(objArr18[1])) {
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                                                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2824;
                                                int iAlpha = Color.alpha(0) + 22;
                                                byte[] bArr3 = $$d;
                                                byte b6 = bArr3[7];
                                                Object[] objArr20 = new Object[1];
                                                e(b6, b6, (byte) (-bArr3[5]), objArr20);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, bitsPerPixel, iAlpha, 1814927978, false, (String) objArr20[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char size = (char) View.MeasureSpec.getSize(0);
                                                int threadPriority = 2823 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                int offsetAfter2 = 22 - TextUtils.getOffsetAfter("", 0);
                                                byte[] bArr4 = $$d;
                                                byte b7 = bArr4[7];
                                                Object[] objArr21 = new Object[1];
                                                e(b7, b7, (byte) (-bArr4[5]), objArr21);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, threadPriority, offsetAfter2, 1814927978, false, (String) objArr21[0], null);
                                            }
                                            try {
                                                Object[] objArr22 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2823;
                                                    int scrollDefaultDelay = 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    byte[] bArr5 = $$d;
                                                    byte b8 = bArr5[5];
                                                    byte b9 = bArr5[10];
                                                    Object[] objArr23 = new Object[1];
                                                    e(b8, b9, (byte) (b9 | 32), objArr23);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity, absoluteGravity, scrollDefaultDelay, -2137287382, false, (String) objArr23[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr22)).longValue();
                                                break;
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        i20 = (i20 & 1) + (i20 | 1);
                        i6 = 2;
                        clsArr5 = null;
                        i9 = 0;
                        i8 = 1;
                        i17 = 16;
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
                char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2823;
                int i137 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
                byte[] bArr6 = $$d;
                byte b10 = bArr6[7];
                Object[] objArr24 = new Object[1];
                e(b10, b10, (byte) (-bArr6[5]), objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority2, scrollBarFadeDuration, i137, 1814927978, false, (String) objArr24[0], null);
            }
            Object[] objArr25 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cResolveSize = (char) View.resolveSize(0, 0);
                int threadPriority3 = 2823 - ((Process.getThreadPriority(0) + 20) >> 6);
                int size2 = 22 - View.MeasureSpec.getSize(0);
                Object[] objArr26 = new Object[1];
                e($$d[5], (byte) 14, (byte) 51, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSize, threadPriority3, size2, 1025296417, false, (String) objArr26[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr25);
            Object[] objArr27 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char cArgb = (char) (Color.argb(0, 0, 0, 0) + 37657);
                int i138 = 2721 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 19;
                Object[] objArr28 = new Object[1];
                e($$d[5], (byte) 14, (byte) 51, objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cArgb, i138, iIndexOf, -1568796068, false, (String) objArr28[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr27)).longValue();
            long j = -561469668;
            long j2 = -167;
            long j3 = -1;
            long j4 = jLongValue ^ j3;
            long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            long j5 = (j2 * j) + (j2 * jLongValue) + (((long) 336) * ((((j ^ j3) | j4) ^ j3) | ((j4 | startElapsedRealtime) ^ j3))) + (((long) (-168)) * (((jLongValue | j) ^ j3) | ((j | startElapsedRealtime) ^ j3))) + (((long) 168) * (j4 | (((startElapsedRealtime ^ j3) | j) ^ j3))) + ((long) (-1248936177));
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i139 = ((int) (j5 >> 32)) & (1990370934 + (((~((~elapsedCpuTime) | (-143131019))) | (~((-6698086) | elapsedCpuTime))) * (-302)) + ((~((-143131019) | elapsedCpuTime)) * (-604)) + (((~(elapsedCpuTime | (-149829104))) | (-1593753600)) * 302));
            int i140 = (int) j5;
            int i141 = d;
            int i142 = ((i141 | 123) << 1) - (i141 ^ 123);
            asInterface = i142 % 128;
            if (i142 % 2 == 0) {
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i143 = ~iElapsedRealtime;
                int i144 = i140 & (115883790 + ((1112170821 | i143) * (-757)) + ((~((-671156241) | iElapsedRealtime)) * 1514) + (((~(iElapsedRealtime | 1783327061)) | (~(i143 | (-1745570065))) | 1074413824) * 757));
                i = (i139 & i144) | (i139 ^ i144);
                i2 = i / 28;
            } else {
                int iNextInt = new Random().nextInt();
                int i145 = ~((-1178963798) | iNextInt);
                int i146 = ~iNextInt;
                int i147 = i145 | (~(1678777088 | i146));
                int i148 = ~(1178963797 | i146);
                i = i139 | (i140 & ((-1642846807) + ((i147 | i148) * (-516)) + (((~(iNextInt | (-1140853505))) | (~((-537923585) | i146))) * 516) + ((537923584 | i148) * 516)));
                i2 = i >>> 24;
            }
            int i149 = i & ViewCompat.MEASURED_SIZE_MASK;
            if (i2 != 0) {
                int i150 = d;
                int i151 = (i150 & 29) + (i150 | 29);
                asInterface = i151 % 128;
                int i152 = i151 % 2;
                z = true;
            } else {
                int i153 = d + 53;
                asInterface = i153 % 128;
                int i154 = i153 % 2;
                z = false;
            }
            if (z) {
                int i155 = d;
                int i156 = (i155 & 79) + (i155 | 79);
                asInterface = i156 % 128;
                int i157 = i156 % 2;
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (z) {
                int i158 = asInterface;
                int i159 = (i158 ^ 17) + ((i158 & 17) << 1);
                int i160 = i159 % 128;
                d = i160;
                int i161 = i159 % 2;
                if (i149 >= 2 || (method = methodArr[i149]) == null) {
                    string = null;
                } else {
                    int i162 = ((i160 | 95) << 1) - (i160 ^ 95);
                    asInterface = i162 % 128;
                    int i163 = i162 % 2;
                    string = method.toString();
                }
            } else {
                string = null;
            }
            list.add(string);
            int i164 = asInterface + 63;
            d = i164 % 128;
            return (i164 % 2 != 0 ? i2 >> 6 : ((i2 | 6) << 1) - (i2 ^ 6)) * i3;
        }

        private static String $$g(int i, int i2, int i3) {
            int i4 = (i3 * 4) + 4;
            int i5 = (i2 * 2) + 108;
            int i6 = i * 2;
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i6 + 1];
            int i7 = -1;
            if (bArr == null) {
                i4++;
                i5 = i4 + i6;
            }
            while (true) {
                int i8 = i4;
                int i9 = i5;
                i7++;
                bArr2[i7] = (byte) i9;
                if (i7 == i6) {
                    return new String(bArr2, 0);
                }
                i4 = i8 + 1;
                i5 = i9 + bArr[i8];
            }
        }
    }
}
