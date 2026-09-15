package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class MandiriClickPayTokenRequest {

    @SerializedName("card_number")
    public String cardNumber;

    @SerializedName("client_key")
    public String clientKey;

    public MandiriClickPayTokenRequest(String str, String str2) {
        this.cardNumber = str;
        this.clientKey = str2;
    }
}
