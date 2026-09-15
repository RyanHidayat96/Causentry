package com.midtrans.sdk.corekit.models;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes5.dex */
public class CardRegistrationResponse {

    @SerializedName("masked_card")
    private String maskedCard;

    @SerializedName("saved_token_id")
    private String savedTokenId;

    @SerializedName("status_code")
    private String statusCode;

    @SerializedName("status_message")
    private String statusMessage;

    @SerializedName(FirebaseAnalytics.Param.TRANSACTION_ID)
    private String transactionId;

    public String getMaskedCard() {
        return this.maskedCard;
    }

    public String getSavedTokenId() {
        return this.savedTokenId;
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

    public void setMaskedCard(String str) {
        this.maskedCard = str;
    }

    public void setSavedTokenId(String str) {
        this.savedTokenId = str;
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
}
