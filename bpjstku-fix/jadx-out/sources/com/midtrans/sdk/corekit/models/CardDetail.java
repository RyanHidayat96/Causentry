package com.midtrans.sdk.corekit.models;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class CardDetail implements Serializable {
    private String bankName;
    private String cardHolderName;
    private String cardNumber;
    private String cardType;
    private String cvv;
    private String expiryDate;

    public void getFormatedCardNumber() {
    }

    public String getBankName() {
        return this.bankName;
    }

    public String getCardHolderName() {
        return this.cardHolderName;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getCvv() {
        return this.cvv;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public void setBankName(String str) {
        this.bankName = str;
    }

    public void setCardHolderName(String str) {
        this.cardHolderName = str;
    }

    public void setCardNumber(String str) {
        this.cardNumber = str;
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    public void setCvv(String str) {
        this.cvv = str;
    }

    public void setExpiryDate(String str) {
        this.expiryDate = str;
    }
}
