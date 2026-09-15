package com.midtrans.sdk.corekit.models.snap;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class TransactionData {
    private BankTransfer bankTransfer;
    private CustomerDetails customerDetails;
    private List<String> enabledPayments;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f847id;
    private List<ItemDetails> itemDetails;
    private String kind;
    private PaymentOptions paymentOptions;
    private TransactionDetails transactionDetails;
    private String transactionId;

    public BankTransfer getBankTransfer() {
        return this.bankTransfer;
    }

    public CustomerDetails getCustomerDetails() {
        return this.customerDetails;
    }

    public List<String> getEnabledPayments() {
        return this.enabledPayments;
    }

    public String getId() {
        return this.f847id;
    }

    public List<ItemDetails> getItemDetails() {
        return this.itemDetails;
    }

    public String getKind() {
        return this.kind;
    }

    public PaymentOptions getPaymentOptions() {
        return this.paymentOptions;
    }

    public TransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setBankTransfer(BankTransfer bankTransfer) {
        this.bankTransfer = bankTransfer;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public void setEnabledPayments(List<String> list) {
        this.enabledPayments = list;
    }

    public void setId(String str) {
        this.f847id = str;
    }

    public void setItemDetails(List<ItemDetails> list) {
        this.itemDetails = list;
    }

    public void setKind(String str) {
        this.kind = str;
    }

    public void setPaymentOptions(PaymentOptions paymentOptions) {
        this.paymentOptions = paymentOptions;
    }

    public void setTransactionDetails(TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public void setTransactionId(String str) {
        this.transactionId = str;
    }
}
