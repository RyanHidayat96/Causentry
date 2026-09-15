package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1jSDK implements AFc1qSDK {
    private final AFc1hSDK<SharedPreferences> getMediationNetwork;
    private final Lazy getMonetizationNetwork;

    public AFc1jSDK(AFc1hSDK<SharedPreferences> aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        this.getMediationNetwork = aFc1hSDK;
        this.getMonetizationNetwork = LazyKt.lazy(new Function0<SharedPreferences>() { // from class: com.appsflyer.internal.AFc1jSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: l_, reason: merged with bridge method [inline-methods] */
            public final SharedPreferences invoke() {
                return (SharedPreferences) AFc1jSDK.this.getMediationNetwork.getMonetizationNetwork.invoke();
            }

            {
                super(0);
            }
        });
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMediationNetwork(String str, String str2) {
        ((SharedPreferences) this.getMonetizationNetwork.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final String AFAdRevenueData(String str, String str2) {
        try {
            return ((SharedPreferences) this.getMonetizationNetwork.getValue()).getString(str, str2);
        } catch (ClassCastException e2) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key ".concat(String.valueOf(str)), e2, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMediationNetwork(String str, boolean z) {
        try {
            return ((SharedPreferences) this.getMonetizationNetwork.getValue()).getBoolean(str, z);
        } catch (ClassCastException e2) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key ".concat(String.valueOf(str)), e2, false, false, false, false, 120, null);
            return z;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getCurrencyIso4217Code(String str, boolean z) {
        ((SharedPreferences) this.getMonetizationNetwork.getValue()).edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final long getCurrencyIso4217Code(String str, long j) {
        try {
            return ((SharedPreferences) this.getMonetizationNetwork.getValue()).getLong(str, j);
        } catch (ClassCastException e2) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key ".concat(String.valueOf(str)), e2, false, false, false, false, 120, null);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMonetizationNetwork(String str, long j) {
        ((SharedPreferences) this.getMonetizationNetwork.getValue()).edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMediationNetwork(String str, int i) {
        ((SharedPreferences) this.getMonetizationNetwork.getValue()).edit().putInt(str, i).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final int AFAdRevenueData(String str, int i) {
        try {
            return ((SharedPreferences) this.getMonetizationNetwork.getValue()).getInt(str, i);
        } catch (ClassCastException e2) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key ".concat(String.valueOf(str)), e2, false, false, false, false, 120, null);
            return i;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMediationNetwork(String str) {
        return ((SharedPreferences) this.getMonetizationNetwork.getValue()).contains(str);
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMonetizationNetwork(String str) {
        ((SharedPreferences) this.getMonetizationNetwork.getValue()).edit().remove(str).apply();
    }
}
