package com.midtrans.sdk.uikit.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class CountryCodeModel implements Serializable {

    @SerializedName("country-code")
    private String countryCode;

    @SerializedName("alpha-3")
    public String countryCodeAlpha;

    @SerializedName("name")
    public String name;
}
