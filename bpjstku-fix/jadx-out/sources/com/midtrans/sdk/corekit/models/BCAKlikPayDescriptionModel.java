package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class BCAKlikPayDescriptionModel {
    public static final int DEFAULT_MISC_FEE = 0;
    public static final int NORMAL_TYPE = 1;
    private String description;

    @SerializedName("misc_fee")
    private int miscFee;
    private int type;

    public BCAKlikPayDescriptionModel(int i, int i2, String str) {
        setType(i);
        setMiscFee(i2);
        setDescription(str);
    }

    public BCAKlikPayDescriptionModel(int i, String str) {
        setType(1);
        setMiscFee(i);
        setDescription(str);
    }

    public BCAKlikPayDescriptionModel(String str) {
        setType(1);
        setMiscFee(0);
        setDescription(str);
    }

    public String getDescription() {
        return this.description;
    }

    public int getMiscFee() {
        return this.miscFee;
    }

    public int getType() {
        return this.type;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setMiscFee(int i) {
        this.miscFee = i;
    }

    public void setType(int i) {
        this.type = i;
    }
}
