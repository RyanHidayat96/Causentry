package com.midtrans.sdk.corekit.models;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class GetOffersResponseModel {

    @SerializedName("status_code")
    private int code;

    @SerializedName("status_message")
    private String message;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private OffersResponseModel offers;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public OffersResponseModel getOffers() {
        return this.offers;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setOffers(OffersResponseModel offersResponseModel) {
        this.offers = offersResponseModel;
    }
}
