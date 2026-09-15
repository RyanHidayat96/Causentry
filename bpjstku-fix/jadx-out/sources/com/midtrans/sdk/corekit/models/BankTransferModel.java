package com.midtrans.sdk.corekit.models;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class BankTransferModel {
    private String bankName;
    private String description;
    private int image;
    private boolean isSelected;
    private Integer priority = 0;
    private String status;

    public BankTransferModel(String str, int i, boolean z, int i2, String str2) {
        setBankName(str);
        setImage(i);
        setIsSelected(z);
        setPriority(Integer.valueOf(i2));
        setDescription(str2);
    }

    public BankTransferModel(String str, int i, boolean z, int i2, String str2, String str3) {
        setBankName(str);
        setImage(i);
        setIsSelected(z);
        setPriority(Integer.valueOf(i2));
        setDescription(str2);
        setStatus(str3);
    }

    public String getBankName() {
        return this.bankName;
    }

    public String getDescription() {
        return this.description;
    }

    public int getImage() {
        return this.image;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setBankName(String str) {
        this.bankName = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setImage(int i) {
        this.image = i;
    }

    public void setIsSelected(boolean z) {
        this.isSelected = z;
    }

    public void setPriority(Integer num) {
        this.priority = num;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
