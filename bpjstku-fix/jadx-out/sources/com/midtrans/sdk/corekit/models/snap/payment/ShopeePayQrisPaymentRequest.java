package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ShopeePayQrisPaymentRequest {

    @SerializedName("payment_params")
    public QrisPaymentParameter paymentParam;

    @SerializedName(FirebaseAnalytics.Param.PAYMENT_TYPE)
    public String paymentType;

    public ShopeePayQrisPaymentRequest(String str, QrisPaymentParameter qrisPaymentParameter) {
        this.paymentType = str;
        this.paymentParam = qrisPaymentParameter;
    }
}
