package com.bpjstku.data.tuition.model.request;

import android.content.Context;
import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b \u0010\u0015J\u0010\u0010!\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b!\u0010\u0015J\u0010\u0010\"\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u0010\u0010#\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b#\u0010\u0015J¦\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010\u0003\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b-\u0010\u0015R\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0015R\u001a\u00101\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u0010\u0015R\u001a\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u0010\u0015R\u001a\u00105\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u0010\u0015R\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b8\u0010\u0015R\u001a\u00109\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u0010\u0015R\u001a\u0010;\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010/\u001a\u0004\b<\u0010\u0015R\u001a\u0010=\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010/\u001a\u0004\b>\u0010\u0015R\u001a\u0010?\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010/\u001a\u0004\b@\u0010\u0015R\u001a\u0010A\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010/\u001a\u0004\bB\u0010\u0015R\u001a\u0010C\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010/\u001a\u0004\bD\u0010\u0015R\u001a\u0010E\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010/\u001a\u0004\bF\u0010\u0015R\u001a\u0010G\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010/\u001a\u0004\bH\u0010\u0015R\u001a\u0010I\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010/\u001a\u0004\bJ\u0010\u0015R\u001a\u0010K\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010/\u001a\u0004\bL\u0010\u0015"}, d2 = {"Lcom/bpjstku/data/tuition/model/request/CallbackPaymentTuitionMidtransRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/tuition/model/request/CallbackPaymentTuitionMidtransRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "transaction_time", "Ljava/lang/String;", "getTransaction_time", "transaction_status", "getTransaction_status", FirebaseAnalytics.Param.TRANSACTION_ID, "getTransaction_id", "status_message", "getStatus_message", "status_code", "getStatus_code", "signature_key", "getSignature_key", "settlement_time", "getSettlement_time", FirebaseAnalytics.Param.PAYMENT_TYPE, "getPayment_type", "order_id", "getOrder_id", "merchant_id", "getMerchant_id", "gross_amount", "getGross_amount", "fraud_status", "getFraud_status", "custom_field2", "getCustom_field2", "custom_field1", "getCustom_field1", FirebaseAnalytics.Param.CURRENCY, "getCurrency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CallbackPaymentTuitionMidtransRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName(FirebaseAnalytics.Param.CURRENCY)
    private final String currency;

    @SerializedName("custom_field1")
    private final String custom_field1;

    @SerializedName("custom_field2")
    private final String custom_field2;

    @SerializedName("fraud_status")
    private final String fraud_status;

    @SerializedName("gross_amount")
    private final String gross_amount;

    @SerializedName("merchant_id")
    private final String merchant_id;

    @SerializedName("order_id")
    private final String order_id;

    @SerializedName(FirebaseAnalytics.Param.PAYMENT_TYPE)
    private final String payment_type;

    @SerializedName("settlement_time")
    private final String settlement_time;

    @SerializedName("signature_key")
    private final String signature_key;

    @SerializedName("status_code")
    private final String status_code;

    @SerializedName("status_message")
    private final String status_message;

    @SerializedName(FirebaseAnalytics.Param.TRANSACTION_ID)
    private final String transaction_id;

    @SerializedName("transaction_status")
    private final String transaction_status;

    @SerializedName("transaction_time")
    private final String transaction_time;

    public final String getTransaction_time() {
        return this.transaction_time;
    }

    public final String getTransaction_status() {
        return this.transaction_status;
    }

    public final String getTransaction_id() {
        return this.transaction_id;
    }

    public final String getStatus_message() {
        return this.status_message;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getSignature_key() {
        return this.signature_key;
    }

    public final String getSettlement_time() {
        return this.settlement_time;
    }

    public final String getPayment_type() {
        return this.payment_type;
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final String getMerchant_id() {
        return this.merchant_id;
    }

    public final String getGross_amount() {
        return this.gross_amount;
    }

    public final String getFraud_status() {
        return this.fraud_status;
    }

    public final String getCustom_field2() throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 40, 19 - TextUtils.getTrimmedLength(""), 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (-16777157) - Color.rgb(0, 0, 0), TextUtils.getOffsetAfter("", 0) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 37837), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = j;
        long j3 = -1;
        long j4 = 3715480368690742141L ^ j3;
        long j5 = j3 ^ 1803773128469044098L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j6 = (((long) 592) * 3715480368690742141L) + (((long) (-590)) * 1803773128469044098L) + (((long) (-1182)) * ((j4 | 1803773128469044098L) ^ j3)) + (((long) (-591)) * ((((j4 | j5) | (jIdentityHashCode ^ j3)) ^ j3) | (4294265531529157631L ^ j3))) + (((long) 591) * (jIdentityHashCode | j4 | j5));
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j2 >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j2 = j6;
        }
        if (i3 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46399 - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 40, 19 - Color.alpha(0), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
        }
        return this.custom_field2;
    }

    public CallbackPaymentTuitionMidtransRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
        this.transaction_time = str;
        this.transaction_status = str2;
        this.transaction_id = str3;
        this.status_message = str4;
        this.status_code = str5;
        this.signature_key = str6;
        this.settlement_time = str7;
        this.payment_type = str8;
        this.order_id = str9;
        this.merchant_id = str10;
        this.gross_amount = str11;
        this.fraud_status = str12;
        this.custom_field2 = str13;
        this.custom_field1 = str14;
        this.currency = str15;
    }

    public final String getCustom_field1() {
        return this.custom_field1;
    }

    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransaction_time() {
        return this.transaction_time;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMerchant_id() {
        return this.merchant_id;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getGross_amount() {
        return this.gross_amount;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFraud_status() {
        return this.fraud_status;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCustom_field2() {
        return this.custom_field2;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCustom_field1() {
        return this.custom_field1;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTransaction_status() {
        return this.transaction_status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTransaction_id() {
        return this.transaction_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus_message() {
        return this.status_message;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSignature_key() {
        return this.signature_key;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSettlement_time() {
        return this.settlement_time;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPayment_type() {
        return this.payment_type;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOrder_id() {
        return this.order_id;
    }

    public final CallbackPaymentTuitionMidtransRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14) {
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
        return new CallbackPaymentTuitionMidtransRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CallbackPaymentTuitionMidtransRequest)) {
            return false;
        }
        CallbackPaymentTuitionMidtransRequest callbackPaymentTuitionMidtransRequest = (CallbackPaymentTuitionMidtransRequest) p0;
        return Intrinsics.areEqual(this.transaction_time, callbackPaymentTuitionMidtransRequest.transaction_time) && Intrinsics.areEqual(this.transaction_status, callbackPaymentTuitionMidtransRequest.transaction_status) && Intrinsics.areEqual(this.transaction_id, callbackPaymentTuitionMidtransRequest.transaction_id) && Intrinsics.areEqual(this.status_message, callbackPaymentTuitionMidtransRequest.status_message) && Intrinsics.areEqual(this.status_code, callbackPaymentTuitionMidtransRequest.status_code) && Intrinsics.areEqual(this.signature_key, callbackPaymentTuitionMidtransRequest.signature_key) && Intrinsics.areEqual(this.settlement_time, callbackPaymentTuitionMidtransRequest.settlement_time) && Intrinsics.areEqual(this.payment_type, callbackPaymentTuitionMidtransRequest.payment_type) && Intrinsics.areEqual(this.order_id, callbackPaymentTuitionMidtransRequest.order_id) && Intrinsics.areEqual(this.merchant_id, callbackPaymentTuitionMidtransRequest.merchant_id) && Intrinsics.areEqual(this.gross_amount, callbackPaymentTuitionMidtransRequest.gross_amount) && Intrinsics.areEqual(this.fraud_status, callbackPaymentTuitionMidtransRequest.fraud_status) && Intrinsics.areEqual(this.custom_field2, callbackPaymentTuitionMidtransRequest.custom_field2) && Intrinsics.areEqual(this.custom_field1, callbackPaymentTuitionMidtransRequest.custom_field1) && Intrinsics.areEqual(this.currency, callbackPaymentTuitionMidtransRequest.currency);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((this.transaction_time.hashCode() * 31) + this.transaction_status.hashCode()) * 31) + this.transaction_id.hashCode()) * 31) + this.status_message.hashCode()) * 31) + this.status_code.hashCode()) * 31) + this.signature_key.hashCode()) * 31) + this.settlement_time.hashCode()) * 31) + this.payment_type.hashCode()) * 31) + this.order_id.hashCode()) * 31) + this.merchant_id.hashCode()) * 31) + this.gross_amount.hashCode()) * 31) + this.fraud_status.hashCode()) * 31) + this.custom_field2.hashCode()) * 31) + this.custom_field1.hashCode()) * 31) + this.currency.hashCode();
    }

    public final String toString() {
        String str = this.transaction_time;
        String str2 = this.transaction_status;
        String str3 = this.transaction_id;
        String str4 = this.status_message;
        String str5 = this.status_code;
        String str6 = this.signature_key;
        String str7 = this.settlement_time;
        String str8 = this.payment_type;
        String str9 = this.order_id;
        String str10 = this.merchant_id;
        String str11 = this.gross_amount;
        String str12 = this.fraud_status;
        String str13 = this.custom_field2;
        String str14 = this.custom_field1;
        String str15 = this.currency;
        StringBuilder sb = new StringBuilder("CallbackPaymentTuitionMidtransRequest(transaction_time=");
        sb.append(str);
        sb.append(", transaction_status=");
        sb.append(str2);
        sb.append(", transaction_id=");
        sb.append(str3);
        sb.append(", status_message=");
        sb.append(str4);
        sb.append(", status_code=");
        sb.append(str5);
        sb.append(", signature_key=");
        sb.append(str6);
        sb.append(", settlement_time=");
        sb.append(str7);
        sb.append(", payment_type=");
        sb.append(str8);
        sb.append(", order_id=");
        sb.append(str9);
        sb.append(", merchant_id=");
        sb.append(str10);
        sb.append(", gross_amount=");
        sb.append(str11);
        sb.append(", fraud_status=");
        sb.append(str12);
        sb.append(", custom_field2=");
        sb.append(str13);
        sb.append(", custom_field1=");
        sb.append(str14);
        sb.append(", currency=");
        sb.append(str15);
        sb.append(")");
        return sb.toString();
    }
}
