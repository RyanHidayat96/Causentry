package com.midtrans.sdk.corekit.models.snap;

import com.midtrans.sdk.corekit.models.TransactionResponse;

/* JADX INFO: loaded from: classes4.dex */
public class TransactionResult {
    public static final String STATUS_FAILED = "failed";
    public static final String STATUS_INVALID = "invalid";
    public static final String STATUS_PENDING = "pending";
    public static final String STATUS_SUCCESS = "success";
    private TransactionResponse response;
    private String source;
    private String status;
    private String statusMessage;
    private boolean transactionCanceled;

    public TransactionResult() {
    }

    public TransactionResult(TransactionResponse transactionResponse) {
        setResponse(transactionResponse);
    }

    public TransactionResult(TransactionResponse transactionResponse, String str, String str2) {
        setResponse(transactionResponse);
        setSource(str);
        setStatus(str2);
    }

    public TransactionResult(String str, String str2) {
        this.status = str;
        this.statusMessage = str2;
    }

    public TransactionResult(boolean z) {
        this.transactionCanceled = z;
    }

    public TransactionResponse getResponse() {
        return this.response;
    }

    public String getSource() {
        return this.source;
    }

    public String getStatus() {
        return this.status;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public boolean isTransactionCanceled() {
        return this.transactionCanceled;
    }

    public void setResponse(TransactionResponse transactionResponse) {
        this.response = transactionResponse;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
