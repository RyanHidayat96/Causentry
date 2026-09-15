package com.midtrans.sdk.corekit.models;

/* JADX INFO: loaded from: classes6.dex */
public class CreditCardFromScanner {
    private String cardNumber;
    private String cvv;
    private String expired;

    public CreditCardFromScanner(String str, String str2, String str3) {
        setCardNumber(str);
        setCvv(str2);
        setExpired(str3);
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getCvv() {
        return this.cvv;
    }

    public String getExpired() {
        return this.expired;
    }

    public void setCardNumber(String str) {
        this.cardNumber = str;
    }

    public void setCvv(String str) {
        this.cvv = str;
    }

    public void setExpired(String str) {
        this.expired = str;
    }
}
