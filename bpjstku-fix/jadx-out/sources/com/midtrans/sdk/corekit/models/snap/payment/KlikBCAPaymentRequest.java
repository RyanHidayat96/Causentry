package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.params.KlikBcaPaymentParams;

/* JADX INFO: loaded from: classes4.dex */
public class KlikBCAPaymentRequest extends BasePaymentRequest {

    @SerializedName("payment_params")
    private KlikBcaPaymentParams paymentParams;

    public KlikBCAPaymentRequest(String str, KlikBcaPaymentParams klikBcaPaymentParams) {
        super(str);
        this.paymentParams = klikBcaPaymentParams;
    }

    public KlikBcaPaymentParams getPaymentParams() {
        return this.paymentParams;
    }
}
