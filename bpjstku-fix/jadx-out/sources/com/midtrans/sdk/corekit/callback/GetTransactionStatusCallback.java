package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.snap.TransactionStatusResponse;

/* JADX INFO: loaded from: classes4.dex */
public interface GetTransactionStatusCallback extends HttpRequestCallback {
    void onFailure(TransactionStatusResponse transactionStatusResponse, String str);

    void onSuccess(TransactionStatusResponse transactionStatusResponse);
}
