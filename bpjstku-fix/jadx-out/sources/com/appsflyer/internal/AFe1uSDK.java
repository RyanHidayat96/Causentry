package com.appsflyer.internal;

import com.appsflyer.internal.AFe1lSDK.AnonymousClass5;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1uSDK {
    public final AFc1qSDK AFAdRevenueData;
    private final AFe1lSDK component3;
    private final AFf1gSDK component4;
    private final AFg1qSDK getCurrencyIso4217Code;
    private final ExecutorService getMediationNetwork;
    private final AFc1pSDK getMonetizationNetwork;
    public final AFc1iSDK getRevenue;

    public AFe1uSDK(AFc1qSDK aFc1qSDK, AFc1iSDK aFc1iSDK, AFc1pSDK aFc1pSDK, ExecutorService executorService, AFg1qSDK aFg1qSDK, AFf1gSDK aFf1gSDK, AFe1lSDK aFe1lSDK) {
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(aFf1gSDK, "");
        Intrinsics.checkNotNullParameter(aFe1lSDK, "");
        this.AFAdRevenueData = aFc1qSDK;
        this.getRevenue = aFc1iSDK;
        this.getMonetizationNetwork = aFc1pSDK;
        this.getMediationNetwork = executorService;
        this.getCurrencyIso4217Code = aFg1qSDK;
        this.component4 = aFf1gSDK;
        this.component3 = aFe1lSDK;
    }

    public final void getRevenue() {
        if (this.AFAdRevenueData.getMediationNetwork("didSendRevenueTriggerOnLastBackground", true) || !AFj1iSDK.getRevenue(this.getRevenue.getMonetizationNetwork)) {
            return;
        }
        getMediationNetwork(AFe1tSDK.AFa1uSDK.INSTANCE, new Function1<AFe1rSDK, Unit>() { // from class: com.appsflyer.internal.AFe1uSDK.4
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFe1rSDK aFe1rSDK) {
                getRevenue(aFe1rSDK);
                return Unit.INSTANCE;
            }

            public final void getRevenue(AFe1rSDK aFe1rSDK) {
                Intrinsics.checkNotNullParameter(aFe1rSDK, "");
                if (aFe1rSDK == AFe1rSDK.SUCCESS) {
                    AFe1uSDK.this.AFAdRevenueData.getCurrencyIso4217Code("didSendRevenueTriggerOnLastBackground", true);
                }
            }

            {
                super(1);
            }
        });
    }

    public final void getMediationNetwork(AFe1tSDK aFe1tSDK, Function1<? super AFe1rSDK, Unit> function1) {
        Intrinsics.checkNotNullParameter(aFe1tSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AFf1zSDK aFf1zSDK = new AFf1zSDK(aFe1tSDK, this.getMediationNetwork, this.getMonetizationNetwork, this.getRevenue, this.getCurrencyIso4217Code, this.component4, function1);
        AFe1lSDK aFe1lSDK = this.component3;
        aFe1lSDK.getRevenue.execute(aFe1lSDK.new AnonymousClass5(aFf1zSDK));
    }
}
