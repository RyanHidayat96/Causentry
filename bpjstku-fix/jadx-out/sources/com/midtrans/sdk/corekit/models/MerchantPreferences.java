package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class MerchantPreferences {

    @SerializedName("color_scheme")
    private String colorScheme;

    @SerializedName("color_scheme_url")
    private String colorSchemeUrl;

    @SerializedName("display_name")
    private String displayName;

    @SerializedName("error_url")
    private String errorUrl;

    @SerializedName("finish_url")
    private String finishUrl;
    private String locale;

    @SerializedName("logo_url")
    private String logoUrl;

    @SerializedName("other_va_processor")
    private String otherVaProcessor;

    @SerializedName("pending_url")
    private String pendingUrl;

    public String getColorScheme() {
        return this.colorScheme;
    }

    public String getColorSchemeUrl() {
        return this.colorSchemeUrl;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getErrorUrl() {
        return this.errorUrl;
    }

    public String getFinishUrl() {
        return this.finishUrl;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public String getOtherVaProcessor() {
        return this.otherVaProcessor;
    }

    public String getPendingUrl() {
        return this.pendingUrl;
    }

    public void setColorScheme(String str) {
        this.colorScheme = str;
    }

    public void setColorSchemeUrl(String str) {
        this.colorSchemeUrl = str;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setErrorUrl(String str) {
        this.errorUrl = str;
    }

    public void setFinishUrl(String str) {
        this.finishUrl = str;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public void setLogoUrl(String str) {
        this.logoUrl = str;
    }

    public void setOtherVaProcessor(String str) {
        this.otherVaProcessor = str;
    }

    public void setPendingUrl(String str) {
        this.pendingUrl = str;
    }
}
