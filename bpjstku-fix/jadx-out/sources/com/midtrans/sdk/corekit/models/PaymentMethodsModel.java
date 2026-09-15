package com.midtrans.sdk.corekit.models;

/* JADX INFO: loaded from: classes4.dex */
public class PaymentMethodsModel {
    private String description;
    private boolean havePromo;
    private int imageId;
    private boolean isSelected;
    private String name;
    private String paymentType;
    private Integer priority;
    private String status;

    public PaymentMethodsModel(String str, String str2, int i, String str3, int i2, String str4) {
        this.paymentType = str3;
        this.imageId = i;
        this.name = str;
        this.description = str2;
        this.priority = Integer.valueOf(i2);
        this.status = str4;
    }

    public String getDescription() {
        return this.description;
    }

    public int getImageId() {
        return this.imageId;
    }

    public String getName() {
        return this.name;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean isHavePromo() {
        return this.havePromo;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setHavePromo(boolean z) {
        this.havePromo = z;
    }

    public void setIsSelected(boolean z) {
        this.isSelected = z;
    }

    public void setPaymentType(String str) {
        this.paymentType = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
