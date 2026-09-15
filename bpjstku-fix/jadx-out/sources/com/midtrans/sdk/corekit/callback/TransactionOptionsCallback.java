package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.snap.Transaction;

/* JADX INFO: loaded from: classes4.dex */
public interface TransactionOptionsCallback extends HttpRequestCallback {
    void onFailure(Transaction transaction, String str);

    void onSuccess(Transaction transaction);
}
