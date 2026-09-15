package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1vSDK extends AFi1dSDK {
    private final AFc1dSDK getCurrencyIso4217Code;
    private final AFi1eSDK getMediationNetwork;

    public AFj1vSDK(Runnable runnable, AFc1dSDK aFc1dSDK, AFi1eSDK aFi1eSDK) {
        super(PlaceTypes.STORE, "huawei", aFc1dSDK.getRevenue(), runnable);
        this.getCurrencyIso4217Code = aFc1dSDK;
        this.getMediationNetwork = aFi1eSDK;
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getRevenue(final Context context) {
        if (AFAdRevenueData(context)) {
            this.getCurrencyIso4217Code.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.getCurrencyIso4217Code(context);
                }
            });
        }
    }

    private boolean AFAdRevenueData(Context context) {
        if (!getRevenue()) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getMediationNetwork.getRevenue(context)) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getMediationNetwork.AFAdRevenueData(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x00fc A[PHI: r2
  0x00fc: PHI (r2v8 android.database.Cursor) = (r2v7 android.database.Cursor), (r2v9 android.database.Cursor) binds: [B:26:0x00fa, B:15:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    public /* synthetic */ void getCurrencyIso4217Code(Context context) {
        this.component1 = System.currentTimeMillis();
        this.component4 = AFj1qSDK.AFa1ySDK.STARTED;
        addObserver(new AFj1qSDK.AnonymousClass5());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1iSDK.AFAdRevenueData(context, str)));
        this.AFAdRevenueData.put("api_ver_name", AFj1iSDK.getMediationNetwork(context, str));
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursorQuery != null) {
                if (!cursorQuery.moveToFirst()) {
                    this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                } else {
                    this.AFAdRevenueData.put("response", "OK");
                    this.AFAdRevenueData.put("referrer", cursorQuery.getString(0));
                    this.AFAdRevenueData.put("click_ts", Long.valueOf(cursorQuery.getLong(1)));
                    this.AFAdRevenueData.put("install_end_ts", Long.valueOf(cursorQuery.getLong(2)));
                    if (cursorQuery.getColumnCount() > 3) {
                        this.AFAdRevenueData.put("install_begin_ts", Long.valueOf(cursorQuery.getLong(3)));
                        HashMap map = new HashMap();
                        String string = cursorQuery.getString(4);
                        if (string != null) {
                            map.put("track_id", string);
                        }
                        map.put("referrer_ex", cursorQuery.getString(5));
                        this.AFAdRevenueData.put("huawei_custom", map);
                    }
                }
            } else {
                this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable th) {
            try {
                this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, th.getMessage() != null ? th.getMessage() : "", th, false, true);
                if (0 != 0) {
                    cursorQuery.close();
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                throw th2;
            }
        }
        getMediationNetwork();
    }
}
