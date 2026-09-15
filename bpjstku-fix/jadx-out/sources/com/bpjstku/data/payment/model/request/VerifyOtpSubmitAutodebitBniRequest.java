package com.bpjstku.data.payment.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u000bR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u000bR\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/payment/model/request/VerifyOtpSubmitAutodebitBniRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/request/VerifyOtpSubmitAutodebitBniRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "otp", "Ljava/lang/String;", "getOtp", "referenceNo", "getReferenceNo", "chargeToken", "getChargeToken", "nik", "getNik", "email", "getEmail"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VerifyOtpSubmitAutodebitBniRequest extends BaseRequest {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @SerializedName("chargeToken")
    private final String chargeToken;

    @SerializedName("email")
    private final String email;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("otp")
    private final String otp;

    @SerializedName("referenceNo")
    private final String referenceNo;
    private static final byte[] $$c = {1, 115, -83, 116};
    private static final int $$f = 120;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {68, 104, -93, -37, 57, -9, 6, 5, 19, -7, 5, -29, 58, -11, 11, 12, -22, 39, 4, -7, 2, 18, 39, -6, 17, -5, 12, 5, -24, 23, 30, -6, -2, 15, 12, -40, 50, -11, 12, 12, -2, 15, 12, -12, 13, 11, -4, 11, 11, -1, -24, 43, -2, 12, -5, 25, -9, 19, -59};
    private static final int $$e = 189;
    private static final byte[] $$a = {68, 104, -93, -37, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 77;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f396a = 0;
    private static int g = 1;
    private static int b = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.data.payment.model.request.VerifyOtpSubmitAutodebitBniRequest.$$a
            int r8 = r8 * 52
            int r8 = 107 - r8
            int r7 = r7 * 15
            int r7 = r7 + 38
            int r9 = r9 * 4
            int r9 = r9 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2f
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r7) goto L29
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
            int r8 = r3 + (-11)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.VerifyOtpSubmitAutodebitBniRequest.c(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 18
            int r7 = r7 + 4
            int r6 = r6 * 19
            int r0 = 38 - r6
            int r8 = r8 * 18
            int r8 = 84 - r8
            byte[] r1 = com.bpjstku.data.payment.model.request.VerifyOtpSubmitAutodebitBniRequest.$$d
            byte[] r0 = new byte[r0]
            int r6 = 37 - r6
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r8
            r3 = r2
            r8 = r7
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L31:
            int r7 = r7 + 1
            int r8 = r8 + r4
            int r8 = r8 + (-6)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.VerifyOtpSubmitAutodebitBniRequest.e(short, byte, int, java.lang.Object[]):void");
    }

    public final String getOtp() {
        int i = 2 % 2;
        int i2 = g + 69;
        int i3 = i2 % 128;
        f396a = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.otp;
        int i4 = i3 + 39;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getReferenceNo() {
        int i = 2 % 2;
        int i2 = f396a;
        int i3 = i2 + 59;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.referenceNo;
        int i5 = i2 + 65;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getChargeToken() {
        int i = 2 % 2;
        int i2 = f396a + 19;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.chargeToken;
        }
        throw null;
    }

    public final String getNik() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 17;
        f396a = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.nik;
        int i4 = i2 + 45;
        f396a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = f396a;
        int i3 = i2 + 103;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.email;
        int i5 = i2 + 57;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public VerifyOtpSubmitAutodebitBniRequest(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.otp = str;
        this.referenceNo = str2;
        this.chargeToken = str3;
        this.nik = str4;
        this.email = str5;
    }

    private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i5 = $10 + 41;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i7 = $11 + 69;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 8328);
                    int maxKeyCode = 1235 - (KeyEvent.getMaxKeyCode() >> 16);
                    int threadPriority = 35 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b2 = (byte) (-$$c[0]);
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, maxKeyCode, threadPriority, -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cAlpha = (char) Color.alpha(0);
                        int jumpTapTimeout = 2764 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iCombineMeasuredStates = 14 - View.combineMeasuredStates(0, 0);
                        byte b4 = (byte) (-$$c[0]);
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, jumpTapTimeout, iCombineMeasuredStates, 1504416861, false, $$g(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 43326), 253 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 22 - View.resolveSize(0, 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char maximumDrawingCacheSize = (char) (65200 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            int keyRepeatTimeout = 2891 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int packedPositionGroup2 = 17 - ExpandableListView.getPackedPositionGroup(0L);
                            byte b6 = $$c[0];
                            byte b7 = (byte) (-b6);
                            String str$$g = $$g(b7, (byte) (b7 + 1), b6);
                            i2 = 2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize, keyRepeatTimeout, packedPositionGroup2, 2012627446, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                        } else {
                            i2 = 2;
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = sessionProcessor.b;
                        cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                        i3 = i2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public final String component4() throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int iRgb = (-16774949) - Color.rgb(0, 0, 0);
            int iMyTid = (Process.myTid() >> 22) + 33;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[132], bArr[37], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, iRgb, iMyTid, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{4694, 32371, 43494, 61048}, new char[]{61931, 10603, 38599, 1994}, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.argb(0, 0, 0, 0), new char[]{28912, 37779, 49948, 26939, 43685, 44285, 57367, 42072, 18665, 7153, 13713, 64415, 26178, 59365, 52049, 753, 65012, 48172, 12048, 40931, 51715, 46643}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{4694, 32371, 43494, 61048}, new char[]{18164, 28846, 24430, 1294}, (char) ((-16773537) - Color.rgb(0, 0, 0)), 1852878406 + View.combineMeasuredStates(0, 0), new char[]{55614, 10993, 41560, 26416, 42621, 54773, 27312, 27370, 35767, 7928, 5018, 40740, 20585, 60936, 54163}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRed = (char) Color.red(0);
            int i2 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2267;
            int iBlue = 33 - Color.blue(0);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[132];
            Object[] objArr5 = new Object[1];
            c(b2, b2, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, i2, iBlue, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int i3 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2267;
                int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0');
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                c(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, i3, iLastIndexOf, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[0])[0];
            int i5 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = 1333841587 + (((~(256991971 | iIdentityHashCode)) | (-1065705288)) * (-964)) + (((~((~iIdentityHashCode) | 256991971)) | (-1070956520)) * (-964)) + 548961524;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{4694, 32371, 43494, 61048}, new char[]{62708, 60067, 25893, 47301}, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 50533), 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{34404, 28597, 6198, 21727, 31130, 18554, 5930, 42654, 15665, 11185, 8275, 63648, 42373, 51173, 41452, 34926, 3965, 34066, 474, 15980, 33720, 8207, 11864, 52823, 62371, 33928}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{4694, 32371, 43494, 61048}, new char[]{19059, 59672, 60396, 46360}, (char) (TextUtils.getOffsetBefore("", 0) + 6379), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, new char[]{41799, 23099, 39112, 13974, 38693, 27106, 6574, 39831, 3509, 5371, 46400, 30958, 25309, 49084, 51660, 27797, 13547, 41878}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i9 = g + 47;
                    f396a = i9 % 128;
                    int i10 = i9 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            d(new char[]{4694, 32371, 43494, 61048}, new char[]{12672, 11641, 46145, 22542}, (char) (3765 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), View.MeasureSpec.getSize(0), new char[]{25456, 62256, 55032, 15452, 17551, 15004, 58537, 843, 10554, 27093, 9870, 33372, 35983, 26285, 56662, 32262}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{4694, 32371, 43494, 61048}, new char[]{60333, 41980, 5419, 33952}, (char) (KeyEvent.getDeadChar(0, 0) + 40981), 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{6139, 40687, 40907, 9807, 24472, 40303, 45924, 11637, 30211, 58770, 5564, 26347, 44828, 11229, 30318, 58459}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 548961524};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[49];
                byte b6 = (byte) (-b5);
                Object[] objArr13 = new Object[1];
                e(b6, (byte) (b6 - 1), (byte) (-b5), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[49];
                byte b8 = (byte) (b7 + 1);
                byte b9 = (byte) (-b7);
                Object[] objArr14 = new Object[1];
                e(b8, b9, (byte) (b9 - 1), objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2268;
                        int iRgb2 = Color.rgb(0, 0, 0) + 16777249;
                        byte b10 = $$a[7];
                        byte b11 = b10;
                        Object[] objArr15 = new Object[1];
                        c(b10, b11, b11, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, packedPositionChild, iRgb2, -654680577, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        d(new char[]{4694, 32371, 43494, 61048}, new char[]{61931, 10603, 38599, 1994}, (char) (ViewConfiguration.getPressedStateDuration() >> 16), Process.getGidForName("") + 1, new char[]{28912, 37779, 49948, 26939, 43685, 44285, 57367, 42072, 18665, 7153, 13713, 64415, 26178, 59365, 52049, 753, 65012, 48172, 12048, 40931, 51715, 46643}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        d(new char[]{4694, 32371, 43494, 61048}, new char[]{18164, 28846, 24430, 1294}, (char) (ExpandableListView.getPackedPositionChild(0L) + 3680), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1852878405, new char[]{55614, 10993, 41560, 26416, 42621, 54773, 27312, 27370, 35767, 7928, 5018, 40740, 20585, 60936, 54163}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int iAlpha = Color.alpha(0) + 2267;
                            int deadChar = 33 - KeyEvent.getDeadChar(0, 0);
                            byte[] bArr4 = $$a;
                            byte b12 = bArr4[132];
                            Object[] objArr18 = new Object[1];
                            c(b12, b12, bArr4[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iAlpha, deadChar, -874156483, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int scrollBarFadeDuration = 2267 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int packedPositionChild2 = 32 - ExpandableListView.getPackedPositionChild(0L);
                            byte[] bArr5 = $$a;
                            Object[] objArr19 = new Object[1];
                            c(bArr5[132], bArr5[37], bArr5[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, scrollBarFadeDuration, packedPositionChild2, -887667012, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i11 = ((int[]) objArr[c])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 == i11) {
            int i13 = g + 89;
            f396a = i13 % 128;
            int i14 = i13 % 2;
            Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[0])[0];
            int i17 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iMyUid = Process.myUid();
            int i18 = i15 + (((1296675818 + (((-732071937) | iMyUid) * (-381))) + (((~((~iMyUid) | 72447067)) | (-800324692)) * 381)) - 253466624);
            int i19 = i18 ^ (i18 << 13);
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr20[2])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i21 = g + 87;
                int i22 = i21 % 128;
                f396a = i22;
                int i23 = i22 + 77;
                g = i23 % 128;
                int i24 = i23 % 2;
                for (int i25 = i21 % 2 != 0 ? 1 : 0; i25 < strArr3.length; i25++) {
                    arrayList.add(strArr3[i25]);
                }
            }
            int[] iArr = new int[i12];
            int i26 = i12 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i26) % 2) - 1], 1).show();
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[0])[0];
            int i29 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int i30 = (int) Runtime.getRuntime().totalMemory();
            int i31 = i27 + (((~((-200466590) | i30)) | 196272153) * (-566)) + 229602217 + ((~(i30 | (-4194437))) * 566);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr21[2])[0] = i33 ^ (i33 << 5);
        }
        return this.nik;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentbindingInflater1();
        int i = b + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ VerifyOtpSubmitAutodebitBniRequest copy$default(VerifyOtpSubmitAutodebitBniRequest verifyOtpSubmitAutodebitBniRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = g + 101;
            f396a = i3 % 128;
            int i4 = i3 % 2;
            str = verifyOtpSubmitAutodebitBniRequest.otp;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = verifyOtpSubmitAutodebitBniRequest.referenceNo;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = verifyOtpSubmitAutodebitBniRequest.chargeToken;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            int i5 = g + 73;
            f396a = i5 % 128;
            int i6 = i5 % 2;
            str4 = verifyOtpSubmitAutodebitBniRequest.nik;
            if (i6 != 0) {
                int i7 = 85 / 0;
            }
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = verifyOtpSubmitAutodebitBniRequest.email;
        }
        return verifyOtpSubmitAutodebitBniRequest.copy(str6, str7, str8, str9, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = f396a + 79;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.otp;
        int i4 = i3 + 27;
        f396a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = g + 69;
        f396a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.referenceNo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = f396a;
        int i3 = i2 + 1;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.chargeToken;
        int i5 = i2 + 85;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = g + 1;
        int i3 = i2 % 128;
        f396a = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 69;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final VerifyOtpSubmitAutodebitBniRequest copy(String p0, String p1, String p2, String p3, String p4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        VerifyOtpSubmitAutodebitBniRequest verifyOtpSubmitAutodebitBniRequest = new VerifyOtpSubmitAutodebitBniRequest(p0, p1, p2, p3, p4);
        int i2 = f396a + 37;
        g = i2 % 128;
        int i3 = i2 % 2;
        return verifyOtpSubmitAutodebitBniRequest;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = g + 109;
            f396a = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof VerifyOtpSubmitAutodebitBniRequest)) {
            return false;
        }
        VerifyOtpSubmitAutodebitBniRequest verifyOtpSubmitAutodebitBniRequest = (VerifyOtpSubmitAutodebitBniRequest) p0;
        if (!Intrinsics.areEqual(this.otp, verifyOtpSubmitAutodebitBniRequest.otp) || !Intrinsics.areEqual(this.referenceNo, verifyOtpSubmitAutodebitBniRequest.referenceNo) || !Intrinsics.areEqual(this.chargeToken, verifyOtpSubmitAutodebitBniRequest.chargeToken)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.nik, verifyOtpSubmitAutodebitBniRequest.nik)) {
            int i4 = g + 79;
            f396a = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.email, verifyOtpSubmitAutodebitBniRequest.email)) {
            return false;
        }
        int i6 = g + 27;
        f396a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 54 / 0;
        }
        return true;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f396a + 33;
        g = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.otp.hashCode() * 31) + this.referenceNo.hashCode()) * 31) + this.chargeToken.hashCode()) * 31) + this.nik.hashCode()) * 31) + this.email.hashCode();
        int i4 = g + 71;
        f396a = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.otp;
        String str2 = this.referenceNo;
        String str3 = this.chargeToken;
        String str4 = this.nik;
        String str5 = this.email;
        StringBuilder sb = new StringBuilder("VerifyOtpSubmitAutodebitBniRequest(otp=");
        sb.append(str);
        sb.append(", referenceNo=");
        sb.append(str2);
        sb.append(", chargeToken=");
        sb.append(str3);
        sb.append(", nik=");
        sb.append(str4);
        sb.append(", email=");
        sb.append(str5);
        sb.append(")");
        String string = sb.toString();
        int i2 = f396a + 97;
        g = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 5261968624523319143L;
        TuitionPaymentFragmentbindingInflater1 = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 34097;
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
    private static java.lang.String $$g(int r5, int r6, byte r7) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r7 = r7 + 102
            byte[] r1 = com.bpjstku.data.payment.model.request.VerifyOtpSubmitAutodebitBniRequest.$$c
            int r5 = r5 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            r3 = r1[r5]
        L24:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.VerifyOtpSubmitAutodebitBniRequest.$$g(int, int, byte):java.lang.String");
    }
}
