package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class TransactionDetails {

    @SerializedName("gross_amount")
    private double amount;
    private String currency;

    @SerializedName("order_id")
    private String orderId;

    public TransactionDetails() {
    }

    public TransactionDetails(String str, Double d) {
        setOrderId(str);
        setAmount(d);
    }

    public double getAmount() {
        return this.amount;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setAmount(Double d) {
        this.amount = d.doubleValue();
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }
}
