package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1vSDK {
    final String AFAdRevenueData;
    final String getMediationNetwork;

    public AFe1vSDK(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AFAdRevenueData = str;
        this.getMediationNetwork = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1vSDK)) {
            return false;
        }
        AFe1vSDK aFe1vSDK = (AFe1vSDK) obj;
        return Intrinsics.areEqual(this.AFAdRevenueData, aFe1vSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getMediationNetwork, aFe1vSDK.getMediationNetwork);
    }

    public final int hashCode() {
        return (this.AFAdRevenueData.hashCode() * 31) + this.getMediationNetwork.hashCode();
    }

    public final String toString() {
        String str = this.AFAdRevenueData;
        String str2 = this.getMediationNetwork;
        StringBuilder sb = new StringBuilder("HostConfig(prefix=");
        sb.append(str);
        sb.append(", host=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
