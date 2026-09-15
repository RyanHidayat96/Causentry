package com.midtrans.sdk.corekit.models.snap.params;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class KlikBcaPaymentParams {

    @SerializedName("user_id")
    private String userId;

    public KlikBcaPaymentParams(String str) {
        this.userId = str;
    }

    public String getUserId() {
        return this.userId;
    }
}
