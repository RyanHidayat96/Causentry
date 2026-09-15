package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.params.IndosatDompetkuPaymentParams;
import defpackage.FuturesExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes4.dex */
public class IndosatDompetkuPaymentRequest extends BasePaymentRequest {

    @SerializedName("payment_params")
    public IndosatDompetkuPaymentParams paymentParams;

    public IndosatDompetkuPaymentRequest(String str, IndosatDompetkuPaymentParams indosatDompetkuPaymentParams) {
        super(str);
        this.paymentParams = indosatDompetkuPaymentParams;
    }

    public static /* synthetic */ void b() {
        FuturesExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0] = Class.forName("SwitchCompatEmojiCompatInitCallback").getDeclaredField("b");
    }
}
