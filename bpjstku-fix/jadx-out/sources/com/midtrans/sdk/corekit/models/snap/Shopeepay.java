package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class Shopeepay implements Serializable {

    @SerializedName("callback_url")
    public String callbackUrl;

    public Shopeepay(String str) {
        this.callbackUrl = str;
    }

    public /* synthetic */ Shopeepay() {
    }
}
