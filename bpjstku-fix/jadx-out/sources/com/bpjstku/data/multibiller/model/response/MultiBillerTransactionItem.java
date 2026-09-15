package com.bpjstku.data.multibiller.model.response;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.core.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J¬\u0001\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\"2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b(\u0010\u0013R$\u0010)\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010-R$\u0010.\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010-R$\u00101\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010*\u001a\u0004\b2\u0010\u0013\"\u0004\b3\u0010-R$\u00104\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010*\u001a\u0004\b5\u0010\u0013\"\u0004\b6\u0010-R$\u00107\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010*\u001a\u0004\b8\u0010\u0013\"\u0004\b9\u0010-R$\u0010:\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010*\u001a\u0004\b;\u0010\u0013\"\u0004\b<\u0010-R$\u0010=\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010*\u001a\u0004\b>\u0010\u0013\"\u0004\b?\u0010-R$\u0010@\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010*\u001a\u0004\bA\u0010\u0013\"\u0004\bB\u0010-R$\u0010C\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010*\u001a\u0004\bD\u0010\u0013\"\u0004\bE\u0010-R$\u0010F\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010*\u001a\u0004\bG\u0010\u0013\"\u0004\bH\u0010-R$\u0010I\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010*\u001a\u0004\bJ\u0010\u0013\"\u0004\bK\u0010-R$\u0010L\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010*\u001a\u0004\bM\u0010\u0013\"\u0004\bN\u0010-R$\u0010O\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010*\u001a\u0004\bP\u0010\u0013\"\u0004\bQ\u0010-"}, d2 = {"Lcom/bpjstku/data/multibiller/model/response/MultiBillerTransactionItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/multibiller/model/response/MultiBillerTransactionItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "authMotion", "Ljava/lang/String;", "getAuthMotion", "setAuthMotion", "(Ljava/lang/String;)V", "callbackUrl", "getCallbackUrl", "setCallbackUrl", "createdAt", "getCreatedAt", "setCreatedAt", "customerBillId", "getCustomerBillId", "setCustomerBillId", "deepUrl", "getDeepUrl", "setDeepUrl", "extTransactionRef", "getExtTransactionRef", "setExtTransactionRef", "merchantId", "getMerchantId", "setMerchantId", "paymentStatus", "getPaymentStatus", "setPaymentStatus", "redirectUrl", "getRedirectUrl", "setRedirectUrl", "tokenMotion", "getTokenMotion", "setTokenMotion", "transactionId", "getTransactionId", "setTransactionId", "updatedAt", "getUpdatedAt", "setUpdatedAt", "transactionStatus", "getTransactionStatus", "setTransactionStatus"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MultiBillerTransactionItem {
    public static final int $stable = 8;

    @SerializedName("auth_motion_pay")
    private String authMotion;

    @SerializedName("callback_url")
    private String callbackUrl;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("customer_bill_id")
    private String customerBillId;

    @SerializedName("deep_link")
    private String deepUrl;

    @SerializedName("ext_transaction_ref")
    private String extTransactionRef;

    @SerializedName("merchant_id")
    private String merchantId;

    @SerializedName("payment_status")
    private String paymentStatus;

    @SerializedName(Constants.WEBVIEW_REDIRECT_URL)
    private String redirectUrl;

    @SerializedName("token_motion_pay")
    private String tokenMotion;

    @SerializedName(FirebaseAnalytics.Param.TRANSACTION_ID)
    private String transactionId;

    @SerializedName("transaction_status")
    private String transactionStatus;

    @SerializedName("updated_at")
    private String updatedAt;

    public MultiBillerTransactionItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.authMotion = str;
        this.callbackUrl = str2;
        this.createdAt = str3;
        this.customerBillId = str4;
        this.deepUrl = str5;
        this.extTransactionRef = str6;
        this.merchantId = str7;
        this.paymentStatus = str8;
        this.redirectUrl = str9;
        this.tokenMotion = str10;
        this.transactionId = str11;
        this.updatedAt = str12;
        this.transactionStatus = str13;
    }

    public final String getAuthMotion() {
        return this.authMotion;
    }

    public final void setAuthMotion(String str) {
        this.authMotion = str;
    }

    public final String getCallbackUrl() {
        return this.callbackUrl;
    }

    public final void setCallbackUrl(String str) {
        this.callbackUrl = str;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final void setCreatedAt(String str) {
        this.createdAt = str;
    }

    public final String getCustomerBillId() {
        return this.customerBillId;
    }

    public final void setCustomerBillId(String str) {
        this.customerBillId = str;
    }

    public final String getDeepUrl() {
        return this.deepUrl;
    }

    public final void setDeepUrl(String str) {
        this.deepUrl = str;
    }

    public final String getExtTransactionRef() {
        return this.extTransactionRef;
    }

    public final void setExtTransactionRef(String str) {
        this.extTransactionRef = str;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final void setMerchantId(String str) {
        this.merchantId = str;
    }

    public final String getPaymentStatus() {
        return this.paymentStatus;
    }

    public final void setPaymentStatus(String str) {
        this.paymentStatus = str;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public final String getTokenMotion() {
        return this.tokenMotion;
    }

    public final void setTokenMotion(String str) {
        this.tokenMotion = str;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final void setTransactionId(String str) {
        this.transactionId = str;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public final String getTransactionStatus() {
        return this.transactionStatus;
    }

    public final void setTransactionStatus(String str) {
        this.transactionStatus = str;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthMotion() {
        return this.authMotion;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTokenMotion() {
        return this.tokenMotion;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTransactionStatus() {
        return this.transactionStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCallbackUrl() {
        return this.callbackUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCustomerBillId() {
        return this.customerBillId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeepUrl() {
        return this.deepUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getExtTransactionRef() {
        return this.extTransactionRef;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPaymentStatus() {
        return this.paymentStatus;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final MultiBillerTransactionItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12) {
        return new MultiBillerTransactionItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MultiBillerTransactionItem)) {
            return false;
        }
        MultiBillerTransactionItem multiBillerTransactionItem = (MultiBillerTransactionItem) p0;
        return Intrinsics.areEqual(this.authMotion, multiBillerTransactionItem.authMotion) && Intrinsics.areEqual(this.callbackUrl, multiBillerTransactionItem.callbackUrl) && Intrinsics.areEqual(this.createdAt, multiBillerTransactionItem.createdAt) && Intrinsics.areEqual(this.customerBillId, multiBillerTransactionItem.customerBillId) && Intrinsics.areEqual(this.deepUrl, multiBillerTransactionItem.deepUrl) && Intrinsics.areEqual(this.extTransactionRef, multiBillerTransactionItem.extTransactionRef) && Intrinsics.areEqual(this.merchantId, multiBillerTransactionItem.merchantId) && Intrinsics.areEqual(this.paymentStatus, multiBillerTransactionItem.paymentStatus) && Intrinsics.areEqual(this.redirectUrl, multiBillerTransactionItem.redirectUrl) && Intrinsics.areEqual(this.tokenMotion, multiBillerTransactionItem.tokenMotion) && Intrinsics.areEqual(this.transactionId, multiBillerTransactionItem.transactionId) && Intrinsics.areEqual(this.updatedAt, multiBillerTransactionItem.updatedAt) && Intrinsics.areEqual(this.transactionStatus, multiBillerTransactionItem.transactionStatus);
    }

    public final int hashCode() {
        String str = this.authMotion;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.callbackUrl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.createdAt;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.customerBillId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.deepUrl;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.extTransactionRef;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.merchantId;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.paymentStatus;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.redirectUrl;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.tokenMotion;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.transactionId;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.updatedAt;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.transactionStatus;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        String str = this.authMotion;
        String str2 = this.callbackUrl;
        String str3 = this.createdAt;
        String str4 = this.customerBillId;
        String str5 = this.deepUrl;
        String str6 = this.extTransactionRef;
        String str7 = this.merchantId;
        String str8 = this.paymentStatus;
        String str9 = this.redirectUrl;
        String str10 = this.tokenMotion;
        String str11 = this.transactionId;
        String str12 = this.updatedAt;
        String str13 = this.transactionStatus;
        StringBuilder sb = new StringBuilder("MultiBillerTransactionItem(authMotion=");
        sb.append(str);
        sb.append(", callbackUrl=");
        sb.append(str2);
        sb.append(", createdAt=");
        sb.append(str3);
        sb.append(", customerBillId=");
        sb.append(str4);
        sb.append(", deepUrl=");
        sb.append(str5);
        sb.append(", extTransactionRef=");
        sb.append(str6);
        sb.append(", merchantId=");
        sb.append(str7);
        sb.append(", paymentStatus=");
        sb.append(str8);
        sb.append(", redirectUrl=");
        sb.append(str9);
        sb.append(", tokenMotion=");
        sb.append(str10);
        sb.append(", transactionId=");
        sb.append(str11);
        sb.append(", updatedAt=");
        sb.append(str12);
        sb.append(", transactionStatus=");
        sb.append(str13);
        sb.append(")");
        return sb.toString();
    }
}
