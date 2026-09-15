package com.midtrans.sdk.corekit.models.snap.params;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class GCIPaymentParams {

    @SerializedName("card_number")
    private String cardNumber;

    @SerializedName("pin")
    private String password;

    public GCIPaymentParams(String str, String str2) {
        this.cardNumber = str;
        this.password = str2;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getPassword() {
        return this.password;
    }
}
