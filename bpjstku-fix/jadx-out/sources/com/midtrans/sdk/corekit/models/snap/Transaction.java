package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.corekit.models.promo.PromoDetails;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class Transaction {
    private Callbacks callbacks;

    @SerializedName("credit_card")
    private CreditCard creditCard;

    @SerializedName("customer_details")
    private com.midtrans.sdk.corekit.models.CustomerDetails customerDetails;

    @SerializedName("enabled_payments")
    private List<EnabledPayment> enabledPayments;

    @SerializedName(PaymentType.GOPAY)
    private Gopay gopay;

    @SerializedName("item_details")
    private List<ItemDetails> itemDetails;

    @SerializedName("merchant")
    private MerchantData merchantData;

    @SerializedName("promo_details")
    private PromoDetails promoDetails;

    @Deprecated
    private List<PromoResponse> promos;
    private String token;

    @SerializedName("transaction_details")
    private TransactionDetails transactionDetails;

    public Callbacks getCallbacks() {
        return this.callbacks;
    }

    public CreditCard getCreditCard() {
        return this.creditCard;
    }

    public com.midtrans.sdk.corekit.models.CustomerDetails getCustomerDetails() {
        return this.customerDetails;
    }

    public List<EnabledPayment> getEnabledPayments() {
        return this.enabledPayments;
    }

    public Gopay getGopay() {
        return this.gopay;
    }

    public List<ItemDetails> getItemDetails() {
        return this.itemDetails;
    }

    public MerchantData getMerchantData() {
        return this.merchantData;
    }

    public PromoDetails getPromoDetails() {
        return this.promoDetails;
    }

    public List<PromoResponse> getPromos() {
        return this.promos;
    }

    public String getToken() {
        return this.token;
    }

    public TransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    public void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void setCustomerDetails(com.midtrans.sdk.corekit.models.CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public void setEnabledPayments(List<EnabledPayment> list) {
        this.enabledPayments = list;
    }

    public void setGopay(Gopay gopay) {
        this.gopay = gopay;
    }

    public void setItemDetails(List<ItemDetails> list) {
        this.itemDetails = list;
    }

    public void setMerchantData(MerchantData merchantData) {
        this.merchantData = merchantData;
    }

    public void setPromoDetails(PromoDetails promoDetails) {
        this.promoDetails = promoDetails;
    }

    public void setPromos(List<PromoResponse> list) {
        this.promos = list;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setTransactionDetails(TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }
}
