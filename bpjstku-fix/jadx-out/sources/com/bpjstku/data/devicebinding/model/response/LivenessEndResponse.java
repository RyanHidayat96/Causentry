package com.bpjstku.data.devicebinding.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.gson.annotations.SerializedName;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\"\u0010\u001f\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010!R\"\u0010%\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010!"}, d2 = {"Lcom/bpjstku/data/devicebinding/model/response/LivenessEndResponse;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/devicebinding/model/response/LivenessEndResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isSuspend", "Ljava/lang/String;", "isSuccessfulRaw", "isSuspendRaw", "isSuccessful", "setSuccessful", "(Ljava/lang/String;)V", "message", "getMessage", "setMessage", "statusCode", "getStatusCode", "setStatusCode"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LivenessEndResponse {
    public static final int $stable = 8;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] b;

    @SerializedName("isSuccessful")
    private String isSuccessful;

    @SerializedName("isSuccessfulRaw")
    private final String isSuccessfulRaw;

    @SerializedName("isSuspend")
    private final String isSuspend;

    @SerializedName("isSuspendRaw")
    private final String isSuspendRaw;

    @SerializedName("message")
    private String message;

    @SerializedName("statusCode")
    private String statusCode;
    private static final byte[] $$c = {115, 25, -47, -94};
    private static final int $$f = 15;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {119, -102, -34, -3, -41, -9, -7, -21, -8, 9, -9, -18, -1, 10, -42, -5, 4, -3, -10, -10, -22, 38, -59, -4, 7, -21, -4, 5, -19, 17, -46, 3, -14, 4, -5, -23, 3, -2, 15, -29, -20, 3, -10, -5, 41, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 59};
    private static final int $$e = 28;
    private static final byte[] $$a = {74, 60, 122, -26, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 206;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r0 = com.bpjstku.data.devicebinding.model.response.LivenessEndResponse.$$a
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2f
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2f:
            int r4 = -r4
            int r6 = r6 + 1
            int r8 = r8 + r4
            int r8 = r8 + (-10)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.devicebinding.model.response.LivenessEndResponse.a(int, byte, byte, java.lang.Object[]):void");
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
    private static void d(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 11
            int r6 = r6 + 42
            int r8 = r8 * 16
            int r8 = r8 + 68
            byte[] r0 = com.bpjstku.data.devicebinding.model.response.LivenessEndResponse.$$d
            int r7 = r7 * 41
            int r7 = 45 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r7]
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            int r7 = r7 + 1
            int r8 = r8 + (-8)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.devicebinding.model.response.LivenessEndResponse.d(byte, short, byte, java.lang.Object[]):void");
    }

    public LivenessEndResponse(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.isSuspend = str;
        this.isSuccessfulRaw = str2;
        this.isSuspendRaw = str3;
        this.isSuccessful = str4;
        this.message = str5;
        this.statusCode = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LivenessEndResponse(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        String str9 = "";
        if ((i & 1) != 0) {
            int i2 = g + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str = "";
        }
        String str10 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i3 = g + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str7 = "";
        } else {
            str7 = str3;
        }
        String str11 = (i & 8) != 0 ? "" : str4;
        if ((i & 16) != 0) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
            g = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str8 = "";
        } else {
            str8 = str5;
        }
        if ((i & 32) != 0) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
            g = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str9 = str6;
        }
        this(str, str10, str7, str11, str8, str9);
    }

    public final String isSuspend() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 57;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.isSuspend;
        int i5 = i2 + 51;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String isSuccessfulRaw() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 31;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.isSuccessfulRaw;
        int i4 = i2 + 81;
        g = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String isSuspendRaw() {
        int i = 2 % 2;
        int i2 = g + 125;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.isSuspendRaw;
        int i5 = i3 + 111;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String isSuccessful() {
        int i = 2 % 2;
        int i2 = g + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isSuccessful;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSuccessful(String str) {
        int i = 2 % 2;
        int i2 = g + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.isSuccessful = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.isSuccessful = str;
            throw null;
        }
    }

    public final String getMessage() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.message;
        int i5 = i2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setMessage(String str) {
        int i = 2 % 2;
        int i2 = g + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
    }

    public final String getStatusCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.statusCode;
        int i5 = i3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setStatusCode(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.statusCode = str;
        int i4 = g + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final LivenessEndResponse copy(String p0, String p1, String p2, String p3, String p4, String p5) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = g + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSize = (char) (View.resolveSize(0, 0) + 31533);
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 921;
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (b2 | 52), bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, edgeSlop, modifierMetaStateMask, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{0, '\b', '\n', 3, 11, '\r', '\n', 18, 11, 20, 16, 18, 16, 24, 19, 1, 7, '\b', 20, '\f', '\f', 4}, (byte) (122 - TextUtils.indexOf("", "")), TextUtils.indexOf((CharSequence) "", '0') + 23, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{2, 24, '\b', 23, 24, 1, 14, '\f', 0, 4, 21, 17, 11, 7, 13878}, (byte) (Color.red(0) + 55), 15 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char defaultSize = (char) (31533 - View.getDefaultSize(0, 0));
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 921;
            int iRed = Color.red(0) + 28;
            byte b3 = $$a[80];
            byte b4 = b3;
            Object[] objArr6 = new Object[1];
            a(b3, b4, b4, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, absoluteGravity, iRed, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char size = (char) (View.MeasureSpec.getSize(0) + 31533);
                int maxKeyCode = 921 - (KeyEvent.getMaxKeyCode() >> 16);
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 28;
                byte[] bArr2 = $$a;
                Object[] objArr7 = new Object[1];
                a(bArr2[7], (byte) (-bArr2[33]), bArr2[80], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, maxKeyCode, packedPositionType, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = (-930468973) + ((~(iIdentityHashCode | 920547508)) * 216);
            int i5 = ~iIdentityHashCode;
            int i6 = i4 + (((-101700) | i5) * (-216)) + (((~(i5 | 920547508)) | 853532135) * 216) + 1330162426;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{0, '\b', '\n', 3, 11, '\r', '\n', 18, '\b', 23, 19, 16, 24, '\r', 17, 11, 7, 14, 17, 15, 0, 21, 1, 0, '\b', 18}, (byte) (76 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 26 - View.getDefaultSize(0, 0), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{'\r', '\t', 13808, 13808, 0, '\t', 18, 21, 13810, 13810, 2, 17, '\r', 4, 17, 11, 15, '\n'}, (byte) (Color.green(0) + 8), 18 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i9 = g + 67;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(p0 != null ? p0.length() : 0), 0, 1330162426};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[55];
                Object[] objArr12 = new Object[1];
                d(b5, bArr3[78], b5, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b6 = bArr3[78];
                Object[] objArr13 = new Object[1];
                d(b6, bArr3[55], b6, objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
                    int i11 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 920;
                    int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte[] bArr4 = $$a;
                    Object[] objArr14 = new Object[1];
                    a(bArr4[7], (byte) (-bArr4[33]), bArr4[80], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb, i11, iIndexOf, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{0, '\b', '\n', 3, 11, '\r', '\n', 18, 11, 20, 16, 18, 16, 24, 19, 1, 7, '\b', 20, '\f', '\f', 4}, (byte) (122 - (ViewConfiguration.getTouchSlop() >> 8)), 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{2, 24, '\b', 23, 24, 1, 14, '\f', 0, 4, 21, 17, 11, 7, 13878}, (byte) (55 - Color.red(0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31532);
                        int i12 = 920 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int iMyPid = 28 - (Process.myPid() >> 22);
                        byte b7 = $$a[80];
                        byte b8 = b7;
                        Object[] objArr17 = new Object[1];
                        a(b7, b8, b8, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i12, iMyPid, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char size2 = (char) (31533 - View.MeasureSpec.getSize(0));
                        int i13 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 920;
                        int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 28;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[80];
                        Object[] objArr18 = new Object[1];
                        a(b9, (byte) (b9 | 52), bArr5[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(size2, i13, packedPositionType2, -1048449946, false, (String) objArr18[0], null);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i17 = i16 + (((2106421723 + (((~((-865943415) | startElapsedRealtime)) | 838930212) * 576)) + (((~((~startElapsedRealtime) | (-27013203))) | 69206017) * 576)) - 2107502336);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr2[0])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            int i20 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i21 = ~elapsedCpuTime;
            int i22 = i20 + (-990875681) + (((~((-1074968377) | i21)) | (-699111268) | (~(1074968376 | elapsedCpuTime))) * (-564)) + ((~(elapsedCpuTime | (-698941508))) * 1128) + (((~((-699111268) | i21)) | (-1773909884)) * 564);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr2[0])[0] = i24 ^ (i24 << 5);
        }
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        int i25 = ((int[]) objArr2[0])[0];
        int i26 = ((i25 * i25) - (~(-(291534267 * i25)))) - 1;
        int i27 = -(i25 * 710940071);
        int i28 = (i26 & i27) + (i27 | i26);
        int i29 = (i28 & 582542433) + (582542433 | i28);
        int i30 = i29 >> 18;
        int i31 = ((i30 ^ (-32767)) + ((i30 & (-32767)) << 1)) / 16384;
        int i32 = (i29 - (~((i31 & 1) + (i31 | 1)))) - 1;
        int i33 = i29 >> 24;
        int i34 = ((i33 & (-511)) + (i33 | (-511))) / 256;
        int i35 = -(i32 ^ ((i34 ^ 1) + ((i34 & 1) << 1)));
        int i36 = (i35 & 2) + (i35 | 2);
        int i37 = i36 >> 27;
        int i38 = ((i37 ^ (-63)) + ((i37 & (-63)) << 1)) / 32;
        int i39 = ((i38 | 1) << 1) - (i38 ^ 1);
        Intrinsics.checkNotNullParameter(p3, "22\\29\\24\\23\\15\\isSuccessful".substring(36300 / (((-((i39 & 1) + (i39 | 1))) & i36) * 1210)));
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        return new LivenessEndResponse(p0, p1, p2, p3, p4, p5);
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        int i5 = 1770390596;
        Object obj = null;
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 65;
                $11 = i7 % 128;
                if (i7 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                            int iBlue = 2267 - Color.blue(0);
                            int i8 = (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 33;
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, iBlue, i8, -1927765101, false, $$g(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(obj, objArr2)).charValue();
                        i6 /= 0;
                        i3 = 2;
                        i5 = 1770390596;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), 2268 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 33, -1927765101, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6++;
                    i3 = 2;
                    i5 = 1770390596;
                    obj = null;
                }
                f = 0.0f;
            }
            int i9 = $10 + 51;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b7 = (byte) 0;
                byte b8 = (byte) (b7 + 3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2267, TextUtils.indexOf("", "") + 33, -1927765101, false, $$g(b7, b8, (byte) (b8 - 3)), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    } else {
                        try {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = (byte) (b9 + 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49267), 3261 - Color.red(0), 30 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -127612708, false, $$g(b9, b10, (byte) (b10 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                                int i11 = $10 + 91;
                                $11 = i11 % 128;
                                int i12 = i11 % 2;
                                Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    byte b11 = (byte) 0;
                                    byte b12 = b11;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (22878 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (Process.myPid() >> 22) + 594, 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1570859318, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                                int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                            } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                            } else {
                                int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    int i18 = $11 + 35;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                }
            }
            for (int i20 = 0; i20 < i; i20++) {
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
            }
            objArr[0] = new String(cArr4);
            int i21 = $11 + 5;
            $10 = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 73 / 0;
            }
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentbindingInflater1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public LivenessEndResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ LivenessEndResponse copy$default(LivenessEndResponse livenessEndResponse, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        String str9 = (i & 1) != 0 ? livenessEndResponse.isSuspend : str;
        if ((i & 2) != 0) {
            str7 = livenessEndResponse.isSuccessfulRaw;
            int i6 = i4 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str7 = str2;
        }
        String str10 = (i & 4) != 0 ? livenessEndResponse.isSuspendRaw : str3;
        String str11 = (i & 8) != 0 ? livenessEndResponse.isSuccessful : str4;
        if ((i & 16) != 0) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
            g = i8 % 128;
            if (i8 % 2 == 0) {
                String str12 = livenessEndResponse.message;
                throw null;
            }
            str8 = livenessEndResponse.message;
        } else {
            str8 = str5;
        }
        return livenessEndResponse.copy(str9, str7, str10, str11, str8, (i & 32) != 0 ? livenessEndResponse.statusCode : str6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.isSuspend;
        int i5 = i3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.isSuccessfulRaw;
        int i5 = i2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.isSuspendRaw;
        int i4 = i2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 111;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.isSuccessful;
        int i5 = i2 + 53;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 9;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.message;
        int i5 = i2 + 1;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.statusCode;
        int i5 = i3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = g + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof LivenessEndResponse)) {
            return false;
        }
        LivenessEndResponse livenessEndResponse = (LivenessEndResponse) p0;
        if (!Intrinsics.areEqual(this.isSuspend, livenessEndResponse.isSuspend)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.isSuccessfulRaw, livenessEndResponse.isSuccessfulRaw)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
            g = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.isSuspendRaw, livenessEndResponse.isSuspendRaw)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.isSuccessful, livenessEndResponse.isSuccessful)) {
            int i5 = g + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.message, livenessEndResponse.message)) {
            return false;
        }
        if (Intrinsics.areEqual(this.statusCode, livenessEndResponse.statusCode)) {
            return true;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        g = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = g + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.isSuspend.hashCode() * 31) + this.isSuccessfulRaw.hashCode()) * 31) + this.isSuspendRaw.hashCode()) * 31) + this.isSuccessful.hashCode()) * 31) + this.message.hashCode()) * 31) + this.statusCode.hashCode();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.isSuspend;
        String str2 = this.isSuccessfulRaw;
        String str3 = this.isSuspendRaw;
        String str4 = this.isSuccessful;
        String str5 = this.message;
        String str6 = this.statusCode;
        StringBuilder sb = new StringBuilder("LivenessEndResponse(isSuspend=");
        sb.append(str);
        sb.append(", isSuccessfulRaw=");
        sb.append(str2);
        sb.append(", isSuspendRaw=");
        sb.append(str3);
        sb.append(", isSuccessful=");
        sb.append(str4);
        sb.append(", message=");
        sb.append(str5);
        sb.append(", statusCode=");
        sb.append(str6);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
        }
        return string;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        b = new char[]{60041, 60079, 60048, 60058, 60062, 60053, 60054, 60088, 60046, 60045, 60052, 60073, 60050, 60063, 60056, 60117, 60047, 60072, 60043, 60034, 60051, 60040, 60055, 60090, 60042};
        TuitionPaymentFragmentbindingInflater1 = (char) 57188;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, byte r7, int r8) {
        /*
            int r7 = 116 - r7
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = com.bpjstku.data.devicebinding.model.response.LivenessEndResponse.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.devicebinding.model.response.LivenessEndResponse.$$g(short, byte, int):java.lang.String");
    }
}
