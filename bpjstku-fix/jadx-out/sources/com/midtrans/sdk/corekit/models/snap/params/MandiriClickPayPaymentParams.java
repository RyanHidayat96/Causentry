package com.midtrans.sdk.corekit.models.snap.params;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class MandiriClickPayPaymentParams {
    private String input3;

    @SerializedName("mandiri_card_no")
    private String mandiriCardNumber;

    @SerializedName("token_response")
    private String tokenResponse;

    public MandiriClickPayPaymentParams(String str, String str2, String str3) {
        this.mandiriCardNumber = str;
        this.input3 = str2;
        this.tokenResponse = str3;
    }
}
