package com.midtrans.sdk.corekit.models.snap;

/* JADX INFO: loaded from: classes6.dex */
public class CustomerDetails {
    private String address;
    private String email;
    private String name;
    private String phone;

    public CustomerDetails() {
    }

    public CustomerDetails(String str, String str2, String str3, String str4) {
        setName(str);
        setPhone(str2);
        setEmail(str3);
        setAddress(str4);
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPhone(String str) {
        this.phone = str;
    }
}
