package com.midtrans.sdk.corekit.models.snap;

/* JADX INFO: loaded from: classes4.dex */
public class ItemDetails {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f845id;
    private String name;
    private double price;
    private int quantity;

    public ItemDetails() {
    }

    public ItemDetails(String str, String str2, double d, int i) {
        setId(str);
        setName(str2);
        setPrice(d);
        setQuantity(i);
    }

    public String getId() {
        return this.f845id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setId(String str) {
        this.f845id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPrice(double d) {
        this.price = d;
    }

    public void setQuantity(int i) {
        this.quantity = i;
    }
}
