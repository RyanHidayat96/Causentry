package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AFi1hSDK {
    public final long AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final String getMonetizationNetwork;
    public final long getRevenue;

    public AFi1hSDK(long j, long j2, String str, String str2) {
        this.AFAdRevenueData = j;
        this.getRevenue = j2;
        this.getCurrencyIso4217Code = str;
        this.getMonetizationNetwork = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1hSDK)) {
            return false;
        }
        AFi1hSDK aFi1hSDK = (AFi1hSDK) obj;
        return this.AFAdRevenueData == aFi1hSDK.AFAdRevenueData && this.getRevenue == aFi1hSDK.getRevenue && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFi1hSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.getMonetizationNetwork, aFi1hSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.AFAdRevenueData);
        int iHashCode2 = Long.hashCode(this.getRevenue);
        String str = this.getCurrencyIso4217Code;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.getMonetizationNetwork;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        long j = this.AFAdRevenueData;
        long j2 = this.getRevenue;
        String str = this.getCurrencyIso4217Code;
        String str2 = this.getMonetizationNetwork;
        StringBuilder sb = new StringBuilder("PlayIntegrityApiData(piaTimestamp=");
        sb.append(j);
        sb.append(", ttrMillis=");
        sb.append(j2);
        sb.append(", piaToken=");
        sb.append(str);
        sb.append(", errorCode=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
