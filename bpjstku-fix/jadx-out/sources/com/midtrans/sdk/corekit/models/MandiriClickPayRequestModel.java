package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class MandiriClickPayRequestModel extends TransactionModel {
    public static final String PAYMENT_TYPE = "mandiri_clickpay";

    @SerializedName("mandiri_clickpay")
    private MandiriClickPayModel mandiriClickPayModel;

    public MandiriClickPayRequestModel(MandiriClickPayModel mandiriClickPayModel, TransactionDetails transactionDetails, ArrayList<ItemDetails> arrayList, ArrayList<BillingAddress> arrayList2, ArrayList<ShippingAddress> arrayList3, CustomerDetails customerDetails) {
        this.paymentType = "mandiri_clickpay";
        this.mandiriClickPayModel = mandiriClickPayModel;
        this.transactionDetails = transactionDetails;
        this.itemDetails = arrayList;
        this.billingAddresses = arrayList2;
        this.shippingAddresses = arrayList3;
        this.customerDetails = customerDetails;
    }

    public MandiriClickPayModel getMandiriClickPayModel() {
        return this.mandiriClickPayModel;
    }

    public String getPaymentType() {
        return "mandiri_clickpay";
    }

    public TransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    public void setMandiriClickPayModel(MandiriClickPayModel mandiriClickPayModel) {
        this.mandiriClickPayModel = mandiriClickPayModel;
    }

    public void setTransactionDetails(TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }
}
