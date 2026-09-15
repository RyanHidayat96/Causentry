package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.params.TelkomselCashPaymentParams;

/* JADX INFO: loaded from: classes4.dex */
public class TelkomselEcashPaymentRequest extends BasePaymentRequest {

    @SerializedName("payment_params")
    private TelkomselCashPaymentParams paymentParams;

    public TelkomselEcashPaymentRequest(String str, TelkomselCashPaymentParams telkomselCashPaymentParams) {
        super(str);
        this.paymentParams = telkomselCashPaymentParams;
    }
}
