package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.snap.BankBinsResponse;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public interface BankBinsCallback extends HttpRequestCallback {
    void onFailure(String str);

    void onSuccess(ArrayList<BankBinsResponse> arrayList);
}
