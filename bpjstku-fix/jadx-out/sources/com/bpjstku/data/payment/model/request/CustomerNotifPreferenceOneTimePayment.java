package com.bpjstku.data.payment.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJP\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/payment/model/request/CustomerNotifPreferenceOneTimePayment;", "", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/bpjstku/data/payment/model/request/CustomerNotifPreferenceOneTimePayment;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "invoiceCreated", "Ljava/util/List;", "getInvoiceCreated", "invoiceReminder", "getInvoiceReminder", "invoicePaid", "getInvoicePaid", "invoiceExpired", "getInvoiceExpired"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CustomerNotifPreferenceOneTimePayment {
    public static final int $stable = 8;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @SerializedName("invoice_created")
    private final List<String> invoiceCreated;

    @SerializedName("invoice_expired")
    private final List<String> invoiceExpired;

    @SerializedName("invoice_paid")
    private final List<String> invoicePaid;

    @SerializedName("invoice_reminder")
    private final List<String> invoiceReminder;
    private static final byte[] $$c = {23, -73, 107, 5};
    private static final int $$f = 208;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {57, -56, 23, -36, 2, 25, 2, 15, 10, 32, 11, 20, -24, 40, -18, 47, 10, 20, 0, 8, 14, -8, 47, 0, 30, 0, 9, 31, -23, 47, 10, 1, 8, 15, 15, -38, 60, 26, 3, 27, 10, 7, 8, 33, -8, 11, 25, 5, 26, -4, 34, 0, 9, 31, -22, 30, 32, 9, 14, 10, 0, -2, 32, 9, 31, -33, 49, 16, 9, 6, 21, 5, 22, 19, -6, 32, 2, 19, 12, -61, Base64.padSymbol, 46, 1, 24, 2, 19, 12, -17, 30, 37, 1, 5, 22, 19, -33, 57, -4, 19, 19, 5, 22, 19, -5, 20, 18, 3, 18, 18, 6, -17, 50, 5, 19, 2, 32, -2, 26, -52, 46, 1, 24, 2, 19, 12, -17, 30, 37, 1, 5, 22, 19, -33, 57, -4, 19, 19, 5, 22, 19, 12, 10, 2, 11, 19, 5, 24, 10, 18, 11, 10, 18, 4, 12, 31, 0, 9, 31, -29, 47, 2, 14, 20, 5, 14, 14, 8, 33, 4, 21, -52};
    private static final int $$e = 228;
    private static final byte[] $$a = {33, -59, 107, -108, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 41;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 52
            int r8 = 56 - r8
            int r6 = 103 - r6
            byte[] r0 = com.bpjstku.data.payment.model.request.CustomerNotifPreferenceOneTimePayment.$$a
            int r7 = r7 * 52
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            int r6 = r6 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.CustomerNotifPreferenceOneTimePayment.a(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 24
            int r7 = 108 - r7
            int r8 = r8 * 62
            int r0 = 115 - r8
            byte[] r1 = com.bpjstku.data.payment.model.request.CustomerNotifPreferenceOneTimePayment.$$d
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r8 = 114 - r8
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L30
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r3 = r3 + r6
            int r6 = r3 + (-13)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.CustomerNotifPreferenceOneTimePayment.d(int, int, byte, java.lang.Object[]):void");
    }

    public CustomerNotifPreferenceOneTimePayment(List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.invoiceCreated = list;
        this.invoiceReminder = list2;
        this.invoicePaid = list3;
        this.invoiceExpired = list4;
    }

    public final List<String> getInvoiceCreated() {
        List<String> list;
        int i = 2 % 2;
        int i2 = b + 63;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 == 0) {
            list = this.invoiceCreated;
            int i4 = 50 / 0;
        } else {
            list = this.invoiceCreated;
        }
        int i5 = i3 + 49;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<String> getInvoiceReminder() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.invoiceReminder;
        int i5 = i2 + 59;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<String> getInvoicePaid() {
        int i = 2 % 2;
        int i2 = b + 59;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        List<String> list = this.invoicePaid;
        int i5 = i3 + 21;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final List<String> getInvoiceExpired() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.invoiceExpired;
        int i5 = i2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = -1870535734;
        float f = 0.0f;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 99;
                $10 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr2[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i6;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (MotionEvent.axisFromString("") + 1), 3291 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), 32 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1948206109, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i2 = 2;
                    i4 = -1870535734;
                    f = 0.0f;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        char c = '0';
        if (iArr5 != null) {
            int i10 = $10 + 105;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr3 = new Object[i5];
                objArr3[0] = Integer.valueOf(iArr5[i12]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3291;
                    int iLastIndexOf = TextUtils.lastIndexOf("", c, 0) + 32;
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity, scrollBarFadeDuration, iLastIndexOf, 1948206109, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i12++;
                int i13 = $11 + 115;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                iArr5 = iArr5;
                c = '0';
                i5 = 1;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        int i15 = 2;
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i16 = $11 + 15;
            $10 = i16 % 128;
            int i17 = i16 % i15;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i18 = 17;
            for (int i19 = 1; i18 > i19; i19 = 1) {
                int i20 = $10 + 21;
                $11 = i20 % 128;
                if (i20 % 2 == 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i18];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), Drawable.resolveOpacity(0, 0) + 2559, 29 - Color.blue(0), 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i18 += 113;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i18];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 2559, 29 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 683220507, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                    i18--;
                }
            }
            int i21 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i22 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28879 - ((Process.getThreadPriority(0) + 20) >> 6)), 349 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 25 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i15 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final List<String> component1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 876;
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 10;
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[19] - 1);
            byte b3 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, longPressTimeout, packedPositionGroup, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{1664188970, -2129517299, 1129180016, -73124152, 1548255830, 851784899, 1206806081, 325765132, -96439739, 713717063, -7243833, -740925295, 1151929150, -1795697268}, (ViewConfiguration.getPressedStateDuration() >> 16) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{-1915246658, -343342268, 1066502890, -493222637, 1222750928, -1001095927, 1342488707, 1562876272, 306146188, -88281626}, 15 - KeyEvent.keyCodeFromString(""), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
            int iNormalizeMetaState = 10 - KeyEvent.normalizeMetaState(0);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr2[10], bArr2[7], bArr2[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetAfter, maximumFlingVelocity, iNormalizeMetaState, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = b + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                int pressedStateDuration = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b4, bArr3[5], b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask, pressedStateDuration, keyRepeatTimeout, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = ((((((~(18956083 | i6)) | (~((-59266313) | iIdentityHashCode))) | (~(i6 | 59266312))) * 959) - 2046870629) + (((~(iIdentityHashCode | 59266312)) | ((~(i6 | (-59266313))) | (~(18956083 | iIdentityHashCode)))) * 959)) - 2002433790;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{1448821896, 2031243007, -1998700294, 1884626092, 302549852, -524078719, -1130932472, 270236830, -1887653979, -867106551, 600582353, -462603457, 2038651921, 1244606058, 1137501397, 1706023166}, TextUtils.indexOf("", "", 0) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{85297310, -293251612, -447717959, 760973153, 1352244853, -826064023, -1906789457, -582018319, 1146905185, -1722289166, 2054421500, 1829733469}, 18 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new int[]{44085975, 1558444585, 1768968249, 1354850027, -2096235727, -699436600, 496411987, -669993784, -258324203, -248643702}, 16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{227635411, 1602239387, 668470358, 1744620865, -1334128642, -61999771, 1458930553, -527471172, -1744039925, -1251436922}, 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i10 = b + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), -2002433790};
                byte[] bArr4 = $$d;
                byte b5 = (byte) (-bArr4[31]);
                byte b6 = bArr4[18];
                Object[] objArr13 = new Object[1];
                d(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr4[31];
                Object[] objArr14 = new Object[1];
                d((byte) 113, b7, b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i12 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        a(b8, bArr5[5], b8, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatDelay, i12, windowTouchSlop, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new int[]{1664188970, -2129517299, 1129180016, -73124152, 1548255830, 851784899, 1206806081, 325765132, -96439739, 713717063, -7243833, -740925295, 1151929150, -1795697268}, KeyEvent.getDeadChar(0, 0) + 22, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new int[]{-1915246658, -343342268, 1066502890, -493222637, 1222750928, -1001095927, 1342488707, 1562876272, 306146188, -88281626}, View.resolveSize(0, 0) + 15, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int iGreen = 876 - Color.green(0);
                            int bitsPerPixel = 9 - ImageFormat.getBitsPerPixel(0);
                            byte[] bArr6 = $$a;
                            Object[] objArr19 = new Object[1];
                            a(bArr6[10], bArr6[7], bArr6[5], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout, iGreen, bitsPerPixel, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                            int i13 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
                            int i14 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9;
                            byte[] bArr7 = $$a;
                            byte b9 = (byte) (bArr7[19] - 1);
                            byte b10 = bArr7[5];
                            Object[] objArr20 = new Object[1];
                            a(b9, b10, b10, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, i13, i14, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i15 = ((int[]) objArr[2])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 != i15) {
            throw new RuntimeException(String.valueOf(i16));
        }
        int i17 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i18 = i17 + 1978116576 + ((~((-2157108) | iElapsedRealtime)) * (-301)) + (((~(204929847 | iElapsedRealtime)) | (~((~iElapsedRealtime) | 245240076))) * (-301)) + (((~(iElapsedRealtime | (-245240077))) | 204929847) * 301);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr21[1])[0] = i20 ^ (i20 << 5);
        int i21 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
        int i22 = i21 % 2;
        return this.invoiceCreated;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        b();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomerNotifPreferenceOneTimePayment copy$default(CustomerNotifPreferenceOneTimePayment customerNotifPreferenceOneTimePayment, List list, List list2, List list3, List list4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            list = customerNotifPreferenceOneTimePayment.invoiceCreated;
        }
        if ((i & 2) != 0) {
            int i3 = b + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            list2 = customerNotifPreferenceOneTimePayment.invoiceReminder;
        }
        if ((i & 4) != 0) {
            list3 = customerNotifPreferenceOneTimePayment.invoicePaid;
            int i5 = b + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 8) != 0) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i8 = i7 + 123;
            b = i8 % 128;
            int i9 = i8 % 2;
            List<String> list5 = customerNotifPreferenceOneTimePayment.invoiceExpired;
            int i10 = i7 + 113;
            b = i10 % 128;
            int i11 = i10 % 2;
            list4 = list5;
        }
        return customerNotifPreferenceOneTimePayment.copy(list, list2, list3, list4);
    }

    public final List<String> component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 103;
        b = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.invoiceReminder;
        int i5 = i2 + 31;
        b = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<String> component3() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.invoicePaid;
        int i5 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<String> component4() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.invoiceExpired;
        int i5 = i2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final CustomerNotifPreferenceOneTimePayment copy(List<String> p0, List<String> p1, List<String> p2, List<String> p3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        CustomerNotifPreferenceOneTimePayment customerNotifPreferenceOneTimePayment = new CustomerNotifPreferenceOneTimePayment(p0, p1, p2, p3);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return customerNotifPreferenceOneTimePayment;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 47;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (this == p0) {
            int i6 = i4 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(p0 instanceof CustomerNotifPreferenceOneTimePayment)) {
            int i8 = i2 + 123;
            b = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        CustomerNotifPreferenceOneTimePayment customerNotifPreferenceOneTimePayment = (CustomerNotifPreferenceOneTimePayment) p0;
        if (!Intrinsics.areEqual(this.invoiceCreated, customerNotifPreferenceOneTimePayment.invoiceCreated) || (!Intrinsics.areEqual(this.invoiceReminder, customerNotifPreferenceOneTimePayment.invoiceReminder))) {
            return false;
        }
        if (Intrinsics.areEqual(this.invoicePaid, customerNotifPreferenceOneTimePayment.invoicePaid)) {
            return Intrinsics.areEqual(this.invoiceExpired, customerNotifPreferenceOneTimePayment.invoiceExpired);
        }
        int i10 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.invoiceCreated.hashCode() * 31) + this.invoiceReminder.hashCode()) * 31) + this.invoicePaid.hashCode()) * 31) + this.invoiceExpired.hashCode();
        int i4 = b + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        List<String> list = this.invoiceCreated;
        List<String> list2 = this.invoiceReminder;
        List<String> list3 = this.invoicePaid;
        List<String> list4 = this.invoiceExpired;
        StringBuilder sb = new StringBuilder("CustomerNotifPreferenceOneTimePayment(invoiceCreated=");
        sb.append(list);
        sb.append(", invoiceReminder=");
        sb.append(list2);
        sb.append(", invoicePaid=");
        sb.append(list3);
        sb.append(", invoiceExpired=");
        sb.append(list4);
        sb.append(")");
        String string = sb.toString();
        int i2 = b + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new int[]{-1422354481, -1112463659, 228095377, 1702864989, 868506966, 1492339895, 1609557600, -1994724442, 1416840136, -481851395, 2052435761, -1980038502, -878012640, 1932477983, 1937676309, 1551606229, 1096421780, 1611476920};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, byte r6, byte r7) {
        /*
            int r5 = r5 * 2
            int r0 = r5 + 1
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r6 = r6 * 56
            int r6 = 122 - r6
            byte[] r1 = com.bpjstku.data.payment.model.request.CustomerNotifPreferenceOneTimePayment.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r6
            r3 = r2
            r6 = r5
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
        L27:
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.CustomerNotifPreferenceOneTimePayment.$$g(short, byte, byte):java.lang.String");
    }
}
