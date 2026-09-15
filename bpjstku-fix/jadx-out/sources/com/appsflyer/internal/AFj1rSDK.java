package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1rSDK extends AFj1qSDK {
    final ProviderInfo getMediationNetwork;
    private final AFc1dSDK getMonetizationNetwork;

    public AFj1rSDK(ProviderInfo providerInfo, Runnable runnable, AFc1dSDK aFc1dSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getMonetizationNetwork = aFc1dSDK;
        this.getMediationNetwork = providerInfo;
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getRevenue(final Context context) {
        this.getMonetizationNetwork.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1rSDK.5
            @Override // java.lang.Runnable
            public final void run() {
                Cursor cursorQuery;
                AFj1rSDK aFj1rSDK = AFj1rSDK.this;
                aFj1rSDK.component1 = System.currentTimeMillis();
                aFj1rSDK.component4 = AFj1qSDK.AFa1ySDK.STARTED;
                aFj1rSDK.addObserver(new AFj1qSDK.AnonymousClass5());
                StringBuilder sb = new StringBuilder("content://");
                sb.append(AFj1rSDK.this.getMediationNetwork.authority);
                sb.append("/transaction_id");
                Uri uri = Uri.parse(sb.toString());
                ContentProviderClient contentProviderClientB_ = AFj1rSDK.B_(context, uri);
                try {
                    if (contentProviderClientB_ != null) {
                        StringBuilder sb2 = new StringBuilder("app_id=");
                        sb2.append(context.getPackageName());
                        cursorQuery = contentProviderClientB_.query(uri, null, sb2.toString(), null, null);
                    } else {
                        cursorQuery = null;
                    }
                } catch (DeadObjectException e2) {
                    AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e2, false, true, false);
                    cursorQuery = null;
                } catch (RemoteException e3) {
                    AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to query unstable content providerClient", e3, false, true, false);
                    cursorQuery = null;
                } catch (Throwable th) {
                    AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Error to get data from providerClient ", th, false, true, false);
                    cursorQuery = null;
                } finally {
                    contentProviderClientB_.close();
                }
                if (cursorQuery != null) {
                    int columnIndex = cursorQuery.getColumnIndex(FirebaseAnalytics.Param.TRANSACTION_ID);
                    if (columnIndex != -1) {
                        AFj1rSDK.this.AFAdRevenueData.put("response", "OK");
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(columnIndex);
                            cursorQuery.close();
                            if (string != null && !string.isEmpty()) {
                                AFj1rSDK.this.AFAdRevenueData.put("referrer", string);
                            }
                        }
                    } else {
                        AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "Wrong column name");
                        AFj1rSDK.this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                    }
                    cursorQuery.close();
                } else {
                    AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                    AFj1rSDK.this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
                }
                AFj1rSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1iSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1rSDK.this.getMediationNetwork).packageName)));
                AFj1rSDK.this.AFAdRevenueData.put("api_ver_name", AFj1iSDK.getMediationNetwork(context, ((PackageItemInfo) AFj1rSDK.this.getMediationNetwork).packageName));
                AFj1rSDK.this.getMediationNetwork();
            }
        });
    }

    public static ContentProviderClient B_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e2, false, true, false);
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false, true, false);
            return null;
        }
    }
}
