package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class BanksPointResponse {

    @SerializedName("point_balance")
    private Long pointBalance;

    @SerializedName("point_balance_amount")
    private String pointBalanceAmount;

    @SerializedName("status_code")
    private String statusCode;

    @SerializedName("status_message")
    private String statusMessage;

    @SerializedName("transaction_time")
    private String transactionTime;

    @SerializedName("validation_messages")
    private ArrayList<String> validationMessages;

    public BanksPointResponse(String str, String str2, ArrayList<String> arrayList, Long l, String str3) {
        this.statusCode = str;
        this.statusMessage = str2;
        this.validationMessages = arrayList;
        this.pointBalance = l;
        this.transactionTime = str3;
    }

    public Long getPointBalance() {
        return this.pointBalance;
    }

    public String getPointBalanceAmount() {
        return this.pointBalanceAmount;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String getTransactionTime() {
        return this.transactionTime;
    }

    public ArrayList<String> getValidationMessages() {
        return this.validationMessages;
    }

    public void setPointBalanceAmount(String str) {
        this.pointBalanceAmount = str;
    }
}
