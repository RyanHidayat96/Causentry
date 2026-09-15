package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFa1zSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFc1iSDK;", "p0", "Lcom/appsflyer/internal/AFc1pSDK;", "p1", "", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFc1pSDK;)V", "", "getCurrencyIso4217Code", "()Ljava/lang/String;", "getRevenue"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFa1zSDK {
    public static final AFa1zSDK INSTANCE = new AFa1zSDK();

    private AFa1zSDK() {
    }

    @JvmStatic
    public static final void AFAdRevenueData(AFc1iSDK p0, AFc1pSDK p1) {
        int i;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFj1iSDK.getMediationNetwork()) {
            AFLogger.afRDLog("OPPO device found");
            i = 23;
        } else {
            i = 18;
        }
        if (Build.VERSION.SDK_INT >= i && !appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            int i2 = Build.VERSION.SDK_INT;
            StringBuilder sb = new StringBuilder("OS SDK is=");
            sb.append(i2);
            sb.append("; use KeyStore");
            AFLogger.afRDLog(sb.toString());
            AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p0.getMonetizationNetwork);
            if (!aFKeystoreWrapper.getRevenue()) {
                aFKeystoreWrapper.getRevenue = AFb1iSDK.getRevenue(p1.getMonetizationNetwork);
                aFKeystoreWrapper.AFAdRevenueData = 0;
                aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getMediationNetwork());
            } else {
                String mediationNetwork = aFKeystoreWrapper.getMediationNetwork();
                synchronized (aFKeystoreWrapper.getMonetizationNetwork) {
                    aFKeystoreWrapper.AFAdRevenueData++;
                    AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(mediationNetwork)));
                    try {
                        synchronized (aFKeystoreWrapper.getMonetizationNetwork) {
                            aFKeystoreWrapper.getCurrencyIso4217Code.deleteEntry(mediationNetwork);
                        }
                    } catch (KeyStoreException e2) {
                        StringBuilder sb2 = new StringBuilder("Exception ");
                        sb2.append(e2.getMessage());
                        sb2.append(" occurred");
                        AFLogger.afErrorLog(sb2.toString(), e2);
                    }
                }
                aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getMediationNetwork());
            }
            appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.getMonetizationNetwork());
            appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.AFAdRevenueData()));
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        StringBuilder sb3 = new StringBuilder("OS SDK is=");
        sb3.append(i3);
        sb3.append("; no KeyStore usage");
        AFLogger.afRDLog(sb3.toString());
    }

    public static String getCurrencyIso4217Code() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    public static String getRevenue() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }
}
