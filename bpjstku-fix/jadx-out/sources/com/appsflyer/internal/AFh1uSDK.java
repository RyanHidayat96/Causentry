package com.appsflyer.internal;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public interface AFh1uSDK {
    void getCurrencyIso4217Code(AFh1rSDK aFh1rSDK);

    void getMediationNetwork();

    void getMediationNetwork(AFh1rSDK aFh1rSDK);

    void getMonetizationNetwork(AFh1rSDK aFh1rSDK);

    boolean getMonetizationNetwork();

    void getRevenue(AFf1uSDK aFf1uSDK, Function0<Unit> function0);

    boolean getRevenue();

    void u_(Intent intent, AFa1oSDK aFa1oSDK);
}
