package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class KlikBCAModel extends TransactionModel {
    public static final String PAYMENT_TYPE = "bca_klikbca";

    @SerializedName("bca_klikbca")
    private KlikBCADescriptionModel descriptionModel;

    public KlikBCAModel() {
    }

    public KlikBCAModel(KlikBCADescriptionModel klikBCADescriptionModel, TransactionDetails transactionDetails, ArrayList<ItemDetails> arrayList, ArrayList<BillingAddress> arrayList2, ArrayList<ShippingAddress> arrayList3, CustomerDetails customerDetails) {
        setTransactionDetails(transactionDetails);
        setDescriptionModel(klikBCADescriptionModel);
        this.paymentType = "bca_klikbca";
        this.customerDetails = customerDetails;
        this.itemDetails = arrayList;
        this.billingAddresses = arrayList2;
        this.shippingAddresses = arrayList3;
    }

    public KlikBCADescriptionModel getDescriptionModel() {
        return this.descriptionModel;
    }

    public String getPaymentType() {
        return "bca_klikbca";
    }

    public TransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    public void setDescriptionModel(KlikBCADescriptionModel klikBCADescriptionModel) {
        this.descriptionModel = klikBCADescriptionModel;
    }

    public void setTransactionDetails(TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }
}
