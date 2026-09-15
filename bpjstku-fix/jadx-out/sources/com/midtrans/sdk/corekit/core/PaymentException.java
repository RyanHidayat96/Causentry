package com.midtrans.sdk.corekit.core;

/* JADX INFO: loaded from: classes4.dex */
public class PaymentException extends RuntimeException {
    public String statusCode;

    public PaymentException(String str, String str2, Throwable th) {
        super(th);
        this.statusCode = str;
    }
}
