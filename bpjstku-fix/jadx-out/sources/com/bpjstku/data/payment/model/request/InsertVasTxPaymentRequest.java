package com.bpjstku.data.payment.model.request;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010\u001f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J\u0092\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\"2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b(\u0010\u0013R\u001a\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u0013R\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u0013R\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010\u0013R\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010\u0013R\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010\u0013R\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b7\u0010\u0013R\u001a\u00108\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b9\u0010\u0013R\u001a\u0010:\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\b;\u0010\u0013R\u001a\u0010<\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010*\u001a\u0004\b=\u0010\u0013R\u001a\u0010>\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010*\u001a\u0004\b?\u0010\u0013R\u001a\u0010@\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010*\u001a\u0004\bA\u0010\u0013R\u001a\u0010B\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010*\u001a\u0004\bC\u0010\u0013"}, d2 = {"Lcom/bpjstku/data/payment/model/request/InsertVasTxPaymentRequest;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/request/InsertVasTxPaymentRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "contributionCode", "Ljava/lang/String;", "getContributionCode", "transactionId", "getTransactionId", "orderId", "getOrderId", "amountJkk", "getAmountJkk", "amountJkm", "getAmountJkm", "amountJht", "getAmountJht", "amountTotal", "getAmountTotal", "nama", "getNama", FirebaseAnalytics.Param.QUANTITY, "getQuantity", "customerIdentifier", "getCustomerIdentifier", "paymentMethod", "getPaymentMethod", "email", "getEmail", "customField", "getCustomField"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InsertVasTxPaymentRequest {
    public static final int $stable = 0;

    @SerializedName("amountJht")
    private final String amountJht;

    @SerializedName("amountJkk")
    private final String amountJkk;

    @SerializedName("amountJkm")
    private final String amountJkm;

    @SerializedName("amountTotal")
    private final String amountTotal;

    @SerializedName("contributionCode")
    private final String contributionCode;

    @SerializedName("customField")
    private final String customField;

    @SerializedName("customerIdentifier")
    private final String customerIdentifier;

    @SerializedName("email")
    private final String email;

    @SerializedName("nama")
    private final String nama;

    @SerializedName("orderId")
    private final String orderId;

    @SerializedName("paymentMethod")
    private final String paymentMethod;

    @SerializedName(FirebaseAnalytics.Param.QUANTITY)
    private final String quantity;

    @SerializedName("transactionId")
    private final String transactionId;

    public InsertVasTxPaymentRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
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
        this.contributionCode = str;
        this.transactionId = str2;
        this.orderId = str3;
        this.amountJkk = str4;
        this.amountJkm = str5;
        this.amountJht = str6;
        this.amountTotal = str7;
        this.nama = str8;
        this.quantity = str9;
        this.customerIdentifier = str10;
        this.paymentMethod = str11;
        this.email = str12;
        this.customField = str13;
    }

    public final String getContributionCode() {
        return this.contributionCode;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getAmountJkk() {
        return this.amountJkk;
    }

    public final String getAmountJkm() {
        return this.amountJkm;
    }

    public final String getAmountJht() {
        return this.amountJht;
    }

    public final String getAmountTotal() {
        return this.amountTotal;
    }

    public final String getNama() {
        return this.nama;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getCustomerIdentifier() {
        return this.customerIdentifier;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getCustomField() {
        return this.customField;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContributionCode() {
        return this.contributionCode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCustomerIdentifier() {
        return this.customerIdentifier;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCustomField() {
        return this.customField;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAmountJkk() {
        return this.amountJkk;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAmountJkm() {
        return this.amountJkm;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAmountJht() {
        return this.amountJht;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAmountTotal() {
        return this.amountTotal;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNama() {
        return this.nama;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getQuantity() {
        return this.quantity;
    }

    public final InsertVasTxPaymentRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12) {
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
        return new InsertVasTxPaymentRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof InsertVasTxPaymentRequest)) {
            return false;
        }
        InsertVasTxPaymentRequest insertVasTxPaymentRequest = (InsertVasTxPaymentRequest) p0;
        return Intrinsics.areEqual(this.contributionCode, insertVasTxPaymentRequest.contributionCode) && Intrinsics.areEqual(this.transactionId, insertVasTxPaymentRequest.transactionId) && Intrinsics.areEqual(this.orderId, insertVasTxPaymentRequest.orderId) && Intrinsics.areEqual(this.amountJkk, insertVasTxPaymentRequest.amountJkk) && Intrinsics.areEqual(this.amountJkm, insertVasTxPaymentRequest.amountJkm) && Intrinsics.areEqual(this.amountJht, insertVasTxPaymentRequest.amountJht) && Intrinsics.areEqual(this.amountTotal, insertVasTxPaymentRequest.amountTotal) && Intrinsics.areEqual(this.nama, insertVasTxPaymentRequest.nama) && Intrinsics.areEqual(this.quantity, insertVasTxPaymentRequest.quantity) && Intrinsics.areEqual(this.customerIdentifier, insertVasTxPaymentRequest.customerIdentifier) && Intrinsics.areEqual(this.paymentMethod, insertVasTxPaymentRequest.paymentMethod) && Intrinsics.areEqual(this.email, insertVasTxPaymentRequest.email) && Intrinsics.areEqual(this.customField, insertVasTxPaymentRequest.customField);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.contributionCode.hashCode() * 31) + this.transactionId.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.amountJkk.hashCode()) * 31) + this.amountJkm.hashCode()) * 31) + this.amountJht.hashCode()) * 31) + this.amountTotal.hashCode()) * 31) + this.nama.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.customerIdentifier.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31) + this.email.hashCode()) * 31) + this.customField.hashCode();
    }

    public final String toString() {
        String str = this.contributionCode;
        String str2 = this.transactionId;
        String str3 = this.orderId;
        String str4 = this.amountJkk;
        String str5 = this.amountJkm;
        String str6 = this.amountJht;
        String str7 = this.amountTotal;
        String str8 = this.nama;
        String str9 = this.quantity;
        String str10 = this.customerIdentifier;
        String str11 = this.paymentMethod;
        String str12 = this.email;
        String str13 = this.customField;
        StringBuilder sb = new StringBuilder("InsertVasTxPaymentRequest(contributionCode=");
        sb.append(str);
        sb.append(", transactionId=");
        sb.append(str2);
        sb.append(", orderId=");
        sb.append(str3);
        sb.append(", amountJkk=");
        sb.append(str4);
        sb.append(", amountJkm=");
        sb.append(str5);
        sb.append(", amountJht=");
        sb.append(str6);
        sb.append(", amountTotal=");
        sb.append(str7);
        sb.append(", nama=");
        sb.append(str8);
        sb.append(", quantity=");
        sb.append(str9);
        sb.append(", customerIdentifier=");
        sb.append(str10);
        sb.append(", paymentMethod=");
        sb.append(str11);
        sb.append(", email=");
        sb.append(str12);
        sb.append(", customField=");
        sb.append(str13);
        sb.append(")");
        return sb.toString();
    }
}
