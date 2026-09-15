package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.TokenDetailsResponse;

/* JADX INFO: loaded from: classes4.dex */
public interface CardTokenCallback extends HttpRequestCallback {
    void onFailure(TokenDetailsResponse tokenDetailsResponse, String str);

    void onSuccess(TokenDetailsResponse tokenDetailsResponse);
}
