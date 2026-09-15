package com.midtrans.sdk.corekit.models.snap.payment;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.params.CreditCardPaymentParams;
import com.midtrans.sdk.corekit.models.snap.params.PromoDetails;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class CreditCardPaymentRequest extends BasePaymentRequest {

    @SerializedName("customer_details")
    private CustomerDetailRequest customerDetails;

    @SerializedName("payment_params")
    private CreditCardPaymentParams paymentParams;

    @SerializedName("promo_details")
    private PromoDetails promoDetails;
    private static final byte[] $$c = {70, -114, 113, 8};
    private static final int $$f = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {94, 6, -99, -107, -3, -29, 16, -6, 15, -17, 3, -39, 39, -5, -8, 6, -8, -3};
    private static final int $$e = 236;
    private static final byte[] $$a = {43, 23, 22, -14, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 49;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f848a = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 55484;
    private static char b = 46329;
    private static char TuitionPaymentFragmentbindingInflater1 = 14114;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 61047;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = com.midtrans.sdk.corekit.models.snap.payment.CreditCardPaymentRequest.$$a
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-10)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.snap.payment.CreditCardPaymentRequest.c(short, short, int, java.lang.Object[]):void");
    }

    private static void e(byte b2, int i, int i2, Object[] objArr) {
        int i3 = (i * 14) + 4;
        int i4 = 111 - (b2 * 13);
        int i5 = i2 * 14;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i4 = i3 + i5 + 2;
        }
        while (true) {
            int i7 = i3;
            int i8 = i4;
            i6++;
            bArr2[i6] = (byte) i8;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = i7 + 1;
                i4 = i8 + bArr[i7] + 2;
            }
        }
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                char c2 = 1;
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i3 = $11 + 9;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 58224;
                int i6 = 0;
                while (i6 < 16) {
                    int i7 = $10 + 69;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    char c3 = cArr3[c2];
                    char c4 = cArr3[c];
                    int i9 = (c4 + i5) ^ ((c4 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)));
                    int i10 = c4 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        objArr2[2] = Integer.valueOf(i10);
                        objArr2[c2] = Integer.valueOf(i9);
                        objArr2[c] = Integer.valueOf(c3);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 47773);
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 468;
                            int doubleTapTimeout = 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            Class[] clsArr = new Class[4];
                            clsArr[c] = Integer.TYPE;
                            clsArr[c2] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, packedPositionGroup, doubleTapTimeout, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[c2] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 47774), 468 - ((Process.getThreadPriority(0) + 20) >> 6), 13 - ((Process.getThreadPriority(0) + 20) >> 6), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i5 -= 40503;
                        i6++;
                        c2 = 1;
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
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 2323, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } else {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0206  */
    /* JADX WARN: Code duplicated, block: B:26:0x0210  */
    public PromoDetails getPromoDetails() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char gidForName = (char) (Process.getGidForName("") + 31534);
            int iIndexOf = TextUtils.indexOf("", "") + 921;
            int i2 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29;
            byte b2 = (byte) ($$b + 3);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(b2, bArr[7], bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, iIndexOf, i2, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{47354, 38224, 34055, 61889, 55809, 58956, 38972, 42685, 39936, 46009, 11619, 23700, 19950, 25644, 4373, 26606, 30712, 4670, 24827, 39109, 28072, 37891, 17823, 63532}, 21 - ImageFormat.getBitsPerPixel(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{7737, 49233, 'Y', 26772, 1120, 63037, 62078, 13686, 60161, 13894, 28848, 5450, 57100, 41800, 31366, 57671, 34001, 3165}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char defaultSize = (char) (31533 - View.getDefaultSize(0, 0));
            int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 921;
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[80];
            byte b4 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, i3, iIndexOf2, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mirror = (char) (31581 - AndroidCharacter.getMirror('0'));
                int defaultSize2 = 921 - View.getDefaultSize(0, 0);
                int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) (-bArr3[33]), bArr3[80], bArr3[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, defaultSize2, i4, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = (-1048393855) + (((~(i5 | 746711585)) | (-1035857532) | (~((-738222113) | iIdentityHashCode))) * 717) + (((~(iIdentityHashCode | 746711585)) | (~(i5 | (-738222113))) | (-1035857532)) * 717) + 1295066113;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{2154, 22973, 59646, 32574, 20462, 35125, 39382, 3350, 9710, 24393, 44416, 26867, 57242, 57982, 58200, 56190, 44629, 38873, 37071, 62669, 59113, 1407, 9609, 46161, 25087, 8915, 7627, 40390}, 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{42330, 31733, 22709, 23475, 48441, 27960, 30564, 51465, 17513, 47324, 11634, 36139, 32360, 44481, 65148, 51020, 45533, 21346, 63537, 36806}, 18 - KeyEvent.getDeadChar(0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
                f848a = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 31 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            int i11 = f848a + 83;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                            int i12 = i11 % 2;
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        int i13 = f848a + 83;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                        int i14 = i13 % 2;
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            d(new char[]{17436, 42779, 3194, 52467, 54045, 179, 10385, 15795, 47874, 8718, 3036, 48865, 2590, 23087, 56241, 7199, 35300, 42680}, 16 - (ViewConfiguration.getTouchSlop() >> 8), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{7956, 10805, 39575, 61609, 23983, 25530, 59765, 34177, 33379, 63511, 12762, 38472, 43284, 63691, 38504, 31899, 5611, 4644}, 16 - View.MeasureSpec.getMode(0), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1295066113};
                byte b5 = (byte) 0;
                byte b6 = b5;
                Object[] objArr13 = new Object[1];
                e(b5, b6, (byte) (b6 + 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = (byte) 1;
                byte b8 = b7;
                Object[] objArr14 = new Object[1];
                e(b7, b8, (byte) (b8 - 1), objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char pressedStateDuration = (char) (31533 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    int iRgb = (-16776295) - Color.rgb(0, 0, 0);
                    int iAxisFromString = MotionEvent.axisFromString("") + 29;
                    byte[] bArr4 = $$a;
                    Object[] objArr15 = new Object[1];
                    c((byte) (-bArr4[33]), bArr4[80], bArr4[7], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration, iRgb, iAxisFromString, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    d(new char[]{47354, 38224, 34055, 61889, 55809, 58956, 38972, 42685, 39936, 46009, 11619, 23700, 19950, 25644, 4373, 26606, 30712, 4670, 24827, 39109, 28072, 37891, 17823, 63532}, 22 - Color.alpha(0), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    d(new char[]{7737, 49233, 'Y', 26772, 1120, 63037, 62078, 13686, 60161, 13894, 28848, 5450, 57100, 41800, 31366, 57671, 34001, 3165}, TextUtils.lastIndexOf("", '0') + 16, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char fadingEdgeLength = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int iRgb2 = (-16777188) - Color.rgb(0, 0, 0);
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[80];
                        byte b10 = bArr5[7];
                        Object[] objArr18 = new Object[1];
                        c(b9, b10, b10, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(fadingEdgeLength, iLastIndexOf, iRgb2, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 31534);
                        int iRed = 921 - Color.red(0);
                        int mirror2 = 'L' - AndroidCharacter.getMirror('0');
                        byte b11 = (byte) ($$b + 3);
                        byte[] bArr6 = $$a;
                        Object[] objArr19 = new Object[1];
                        c(b11, bArr6[7], bArr6[80], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask, iRed, mirror2, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i15 = ((int[]) objArr[0])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i16 = i15 + (-977762883) + (((~((~iIdentityHashCode2) | (-360720410))) | (~(1067433563 | iIdentityHashCode2))) * (-302)) + ((~((-360720410) | iIdentityHashCode2)) * (-604)) + (((~(iIdentityHashCode2 | 706713154)) | 67074) * 302);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr20[0])[0] = i18 ^ (i18 << 5);
        PromoDetails promoDetails = this.promoDetails;
        int i19 = f848a + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 % 128;
        int i20 = i19 % 2;
        return promoDetails;
    }

    public CreditCardPaymentRequest(String str, CreditCardPaymentParams creditCardPaymentParams, CustomerDetailRequest customerDetailRequest) {
        super(str);
        this.paymentParams = creditCardPaymentParams;
        this.customerDetails = customerDetailRequest;
    }

    public CustomerDetailRequest getCustomerDetails() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 115;
        f848a = i3 % 128;
        int i4 = i3 % 2;
        CustomerDetailRequest customerDetailRequest = this.customerDetails;
        int i5 = i2 + 71;
        f848a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
        return customerDetailRequest;
    }

    public CreditCardPaymentParams getPaymentParams() {
        int i = 2 % 2;
        int i2 = f848a;
        int i3 = i2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        CreditCardPaymentParams creditCardPaymentParams = this.paymentParams;
        int i5 = i2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return creditCardPaymentParams;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPromoDetails(PromoDetails promoDetails) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        f848a = i2 % 128;
        int i3 = i2 % 2;
        this.promoDetails = promoDetails;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String $$g(int i, short s, byte b2) {
        int i2 = 3 - (i * 3);
        int i3 = s * 4;
        int i4 = 108 - (b2 * 3);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4 += i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2++;
            i4 += bArr[i2];
        }
    }
}
