package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
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
import androidx.core.view.ViewCompat;
import com.google.android.gms.measurement.internal.zzny;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import kotlin.jvm.functions.Function2;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class M implements Function2 {
    private static final byte[] $$c = {5, -91, 77, 46};
    private static final int $$f = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {87, -91, 60, 112, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 107;
    private static final byte[] $$a = {8, -36, 87, -65, -6, 24, -18, 26, -71, 67, -6, 18, -67, 72, 3, -4, -59, 40, 3, -4, -6, 47, 2, 9, -12, 22, -1, 8, -2, 14, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 40, 21, 1, 21, 0, -10, -16, 18, 16, -7, 14, 1};
    private static final int $$b = 90;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {60053, 60086, 59750, 60040, 60059, 60046, 60045, 60063, 60047, 60054, 59746, 60049, 60085, 60079, 59749, 59745, 60061, 60034, 60062, 60060, 59747, 60043, 60057, 60055, 59744, 60051, 60056, 60058, 60050, 60052, 60041, 60075, 60073, 60117, 59751, 59748};
    private static char TuitionPaymentFragmentbindingInflater1 = 57191;

    private static void a(int i, byte b, int i2, Object[] objArr) {
        int i3 = 106 - b;
        int i4 = 30 - i2;
        byte[] bArr = $$a;
        int i5 = i * 2;
        byte[] bArr2 = new byte[i5 + 4];
        int i6 = i5 + 3;
        int i7 = -1;
        if (bArr == null) {
            i4++;
            i3 = (i4 + i6) - 3;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i8 = bArr[i4];
                i4++;
                i3 = (i3 + i8) - 3;
            }
        }
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
    private static void b(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 84
            byte[] r0 = defpackage.M.$$d
            int r5 = r5 * 52
            int r5 = 56 - r5
            int r6 = r6 * 52
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r3 = r0[r5]
        L28:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            int r5 = r5 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.M.b(int, short, short, java.lang.Object[]):void");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        FileTransformFactory fileTransformFactory = (FileTransformFactory) obj;
        CoordinateTransform coordinateTransform = (CoordinateTransform) obj2;
        if (i2 % 2 == 0) {
            return L.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileTransformFactory, coordinateTransform);
        }
        L.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileTransformFactory, coordinateTransform);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    private static void c(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int i5 = $11 + 9;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - Process.getGidForName("")), 2267 - View.combineMeasuredStates(0, 0), TextUtils.getCapsMode("", 0, 0) + 33, -1927765101, false, $$g(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
                    i4 = 1770390596;
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
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b4 = (byte) 0;
            byte b5 = b4;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2267, 32 - TextUtils.lastIndexOf("", '0', 0, 0), -1927765101, false, $$g(b4, b5, (byte) (b5 + 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
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
                int i8 = $11 + 101;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 3260 - TextUtils.indexOf((CharSequence) "", '0', 0), 30 - Color.blue(0), -127612708, false, $$g(b6, b7, (byte) (b7 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 22878), ExpandableListView.getPackedPositionGroup(0L) + 594, 17 - TextUtils.getOffsetAfter("", 0), 1570859318, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i11];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                            int i13 = $11 + 15;
                            $10 = i13 % 128;
                            int i14 = i13 % 2;
                        } else {
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        int i17 = $10 + 43;
        $11 = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 0;
        while (i19 < i) {
            int i20 = $10 + 19;
            $11 = i20 % 128;
            if (i20 % 2 == 0) {
                cArr4[i19] = (char) (cArr4[i19] ^ 2238);
                i19 += 103;
            } else {
                cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                i19++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0755  */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) throws Throwable {
        Class<?> cls;
        char c;
        long j;
        int i;
        int i2;
        boolean z;
        int i3;
        String string;
        Method method;
        Class<?> cls2;
        char[] cArr;
        int tapTimeout;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 2 % 2;
        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 1;
        Method[] methodArr = new Method[1];
        byte[] bArr = $$a;
        Object[] objArr = new Object[1];
        a((byte) (-bArr[48]), bArr[38], bArr[7], objArr);
        int i17 = 0;
        Class<?> cls3 = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(bArr[38], bArr[36], bArr[14], objArr2);
        String str = (String) objArr2[0];
        Class<?>[] clsArr = new Class[3];
        clsArr[0] = KeyManager[].class;
        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
        if (i18 % 2 == 0) {
            clsArr[1] = TrustManager[].class;
            byte b = (byte) (-bArr[35]);
            byte b2 = bArr[38];
            Object[] objArr3 = new Object[1];
            a(b, b2, b2, objArr3);
            cls = Class.forName((String) objArr3[0]);
            c = 3;
        } else {
            clsArr[1] = TrustManager[].class;
            byte b3 = (byte) (-bArr[35]);
            byte b4 = bArr[38];
            Object[] objArr4 = new Object[1];
            a(b3, b4, b4, objArr4);
            cls = Class.forName((String) objArr4[0]);
            c = 2;
        }
        clsArr[c] = cls;
        methodArr[0] = cls3.getMethod(str, clsArr);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2823;
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22;
            byte[] bArr2 = $$d;
            byte b5 = (byte) (-bArr2[5]);
            byte b6 = bArr2[7];
            Object[] objArr5 = new Object[1];
            b(b5, b6, b6, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, iNormalizeMetaState, doubleTapTimeout, 1814927978, false, (String) objArr5[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2822, 22 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i19 = 0;
            while (i19 < length) {
                int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                int i21 = i20 % 2;
                Method method2 = declaredMethods[i19];
                try {
                    char[] cArr2 = {'\t', 29, '\t', 24, '#', 21, 24, 3, 21, 31, 0, 24, 17, 22, 20, 24, '\t', ' ', 0, 19, 7, 26, 25, 11};
                    int i22 = -View.resolveSizeAndState(i17, i17, i17);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i23 = (i22 * 530) + 1058;
                    int i24 = ((i23 | 24910) << i16) - (i23 ^ 24910);
                    int i25 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i26 = ~((i25 ^ i22) | (i25 & i22));
                    int i27 = ~((i22 ^ 47) | (i22 & 47));
                    int i28 = ((i26 ^ i27) | (i27 & i26)) * 529;
                    int i29 = ((i24 | i28) << i16) - (i28 ^ i24);
                    int i30 = ~(i22 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    int i31 = ((i30 & (-48)) | ((-48) ^ i30)) * 529;
                    byte b7 = (byte) ((i29 ^ i31) + ((i31 & i29) << i16));
                    int i32 = -TextUtils.indexOf((CharSequence) "", '0', i17, i17);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i33 = ~i32;
                    int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i35 = (i34 & 17) + (i34 | 17);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i35 % 128;
                    int i36 = i35 % 2;
                    int i37 = (~((i33 ^ (-24)) | (i33 & (-24)))) | (~(((-24) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-24) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3)));
                    int i38 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i39 = i38 | i32;
                    int i40 = ~((i39 ^ 23) | (i39 & 23));
                    int i41 = (((i32 * 1773) - 20355) - (~(886 * ((i37 ^ i40) | (i37 & i40))))) - i16;
                    int i42 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i43 = ~((i42 & 23) | (i42 ^ 23));
                    int i44 = -(-(((i43 & i32) | (i32 ^ i43)) * (-1772)));
                    int i45 = (i41 ^ i44) + ((i44 & i41) << i16);
                    int i46 = (i38 ^ i32) | (i32 & i38);
                    int i47 = i34 + 117;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i47 % 128;
                    int i48 = i47 % 2;
                    int i49 = (i45 - (~(886 * (~i46)))) - i16;
                    Object[] objArr6 = new Object[i16];
                    c(cArr2, b7, i49, objArr6);
                    Class<?> cls4 = Class.forName((String) objArr6[0]);
                    char[] cArr3 = {20, 19, 7, 2, 25, 11, Typography.quote, 22, 24, 22, '!', 0};
                    int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                    int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i50 = (jumpTapTimeout * (-665)) + 4008;
                    int i51 = -(-((~jumpTapTimeout) * (-333)));
                    int i52 = ((i50 | i51) << i16) - (i50 ^ i51);
                    int i53 = ~jumpTapTimeout;
                    int i54 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i55 = ~((i54 & i53) | (i53 ^ i54));
                    int i56 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 ^ 12) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & 12));
                    int i57 = ((i55 ^ i56) | (i55 & i56)) * 333;
                    int i58 = ~((i53 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i53 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                    int i59 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i60 = ~((i59 & 12) | (i59 ^ 12));
                    int i61 = (((i52 | i57) << i16) - (i57 ^ i52)) + (((i60 & i58) | (i58 ^ i60)) * 333);
                    Object[] objArr7 = new Object[i16];
                    c(cArr3, (byte) ((pressedStateDuration & 2) + (pressedStateDuration | 2)), i61, objArr7);
                    Object[] objArr8 = new Object[i16];
                    objArr8[0] = Integer.valueOf(((Integer) cls4.getMethod((String) objArr7[0], null).invoke(method2, null)).intValue());
                    char[] cArr4 = {'\t', 29, '\t', 24, '#', 21, 24, 3, 21, 31, 0, 24, 17, 22, 20, 24, '\t', ' ', 5, 25, '\n', 25, 22, Typography.quote, 24, 0};
                    int i62 = -KeyEvent.normalizeMetaState(0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i63 = i62 * (-1965);
                    int i64 = ((i63 | 110208) << i16) - (i63 ^ 110208);
                    int i65 = -(-(((i62 ^ (-113)) | (i62 & (-113))) * 983));
                    int i66 = (i64 & i65) + (i65 | i64);
                    int i67 = -(-(((~i62) | (~((-113) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault5)))) * (-983)));
                    int i68 = (i66 ^ i67) + ((i67 & i66) << i16);
                    int i69 = ~i62;
                    int i70 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                    int i71 = ~((i70 & i69) | (i69 ^ i70));
                    int i72 = ~((i69 & 112) | (i69 ^ 112));
                    int i73 = -(-(((i72 & i71) | (i71 ^ i72)) * 983));
                    int i74 = -(-ExpandableListView.getPackedPositionGroup(0L));
                    Object[] objArr9 = new Object[i16];
                    c(cArr4, (byte) (((i68 | i73) << i16) - (i73 ^ i68)), (i74 & 26) + (26 | i74), objArr9);
                    String str2 = (String) objArr9[0];
                    int i75 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i75 % 128;
                    int i76 = i75 % 2;
                    Class<?> cls5 = Class.forName(str2);
                    byte b8 = (byte) (90 - (~(-(-TextUtils.lastIndexOf("", '0', 0)))));
                    int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                    int i77 = (windowTouchSlop ^ 8) + ((windowTouchSlop & 8) << i16);
                    Object[] objArr10 = new Object[i16];
                    c(new char[]{27, 4, 15, 24, '\n', 26, '\f', 24}, b8, i77, objArr10);
                    String str3 = (String) objArr10[0];
                    Class<?>[] clsArr2 = new Class[i16];
                    clsArr2[0] = Integer.TYPE;
                    if (((Boolean) cls5.getMethod(str3, clsArr2).invoke(null, objArr8)).booleanValue()) {
                        Class cls6 = Long.TYPE;
                        char[] cArr5 = {'\t', 29, '\t', 24, '#', 21, 24, 3, 21, 31, 0, 24, 17, 22, 20, 24, '\t', ' ', 0, 19, 7, 26, 25, 11};
                        int i78 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i79 = (i78 * (-830)) + 39936;
                        int i80 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        int i81 = ~(((-49) & i80) | ((-49) ^ i80));
                        int i82 = (i78 ^ 48) | (i78 & 48);
                        int i83 = ~((i82 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i82 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                        int i84 = -(-(((i81 ^ i83) | (i81 & i83)) * (-831)));
                        int i85 = (i79 & i84) + (i79 | i84);
                        int i86 = ((-49) & i78) | ((-49) ^ i78);
                        int i87 = (i85 - (~((~((i86 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i86 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) * (-1662)))) - i16;
                        int i88 = ~((~i78) | i80);
                        int i89 = ~(i78 | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                        int i90 = (i89 & i88) | (i88 ^ i89);
                        int i91 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & 48) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ 48));
                        byte b9 = (byte) ((i87 - (~(-(-(((i90 & i91) | (i90 ^ i91)) * 831))))) - i16);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i92 = packedPositionType * 217;
                        int i93 = ((i92 | (-5160)) << i16) - (i92 ^ (-5160));
                        int i94 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i95 = (i94 ^ 47) + ((i94 & 47) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i95 % 128;
                        int i96 = i95 % 2;
                        int i97 = i93 + (216 * (~((packedPositionType ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (packedPositionType & iTuitionPaymentFragmentspecialinlinedviewModeldefault7))));
                        int i98 = (packedPositionType ^ (-25)) | (packedPositionType & (-25));
                        int i99 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        int i100 = (i97 - (~(((i98 ^ i99) | (i98 & i99)) * (-216)))) - 1;
                        int i101 = (i94 & 23) + (i94 | 23);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i101 % 128;
                        if (i101 % 2 != 0) {
                            int i102 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | packedPositionType);
                            Object[] objArr11 = new Object[1];
                            c(cArr5, b9, i100 * (216 >> ((i102 & 24) | (i102 ^ 24))), objArr11);
                            cls2 = Class.forName((String) objArr11[0]);
                            cArr = new char[]{20, 19, 14, 2, 20, 6, 0, '#', 1, '\f', 15, 23, 13933};
                            tapTimeout = ViewConfiguration.getTapTimeout();
                            i4 = 111;
                            i5 = 82;
                        } else {
                            int i103 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                            int i104 = ~((i103 & packedPositionType) | (i103 ^ packedPositionType));
                            int i105 = ((i104 & 24) | (i104 ^ 24)) * 216;
                            int i106 = ((i100 | i105) << 1) - (i105 ^ i100);
                            Object[] objArr12 = new Object[1];
                            c(cArr5, b9, i106, objArr12);
                            cls2 = Class.forName((String) objArr12[0]);
                            cArr = new char[]{20, 19, 14, 2, 20, 6, 0, '#', 1, '\f', 15, 23, 13933};
                            tapTimeout = ViewConfiguration.getTapTimeout();
                            i4 = 110;
                            i5 = 16;
                        }
                        int i107 = -(tapTimeout >> i5);
                        byte b10 = (byte) ((i4 & i107) + (i107 | i4));
                        int i108 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        Object[] objArr13 = new Object[1];
                        c(cArr, b10, (i108 & 13) + (i108 | 13), objArr13);
                        if (cls6.equals(cls2.getMethod((String) objArr13[0], null).invoke(method2, null))) {
                            int i109 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i110 = (i109 ^ 67) + ((i109 & 67) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i110 % 128;
                            int i111 = i110 % 2;
                            byte b11 = (byte) (46 - (~(-(KeyEvent.getMaxKeyCode() >> 16))));
                            int i112 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i113 = ((i112 * 51) - 1176) + (((i112 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i112 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8)) * (-50));
                            int i114 = ~i112;
                            int i115 = (i114 & (-25)) | (i114 ^ (-25));
                            int i116 = ~((i115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                            int i117 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                            int i118 = ~(((-25) ^ i117) | ((-25) & i117) | i112);
                            int i119 = -(-(((i116 ^ i118) | (i116 & i118)) * 50));
                            int i120 = ((i113 | i119) << 1) - (i113 ^ i119);
                            int i121 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                            int i122 = ~((i121 & (-25)) | ((-25) ^ i121));
                            int i123 = ~(((-25) ^ i112) | ((-25) & i112));
                            int i124 = (i122 & i123) | (i122 ^ i123);
                            int i125 = ~((i112 & i117) | (i117 ^ i112));
                            int i126 = i120 + (((i125 & i124) | (i124 ^ i125)) * 50);
                            Object[] objArr14 = new Object[1];
                            c(new char[]{'\t', 29, '\t', 24, '#', 21, 24, 3, 21, 31, 0, 24, 17, 22, 20, 24, '\t', ' ', 0, 19, 7, 26, 25, 11}, b11, i126, objArr14);
                            Class<?> cls7 = Class.forName((String) objArr14[0]);
                            Object[] objArr15 = new Object[1];
                            c(new char[]{20, 19, 7, ' ', 24, '!', '!', 15, 20, 6, 24, 0, 14, '\f', 22, 19, 13841}, (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 40), 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr15);
                            Object[] objArr16 = (Object[]) cls7.getMethod((String) objArr15[0], null).invoke(method2, null);
                            if (objArr16.length == 2 && Long.TYPE.equals(objArr16[0])) {
                                char[] cArr6 = {'\t', 29, '\t', 24, '#', 21, 24, 3, 21, 31, 0, 24, 17, 22, 20, 24, '\t', ' ', 0, 19, 7, 26, 25, 11};
                                int i127 = -MotionEvent.axisFromString("");
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i128 = i127 * (-751);
                                int i129 = ((i128 | (-34546)) << 1) - (i128 ^ (-34546));
                                int i130 = ~i127;
                                int i131 = ~((i130 ^ (-47)) | (i130 & (-47)));
                                int i132 = ~i127;
                                int i133 = ~((i132 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i132 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                int i134 = (i129 - (~(-(-(((i131 ^ i133) | (i131 & i133)) * 1504))))) - 1;
                                int i135 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i136 = (i135 ^ 89) + ((i135 & 89) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i136 % 128;
                                if (i136 % 2 == 0) {
                                    int i137 = i130 | 46;
                                    int i138 = -(-((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & i137) | (i137 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9))) * (-1504)));
                                    i6 = (i134 ^ i138) + ((i138 & i134) << 1);
                                    i7 = ~((i132 ^ 46) | (i132 & 46));
                                } else {
                                    int i139 = i132 | 46;
                                    int i140 = ((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault9 | i139)) * (-1504)) + i134;
                                    int i141 = ~i139;
                                    i6 = i140;
                                    i7 = i141;
                                }
                                byte b12 = (byte) (i6 + (752 * ((~(i127 | (-47))) | i7)));
                                int i142 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i143 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i144 = (i143 & 83) + (i143 | 83);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i144 % 128;
                                if (i144 % 2 != 0) {
                                    i8 = ((-721) % i142) * (-31);
                                    i9 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                    i10 = ~i142;
                                    i11 = i10 ^ (-24);
                                } else {
                                    int i145 = i142 * (-721);
                                    i8 = ((i145 & (-16583)) << 1) + (i145 ^ (-16583));
                                    i9 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                    i10 = ~i142;
                                    i11 = i10 ^ (-24);
                                }
                                int i146 = ~(i11 | (i10 & (-24)));
                                int i147 = (i9 ^ i146) | (i9 & i146);
                                int i148 = ~((i142 ^ 23) | (i142 & 23));
                                int i149 = 1444 * ((i147 ^ i148) | (i147 & i148));
                                int i150 = (i8 & i149) + (i8 | i149);
                                int i151 = ~(i142 | 23);
                                int i152 = (i142 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i142 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10);
                                int i153 = i143 + 125;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i153 % 128;
                                if (i153 % 2 != 0) {
                                    int i154 = ~i152;
                                    int i155 = (i154 & i151) | (i151 ^ i154);
                                    int i156 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & 23) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 ^ 23));
                                    int i157 = -((-1444) % ((i156 & i155) | (i155 ^ i156)));
                                    i12 = (i150 & i157) + (i157 | i150);
                                } else {
                                    int i158 = ~i152;
                                    int i159 = (i158 & i151) | (i151 ^ i158);
                                    int i160 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & 23) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 ^ 23));
                                    i12 = (i150 - (~(((i160 & i159) | (i159 ^ i160)) * (-1444)))) - 1;
                                }
                                int i161 = ~i142;
                                int i162 = ~((i161 & 23) | (i161 ^ 23));
                                int i163 = ~((i142 & (-24)) | ((-24) ^ i142));
                                int i164 = 722 * ((i162 & i163) | (i162 ^ i163));
                                int i165 = (i12 & i164) + (i164 | i12);
                                Object[] objArr17 = new Object[1];
                                c(cArr6, b12, i165, objArr17);
                                if (!(!Class.forName((String) objArr17[0]).equals(objArr16[1]))) {
                                    int i166 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i167 = ((i166 | 29) << 1) - (i166 ^ 29);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i167 % 128;
                                    int i168 = i167 % 2;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                        int i169 = 2824 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                        int i170 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
                                        byte[] bArr3 = $$d;
                                        byte b13 = (byte) (-bArr3[5]);
                                        byte b14 = bArr3[7];
                                        Object[] objArr18 = new Object[1];
                                        b(b13, b14, b14, objArr18);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i169, i170, 1814927978, false, (String) objArr18[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cIndexOf2 = (char) TextUtils.indexOf("", "");
                                        int iResolveSize = View.resolveSize(0, 0) + 2823;
                                        int tapTimeout2 = 22 - (ViewConfiguration.getTapTimeout() >> 16);
                                        byte[] bArr4 = $$d;
                                        byte b15 = (byte) (-bArr4[5]);
                                        byte b16 = bArr4[7];
                                        Object[] objArr19 = new Object[1];
                                        b(b15, b16, b16, objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, iResolveSize, tapTimeout2, 1814927978, false, (String) objArr19[0], null);
                                    }
                                    try {
                                        Object[] objArr20 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                            int iMyTid = 2823 - (Process.myTid() >> 22);
                                            int iMakeMeasureSpec = 22 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                            byte[] bArr5 = $$d;
                                            Object[] objArr21 = new Object[1];
                                            b(bArr5[7], (byte) (-bArr5[5]), bArr5[54], objArr21);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iMyTid, iMakeMeasureSpec, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr20)).longValue();
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
                        }
                    }
                    i19++;
                    declaredMethods = declaredMethods;
                    i16 = 1;
                    i17 = 0;
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
            char cRed = (char) Color.red(0);
            int i171 = 2823 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 22;
            byte[] bArr6 = $$d;
            byte b17 = (byte) (-bArr6[5]);
            byte b18 = bArr6[7];
            Object[] objArr22 = new Object[1];
            b(b17, b18, b18, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, i171, offsetBefore2, 1814927978, false, (String) objArr22[0], null);
        }
        Object[] objArr23 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2823;
            int pressedStateDuration2 = 22 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte[] bArr7 = $$d;
            Object[] objArr24 = new Object[1];
            b(bArr7[7], (byte) (-bArr7[5]), (byte) 14, objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, doubleTapTimeout2, pressedStateDuration2, 1025296417, false, (String) objArr24[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr23);
        Object[] objArr25 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37657);
            int offsetAfter = 2720 - TextUtils.getOffsetAfter("", 0);
            int iResolveSizeAndState = 19 - View.resolveSizeAndState(0, 0, 0);
            byte[] bArr8 = $$d;
            Object[] objArr26 = new Object[1];
            b(bArr8[7], (byte) (-bArr8[5]), (byte) 14, objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollBarFadeDuration, offsetAfter, iResolveSizeAndState, -1568796068, false, (String) objArr26[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr25)).longValue();
        int i172 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i172 % 128;
        if (i172 % 2 == 0) {
            long j2 = -1476465706;
            long j3 = -1;
            long j4 = jLongValue ^ j3;
            long jNextInt = ((((long) new Random().nextInt()) ^ j3) | jLongValue) ^ j3;
            long j5 = j2 ^ j3;
            j = (((long) (-1939)) * j2) + (((long) 971) * jLongValue) + (((long) (-970)) * (((j4 | j2) ^ j3) | jNextInt)) + (((long) 1940) * ((jLongValue | j5) ^ j3)) + (((long) 970) * (jNextInt | ((j5 | j4) ^ j3))) + ((long) (-333940139));
            i = (int) (j >> 72);
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i173 = ~elapsedCpuTime;
            i2 = 905975682 + ((elapsedCpuTime | 76022016) * 988) + (((~(1687757648 | i173)) | (-1862266870)) * (-1976)) + (((~(elapsedCpuTime | 250531237)) | 76022016 | (~((-250531238) | i173))) * 988);
        } else {
            long j6 = -1385750921;
            long j7 = (((long) 477) * j6) + (((long) (-475)) * jLongValue);
            long j8 = -1;
            long j9 = ((j6 ^ j8) | jLongValue) ^ j8;
            long j10 = jLongValue ^ j8;
            long jNextInt2 = new Random().nextInt();
            long j11 = ((j10 | j6) | jNextInt2) ^ j8;
            j = j7 + (((long) (-476)) * (j9 | j11)) + (((long) 952) * j11) + (((long) 476) * (((j10 | (jNextInt2 ^ j8)) | j6) ^ j8)) + ((long) (-424654924));
            i = (int) (j >> 32);
            int iNextInt = new Random().nextInt();
            int i174 = ~iNextInt;
            i2 = (-240705398) + (((~(i174 | (-1518614312))) | (~(1339126573 | i174)) | 268698626) * 464) + ((1607825199 | iNextInt) * (-464)) + (((~(iNextInt | (-1518614312))) | 268698626) * 464);
        }
        int i175 = i & i2;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i176 = ~iElapsedRealtime;
        int i177 = (~(1370721959 | i176)) | 38027520;
        int i178 = ~(iElapsedRealtime | (-1342245030));
        int i179 = ((int) j) & (663592904 + ((i177 | i178) * (-713)) + (i178 * 1426) + ((~(66504450 | i176)) * 713));
        int i180 = (i175 & i179) | (i175 ^ i179);
        int i181 = i180 >>> 24;
        int i182 = i180 & ViewCompat.MEASURED_SIZE_MASK;
        if (i181 != 0) {
            int i183 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i183 % 128;
            int i184 = i183 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            i3 = 0;
        } else {
            int i185 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i186 = (i185 & 29) + (i185 | 29);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i186 % 128;
            if (i186 % 2 == 0) {
                int i187 = 3 / 5;
            }
            i3 = 1;
        }
        if (z && i182 < 1 && (method = methodArr[i182]) != null) {
            int i188 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i189 = (i188 ^ 23) + ((i188 & 23) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i189 % 128;
            int i190 = i189 % 2;
            string = method.toString();
            if (i190 != 0) {
                int i191 = 95 / 0;
            }
        } else {
            string = null;
        }
        list.add(string);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i192 = ~((-604513937) | iTuitionPaymentFragmentspecialinlinedviewModeldefault11);
        int i193 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
        int i194 = (-626927507) | i193;
        int i195 = ~((i194 & (-22499592)) | (i194 ^ (-22499592)));
        int i196 = (-1418471782) + (((i192 & i195) | (i192 ^ i195)) * 920);
        int i197 = ~((22499591 & i193) | (22499591 ^ i193));
        int i198 = ((i197 & 604513936) | (604513936 ^ i197)) * 920;
        int i199 = (i196 ^ i198) + ((i198 & i196) << 1);
        int i200 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
        int i201 = ~((i200 & (-604513937)) | ((-604513937) ^ i200));
        int i202 = ~(627013527 | iTuitionPaymentFragmentspecialinlinedviewModeldefault11);
        int i203 = (i201 & i202) | (i201 ^ i202);
        int i204 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault11 | (-22413571));
        int i205 = ((i204 & i203) | (i203 ^ i204)) * 920;
        int i206 = (i199 ^ i205) + ((i205 & i199) << 1);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i207 = 1007046626 - (~((1983639102 | iTuitionPaymentFragmentspecialinlinedviewModeldefault12) * 140));
        int i208 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
        int i209 = ~((1983639102 & i208) | (i208 ^ 1983639102));
        int i210 = i207 + (((i209 & 17043585) | (17043585 ^ i209)) * (-280));
        int i211 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
        int i212 = ~((i211 & 825217673) | (i211 ^ 825217673));
        int i213 = (i212 & 1175465014) | (1175465014 ^ i212);
        int i214 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault12 & (-17043586)) | ((-17043586) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
        int i215 = ((i214 & i213) | (i213 ^ i214)) * 140;
        return i206 <= (i210 & i215) + (i215 | i210) ? (i181 << 6) + i3 : (i181 + 6) * i3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, byte r6, int r7) {
        /*
            int r5 = r5 * 2
            int r5 = r5 + 1
            byte[] r0 = defpackage.M.$$c
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r7 = 116 - r7
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r4 = r0[r6]
        L24:
            int r4 = -r4
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.M.$$g(byte, byte, int):java.lang.String");
    }
}
