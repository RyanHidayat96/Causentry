package com.midtrans.sdk.corekit.models;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class TransactionStatusResponse {

    @SerializedName("approval_code")
    private String approvaCode;
    private String bank;

    @SerializedName("fraud_status")
    private String fraudStatus;

    @SerializedName("gross_amount")
    private String grossAmount;

    @SerializedName("masked_card")
    private String maskedCard;

    @SerializedName("order_id")
    private String orderId;

    @SerializedName(FirebaseAnalytics.Param.PAYMENT_TYPE)
    private String paymentType;

    @SerializedName("signature_key")
    private String signatureKey;

    @SerializedName("status_code")
    private String statusCode;

    @SerializedName("status_message")
    private String statusMessage;

    @SerializedName(FirebaseAnalytics.Param.TRANSACTION_ID)
    private String transactionId;

    @SerializedName("transaction_status")
    private String transactionStatus;

    @SerializedName("transaction_time")
    private String transactionTime;

    public String getApprovaCode() {
        return this.approvaCode;
    }

    public String getBank() {
        return this.bank;
    }

    public String getFraudStatus() {
        return this.fraudStatus;
    }

    public String getGrossAmount() {
        return this.grossAmount;
    }

    public String getMaskedCard() {
        return this.maskedCard;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public String getSignatureKey() {
        return this.signatureKey;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public String getTransactionStatus() {
        return this.transactionStatus;
    }

    public String getTransactionTime() {
        return this.transactionTime;
    }

    public void setApprovaCode(String str) {
        this.approvaCode = str;
    }

    public void setBank(String str) {
        this.bank = str;
    }

    public void setFraudStatus(String str) {
        this.fraudStatus = str;
    }

    public void setGrossAmount(String str) {
        this.grossAmount = str;
    }

    public void setMaskedCard(String str) {
        this.maskedCard = str;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setPaymentType(String str) {
        this.paymentType = str;
    }

    public void setSignatureKey(String str) {
        this.signatureKey = str;
    }

    public void setStatusCode(String str) {
        this.statusCode = str;
    }

    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }

    public void setTransactionId(String str) {
        this.transactionId = str;
    }

    public void setTransactionStatus(String str) {
        this.transactionStatus = str;
    }

    public void setTransactionTime(String str) {
        this.transactionTime = str;
    }
}
