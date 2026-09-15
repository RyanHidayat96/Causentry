package com.midtrans.sdk.corekit.models;

/* JADX INFO: loaded from: classes4.dex */
public class ItemDetails {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public String f843id;
    public String name;
    public Double price;
    public int quantity;

    public ItemDetails() {
    }

    public ItemDetails(String str, double d, int i, String str2) {
        this.f843id = str;
        this.price = Double.valueOf(d);
        this.quantity = i;
        this.name = str2;
    }

    public String getId() {
        return this.f843id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setId(String str) {
        this.f843id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPrice(Double d) {
        this.price = d;
    }

    public void setQuantity(int i) {
        this.quantity = i;
    }
}
