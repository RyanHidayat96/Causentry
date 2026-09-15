package com.midtrans.sdk.uikit.models;

import com.midtrans.sdk.corekit.models.snap.EnabledPayment;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class EnabledPayments implements Serializable {
    public List<EnabledPayment> enabledPayments;

    public EnabledPayments(List<EnabledPayment> list) {
        this.enabledPayments = list;
    }
}
