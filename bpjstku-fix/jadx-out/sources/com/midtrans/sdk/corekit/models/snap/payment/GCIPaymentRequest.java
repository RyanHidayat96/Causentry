package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.params.GCIPaymentParams;

/* JADX INFO: loaded from: classes4.dex */
public class GCIPaymentRequest {

    @SerializedName("payment_params")
    private GCIPaymentParams paymentParams;

    @SerializedName(FirebaseAnalytics.Param.PAYMENT_TYPE)
    private String paymentType;

    public GCIPaymentRequest(GCIPaymentParams gCIPaymentParams, String str) {
        this.paymentParams = gCIPaymentParams;
        this.paymentType = str;
    }

    public GCIPaymentParams getPaymentParams() {
        return this.paymentParams;
    }
}
