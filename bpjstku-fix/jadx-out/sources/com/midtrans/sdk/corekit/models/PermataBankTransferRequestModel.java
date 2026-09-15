package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.BankTransferRequestModel;

/* JADX INFO: loaded from: classes4.dex */
public class PermataBankTransferRequestModel extends BankTransferRequestModel {

    @SerializedName("recipient_name")
    public String recipientName;

    public PermataBankTransferRequestModel() {
    }

    public PermataBankTransferRequestModel(String str) {
        super(str);
    }

    public String getRecipientName() {
        return this.recipientName;
    }

    public void setRecipientName(String str) {
        this.recipientName = str;
    }
}
