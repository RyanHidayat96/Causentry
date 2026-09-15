package com.midtrans.sdk.corekit.models.snap.payment;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class CustomerDetailRequest {
    private String email;

    @SerializedName("full_name")
    private String fullName;
    private String phone;

    public String getEmail() {
        return this.email;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setEmail(String str) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.email = str;
    }

    public void setFullName(String str) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.fullName = str;
    }

    public void setPhone(String str) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.phone = str;
    }
}
