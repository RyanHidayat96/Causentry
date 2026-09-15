package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class Gopay implements Serializable {

    @SerializedName("enable_callback")
    public boolean enableCallback;

    @SerializedName("callback_url")
    public String merchantGopayDeeplink;

    public Gopay(String str) {
        this.merchantGopayDeeplink = str;
        this.enableCallback = true;
    }

    public String getMerchantGopayDeeplink() {
        return this.merchantGopayDeeplink;
    }

    public void setMerchantGopayDeeplink(String str) {
        this.merchantGopayDeeplink = str;
        this.enableCallback = true;
    }

    public /* synthetic */ Gopay() {
    }
}
