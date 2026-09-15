package com.midtrans.sdk.uikit.scancard;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import defpackage.abortCapture;
import defpackage.getSelectedTab;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public class ScannerModel implements Serializable {
    private String cardNumber;
    private String cvv;
    private int expiredMonth;
    private int expiredYear;
    private static final byte[] $$c = {58, 66, -14, -31};
    private static final int $$f = 158;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {109, 84, -87, -114, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -58, -5, -11, 11, 1, -1, -20, 12, 53, -71, 12, -16, -2, 8, -8, -1, -7, 67, -39, -23, 5, -19, 11, -1, 15, -20, -16, -2, 8, -8, -1, 26, -21, -13, -1, -6, 8, -13, 3, -5, -9, 46, -38, -5, 2, 70, -76, -3, -7, 9, 1, -21, 36, -36, 17, -19, 14, -17, 7, 5, -5, -15, -3, 77, -15, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 64};
    private static final int $$h = 27;
    private static final byte[] $$d = {81, 125, 2, 46, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 69;
    private static final byte[] $$a = {106, -93, -11, -74, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 36, 19, 4, 10, -8, 8, 0, -22, 22, 15, -11, 8, 0, 15, 0, 17, -34, 19, 4, 10, -8, 8, 0, -26, 39, -6, 11};
    private static final int $$b = 70;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static char[] b = {45565, 6197, 57974, 19643, 5871, 57622, 19282, 5571, 65483, 17936, 4212, 64066, 17585, 12020, 63754, 17232, 11649, 63464, 24078, 10294, 62067, 23716, 246, 43320, 21372, 64950, 43004, 20501, 64093, 42160, 20174, 63245, 41273, 19306, 62894, 40933, 18452, 13934, 40866, 26108, 52016, 37174, 26251, 52431, 37403, 30811, 49621, 38801, 32240, 49955, 43371, 32387, 50368, 32845, 10625, 54239, 32019, 10005, 53416, 31468, 9272, 52856, 30710, 8595, 52175, 29973, 8016, 51360, 29421, 7203, 50750, 28564, 6535, 50143, 27932, 5970, 49314, 45563, 6206, 57958, 19588, 5871, 57627, 19295, 5515, 65485, 17926, 4136, 64098, 45557, 6184, 57948, 19624, 5876, 57622, 19264, 5512, 8282, 35231, 29639, 56634, 34628, 28842, 56034, 33854, 28267, 55190, 33154, 27584, 54540};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 673514060892805211L;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 5584377139044180071L;

    public ScannerModel(String str, String str2, int i, int i2) {
        setCardNumber(str);
        setCvv(str2);
        setExpiredMonth(i);
        setExpiredYear(i2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = 53 - r7
            byte[] r1 = com.midtrans.sdk.uikit.scancard.ScannerModel.$$d
            int r6 = 73 - r6
            int r5 = 103 - r5
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            r3 = r1[r6]
        L24:
            int r6 = r6 + 1
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.scancard.ScannerModel.a(byte, byte, int, java.lang.Object[]):void");
    }

    private static void e(short s, byte b2, int i, Object[] objArr) {
        int i2 = i * 23;
        byte[] bArr = $$g;
        int i3 = 79 - (b2 * 75);
        int i4 = 99 - (s * 15);
        byte[] bArr2 = new byte[i2 + 53];
        int i5 = i2 + 52;
        int i6 = -1;
        if (bArr == null) {
            int i7 = i5 + (-i4);
            int i8 = i3 + 1;
            int i9 = i7 - 2;
            i6 = -1;
            i3 = i8;
            i4 = i9;
        }
        while (true) {
            int i10 = i6 + 1;
            bArr2[i10] = (byte) i4;
            if (i10 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i11 = i3;
            i6 = i10;
            i3 = i11 + 1;
            i4 = (i4 + (-bArr[i3])) - 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 19
            int r7 = r7 + 14
            int r9 = r9 * 6
            int r9 = r9 + 97
            byte[] r0 = com.midtrans.sdk.uikit.scancard.ScannerModel.$$a
            int r8 = r8 * 32
            int r8 = 35 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2f
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2f:
            int r3 = r3 + r8
            int r8 = r3 + (-2)
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.scancard.ScannerModel.f(byte, byte, byte, java.lang.Object[]):void");
    }

    public String getCardNumber() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.cardNumber;
        int i4 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public String getCvv() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 19;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.cvv;
        int i5 = i3 + 29;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public int getExpiredMonth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 35;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.expiredMonth;
        int i6 = i2 + 91;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 45;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.rgb(0, 0, 0) + 16842054), TextUtils.indexOf("", "", 0) + 1356, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 38, 894276454, false, $$i(b2, (byte) (b2 | 8), b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 47773), TextUtils.indexOf((CharSequence) "", '0') + 469, 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $10 + 9;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $10 + 121;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i6 = $11 + 117;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(b[i >> i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", 0), 2187 - KeyEvent.keyCodeFromString(""), TextUtils.getOffsetBefore("", 0) + 40, 841711447, false, $$i(b2, (byte) (b2 | 6), b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 33017), 3011 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 26 - View.getDefaultSize(0, 0), 321985076, false, $$i(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - TextUtils.getCapsMode("", 0, 0)), 3376 - (Process.myTid() >> 22), 16 - MotionEvent.axisFromString(""), -968507904, false, $$i(b5, b6, (byte) (b6 - 3)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(b[i + i8])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2187, ImageFormat.getBitsPerPixel(0) + 41, 841711447, false, $$i(b7, (byte) (b7 | 6), b7), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33017 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3011, 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 321985076, false, $$i(b8, b9, b9), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36505 - Color.argb(0, 0, 0, 0)), TextUtils.lastIndexOf("", '0') + 3377, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17, -968507904, false, $$i(b10, b11, (byte) (b11 - 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            try {
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36504), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3375, 16 - TextUtils.lastIndexOf("", '0', 0), -968507904, false, $$i(b12, b13, (byte) (b13 - 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
        int i9 = $10 + 55;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 52 / 0;
        }
    }

    public int getExpiredYear() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int tapTimeout = 876 - (ViewConfiguration.getTapTimeout() >> 16);
            int iBlue = 10 - Color.blue(0);
            Object[] objArr2 = new Object[1];
            a($$d[36], (byte) $$e, (byte) 42, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, tapTimeout, iBlue, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getCapsMode("", 0, 0) + 22, (char) ('0' - AndroidCharacter.getMirror('0')), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(TextUtils.indexOf("", "", 0) + 22, 15 - Color.alpha(0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 45326), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 876;
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 10;
            byte b2 = (byte) (-$$d[31]);
            Object[] objArr5 = new Object[1];
            a(b2, (byte) (b2 | 56), (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, touchSlop, iResolveOpacity, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int i5 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i6 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                byte[] bArr = $$d;
                Object[] objArr6 = new Object[1];
                a(bArr[36], (byte) 59, (byte) (-bArr[61]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, i5, i6, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i7 = (((1830022226 + (((~((~iFreeMemory) | (-127834031))) | (-87523802)) * (-235))) + (((~((-127834031) | iFreeMemory)) | (-87523802)) * (-470))) + (((~(iFreeMemory | (-85361033))) | (-129996800)) * 235)) - 811204120;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(37 - (ViewConfiguration.getPressedStateDuration() >> 16), 15 - TextUtils.lastIndexOf("", '0', 0), (char) (34712 - Color.green(0)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{42263, 42366, 62402, 58336, 47743, 36199, 52171, 52213, 57964, 31143, 62807, 63367, 41935, 37886, 51825, 9234, 56664, 31685, 31725, 12920}, Color.rgb(0, 0, 0) + 16777217, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i10 = TuitionPaymentFragmentbindingInflater1 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), -811204120};
                byte[] bArr2 = $$g;
                byte b3 = bArr2[5];
                byte b4 = bArr2[18];
                Object[] objArr11 = new Object[1];
                e(b3, b4, b4, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b5 = bArr2[18];
                byte b6 = bArr2[5];
                Object[] objArr12 = new Object[1];
                e(b5, b6, b6, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    int iGreen = Color.green(0) + 876;
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
                    byte[] bArr3 = $$d;
                    Object[] objArr14 = new Object[1];
                    a(bArr3[36], (byte) 59, (byte) (-bArr3[61]), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, iGreen, iMakeMeasureSpec, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(ViewConfiguration.getEdgeSlop() >> 16, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(Color.blue(0) + 22, 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (Color.green(0) + 45327), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                        int windowTouchSlop = 876 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int maximumDrawingCacheSize = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte b7 = (byte) (-$$d[31]);
                        Object[] objArr17 = new Object[1];
                        a(b7, (byte) (b7 | 56), (byte) 52, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, windowTouchSlop, maximumDrawingCacheSize, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int packedPositionChild = 875 - ExpandableListView.getPackedPositionChild(0L);
                        int size = 10 - View.MeasureSpec.getSize(0);
                        Object[] objArr18 = new Object[1];
                        a($$d[36], (byte) $$e, (byte) 42, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, packedPositionChild, size, -1199417970, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr == null) {
                throw null;
            }
            while (i4 < strArr.length) {
                arrayList.add(strArr[i4]);
                i4++;
                int i12 = TuitionPaymentFragmentbindingInflater1 + 31;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                int i13 = i12 % 2;
            }
            throw null;
        }
        int i14 = ((int[]) objArr[1])[0];
        Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i15 = ~iIdentityHashCode;
        int i16 = i14 + (-2140280284) + ((~(950473037 | i15)) * 979) + ((iIdentityHashCode | 990783266) * (-979)) + (((~(iIdentityHashCode | 950473037)) | (~(i15 | 990783266))) * 979);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr19[1])[0] = i18 ^ (i18 << 5);
        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i20 = i19 + 29;
        TuitionPaymentFragmentbindingInflater1 = i20 % 128;
        int i21 = i20 % 2;
        int i22 = this.expiredYear;
        int i23 = i19 + 59;
        TuitionPaymentFragmentbindingInflater1 = i23 % 128;
        if (i23 % 2 == 0) {
            return i22;
        }
        throw null;
    }

    public void setCardNumber(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.cardNumber = str;
        int i5 = i3 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setCvv(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 35;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.cvv = str;
        int i5 = i3 + 43;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setExpiredMonth(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1;
        int i4 = i3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        this.expiredMonth = i;
        int i6 = i3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setExpiredYear(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = i3 + 53;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        this.expiredYear = i;
        int i6 = i3 + 53;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x09df  */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) throws Throwable {
        int i;
        int i2;
        boolean z;
        int i3;
        String string;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        Method[] methodArr = new Method[2];
        byte[] bArr = $$a;
        byte b2 = bArr[13];
        int i8 = 1;
        Object[] objArr = new Object[1];
        f(b2, b2, bArr[28], objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        byte b3 = bArr[28];
        Object[] objArr2 = new Object[1];
        f(b3, b3, bArr[13], objArr2);
        methodArr[0] = cls.getMethod((String) objArr2[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        byte b4 = bArr[28];
        Object[] objArr3 = new Object[1];
        f(b4, b4, bArr[13], objArr3);
        String str = (String) objArr3[0];
        int i9 = TuitionPaymentFragmentbindingInflater1;
        int i10 = (i9 ^ 35) + ((i9 & 35) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
        int i11 = i10 % 2;
        Class<?>[] clsArr = {String.class, Integer.TYPE};
        int i12 = TuitionPaymentFragmentbindingInflater1;
        int i13 = ((i12 | 39) << 1) - (i12 ^ 39);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
        Object obj = null;
        if (i13 % 2 == 0) {
            methodArr[1] = cls2.getMethod(str, clsArr);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                int i14 = 2823 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int modifierMetaStateMask = 21 - ((byte) KeyEvent.getModifierMetaStateMask());
                byte[] bArr2 = $$d;
                Object[] objArr4 = new Object[1];
                a(bArr2[27], (byte) 52, bArr2[24], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, i14, modifierMetaStateMask, 1814927978, false, (String) objArr4[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
            obj.hashCode();
            throw null;
        }
        methodArr[1] = cls2.getMethod(str, clsArr);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i15 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2822;
            int iResolveSize = View.resolveSize(0, 0) + 22;
            byte[] bArr3 = $$d;
            Object[] objArr5 = new Object[1];
            a(bArr3[27], (byte) 52, bArr3[24], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, i15, iResolveSize, 1814927978, false, (String) objArr5[0], null);
        }
        long j = 0;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.MeasureSpec.getMode(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2823, 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
            TuitionPaymentFragmentbindingInflater1 = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 0;
            while (i18 < length) {
                Method method = declaredMethods[i18];
                try {
                    int i19 = (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1));
                    int i20 = (i19 & 52) + (i19 | 52);
                    int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i21 = maximumDrawingCacheSize * 465;
                    int i22 = (i21 & (-11112)) + (i21 | (-11112));
                    int i23 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i24 = ~((-25) | i23);
                    int i25 = ~(((-25) ^ maximumDrawingCacheSize) | ((-25) & maximumDrawingCacheSize));
                    int i26 = (i24 ^ i25) | (i25 & i24);
                    int i27 = ~((i23 ^ maximumDrawingCacheSize) | (i23 & maximumDrawingCacheSize));
                    int i28 = (i22 - (~(-(-(((i26 & i27) | (i26 ^ i27)) * 464))))) - i8;
                    int i29 = ~maximumDrawingCacheSize;
                    int i30 = i28 + (((i29 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ i29) | (-25)) * (-464));
                    int i31 = ~(((-25) ^ maximumDrawingCacheSize) | ((-25) & maximumDrawingCacheSize));
                    int i32 = ~((maximumDrawingCacheSize & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (maximumDrawingCacheSize ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    int i33 = (i30 - (~(((i31 & i32) | (i31 ^ i32)) * 464))) - i8;
                    int i34 = -ExpandableListView.getPackedPositionType(j);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i35 = (i34 * (-380)) - (-4863242);
                    int i36 = iTuitionPaymentFragmentspecialinlinedviewModeldefault2 | 12731;
                    int i37 = ~i34;
                    int i38 = -(-(((i36 ^ i37) | (i36 & i37)) * (-381)));
                    int i39 = (i35 & i38) + (i35 | i38);
                    int i40 = ~((~i34) | (-12732));
                    int i41 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i42 = ~((i41 & 12731) | (i41 ^ 12731));
                    int i43 = (i42 & i40) | (i40 ^ i42);
                    int i44 = ~((i34 & 12731) | (i34 ^ 12731));
                    int i45 = ((i44 & i43) | (i43 ^ i44)) * 381;
                    int i46 = TuitionPaymentFragmentbindingInflater1;
                    int i47 = (i46 & 77) + (i46 | 77);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i47 % 128;
                    int i48 = i47 % 2;
                    Object[] objArr6 = new Object[i8];
                    c(i20, i33, (char) (((i39 + i45) - (~(-(-((~((i37 ^ 12731) | (i37 & 12731))) * 381))))) - 1), objArr6);
                    Class<?> cls3 = Class.forName((String) objArr6[0]);
                    int i49 = 77 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))));
                    int i50 = -Process.getGidForName("");
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i51 = ((i50 * 141) - 3069) + (((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 11) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 11)) * 140);
                    int i52 = ~i50;
                    int i53 = (i52 & 11) | (i52 ^ 11);
                    int i54 = ~i53;
                    int i55 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i56 = ~(i55 | 11);
                    int i57 = ((i54 ^ i56) | (i56 & i54)) * (-280);
                    int i58 = (i51 & i57) + (i57 | i51);
                    int i59 = ~(((-12) & i50) | ((-12) ^ i50));
                    int i60 = ~((i50 & i55) | (i55 ^ i50));
                    int i61 = (i60 & i59) | (i59 ^ i60);
                    int i62 = ~((i53 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i53 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    Object[] objArr7 = new Object[i8];
                    c(i49, (i58 - (~(-(-(((i61 & i62) | (i61 ^ i62)) * 140))))) - i8, (char) Color.alpha(0), objArr7);
                    Object[] objArr8 = new Object[i8];
                    objArr8[0] = Integer.valueOf(((Integer) cls3.getMethod((String) objArr7[0], null).invoke(method, null)).intValue());
                    Object[] objArr9 = new Object[i8];
                    d(new char[]{62688, 62602, 44208, 57859, 36735, 56522, 38073, 51728, 55156, 9936, 42127, 63095, 64759, 37391, 65395, 4381, 35978, 9393, 31260, 1905, 21636, 3311, 16936, 12129, 15504, 29868, 10759, 30563, 1181, 23739}, -Process.getGidForName(""), objArr9);
                    Class<?> cls4 = Class.forName((String) objArr9[0]);
                    int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                    int i63 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i64 = (i63 & 1) + (i63 | i8);
                    TuitionPaymentFragmentbindingInflater1 = i64 % 128;
                    int i65 = i64 % 2;
                    int i66 = -scrollBarSize;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i67 = i66 * (-963);
                    int i68 = ((i67 ^ (-964)) + ((i67 & (-964)) << i8)) - (-85885);
                    int i69 = ~i66;
                    int i70 = ~((-90) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                    int i71 = ((i69 & i70) | (i69 ^ i70)) * (-964);
                    int i72 = ((i68 | i71) << i8) - (i71 ^ i68);
                    int i73 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (-90));
                    int i74 = ~((i66 & (-90)) | ((-90) ^ i66));
                    int i75 = ((i74 & i73) | (i73 ^ i74)) * (-964);
                    int i76 = (i72 ^ i75) + ((i75 & i72) << i8);
                    int i77 = -(ViewConfiguration.getScrollBarSize() >> 8);
                    Object[] objArr10 = new Object[i8];
                    c(i76, (i77 & 8) + (i77 | 8), (char) TextUtils.getOffsetBefore("", 0), objArr10);
                    String str2 = (String) objArr10[0];
                    Class<?>[] clsArr2 = new Class[i8];
                    clsArr2[0] = Integer.TYPE;
                    if (((Boolean) cls4.getMethod(str2, clsArr2).invoke(null, objArr8)).booleanValue()) {
                        int i78 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i79 = ((i78 | 67) << i8) - (i78 ^ 67);
                        TuitionPaymentFragmentbindingInflater1 = i79 % 128;
                        int i80 = i79 % 2;
                        Class cls5 = Long.TYPE;
                        int i81 = 51 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                        int iAxisFromString = MotionEvent.axisFromString("");
                        int i82 = (iAxisFromString & 25) + (iAxisFromString | 25);
                        int i83 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i84 = i83 * 595;
                        int i85 = (i84 & (-15111697)) + (i84 | (-15111697));
                        int i86 = ~i83;
                        int i87 = ~((i86 & 12731) | (i86 ^ 12731));
                        int i88 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i89 = ~((i88 & 12731) | (i88 ^ 12731));
                        int i90 = i85 + (((i89 & i87) | (i87 ^ i89)) * (-1188));
                        int i91 = ~(((-12732) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-12732) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                        int i92 = (i87 ^ i91) | (i87 & i91);
                        int i93 = ~((i88 & i83) | (i88 ^ i83));
                        int i94 = -(-(((i92 & i93) | (i92 ^ i93)) * 594));
                        int i95 = (i90 ^ i94) + ((i94 & i90) << 1);
                        int i96 = TuitionPaymentFragmentbindingInflater1 + 21;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i96 % 128;
                        int i97 = i96 % 2;
                        int i98 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        Object[] objArr11 = new Object[1];
                        c(i81, i82, (char) (i95 + (594 * ((~((i83 & i98) | (i98 ^ i83))) | (~(((-12732) & i98) | ((-12732) ^ i98))) | (~(((-12732) ^ i83) | ((-12732) & i83)))))), objArr11);
                        Class<?> cls6 = Class.forName((String) objArr11[0]);
                        int i99 = -(KeyEvent.getMaxKeyCode() >> 16);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i100 = i99 * (-167);
                        int i101 = (i100 & (-16199)) + (i100 | (-16199));
                        int i102 = ~i99;
                        int i103 = i101 + (((~((i102 & (-98)) | (i102 ^ (-98)))) | (~((-98) | iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) * 336);
                        int i104 = ~((i99 ^ 97) | (i99 & 97));
                        int i105 = ~(i99 | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                        int i106 = -(-(((i104 & i105) | (i104 ^ i105)) * (-168)));
                        int i107 = (i103 ^ i106) + ((i106 & i103) << 1);
                        getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i108 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        int i109 = 168 * ((~((i99 & i108) | (i108 ^ i99))) | (-98));
                        int i110 = (i107 & i109) + (i109 | i107);
                        int i111 = -Color.argb(0, 0, 0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i112 = i111 * 69;
                        int i113 = (i112 ^ (-871)) + ((i112 & (-871)) << 1);
                        int i114 = ~i111;
                        int i115 = (i114 ^ (-14)) | (i114 & (-14));
                        getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        int i117 = ~((i115 ^ i116) | (i115 & i116));
                        int i118 = ~((i111 ^ 13) | (i111 & 13));
                        int i119 = (i117 ^ i118) | (i118 & i117);
                        int i120 = ~((13 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & 13));
                        int i121 = i113 + ((-68) * ((i119 & i120) | (i119 ^ i120)));
                        int i122 = (i114 ^ i116) | (i114 & i116);
                        int i123 = (i121 - (~(-(-((~((i122 & 13) | (i122 ^ 13))) * (-68)))))) - 1;
                        int i124 = ((-14) & i116) | ((-14) ^ i116);
                        int i125 = TuitionPaymentFragmentbindingInflater1;
                        int i126 = (i125 & 29) + (i125 | 29);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i126 % 128;
                        int i127 = i126 % 2;
                        int i128 = ~i124;
                        int i129 = -(-(68 * ((i128 & i114) | (i114 ^ i128))));
                        int i130 = ((i123 | i129) << 1) - (i129 ^ i123);
                        int iBlue = Color.blue(0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i131 = (iBlue * 673) - 50068383;
                        int i132 = ((~(iBlue | iTuitionPaymentFragmentspecialinlinedviewModeldefault8)) | 37281) * 672;
                        int i133 = ((i131 | i132) << 1) - (i131 ^ i132);
                        int i134 = ~iBlue;
                        int i135 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                        int i136 = TuitionPaymentFragmentbindingInflater1;
                        int i137 = ((i136 | 103) << 1) - (i136 ^ 103);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i137 % 128;
                        int i138 = i137 % 2;
                        int i139 = ~((i134 ^ i135) | (i134 & i135));
                        int i140 = ~(37281 | iTuitionPaymentFragmentspecialinlinedviewModeldefault8);
                        int i141 = i133 + ((-672) * ((i140 & i139) | (i139 ^ i140)));
                        int i142 = ~(((-37282) ^ i135) | ((-37282) & i135));
                        int i143 = ~(((-37282) & iBlue) | ((-37282) ^ iBlue));
                        int i144 = -(-(((i143 & i142) | (i142 ^ i143)) * 672));
                        Object[] objArr12 = new Object[1];
                        c(i110, i130, (char) ((i141 ^ i144) + ((i141 & i144) << 1)), objArr12);
                        if (cls5.equals(cls6.getMethod((String) objArr12[0], null).invoke(method, null))) {
                            int i145 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
                            TuitionPaymentFragmentbindingInflater1 = i145 % 128;
                            int i146 = i145 % 2;
                            int iIndexOf = TextUtils.indexOf("", "");
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i147 = ~iIndexOf;
                            int i148 = ~((i147 ^ (-54)) | (i147 & (-54)));
                            int i149 = ~(i147 | iTuitionPaymentFragmentspecialinlinedviewModeldefault9);
                            int i150 = (((iIndexOf * (-495)) - 26235) - (~(-(-(((i148 & i149) | (i148 ^ i149)) * 992))))) - 1;
                            int i151 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i152 = ((i151 | 25) << 1) - (i151 ^ 25);
                            int i153 = i152 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i153;
                            int i154 = i152 % 2;
                            int i155 = ~(i147 | (-54));
                            int i156 = ~(i147 | iTuitionPaymentFragmentspecialinlinedviewModeldefault9);
                            int i157 = (i156 & i155) | (i155 ^ i156);
                            int i158 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                            int i159 = (iIndexOf & i158) | (i158 ^ iIndexOf);
                            int i160 = ~((i159 & 53) | (i159 ^ 53));
                            int i161 = -(-((-496) * ((i160 & i157) | (i157 ^ i160))));
                            int i162 = i153 + 91;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i162 % 128;
                            int i163 = i162 % 2;
                            int i164 = (((i150 | i161) << 1) - (i161 ^ i150)) + (496 * (53 | iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                            int i165 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            int i166 = (i165 ^ 24) + ((i165 & 24) << 1);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i167 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i168 = (i167 ^ 119) + ((i167 & 119) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i168 % 128;
                            if (i168 % 2 != 0) {
                                i4 = ((-495) >> iMakeMeasureSpec) >>> 31;
                                int i169 = ~iMakeMeasureSpec;
                                i6 = ~((i169 & (-12732)) | (i169 ^ (-12732)));
                                i5 = ~iMakeMeasureSpec;
                            } else {
                                i4 = (iMakeMeasureSpec * (-495)) - 6301845;
                                i5 = ~iMakeMeasureSpec;
                                i6 = ~((i5 ^ (-12732)) | (i5 & (-12732)));
                            }
                            int i170 = ~((i5 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i5 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                            int i171 = i4 + (992 * ((i6 & i170) | (i6 ^ i170)));
                            int i172 = ~iMakeMeasureSpec;
                            int i173 = (~((i172 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i172 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10))) | (~((i172 ^ (-12732)) | (i172 & (-12732))));
                            int i174 = iMakeMeasureSpec | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault10);
                            int i175 = ~((i174 & 12731) | (i174 ^ 12731));
                            int i176 = ((i175 & i173) | (i173 ^ i175)) * (-496);
                            char c = (char) ((i171 ^ i176) + ((i171 & i176) << 1) + (((iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & 12731) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 ^ 12731)) * 496));
                            Object[] objArr13 = new Object[1];
                            c(i164, i166, c, objArr13);
                            Class<?> cls7 = Class.forName((String) objArr13[0]);
                            int i177 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int i178 = ((i177 | 1) << 1) - (i177 ^ 1);
                            Object[] objArr14 = new Object[1];
                            d(new char[]{47412, 47443, 4895, 60155, 27053, 37201, 11020, 49898, 12692, 39291, 59737, 65165, 17158, 39650, 6535, 63486, 49516, 39695, 29427, 57748, 6487}, i178, objArr14);
                            Object[] objArr15 = (Object[]) cls7.getMethod((String) objArr14[0], null).invoke(method, null);
                            if (objArr15.length == 2) {
                                int i179 = TuitionPaymentFragmentbindingInflater1;
                                int i180 = ((i179 | 79) << 1) - (i179 ^ 79);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i180 % 128;
                                int i181 = i180 % 2;
                                if (Long.TYPE.equals(objArr15[0])) {
                                    int i182 = -ExpandableListView.getPackedPositionType(0L);
                                    int i183 = ((i182 | 53) << 1) - (i182 ^ 53);
                                    int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                    Object[] objArr16 = new Object[1];
                                    c(i183, ((jumpTapTimeout | 24) << 1) - (jumpTapTimeout ^ 24), (char) ((iResolveSizeAndState & 12731) + (iResolveSizeAndState | 12731)), objArr16);
                                    if (Class.forName((String) objArr16[0]).equals(objArr15[1])) {
                                        int i184 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
                                        TuitionPaymentFragmentbindingInflater1 = i184 % 128;
                                        int i185 = i184 % 2;
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            int keyRepeatDelay2 = 2823 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                            int i186 = 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                            byte[] bArr4 = $$d;
                                            Object[] objArr17 = new Object[1];
                                            a(bArr4[27], (byte) 52, bArr4[24], objArr17);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, keyRepeatDelay2, i186, 1814927978, false, (String) objArr17[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, method);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char cMyTid = (char) (Process.myTid() >> 22);
                                            int i187 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822;
                                            int scrollDefaultDelay = 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            byte[] bArr5 = $$d;
                                            Object[] objArr18 = new Object[1];
                                            a(bArr5[27], (byte) 52, bArr5[24], objArr18);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyTid, i187, scrollDefaultDelay, 1814927978, false, (String) objArr18[0], null);
                                        }
                                        try {
                                            Object[] objArr19 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int i188 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2824;
                                                int iIndexOf2 = 22 - TextUtils.indexOf("", "", 0, 0);
                                                byte b5 = $$d[24];
                                                byte b6 = b5;
                                                Object[] objArr20 = new Object[1];
                                                a(b5, b6, (byte) (b6 | 52), objArr20);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i188, iIndexOf2, -2137287382, false, (String) objArr20[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr19)).longValue();
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
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    i18 = (i18 & 1) + (i18 | 1);
                    j = 0;
                    i8 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            i = -2001519171;
        } else {
            i = -2001519171;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
            int iIndexOf3 = 2823 - TextUtils.indexOf("", "");
            int i189 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte[] bArr6 = $$d;
            Object[] objArr21 = new Object[1];
            a(bArr6[27], (byte) 52, bArr6[24], objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(absoluteGravity, iIndexOf3, i189, 1814927978, false, (String) objArr21[0], null);
        }
        Object[] objArr22 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c3 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int scrollBarFadeDuration = 2823 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int defaultSize = View.getDefaultSize(0, 0) + 22;
            byte b7 = (byte) ($$e & 31);
            byte b8 = $$d[24];
            Object[] objArr23 = new Object[1];
            a(b7, b8, (byte) (b8 | 52), objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, scrollBarFadeDuration, defaultSize, 1025296417, false, (String) objArr23[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr22);
        Object[] objArr24 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c4 = (char) (37656 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int iIndexOf4 = 2719 - TextUtils.indexOf((CharSequence) "", '0');
            int iRgb = Color.rgb(0, 0, 0) + 16777235;
            byte b9 = (byte) ($$e & 31);
            byte b10 = $$d[24];
            Object[] objArr25 = new Object[1];
            a(b9, b10, (byte) (b10 | 52), objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c4, iIndexOf4, iRgb, -1568796068, false, (String) objArr25[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr24)).longValue();
        long j2 = 95973487;
        long j3 = 433;
        long j4 = -1;
        long j5 = j2 ^ j4;
        long jMyPid = Process.myPid();
        long j6 = (((long) (-432)) * j2) + (((long) 434) * jLongValue) + ((((j5 | (jMyPid ^ j4)) | jLongValue) ^ j4) * j3) + (((long) (-433)) * (j5 | (((jLongValue ^ j4) | jMyPid) ^ j4))) + (j3 * (((j5 | jMyPid) ^ j4) | ((jLongValue | j2) ^ j4))) + ((long) (-1906379332));
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i190 = ((int) (j6 >> 32)) & (((((~(1557238368 | startUptimeMillis)) | (-120011958)) * 56) - 401745950) + (((~((~startUptimeMillis) | (-120011958))) | 1557238368) * 56));
        int iMyTid = Process.myTid();
        int i191 = ~(83766018 | iMyTid);
        int i192 = ~iMyTid;
        int i193 = ((int) j6) & ((-389781251) + ((i191 | (~((-1353460392) | i192))) * (-1808)) + (((~(1425943463 | iMyTid)) | (~(i192 | (-11282947)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iMyTid | 1353460391)) | 1342177445 | (~((-83766019) | i192))) * TypedValues.Custom.TYPE_BOOLEAN));
        int i194 = (i190 & i193) | (i190 ^ i193);
        int i195 = i194 >>> 24;
        int i196 = i194 & ViewCompat.MEASURED_SIZE_MASK;
        if (i195 != 0) {
            int i197 = TuitionPaymentFragmentbindingInflater1;
            int i198 = i197 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i198 % 128;
            i2 = 2;
            int i199 = i198 % 2;
            int i200 = (i197 & 23) + (i197 | 23);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i200 % 128;
            int i201 = i200 % 2;
            z = true;
        } else {
            i2 = 2;
            z = false;
        }
        if (z) {
            int i202 = TuitionPaymentFragmentbindingInflater1;
            int i203 = i202 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i203 % 128;
            int i204 = i203 % i2;
            int i205 = i202 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i205 % 128;
            if (i205 % i2 == 0) {
                int i206 = 5 % 5;
            }
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (!z || i196 >= i2) {
            string = null;
        } else {
            int i207 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i208 = ((i207 | 91) << 1) - (i207 ^ 91);
            TuitionPaymentFragmentbindingInflater1 = i208 % 128;
            if (i208 % i2 != 0) {
                Method method2 = methodArr[i196];
                throw null;
            }
            Method method3 = methodArr[i196];
            if (method3 != null) {
                int i209 = (i207 & 25) + (i207 | 25);
                TuitionPaymentFragmentbindingInflater1 = i209 % 128;
                if (i209 % i2 != 0) {
                    method3.toString();
                    throw null;
                }
                string = method3.toString();
            } else {
                string = null;
            }
        }
        list.add(string);
        int i210 = (i195 ^ 6) + ((i195 & 6) << 1);
        int i211 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i212 = (i211 ^ 19) + ((i211 & 19) << 1);
        int i213 = i212 % 128;
        TuitionPaymentFragmentbindingInflater1 = i213;
        int i214 = i212 % 2;
        int i215 = i210 * i3;
        int i216 = i213 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i216 % 128;
        if (i216 % 2 == 0) {
            int i217 = 68 / 0;
        }
        return i215;
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
    private static java.lang.String $$i(int r6, int r7, int r8) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.scancard.ScannerModel.$$c
            int r7 = 115 - r7
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r6 = r6 * 2
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r8 = r8 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.scancard.ScannerModel.$$i(int, int, int):java.lang.String");
    }
}
