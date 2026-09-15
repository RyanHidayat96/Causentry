package com.midtrans.sdk.corekit.models;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class IndomaretRequestModel {
    private CstoreEntity cstore;

    @SerializedName("customer_details")
    private CustomerDetails customerDetails;
    private List<ItemDetails> item_details;

    @SerializedName(FirebaseAnalytics.Param.PAYMENT_TYPE)
    private String paymentType;

    @SerializedName("transaction_details")
    private TransactionDetails transactionDetails;

    public CstoreEntity getCstore() {
        return this.cstore;
    }

    public CustomerDetails getCustomerDetails() {
        return this.customerDetails;
    }

    public List<ItemDetails> getItem_details() {
        return this.item_details;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public TransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    public void setCstore(CstoreEntity cstoreEntity) {
        this.cstore = cstoreEntity;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public void setItem_details(List<ItemDetails> list) {
        this.item_details = list;
    }

    public void setPaymentType(String str) {
        this.paymentType = str;
    }

    public void setTransactionDetails(TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }
}
