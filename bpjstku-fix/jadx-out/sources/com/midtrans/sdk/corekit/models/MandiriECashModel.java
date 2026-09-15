package com.midtrans.sdk.corekit.models;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class MandiriECashModel extends TransactionModel {
    public static final String PAYMENT_TYPE = "mandiri_ecash";

    public MandiriECashModel(DescriptionModel descriptionModel, TransactionDetails transactionDetails, ArrayList<ItemDetails> arrayList, ArrayList<BillingAddress> arrayList2, ArrayList<ShippingAddress> arrayList3, CustomerDetails customerDetails) {
        this.paymentType = "mandiri_ecash";
        this.mandiriECash = descriptionModel;
        this.transactionDetails = transactionDetails;
        this.itemDetails = arrayList;
        this.billingAddresses = arrayList2;
        this.shippingAddresses = arrayList3;
        this.customerDetails = customerDetails;
    }

    public ArrayList<BillingAddress> getBillingAddresses() {
        return this.billingAddresses;
    }

    public CustomerDetails getCustomerDetails() {
        return this.customerDetails;
    }

    public DescriptionModel getDescription() {
        return this.mandiriECash;
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
