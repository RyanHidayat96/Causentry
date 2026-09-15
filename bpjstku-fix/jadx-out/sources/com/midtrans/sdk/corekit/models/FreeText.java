package com.midtrans.sdk.corekit.models;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FreeText {
    public List<FreeTextLanguage> inquiry;
    public List<FreeTextLanguage> payment;

    public FreeText(List<FreeTextLanguage> list, List<FreeTextLanguage> list2) {
        this.inquiry = list;
        this.payment = list2;
    }

    public void setInquiry(List<FreeTextLanguage> list) {
        this.inquiry = list;
    }

    public void setPayment(List<FreeTextLanguage> list) {
        this.payment = list;
    }

    public /* synthetic */ FreeText() {
    }
}
