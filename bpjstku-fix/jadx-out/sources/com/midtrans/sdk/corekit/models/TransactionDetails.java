package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class TransactionDetails {

    @SerializedName("gross_amount")
    public String grossAmount;

    @SerializedName("order_id")
    public String orderId;

    public TransactionDetails() {
    }

    public TransactionDetails(String str, String str2) {
        this.grossAmount = str;
        this.orderId = str2;
    }

    public String getGrossAmount() {
        return this.grossAmount;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setGrossAmount(String str) {
        this.grossAmount = str;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }
}
