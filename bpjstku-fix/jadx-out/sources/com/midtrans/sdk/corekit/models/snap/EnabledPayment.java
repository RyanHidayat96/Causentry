package com.midtrans.sdk.corekit.models.snap;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class EnabledPayment implements Serializable {
    public static final String STATUS_DOWN = "down";
    public static final String STATUS_UP = "up";
    private String acquirer;
    private String category;
    private String status;
    private String type;

    public EnabledPayment(String str, String str2) {
        this.type = str;
        this.category = str2;
    }

    public String getAcquirer() {
        return this.acquirer;
    }

    public String getCategory() {
        return this.category;
    }

    public String getStatus() {
        return this.status;
    }

    public String getType() {
        return this.type;
    }

    public void setAcquirer(String str) {
        this.acquirer = str;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
