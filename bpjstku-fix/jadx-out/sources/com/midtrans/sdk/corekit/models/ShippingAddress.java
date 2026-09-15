package com.midtrans.sdk.corekit.models;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ShippingAddress {
    public String address;
    public String city;

    @SerializedName("country_code")
    public String countryCode;

    @SerializedName("first_name")
    public String firstName;

    @SerializedName("last_name")
    public String lastName;
    public String phone;

    @SerializedName(PlaceTypes.POSTAL_CODE)
    public String postalCode;

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountryCode() {
        return this.countryCode;
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

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
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

    public void setPostalCode(String str) {
        this.postalCode = str;
    }
}
