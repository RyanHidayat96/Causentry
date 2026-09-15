package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class DeleteCardResponse {

    @SerializedName("status_code")
    private int code;

    @SerializedName("message")
    private String error;

    @SerializedName("status_message")
    private String message;

    public int getCode() {
        return this.code;
    }

    public String getError() {
        return this.error;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
