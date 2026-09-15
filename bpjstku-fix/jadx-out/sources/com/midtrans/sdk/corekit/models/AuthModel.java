package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class AuthModel {

    @SerializedName("X-Auth")
    private String xAuth;

    public String getxAuth() {
        return this.xAuth;
    }

    public void setxAuth(String str) {
        this.xAuth = str;
    }
}
