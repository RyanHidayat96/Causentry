package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.SaveCardResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface SaveCardCallback extends HttpRequestCallback {
    void onFailure(String str);

    void onSuccess(SaveCardResponse saveCardResponse);
}
