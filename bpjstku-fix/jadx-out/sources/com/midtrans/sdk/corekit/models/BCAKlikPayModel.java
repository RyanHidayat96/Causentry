package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class BCAKlikPayModel extends TransactionModel {
    public static final String PAYMENT_TYPE = "bca_klikpay";

    @SerializedName("bca_klikpay")
    private BCAKlikPayDescriptionModel bcaKlikPayDescriptionModel;

    public BCAKlikPayModel(BCAKlikPayDescriptionModel bCAKlikPayDescriptionModel, TransactionDetails transactionDetails, ArrayList<ItemDetails> arrayList, ArrayList<BillingAddress> arrayList2, ArrayList<ShippingAddress> arrayList3, CustomerDetails customerDetails) {
        setBcaKlikPayDescriptionModel(bCAKlikPayDescriptionModel);
        setTransactionDetails(transactionDetails);
        this.paymentType = "bca_klikpay";
        this.itemDetails = arrayList;
        this.billingAddresses = arrayList2;
        this.shippingAddresses = arrayList3;
        this.customerDetails = customerDetails;
    }

    public BCAKlikPayDescriptionModel getBcaKlikPayDescriptionModel() {
        return this.bcaKlikPayDescriptionModel;
    }

    public String getPaymentType() {
        return "bca_klikpay";
    }

    public TransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    public void setBcaKlikPayDescriptionModel(BCAKlikPayDescriptionModel bCAKlikPayDescriptionModel) {
        this.bcaKlikPayDescriptionModel = bCAKlikPayDescriptionModel;
    }

    public void setTransactionDetails(TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }
}
