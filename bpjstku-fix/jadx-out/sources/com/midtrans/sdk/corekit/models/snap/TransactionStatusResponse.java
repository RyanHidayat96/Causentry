package com.midtrans.sdk.corekit.models.snap;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class TransactionStatusResponse {

    @SerializedName("approval_code")
    private String approvalCode;
    private String bank;

    @SerializedName("error_messages")
    private List<String> errorMessages;

    @SerializedName("fraud_status")
    private String fraudStatus;

    @SerializedName("gross_amount")
    private String grossAmount;

    @SerializedName("installment_term")
    private String installmentTerm;

    @SerializedName("masked_card")
    private String maskedCard;

    @SerializedName("order_id")
    private String orderId;

    @SerializedName(FirebaseAnalytics.Param.PAYMENT_TYPE)
    private String paymentType;

    @SerializedName("saved_token_id")
    private String savedTokenId;

    @SerializedName("saved_token_id_expired_at")
    private String savedTokenIdExpiredAt;

    @SerializedName("status_code")
    private String statusCode;

    @SerializedName("status_message")
    private String statusMessage;
    private String token;

    @SerializedName(FirebaseAnalytics.Param.TRANSACTION_ID)
    private String transactionId;

    @SerializedName("transaction_status")
    private String transactionStatus;

    @SerializedName("transaction_time")
    private String transactionTime;

    public String getApprovalCode() {
        return this.approvalCode;
    }

    public String getBank() {
        return this.bank;
    }

    public List<String> getErrorMessages() {
        return this.errorMessages;
    }

    public String getFraudStatus() {
        return this.fraudStatus;
    }

    public String getGrossAmount() {
        return this.grossAmount;
    }

    public String getInstallmentTerm() {
        return this.installmentTerm;
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

    public String getSavedTokenId() {
        return this.savedTokenId;
    }

    public String getSavedTokenIdExpiredAt() {
        return this.savedTokenIdExpiredAt;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String getToken() {
        return this.token;
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

    public void setStatusCode(String str) {
        this.statusCode = str;
    }
}
