package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class BillInfoModel {

    @SerializedName("bill_info1")
    private String billInfo1;

    @SerializedName("bill_info2")
    private String billInfo2;

    @SerializedName("bill_info3")
    private String billInfo3;

    @SerializedName("bill_info4")
    private String billInfo4;

    @SerializedName("bill_info5")
    private String billInfo5;

    @SerializedName("bill_info6")
    private String billInfo6;

    @SerializedName("bill_info7")
    private String billInfo7;

    @SerializedName("bill_info8")
    private String billInfo8;

    public BillInfoModel(String str, String str2) {
        this.billInfo1 = str;
        this.billInfo2 = str2;
    }

    public String getBillInfo1() {
        return this.billInfo1;
    }

    public String getBillInfo2() {
        return this.billInfo2;
    }

    public String getBillInfo3() {
        return this.billInfo3;
    }

    public String getBillInfo4() {
        return this.billInfo4;
    }

    public String getBillInfo5() {
        return this.billInfo5;
    }

    public String getBillInfo6() {
        return this.billInfo6;
    }

    public String getBillInfo7() {
        return this.billInfo7;
    }

    public String getBillInfo8() {
        return this.billInfo8;
    }

    public void setBillInfo1(String str) {
        this.billInfo1 = str;
    }

    public void setBillInfo2(String str) {
        this.billInfo2 = str;
    }

    public void setBillInfo3(String str) {
        this.billInfo3 = str;
    }

    public void setBillInfo4(String str) {
        this.billInfo4 = str;
    }

    public void setBillInfo5(String str) {
        this.billInfo5 = str;
    }

    public void setBillInfo6(String str) {
        this.billInfo6 = str;
    }

    public void setBillInfo7(String str) {
        this.billInfo7 = str;
    }

    public void setBillInfo8(String str) {
        this.billInfo8 = str;
    }
}
