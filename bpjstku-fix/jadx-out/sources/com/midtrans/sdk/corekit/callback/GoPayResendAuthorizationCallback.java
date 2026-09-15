package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.GoPayResendAuthorizationResponse;

/* JADX INFO: loaded from: classes6.dex */
public interface GoPayResendAuthorizationCallback extends HttpRequestCallback {
    @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
    void onError(Throwable th);

    void onFailure(GoPayResendAuthorizationResponse goPayResendAuthorizationResponse, String str);

    void onSuccess(GoPayResendAuthorizationResponse goPayResendAuthorizationResponse);
}
