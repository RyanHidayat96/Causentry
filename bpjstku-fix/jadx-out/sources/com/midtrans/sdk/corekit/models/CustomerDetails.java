package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class CustomerDetails {

    @SerializedName("billing_address")
    public BillingAddress billingAddress;

    @SerializedName("customer_identifier")
    public String customerIdentifier;
    public String email;

    @SerializedName("first_name")
    public String firstName;

    @SerializedName("last_name")
    public String lastName;
    public String phone;

    @SerializedName("shipping_address")
    public ShippingAddress shippingAddress;

    public CustomerDetails() {
    }

    public CustomerDetails(String str, String str2, String str3, String str4) {
        this.firstName = str;
        this.lastName = str2;
        this.email = str3;
        this.phone = str4;
    }

    public BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    public String getCustomerIdentifier() {
        return this.customerIdentifier;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPhone() {
        return this.phone;
    }

    public ShippingAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setCustomerIdentifier(String str) {
        this.customerIdentifier = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
