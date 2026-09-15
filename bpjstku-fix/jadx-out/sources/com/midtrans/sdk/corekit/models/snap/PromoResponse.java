package com.midtrans.sdk.corekit.models.snap;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
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
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PromoResponse implements Serializable {
    private List<String> bins;

    @SerializedName("discount_amount")
    private int discountAmount;

    @SerializedName("discount_type")
    private String discountType;

    @SerializedName(FirebaseAnalytics.Param.END_DATE)
    private String endDate;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f846id;

    @SerializedName("promo_code")
    private String promoCode;

    @SerializedName("sponsor_message_en")
    private String sponsorMessageEn;

    @SerializedName("sponsor_message_id")
    private String sponsorMessageId;

    @SerializedName("sponsor_name")
    private String sponsorName;

    @SerializedName(FirebaseAnalytics.Param.START_DATE)
    private String startDate;
    private static final byte[] $$c = {117, 50, 102, 124};
    private static final int $$f = 201;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {114, -115, 48, 84, 22, 8, -53, 67, 18, 10, 2, 15, 3, -45, 67, 22, 6, 9, -54, 69, 15, 16, -5, 23, 6, -3, 21, -52, 62, 17, 15, 0, -44, 48, 47, 1, -1, -26, 45, 7, 25, 14, -5, 23, 11, -69, 25, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -57};
    private static final int $$e = 114;
    private static final byte[] $$a = {57, -50, -56, -93, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 85;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int g = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {47398, 47449, 47395, 47445, 47448, 47454, 47385, 47444, 47412, 47438, 47443, 47394, 47450, 47364, 47451, 47396, 47452, 47447, 47413, 47366, 47441, 47411, 47455, 47442};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719623;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    private static boolean b = true;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = 103 - r8
            int r6 = r6 * 52
            int r0 = 53 - r6
            int r7 = r7 + 4
            byte[] r1 = com.midtrans.sdk.corekit.models.snap.PromoResponse.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.snap.PromoResponse.a(int, byte, byte, java.lang.Object[]):void");
    }

    private static void d(byte b2, int i, int i2, Object[] objArr) {
        int i3 = i2 * 9;
        int i4 = 47 - (i * 43);
        int i5 = 99 - (b2 * 15);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[53 - i3];
        int i6 = 52 - i3;
        int i7 = -1;
        if (bArr == null) {
            i4++;
            i5 = (i6 + i5) - 10;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4++;
                i5 = (i5 + bArr[i4]) - 10;
            }
        }
    }

    public void setSponsorMessageId(String str) throws Throwable {
        int i;
        int length;
        Object[] objArr;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0');
            int keyRepeatDelay = 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte b2 = $$a[5];
            byte b3 = (byte) (-b2);
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 & 5), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, iIndexOf, keyRepeatDelay, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(null, null, MotionEvent.axisFromString("") + 128, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(null, null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int iIndexOf2 = 876 - TextUtils.indexOf("", "", 0, 0);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 10;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr[7], (byte) (-bArr[5]), bArr[10], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, iIndexOf2, absoluteGravity, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int size = View.MeasureSpec.getSize(0) + 876;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 11;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[5];
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (b4 | 50), bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter, size, iLastIndexOf, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = ((((-387753740) + (((~((-74465378) | (~iIdentityHashCode))) | (~((-34155149) | iIdentityHashCode))) * (-272))) + (((~((-879940724) | iIdentityHashCode)) | 805475346) * (-272))) + (((~(iIdentityHashCode | 879940723)) | (-839630495)) * 272)) - 2104709701;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(null, null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(null, null, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            if (str != null) {
                length = str.length();
                int i6 = TuitionPaymentFragmentbindingInflater1 + 103;
                g = i6 % 128;
                i = 2;
                int i7 = i6 % 2;
            } else {
                i = 2;
                length = 0;
            }
            int i8 = g + 49;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            int i9 = i8 % i;
            try {
                Object[] objArr10 = new Object[3];
                objArr10[i] = -2104709701;
                objArr10[1] = Integer.valueOf(length);
                objArr10[0] = applicationContext;
                byte[] bArr3 = $$d;
                byte b5 = bArr3[31];
                byte b6 = bArr3[35];
                Object[] objArr11 = new Object[1];
                d(b5, b6, b6, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr3[35];
                byte b8 = bArr3[31];
                Object[] objArr12 = new Object[1];
                d(b7, b8, b8, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
                        int i10 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 10;
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[5];
                        Object[] objArr13 = new Object[1];
                        a(b9, (byte) (b9 | 50), bArr4[7], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter2, i10, threadPriority, 256017550, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr14 = new Object[1];
                        c(null, null, 127 - Drawable.resolveOpacity(0, 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr14);
                        Class<?> cls4 = Class.forName((String) objArr14[0]);
                        Object[] objArr15 = new Object[1];
                        c(null, null, ImageFormat.getBitsPerPixel(0) + 128, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr15);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                            int iMyPid = 876 - (Process.myPid() >> 22);
                            int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 10;
                            byte[] bArr5 = $$a;
                            Object[] objArr16 = new Object[1];
                            a(bArr5[7], (byte) (-bArr5[5]), bArr5[10], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iMyPid, iIndexOf3, 2009631821, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int defaultSize = View.getDefaultSize(0, 0) + 876;
                            int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
                            byte b10 = $$a[5];
                            byte b11 = (byte) (-b10);
                            Object[] objArr17 = new Object[1];
                            a(b10, b11, (byte) (b11 & 5), objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, defaultSize, iResolveSizeAndState, 252381699, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i11 = ((int[]) objArr[1])[0];
        Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i12 = ~iIdentityHashCode2;
        int i13 = i11 + (-1049576676) + ((iIdentityHashCode2 | 805355920) * 988) + (((~(946988978 | i12)) | (-1048311808)) * (-1976)) + (((~(iIdentityHashCode2 | 906678749)) | 805355920 | (~((-906678750) | i12))) * 988);
        int i14 = (i13 << 13) ^ i13;
        int i15 = i14 ^ (i14 >>> 17);
        ((int[]) objArr18[1])[0] = i15 ^ (i15 << 5);
        int i16 = g + 101;
        TuitionPaymentFragmentbindingInflater1 = i16 % 128;
        int i17 = i16 % 2;
        this.sponsorMessageId = str;
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        long j;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 31339), 2994 - View.MeasureSpec.makeMeasureSpec(0, 0), 17 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1182129903, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            long j2 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43325), ExpandableListView.getPackedPositionGroup(0L) + 253, Color.red(0) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            if (b) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33601 - TextUtils.lastIndexOf("", '0', 0)), 3085 - View.MeasureSpec.getMode(0), (KeyEvent.getMaxKeyCode() >> 16) + 26, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i4 = $10 + 109;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i6 = $10 + 109;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i7 = $10 + 23;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >>> 1) + getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] << iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionChild(j2) + 33603), (ViewConfiguration.getJumpTapTimeout() >> 16) + 3085, 26 - View.MeasureSpec.makeMeasureSpec(0, 0), -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    j2 = 0;
                } else {
                    cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        j = 0;
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33602 - Drawable.resolveOpacity(0, 0)), 3085 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -2146875848, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                    } else {
                        j = 0;
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    j2 = j;
                }
            }
            objArr[0] = new String(cArr2);
            int i8 = $10 + 49;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 98 / 0;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public List<String> getBins() {
        int i = 2 % 2;
        int i2 = g + 59;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        List<String> list = this.bins;
        int i5 = i3 + 63;
        g = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public int getDiscountAmount() {
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 25;
        int i4 = i3 % 128;
        g = i4;
        if (i3 % 2 == 0) {
            i = this.discountAmount;
            int i5 = 46 / 0;
        } else {
            i = this.discountAmount;
        }
        int i6 = i4 + 3;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public String getDiscountType() {
        int i = 2 % 2;
        int i2 = g + 79;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.discountType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getEndDate() {
        int i = 2 % 2;
        int i2 = g + 79;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.endDate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getId() {
        int i = 2 % 2;
        int i2 = g + 41;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f846id;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getPromoCode() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 41;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.promoCode;
        int i5 = i2 + 69;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getSponsorMessageEn() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 49;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorMessageEn;
        int i5 = i2 + 109;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getSponsorMessageId() {
        int i = 2 % 2;
        int i2 = g + 91;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.sponsorMessageId;
        int i5 = i3 + 43;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String getSponsorName() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 51;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorName;
        int i5 = i2 + 15;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return str;
    }

    public String getStartDate() {
        int i = 2 % 2;
        int i2 = g + 85;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.startDate;
        int i4 = i3 + 95;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return str;
    }

    public void setBins(List<String> list) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 115;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.bins = list;
        int i5 = i2 + 125;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setDiscountAmount(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 85;
        g = i3 % 128;
        int i4 = i3 % 2;
        this.discountAmount = i;
        if (i4 == 0) {
            int i5 = 59 / 0;
        }
    }

    public void setDiscountType(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 97;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.discountType = str;
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
    }

    public void setEndDate(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 97;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        this.endDate = str;
        int i5 = i3 + 5;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setId(int i) {
        int i2 = 2 % 2;
        int i3 = g + 43;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.f846id = i;
        if (i4 != 0) {
            throw null;
        }
    }

    public void setPromoCode(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 21;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        this.promoCode = str;
        if (i4 == 0) {
            int i5 = 17 / 0;
        }
        int i6 = i3 + 89;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setSponsorMessageEn(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 53;
        g = i3 % 128;
        int i4 = i3 % 2;
        this.sponsorMessageEn = str;
        int i5 = i2 + 29;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setSponsorName(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 5;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.sponsorName = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public void setStartDate(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 11;
        g = i3 % 128;
        int i4 = i3 % 2;
        this.startDate = str;
        int i5 = i2 + 119;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, int r8) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            byte[] r1 = com.midtrans.sdk.corekit.models.snap.PromoResponse.$$c
            int r7 = r7 + 67
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r7 = -r7
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.snap.PromoResponse.$$g(byte, short, int):java.lang.String");
    }
}
