package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class DescriptionModel {

    @SerializedName("description")
    public String description;

    public DescriptionModel(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }

    public /* synthetic */ DescriptionModel() {
    }
}
