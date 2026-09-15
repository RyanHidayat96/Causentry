package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class KlikBCADescriptionModel {
    private String description;

    @SerializedName("user_id")
    private String userId;

    public KlikBCADescriptionModel() {
    }

    public KlikBCADescriptionModel(String str, String str2) {
        setDescription(str);
        setUserId(str2);
    }

    public String getDescription() {
        return this.description;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
