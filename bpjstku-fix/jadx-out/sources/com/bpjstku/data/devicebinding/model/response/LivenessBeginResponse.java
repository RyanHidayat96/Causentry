package com.bpjstku.data.devicebinding.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
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
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\"\u0010\u001f\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010!R\"\u0010%\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010!"}, d2 = {"Lcom/bpjstku/data/devicebinding/model/response/LivenessBeginResponse;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/devicebinding/model/response/LivenessBeginResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isSuspend", "Ljava/lang/String;", "isSuccessfulRaw", "isSuspendRaw", "isSuccessful", "setSuccessful", "(Ljava/lang/String;)V", "message", "getMessage", "setMessage", "statusCode", "getStatusCode", "setStatusCode"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LivenessBeginResponse {
    public static final int $stable = 8;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;

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
    private static final byte[] $$c = {58, -51, 54, -115};
    private static final int $$f = 128;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {6, 51, 46, 31, -9, 20, -28, 27, 10, -2, 10, -2, -14, 24, 16, -6, 1, 24, -6, 10, -2, -16, 24, 17, 9, -11, 19, 6};
    private static final int $$e = 54;
    private static final byte[] $$a = {58, -103, 118, 14, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 90;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.data.devicebinding.model.response.LivenessBeginResponse.$$a
            int r5 = r5 * 52
            int r5 = 55 - r5
            int r1 = r6 + 1
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r5 + 1
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r5]
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-10)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.devicebinding.model.response.LivenessBeginResponse.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 17
            int r7 = 115 - r7
            int r6 = r6 * 24
            int r0 = 25 - r6
            byte[] r1 = com.bpjstku.data.devicebinding.model.response.LivenessBeginResponse.$$d
            byte[] r0 = new byte[r0]
            int r6 = 24 - r6
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L32
        L16:
            r3 = r2
        L17:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L32:
            int r3 = r3 + r7
            int r7 = r3 + (-5)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.devicebinding.model.response.LivenessBeginResponse.d(byte, byte, short, java.lang.Object[]):void");
    }

    public LivenessBeginResponse(String str, String str2, String str3, String str4, String str5, String str6) {
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
    public /* synthetic */ LivenessBeginResponse(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        String str9;
        if ((i & 1) != 0) {
            int i2 = g + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str = "";
        }
        String str10 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i4 = g + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            str7 = "";
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            int i5 = g + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 1 / 0;
            }
            str8 = "";
        } else {
            str8 = str4;
        }
        if ((i & 16) != 0) {
            int i7 = g + 55;
            int i8 = i7 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 105;
            g = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 5 % 5;
            } else {
                int i12 = 2 % 2;
            }
            str9 = "";
        } else {
            str9 = str5;
        }
        this(str, str10, str7, str8, str9, (i & 32) == 0 ? str6 : "");
    }

    public final String isSuspend() {
        int i = 2 % 2;
        int i2 = g + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isSuspend;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String isSuccessfulRaw() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.isSuccessfulRaw;
        int i5 = i3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String isSuspendRaw() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        g = i2 % 128;
        int i3 = i2 % 2;
        String str = this.isSuspendRaw;
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return str;
    }

    public final String isSuccessful() {
        int i = 2 % 2;
        int i2 = g + 7;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.isSuccessful;
        int i5 = i3 + 61;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setSuccessful(String str) {
        int i = 2 % 2;
        int i2 = g + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.isSuccessful = str;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getMessage() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        g = i2 % 128;
        int i3 = i2 % 2;
        String str = this.message;
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        return str;
    }

    public final void setMessage(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String getStatusCode() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 123;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.statusCode;
            int i4 = 38 / 0;
        } else {
            str = this.statusCode;
        }
        int i5 = i2 + 49;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setStatusCode(String str) {
        int i = 2 % 2;
        int i2 = g + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.statusCode = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.statusCode = str;
        int i3 = g + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0234  */
    public final String component4() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 31533);
            int i2 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, i2, keyRepeatTimeout, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{'\n', 27, 11, 24, '\n', 28, 11, 0, 2, 28, 2, '#', 28, 27, Typography.quote, 17, 18, 27, 22, 0, 4, 1}, (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 123), 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{'\f', 22, '\b', 21, 28, 14, 11, 18, 15, '\n', 23, 30, 23, 22, 13893}, (byte) (Color.blue(0) + 70), View.MeasureSpec.getSize(0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyTid = (char) (31533 - (Process.myTid() >> 22));
            int iResolveSize = View.resolveSize(0, 0) + 921;
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
            byte b4 = $$a[7];
            Object[] objArr5 = new Object[1];
            a(b4, (byte) 52, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, iResolveSize, threadPriority, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 31534);
                int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 920;
                int maxKeyCode = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                byte[] bArr2 = $$a;
                byte b5 = bArr2[80];
                Object[] objArr6 = new Object[1];
                a(b5, (byte) (b5 | 37), bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, i3, maxKeyCode, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i4 = ~iMaxMemory;
            int i5 = (((134002307 + ((((~((-89377390) | i4)) | 71467052) | (~((-1684702255) | i4))) * (-1136))) + ((((~((-89377390) | iMaxMemory)) | (~((-1684702255) | iMaxMemory))) | (~(1702612591 | i4))) * (-568))) + (((~(iMaxMemory | (-71467053))) | ((~(i4 | 1684702254)) | (~(89377389 | i4)))) * 568)) - 761474190;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{'\n', 27, 11, 24, '\n', 28, 11, 0, '\b', 21, 23, 2, 15, 0, Typography.quote, 23, '\n', 19, '!', 29, 25, 1, 28, 17, '\n', 7}, (byte) (53 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), ((Process.getThreadPriority(0) + 20) >> 6) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{1, 27, 13855, 13855, 22, Typography.quote, 30, 17, 13857, 13857, 19, 23, '\t', 15, Typography.quote, 23, '\n', Typography.quote}, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 56), Color.blue(0) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i8 = g + 1;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                    int i9 = i8 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{21, 15, '\b', '\n', 0, 23, '\n', 27, '#', 3, '!', 26, 29, ' ', 15, 22}, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 76), 16 - TextUtils.indexOf("", "", 0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{18, '\n', 22, Typography.quote, Typography.quote, 23, '!', 29, '!', '\n', 25, ' ', 28, 0, '\n', '\f'}, (byte) (Color.blue(0) + 112), (ViewConfiguration.getLongPressTimeout() >> 16) + 16, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i10 = g + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -761474190};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[16];
                byte b7 = (byte) (b6 - 1);
                Object[] objArr13 = new Object[1];
                d(b7, b7, (byte) (-b6), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr3[16];
                byte b9 = b8;
                Object[] objArr14 = new Object[1];
                d(b8, b9, (byte) (b9 | 22), objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "") + 31533);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 921;
                    int i12 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte[] bArr4 = $$a;
                    byte b10 = bArr4[80];
                    Object[] objArr15 = new Object[1];
                    a(b10, (byte) (b10 | 37), bArr4[7], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, absoluteGravity, i12, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new char[]{'\n', 27, 11, 24, '\n', 28, 11, 0, 2, 28, 2, '#', 28, 27, Typography.quote, 17, 18, 27, 22, 0, 4, 1}, (byte) (123 - Gravity.getAbsoluteGravity(0, 0)), 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new char[]{'\f', 22, '\b', 21, 28, 14, 11, 18, 15, '\n', 23, 30, 23, 22, 13893}, (byte) (70 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 15 - KeyEvent.getDeadChar(0, 0), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maximumFlingVelocity = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int threadPriority2 = 921 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 28;
                        byte b11 = $$a[7];
                        Object[] objArr18 = new Object[1];
                        a(b11, (byte) 52, b11, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, threadPriority2, iNormalizeMetaState, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf2 = (char) (31533 - TextUtils.indexOf("", "", 0));
                        int bitsPerPixel2 = 920 - ImageFormat.getBitsPerPixel(0);
                        int absoluteGravity2 = 28 - Gravity.getAbsoluteGravity(0, 0);
                        byte[] bArr5 = $$a;
                        byte b12 = bArr5[7];
                        byte b13 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        a(b12, b13, b13, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, bitsPerPixel2, absoluteGravity2, -1048449946, false, (String) objArr19[0], null);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i16 = i15 + ((((~((-714610169) | iIdentityHashCode)) | 9962840) * (-566)) - 1176887509) + ((~(iIdentityHashCode | (-704647329))) * 566);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr20[0])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i19 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i20 = ~iIdentityHashCode2;
            int i21 = i19 + 1599104291 + (((~(1154999801 | i20)) | 538970114) * 184) + ((iIdentityHashCode2 | 1074890073) * (-184)) + ((~((-619079843) | i20)) * 184);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr21[0])[0] = i23 ^ (i23 << 5);
            int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
            g = i24 % 128;
            int i25 = i24 % 2;
        }
        return this.isSuccessful;
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), 2268 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), 33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2267 - (ViewConfiguration.getJumpTapTimeout() >> 16), 32 - TextUtils.lastIndexOf("", '0', 0, 0), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $10;
            int i6 = i5 + 99;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
            int i8 = i5 + 25;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $11 + 73;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i12 = $10 + 71;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b * b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >> 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / b2);
                    } else {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    }
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 49267), 3261 - (ViewConfiguration.getLongPressTimeout() >> 16), 31 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -127612708, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            try {
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b9 = (byte) 0;
                                    byte b10 = b9;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22926 - AndroidCharacter.getMirror('0')), TextUtils.lastIndexOf("", '0', 0) + 595, 18 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1570859318, false, $$g(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
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
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static {
        b = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = TuitionPaymentFragmentbindingInflater1 + 99;
        b = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public LivenessBeginResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ LivenessBeginResponse copy$default(LivenessBeginResponse livenessBeginResponse, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = g + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 != 0) {
                str = livenessBeginResponse.isSuspend;
                int i4 = 2 / 0;
            } else {
                str = livenessBeginResponse.isSuspend;
            }
        }
        String str7 = str;
        if ((i & 2) != 0) {
            str2 = livenessBeginResponse.isSuccessfulRaw;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            int i5 = g + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            str3 = livenessBeginResponse.isSuspendRaw;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = livenessBeginResponse.isSuccessful;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
            g = i7 % 128;
            int i8 = i7 % 2;
            str5 = livenessBeginResponse.message;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = livenessBeginResponse.statusCode;
            int i9 = g + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            int i10 = i9 % 2;
        }
        return livenessBeginResponse.copy(str7, str8, str9, str10, str11, str6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        g = i2 % 128;
        int i3 = i2 % 2;
        String str = this.isSuspend;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = g + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isSuccessfulRaw;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = g + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isSuspendRaw;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = g + 51;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.message;
        int i5 = i3 + 21;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = g + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.statusCode;
        }
        int i3 = 2 / 0;
        return this.statusCode;
    }

    public final LivenessBeginResponse copy(String p0, String p1, String p2, String p3, String p4, String p5) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        LivenessBeginResponse livenessBeginResponse = new LivenessBeginResponse(p0, p1, p2, p3, p4, p5);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        g = i2 % 128;
        int i3 = i2 % 2;
        return livenessBeginResponse;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof LivenessBeginResponse)) {
            return false;
        }
        LivenessBeginResponse livenessBeginResponse = (LivenessBeginResponse) p0;
        if (!Intrinsics.areEqual(this.isSuspend, livenessBeginResponse.isSuspend)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
            g = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.isSuccessfulRaw, livenessBeginResponse.isSuccessfulRaw) || !Intrinsics.areEqual(this.isSuspendRaw, livenessBeginResponse.isSuspendRaw) || !Intrinsics.areEqual(this.isSuccessful, livenessBeginResponse.isSuccessful) || !Intrinsics.areEqual(this.message, livenessBeginResponse.message) || (!Intrinsics.areEqual(this.statusCode, livenessBeginResponse.statusCode))) {
            return false;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = g + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.isSuspend.hashCode() * 31) + this.isSuccessfulRaw.hashCode()) * 31) + this.isSuspendRaw.hashCode()) * 31) + this.isSuccessful.hashCode()) * 31) + this.message.hashCode()) * 31) + this.statusCode.hashCode();
        int i4 = g + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.isSuspend;
        String str2 = this.isSuccessfulRaw;
        String str3 = this.isSuspendRaw;
        String str4 = this.isSuccessful;
        String str5 = this.message;
        String str6 = this.statusCode;
        StringBuilder sb = new StringBuilder("LivenessBeginResponse(isSuspend=");
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
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        g = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{60048, 60057, 59745, 60056, 60052, 60117, 60063, 60045, 60059, 60058, 59749, 59747, 60090, 59746, 59744, 60049, 60062, 60061, 60055, 60079, 60043, 60054, 60050, 60073, 60088, 60046, 60040, 60034, 60053, 60041, 59748, 60051, 60072, 60060, 60083, 60047};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 57191;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r0 = com.bpjstku.data.devicebinding.model.response.LivenessBeginResponse.$$c
            int r8 = r8 + 113
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r6 = r6 + 1
            if (r5 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
        L26:
            int r8 = r8 + r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.devicebinding.model.response.LivenessBeginResponse.$$g(short, short, int):java.lang.String");
    }
}
