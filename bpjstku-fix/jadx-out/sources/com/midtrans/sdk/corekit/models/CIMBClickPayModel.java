package com.midtrans.sdk.corekit.models;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class CIMBClickPayModel extends TransactionModel {
    public static final String PAYMENT_TYPE = "cimb_clicks";

    public CIMBClickPayModel(DescriptionModel descriptionModel, TransactionDetails transactionDetails, ArrayList<ItemDetails> arrayList, ArrayList<BillingAddress> arrayList2, ArrayList<ShippingAddress> arrayList3, CustomerDetails customerDetails) {
        this.paymentType = "cimb_clicks";
        this.cimbClicks = descriptionModel;
        this.transactionDetails = transactionDetails;
        this.itemDetails = arrayList;
        this.billingAddresses = arrayList2;
        this.shippingAddresses = arrayList3;
        this.customerDetails = customerDetails;
    }

    public ArrayList<BillingAddress> getBillingAddresses() {
        return this.billingAddresses;
    }

    public DescriptionModel getCIMBDescription() {
        return this.cimbClicks;
    }

    public CustomerDetails getCustomerDetails() {
        return this.customerDetails;
    }

    public ArrayList<ItemDetails> getItemDetails() {
        return this.itemDetails;
    }

    public String getPayment_type() {
        return this.paymentType;
    }

    public ArrayList<ShippingAddress> getShippingAddresses() {
        return this.shippingAddresses;
    }

    public TransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }
}
