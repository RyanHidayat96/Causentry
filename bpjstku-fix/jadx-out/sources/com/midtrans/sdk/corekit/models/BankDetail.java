package com.midtrans.sdk.corekit.models;

import android.text.TextUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class BankDetail implements Serializable {
    private String Bank_code;
    private String Bin;
    private String Bin_class;
    private String Bin_type;
    private String Card_association;
    private String Country;
    private String Created_at;
    private String Id;
    private String Issuing_bank;
    private String Updated_at;

    public String getBank_code() {
        return this.Bank_code;
    }

    public String getBin() {
        return TextUtils.isEmpty(this.Bin) ? "" : this.Bin;
    }

    public String getBin_class() {
        return this.Bin_class;
    }

    public String getBin_type() {
        return this.Bin_type;
    }

    public String getCard_association() {
        return TextUtils.isEmpty(this.Card_association) ? "" : this.Card_association;
    }

    public String getCountry() {
        return this.Country;
    }

    public String getCreated_at() {
        return this.Created_at;
    }

    public String getId() {
        return this.Id;
    }

    public String getIssuing_bank() {
        return TextUtils.isEmpty(this.Issuing_bank) ? "" : this.Issuing_bank;
    }

    public String getUpdated_at() {
        return this.Updated_at;
    }

    public void setBank_code(String str) {
        this.Bank_code = str;
    }

    public void setBin(String str) {
        this.Bin = str;
    }

    public void setBin_class(String str) {
        this.Bin_class = str;
    }

    public void setBin_type(String str) {
        this.Bin_type = str;
    }

    public void setCard_association(String str) {
        this.Card_association = str;
    }

    public void setCountry(String str) {
        this.Country = str;
    }

    public void setCreated_at(String str) {
        this.Created_at = str;
    }

    public void setId(String str) {
        this.Id = str;
    }

    public void setIssuing_bank(String str) {
        this.Issuing_bank = str;
    }

    public void setUpdated_at(String str) {
        this.Updated_at = str;
    }
}
