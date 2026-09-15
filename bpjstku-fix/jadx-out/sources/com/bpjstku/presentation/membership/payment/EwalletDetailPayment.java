package com.bpjstku.presentation.membership.payment;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u0013"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/EwalletDetailPayment;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "", "p3", "<init>", "(DDDLjava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "D", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EwalletDetailPayment implements Parcelable {
    public static final Parcelable.Creator<EwalletDetailPayment> CREATOR;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f527a;
    private static int asBinder;
    private static char d;
    private static char g;
    public final double TuitionPaymentFragmentbindingInflater1;
    public final double TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final double TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {22, 102, 43, -6};
    private static final int $$f = 244;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {81, 125, 2, 46, -15, -1, 60, -55, -17, 3, -12, -4, 6, -13, 68, -69, -5, 10, -17, 11, -12, -9, 16, -22, 8, -9, -2, Base64.padSymbol, -69, -5, 0, 5, -14, 14, -15, 60, -63, -1, -15, 67, -68, 0, 5, -3, 0, -27, 3, 11, -1, -21, 0, 6, -14, -8, 72, -36, -32, 5, 29, -32, -27, 35, -21, -1, -21, 0, 6, -14, -8, 53, -37, -20, 8, -16, 10, -14, -8, 82, -82, 0, 8, -1, -9, 5, -14, 69, -3, -72, -8, -1, 0, -8, 6, -2, Base64.padSymbol, -72, -8, 1, 2, -1, -20, 77, -67, -4, -4, 2, -23, 6, -11, 77, -16, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 63};
    private static final int $$e = 67;
    private static final byte[] $$a = {39, 27, 2, 54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 239;
    private static int INotificationSideChannel = 0;
    private static int onTransact = 1;
    private static int asInterface = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.payment.EwalletDetailPayment.$$a
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r6 = r6 * 52
            int r1 = 53 - r6
            int r7 = r7 * 52
            int r7 = 55 - r7
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r6
            r8 = r7
            r3 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L30:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.EwalletDetailPayment.c(byte, short, short, java.lang.Object[]):void");
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
    private static void f(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 107
            int r6 = r6 + 4
            int r7 = r7 * 55
            int r7 = r7 + 53
            int r8 = r8 * 15
            int r8 = 99 - r8
            byte[] r0 = com.bpjstku.presentation.membership.payment.EwalletDetailPayment.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r6]
        L28:
            int r6 = r6 + 1
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-3)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.EwalletDetailPayment.f(short, int, byte, java.lang.Object[]):void");
    }

    public EwalletDetailPayment(double d2, double d3, double d4, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = d2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = d3;
        this.TuitionPaymentFragmentbindingInflater1 = d4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i4 = $10 + 101;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) f527a) ^ 8611973335120459638L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(d);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char capsMode = (char) (TextUtils.getCapsMode("", i3, i3) + 47773);
                        int iAlpha = 468 - Color.alpha(i3);
                        int absoluteGravity = 13 - Gravity.getAbsoluteGravity(i3, i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, iAlpha, absoluteGravity, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i10 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(g)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.red(0) + 47773), 468 - TextUtils.indexOf("", "", 0), TextUtils.lastIndexOf("", '0', 0) + 14, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i10 + 1;
                    i3 = 0;
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 2322 - ((byte) KeyEvent.getModifierMetaStateMask()), 43 - ImageFormat.getBitsPerPixel(0), -1312321721, false, $$g(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i11 = $10 + 109;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:26:0x01f3  */
    public final String TuitionPaymentFragmentbindingInflater1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 37567);
            int iAxisFromString = 624 - MotionEvent.axisFromString("");
            int iIndexOf = 14 - TextUtils.indexOf("", "", 0);
            byte b = (byte) (-$$a[5]);
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iAxisFromString, iIndexOf, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{64214, 3173, 5430, 43535, 14313, 59295, 27251, 15943, 65263, 41045, 4270, 55274, 47954, 11973, 47943, 28705, 30854, 16551, 64565, 5141, 8827, 19300, 56432, 14113}, ExpandableListView.getPackedPositionType(0L) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{38052, 39259, 55175, 47273, 36625, 3499, 60742, 40319, 850, 28679, 779, 4475, 57759, 52590, 6913, 12844, 18241, 8538}, 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 37567);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 625;
            int capsMode = 14 - TextUtils.getCapsMode("", 0, 0);
            byte[] bArr = $$a;
            byte b3 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(b3, (byte) (-bArr[5]), b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, minimumFlingVelocity, capsMode, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mirror = (char) (37615 - AndroidCharacter.getMirror('0'));
                int iRed = 625 - Color.red(0);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 14;
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                c(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, iRed, touchSlop, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i2 = ((int[]) objArr7[2])[0];
            int i3 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int i4 = ~((~Process.myTid()) | 62695897);
            int i5 = (((50897104 | i4) * (-374)) - 733362750) + ((i4 | 11798793) * 374) + 1006423813;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
            objArr = new Object[]{new int[]{i3}, new int[1], new int[]{i2}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{20924, 5782, 36398, 5558, 12567, 32941, 5086, 17745, 26010, 59888, 6664, 3444, 15157, 22316, 34974, 9858, 41545, 32092, 37691, 62484, 58852, 57521, 64902, 54234, 39284, 1664, 65461, 32441}, (ViewConfiguration.getLongPressTimeout() >> 16) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{61386, 36569, 51727, 47670, 55925, 64136, 39516, 52346, 64370, 23266, 3421, 65062, 36710, 31523, 40701, 44853, 56312, 57491, 17776, 50382}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i8 = INotificationSideChannel;
                int i9 = i8 + 53;
                onTransact = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 71 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        int i11 = i8 + 81;
                        onTransact = i11 % 128;
                        int i12 = i11 % 2;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    int i13 = i8 + 81;
                    onTransact = i13 % 128;
                    int i14 = i13 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{25557, 32118, 9957, 32403, 12461, 24506, 63550, 44507, 45133, 22657, 47419, 40821, 21404, 26828, 48487, 9492, 63872, 38992}, 16 - TextUtils.indexOf("", ""), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{54583, 28578, 4099, 46656, 55511, 23040, 32331, 19599, 5013, 13524, 56892, 34996, 30028, 22190, 13114, 38740, 12586, 23337}, ((Process.getThreadPriority(0) + 20) >> 6) + 16, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            e(new char[]{50314, 53194, 17336, 27762, 43992, 41106, 24019, 14717, 42188, 43512, 16968, 12656, 41056, 41604, 29108, 55614, 57726, 38202, 10018, 53166, 63865, 41825, 661, 35038, 46616, 47722, 517, 10400, 46478, 63343, 32489, 14204, 49746, 28948, 25207, 6681, 60624, 4165, 31754, 44189, 34768, 32906, 42407, 32643, 33751, 3194, 4544, 39137, 4526, 11726, 50345, 37257, 22392, 16445, 19682, 55663, 16032, 1075, 7326, 48329, 13631, 31571, 29834, 43108, 29650, 46224}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 64, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            e(new char[]{60887, 51816, 29881, 19149, 6852, 23056, 38532, 29981, 2616, 17715, 31051, 14130, 30668, 41259, 50519, 38161, 40313, 13182, 10984, 43941, 56505, 31867, 41172, 35887, 2078, 31611, 21160, 54527, 34004, 15906, 8592, 4838, 28052, 22146, 19178, 14927, 47597, 25204, 13502, 21955, 14192, 47905, 55348, 59043, 39665, 27724, 61326, 12803, 28430, 44749, 36057, 63513, 55510, 491, 54610, 16495, 55588, 9340, 17076, 63106, 13729, 26744, 62910, 39371, 56936, 32948}, 65 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 1006423813};
                byte[] bArr2 = $$d;
                byte b6 = bArr2[30];
                Object[] objArr15 = new Object[1];
                f(b6, bArr2[97], b6, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b7 = bArr2[97];
                Object[] objArr16 = new Object[1];
                f(b7, bArr2[30], b7, objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i15 = ((int[]) objArr[0])[0];
                int i16 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    int i17 = onTransact + 43;
                    INotificationSideChannel = i17 % 128;
                    int i18 = i17 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maximumFlingVelocity = (char) (37567 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int scrollBarFadeDuration = 625 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iIndexOf2 = TextUtils.indexOf("", "") + 14;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr17 = new Object[1];
                        c(b8, b9, b9, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity, scrollBarFadeDuration, iIndexOf2, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        e(new char[]{64214, 3173, 5430, 43535, 14313, 59295, 27251, 15943, 65263, 41045, 4270, 55274, 47954, 11973, 47943, 28705, 30854, 16551, 64565, 5141, 8827, 19300, 56432, 14113}, 22 - View.MeasureSpec.getSize(0), objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        e(new char[]{38052, 39259, 55175, 47273, 36625, 3499, 60742, 40319, 850, 28679, 779, 4475, 57759, 52590, 6913, 12844, 18241, 8538}, 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cMyPid = (char) (37567 - (Process.myPid() >> 22));
                            int iGreen = Color.green(0) + 625;
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 14;
                            byte[] bArr3 = $$a;
                            byte b10 = bArr3[7];
                            Object[] objArr20 = new Object[1];
                            c(b10, (byte) (-bArr3[5]), b10, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, iGreen, iMakeMeasureSpec, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char scrollBarFadeDuration2 = (char) (37567 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            int iIndexOf3 = 624 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14;
                            byte b11 = (byte) (-$$a[5]);
                            byte b12 = b11;
                            Object[] objArr21 = new Object[1];
                            c(b11, b12, b12, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration2, iIndexOf3, doubleTapTimeout2, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 == null) {
                throw null;
            }
            for (String str2 : strArr2) {
                arrayList.add(str2);
            }
            throw null;
        }
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[2])[0];
        int i21 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr = {i20};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i22 = ~iUptimeMillis;
        int i23 = i19 + 779974472 + ((~(345251742 | i22)) * (-560)) + ((~(iUptimeMillis | (-1208737889))) * (-560)) + (((~(1478486378 | i22)) | 75503252) * 560);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr[1])[0] = i25 ^ (i25 << 5);
        Object[] objArr22 = {new int[]{i21}, new int[1], iArr, strArr3};
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    static {
        asBinder = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        CREATOR = new TuitionPaymentFragmentbindingInflater1();
        int i = asInterface + 19;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 107;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 41;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 69;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (this == p0) {
            int i5 = i2 + 29;
            onTransact = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(p0 instanceof EwalletDetailPayment)) {
            return false;
        }
        EwalletDetailPayment ewalletDetailPayment = (EwalletDetailPayment) p0;
        if (Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ewalletDetailPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2) != 0) {
            int i6 = onTransact + 59;
            INotificationSideChannel = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ewalletDetailPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != 0) {
            int i8 = INotificationSideChannel + 95;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Double.compare(this.TuitionPaymentFragmentbindingInflater1, ewalletDetailPayment.TuitionPaymentFragmentbindingInflater1) != 0) {
            int i10 = onTransact + 49;
            INotificationSideChannel = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ewalletDetailPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            return true;
        }
        int i12 = onTransact + 31;
        INotificationSideChannel = i12 % 128;
        return i12 % 2 != 0;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) * 31) + Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) * 31) + Double.hashCode(this.TuitionPaymentFragmentbindingInflater1)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        int i4 = onTransact + 115;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        double d2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        double d3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        double d4 = this.TuitionPaymentFragmentbindingInflater1;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder("EwalletDetailPayment(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(d2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(d3);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(d4);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str);
        sb.append(")");
        String string = sb.toString();
        int i2 = onTransact + 39;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeDouble(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i4 = INotificationSideChannel + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 64100;
        g = (char) 29626;
        f527a = (char) 11162;
        d = (char) 57087;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 108
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r0 = com.bpjstku.presentation.membership.payment.EwalletDetailPayment.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            int r3 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.EwalletDetailPayment.$$g(int, short, short):java.lang.String");
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<EwalletDetailPayment> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EwalletDetailPayment createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EwalletDetailPayment(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EwalletDetailPayment[] newArray(int i) {
            return new EwalletDetailPayment[i];
        }
    }
}
