package com.midtrans.sdk.corekit.models;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.core.Constants;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TokenDetailsResponse {

    @SerializedName(PlaceTypes.BANK)
    private String bank = null;

    @SerializedName(Constants.WEBVIEW_REDIRECT_URL)
    private String redirectUrl;

    @SerializedName("status_code")
    private String statusCode;

    @SerializedName("status_message")
    private String statusMessage;

    @SerializedName("token_id")
    private String tokenId;

    @SerializedName("validation_messages")
    private List<String> validationMessages;

    public String getBank() {
        return this.bank;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public List<String> getValidationMessages() {
        return this.validationMessages;
    }

    public void setBank(String str) {
        this.bank = str;
    }

    public void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public void setStatusCode(String str) {
        this.statusCode = str;
    }

    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }

    public void setTokenId(String str) {
        this.tokenId = str;
    }
}
