package com.bpjstku.data.payment.model.request;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u0011J~\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b$\u0010\u0011R\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u0011R\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u0011R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u0011R\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010\u0011R\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\u0011R\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010\u0011R\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b5\u0010\u0011R\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010&\u001a\u0004\b7\u0010\u0011R\u001a\u00108\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010&\u001a\u0004\b9\u0010\u0011R\u001a\u0010:\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010&\u001a\u0004\b;\u0010\u0011"}, d2 = {"Lcom/bpjstku/data/payment/model/request/PaymentProfile;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/request/PaymentProfile;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodeRef", "Ljava/lang/String;", "getKodeRef", "nik", "getNik", "namaLengkap", "getNamaLengkap", "tglLahir", "getTglLahir", "noHp", "getNoHp", "email", "getEmail", "tipeRekening", "getTipeRekening", "kodePaket", "getKodePaket", "nominal", "getNominal", "kodeIuran", "getKodeIuran", "kodePayment", "getKodePayment"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PaymentProfile {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] b;

    @SerializedName("email")
    private final String email;

    @SerializedName("kodeIuran")
    private final String kodeIuran;

    @SerializedName("kodePaket")
    private final String kodePaket;

    @SerializedName("kodePayment")
    private final String kodePayment;

    @SerializedName("kodeRef")
    private final String kodeRef;

    @SerializedName("namaLengkap")
    private final String namaLengkap;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("noHp")
    private final String noHp;

    @SerializedName("nominal")
    private final String nominal;

    @SerializedName("tglLahir")
    private final String tglLahir;

    @SerializedName("tipeRekening")
    private final String tipeRekening;
    private static final byte[] $$c = {104, 27, -72, 120};
    private static final int $$f = 38;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {21, 65, -9, -121, 44, 7, -2, 12, 24, 10, -38, 40, 22, 2, 23, -7, -7, 44, 7, 17, -3, 5, 11, 23, -37, 54, 8, 13, -5, 23, 5, 16, 9, 3, 8, 25, -33, 47, 15, 11, -9, 23, -1, 12, -42, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
    private static final int $$e = 53;
    private static final byte[] $$a = {87, 51, -85, 78, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$b = 34;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = r6 + 1
            int r5 = r5 * 3
            int r5 = 100 - r5
            int r7 = r7 + 4
            byte[] r1 = com.bpjstku.data.payment.model.request.PaymentProfile.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
        L26:
            int r5 = r5 + r4
            int r5 = r5 + (-5)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.PaymentProfile.a(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.data.payment.model.request.PaymentProfile.$$d
            int r9 = r9 + 4
            int r8 = r8 * 4
            int r8 = r8 + 80
            int r7 = r7 * 11
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2f
        L14:
            r3 = r2
        L15:
            r6 = r9
            r9 = r8
            r8 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2f:
            int r3 = r3 + r8
            int r8 = r3 + (-10)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.PaymentProfile.d(int, short, byte, java.lang.Object[]):void");
    }

    public PaymentProfile(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.kodeRef = str;
        this.nik = str2;
        this.namaLengkap = str3;
        this.tglLahir = str4;
        this.noHp = str5;
        this.email = str6;
        this.tipeRekening = str7;
        this.kodePaket = str8;
        this.nominal = str9;
        this.kodeIuran = str10;
        this.kodePayment = str11;
    }

    public final String getKodeRef() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.kodeRef;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNik() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nik;
        int i5 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return str;
    }

    public final String getNamaLengkap() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.namaLengkap;
        int i5 = i3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTglLahir() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.tglLahir;
        int i5 = i3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNoHp() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.noHp;
            int i4 = 46 / 0;
        } else {
            str = this.noHp;
        }
        int i5 = i2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTipeRekening() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tipeRekening;
        }
        throw null;
    }

    public final String getKodePaket() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.kodePaket;
        int i4 = i2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getNominal() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.nominal;
            int i4 = 94 / 0;
        } else {
            str = this.nominal;
        }
        int i5 = i2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return str;
    }

    public final String getKodeIuran() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.kodeIuran;
        int i5 = i3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getKodePayment() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.kodePayment;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = b;
        int i8 = -1;
        float f = 0.0f;
        if (cArr != null) {
            int i9 = $11 + 13;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr[i11]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i12 = (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 1270;
                        int absoluteGravity = 18 - Gravity.getAbsoluteGravity(i3, i3);
                        byte b2 = (byte) i8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, i12, absoluteGravity, 407021364, false, $$g((byte) 5, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i11++;
                    i3 = 0;
                    i8 = -1;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i5) {
                int i13 = $10 + 79;
                $11 = i13 % 128;
                if (i13 % 2 != 0 ? bArr[setvideostabilizationmode.b] != 1 : bArr[setvideostabilizationmode.b] != 1) {
                    int i14 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char c2 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1756;
                            int i15 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            byte length2 = (byte) $$c.length;
                            byte b3 = (byte) (length2 - 5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iLastIndexOf, i15, 387247676, false, $$g(length2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i16 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3224, (ViewConfiguration.getJumpTapTimeout() >> 16) + 13, 2133916302, false, $$g((byte) ($$f & 31), b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1705, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20, -1434471773, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i17 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i17, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i17);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i18 = 0;
            loop3: while (true) {
                setvideostabilizationmode.b = i18;
                while (true) {
                    if (setvideostabilizationmode.b >= i5) {
                        break loop3;
                    }
                    int i19 = $11 + 11;
                    $10 = i19 % 128;
                    if (i19 % 2 != 0) {
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] * iArr[2]);
                        setvideostabilizationmode.b = setvideostabilizationmode.b;
                    }
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i18 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public final String toString() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i;
        char c;
        int i2 = 2 % 2;
        String str = this.kodeRef;
        String str2 = this.nik;
        String str3 = this.namaLengkap;
        String str4 = this.tglLahir;
        String str5 = this.noHp;
        String str6 = this.email;
        String str7 = this.tipeRekening;
        String str8 = this.kodePaket;
        String str9 = this.nominal;
        String str10 = this.kodeIuran;
        String str11 = this.kodePayment;
        StringBuilder sb = new StringBuilder("PaymentProfile(kodeRef=");
        sb.append(str);
        sb.append(", nik=");
        sb.append(str2);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
            int iMyTid = (Process.myTid() >> 22) + 876;
            int edgeSlop = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte[] bArr = $$a;
            byte b2 = bArr[11];
            Object[] objArr3 = new Object[1];
            a((byte) (b2 + 1), bArr[17], (byte) (b2 - 1), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, iMyTid, edgeSlop, -1199417970, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new int[]{0, 22, 101, 19}, true, null, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new int[]{22, 15, 23, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 876;
            int i3 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9;
            byte b3 = $$a[11];
            byte b4 = b3;
            Object[] objArr6 = new Object[1];
            a(b3, b4, (byte) (b4 | 9), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, keyRepeatDelay, i3, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int tapTimeout = 876 - (ViewConfiguration.getTapTimeout() >> 16);
                int pressedStateDuration = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte[] bArr2 = $$a;
                byte b5 = (byte) (bArr2[11] + 1);
                byte b6 = bArr2[12];
                Object[] objArr7 = new Object[1];
                a(b5, b6, (byte) (b6 + 2), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, tapTimeout, pressedStateDuration, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i4 = ~iMaxMemory;
            int i5 = ((((-521570980) + (((~(iMaxMemory | (-386261751))) | ((~((-141039626) | i4)) | 100729396)) * (-68))) + ((~((-285532355) | i4)) * (-68))) + (((~(386261750 | i4)) | (-426571980)) * 68)) - 1883253263;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new int[]{37, 16, 65, 0}, true, new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new int[]{53, 16, 0, 13}, false, new byte[]{0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1}, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr11 = {Integer.valueOf(iIntValue), -1883253263};
                byte[] bArr3 = $$d;
                byte b7 = bArr3[78];
                Object[] objArr12 = new Object[1];
                d(b7, (byte) (b7 - 1), bArr3[42], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b8 = bArr3[78];
                Object[] objArr13 = new Object[1];
                d((byte) (b8 - 1), b8, bArr3[11], objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 876;
                    int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
                    byte[] bArr4 = $$a;
                    byte b9 = (byte) (bArr4[11] + 1);
                    byte b10 = bArr4[12];
                    Object[] objArr15 = new Object[1];
                    a(b9, b10, (byte) (b10 + 2), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, tapTimeout2, iResolveSizeAndState, 1324201839, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new int[]{0, 22, 101, 19}, true, null, objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new int[]{22, 15, 23, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char tapTimeout3 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int threadPriority = 876 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int offsetAfter = 10 - TextUtils.getOffsetAfter("", 0);
                        byte b11 = $$a[11];
                        byte b12 = b11;
                        Object[] objArr18 = new Object[1];
                        a(b11, b12, (byte) (b12 | 9), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout3, threadPriority, offsetAfter, 254769921, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int edgeSlop2 = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 10;
                        byte[] bArr5 = $$a;
                        byte b13 = bArr5[11];
                        Object[] objArr19 = new Object[1];
                        a((byte) (b13 + 1), bArr5[17], (byte) (b13 - 1), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, edgeSlop2, trimmedLength, -1199417970, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr14;
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
        int i10 = ((int[]) objArr[2])[0];
        int i11 = ((int[]) objArr[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i13 = i12 + (-1941822648) + (((~(80209806 | startUptimeMillis)) | 12649100) * (-502)) + ((~((~startUptimeMillis) | 133169135)) * (-502)) + (((~(startUptimeMillis | (-120520036))) | 80209806) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr20[1])[0] = i15 ^ (i15 << 5);
            c = 0;
            objArr2 = objArr20;
            i = 1;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i16 = 0;
                while (i16 < strArr.length) {
                    int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                    if (i17 % 2 == 0) {
                        arrayList.add(strArr[i16]);
                        i16 += 102;
                    } else {
                        arrayList.add(strArr[i16]);
                        i16++;
                    }
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i18 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i19 = ~(1047240671 | iIdentityHashCode);
            int i20 = i18 + 1462881804 + ((805471234 | i19) * (-476)) + (i19 * 952) + ((~((~iIdentityHashCode) | 1047240671)) * 476);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            i = 1;
            c = 0;
            ((int[]) objArr2[1])[0] = i22 ^ (i22 << 5);
        }
        sb.append(", namaLengkap=");
        sb.append(str3);
        sb.append(", tglLahir=");
        sb.append(str4);
        int i23 = ((int[]) objArr2[i])[c];
        int i24 = ((i23 * i23) - (~(-(338026865 * i23)))) - i;
        int i25 = -(i23 * (-453882521));
        int i26 = (i24 & i25) + (i25 | i24);
        int i27 = ((i26 | 1078236560) << i) - (1078236560 ^ i26);
        int i28 = i27 >> 20;
        int i29 = ((i28 & (-8191)) + (i28 | (-8191))) / 4096;
        int i30 = (i29 ^ 1) + ((i29 & 1) << 1);
        int i31 = -(((((i27 >> 15) - 262143) / 131072) + 1) ^ ((i27 ^ i30) + ((i30 & i27) << 1)));
        int i32 = (i31 & 6) + (i31 | 6);
        int i33 = ((i32 >> 22) - 2047) / 1024;
        sb.append("11|0|23|28|, noHp=".substring(98340 / (((-(((i33 & 1) + (i33 | 1)) + 1)) & i32) * 1490)));
        sb.append(str5);
        sb.append(", email=");
        sb.append(str6);
        sb.append(", tipeRekening=");
        sb.append(str7);
        sb.append(", kodePaket=");
        sb.append(str8);
        sb.append(", nominal=");
        sb.append(str9);
        sb.append(", kodeIuran=");
        sb.append(str10);
        sb.append(", kodePayment=");
        sb.append(str11);
        sb.append(")");
        String string = sb.toString();
        int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i34 % 128;
        int i35 = i34 % 2;
        return string;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ PaymentProfile copy$default(PaymentProfile paymentProfile, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
        String str12;
        String str13;
        String str14;
        String str15;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            str12 = paymentProfile.kodeRef;
        } else {
            str12 = str;
        }
        if ((i & 2) != 0) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            str13 = paymentProfile.nik;
        } else {
            str13 = str2;
        }
        if ((i & 4) != 0) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            if (i7 % 2 != 0) {
                str14 = paymentProfile.namaLengkap;
                int i8 = 9 / 0;
            } else {
                str14 = paymentProfile.namaLengkap;
            }
        } else {
            str14 = str3;
        }
        String str16 = (i & 8) != 0 ? paymentProfile.tglLahir : str4;
        String str17 = (i & 16) != 0 ? paymentProfile.noHp : str5;
        String str18 = (i & 32) != 0 ? paymentProfile.email : str6;
        if ((i & 64) != 0) {
            str15 = paymentProfile.tipeRekening;
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 / 5;
            }
        } else {
            str15 = str7;
        }
        return paymentProfile.copy(str12, str13, str14, str16, str17, str18, str15, (i & 128) != 0 ? paymentProfile.kodePaket : str8, (i & 256) != 0 ? paymentProfile.nominal : str9, (i & 512) != 0 ? paymentProfile.kodeIuran : str10, (i & 1024) != 0 ? paymentProfile.kodePayment : str11);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.kodeRef;
            int i4 = 89 / 0;
        } else {
            str = this.kodeRef;
        }
        int i5 = i2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component10() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 == 0) {
            str = this.kodeIuran;
            int i4 = 77 / 0;
        } else {
            str = this.kodeIuran;
        }
        int i5 = i3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.kodePayment;
        int i5 = i3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.nik;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.namaLengkap;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tglLahir;
        int i5 = i2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.noHp;
        int i5 = i3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.email;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.tipeRekening;
        int i5 = i3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.kodePaket;
        int i4 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return str;
    }

    public final String component9() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.nominal;
            int i4 = 68 / 0;
        } else {
            str = this.nominal;
        }
        int i5 = i2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final PaymentProfile copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p9, "");
        Intrinsics.checkNotNullParameter(p10, "");
        PaymentProfile paymentProfile = new PaymentProfile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return paymentProfile;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PaymentProfile)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = i2 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 58 / 0;
            }
            return false;
        }
        PaymentProfile paymentProfile = (PaymentProfile) p0;
        if (!Intrinsics.areEqual(this.kodeRef, paymentProfile.kodeRef)) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 12 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.nik, paymentProfile.nik) || !Intrinsics.areEqual(this.namaLengkap, paymentProfile.namaLengkap)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tglLahir, paymentProfile.tglLahir)) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.noHp, paymentProfile.noHp))) {
            return Intrinsics.areEqual(this.email, paymentProfile.email) && Intrinsics.areEqual(this.tipeRekening, paymentProfile.tipeRekening) && Intrinsics.areEqual(this.kodePaket, paymentProfile.kodePaket) && Intrinsics.areEqual(this.nominal, paymentProfile.nominal) && Intrinsics.areEqual(this.kodeIuran, paymentProfile.kodeIuran) && Intrinsics.areEqual(this.kodePayment, paymentProfile.kodePayment);
        }
        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((this.kodeRef.hashCode() * 31) + this.nik.hashCode()) * 31) + this.namaLengkap.hashCode()) * 31) + this.tglLahir.hashCode()) * 31) + this.noHp.hashCode()) * 31) + this.email.hashCode()) * 31) + this.tipeRekening.hashCode()) * 31) + this.kodePaket.hashCode()) * 31) + this.nominal.hashCode()) * 31) + this.kodeIuran.hashCode()) * 31) + this.kodePayment.hashCode();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        b = new char[]{59866, 59811, 59865, 59841, 59858, 59859, 59861, 59827, 59800, 59859, 59871, 59800, 59842, 59845, 59871, 59868, 59842, 59864, 59853, 59867, 59843, 59871, 59701, 59787, 59785, 59790, 59788, 59766, 59761, 59769, 59769, 59760, 59784, 59779, 59764, 59766, 59764, 59740, 59809, 59814, 59839, 59836, 59820, 59786, 59776, 59808, 59811, 59820, 59781, 59779, 59815, 59815, 59821, 59708, 59770, 59749, 59749, 59773, 59755, 59743, 59745, 59750, 59742, 59730, 59746, 59759, 59756, 59757, 59759};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, short r8, short r9) {
        /*
            int r7 = 105 - r7
            int r8 = r8 + 4
            int r9 = r9 * 4
            int r9 = r9 + 1
            byte[] r0 = com.bpjstku.data.payment.model.request.PaymentProfile.$$c
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r8 = r9
            r5 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.model.request.PaymentProfile.$$g(short, short, short):java.lang.String");
    }
}
