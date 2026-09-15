package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bpjstku.data.payment.model.response.RecurringPlanResponse;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getVirtualChildCount implements Function0 {
    private /* synthetic */ getShowDividers TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {39, -79, 42};
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {117, 57, 101, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 249;
    private static final byte[] $$a = {68, 104, -93, -37, -6, 24, -18, 26, -71, 67, -6, 18, -67, 72, 3, -4, -59, 40, 3, -4, -6, 47, 2, 9, -12, 22, -1, 8, -2, 14, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 40, 21, 1, 21, 0, -10, -16, 18, 16, -7, 14, 1};
    private static final int $$b = 56;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722471;

    public /* synthetic */ getVirtualChildCount(getShowDividers getshowdividers) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getshowdividers;
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
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = 26 - r7
            byte[] r0 = defpackage.getVirtualChildCount.$$a
            int r6 = r6 + 105
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r6 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r6]
        L28:
            int r8 = r8 + r4
            int r8 = r8 + (-3)
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getVirtualChildCount.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = r7 + 4
            int r8 = r8 * 52
            int r8 = 53 - r8
            int r6 = 103 - r6
            byte[] r0 = defpackage.getVirtualChildCount.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            int r7 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getVirtualChildCount.c(byte, short, int, java.lang.Object[]):void");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = b + 111;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        getShowDividers getshowdividers = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 == 0) {
            return getShowDividers.TuitionPaymentFragmentbindingInflater1(getshowdividers);
        }
        getShowDividers.TuitionPaymentFragmentbindingInflater1(getshowdividers);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void d(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int i5 = $10 + 103;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    int maxKeyCode = 3291 - (KeyEvent.getMaxKeyCode() >> 16);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 31;
                    byte b2 = (byte) $$f;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, maxKeyCode, pressedStateDuration, 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 651;
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 44;
                    int i8 = $$f;
                    byte b4 = (byte) i8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, capsMode, iNormalizeMetaState, -450685997, false, $$g(b4, (byte) (b4 + 1), (byte) i8), new Class[]{Object.class, Object.class});
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
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i9 = $11 + 69;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int pressedStateDuration2 = 651 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int packedPositionGroup = 44 - ExpandableListView.getPackedPositionGroup(0L);
                    int i11 = $$f;
                    byte b5 = (byte) i11;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maxKeyCode2, pressedStateDuration2, packedPositionGroup, -450685997, false, $$g(b5, (byte) (b5 + 1), (byte) i11), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0938 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x0938 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0a35 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0a35 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0900  */
    /* JADX WARN: Code duplicated, block: B:77:0x0941  */
    /* JADX WARN: Code duplicated, block: B:80:0x098e  */
    /* JADX WARN: Code duplicated, block: B:84:0x09e4 A[Catch: all -> 0x0cd5, TryCatch #1 {all -> 0x0cd5, blocks: (B:82:0x09cd, B:84:0x09e4, B:85:0x0a28, B:97:0x0aa0, B:99:0x0aad, B:100:0x0aed, B:102:0x0b0c, B:104:0x0b61), top: B:140:0x09cd }] */
    public static int TuitionPaymentFragmentbindingInflater1(List list) throws Throwable {
        int i;
        int i2;
        Method method;
        Method[] declaredMethods;
        int length;
        int i3;
        int i4;
        int capsMode;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iMakeMeasureSpec;
        int iB;
        int i11;
        int i12;
        boolean z;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object[] objArr2;
        int i18 = 2;
        int i19 = 2 % 2;
        byte[] bArr = $$a;
        byte b2 = bArr[36];
        int i20 = 1;
        Object[] objArr3 = new Object[1];
        a(b2, b2, bArr[38], objArr3);
        int i21 = 0;
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        a(bArr[38], (byte) (-bArr[35]), (byte) (bArr[5] - 1), objArr4);
        String str = (String) objArr4[0];
        Object[] objArr5 = new Object[1];
        a(bArr[36], bArr[38], bArr[7], objArr5);
        Method[] methodArr = {cls.getMethod(str, KeyManager[].class, TrustManager[].class, Class.forName((String) objArr5[0]))};
        int i22 = b;
        int i23 = (i22 ^ 51) + ((i22 & 51) << 1);
        TuitionPaymentFragmentbindingInflater1 = i23 % 128;
        int i24 = i23 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int iIndexOf = TextUtils.indexOf("", "") + 2823;
            int i25 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22;
            byte[] bArr2 = $$d;
            byte b3 = bArr2[54];
            byte b4 = bArr2[7];
            Object[] objArr6 = new Object[1];
            c(b3, b4, b4, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iIndexOf, i25, 1814927978, false, (String) objArr6[0], null);
        }
        int i26 = 24;
        long j = 0;
        int i27 = 8;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            int i28 = TuitionPaymentFragmentbindingInflater1 + 61;
            b = i28 % 128;
            if (i28 % 2 == 0) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetBefore("", 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2822, 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getDeclaredMethods();
                length = declaredMethods.length;
                i3 = 1;
            } else {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getCapsMode("", 0, 0), 2823 - TextUtils.indexOf("", "", 0), 21 - Process.getGidForName(""))).getDeclaredMethods();
                length = declaredMethods.length;
                i3 = 0;
            }
            while (true) {
                if (i3 < length) {
                    int i29 = b;
                    int i30 = ((i29 | 109) << 1) - (i29 ^ 109);
                    TuitionPaymentFragmentbindingInflater1 = i30 % 128;
                    int i31 = i30 % i18;
                    Method method2 = declaredMethods[i3];
                    try {
                        int i32 = -(-(SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)));
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
                        char[] cArr = new char[i26];
                        // fill-array-data instruction
                        cArr[0] = 14;
                        cArr[1] = 7;
                        cArr[2] = 65486;
                        cArr[3] = 18;
                        cArr[4] = 5;
                        cArr[5] = 6;
                        cArr[6] = '\f';
                        cArr[7] = 5;
                        cArr[8] = 3;
                        cArr[9] = 20;
                        cArr[10] = 65486;
                        cArr[11] = 65517;
                        cArr[12] = 5;
                        cArr[13] = 20;
                        cArr[14] = '\b';
                        cArr[15] = 15;
                        cArr[16] = 4;
                        cArr[17] = '\n';
                        cArr[18] = 1;
                        cArr[19] = 22;
                        cArr[20] = 1;
                        cArr[21] = 65486;
                        cArr[22] = '\f';
                        cArr[23] = 1;
                        Object[] objArr7 = new Object[i20];
                        d(false, (i32 ^ 218) + ((i32 & 218) << i20), (iKeyCodeFromString & 24) + (iKeyCodeFromString | i26), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 16, cArr, objArr7);
                        Class<?> cls2 = Class.forName((String) objArr7[i21]);
                        int offsetAfter = TextUtils.getOffsetAfter("", i21) + 227;
                        int i33 = -(CdmaCellLocation.convertQuartSecToDecDegrees(i21) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i21) == 0.0d ? 0 : -1));
                        int iB2 = RecurringPlanResponse.b();
                        int i34 = i33 * (-129);
                        int i35 = ((i34 | 1572) << i20) - (i34 ^ 1572);
                        int i36 = b;
                        int i37 = ((i36 | 97) << 1) - (i36 ^ 97);
                        TuitionPaymentFragmentbindingInflater1 = i37 % 128;
                        int i38 = i37 % i18;
                        int i39 = ~iB2;
                        int i40 = ((-13) ^ i39) | (i39 & (-13));
                        int i41 = 130 * (~((i40 ^ i33) | (i40 & i33)));
                        int i42 = (i35 & i41) + (i35 | i41);
                        int i43 = -(-((~(((-13) ^ i33) | ((-13) & i33))) * (-260)));
                        int i44 = (i42 ^ i43) + ((i42 & i43) << i20);
                        int i45 = ~((~i33) | 12);
                        int i46 = (-13) | i33;
                        int i47 = ~((i46 ^ iB2) | (i46 & iB2));
                        int i48 = -(-(((i45 & i47) | (i45 ^ i47)) * 130));
                        int i49 = (i44 ^ i48) + ((i48 & i44) << i20);
                        int i50 = -TextUtils.lastIndexOf("", '0');
                        int iB3 = RecurringPlanResponse.b();
                        int i51 = i50 * 302;
                        int i52 = (i51 & 4824) + (i51 | 4824);
                        int i53 = ~i50;
                        int i54 = ~iB3;
                        int i55 = ~((i53 ^ i54) | (i53 & i54));
                        int i56 = ((i55 ^ 8) | (i55 & i27)) * (-602);
                        int i57 = ((i52 | i56) << 1) - (i56 ^ i52);
                        int i58 = ~((i53 ^ (-9)) | (i53 & (-9)));
                        int i59 = ~i50;
                        int i60 = ~((iB3 & i59) | (i59 ^ iB3));
                        int i61 = i57 + (((~((i50 & i54) | (i54 ^ i50) | i27)) | (i58 & i60) | (i58 ^ i60)) * (-301));
                        int i62 = i54 ^ 8;
                        Object[] objArr8 = new Object[i20];
                        d(true, offsetAfter, i49, (i61 - (~(-(-((~((i54 & i27) | i62)) * 301))))) - 1, new char[]{1, 65534, 1, 65532, 7, 65509, '\f', 65533, 65535, 11, '\n', 65533}, objArr8);
                        Integer num = (Integer) cls2.getMethod((String) objArr8[0], null).invoke(method2, null);
                        int i63 = b;
                        int i64 = ((i63 | 73) << i20) - (i63 ^ 73);
                        TuitionPaymentFragmentbindingInflater1 = i64 % 128;
                        int i65 = i64 % 2;
                        Object[] objArr9 = new Object[i20];
                        objArr9[0] = Integer.valueOf(num.intValue());
                        int i66 = 219 - (~(-(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))));
                        int iArgb = Color.argb(0, 0, 0, 0);
                        int iB4 = RecurringPlanResponse.b();
                        int i67 = iArgb * 55;
                        int i68 = ((i67 | (-2782)) << i20) - (i67 ^ (-2782));
                        int i69 = ~iArgb;
                        int i70 = ~((i69 ^ 26) | (i69 & 26));
                        int i71 = ~iB4;
                        int i72 = ~((i71 ^ 26) | (i71 & 26));
                        int i73 = i68 + (((i70 ^ i72) | (i70 & i72)) * (-108));
                        int i74 = b;
                        int i75 = ((i74 | 29) << i20) - (i74 ^ 29);
                        TuitionPaymentFragmentbindingInflater1 = i75 % 128;
                        int i76 = i75 % 2;
                        int i77 = ~((i69 & iB4) | (i69 ^ iB4));
                        int i78 = ~((-27) | iArgb);
                        int i79 = ~iB4;
                        int i80 = 54 * ((~((i79 ^ iArgb) | (iArgb & i79))) | i77 | i78);
                        int i81 = ((i73 | i80) << i20) - (i80 ^ i73);
                        int i82 = -(-((iB4 | i78) * 54));
                        int i83 = (i81 ^ i82) + ((i82 & i81) << i20);
                        int i84 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int iB5 = RecurringPlanResponse.b();
                        int i85 = i84 * 868;
                        int i86 = (i85 & 13020) + (i85 | 13020);
                        int i87 = ~i84;
                        int i88 = ~iB5;
                        int i89 = ~((i87 ^ i88) | (i87 & i88));
                        int i90 = ~(((-16) ^ i88) | ((-16) & i88));
                        int i91 = ((i89 ^ i90) | (i90 & i89)) * (-867);
                        int i92 = (i86 ^ i91) + ((i86 & i91) << i20);
                        int i93 = ~i84;
                        int i94 = ~((i93 ^ (-16)) | (i93 & (-16)));
                        int i95 = ~((i93 ^ iB5) | (i93 & iB5));
                        int i96 = (i94 ^ i95) | (i95 & i94);
                        int i97 = ~(((-16) ^ iB5) | ((-16) & iB5));
                        int i98 = -(-(((i96 ^ i97) | (i96 & i97)) * (-1734)));
                        int i99 = (i92 & i98) + (i98 | i92);
                        int i100 = ~((i87 ^ (-16)) | (i87 & (-16)) | (~iB5));
                        int i101 = (i87 & 15) | (i87 ^ 15);
                        int i102 = ~((i101 & iB5) | (i101 ^ iB5));
                        int i103 = (i102 & i100) | (i100 ^ i102);
                        int i104 = ~((i84 & (-16)) | ((-16) ^ i84) | iB5);
                        int i105 = -(-(((i104 & i103) | (i103 ^ i104)) * 867));
                        Object[] objArr10 = new Object[i20];
                        d(false, i66, i83, (i99 & i105) + (i105 | i99), new char[]{4, 5, 11, 4, 2, 19, 65485, 65516, 14, 3, '\b', 5, '\b', 4, 17, '\t', 0, 21, 0, 65485, 11, 0, '\r', 6, 65485, 17}, objArr10);
                        Class<?> cls3 = Class.forName((String) objArr10[0]);
                        int i106 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int i107 = (i106 ^ 227) + ((i106 & 227) << i20);
                        int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                        int iB6 = RecurringPlanResponse.b();
                        int i108 = scrollBarFadeDuration * (-391);
                        int i109 = ((i108 | (-1560)) << i20) - (i108 ^ (-1560));
                        int i110 = ~(((-9) & scrollBarFadeDuration) | ((-9) ^ scrollBarFadeDuration));
                        int i111 = TuitionPaymentFragmentbindingInflater1 + 65;
                        b = i111 % 128;
                        int i112 = i111 % 2;
                        int i113 = ~((iB6 ^ 8) | (iB6 & 8));
                        int i114 = i109 + ((-196) * ((i113 & i110) | (i110 ^ i113))) + (((scrollBarFadeDuration ^ 8) | (scrollBarFadeDuration & 8)) * 392);
                        int i115 = ~scrollBarFadeDuration;
                        int i116 = ((~((i115 & (-9)) | (i115 ^ (-9)))) | (~(i27 | iB6))) * 196;
                        int i117 = (i114 & i116) + (i116 | i114);
                        int i118 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i119 = ((i118 | 2) << 1) - (i118 ^ 2);
                        char[] cArr2 = new char[i27];
                        // fill-array-data instruction
                        cArr2[0] = 14;
                        cArr2[1] = 65533;
                        cArr2[2] = 1;
                        cArr2[3] = 11;
                        cArr2[4] = 65510;
                        cArr2[5] = 65529;
                        cArr2[6] = '\f';
                        cArr2[7] = 1;
                        Object[] objArr11 = new Object[1];
                        d(false, i107, i117, i119, cArr2, objArr11);
                        if (((Boolean) cls3.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, objArr9)).booleanValue()) {
                            int i120 = b;
                            int i121 = (i120 ^ 29) + ((i120 & 29) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i121 % 128;
                            int i122 = i121 % 2;
                            Class cls4 = Long.TYPE;
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                            int iB7 = RecurringPlanResponse.b();
                            int i123 = ~iNormalizeMetaState;
                            int i124 = (i123 ^ (-220)) | (i123 & (-220));
                            int i125 = ~iB7;
                            int i126 = (((iNormalizeMetaState * (-519)) - (-114099)) - (~(-(-(((~((i124 & i125) | (i124 ^ i125))) | (~(iB7 | 219))) * 520))))) - 1;
                            int i127 = TuitionPaymentFragmentbindingInflater1;
                            int i128 = (i127 ^ 51) + ((i127 & 51) << 1);
                            int i129 = i128 % 128;
                            b = i129;
                            if (i128 % 2 == 0) {
                                int i130 = ~(((-220) ^ i125) | ((-220) & i125));
                                int i131 = ~((iNormalizeMetaState ^ iB7) | (iNormalizeMetaState & iB7));
                                i4 = i126 / ((-1040) >>> ((i130 ^ i131) | (i130 & i131)));
                            } else {
                                i125 = ~iB7;
                                int i132 = ~(((-220) & i125) | ((-220) ^ i125));
                                int i133 = ~(iNormalizeMetaState | iB7);
                                i4 = i126 + (((i132 ^ i133) | (i132 & i133)) * (-1040));
                            }
                            int i134 = ~((i123 & i125) | (i123 ^ i125));
                            int i135 = (i129 ^ 29) + ((i129 & 29) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i135 % 128;
                            if (i135 % 2 != 0) {
                                int i136 = ~((-220) | iNormalizeMetaState);
                                int i137 = (i134 & i136) | (i134 ^ i136);
                                int i138 = ~(iB7 | iNormalizeMetaState);
                                int i139 = i4 % (520 >> ((i138 & i137) | (i137 ^ i138)));
                                int iLastIndexOf = 49 - TextUtils.lastIndexOf("", (char) 24, 1);
                                capsMode = TextUtils.getCapsMode("", 1, 0);
                                i7 = 79;
                                i6 = iLastIndexOf;
                                i5 = i139;
                            } else {
                                int i140 = ~(((-220) & iNormalizeMetaState) | ((-220) ^ iNormalizeMetaState));
                                int i141 = -(-(520 * ((~((iB7 & iNormalizeMetaState) | (iNormalizeMetaState ^ iB7))) | (i134 & i140) | (i134 ^ i140))));
                                int i142 = (i4 ^ i141) + ((i141 & i4) << 1);
                                int i143 = -(-TextUtils.lastIndexOf("", '0', 0));
                                capsMode = TextUtils.getCapsMode("", 0, 0);
                                i5 = i142;
                                i6 = (i143 & 25) + (i143 | 25);
                                i7 = 17;
                            }
                            Object[] objArr12 = new Object[1];
                            d(false, i5, i6, (i7 - (~(-(-capsMode)))) - 1, new char[]{14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1}, objArr12);
                            Class<?> cls5 = Class.forName((String) objArr12[0]);
                            int i144 = 228 - (~(-(-Color.green(0))));
                            int i145 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            int i146 = ((i145 | 12) << 1) - (i145 ^ 12);
                            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0);
                            int i147 = TuitionPaymentFragmentbindingInflater1 + 81;
                            b = i147 % 128;
                            int i148 = i147 % 2;
                            int iB8 = RecurringPlanResponse.b();
                            int i149 = iLastIndexOf2 * (-129);
                            int i150 = (i149 & 393) + (i149 | 393);
                            int i151 = ~iB8;
                            int i152 = (i151 & (-4)) | ((-4) ^ i151);
                            int i153 = TuitionPaymentFragmentbindingInflater1 + 47;
                            b = i153 % 128;
                            if (i153 % 2 == 0) {
                                int i154 = i150 << (130 >> (~((i152 & iLastIndexOf2) | (i152 ^ iLastIndexOf2))));
                                int i155 = (~((-4) | iLastIndexOf2)) * (-260);
                                i8 = (i154 & i155) + (i154 | i155);
                                i9 = (~iLastIndexOf2) | 3;
                            } else {
                                int i156 = -(-((~((i152 & iLastIndexOf2) | (i152 ^ iLastIndexOf2))) * 130));
                                int i157 = (i150 & i156) + (i156 | i150);
                                int i158 = (~(((-4) ^ iLastIndexOf2) | ((-4) & iLastIndexOf2))) * (-260);
                                i8 = (i157 & i158) + (i158 | i157);
                                int i159 = ~iLastIndexOf2;
                                i9 = (i159 & 3) | (i159 ^ 3);
                            }
                            int i160 = ((-4) & iLastIndexOf2) | ((-4) ^ iLastIndexOf2);
                            int i161 = (i8 - (~(-(-(130 * ((~((i160 & iB8) | (i160 ^ iB8))) | (~i9))))))) - 1;
                            Object[] objArr13 = new Object[1];
                            d(false, i144, i146, i161, new char[]{6, 65531, 65533, 65531, '\n', 65512, 65531, '\n', 11, '\b', 4, 65514, 15}, objArr13);
                            if (cls4.equals(cls5.getMethod((String) objArr13[0], null).invoke(method2, null))) {
                                int i162 = TuitionPaymentFragmentbindingInflater1 + 33;
                                b = i162 % 128;
                                int i163 = i162 % 2;
                                int i164 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                int iB9 = RecurringPlanResponse.b();
                                int i165 = ~iB9;
                                int i166 = (((i164 * (-112)) - 24416) - (~(-(-(((~((i165 & (-219)) | ((-219) ^ i165))) | i164) * 226))))) - 1;
                                int i167 = ~i164;
                                int i168 = ~((i167 ^ 218) | (i167 & 218));
                                int i169 = ~((i167 & iB9) | (i167 ^ iB9));
                                int i170 = (i169 & i168) | (i168 ^ i169);
                                int i171 = (-219) | (~iB9);
                                int i172 = ~((i164 & i171) | (i171 ^ i164));
                                int i173 = ((i172 & i170) | (i170 ^ i172)) * (-113);
                                int i174 = ((i166 | i173) << 1) - (i173 ^ i166);
                                int i175 = -(-((~(((-219) & iB9) | ((-219) ^ iB9))) * 113));
                                int i176 = (i174 & i175) + (i175 | i174);
                                long jUptimeMillis = SystemClock.uptimeMillis();
                                RecurringPlanResponse.b();
                                RecurringPlanResponse.b();
                                int i177 = -(jUptimeMillis > 0L ? 1 : (jUptimeMillis == 0L ? 0 : -1));
                                int iB10 = RecurringPlanResponse.b();
                                int i178 = i177 * 615;
                                int i179 = ((i178 | (-15325)) << 1) - (i178 ^ (-15325));
                                int i180 = ~i177;
                                int i181 = ~((i180 ^ 25) | (i180 & 25));
                                int i182 = -(-(((i181 & iB10) | (iB10 ^ i181) | (~(((-26) & i177) | ((-26) ^ i177)))) * 614));
                                int i183 = ((i179 | i182) << 1) - (i179 ^ i182);
                                int i184 = ~i177;
                                int i185 = ~iB10;
                                int i186 = ~((i184 & i185) | (i184 ^ i185));
                                int i187 = ~((i180 ^ 25) | (i180 & 25));
                                int i188 = (i183 - (~((((i186 & i187) | (i186 ^ i187)) | (~((i185 ^ 25) | (i185 & 25)))) * (-1228)))) - 1;
                                int i189 = i180 | (-26);
                                int i190 = ~iB10;
                                int i191 = ~((i190 & i189) | (i189 ^ i190));
                                int i192 = (i177 & i185) | (i185 ^ i177);
                                int i193 = ~((i192 & 25) | (i192 ^ 25));
                                int i194 = (i188 - (~(-(-(((i193 & i191) | (i191 ^ i193)) * 614))))) - 1;
                                int i195 = -TextUtils.getOffsetAfter("", 0);
                                int iB11 = RecurringPlanResponse.b();
                                int i196 = i195 * (-103);
                                int i197 = (i196 ^ (-1751)) + ((i196 & (-1751)) << 1);
                                int i198 = ~i195;
                                int i199 = ~((i198 & (-18)) | (i198 ^ (-18)));
                                int i200 = b;
                                int i201 = (i200 ^ 7) + ((i200 & 7) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i201 % 128;
                                int i202 = i201 % 2;
                                int i203 = ~((-18) | iB11);
                                int i204 = (i197 - (~(104 * ((i199 & i203) | (i199 ^ i203))))) - 1;
                                int i205 = (~iB11) | i195;
                                int i206 = i204 + ((~((i205 & 17) | (i205 ^ 17))) * (-104));
                                int i207 = -(-(((i195 & iB11) | (i195 ^ iB11)) * 104));
                                int i208 = ((i206 | i207) << 1) - (i207 ^ i206);
                                Object[] objArr14 = new Object[1];
                                d(false, i176, i194, i208, new char[]{14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1}, objArr14);
                                Class<?> cls6 = Class.forName((String) objArr14[0]);
                                int i209 = -View.getDefaultSize(0, 0);
                                int i210 = b;
                                int i211 = ((i210 | 93) << 1) - (i210 ^ 93);
                                TuitionPaymentFragmentbindingInflater1 = i211 % 128;
                                int i212 = i211 % 2;
                                int iB12 = RecurringPlanResponse.b();
                                int i213 = -(-(i209 * 306));
                                int i214 = (((i213 | TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) << 1) - (i213 ^ TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS)) + 69462;
                                int i215 = ~(i209 | 227);
                                int i216 = ~((i209 ^ iB12) | (i209 & iB12));
                                int i217 = (i214 - (~(((i215 & i216) | (i215 ^ i216)) * 305))) - 1;
                                int i218 = ~(i209 | (~iB12));
                                int i219 = i217 + (((i218 & (-228)) | ((-228) ^ i218)) * 305);
                                int i220 = -TextUtils.getOffsetBefore("", 0);
                                int i221 = (i220 & 17) + (i220 | 17);
                                int i222 = -TextUtils.indexOf("", "", 0, 0);
                                Object[] objArr15 = new Object[1];
                                d(true, i219, i221, ((i222 | 10) << 1) - (i222 ^ 10), new char[]{'\f', 65533, 5, 65529, '\n', 65529, 65512, '\f', 65533, 65535, 11, 65533, '\b', 17, 65516, '\n', 65533}, objArr15);
                                Object[] objArr16 = (Object[]) cls6.getMethod((String) objArr15[0], null).invoke(method2, null);
                                if (objArr16.length == 2) {
                                    int i223 = b;
                                    int i224 = (i223 & 63) + (i223 | 63);
                                    TuitionPaymentFragmentbindingInflater1 = i224 % 128;
                                    if (i224 % 2 != 0) {
                                        if (Long.TYPE.equals(objArr16[0])) {
                                            int i225 = TuitionPaymentFragmentbindingInflater1;
                                            i10 = (i225 ^ 71) + ((i225 & 71) << 1);
                                            b = i10 % 128;
                                            if (i10 % 2 == 0) {
                                                int i226 = 1153 - (~(-(ViewConfiguration.getJumpTapTimeout() / 118)));
                                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                                                iB = RecurringPlanResponse.b();
                                                i12 = 106;
                                                i11 = i226;
                                                z = true;
                                            } else {
                                                int i227 = 218 - (~(ViewConfiguration.getJumpTapTimeout() >> 16));
                                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                                                iB = RecurringPlanResponse.b();
                                                i11 = i227;
                                                i12 = 24;
                                                z = false;
                                            }
                                            int i228 = (-167) * iMakeMeasureSpec;
                                            int i229 = -(-(i12 * (-167)));
                                            int i230 = ((i228 | i229) << 1) - (i228 ^ i229);
                                            int i231 = ~iMakeMeasureSpec;
                                            int i232 = ~i12;
                                            int i233 = ~((i231 ^ i232) | (i231 & i232));
                                            int i234 = ~iB;
                                            int i235 = ~((i232 ^ i234) | (i234 & i232));
                                            int i236 = -(-(((i233 ^ i235) | (i235 & i233)) * 168));
                                            int i237 = (i230 & i236) + (i236 | i230);
                                            int i238 = ~iMakeMeasureSpec;
                                            int i239 = ~i12;
                                            int i240 = (i238 ^ i239) | (i239 & i238);
                                            int i241 = -(-((~((i240 ^ iB) | (i240 & iB))) * 168));
                                            int i242 = (i237 ^ i241) + ((i241 & i237) << 1);
                                            int i243 = TuitionPaymentFragmentbindingInflater1;
                                            int i244 = ((i243 | 79) << 1) - (i243 ^ 79);
                                            b = i244 % 128;
                                            int i245 = i244 % 2;
                                            int i246 = ~iB;
                                            int i247 = ~((i231 & i246) | (i231 ^ i246));
                                            int i248 = ~((i238 & i12) | (i238 ^ i12));
                                            int i249 = (i247 & i248) | (i247 ^ i248);
                                            int i250 = (i232 & iMakeMeasureSpec) | (i232 ^ iMakeMeasureSpec);
                                            int i251 = ~((i250 & iB) | (i250 ^ iB));
                                            int i252 = -(-(((i249 & i251) | (i249 ^ i251)) * 168));
                                            i13 = ((i242 & i252) << 1) + (i242 ^ i252);
                                            i14 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                            int iB13 = RecurringPlanResponse.b();
                                            int i253 = i14 * 477;
                                            int i254 = b;
                                            int i255 = ((i254 | 83) << 1) - (i254 ^ 83);
                                            TuitionPaymentFragmentbindingInflater1 = i255 % 128;
                                            int i256 = i255 % 2;
                                            int i257 = (i253 & (-8075)) + (i253 | (-8075));
                                            int i258 = ~i14;
                                            int i259 = ~((i258 & 17) | (i258 ^ 17));
                                            int i260 = (-18) | i14;
                                            int i261 = i254 + 35;
                                            TuitionPaymentFragmentbindingInflater1 = i261 % 128;
                                            int i262 = i261 % 2;
                                            int i263 = ~((i260 & iB13) | (i260 ^ iB13));
                                            int i264 = (-476) * ((i259 & i263) | (i259 ^ i263));
                                            int i265 = (i257 & i264) + (i264 | i257);
                                            int i266 = -(-((~(((-18) & i14) | ((-18) ^ i14) | iB13)) * 952));
                                            i15 = ((i265 | i266) << 1) - (i265 ^ i266);
                                            int i267 = ((i254 | 63) << 1) - (i254 ^ 63);
                                            TuitionPaymentFragmentbindingInflater1 = i267 % 128;
                                            i16 = i267 % 2;
                                            i17 = ~iB13;
                                            if (i16 != 0) {
                                                int i268 = -(~(i14 | (i17 & (-18)) | ((-18) ^ i17)));
                                                int i269 = -((i268 & 476) + (i268 | 476));
                                                objArr2 = new Object[1];
                                                d(z, i11, i13, ((i15 | i269) << 1) - (i269 ^ i15), new char[]{14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1}, objArr2);
                                                if (Class.forName((String) objArr2[0]).equals(objArr16[1])) {
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2824;
                                                        int i270 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                        byte[] bArr3 = $$d;
                                                        byte b5 = bArr3[54];
                                                        byte b6 = bArr3[7];
                                                        Object[] objArr17 = new Object[1];
                                                        c(b5, b6, b6, objArr17);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, bitsPerPixel, i270, 1814927978, false, (String) objArr17[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2824;
                                                        int iGreen = 22 - Color.green(0);
                                                        byte[] bArr4 = $$d;
                                                        byte b7 = bArr4[54];
                                                        byte b8 = bArr4[7];
                                                        Object[] objArr18 = new Object[1];
                                                        c(b7, b8, b8, objArr18);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity, iIndexOf2, iGreen, 1814927978, false, (String) objArr18[0], null);
                                                    }
                                                    try {
                                                        Object[] objArr19 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                            char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            int packedPositionType = 2823 - ExpandableListView.getPackedPositionType(0L);
                                                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
                                                            byte[] bArr5 = $$d;
                                                            byte b9 = bArr5[7];
                                                            byte b10 = (byte) (-bArr5[5]);
                                                            Object[] objArr20 = new Object[1];
                                                            c(b9, b10, b10, objArr20);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, packedPositionType, jumpTapTimeout, -2137287382, false, (String) objArr20[0], new Class[]{Long.TYPE, Method.class});
                                                        }
                                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr19)).longValue();
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            } else {
                                                int i271 = (i17 & (-18)) | ((-18) ^ i17);
                                                int i272 = -(-((~((i14 & i271) | (i271 ^ i14))) * 476));
                                                objArr = new Object[1];
                                                d(z, i11, i13, (i15 & i272) + (i272 | i15), new char[]{14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1}, objArr);
                                                if (Class.forName((String) objArr[0]).equals(objArr16[1])) {
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                                                        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 2824;
                                                        int i273 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                        byte[] bArr6 = $$d;
                                                        byte b11 = bArr6[54];
                                                        byte b12 = bArr6[7];
                                                        Object[] objArr110 = new Object[1];
                                                        c(b11, b12, b12, objArr110);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength2, bitsPerPixel2, i273, 1814927978, false, (String) objArr110[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                        int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2824;
                                                        int iGreen2 = 22 - Color.green(0);
                                                        byte[] bArr7 = $$d;
                                                        byte b13 = bArr7[54];
                                                        byte b14 = bArr7[7];
                                                        Object[] objArr111 = new Object[1];
                                                        c(b13, b14, b14, objArr111);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity2, iIndexOf3, iGreen2, 1814927978, false, (String) objArr111[0], null);
                                                    }
                                                    Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        int packedPositionType2 = 2823 - ExpandableListView.getPackedPositionType(0L);
                                                        int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
                                                        byte[] bArr8 = $$d;
                                                        byte b15 = bArr8[7];
                                                        byte b16 = (byte) (-bArr8[5]);
                                                        Object[] objArr21 = new Object[1];
                                                        c(b15, b16, b16, objArr21);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, packedPositionType2, jumpTapTimeout2, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else if (Long.TYPE.equals(objArr16[0])) {
                                        int i2210 = TuitionPaymentFragmentbindingInflater1;
                                        i10 = (i2210 ^ 71) + ((i2210 & 71) << 1);
                                        b = i10 % 128;
                                        if (i10 % 2 == 0) {
                                            int i2211 = 1153 - (~(-(ViewConfiguration.getJumpTapTimeout() / 118)));
                                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                                            iB = RecurringPlanResponse.b();
                                            i12 = 106;
                                            i11 = i2211;
                                            z = true;
                                        } else {
                                            int i2212 = 218 - (~(ViewConfiguration.getJumpTapTimeout() >> 16));
                                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                                            iB = RecurringPlanResponse.b();
                                            i11 = i2212;
                                            i12 = 24;
                                            z = false;
                                        }
                                        int i2213 = (-167) * iMakeMeasureSpec;
                                        int i2214 = -(-(i12 * (-167)));
                                        int i2310 = ((i2213 | i2214) << 1) - (i2213 ^ i2214);
                                        int i2311 = ~iMakeMeasureSpec;
                                        int i2312 = ~i12;
                                        int i2313 = ~((i2311 ^ i2312) | (i2311 & i2312));
                                        int i2314 = ~iB;
                                        int i2315 = ~((i2312 ^ i2314) | (i2314 & i2312));
                                        int i2316 = -(-(((i2313 ^ i2315) | (i2315 & i2313)) * 168));
                                        int i2317 = (i2310 & i2316) + (i2316 | i2310);
                                        int i2318 = ~iMakeMeasureSpec;
                                        int i2319 = ~i12;
                                        int i2410 = (i2318 ^ i2319) | (i2319 & i2318);
                                        int i2411 = -(-((~((i2410 ^ iB) | (i2410 & iB))) * 168));
                                        int i2412 = (i2317 ^ i2411) + ((i2411 & i2317) << 1);
                                        int i2413 = TuitionPaymentFragmentbindingInflater1;
                                        int i2414 = ((i2413 | 79) << 1) - (i2413 ^ 79);
                                        b = i2414 % 128;
                                        int i2415 = i2414 % 2;
                                        int i2416 = ~iB;
                                        int i2417 = ~((i2311 & i2416) | (i2311 ^ i2416));
                                        int i2418 = ~((i2318 & i12) | (i2318 ^ i12));
                                        int i2419 = (i2417 & i2418) | (i2417 ^ i2418);
                                        int i2510 = (i2312 & iMakeMeasureSpec) | (i2312 ^ iMakeMeasureSpec);
                                        int i2511 = ~((i2510 & iB) | (i2510 ^ iB));
                                        int i2512 = -(-(((i2419 & i2511) | (i2419 ^ i2511)) * 168));
                                        i13 = ((i2412 & i2512) << 1) + (i2412 ^ i2512);
                                        i14 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                        int iB14 = RecurringPlanResponse.b();
                                        int i2513 = i14 * 477;
                                        int i2514 = b;
                                        int i2515 = ((i2514 | 83) << 1) - (i2514 ^ 83);
                                        TuitionPaymentFragmentbindingInflater1 = i2515 % 128;
                                        int i2516 = i2515 % 2;
                                        int i2517 = (i2513 & (-8075)) + (i2513 | (-8075));
                                        int i2518 = ~i14;
                                        int i2519 = ~((i2518 & 17) | (i2518 ^ 17));
                                        int i2610 = (-18) | i14;
                                        int i2611 = i2514 + 35;
                                        TuitionPaymentFragmentbindingInflater1 = i2611 % 128;
                                        int i2612 = i2611 % 2;
                                        int i2613 = ~((i2610 & iB14) | (i2610 ^ iB14));
                                        int i2614 = (-476) * ((i2519 & i2613) | (i2519 ^ i2613));
                                        int i2615 = (i2517 & i2614) + (i2614 | i2517);
                                        int i2616 = -(-((~(((-18) & i14) | ((-18) ^ i14) | iB14)) * 952));
                                        i15 = ((i2615 | i2616) << 1) - (i2615 ^ i2616);
                                        int i2617 = ((i2514 | 63) << 1) - (i2514 ^ 63);
                                        TuitionPaymentFragmentbindingInflater1 = i2617 % 128;
                                        i16 = i2617 % 2;
                                        i17 = ~iB14;
                                        if (i16 != 0) {
                                            int i2618 = -(~(i14 | (i17 & (-18)) | ((-18) ^ i17)));
                                            int i2619 = -((i2618 & 476) + (i2618 | 476));
                                            objArr2 = new Object[1];
                                            d(z, i11, i13, ((i15 | i2619) << 1) - (i2619 ^ i15), new char[]{14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1}, objArr2);
                                            if (Class.forName((String) objArr2[0]).equals(objArr16[1])) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char trimmedLength3 = (char) TextUtils.getTrimmedLength("");
                                                    int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 2824;
                                                    int i274 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                    byte[] bArr9 = $$d;
                                                    byte b17 = bArr9[54];
                                                    byte b18 = bArr9[7];
                                                    Object[] objArr113 = new Object[1];
                                                    c(b17, b18, b18, objArr113);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength3, bitsPerPixel3, i274, 1814927978, false, (String) objArr113[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char minimumFlingVelocity3 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2824;
                                                    int iGreen3 = 22 - Color.green(0);
                                                    byte[] bArr10 = $$d;
                                                    byte b19 = bArr10[54];
                                                    byte b110 = bArr10[7];
                                                    Object[] objArr114 = new Object[1];
                                                    c(b19, b110, b110, objArr114);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity3, iIndexOf4, iGreen3, 1814927978, false, (String) objArr114[0], null);
                                                }
                                                Object[] objArr115 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char c4 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int packedPositionType3 = 2823 - ExpandableListView.getPackedPositionType(0L);
                                                    int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
                                                    byte[] bArr11 = $$d;
                                                    byte b111 = bArr11[7];
                                                    byte b112 = (byte) (-bArr11[5]);
                                                    Object[] objArr22 = new Object[1];
                                                    c(b111, b112, b112, objArr22);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, packedPositionType3, jumpTapTimeout3, -2137287382, false, (String) objArr22[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr115)).longValue();
                                            }
                                        } else {
                                            int i275 = (i17 & (-18)) | ((-18) ^ i17);
                                            int i276 = -(-((~((i14 & i275) | (i275 ^ i14))) * 476));
                                            objArr = new Object[1];
                                            d(z, i11, i13, (i15 & i276) + (i276 | i15), new char[]{14, 7, 65486, 18, 5, 6, '\f', 5, 3, 20, 65486, 65517, 5, 20, '\b', 15, 4, '\n', 1, 22, 1, 65486, '\f', 1}, objArr);
                                            if (Class.forName((String) objArr[0]).equals(objArr16[1])) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char trimmedLength4 = (char) TextUtils.getTrimmedLength("");
                                                    int bitsPerPixel4 = ImageFormat.getBitsPerPixel(0) + 2824;
                                                    int i277 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                    byte[] bArr12 = $$d;
                                                    byte b113 = bArr12[54];
                                                    byte b114 = bArr12[7];
                                                    Object[] objArr116 = new Object[1];
                                                    c(b113, b114, b114, objArr116);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength4, bitsPerPixel4, i277, 1814927978, false, (String) objArr116[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char minimumFlingVelocity4 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2824;
                                                    int iGreen4 = 22 - Color.green(0);
                                                    byte[] bArr13 = $$d;
                                                    byte b115 = bArr13[54];
                                                    byte b116 = bArr13[7];
                                                    Object[] objArr117 = new Object[1];
                                                    c(b115, b116, b116, objArr117);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity4, iIndexOf5, iGreen4, 1814927978, false, (String) objArr117[0], null);
                                                }
                                                Object[] objArr118 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char c5 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int packedPositionType4 = 2823 - ExpandableListView.getPackedPositionType(0L);
                                                    int jumpTapTimeout4 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
                                                    byte[] bArr14 = $$d;
                                                    byte b117 = bArr14[7];
                                                    byte b118 = (byte) (-bArr14[5]);
                                                    Object[] objArr23 = new Object[1];
                                                    c(b117, b118, b118, objArr23);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c5, packedPositionType4, jumpTapTimeout4, -2137287382, false, (String) objArr23[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr118)).longValue();
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        int i278 = ((i3 | 61) << 1) - (i3 ^ 61);
                        i3 = (i278 & (-60)) + (i278 | (-60));
                        i18 = 2;
                        i21 = 0;
                        i20 = 1;
                        i26 = 24;
                        j = 0;
                        i27 = 8;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char cRed = (char) Color.red(0);
            int iLastIndexOf3 = 2822 - TextUtils.lastIndexOf("", '0', 0, 0);
            int jumpTapTimeout5 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
            byte[] bArr15 = $$d;
            byte b20 = bArr15[54];
            byte b21 = bArr15[7];
            Object[] objArr24 = new Object[1];
            c(b20, b21, b21, objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, iLastIndexOf3, jumpTapTimeout5, 1814927978, false, (String) objArr24[0], null);
        }
        Object[] objArr25 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int mode = View.MeasureSpec.getMode(0) + 2823;
            int touchSlop = 22 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr16 = $$d;
            byte b22 = (byte) (bArr16[51] - 1);
            byte b23 = (byte) (-bArr16[5]);
            Object[] objArr26 = new Object[1];
            c(b22, b23, b23, objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, mode, touchSlop, 1025296417, false, (String) objArr26[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr25);
        Object[] objArr27 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c6 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37656);
            int iMyTid = 2720 - (Process.myTid() >> 22);
            int threadPriority = 19 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte[] bArr17 = $$d;
            byte b24 = (byte) (bArr17[51] - 1);
            byte b25 = (byte) (-bArr17[5]);
            Object[] objArr28 = new Object[1];
            c(b24, b25, b25, objArr28);
            i = 0;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c6, iMyTid, threadPriority, -1568796068, false, (String) objArr28[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        } else {
            i = 0;
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr27)).longValue();
        long j2 = 91200858;
        long j3 = -1;
        long j4 = j2 ^ j3;
        long j5 = (int) Runtime.getRuntime().totalMemory();
        long j6 = (((long) 567) * j2) + (((long) (-565)) * jLongValue) + (((long) (-566)) * (((j4 | jLongValue) ^ j3) | ((j4 | j5) ^ j3)));
        long j7 = 566;
        long j8 = jLongValue ^ j3;
        long j9 = j6 + (((j2 | j8) ^ j3) * j7) + (j7 * ((j5 | (j8 | j4)) ^ j3)) + ((long) (-1901606703));
        int i279 = (int) Runtime.getRuntime().totalMemory();
        int i280 = ~((-1782606529) | i279);
        int i281 = ~i279;
        int i282 = ((int) (j9 >> 32)) & (2038856378 + ((i280 | (~((-16777227) | i281))) * 920) + (((~(362157343 | i281)) | 1782606528) * 920) + (((~(i279 | (-16777227))) | (~((-1782606529) | i281)) | (~(2144763871 | i279))) * 920));
        int iMyPid = Process.myPid();
        int i283 = ~(93481221 | iMyPid);
        int i284 = 1801037129 + ((1342538912 | i283) * (-280)) + ((i283 | (~(1343745188 | iMyPid))) * 140);
        int i285 = ~(1436020133 | iMyPid);
        int i286 = ~iMyPid;
        int i287 = ((int) j9) & (i284 + (((~(i286 | (-92274946))) | i285 | (~((-1342538913) | i286))) * 140));
        int i288 = (i282 & i287) | (i282 ^ i287);
        int i289 = i288 >>> 24;
        int i290 = i288 & ViewCompat.MEASURED_SIZE_MASK;
        int i291 = i289 != 0 ? 1 : i;
        if ((i291 ^ 1) != 1) {
            int i292 = TuitionPaymentFragmentbindingInflater1;
            int i293 = (i292 & 3) + (i292 | 3);
            b = i293 % 128;
            if (i293 % 2 != 0) {
                i = 1;
            }
            i2 = 1;
        } else {
            i2 = 1;
        }
        list.add(((i291 ^ i2) == i2 || i290 >= i2 || (method = methodArr[i290]) == null) ? null : method.toString());
        int iB15 = RecurringPlanResponse.b();
        int i294 = (-4327) - (~(-(-(i289 * (-721)))));
        int i295 = ~iB15;
        int i296 = ~i289;
        int i297 = ~(((-7) & i296) | ((-7) ^ i296));
        int i298 = (i295 & i297) | (i295 ^ i297);
        int i299 = ~((i289 ^ 6) | (i289 & 6));
        int i300 = i294 + (((i298 & i299) | (i298 ^ i299)) * 1444);
        int i301 = ~(i289 | 6);
        int i302 = ~((iB15 ^ 6) | (iB15 & 6));
        int i303 = (i301 & i302) | (i301 ^ i302);
        int i304 = ~((iB15 & i289) | (i289 ^ iB15));
        int i305 = (i300 - (~(-(-(((i304 & i303) | (i303 ^ i304)) * (-1444)))))) - 1;
        int i306 = ~(((-7) & i289) | ((-7) ^ i289));
        int i307 = ~((i296 ^ 6) | (i296 & 6));
        int i308 = i305 + (((i306 & i307) | (i306 ^ i307)) * 722);
        int i309 = b + 37;
        int i310 = i309 % 128;
        TuitionPaymentFragmentbindingInflater1 = i310;
        int i311 = i309 % 2 != 0 ? (i308 - (~(-i))) - 1 : i308 * i;
        int i312 = (i310 & 103) + (i310 | 103);
        b = i312 % 128;
        if (i312 % 2 != 0) {
            return i311;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, byte r6, byte r7) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r6 = 120 - r6
            int r5 = r5 * 3
            int r5 = 3 - r5
            byte[] r1 = defpackage.getVirtualChildCount.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r6
            r4 = r2
            r6 = r5
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            r3 = r1[r5]
        L25:
            int r5 = r5 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getVirtualChildCount.$$g(int, byte, byte):java.lang.String");
    }
}
