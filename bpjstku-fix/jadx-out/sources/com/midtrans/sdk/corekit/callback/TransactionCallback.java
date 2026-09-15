package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.TransactionResponse;

/* JADX INFO: loaded from: classes4.dex */
public interface TransactionCallback extends HttpRequestCallback {
    void onFailure(TransactionResponse transactionResponse, String str);

    void onSuccess(TransactionResponse transactionResponse);
}
