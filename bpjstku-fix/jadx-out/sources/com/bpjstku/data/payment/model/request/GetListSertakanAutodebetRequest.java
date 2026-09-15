package com.bpjstku.data.payment.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/payment/model/request/GetListSertakanAutodebetRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/bpjstku/data/payment/model/request/GetListSertakanAutodebetRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetListSertakanAutodebetRequest extends BaseRequest {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] b;

    @SerializedName("email")
    private final String email;
    private static final byte[] $$c = {ByteCompanionObject.MAX_VALUE, 43, -39, -37};
    private static final int $$f = 4;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {109, 84, -87, -114, -22, -8, 53, -67, -18, -10, -2, -15, -3, 45, -66, -13, -19, 3, -7, -9, -28, 4, 45, -63, -25, 7, -28, 1, -14, -23, -5, 1, -4, -26, 59, -34, -45, -19, 3, -7, -9, -28, 4, 24, -57, 7, -28, 1, -14, -23, -5, 1, -4, -26, 30, -51, -14, 28, -29, -12, -12, -20, -11, -8, 7, -27, 68, -41, -54, -8, -13, 5, -23, -5, -16, -9};
    private static final int $$e = 41;
    private static final byte[] $$a = {84, 10, 24, -102, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 61;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.data.payment.model.request.GetListSertakanAutodebetRequest.$$a
            int r8 = r8 * 52
            int r8 = 55 - r8
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r6 = r6 * 52
            int r6 = 53 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.GetListSertakanAutodebetRequest.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 72
            int r7 = 75 - r7
            int r6 = r6 * 72
            int r6 = r6 + 1
            byte[] r0 = com.bpjstku.data.payment.model.request.GetListSertakanAutodebetRequest.$$d
            int r8 = r8 + 98
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-10)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.GetListSertakanAutodebetRequest.d(short, int, int, java.lang.Object[]):void");
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.email;
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return str;
    }

    public GetListSertakanAutodebetRequest(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.email = str;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x025d  */
    /* JADX WARN: Code duplicated, block: B:61:0x025e  */
    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        Throwable cause;
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = b;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i2] = Integer.valueOf(cArr[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1270;
                        int iArgb = Color.argb(i2, i2, i2, i2) + 18;
                        byte b2 = (byte) ($$f - 4);
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, packedPositionGroup, iArgb, 407021364, false, $$g(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                    Throwable cause2 = th.getCause();
                    if (cause2 == null) {
                        throw th;
                    }
                    throw cause2;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i8 = $10 + 75;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i4];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i4) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i10 = $10 + 31;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = setvideostabilizationmode.b;
                        Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                            int minimumFlingVelocity = 3225 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 13;
                            byte b4 = (byte) ($$f - 4);
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, minimumFlingVelocity, offsetBefore, 2133916302, false, $$g(b4, b5, (byte) (b5 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        throw null;
                    }
                    int i12 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int capsMode = 3225 - TextUtils.getCapsMode("", 0, 0);
                            int iIndexOf = 13 - TextUtils.indexOf("", "", 0);
                            byte b6 = (byte) ($$f - 4);
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, capsMode, iIndexOf, 2133916302, false, $$g(b6, b7, (byte) (b7 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                        int i13 = $10 + 67;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                    } catch (Throwable th2) {
                        cause = th2.getCause();
                        if (cause != null) {
                            throw th2;
                        }
                        throw cause;
                    }
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
                int i15 = setvideostabilizationmode.b;
                Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int jumpTapTimeout = 1755 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iMyTid = (Process.myTid() >> 22) + 23;
                    int i16 = $$f;
                    byte b8 = (byte) (i16 - 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, jumpTapTimeout, iMyTid, 387247676, false, $$g(b8, b8, (byte) i16), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                c = cArr4[setvideostabilizationmode.b];
                try {
                    Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 41242);
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1705;
                        int i17 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21;
                        byte b9 = (byte) ($$f - 4);
                        byte b10 = b9;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(gidForName, threadPriority, i17, -1434471773, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i18 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i18, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i18);
        }
        if (z) {
            int i19 = $10 + 81;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            char[] cArr6 = new char[i4];
            int i21 = 0;
            while (true) {
                setvideostabilizationmode.b = i21;
                if (setvideostabilizationmode.b >= i4) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i4 - setvideostabilizationmode.b) - 1];
                i21 = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i22 = $11 + 101;
            $10 = i22 % 128;
            if (i22 % 2 != 0) {
                setvideostabilizationmode.b = 1;
            } else {
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i4) {
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                setvideostabilizationmode.b++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0213  */
    public final String toString() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        String str = this.email;
        StringBuilder sb = new StringBuilder("GetListSertakanAutodebetRequest(email=");
        sb.append(str);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char longPressTimeout = (char) (37567 - (ViewConfiguration.getLongPressTimeout() >> 16));
            int iRgb = Color.rgb(0, 0, 0) + 16777841;
            int iRgb2 = Color.rgb(0, 0, 0) + 16777230;
            byte b2 = (byte) (-$$a[5]);
            byte b3 = b2;
            Object[] objArr3 = new Object[1];
            a(b2, b3, b3, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iRgb, iRgb2, -477065106, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new int[]{0, 22, 0, 7}, false, new byte[]{1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new int[]{22, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37568);
            int iAxisFromString = MotionEvent.axisFromString("") + 626;
            int iRgb3 = (-16777202) - Color.rgb(0, 0, 0);
            byte[] bArr = $$a;
            byte b4 = bArr[7];
            Object[] objArr6 = new Object[1];
            a(b4, b4, (byte) (-bArr[5]), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iAxisFromString, iRgb3, -976899241, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37566);
                int i4 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 624;
                int offsetAfter = 14 - TextUtils.getOffsetAfter("", 0);
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr7 = new Object[1];
                a(b5, b6, b6, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i4, offsetAfter, -973632554, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr8[2])[0];
            int i6 = ((int[]) objArr8[0])[0];
            String[] strArr = (String[]) objArr8[3];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ((~((-310415877) | iIdentityHashCode)) * 521) + 750541540 + (((~((~iIdentityHashCode) | (-310415877))) | 1076585472) * 521) + 2123863852;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[]{i6}, new int[1], new int[]{i5}, strArr};
        } else {
            Object[] objArr9 = new Object[1];
            c(new int[]{37, 26, 127, 22}, false, new byte[]{0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new int[]{63, 18, 0, 11}, true, new byte[]{0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = TuitionPaymentFragmentbindingInflater1 + 71;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                    int i11 = i10 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr11 = new Object[1];
            c(new int[]{81, 16, 183, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(new int[]{97, 16, 13, 7}, true, new byte[]{1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1}, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr13 = new Object[1];
            c(new int[]{113, 64, 55, 0}, true, new byte[]{1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1}, objArr13);
            String str2 = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            c(new int[]{177, 64, 14, 20}, false, new byte[]{1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0}, objArr14);
            try {
                Object[] objArr15 = {applicationContext, new String[]{str2, (String) objArr14[0]}, Integer.valueOf(iIntValue), 17, 2123863852};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[27];
                byte b8 = b7;
                Object[] objArr16 = new Object[1];
                d(b7, b8, b8, objArr16);
                Class<?> cls4 = Class.forName((String) objArr16[0]);
                byte b9 = (byte) (bArr2[27] - 1);
                byte b10 = b9;
                Object[] objArr17 = new Object[1];
                d(b9, b10, b10, objArr17);
                objArr = (Object[]) cls4.getMethod((String) objArr17[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr15);
                int i12 = ((int[]) objArr[0])[0];
                int i13 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    int i14 = TuitionPaymentFragmentbindingInflater1 + 35;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                    int i15 = i14 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cArgb = (char) (Color.argb(0, 0, 0, 0) + 37567);
                        int iBlue = 625 - Color.blue(0);
                        int iAxisFromString2 = 13 - MotionEvent.axisFromString("");
                        byte b11 = $$a[7];
                        byte b12 = b11;
                        Object[] objArr18 = new Object[1];
                        a(b11, b12, b12, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, iBlue, iAxisFromString2, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr19 = new Object[1];
                        c(new int[]{0, 22, 0, 7}, false, new byte[]{1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1}, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        c(new int[]{22, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 37567);
                            int mode = 625 - View.MeasureSpec.getMode(0);
                            int packedPositionGroup = 14 - ExpandableListView.getPackedPositionGroup(0L);
                            byte[] bArr3 = $$a;
                            byte b13 = bArr3[7];
                            Object[] objArr21 = new Object[1];
                            a(b13, b13, (byte) (-bArr3[5]), objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority, mode, packedPositionGroup, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char scrollBarFadeDuration = (char) (37567 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 625;
                            int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14;
                            byte b14 = (byte) (-$$a[5]);
                            byte b15 = b14;
                            Object[] objArr22 = new Object[1];
                            a(b14, b15, b15, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, minimumFlingVelocity, scrollBarFadeDuration2, -477065106, false, (String) objArr22[0], null);
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
        int i16 = ((int[]) objArr[0])[0];
        int i17 = ((int[]) objArr[2])[0];
        if (i17 == i16) {
            int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
            TuitionPaymentFragmentbindingInflater1 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = ((int[]) objArr[1])[0];
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[3];
            int iMyTid = Process.myTid();
            int i23 = ~iMyTid;
            int i24 = i20 + (-958602604) + ((iMyTid | 139067552) * 988) + (((~(427720881 | i23)) | 1107363910) * (-1976)) + (((~(iMyTid | (-1396017240))) | 139067552 | (~(1396017239 | i23))) * 988);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr2[1])[0] = i26 ^ (i26 << 5);
            objArr2 = new Object[]{new int[]{i22}, new int[1], new int[]{i21}, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i27 = 0;
                while (i27 < strArr3.length) {
                    int i28 = TuitionPaymentFragmentbindingInflater1 + 67;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                    if (i28 % 2 == 0) {
                        arrayList.add(strArr3[i27]);
                        i27 += 111;
                    } else {
                        arrayList.add(strArr3[i27]);
                        i27++;
                    }
                }
            }
            int[] iArr = new int[i17];
            int i29 = i17 - 1;
            iArr[i29] = 1;
            Toast.makeText((Context) null, iArr[((i17 * i29) % 2) - 1], 1).show();
            int i30 = ((int[]) objArr[1])[0];
            int i31 = ((int[]) objArr[2])[0];
            int i32 = ((int[]) objArr[0])[0];
            String[] strArr4 = (String[]) objArr[3];
            int i33 = ~(new Random().nextInt(1088157994) | 1642461690);
            int i34 = i30 + (-654640528) + (((-181276431) | i33) * (-220)) + ((i33 | (-1810890751)) * 220) + 216276184;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr2[1])[0] = i36 ^ (i36 << 5);
            objArr2 = new Object[]{new int[]{i32}, new int[1], new int[]{i31}, strArr4};
        }
        int i37 = ((int[]) objArr2[1])[0];
        int i38 = ((i37 * i37) - (~(-(781852876 * i37)))) - 1;
        int i39 = -(i37 * 248431854);
        int i40 = ((i38 ^ i39) + ((i39 & i38) << 1)) - 2041474359;
        int i41 = i40 >> 20;
        int i42 = ((i41 ^ (-8191)) + ((i41 & (-8191)) << 1)) / 4096;
        int i43 = ((i42 | 1) << 1) - (i42 ^ 1);
        int i44 = ((i40 | i43) << 1) - (i43 ^ i40);
        int i45 = i40 >> 29;
        int i46 = (-(i44 ^ (((((i45 | (-15)) << 1) - (i45 ^ (-15))) / 8) + 1))) + 4;
        int i47 = i46 >> 20;
        int i48 = ((i47 & (-8191)) + (i47 | (-8191))) / 4096;
        int i49 = (i48 ^ 1) + ((i48 & 1) << 1);
        sb.append("10/30/10/)".substring(68616 / ((i46 & (-((i49 ^ 1) + ((i49 & 1) << 1)))) * 1906)));
        return sb.toString();
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ GetListSertakanAutodebetRequest copy$default(GetListSertakanAutodebetRequest getListSertakanAutodebetRequest, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 69;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = getListSertakanAutodebetRequest.email;
            int i6 = i4 + 89;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
        }
        return getListSertakanAutodebetRequest.copy(str);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 == 0) {
            str = this.email;
            int i4 = 63 / 0;
        } else {
            str = this.email;
        }
        int i5 = i3 + 41;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return str;
    }

    public final GetListSertakanAutodebetRequest copy(String p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        GetListSertakanAutodebetRequest getListSertakanAutodebetRequest = new GetListSertakanAutodebetRequest(p0);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return getListSertakanAutodebetRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof GetListSertakanAutodebetRequest)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.email, ((GetListSertakanAutodebetRequest) p0).email)) {
            return true;
        }
        int i6 = TuitionPaymentFragmentbindingInflater1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        return i6 % 2 == 0;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.email.hashCode();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        b = new char[]{59705, 59746, 59731, 59740, 59750, 59746, 59756, 59757, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59705, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746, 59772, 59872, 59886, 59843, 59853, 59884, 59876, 59845, 59837, 59866, 59873, 59878, 59877, 59877, 59878, 59902, 59886, 59862, 59879, 59873, 59881, 59882, 59882, 59885, 59875, 59873, 59709, 59749, 59771, 59731, 59729, 59770, 59746, 59744, 59769, 59768, 59751, 59747, 59749, 59751, 59749, 59745, 59753, 59757, 59803, 59415, 59433, 59433, 59893, 59407, 59414, 59413, 59434, 59402, 59900, 59414, 59430, 59425, 59432, 59435, 59723, 59760, 59760, 59765, 59773, 59770, 59768, 59775, 59770, 59773, 59757, 59753, 59761, 59772, 59754, 59750, 59719, 59786, 59784, 59792, 59794, 59785, 59750, 59748, 59791, 59786, 59751, 59750, 59786, 59784, 59744, 59764, 59785, 59744, 59784, 59799, 59789, 59750, 59744, 59791, 59793, 59784, 59744, 59747, 59751, 59751, 59787, 59791, 59771, 59750, 59784, 59785, 59746, 59787, 59784, 59790, 59793, 59784, 59749, 59750, 59791, 59791, 59745, 59744, 59750, 59785, 59793, 59799, 59791, 59791, 59798, 59789, 59749, 59790, 59792, 59795, 59795, 59793, 59799, 59785, 59689, 59720, 59722, 59722, 59727, 59735, 59735, 59724, 59728, 59730, 59722, 59723, 59731, 59769, 59729, 59722, 59731, 59741, 59722, 59735, 59769, 59771, 59771, 59728, 59722, 59723, 59730, 59729, 59735, 59768, 59730, 59740, 59770, 59730, 59729, 59728, 59722, 59723, 59721, 59721, 59721, 59727, 59735, 59735, 59729, 59730, 59730, 59728, 59727, 59727, 59724, 59725, 59725, 59728, 59730, 59722, 59723, 59729, 59770, 59740, 59723, 59730, 59768, 59735};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, int r6, byte r7) {
        /*
            int r5 = r5 * 4
            int r5 = 3 - r5
            byte[] r0 = com.bpjstku.data.payment.model.request.GetListSertakanAutodebetRequest.$$c
            int r6 = r6 * 2
            int r1 = r6 + 1
            int r7 = 105 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r5]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.GetListSertakanAutodebetRequest.$$g(byte, int, byte):java.lang.String");
    }
}
