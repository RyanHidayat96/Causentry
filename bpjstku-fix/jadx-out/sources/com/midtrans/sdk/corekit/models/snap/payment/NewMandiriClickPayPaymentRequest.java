package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.params.NewMandiriClickPaymentParams;

/* JADX INFO: loaded from: classes5.dex */
public class NewMandiriClickPayPaymentRequest extends BasePaymentRequest {

    @SerializedName("payment_params")
    private NewMandiriClickPaymentParams paymentParams;

    public NewMandiriClickPayPaymentRequest(String str, NewMandiriClickPaymentParams newMandiriClickPaymentParams) {
        super(str);
        this.paymentParams = newMandiriClickPaymentParams;
    }
}
