package com.bpjstku.data.payment.model.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/bpjstku/data/payment/model/request/CheckRecurringStatusRequest;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/request/CheckRecurringStatusRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "chId", "Ljava/lang/String;", "getChId", "reqId", "getReqId", "nik", "getNik"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckRecurringStatusRequest {
    public static final int $stable = 0;

    @SerializedName("chId")
    private final String chId;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("reqId")
    private final String reqId;

    public CheckRecurringStatusRequest(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.chId = str;
        this.reqId = str2;
        this.nik = str3;
    }

    public final String getChId() {
        return this.chId;
    }

    public final String getReqId() {
        return this.reqId;
    }

    public final String getNik() {
        return this.nik;
    }

    public static /* synthetic */ CheckRecurringStatusRequest copy$default(CheckRecurringStatusRequest checkRecurringStatusRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkRecurringStatusRequest.chId;
        }
        if ((i & 2) != 0) {
            str2 = checkRecurringStatusRequest.reqId;
        }
        if ((i & 4) != 0) {
            str3 = checkRecurringStatusRequest.nik;
        }
        return checkRecurringStatusRequest.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChId() {
        return this.chId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReqId() {
        return this.reqId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    public final CheckRecurringStatusRequest copy(String p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new CheckRecurringStatusRequest(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CheckRecurringStatusRequest)) {
            return false;
        }
        CheckRecurringStatusRequest checkRecurringStatusRequest = (CheckRecurringStatusRequest) p0;
        return Intrinsics.areEqual(this.chId, checkRecurringStatusRequest.chId) && Intrinsics.areEqual(this.reqId, checkRecurringStatusRequest.reqId) && Intrinsics.areEqual(this.nik, checkRecurringStatusRequest.nik);
    }

    public final int hashCode() {
        return (((this.chId.hashCode() * 31) + this.reqId.hashCode()) * 31) + this.nik.hashCode();
    }

    public final String toString() {
        String str = this.chId;
        String str2 = this.reqId;
        String str3 = this.nik;
        StringBuilder sb = new StringBuilder("CheckRecurringStatusRequest(chId=");
        sb.append(str);
        sb.append(", reqId=");
        sb.append(str2);
        sb.append(", nik=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
