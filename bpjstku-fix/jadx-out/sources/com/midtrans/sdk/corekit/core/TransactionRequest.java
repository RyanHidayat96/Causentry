package com.midtrans.sdk.corekit.core;

import android.text.TextUtils;
import com.midtrans.sdk.corekit.models.BcaBankTransferRequestModel;
import com.midtrans.sdk.corekit.models.BillInfoModel;
import com.midtrans.sdk.corekit.models.BillingAddress;
import com.midtrans.sdk.corekit.models.CustomerDetails;
import com.midtrans.sdk.corekit.models.ExpiryModel;
import com.midtrans.sdk.corekit.models.ItemDetails;
import com.midtrans.sdk.corekit.models.ShippingAddress;
import com.midtrans.sdk.corekit.models.snap.BankTransferRequestModel;
import com.midtrans.sdk.corekit.models.snap.CreditCard;
import com.midtrans.sdk.corekit.models.snap.Gopay;
import com.midtrans.sdk.corekit.models.snap.Shopeepay;
import com.midtrans.sdk.corekit.models.snap.UobEzpay;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TransactionRequest {
    private Double amount;
    private BcaBankTransferRequestModel bcaVa;
    private BillInfoModel billInfoModel;
    private BankTransferRequestModel bniVa;
    private BankTransferRequestModel briVa;
    private String cardClickType;
    private CreditCard creditCard;
    private String currency;
    private String customField1;
    private String customField2;
    private String customField3;
    private Map<String, String> customObject;
    private List<String> enabledPayments;
    private ExpiryModel expiry;
    private Gopay gopay;
    private boolean isSecureCard;
    private ArrayList<ItemDetails> itemDetails;
    private ArrayList<BillingAddress> mBillingAddressArrayList;
    private CustomerDetails mCustomerDetails;
    private ArrayList<ShippingAddress> mShippingAddressArrayList;
    private String orderId;
    public int paymentMethod;
    private BankTransferRequestModel permataVa;
    private List<String> promoCodes;
    private boolean promoEnabled;
    private Shopeepay shopeepay;
    private UobEzpay uobEzpay;
    private boolean useUi;

    public TransactionRequest(String str, double d) {
        this.currency = Currency.IDR;
        this.paymentMethod = -1;
        this.orderId = null;
        this.amount = Double.valueOf(0.0d);
        this.isSecureCard = true;
        this.billInfoModel = null;
        this.itemDetails = new ArrayList<>();
        this.mBillingAddressArrayList = new ArrayList<>();
        this.mShippingAddressArrayList = new ArrayList<>();
        this.mCustomerDetails = null;
        this.useUi = true;
        if (TextUtils.isEmpty(str) || d <= 0.0d) {
            Logger.e("Invalid transaction data.");
            return;
        }
        this.orderId = str;
        this.amount = Double.valueOf(d);
        this.currency = Currency.IDR;
        this.paymentMethod = -1;
    }

    public TransactionRequest(String str, Double d, String str2) {
        this.currency = Currency.IDR;
        this.paymentMethod = -1;
        this.orderId = null;
        this.amount = Double.valueOf(0.0d);
        this.isSecureCard = true;
        this.billInfoModel = null;
        this.itemDetails = new ArrayList<>();
        this.mBillingAddressArrayList = new ArrayList<>();
        this.mShippingAddressArrayList = new ArrayList<>();
        this.mCustomerDetails = null;
        this.useUi = true;
        if (TextUtils.isEmpty(str) || d.doubleValue() <= 0.0d) {
            Logger.e("Invalid transaction data.");
            return;
        }
        this.orderId = str;
        this.amount = d;
        this.currency = str2;
    }

    private void sanitizeBillingAddress(BillingAddress billingAddress) {
        if (billingAddress != null) {
            if (TextUtils.isEmpty(billingAddress.getAddress())) {
                billingAddress.setAddress(null);
            }
            if (TextUtils.isEmpty(billingAddress.getFirstName())) {
                billingAddress.setFirstName(null);
            }
            if (TextUtils.isEmpty(billingAddress.getLastName())) {
                billingAddress.setLastName(null);
            }
            if (TextUtils.isEmpty(billingAddress.getCity())) {
                billingAddress.setCity(null);
            }
            if (TextUtils.isEmpty(billingAddress.getPostalCode())) {
                billingAddress.setPostalCode(null);
            }
            if (TextUtils.isEmpty(billingAddress.getPhone())) {
                billingAddress.setPhone(null);
            }
            if (TextUtils.isEmpty(billingAddress.getCountryCode())) {
                billingAddress.setCountryCode(null);
            }
        }
    }

    private CustomerDetails sanitizeCustomerDetails(CustomerDetails customerDetails) {
        if (customerDetails != null) {
            if (TextUtils.isEmpty(customerDetails.getFirstName())) {
                customerDetails.setFirstName(null);
            }
            if (TextUtils.isEmpty(customerDetails.getLastName())) {
                customerDetails.setLastName(null);
            }
            if (TextUtils.isEmpty(customerDetails.getEmail())) {
                customerDetails.setEmail(null);
            }
            if (TextUtils.isEmpty(customerDetails.getPhone())) {
                customerDetails.setPhone(null);
            }
            sanitizeBillingAddress(customerDetails.getBillingAddress());
            sanitizeShippingAddress(customerDetails.getShippingAddress());
        }
        return customerDetails;
    }

    private void sanitizeShippingAddress(ShippingAddress shippingAddress) {
        if (shippingAddress != null) {
            if (TextUtils.isEmpty(shippingAddress.getAddress())) {
                shippingAddress.setAddress(null);
            }
            if (TextUtils.isEmpty(shippingAddress.getFirstName())) {
                shippingAddress.setFirstName(null);
            }
            if (TextUtils.isEmpty(shippingAddress.getLastName())) {
                shippingAddress.setLastName(null);
            }
            if (TextUtils.isEmpty(shippingAddress.getCity())) {
                shippingAddress.setCity(null);
            }
            if (TextUtils.isEmpty(shippingAddress.getPostalCode())) {
                shippingAddress.setPostalCode(null);
            }
            if (TextUtils.isEmpty(shippingAddress.getPhone())) {
                shippingAddress.setPhone(null);
            }
            if (TextUtils.isEmpty(shippingAddress.getCountryCode())) {
                shippingAddress.setCountryCode(null);
            }
        }
    }

    public void enableUi(boolean z) {
        this.useUi = z;
    }

    public double getAmount() {
        return this.amount.doubleValue();
    }

    public BcaBankTransferRequestModel getBcaVa() {
        return this.bcaVa;
    }

    public BillInfoModel getBillInfoModel() {
        return this.billInfoModel;
    }

    public ArrayList<BillingAddress> getBillingAddressArrayList() {
        return this.mBillingAddressArrayList;
    }

    public BankTransferRequestModel getBniVa() {
        return this.bniVa;
    }

    public BankTransferRequestModel getBriVa() {
        return this.briVa;
    }

    public String getCardClickType() {
        return this.cardClickType;
    }

    public CreditCard getCreditCard() {
        return this.creditCard;
    }

    public String getCurrency() {
        return this.currency;
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

    public CustomerDetails getCustomerDetails() {
        return this.mCustomerDetails;
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

    public String getOrderId() {
        return this.orderId;
    }

    public int getPaymentMethod() {
        return this.paymentMethod;
    }

    public BankTransferRequestModel getPermataVa() {
        return this.permataVa;
    }

    public List<String> getPromoCodes() {
        return this.promoCodes;
    }

    public ArrayList<ShippingAddress> getShippingAddressArrayList() {
        return this.mShippingAddressArrayList;
    }

    public Shopeepay getShopeepay() {
        return this.shopeepay;
    }

    public UobEzpay getUobEzpay() {
        return this.uobEzpay;
    }

    public boolean isPromoEnabled() {
        return this.promoEnabled;
    }

    public boolean isSecureCard() {
        return this.isSecureCard;
    }

    public boolean isUiEnabled() {
        return this.useUi;
    }

    public void setBcaVa(BcaBankTransferRequestModel bcaBankTransferRequestModel) {
        this.bcaVa = bcaBankTransferRequestModel;
    }

    public void setBillInfoModel(BillInfoModel billInfoModel) {
        this.billInfoModel = billInfoModel;
    }

    public void setBillingAddressArrayList(ArrayList<BillingAddress> arrayList) {
        this.mBillingAddressArrayList = arrayList;
    }

    public void setBniVa(BankTransferRequestModel bankTransferRequestModel) {
        this.bniVa = bankTransferRequestModel;
    }

    public void setBriVa(BankTransferRequestModel bankTransferRequestModel) {
        this.briVa = bankTransferRequestModel;
    }

    @Deprecated
    public void setCardPaymentInfo(String str, boolean z) {
        StringBuilder sb = new StringBuilder("clicktype:");
        sb.append(str);
        sb.append(",isSecured:");
        sb.append(z);
        Logger.i(sb.toString());
        this.cardClickType = str;
        this.isSecureCard = z;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void setCurrency(String str) {
        this.currency = str;
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

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.mCustomerDetails = sanitizeCustomerDetails(customerDetails);
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

    public void setPromoCodes(List<String> list) {
        this.promoCodes = list;
    }

    public void setPromoEnabled(boolean z) {
        this.promoEnabled = z;
    }

    public void setShippingAddressArrayList(ArrayList<ShippingAddress> arrayList) {
        this.mShippingAddressArrayList = arrayList;
    }

    public void setShopeepay(Shopeepay shopeepay) {
        this.shopeepay = shopeepay;
    }

    public void setUobEzpay(UobEzpay uobEzpay) {
        this.uobEzpay = uobEzpay;
    }
}
