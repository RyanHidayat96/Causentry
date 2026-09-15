package com.midtrans.sdk.corekit.models.snap.params;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes5.dex */
public class NewMandiriClickPaymentParams {
    private String input3;
    private String token;

    @SerializedName("token_id")
    private String tokenId;

    public NewMandiriClickPaymentParams(String str, String str2, String str3) {
        this.input3 = str3;
        this.token = str2;
        this.tokenId = str;
    }
}
