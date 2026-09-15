package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class VaNumber implements Serializable {

    @SerializedName("va_number")
    public String accountNumber;
    public String bank;

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getBank() {
        return this.bank;
    }

    public void setAccountNumber(String str) {
        this.accountNumber = str;
    }

    public void setBank(String str) {
        this.bank = str;
    }
}
