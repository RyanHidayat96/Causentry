package com.midtrans.sdk.corekit.models.snap.params;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class CreditCardPaymentParams {
    private String bank;

    @SerializedName("card_token")
    private String cardToken;

    @SerializedName("installment")
    private String installmentTerm;
    private transient boolean isFromBankPoint;

    @SerializedName("masked_card")
    private String maskedCard;

    @SerializedName("point")
    private float pointRedeemed;

    @SerializedName("save_card")
    private boolean saveCard;

    public CreditCardPaymentParams(String str, Boolean bool, String str2) {
        this.cardToken = str;
        this.saveCard = bool.booleanValue();
        this.maskedCard = str2;
    }

    public CreditCardPaymentParams(String str, Boolean bool, String str2, String str3) {
        this.cardToken = str;
        this.saveCard = bool.booleanValue();
        this.maskedCard = str2;
        this.installmentTerm = str3;
    }

    public String getBank() {
        return this.bank;
    }

    public String getCardToken() {
        return this.cardToken;
    }

    public String getInstallmentTerm() {
        return this.installmentTerm;
    }

    public String getMaskedCard() {
        return this.maskedCard;
    }

    public float getPointRedeemed() {
        return this.pointRedeemed;
    }

    public boolean isFromBankPoint() {
        return this.isFromBankPoint;
    }

    public boolean isSaveCard() {
        return this.saveCard;
    }

    public void setBank(String str) {
        this.bank = str;
    }

    public void setCardToken(String str) {
        this.cardToken = str;
    }

    public void setFromBankPoint(boolean z) {
        this.isFromBankPoint = z;
    }

    public void setInstallmentTerm(String str) {
        this.installmentTerm = str;
    }

    public void setMaskedCard(String str) {
        this.maskedCard = str;
    }

    public void setPointRedeemed(float f) {
        this.pointRedeemed = f;
    }

    public void setSaveCard(boolean z) {
        this.saveCard = z;
    }
}
