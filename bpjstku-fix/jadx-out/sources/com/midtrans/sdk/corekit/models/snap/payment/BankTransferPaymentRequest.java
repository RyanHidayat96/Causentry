package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class BankTransferPaymentRequest extends BasePaymentRequest {

    @SerializedName("customer_details")
    private CustomerDetailRequest customerDetails;

    public BankTransferPaymentRequest(String str, CustomerDetailRequest customerDetailRequest) {
        super(str);
        this.customerDetails = customerDetailRequest;
    }

    public CustomerDetailRequest getCustomerDetails() {
        return this.customerDetails;
    }
}
