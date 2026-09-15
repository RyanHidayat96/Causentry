package com.midtrans.sdk.corekit.models;

import com.midtrans.sdk.corekit.models.promo.Promo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PaymentDetails {
    private List<com.midtrans.sdk.corekit.models.snap.ItemDetails> itemDetailsList;
    private Promo promoSelected;
    private com.midtrans.sdk.corekit.models.snap.TransactionDetails transactionDetails;

    public PaymentDetails(com.midtrans.sdk.corekit.models.snap.TransactionDetails transactionDetails, List<com.midtrans.sdk.corekit.models.snap.ItemDetails> list) {
        if (transactionDetails != null) {
            this.transactionDetails = new com.midtrans.sdk.corekit.models.snap.TransactionDetails(transactionDetails.getOrderId(), Double.valueOf(transactionDetails.getAmount()));
        }
        if (list != null) {
            this.itemDetailsList = new ArrayList(list);
        }
    }

    public void changePaymentDetails(List<com.midtrans.sdk.corekit.models.snap.ItemDetails> list, double d) {
        com.midtrans.sdk.corekit.models.snap.TransactionDetails transactionDetails = this.transactionDetails;
        if (transactionDetails != null) {
            transactionDetails.setAmount(Double.valueOf(d));
            this.itemDetailsList = list;
        }
    }

    public List<com.midtrans.sdk.corekit.models.snap.ItemDetails> getItemDetailsList() {
        return this.itemDetailsList;
    }

    public Promo getPromoSelected() {
        return this.promoSelected;
    }

    public double getTotalAmount() {
        com.midtrans.sdk.corekit.models.snap.TransactionDetails transactionDetails = this.transactionDetails;
        if (transactionDetails != null) {
            return transactionDetails.getAmount();
        }
        return 0.0d;
    }

    public com.midtrans.sdk.corekit.models.snap.TransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    public void setItemDetailsList(List<com.midtrans.sdk.corekit.models.snap.ItemDetails> list) {
        this.itemDetailsList = list;
    }

    public void setPromoSelected(Promo promo) {
        this.promoSelected = promo;
    }

    public void setTotalAmount(double d) {
        com.midtrans.sdk.corekit.models.snap.TransactionDetails transactionDetails = this.transactionDetails;
        if (transactionDetails != null) {
            transactionDetails.setAmount(Double.valueOf(d));
        }
    }

    public void setTransactionDetails(com.midtrans.sdk.corekit.models.snap.TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }
}
