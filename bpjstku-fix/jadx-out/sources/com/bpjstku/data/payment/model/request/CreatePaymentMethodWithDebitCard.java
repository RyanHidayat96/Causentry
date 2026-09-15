package com.bpjstku.data.payment.model.request;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\rJV\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\rR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\rR\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\rR\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\rR\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\rR\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010\r"}, d2 = {"Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodWithDebitCard;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodWithDebitCard;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "customerId", "Ljava/lang/String;", "getCustomerId", "channelCode", "getChannelCode", "customerName", "getCustomerName", "mobileNumber", "getMobileNumber", "cardLastFour", "getCardLastFour", "cardExpiry", "getCardExpiry", "email", "getEmail"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreatePaymentMethodWithDebitCard {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @SerializedName("card_expiry")
    private final String cardExpiry;

    @SerializedName("card_last_four")
    private final String cardLastFour;

    @SerializedName("channel_code")
    private final String channelCode;

    @SerializedName("customer_id")
    private final String customerId;

    @SerializedName("customer_name")
    private final String customerName;

    @SerializedName("email")
    private final String email;

    @SerializedName("mobile_number")
    private final String mobileNumber;
    private static final byte[] $$c = {89, 107, -36, -112};
    private static final int $$d = 222;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {90, 46, 113, 8, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 38;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 52
            int r9 = 53 - r9
            int r8 = r8 + 4
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r0 = com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r8 = r9
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard.c(int, short, int, java.lang.Object[]):void");
    }

    public CreatePaymentMethodWithDebitCard(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.customerId = str;
        this.channelCode = str2;
        this.customerName = str3;
        this.mobileNumber = str4;
        this.cardLastFour = str5;
        this.cardExpiry = str6;
        this.email = str7;
    }

    public final String getCustomerId() {
        int i = 2 % 2;
        int i2 = b + 29;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.customerId;
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return str;
    }

    public final String getChannelCode() {
        int i = 2 % 2;
        int i2 = b + 55;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.channelCode;
        }
        throw null;
    }

    public final String getCustomerName() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 101;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.customerName;
        int i5 = i3 + 123;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMobileNumber() {
        String str;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 77;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.mobileNumber;
            int i4 = 75 / 0;
        } else {
            str = this.mobileNumber;
        }
        int i5 = i2 + 123;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getCardLastFour() {
        int i = 2 % 2;
        int i2 = b + 87;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.cardLastFour;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCardExpiry() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 107;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cardExpiry;
        int i5 = i2 + 41;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 117;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 57;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        char c = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i9 = -1;
        if (cArr != null) {
            int i10 = $10 + 53;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i12 = 0;
            while (i12 < length) {
                int i13 = $10 + 79;
                $11 = i13 % 128;
                if (i13 % i2 == 0) {
                    try {
                        Object[] objArr2 = new Object[i5];
                        objArr2[c] = Integer.valueOf(cArr[i12]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i9;
                            byte b3 = (byte) (b2 & 5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 1271, 18 - TextUtils.indexOf("", ""), 407021364, false, $$e(b2, b3, (byte) (b3 - 5)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i12])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 & 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1269 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.lastIndexOf("", '0', 0, 0) + 19, 407021364, false, $$e(b4, b5, (byte) (b5 - 5)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i12++;
                }
                i2 = 2;
                c = 0;
                i5 = 1;
                i9 = -1;
            }
            int i14 = $10 + 39;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr != null) {
            int i16 = $10 + 71;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr4 = new char[i6];
            setvideostabilizationmode.b = 0;
            char c2 = 0;
            while (setvideostabilizationmode.b < i6) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i18 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.lastIndexOf("", '0', 0) + 3226, 13 - (ViewConfiguration.getFadingEdgeLength() >> 16), 2133916302, false, $$e(b6, (byte) (b6 & 6), (byte) 0), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i18] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    int i19 = $11 + 47;
                    $10 = i19 % 128;
                    if (i19 % 2 != 0) {
                        int i20 = 4 / 3;
                    }
                } else {
                    int i21 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0'));
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1755;
                        int maxKeyCode = 23 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte length2 = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, offsetBefore, maxKeyCode, 387247676, false, $$e((byte) (-1), length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i21] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[setvideostabilizationmode.b];
                try {
                    Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (41241 - Gravity.getAbsoluteGravity(0, 0)), View.MeasureSpec.getMode(0) + 1705, (Process.myTid() >> 22) + 21, -1434471773, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            int i22 = $11 + 73;
            $10 = i22 % 128;
            if (i22 % 2 != 0) {
                char[] cArr5 = new char[i6];
                System.arraycopy(cArr3, 1, cArr5, 1, i6);
                System.arraycopy(cArr5, 1, cArr3, i6 % i8, i8);
                i = 0;
                System.arraycopy(cArr5, i8, cArr3, 0, i6 >> i8);
            } else {
                i = 0;
                char[] cArr6 = new char[i6];
                System.arraycopy(cArr3, 0, cArr6, 0, i6);
                int i23 = i6 - i8;
                System.arraycopy(cArr6, 0, cArr3, i23, i8);
                System.arraycopy(cArr6, i8, cArr3, 0, i23);
            }
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i6];
            setvideostabilizationmode.b = i;
            while (setvideostabilizationmode.b < i6) {
                int i24 = $10 + 61;
                $11 = i24 % 128;
                int i25 = i24 % 2;
                cArr7[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr3 = cArr7;
        }
        if (i7 > 0) {
            int i26 = 0;
            while (true) {
                setvideostabilizationmode.b = i26;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i26 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ CreatePaymentMethodWithDebitCard copy$default(CreatePaymentMethodWithDebitCard createPaymentMethodWithDebitCard, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        String str8;
        String str9;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str8 = createPaymentMethodWithDebitCard.customerId;
            int i3 = TuitionPaymentFragmentbindingInflater1 + 73;
            b = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str8 = str;
        }
        if ((i & 2) != 0) {
            str9 = createPaymentMethodWithDebitCard.channelCode;
            int i5 = TuitionPaymentFragmentbindingInflater1 + 123;
            b = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str9 = str2;
        }
        return createPaymentMethodWithDebitCard.copy(str8, str9, (i & 4) != 0 ? createPaymentMethodWithDebitCard.customerName : str3, (i & 8) != 0 ? createPaymentMethodWithDebitCard.mobileNumber : str4, (i & 16) != 0 ? createPaymentMethodWithDebitCard.cardLastFour : str5, (i & 32) != 0 ? createPaymentMethodWithDebitCard.cardExpiry : str6, (i & 64) != 0 ? createPaymentMethodWithDebitCard.email : str7);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 99;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.customerId;
            int i4 = 38 / 0;
        } else {
            str = this.customerId;
        }
        int i5 = i2 + 41;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 117;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.channelCode;
        int i5 = i2 + 33;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = b + 39;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.customerName;
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = b + 71;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.mobileNumber;
        int i4 = i3 + 115;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 61;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cardLastFour;
        int i5 = i2 + 63;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 101;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cardExpiry;
        int i5 = i2 + 31;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 13;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 17;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final CreatePaymentMethodWithDebitCard copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        CreatePaymentMethodWithDebitCard createPaymentMethodWithDebitCard = new CreatePaymentMethodWithDebitCard(p0, p1, p2, p3, p4, p5, p6);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
        b = i2 % 128;
        int i3 = i2 % 2;
        return createPaymentMethodWithDebitCard;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if ((r6 instanceof com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        r6 = (com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.customerId, r6.customerId) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.channelCode, r6.channelCode) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.customerName, r6.customerName) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        r6 = com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard.b + 93;
        com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard.TuitionPaymentFragmentbindingInflater1 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if ((r6 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.mobileNumber, r6.mobileNumber) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.cardLastFour, r6.cardLastFour) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.cardExpiry, r6.cardExpiry) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.email, r6.email) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 77;
        com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard.b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard.TuitionPaymentFragmentbindingInflater1
            int r2 = r1 + 13
            int r3 = r2 % 128
            com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard.b = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 85
            int r2 = r2 / r4
            if (r5 != r6) goto L24
            goto L18
        L16:
            if (r5 != r6) goto L24
        L18:
            int r1 = r1 + 77
            int r6 = r1 % 128
            com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard.b = r6
            int r1 = r1 % r0
            if (r1 == 0) goto L22
            return r3
        L22:
            r6 = 0
            throw r6
        L24:
            boolean r1 = r6 instanceof com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard
            if (r1 != 0) goto L29
            return r4
        L29:
            com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard r6 = (com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard) r6
            java.lang.String r1 = r5.customerId
            java.lang.String r2 = r6.customerId
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L36
            return r4
        L36:
            java.lang.String r1 = r5.channelCode
            java.lang.String r2 = r6.channelCode
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L84
            java.lang.String r1 = r5.customerName
            java.lang.String r2 = r6.customerName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L57
            int r6 = com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard.b
            int r6 = r6 + 93
            int r1 = r6 % 128
            com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard.TuitionPaymentFragmentbindingInflater1 = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L56
            return r3
        L56:
            return r4
        L57:
            java.lang.String r0 = r5.mobileNumber
            java.lang.String r1 = r6.mobileNumber
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L62
            return r4
        L62:
            java.lang.String r0 = r5.cardLastFour
            java.lang.String r1 = r6.cardLastFour
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L6d
            return r4
        L6d:
            java.lang.String r0 = r5.cardExpiry
            java.lang.String r1 = r6.cardExpiry
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L78
            return r4
        L78:
            java.lang.String r0 = r5.email
            java.lang.String r6 = r6.email
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L83
            return r4
        L83:
            return r3
        L84:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 93;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.customerId.hashCode() * 31) + this.channelCode.hashCode()) * 31) + this.customerName.hashCode()) * 31) + this.mobileNumber.hashCode()) * 31) + this.cardLastFour.hashCode()) * 31) + this.cardExpiry.hashCode()) * 31) + this.email.hashCode();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 111;
        b = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.customerId;
        String str2 = this.channelCode;
        String str3 = this.customerName;
        String str4 = this.mobileNumber;
        String str5 = this.cardLastFour;
        String str6 = this.cardExpiry;
        String str7 = this.email;
        StringBuilder sb = new StringBuilder("CreatePaymentMethodWithDebitCard(customerId=");
        sb.append(str);
        sb.append(", channelCode=");
        sb.append(str2);
        sb.append(", customerName=");
        sb.append(str3);
        sb.append(", mobileNumber=");
        sb.append(str4);
        sb.append(", cardLastFour=");
        sb.append(str5);
        sb.append(", cardExpiry=");
        sb.append(str6);
        sb.append(", email=");
        sb.append(str7);
        sb.append(")");
        String string = sb.toString();
        int i2 = b + 33;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(java.lang.Class r34, int r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 2253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard.TuitionPaymentFragmentbindingInflater1(java.lang.Class, int, int, int):java.lang.Object[]");
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{59731, 59834, 59824, 59809, 59796, 59812, 59833, 59832, 59782, 59413, 59435, 59398, 59422, 59439, 59409, 59764, 59401, 59402, 59888, 59405, 59398, 59393, 59404, 59891, 59856, 59887, 59407, 59402, 59403, 59884, 59882, 59406, 59406, 59892, 59699, 59745, 59759, 59753, 59746, 59752, 59732, 59756, 59753, 59745, 59752, 59752, 59770, 59744, 59750, 59768, 59733, 59824, 59831, 59855, 59853, 59836, 59828, 59844, 59852, 59843, 59843, 59852, 59855, 59808, 59803, 59811, 59842, 59850, 59819, 59817, 59828, 59854, 59842, 59855, 59849, 59851, 59708, 59749, 59751, 59749, 59745, 59753, 59757, 59745, 59749, 59771, 59731, 59729, 59770, 59746, 59744, 59769, 59768, 59751};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r7 = 105 - r7
            int r6 = r6 + 4
            byte[] r0 = com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r4 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard.$$e(int, byte, byte):java.lang.String");
    }
}
