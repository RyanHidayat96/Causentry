package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.snap.Token;

/* JADX INFO: loaded from: classes4.dex */
public interface CheckoutCallback extends HttpRequestCallback {
    void onFailure(Token token, String str);

    void onSuccess(Token token);
}
