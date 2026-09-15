package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class CardsResponse {

    @SerializedName("cardhash")
    private String cardHash;

    @SerializedName("token_id")
    private String tokenId;
    private String type;

    public CardsResponse(String str, String str2, String str3) {
        this.tokenId = str;
        this.cardHash = str2;
        this.type = str3;
    }

    public String getCardHash() {
        return this.cardHash;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public String getType() {
        return this.type;
    }

    public void setCardHash(String str) {
        this.cardHash = str;
    }

    public void setTokenId(String str) {
        this.tokenId = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
