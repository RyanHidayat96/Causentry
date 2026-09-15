package com.bpjstku.data.asik.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b4\b\u0007\u0018\u00002\u00020\u0001B§\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u0018R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010\u0018R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u0010\u0018R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0016\u001a\u0004\b2\u0010\u0018R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0016\u001a\u0004\b4\u0010\u0018R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0016\u001a\u0004\b6\u0010\u0018"}, d2 = {"Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessOnly;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "email", "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", "transactionId", "getTransactionId", "flData", "getFlData", "brand", "getBrand", "deviceId", "getDeviceId", "model", "getModel", "sdk", "getSdk", "manufacture", "getManufacture", "file", "getFile", "signature", "getSignature", "transactionIdSdk", "getTransactionIdSdk", "scoreLiveness", "getScoreLiveness", "scoreManipulation", "getScoreManipulation", "longitude", "getLongitude", "latitude", "getLatitude", PlaceTypes.LOCALITY, "getLocality"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsikVerificationLivenessOnly extends BaseRequest {
    public static final int $stable = 0;
    private static boolean TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;

    @SerializedName("brand")
    private final String brand;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("email")
    private final String email;

    @SerializedName("file")
    private final String file;

    @SerializedName("flData")
    private final String flData;

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName(PlaceTypes.LOCALITY)
    private final String locality;

    @SerializedName("longitude")
    private final String longitude;

    @SerializedName("manufacture")
    private final String manufacture;

    @SerializedName("model")
    private final String model;

    @SerializedName("scoreLiveness")
    private final String scoreLiveness;

    @SerializedName("scoreManipulation")
    private final String scoreManipulation;

    @SerializedName("sdk")
    private final String sdk;

    @SerializedName("signature")
    private final String signature;

    @SerializedName("transactionId")
    private final String transactionId;

    @SerializedName("transactionIdSdk")
    private final String transactionIdSdk;
    private static final byte[] $$c = {41, 2, 45, -60};
    private static final int $$f = 4;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {81, 125, 2, 46, 8, 25, -39, 51, 13, 14, -4, -21, 57, 9, 11, 7, -3, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -57};
    private static final int $$e = 14;
    private static final byte[] $$a = {81, -102, -70, -91, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 213;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f380a = 0;
    private static int asInterface = 1;
    private static int g = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.data.asik.model.request.AsikVerificationLivenessOnly.$$a
            int r8 = r8 * 52
            int r8 = r8 + 4
            int r9 = r9 * 2
            int r9 = r9 + 84
            int r7 = r7 * 15
            int r7 = r7 + 38
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r8 = r8 + 1
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.request.AsikVerificationLivenessOnly.c(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.data.asik.model.request.AsikVerificationLivenessOnly.$$d
            int r5 = r5 * 39
            int r1 = 53 - r5
            int r7 = r7 * 19
            int r7 = r7 + 84
            int r6 = r6 * 13
            int r6 = 17 - r6
            byte[] r1 = new byte[r1]
            int r5 = 52 - r5
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r5
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r0[r6]
        L2a:
            int r7 = r7 + r3
            int r7 = r7 + (-10)
            int r6 = r6 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.request.AsikVerificationLivenessOnly.e(byte, byte, short, java.lang.Object[]):void");
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = f380a + 47;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.email;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTransactionId() {
        String str;
        int i = 2 % 2;
        int i2 = f380a + 5;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            str = this.transactionId;
            int i4 = 37 / 0;
        } else {
            str = this.transactionId;
        }
        int i5 = i3 + 95;
        f380a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getFlData() {
        int i = 2 % 2;
        int i2 = f380a;
        int i3 = i2 + 17;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.flData;
        int i5 = i2 + 65;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBrand() {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        f380a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.brand;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDeviceId() {
        String str;
        int i = 2 % 2;
        int i2 = f380a + 47;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            str = this.deviceId;
            int i4 = 36 / 0;
        } else {
            str = this.deviceId;
        }
        int i5 = i3 + 79;
        f380a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getModel() {
        int i = 2 % 2;
        int i2 = f380a + 75;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.model;
        int i4 = i3 + 85;
        f380a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getSdk() {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        int i3 = i2 % 128;
        f380a = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.sdk;
        int i4 = i3 + 123;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getManufacture() {
        int i = 2 % 2;
        int i2 = f380a;
        int i3 = i2 + 123;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.manufacture;
        int i4 = i2 + 37;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getFile() {
        int i = 2 % 2;
        int i2 = f380a + 83;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.file;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSignature() {
        String str;
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 119;
        f380a = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.signature;
            int i4 = 26 / 0;
        } else {
            str = this.signature;
        }
        int i5 = i2 + 121;
        f380a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getTransactionIdSdk() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 43;
        f380a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.transactionIdSdk;
        int i5 = i2 + 51;
        f380a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getScoreLiveness() {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        int i3 = i2 % 128;
        f380a = i3;
        int i4 = i2 % 2;
        String str = this.scoreLiveness;
        int i5 = i3 + 119;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AsikVerificationLivenessOnly(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.email = str;
        this.transactionId = str2;
        this.flData = str3;
        this.brand = str4;
        this.deviceId = str5;
        this.model = str6;
        this.sdk = str7;
        this.manufacture = str8;
        this.file = str9;
        this.signature = str10;
        this.transactionIdSdk = str11;
        this.scoreLiveness = str12;
        this.scoreManipulation = str13;
        this.longitude = str14;
        this.latitude = str15;
        this.locality = str16;
    }

    private static void d(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char offsetAfter = (char) (TextUtils.getOffsetAfter("", i3) + 31339);
                        int offsetBefore = TextUtils.getOffsetBefore("", i3) + 2994;
                        int iBlue = 17 - Color.blue(i3);
                        byte b2 = (byte) ($$f - 4);
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, offsetBefore, iBlue, 1182129903, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 0;
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
        try {
            Object[] objArr3 = {Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getMode(0) + 43325), 253 - Color.red(0), 22 - Color.argb(0, 0, 0, 0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            char c = '0';
            int i5 = 1687675375;
            if (TuitionPaymentFragmentbindingInflater1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char mirror = (char) (33650 - AndroidCharacter.getMirror(c));
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3085;
                        int deadChar = 26 - KeyEvent.getDeadChar(0, 0);
                        byte b4 = (byte) ($$f - 4);
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, minimumFlingVelocity, deadChar, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    c = '0';
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i6 = $10 + 65;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 33603);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 3086;
                        int longPressTimeout = 26 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b6 = (byte) ($$f - 4);
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, iLastIndexOf, longPressTimeout, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    i5 = 1687675375;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                int i8 = $10 + 17;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public final String getScoreManipulation() throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = f380a + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) Color.blue(0);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2267;
            int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33;
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, iNormalizeMetaState, i4, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(null, null, 127 - View.MeasureSpec.getSize(0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(null, null, 127 - (ViewConfiguration.getTouchSlop() >> 8), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int i5 = 2267 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int iRed = Color.red(0) + 33;
            byte[] bArr2 = $$a;
            byte b4 = bArr2[5];
            Object[] objArr5 = new Object[1];
            c(b4, b4, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, i5, iRed, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = f380a + 23;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 2267;
                int iIndexOf = 32 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte[] bArr3 = $$a;
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b5, bArr3[40], b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, offsetAfter, iIndexOf, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i8 = ((int[]) objArr7[0])[0];
            int i9 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i10 = (-1393712116) + (((~(iIdentityHashCode | 295165252)) | (-513548064)) * (-465)) + ((295165252 | (~((-513548064) | iIdentityHashCode))) * 930) + ((iIdentityHashCode | (-235405852)) * 465) + 2045265566;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            d(null, null, TextUtils.indexOf((CharSequence) "", '0') + 128, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(null, null, 127 - (Process.myTid() >> 22), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i13 = f380a + 99;
                asInterface = i13 % 128;
                int i14 = i13 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            d(null, null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(null, null, ExpandableListView.getPackedPositionType(0L) + 127, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 2045265566};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[50];
                byte b7 = b6;
                Object[] objArr13 = new Object[1];
                e(b6, b7, b7, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = (byte) (bArr4[50] - 1);
                byte b9 = b8;
                Object[] objArr14 = new Object[1];
                e(b8, b9, b9, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i15 = asInterface + 99;
                    f380a = i15 % 128;
                    int i16 = i15 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 2267;
                        int i17 = 33 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[7];
                        Object[] objArr15 = new Object[1];
                        c(b10, bArr5[40], b10, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode, iNormalizeMetaState2, i17, -654680577, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        d(null, null, Process.getGidForName("") + 128, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        d(null, null, View.MeasureSpec.getSize(0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                            int absoluteGravity = 2267 - Gravity.getAbsoluteGravity(0, 0);
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 33;
                            byte[] bArr6 = $$a;
                            byte b11 = bArr6[5];
                            Object[] objArr18 = new Object[1];
                            c(b11, b11, bArr6[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, absoluteGravity, iResolveOpacity, -874156483, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                            int i18 = 2268 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i19 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 33;
                            byte[] bArr7 = $$a;
                            byte b12 = bArr7[5];
                            byte b13 = bArr7[7];
                            Object[] objArr19 = new Object[1];
                            c(b12, b13, b13, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, i18, i19, -887667012, false, (String) objArr19[0], null);
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
        int i20 = ((int[]) objArr[c])[0];
        int i21 = ((int[]) objArr[0])[0];
        if (i21 == i20) {
            int i22 = asInterface + 55;
            f380a = i22 % 128;
            int i23 = i22 % 2;
            Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[0])[0];
            int i26 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i27 = i24 + (-1753310829) + (((~((-700471812) | iIdentityHashCode2)) | 4194816) * 1504) + ((~(iIdentityHashCode2 | (-696276996))) * (-1504)) + 547988176;
            int i28 = i27 ^ (i27 << 13);
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr20[2])[0] = i29 ^ (i29 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i30 = 0;
                while (i30 < strArr3.length) {
                    int i31 = asInterface + 109;
                    f380a = i31 % 128;
                    if (i31 % 2 != 0) {
                        arrayList.add(strArr3[i30]);
                        i30 += 100;
                    } else {
                        arrayList.add(strArr3[i30]);
                        i30++;
                    }
                }
            }
            int[] iArr = new int[i21];
            int i32 = i21 - 1;
            iArr[i32] = 1;
            Toast.makeText((Context) null, iArr[((i21 * i32) % 2) - 1], 1).show();
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[0])[0];
            int i35 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i36 = ~startUptimeMillis;
            int i37 = i33 + 1352867650 + (((~(i36 | 387347038)) | 421366277) * (-1042)) + ((387347038 | startUptimeMillis) * 521) + (((~(startUptimeMillis | (-421366278))) | 286523908 | (~(i36 | 522189407))) * 521);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr21[2])[0] = i39 ^ (i39 << 5);
        }
        return this.scoreManipulation;
    }

    public final String getLongitude() {
        int i = 2 % 2;
        int i2 = f380a + 17;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.longitude;
        int i5 = i3 + 29;
        f380a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLatitude() {
        String str;
        int i = 2 % 2;
        int i2 = asInterface + 91;
        int i3 = i2 % 128;
        f380a = i3;
        if (i2 % 2 != 0) {
            str = this.latitude;
            int i4 = 26 / 0;
        } else {
            str = this.latitude;
        }
        int i5 = i3 + 109;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLocality() {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        int i3 = i2 % 128;
        f380a = i3;
        int i4 = i2 % 2;
        String str = this.locality;
        int i5 = i3 + 63;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        b();
        int i = g + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{47404, 47455, 47401, 47451, 47454, 47396, 47391, 47450, 47418, 47444, 47449, 47400, 47392, 47370, 47393, 47402, 47394, 47453, 47419, 47372, 47447, 47417, 47397, 47448, 47395, 47398, 47365};
        b = 2047719629;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        TuitionPaymentFragmentbindingInflater1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, int r8) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = r7 + 67
            byte[] r1 = com.bpjstku.data.asik.model.request.AsikVerificationLivenessOnly.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.asik.model.request.AsikVerificationLivenessOnly.$$g(short, int, int):java.lang.String");
    }
}
