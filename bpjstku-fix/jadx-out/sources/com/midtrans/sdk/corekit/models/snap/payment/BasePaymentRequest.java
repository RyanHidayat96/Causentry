package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class BasePaymentRequest {

    @SerializedName(FirebaseAnalytics.Param.PAYMENT_TYPE)
    public String paymentType;

    public BasePaymentRequest(String str) {
        this.paymentType = str;
    }
}
