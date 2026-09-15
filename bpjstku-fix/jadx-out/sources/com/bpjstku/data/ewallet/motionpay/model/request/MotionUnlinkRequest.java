package com.bpjstku.data.ewallet.motionpay.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionUnlinkRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionUnlinkRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nik", "Ljava/lang/String;", "getNik"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MotionUnlinkRequest extends BaseRequest {
    public static final int $stable = 0;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f386a;
    private static char b;

    @SerializedName("nik")
    private final String nik;
    private static final byte[] $$c = {93, -122, -23, -24};
    private static final int $$f = 132;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {23, -73, 107, 5, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 23, -17, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 21, -4, -2, 13, -2, -2, 10, 33, -34, 11, -3, 14, -16, 18, -10, 68};
    private static final int $$e = 230;
    private static final byte[] $$a = {25, -93, -120, -48, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 175;
    private static int asBinder = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.data.ewallet.motionpay.model.request.MotionUnlinkRequest.$$a
            int r9 = r9 * 14
            int r9 = 98 - r9
            int r7 = 53 - r7
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r8
            int r8 = r3 + (-10)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.ewallet.motionpay.model.request.MotionUnlinkRequest.c(short, byte, short, java.lang.Object[]):void");
    }

    private static void e(short s, int i, int i2, Object[] objArr) {
        int i3 = 99 - (s * 15);
        int i4 = i2 + 4;
        int i5 = i * 11;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[49 - i5];
        int i6 = 48 - i5;
        int i7 = -1;
        if (bArr == null) {
            i3 = i3 + (-i6) + 3;
        }
        while (true) {
            i7++;
            i4++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = i3 + (-bArr[i4]) + 3;
        }
    }

    public final String getNik() {
        int i = 2 % 2;
        int i2 = g + 65;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.nik;
        int i5 = i3 + 11;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MotionUnlinkRequest(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nik = str;
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        CharSequence charSequence;
        int i2 = 2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i4 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i5 = $10 + 9;
            $11 = i5 % 128;
            int i6 = 58224;
            if (i5 % i2 == 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >> 1];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            int i7 = 0;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    objArr2[i2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c3 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)) + 47773);
                        charSequence = "";
                        int capsMode = TextUtils.getCapsMode(charSequence, i4, i4) + 468;
                        int iLastIndexOf = 12 - TextUtils.lastIndexOf(charSequence, '0', i4);
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, capsMode, iLastIndexOf, -2007001706, false, "o", clsArr);
                    } else {
                        charSequence = "";
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    onCaptureSessionEnd oncapturesessionend2 = oncapturesessionend;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - TextUtils.indexOf(charSequence, '0', 0, 0)), 468 - Color.red(0), Color.alpha(0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    oncapturesessionend = oncapturesessionend2;
                    i2 = 2;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            onCaptureSessionEnd oncapturesessionend3 = oncapturesessionend;
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend3, oncapturesessionend3};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2322 - ImageFormat.getBitsPerPixel(0), 44 - TextUtils.getCapsMode("", 0, 0), -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i10 = $10 + 45;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            oncapturesessionend = oncapturesessionend3;
            i2 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0211  */
    public final MotionUnlinkRequest copy(String p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (31534 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int iAxisFromString = MotionEvent.axisFromString("") + 922;
            int iIndexOf = 28 - TextUtils.indexOf("", "", 0, 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 52, bArr[7], bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iAxisFromString, iIndexOf, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{54795, 55321, 21800, 31630, 22930, 62473, 31902, 19185, 34766, 15194, 21404, 7268, 22931, 16851, 44513, 56161, 19259, 61735, 25520, 44316, 42039, 9117, 21480, 20863}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{26200, 19375, 25337, 12307, 48626, 38815, 47573, 32255, 21848, 40161, 26948, 12413, 15116, 53610, 10465, 60031, 58250, 4975}, 14 - ImageFormat.getBitsPerPixel(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 31533);
            int iAlpha = Color.alpha(0) + 921;
            int iGreen = Color.green(0) + 28;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr2[80], bArr2[7], bArr2[37], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iAlpha, iGreen, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 31533);
                int iResolveSizeAndState = 921 - View.resolveSizeAndState(0, 0, 0);
                int deadChar = 28 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr3[33], (byte) 51, bArr3[37], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, iResolveSizeAndState, deadChar, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iMyPid = Process.myPid();
            int i3 = ~((-977413181) | (~iMyPid));
            int i4 = (((((87820867 | i3) | (~(977413180 | iMyPid))) * (-338)) + 1392761617) + (((~(iMyPid | 1065234047)) | i3) * 338)) - 835788056;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{13509, 27723, 65215, 63802, 8516, 54764, 45854, 11743, 46399, 23434, 60803, 31643, 42466, 50873, 46447, 43381, 20752, 50729, 37148, 1764, 61736, 31130, 16078, 17796, 31913, 53201, 17816, 10552}, (KeyEvent.getMaxKeyCode() >> 16) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{16090, 40036, 32064, 1169, 45541, 22467, 38157, 18085, 64675, 407, 65267, 17002, 14213, 60456, 9181, 64262, 58992, 63600, 17285, 17313}, 19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i7 = g;
                int i8 = i7 + 69;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = i7 + 29;
                    asBinder = i10 % 128;
                    if (i10 % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            int length = p0 != null ? p0.length() : 0;
            int i11 = asBinder + 37;
            g = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(length), 0, -835788056};
                byte[] bArr4 = $$d;
                byte b2 = bArr4[35];
                byte b3 = (byte) (b2 - 1);
                Object[] objArr11 = new Object[1];
                e(b3, b3, (byte) (-b2), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b4 = bArr4[35];
                byte b5 = b4;
                Object[] objArr12 = new Object[1];
                e(b4, b5, (byte) (b5 | 46), objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                    int i13 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int absoluteGravity = 28 - Gravity.getAbsoluteGravity(0, 0);
                    byte[] bArr5 = $$a;
                    Object[] objArr14 = new Object[1];
                    c(bArr5[33], (byte) 51, bArr5[37], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, i13, absoluteGravity, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    d(new char[]{54795, 55321, 21800, 31630, 22930, 62473, 31902, 19185, 34766, 15194, 21404, 7268, 22931, 16851, 44513, 56161, 19259, 61735, 25520, 44316, 42039, 9117, 21480, 20863}, 21 - ImageFormat.getBitsPerPixel(0), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    d(new char[]{26200, 19375, 25337, 12307, 48626, 38815, 47573, 32255, 21848, 40161, 26948, 12413, 15116, 53610, 10465, 60031, 58250, 4975}, 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cArgb = (char) (Color.argb(0, 0, 0, 0) + 31533);
                        int mirror = AndroidCharacter.getMirror('0') + 873;
                        int size = 28 - View.MeasureSpec.getSize(0);
                        byte[] bArr6 = $$a;
                        Object[] objArr17 = new Object[1];
                        c(bArr6[80], bArr6[7], bArr6[37], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, mirror, size, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maxKeyCode = (char) (31533 - (KeyEvent.getMaxKeyCode() >> 16));
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 921;
                        int i14 = 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte[] bArr7 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((byte) 52, bArr7[7], bArr7[80], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode, packedPositionType, i14, -1048449946, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i15 = asBinder + 107;
                    g = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 5 % 5;
                    }
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            while (i2 < strArr.length) {
                int i17 = asBinder + 45;
                g = i17 % 128;
                if (i17 % 2 == 0) {
                    arrayList.add(strArr[i2]);
                    i2 += 18;
                } else {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i18 = ((int[]) objArr[0])[0];
        Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i19 = i18 + 743860776 + ((~((~iIdentityHashCode) | (-144264548))) * 433) + (((~((-1629782173) | iIdentityHashCode)) | (-144297472)) * (-433)) + (((~(iIdentityHashCode | (-144297472))) | (-1774046720)) * 433);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        Object obj = objArr19[0];
        ((int[]) obj)[0] = i21 ^ (i21 << 5);
        int i22 = ((int[]) obj)[0];
        int i23 = i22 * i22;
        int i24 = -(1481478624 * i22);
        int i25 = (((i23 & i24) + (i23 | i24)) - (~(-(i22 * (-997834592))))) - 1;
        int i26 = ((i25 | 721784832) << 1) - (721784832 ^ i25);
        int i27 = ((i26 >> 20) - 8191) / 4096;
        int i28 = (i27 & 1) + (i27 | 1);
        int i29 = (i26 & i28) + (i28 | i26);
        int i30 = i26 >> 29;
        int i31 = (((i30 | (-15)) << 1) - (i30 ^ (-15))) / 8;
        int i32 = (-(i29 ^ ((i31 & 1) + (i31 | 1)))) + 2;
        int i33 = i32 >> 24;
        int i34 = (((i33 | (-511)) << 1) - (i33 ^ (-511))) / 256;
        int i35 = ((i34 | 1) << 1) - (i34 ^ 1);
        Intrinsics.checkNotNullParameter(p0, "28;28;nik".substring(5556 / ((i32 & (-((i35 ^ 1) + ((i35 & 1) << 1)))) * 463)));
        return new MotionUnlinkRequest(p0);
    }

    static {
        f386a = 1;
        TuitionPaymentFragmentbindingInflater1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        f386a = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ MotionUnlinkRequest copy$default(MotionUnlinkRequest motionUnlinkRequest, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = g + 43;
            int i4 = i3 % 128;
            asBinder = i4;
            if (i3 % 2 != 0) {
                String str2 = motionUnlinkRequest.nik;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = motionUnlinkRequest.nik;
            int i5 = i4 + 85;
            g = i5 % 128;
            int i6 = i5 % 2;
        }
        return motionUnlinkRequest.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 87;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.nik;
        int i4 = i2 + 21;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MotionUnlinkRequest)) {
            int i4 = i3 + 69;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.nik, ((MotionUnlinkRequest) p0).nik)) {
            return true;
        }
        int i6 = g + 75;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = g + 125;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            this.nik.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.nik.hashCode();
        int i3 = asBinder + 53;
        g = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.nik;
        StringBuilder sb = new StringBuilder("MotionUnlinkRequest(nik=");
        sb.append(str);
        sb.append(")");
        String string = sb.toString();
        int i2 = g + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        b = (char) 24477;
        TuitionPaymentFragmentbindingInflater1 = (char) 8461;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 30209;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 56963;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, short r8) {
        /*
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r0 = com.bpjstku.data.ewallet.motionpay.model.request.MotionUnlinkRequest.$$c
            int r7 = r7 * 2
            int r7 = r7 + 108
            int r6 = r6 * 3
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.ewallet.motionpay.model.request.MotionUnlinkRequest.$$g(int, short, short):java.lang.String");
    }
}
