package com.appsflyer.internal;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AFh1cSDK {
    public AFi1xSDK AFAdRevenueData;
    public final AFh1bSDK getCurrencyIso4217Code;
    public final AFh1dSDK getRevenue;

    public AFh1cSDK(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.AFAdRevenueData = getCurrencyIso4217Code(jSONObject);
        this.getRevenue = getRevenue(jSONObject);
        this.getCurrencyIso4217Code = getMonetizationNetwork(jSONObject);
    }

    private static AFh1bSDK getMonetizationNetwork(JSONObject jSONObject) {
        Object objM8024constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "meta_data");
            objM8024constructorimpl = Result.m8024constructorimpl(jSONObjectAFAdRevenueData != null ? new AFh1bSDK(jSONObjectAFAdRevenueData.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
        }
        return (AFh1bSDK) (Result.m8030isFailureimpl(objM8024constructorimpl) ? null : objM8024constructorimpl);
    }

    private static AFh1dSDK getRevenue(JSONObject jSONObject) {
        Object objM8024constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "exc_mngr");
            objM8024constructorimpl = Result.m8024constructorimpl(jSONObjectAFAdRevenueData != null ? new AFh1dSDK(jSONObjectAFAdRevenueData.getString("sdk_ver"), jSONObjectAFAdRevenueData.optInt("min", -1), jSONObjectAFAdRevenueData.optInt("expire", -1), jSONObjectAFAdRevenueData.optLong("ttl", -1L)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
        }
        return (AFh1dSDK) (Result.m8030isFailureimpl(objM8024constructorimpl) ? null : objM8024constructorimpl);
    }

    private static AFi1xSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object objM8024constructorimpl;
        AFi1xSDK aFi1xSDK;
        List listEmptyList;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "r_debugger");
            if (jSONObjectAFAdRevenueData != null) {
                long j = jSONObjectAFAdRevenueData.getLong("ttl");
                int i = jSONObjectAFAdRevenueData.getInt("counter");
                String strOptString = jSONObjectAFAdRevenueData.optString("app_ver", "");
                String strOptString2 = jSONObjectAFAdRevenueData.optString("sdk_ver", "");
                float fOptDouble = (float) jSONObjectAFAdRevenueData.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = jSONObjectAFAdRevenueData.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "");
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = jSONArrayOptJSONArray.getString(i2);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        arrayList.add(string);
                    }
                    listEmptyList = arrayList;
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                Intrinsics.checkNotNullExpressionValue(strOptString, "");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "");
                aFi1xSDK = new AFi1xSDK(j, fOptDouble, listEmptyList, i, strOptString, strOptString2);
            } else {
                aFi1xSDK = null;
            }
            objM8024constructorimpl = Result.m8024constructorimpl(aFi1xSDK);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
        }
        return (AFi1xSDK) (Result.m8030isFailureimpl(objM8024constructorimpl) ? null : objM8024constructorimpl);
    }

    private static JSONObject AFAdRevenueData(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        AFh1cSDK aFh1cSDK = (AFh1cSDK) obj;
        return Intrinsics.areEqual(this.getRevenue, aFh1cSDK.getRevenue) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFh1cSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.AFAdRevenueData, aFh1cSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        AFh1dSDK aFh1dSDK = this.getRevenue;
        int iHashCode = aFh1dSDK != null ? aFh1dSDK.hashCode() : 0;
        AFh1bSDK aFh1bSDK = this.getCurrencyIso4217Code;
        int iHashCode2 = aFh1bSDK != null ? aFh1bSDK.hashCode() : 0;
        AFi1xSDK aFi1xSDK = this.AFAdRevenueData;
        return (((iHashCode * 31) + iHashCode2) * 31) + (aFi1xSDK != null ? aFi1xSDK.hashCode() : 0);
    }
}
