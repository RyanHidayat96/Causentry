package com.midtrans.sdk.corekit.models.snap;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
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
import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.promo.Promo;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public class CreditCardPaymentModel {
    private static int $10 = 0;
    private static int $11 = 1;
    private String bank;
    private String cardToken;
    private String installment;
    private transient boolean isFromBankPoint;
    private String maskedCardNumber;

    @SerializedName("point")
    private float pointRedeemed;
    private Promo promoSelected;
    private boolean savecard;
    private static final byte[] $$d = {67, -127, -109, 9, -17, 6, -18, -1, 2, 1, 50, -73, -6, 1, -4, -3, -7, -6, 66, -76, 62, 2, -67, 4, -3, -9, 4, 47, -40, -19, -23, 7, -9, 3, 32, -48, -2, -7, 11, -23, 76, -17, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 62};
    private static final int $$e = 114;
    private static final byte[] $$a = {Base64.padSymbol, -108, 49, -100, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 202;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -5716530027202936101L;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.midtrans.sdk.corekit.models.snap.CreditCardPaymentModel.$$a
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r7 = r7 * 52
            int r7 = 108 - r7
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.snap.CreditCardPaymentModel.c(short, int, byte, java.lang.Object[]):void");
    }

    private static void d(int i, int i2, int i3, Object[] objArr) {
        int i4 = (i * 13) + 84;
        byte[] bArr = $$d;
        int i5 = i3 * 14;
        int i6 = 41 - (i2 * 38);
        byte[] bArr2 = new byte[i5 + 39];
        int i7 = i5 + 38;
        int i8 = -1;
        if (bArr == null) {
            i4 = (i7 + (-i6)) - 4;
            i6 = i6;
            i8 = -1;
        }
        while (true) {
            int i9 = i6 + 1;
            int i10 = i8 + 1;
            bArr2[i10] = (byte) i4;
            if (i10 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4 = (i4 + (-bArr[i9])) - 4;
                i6 = i9;
                i8 = i10;
            }
        }
    }

    public String getInstallment() throws Throwable {
        CharSequence charSequence;
        int iIntValue;
        CharSequence charSequence2;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = 1;
        int i5 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46401 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 40 - (ViewConfiguration.getLongPressTimeout() >> 16), MotionEvent.axisFromString("") + 20, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        int i8 = 0;
        Object[] objArr = new Object[1];
        a(new char[]{43937, 45281, 40250, 64095, 50835, 8994, 2174, 5319, 29143, 24180, 47864, 34806, 60429, 51376, 54758, 12804, 8029, 31676, 16418, 44402, 35215, 38608}, Drawable.resolveOpacity(0, 0) + 6991, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(new char[]{43941, 17127, 31031, 4177, 3743, 9682, 56422, 51871, 57853, 38914, 46914, 44429, 17453, 29538, 27071}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 59722, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = -397;
        CharSequence charSequence3 = "";
        long j2 = -1;
        long j3 = j2 ^ 3658286263980138916L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j4 = jIdentityHashCode ^ j2;
        long j5 = (j3 | j4) ^ j2;
        long j6 = (j3 | (-1561029089238179929L)) ^ j2;
        long j7 = (((long) 398) * 3658286263980138916L) + (((long) (-396)) * (-1561029089238179929L)) + ((j5 | j6 | ((j4 | (-1561029089238179929L)) ^ j2)) * j) + (j * j6) + (((long) 397) * ((j2 ^ ((j2 ^ (-1561029089238179929L)) | 3658286263980138916L)) | jIdentityHashCode | j6));
        int i9 = 0;
        try {
            while (i9 != 10) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
                TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                if (i10 % 2 == 0) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        charSequence2 = charSequence3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - Color.argb(i8, i8, i8, i8)), 58 - TextUtils.lastIndexOf(charSequence2, '0', i8, i8), 18 - (TypedValue.complexToFloat(i8) > 0.0f ? 1 : (TypedValue.complexToFloat(i8) == 0.0f ? 0 : -1)), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    } else {
                        charSequence2 = charSequence3;
                    }
                    i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                    i2 = i4;
                } else {
                    charSequence2 = charSequence3;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf(charSequence2, '0', i8) + 37837), (CdmaCellLocation.convertQuartSecToDecDegrees(i8) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i8) == 0.0d ? 0 : -1)) + 59, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
                    i2 = i8;
                }
                long j8 = jLongValue;
                while (true) {
                    for (int i11 = i8; i11 != 8; i11++) {
                        int i12 = TuitionPaymentFragmentbindingInflater1 + 65;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
                        int i13 = i12 % 2;
                        i = (((((int) (j8 >> i11)) & 255) + (i << 6)) + (i << 16)) - i;
                    }
                    if (i2 != 0) {
                        break;
                    }
                    i2++;
                    j8 = j7;
                    i8 = 0;
                }
                if (i == i7) {
                    return this.installment;
                }
                jLongValue -= 1024;
                i9++;
                charSequence3 = charSequence2;
                i4 = 1;
                i8 = 0;
            }
            Object[] objArr3 = {1203872118};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 46038), TextUtils.indexOf(charSequence, '0', 0, 0) + 1135, 18 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr4 = {Integer.valueOf(iIntValue), 0, 1618581432, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int i14 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1030;
                int iIndexOf = 15 - TextUtils.indexOf(charSequence, charSequence, 0, 0);
                byte[] bArr = $$a;
                Object[] objArr5 = new Object[1];
                c(bArr[37], bArr[132], (byte) 52, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, i14, iIndexOf, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getOffsetBefore(charSequence, 0) + 45993), 1116 - TextUtils.indexOf(charSequence, '0', 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 17), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr4);
            if (((int[]) objArr6[3])[0] != ((int[]) objArr6[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
                    TuitionPaymentFragmentbindingInflater1 = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = 0;
                    while (i17 < strArr.length) {
                        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                        TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                        if (i18 % 2 == 0) {
                            arrayList.add(strArr[i17]);
                            i17 += 57;
                        } else {
                            arrayList.add(strArr[i17]);
                            i17++;
                        }
                    }
                }
                throw null;
            }
            return this.installment;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        charSequence = charSequence3;
        Object[] objArr7 = new Object[1];
        a(new char[]{43946, 7542, 50712, 36644, 28850, 14751, 58027, 21583, 7455, 50785, 36853, 28804, 14759, 58207, 21607, 7476}, 46806 - TextUtils.indexOf(charSequence, '0', 0), objArr7);
        Class<?> cls2 = Class.forName((String) objArr7[0]);
        Object[] objArr8 = new Object[1];
        a(new char[]{43945, 32125, 1559, 12069, 61648, 39316, 41634, 29782, 7488, 9728, 53193, 37115, 47535, 17066, 5242, 15634}, TextUtils.getOffsetBefore(charSequence, 0) + 55001, objArr8);
        iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $11 + 115;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 19472), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2624, 12 - Process.getGidForName(""), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 39423), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 481, 37 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 29;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 39422), KeyEvent.getDeadChar(0, 0) + 481, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i8 = $11 + 19;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0216  */
    /* JADX WARN: Code duplicated, block: B:27:0x0218  */
    public String getMaskedCardNumber() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 31533);
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 921;
            int scrollBarSize = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte[] bArr = $$a;
            byte b = bArr[132];
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, pressedStateDuration, scrollBarSize, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        a(new char[]{43937, 45281, 40250, 64095, 50835, 8994, 2174, 5319, 29143, 24180, 47864, 34806, 60429, 51376, 54758, 12804, 8029, 31676, 16418, 44402, 35215, 38608}, TextUtils.getTrimmedLength("") + 6991, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        a(new char[]{43941, 17127, 31031, 4177, 3743, 9682, 56422, 51871, 57853, 38914, 46914, 44429, 17453, 29538, 27071}, Color.blue(0) + 59723, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
            int jumpTapTimeout = 921 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int trimmedLength = 28 - TextUtils.getTrimmedLength("");
            byte b3 = $$a[132];
            Object[] objArr5 = new Object[1];
            c(b3, b3, (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, jumpTapTimeout, trimmedLength, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 31533);
                int offsetAfter = 921 - TextUtils.getOffsetAfter("", 0);
                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 28;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                byte b5 = bArr2[132];
                Object[] objArr6 = new Object[1];
                c(b4, b5, (byte) (b5 | 36), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maxKeyCode, offsetAfter, iIndexOf, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = (-2138100215) + (((~((-346150566) | iIdentityHashCode)) | 10584065 | (~(1427929078 | iIdentityHashCode))) * (-754));
            int i5 = ~((-10584066) | iIdentityHashCode);
            int i6 = ~iIdentityHashCode;
            int i7 = i4 + ((i5 | (~(1438513143 | i6))) * (-754)) + ((i6 | (-346150566)) * 754) + 670500591;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            a(new char[]{43937, 59569, 11674, 25327, 42963, 58418, 14622, 32311, 45913, 63399, 13446, 18875, 36597, 49968, 6, 17784, 39494, 56998, 5018, 20724, 38392, 10787, 28440, 44140, 57673, 9635}, 17183 - View.MeasureSpec.getSize(0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a(new char[]{43939, 20338, 25148, 1511, 14521, 56397, 63262, 60144, 36232, 41295, 17514, 32548, 4855, 13754, 10582, 52224, 59359, 39577}, TextUtils.indexOf("", "", 0, 0) + 58567, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = TuitionPaymentFragmentbindingInflater1;
                int i11 = i10 + 23;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                int i12 = i11 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i13 = i10 + 21;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 41 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            a(new char[]{43946, 7542, 50712, 36644, 28850, 14751, 58027, 21583, 7455, 50785, 36853, 28804, 14759, 58207, 21607, 7476}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 46808, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(new char[]{43945, 32125, 1559, 12069, 61648, 39316, 41634, 29782, 7488, 9728, 53193, 37115, 47535, 17066, 5242, 15634}, (ViewConfiguration.getTapTimeout() >> 16) + 55001, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 670500591};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[9];
                Object[] objArr13 = new Object[1];
                d(b6, b6, bArr3[79], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[79];
                Object[] objArr14 = new Object[1];
                d(b7, b7, bArr3[9], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 922;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 29;
                    byte[] bArr4 = $$a;
                    byte b8 = bArr4[7];
                    byte b9 = bArr4[132];
                    Object[] objArr16 = new Object[1];
                    c(b8, b9, (byte) (b9 | 36), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionType, iIndexOf2, iLastIndexOf, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    a(new char[]{43937, 45281, 40250, 64095, 50835, 8994, 2174, 5319, 29143, 24180, 47864, 34806, 60429, 51376, 54758, 12804, 8029, 31676, 16418, 44402, 35215, 38608}, Color.blue(0) + 6991, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    a(new char[]{43941, 17127, 31031, 4177, 3743, 9682, 56422, 51871, 57853, 38914, 46914, 44429, 17453, 29538, 27071}, (ViewConfiguration.getScrollBarSize() >> 8) + 59723, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char edgeSlop = (char) (31533 - (ViewConfiguration.getEdgeSlop() >> 16));
                        int i15 = 921 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int deadChar = 28 - KeyEvent.getDeadChar(0, 0);
                        byte b10 = $$a[132];
                        Object[] objArr19 = new Object[1];
                        c(b10, b10, (byte) 52, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop, i15, deadChar, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumDrawingCacheSize = (char) (31533 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int jumpTapTimeout2 = 921 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i16 = 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[132];
                        byte b12 = bArr5[7];
                        Object[] objArr20 = new Object[1];
                        c(b11, b12, b12, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, jumpTapTimeout2, i16, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentbindingInflater1 = i17 % 128;
        int i18 = i17 % 2;
        int i19 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i20 = ~iIdentityHashCode2;
        int i21 = i19 + (-95842841) + (((~((-37818657) | i20)) | (~((-554181642) | iIdentityHashCode2)) | (~((-1144260691) | iIdentityHashCode2))) * 765) + (((~((-592000298) | i20)) | 37818656) * 1530) + (((~(iIdentityHashCode2 | (-592000298))) | (~(i20 | (-1144260691)))) * 765);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr21[0])[0] = i23 ^ (i23 << 5);
        return this.maskedCardNumber;
    }

    public CreditCardPaymentModel(String str) {
        this.maskedCardNumber = str;
    }

    public CreditCardPaymentModel(String str, boolean z) {
        this.cardToken = str;
        this.savecard = z;
    }

    public String getBank() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 53;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bank;
        int i5 = i2 + 67;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getCardToken() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cardToken;
        int i5 = i2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public float getPointRedeemed() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        float f = this.pointRedeemed;
        int i5 = i3 + 89;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public Promo getPromoSelected() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        Promo promo = this.promoSelected;
        int i5 = i3 + 67;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return promo;
        }
        throw null;
    }

    public boolean isFromBankPoint() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 23;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        boolean z = this.isFromBankPoint;
        int i5 = i3 + 111;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return z;
    }

    public boolean isSavecard() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        boolean z = this.savecard;
        int i5 = i3 + 73;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setBank(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 117;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.bank = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 75;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setFromBankPoint(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.isFromBankPoint = z;
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
    }

    public void setInstallment(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.installment = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public void setPointRedeemed(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 117;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        this.pointRedeemed = f;
        int i5 = i3 + 67;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setPromoSelected(Promo promo) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        this.promoSelected = promo;
        int i5 = i3 + 77;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }
}
