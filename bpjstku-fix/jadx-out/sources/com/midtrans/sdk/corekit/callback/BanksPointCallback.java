package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.snap.BanksPointResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface BanksPointCallback extends HttpRequestCallback {
    void onFailure(String str);

    void onSuccess(BanksPointResponse banksPointResponse);
}
