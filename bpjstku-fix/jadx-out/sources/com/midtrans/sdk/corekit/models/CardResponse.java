package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class CardResponse {

    @SerializedName("status_code")
    private int code;
    private ArrayList<SaveCardRequest> data;

    @SerializedName("status_message")
    private String status;

    public int getCode() {
        return this.code;
    }

    public ArrayList<SaveCardRequest> getData() {
        return this.data;
    }

    public String getStatus() {
        return this.status;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(ArrayList<SaveCardRequest> arrayList) {
        this.data = arrayList;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
