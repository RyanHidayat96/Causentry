package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.SaveCardRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public interface GetCardCallback extends HttpRequestCallback {
    void onFailure(String str);

    void onSuccess(ArrayList<SaveCardRequest> arrayList);
}
