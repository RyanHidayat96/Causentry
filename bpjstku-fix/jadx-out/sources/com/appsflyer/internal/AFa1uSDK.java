package com.appsflyer.internal;

import com.appsflyer.internal.AFe1lSDK.AnonymousClass5;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1uSDK implements Runnable {
    private final Map<String, Object> getMediationNetwork;
    private final AFc1dSDK getMonetizationNetwork;
    private final AFh1rSDK getRevenue;

    public AFa1uSDK(AFc1dSDK aFc1dSDK, AFh1rSDK aFh1rSDK, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        Intrinsics.checkNotNullParameter(aFh1rSDK, "");
        this.getMonetizationNetwork = aFc1dSDK;
        this.getRevenue = aFh1rSDK;
        this.getMediationNetwork = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFf1sSDK aFf1rSDK;
        if (this.getRevenue.getMediationNetwork()) {
            AFf1uSDK aFf1uSDK = new AFf1uSDK(this.getRevenue, this.getMonetizationNetwork);
            aFf1uSDK.copydefault = this.getMediationNetwork;
            aFf1rSDK = aFf1uSDK;
        } else if (this.getRevenue instanceof AFh1lSDK) {
            aFf1rSDK = new AFf1sSDK((AFh1lSDK) this.getRevenue, this.getMonetizationNetwork);
        } else {
            aFf1rSDK = new AFf1rSDK(this.getRevenue, this.getMonetizationNetwork);
        }
        AFe1lSDK aFe1lSDKCopydefault = this.getMonetizationNetwork.copydefault();
        aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(aFf1rSDK));
        this.getMonetizationNetwork.AFKeystoreWrapper();
        if (AFe1zSDK.AFAdRevenueData()) {
            AFe1uSDK mediationNetwork = this.getMonetizationNetwork.getMediationNetwork();
            AFh1rSDK aFh1rSDK = this.getRevenue;
            Intrinsics.checkNotNullParameter(aFh1rSDK, "");
            if (AFj1iSDK.getRevenue(mediationNetwork.getRevenue.getMonetizationNetwork)) {
                AFe1tSDK.Companion companion = AFe1tSDK.INSTANCE;
                AFe1tSDK revenue = AFe1tSDK.Companion.getRevenue(aFh1rSDK);
                if (revenue != null) {
                    mediationNetwork.getMediationNetwork(revenue, AFe1uSDK.AnonymousClass3.getRevenue);
                }
            }
        }
    }
}
