package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1zSDK extends AFi1dSDK {
    private final Runnable component3;
    private final AFj1ySDK getCurrencyIso4217Code;
    private final AFc1pSDK getMediationNetwork;
    private final ExecutorService getMonetizationNetwork;
    private String hashCode;

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getRevenue(final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (!AFAdRevenueData(context)) {
            this.component3.run();
        } else {
            this.getMonetizationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.AFj1zSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1zSDK.getMonetizationNetwork(this.f$0, context);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00aa A[PHI: r0
  0x00aa: PHI (r0v8 java.lang.String) = (r0v7 java.lang.String), (r0v15 java.lang.String), (r0v22 java.lang.String) binds: [B:15:0x0048, B:25:0x0078, B:35:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    private final boolean AFAdRevenueData(Context context) {
        String str;
        if (!getRevenue()) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String currencyIso4217Code = this.getMediationNetwork.getCurrencyIso4217Code("com.facebook.sdk.ApplicationId");
        String strRemovePrefix = currencyIso4217Code != null ? StringsKt.removePrefix(currencyIso4217Code, (CharSequence) "fb") : null;
        String str2 = strRemovePrefix;
        if (str2 == null || str2.length() == 0) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            strRemovePrefix = null;
        }
        if (strRemovePrefix == null) {
            String revenue = this.getMediationNetwork.getRevenue("facebook_application_id");
            strRemovePrefix = revenue != null ? StringsKt.removePrefix(revenue, (CharSequence) "fb") : null;
            String str3 = strRemovePrefix;
            if (str3 == null || str3.length() == 0) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                strRemovePrefix = null;
            }
            if (strRemovePrefix == null) {
                String currencyIso4217Code2 = this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.FacebookApplicationId");
                strRemovePrefix = currencyIso4217Code2 != null ? StringsKt.removePrefix(currencyIso4217Code2, (CharSequence) "fb") : null;
                String str4 = strRemovePrefix;
                if (str4 == null || str4.length() == 0) {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    strRemovePrefix = null;
                }
                str = strRemovePrefix != null ? strRemovePrefix : null;
            }
        }
        this.hashCode = str;
        if (str == null) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    private final boolean getCurrencyIso4217Code(Context context) {
        int i = AFa1vSDK.getMonetizationNetwork[this.getCurrencyIso4217Code.ordinal()];
        if (i == 1) {
            return getMediationNetwork(context);
        }
        if (i == 2) {
            return getMonetizationNetwork(context);
        }
        if (i == 3) {
            return component2(context);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getMonetizationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    private static boolean component2(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFj1zSDK(AFc1pSDK aFc1pSDK, ExecutorService executorService, AFj1ySDK aFj1ySDK, Runnable runnable, Runnable runnable2) {
        String str;
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1ySDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i = AFj1xSDK.AFa1ySDK.getMonetizationNetwork[aFj1ySDK.ordinal()];
        if (i == 1) {
            str = "facebook";
        } else if (i == 2) {
            str = "instagram";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "facebook_lite";
        }
        super("app", str, aFc1pSDK, runnable);
        this.getMediationNetwork = aFc1pSDK;
        this.getMonetizationNetwork = executorService;
        this.getCurrencyIso4217Code = aFj1ySDK;
        this.component3 = runnable2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:67:0x0247  */
    /* JADX WARN: Code duplicated, block: B:80:0x028a  */
    /* JADX WARN: Code duplicated, block: B:82:0x028f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0290 A[PHI: r9
  0x0290: PHI (r9v2 android.content.ContentProviderClient) = 
  (r9v1 android.content.ContentProviderClient)
  (r9v10 android.content.ContentProviderClient)
  (r9v10 android.content.ContentProviderClient)
 binds: [B:82:0x028f, B:63:0x0233, B:68:0x024a] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void getMonetizationNetwork(AFj1zSDK aFj1zSDK, Context context) {
        Throwable th;
        ContentProviderClient contentProviderClient;
        Cursor cursor;
        Uri uri;
        String string;
        String str;
        Intrinsics.checkNotNullParameter(aFj1zSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1zSDK.component1 = System.currentTimeMillis();
        aFj1zSDK.component4 = AFj1qSDK.AFa1ySDK.STARTED;
        aFj1zSDK.addObserver(new AFj1qSDK.AnonymousClass5());
        String str2 = aFj1zSDK.hashCode;
        Intrinsics.checkNotNull(str2);
        try {
            int i = AFa1vSDK.getMonetizationNetwork[aFj1zSDK.getCurrencyIso4217Code.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (component2(context)) {
                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                        StringBuilder sb = new StringBuilder("content://com.facebook.lite.provider.InstallReferrerProvider/");
                        sb.append(str2);
                        uri = Uri.parse(sb.toString());
                    } else {
                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                        uri = null;
                    }
                } else if (getMonetizationNetwork(context)) {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                    StringBuilder sb2 = new StringBuilder("content://com.instagram.contentprovider.InstallReferrerProvider/");
                    sb2.append(str2);
                    uri = Uri.parse(sb2.toString());
                } else {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
                    uri = null;
                }
            } else if (getMediationNetwork(context)) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                StringBuilder sb3 = new StringBuilder("content://com.facebook.katana.provider.InstallReferrerProvider/");
                sb3.append(str2);
                uri = Uri.parse(sb3.toString());
            } else {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
                uri = null;
            }
            if (uri != null) {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.query(uri, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex = cursorQuery.getColumnIndex("install_referrer");
                                if (columnIndex != -1) {
                                    string = cursorQuery.getString(columnIndex);
                                } else {
                                    AFLogger aFLogger = AFLogger.INSTANCE;
                                    AFg1cSDK aFg1cSDK = AFg1cSDK.META_REFERRER;
                                    AFj1ySDK aFj1ySDK = aFj1zSDK.getCurrencyIso4217Code;
                                    StringBuilder sb4 = new StringBuilder("No such column, ");
                                    sb4.append(aFj1ySDK);
                                    sb4.append(" provider");
                                    AFg1gSDK.d$default(aFLogger, aFg1cSDK, sb4.toString(), false, 4, null);
                                    string = null;
                                }
                                if (string != null) {
                                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.META_REFERRER;
                                    AFj1ySDK aFj1ySDK2 = aFj1zSDK.getCurrencyIso4217Code;
                                    StringBuilder sb5 = new StringBuilder("Collected ");
                                    sb5.append(aFj1ySDK2);
                                    sb5.append(" attribution data.");
                                    AFg1gSDK.d$default(aFLogger2, aFg1cSDK2, sb5.toString(), false, 4, null);
                                    Map<String, Object> map = aFj1zSDK.AFAdRevenueData;
                                    Intrinsics.checkNotNullExpressionValue(map, "");
                                    map.put("response", "OK");
                                    Map<String, Object> map2 = aFj1zSDK.AFAdRevenueData;
                                    Intrinsics.checkNotNullExpressionValue(map2, "");
                                    map2.put("referrer", string);
                                    int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
                                    Long lValueOf = columnIndex2 != -1 ? Long.valueOf(cursorQuery.getLong(columnIndex2)) : null;
                                    if (lValueOf != null) {
                                        aFj1zSDK.AFAdRevenueData.put("click_ts", Long.valueOf(lValueOf.longValue()));
                                    }
                                    int columnIndex3 = cursorQuery.getColumnIndex("is_ct");
                                    Integer numValueOf = columnIndex3 != -1 ? Integer.valueOf(cursorQuery.getInt(columnIndex3)) : null;
                                    if (numValueOf != null) {
                                        aFj1zSDK.AFAdRevenueData.put("meta_custom", MapsKt.mutableMapOf(TuplesKt.to("is_ct", Integer.valueOf(numValueOf.intValue()))));
                                    }
                                    int i2 = AFa1vSDK.getMonetizationNetwork[aFj1zSDK.getCurrencyIso4217Code.ordinal()];
                                    if (i2 == 1) {
                                        str = "com.facebook.katana";
                                    } else if (i2 == 2) {
                                        str = "com.instagram.android";
                                    } else {
                                        if (i2 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        str = "com.facebook.lite";
                                    }
                                    Map<String, Object> map3 = aFj1zSDK.AFAdRevenueData;
                                    Intrinsics.checkNotNullExpressionValue(map3, "");
                                    map3.put("api_ver", Long.valueOf(AFj1iSDK.AFAdRevenueData(context, str)));
                                    Map<String, Object> map4 = aFj1zSDK.AFAdRevenueData;
                                    Intrinsics.checkNotNullExpressionValue(map4, "");
                                    map4.put("api_ver_name", AFj1iSDK.getMediationNetwork(context, str));
                                }
                                cursorQuery.close();
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            } else {
                                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                            try {
                                AFLogger aFLogger3 = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK3 = AFg1cSDK.META_REFERRER;
                                String strName = aFj1zSDK.getCurrencyIso4217Code.name();
                                StringBuilder sb6 = new StringBuilder("Error while collecting Meta Install Referrer for ");
                                sb6.append(strName);
                                sb6.append(" provider");
                                AFg1gSDK.e$default(aFLogger3, aFg1cSDK3, sb6.toString(), th, false, false, false, false, 120, null);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (contentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient = contentProviderClient;
                                }
                                aFj1zSDK.getMediationNetwork();
                                aFj1zSDK.component3.run();
                            } catch (Throwable th3) {
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (contentProviderClient != null) {
                                    contentProviderClient.close();
                                }
                                throw th3;
                            }
                        }
                    } else {
                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    cursor = null;
                    AFLogger aFLogger4 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK4 = AFg1cSDK.META_REFERRER;
                    String strName2 = aFj1zSDK.getCurrencyIso4217Code.name();
                    StringBuilder sb7 = new StringBuilder("Error while collecting Meta Install Referrer for ");
                    sb7.append(strName2);
                    sb7.append(" provider");
                    AFg1gSDK.e$default(aFLogger4, aFg1cSDK4, sb7.toString(), th, false, false, false, false, 120, null);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (contentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient = contentProviderClient;
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    aFj1zSDK.getMediationNetwork();
                    aFj1zSDK.component3.run();
                }
            }
        } catch (Throwable th5) {
            th = th5;
            contentProviderClient = null;
        }
        aFj1zSDK.getMediationNetwork();
        aFj1zSDK.component3.run();
    }

    public final /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AFj1ySDK.values().length];
            try {
                iArr[AFj1ySDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1ySDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1ySDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getMonetizationNetwork = iArr;
        }
    }
}
