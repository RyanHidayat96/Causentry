package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.CardRegistrationResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface CardRegistrationCallback extends HttpRequestCallback {
    void onFailure(CardRegistrationResponse cardRegistrationResponse, String str);

    void onSuccess(CardRegistrationResponse cardRegistrationResponse);
}
