package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1sSDK {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 632782978;
    final List<AFc1uSDK> AFAdRevenueData;

    public AFc1sSDK(List<AFc1uSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AFAdRevenueData = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1sSDK) && Intrinsics.areEqual(this.AFAdRevenueData, ((AFc1sSDK) obj).AFAdRevenueData);
    }

    public final int hashCode() {
        return this.AFAdRevenueData.hashCode();
    }

    public final String toString() {
        List<AFc1uSDK> list = this.AFAdRevenueData;
        StringBuilder sb = new StringBuilder("StorageConfig(typeEntries=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
