package com.appsflyer;

import com.appsflyer.internal.AFc1dSDK;
import com.appsflyer.internal.AFc1pSDK;
import com.appsflyer.internal.AFe1lSDK;
import com.appsflyer.internal.AFj1cSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class PurchaseHandler {
    public final AFc1dSDK getCurrencyIso4217Code;
    private final AFc1pSDK getMediationNetwork;
    public final AFe1lSDK getRevenue;

    public interface PurchaseValidationCallback {
        void onFailure(Throwable th);

        void onResponse(ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(AFc1dSDK aFc1dSDK) {
        this.getCurrencyIso4217Code = aFc1dSDK;
        this.getMediationNetwork = aFc1dSDK.getRevenue();
        this.getRevenue = aFc1dSDK.copydefault();
    }

    public final boolean AFAdRevenueData(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean mediationNetwork = AFj1cSDK.getMediationNetwork(map, strArr, this.getMediationNetwork);
        if (!mediationNetwork && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return mediationNetwork;
    }
}
