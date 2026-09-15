package com.midtrans.sdk.corekit.models;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.corekit.models.snap.BankTransferRequestModel;
import com.midtrans.sdk.corekit.models.snap.CreditCard;
import com.midtrans.sdk.corekit.models.snap.Gopay;
import com.midtrans.sdk.corekit.models.snap.Shopeepay;
import com.midtrans.sdk.corekit.models.snap.SnapPromo;
import com.midtrans.sdk.corekit.models.snap.UobEzpay;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TokenRequestModel {

    @SerializedName(PaymentType.BCA_VA)
    public BcaBankTransferRequestModel bcaVa;

    @SerializedName(PaymentType.BNI_VA)
    public BankTransferRequestModel bniVa;

    @SerializedName(PaymentType.BRI_VA)
    public BankTransferRequestModel briVa;

    @SerializedName("customer_details")
    public CustomerDetails costumerDetails;

    @SerializedName("credit_card")
    public CreditCard creditCard;

    @SerializedName("custom_field1")
    public String customField1;

    @SerializedName("custom_field2")
    public String customField2;

    @SerializedName("custom_field3")
    public String customField3;

    @SerializedName("enabled_payments")
    public List<String> enabledPayments;
    public ExpiryModel expiry;

    @SerializedName(PaymentType.GOPAY)
    public Gopay gopay;

    @SerializedName("item_details")
    public ArrayList<ItemDetails> itemDetails;

    @SerializedName(PaymentType.PERMATA_VA)
    public BankTransferRequestModel permataVa;
    public SnapPromo promo;

    @SerializedName(PaymentType.SHOPEEPAY)
    public Shopeepay shopeepay;

    @SerializedName("transaction_details")
    public SnapTransactionDetails transactionDetails;

    @SerializedName(PaymentType.UOB_EZPAY)
    public UobEzpay uobEzpay;

    @SerializedName("user_id")
    public String userId;

    public TokenRequestModel(SnapTransactionDetails snapTransactionDetails, ArrayList<ItemDetails> arrayList, CustomerDetails customerDetails) {
        this.transactionDetails = snapTransactionDetails;
        this.itemDetails = arrayList;
        this.costumerDetails = customerDetails;
    }

    public TokenRequestModel(SnapTransactionDetails snapTransactionDetails, ArrayList<ItemDetails> arrayList, CustomerDetails customerDetails, CreditCard creditCard) {
        this.transactionDetails = snapTransactionDetails;
        this.itemDetails = arrayList;
        this.costumerDetails = customerDetails;
        this.creditCard = creditCard;
    }

    public BankTransferRequestModel getBcaVa() {
        return this.bcaVa;
    }

    public BankTransferRequestModel getBniVa() {
        return this.bniVa;
    }

    public CustomerDetails getCostumerDetails() {
        return this.costumerDetails;
    }

    public CreditCard getCreditCard() {
        return this.creditCard;
    }

    public String getCustomField1() {
        return this.customField1;
    }

    public String getCustomField2() {
        return this.customField2;
    }

    public String getCustomField3() {
        return this.customField3;
    }

    public List<String> getEnabledPayments() {
        return this.enabledPayments;
    }

    public ExpiryModel getExpiry() {
        return this.expiry;
    }

    public Gopay getGopay() {
        return this.gopay;
    }

    public ArrayList<ItemDetails> getItemDetails() {
        return this.itemDetails;
    }

    public BankTransferRequestModel getPermataVa() {
        return this.permataVa;
    }

    public SnapPromo getPromo() {
        return this.promo;
    }

    public Shopeepay getShopeepay() {
        return this.shopeepay;
    }

    public String getString() {
        try {
            return new Gson().toJson(this);
        } catch (NullPointerException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public SnapTransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    public UobEzpay getUobEzpay() {
        return this.uobEzpay;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setBcaVa(BcaBankTransferRequestModel bcaBankTransferRequestModel) {
        this.bcaVa = bcaBankTransferRequestModel;
    }

    public void setBniVa(BankTransferRequestModel bankTransferRequestModel) {
        this.bniVa = bankTransferRequestModel;
    }

    public void setBriVa(BankTransferRequestModel bankTransferRequestModel) {
        this.briVa = bankTransferRequestModel;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void setCustomField1(String str) {
        this.customField1 = str;
    }

    public void setCustomField2(String str) {
        this.customField2 = str;
    }

    public void setCustomField3(String str) {
        this.customField3 = str;
    }

    public void setEnabledPayments(List<String> list) {
        this.enabledPayments = list;
    }

    public void setExpiry(ExpiryModel expiryModel) {
        this.expiry = expiryModel;
    }

    public void setGopay(Gopay gopay) {
        this.gopay = gopay;
    }

    public void setItemDetails(ArrayList<ItemDetails> arrayList) {
        this.itemDetails = arrayList;
    }

    public void setPermataVa(BankTransferRequestModel bankTransferRequestModel) {
        this.permataVa = bankTransferRequestModel;
    }

    public void setPromo(SnapPromo snapPromo) {
        this.promo = snapPromo;
    }

    public void setShopeepay(Shopeepay shopeepay) {
        this.shopeepay = shopeepay;
    }

    public void setTransactionDetails(SnapTransactionDetails snapTransactionDetails) {
        this.transactionDetails = snapTransactionDetails;
    }

    public void setUobEzpay(UobEzpay uobEzpay) {
        this.uobEzpay = uobEzpay;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public /* synthetic */ TokenRequestModel() {
    }
}
