package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1cSDK implements AFb1hSDK {
    private final AFf1gSDK getCurrencyIso4217Code;
    private final AFc1kSDK getMediationNetwork;
    private final AFc1iSDK getMonetizationNetwork;

    public AFb1cSDK(AFc1kSDK aFc1kSDK, AFc1iSDK aFc1iSDK, AFf1gSDK aFf1gSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFf1gSDK, "");
        this.getMediationNetwork = aFc1kSDK;
        this.getMonetizationNetwork = aFc1iSDK;
        this.getCurrencyIso4217Code = aFf1gSDK;
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final void getMediationNetwork() {
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context != null) {
            try {
                Intrinsics.checkNotNullExpressionValue(AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener() { // from class: com.appsflyer.internal.AFb1cSDK$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        AFb1cSDK.AFAdRevenueData(this.f$0, (AppSetIdInfo) obj);
                    }
                }), "");
            } catch (Throwable th) {
                AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th, false, false, false, false, 120, null);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFb1cSDK aFb1cSDK, AppSetIdInfo appSetIdInfo) {
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        AFc1kSDK aFc1kSDK = aFb1cSDK.getMediationNetwork;
        int scope = appSetIdInfo.getScope();
        String id2 = appSetIdInfo.getId();
        Intrinsics.checkNotNullExpressionValue(id2, "");
        aFc1kSDK.toString = new AFb1gSDK(scope, id2);
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final boolean getCurrencyIso4217Code() {
        return !this.getCurrencyIso4217Code.AFAdRevenueData() && !this.getMediationNetwork.AFAdRevenueData() && AFj1iSDK.AFAdRevenueData(this.getMonetizationNetwork.getMonetizationNetwork) && AFj1iSDK.getCurrencyIso4217Code(this.getMonetizationNetwork.getMonetizationNetwork);
    }
}
