package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class PermataBankTransfer extends TransactionModel {
    public static final String PAYMENT_TYPE = "bank_transfer";

    @SerializedName("bank_transfer")
    private BankTransfer bankTransfer;

    public PermataBankTransfer(BankTransfer bankTransfer, TransactionDetails transactionDetails, ArrayList<ItemDetails> arrayList, ArrayList<BillingAddress> arrayList2, ArrayList<ShippingAddress> arrayList3, CustomerDetails customerDetails) {
        this.paymentType = "bank_transfer";
        this.bankTransfer = bankTransfer;
        this.transactionDetails = transactionDetails;
        this.itemDetails = arrayList;
        this.billingAddresses = arrayList2;
        this.shippingAddresses = arrayList3;
        this.customerDetails = customerDetails;
    }

    public BankTransfer getBankTransfer() {
        return this.bankTransfer;
    }

    public ArrayList<BillingAddress> getBillingAddresses() {
        return this.billingAddresses;
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
