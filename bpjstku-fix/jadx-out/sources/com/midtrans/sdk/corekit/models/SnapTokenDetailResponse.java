package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class SnapTokenDetailResponse {

    @SerializedName("token_id")
    private String tokenid;

    public String getTokenid() {
        return this.tokenid;
    }

    public void setTokenid(String str) {
        this.tokenid = str;
    }
}
