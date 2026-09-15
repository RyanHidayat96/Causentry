package com.midtrans.sdk.corekit.models.snap.payment;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class QrisPaymentParameter {

    @SerializedName("acquirer")
    public List<String> acquirer;

    public QrisPaymentParameter(List<String> list) {
        this.acquirer = list;
    }
}
