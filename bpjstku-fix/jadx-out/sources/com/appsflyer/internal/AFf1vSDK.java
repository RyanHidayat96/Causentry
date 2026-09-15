package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1vSDK extends AFe1dSDK<String> {
    private final AFh1mSDK component2;

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AFd1nSDK<String> getRevenue(String str) {
        String strEncodeToString = Base64.encodeToString(this.component2.AFAdRevenueData(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(strEncodeToString)));
        ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(this.component2.component1, strEncodeToString);
        AFd1oSDK aFd1oSDK = this.component4;
        return (AFd1nSDK) AFd1oSDK.getCurrencyIso4217Code(new Object[]{aFd1oSDK, this.component2}, -44698683, 44698684, System.identityHashCode(aFd1oSDK));
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AppsFlyerRequestListener component3() {
        return this.component2.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return super.getMediationNetwork() || copy() || equals();
    }

    private boolean copy() {
        AFe1mSDK aFe1mSDK;
        AFh1mSDK aFh1mSDK = this.component2;
        if (aFh1mSDK.toString != null) {
            aFe1mSDK = aFh1mSDK.toString;
        } else {
            aFe1mSDK = AFe1mSDK.CACHED_EVENT;
        }
        return aFe1mSDK == AFe1mSDK.ARS_VALIDATE && ((AFe1dSDK) this).component1 != null && ((AFe1dSDK) this).component1.getStatusCode() == 424;
    }

    public AFf1vSDK(AFh1mSDK aFh1mSDK, AFc1dSDK aFc1dSDK) {
        AFe1mSDK aFe1mSDK;
        if (aFh1mSDK.toString != null) {
            aFe1mSDK = aFh1mSDK.toString;
        } else {
            aFe1mSDK = AFe1mSDK.CACHED_EVENT;
        }
        AFe1mSDK aFe1mSDK2 = aFe1mSDK;
        AFe1mSDK[] aFe1mSDKArr = {AFe1mSDK.RC_CDN};
        StringBuilder sb = new StringBuilder();
        sb.append(aFh1mSDK.getRevenue);
        sb.append("-");
        sb.append(getRevenue(aFh1mSDK));
        super(aFe1mSDK2, aFe1mSDKArr, aFc1dSDK, sb.toString(), aFh1mSDK.getRevenue);
        this.component2 = aFh1mSDK;
    }

    private static String getRevenue(AFh1mSDK aFh1mSDK) {
        try {
            return new URL(aFh1mSDK.component1).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    private boolean equals() {
        ResponseNetwork responseNetwork = ((AFe1dSDK) this).component1;
        return (this.getMediationNetwork == AFe1rSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1) && (this.getMonetizationNetwork == AFe1mSDK.CONVERSION || this.getMonetizationNetwork == AFe1mSDK.ATTR);
    }
}
