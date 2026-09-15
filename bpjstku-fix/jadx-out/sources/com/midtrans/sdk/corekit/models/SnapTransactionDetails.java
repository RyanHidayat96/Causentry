package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class SnapTransactionDetails {
    public String currency;

    @SerializedName("gross_amount")
    public Double grossAmount;

    @SerializedName("order_id")
    public String orderId;

    public SnapTransactionDetails(String str, Double d) {
        setOrderId(str);
        setGrossAmount(d);
    }

    public Double getGrossAmount() {
        return this.grossAmount;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setGrossAmount(Double d) {
        this.grossAmount = d;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public /* synthetic */ SnapTransactionDetails() {
    }
}
