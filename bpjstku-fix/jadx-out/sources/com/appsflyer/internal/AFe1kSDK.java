package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class AFe1kSDK extends AFe1dSDK<String> {
    private final String component2;
    private final Map<String, String> copy;
    private final LinkGenerator.ResponseListener copydefault;
    private final LinkGenerator equals;
    private final UUID hashCode;
    private final String toString;

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AppsFlyerRequestListener component3() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        return 3000L;
    }

    public AFe1kSDK(AFc1dSDK aFc1dSDK, UUID uuid, String str, Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener, LinkGenerator linkGenerator) {
        super(AFe1mSDK.ONELINK, new AFe1mSDK[]{AFe1mSDK.RC_CDN}, aFc1dSDK, uuid.toString());
        this.hashCode = uuid;
        this.component2 = str;
        this.copy = new HashMap(map);
        this.copydefault = responseListener;
        this.toString = str2;
        this.equals = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        super.getRevenue();
        LinkGenerator.ResponseListener responseListener = this.copydefault;
        if (responseListener != null) {
            if (this.getMediationNetwork == AFe1rSDK.SUCCESS && ((AFe1dSDK) this).component1 != null) {
                responseListener.onResponse((String) ((AFe1dSDK) this).component1.getBody());
                return;
            }
            Throwable thComponent4 = component4();
            if (thComponent4 instanceof ParsingException) {
                if (((ParsingException) thComponent4).getRawResponse().isSuccessful()) {
                    responseListener.onResponseError("Can't parse one link data");
                    return;
                } else {
                    responseListener.onResponse(this.equals.generateLink());
                    return;
                }
            }
            responseListener.onResponse(this.equals.generateLink());
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AFd1nSDK<String> getRevenue(String str) {
        return this.component4.getMonetizationNetwork(this.component2, this.copy, this.toString, this.hashCode, str);
    }
}
