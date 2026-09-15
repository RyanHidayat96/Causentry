package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1aSDK {
    public final long AFAdRevenueData;
    public final boolean getMediationNetwork;
    public final String getRevenue;

    public AFf1aSDK(String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getRevenue = str;
        this.AFAdRevenueData = j;
        this.getMediationNetwork = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1aSDK)) {
            return false;
        }
        AFf1aSDK aFf1aSDK = (AFf1aSDK) obj;
        return Intrinsics.areEqual(this.getRevenue, aFf1aSDK.getRevenue) && this.AFAdRevenueData == aFf1aSDK.AFAdRevenueData && this.getMediationNetwork == aFf1aSDK.getMediationNetwork;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final int hashCode() {
        int iHashCode = this.getRevenue.hashCode();
        int iHashCode2 = Long.hashCode(this.AFAdRevenueData);
        boolean z = this.getMediationNetwork;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + r2;
    }

    public final String toString() {
        String str = this.getRevenue;
        long j = this.AFAdRevenueData;
        boolean z = this.getMediationNetwork;
        StringBuilder sb = new StringBuilder("AFUninstallToken(token=");
        sb.append(str);
        sb.append(", receivedTime=");
        sb.append(j);
        sb.append(", isQueued=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
