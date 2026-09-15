package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;

/* JADX INFO: loaded from: classes3.dex */
public final class AFg1ySDK {
    public final AFc1qSDK AFAdRevenueData;

    public AFg1ySDK(Context context) {
        this.AFAdRevenueData = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getRevenue(context);
    }

    public static boolean getMonetizationNetwork(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
            return AFj1iSDK.L_(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th);
        }
    }

    public static boolean getMonetizationNetwork(AFc1qSDK aFc1qSDK) {
        return aFc1qSDK.getMediationNetwork("sentRegisterRequestToAF", false);
    }

    public final AFf1aSDK getRevenue() {
        String string;
        String string2;
        String strAFAdRevenueData = this.AFAdRevenueData.AFAdRevenueData("afUninstallToken", (String) null);
        long currencyIso4217Code = this.AFAdRevenueData.getCurrencyIso4217Code("afUninstallToken_received_time", 0L);
        boolean mediationNetwork = this.AFAdRevenueData.getMediationNetwork("afUninstallToken_queued", false);
        this.AFAdRevenueData.getCurrencyIso4217Code("afUninstallToken_queued", false);
        if (strAFAdRevenueData == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit = string2.split(",");
            strAFAdRevenueData = strArrSplit[strArrSplit.length - 1];
        }
        if (currencyIso4217Code == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit2 = string.split(",");
            if (strArrSplit2.length >= 2) {
                try {
                    currencyIso4217Code = Long.parseLong(strArrSplit2[strArrSplit2.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (strAFAdRevenueData != null) {
            return new AFf1aSDK(strAFAdRevenueData, currencyIso4217Code, mediationNetwork);
        }
        return null;
    }
}
