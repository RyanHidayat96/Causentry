package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.BankTransferRequestModel;

/* JADX INFO: loaded from: classes4.dex */
public class BcaBankTransferRequestModel extends BankTransferRequestModel {

    @SerializedName("free_text")
    public FreeText freeText;

    @SerializedName("sub_company_code")
    public String subCompanyCode;

    public BcaBankTransferRequestModel() {
    }

    public BcaBankTransferRequestModel(String str) {
        super(str);
    }

    public BcaBankTransferRequestModel(String str, FreeText freeText) {
        super(str);
        this.freeText = freeText;
    }

    public String getSubCompanyCode() {
        return this.subCompanyCode;
    }

    public void setSubCompanyCode(String str) {
        this.subCompanyCode = str;
    }
}
