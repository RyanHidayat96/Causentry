package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class GoPayResendAuthorizationResponse {

    @SerializedName("error_messages")
    private List<String> errorMessages;

    @SerializedName("finish_redirect_url")
    private String finishRedirectUrl;

    @SerializedName("status_code")
    private String statusCode;

    @SerializedName("status_message")
    private String statusMessage;

    public List<String> getErrorMessages() {
        return this.errorMessages;
    }

    public String getFinishRedirectUrl() {
        return this.finishRedirectUrl;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }
}
