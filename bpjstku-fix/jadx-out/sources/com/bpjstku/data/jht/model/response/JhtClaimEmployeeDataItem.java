package com.bpjstku.data.jht.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.autofill.HintConstants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b$\u0010\u0018J\u0010\u0010%\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b%\u0010\u0018J\u0010\u0010&\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b&\u0010\u0018J\u0010\u0010'\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b(\u0010\u0018J\u0010\u0010)\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b)\u0010\u0018JÄ\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020,2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b2\u0010\u0018R\"\u00103\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u00107R\"\u00108\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00104\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u00107R\"\u0010;\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u00104\u001a\u0004\b<\u0010\u0018\"\u0004\b=\u00107R\"\u0010>\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u00104\u001a\u0004\b?\u0010\u0018\"\u0004\b@\u00107R\"\u0010A\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u00104\u001a\u0004\bB\u0010\u0018\"\u0004\bC\u00107R\"\u0010D\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u00104\u001a\u0004\bE\u0010\u0018\"\u0004\bF\u00107R\"\u0010G\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u00104\u001a\u0004\bH\u0010\u0018\"\u0004\bI\u00107R\"\u0010J\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u00104\u001a\u0004\bK\u0010\u0018\"\u0004\bL\u00107R\"\u0010M\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u00104\u001a\u0004\bN\u0010\u0018\"\u0004\bO\u00107R\"\u0010P\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u00104\u001a\u0004\bQ\u0010\u0018\"\u0004\bR\u00107R\"\u0010S\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bS\u00104\u001a\u0004\bT\u0010\u0018\"\u0004\bU\u00107R\"\u0010V\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u00104\u001a\u0004\bW\u0010\u0018\"\u0004\bX\u00107R\"\u0010Y\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u00104\u001a\u0004\bZ\u0010\u0018\"\u0004\b[\u00107R\"\u0010\\\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\\\u00104\u001a\u0004\b]\u0010\u0018\"\u0004\b^\u00107R\"\u0010_\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b_\u00104\u001a\u0004\b`\u0010\u0018\"\u0004\ba\u00107R\"\u0010b\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bb\u00104\u001a\u0004\bc\u0010\u0018\"\u0004\bd\u00107R\"\u0010e\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\be\u00104\u001a\u0004\bf\u0010\u0018\"\u0004\bg\u00107R\"\u0010h\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bh\u00104\u001a\u0004\bi\u0010\u0018\"\u0004\bj\u00107"}, d2 = {"Lcom/bpjstku/data/jht/model/response/JhtClaimEmployeeDataItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/response/JhtClaimEmployeeDataItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "bankCode", "Ljava/lang/String;", "getBankCode", "setBankCode", "(Ljava/lang/String;)V", PlaceTypes.ADDRESS, "getAddress", "setAddress", "kpj", "getKpj", "setKpj", HintConstants.AUTOFILL_HINT_GENDER, "getGender", "setGender", "motherName", "getMotherName", "setMotherName", "npwp", "getNpwp", "setNpwp", "fullName", "getFullName", "setFullName", "bankName", "getBankName", "setBankName", "accountBankNumber", "getAccountBankNumber", "setAccountBankNumber", "accountBankName", "getAccountBankName", "setAccountBankName", "birthDate", "getBirthDate", "setBirthDate", "birthPlace", "getBirthPlace", "setBirthPlace", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "getPhoneNumber", "setPhoneNumber", "flagSipp", "getFlagSipp", "setFlagSipp", "identityNumber", "getIdentityNumber", "setIdentityNumber", "validIdentity", "getValidIdentity", "setValidIdentity", "maritalStatus", "getMaritalStatus", "setMaritalStatus", "email", "getEmail", "setEmail"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtClaimEmployeeDataItem {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static long TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @SerializedName("accountBankName")
    private String accountBankName;

    @SerializedName("accountBankNumber")
    private String accountBankNumber;

    @SerializedName(PlaceTypes.ADDRESS)
    private String address;

    @SerializedName("bankCode")
    private String bankCode;

    @SerializedName("bankName")
    private String bankName;

    @SerializedName("birthDate")
    private String birthDate;

    @SerializedName("birthPlace")
    private String birthPlace;

    @SerializedName("email")
    private String email;

    @SerializedName("flagSipp")
    private String flagSipp;

    @SerializedName("fullName")
    private String fullName;

    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    private String gender;

    @SerializedName("identityNumber")
    private String identityNumber;

    @SerializedName("kpj")
    private String kpj;

    @SerializedName("maritalStatus")
    private String maritalStatus;

    @SerializedName("motherName")
    private String motherName;

    @SerializedName("npwp")
    private String npwp;

    @SerializedName(HintConstants.AUTOFILL_HINT_PHONE_NUMBER)
    private String phoneNumber;

    @SerializedName("validIdentity")
    private String validIdentity;
    private static final byte[] $$d = {88, ByteCompanionObject.MAX_VALUE, -112, -47, -58, -6, -9, -3, -6, 17, -21, -9, -25, 34, -45, -14, 7, -17, -14, 43, -55, -1, 47, -9, -30, -44, -11, -4, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 59};
    private static final int $$e = 62;
    private static final byte[] $$a = {8, -36, 87, -65, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 176;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 1
            int r5 = r5 + 84
            int r7 = r7 * 52
            int r7 = 56 - r7
            byte[] r0 = com.bpjstku.data.jht.model.response.JhtClaimEmployeeDataItem.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.model.response.JhtClaimEmployeeDataItem.a(short, byte, short, java.lang.Object[]):void");
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
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 24
            int r6 = 28 - r6
            byte[] r0 = com.bpjstku.data.jht.model.response.JhtClaimEmployeeDataItem.$$d
            int r7 = r7 * 28
            int r1 = 53 - r7
            int r8 = r8 * 17
            int r8 = r8 + 67
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r8 = r6
            r3 = r7
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r8 = r8 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.jht.model.response.JhtClaimEmployeeDataItem.d(short, short, byte, java.lang.Object[]):void");
    }

    public JhtClaimEmployeeDataItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
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
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        this.bankCode = str;
        this.address = str2;
        this.kpj = str3;
        this.gender = str4;
        this.motherName = str5;
        this.npwp = str6;
        this.fullName = str7;
        this.bankName = str8;
        this.accountBankNumber = str9;
        this.accountBankName = str10;
        this.birthDate = str11;
        this.birthPlace = str12;
        this.phoneNumber = str13;
        this.flagSipp = str14;
        this.identityNumber = str15;
        this.validIdentity = str16;
        this.maritalStatus = str17;
        this.email = str18;
    }

    public final String getBankCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.bankCode;
        int i5 = i3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setBankCode(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.bankCode = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.bankCode = str;
        int i3 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String getAddress() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.address;
        int i4 = i2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void setAddress(String str) {
        int i = 2 % 2;
        int i2 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.address = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
        int i3 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String getKpj() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.kpj;
        int i5 = i3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return str;
    }

    public final void setKpj(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.kpj = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.kpj = str;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 77 / 0;
        }
    }

    public final String getGender() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.gender;
        int i5 = i2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setGender(String str) {
        int i = 2 % 2;
        int i2 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.gender = str;
        int i4 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getMotherName() {
        String str;
        int i = 2 % 2;
        int i2 = b + 119;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 == 0) {
            str = this.motherName;
            int i4 = 22 / 0;
        } else {
            str = this.motherName;
        }
        int i5 = i3 + 65;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setMotherName(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.motherName = str;
            int i3 = 55 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.motherName = str;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final String getNpwp() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.npwp;
        int i5 = i2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setNpwp(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.npwp = str;
            int i3 = 58 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.npwp = str;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final String getFullName() {
        int i = 2 % 2;
        int i2 = b + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.fullName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setFullName(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.fullName = str;
        int i4 = b + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
    }

    public final String getBankName() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.bankName;
        int i4 = i2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void setBankName(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.bankName = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.bankName = str;
        int i3 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String getAccountBankNumber() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.accountBankNumber;
        int i5 = i3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0198  */
    /* JADX WARN: Code duplicated, block: B:42:0x0199  */
    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (true) {
            obj = null;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 2624 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (Process.myPid() >> 22) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 39423), (ViewConfiguration.getEdgeSlop() >> 16) + 481, 37 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i4 = $11 + 39;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 % 5;
        }
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 15;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 39422), TextUtils.lastIndexOf("", '0', 0) + 482, 37 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 39423), 481 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
        int i7 = $11 + 67;
        $10 = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void setAccountBankNumber(String str) {
        int i;
        int length;
        Object[] objArr;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 877;
            int i3 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((byte) 14, bArr[7], (byte) (-bArr[5]), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, iIndexOf, i3, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{45833, 65163, 10262, 23485, 34099, 12480, 25154, 44445, 57199, 2798, 46276, 58932, 4493, 17202, 36522, 14414, 27605, 38262, 49390, 29296, 48143, 61330}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19853, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{45837, 15343, 41695, 10713, 37047, 8090, 34446, 3415, 62549, 25418, 59946, 20741, 55301, 16618, 53207}, 35051 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i4 = 877 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0');
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            byte b3 = (byte) (-bArr2[5]);
            Object[] objArr5 = new Object[1];
            a(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, i4, iLastIndexOf, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int iLastIndexOf2 = 875 - TextUtils.lastIndexOf("", '0');
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 10;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[54];
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, iLastIndexOf2, offsetAfter, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i5 = ~startElapsedRealtime;
            int i6 = 831009524 + ((~(195849575 | i5)) * (-560)) + ((~(startElapsedRealtime | 200114167)) * (-560)) + (((~((-155539347) | i5)) | 151274754) * 560) + 618713373;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            int i9 = b + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{45833, 19951, 20190, 20385, 18595, 18828, 19066, 19225, 17473, 17705, 17922, 18245, 16837, 17118, 17314, 23718, 23950, 24184, 24446, 22618, 22792, 23069, 23324, 21986, 22225, 22477}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 65257, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{45835, 64324, 9128, 27153, 37481, 55995, 266, 18758, 61904, 14393, 24702, 43218, 55079, 8076, 18370, 36406, 13975, 32495}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18522, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            if (str != null) {
                int i11 = b + 75;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                if (i11 % 2 == 0) {
                    length = str.length();
                    int i12 = 23 / 0;
                } else {
                    length = str.length();
                }
                i = 2;
            } else {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                b = i13 % 128;
                i = 2;
                int i14 = i13 % 2;
                length = 0;
            }
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
            b = i15 % 128;
            int i16 = i15 % i;
            try {
                Object[] objArr10 = new Object[3];
                objArr10[i] = 618713373;
                objArr10[1] = Integer.valueOf(length);
                objArr10[0] = applicationContext;
                byte[] bArr4 = $$d;
                byte b6 = bArr4[61];
                Object[] objArr11 = new Object[1];
                d(b6, b6, bArr4[38], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr4[38];
                Object[] objArr12 = new Object[1];
                d(b7, b7, bArr4[61], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
                    b = i17 % 128;
                    int i18 = i17 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int gidForName = Process.getGidForName("") + 877;
                        int iRed = 10 - Color.red(0);
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[54];
                        byte b9 = bArr5[7];
                        Object[] objArr14 = new Object[1];
                        a(b8, b9, b9, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, gidForName, iRed, 256017550, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        c(new char[]{45833, 65163, 10262, 23485, 34099, 12480, 25154, 44445, 57199, 2798, 46276, 58932, 4493, 17202, 36522, 14414, 27605, 38262, 49390, 29296, 48143, 61330}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19853, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        c(new char[]{45837, 15343, 41695, 10713, 37047, 8090, 34446, 3415, 62549, 25418, 59946, 20741, 55301, 16618, 53207}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 35051, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                            int packedPositionGroup = 876 - ExpandableListView.getPackedPositionGroup(0L);
                            int iMyPid = (Process.myPid() >> 22) + 10;
                            byte[] bArr6 = $$a;
                            byte b10 = bArr6[7];
                            byte b11 = (byte) (-bArr6[5]);
                            Object[] objArr17 = new Object[1];
                            a(b10, b11, b11, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, packedPositionGroup, iMyPid, 2009631821, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 876;
                            int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                            byte[] bArr7 = $$a;
                            Object[] objArr18 = new Object[1];
                            a((byte) 14, bArr7[7], (byte) (-bArr7[5]), objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, iIndexOf2, minimumFlingVelocity2, 252381699, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr13;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i19 = ((int[]) objArr[1])[0];
        Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
        int i20 = ~startElapsedRealtime2;
        int i21 = i19 + (-8767230) + (((~((-1070283490) | i20)) | 1029973260) * (-865)) + ((~(startElapsedRealtime2 | 1070283489)) * 865) + (((~(1029973260 | i20)) | (~(i20 | 1070283489))) * 865);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr19[1])[0] = i23 ^ (i23 << 5);
        this.accountBankNumber = str;
    }

    public final String getAccountBankName() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 113;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountBankName;
        int i5 = i2 + 95;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setAccountBankName(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.accountBankName = str;
        int i4 = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getBirthDate() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.birthDate;
        int i5 = i2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setBirthDate(String str) {
        int i = 2 % 2;
        int i2 = b + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.birthDate = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.birthDate = str;
            throw null;
        }
    }

    public final String getBirthPlace() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.birthPlace;
        }
        throw null;
    }

    public final void setBirthPlace(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.birthPlace = str;
        int i4 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.phoneNumber;
        int i5 = i3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return str;
    }

    public final void setPhoneNumber(String str) {
        int i = 2 % 2;
        int i2 = b + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.phoneNumber = str;
        int i4 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
    }

    public final String getFlagSipp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.flagSipp;
        }
        throw null;
    }

    public final void setFlagSipp(String str) {
        int i = 2 % 2;
        int i2 = b + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.flagSipp = str;
        int i4 = b + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getIdentityNumber() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        String str = this.identityNumber;
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return str;
    }

    public final void setIdentityNumber(String str) {
        int i = 2 % 2;
        int i2 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.identityNumber = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.identityNumber = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String getValidIdentity() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.validIdentity;
        }
        throw null;
    }

    public final void setValidIdentity(String str) {
        int i = 2 % 2;
        int i2 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.validIdentity = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.validIdentity = str;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String getMaritalStatus() {
        String str;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.maritalStatus;
            int i4 = 97 / 0;
        } else {
            str = this.maritalStatus;
        }
        int i5 = i2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setMaritalStatus(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.maritalStatus = str;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 5;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.email;
        int i5 = i2 + 75;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setEmail(String str) {
        int i = 2 % 2;
        int i2 = b + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.email = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.email = str;
            int i3 = 85 / 0;
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 72 / 0;
        }
    }

    public static /* synthetic */ JhtClaimEmployeeDataItem copy$default(JhtClaimEmployeeDataItem jhtClaimEmployeeDataItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, Object obj) {
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        int i2 = 2 % 2;
        String str27 = (i & 1) != 0 ? jhtClaimEmployeeDataItem.bankCode : str;
        String str28 = (i & 2) != 0 ? jhtClaimEmployeeDataItem.address : str2;
        String str29 = (i & 4) != 0 ? jhtClaimEmployeeDataItem.kpj : str3;
        if ((i & 8) != 0) {
            int i3 = b + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            str19 = jhtClaimEmployeeDataItem.gender;
        } else {
            str19 = str4;
        }
        String str30 = (i & 16) != 0 ? jhtClaimEmployeeDataItem.motherName : str5;
        String str31 = (i & 32) != 0 ? jhtClaimEmployeeDataItem.npwp : str6;
        String str32 = (i & 64) != 0 ? jhtClaimEmployeeDataItem.fullName : str7;
        if ((i & 128) != 0) {
            int i5 = b + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            str20 = jhtClaimEmployeeDataItem.bankName;
        } else {
            str20 = str8;
        }
        String str33 = (i & 256) != 0 ? jhtClaimEmployeeDataItem.accountBankNumber : str9;
        if ((i & 512) != 0) {
            int i7 = b + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
            str21 = jhtClaimEmployeeDataItem.accountBankName;
        } else {
            str21 = str10;
        }
        String str34 = (i & 1024) != 0 ? jhtClaimEmployeeDataItem.birthDate : str11;
        String str35 = (i & 2048) != 0 ? jhtClaimEmployeeDataItem.birthPlace : str12;
        Object obj2 = null;
        if ((i & 4096) != 0) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
            b = i9 % 128;
            if (i9 % 2 != 0) {
                String str36 = jhtClaimEmployeeDataItem.phoneNumber;
                obj2.hashCode();
                throw null;
            }
            str22 = jhtClaimEmployeeDataItem.phoneNumber;
        } else {
            str22 = str13;
        }
        String str37 = (i & 8192) != 0 ? jhtClaimEmployeeDataItem.flagSipp : str14;
        if ((i & 16384) != 0) {
            int i10 = b + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            int i11 = i10 % 2;
            str23 = jhtClaimEmployeeDataItem.identityNumber;
        } else {
            str23 = str15;
        }
        if ((32768 & i) != 0) {
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
            b = i12 % 128;
            if (i12 % 2 != 0) {
                String str38 = jhtClaimEmployeeDataItem.validIdentity;
                throw null;
            }
            str24 = jhtClaimEmployeeDataItem.validIdentity;
        } else {
            str24 = str16;
        }
        String str39 = (65536 & i) != 0 ? jhtClaimEmployeeDataItem.maritalStatus : str17;
        if ((i & 131072) != 0) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
            str25 = str39;
            b = i13 % 128;
            if (i13 % 2 != 0) {
                str26 = jhtClaimEmployeeDataItem.email;
                int i14 = 15 / 0;
            } else {
                str26 = jhtClaimEmployeeDataItem.email;
            }
        } else {
            str25 = str39;
            str26 = str18;
        }
        return jhtClaimEmployeeDataItem.copy(str27, str28, str29, str19, str30, str31, str32, str20, str33, str21, str34, str35, str22, str37, str23, str24, str25, str26);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = b + 11;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.bankCode;
        int i5 = i3 + 23;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = b + 45;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.accountBankName;
        int i5 = i3 + 77;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.birthDate;
        int i5 = i2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = b + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.birthPlace;
        }
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = b + 49;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.phoneNumber;
        int i5 = i3 + 15;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.flagSipp;
        int i5 = i2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.identityNumber;
        }
        throw null;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = b + 107;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.validIdentity;
        int i5 = i3 + 15;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component17() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 67;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.maritalStatus;
            int i4 = 46 / 0;
        } else {
            str = this.maritalStatus;
        }
        int i5 = i2 + 47;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = b + 95;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 55;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = b + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.address;
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = b + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.kpj;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 103;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.gender;
        int i5 = i2 + 89;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        String str;
        int i = 2 % 2;
        int i2 = b + 33;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 == 0) {
            str = this.motherName;
            int i4 = 67 / 0;
        } else {
            str = this.motherName;
        }
        int i5 = i3 + 117;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.npwp;
        }
        int i3 = 2 / 0;
        return this.npwp;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.fullName;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.bankName;
        int i4 = i2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 45;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.accountBankNumber;
        int i4 = i2 + 73;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final JhtClaimEmployeeDataItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17) {
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
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p13, "");
        Intrinsics.checkNotNullParameter(p14, "");
        Intrinsics.checkNotNullParameter(p15, "");
        Intrinsics.checkNotNullParameter(p16, "");
        Intrinsics.checkNotNullParameter(p17, "");
        JhtClaimEmployeeDataItem jhtClaimEmployeeDataItem = new JhtClaimEmployeeDataItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
        return jhtClaimEmployeeDataItem;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
            b = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof JhtClaimEmployeeDataItem)) {
            return false;
        }
        JhtClaimEmployeeDataItem jhtClaimEmployeeDataItem = (JhtClaimEmployeeDataItem) p0;
        if (!Intrinsics.areEqual(this.bankCode, jhtClaimEmployeeDataItem.bankCode)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
            b = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.address, jhtClaimEmployeeDataItem.address)) {
            int i5 = b + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.kpj, jhtClaimEmployeeDataItem.kpj)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.gender, jhtClaimEmployeeDataItem.gender)) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
            b = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.motherName, jhtClaimEmployeeDataItem.motherName) || !Intrinsics.areEqual(this.npwp, jhtClaimEmployeeDataItem.npwp) || !Intrinsics.areEqual(this.fullName, jhtClaimEmployeeDataItem.fullName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.bankName, jhtClaimEmployeeDataItem.bankName)) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
            b = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.accountBankNumber, jhtClaimEmployeeDataItem.accountBankNumber)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.accountBankName, jhtClaimEmployeeDataItem.accountBankName)) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
            b = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.birthDate, jhtClaimEmployeeDataItem.birthDate)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.birthPlace, jhtClaimEmployeeDataItem.birthPlace)) {
            int i12 = b + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.phoneNumber, jhtClaimEmployeeDataItem.phoneNumber)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.flagSipp, jhtClaimEmployeeDataItem.flagSipp)) {
            int i14 = b + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.identityNumber, jhtClaimEmployeeDataItem.identityNumber)) {
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
            b = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.validIdentity, jhtClaimEmployeeDataItem.validIdentity)) {
            return Intrinsics.areEqual(this.maritalStatus, jhtClaimEmployeeDataItem.maritalStatus) && Intrinsics.areEqual(this.email, jhtClaimEmployeeDataItem.email);
        }
        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        b = i18 % 128;
        int i19 = i18 % 2;
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((((((((((((this.bankCode.hashCode() * 31) + this.address.hashCode()) * 31) + this.kpj.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.motherName.hashCode()) * 31) + this.npwp.hashCode()) * 31) + this.fullName.hashCode()) * 31) + this.bankName.hashCode()) * 31) + this.accountBankNumber.hashCode()) * 31) + this.accountBankName.hashCode()) * 31) + this.birthDate.hashCode()) * 31) + this.birthPlace.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.flagSipp.hashCode()) * 31) + this.identityNumber.hashCode()) * 31) + this.validIdentity.hashCode()) * 31) + this.maritalStatus.hashCode()) * 31) + this.email.hashCode();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.bankCode;
        String str2 = this.address;
        String str3 = this.kpj;
        String str4 = this.gender;
        String str5 = this.motherName;
        String str6 = this.npwp;
        String str7 = this.fullName;
        String str8 = this.bankName;
        String str9 = this.accountBankNumber;
        String str10 = this.accountBankName;
        String str11 = this.birthDate;
        String str12 = this.birthPlace;
        String str13 = this.phoneNumber;
        String str14 = this.flagSipp;
        String str15 = this.identityNumber;
        String str16 = this.validIdentity;
        String str17 = this.maritalStatus;
        String str18 = this.email;
        StringBuilder sb = new StringBuilder("JhtClaimEmployeeDataItem(bankCode=");
        sb.append(str);
        sb.append(", address=");
        sb.append(str2);
        sb.append(", kpj=");
        sb.append(str3);
        sb.append(", gender=");
        sb.append(str4);
        sb.append(", motherName=");
        sb.append(str5);
        sb.append(", npwp=");
        sb.append(str6);
        sb.append(", fullName=");
        sb.append(str7);
        sb.append(", bankName=");
        sb.append(str8);
        sb.append(", accountBankNumber=");
        sb.append(str9);
        sb.append(", accountBankName=");
        sb.append(str10);
        sb.append(", birthDate=");
        sb.append(str11);
        sb.append(", birthPlace=");
        sb.append(str12);
        sb.append(", phoneNumber=");
        sb.append(str13);
        sb.append(", flagSipp=");
        sb.append(str14);
        sb.append(", identityNumber=");
        sb.append(str15);
        sb.append(", validIdentity=");
        sb.append(str16);
        sb.append(", maritalStatus=");
        sb.append(str17);
        sb.append(", email=");
        sb.append(str18);
        sb.append(")");
        String string = sb.toString();
        int i2 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentbindingInflater1 = -4099350922093258125L;
    }
}
