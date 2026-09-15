package com.bpjstku.data.payment.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u000eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0010R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/bpjstku/data/payment/model/response/CreateOneTimePaymentResponse;", "", "Lcom/bpjstku/data/payment/model/response/OneTimePaymentResponse;", "p0", "", "p1", "", "p2", "p3", "<init>", "(Lcom/bpjstku/data/payment/model/response/OneTimePaymentResponse;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/bpjstku/data/payment/model/response/OneTimePaymentResponse;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/bpjstku/data/payment/model/response/OneTimePaymentResponse;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/response/CreateOneTimePaymentResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/data/payment/model/response/OneTimePaymentResponse;", "getData", "isSuccessful", "Ljava/lang/Boolean;", "message", "Ljava/lang/String;", "getMessage", "statusCode", "getStatusCode"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreateOneTimePaymentResponse {
    public static final int $stable = 8;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final OneTimePaymentResponse data;

    @SerializedName("isSuccessful")
    private final Boolean isSuccessful;

    @SerializedName("message")
    private final String message;

    @SerializedName("statusCode")
    private final String statusCode;
    private static final byte[] $$c = {99, -43, -44, -62};
    private static final int $$f = 178;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {33, -59, 107, -108, 13, -1, -62, 52, 14, -9, 15, -2, -5, -4, -53, 73, -6, -2, 1, -6, 21, -74, 20, 51, 7, -10, -10, -16, 20, 13, 5, -15, 15, 2, -34, 37, -15, 17, -15, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -65};
    private static final int $$e = 121;
    private static final byte[] $$a = {51, -99, -8, -59, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 70;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = 55 - r6
            int r0 = 53 - r8
            byte[] r1 = com.bpjstku.data.payment.model.response.CreateOneTimePaymentResponse.$$a
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r6 = r6 + 1
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.response.CreateOneTimePaymentResponse.a(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 15
            int r5 = r5 + 84
            int r7 = r7 * 35
            int r7 = 38 - r7
            int r6 = r6 * 17
            int r0 = r6 + 36
            byte[] r1 = com.bpjstku.data.payment.model.response.CreateOneTimePaymentResponse.$$d
            byte[] r0 = new byte[r0]
            int r6 = r6 + 35
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L28:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2c:
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.response.CreateOneTimePaymentResponse.d(int, byte, byte, java.lang.Object[]):void");
    }

    public CreateOneTimePaymentResponse(OneTimePaymentResponse oneTimePaymentResponse, Boolean bool, String str, String str2) {
        Intrinsics.checkNotNullParameter(oneTimePaymentResponse, "");
        this.data = oneTimePaymentResponse;
        this.isSuccessful = bool;
        this.message = str;
        this.statusCode = str2;
    }

    public final OneTimePaymentResponse getData() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        OneTimePaymentResponse oneTimePaymentResponse = this.data;
        int i5 = i3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return oneTimePaymentResponse;
    }

    public final Boolean isSuccessful() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        Boolean bool = this.isSuccessful;
        int i5 = i3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final String getMessage() {
        int i = 2 % 2;
        int i2 = b + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.message;
        }
        throw null;
    }

    public final String getStatusCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.statusCode;
        }
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $10 + 99;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64886 - AndroidCharacter.getMirror('0')), Process.getGidForName("") + 1357, 38 - Color.alpha(0), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - Color.alpha(0)), 468 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-16777203) - Color.rgb(0, 0, 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 57;
                $10 = i6 % 128;
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

    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    public final boolean equals(Object p0) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char edgeSlop = (char) (31533 - (ViewConfiguration.getEdgeSlop() >> 16));
            int i2 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 921;
            int scrollBarFadeDuration = 28 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b2, b2, (byte) (bArr[0] + 1), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, i2, scrollBarFadeDuration, -1048449946, false, (String) objArr3[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{42083, 41986, 51893, 57998, 32313, 12023, 9178, 23383, 1368, 885, 36771, 14759, 59044, 41019, 60741, 38958, 18406, 50839, 19179, 32580, 8542, 26451, 43951, 56826, 33444, 33831}, Color.rgb(0, 0, 0) + 16777217, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{38601, 38572, 45244, 39045, 7091, 19320, 34186, 64773, 14318, 31088, 59945, 40843, 54276, 55840, 34957, 15961, 30044, 48256, 12144}, 1 - (Process.myTid() >> 22), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31532);
            int iKeyCodeFromString = 921 - KeyEvent.keyCodeFromString("");
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 28;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            byte b4 = bArr2[80];
            Object[] objArr6 = new Object[1];
            a(b3, b4, b4, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iKeyCodeFromString, absoluteGravity, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (31532 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 921;
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28;
                byte[] bArr3 = $$a;
                byte b5 = bArr3[80];
                Object[] objArr7 = new Object[1];
                a(b5, b5, (byte) (-bArr3[33]), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, keyRepeatTimeout, minimumFlingVelocity, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int i3 = (int) Runtime.getRuntime().totalMemory();
            int i4 = ~((-933073570) | i3);
            int i5 = ~i3;
            int i6 = (((498776949 + ((i4 | (~(935181307 | i5))) * (-406))) + ((~((-94175234) | i5)) * (-406))) + (((~(i3 | (-841006075))) | (~(933073569 | i5))) * 406)) - 1108069438;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{7139, 7042, 54071, 64268, 43499, 63781, 51006, 49075, 47832, 6903, 22641, 56643, 22826, 47546, 15049, 31927, 63582, 57093, 40249, 39852, 40645, 32507, 31845, 14600, 15635, 40358, 57047, 22776, 56442, 8990}, 1 - ExpandableListView.getPackedPositionType(0L), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{29520, 29491, 39436, 45612, 43856, 64392, 59353, 40788, 53857, 21451, 23258, 64971, 12680, 61569, 14446, 23575, 37071, 38460, 40834, 47947, 63087, 14279}, 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i9 = b + 39;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                if (i9 % 2 == 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                applicationContext = (((applicationContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) applicationContext).getBaseContext() != null) ? applicationContext.getApplicationContext() : null;
            }
            Object[] objArr11 = new Object[1];
            c(new char[]{12849, 12891, 44536, 34252, 29392, 8716, 32674, 1852, 37707, 25661, 33615, 26015, 28926, 50987, 57809, 50300, 53694, 41437, 17939, 9012}, -TextUtils.indexOf((CharSequence) "", '0', 0), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(new char[]{18995, 19034, 39079, 45206, 48896, 61391, 20869, 10516, 60179, 20839, 20106, 19375, 2259, 62011, 11297, 59978, 43404, 38041, 35778, 3355}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, -1108069438};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[18];
                Object[] objArr14 = new Object[1];
                d(b6, bArr4[44], b6, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b7 = bArr4[44];
                Object[] objArr15 = new Object[1];
                d(b7, bArr4[18], b7, objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cResolveOpacity = (char) (31533 - Drawable.resolveOpacity(0, 0));
                    int iCombineMeasuredStates = 921 - View.combineMeasuredStates(0, 0);
                    int i10 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27;
                    byte[] bArr5 = $$a;
                    byte b8 = bArr5[80];
                    Object[] objArr16 = new Object[1];
                    a(b8, b8, (byte) (-bArr5[33]), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, iCombineMeasuredStates, i10, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{42083, 41986, 51893, 57998, 32313, 12023, 9178, 23383, 1368, 885, 36771, 14759, 59044, 41019, 60741, 38958, 18406, 50839, 19179, 32580, 8542, 26451, 43951, 56826, 33444, 33831}, (ViewConfiguration.getScrollBarSize() >> 8) + 1, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{38601, 38572, 45244, 39045, 7091, 19320, 34186, 64773, 14318, 31088, 59945, 40843, 54276, 55840, 34957, 15961, 30044, 48256, 12144}, -Process.getGidForName(""), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char capsMode = (char) (31533 - TextUtils.getCapsMode("", 0, 0));
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 921;
                        int offsetBefore = 28 - TextUtils.getOffsetBefore("", 0);
                        byte[] bArr6 = $$a;
                        byte b9 = bArr6[7];
                        byte b10 = bArr6[80];
                        Object[] objArr19 = new Object[1];
                        a(b9, b10, b10, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(capsMode, tapTimeout, offsetBefore, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 31534);
                        int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int i11 = 28 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte[] bArr7 = $$a;
                        byte b11 = bArr7[7];
                        Object[] objArr20 = new Object[1];
                        a(b11, b11, (byte) (bArr7[0] + 1), objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, iLastIndexOf, i11, -1048449946, false, (String) objArr20[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 == i12) {
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
            b = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i17 = ~((-1018891173) | (~iIdentityHashCode));
            int i18 = i16 + ((((16793683 | i17) | (~(1018891172 | iIdentityHashCode))) * (-338)) - 1139590095) + (((~(iIdentityHashCode | 1035684855)) | i17) * 338);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr2[0])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i21 = 0;
                while (i21 < strArr.length) {
                    int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
                    b = i22 % 128;
                    if (i22 % 2 != 0) {
                        arrayList.add(strArr[i21]);
                        i21 += 110;
                    } else {
                        arrayList.add(strArr[i21]);
                        i21++;
                    }
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            int i23 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i24 = ~iIdentityHashCode2;
            int i25 = i23 + (-701355089) + (((~(1610464895 | i24)) | 163614748) * 220) + (((~(i24 | 1507627036)) | 266452607) * (-440)) + ((iIdentityHashCode2 | 1610464895) * 220);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr2[0])[0] = i27 ^ (i27 << 5);
        }
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CreateOneTimePaymentResponse)) {
            return false;
        }
        CreateOneTimePaymentResponse createOneTimePaymentResponse = (CreateOneTimePaymentResponse) p0;
        if (!Intrinsics.areEqual(this.data, createOneTimePaymentResponse.data)) {
            return false;
        }
        if (Intrinsics.areEqual(this.isSuccessful, createOneTimePaymentResponse.isSuccessful)) {
            if (!Intrinsics.areEqual(this.message, createOneTimePaymentResponse.message)) {
                return false;
            }
            if (Intrinsics.areEqual(this.statusCode, createOneTimePaymentResponse.statusCode)) {
                return true;
            }
            int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
            b = i28 % 128;
            int i29 = i28 % 2;
            return false;
        }
        int i30 = ((int[]) objArr2[0])[0];
        int i31 = i30 * i30;
        int i32 = -(71400168 * i30);
        int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
        int i34 = -(i30 * (-1198119302));
        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
        int i36 = (i35 & 437656161) + (437656161 | i35);
        int i37 = i36 >> 17;
        int i38 = (((-65535) & i37) + (i37 | (-65535))) / 32768;
        int i39 = ((i38 | 1) << 1) - (i38 ^ 1);
        int i40 = (-(((((i36 >> 22) - 2047) / 1024) + 1) ^ (((i36 | i39) << 1) - (i39 ^ i36)))) + 2;
        int i41 = i40 >> 25;
        int i42 = ((i41 & (-255)) + (i41 | (-255))) / 128;
        int i43 = (i42 ^ 1) + ((i42 & 1) << 1);
        return 0 / ((i40 & (-((i43 & 1) + (i43 | 1)))) * 96);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = TuitionPaymentFragmentbindingInflater1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ CreateOneTimePaymentResponse copy$default(CreateOneTimePaymentResponse createOneTimePaymentResponse, OneTimePaymentResponse oneTimePaymentResponse, Boolean bool, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            oneTimePaymentResponse = createOneTimePaymentResponse.data;
        }
        if ((i & 2) != 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                Boolean bool2 = createOneTimePaymentResponse.isSuccessful;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            bool = createOneTimePaymentResponse.isSuccessful;
        }
        if ((i & 4) != 0) {
            str = createOneTimePaymentResponse.message;
        }
        if ((i & 8) != 0) {
            int i4 = b + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            str2 = createOneTimePaymentResponse.statusCode;
        }
        return createOneTimePaymentResponse.copy(oneTimePaymentResponse, bool, str, str2);
    }

    public final OneTimePaymentResponse component1() {
        int i = 2 % 2;
        int i2 = b + 9;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        OneTimePaymentResponse oneTimePaymentResponse = this.data;
        int i5 = i3 + 53;
        b = i5 % 128;
        int i6 = i5 % 2;
        return oneTimePaymentResponse;
    }

    public final Boolean component2() {
        int i = 2 % 2;
        int i2 = b + 113;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.isSuccessful;
        int i5 = i3 + 91;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return bool;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = b + 115;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.message;
        int i5 = i3 + 31;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.statusCode;
        int i5 = i3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CreateOneTimePaymentResponse copy(OneTimePaymentResponse p0, Boolean p1, String p2, String p3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        CreateOneTimePaymentResponse createOneTimePaymentResponse = new CreateOneTimePaymentResponse(p0, p1, p2, p3);
        int i2 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return createOneTimePaymentResponse;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.data.hashCode();
        Boolean bool = this.isSuccessful;
        int iHashCode3 = 0;
        if (bool == null) {
            int i4 = b;
            int i5 = i4 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 5;
            }
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        String str = this.message;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.statusCode;
        Object obj = null;
        if (str2 != null) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
            b = i9 % 128;
            if (i9 % 2 != 0) {
                str2.hashCode();
                obj.hashCode();
                throw null;
            }
            iHashCode3 = str2.hashCode();
        }
        int i10 = (((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode3;
        int i11 = b + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
        if (i11 % 2 != 0) {
            return i10;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        OneTimePaymentResponse oneTimePaymentResponse = this.data;
        Boolean bool = this.isSuccessful;
        String str = this.message;
        String str2 = this.statusCode;
        StringBuilder sb = new StringBuilder("CreateOneTimePaymentResponse(data=");
        sb.append(oneTimePaymentResponse);
        sb.append(", isSuccessful=");
        sb.append(bool);
        sb.append(", message=");
        sb.append(str);
        sb.append(", statusCode=");
        sb.append(str2);
        sb.append(")");
        String string = sb.toString();
        int i2 = b + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -194990053953781197L;
    }

    private static String $$g(short s, short s2, byte b2) {
        byte[] bArr = $$c;
        int i = (s2 * 4) + 107;
        int i2 = s + 4;
        int i3 = b2 * 2;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i = i2 + (-i);
            i2 = i2;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            int i5 = i2 + 1;
            if (i4 == i3) {
                return new String(bArr2, 0);
            }
            i += -bArr[i5];
            i2 = i5;
        }
    }
}
