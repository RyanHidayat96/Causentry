package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class Token {

    @SerializedName("error_messages")
    private ArrayList<String> errorMessages;

    @SerializedName("token")
    private String tokenId;

    public ArrayList<String> getErrorMessage() {
        return this.errorMessages;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public void setTokenId(String str) {
        this.tokenId = str;
    }
}
